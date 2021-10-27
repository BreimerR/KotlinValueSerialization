package org.jetbrains.kotlinx.serialization.compiler.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationCodegenExtension;", "Lorg/jetbrains/kotlin/codegen/extensions/ExpressionCodegenExtension;", "metadataPlugin", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "(Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;)V", "getMetadataPlugin", "()Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "shouldGenerateClassSyntheticPartsInLightClassesMode", "", "getShouldGenerateClassSyntheticPartsInLightClassesMode", "()Z", "generateClassSyntheticParts", "", "codegen", "Lorg/jetbrains/kotlin/codegen/ImplementationBodyCodegen;", "kotlinx-serialization"})
public class SerializationCodegenExtension implements org.jetbrains.kotlin.codegen.extensions.ExpressionCodegenExtension {
    @org.jetbrains.annotations.Nullable
    private final org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin metadataPlugin = null;
    
    @kotlin.jvm.JvmOverloads
    public SerializationCodegenExtension() {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public SerializationCodegenExtension(@org.jetbrains.annotations.Nullable
    org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin metadataPlugin) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin getMetadataPlugin() {
        return null;
    }
    
    @java.lang.Override
    public void generateClassSyntheticParts(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.ImplementationBodyCodegen codegen) {
    }
    
    @java.lang.Override
    public boolean getShouldGenerateClassSyntheticPartsInLightClassesMode() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public org.jetbrains.kotlin.codegen.StackValue applyFunction(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.StackValue receiver, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<?> resolvedCall, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.extensions.ExpressionCodegenExtension.Context c) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public org.jetbrains.kotlin.codegen.StackValue applyProperty(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.StackValue receiver, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<?> resolvedCall, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.codegen.extensions.ExpressionCodegenExtension.Context c) {
        return null;
    }
}