package org.jetbrains.kotlinx.serialization.compiler.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationLoweringExtension;", "Lorg/jetbrains/kotlin/backend/common/extensions/IrGenerationExtension;", "metadataPlugin", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "(Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;)V", "getMetadataPlugin", "()Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "generate", "", "moduleFragment", "Lorg/jetbrains/kotlin/ir/declarations/IrModuleFragment;", "pluginContext", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "kotlinx-serialization"})
@org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
public class SerializationLoweringExtension implements org.jetbrains.kotlin.backend.common.extensions.IrGenerationExtension {
    @org.jetbrains.annotations.Nullable
    private final org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin metadataPlugin = null;
    
    @kotlin.jvm.JvmOverloads
    public SerializationLoweringExtension() {
        super();
    }
    
    @kotlin.jvm.JvmOverloads
    public SerializationLoweringExtension(@org.jetbrains.annotations.Nullable
    org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin metadataPlugin) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin getMetadataPlugin() {
        return null;
    }
    
    @java.lang.Override
    public void generate(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrModuleFragment moduleFragment, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.backend.common.extensions.IrPluginContext pluginContext) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public org.jetbrains.kotlin.ir.declarations.IrDeclaration resolveSymbol(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.symbols.IrSymbol symbol, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.TranslationPluginContext context) {
        return null;
    }
}