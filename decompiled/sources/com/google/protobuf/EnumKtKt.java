package com.google.protobuf;

import com.google.protobuf.Enum;
import com.google.protobuf.EnumKt;
import defpackage.oe0;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/EnumKt$Dsl;", "Lod2;", "block", "Lcom/google/protobuf/Enum;", "-initializeenum", "(Loe0;)Lcom/google/protobuf/Enum;", "enum", "copy", "(Lcom/google/protobuf/Enum;Loe0;)Lcom/google/protobuf/Enum;", "Lcom/google/protobuf/EnumOrBuilder;", "Lcom/google/protobuf/SourceContext;", "getSourceContextOrNull", "(Lcom/google/protobuf/EnumOrBuilder;)Lcom/google/protobuf/SourceContext;", "sourceContextOrNull", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class EnumKtKt {
    /* renamed from: -initializeenum, reason: not valid java name */
    public static final Enum m16initializeenum(oe0 oe0Var) {
        oe0Var.getClass();
        EnumKt.Dsl.Companion companion = EnumKt.Dsl.INSTANCE;
        Enum.Builder newBuilder = Enum.newBuilder();
        newBuilder.getClass();
        EnumKt.Dsl _create = companion._create(newBuilder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final Enum copy(Enum r1, oe0 oe0Var) {
        r1.getClass();
        oe0Var.getClass();
        EnumKt.Dsl.Companion companion = EnumKt.Dsl.INSTANCE;
        Enum.Builder builder = r1.toBuilder();
        builder.getClass();
        EnumKt.Dsl _create = companion._create(builder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final SourceContext getSourceContextOrNull(EnumOrBuilder enumOrBuilder) {
        enumOrBuilder.getClass();
        if (enumOrBuilder.hasSourceContext()) {
            return enumOrBuilder.getSourceContext();
        }
        return null;
    }
}
