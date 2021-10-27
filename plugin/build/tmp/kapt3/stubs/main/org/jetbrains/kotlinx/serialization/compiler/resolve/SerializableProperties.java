package org.jetbrains.kotlinx.serialization.compiler.resolve;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010(\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u001dH\u0086\u0002J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150#H\u0086\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006$"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperties;", "", "serializableClass", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;Lorg/jetbrains/kotlin/resolve/BindingContext;)V", "getBindingContext", "()Lorg/jetbrains/kotlin/resolve/BindingContext;", "isExternallySerializable", "", "()Z", "primaryConstructorParameters", "", "Lorg/jetbrains/kotlin/descriptors/ValueParameterDescriptor;", "primaryConstructorProperties", "", "Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "primaryConstructorWithDefaults", "getPrimaryConstructorWithDefaults", "serializableConstructorProperties", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;", "getSerializableConstructorProperties", "()Ljava/util/List;", "serializableProperties", "getSerializableProperties", "serializableStandaloneProperties", "getSerializableStandaloneProperties", "size", "", "getSize", "()I", "get", "index", "iterator", "", "kotlinx-serialization"})
public final class SerializableProperties {
    private final org.jetbrains.kotlin.descriptors.ClassDescriptor serializableClass = null;
    @org.jetbrains.annotations.NotNull
    private final org.jetbrains.kotlin.resolve.BindingContext bindingContext = null;
    private final java.util.List<org.jetbrains.kotlin.descriptors.ValueParameterDescriptor> primaryConstructorParameters = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> serializableProperties = null;
    private final boolean isExternallySerializable = false;
    private final java.util.Map<org.jetbrains.kotlin.descriptors.PropertyDescriptor, java.lang.Boolean> primaryConstructorProperties = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> serializableConstructorProperties = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> serializableStandaloneProperties = null;
    private final int size = 0;
    private final boolean primaryConstructorWithDefaults = false;
    
    public SerializableProperties(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor serializableClass, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext bindingContext) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.resolve.BindingContext getBindingContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> getSerializableProperties() {
        return null;
    }
    
    public final boolean isExternallySerializable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> getSerializableConstructorProperties() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> getSerializableStandaloneProperties() {
        return null;
    }
    
    public final int getSize() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty get(int index) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Iterator<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> iterator() {
        return null;
    }
    
    public final boolean getPrimaryConstructorWithDefaults() {
        return false;
    }
}