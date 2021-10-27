package org.jetbrains.kotlinx.serialization.compiler.backend.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H$J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u001d\u0010\u0017\u001a\u00020\u0018*\u00020\u00032\u000e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u001aH\u0082\bR\u0014\u0010\u0007\u001a\u00020\bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/SerializableCodegen;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/AbstractSerialGenerator;", "serializableDescriptor", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;Lorg/jetbrains/kotlin/resolve/BindingContext;)V", "properties", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperties;", "getProperties", "()Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperties;", "getSerializableDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "generate", "", "generateInternalConstructor", "constructorDescriptor", "Lorg/jetbrains/kotlin/descriptors/ClassConstructorDescriptor;", "generateSyntheticInternalConstructor", "generateSyntheticMethods", "generateWriteSelfMethod", "methodDescriptor", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "shouldHaveSpecificSyntheticMethods", "", "functionPresenceChecker", "Lkotlin/Function0;", "kotlinx-serialization"})
public abstract class SerializableCodegen extends org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator {
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.descriptors.ClassDescriptor serializableDescriptor = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperties properties = null;
    
    public SerializableCodegen(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor serializableDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext bindingContext) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    protected final org.jetbrains.kotlin.descriptors.ClassDescriptor getSerializableDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperties getProperties() {
        return null;
    }
    
    public final void generate() {
    }
    
    private final boolean shouldHaveSpecificSyntheticMethods(org.jetbrains.kotlin.descriptors.ClassDescriptor $this$shouldHaveSpecificSyntheticMethods, kotlin.jvm.functions.Function0<? extends org.jetbrains.kotlin.descriptors.FunctionDescriptor> functionPresenceChecker) {
        return false;
    }
    
    private final void generateSyntheticInternalConstructor() {
    }
    
    private final void generateSyntheticMethods() {
    }
    
    protected abstract void generateInternalConstructor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor constructorDescriptor);
    
    protected void generateWriteSelfMethod(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor methodDescriptor) {
    }
}