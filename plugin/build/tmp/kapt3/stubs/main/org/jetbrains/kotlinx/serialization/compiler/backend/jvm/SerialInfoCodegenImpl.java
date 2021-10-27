package org.jetbrains.kotlinx.serialization.compiler.backend.jvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0016\u0010\u0019\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001b"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/jvm/SerialInfoCodegenImpl;", "", "codegen", "Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;", "thisClass", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "(Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;Lorg/jetbrains/kotlin/resolve/BindingContext;)V", "getBindingContext", "()Lorg/jetbrains/kotlin/resolve/BindingContext;", "getCodegen", "()Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;", "thisAsmType", "Lorg/jetbrains/org/objectweb/asm/Type;", "getThisAsmType", "()Lorg/jetbrains/org/objectweb/asm/Type;", "getThisClass", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "generate", "", "generateConstructor", "props", "", "Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "generateFieldsAndSetters", "Companion", "kotlinx-serialization"})
public final class SerialInfoCodegenImpl {
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.codegen.ImplementationBodyCodegen codegen = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.descriptors.ClassDescriptor thisClass = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.resolve.BindingContext bindingContext = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.org.objectweb.asm.Type thisAsmType = null;
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlinx.serialization.compiler.backend.jvm.SerialInfoCodegenImpl.Companion Companion = null;
    
    public SerialInfoCodegenImpl(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ImplementationBodyCodegen codegen, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor thisClass, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext bindingContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.codegen.ImplementationBodyCodegen getCodegen() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.descriptors.ClassDescriptor getThisClass() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.resolve.BindingContext getBindingContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.org.objectweb.asm.Type getThisAsmType() {
        return null;
    }
    
    public final void generate() {
    }
    
    private final void generateFieldsAndSetters(java.util.List<? extends org.jetbrains.kotlin.descriptors.PropertyDescriptor> props) {
    }
    
    private final void generateConstructor(java.util.List<? extends org.jetbrains.kotlin.descriptors.PropertyDescriptor> props) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/jvm/SerialInfoCodegenImpl$Companion;", "", "()V", "generateSerialInfoImplBody", "", "codegen", "Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;", "kotlinx-serialization"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void generateSerialInfoImplBody(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.codegen.ImplementationBodyCodegen codegen) {
        }
    }
}