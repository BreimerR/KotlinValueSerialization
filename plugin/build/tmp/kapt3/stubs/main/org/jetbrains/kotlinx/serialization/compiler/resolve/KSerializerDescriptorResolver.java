package org.jetbrains.kotlinx.serialization.compiler.resolve;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u001c\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u001e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J:\u0010\u0018\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001a0\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020!H\u0002J \u0010\"\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'J&\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u001a2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004H\u0002J\u0018\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0004H\u0002J\u0018\u00103\u001a\u0002012\u0006\u00102\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004H\u0002J&\u00104\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J2\u00106\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u000f2\b\b\u0002\u00109\u001a\u00020:2\b\b\u0002\u0010;\u001a\u00020<J\u000e\u0010=\u001a\u0002012\u0006\u00102\u001a\u00020\u0004J\u0018\u0010>\u001a\u0002012\u0006\u0010/\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+H\u0002J \u0010?\u001a\u00020)2\u0006\u0010/\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+H\u0002J$\u0010@\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+2\f\u0010A\u001a\b\u0012\u0004\u0012\u0002010BJ*\u0010C\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020)0\u001a2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020)0BJ$\u0010E\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+2\f\u0010A\u001a\b\u0012\u0004\u0012\u0002010BJ2\u0010F\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u0002010\u001a2\u0006\u0010*\u001a\u00020+2\f\u0010A\u001a\b\u0012\u0004\u0012\u0002010BJ2\u0010G\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00020)0H2\u0006\u0010*\u001a\u00020+2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020)0IJ\u000e\u0010J\u001a\u00020<2\u0006\u0010\f\u001a\u00020\u0004J\f\u0010K\u001a\u00020\u000f*\u00020\u000fH\u0002\u00a8\u0006L"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/resolve/KSerializerDescriptorResolver;", "", "()V", "addSerialInfoImplClass", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "interfaceDesc", "declarationProvider", "Lorg/jetbrains/kotlin/resolve/lazy/declarations/ClassMemberDeclarationProvider;", "ctx", "Lorg/jetbrains/kotlin/resolve/lazy/LazyClassContext;", "addSerialInfoSuperType", "", "thisDescriptor", "supertypes", "", "Lorg/jetbrains/kotlin/types/KotlinType;", "addSerializerFactorySuperType", "classDescriptor", "addSerializerImplClass", "addSerializerSupertypes", "createDeprecatedHiddenAnnotation", "Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor;", "module", "Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "createKSerializerParamsForEachGenericArgument", "Lkotlin/Pair;", "", "Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "Lorg/jetbrains/kotlin/descriptors/ValueParameterDescriptor;", "parentFunction", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "serializableClass", "actualArgsOffset", "", "createLoadConstructorDescriptor", "Lorg/jetbrains/kotlin/descriptors/ClassConstructorDescriptor;", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "metadataPlugin", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "createLocalSerializersFieldsDescriptor", "Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "name", "Lorg/jetbrains/kotlin/name/Name;", "serializableDescriptor", "serializerDescriptor", "createSerializableClassPropertyDescriptor", "companionDescriptor", "createSerializerFactoryVarargDescriptor", "Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;", "thisClass", "createSerializerGetterDescriptor", "createTypedSerializerConstructorDescriptor", "typeParameters", "createValPropertyDescriptor", "containingClassDescriptor", "type", "visibility", "Lorg/jetbrains/kotlin/descriptors/DescriptorVisibility;", "createGetter", "", "createWriteSelfFunctionDescriptor", "doCreateSerializerFunction", "doCreateSerializerProperty", "generateCompanionObjectMethods", "result", "", "generateDescriptorsForAnnotationImpl", "fromSupertypes", "generateSerializableClassMethods", "generateSerializerMethods", "generateSerializerProperties", "Ljava/util/ArrayList;", "", "isSerialInfoImpl", "makeNullableIfNotPrimitive", "kotlinx-serialization"})
public final class KSerializerDescriptorResolver {
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlinx.serialization.compiler.resolve.KSerializerDescriptorResolver INSTANCE = null;
    
    private KSerializerDescriptorResolver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor createDeprecatedHiddenAnnotation(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module) {
        return null;
    }
    
    public final boolean isSerialInfoImpl(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisDescriptor) {
        return false;
    }
    
    public final void addSerialInfoSuperType(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisDescriptor, @org.jetbrains.annotations.NotNull
    java.util.List<org.jetbrains.kotlin.types.KotlinType> supertypes) {
    }
    
    public final void addSerializerFactorySuperType(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor classDescriptor, @org.jetbrains.annotations.NotNull
    java.util.List<org.jetbrains.kotlin.types.KotlinType> supertypes) {
    }
    
    public final void addSerializerSupertypes(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor classDescriptor, @org.jetbrains.annotations.NotNull
    java.util.List<org.jetbrains.kotlin.types.KotlinType> supertypes) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.descriptors.ClassDescriptor addSerialInfoImplClass(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor interfaceDesc, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.lazy.declarations.ClassMemberDeclarationProvider declarationProvider, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.lazy.LazyClassContext ctx) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.descriptors.ClassDescriptor addSerializerImplClass(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.lazy.declarations.ClassMemberDeclarationProvider declarationProvider, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.lazy.LazyClassContext ctx) {
        return null;
    }
    
    public final void generateSerializerProperties(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisDescriptor, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<org.jetbrains.kotlin.descriptors.PropertyDescriptor> fromSupertypes, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.Name name, @org.jetbrains.annotations.NotNull
    java.util.Set<org.jetbrains.kotlin.descriptors.PropertyDescriptor> result) {
    }
    
    public final void generateCompanionObjectMethods(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.Name name, @org.jetbrains.annotations.NotNull
    java.util.Collection<org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor> result) {
    }
    
    public final void generateSerializerMethods(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisDescriptor, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor> fromSupertypes, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.Name name, @org.jetbrains.annotations.NotNull
    java.util.Collection<org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor> result) {
    }
    
    public final void generateSerializableClassMethods(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.Name name, @org.jetbrains.annotations.NotNull
    java.util.Collection<org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor> result) {
    }
    
    private final org.jetbrains.kotlin.descriptors.PropertyDescriptor createSerializableClassPropertyDescriptor(org.jetbrains.kotlin.descriptors.ClassDescriptor companionDescriptor, org.jetbrains.kotlin.descriptors.ClassDescriptor classDescriptor) {
        return null;
    }
    
    private final org.jetbrains.kotlin.descriptors.PropertyDescriptor doCreateSerializerProperty(org.jetbrains.kotlin.descriptors.ClassDescriptor companionDescriptor, org.jetbrains.kotlin.descriptors.ClassDescriptor classDescriptor, org.jetbrains.kotlin.name.Name name) {
        return null;
    }
    
    private final org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor doCreateSerializerFunction(org.jetbrains.kotlin.descriptors.ClassDescriptor companionDescriptor, org.jetbrains.kotlin.name.Name name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.descriptors.PropertyDescriptor createValPropertyDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.Name name, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor containingClassDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType type, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.DescriptorVisibility visibility, boolean createGetter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor createLoadConstructorDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor classDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext bindingContext, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin metadataPlugin) {
        return null;
    }
    
    private final org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor createTypedSerializerConstructorDescriptor(org.jetbrains.kotlin.descriptors.ClassDescriptor classDescriptor, org.jetbrains.kotlin.descriptors.ClassDescriptor serializableDescriptor, java.util.List<? extends org.jetbrains.kotlin.descriptors.TypeParameterDescriptor> typeParameters) {
        return null;
    }
    
    /**
     * Creates free type parameters T0, T1, ... for given serializable class
     * Returns [T0, T1, ...] and [KSerializer<T0>, KSerializer<T1>,...]
     */
    private final kotlin.Pair<java.util.List<org.jetbrains.kotlin.descriptors.TypeParameterDescriptor>, java.util.List<org.jetbrains.kotlin.descriptors.ValueParameterDescriptor>> createKSerializerParamsForEachGenericArgument(org.jetbrains.kotlin.descriptors.FunctionDescriptor parentFunction, org.jetbrains.kotlin.descriptors.ClassDescriptor serializableClass, int actualArgsOffset) {
        return null;
    }
    
    private final org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor createSerializerFactoryVarargDescriptor(org.jetbrains.kotlin.descriptors.ClassDescriptor thisClass) {
        return null;
    }
    
    private final org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor createSerializerGetterDescriptor(org.jetbrains.kotlin.descriptors.ClassDescriptor thisClass, org.jetbrains.kotlin.descriptors.ClassDescriptor serializableClass) {
        return null;
    }
    
    private final org.jetbrains.kotlin.types.KotlinType makeNullableIfNotPrimitive(org.jetbrains.kotlin.types.KotlinType $this$makeNullableIfNotPrimitive) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor createWriteSelfFunctionDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisClass) {
        return null;
    }
    
    public final void generateDescriptorsForAnnotationImpl(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisDescriptor, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.descriptors.PropertyDescriptor> fromSupertypes, @org.jetbrains.annotations.NotNull
    java.util.Collection<org.jetbrains.kotlin.descriptors.PropertyDescriptor> result) {
    }
    
    private final java.util.List<org.jetbrains.kotlin.descriptors.PropertyDescriptor> createLocalSerializersFieldsDescriptor(org.jetbrains.kotlin.name.Name name, org.jetbrains.kotlin.descriptors.ClassDescriptor serializableDescriptor, org.jetbrains.kotlin.descriptors.ClassDescriptor serializerDescriptor) {
        return null;
    }
}