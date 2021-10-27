package org.jetbrains.kotlinx.serialization.compiler.backend.jvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/jvm/JVMSerialTypeInfo;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/SerialTypeInfo;", "property", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;", "type", "Lorg/jetbrains/org/objectweb/asm/Type;", "nn", "", "serializer", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "(Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;Lorg/jetbrains/org/objectweb/asm/Type;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)V", "getType", "()Lorg/jetbrains/org/objectweb/asm/Type;", "kotlinx-serialization"})
@org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
public final class JVMSerialTypeInfo extends org.jetbrains.kotlinx.serialization.compiler.backend.common.SerialTypeInfo {
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.org.objectweb.asm.Type type = null;
    
    public JVMSerialTypeInfo(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty property, @org.jetbrains.annotations.NotNull
    org.jetbrains.org.objectweb.asm.Type type, @org.jetbrains.annotations.NotNull
    java.lang.String nn, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.descriptors.ClassDescriptor serializer) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.org.objectweb.asm.Type getType() {
        return null;
    }
}