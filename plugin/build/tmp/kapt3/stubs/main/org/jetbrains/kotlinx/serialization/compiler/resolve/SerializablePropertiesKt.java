package org.jetbrains.kotlinx.serialization.compiler.resolve;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0000\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H\u0002\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\f0\u0006H\u0000\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a \u0010\u0014\u001a\u00020\u0002*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0019"}, d2 = {"goldenMask", "", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperties;", "getGoldenMask", "(Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperties;)I", "goldenMaskList", "", "getGoldenMaskList", "(Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperties;)Ljava/util/List;", "bitMaskSlotAt", "propertyIndex", "unsort", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;", "descriptor", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "props", "bitMaskSlotCount", "declaresDefaultValue", "", "Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "serializablePropertiesFor", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "classDescriptor", "serializationDescriptorSerializer", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "kotlinx-serialization"})
public final class SerializablePropertiesKt {
    
    public static final boolean declaresDefaultValue(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.PropertyDescriptor $this$declaresDefaultValue) {
        return false;
    }
    
    public static final int getGoldenMask(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperties $this$goldenMask) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<java.lang.Integer> getGoldenMaskList(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperties $this$goldenMaskList) {
        return null;
    }
    
    public static final int bitMaskSlotCount(@org.jetbrains.annotations.NotNull
    java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> $this$bitMaskSlotCount) {
        return 0;
    }
    
    public static final int bitMaskSlotAt(int propertyIndex) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperties serializablePropertiesFor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext $this$serializablePropertiesFor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor classDescriptor, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationDescriptorSerializerPlugin serializationDescriptorSerializer) {
        return null;
    }
    
    private static final java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> unsort(org.jetbrains.kotlin.descriptors.ClassDescriptor descriptor, java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> props) {
        return null;
    }
}