package org.jetbrains.kotlinx.serialization.compiler.resolve;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bA\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u0019\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u0011\u0010\u001b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\fR\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\fR\u0011\u0010 \u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\bR\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010#\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\fR\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010(\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\fR\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010+\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\fR\u0011\u0010-\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\fR\u0011\u0010/\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\fR\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u00106\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\fR\u000e\u00108\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010;\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\bR\u0011\u0010=\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\fR\u000e\u0010?\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010A\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\fR\u000e\u0010C\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010D\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010\fR\u0011\u0010F\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010\fR\u000e\u0010H\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000R\u0014\u0010I\u001a\u00020\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010\b\u00a8\u0006K"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerialEntityNames;", "", "()V", "ANNOTATION_MARKER_CLASS", "", "ARRAY_MASK_FIELD_MISSING_FUNC_FQ", "Lorg/jetbrains/kotlin/name/FqName;", "getARRAY_MASK_FIELD_MISSING_FUNC_FQ", "()Lorg/jetbrains/kotlin/name/FqName;", "ARRAY_MASK_FIELD_MISSING_FUNC_NAME", "Lorg/jetbrains/kotlin/name/Name;", "getARRAY_MASK_FIELD_MISSING_FUNC_NAME", "()Lorg/jetbrains/kotlin/name/Name;", "CACHED_DESCRIPTOR_FIELD", "CACHED_DESCRIPTOR_FIELD_NAME", "getCACHED_DESCRIPTOR_FIELD_NAME", "CACHED_SERIALIZER_PROPERTY", "CACHED_SERIALIZER_PROPERTY_NAME", "getCACHED_SERIALIZER_PROPERTY_NAME", "CHILD_SERIALIZERS_GETTER", "getCHILD_SERIALIZERS_GETTER", "DECODER_CLASS", "ENCODER_CLASS", "GENERATED_SERIALIZER_CLASS", "getGENERATED_SERIALIZER_CLASS", "GENERATED_SERIALIZER_FQ", "getGENERATED_SERIALIZER_FQ", "IMPL_NAME", "getIMPL_NAME", "KSERIALIZER_CLASS", "KSERIALIZER_NAME", "getKSERIALIZER_NAME", "KSERIALIZER_NAME_FQ", "getKSERIALIZER_NAME_FQ", "LOAD", "LOAD_NAME", "getLOAD_NAME", "MISSING_FIELD_EXC", "PLUGIN_EXCEPTIONS_FILE", "SAVE", "SAVE_NAME", "getSAVE_NAME", "SERIALIZER_CLASS", "SERIALIZER_CLASS_NAME", "getSERIALIZER_CLASS_NAME", "SERIALIZER_PROVIDER_NAME", "getSERIALIZER_PROVIDER_NAME", "SERIAL_CTOR_MARKER_NAME", "getSERIAL_CTOR_MARKER_NAME", "SERIAL_DESCRIPTOR_CLASS", "SERIAL_DESCRIPTOR_CLASS_IMPL", "SERIAL_DESCRIPTOR_FOR_ENUM", "SERIAL_DESCRIPTOR_FOR_INLINE", "SERIAL_DESC_FIELD", "SERIAL_DESC_FIELD_NAME", "getSERIAL_DESC_FIELD_NAME", "SERIAL_EXC", "SERIAL_LOADER_CLASS", "SERIAL_SAVER_CLASS", "SINGLE_MASK_FIELD_MISSING_FUNC_FQ", "getSINGLE_MASK_FIELD_MISSING_FUNC_FQ", "SINGLE_MASK_FIELD_MISSING_FUNC_NAME", "getSINGLE_MASK_FIELD_MISSING_FUNC_NAME", "STRUCTURE_DECODER_CLASS", "STRUCTURE_ENCODER_CLASS", "TYPE_PARAMS_SERIALIZERS_GETTER", "getTYPE_PARAMS_SERIALIZERS_GETTER", "UNKNOWN_FIELD_EXC", "WRITE_SELF_NAME", "getWRITE_SELF_NAME", "dummyParamName", "getDummyParamName", "typeArgPrefix", "wrapIntoNullableExt", "getWrapIntoNullableExt$kotlinx_serialization", "kotlinx-serialization"})
public final class SerialEntityNames {
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlinx.serialization.compiler.resolve.SerialEntityNames INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KSERIALIZER_CLASS = "KSerializer";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SERIAL_DESC_FIELD = "descriptor";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SAVE = "serialize";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String LOAD = "deserialize";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SERIALIZER_CLASS = "$serializer";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CACHED_DESCRIPTOR_FIELD = "$cachedDescriptor";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CACHED_SERIALIZER_PROPERTY = "$cachedSerializer";
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.Name KSERIALIZER_NAME = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.Name SERIAL_CTOR_MARKER_NAME = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.FqName KSERIALIZER_NAME_FQ = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.Name SERIALIZER_CLASS_NAME = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.Name IMPL_NAME = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.Name GENERATED_SERIALIZER_CLASS = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.FqName GENERATED_SERIALIZER_FQ = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ENCODER_CLASS = "Encoder";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String STRUCTURE_ENCODER_CLASS = "CompositeEncoder";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DECODER_CLASS = "Decoder";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String STRUCTURE_DECODER_CLASS = "CompositeDecoder";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ANNOTATION_MARKER_CLASS = "SerializableWith";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SERIAL_SAVER_CLASS = "SerializationStrategy";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SERIAL_LOADER_CLASS = "DeserializationStrategy";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SERIAL_DESCRIPTOR_CLASS = "SerialDescriptor";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SERIAL_DESCRIPTOR_CLASS_IMPL = "PluginGeneratedSerialDescriptor";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SERIAL_DESCRIPTOR_FOR_ENUM = "EnumDescriptor";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SERIAL_DESCRIPTOR_FOR_INLINE = "InlineClassDescriptor";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PLUGIN_EXCEPTIONS_FILE = "PluginExceptions";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SERIAL_EXC = "SerializationException";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String MISSING_FIELD_EXC = "MissingFieldException";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String UNKNOWN_FIELD_EXC = "UnknownFieldException";
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.Name SERIAL_DESC_FIELD_NAME = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.Name SAVE_NAME = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.Name LOAD_NAME = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.Name CHILD_SERIALIZERS_GETTER = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.Name TYPE_PARAMS_SERIALIZERS_GETTER = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.Name WRITE_SELF_NAME = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.Name SERIALIZER_PROVIDER_NAME = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.Name SINGLE_MASK_FIELD_MISSING_FUNC_NAME = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.Name ARRAY_MASK_FIELD_MISSING_FUNC_NAME = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.FqName SINGLE_MASK_FIELD_MISSING_FUNC_FQ = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.FqName ARRAY_MASK_FIELD_MISSING_FUNC_FQ = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.Name CACHED_SERIALIZER_PROPERTY_NAME = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.Name CACHED_DESCRIPTOR_FIELD_NAME = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.Name dummyParamName = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String typeArgPrefix = "typeSerial";
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.FqName wrapIntoNullableExt = null;
    
    private SerialEntityNames() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.Name getKSERIALIZER_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.Name getSERIAL_CTOR_MARKER_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.FqName getKSERIALIZER_NAME_FQ() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.Name getSERIALIZER_CLASS_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.Name getIMPL_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.Name getGENERATED_SERIALIZER_CLASS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.FqName getGENERATED_SERIALIZER_FQ() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.Name getSERIAL_DESC_FIELD_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.Name getSAVE_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.Name getLOAD_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.Name getCHILD_SERIALIZERS_GETTER() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.Name getTYPE_PARAMS_SERIALIZERS_GETTER() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.Name getWRITE_SELF_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.Name getSERIALIZER_PROVIDER_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.Name getSINGLE_MASK_FIELD_MISSING_FUNC_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.Name getARRAY_MASK_FIELD_MISSING_FUNC_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.FqName getSINGLE_MASK_FIELD_MISSING_FUNC_FQ() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.FqName getARRAY_MASK_FIELD_MISSING_FUNC_FQ() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.Name getCACHED_SERIALIZER_PROPERTY_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.Name getCACHED_DESCRIPTOR_FIELD_NAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.Name getDummyParamName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.FqName getWrapIntoNullableExt$kotlinx_serialization() {
        return null;
    }
}