package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.FieldOptionsKt;
import defpackage.oe0;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\b\u001a\u00020\n*\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u001a+\u0010\b\u001a\u00020\r*\u00020\r2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000f\"\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0011*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0017\u0010\u0017\u001a\u0004\u0018\u00010\r*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/FieldOptionsKt$Dsl;", "Lod2;", "block", "Lcom/google/protobuf/DescriptorProtos$FieldOptions;", "-initializefieldOptions", "(Loe0;)Lcom/google/protobuf/DescriptorProtos$FieldOptions;", "fieldOptions", "copy", "(Lcom/google/protobuf/DescriptorProtos$FieldOptions;Loe0;)Lcom/google/protobuf/DescriptorProtos$FieldOptions;", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;", "Lcom/google/protobuf/FieldOptionsKt$EditionDefaultKt$Dsl;", "(Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;Loe0;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$EditionDefault;", "Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;", "Lcom/google/protobuf/FieldOptionsKt$FeatureSupportKt$Dsl;", "(Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;Loe0;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;", "Lcom/google/protobuf/DescriptorProtos$FieldOptionsOrBuilder;", "Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "getFeaturesOrNull", "(Lcom/google/protobuf/DescriptorProtos$FieldOptionsOrBuilder;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "featuresOrNull", "getFeatureSupportOrNull", "(Lcom/google/protobuf/DescriptorProtos$FieldOptionsOrBuilder;)Lcom/google/protobuf/DescriptorProtos$FieldOptions$FeatureSupport;", "featureSupportOrNull", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class FieldOptionsKtKt {
    /* renamed from: -initializefieldOptions, reason: not valid java name */
    public static final DescriptorProtos.FieldOptions m37initializefieldOptions(oe0 oe0Var) {
        oe0Var.getClass();
        FieldOptionsKt.Dsl.Companion companion = FieldOptionsKt.Dsl.INSTANCE;
        DescriptorProtos.FieldOptions.Builder newBuilder = DescriptorProtos.FieldOptions.newBuilder();
        newBuilder.getClass();
        FieldOptionsKt.Dsl _create = companion._create(newBuilder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DescriptorProtos.FieldOptions copy(DescriptorProtos.FieldOptions fieldOptions, oe0 oe0Var) {
        fieldOptions.getClass();
        oe0Var.getClass();
        FieldOptionsKt.Dsl.Companion companion = FieldOptionsKt.Dsl.INSTANCE;
        BuilderType builder = fieldOptions.toBuilder();
        builder.getClass();
        FieldOptionsKt.Dsl _create = companion._create((DescriptorProtos.FieldOptions.Builder) builder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final DescriptorProtos.FieldOptions.FeatureSupport getFeatureSupportOrNull(DescriptorProtos.FieldOptionsOrBuilder fieldOptionsOrBuilder) {
        fieldOptionsOrBuilder.getClass();
        if (fieldOptionsOrBuilder.hasFeatureSupport()) {
            return fieldOptionsOrBuilder.getFeatureSupport();
        }
        return null;
    }

    public static final DescriptorProtos.FeatureSet getFeaturesOrNull(DescriptorProtos.FieldOptionsOrBuilder fieldOptionsOrBuilder) {
        fieldOptionsOrBuilder.getClass();
        if (fieldOptionsOrBuilder.hasFeatures()) {
            return fieldOptionsOrBuilder.getFeatures();
        }
        return null;
    }

    public static final DescriptorProtos.FieldOptions.EditionDefault copy(DescriptorProtos.FieldOptions.EditionDefault editionDefault, oe0 oe0Var) {
        editionDefault.getClass();
        oe0Var.getClass();
        FieldOptionsKt.EditionDefaultKt.Dsl.Companion companion = FieldOptionsKt.EditionDefaultKt.Dsl.INSTANCE;
        DescriptorProtos.FieldOptions.EditionDefault.Builder builder = editionDefault.toBuilder();
        builder.getClass();
        FieldOptionsKt.EditionDefaultKt.Dsl _create = companion._create(builder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final DescriptorProtos.FieldOptions.FeatureSupport copy(DescriptorProtos.FieldOptions.FeatureSupport featureSupport, oe0 oe0Var) {
        featureSupport.getClass();
        oe0Var.getClass();
        FieldOptionsKt.FeatureSupportKt.Dsl.Companion companion = FieldOptionsKt.FeatureSupportKt.Dsl.INSTANCE;
        DescriptorProtos.FieldOptions.FeatureSupport.Builder builder = featureSupport.toBuilder();
        builder.getClass();
        FieldOptionsKt.FeatureSupportKt.Dsl _create = companion._create(builder);
        oe0Var.invoke(_create);
        return _create._build();
    }
}
