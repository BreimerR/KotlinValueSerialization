package org.jetbrains.kotlinx.serialization.compiler.backend.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/SerializableCompanionCodegen;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/AbstractSerialGenerator;", "companionDescriptor", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;Lorg/jetbrains/kotlin/resolve/BindingContext;)V", "getCompanionDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "serializableDescriptor", "getSerializableDescriptor", "generate", "", "generateLazySerializerGetter", "methodDescriptor", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "generateSerializerGetter", "kotlinx-serialization"})
public abstract class SerializableCompanionCodegen extends org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator {
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.descriptors.ClassDescriptor companionDescriptor = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.descriptors.ClassDescriptor serializableDescriptor = null;
    
    public SerializableCompanionCodegen(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor companionDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext bindingContext) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    protected final org.jetbrains.kotlin.descriptors.ClassDescriptor getCompanionDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final org.jetbrains.kotlin.descriptors.ClassDescriptor getSerializableDescriptor() {
        return null;
    }
    
    public final void generate() {
    }
    
    protected abstract void generateSerializerGetter(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor methodDescriptor);
    
    protected void generateLazySerializerGetter(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor methodDescriptor) {
    }
}