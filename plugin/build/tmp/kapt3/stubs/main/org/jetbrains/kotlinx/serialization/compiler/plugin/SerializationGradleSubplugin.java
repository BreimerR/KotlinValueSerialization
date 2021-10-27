package org.jetbrains.kotlinx.serialization.compiler.plugin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0004JL\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016J \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00132\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0014\u0010\u0018\u001a\u00020\u00192\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016\u00a8\u0006\u001c"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/plugin/SerializationGradleSubplugin;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilerPluginSupportPlugin;", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinGradleSubplugin;", "Lorg/gradle/api/tasks/compile/AbstractCompile;", "()V", "apply", "", "Lorg/jetbrains/kotlin/gradle/plugin/SubpluginOption;", "project", "Lorg/gradle/api/Project;", "kotlinCompile", "javaCompile", "variantData", "", "androidProjectHandler", "kotlinCompilation", "Lorg/jetbrains/kotlin/gradle/plugin/KotlinCompilation;", "Lorg/jetbrains/kotlin/gradle/dsl/KotlinCommonOptions;", "applyToCompilation", "Lorg/gradle/api/provider/Provider;", "getCompilerPluginId", "", "getPluginArtifact", "Lorg/jetbrains/kotlin/gradle/plugin/SubpluginArtifact;", "isApplicable", "", "task", "Companion", "kotlinx-serialization"})
public final class SerializationGradleSubplugin implements org.jetbrains.kotlin.gradle.plugin.KotlinCompilerPluginSupportPlugin, org.jetbrains.kotlin.gradle.plugin.KotlinGradleSubplugin<org.gradle.api.tasks.compile.AbstractCompile> {
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlinx.serialization.compiler.plugin.SerializationGradleSubplugin.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SERIALIZATION_GROUP_NAME = "libetal.kotlinx.serialization";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SERIALIZATION_ARTIFACT_NAME = "kotlinx-serialization";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SERIALIZATION_ARTIFACT_UNSHADED_NAME = "kotlin-value-serialization-unshaded";
    
    public SerializationGradleSubplugin() {
        super();
    }
    
    @java.lang.Override
    public boolean isApplicable(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.gradle.plugin.KotlinCompilation<?> kotlinCompilation) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.gradle.api.provider.Provider<java.util.List<org.jetbrains.kotlin.gradle.plugin.SubpluginOption>> applyToCompilation(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.gradle.plugin.KotlinCompilation<?> kotlinCompilation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact getPluginArtifact() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getCompilerPluginId() {
        return null;
    }
    
    @java.lang.Override
    public boolean isApplicable(@org.jetbrains.annotations.NotNull
    org.gradle.api.Project project, @org.jetbrains.annotations.NotNull
    org.gradle.api.tasks.compile.AbstractCompile task) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<org.jetbrains.kotlin.gradle.plugin.SubpluginOption> apply(@org.jetbrains.annotations.NotNull
    org.gradle.api.Project project, @org.jetbrains.annotations.NotNull
    org.gradle.api.tasks.compile.AbstractCompile kotlinCompile, @org.jetbrains.annotations.Nullable
    org.gradle.api.tasks.compile.AbstractCompile javaCompile, @org.jetbrains.annotations.Nullable
    java.lang.Object variantData, @org.jetbrains.annotations.Nullable
    java.lang.Object androidProjectHandler, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.gradle.plugin.KotlinCompilation<? extends org.jetbrains.kotlin.gradle.dsl.KotlinCommonOptions> kotlinCompilation) {
        return null;
    }
    
    @java.lang.Override
    public void apply(@org.jetbrains.annotations.NotNull
    org.gradle.api.Project target) {
    }
    
    @org.jetbrains.annotations.Nullable
    public org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact getNativeCompilerPluginArtifact() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public org.jetbrains.kotlin.gradle.plugin.SubpluginArtifact getPluginArtifactForNative() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.util.List<org.gradle.api.tasks.compile.AbstractCompile> getSubpluginKotlinTasks(@org.jetbrains.annotations.NotNull
    org.gradle.api.Project project, @org.jetbrains.annotations.NotNull
    org.gradle.api.tasks.compile.AbstractCompile kotlinCompile) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/plugin/SerializationGradleSubplugin$Companion;", "", "()V", "SERIALIZATION_ARTIFACT_NAME", "", "SERIALIZATION_ARTIFACT_UNSHADED_NAME", "SERIALIZATION_GROUP_NAME", "kotlinx-serialization"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}