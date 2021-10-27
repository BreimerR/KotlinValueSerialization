package org.jetbrains.kotlinx.serialization.compiler.backend.ir;

import java.lang.System;

/**
 * Simple property descriptor with backing field without getters/setters for ir generation purposes
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/SimpleSyntheticPropertyDescriptor;", "Lorg/jetbrains/kotlin/descriptors/impl/PropertyDescriptorImpl;", "owner", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "name", "", "type", "Lorg/jetbrains/kotlin/types/KotlinType;", "isVar", "", "visibility", "Lorg/jetbrains/kotlin/descriptors/DescriptorVisibility;", "(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;Ljava/lang/String;Lorg/jetbrains/kotlin/types/KotlinType;ZLorg/jetbrains/kotlin/descriptors/DescriptorVisibility;)V", "_backingField", "Lorg/jetbrains/kotlin/descriptors/impl/FieldDescriptorImpl;", "kotlinx-serialization"})
public final class SimpleSyntheticPropertyDescriptor extends org.jetbrains.kotlin.descriptors.impl.PropertyDescriptorImpl {
    private final org.jetbrains.kotlin.descriptors.impl.FieldDescriptorImpl _backingField = null;
    
    public SimpleSyntheticPropertyDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor owner, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType type, boolean isVar, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.DescriptorVisibility visibility) {
        super(null, null, null, null, null, false, null, null, null, false, false, false, false, false, false);
    }
}