package org.jetbrains.kotlinx.serialization.compiler.backend.jvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/jvm/SerializableCompanionCodegenImpl;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/SerializableCompanionCodegen;", "classCodegen", "Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;", "(Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;)V", "generateLazySerializerGetter", "", "methodDescriptor", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "generateSerializerGetter", "Companion", "kotlinx-serialization"})
public final class SerializableCompanionCodegenImpl extends org.jetbrains.kotlinx.serialization.compiler.backend.common.SerializableCompanionCodegen {
    private final org.jetbrains.kotlin.codegen.ImplementationBodyCodegen classCodegen = null;
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlinx.serialization.compiler.backend.jvm.SerializableCompanionCodegenImpl.Companion Companion = null;
    
    public SerializableCompanionCodegenImpl(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ImplementationBodyCodegen classCodegen) {
        super(null, null);
    }
    
    @java.lang.Override
    protected void generateLazySerializerGetter(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor methodDescriptor) {
    }
    
    @java.lang.Override
    protected void generateSerializerGetter(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor methodDescriptor) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/jvm/SerializableCompanionCodegenImpl$Companion;", "", "()V", "generateSerializableExtensions", "", "codegen", "Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;", "kotlinx-serialization"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void generateSerializableExtensions(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.codegen.ImplementationBodyCodegen codegen) {
        }
    }
}