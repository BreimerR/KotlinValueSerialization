package org.jetbrains.kotlinx.serialization.compiler.backend.js;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a9\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2#\u0010\u000b\u001a\u001f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0\f\u00a2\u0006\u0002\b\u000fH\u0000\u001a*\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011*\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u001a-\u0010\u0018\u001a\u00020\u000e*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u001d\u00a2\u0006\u0002\b\u000fH\u0000\u001a%\u0010\u001e\u001a\u00020\u000e*\u00020\u00192\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u001d\u00a2\u0006\u0002\b\u000fH\u0000\u001a-\u0010\u001f\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\u001d\u00a2\u0006\u0002\b\u000fH\u0000\u001a9\u0010!\u001a\u00020\u000e*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u001d\u00a2\u0006\u0002\b\u000f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#H\u0000\u001a]\u0010$\u001a\u0004\u0018\u00010\u001b*\u00020%2\u0006\u0010&\u001a\u00020\b2\b\u0010\'\u001a\u0004\u0018\u00010\u00172\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\u001a\b\u0002\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u001b0.H\u0000\u00a2\u0006\u0002\u0010/\u001a\u0014\u00100\u001a\u00020\u001b*\u00020\b2\u0006\u00101\u001a\u00020\u0017H\u0000\u001a\u0016\u00102\u001a\u0004\u0018\u00010\u001b*\u0002032\u0006\u00104\u001a\u000205H\u0001\u001a\u0014\u00106\u001a\u00020\u001b*\u00020\b2\u0006\u00107\u001a\u00020\u0017H\u0000\u00a8\u00068"}, d2 = {"propNotSeenTest", "Lorg/jetbrains/kotlin/js/backend/ast/JsBinaryOperation;", "seenVar", "Lorg/jetbrains/kotlin/js/backend/ast/JsNameRef;", "index", "", "buildFunction", "Lorg/jetbrains/kotlin/js/backend/ast/JsFunction;", "Lorg/jetbrains/kotlin/js/translate/context/TranslationContext;", "descriptor", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "bodyGen", "Lkotlin/Function3;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/js/JsBlockBuilder;", "", "Lkotlin/ExtensionFunctionType;", "buildInitializersRemapping", "", "Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "Lorg/jetbrains/kotlin/psi/KtExpression;", "forClass", "Lorg/jetbrains/kotlin/psi/KtPureClassOrObject;", "superClass", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "case", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/js/JsCasesBuilder;", "condition", "Lorg/jetbrains/kotlin/js/backend/ast/JsExpression;", "body", "Lkotlin/Function1;", "default", "jsSwitch", "cases", "jsWhile", "label", "Lorg/jetbrains/kotlin/js/backend/ast/JsLabel;", "serializerInstance", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/AbstractSerialGenerator;", "context", "serializerClass", "module", "Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "kType", "Lorg/jetbrains/kotlin/types/KotlinType;", "genericIndex", "genericGetter", "Lkotlin/Function2;", "(Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/AbstractSerialGenerator;Lorg/jetbrains/kotlin/js/translate/context/TranslationContext;Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;Lorg/jetbrains/kotlin/types/KotlinType;Ljava/lang/Integer;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/js/backend/ast/JsExpression;", "serializerObjectGetter", "serializer", "serializerTower", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/js/SerializerJsTranslator;", "property", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;", "translateQualifiedReference", "clazz", "kotlinx-serialization"})
public final class JsCodegenUtilKt {
    
    public static final void jsWhile(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.js.JsBlockBuilder $this$jsWhile, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.backend.ast.JsExpression condition, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlinx.serialization.compiler.backend.js.JsBlockBuilder, kotlin.Unit> body, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.js.backend.ast.JsLabel label) {
    }
    
    public static final void jsSwitch(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.js.JsBlockBuilder $this$jsSwitch, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.backend.ast.JsExpression condition, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlinx.serialization.compiler.backend.js.JsCasesBuilder, kotlin.Unit> cases) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.js.backend.ast.JsFunction buildFunction(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.translate.context.TranslationContext $this$buildFunction, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor descriptor, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function3<? super org.jetbrains.kotlinx.serialization.compiler.backend.js.JsBlockBuilder, ? super org.jetbrains.kotlin.js.backend.ast.JsFunction, ? super org.jetbrains.kotlin.js.translate.context.TranslationContext, kotlin.Unit> bodyGen) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation propNotSeenTest(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.backend.ast.JsNameRef seenVar, int index) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.js.backend.ast.JsExpression serializerObjectGetter(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.translate.context.TranslationContext $this$serializerObjectGetter, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor serializer) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlin.js.backend.ast.JsExpression translateQualifiedReference(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.translate.context.TranslationContext $this$translateQualifiedReference, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor clazz) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
    public static final org.jetbrains.kotlin.js.backend.ast.JsExpression serializerTower(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.js.SerializerJsTranslator $this$serializerTower, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty property) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final org.jetbrains.kotlin.js.backend.ast.JsExpression serializerInstance(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator $this$serializerInstance, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.translate.context.TranslationContext context, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.descriptors.ClassDescriptor serializerClass, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType kType, @org.jetbrains.annotations.Nullable
    java.lang.Integer genericIndex, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super org.jetbrains.kotlin.types.KotlinType, ? extends org.jetbrains.kotlin.js.backend.ast.JsExpression> genericGetter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.Map<org.jetbrains.kotlin.descriptors.PropertyDescriptor, org.jetbrains.kotlin.psi.KtExpression> buildInitializersRemapping(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.translate.context.TranslationContext $this$buildInitializersRemapping, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.psi.KtPureClassOrObject forClass, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.descriptors.ClassDescriptor superClass) {
        return null;
    }
}