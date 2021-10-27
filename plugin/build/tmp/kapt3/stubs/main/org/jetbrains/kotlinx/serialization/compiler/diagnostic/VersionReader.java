package org.jetbrains.kotlinx.serialization.compiler.diagnostic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\rJ\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0006X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b\u00a8\u0006\u001f"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/diagnostic/VersionReader;", "", "()V", "CLASS_SUFFIX", "", "MINIMAL_SUPPORTED_VERSION", "Lorg/jetbrains/kotlin/config/ApiVersion;", "getMINIMAL_SUPPORTED_VERSION", "()Lorg/jetbrains/kotlin/config/ApiVersion;", "REQUIRE_KOTLIN_VERSION", "Ljava/util/jar/Attributes$Name;", "VERSIONS_SLICE", "Lorg/jetbrains/kotlin/util/slicedMap/WritableSlice;", "Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "Lorg/jetbrains/kotlinx/serialization/compiler/diagnostic/VersionReader$RuntimeVersions;", "minVersionForInlineClasses", "getMinVersionForInlineClasses$kotlinx_serialization", "canSupportInlineClasses", "", "module", "trace", "Lorg/jetbrains/kotlin/resolve/BindingTrace;", "getVersionsForCurrentModule", "getVersionsForCurrentModuleFromContext", "context", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "getVersionsForCurrentModuleFromTrace", "getVersionsFromManifest", "runtimeLibraryPath", "Ljava/io/File;", "RuntimeVersions", "kotlinx-serialization"})
public final class VersionReader {
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlinx.serialization.compiler.diagnostic.VersionReader INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.config.ApiVersion MINIMAL_SUPPORTED_VERSION = null;
    private static final java.util.jar.Attributes.Name REQUIRE_KOTLIN_VERSION = null;
    private static final java.lang.String CLASS_SUFFIX = "!/kotlinx/serialization/KSerializer.class";
    private static final org.jetbrains.kotlin.util.slicedMap.WritableSlice<org.jetbrains.kotlin.descriptors.ModuleDescriptor, org.jetbrains.kotlinx.serialization.compiler.diagnostic.VersionReader.RuntimeVersions> VERSIONS_SLICE = null;
    @org.jetbrains.annotations.NotNull
    private static final org.jetbrains.kotlin.config.ApiVersion minVersionForInlineClasses = null;
    
    private VersionReader() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlinx.serialization.compiler.diagnostic.VersionReader.RuntimeVersions getVersionsFromManifest(@org.jetbrains.annotations.NotNull
    java.io.File runtimeLibraryPath) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.config.ApiVersion getMINIMAL_SUPPORTED_VERSION() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.jetbrains.kotlinx.serialization.compiler.diagnostic.VersionReader.RuntimeVersions getVersionsForCurrentModuleFromTrace(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingTrace trace) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.jetbrains.kotlinx.serialization.compiler.diagnostic.VersionReader.RuntimeVersions getVersionsForCurrentModuleFromContext(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.jetbrains.kotlinx.serialization.compiler.diagnostic.VersionReader.RuntimeVersions getVersionsForCurrentModule(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.jetbrains.kotlin.config.ApiVersion getMinVersionForInlineClasses$kotlinx_serialization() {
        return null;
    }
    
    public final boolean canSupportInlineClasses(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingTrace trace) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0006\u0010\u0012\u001a\u00020\rJ\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/diagnostic/VersionReader$RuntimeVersions;", "", "implementationVersion", "Lorg/jetbrains/kotlin/config/ApiVersion;", "requireKotlinVersion", "(Lorg/jetbrains/kotlin/config/ApiVersion;Lorg/jetbrains/kotlin/config/ApiVersion;)V", "getImplementationVersion", "()Lorg/jetbrains/kotlin/config/ApiVersion;", "getRequireKotlinVersion", "component1", "component2", "copy", "currentCompilerMatchRequired", "", "equals", "other", "hashCode", "", "implementationVersionMatchSupported", "toString", "", "kotlinx-serialization"})
    public static final class RuntimeVersions {
        @org.jetbrains.annotations.Nullable
        private final org.jetbrains.kotlin.config.ApiVersion implementationVersion = null;
        @org.jetbrains.annotations.Nullable
        private final org.jetbrains.kotlin.config.ApiVersion requireKotlinVersion = null;
        
        @org.jetbrains.annotations.NotNull
        public final org.jetbrains.kotlinx.serialization.compiler.diagnostic.VersionReader.RuntimeVersions copy(@org.jetbrains.annotations.Nullable
        org.jetbrains.kotlin.config.ApiVersion implementationVersion, @org.jetbrains.annotations.Nullable
        org.jetbrains.kotlin.config.ApiVersion requireKotlinVersion) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public RuntimeVersions(@org.jetbrains.annotations.Nullable
        org.jetbrains.kotlin.config.ApiVersion implementationVersion, @org.jetbrains.annotations.Nullable
        org.jetbrains.kotlin.config.ApiVersion requireKotlinVersion) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final org.jetbrains.kotlin.config.ApiVersion component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final org.jetbrains.kotlin.config.ApiVersion getImplementationVersion() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final org.jetbrains.kotlin.config.ApiVersion component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final org.jetbrains.kotlin.config.ApiVersion getRequireKotlinVersion() {
            return null;
        }
        
        public final boolean currentCompilerMatchRequired() {
            return false;
        }
        
        public final boolean implementationVersionMatchSupported() {
            return false;
        }
    }
}