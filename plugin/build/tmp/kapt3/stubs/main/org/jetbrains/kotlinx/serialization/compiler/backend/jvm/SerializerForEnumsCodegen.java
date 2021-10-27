package org.jetbrains.kotlinx.serialization.compiler.backend.jvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0015J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\u0014\u0010\f\u001a\u00020\b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0014\u0010\u0010\u001a\u00020\b*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014\u00a8\u0006\u0013"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/jvm/SerializerForEnumsCodegen;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/jvm/SerializerCodegenImpl;", "codegen", "Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;", "serializableClass", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "(Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)V", "generateLoad", "", "function", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "generateSave", "addElementsContentToDescriptor", "Lorg/jetbrains/kotlin/codegen/ExpressionCodegen;", "descriptorVar", "", "instantiateNewDescriptor", "isStatic", "", "kotlinx-serialization"})
public final class SerializerForEnumsCodegen extends org.jetbrains.kotlinx.serialization.compiler.backend.jvm.SerializerCodegenImpl {
    
    public SerializerForEnumsCodegen(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ImplementationBodyCodegen codegen, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor serializableClass) {
        super(null, null, null);
    }
    
    @java.lang.Override
    protected void generateSave(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function) {
    }
    
    @java.lang.Override
    @org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
    protected void generateLoad(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function) {
    }
    
    @java.lang.Override
    protected void instantiateNewDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ExpressionCodegen $this$instantiateNewDescriptor, boolean isStatic) {
    }
    
    @java.lang.Override
    protected void addElementsContentToDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ExpressionCodegen $this$addElementsContentToDescriptor, int descriptorVar) {
    }
}