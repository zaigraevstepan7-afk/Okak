package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.FeatureSetDefaultsKt;
import defpackage.oe0;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\b\u001a\u00020\n*\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000e*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/FeatureSetDefaultsKt$Dsl;", "Lod2;", "block", "Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;", "-initializefeatureSetDefaults", "(Loe0;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;", "featureSetDefaults", "copy", "(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;Loe0;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults;", "Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;", "Lcom/google/protobuf/FeatureSetDefaultsKt$FeatureSetEditionDefaultKt$Dsl;", "(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;Loe0;)Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefault;", "Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefaultOrBuilder;", "Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "getOverridableFeaturesOrNull", "(Lcom/google/protobuf/DescriptorProtos$FeatureSetDefaults$FeatureSetEditionDefaultOrBuilder;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "overridableFeaturesOrNull", "getFixedFeaturesOrNull", "fixedFeaturesOrNull", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class FeatureSetDefaultsKtKt {
    /* renamed from: -initializefeatureSetDefaults, reason: not valid java name */
    public static final DescriptorProtos.FeatureSetDefaults m27initializefeatureSetDefaults(oe0 oe0Var) {
        oe0Var.getClass();
        FeatureSetDefaultsKt.Dsl.Companion companion = FeatureSetDefaultsKt.Dsl.INSTANCE;
        DescriptorProtos.FeatureSetDefaults.Builder newBuilder = DescriptorProtos.FeatureSetDefaults.newBuilder();
        newBuilder.getClass();
        FeatureSetDefaultsKt.Dsl _create = companion._create(newBuilder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final DescriptorProtos.FeatureSetDefaults copy(DescriptorProtos.FeatureSetDefaults featureSetDefaults, oe0 oe0Var) {
        featureSetDefaults.getClass();
        oe0Var.getClass();
        FeatureSetDefaultsKt.Dsl.Companion companion = FeatureSetDefaultsKt.Dsl.INSTANCE;
        DescriptorProtos.FeatureSetDefaults.Builder builder = featureSetDefaults.toBuilder();
        builder.getClass();
        FeatureSetDefaultsKt.Dsl _create = companion._create(builder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final DescriptorProtos.FeatureSet getFixedFeaturesOrNull(DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder featureSetEditionDefaultOrBuilder) {
        featureSetEditionDefaultOrBuilder.getClass();
        if (featureSetEditionDefaultOrBuilder.hasFixedFeatures()) {
            return featureSetEditionDefaultOrBuilder.getFixedFeatures();
        }
        return null;
    }

    public static final DescriptorProtos.FeatureSet getOverridableFeaturesOrNull(DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefaultOrBuilder featureSetEditionDefaultOrBuilder) {
        featureSetEditionDefaultOrBuilder.getClass();
        if (featureSetEditionDefaultOrBuilder.hasOverridableFeatures()) {
            return featureSetEditionDefaultOrBuilder.getOverridableFeatures();
        }
        return null;
    }

    public static final DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefault copy(DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefault featureSetEditionDefault, oe0 oe0Var) {
        featureSetEditionDefault.getClass();
        oe0Var.getClass();
        FeatureSetDefaultsKt.FeatureSetEditionDefaultKt.Dsl.Companion companion = FeatureSetDefaultsKt.FeatureSetEditionDefaultKt.Dsl.INSTANCE;
        DescriptorProtos.FeatureSetDefaults.FeatureSetEditionDefault.Builder builder = featureSetEditionDefault.toBuilder();
        builder.getClass();
        FeatureSetDefaultsKt.FeatureSetEditionDefaultKt.Dsl _create = companion._create(builder);
        oe0Var.invoke(_create);
        return _create._build();
    }
}
