package org.jetbrains.kotlinx.serialization.compiler.backend.ir;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00ca\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u00ed\u0001J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J9\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020(0&\u00a2\u0006\u0002\b)H\u0016JP\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0&2\u0006\u0010\u0016\u001a\u00020\u00172\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0006\u0012\u0004\u0018\u00010,0&2\u001c\b\u0002\u0010/\u001a\u0016\u0012\u0004\u0012\u000201\u0012\n\u0012\b\u0012\u0004\u0012\u00020,02\u0018\u000100H\u0016J9\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0017\u0010%\u001a\u0013\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020(0&\u00a2\u0006\u0002\b)H\u0016J \u00106\u001a\u0010\u0012\u0004\u0012\u000208\u0012\u0006\u0012\u0004\u0018\u00010,072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\fH\u0016J\u0012\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020\fH\u0002J\u0018\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0002J\u0018\u0010E\u001a\u00020@2\u0006\u0010F\u001a\u00020G2\u0006\u0010C\u001a\u00020DH\u0002J\u0018\u0010H\u001a\u00020,2\u0006\u0010I\u001a\u0002012\u0006\u0010J\u001a\u00020KH\u0016J\"\u0010L\u001a\u00020\u001f2\u0006\u0010M\u001a\u00020K2\u0006\u0010N\u001a\u00020\u00172\b\b\u0002\u0010O\u001a\u00020$H\u0016J\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020R0Q2\u0006\u0010;\u001a\u00020\fH\u0002J\u0010\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020VH\u0016J\u0010\u0010W\u001a\u00020=2\u0006\u0010X\u001a\u00020\u0017H\u0016J\b\u0010Y\u001a\u00020ZH\u0016J\"\u0010[\u001a\u00020\"2\u0006\u0010\\\u001a\u00020]2\u0006\u0010!\u001a\u00020\"2\b\b\u0002\u0010^\u001a\u00020_H\u0016J/\u0010`\u001a\u0002Ha\"\b\b\u0000\u0010a*\u00020b*\u0002Ha2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u0002Ha\u0012\u0004\u0012\u00020(0&H\u0016\u00a2\u0006\u0002\u0010dJ2\u0010e\u001a\u0004\u0018\u00010,*\u00020f2\u0006\u0010g\u001a\u00020\"2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020\"0\u00142\f\u0010i\u001a\b\u0012\u0004\u0012\u00020,0\u0014H\u0016J\u0014\u0010j\u001a\u00020\u0019*\u00020f2\u0006\u0010\u001d\u001a\u00020\nH\u0016J%\u0010k\u001a\u00020(*\u00020\u00172\u0017\u0010l\u001a\u0013\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020(0&\u00a2\u0006\u0002\b)H\u0016JG\u0010m\u001a\u00020(*\u00020\u00172\u0006\u0010n\u001a\u00020o2\b\b\u0002\u0010p\u001a\u00020Z2\b\b\u0002\u0010q\u001a\u00020Z2\u001d\u0010l\u001a\u0019\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020(0r\u00a2\u0006\u0002\b)H\u0016J=\u0010t\u001a\u00020(*\u00020\u00172\u0006\u0010n\u001a\u00020u2\b\b\u0002\u0010v\u001a\u00020Z2\u001d\u0010l\u001a\u0019\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020(0r\u00a2\u0006\u0002\b)H\u0016J \u0010w\u001a\b\u0012\u0004\u0012\u00020,0\u0014*\u00020f2\f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u0014\u0010y\u001a\u00020(*\u00020:2\u0006\u0010n\u001a\u00020uH\u0016J\"\u0010z\u001a\u00020,*\u00020f2\u0006\u0010{\u001a\u00020\"2\f\u0010|\u001a\b\u0012\u0004\u0012\u00020,0\u0014H\u0016J-\u0010}\u001a\u00020~*\u00020\u00172\u0006\u0010!\u001a\u00020\"2\u0017\u0010l\u001a\u0013\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020(0&\u00a2\u0006\u0002\b)H\u0016J)\u0010\u007f\u001a\u00020(*\u00020:2\u0006\u0010n\u001a\u00020u2\b\b\u0002\u0010q\u001a\u00020Z2\t\b\u0002\u0010\u0080\u0001\u001a\u00020ZH\u0016J$\u0010\u0081\u0001\u001a\u00020,*\u00020f2\u0007\u0010\u0082\u0001\u001a\u00020\"2\f\u0010|\u001a\b\u0012\u0004\u0012\u00020,0\u0014H\u0016JF\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00020.\u0012\u0006\u0012\u0004\u0018\u00010,0&*\u00020f2\u0006\u0010\u0016\u001a\u00020\u00172\r\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\b\u0010\u0085\u0001\u001a\u00030\u0086\u00012\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001H\u0016J\u0018\u0010\u0089\u0001\u001a\u00030\u008a\u0001*\u00030\u008b\u00012\u0007\u0010\u008c\u0001\u001a\u00020,H\u0016J\u000f\u0010\u008d\u0001\u001a\u0004\u0018\u00010D*\u00020\u0017H\u0016J\u00e8\u0001\u0010\u008e\u0001\u001a\u00020,*\u00020\'2\b\u0010\u008f\u0001\u001a\u00030\u0090\u00012\u0007\u0010\u0091\u0001\u001a\u00020,2\u0006\u0010J\u001a\u00020\u00102S\u0010\u0092\u0001\u001aN\u0012\u0014\u0012\u00120,\u00a2\u0006\r\b\u0093\u0001\u0012\b\b#\u0012\u0004\b\b(>\u0012\u0016\u0012\u00140\u0094\u0001\u00a2\u0006\u000e\b\u0093\u0001\u0012\t\b#\u0012\u0005\b\b(\u0095\u0001\u0012\u001c\u0012\u001a\u0012\u0005\u0012\u00030\u0096\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u001400j\u0003`\u0097\u00010r2=\u0010\u0098\u0001\u001a8\u0012\u0016\u0012\u00140\u0094\u0001\u00a2\u0006\u000e\b\u0093\u0001\u0012\t\b#\u0012\u0005\b\b(\u0095\u0001\u0012\u001c\u0012\u001a\u0012\u0005\u0012\u00030\u0096\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u001400j\u0003`\u0097\u00010&2\u001d\b\u0002\u0010\u0099\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020,\u0018\u00010r2\u000b\b\u0002\u0010\u009a\u0001\u001a\u0004\u0018\u00010\"H\u0016J\u0016\u0010\u009b\u0001\u001a\u00020(*\u00020f2\u0007\u0010\u009c\u0001\u001a\u00020\'H\u0016J0\u0010\u009d\u0001\u001a\u00020(*\u00020\'2\u000e\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u009f\u00010\u00142\b\u0010\u00a0\u0001\u001a\u00030\u00a1\u00012\u0007\u0010\u00a2\u0001\u001a\u00020,H\u0016J9\u0010\u00a3\u0001\u001a\u00020D*\u00020\u00172\u0006\u0010M\u001a\u00020K2\u0006\u0010J\u001a\u00020\u001f2\u0007\u0010n\u001a\u00030\u00a4\u00012\b\u0010\u00a5\u0001\u001a\u00030\u00a6\u00012\u0007\u0010\u00a7\u0001\u001a\u00020ZH\u0002J&\u0010\u00a8\u0001\u001a\u00020(*\u00020\u00172\u0006\u0010M\u001a\u00020K2\u0007\u0010\u00a9\u0001\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0002J\u0015\u0010\u00aa\u0001\u001a\u0004\u0018\u00010Z*\u00020\u001fH\u0016\u00a2\u0006\u0003\u0010\u00ab\u0001J\u0016\u0010\u00ac\u0001\u001a\u00020\u001f*\u00020\u00102\u0007\u0010\u00ad\u0001\u001a\u00020\u0017H\u0016J\'\u0010\u00ae\u0001\u001a\u00020,*\u00020\'2\b\u0010\u00af\u0001\u001a\u00030\u0086\u00012\u0006\u0010J\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0016J\u001e\u0010\u00b0\u0001\u001a\u00020,*\u00020f2\u0007\u0010\u00b1\u0001\u001a\u00020,2\u0006\u0010J\u001a\u00020\u001fH\u0016J\u000f\u0010\u00b2\u0001\u001a\u0004\u0018\u00010\u0017*\u00020\u0017H\u0016J\r\u0010\u00b3\u0001\u001a\u00020\u0017*\u00020\u0017H\u0016J\'\u0010\u00b4\u0001\u001a\u00020,*\u00020f2\u0006\u0010#\u001a\u00020$2\u0007\u0010\u00b5\u0001\u001a\u00020,2\u0007\u0010\u00b6\u0001\u001a\u00020,H\u0016J\u0017\u0010\u00b7\u0001\u001a\u00030\u00b8\u0001*\u00020f2\u0007\u0010\u00b9\u0001\u001a\u00020.H\u0016J\u0017\u0010\u00ba\u0001\u001a\u00030\u00bb\u0001*\u00020f2\u0007\u0010\u00bc\u0001\u001a\u00020\fH\u0016J\u0017\u0010\u00ba\u0001\u001a\u00030\u00bb\u0001*\u00020f2\u0007\u0010\u00bd\u0001\u001a\u00020\u0017H\u0016JQ\u0010\u00be\u0001\u001a\u0007\u0012\u0002\b\u00030\u00bf\u0001*\u00020f2\u000b\b\u0002\u0010\u00c0\u0001\u001a\u0004\u0018\u00010,2\b\u0010\u00c1\u0001\u001a\u00030\u0096\u00012\u0013\u0010i\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020,0\u00c2\u0001\"\u00020,2\u000b\b\u0002\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\"H\u0016\u00a2\u0006\u0003\u0010\u00c4\u0001JV\u0010\u00be\u0001\u001a\u0007\u0012\u0002\b\u00030\u00bf\u0001*\u00020f2\u000b\b\u0002\u0010\u00c0\u0001\u001a\u0004\u0018\u00010,2\b\u0010\u00c1\u0001\u001a\u00030\u0096\u00012\u000f\u0010\u00c5\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00142\r\u0010\u00c6\u0001\u001a\b\u0012\u0004\u0012\u00020,0\u00142\u000b\b\u0002\u0010\u009a\u0001\u001a\u0004\u0018\u00010\"H\u0016J6\u0010\u00c7\u0001\u001a\u00030\u00c8\u0001*\u00020f2\u000b\b\u0002\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\"2\u0019\u0010\u00c9\u0001\u001a\u0014\u0012\u0005\u0012\u00030\u008b\u0001\u0012\u0004\u0012\u00020(0&\u00a2\u0006\u0002\b)H\u0016J\r\u0010\u00ca\u0001\u001a\u00020Z*\u00020sH\u0002J\r\u0010\u00cb\u0001\u001a\u00020Z*\u00020sH\u0002J.\u0010\u00cc\u0001\u001a\u00030\u0096\u0001*\u00020\f2\u0007\u0010\u00cd\u0001\u001a\u00020R2\u0015\b\u0002\u0010\u00ce\u0001\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020Z0&H\u0016J%\u0010\u00cf\u0001\u001a\u0004\u0018\u0001Ha\"\n\b\u0000\u0010a\u0018\u0001*\u00020b*\u00020\u00172\u0007\u0010n\u001a\u00030\u00d0\u0001H\u0082\bJ\u0015\u0010\u00d1\u0001\u001a\u00020\u001f*\u00020\u00172\u0006\u0010n\u001a\u00020KH\u0016J\u0091\u0001\u0010\u00d2\u0001\u001a\u00020(*\u00020\'2\b\u0010\u00d3\u0001\u001a\u00030\u0090\u00012\u0007\u0010\u00d4\u0001\u001a\u00020\u00172\r\u0010\u00d5\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\b\u0010\u00d6\u0001\u001a\u00030\u009f\u00012\b\u0010\u00d7\u0001\u001a\u00030\u009f\u00012\b\u0010\u00d8\u0001\u001a\u00030\u009f\u00012\u0007\u0010\u00d9\u0001\u001a\u00020\f2\u0007\u0010\u00da\u0001\u001a\u00020\u001b2\u0013\u0010\u00db\u0001\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0&2\u001b\u0010\u0099\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020,\u0018\u00010rH\u0016Jg\u0010\u00dc\u0001\u001a\u0004\u0018\u00010,*\u00020f2\b\u0010\u008f\u0001\u001a\u00030\u0090\u00012\t\u0010\u00dd\u0001\u001a\u0004\u0018\u00010\f2\u0006\u0010\\\u001a\u00020]2\u0007\u0010\u00de\u0001\u001a\u00020\n2\u000b\b\u0002\u0010\u00df\u0001\u001a\u0004\u0018\u00010\u001b2\u001d\b\u0002\u0010\u0099\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020,\u0018\u00010rH\u0016\u00a2\u0006\u0003\u0010\u00e0\u0001JR\u0010\u00dc\u0001\u001a\u0004\u0018\u00010,*\u00020f2\b\u0010\u008f\u0001\u001a\u00030\u00e1\u00012\b\u0010\u00e2\u0001\u001a\u00030\u0086\u00012\t\u0010\u00dd\u0001\u001a\u0004\u0018\u00010\f2\u0006\u0010\\\u001a\u00020]2\u0007\u0010\u00de\u0001\u001a\u00020\n2\u000b\b\u0002\u0010\u00df\u0001\u001a\u0004\u0018\u00010\u001bH\u0016\u00a2\u0006\u0003\u0010\u00e3\u0001J+\u0010\u00e4\u0001\u001a\u0004\u0018\u00010,*\u00020f2\b\u0010\u00d3\u0001\u001a\u00030\u00e1\u00012\b\u0010\u00e2\u0001\u001a\u00030\u0086\u00012\u0006\u0010J\u001a\u00020\u0010H\u0016J\'\u0010\u00e5\u0001\u001a\u00020,*\u00020f2\u0007\u0010\u00b1\u0001\u001a\u00020,2\u0006\u0010J\u001a\u00020\u001f2\u0007\u0010\u00e6\u0001\u001a\u00020,H\u0016J\r\u0010\u00e7\u0001\u001a\u00020\"*\u00020\nH\u0016J(\u0010\u00e8\u0001\u001a\u00020,*\u00020f2\u0006\u0010!\u001a\u00020\n2\u0007\u0010\u00e9\u0001\u001a\u00020,2\b\u0010\u00ea\u0001\u001a\u00030\u00eb\u0001H\u0002J\u0015\u0010\u00ec\u0001\u001a\u00020\u0019*\u00020f2\u0006\u0010\u001d\u001a\u00020\nH\u0002R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\r\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004R\r\u0010\b\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004R\u000f\u0010\t\u001a\u00020\n*\u00020\n8BX\u0082\u0004R\u000f\u0010\u000b\u001a\u00020\f*\u00020\r8BX\u0082\u0004R\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u00ee\u0001"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/IrBuilderExtension;", "", "compilerContext", "Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationPluginContext;", "getCompilerContext", "()Lorg/jetbrains/kotlinx/serialization/compiler/extensions/SerializationPluginContext;", "throwMissedFieldExceptionArrayFunc", "Lorg/jetbrains/kotlin/ir/symbols/IrSimpleFunctionSymbol;", "throwMissedFieldExceptionFunc", "approximateJvmErasure", "Lorg/jetbrains/kotlin/types/KotlinType;", "classBound", "Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "irField", "Lorg/jetbrains/kotlin/ir/declarations/IrField;", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;", "getIrField", "(Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperty;)Lorg/jetbrains/kotlin/ir/declarations/IrField;", "collectSerialInfoAnnotations", "", "Lorg/jetbrains/kotlin/ir/expressions/IrConstructorCall;", "irClass", "Lorg/jetbrains/kotlin/ir/declarations/IrClass;", "createClassReference", "Lorg/jetbrains/kotlin/ir/expressions/IrClassReference;", "startOffset", "", "endOffset", "classType", "createCompanionValProperty", "Lorg/jetbrains/kotlin/ir/declarations/IrProperty;", "companionClass", "type", "Lorg/jetbrains/kotlin/ir/types/IrType;", "name", "Lorg/jetbrains/kotlin/name/Name;", "initializerBuilder", "Lkotlin/Function1;", "Lorg/jetbrains/kotlin/ir/builders/IrBlockBodyBuilder;", "", "Lkotlin/ExtensionFunctionType;", "createInitializerAdapter", "Lorg/jetbrains/kotlin/ir/expressions/IrExpressionBody;", "Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "paramGetReplacer", "Lorg/jetbrains/kotlin/descriptors/ValueParameterDescriptor;", "thisGetReplacer", "Lkotlin/Pair;", "Lorg/jetbrains/kotlin/ir/symbols/IrValueSymbol;", "Lkotlin/Function0;", "createLazyProperty", "containingClass", "targetIrType", "extractDefaultValuesFromConstructor", "", "Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "findEnumValuesMethod", "Lorg/jetbrains/kotlin/ir/declarations/IrFunction;", "enumClass", "findSerializerConstructorForTypeArgumentsSerializers", "Lorg/jetbrains/kotlin/ir/symbols/IrConstructorSymbol;", "serializer", "generateDefaultGetterBody", "Lorg/jetbrains/kotlin/ir/expressions/IrBlockBody;", "getter", "Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "irAccessor", "Lorg/jetbrains/kotlin/ir/declarations/IrSimpleFunction;", "generateDefaultSetterBody", "setter", "Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "generateReceiverExpressionForFieldAccess", "ownerSymbol", "property", "Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "generateSimplePropertyWithBackingField", "propertyDescriptor", "propertyParent", "fieldName", "getEnumMembersNames", "Lkotlin/sequences/Sequence;", "", "kClassTypeFor", "Lorg/jetbrains/kotlin/types/SimpleType;", "projection", "Lorg/jetbrains/kotlin/types/TypeProjection;", "serializableSyntheticConstructor", "forClass", "useFieldMissingOptimization", "", "wrapIrTypeIntoKSerializerIrType", "module", "Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;", "variance", "Lorg/jetbrains/kotlin/types/Variance;", "buildWithScope", "T", "Lorg/jetbrains/kotlin/ir/declarations/IrDeclaration;", "builder", "(Lorg/jetbrains/kotlin/ir/declarations/IrDeclaration;Lkotlin/jvm/functions/Function1;)Lorg/jetbrains/kotlin/ir/declarations/IrDeclaration;", "callSerializerFromCompanion", "Lorg/jetbrains/kotlin/ir/builders/IrBuilderWithScope;", "thisIrType", "typeArgs", "args", "classReference", "contributeAnonymousInitializer", "bodyGen", "contributeConstructor", "descriptor", "Lorg/jetbrains/kotlin/descriptors/ClassConstructorDescriptor;", "declareNew", "overwriteValueParameters", "Lkotlin/Function2;", "Lorg/jetbrains/kotlin/ir/declarations/IrConstructor;", "contributeFunction", "Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "ignoreWhenMissing", "copyAnnotationsFrom", "annotations", "copyTypeParamsFromDescriptor", "createArrayOfExpression", "arrayElementType", "arrayElements", "createLambdaExpression", "Lorg/jetbrains/kotlin/ir/expressions/IrFunctionExpression;", "createParameterDeclarations", "copyTypeParameters", "createPrimitiveArrayOfExpression", "elementPrimitiveType", "createPropertyByParamReplacer", "serialProperties", "instance", "Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;", "bindingContext", "Lorg/jetbrains/kotlin/resolve/BindingContext;", "elseBranch", "Lorg/jetbrains/kotlin/ir/expressions/IrElseBranch;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/IrBuilderExtension$BranchBuilder;", "result", "findWriteSelfMethod", "formEncodeDecodePropertyCall", "enclosingGenerator", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/AbstractSerialGenerator;", "encoder", "whenHaveSerializer", "Lkotlin/ParameterName;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/SerialTypeInfo;", "sti", "Lorg/jetbrains/kotlin/ir/symbols/IrFunctionSymbol;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/FunctionWithArgs;", "whenDoNot", "genericGetter", "returnTypeHint", "generateAnySuperConstructorCall", "toBuilder", "generateGoldenMaskCheck", "seenVars", "Lorg/jetbrains/kotlin/ir/declarations/IrValueDeclaration;", "properties", "Lorg/jetbrains/kotlinx/serialization/compiler/resolve/SerializableProperties;", "serialDescriptor", "generatePropertyAccessor", "Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "fieldSymbol", "Lorg/jetbrains/kotlin/ir/symbols/IrFieldSymbol;", "isGetter", "generatePropertyBackingFieldIfNeeded", "originProperty", "getEncodeDefaultAnnotationValue", "(Lorg/jetbrains/kotlin/ir/declarations/IrProperty;)Ljava/lang/Boolean;", "getIrPropertyFrom", "thisClass", "getLazyValueExpression", "thisParam", "getProperty", "receiver", "getSuperClassNotAny", "getSuperClassOrAny", "irBinOp", "lhs", "rhs", "irEmptyVararg", "Lorg/jetbrains/kotlin/ir/expressions/impl/IrVarargImpl;", "forValueParameter", "irGetObject", "Lorg/jetbrains/kotlin/ir/expressions/impl/IrGetObjectValueImpl;", "classDescriptor", "irObject", "irInvoke", "Lorg/jetbrains/kotlin/ir/expressions/IrMemberAccessExpression;", "dispatchReceiver", "callee", "", "typeHint", "(Lorg/jetbrains/kotlin/ir/builders/IrBuilderWithScope;Lorg/jetbrains/kotlin/ir/expressions/IrExpression;Lorg/jetbrains/kotlin/ir/symbols/IrFunctionSymbol;[Lorg/jetbrains/kotlin/ir/expressions/IrExpression;Lorg/jetbrains/kotlin/ir/types/IrType;)Lorg/jetbrains/kotlin/ir/expressions/IrMemberAccessExpression;", "typeArguments", "valueArguments", "irWhen", "Lorg/jetbrains/kotlin/ir/expressions/IrWhen;", "block", "isSerializationCtor", "lastArgumentIsAnnotationArray", "referenceFunctionSymbol", "functionName", "predicate", "searchForDeclaration", "Lorg/jetbrains/kotlin/descriptors/DeclarationDescriptor;", "searchForProperty", "serializeAllProperties", "generator", "serializableIrClass", "serializableProperties", "objectToSerialize", "localOutput", "localSerialDesc", "kOutputClass", "ignoreIndexTo", "initializerAdapter", "serializerInstance", "serializerClassOriginal", "kType", "genericIndex", "(Lorg/jetbrains/kotlin/ir/builders/IrBuilderWithScope;Lorg/jetbrains/kotlinx/serialization/compiler/backend/common/AbstractSerialGenerator;Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;Lorg/jetbrains/kotlin/types/KotlinType;Ljava/lang/Integer;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/SerializerIrGenerator;", "dispatchReceiverParameter", "(Lorg/jetbrains/kotlin/ir/builders/IrBuilderWithScope;Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/SerializerIrGenerator;Lorg/jetbrains/kotlin/ir/declarations/IrValueParameter;Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;Lorg/jetbrains/kotlin/types/KotlinType;Ljava/lang/Integer;)Lorg/jetbrains/kotlin/ir/expressions/IrExpression;", "serializerTower", "setProperty", "value", "toIrType", "wrapWithNullableSerializerIfNeeded", "expression", "nullableProp", "Lorg/jetbrains/kotlin/ir/symbols/IrPropertySymbol;", "wrapperClassReference", "BranchBuilder", "kotlinx-serialization"})
@org.jetbrains.kotlin.ir.ObsoleteDescriptorBasedAPI
public abstract interface IrBuilderExtension {
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlinx.serialization.compiler.extensions.SerializationPluginContext getCompilerContext();
    
    public abstract boolean useFieldMissingOptimization();
    
    public abstract void contributeFunction(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass $this$contributeFunction, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor descriptor, boolean ignoreWhenMissing, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder, ? super org.jetbrains.kotlin.ir.declarations.IrFunction, kotlin.Unit> bodyGen);
    
    public abstract void contributeConstructor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass $this$contributeConstructor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor descriptor, boolean declareNew, boolean overwriteValueParameters, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder, ? super org.jetbrains.kotlin.ir.declarations.IrConstructor, kotlin.Unit> bodyGen);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.IrFunctionExpression createLambdaExpression(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass $this$createLambdaExpression, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.types.IrType type, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder, kotlin.Unit> bodyGen);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.declarations.IrProperty createLazyProperty(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass containingClass, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.types.IrType targetIrType, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.Name name, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder, kotlin.Unit> initializerBuilder);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.declarations.IrProperty createCompanionValProperty(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass companionClass, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.types.IrType type, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.Name name, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder, kotlin.Unit> initializerBuilder);
    
    public abstract void contributeAnonymousInitializer(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass $this$contributeAnonymousInitializer, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder, kotlin.Unit> bodyGen);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.IrExpression getLazyValueExpression(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$getLazyValueExpression, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrValueParameter thisParam, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrProperty property, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.types.IrType type);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression<?> irInvoke(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irInvoke, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.ir.expressions.IrExpression dispatchReceiver, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol callee, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression[] args, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.ir.types.IrType typeHint);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression<?> irInvoke(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irInvoke, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.ir.expressions.IrExpression dispatchReceiver, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol callee, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.ir.types.IrType> typeArguments, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression> valueArguments, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.ir.types.IrType returnTypeHint);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.IrExpression createArrayOfExpression(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$createArrayOfExpression, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.types.IrType arrayElementType, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression> arrayElements);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol referenceFunctionSymbol(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor $this$referenceFunctionSymbol, @org.jetbrains.annotations.NotNull
    java.lang.String functionName, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.ir.declarations.IrSimpleFunction, java.lang.Boolean> predicate);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.IrExpression createPrimitiveArrayOfExpression(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$createPrimitiveArrayOfExpression, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.types.IrType elementPrimitiveType, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression> arrayElements);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.IrExpression irBinOp(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irBinOp, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.Name name, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression lhs, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression rhs);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.impl.IrGetObjectValueImpl irGetObject(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irGetObject, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor classDescriptor);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.impl.IrGetObjectValueImpl irGetObject(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irGetObject, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass irObject);
    
    @org.jetbrains.annotations.NotNull
    public abstract <T extends org.jetbrains.kotlin.ir.declarations.IrDeclaration>T buildWithScope(@org.jetbrains.annotations.NotNull
    T $this$buildWithScope, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> builder);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl irEmptyVararg(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irEmptyVararg, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ValueParameterDescriptor forValueParameter);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.IrWhen irWhen(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irWhen, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.ir.types.IrType typeHint, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension.BranchBuilder, kotlin.Unit> block);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.IrElseBranch elseBranch(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension.BranchBuilder $this$elseBranch, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression result);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.types.IrType toIrType(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType $this$toIrType);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.declarations.IrField getIrField(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty $this$irField);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.declarations.IrProperty searchForProperty(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass $this$searchForProperty, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.PropertyDescriptor descriptor);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.declarations.IrProperty getIrPropertyFrom(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty $this$getIrPropertyFrom, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass thisClass);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlin.jvm.functions.Function1<org.jetbrains.kotlin.descriptors.ValueParameterDescriptor, org.jetbrains.kotlin.ir.expressions.IrExpression> createPropertyByParamReplacer(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$createPropertyByParamReplacer, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass irClass, @org.jetbrains.annotations.NotNull
    java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> serialProperties, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrValueParameter instance, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.resolve.BindingContext bindingContext);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.IrExpression getProperty(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$getProperty, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression receiver, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrProperty property);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.IrExpression setProperty(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$setProperty, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression receiver, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrProperty property, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression value);
    
    public abstract void generateAnySuperConstructorCall(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$generateAnySuperConstructorCall, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder toBuilder);
    
    public abstract void generateGoldenMaskCheck(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$generateGoldenMaskCheck, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.ir.declarations.IrValueDeclaration> seenVars, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperties properties, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression serialDescriptor);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.declarations.IrProperty generateSimplePropertyWithBackingField(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.PropertyDescriptor propertyDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass propertyParent, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.name.Name fieldName);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.IrExpression generateReceiverExpressionForFieldAccess(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.symbols.IrValueSymbol ownerSymbol, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.PropertyDescriptor property);
    
    public abstract void createParameterDeclarations(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrFunction $this$createParameterDeclarations, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor descriptor, boolean overwriteValueParameters, boolean copyTypeParameters);
    
    public abstract void copyTypeParamsFromDescriptor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrFunction $this$copyTypeParamsFromDescriptor, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.FunctionDescriptor descriptor);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.types.SimpleType kClassTypeFor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.TypeProjection projection);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.IrClassReference createClassReference(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType classType, int startOffset, int endOffset);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.IrClassReference createClassReference(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass irClass, int startOffset, int endOffset);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.IrClassReference classReference(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$classReference, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType classType);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlin.jvm.functions.Function1<org.jetbrains.kotlin.ir.expressions.IrExpressionBody, org.jetbrains.kotlin.ir.expressions.IrExpression> createInitializerAdapter(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass irClass, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.descriptors.ValueParameterDescriptor, ? extends org.jetbrains.kotlin.ir.expressions.IrExpression> paramGetReplacer, @org.jetbrains.annotations.Nullable
    kotlin.Pair<? extends org.jetbrains.kotlin.ir.symbols.IrValueSymbol, ? extends kotlin.jvm.functions.Function0<? extends org.jetbrains.kotlin.ir.expressions.IrExpression>> thisGetReplacer);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.declarations.IrFunction findEnumValuesMethod(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor enumClass);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<org.jetbrains.kotlin.ir.expressions.IrExpression> copyAnnotationsFrom(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$copyAnnotationsFrom, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrConstructorCall> annotations);
    
    @org.jetbrains.annotations.Nullable
    public abstract org.jetbrains.kotlin.ir.expressions.IrExpression serializerTower(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$serializerTower, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.ir.SerializerIrGenerator generator, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrValueParameter dispatchReceiverParameter, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty property);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.types.IrType wrapIrTypeIntoKSerializerIrType(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.types.IrType type, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.Variance variance);
    
    @org.jetbrains.annotations.Nullable
    public abstract org.jetbrains.kotlin.ir.expressions.IrExpression serializerInstance(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$serializerInstance, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.ir.SerializerIrGenerator enclosingGenerator, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrValueParameter dispatchReceiverParameter, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.descriptors.ClassDescriptor serializerClassOriginal, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType kType, @org.jetbrains.annotations.Nullable
    java.lang.Integer genericIndex);
    
    @org.jetbrains.annotations.Nullable
    public abstract org.jetbrains.kotlin.ir.expressions.IrExpression serializerInstance(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$serializerInstance, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator enclosingGenerator, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.descriptors.ClassDescriptor serializerClassOriginal, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.types.KotlinType kType, @org.jetbrains.annotations.Nullable
    java.lang.Integer genericIndex, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super org.jetbrains.kotlin.types.KotlinType, ? extends org.jetbrains.kotlin.ir.expressions.IrExpression> genericGetter);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<org.jetbrains.kotlin.ir.expressions.IrConstructorCall> collectSerialInfoAnnotations(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass irClass);
    
    @org.jetbrains.annotations.Nullable
    public abstract org.jetbrains.kotlin.ir.expressions.IrExpression callSerializerFromCompanion(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$callSerializerFromCompanion, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.types.IrType thisIrType, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.ir.types.IrType> typeArgs, @org.jetbrains.annotations.NotNull
    java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression> args);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol serializableSyntheticConstructor(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass forClass);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.declarations.IrClass getSuperClassOrAny(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass $this$getSuperClassOrAny);
    
    @org.jetbrains.annotations.Nullable
    public abstract org.jetbrains.kotlin.ir.declarations.IrClass getSuperClassNotAny(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass $this$getSuperClassNotAny);
    
    @org.jetbrains.annotations.Nullable
    public abstract org.jetbrains.kotlin.ir.declarations.IrSimpleFunction findWriteSelfMethod(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass $this$findWriteSelfMethod);
    
    public abstract void serializeAllProperties(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$serializeAllProperties, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator generator, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrClass serializableIrClass, @org.jetbrains.annotations.NotNull
    java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> serializableProperties, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrValueDeclaration objectToSerialize, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrValueDeclaration localOutput, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrValueDeclaration localSerialDesc, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.descriptors.ClassDescriptor kOutputClass, int ignoreIndexTo, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.ir.expressions.IrExpressionBody, ? extends org.jetbrains.kotlin.ir.expressions.IrExpression> initializerAdapter, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super org.jetbrains.kotlin.types.KotlinType, ? extends org.jetbrains.kotlin.ir.expressions.IrExpression> genericGetter);
    
    /**
     * True — ALWAYS
     * False — NEVER
     * null — not specified
     */
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Boolean getEncodeDefaultAnnotationValue(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.declarations.IrProperty $this$getEncodeDefaultAnnotationValue);
    
    @org.jetbrains.annotations.NotNull
    public abstract org.jetbrains.kotlin.ir.expressions.IrExpression formEncodeDecodePropertyCall(@org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$formEncodeDecodePropertyCall, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator enclosingGenerator, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlin.ir.expressions.IrExpression encoder, @org.jetbrains.annotations.NotNull
    org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty property, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super org.jetbrains.kotlin.ir.expressions.IrExpression, ? super org.jetbrains.kotlinx.serialization.compiler.backend.common.SerialTypeInfo, ? extends kotlin.Pair<? extends org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol, ? extends java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression>>> whenHaveSerializer, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.jetbrains.kotlinx.serialization.compiler.backend.common.SerialTypeInfo, ? extends kotlin.Pair<? extends org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol, ? extends java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression>>> whenDoNot, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super org.jetbrains.kotlin.types.KotlinType, ? extends org.jetbrains.kotlin.ir.expressions.IrExpression> genericGetter, @org.jetbrains.annotations.Nullable
    org.jetbrains.kotlin.ir.types.IrType returnTypeHint);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\r\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lorg/jetbrains/kotlinx/serialization/compiler/backend/ir/IrBuilderExtension$BranchBuilder;", "Lorg/jetbrains/kotlin/ir/builders/IrBuilderWithScope;", "irWhen", "Lorg/jetbrains/kotlin/ir/expressions/IrWhen;", "context", "Lorg/jetbrains/kotlin/ir/builders/IrGeneratorContext;", "scope", "Lorg/jetbrains/kotlin/ir/builders/Scope;", "startOffset", "", "endOffset", "(Lorg/jetbrains/kotlin/ir/expressions/IrWhen;Lorg/jetbrains/kotlin/ir/builders/IrGeneratorContext;Lorg/jetbrains/kotlin/ir/builders/Scope;II)V", "getIrWhen", "()Lorg/jetbrains/kotlin/ir/expressions/IrWhen;", "unaryPlus", "", "Lorg/jetbrains/kotlin/ir/expressions/IrBranch;", "kotlinx-serialization"})
    public static final class BranchBuilder extends org.jetbrains.kotlin.ir.builders.IrBuilderWithScope {
        @org.jetbrains.annotations.NotNull
        private final org.jetbrains.kotlin.ir.expressions.IrWhen irWhen = null;
        
        public BranchBuilder(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.expressions.IrWhen irWhen, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrGeneratorContext context, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.Scope scope, int startOffset, int endOffset) {
            super(null, null, 0, 0);
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.jetbrains.kotlin.ir.expressions.IrWhen getIrWhen() {
            return null;
        }
        
        public final void unaryPlus(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.expressions.IrBranch $this$unaryPlus) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
        
        private static org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol getThrowMissedFieldExceptionFunc(org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this) {
            return null;
        }
        
        private static org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol getThrowMissedFieldExceptionArrayFunc(org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this) {
            return null;
        }
        
        public static boolean useFieldMissingOptimization(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this) {
            return false;
        }
        
        public static void contributeFunction(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass $this$contributeFunction, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.FunctionDescriptor descriptor, boolean ignoreWhenMissing, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function2<? super org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder, ? super org.jetbrains.kotlin.ir.declarations.IrFunction, kotlin.Unit> bodyGen) {
        }
        
        public static void contributeConstructor(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass $this$contributeConstructor, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor descriptor, boolean declareNew, boolean overwriteValueParameters, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function2<? super org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder, ? super org.jetbrains.kotlin.ir.declarations.IrConstructor, kotlin.Unit> bodyGen) {
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.IrFunctionExpression createLambdaExpression(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass $this$createLambdaExpression, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.types.IrType type, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder, kotlin.Unit> bodyGen) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.declarations.IrProperty createLazyProperty(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass containingClass, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.types.IrType targetIrType, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.name.Name name, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder, kotlin.Unit> initializerBuilder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.declarations.IrProperty createCompanionValProperty(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass companionClass, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.types.IrType type, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.name.Name name, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder, kotlin.Unit> initializerBuilder) {
            return null;
        }
        
        public static void contributeAnonymousInitializer(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass $this$contributeAnonymousInitializer, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder, kotlin.Unit> bodyGen) {
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.IrExpression getLazyValueExpression(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$getLazyValueExpression, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrValueParameter thisParam, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrProperty property, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.types.IrType type) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression<?> irInvoke(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irInvoke, @org.jetbrains.annotations.Nullable
        org.jetbrains.kotlin.ir.expressions.IrExpression dispatchReceiver, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol callee, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.expressions.IrExpression[] args, @org.jetbrains.annotations.Nullable
        org.jetbrains.kotlin.ir.types.IrType typeHint) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression<?> irInvoke(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irInvoke, @org.jetbrains.annotations.Nullable
        org.jetbrains.kotlin.ir.expressions.IrExpression dispatchReceiver, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol callee, @org.jetbrains.annotations.NotNull
        java.util.List<? extends org.jetbrains.kotlin.ir.types.IrType> typeArguments, @org.jetbrains.annotations.NotNull
        java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression> valueArguments, @org.jetbrains.annotations.Nullable
        org.jetbrains.kotlin.ir.types.IrType returnTypeHint) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.IrExpression createArrayOfExpression(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$createArrayOfExpression, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.types.IrType arrayElementType, @org.jetbrains.annotations.NotNull
        java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression> arrayElements) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol referenceFunctionSymbol(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.ClassDescriptor $this$referenceFunctionSymbol, @org.jetbrains.annotations.NotNull
        java.lang.String functionName, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.ir.declarations.IrSimpleFunction, java.lang.Boolean> predicate) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.IrExpression createPrimitiveArrayOfExpression(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$createPrimitiveArrayOfExpression, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.types.IrType elementPrimitiveType, @org.jetbrains.annotations.NotNull
        java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression> arrayElements) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.IrExpression irBinOp(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irBinOp, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.name.Name name, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.expressions.IrExpression lhs, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.expressions.IrExpression rhs) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.impl.IrGetObjectValueImpl irGetObject(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irGetObject, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.ClassDescriptor classDescriptor) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.impl.IrGetObjectValueImpl irGetObject(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irGetObject, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass irObject) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static <T extends org.jetbrains.kotlin.ir.declarations.IrDeclaration>T buildWithScope(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        T $this$buildWithScope, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super T, kotlin.Unit> builder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.impl.IrVarargImpl irEmptyVararg(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irEmptyVararg, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.ValueParameterDescriptor forValueParameter) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.IrWhen irWhen(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$irWhen, @org.jetbrains.annotations.Nullable
        org.jetbrains.kotlin.ir.types.IrType typeHint, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension.BranchBuilder, kotlin.Unit> block) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.IrElseBranch elseBranch(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension.BranchBuilder $this$elseBranch, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.expressions.IrExpression result) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.types.IrType toIrType(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.types.KotlinType $this$toIrType) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.declarations.IrField getIrField(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty $this$irField) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.declarations.IrProperty searchForProperty(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass $this$searchForProperty, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.PropertyDescriptor descriptor) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.declarations.IrProperty getIrPropertyFrom(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty $this$getIrPropertyFrom, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass thisClass) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlin.jvm.functions.Function1<org.jetbrains.kotlin.descriptors.ValueParameterDescriptor, org.jetbrains.kotlin.ir.expressions.IrExpression> createPropertyByParamReplacer(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$createPropertyByParamReplacer, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass irClass, @org.jetbrains.annotations.NotNull
        java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> serialProperties, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrValueParameter instance, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.resolve.BindingContext bindingContext) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.IrExpression getProperty(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$getProperty, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.expressions.IrExpression receiver, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrProperty property) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.IrExpression setProperty(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$setProperty, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.expressions.IrExpression receiver, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrProperty property, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.expressions.IrExpression value) {
            return null;
        }
        
        public static void generateAnySuperConstructorCall(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$generateAnySuperConstructorCall, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder toBuilder) {
        }
        
        public static void generateGoldenMaskCheck(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$generateGoldenMaskCheck, @org.jetbrains.annotations.NotNull
        java.util.List<? extends org.jetbrains.kotlin.ir.declarations.IrValueDeclaration> seenVars, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperties properties, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.expressions.IrExpression serialDescriptor) {
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.declarations.IrProperty generateSimplePropertyWithBackingField(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.PropertyDescriptor propertyDescriptor, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass propertyParent, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.name.Name fieldName) {
            return null;
        }
        
        private static void generatePropertyBackingFieldIfNeeded(org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, org.jetbrains.kotlin.ir.declarations.IrClass $this$generatePropertyBackingFieldIfNeeded, org.jetbrains.kotlin.descriptors.PropertyDescriptor propertyDescriptor, org.jetbrains.kotlin.ir.declarations.IrProperty originProperty, org.jetbrains.kotlin.name.Name name) {
        }
        
        private static org.jetbrains.kotlin.ir.declarations.IrSimpleFunction generatePropertyAccessor(org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, org.jetbrains.kotlin.ir.declarations.IrClass $this$generatePropertyAccessor, org.jetbrains.kotlin.descriptors.PropertyDescriptor propertyDescriptor, org.jetbrains.kotlin.ir.declarations.IrProperty property, org.jetbrains.kotlin.descriptors.PropertyAccessorDescriptor descriptor, org.jetbrains.kotlin.ir.symbols.IrFieldSymbol fieldSymbol, boolean isGetter) {
            return null;
        }
        
        private static org.jetbrains.kotlin.ir.expressions.IrBlockBody generateDefaultGetterBody(org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, org.jetbrains.kotlin.descriptors.PropertyGetterDescriptor getter, org.jetbrains.kotlin.ir.declarations.IrSimpleFunction irAccessor) {
            return null;
        }
        
        private static org.jetbrains.kotlin.ir.expressions.IrBlockBody generateDefaultSetterBody(org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, org.jetbrains.kotlin.descriptors.PropertySetterDescriptor setter, org.jetbrains.kotlin.ir.declarations.IrSimpleFunction irAccessor) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.IrExpression generateReceiverExpressionForFieldAccess(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.symbols.IrValueSymbol ownerSymbol, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.PropertyDescriptor property) {
            return null;
        }
        
        public static void createParameterDeclarations(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrFunction $this$createParameterDeclarations, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.FunctionDescriptor descriptor, boolean overwriteValueParameters, boolean copyTypeParameters) {
        }
        
        public static void copyTypeParamsFromDescriptor(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrFunction $this$copyTypeParamsFromDescriptor, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.FunctionDescriptor descriptor) {
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.types.SimpleType kClassTypeFor(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.types.TypeProjection projection) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.IrClassReference createClassReference(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.types.KotlinType classType, int startOffset, int endOffset) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.IrClassReference createClassReference(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass irClass, int startOffset, int endOffset) {
            return null;
        }
        
        private static org.jetbrains.kotlin.types.KotlinType getApproximateJvmErasure(org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, org.jetbrains.kotlin.types.KotlinType $this$approximateJvmErasure) {
            return null;
        }
        
        private static org.jetbrains.kotlin.descriptors.ClassDescriptor getClassBound(org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, org.jetbrains.kotlin.descriptors.TypeParameterDescriptor $this$classBound) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.IrClassReference classReference(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$classReference, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.types.KotlinType classType) {
            return null;
        }
        
        private static java.util.Map<org.jetbrains.kotlin.descriptors.ParameterDescriptor, org.jetbrains.kotlin.ir.expressions.IrExpression> extractDefaultValuesFromConstructor(org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, org.jetbrains.kotlin.ir.declarations.IrClass irClass) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static kotlin.jvm.functions.Function1<org.jetbrains.kotlin.ir.expressions.IrExpressionBody, org.jetbrains.kotlin.ir.expressions.IrExpression> createInitializerAdapter(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass irClass, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.descriptors.ValueParameterDescriptor, ? extends org.jetbrains.kotlin.ir.expressions.IrExpression> paramGetReplacer, @org.jetbrains.annotations.Nullable
        kotlin.Pair<? extends org.jetbrains.kotlin.ir.symbols.IrValueSymbol, ? extends kotlin.jvm.functions.Function0<? extends org.jetbrains.kotlin.ir.expressions.IrExpression>> thisGetReplacer) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.declarations.IrFunction findEnumValuesMethod(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.ClassDescriptor enumClass) {
            return null;
        }
        
        private static kotlin.sequences.Sequence<java.lang.String> getEnumMembersNames(org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, org.jetbrains.kotlin.descriptors.ClassDescriptor enumClass) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static java.util.List<org.jetbrains.kotlin.ir.expressions.IrExpression> copyAnnotationsFrom(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$copyAnnotationsFrom, @org.jetbrains.annotations.NotNull
        java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrConstructorCall> annotations) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static org.jetbrains.kotlin.ir.expressions.IrExpression serializerTower(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$serializerTower, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.SerializerIrGenerator generator, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrValueParameter dispatchReceiverParameter, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty property) {
            return null;
        }
        
        private static org.jetbrains.kotlin.ir.expressions.IrExpression wrapWithNullableSerializerIfNeeded(org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$wrapWithNullableSerializerIfNeeded, org.jetbrains.kotlin.types.KotlinType type, org.jetbrains.kotlin.ir.expressions.IrExpression expression, org.jetbrains.kotlin.ir.symbols.IrPropertySymbol nullableProp) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.types.IrType wrapIrTypeIntoKSerializerIrType(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.types.IrType type, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.types.Variance variance) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static org.jetbrains.kotlin.ir.expressions.IrExpression serializerInstance(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$serializerInstance, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.SerializerIrGenerator enclosingGenerator, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrValueParameter dispatchReceiverParameter, @org.jetbrains.annotations.Nullable
        org.jetbrains.kotlin.descriptors.ClassDescriptor serializerClassOriginal, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.types.KotlinType kType, @org.jetbrains.annotations.Nullable
        java.lang.Integer genericIndex) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static org.jetbrains.kotlin.ir.expressions.IrExpression serializerInstance(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$serializerInstance, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator enclosingGenerator, @org.jetbrains.annotations.Nullable
        org.jetbrains.kotlin.descriptors.ClassDescriptor serializerClassOriginal, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.ModuleDescriptor module, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.types.KotlinType kType, @org.jetbrains.annotations.Nullable
        java.lang.Integer genericIndex, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super org.jetbrains.kotlin.types.KotlinType, ? extends org.jetbrains.kotlin.ir.expressions.IrExpression> genericGetter) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static java.util.List<org.jetbrains.kotlin.ir.expressions.IrConstructorCall> collectSerialInfoAnnotations(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass irClass) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static org.jetbrains.kotlin.ir.expressions.IrExpression callSerializerFromCompanion(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$callSerializerFromCompanion, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.types.IrType thisIrType, @org.jetbrains.annotations.NotNull
        java.util.List<? extends org.jetbrains.kotlin.ir.types.IrType> typeArgs, @org.jetbrains.annotations.NotNull
        java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression> args) {
            return null;
        }
        
        private static boolean lastArgumentIsAnnotationArray(org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, org.jetbrains.kotlin.ir.declarations.IrConstructor $this$lastArgumentIsAnnotationArray) {
            return false;
        }
        
        private static org.jetbrains.kotlin.ir.expressions.IrClassReference wrapperClassReference(org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, org.jetbrains.kotlin.ir.builders.IrBuilderWithScope $this$wrapperClassReference, org.jetbrains.kotlin.types.KotlinType classType) {
            return null;
        }
        
        private static org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol findSerializerConstructorForTypeArgumentsSerializers(org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, org.jetbrains.kotlin.descriptors.ClassDescriptor serializer) {
            return null;
        }
        
        private static boolean isSerializationCtor(org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, org.jetbrains.kotlin.ir.declarations.IrConstructor $this$isSerializationCtor) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol serializableSyntheticConstructor(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass forClass) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.declarations.IrClass getSuperClassOrAny(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass $this$getSuperClassOrAny) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static org.jetbrains.kotlin.ir.declarations.IrClass getSuperClassNotAny(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass $this$getSuperClassNotAny) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public static org.jetbrains.kotlin.ir.declarations.IrSimpleFunction findWriteSelfMethod(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass $this$findWriteSelfMethod) {
            return null;
        }
        
        public static void serializeAllProperties(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$serializeAllProperties, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator generator, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrClass serializableIrClass, @org.jetbrains.annotations.NotNull
        java.util.List<org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty> serializableProperties, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrValueDeclaration objectToSerialize, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrValueDeclaration localOutput, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrValueDeclaration localSerialDesc, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.descriptors.ClassDescriptor kOutputClass, int ignoreIndexTo, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super org.jetbrains.kotlin.ir.expressions.IrExpressionBody, ? extends org.jetbrains.kotlin.ir.expressions.IrExpression> initializerAdapter, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super org.jetbrains.kotlin.types.KotlinType, ? extends org.jetbrains.kotlin.ir.expressions.IrExpression> genericGetter) {
        }
        
        /**
         * True — ALWAYS
         * False — NEVER
         * null — not specified
         */
        @org.jetbrains.annotations.Nullable
        public static java.lang.Boolean getEncodeDefaultAnnotationValue(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.declarations.IrProperty $this$getEncodeDefaultAnnotationValue) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public static org.jetbrains.kotlin.ir.expressions.IrExpression formEncodeDecodePropertyCall(@org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.ir.IrBuilderExtension $this, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.builders.IrBlockBodyBuilder $this$formEncodeDecodePropertyCall, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.backend.common.AbstractSerialGenerator enclosingGenerator, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlin.ir.expressions.IrExpression encoder, @org.jetbrains.annotations.NotNull
        org.jetbrains.kotlinx.serialization.compiler.resolve.SerializableProperty property, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function2<? super org.jetbrains.kotlin.ir.expressions.IrExpression, ? super org.jetbrains.kotlinx.serialization.compiler.backend.common.SerialTypeInfo, ? extends kotlin.Pair<? extends org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol, ? extends java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression>>> whenHaveSerializer, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super org.jetbrains.kotlinx.serialization.compiler.backend.common.SerialTypeInfo, ? extends kotlin.Pair<? extends org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol, ? extends java.util.List<? extends org.jetbrains.kotlin.ir.expressions.IrExpression>>> whenDoNot, @org.jetbrains.annotations.Nullable
        kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super org.jetbrains.kotlin.types.KotlinType, ? extends org.jetbrains.kotlin.ir.expressions.IrExpression> genericGetter, @org.jetbrains.annotations.Nullable
        org.jetbrains.kotlin.ir.types.IrType returnTypeHint) {
            return null;
        }
    }
}