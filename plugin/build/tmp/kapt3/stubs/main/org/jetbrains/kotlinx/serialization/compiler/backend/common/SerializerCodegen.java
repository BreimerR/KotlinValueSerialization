package org.jetbrains.kotlinx.serialization.compiler.backend.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 F2\u00020\u0001:\u0001FB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010*\u001a\u00020+H\u0002J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0004J\u0006\u0010-\u001a\u00020+J\u0010\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u000200H$J\u0010\u00101\u001a\u00020+2\u0006\u00102\u001a\u000203H$J\u0010\u00104\u001a\u00020+2\u0006\u0010/\u001a\u000200H$J\b\u00105\u001a\u00020\u0010H\u0002J\b\u00106\u001a\u00020+H\u0002J\u0010\u00107\u001a\u00020+2\u0006\u0010/\u001a\u000200H$J\b\u00108\u001a\u00020\u0010H\u0002J\b\u00109\u001a\u00020+H$J\u0010\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020\nH$J\b\u0010<\u001a\u00020\u0010H\u0002J\u0010\u0010=\u001a\u00020+2\u0006\u0010/\u001a\u000200H$JB\u0010>\u001a\u0004\u0018\u00010\n2\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020 2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100B2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00100BH\u0002J.\u0010E\u001a\u0004\u0018\u00010\n2\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020 2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100BH\u0002R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\nX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u0010X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0011RH\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\u00140\u0013@DX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u0013X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010%\u00a8\u0006G"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/SerializerCodegen;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/AbstractSerialGenerator;", "serializerDescriptor", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "metadataPlugin", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;Lorg/jetbrains/kotlin/resolve/BindingContext;Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;)V", "anySerialDescProperty", "Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "getAnySerialDescProperty", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "generatedSerialDescPropertyDescriptor", "getGeneratedSerialDescPropertyDescriptor", "isGeneratedSerializer", "", "()Z", "<set-?>", "", "Lkotlin/Pair;", "Lorg/jetbrains/kotlin/ir/declarations/IrProperty;", "localSerializersFieldsDescriptors", "getLocalSerializersFieldsDescriptors", "()Ljava/util/List;", "setLocalSerializersFieldsDescriptors", "(Ljava/util/List;)V", "properties", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperties;", "getProperties", "()Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperties;", "serialName", "", "getSerialName", "()Ljava/lang/String;", "serializableDescriptor", "getSerializableDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "serializableProperties", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;", "getSerializableProperties", "getSerializerDescriptor", "checkSerializability", "", "findLocalSerializersFieldDescriptors", "generate", "generateChildSerializersGetter", "function", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "generateGenericFieldsAndConstructor", "typedConstructorDescriptor", "Lorg/jetbrains/kotlin/descriptors/ClassConstructorDescriptor;", "generateLoad", "generateLoadIfNeeded", "generateMembersFromGeneratedSerializer", "generateSave", "generateSaveIfNeeded", "generateSerialDesc", "generateSerializableClassProperty", "property", "generateSerializableClassPropertyIfNeeded", "generateTypeParamsSerializersGetter", "getProperty", "classDescriptor", "name", "isReturnTypeOk", "Lkotlin/Function1;", "isKindOk", "Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor$Kind;", "getPropertyToGenerate", "Companion", "kotlinx-serialization"})
public abstract class SerializerCodegen extends org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator {
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.descriptors.ClassDescriptor serializerDescriptor = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.descriptors.ClassDescriptor serializableDescriptor = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String serialName = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperties properties = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> serializableProperties = null;
    @org.jetbrains.annotations.Nullable
    private final org.jetbrains.kotlin.descriptors.PropertyDescriptor generatedSerialDescPropertyDescriptor = null;
    @org.jetbrains.annotations.Nullable
    private final org.jetbrains.kotlin.descriptors.PropertyDescriptor anySerialDescProperty = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<? extends kotlin.Pair<? extends org.jetbrains.kotlin.descriptors.PropertyDescriptor, ? extends org.jetbrains.kotlin.ir.declarations.IrProperty>> localSerializersFieldsDescriptors;
    private final boolean isGeneratedSerializer = false;
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlinx.serialization.compiler.backend.common.SerializerCodegen.Companion Companion = null;
    
    public SerializerCodegen(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor serializerDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext bindingContext, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin metadataPlugin) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    protected final org.jetbrains.kotlin.descriptors.ClassDescriptor getSerializerDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.descriptors.ClassDescriptor getSerializableDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final java.lang.String getSerialName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperties getProperties() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> getSerializableProperties() {
        return null;
    }
    
    private final void checkSerializability() {
    }
    
    public final void generate() {
    }
    
    private final void generateMembersFromGeneratedSerializer() {
    }
    
    protected abstract void generateTypeParamsSerializersGetter(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function);
    
    protected abstract void generateChildSerializersGetter(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function);
    
    @org.jetbrains.annotations.Nullable
    protected final org.jetbrains.kotlin.descriptors.PropertyDescriptor getGeneratedSerialDescPropertyDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    protected final org.jetbrains.kotlin.descriptors.PropertyDescriptor getAnySerialDescProperty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.Pair<org.jetbrains.kotlin.descriptors.PropertyDescriptor, org.jetbrains.kotlin.ir.declarations.IrProperty>> getLocalSerializersFieldsDescriptors() {
        return null;
    }
    
    protected final void setLocalSerializersFieldsDescriptors(@org.jetbrains.annotations.NotNull
    java.util.List<? extends kotlin.Pair<? extends org.jetbrains.kotlin.descriptors.PropertyDescriptor, ? extends org.jetbrains.kotlin.ir.declarations.IrProperty>> p0) {
    }
    
    protected final boolean isGeneratedSerializer() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final java.util.List<org.jetbrains.kotlin.descriptors.PropertyDescriptor> findLocalSerializersFieldDescriptors() {
        return null;
    }
    
    protected abstract void generateSerialDesc();
    
    protected abstract void generateGenericFieldsAndConstructor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor typedConstructorDescriptor);
    
    protected abstract void generateSerializableClassProperty(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.PropertyDescriptor property);
    
    protected abstract void generateSave(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function);
    
    protected abstract void generateLoad(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function);
    
    private final boolean generateSerializableClassPropertyIfNeeded() {
        return false;
    }
    
    private final boolean generateSaveIfNeeded() {
        return false;
    }
    
    private final boolean generateLoadIfNeeded() {
        return false;
    }
    
    private final org.jetbrains.kotlin.descriptors.PropertyDescriptor getPropertyToGenerate(org.jetbrains.kotlin.descriptors.ClassDescriptor classDescriptor, java.lang.String name, kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.descriptors.PropertyDescriptor, java.lang.Boolean> isReturnTypeOk) {
        return null;
    }
    
    private final org.jetbrains.kotlin.descriptors.PropertyDescriptor getProperty(org.jetbrains.kotlin.descriptors.ClassDescriptor classDescriptor, java.lang.String name, kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.descriptors.PropertyDescriptor, java.lang.Boolean> isReturnTypeOk, kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind, java.lang.Boolean> isKindOk) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\b"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/SerializerCodegen$Companion;", "", "()V", "getSyntheticLoadMember", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "serializerDescriptor", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "getSyntheticSaveMember", "kotlinx-serialization"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final org.jetbrains.kotlin.descriptors.FunctionDescriptor getSyntheticLoadMember(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.ClassDescriptor serializerDescriptor) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final org.jetbrains.kotlin.descriptors.FunctionDescriptor getSyntheticSaveMember(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.ClassDescriptor serializerDescriptor) {
            return null;
        }
    }
}