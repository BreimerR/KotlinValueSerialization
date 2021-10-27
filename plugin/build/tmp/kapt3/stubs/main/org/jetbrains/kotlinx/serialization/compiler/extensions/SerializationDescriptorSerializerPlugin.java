package org.jetbrains.kotlinx.serialization.compiler.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001d\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u0018R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\u00020\b*\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationDescriptorSerializerPlugin;", "Lorg/jetbrains/kotlin/serialization/DescriptorSerializerPlugin;", "()V", "descriptorMetadataMap", "", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperties;", "needSaveProgramOrder", "", "getNeedSaveProgramOrder", "(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Z", "afterClass", "", "descriptor", "proto", "Lorg/jetbrains/kotlin/metadata/ProtoBuf$Class$Builder;", "versionRequirementTable", "Lorg/jetbrains/kotlin/metadata/serialization/MutableVersionRequirementTable;", "childSerializer", "Lorg/jetbrains/kotlin/serialization/DescriptorSerializer;", "extension", "Lorg/jetbrains/kotlin/serialization/SerializerExtension;", "putIfNeeded", "properties", "putIfNeeded$kotlinx_serialization", "kotlinx-serialization"})
public final class SerializationDescriptorSerializerPlugin implements org.jetbrains.kotlin.serialization.DescriptorSerializerPlugin {
    private final java.util.Map<org.jetbrains.kotlin.descriptors.ClassDescriptor, org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperties> descriptorMetadataMap = null;
    
    public SerializationDescriptorSerializerPlugin() {
        super();
    }
    
    private final boolean getNeedSaveProgramOrder(org.jetbrains.kotlin.descriptors.ClassDescriptor $this$needSaveProgramOrder) {
        return false;
    }
    
    public final void putIfNeeded$kotlinx_serialization(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor descriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperties properties) {
    }
    
    @java.lang.Override
    public void afterClass(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor descriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.metadata.ProtoBuf.Class.Builder proto, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.metadata.serialization.MutableVersionRequirementTable versionRequirementTable, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.serialization.DescriptorSerializer childSerializer, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.serialization.SerializerExtension extension) {
    }
}