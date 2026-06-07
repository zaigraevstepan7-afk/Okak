package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.EnumDescriptorProtoKt;
import defpackage.oe0;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\b\u001a\u00020\n*\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/EnumDescriptorProtoKt$Dsl;", "Lod2;", "block", "Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;", "-initializeenumDescriptorProto", "(Loe0;)Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;", "enumDescriptorProto", "copy", "(Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;Loe0;)Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;", "Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto$EnumReservedRange;", "Lcom/google/protobuf/EnumDescriptorProtoKt$EnumReservedRangeKt$Dsl;", "(Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto$EnumReservedRange;Loe0;)Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto$EnumReservedRange;", "Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProtoOrBuilder;", "Lcom/google/protobuf/DescriptorProtos$EnumOptions;", "getOptionsOrNull", "(Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProtoOrBuilder;)Lcom/google/protobuf/DescriptorProtos$EnumOptions;", "optionsOrNull", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class EnumDescriptorProtoKtKt {
    /* renamed from: -initializeenumDescriptorProto, reason: not valid java name */
    public static final DescriptorProtos.EnumDescriptorProto m15initializeenumDescriptorProto(oe0 oe0Var) {
        oe0Var.getClass();
        EnumDescriptorProtoKt.Dsl.Companion companion = EnumDescriptorProtoKt.Dsl.INSTANCE;
        DescriptorProtos.EnumDescriptorProto.Builder newBuilder = DescriptorProtos.EnumDescriptorProto.newBuilder();
        newBuilder.getClass();
        EnumDescriptorProtoKt.Dsl _create = companion._create(newBuilder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final DescriptorProtos.EnumDescriptorProto copy(DescriptorProtos.EnumDescriptorProto enumDescriptorProto, oe0 oe0Var) {
        enumDescriptorProto.getClass();
        oe0Var.getClass();
        EnumDescriptorProtoKt.Dsl.Companion companion = EnumDescriptorProtoKt.Dsl.INSTANCE;
        DescriptorProtos.EnumDescriptorProto.Builder builder = enumDescriptorProto.toBuilder();
        builder.getClass();
        EnumDescriptorProtoKt.Dsl _create = companion._create(builder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final DescriptorProtos.EnumOptions getOptionsOrNull(DescriptorProtos.EnumDescriptorProtoOrBuilder enumDescriptorProtoOrBuilder) {
        enumDescriptorProtoOrBuilder.getClass();
        if (enumDescriptorProtoOrBuilder.hasOptions()) {
            return enumDescriptorProtoOrBuilder.getOptions();
        }
        return null;
    }

    public static final DescriptorProtos.EnumDescriptorProto.EnumReservedRange copy(DescriptorProtos.EnumDescriptorProto.EnumReservedRange enumReservedRange, oe0 oe0Var) {
        enumReservedRange.getClass();
        oe0Var.getClass();
        EnumDescriptorProtoKt.EnumReservedRangeKt.Dsl.Companion companion = EnumDescriptorProtoKt.EnumReservedRangeKt.Dsl.INSTANCE;
        DescriptorProtos.EnumDescriptorProto.EnumReservedRange.Builder builder = enumReservedRange.toBuilder();
        builder.getClass();
        EnumDescriptorProtoKt.EnumReservedRangeKt.Dsl _create = companion._create(builder);
        oe0Var.invoke(_create);
        return _create._build();
    }
}
