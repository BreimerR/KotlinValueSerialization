package org.jetbrains.kotlinx.serialization.compiler.resolve;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a0\u0010\u000b\u001a&\u0012\"\u0012 \u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\r0\f*\u00020\u0010H\u0000\u001a,\u0010\u0011\u001a\u0004\u0018\u0001H\u0012\"\u0006\b\u0000\u0010\u0012\u0018\u0001*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\tH\u0086\b\u00a2\u0006\u0002\u0010\u0016\u001a&\u0010\u0017\u001a\u0004\u0018\u00010\u0018*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\tH\u0000\u001a\u0014\u0010\u001b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0014\u0010\u001b\u001a\u00020\u0003*\u00020\u001a2\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0014\u0010\u001c\u001a\u00020\u0003*\u00020\u001a2\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0014\u0010\u001d\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\u0014\u0010\u001d\u001a\u00020\u0003*\u00020\u001a2\u0006\u0010\b\u001a\u00020\tH\u0000\u001a\f\u0010\u001e\u001a\u00020\u0003*\u00020\u0003H\u0000\u001a\f\u0010\u001f\u001a\u00020\u0003*\u00020\u0003H\u0000\u001a\f\u0010 \u001a\u00020\u0005*\u00020\u0001H\u0000\u001a\u0014\u0010!\u001a\u00020\"*\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u0005\u00a8\u0006$"}, d2 = {"findSerializerConstructorForTypeArgumentsSerializers", "Lorg/jetbrains/kotlin/descriptors/ClassConstructorDescriptor;", "serializerDescriptor", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "onlyIfSynthetic", "", "getInternalPackageFqn", "Lorg/jetbrains/kotlin/name/FqName;", "classSimpleName", "", "getSerializationPackageFqn", "annotationsWithArguments", "", "Lkotlin/Triple;", "Lorg/jetbrains/kotlin/psi/ValueArgument;", "Lorg/jetbrains/kotlin/descriptors/ValueParameterDescriptor;", "Lorg/jetbrains/kotlin/descriptors/annotations/Annotated;", "findAnnotationConstantValue", "R", "Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", "annotationFqName", "property", "(Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;Lorg/jetbrains/kotlin/name/FqName;Ljava/lang/String;)Ljava/lang/Object;", "findAnnotationKotlinTypeValue", "Lorg/jetbrains/kotlin/types/KotlinType;", "moduleForResolve", "Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "getClassFromInternalSerializationPackage", "getClassFromSerializationDescriptorsPackage", "getClassFromSerializationPackage", "getKSerializer", "getKSerializerConstructorMarker", "isSerializationCtor", "toSimpleType", "Lorg/jetbrains/kotlin/types/SimpleType;", "nullable", "kotlinx-serialization"})
public final class SearchUtilsKt {
    
    public static final boolean isSerializationCtor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor $this$isSerializationCtor) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor findSerializerConstructorForTypeArgumentsSerializers(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor serializerDescriptor, boolean onlyIfSynthetic) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.types.KotlinType findAnnotationKotlinTypeValue(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.annotations.Annotations $this$findAnnotationKotlinTypeValue, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.FqName annotationFqName, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor moduleForResolve, @org.jetbrains.annotations.NotNull
    java.lang.String property) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor getKSerializerConstructorMarker(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$getKSerializerConstructorMarker) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor getKSerializer(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$getKSerializer) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.name.FqName getInternalPackageFqn(@org.jetbrains.annotations.NotNull
    java.lang.String classSimpleName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor getClassFromInternalSerializationPackage(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor $this$getClassFromInternalSerializationPackage, @org.jetbrains.annotations.NotNull
    java.lang.String classSimpleName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor getClassFromSerializationDescriptorsPackage(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor $this$getClassFromSerializationDescriptorsPackage, @org.jetbrains.annotations.NotNull
    java.lang.String classSimpleName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.name.FqName getSerializationPackageFqn(@org.jetbrains.annotations.NotNull
    java.lang.String classSimpleName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor getClassFromSerializationPackage(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor $this$getClassFromSerializationPackage, @org.jetbrains.annotations.NotNull
    java.lang.String classSimpleName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor getClassFromSerializationPackage(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$getClassFromSerializationPackage, @org.jetbrains.annotations.NotNull
    java.lang.String classSimpleName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.descriptors.ClassDescriptor getClassFromInternalSerializationPackage(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$getClassFromInternalSerializationPackage, @org.jetbrains.annotations.NotNull
    java.lang.String classSimpleName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.types.SimpleType toSimpleType(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$toSimpleType, boolean nullable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.Triple<org.jetbrains.kotlin.descriptors.ClassDescriptor, java.util.List<org.jetbrains.kotlin.psi.ValueArgument>, java.util.List<org.jetbrains.kotlin.descriptors.ValueParameterDescriptor>>> annotationsWithArguments(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.annotations.Annotated $this$annotationsWithArguments) {
        return null;
    }
}