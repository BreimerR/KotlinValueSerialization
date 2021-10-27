package org.jetbrains.kotlinx.serialization.compiler.diagnostic;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ \u0010\u001e\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fH\u0002J&\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J(\u0010!\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010#\u001a\u00020$H\u0002J:\u0010%\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\'2\u0006\u0010\u0013\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010*\u001a\u00020$H\u0002J \u0010+\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010/\u001a\u00020\n2\u0006\u0010-\u001a\u00020.2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J2\u00100\u001a\u00020\n2\u0006\u0010&\u001a\u00020\'2\u0006\u00101\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u0001022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010*\u001a\u00020$H\u0002J\u0018\u00103\u001a\u00020\n2\u0006\u0010\u0015\u001a\u0002042\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u00105\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u00106\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J6\u00107\u001a\u00020\n*\u0002082\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00109\u001a\u00020\'2\b\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010*\u001a\u00020$H\u0002J6\u0010<\u001a\u00020\n*\u0002082\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00109\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u0001022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010*\u001a\u00020$H\u0002J\f\u0010=\u001a\u00020\u0004*\u00020\u0007H\u0002J\f\u0010>\u001a\u00020\u0004*\u00020\'H\u0002J!\u0010?\u001a\u00020\n*\u00020\u00072\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\n0AH\u0082\bJ$\u0010C\u001a\u00020\n*\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00072\u000e\u0010D\u001a\n\u0012\u0006\b\u0000\u0012\u00020B0EH\u0002R\u0014\u0010\u0003\u001a\u00020\u00048TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0004*\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\b\u00a8\u0006F"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/diagnostic/SerializationPluginDeclarationChecker;", "Lorg/jetbrains/kotlin/resolve/checkers/DeclarationChecker;", "()V", "isIde", "", "()Z", "isAnonymousObjectOrContained", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Z", "analyzePropertiesSerializers", "", "trace", "Lorg/jetbrains/kotlin/resolve/BindingTrace;", "serializableClass", "props", "", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;", "buildSerializableProperties", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperties;", "descriptor", "canBeSerializedInternally", "declaration", "Lorg/jetbrains/kotlin/psi/KtDeclaration;", "canSupportInlineClasses", "module", "Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "check", "Lorg/jetbrains/kotlin/descriptors/DeclarationDescriptor;", "context", "Lorg/jetbrains/kotlin/resolve/checkers/DeclarationCheckerContext;", "checkClassWithCustomSerializer", "checkCorrectTransientAnnotationIsUsed", "properties", "checkCustomSerializerIsNotLocal", "Lorg/jetbrains/kotlin/descriptors/annotations/Annotated;", "declarationElement", "Lorg/jetbrains/kotlin/com/intellij/psi/PsiElement;", "checkCustomSerializerMatch", "classType", "Lorg/jetbrains/kotlin/types/KotlinType;", "element", "Lorg/jetbrains/kotlin/psi/KtElement;", "fallbackElement", "checkInheritedAnnotations", "checkMinKotlin", "versions", "Lorg/jetbrains/kotlinx/serialization/compiler/diagnostic/VersionReader$RuntimeVersions;", "checkMinRuntime", "checkSerializerNullability", "serializerType", "Lorg/jetbrains/kotlin/psi/KtTypeElement;", "checkTransients", "Lorg/jetbrains/kotlin/psi/KtPureClassOrObject;", "declarationHasInitializer", "serializationPluginEnabledOn", "checkType", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/AbstractSerialGenerator;", "type", "ktType", "Lorg/jetbrains/kotlin/psi/KtTypeReference;", "checkTypeArguments", "isSerializableEnumWithMissingSerializer", "isUnsupportedInlineType", "onSerializableAnnotation", "report", "Lkotlin/Function1;", "Lorg/jetbrains/kotlin/psi/KtAnnotationEntry;", "reportOnSerializableAnnotation", "error", "Lorg/jetbrains/kotlin/diagnostics/DiagnosticFactory0;", "kotlinx-serialization"})
public class SerializationPluginDeclarationChecker implements org.jetbrains.kotlin.resolve.checkers.DeclarationChecker {
    
    public SerializationPluginDeclarationChecker() {
        super();
    }
    
    @java.lang.Override
    public final void check(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.psi.KtDeclaration declaration, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.DeclarationDescriptor descriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.checkers.DeclarationCheckerContext context) {
    }
    
    private final void checkInheritedAnnotations(org.jetbrains.kotlin.descriptors.ClassDescriptor descriptor, org.jetbrains.kotlin.psi.KtDeclaration declaration, org.jetbrains.kotlin.resolve.BindingTrace trace) {
    }
    
    private final void checkMinRuntime(org.jetbrains.kotlinx.serialization.compiler.diagnostic.VersionReader.RuntimeVersions versions, org.jetbrains.kotlin.descriptors.ClassDescriptor descriptor, org.jetbrains.kotlin.resolve.BindingTrace trace) {
    }
    
    private final void checkMinKotlin(org.jetbrains.kotlinx.serialization.compiler.diagnostic.VersionReader.RuntimeVersions versions, org.jetbrains.kotlin.descriptors.ClassDescriptor descriptor, org.jetbrains.kotlin.resolve.BindingTrace trace) {
    }
    
    protected boolean isIde() {
        return false;
    }
    
    private final void checkCorrectTransientAnnotationIsUsed(org.jetbrains.kotlin.descriptors.ClassDescriptor descriptor, java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> properties, org.jetbrains.kotlin.resolve.BindingTrace trace) {
    }
    
    private final boolean canBeSerializedInternally(org.jetbrains.kotlin.descriptors.ClassDescriptor descriptor, org.jetbrains.kotlin.psi.KtDeclaration declaration, org.jetbrains.kotlin.resolve.BindingTrace trace) {
        return false;
    }
    
    private final void checkClassWithCustomSerializer(org.jetbrains.kotlin.descriptors.ClassDescriptor descriptor, org.jetbrains.kotlin.psi.KtDeclaration declaration, org.jetbrains.kotlin.resolve.BindingTrace trace) {
    }
    
    private final boolean isAnonymousObjectOrContained(org.jetbrains.kotlin.descriptors.ClassDescriptor $this$isAnonymousObjectOrContained) {
        return false;
    }
    
    private final boolean isSerializableEnumWithMissingSerializer(org.jetbrains.kotlin.descriptors.ClassDescriptor $this$isSerializableEnumWithMissingSerializer) {
        return false;
    }
    
    public boolean serializationPluginEnabledOn(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor descriptor) {
        return false;
    }
    
    private final org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperties buildSerializableProperties(org.jetbrains.kotlin.descriptors.ClassDescriptor descriptor, org.jetbrains.kotlin.resolve.BindingTrace trace) {
        return null;
    }
    
    private final void checkTransients(org.jetbrains.kotlin.psi.KtPureClassOrObject declaration, org.jetbrains.kotlin.resolve.BindingTrace trace) {
    }
    
    private final boolean declarationHasInitializer(org.jetbrains.kotlin.psi.KtDeclaration declaration) {
        return false;
    }
    
    private final void analyzePropertiesSerializers(org.jetbrains.kotlin.resolve.BindingTrace trace, org.jetbrains.kotlin.descriptors.ClassDescriptor serializableClass, java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> props) {
    }
    
    private final void checkTypeArguments(org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator $this$checkTypeArguments, org.jetbrains.kotlin.descriptors.ModuleDescriptor module, org.jetbrains.kotlin.types.KotlinType type, org.jetbrains.kotlin.psi.KtTypeElement element, org.jetbrains.kotlin.resolve.BindingTrace trace, org.jetbrains.kotlin.com.intellij.psi.PsiElement fallbackElement) {
    }
    
    private final boolean isUnsupportedInlineType(org.jetbrains.kotlin.types.KotlinType $this$isUnsupportedInlineType) {
        return false;
    }
    
    private final boolean canSupportInlineClasses(org.jetbrains.kotlin.descriptors.ModuleDescriptor module, org.jetbrains.kotlin.resolve.BindingTrace trace) {
        return false;
    }
    
    private final void checkType(org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator $this$checkType, org.jetbrains.kotlin.descriptors.ModuleDescriptor module, org.jetbrains.kotlin.types.KotlinType type, org.jetbrains.kotlin.psi.KtTypeReference ktType, org.jetbrains.kotlin.resolve.BindingTrace trace, org.jetbrains.kotlin.com.intellij.psi.PsiElement fallbackElement) {
    }
    
    private final void checkCustomSerializerMatch(org.jetbrains.kotlin.descriptors.ModuleDescriptor module, org.jetbrains.kotlin.types.KotlinType classType, org.jetbrains.kotlin.descriptors.annotations.Annotated descriptor, org.jetbrains.kotlin.psi.KtElement element, org.jetbrains.kotlin.resolve.BindingTrace trace, org.jetbrains.kotlin.com.intellij.psi.PsiElement fallbackElement) {
    }
    
    private final void checkCustomSerializerIsNotLocal(org.jetbrains.kotlin.descriptors.ModuleDescriptor module, org.jetbrains.kotlin.descriptors.annotations.Annotated declaration, org.jetbrains.kotlin.resolve.BindingTrace trace, org.jetbrains.kotlin.com.intellij.psi.PsiElement declarationElement) {
    }
    
    private final void checkSerializerNullability(org.jetbrains.kotlin.types.KotlinType classType, org.jetbrains.kotlin.types.KotlinType serializerType, org.jetbrains.kotlin.psi.KtTypeElement element, org.jetbrains.kotlin.resolve.BindingTrace trace, org.jetbrains.kotlin.com.intellij.psi.PsiElement fallbackElement) {
    }
    
    private final void onSerializableAnnotation(org.jetbrains.kotlin.descriptors.ClassDescriptor $this$onSerializableAnnotation, kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.psi.KtAnnotationEntry, kotlin.Unit> report) {
    }
    
    private final void reportOnSerializableAnnotation(org.jetbrains.kotlin.resolve.BindingTrace $this$reportOnSerializableAnnotation, org.jetbrains.kotlin.descriptors.ClassDescriptor descriptor, org.jetbrains.kotlin.diagnostics.DiagnosticFactory0<? super org.jetbrains.kotlin.psi.KtAnnotationEntry> error) {
    }
}