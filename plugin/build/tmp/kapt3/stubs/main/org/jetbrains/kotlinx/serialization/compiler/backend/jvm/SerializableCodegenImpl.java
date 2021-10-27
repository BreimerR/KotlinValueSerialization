package org.jetbrains.kotlinx.serialization.compiler.backend.jvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 22\u00020\u0001:\u00012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J\u0012\u0010 \u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000e0\"2\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J\u0014\u0010$\u001a\u00020\u0017*\u00020%2\u0006\u0010&\u001a\u00020\'H\u0002J\u0014\u0010(\u001a\u00020\u0017*\u00020%2\u0006\u0010&\u001a\u00020\'H\u0002J\u001c\u0010)\u001a\u00020\u0017*\u00020\'2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\fH\u0002J\u0014\u0010+\u001a\u00020\u0017*\u00020\'2\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J\u0014\u0010,\u001a\u00020\u0017*\u00020%2\u0006\u0010-\u001a\u00020.H\u0002J(\u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020.0\"*\u00020%2\u0006\u0010-\u001a\u00020.2\u0006\u00100\u001a\u00020.H\u0002J\f\u00101\u001a\u00020\u0017*\u00020%H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u00063"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/jvm/SerializableCodegenImpl;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/SerializableCodegen;", "classCodegen", "Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;", "(Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;)V", "descToProps", "", "Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "Lorg/jetbrains/kotlin/psi/KtProperty;", "fieldMissingOptimizationVersion", "Lorg/jetbrains/kotlin/config/ApiVersion;", "paramsToProps", "Lorg/jetbrains/kotlin/psi/KtParameter;", "thisAsmType", "Lorg/jetbrains/org/objectweb/asm/Type;", "useFieldMissingOptimization", "", "asmType", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;", "getAsmType", "(Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;)Lorg/jetbrains/org/objectweb/asm/Type;", "canUseFieldMissingOptimization", "generateInternalConstructor", "", "constructorDescriptor", "Lorg/jetbrains/kotlin/descriptors/ClassConstructorDescriptor;", "generateStaticDescriptorField", "generateWriteSelfMethod", "methodDescriptor", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "getParam", "prop", "getProp", "initializersMapper", "Lkotlin/Pair;", "Lorg/jetbrains/kotlin/psi/KtExpression;", "doGenerateConstructorImpl", "Lorg/jetbrains/org/objectweb/asm/commons/InstructionAdapter;", "exprCodegen", "Lorg/jetbrains/kotlin/codegen/ExpressionCodegen;", "doGenerateWriteSelf", "genInitParam", "param", "genInitProperty", "generateOptimizedGoldenMaskCheck", "maskVar", "", "generateSuperSerializableCall", "propStartVar", "stackSerialDescriptor", "Companion", "kotlinx-serialization"})
public final class SerializableCodegenImpl extends org.jetbrains.kotlinx.serialization.compiler.backend.common.SerializableCodegen {
    private final org.jetbrains.kotlin.codegen.ImplementationBodyCodegen classCodegen = null;
    private final org.jetbrains.org.objectweb.asm.Type thisAsmType = null;
    private final org.jetbrains.kotlin.config.ApiVersion fieldMissingOptimizationVersion = null;
    private final boolean useFieldMissingOptimization = false;
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlinx.serialization.compiler.backend.jvm.SerializableCodegenImpl.Companion Companion = null;
    private final java.util.Map<org.jetbrains.kotlin.descriptors.PropertyDescriptor, org.jetbrains.kotlin.psi.KtProperty> descToProps = null;
    private final java.util.Map<org.jetbrains.kotlin.descriptors.PropertyDescriptor, org.jetbrains.kotlin.psi.KtParameter> paramsToProps = null;
    
    public SerializableCodegenImpl(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ImplementationBodyCodegen classCodegen) {
        super(null, null);
    }
    
    private final org.jetbrains.kotlin.psi.KtProperty getProp(org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty prop) {
        return null;
    }
    
    private final org.jetbrains.kotlin.psi.KtParameter getParam(org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty prop) {
        return null;
    }
    
    private final kotlin.Pair<org.jetbrains.kotlin.psi.KtExpression, org.jetbrains.org.objectweb.asm.Type> initializersMapper(org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty prop) {
        return null;
    }
    
    private final org.jetbrains.org.objectweb.asm.Type getAsmType(org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty $this$asmType) {
        return null;
    }
    
    @java.lang.Override
    protected void generateInternalConstructor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor constructorDescriptor) {
    }
    
    @java.lang.Override
    protected void generateWriteSelfMethod(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor methodDescriptor) {
    }
    
    private final void doGenerateWriteSelf(org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$doGenerateWriteSelf, org.jetbrains.kotlin.codegen.ExpressionCodegen exprCodegen) {
    }
    
    private final void doGenerateConstructorImpl(org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$doGenerateConstructorImpl, org.jetbrains.kotlin.codegen.ExpressionCodegen exprCodegen) {
    }
    
    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> generateSuperSerializableCall(org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$generateSuperSerializableCall, int maskVar, int propStartVar) {
        return null;
    }
    
    private final void generateOptimizedGoldenMaskCheck(org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$generateOptimizedGoldenMaskCheck, int maskVar) {
    }
    
    private final void stackSerialDescriptor(org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$stackSerialDescriptor) {
    }
    
    private final void generateStaticDescriptorField() {
    }
    
    private final void genInitProperty(org.jetbrains.kotlin.codegen.ExpressionCodegen $this$genInitProperty, org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty prop) {
    }
    
    private final void genInitParam(org.jetbrains.kotlin.codegen.ExpressionCodegen $this$genInitParam, org.jetbrains.kotlin.descriptors.PropertyDescriptor prop, org.jetbrains.kotlin.psi.KtParameter param) {
    }
    
    private final boolean canUseFieldMissingOptimization() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/jvm/SerializableCodegenImpl$Companion;", "", "()V", "generateSerializableExtensions", "", "codegen", "Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;", "kotlinx-serialization"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void generateSerializableExtensions(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.codegen.ImplementationBodyCodegen codegen) {
        }
    }
}