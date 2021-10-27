package org.jetbrains.kotlinx.serialization.compiler.backend.js;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000eH\u0014J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000eH\u0014J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0003H\u0014\u00a8\u0006\u0017"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/js/SerializerForEnumsTranslator;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/js/SerializerJsTranslator;", "descriptor", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "translator", "Lorg/jetbrains/kotlin/js/translate/declaration/DeclarationBodyVisitor;", "context", "Lorg/jetbrains/kotlin/js/translate/context/TranslationContext;", "(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;Lorg/jetbrains/kotlin/js/translate/declaration/DeclarationBodyVisitor;Lorg/jetbrains/kotlin/js/translate/context/TranslationContext;)V", "addElementsContentToDescriptor", "", "serialDescriptorInThis", "Lorg/jetbrains/kotlin/js/backend/ast/JsNameRef;", "addElementFunction", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "pushAnnotationFunction", "generateLoad", "function", "generateSave", "instantiateNewDescriptor", "Lorg/jetbrains/kotlin/js/backend/ast/JsExpression;", "correctThis", "baseSerialDescImplClass", "kotlinx-serialization"})
@org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
public final class SerializerForEnumsTranslator extends org.jetbrains.kotlinx.serialization.compiler.backend.js.SerializerJsTranslator {
    
    public SerializerForEnumsTranslator(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor descriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.translate.declaration.DeclarationBodyVisitor translator, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.translate.context.TranslationContext context) {
        super(null, null, null, null);
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
    protected org.jetbrains.kotlin.js.backend.ast.JsExpression instantiateNewDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.translate.context.TranslationContext context, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.backend.ast.JsExpression correctThis, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor baseSerialDescImplClass) {
        return null;
    }
    
    @java.lang.Override
    protected void addElementsContentToDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.translate.context.TranslationContext context, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.backend.ast.JsNameRef serialDescriptorInThis, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor addElementFunction, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor pushAnnotationFunction) {
    }
}