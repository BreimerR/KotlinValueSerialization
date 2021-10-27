package org.jetbrains.kotlinx.serialization.compiler.resolve;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/resolve/CallingConventions;", "", "()V", "addAnnotation", "", "addClassAnnotation", "addElement", "begin", "decode", "decodeElementIndex", "decodeEnum", "decodeInline", "decodeSequentially", "elementPostfix", "encode", "encodeEnum", "encodeInline", "end", "shouldEncodeDefault", "update", "kotlinx-serialization"})
public final class CallingConventions {
    @org.jetbrains.annotations.NotNull
    public static final org.jetbrains.kotlinx.serialization.compiler.resolve.CallingConventions INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String begin = "beginStructure";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String end = "endStructure";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String decode = "decode";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String update = "update";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String encode = "encode";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String encodeEnum = "encodeEnum";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String decodeEnum = "decodeEnum";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String encodeInline = "encodeInline";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String decodeInline = "decodeInline";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String decodeElementIndex = "decodeElementIndex";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String decodeSequentially = "decodeSequentially";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String elementPostfix = "Element";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String shouldEncodeDefault = "shouldEncodeElementDefault";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String addElement = "addElement";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String addAnnotation = "pushAnnotation";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String addClassAnnotation = "pushClassAnnotation";
    
    private CallingConventions() {
        super();
    }
}