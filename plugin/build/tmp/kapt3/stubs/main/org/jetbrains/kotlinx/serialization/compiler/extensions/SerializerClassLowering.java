package org.jetbrains.kotlinx.serialization.compiler.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializerClassLowering;", "Lorg/jetbrains/kotlin/ir/visitors/IrElementTransformerVoid;", "Lorg/jetbrains/kotlin/backend/common/ClassLoweringPass;", "baseContext", "Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;", "metadataPlugin", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "(Lorg/jetbrains/kotlin/backend/common/extensions/IrPluginContext;Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;)V", "context", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationPluginContext;", "getContext", "()Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationPluginContext;", "serialInfoJvmGenerator", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/SerialInfoImplJvmIrGenerator;", "lower", "", "irClass", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "kotlinx-serialization"})
@org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
final class SerializerClassLowering extends org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid implements org.jetbrains.kotlin.backend.common.ClassLoweringPass {
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationPluginContext context = null;
    private final org.jetbrains.kotlinx.serialization.compiler.backend.ir.SerialInfoImplJvmIrGenerator serialInfoJvmGenerator = null;
    
    public SerializerClassLowering(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.backend.common.extensions.IrPluginContext baseContext, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin metadataPlugin) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationPluginContext getContext() {
        return null;
    }
    
    @java.lang.Override
    public void lower(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass irClass) {
    }
    
    @java.lang.Override
    public void lower(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrFile irFile) {
    }
}