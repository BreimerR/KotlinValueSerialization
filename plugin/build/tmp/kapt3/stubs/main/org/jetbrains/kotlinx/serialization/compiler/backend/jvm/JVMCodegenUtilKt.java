package org.jetbrains.kotlinx.serialization.compiler.backend.jvm;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u0094\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b1\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a?\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u00162\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u001d\u0010K\u001a\u0019\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020N0L\u00a2\u0006\u0002\bOH\u0000\u001a2\u0010P\u001a\u00020\u0016*\u00020M2\u0006\u0010Q\u001a\u00020\u00012\u0006\u0010R\u001a\u00020\u00012\u0006\u0010S\u001a\u00020T2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020W0VH\u0000\u001a@\u0010X\u001a\u00020N\"\u0004\b\u0000\u0010Y*\u00020M2\u0006\u0010Z\u001a\u00020\u00052\f\u0010U\u001a\b\u0012\u0004\u0012\u0002HY0V2\u0018\u0010[\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002HY\u0012\u0004\u0012\u00020N0L\u001aK\u0010\\\u001a\u00020N*\u00020M2\u0006\u0010]\u001a\u00020W2\u0006\u0010^\u001a\u00020H2\u0006\u0010_\u001a\u00020`2\u0006\u0010a\u001a\u00020\u00052\u0006\u0010b\u001a\u00020\u00012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\u00012\u0006\u0010d\u001a\u00020e\u00a2\u0006\u0002\u0010f\u001a\u0014\u0010g\u001a\u00020N*\u00020M2\u0006\u0010h\u001a\u00020\u0016H\u0000\u001a\u001c\u0010i\u001a\u00020N*\u00020M2\u0006\u0010j\u001a\u00020\u00012\u0006\u0010k\u001a\u00020\u0001H\u0000\u001a9\u0010l\u001a\u00020N*\u00020H2\u0006\u0010m\u001a\u00020n2#\u0010K\u001a\u001f\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020N0o\u00a2\u0006\u0002\bOH\u0000\u001a\u001a\u0010q\u001a\u00020r*\u00020e2\u0006\u0010]\u001a\u00020W2\u0006\u0010Z\u001a\u00020\u0005\u001a\u0012\u0010s\u001a\u00020N*\u00020M2\u0006\u0010Z\u001a\u00020\u0005\u001ar\u0010t\u001a\u00020u*\u00020e2\u0006\u0010S\u001a\u00020T2\u0006\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020y2\b\u0010z\u001a\u0004\u0018\u00010{2\b\u0010|\u001a\u0004\u0018\u00010M2\n\b\u0002\u0010}\u001a\u0004\u0018\u00010\u00012\'\b\u0002\u0010~\u001a!\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020N\u0018\u00010o\u00a2\u0006\u0002\bOH\u0000\u00a2\u0006\u0002\u0010\u007f\u001a0\u0010\u0080\u0001\u001a\u00020u*\u00020M2\u0006\u0010S\u001a\u00020T2\u0007\u0010\u0081\u0001\u001a\u00020r2\u0007\u0010\u0082\u0001\u001a\u00020\u00012\u0007\u0010\u0083\u0001\u001a\u00020eH\u0001\u001a\'\u0010\u0084\u0001\u001a\u00020u*\u00020M2\u0006\u0010S\u001a\u00020T2\u0007\u0010\u0081\u0001\u001a\u00020r2\u0007\u0010\u0083\u0001\u001a\u00020eH\u0001\u001a&\u0010\u0085\u0001\u001a\u00020u*\u00020M2\u0006\u0010S\u001a\u00020T2\u0006\u0010]\u001a\u00020W2\u0007\u0010\u0083\u0001\u001a\u00020eH\u0000\u001a\u000b\u0010\u0086\u0001\u001a\u00020N*\u00020M\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u001c\u0010\f\u001a\n \r*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u001c\u0010\u000f\u001a\n \r*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007\"\u001c\u0010\u0011\u001a\n \r*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u001c\u0010\u0013\u001a\n \r*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0014\u0010\u0015\u001a\u00020\u0016X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u001c\u0010\u0019\u001a\n \r*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0014\u0010\u001b\u001a\u00020\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000b\"\u001c\u0010\u001d\u001a\n \r*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u001c\u0010\u001f\u001a\n \r*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0007\"\u0014\u0010!\u001a\u00020\u0016X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u001c\u0010#\u001a\n \r*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0007\"\u001c\u0010%\u001a\n \r*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0007\"\u001c\u0010\'\u001a\n \r*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0007\"\u001c\u0010)\u001a\n \r*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0007\"\u001c\u0010+\u001a\n \r*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0007\"\u001c\u0010-\u001a\n \r*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0007\"\u001c\u0010/\u001a\n \r*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0007\"\u001c\u00101\u001a\n \r*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0007\"\u0014\u00103\u001a\u00020\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u000b\"\u001c\u00105\u001a\n \r*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0007\"\u0014\u00107\u001a\u00020\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u000b\"\u0014\u00109\u001a\u00020\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u000b\"\u0014\u0010;\u001a\u00020\tX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u000b\"\u0014\u0010=\u001a\u00020\u0016X\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0018\"\u0014\u0010?\u001a\u00020\u0016X\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0018\"\u0014\u0010A\u001a\u00020\u0016X\u0080D\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0018\"\u001c\u0010C\u001a\n \r*\u0004\u0018\u00010\u00050\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0007\u00a8\u0006\u0087\u0001"}, d2 = {"OPT_MASK_BITS", "", "getOPT_MASK_BITS", "()I", "OPT_MASK_TYPE", "Lorg/jetbrains/org/objectweb/asm/Type;", "getOPT_MASK_TYPE", "()Lorg/jetbrains/org/objectweb/asm/Type;", "contextSerializerId", "Lorg/jetbrains/kotlin/name/ClassId;", "getContextSerializerId", "()Lorg/jetbrains/kotlin/name/ClassId;", "decoderType", "kotlin.jvm.PlatformType", "getDecoderType", "descImplType", "getDescImplType", "descType", "getDescType", "descriptorForEnumsType", "getDescriptorForEnumsType", "descriptorGetterName", "", "getDescriptorGetterName", "()Ljava/lang/String;", "encoderType", "getEncoderType", "enumSerializerId", "getEnumSerializerId", "function0Type", "getFunction0Type", "generatedSerializerType", "getGeneratedSerializerType", "getLazyValueName", "getGetLazyValueName", "jvmLambdaType", "getJvmLambdaType", "kInputType", "getKInputType", "kOutputType", "getKOutputType", "kSerialLoaderType", "getKSerialLoaderType", "kSerialSaverType", "getKSerialSaverType", "kSerializerArrayType", "getKSerializerArrayType", "kSerializerType", "getKSerializerType", "kotlinLazyType", "getKotlinLazyType", "objectSerializerId", "getObjectSerializerId", "pluginUtilsType", "getPluginUtilsType", "polymorphicSerializerId", "getPolymorphicSerializerId", "referenceArraySerializerId", "getReferenceArraySerializerId", "sealedSerializerId", "getSealedSerializerId", "serializationExceptionMissingFieldName", "getSerializationExceptionMissingFieldName", "serializationExceptionName", "getSerializationExceptionName", "serializationExceptionUnknownIndexName", "getSerializationExceptionUnknownIndexName", "threadSafeModeType", "getThreadSafeModeType", "createSingletonLambda", "lambdaName", "outerClassCodegen", "Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;", "resultSimpleType", "Lorg/jetbrains/kotlin/types/SimpleType;", "block", "Lkotlin/Function2;", "Lorg/jetbrains/org/objectweb/asm/commons/InstructionAdapter;", "", "Lkotlin/ExtensionFunctionType;", "buildInternalConstructorDesc", "propsStartVar", "bitMaskBase", "codegen", "Lorg/jetbrains/kotlin/codegen/ClassBodyCodegen;", "args", "", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;", "fillArray", "T", "type", "onEach", "genKOutputMethodCall", "property", "classCodegen", "expressionCodegen", "Lorg/jetbrains/kotlin/codegen/ExpressionCodegen;", "propertyOwnerType", "ownerVar", "fromClassStartVar", "generator", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/AbstractSerialGenerator;", "(Lorg/jetbrains/org/objectweb/asm/commons/InstructionAdapter;Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;Lorg/jetbrains/kotlin/codegen/ExpressionCodegen;Lorg/jetbrains/org/objectweb/asm/Type;ILjava/lang/Integer;Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/AbstractSerialGenerator;)V", "genMissingFieldExceptionThrow", "fieldName", "genValidateProperty", "index", "bitMaskAddress", "generateMethod", "function", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "Lkotlin/Function3;", "Lorg/jetbrains/kotlin/resolve/jvm/jvmSignature/JvmMethodSignature;", "getSerialTypeInfo", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/jvm/JVMSerialTypeInfo;", "stackValueDefault", "stackValueSerializerInstance", "", "module", "Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "kType", "Lorg/jetbrains/kotlin/types/KotlinType;", "maybeSerializer", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "iv", "genericIndex", "genericSerializerFieldGetter", "(Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/AbstractSerialGenerator;Lorg/jetbrains/kotlin/codegen/ClassBodyCodegen;Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;Lorg/jetbrains/org/objectweb/asm/commons/InstructionAdapter;Ljava/lang/Integer;Lkotlin/jvm/functions/Function3;)Z", "stackValueSerializerInstanceFromClass", "sti", "varIndexStart", "serializerCodegen", "stackValueSerializerInstanceFromSerializer", "stackValueSerializerInstanceFromSerializerWithoutSti", "wrapStackValueIntoNullableSerializer", "kotlinx-serialization"})
public final class JVMCodegenUtilKt {
    private static final org.jetbrains.org.objectweb.asm.Type descType = null;
    private static final org.jetbrains.org.objectweb.asm.Type descImplType = null;
    private static final org.jetbrains.org.objectweb.asm.Type descriptorForEnumsType = null;
    private static final org.jetbrains.org.objectweb.asm.Type generatedSerializerType = null;
    private static final org.jetbrains.org.objectweb.asm.Type kOutputType = null;
    private static final org.jetbrains.org.objectweb.asm.Type encoderType = null;
    private static final org.jetbrains.org.objectweb.asm.Type decoderType = null;
    private static final org.jetbrains.org.objectweb.asm.Type kInputType = null;
    private static final org.jetbrains.org.objectweb.asm.Type pluginUtilsType = null;
    private static final org.jetbrains.org.objectweb.asm.Type jvmLambdaType = null;
    private static final org.jetbrains.org.objectweb.asm.Type kotlinLazyType = null;
    private static final org.jetbrains.org.objectweb.asm.Type function0Type = null;
    private static final org.jetbrains.org.objectweb.asm.Type threadSafeModeType = null;
    private static final org.jetbrains.org.objectweb.asm.Type kSerialSaverType = null;
    private static final org.jetbrains.org.objectweb.asm.Type kSerialLoaderType = null;
    private static final org.jetbrains.org.objectweb.asm.Type kSerializerType = null;
    private static final org.jetbrains.org.objectweb.asm.Type kSerializerArrayType = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String serializationExceptionName = "kotlinx/serialization/SerializationException";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String serializationExceptionMissingFieldName = "kotlinx/serialization/MissingFieldException";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String serializationExceptionUnknownIndexName = "kotlinx/serialization/UnknownFieldException";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String descriptorGetterName = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String getLazyValueName = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.org.objectweb.asm.Type OPT_MASK_TYPE = null;
    private static final int OPT_MASK_BITS = 32;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.ClassId enumSerializerId = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.ClassId polymorphicSerializerId = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.ClassId referenceArraySerializerId = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.ClassId objectSerializerId = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.ClassId sealedSerializerId = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.ClassId contextSerializerId = null;
    
    public static final org.jetbrains.org.objectweb.asm.Type getDescType() {
        return null;
    }
    
    public static final org.jetbrains.org.objectweb.asm.Type getDescImplType() {
        return null;
    }
    
    public static final org.jetbrains.org.objectweb.asm.Type getDescriptorForEnumsType() {
        return null;
    }
    
    public static final org.jetbrains.org.objectweb.asm.Type getGeneratedSerializerType() {
        return null;
    }
    
    public static final org.jetbrains.org.objectweb.asm.Type getKOutputType() {
        return null;
    }
    
    public static final org.jetbrains.org.objectweb.asm.Type getEncoderType() {
        return null;
    }
    
    public static final org.jetbrains.org.objectweb.asm.Type getDecoderType() {
        return null;
    }
    
    public static final org.jetbrains.org.objectweb.asm.Type getKInputType() {
        return null;
    }
    
    public static final org.jetbrains.org.objectweb.asm.Type getPluginUtilsType() {
        return null;
    }
    
    public static final org.jetbrains.org.objectweb.asm.Type getJvmLambdaType() {
        return null;
    }
    
    public static final org.jetbrains.org.objectweb.asm.Type getKotlinLazyType() {
        return null;
    }
    
    public static final org.jetbrains.org.objectweb.asm.Type getFunction0Type() {
        return null;
    }
    
    public static final org.jetbrains.org.objectweb.asm.Type getThreadSafeModeType() {
        return null;
    }
    
    public static final org.jetbrains.org.objectweb.asm.Type getKSerialSaverType() {
        return null;
    }
    
    public static final org.jetbrains.org.objectweb.asm.Type getKSerialLoaderType() {
        return null;
    }
    
    public static final org.jetbrains.org.objectweb.asm.Type getKSerializerType() {
        return null;
    }
    
    public static final org.jetbrains.org.objectweb.asm.Type getKSerializerArrayType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getSerializationExceptionName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getSerializationExceptionMissingFieldName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getSerializationExceptionUnknownIndexName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getDescriptorGetterName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getGetLazyValueName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.org.objectweb.asm.Type getOPT_MASK_TYPE() {
        return null;
    }
    
    public static final int getOPT_MASK_BITS() {
        return 0;
    }
    
    public static final void genValidateProperty(@org.jetbrains.annotations.NotNull
    org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$genValidateProperty, int index, int bitMaskAddress) {
    }
    
    public static final void genMissingFieldExceptionThrow(@org.jetbrains.annotations.NotNull
    org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$genMissingFieldExceptionThrow, @org.jetbrains.annotations.NotNull
    java.lang.String fieldName) {
    }
    
    @kotlin.OptIn(markerClass = {org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI.class})
    public static final void genKOutputMethodCall(@org.jetbrains.annotations.NotNull
    org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$genKOutputMethodCall, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty property, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ImplementationBodyCodegen classCodegen, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ExpressionCodegen expressionCodegen, @org.jetbrains.annotations.NotNull
    org.jetbrains.org.objectweb.asm.Type propertyOwnerType, int ownerVar, @org.jetbrains.annotations.Nullable
    java.lang.Integer fromClassStartVar, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator generator) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String buildInternalConstructorDesc(@org.jetbrains.annotations.NotNull
    org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$buildInternalConstructorDesc, int propsStartVar, int bitMaskBase, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ClassBodyCodegen codegen, @org.jetbrains.annotations.NotNull
    java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> args) {
        return null;
    }
    
    public static final void generateMethod(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ImplementationBodyCodegen $this$generateMethod, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function3<? super org.jetbrains.org.objectweb.asm.commons.InstructionAdapter, ? super org.jetbrains.kotlin.resolve.jvm.jvmSignature.JvmMethodSignature, ? super org.jetbrains.kotlin.codegen.ExpressionCodegen, kotlin.Unit> block) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.name.ClassId getEnumSerializerId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.name.ClassId getPolymorphicSerializerId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.name.ClassId getReferenceArraySerializerId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.name.ClassId getObjectSerializerId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.name.ClassId getSealedSerializerId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.name.ClassId getContextSerializerId() {
        return null;
    }
    
    @org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
    public static final boolean stackValueSerializerInstanceFromClass(@org.jetbrains.annotations.NotNull
    org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$stackValueSerializerInstanceFromClass, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ClassBodyCodegen codegen, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.jvm.JVMSerialTypeInfo sti, int varIndexStart, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator serializerCodegen) {
        return false;
    }
    
    public static final boolean stackValueSerializerInstanceFromSerializerWithoutSti(@org.jetbrains.annotations.NotNull
    org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$stackValueSerializerInstanceFromSerializerWithoutSti, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ClassBodyCodegen codegen, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty property, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator serializerCodegen) {
        return false;
    }
    
    @org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
    public static final boolean stackValueSerializerInstanceFromSerializer(@org.jetbrains.annotations.NotNull
    org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$stackValueSerializerInstanceFromSerializer, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ClassBodyCodegen codegen, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.jvm.JVMSerialTypeInfo sti, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator serializerCodegen) {
        return false;
    }
    
    public static final boolean stackValueSerializerInstance(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator $this$stackValueSerializerInstance, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ClassBodyCodegen codegen, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType kType, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.descriptors.ClassDescriptor maybeSerializer, @org.jetbrains.annotations.Nullable
    org.jetbrains.org.objectweb.asm.commons.InstructionAdapter iv, @org.jetbrains.annotations.Nullable
    java.lang.Integer genericIndex, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function3<? super org.jetbrains.org.objectweb.asm.commons.InstructionAdapter, ? super java.lang.Integer, ? super org.jetbrains.kotlin.types.KotlinType, kotlin.Unit> genericSerializerFieldGetter) {
        return false;
    }
    
    public static final void wrapStackValueIntoNullableSerializer(@org.jetbrains.annotations.NotNull
    org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$wrapStackValueIntoNullableSerializer) {
    }
    
    public static final <T extends java.lang.Object>void fillArray(@org.jetbrains.annotations.NotNull
    org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$fillArray, @org.jetbrains.annotations.NotNull
    org.jetbrains.org.objectweb.asm.Type type, @org.jetbrains.annotations.NotNull
    java.util.List<? extends T> args, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super T, kotlin.Unit> onEach) {
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.OptIn(markerClass = {org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI.class})
    public static final org.jetbrains.kotlinx.serialization.compiler.backend.jvm.JVMSerialTypeInfo getSerialTypeInfo(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator $this$getSerialTypeInfo, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty property, @org.jetbrains.annotations.NotNull
    org.jetbrains.org.objectweb.asm.Type type) {
        return null;
    }
    
    public static final void stackValueDefault(@org.jetbrains.annotations.NotNull
    org.jetbrains.org.objectweb.asm.commons.InstructionAdapter $this$stackValueDefault, @org.jetbrains.annotations.NotNull
    org.jetbrains.org.objectweb.asm.Type type) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.org.objectweb.asm.Type createSingletonLambda(@org.jetbrains.annotations.NotNull
    java.lang.String lambdaName, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ImplementationBodyCodegen outerClassCodegen, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.SimpleType resultSimpleType, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super org.jetbrains.org.objectweb.asm.commons.InstructionAdapter, ? super org.jetbrains.kotlin.codegen.ImplementationBodyCodegen, kotlin.Unit> block) {
        return null;
    }
}