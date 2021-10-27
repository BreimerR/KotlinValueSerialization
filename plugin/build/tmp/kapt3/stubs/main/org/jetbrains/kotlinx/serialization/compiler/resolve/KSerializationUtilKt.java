package org.jetbrains.kotlinx.serialization.compiler.resolve;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u00101\u001a\u0004\u0018\u00010\u00062\u0006\u00102\u001a\u00020\u0001H\u0000\u001a\u0012\u00103\u001a\u0004\u0018\u00010\u00012\u0006\u00104\u001a\u00020\u0001H\u0000\u001a\u0012\u00105\u001a\u0004\u0018\u00010\u00012\u0006\u00106\u001a\u00020\u0001H\u0000\u001a\u0018\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0000\u001a\u0012\u0010:\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u0012\u0010<\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u001a\u0010=\u001a\u00020\n*\u00020\u00012\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?H\u0000\u001a\u0014\u0010A\u001a\u00020\n*\u00020\u00012\u0006\u0010;\u001a\u00020\u0006H\u0000\u001a\u001a\u0010B\u001a\u00020\n*\u00020\u00012\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?H\u0000\u001a\u0014\u0010C\u001a\u00020\n*\u00020\u00012\u0006\u0010;\u001a\u00020\u0006H\u0000\u001a\u0014\u0010D\u001a\u00020\n*\u00020\u00012\u0006\u0010E\u001a\u00020FH\u0000\u001a\u001c\u0010G\u001a\u00020H*\u00020\u00012\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020KH\u0000\u001a\u0012\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00010?*\u00020\u0001H\u0000\u001a\u000e\u0010M\u001a\u0004\u0018\u00010N*\u00020OH\u0000\u001a\f\u0010P\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u0010Q\u001a\u00020\n*\u00020\u0001H\u0000\u001a\f\u0010R\u001a\u00020\n*\u00020\u0001H\u0000\u001a\f\u0010S\u001a\u00020\n*\u00020\u0001H\u0000\u001a\f\u0010T\u001a\u00020\n*\u00020\u0001H\u0000\u001a\u000e\u0010U\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000\u001a\u0016\u0010%\u001a\u0004\u0018\u00010\u0006*\u00020\u000b2\u0006\u0010V\u001a\u00020WH\u0000\"\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00018@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00068@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u000e\u001a\u00020\n*\u00020\u00018@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0011\u001a\u00020\n*\u00020\u00018@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\"\u0018\u0010\u0013\u001a\u00020\n*\u00020\u00018@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010\"\u0018\u0010\u0015\u001a\u00020\n*\u00020\u00018@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010\"\u0018\u0010\u0016\u001a\u00020\n*\u00020\u00018@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010\"\u0018\u0010\u0017\u001a\u00020\n*\u00020\u00018@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010\"\u0018\u0010\u0018\u001a\u00020\n*\u00020\u00018@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010\"\u0018\u0010\u0019\u001a\u00020\n*\u00020\u00018@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0010\"\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u0006*\u00020\u00068@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001e*\u00020\u000b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \"\u0018\u0010!\u001a\u00020\n*\u00020\u000b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\r\"\u0018\u0010#\u001a\u00020\n*\u00020\u000b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b$\u0010\r\"\u001a\u0010%\u001a\u0004\u0018\u00010\u0006*\u00020&8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(\"\u001a\u0010)\u001a\u0004\u0018\u00010\u0006*\u00020&8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b*\u0010(\"\u0018\u0010+\u001a\u00020\n*\u00020\u00018@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b,\u0010\u0010\"\u0018\u0010-\u001a\u00020\n*\u00020\u00018@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u0010\"\u0019\u0010/\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00068G\u00a2\u0006\u0006\u001a\u0004\b/\u00100\u00a8\u0006X"}, d2 = {"classSerializer", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "getClassSerializer", "(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "genericIndex", "", "Lorg/jetbrains/kotlin/types/KotlinType;", "getGenericIndex", "(Lorg/jetbrains/kotlin/types/KotlinType;)Ljava/lang/Integer;", "hasAnySerialAnnotation", "", "Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", "getHasAnySerialAnnotation", "(Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;)Z", "hasCompanionObjectAsSerializer", "getHasCompanionObjectAsSerializer", "(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Z", "hasSerializableAnnotation", "getHasSerializableAnnotation", "hasSerializableAnnotationWithoutArgs", "getHasSerializableAnnotationWithoutArgs", "isInheritableSerialInfoAnnotation", "isInternalSerializable", "isInternallySerializableObject", "isSerialInfoAnnotation", "isSerializableObject", "overridenSerializer", "getOverridenSerializer", "(Lorg/jetbrains/kotlin/types/KotlinType;)Lorg/jetbrains/kotlin/types/KotlinType;", "serialNameValue", "", "getSerialNameValue", "(Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;)Ljava/lang/String;", "serialRequired", "getSerialRequired", "serialTransient", "getSerialTransient", "serializableWith", "Lorg/jetbrains/kotlin/descriptors/DeclarationDescriptor;", "getSerializableWith", "(Lorg/jetbrains/kotlin/descriptors/DeclarationDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "serializerForClass", "getSerializerForClass", "shouldHaveGeneratedMethodsInCompanion", "getShouldHaveGeneratedMethodsInCompanion", "shouldHaveGeneratedSerializer", "getShouldHaveGeneratedSerializer", "toClassDescriptor", "(Lorg/jetbrains/kotlin/types/KotlinType;)Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "extractKSerializerArgumentFromImplementation", "implementationClass", "getSerializableClassDescriptorByCompanion", "thisDescriptor", "getSerializableClassDescriptorBySerializer", "serializerDescriptor", "isAllowedToHaveAutoGeneratedSerializerMethods", "classDescriptor", "serializableClassDescriptor", "isGeneratedKSerializer", "type", "isKSerializer", "checkLoadMethodParameters", "parameters", "", "Lorg/jetbrains/kotlin/descriptors/ValueParameterDescriptor;", "checkLoadMethodResult", "checkSaveMethodParameters", "checkSaveMethodResult", "checkSerializableClassPropertyResult", "prop", "Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "createSerializerTypeFor", "Lorg/jetbrains/kotlin/types/SimpleType;", "argument", "baseSerializerInterface", "Lorg/jetbrains/kotlin/name/FqName;", "enumEntries", "findSerializableAnnotationDeclaration", "Lorg/jetbrains/kotlin/psi/KtAnnotationEntry;", "Lorg/jetbrains/kotlin/descriptors/annotations/Annotated;", "getGeneratedSerializerDescriptor", "isAbstractOrSealedSerializableClass", "isInternallySerializableEnum", "isSerializableEnum", "needSerializerFactory", "polymorphicSerializerIfApplicableAutomatically", "module", "Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "kotlinx-serialization"})
public final class KSerializationUtilKt {
    
    public static final boolean isAllowedToHaveAutoGeneratedSerializerMethods(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor classDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor serializableClassDescriptor) {
        return false;
    }
    
    public static final boolean isKSerializer(@org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.types.KotlinType type) {
        return false;
    }
    
    public static final boolean isGeneratedKSerializer(@org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.types.KotlinType type) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor getGeneratedSerializerDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$getGeneratedSerializerDescriptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.types.SimpleType createSerializerTypeFor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$createSerializerTypeFor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.SimpleType argument, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.FqName baseSerializerInterface) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.types.KotlinType extractKSerializerArgumentFromImplementation(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor implementationClass) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.types.KotlinType getSerializableWith(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.DeclarationDescriptor $this$serializableWith) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.types.KotlinType serializableWith(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.annotations.Annotations $this$serializableWith, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.types.KotlinType getSerializerForClass(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.DeclarationDescriptor $this$serializerForClass) {
        return null;
    }
    
    public static final boolean isSerialInfoAnnotation(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$isSerialInfoAnnotation) {
        return false;
    }
    
    public static final boolean isInheritableSerialInfoAnnotation(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$isInheritableSerialInfoAnnotation) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String getSerialNameValue(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.annotations.Annotations $this$serialNameValue) {
        return null;
    }
    
    public static final boolean getSerialRequired(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.annotations.Annotations $this$serialRequired) {
        return false;
    }
    
    public static final boolean getSerialTransient(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.annotations.Annotations $this$serialTransient) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    @kotlin.jvm.JvmName(name = "toClassDescriptor")
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor toClassDescriptor(@org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.types.KotlinType $this$toClassDescriptor) {
        return null;
    }
    
    public static final boolean getShouldHaveGeneratedMethodsInCompanion(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$shouldHaveGeneratedMethodsInCompanion) {
        return false;
    }
    
    public static final boolean isSerializableObject(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$isSerializableObject) {
        return false;
    }
    
    public static final boolean isInternallySerializableObject(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$isInternallySerializableObject) {
        return false;
    }
    
    public static final boolean isInternalSerializable(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$isInternalSerializable) {
        return false;
    }
    
    public static final boolean isSerializableEnum(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$isSerializableEnum) {
        return false;
    }
    
    public static final boolean isInternallySerializableEnum(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$isInternallySerializableEnum) {
        return false;
    }
    
    public static final boolean getShouldHaveGeneratedSerializer(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$shouldHaveGeneratedSerializer) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<org.jetbrains.kotlin.descriptors.ClassDescriptor> enumEntries(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$enumEntries) {
        return null;
    }
    
    public static final boolean getHasAnySerialAnnotation(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.annotations.Annotations $this$hasAnySerialAnnotation) {
        return false;
    }
    
    public static final boolean getHasSerializableAnnotation(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$hasSerializableAnnotation) {
        return false;
    }
    
    public static final boolean getHasSerializableAnnotationWithoutArgs(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$hasSerializableAnnotationWithoutArgs) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.psi.KtAnnotationEntry findSerializableAnnotationDeclaration(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.annotations.Annotated $this$findSerializableAnnotationDeclaration) {
        return null;
    }
    
    public static final boolean isAbstractOrSealedSerializableClass(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$isAbstractOrSealedSerializableClass) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor polymorphicSerializerIfApplicableAutomatically(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$polymorphicSerializerIfApplicableAutomatically) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor getClassSerializer(@org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$classSerializer) {
        return null;
    }
    
    public static final boolean getHasCompanionObjectAsSerializer(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$hasCompanionObjectAsSerializer) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.types.KotlinType getOverridenSerializer(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType $this$overridenSerializer) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Integer getGenericIndex(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType $this$genericIndex) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor getSerializableClassDescriptorByCompanion(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisDescriptor) {
        return null;
    }
    
    public static final boolean needSerializerFactory(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$needSerializerFactory) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor getSerializableClassDescriptorBySerializer(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor serializerDescriptor) {
        return null;
    }
    
    public static final boolean checkSerializableClassPropertyResult(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$checkSerializableClassPropertyResult, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.PropertyDescriptor prop) {
        return false;
    }
    
    public static final boolean checkSaveMethodParameters(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$checkSaveMethodParameters, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.descriptors.ValueParameterDescriptor> parameters) {
        return false;
    }
    
    public static final boolean checkSaveMethodResult(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$checkSaveMethodResult, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType type) {
        return false;
    }
    
    public static final boolean checkLoadMethodParameters(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$checkLoadMethodParameters, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.descriptors.ValueParameterDescriptor> parameters) {
        return false;
    }
    
    public static final boolean checkLoadMethodResult(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$checkLoadMethodResult, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType type) {
        return false;
    }
}