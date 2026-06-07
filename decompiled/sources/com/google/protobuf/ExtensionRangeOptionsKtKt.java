package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.ExtensionRangeOptionsKt;
import defpackage.oe0;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\b\u001a\u00020\n*\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/ExtensionRangeOptionsKt$Dsl;", "Lod2;", "block", "Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;", "-initializeextensionRangeOptions", "(Loe0;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;", "extensionRangeOptions", "copy", "(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;Loe0;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;", "Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;", "Lcom/google/protobuf/ExtensionRangeOptionsKt$DeclarationKt$Dsl;", "(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;Loe0;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;", "Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptionsOrBuilder;", "Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "getFeaturesOrNull", "(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptionsOrBuilder;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "featuresOrNull", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ExtensionRangeOptionsKtKt {
    /* renamed from: -initializeextensionRangeOptions, reason: not valid java name */
    public static final DescriptorProtos.ExtensionRangeOptions m25initializeextensionRangeOptions(oe0 oe0Var) {
        oe0Var.getClass();
        ExtensionRangeOptionsKt.Dsl.Companion companion = ExtensionRangeOptionsKt.Dsl.INSTANCE;
        DescriptorProtos.ExtensionRangeOptions.Builder newBuilder = DescriptorProtos.ExtensionRangeOptions.newBuilder();
        newBuilder.getClass();
        ExtensionRangeOptionsKt.Dsl _create = companion._create(newBuilder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DescriptorProtos.ExtensionRangeOptions copy(DescriptorProtos.ExtensionRangeOptions extensionRangeOptions, oe0 oe0Var) {
        extensionRangeOptions.getClass();
        oe0Var.getClass();
        ExtensionRangeOptionsKt.Dsl.Companion companion = ExtensionRangeOptionsKt.Dsl.INSTANCE;
        BuilderType builder = extensionRangeOptions.toBuilder();
        builder.getClass();
        ExtensionRangeOptionsKt.Dsl _create = companion._create((DescriptorProtos.ExtensionRangeOptions.Builder) builder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final DescriptorProtos.FeatureSet getFeaturesOrNull(DescriptorProtos.ExtensionRangeOptionsOrBuilder extensionRangeOptionsOrBuilder) {
        extensionRangeOptionsOrBuilder.getClass();
        if (extensionRangeOptionsOrBuilder.hasFeatures()) {
            return extensionRangeOptionsOrBuilder.getFeatures();
        }
        return null;
    }

    public static final DescriptorProtos.ExtensionRangeOptions.Declaration copy(DescriptorProtos.ExtensionRangeOptions.Declaration declaration, oe0 oe0Var) {
        declaration.getClass();
        oe0Var.getClass();
        ExtensionRangeOptionsKt.DeclarationKt.Dsl.Companion companion = ExtensionRangeOptionsKt.DeclarationKt.Dsl.INSTANCE;
        DescriptorProtos.ExtensionRangeOptions.Declaration.Builder builder = declaration.toBuilder();
        builder.getClass();
        ExtensionRangeOptionsKt.DeclarationKt.Dsl _create = companion._create(builder);
        oe0Var.invoke(_create);
        return _create._build();
    }
}
