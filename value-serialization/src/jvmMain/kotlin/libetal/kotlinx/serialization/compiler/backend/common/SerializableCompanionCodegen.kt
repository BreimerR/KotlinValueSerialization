/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package libetal.kotlinx.serialization.compiler.backend.common

import libetal.kotlinx.serialization.compiler.resolve.getSerializableClassDescriptorByCompanion
import libetal.kotlinx.serialization.compiler.resolve.isAbstractOrSealedSerializableClass
import libetal.kotlinx.serialization.compiler.resolve.isKSerializer
import libetal.kotlinx.serialization.compiler.resolve.isSerializableObject
import org.jetbrains.kotlin.descriptors.CallableMemberDescriptor
import org.jetbrains.kotlin.descriptors.ClassDescriptor
import org.jetbrains.kotlin.descriptors.FunctionDescriptor
import org.jetbrains.kotlin.incremental.components.NoLookupLocation
import org.jetbrains.kotlin.resolve.BindingContext
import libetal.kotlinx.serialization.compiler.resolve.SerialEntityNames.SERIALIZER_PROVIDER_NAME

abstract class SerializableCompanionCodegen(
    protected val companionDescriptor: ClassDescriptor,
    bindingContext: BindingContext
) : AbstractSerialGenerator(bindingContext, companionDescriptor) {
    protected val serializableDescriptor: ClassDescriptor = getSerializableClassDescriptorByCompanion(companionDescriptor)!!

    fun generate() {
        val serializerGetterDescriptor = companionDescriptor.unsubstitutedMemberScope.getContributedFunctions(
            SERIALIZER_PROVIDER_NAME,
            NoLookupLocation.FROM_BACKEND
        ).firstOrNull {
            it.valueParameters.size == serializableDescriptor.declaredTypeParameters.size
                    && it.kind == CallableMemberDescriptor.Kind.SYNTHESIZED
                    && it.valueParameters.all { p -> isKSerializer(p.type) }
                    && it.returnType != null && isKSerializer(it.returnType)
        } ?: throw IllegalStateException(
            "Can't find synthesized simple 'Companion.serializer()' function to generate, " +
                    "probably clash with user-defined function has occurred"
        )

        if (serializableDescriptor.isSerializableObject || serializableDescriptor.isAbstractOrSealedSerializableClass()) {
            generateLazySerializerGetter(serializerGetterDescriptor)
        } else {
            generateSerializerGetter(serializerGetterDescriptor)
        }
    }

    protected abstract fun generateSerializerGetter(methodDescriptor: FunctionDescriptor)

    protected open fun generateLazySerializerGetter(methodDescriptor: FunctionDescriptor) {
        generateSerializerGetter(methodDescriptor)
    }
}
