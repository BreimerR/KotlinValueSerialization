package org.jetbrains.kotlinx.serialization.compiler.backend.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 *\u00020\u00052\u0006\u0010\"\u001a\u00020#H\u0004R3\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00050\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006$"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/AbstractSerialGenerator;", "", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "currentDeclaration", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "(Lorg/jetbrains/kotlin/resolve/BindingContext;Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)V", "additionalSerializersInScopeOfCurrentFile", "", "Lkotlin/Pair;", "", "getAdditionalSerializersInScopeOfCurrentFile", "()Ljava/util/Map;", "additionalSerializersInScopeOfCurrentFile$delegate", "Lkotlin/Lazy;", "getBindingContext", "()Lorg/jetbrains/kotlin/resolve/BindingContext;", "contextualKClassListInCurrentFile", "", "Lorg/jetbrains/kotlin/types/KotlinType;", "getContextualKClassListInCurrentFile", "()Ljava/util/Set;", "contextualKClassListInCurrentFile$delegate", "getCurrentDeclaration", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "getKClassListFromFileAnnotation", "", "annotationFqName", "Lorg/jetbrains/kotlin/name/FqName;", "declarationInFile", "Lorg/jetbrains/kotlin/descriptors/DeclarationDescriptor;", "getFuncDesc", "Lkotlin/sequences/Sequence;", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "funcName", "", "kotlinx-serialization"})
public abstract class AbstractSerialGenerator {
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.resolve.BindingContext bindingContext = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.descriptors.ClassDescriptor currentDeclaration = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy contextualKClassListInCurrentFile$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy additionalSerializersInScopeOfCurrentFile$delegate = null;
    
    public AbstractSerialGenerator(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext bindingContext, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor currentDeclaration) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.resolve.BindingContext getBindingContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.descriptors.ClassDescriptor getCurrentDeclaration() {
        return null;
    }
    
    private final java.util.List<org.jetbrains.kotlin.types.KotlinType> getKClassListFromFileAnnotation(org.jetbrains.kotlin.name.FqName annotationFqName, org.jetbrains.kotlin.descriptors.DeclarationDescriptor declarationInFile) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Set<org.jetbrains.kotlin.types.KotlinType> getContextualKClassListInCurrentFile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<kotlin.Pair<org.jetbrains.kotlin.descriptors.ClassDescriptor, java.lang.Boolean>, org.jetbrains.kotlin.descriptors.ClassDescriptor> getAdditionalSerializersInScopeOfCurrentFile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final kotlin.sequences.Sequence<org.jetbrains.kotlin.descriptors.FunctionDescriptor> getFuncDesc(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$getFuncDesc, @org.jetbrains.annotations.NotNull
    java.lang.String funcName) {
        return null;
    }
}