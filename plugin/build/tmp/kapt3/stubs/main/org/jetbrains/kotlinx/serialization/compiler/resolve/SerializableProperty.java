package org.jetbrains.kotlinx.serialization.compiler.resolve;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bR5\u0010\t\u001a&\u0012\"\u0012 \u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010#\u001a\u0004\u0018\u00010$\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\'\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0011\u0010)\u001a\u00020$\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010&\u00a8\u0006+"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;", "", "descriptor", "Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "isConstructorParameterWithDefault", "", "hasBackingField", "declaresDefaultValue", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;ZZZ)V", "annotationsWithArguments", "", "Lkotlin/Triple;", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "Lorg/jetbrains/kotlin/psi/ValueArgument;", "Lorg/jetbrains/kotlin/descriptors/ValueParameterDescriptor;", "getAnnotationsWithArguments", "()Ljava/util/List;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "genericIndex", "", "getGenericIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "module", "Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "getModule", "()Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "name", "", "getName", "()Ljava/lang/String;", "optional", "getOptional", "serializableWith", "Lorg/jetbrains/kotlin/types/KotlinType;", "getSerializableWith", "()Lorg/jetbrains/kotlin/types/KotlinType;", "transient", "getTransient", "type", "getType", "kotlinx-serialization"})
public final class SerializableProperty {
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.descriptors.PropertyDescriptor descriptor = null;
    private final boolean isConstructorParameterWithDefault = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.types.KotlinType type = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer genericIndex = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.descriptors.ModuleDescriptor module = null;
    @org.jetbrains.annotations.Nullable
    private final org.jetbrains.kotlin.types.KotlinType serializableWith = null;
    private final boolean optional = false;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.Triple<org.jetbrains.kotlin.descriptors.ClassDescriptor, java.util.List<org.jetbrains.kotlin.psi.ValueArgument>, java.util.List<org.jetbrains.kotlin.descriptors.ValueParameterDescriptor>>> annotationsWithArguments = null;
    
    public SerializableProperty(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.PropertyDescriptor descriptor, boolean isConstructorParameterWithDefault, boolean hasBackingField, boolean declaresDefaultValue) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.descriptors.PropertyDescriptor getDescriptor() {
        return null;
    }
    
    public final boolean isConstructorParameterWithDefault() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.types.KotlinType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getGenericIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.descriptors.ModuleDescriptor getModule() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.jetbrains.kotlin.types.KotlinType getSerializableWith() {
        return null;
    }
    
    public final boolean getOptional() {
        return false;
    }
    
    public final boolean getTransient() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.Triple<org.jetbrains.kotlin.descriptors.ClassDescriptor, java.util.List<org.jetbrains.kotlin.psi.ValueArgument>, java.util.List<org.jetbrains.kotlin.descriptors.ValueParameterDescriptor>>> getAnnotationsWithArguments() {
        return null;
    }
}