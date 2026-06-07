package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.UninterpretedOptionKt;
import defpackage.oe0;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\b\u001a\u00020\n*\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/UninterpretedOptionKt$Dsl;", "Lod2;", "block", "Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;", "-initializeuninterpretedOption", "(Loe0;)Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;", "uninterpretedOption", "copy", "(Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;Loe0;)Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;", "Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$NamePart;", "Lcom/google/protobuf/UninterpretedOptionKt$NamePartKt$Dsl;", "(Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$NamePart;Loe0;)Lcom/google/protobuf/DescriptorProtos$UninterpretedOption$NamePart;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class UninterpretedOptionKtKt {
    /* renamed from: -initializeuninterpretedOption, reason: not valid java name */
    public static final DescriptorProtos.UninterpretedOption m77initializeuninterpretedOption(oe0 oe0Var) {
        oe0Var.getClass();
        UninterpretedOptionKt.Dsl.Companion companion = UninterpretedOptionKt.Dsl.INSTANCE;
        DescriptorProtos.UninterpretedOption.Builder newBuilder = DescriptorProtos.UninterpretedOption.newBuilder();
        newBuilder.getClass();
        UninterpretedOptionKt.Dsl _create = companion._create(newBuilder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final DescriptorProtos.UninterpretedOption copy(DescriptorProtos.UninterpretedOption uninterpretedOption, oe0 oe0Var) {
        uninterpretedOption.getClass();
        oe0Var.getClass();
        UninterpretedOptionKt.Dsl.Companion companion = UninterpretedOptionKt.Dsl.INSTANCE;
        DescriptorProtos.UninterpretedOption.Builder builder = uninterpretedOption.toBuilder();
        builder.getClass();
        UninterpretedOptionKt.Dsl _create = companion._create(builder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final DescriptorProtos.UninterpretedOption.NamePart copy(DescriptorProtos.UninterpretedOption.NamePart namePart, oe0 oe0Var) {
        namePart.getClass();
        oe0Var.getClass();
        UninterpretedOptionKt.NamePartKt.Dsl.Companion companion = UninterpretedOptionKt.NamePartKt.Dsl.INSTANCE;
        DescriptorProtos.UninterpretedOption.NamePart.Builder builder = namePart.toBuilder();
        builder.getClass();
        UninterpretedOptionKt.NamePartKt.Dsl _create = companion._create(builder);
        oe0Var.invoke(_create);
        return _create._build();
    }
}
