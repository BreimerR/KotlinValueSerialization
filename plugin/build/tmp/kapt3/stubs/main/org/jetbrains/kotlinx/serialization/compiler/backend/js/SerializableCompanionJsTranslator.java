package org.jetbrains.kotlinx.serialization.compiler.backend.js;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/js/SerializableCompanionJsTranslator;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/SerializableCompanionCodegen;", "declaration", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "translator", "Lorg/jetbrains/kotlin/js/translate/declaration/DeclarationBodyVisitor;", "context", "Lorg/jetbrains/kotlin/js/translate/context/TranslationContext;", "(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;Lorg/jetbrains/kotlin/js/translate/declaration/DeclarationBodyVisitor;Lorg/jetbrains/kotlin/js/translate/context/TranslationContext;)V", "getContext", "()Lorg/jetbrains/kotlin/js/translate/context/TranslationContext;", "getTranslator", "()Lorg/jetbrains/kotlin/js/translate/declaration/DeclarationBodyVisitor;", "generateSerializerGetter", "", "methodDescriptor", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "Companion", "kotlinx-serialization"})
public final class SerializableCompanionJsTranslator extends org.jetbrains.kotlinx.serialization.compiler.backend.common.SerializableCompanionCodegen {
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.js.translate.declaration.DeclarationBodyVisitor translator = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.js.translate.context.TranslationContext context = null;
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlinx.serialization.compiler.backend.js.SerializableCompanionJsTranslator.Companion Companion = null;
    
    public SerializableCompanionJsTranslator(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor declaration, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.translate.declaration.DeclarationBodyVisitor translator, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.js.translate.context.TranslationContext context) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.js.translate.declaration.DeclarationBodyVisitor getTranslator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.js.translate.context.TranslationContext getContext() {
        return null;
    }
    
    @java.lang.Override
    protected void generateSerializerGetter(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor methodDescriptor) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/js/SerializableCompanionJsTranslator$Companion;", "", "()V", "translate", "", "descriptor", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "translator", "Lorg/jetbrains/kotlin/js/translate/declaration/DeclarationBodyVisitor;", "context", "Lorg/jetbrains/kotlin/js/translate/context/TranslationContext;", "kotlinx-serialization"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void translate(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.ClassDescriptor descriptor, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.js.translate.declaration.DeclarationBodyVisitor translator, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.js.translate.context.TranslationContext context) {
        }
    }
}