/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package libetal.kotlinx.serialization.compiler.resolve

import kotlinx.serialization.Transient
import libetal.kotlinx.serialization.annotations.Serialize
import libetal.kotlinx.compiler.plugins.extensions.annotatedWith
import libetal.kotlinx.compiler.plugins.extensions.fqName
import libetal.kotlinx.compiler.plugins.extensions.hasAnnotation
import org.jetbrains.kotlin.descriptors.*
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.psi.KtDeclarationWithInitializer
import org.jetbrains.kotlin.psi.KtParameter
import org.jetbrains.kotlin.resolve.BindingContext
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.resolve.descriptorUtil.getSuperClassNotAny
import org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter
import org.jetbrains.kotlin.resolve.source.getPsi
import org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedClassDescriptor
import org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor
import org.jetbrains.kotlin.serialization.deserialization.getName
import libetal.kotlinx.serialization.compiler.diagnostic.SERIALIZABLE_PROPERTIES
import libetal.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin
import libetal.kotlinx.serialization.compiler.extensions.SerializationPluginMetadataExtension
import java.lang.Exception

class SerializableProperties(private val serializableClass: ClassDescriptor, val bindingContext: BindingContext) {
    private val primaryConstructorParameters: List<ValueParameterDescriptor> =
        serializableClass.unsubstitutedPrimaryConstructor?.valueParameters ?: emptyList()

    val serializableProperties: List<SerializableProperty>
    val isExternallySerializable: Boolean
    private val primaryConstructorProperties: Map<PropertyDescriptor, Boolean>


    init {
        val descriptorsSequence =
            serializableClass.unsubstitutedMemberScope.getContributedDescriptors(DescriptorKindFilter.VARIABLES)
                .asSequence()
        // call to any BindingContext.get should be only AFTER MemberScope.getContributedDescriptors
        primaryConstructorProperties =
            primaryConstructorParameters.asSequence()
                .map { parameter -> bindingContext[BindingContext.VALUE_PARAMETER_AS_PROPERTY, parameter] to parameter.declaresDefaultValue() }
                .mapNotNull { (a, b) -> if (a == null) null else a to b }
                .toMap()

        fun isPropSerializable(it: PropertyDescriptor): Boolean {

            var boolean = if (serializableClass.isInternalSerializable) !it.annotations.serialTransient
            else !DescriptorVisibilities.isPrivate(it.visibility) && ((it.isVar && !it.annotations.serialTransient) || primaryConstructorProperties.contains(
                it
            ))


            if (boolean && !it.hasAnnotation<Transient>()) {
                val string = it.annotations.map { it.fqName?.asString() ?: "" }
                throw Exception(
                    "Variable Annotated with transient $string ${it.name} ${it.dispatchReceiverParameter?.fqNameSafe} ${
                        it.annotations.hasAnnotation(
                            Transient::class.fqName!!
                        )
                    }"
                )
            }

            return boolean
        }


        val mutableSerializableProperties  = mutableListOf<SerializableProperty>()

        descriptorsSequence.annotatedWith<Serialize> { annotationDescriptor, declarationDescriptor ->
            when (declarationDescriptor) {
                is PropertyDescriptor -> {
                    val declaresDefaultValue = declarationDescriptor.declaresDefaultValue()

                    mutableSerializableProperties.add(
                        SerializableProperty(
                            declarationDescriptor,
                            primaryConstructorProperties[declarationDescriptor] ?: false,
                            true,
                            declaresDefaultValue

                        )
                    )
                }
            }
        }


        serializableProperties =  mutableSerializableProperties.partition { primaryConstructorProperties.contains(it.descriptor)  }
            .run {
                val supers = serializableClass.getSuperClassNotAny()
                if (supers == null || !supers.isInternalSerializable)
                    first + second
                else
                    SerializableProperties(supers, bindingContext).serializableProperties + first + second
            }
            .let { unsort(serializableClass, it) }

        isExternallySerializable =
            serializableClass.isInternallySerializableEnum() || primaryConstructorParameters.size == primaryConstructorProperties.size

    }

    val serializableConstructorProperties: List<SerializableProperty> =
        serializableProperties.asSequence()
            .filter { primaryConstructorProperties.contains(it.descriptor) }
            .toList()

    val serializableStandaloneProperties: List<SerializableProperty> =
        serializableProperties.minus(serializableConstructorProperties)

    val size = serializableProperties.size
    operator fun get(index: Int) = serializableProperties[index]
    operator fun iterator() = serializableProperties.iterator()

    val primaryConstructorWithDefaults = serializableClass.unsubstitutedPrimaryConstructor
        ?.original?.valueParameters?.any { it.declaresDefaultValue() } ?: false
}

fun PropertyDescriptor.declaresDefaultValue(): Boolean {
    when (val declaration = this.source.getPsi()) {
        is KtDeclarationWithInitializer -> return declaration.initializer != null
        is KtParameter -> return declaration.defaultValue != null
        is Any -> return false // Not-null check
    }
    // PSI is null, property is from another module
    if (this !is DeserializedPropertyDescriptor) return false
    val myClassCtor = (this.containingDeclaration as? ClassDescriptor)?.unsubstitutedPrimaryConstructor ?: return false
    // If property is a constructor parameter, check parameter default value
    // (serializable classes always have parameters-as-properties, so no name clash here)
    if (myClassCtor.valueParameters.find { it.name == this.name }?.declaresDefaultValue() == true) return true
    // If it is a body property, then it is likely to have initializer when getter is not specified
    // note this approach is not working well if we have smth like `get() = field`, but such cases on cross-module boundaries
    // should be very marginal. If we want to solve them, we need to add protobuf metadata extension.
    if (getter?.isDefault == true) return true
    return false
}


internal val SerializableProperties.goldenMask: Int
    get() {
        var goldenMask = 0
        var requiredBit = 1
        for (property in serializableProperties) {
            if (!property.optional) {
                goldenMask = goldenMask or requiredBit
            }
            requiredBit = requiredBit shl 1
        }
        return goldenMask
    }

internal val SerializableProperties.goldenMaskList: List<Int>
    get() {
        val maskSlotCount = serializableProperties.bitMaskSlotCount()
        val goldenMaskList = MutableList(maskSlotCount) { 0 }

        for (i in serializableProperties.indices) {
            if (!serializableProperties[i].optional) {
                val slotNumber = i / 32
                val bitInSlot = i % 32
                goldenMaskList[slotNumber] = goldenMaskList[slotNumber] or (1 shl bitInSlot)
            }
        }
        return goldenMaskList
    }

internal fun List<SerializableProperty>.bitMaskSlotCount() = size / 32 + 1
internal fun bitMaskSlotAt(propertyIndex: Int) = propertyIndex / 32

internal fun BindingContext.serializablePropertiesFor(
    classDescriptor: ClassDescriptor,
    serializationDescriptorSerializer: SerializationDescriptorSerializerPlugin? = null
): SerializableProperties {
    val props = this.get(SERIALIZABLE_PROPERTIES, classDescriptor) ?: SerializableProperties(classDescriptor, this)
    serializationDescriptorSerializer?.putIfNeeded(classDescriptor, props)
    return props
}

private fun unsort(descriptor: ClassDescriptor, props: List<SerializableProperty>): List<SerializableProperty> {
    if (descriptor !is DeserializedClassDescriptor) return props
    val correctOrder: List<Name> =
        descriptor.classProto.getExtension(SerializationPluginMetadataExtension.propertiesNamesInProgramOrder)
            .map { descriptor.c.nameResolver.getName(it) }
    val propsMap = props.associateBy { it.descriptor.name }
    return correctOrder.map { propsMap.getValue(it) }
}
