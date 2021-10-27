package org.jetbrains.kotlinx.serialization.compiler.backend.ir;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010 \u001a\u00020\u0004H\u0002J\u0014\u0010!\u001a\u00020\u0017*\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0004H\u0002J*\u0010#\u001a\u00020$*\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&2\u0006\u0010(\u001a\u00020$H\u0002J\u001c\u0010)\u001a\u00020**\u00020\u001f2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\f\u0010/\u001a\u00020**\u00020\u001fH\u0002J\u001c\u00100\u001a\u00020**\u00020\u001f2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u001eH\u0002J\f\u00101\u001a\u00020**\u00020\u001fH\u0002J\f\u00102\u001a\u00020\u0014*\u00020\u0004H\u0002J\u0014\u00103\u001a\u00020\u0017*\u0002042\u0006\u0010\"\u001a\u00020\u0004H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\u00020\u0014*\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015\u00a8\u00066"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/SerializableIrGenerator;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/SerializableCodegen;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/IrBuilderExtension;", "irClass", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "compilerContext", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationPluginContext;", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "(Lorg/jetbrains/kotlin/ir/declarations/IrClass;Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationPluginContext;Lorg/jetbrains/kotlin/resolve/BindingContext;)V", "addElementFun", "Lorg/jetbrains/kotlin/ir/symbols/IrFunctionSymbol;", "getCompilerContext", "()Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationPluginContext;", "getIrClass", "()Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "serialDescClass", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "serialDescImplClass", "isInternalSerializable", "", "(Lorg/jetbrains/kotlin/ir/declarations/IrClass;)Z", "generateInternalConstructor", "", "constructorDescriptor", "Lorg/jetbrains/kotlin/descriptors/ClassConstructorDescriptor;", "generateWriteSelfMethod", "methodDescriptor", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "createCachedDescriptorProperty", "Lorg/jetbrains/kotlin/ir/declarations/IrProperty;", "Lorg/jetbrains/kotlin/ir/builders/IrBlockBodyBuilder;", "companionObject", "generateSuperNonSerializableCall", "superClass", "generateSuperSerializableCall", "", "allValueParameters", "", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "propertiesStart", "getAddElementToDescriptorExpr", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "property", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;", "serialDescVar", "Lorg/jetbrains/kotlin/ir/declarations/IrVariable;", "getInstantiateDescriptorExpr", "getParametrizedSerialDescriptorExpr", "getStaticSerialDescriptorExpr", "hasSerializableAnnotationWithoutArgs", "insertTypeArgumentsForSuperClass", "Lorg/jetbrains/kotlin/ir/expressions/impl/IrDelegatingConstructorCallImpl;", "Companion", "kotlinx-serialization"})
@org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
public final class SerializableIrGenerator extends org.jetbrains.kotlinx.serialization.compiler.backend.common.SerializableCodegen implements org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension {
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.ir.declarations.IrClass irClass = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationPluginContext compilerContext = null;
    private final org.jetbrains.kotlin.descriptors.ClassDescriptor serialDescClass = null;
    private final org.jetbrains.kotlin.descriptors.ClassDescriptor serialDescImplClass = null;
    private final org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol addElementFun = null;
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlinx.serialization.compiler.backend.ir.SerializableIrGenerator.Companion Companion = null;
    
    public SerializableIrGenerator(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass irClass, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationPluginContext compilerContext, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext bindingContext) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.ir.declarations.IrClass getIrClass() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationPluginContext getCompilerContext() {
        return null;
    }
    
    private final boolean hasSerializableAnnotationWithoutArgs(org.jetbrains.kotlin.ir.declarations.IrClass $this$hasSerializableAnnotationWithoutArgs) {
        return false;
    }
    
    private final boolean isInternalSerializable(org.jetbrains.kotlin.ir.declarations.IrClass $this$isInternalSerializable) {
        return false;
    }
    
    @java.lang.Override
    protected void generateInternalConstructor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor constructorDescriptor) {
    }
    
    private final org.jetbrains.kotlin.ir.expressions.IrExpression getStaticSerialDescriptorExpr(org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$getStaticSerialDescriptorExpr) {
        return null;
    }
    
    private final org.jetbrains.kotlin.ir.expressions.IrExpression getParametrizedSerialDescriptorExpr(org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$getParametrizedSerialDescriptorExpr, org.jetbrains.kotlin.ir.declarations.IrClass companionObject, org.jetbrains.kotlin.ir.declarations.IrProperty property) {
        return null;
    }
    
    private final org.jetbrains.kotlin.ir.declarations.IrProperty createCachedDescriptorProperty(org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$createCachedDescriptorProperty, org.jetbrains.kotlin.ir.declarations.IrClass companionObject) {
        return null;
    }
    
    private final org.jetbrains.kotlin.ir.expressions.IrExpression getInstantiateDescriptorExpr(org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$getInstantiateDescriptorExpr) {
        return null;
    }
    
    private final org.jetbrains.kotlin.ir.expressions.IrExpression getAddElementToDescriptorExpr(org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$getAddElementToDescriptorExpr, org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty property, org.jetbrains.kotlin.ir.declarations.IrVariable serialDescVar) {
        return null;
    }
    
    private final void generateSuperNonSerializableCall(org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$generateSuperNonSerializableCall, org.jetbrains.kotlin.ir.declarations.IrClass superClass) {
    }
    
    private final void insertTypeArgumentsForSuperClass(org.jetbrains.kotlin.ir.expressions.impl.IrDelegatingConstructorCallImpl $this$insertTypeArgumentsForSuperClass, org.jetbrains.kotlin.ir.declarations.IrClass superClass) {
    }
    
    private final int generateSuperSerializableCall(org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$generateSuperSerializableCall, org.jetbrains.kotlin.ir.declarations.IrClass superClass, java.util.List<? extends org.jetbrains.kotlin.ir.declarations.IrValueParameter> allValueParameters, int propertiesStart) {
        return 0;
    }
    
    @java.lang.Override
    protected void generateWriteSelfMethod(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor methodDescriptor) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/SerializableIrGenerator$Companion;", "", "()V", "generate", "", "irClass", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "context", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationPluginContext;", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "kotlinx-serialization"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void generate(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass irClass, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationPluginContext context, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.resolve.BindingContext bindingContext) {
        }
    }
}