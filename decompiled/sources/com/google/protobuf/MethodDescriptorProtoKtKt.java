package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.MethodDescriptorProtoKt;
import defpackage.oe0;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/MethodDescriptorProtoKt$Dsl;", "Lod2;", "block", "Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;", "-initializemethodDescriptorProto", "(Loe0;)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;", "methodDescriptorProto", "copy", "(Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;Loe0;)Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProto;", "Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProtoOrBuilder;", "Lcom/google/protobuf/DescriptorProtos$MethodOptions;", "getOptionsOrNull", "(Lcom/google/protobuf/DescriptorProtos$MethodDescriptorProtoOrBuilder;)Lcom/google/protobuf/DescriptorProtos$MethodOptions;", "optionsOrNull", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class MethodDescriptorProtoKtKt {
    /* renamed from: -initializemethodDescriptorProto, reason: not valid java name */
    public static final DescriptorProtos.MethodDescriptorProto m54initializemethodDescriptorProto(oe0 oe0Var) {
        oe0Var.getClass();
        MethodDescriptorProtoKt.Dsl.Companion companion = MethodDescriptorProtoKt.Dsl.INSTANCE;
        DescriptorProtos.MethodDescriptorProto.Builder newBuilder = DescriptorProtos.MethodDescriptorProto.newBuilder();
        newBuilder.getClass();
        MethodDescriptorProtoKt.Dsl _create = companion._create(newBuilder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final DescriptorProtos.MethodDescriptorProto copy(DescriptorProtos.MethodDescriptorProto methodDescriptorProto, oe0 oe0Var) {
        methodDescriptorProto.getClass();
        oe0Var.getClass();
        MethodDescriptorProtoKt.Dsl.Companion companion = MethodDescriptorProtoKt.Dsl.INSTANCE;
        DescriptorProtos.MethodDescriptorProto.Builder builder = methodDescriptorProto.toBuilder();
        builder.getClass();
        MethodDescriptorProtoKt.Dsl _create = companion._create(builder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final DescriptorProtos.MethodOptions getOptionsOrNull(DescriptorProtos.MethodDescriptorProtoOrBuilder methodDescriptorProtoOrBuilder) {
        methodDescriptorProtoOrBuilder.getClass();
        if (methodDescriptorProtoOrBuilder.hasOptions()) {
            return methodDescriptorProtoOrBuilder.getOptions();
        }
        return null;
    }
}
