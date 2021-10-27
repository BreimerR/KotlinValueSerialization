package org.jetbrains.kotlinx.serialization.compiler.resolve;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006\u00a8\u0006\u001f"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializationAnnotations;", "", "()V", "additionalSerializersFqName", "Lorg/jetbrains/kotlin/name/FqName;", "getAdditionalSerializersFqName$kotlinx_serialization", "()Lorg/jetbrains/kotlin/name/FqName;", "contextualFqName", "getContextualFqName$kotlinx_serialization", "contextualOnFileFqName", "getContextualOnFileFqName$kotlinx_serialization", "contextualOnPropertyFqName", "getContextualOnPropertyFqName$kotlinx_serialization", "encodeDefaultFqName", "getEncodeDefaultFqName$kotlinx_serialization", "inheritableSerialInfoFqName", "getInheritableSerialInfoFqName$kotlinx_serialization", "polymorphicFqName", "getPolymorphicFqName$kotlinx_serialization", "requiredAnnotationFqName", "getRequiredAnnotationFqName$kotlinx_serialization", "serialInfoFqName", "getSerialInfoFqName$kotlinx_serialization", "serialNameAnnotationFqName", "getSerialNameAnnotationFqName$kotlinx_serialization", "serialTransientFqName", "getSerialTransientFqName", "serializableAnnotationFqName", "getSerializableAnnotationFqName", "serializerAnnotationFqName", "getSerializerAnnotationFqName", "kotlinx-serialization"})
public final class SerializationAnnotations {
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlinx.serialization.compiler.resolve.SerializationAnnotations INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.FqName serializableAnnotationFqName = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.FqName serializerAnnotationFqName = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.FqName serialNameAnnotationFqName = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.FqName requiredAnnotationFqName = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.FqName serialTransientFqName = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.FqName serialInfoFqName = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.FqName inheritableSerialInfoFqName = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.FqName encodeDefaultFqName = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.FqName contextualFqName = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.FqName contextualOnFileFqName = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.FqName contextualOnPropertyFqName = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.FqName polymorphicFqName = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.name.FqName additionalSerializersFqName = null;
    
    private SerializationAnnotations() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.FqName getSerializableAnnotationFqName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.FqName getSerializerAnnotationFqName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.FqName getSerialNameAnnotationFqName$kotlinx_serialization() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.FqName getRequiredAnnotationFqName$kotlinx_serialization() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.FqName getSerialTransientFqName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.FqName getSerialInfoFqName$kotlinx_serialization() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.FqName getInheritableSerialInfoFqName$kotlinx_serialization() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.FqName getEncodeDefaultFqName$kotlinx_serialization() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.FqName getContextualFqName$kotlinx_serialization() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.FqName getContextualOnFileFqName$kotlinx_serialization() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.FqName getContextualOnPropertyFqName$kotlinx_serialization() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.FqName getPolymorphicFqName$kotlinx_serialization() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.name.FqName getAdditionalSerializersFqName$kotlinx_serialization() {
        return null;
    }
}