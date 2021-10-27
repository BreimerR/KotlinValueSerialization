package org.jetbrains.kotlinx.serialization.compiler.backend.js;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 $2\u00020\u0001:\u0001$B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\u001c\u0010\u001a\u001a\u00020\u0014*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J2\u0010\u001f\u001a\u00020 *\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\"2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020 H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/js/SerializableJsTranslator;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/SerializableCodegen;", "declaration", "Lorg/jetbrains/kotlin/psi/KtPureClassOrObject;", "descriptor", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "context", "Lorg/jetbrains/kotlin/js/translate/context/TranslationContext;", "(Lorg/jetbrains/kotlin/psi/KtPureClassOrObject;Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;Lorg/jetbrains/kotlin/js/translate/context/TranslationContext;)V", "getContext", "()Lorg/jetbrains/kotlin/js/translate/context/TranslationContext;", "getDeclaration", "()Lorg/jetbrains/kotlin/psi/KtPureClassOrObject;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "initMap", "", "Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "Lorg/jetbrains/kotlin/psi/KtExpression;", "generateInternalConstructor", "", "constructorDescriptor", "Lorg/jetbrains/kotlin/descriptors/ClassConstructorDescriptor;", "generateWriteSelfMethod", "methodDescriptor", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "generateSuperNonSerializableCall", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/js/JsBlockBuilder;", "superClass", "thisParameter", "Lorg/jetbrains/kotlin/js/backend/ast/JsExpression;", "generateSuperSerializableCall", "", "parameters", "", "propertiesStart", "Companion", "kotlinx-serialization"})
public final class SerializableJsTranslator extends org.jetbrains.kotlinx.serialization.compiler.backend.common.SerializableCodegen {
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.psi.KtPureClassOrObject declaration = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.descriptors.ClassDescriptor descriptor = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.js.translate.context.TranslationContext context = null;
    private final java.util.Map<org.jetbrains.kotlin.descriptors.PropertyDescriptor, org.jetbrains.kotlin.psi.KtExpression> initMap = null;
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlinx.serialization.compiler.backend.js.SerializableJsTranslator.Companion Companion = null;
    
    public SerializableJsTranslator(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.psi.KtPureClassOrObject declaration, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor descriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.translate.context.TranslationContext context) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.psi.KtPureClassOrObject getDeclaration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.descriptors.ClassDescriptor getDescriptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.js.translate.context.TranslationContext getContext() {
        return null;
    }
    
    @java.lang.Override
    protected void generateInternalConstructor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor constructorDescriptor) {
    }
    
    private final void generateSuperNonSerializableCall(org.jetbrains.kotlinx.serialization.compiler.backend.js.JsBlockBuilder $this$generateSuperNonSerializableCall, org.jetbrains.kotlin.descriptors.ClassDescriptor superClass, org.jetbrains.kotlin.js.backend.ast.JsExpression thisParameter) {
    }
    
    private final int generateSuperSerializableCall(org.jetbrains.kotlinx.serialization.compiler.backend.js.JsBlockBuilder $this$generateSuperSerializableCall, org.jetbrains.kotlin.descriptors.ClassDescriptor superClass, java.util.List<? extends org.jetbrains.kotlin.js.backend.ast.JsExpression> parameters, org.jetbrains.kotlin.js.backend.ast.JsExpression thisParameter, int propertiesStart) {
        return 0;
    }
    
    @java.lang.Override
    protected void generateWriteSelfMethod(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor methodDescriptor) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/js/SerializableJsTranslator$Companion;", "", "()V", "translate", "", "declaration", "Lorg/jetbrains/kotlin/psi/KtPureClassOrObject;", "serializableClass", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "context", "Lorg/jetbrains/kotlin/js/translate/context/TranslationContext;", "kotlinx-serialization"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void translate(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.psi.KtPureClassOrObject declaration, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.ClassDescriptor serializableClass, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.js.translate.context.TranslationContext context) {
        }
    }
}