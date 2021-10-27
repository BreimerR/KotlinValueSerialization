package org.jetbrains.kotlinx.serialization.compiler.backend.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000v\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u0018\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f\u001a\u0018\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f\u001a\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f\u001a2\u0010\u000f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00110\u0010*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006\u001a\u0012\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011*\u00020\u0016H\u0000\u001a*\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018*\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u0001H\u0000\u001a\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0002*\u00020\u00122\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0006\u001a(\u0010 \u001a\u0004\u0018\u00010\u0002*\u00020\u00122\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u001a\u001c\u0010#\u001a\u0004\u0018\u00010\u0002*\u00020\u00122\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f\u001a\u0014\u0010$\u001a\u00020%*\u00020\u00122\u0006\u0010&\u001a\u00020\'H\u0007\u001a\n\u0010(\u001a\u00020\u0001*\u00020\f\u001a \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020*0\u0018*\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0000\u001a\n\u0010+\u001a\u00020,*\u00020\u0002\u001a\n\u0010+\u001a\u00020,*\u00020\f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\u00a8\u0006-"}, d2 = {"isStaticSerializable", "", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Z", "analyzeSpecialSerializers", "moduleDescriptor", "Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "annotations", "Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", "findEnumTypeSerializer", "module", "kType", "Lorg/jetbrains/kotlin/types/KotlinType;", "findStandardKotlinTypeSerializer", "findTypeSerializer", "allSealedSerializableSubclassesFor", "Lkotlin/Pair;", "", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/AbstractSerialGenerator;", "klass", "anonymousInitializers", "Lorg/jetbrains/kotlin/psi/KtExpression;", "Lorg/jetbrains/kotlin/psi/KtPureClassOrObject;", "bodyPropertiesDescriptorsMap", "", "Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "Lorg/jetbrains/kotlin/psi/KtProperty;", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "filterUninitialized", "findAddOnSerializer", "propertyType", "findTypeSerializerOrContext", "sourceElement", "Lorg/jetbrains/kotlin/com/intellij/psi/PsiElement;", "findTypeSerializerOrContextUnchecked", "getSerialTypeInfo", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/SerialTypeInfo;", "property", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;", "isGeneratedSerializableObject", "primaryConstructorPropertiesDescriptorsMap", "Lorg/jetbrains/kotlin/psi/KtParameter;", "serialName", "", "kotlinx-serialization"})
public final class TypeUtilKt {
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor findAddOnSerializer(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator $this$findAddOnSerializer, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType propertyType, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module) {
        return null;
    }
    
    public static final boolean isGeneratedSerializableObject(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType $this$isGeneratedSerializableObject) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.Suppress(names = {"FunctionName", "LocalVariableName"})
    @org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
    public static final org.jetbrains.kotlinx.serialization.compiler.backend.common.SerialTypeInfo getSerialTypeInfo(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator $this$getSerialTypeInfo, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty property) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final kotlin.Pair<java.util.List<org.jetbrains.kotlin.types.KotlinType>, java.util.List<org.jetbrains.kotlin.descriptors.ClassDescriptor>> allSealedSerializableSubclassesFor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator $this$allSealedSerializableSubclassesFor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor klass, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String serialName(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType $this$serialName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String serialName(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$serialName) {
        return null;
    }
    
    public static final boolean isStaticSerializable(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$isStaticSerializable) {
        return false;
    }
    
    /**
     * Returns class descriptor for ContextSerializer or PolymorphicSerializer
     * if [annotations] contains @Contextual or @Polymorphic annotation
     */
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor analyzeSpecialSerializers(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor moduleDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.annotations.Annotations annotations) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor findTypeSerializerOrContextUnchecked(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator $this$findTypeSerializerOrContextUnchecked, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType kType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor findTypeSerializerOrContext(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator $this$findTypeSerializerOrContext, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType kType, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.com.intellij.psi.PsiElement sourceElement) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor findTypeSerializer(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType kType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor findStandardKotlinTypeSerializer(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType kType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor findEnumTypeSerializer(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType kType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.Map<org.jetbrains.kotlin.descriptors.PropertyDescriptor, org.jetbrains.kotlin.psi.KtProperty> bodyPropertiesDescriptorsMap(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.psi.KtPureClassOrObject $this$bodyPropertiesDescriptorsMap, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext bindingContext, boolean filterUninitialized) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.Map<org.jetbrains.kotlin.descriptors.PropertyDescriptor, org.jetbrains.kotlin.psi.KtParameter> primaryConstructorPropertiesDescriptorsMap(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.psi.KtPureClassOrObject $this$primaryConstructorPropertiesDescriptorsMap, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext bindingContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<org.jetbrains.kotlin.psi.KtExpression> anonymousInitializers(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.psi.KtPureClassOrObject $this$anonymousInitializers) {
        return null;
    }
}