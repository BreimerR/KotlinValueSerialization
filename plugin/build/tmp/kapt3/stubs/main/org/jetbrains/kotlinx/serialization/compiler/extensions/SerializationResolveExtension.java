package org.jetbrains.kotlinx.serialization.compiler.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J6\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0016J<\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001dH\u0016J<\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020 0\u0016H\u0016J&\u0010!\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\"0\u001dH\u0016J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010$\u001a\u0004\u0018\u00010\u00102\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\nH\u0002R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006*"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationResolveExtension;", "Lorg/jetbrains/kotlin/resolve/extensions/SyntheticResolveExtension;", "metadataPlugin", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "(Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;)V", "getMetadataPlugin", "()Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "addSyntheticSupertypes", "", "thisDescriptor", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "supertypes", "", "Lorg/jetbrains/kotlin/types/KotlinType;", "generateSyntheticClasses", "name", "Lorg/jetbrains/kotlin/name/Name;", "ctx", "Lorg/jetbrains/kotlin/resolve/lazy/LazyClassContext;", "declarationProvider", "Lorg/jetbrains/kotlin/resolve/lazy/declarations/ClassMemberDeclarationProvider;", "result", "", "generateSyntheticMethods", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "fromSupertypes", "", "Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;", "", "generateSyntheticProperties", "Ljava/util/ArrayList;", "Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "generateSyntheticSecondaryConstructors", "Lorg/jetbrains/kotlin/descriptors/ClassConstructorDescriptor;", "getPossibleSyntheticNestedClassNames", "getSyntheticCompanionObjectNameIfNeeded", "getSyntheticFunctionNames", "getSyntheticNestedClassNames", "hasCustomizedSerializeMethod", "", "serializableClass", "kotlinx-serialization"})
public class SerializationResolveExtension implements org.jetbrains.kotlin.resolve.extensions.SyntheticResolveExtension {
    @org.jetbrains.annotations.Nullable
    private final org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin metadataPlugin = null;
    
    @kotlin.jvm.JvmOverloads
    public SerializationResolveExtension() {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public SerializationResolveExtension(@org.jetbrains.annotations.Nullable
    org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin metadataPlugin) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin getMetadataPlugin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<org.jetbrains.kotlin.name.Name> getSyntheticNestedClassNames(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisDescriptor) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.util.List<org.jetbrains.kotlin.name.Name> getPossibleSyntheticNestedClassNames(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisDescriptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<org.jetbrains.kotlin.name.Name> getSyntheticFunctionNames(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisDescriptor) {
        return null;
    }
    
    private final boolean hasCustomizedSerializeMethod(org.jetbrains.kotlin.descriptors.ClassDescriptor serializableClass) {
        return false;
    }
    
    @java.lang.Override
    public void generateSyntheticClasses(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.Name name, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.lazy.LazyClassContext ctx, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.lazy.declarations.ClassMemberDeclarationProvider declarationProvider, @org.jetbrains.annotations.NotNull
    java.util.Set<org.jetbrains.kotlin.descriptors.ClassDescriptor> result) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public org.jetbrains.kotlin.name.Name getSyntheticCompanionObjectNameIfNeeded(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisDescriptor) {
        return null;
    }
    
    @java.lang.Override
    public void addSyntheticSupertypes(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisDescriptor, @org.jetbrains.annotations.NotNull
    java.util.List<org.jetbrains.kotlin.types.KotlinType> supertypes) {
    }
    
    @java.lang.Override
    public void generateSyntheticSecondaryConstructors(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext bindingContext, @org.jetbrains.annotations.NotNull
    java.util.Collection<org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor> result) {
    }
    
    @java.lang.Override
    public void generateSyntheticMethods(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.Name name, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext bindingContext, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor> fromSupertypes, @org.jetbrains.annotations.NotNull
    java.util.Collection<org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor> result) {
    }
    
    @java.lang.Override
    public void generateSyntheticProperties(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.Name name, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext bindingContext, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<org.jetbrains.kotlin.descriptors.PropertyDescriptor> fromSupertypes, @org.jetbrains.annotations.NotNull
    java.util.Set<org.jetbrains.kotlin.descriptors.PropertyDescriptor> result) {
    }
    
    public void generateSyntheticClasses(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor thisDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.Name name, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.lazy.LazyClassContext ctx, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.lazy.declarations.PackageMemberDeclarationProvider declarationProvider, @org.jetbrains.annotations.NotNull
    java.util.Set<org.jetbrains.kotlin.descriptors.ClassDescriptor> result) {
    }
}