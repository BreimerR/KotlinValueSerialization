package org.jetbrains.kotlinx.serialization.compiler.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\n"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationComponentRegistrar;", "Lorg/jetbrains/kotlin/compiler/plugin/ComponentRegistrar;", "()V", "registerProjectComponents", "", "project", "Lorg/jetbrains/kotlin/com/intellij/mock/MockProject;", "configuration", "Lorg/jetbrains/kotlin/config/CompilerConfiguration;", "Companion", "kotlinx-serialization"})
@org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
public final class SerializationComponentRegistrar implements org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar {
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationComponentRegistrar.Companion Companion = null;
    
    public SerializationComponentRegistrar() {
        super();
    }
    
    @java.lang.Override
    public void registerProjectComponents(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.com.intellij.mock.MockProject project, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.config.CompilerConfiguration configuration) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\u0004H\u0002\u00a8\u0006\b"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationComponentRegistrar$Companion;", "", "()V", "registerExtensions", "", "project", "Lorg/jetbrains/kotlin/com/intellij/openapi/project/Project;", "registerProtoExtensions", "kotlinx-serialization"})
    @org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void registerExtensions(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.com.intellij.openapi.project.Project project) {
        }
        
        private final void registerProtoExtensions() {
        }
    }
}