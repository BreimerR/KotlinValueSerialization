package org.jetbrains.kotlinx.serialization.compiler.backend.ir;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u001c\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001c\u0010\u001a\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u001c\u0010\u001d\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0015H\u0014R\u0014\u0010\u000b\u001a\u00020\fX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001f"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/SerializerForInlineClassGenerator;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/SerializerIrGenerator;", "irClass", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "compilerContext", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationPluginContext;", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "serialInfoJvmGenerator", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/SerialInfoImplJvmIrGenerator;", "(Lorg/jetbrains/kotlin/ir/declarations/IrClass;Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationPluginContext;Lorg/jetbrains/kotlin/resolve/BindingContext;Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/SerialInfoImplJvmIrGenerator;)V", "serialDescImplClass", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "getSerialDescImplClass", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "generateLoad", "", "function", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "generateSave", "coerceToBox", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "Lorg/jetbrains/kotlin/ir/builders/IrBlockBodyBuilder;", "expression", "inlineClassBoxType", "Lorg/jetbrains/kotlin/ir/types/IrType;", "getFromBox", "serializableProperty", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;", "instantiateNewDescriptor", "correctThis", "kotlinx-serialization"})
@org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
public final class SerializerForInlineClassGenerator extends org.jetbrains.kotlinx.serialization.compiler.backend.ir.SerializerIrGenerator {
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.descriptors.ClassDescriptor serialDescImplClass = null;
    
    public SerializerForInlineClassGenerator(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass irClass, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationPluginContext compilerContext, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext bindingContext, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.ir.SerialInfoImplJvmIrGenerator serialInfoJvmGenerator) {
        super(null, null, null, null, null);
    }
    
    @java.lang.Override
    protected void generateSave(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function) {
    }
    
    @java.lang.Override
    protected void generateLoad(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected org.jetbrains.kotlin.descriptors.ClassDescriptor getSerialDescImplClass() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected org.jetbrains.kotlin.ir.expressions.IrExpression instantiateNewDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$instantiateNewDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor serialDescImplClass, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression correctThis) {
        return null;
    }
    
    private final org.jetbrains.kotlin.ir.expressions.IrExpression coerceToBox(org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$coerceToBox, org.jetbrains.kotlin.ir.expressions.IrExpression expression, org.jetbrains.kotlin.ir.types.IrType inlineClassBoxType) {
        return null;
    }
    
    private final org.jetbrains.kotlin.ir.expressions.IrExpression getFromBox(org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$getFromBox, org.jetbrains.kotlin.ir.expressions.IrExpression expression, org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty serializableProperty) {
        return null;
    }
}