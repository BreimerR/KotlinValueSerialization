package org.jetbrains.kotlinx.serialization.compiler.backend.ir;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00c2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0001TB/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"H\u0014J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010%\u001a\u00020\u001dH\u0014J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020(H\u0014J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J$\u0010*\u001a\u00020\u001d*\u00020+2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0014J*\u00100\u001a\u00020\u001d*\u00020+2\f\u00101\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00104\u001a\u00020-2\u0006\u00105\u001a\u00020/H\u0004J \u00106\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020907*\u00020:2\u0006\u0010;\u001a\u00020(H\u0002J\u00b7\u0001\u0010<\u001a\u000208*\u00020+2\u0006\u0010=\u001a\u0002082\u0006\u0010>\u001a\u00020?2\u0006\u0010\'\u001a\u00020@2L\u0010A\u001aH\u0012\u0013\u0012\u001108\u00a2\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110F\u00a2\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(G\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u0002080207j\u0002`H0B27\u0010I\u001a3\u0012\u0013\u0012\u00110F\u00a2\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(G\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020/\u0012\n\u0012\b\u0012\u0004\u0012\u0002080207j\u0002`H0J2\n\b\u0002\u0010K\u001a\u0004\u0018\u000109H\u0004JJ\u0010L\u001a\u00020\u001d*\u00020+2\u0006\u0010M\u001a\u00020-2\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020-0J2\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020P0J2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020-02H\u0002J\u001c\u0010R\u001a\u000208*\u00020+2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010S\u001a\u000208H\u0014R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015\u00a8\u0006U"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/SerializerIrGenerator;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/SerializerCodegen;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/IrBuilderExtension;", "irClass", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "compilerContext", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationPluginContext;", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "metadataPlugin", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "serialInfoJvmGenerator", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/SerialInfoImplJvmIrGenerator;", "(Lorg/jetbrains/kotlin/ir/declarations/IrClass;Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationPluginContext;Lorg/jetbrains/kotlin/resolve/BindingContext;Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/SerialInfoImplJvmIrGenerator;)V", "getCompilerContext", "()Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationPluginContext;", "irAnySerialDescProperty", "Lorg/jetbrains/kotlin/ir/symbols/IrPropertySymbol;", "getIrAnySerialDescProperty", "()Lorg/jetbrains/kotlin/ir/symbols/IrPropertySymbol;", "getIrClass", "()Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "serialDescImplClass", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "getSerialDescImplClass", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "serializableIrClass", "getSerializableIrClass", "generateChildSerializersGetter", "", "function", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "generateGenericFieldsAndConstructor", "typedConstructorDescriptor", "Lorg/jetbrains/kotlin/descriptors/ClassConstructorDescriptor;", "generateLoad", "generateSave", "generateSerialDesc", "generateSerializableClassProperty", "property", "Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "generateTypeParamsSerializersGetter", "addElementsContentToDescriptor", "Lorg/jetbrains/kotlin/ir/builders/IrBlockBodyBuilder;", "localDescriptor", "Lorg/jetbrains/kotlin/ir/declarations/IrVariable;", "addFunction", "Lorg/jetbrains/kotlin/ir/symbols/IrFunctionSymbol;", "copySerialInfoAnnotationsToDescriptor", "annotations", "", "Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;", "receiver", "method", "defaultValueAndType", "Lkotlin/Pair;", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "Lorg/jetbrains/kotlin/ir/types/IrType;", "Lorg/jetbrains/kotlin/ir/builders/IrBuilderWithScope;", "descriptor", "formEncodeDecodePropertyCall", "encoder", "dispatchReceiver", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;", "whenHaveSerializer", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "serializer", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/SerialTypeInfo;", "sti", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/FunctionWithArgs;", "whenDoNot", "Lkotlin/Function1;", "returnTypeHint", "generateSetStandaloneProperties", "serializableVar", "propVars", "propIndexes", "", "bitMasks", "instantiateNewDescriptor", "correctThis", "Companion", "kotlinx-serialization"})
@org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
public class SerializerIrGenerator extends org.jetbrains.kotlinx.serialization.compiler.backend.common.SerializerCodegen implements org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension {
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.ir.declarations.IrClass irClass = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationPluginContext compilerContext = null;
    private final org.jetbrains.kotlinx.serialization.compiler.backend.ir.SerialInfoImplJvmIrGenerator serialInfoJvmGenerator = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.ir.declarations.IrClass serializableIrClass = null;
    @org.jetbrains.annotations.Nullable
    private final org.jetbrains.kotlin.ir.symbols.IrPropertySymbol irAnySerialDescProperty = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.descriptors.ClassDescriptor serialDescImplClass = null;
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlinx.serialization.compiler.backend.ir.SerializerIrGenerator.Companion Companion = null;
    
    public SerializerIrGenerator(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass irClass, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationPluginContext compilerContext, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext bindingContext, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin metadataPlugin, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.ir.SerialInfoImplJvmIrGenerator serialInfoJvmGenerator) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.ir.declarations.IrClass getIrClass() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public final org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationPluginContext getCompilerContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final org.jetbrains.kotlin.ir.declarations.IrClass getSerializableIrClass() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    protected final org.jetbrains.kotlin.ir.symbols.IrPropertySymbol getIrAnySerialDescProperty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected org.jetbrains.kotlin.descriptors.ClassDescriptor getSerialDescImplClass() {
        return null;
    }
    
    @java.lang.Override
    protected void generateSerialDesc() {
    }
    
    @org.jetbrains.annotations.NotNull
    protected org.jetbrains.kotlin.ir.expressions.IrExpression instantiateNewDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$instantiateNewDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor serialDescImplClass, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression correctThis) {
        return null;
    }
    
    protected void addElementsContentToDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$addElementsContentToDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor serialDescImplClass, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrVariable localDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol addFunction) {
    }
    
    protected final void copySerialInfoAnnotationsToDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$copySerialInfoAnnotationsToDescriptor, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrConstructorCall> annotations, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrVariable receiver, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol method) {
    }
    
    @java.lang.Override
    protected void generateGenericFieldsAndConstructor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor typedConstructorDescriptor) {
    }
    
    @java.lang.Override
    protected void generateChildSerializersGetter(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function) {
    }
    
    @java.lang.Override
    protected void generateTypeParamsSerializersGetter(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function) {
    }
    
    @java.lang.Override
    protected void generateSerializableClassProperty(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.PropertyDescriptor property) {
    }
    
    @java.lang.Override
    protected void generateSave(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final org.jetbrains.kotlin.ir.expressions.IrExpression formEncodeDecodePropertyCall(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$formEncodeDecodePropertyCall, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression encoder, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrValueParameter dispatchReceiver, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty property, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super org.jetbrains.kotlin.ir.expressions.IrExpression, ? super org.jetbrains.kotlinx.serialization.compiler.backend.common.SerialTypeInfo, ? extends kotlin.Pair<? extends org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol, ? extends java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression>>> whenHaveSerializer, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlinx.serialization.compiler.backend.common.SerialTypeInfo, ? extends kotlin.Pair<? extends org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol, ? extends java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression>>> whenDoNot, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.ir.types.IrType returnTypeHint) {
        return null;
    }
    
    private final kotlin.Pair<org.jetbrains.kotlin.ir.expressions.IrExpression, org.jetbrains.kotlin.ir.types.IrType> defaultValueAndType(org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$defaultValueAndType, org.jetbrains.kotlin.descriptors.PropertyDescriptor descriptor) {
        return null;
    }
    
    @java.lang.Override
    protected void generateLoad(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function) {
    }
    
    private final void generateSetStandaloneProperties(org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$generateSetStandaloneProperties, org.jetbrains.kotlin.ir.declarations.IrVariable serializableVar, kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.descriptors.PropertyDescriptor, ? extends org.jetbrains.kotlin.ir.declarations.IrVariable> propVars, kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.descriptors.PropertyDescriptor, java.lang.Integer> propIndexes, java.util.List<? extends org.jetbrains.kotlin.ir.declarations.IrVariable> bitMasks) {
    }
    
    @org.jetbrains.annotations.NotNull
    public <T extends org.jetbrains.kotlin.ir.declarations.IrDeclaration>T buildWithScope(@org.jetbrains.annotations.NotNull
    T $this$buildWithScope, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> builder) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public org.jetbrains.kotlin.ir.expressions.IrExpression callSerializerFromCompanion(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$callSerializerFromCompanion, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.types.IrType thisIrType, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.ir.types.IrType> typeArgs, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression> args) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.IrClassReference classReference(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$classReference, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType classType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<org.jetbrains.kotlin.ir.expressions.IrConstructorCall> collectSerialInfoAnnotations(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass irClass) {
        return null;
    }
    
    public void contributeAnonymousInitializer(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass $this$contributeAnonymousInitializer, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder, kotlin.Unit> bodyGen) {
    }
    
    public void contributeConstructor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass $this$contributeConstructor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor descriptor, boolean declareNew, boolean overwriteValueParameters, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder, ? super org.jetbrains.kotlin.ir.declarations.IrConstructor, kotlin.Unit> bodyGen) {
    }
    
    public void contributeFunction(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass $this$contributeFunction, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor descriptor, boolean ignoreWhenMissing, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder, ? super org.jetbrains.kotlin.ir.declarations.IrFunction, kotlin.Unit> bodyGen) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<org.jetbrains.kotlin.ir.expressions.IrExpression> copyAnnotationsFrom(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$copyAnnotationsFrom, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrConstructorCall> annotations) {
        return null;
    }
    
    public void copyTypeParamsFromDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrFunction $this$copyTypeParamsFromDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor descriptor) {
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.IrExpression createArrayOfExpression(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$createArrayOfExpression, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.types.IrType arrayElementType, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression> arrayElements) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.IrClassReference createClassReference(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass irClass, int startOffset, int endOffset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.IrClassReference createClassReference(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType classType, int startOffset, int endOffset) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.declarations.IrProperty createCompanionValProperty(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass companionClass, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.types.IrType type, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.Name name, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder, kotlin.Unit> initializerBuilder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public kotlin.jvm.functions.Function1<org.jetbrains.kotlin.ir.expressions.IrExpressionBody, org.jetbrains.kotlin.ir.expressions.IrExpression> createInitializerAdapter(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass irClass, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.descriptors.ValueParameterDescriptor, ? extends org.jetbrains.kotlin.ir.expressions.IrExpression> paramGetReplacer, @org.jetbrains.annotations.Nullable
    kotlin.Pair<? extends org.jetbrains.kotlin.ir.symbols.IrValueSymbol, ? extends kotlin.jvm.functions.Function0<? extends org.jetbrains.kotlin.ir.expressions.IrExpression>> thisGetReplacer) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.IrFunctionExpression createLambdaExpression(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass $this$createLambdaExpression, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.types.IrType type, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder, kotlin.Unit> bodyGen) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.declarations.IrProperty createLazyProperty(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass containingClass, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.types.IrType targetIrType, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.Name name, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder, kotlin.Unit> initializerBuilder) {
        return null;
    }
    
    public void createParameterDeclarations(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrFunction $this$createParameterDeclarations, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor descriptor, boolean overwriteValueParameters, boolean copyTypeParameters) {
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.IrExpression createPrimitiveArrayOfExpression(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$createPrimitiveArrayOfExpression, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.types.IrType elementPrimitiveType, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression> arrayElements) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public kotlin.jvm.functions.Function1<org.jetbrains.kotlin.descriptors.ValueParameterDescriptor, org.jetbrains.kotlin.ir.expressions.IrExpression> createPropertyByParamReplacer(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$createPropertyByParamReplacer, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass irClass, @org.jetbrains.annotations.NotNull
    java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> serialProperties, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrValueParameter instance, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext bindingContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.IrElseBranch elseBranch(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension.BranchBuilder $this$elseBranch, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression result) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.declarations.IrFunction findEnumValuesMethod(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor enumClass) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public org.jetbrains.kotlin.ir.declarations.IrSimpleFunction findWriteSelfMethod(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass $this$findWriteSelfMethod) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.IrExpression formEncodeDecodePropertyCall(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$formEncodeDecodePropertyCall, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator enclosingGenerator, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression encoder, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty property, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super org.jetbrains.kotlin.ir.expressions.IrExpression, ? super org.jetbrains.kotlinx.serialization.compiler.backend.common.SerialTypeInfo, ? extends kotlin.Pair<? extends org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol, ? extends java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression>>> whenHaveSerializer, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlinx.serialization.compiler.backend.common.SerialTypeInfo, ? extends kotlin.Pair<? extends org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol, ? extends java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression>>> whenDoNot, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super org.jetbrains.kotlin.types.KotlinType, ? extends org.jetbrains.kotlin.ir.expressions.IrExpression> genericGetter, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.ir.types.IrType returnTypeHint) {
        return null;
    }
    
    public void generateAnySuperConstructorCall(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$generateAnySuperConstructorCall, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder toBuilder) {
    }
    
    public void generateGoldenMaskCheck(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$generateGoldenMaskCheck, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.ir.declarations.IrValueDeclaration> seenVars, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperties properties, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression serialDescriptor) {
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.IrExpression generateReceiverExpressionForFieldAccess(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.symbols.IrValueSymbol ownerSymbol, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.PropertyDescriptor property) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.declarations.IrProperty generateSimplePropertyWithBackingField(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.PropertyDescriptor propertyDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass propertyParent, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.Name fieldName) {
        return null;
    }
    
    /**
     * True — ALWAYS
     * False — NEVER
     * null — not specified
     */
    @org.jetbrains.annotations.Nullable
    public java.lang.Boolean getEncodeDefaultAnnotationValue(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrProperty $this$getEncodeDefaultAnnotationValue) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.declarations.IrField getIrField(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty $this$irField) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.declarations.IrProperty getIrPropertyFrom(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty $this$getIrPropertyFrom, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass thisClass) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.IrExpression getLazyValueExpression(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$getLazyValueExpression, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrValueParameter thisParam, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrProperty property, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.types.IrType type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.IrExpression getProperty(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$getProperty, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression receiver, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrProperty property) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public org.jetbrains.kotlin.ir.declarations.IrClass getSuperClassNotAny(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass $this$getSuperClassNotAny) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.declarations.IrClass getSuperClassOrAny(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass $this$getSuperClassOrAny) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.IrExpression irBinOp(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irBinOp, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.Name name, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression lhs, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression rhs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl irEmptyVararg(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irEmptyVararg, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ValueParameterDescriptor forValueParameter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.impl.IrGetObjectValueImpl irGetObject(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irGetObject, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor classDescriptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.impl.IrGetObjectValueImpl irGetObject(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irGetObject, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass irObject) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression<?> irInvoke(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irInvoke, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.ir.expressions.IrExpression dispatchReceiver, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol callee, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.ir.types.IrType> typeArguments, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression> valueArguments, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.ir.types.IrType returnTypeHint) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression<?> irInvoke(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irInvoke, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.ir.expressions.IrExpression dispatchReceiver, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol callee, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression[] args, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.ir.types.IrType typeHint) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.IrWhen irWhen(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irWhen, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.ir.types.IrType typeHint, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension.BranchBuilder, kotlin.Unit> block) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.types.SimpleType kClassTypeFor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.TypeProjection projection) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol referenceFunctionSymbol(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$referenceFunctionSymbol, @org.jetbrains.annotations.NotNull
    java.lang.String functionName, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.ir.declarations.IrSimpleFunction, java.lang.Boolean> predicate) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.declarations.IrProperty searchForProperty(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass $this$searchForProperty, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.PropertyDescriptor descriptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol serializableSyntheticConstructor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass forClass) {
        return null;
    }
    
    public void serializeAllProperties(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$serializeAllProperties, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator generator, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass serializableIrClass, @org.jetbrains.annotations.NotNull
    java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> serializableProperties, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrValueDeclaration objectToSerialize, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrValueDeclaration localOutput, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrValueDeclaration localSerialDesc, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor kOutputClass, int ignoreIndexTo, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.ir.expressions.IrExpressionBody, ? extends org.jetbrains.kotlin.ir.expressions.IrExpression> initializerAdapter, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super org.jetbrains.kotlin.types.KotlinType, ? extends org.jetbrains.kotlin.ir.expressions.IrExpression> genericGetter) {
    }
    
    @org.jetbrains.annotations.Nullable
    public org.jetbrains.kotlin.ir.expressions.IrExpression serializerInstance(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$serializerInstance, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator enclosingGenerator, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.descriptors.ClassDescriptor serializerClassOriginal, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType kType, @org.jetbrains.annotations.Nullable
    java.lang.Integer genericIndex, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super org.jetbrains.kotlin.types.KotlinType, ? extends org.jetbrains.kotlin.ir.expressions.IrExpression> genericGetter) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public org.jetbrains.kotlin.ir.expressions.IrExpression serializerInstance(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$serializerInstance, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.ir.SerializerIrGenerator enclosingGenerator, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrValueParameter dispatchReceiverParameter, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.descriptors.ClassDescriptor serializerClassOriginal, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType kType, @org.jetbrains.annotations.Nullable
    java.lang.Integer genericIndex) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public org.jetbrains.kotlin.ir.expressions.IrExpression serializerTower(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$serializerTower, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.ir.SerializerIrGenerator generator, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrValueParameter dispatchReceiverParameter, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty property) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.expressions.IrExpression setProperty(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$setProperty, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression receiver, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrProperty property, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.types.IrType toIrType(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType $this$toIrType) {
        return null;
    }
    
    public boolean useFieldMissingOptimization() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public org.jetbrains.kotlin.ir.types.IrType wrapIrTypeIntoKSerializerIrType(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.types.IrType type, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.Variance variance) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e\u00a8\u0006\u000f"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/SerializerIrGenerator$Companion;", "", "()V", "generate", "", "irClass", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "context", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationPluginContext;", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "metadataPlugin", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "serialInfoJvmGenerator", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/SerialInfoImplJvmIrGenerator;", "kotlinx-serialization"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void generate(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass irClass, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationPluginContext context, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.resolve.BindingContext bindingContext, @org.jetbrains.annotations.Nullable
        org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin metadataPlugin, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.SerialInfoImplJvmIrGenerator serialInfoJvmGenerator) {
        }
    }
}