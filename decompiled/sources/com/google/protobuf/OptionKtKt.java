package com.google.protobuf;

import com.google.protobuf.Option;
import com.google.protobuf.OptionKt;
import defpackage.oe0;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/OptionKt$Dsl;", "Lod2;", "block", "Lcom/google/protobuf/Option;", "-initializeoption", "(Loe0;)Lcom/google/protobuf/Option;", "option", "copy", "(Lcom/google/protobuf/Option;Loe0;)Lcom/google/protobuf/Option;", "Lcom/google/protobuf/OptionOrBuilder;", "Lcom/google/protobuf/Any;", "getValueOrNull", "(Lcom/google/protobuf/OptionOrBuilder;)Lcom/google/protobuf/Any;", "valueOrNull", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class OptionKtKt {
    /* renamed from: -initializeoption, reason: not valid java name */
    public static final Option m62initializeoption(oe0 oe0Var) {
        oe0Var.getClass();
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.INSTANCE;
        Option.Builder newBuilder = Option.newBuilder();
        newBuilder.getClass();
        OptionKt.Dsl _create = companion._create(newBuilder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final Option copy(Option option, oe0 oe0Var) {
        option.getClass();
        oe0Var.getClass();
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.INSTANCE;
        Option.Builder builder = option.toBuilder();
        builder.getClass();
        OptionKt.Dsl _create = companion._create(builder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final Any getValueOrNull(OptionOrBuilder optionOrBuilder) {
        optionOrBuilder.getClass();
        if (optionOrBuilder.hasValue()) {
            return optionOrBuilder.getValue();
        }
        return null;
    }
}
