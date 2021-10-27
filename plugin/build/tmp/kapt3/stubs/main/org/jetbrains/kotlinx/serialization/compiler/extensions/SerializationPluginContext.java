package org.jetbrains.kotlinx.serialization.compiler.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0096\u0001J\u0013\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020BH\u0096\u0001J\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020E0D2\u0006\u0010F\u001a\u00020BH\u0096\u0001J\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020H0D2\u0006\u0010A\u001a\u00020BH\u0096\u0001J\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020J0D2\u0006\u0010A\u001a\u00020BH\u0096\u0001J#\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010!\u001a\u00020\"H\u0096\u0001J\u0013\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010A\u001a\u00020BH\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u00078\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u001cX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"8\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\u0004\u0018\u00010&X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(R\u001a\u0010)\u001a\u00020*X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b1\u00102R\u0012\u00103\u001a\u000204X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u0002088\u0016X\u0097\u0005\u00a2\u0006\u0006\u001a\u0004\b9\u0010:\u00a8\u0006S"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationPluginContext;", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "baseContext", "metadataPlugin", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;)V", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "getBindingContext", "()Lorg/jetbrains/kotlin/resolve/BindingContext;", "builtIns", "Lorg/jetbrains/kotlin/builtins/KotlinBuiltIns;", "getBuiltIns", "()Lorg/jetbrains/kotlin/builtins/KotlinBuiltIns;", "copiedStaticWriteSelf", "", "Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", "getCopiedStaticWriteSelf$kotlinx_serialization", "()Ljava/util/Map;", "irBuiltIns", "Lorg/jetbrains/kotlin/ir/descriptors/IrBuiltIns;", "getIrBuiltIns", "()Lorg/jetbrains/kotlin/ir/descriptors/IrBuiltIns;", "irFactory", "Lorg/jetbrains/kotlin/ir/declarations/IrFactory;", "getIrFactory", "()Lorg/jetbrains/kotlin/ir/declarations/IrFactory;", "languageVersionSettings", "Lorg/jetbrains/kotlin/config/LanguageVersionSettings;", "getLanguageVersionSettings", "()Lorg/jetbrains/kotlin/config/LanguageVersionSettings;", "getMetadataPlugin", "()Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "moduleDescriptor", "Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "getModuleDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "platform", "Lorg/jetbrains/kotlin/platform/TargetPlatform;", "getPlatform", "()Lorg/jetbrains/kotlin/platform/TargetPlatform;", "serialInfoImplJvmIrGenerator", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/SerialInfoImplJvmIrGenerator;", "getSerialInfoImplJvmIrGenerator", "()Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/SerialInfoImplJvmIrGenerator;", "setSerialInfoImplJvmIrGenerator", "(Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/SerialInfoImplJvmIrGenerator;)V", "symbolTable", "Lorg/jetbrains/kotlin/ir/util/ReferenceSymbolTable;", "getSymbolTable", "()Lorg/jetbrains/kotlin/ir/util/ReferenceSymbolTable;", "symbols", "Lorg/jetbrains/kotlin/backend/common/ir/BuiltinSymbolsBase;", "getSymbols", "()Lorg/jetbrains/kotlin/backend/common/ir/BuiltinSymbolsBase;", "typeTranslator", "Lorg/jetbrains/kotlin/ir/util/TypeTranslator;", "getTypeTranslator", "()Lorg/jetbrains/kotlin/ir/util/TypeTranslator;", "createDiagnosticReporter", "Lorg/jetbrains/kotlin/ir/util/IrMessageLogger;", "pluginId", "", "referenceClass", "Lorg/jetbrains/kotlin/ir/symbols/IrClassSymbol;", "fqName", "Lorg/jetbrains/kotlin/name/FqName;", "referenceConstructors", "", "Lorg/jetbrains/kotlin/ir/symbols/IrConstructorSymbol;", "classFqn", "referenceFunctions", "Lorg/jetbrains/kotlin/ir/symbols/IrSimpleFunctionSymbol;", "referenceProperties", "Lorg/jetbrains/kotlin/ir/symbols/IrPropertySymbol;", "referenceTopLevel", "Lorg/jetbrains/kotlin/ir/symbols/IrSymbol;", "signature", "Lorg/jetbrains/kotlin/ir/util/IdSignature;", "kind", "Lorg/jetbrains/kotlin/ir/linkage/IrDeserializer$TopLevelSymbolKind;", "referenceTypeAlias", "Lorg/jetbrains/kotlin/ir/symbols/IrTypeAliasSymbol;", "kotlinx-serialization"})
@org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
public final class SerializationPluginContext implements org.jetbrains.kotlin.backend.common.extensions.IrPluginContext {
    @org.jetbrains.annotations.Nullable
    private final org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin metadataPlugin = null;
    public org.jetbrains.kotlinx.serialization.compiler.backend.ir.SerialInfoImplJvmIrGenerator serialInfoImplJvmIrGenerator;
    @org.jetbrains.annotations.NotNull
    private final java.util.Map<org.jetbrains.kotlin.ir.declarations.IrSimpleFunction, org.jetbrains.kotlin.ir.declarations.IrSimpleFunction> copiedStaticWriteSelf = null;
    
    public SerializationPluginContext(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.backend.common.extensions.IrPluginContext baseContext, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin metadataPlugin) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin getMetadataPlugin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlinx.serialization.compiler.backend.ir.SerialInfoImplJvmIrGenerator getSerialInfoImplJvmIrGenerator() {
        return null;
    }
    
    public final void setSerialInfoImplJvmIrGenerator(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.ir.SerialInfoImplJvmIrGenerator p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<org.jetbrains.kotlin.ir.declarations.IrSimpleFunction, org.jetbrains.kotlin.ir.declarations.IrSimpleFunction> getCopiedStaticWriteSelf$kotlinx_serialization() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.jetbrains.kotlin.ir.util.IrMessageLogger createDiagnosticReporter(@org.jetbrains.annotations.NotNull
    java.lang.String pluginId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.jetbrains.kotlin.resolve.BindingContext getBindingContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.jetbrains.kotlin.builtins.KotlinBuiltIns getBuiltIns() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.jetbrains.kotlin.ir.descriptors.IrBuiltIns getIrBuiltIns() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.jetbrains.kotlin.ir.declarations.IrFactory getIrFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.jetbrains.kotlin.config.LanguageVersionSettings getLanguageVersionSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.jetbrains.kotlin.descriptors.ModuleDescriptor getModuleDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public org.jetbrains.kotlin.platform.TargetPlatform getPlatform() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.jetbrains.kotlin.ir.util.ReferenceSymbolTable getSymbolTable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.jetbrains.kotlin.backend.common.ir.BuiltinSymbolsBase getSymbols() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.jetbrains.kotlin.ir.util.TypeTranslator getTypeTranslator() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public org.jetbrains.kotlin.ir.symbols.IrClassSymbol referenceClass(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.FqName fqName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.Collection<org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol> referenceConstructors(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.FqName classFqn) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.Collection<org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol> referenceFunctions(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.FqName fqName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.Collection<org.jetbrains.kotlin.ir.symbols.IrPropertySymbol> referenceProperties(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.FqName fqName) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public org.jetbrains.kotlin.ir.symbols.IrSymbol referenceTopLevel(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.util.IdSignature signature, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.linkage.IrDeserializer.TopLevelSymbolKind kind, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor moduleDescriptor) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public org.jetbrains.kotlin.ir.symbols.IrTypeAliasSymbol referenceTypeAlias(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.FqName fqName) {
        return null;
    }
}