package org.jetbrains.kotlinx.serialization.compiler.backend.js;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 82\u00020\u0001:\u00018B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0014J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0014H\u0014J:\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00142#\u0010\u0019\u001a\u001f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\u001a\u00a2\u0006\u0002\b\u001dH\u0000\u00a2\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!H\u0014J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0014H\u0014J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0014H\u0014J\b\u0010$\u001a\u00020\u0010H\u0014J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\'H\u0014J\u0010\u0010(\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0014H\u0014J \u0010)\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u0003H\u0014J \u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0012H\u0004J\u001c\u00103\u001a\u000204*\u00020\u00072\u0006\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u000207H\u0004R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u00069"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/js/SerializerJsTranslator;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/SerializerCodegen;", "descriptor", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "translator", "Lorg/jetbrains/kotlin/js/translate/declaration/DeclarationBodyVisitor;", "context", "Lorg/jetbrains/kotlin/js/translate/context/TranslationContext;", "metadataPlugin", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;Lorg/jetbrains/kotlin/js/translate/declaration/DeclarationBodyVisitor;Lorg/jetbrains/kotlin/js/translate/context/TranslationContext;Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;)V", "getContext", "()Lorg/jetbrains/kotlin/js/translate/context/TranslationContext;", "getTranslator", "()Lorg/jetbrains/kotlin/js/translate/declaration/DeclarationBodyVisitor;", "addElementsContentToDescriptor", "", "serialDescriptorInThis", "Lorg/jetbrains/kotlin/js/backend/ast/JsNameRef;", "addElementFunction", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "pushAnnotationFunction", "generateChildSerializersGetter", "function", "generateFunction", "bodyGen", "Lkotlin/Function3;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/js/JsBlockBuilder;", "Lorg/jetbrains/kotlin/js/backend/ast/JsFunction;", "Lkotlin/ExtensionFunctionType;", "generateFunction$kotlinx_serialization", "generateGenericFieldsAndConstructor", "typedConstructorDescriptor", "Lorg/jetbrains/kotlin/descriptors/ClassConstructorDescriptor;", "generateLoad", "generateSave", "generateSerialDesc", "generateSerializableClassProperty", "property", "Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "generateTypeParamsSerializersGetter", "instantiateNewDescriptor", "Lorg/jetbrains/kotlin/js/backend/ast/JsExpression;", "correctThis", "baseSerialDescImplClass", "pushAnnotationsInto", "annotated", "Lorg/jetbrains/kotlin/descriptors/annotations/Annotated;", "pushFunction", "Lorg/jetbrains/kotlin/descriptors/DeclarationDescriptor;", "intoRef", "referenceMethod", "Lorg/jetbrains/kotlin/js/backend/ast/JsName;", "clazz", "name", "", "Companion", "kotlinx-serialization"})
@org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
public class SerializerJsTranslator extends org.jetbrains.kotlinx.serialization.compiler.backend.common.SerializerCodegen {
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.js.translate.declaration.DeclarationBodyVisitor translator = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.js.translate.context.TranslationContext context = null;
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlinx.serialization.compiler.backend.js.SerializerJsTranslator.Companion Companion = null;
    
    public SerializerJsTranslator(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor descriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.translate.declaration.DeclarationBodyVisitor translator, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.translate.context.TranslationContext context, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin metadataPlugin) {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.js.translate.declaration.DeclarationBodyVisitor getTranslator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.js.translate.context.TranslationContext getContext() {
        return null;
    }
    
    public final void generateFunction$kotlinx_serialization(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor descriptor, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function3<? super org.jetbrains.kotlinx.serialization.compiler.backend.js.JsBlockBuilder, ? super org.jetbrains.kotlin.js.backend.ast.JsFunction, ? super org.jetbrains.kotlin.js.translate.context.TranslationContext, kotlin.Unit> bodyGen) {
    }
    
    @java.lang.Override
    protected void generateSerialDesc() {
    }
    
    @org.jetbrains.annotations.NotNull
    protected org.jetbrains.kotlin.js.backend.ast.JsExpression instantiateNewDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.translate.context.TranslationContext context, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.backend.ast.JsExpression correctThis, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor baseSerialDescImplClass) {
        return null;
    }
    
    protected void addElementsContentToDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.translate.context.TranslationContext context, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.backend.ast.JsNameRef serialDescriptorInThis, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor addElementFunction, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor pushAnnotationFunction) {
    }
    
    protected final void pushAnnotationsInto(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.annotations.Annotated annotated, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.DeclarationDescriptor pushFunction, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.backend.ast.JsNameRef intoRef) {
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
    protected void generateGenericFieldsAndConstructor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor typedConstructorDescriptor) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final org.jetbrains.kotlin.js.backend.ast.JsName referenceMethod(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.translate.context.TranslationContext $this$referenceMethod, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor clazz, @org.jetbrains.annotations.NotNull
    java.lang.String name) {
        return null;
    }
    
    @java.lang.Override
    protected void generateSave(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function) {
    }
    
    @java.lang.Override
    protected void generateLoad(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor function) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a8\u0006\r"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/js/SerializerJsTranslator$Companion;", "", "()V", "translate", "", "descriptor", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "translator", "Lorg/jetbrains/kotlin/js/translate/declaration/DeclarationBodyVisitor;", "context", "Lorg/jetbrains/kotlin/js/translate/context/TranslationContext;", "metadataPlugin", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "kotlinx-serialization"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void translate(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.ClassDescriptor descriptor, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.js.translate.declaration.DeclarationBodyVisitor translator, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.js.translate.context.TranslationContext context, @org.jetbrains.annotations.Nullable
        org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin metadataPlugin) {
        }
    }
}