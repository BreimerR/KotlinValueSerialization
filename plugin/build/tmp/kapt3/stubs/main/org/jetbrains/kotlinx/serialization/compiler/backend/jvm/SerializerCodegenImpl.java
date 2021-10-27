package org.jetbrains.kotlinx.serialization.compiler.backend.jvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 J2\u00020\u0001:\u0001JB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0015J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u001e\u001a\u00020\u0016H\u0014J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0014J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J\u0014\u0010#\u001a\u00020\u0016*\u00020$2\u0006\u0010%\u001a\u00020&H\u0014J$\u0010\'\u001a\u00020\u0016*\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\fH\u0004J\u001c\u0010+\u001a\u00020\f*\u00020,2\u0006\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020&H\u0002J<\u0010/\u001a\u00020\u0016*\u00020,2\u0006\u0010 \u001a\u0002002\u0006\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020&2\u0006\u00103\u001a\u00020&2\u0006\u0010%\u001a\u00020&2\u0006\u00104\u001a\u00020&H\u0003J\u0011\u00105\u001a\u00020\u0016*\u00020,H\u0000\u00a2\u0006\u0002\b6J8\u00107\u001a\u00020\u0016*\u00020,2\u0006\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020&2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020&0<H\u0002J\u001c\u0010=\u001a\u00020\u0016*\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010>\u001a\u00020\u0014H\u0002J0\u0010?\u001a\u00020\u0016*\u00020$2\u0006\u0010@\u001a\u00020\u00052\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0B2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020E0BH\u0002J\u0014\u0010F\u001a\u00020\u0016*\u00020$2\u0006\u0010>\u001a\u00020\u0014H\u0014J\u001b\u0010G\u001a\u00020\u0016*\u00020,2\b\u0010H\u001a\u0004\u0018\u00010&H\u0004\u00a2\u0006\u0002\u0010IR\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000eX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006K"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/jvm/SerializerCodegenImpl;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/SerializerCodegen;", "codegen", "Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;", "serializableClass", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "metadataPlugin", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "(Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;)V", "getCodegen", "()Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;", "serialDescField", "", "serializableAsmType", "Lorg/jetbrains/org/objectweb/asm/Type;", "getSerializableAsmType", "()Lorg/jetbrains/org/objectweb/asm/Type;", "serializerAsmType", "getSerializerAsmType", "staticDescriptor", "", "generateChildSerializersGetter", "", "function", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "generateGenericFieldsAndConstructor", "typedConstructorDescriptor", "Lorg/jetbrains/kotlin/descriptors/ClassConstructorDescriptor;", "generateLoad", "generateSave", "generateSerialDesc", "generateSerializableClassProperty", "property", "Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "generateTypeParamsSerializersGetter", "addElementsContentToDescriptor", "Lorg/jetbrains/kotlin/codegen/ExpressionCodegen;", "descriptorVar", "", "addSyntheticAnnotationsToDescriptor", "annotated", "Lorg/jetbrains/kotlin/descriptors/annotations/Annotated;", "functionToCall", "buildExternalConstructorDesc", "Lorg/jetbrains/org/objectweb/asm/commons/InstructionAdapter;", "propsStartVar", "bitMaskBase", "callReadProperty", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;", "propertyType", "index", "inputVar", "propertyVar", "genArrayOfTypeParametersSerializers", "genArrayOfTypeParametersSerializers$kotlinx_serialization", "genSetSerializableStandaloneProperties", "expressionCodegen", "propVarStart", "resultVar", "bitMaskPos", "Lkotlin/Function1;", "generateSerialDescriptor", "isStatic", "generateSyntheticAnnotationOnStack", "annotationClass", "args", "", "Lorg/jetbrains/kotlin/psi/ValueArgument;", "ctorParams", "Lorg/jetbrains/kotlin/descriptors/ValueParameterDescriptor;", "instantiateNewDescriptor", "stackSerialClassDesc", "classDescVar", "(Lorg/jetbrains/org/objectweb/asm/commons/InstructionAdapter;Ljava/lang/Integer;)V", "Companion", "kotlinx-serialization"})
public class SerializerCodegenImpl extends org.jetbrains.kotlinx.serialization.compiler.backend.common.SerializerCodegen {
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.codegen.ImplementationBodyCodegen codegen = null;
    private final java.lang.String serialDescField = "$$serialDesc";
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.org.objectweb.asm.Type serializerAsmType = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.org.objectweb.asm.Type serializableAsmType = null;
    private final boolean staticDescriptor = false;
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlinx.serialization.compiler.backend.jvm.SerializerCodegenImpl.Companion Companion = null;
    
    public SerializerCodegenImpl(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ImplementationBodyCodegen codegen, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor serializableClass, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin metadataPlugin) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    protected final org.jetbrains.kotlin.codegen.ImplementationBodyCodegen getCodegen() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final org.jetbrains.org.objectweb.asm.Type getSerializerAsmType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final org.jetbrains.org.objectweb.asm.Type getSerializableAsmType() {
        return null;
    }
    
    @java.lang.Override
    protected void generateGenericFieldsAndConstructor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor typedConstructorDescriptor) {
    }
    
    private final void generateSerialDescriptor(org.jetbrains.kotlin.codegen.ExpressionCodegen $this$generateSerialDescriptor, int descriptorVar, boolean isStatic) {
    }
    
    protected void instantiateNewDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ExpressionCodegen $this$instantiateNewDescriptor, boolean isStatic) {
    }
    
    protected void addElementsContentToDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ExpressionCodegen $this$addElementsContentToDescriptor, int descriptorVar) {
    }
    
    protected final void addSyntheticAnnotationsToDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ExpressionCodegen $this$addSyntheticAnnotationsToDescriptor, int descriptorVar, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.annotations.Annotated annotated, @org.jetbrains.annotations.NotNull
    java.lang.String functionToCall) {
    }
    
    @java.lang.Override
    protected void generateSerialDesc() {
    }
    
    private final void generateSyntheticAnnotationOnStack(org.jetbrains.kotlin.codegen.ExpressionCodegen $this$generateSyntheticAnnotationOnStack, org.jetbrains.kotlin.descriptors.ClassDescriptor annotationClass, java.util.List<? extends org.jetbrains.kotlin.psi.ValueArgument> args, java.util.List<? extends org.jetbrains.kotlin.descriptors.ValueParameterDescriptor> ctorParams) {
    }
    
    protected final void stackSerialClassDesc(@org.jetbrains.annotations.NotNull
    org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$stackSerialClassDesc, @org.jetbrains.annotations.Nullable
    java.lang.Integer classDescVar) {
    }
    
    @java.lang.Override
    protected void generateSerializableClassProperty(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.PropertyDescriptor property) {
    }
    
    @java.lang.Override
    protected void generateTypeParamsSerializersGetter(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function) {
    }
    
    @java.lang.Override
    protected void generateChildSerializersGetter(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function) {
    }
    
    @java.lang.Override
    protected void generateSave(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function) {
    }
    
    public final void genArrayOfTypeParametersSerializers$kotlinx_serialization(@org.jetbrains.annotations.NotNull
    org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$genArrayOfTypeParametersSerializers) {
    }
    
    @java.lang.Override
    @org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
    protected void generateLoad(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function) {
    }
    
    @org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
    private final void callReadProperty(org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$callReadProperty, org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty property, org.jetbrains.org.objectweb.asm.Type propertyType, int index, int inputVar, int descriptorVar, int propertyVar) {
    }
    
    private final java.lang.String buildExternalConstructorDesc(org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$buildExternalConstructorDesc, int propsStartVar, int bitMaskBase) {
        return null;
    }
    
    private final void genSetSerializableStandaloneProperties(org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$genSetSerializableStandaloneProperties, org.jetbrains.kotlin.codegen.ExpressionCodegen expressionCodegen, int propVarStart, int resultVar, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> bitMaskPos) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a8\u0006\t"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/jvm/SerializerCodegenImpl$Companion;", "", "()V", "generateSerializerExtensions", "", "codegen", "Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;", "metadataPlugin", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "kotlinx-serialization"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void generateSerializerExtensions(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.codegen.ImplementationBodyCodegen codegen, @org.jetbrains.annotations.Nullable
        org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin metadataPlugin) {
        }
    }
}