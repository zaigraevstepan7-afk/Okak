package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.EnumValueOptionsKt;
import defpackage.oe0;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\"\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/EnumValueOptionsKt$Dsl;", "Lod2;", "block", "Lcom/google/protobuf/DescriptorProtos$EnumValueOptions;", "-initializeenumValueOptions", "(Loe0;)Lcom/google/protobuf/DescriptorProtos$EnumValueOptions;", "enumValueOptions", "copy", "(Lcom/google/protobuf/DescriptorProtos$EnumValueOptions;Loe0;)Lcom/google/protobuf/DescriptorProtos$EnumValueOptions;", "Lcom/google/protobuf/DescriptorProtos$EnumValueOptionsOrBuilder;", "Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "getFeaturesOrNull", "(Lcom/google/protobuf/DescriptorProtos$EnumValueOptionsOrBuilder;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "featuresOrNull", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;", "getFeatureSupportOrNull", "(Lcom/google/protobuf/DescriptorProtos$EnumValueOptionsOrBuilder;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;", "featureSupportOrNull", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class EnumValueOptionsKtKt {
    /* renamed from: -initializeenumValueOptions, reason: not valid java name */
    public static final DescriptorProtos.EnumValueOptions m22initializeenumValueOptions(oe0 oe0Var) {
        oe0Var.getClass();
        EnumValueOptionsKt.Dsl.Companion companion = EnumValueOptionsKt.Dsl.INSTANCE;
        DescriptorProtos.EnumValueOptions.Builder newBuilder = DescriptorProtos.EnumValueOptions.newBuilder();
        newBuilder.getClass();
        EnumValueOptionsKt.Dsl _create = companion._create(newBuilder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DescriptorProtos.EnumValueOptions copy(DescriptorProtos.EnumValueOptions enumValueOptions, oe0 oe0Var) {
        enumValueOptions.getClass();
        oe0Var.getClass();
        EnumValueOptionsKt.Dsl.Companion companion = EnumValueOptionsKt.Dsl.INSTANCE;
        BuilderType builder = enumValueOptions.toBuilder();
        builder.getClass();
        EnumValueOptionsKt.Dsl _create = companion._create((DescriptorProtos.EnumValueOptions.Builder) builder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final DescriptorProtos.FieldOptions.FeatureSupport getFeatureSupportOrNull(DescriptorProtos.EnumValueOptionsOrBuilder enumValueOptionsOrBuilder) {
        enumValueOptionsOrBuilder.getClass();
        if (enumValueOptionsOrBuilder.hasFeatureSupport()) {
            return enumValueOptionsOrBuilder.getFeatureSupport();
        }
        return null;
    }

    public static final DescriptorProtos.FeatureSet getFeaturesOrNull(DescriptorProtos.EnumValueOptionsOrBuilder enumValueOptionsOrBuilder) {
        enumValueOptionsOrBuilder.getClass();
        if (enumValueOptionsOrBuilder.hasFeatures()) {
            return enumValueOptionsOrBuilder.getFeatures();
        }
        return null;
    }
}
