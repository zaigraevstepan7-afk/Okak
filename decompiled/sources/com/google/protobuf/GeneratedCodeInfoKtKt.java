package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.GeneratedCodeInfoKt;
import defpackage.oe0;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\b\u001a\u00020\n*\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/GeneratedCodeInfoKt$Dsl;", "Lod2;", "block", "Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo;", "-initializegeneratedCodeInfo", "(Loe0;)Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo;", "generatedCodeInfo", "copy", "(Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo;Loe0;)Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo;", "Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation;", "Lcom/google/protobuf/GeneratedCodeInfoKt$AnnotationKt$Dsl;", "(Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation;Loe0;)Lcom/google/protobuf/DescriptorProtos$GeneratedCodeInfo$Annotation;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class GeneratedCodeInfoKtKt {
    /* renamed from: -initializegeneratedCodeInfo, reason: not valid java name */
    public static final DescriptorProtos.GeneratedCodeInfo m46initializegeneratedCodeInfo(oe0 oe0Var) {
        oe0Var.getClass();
        GeneratedCodeInfoKt.Dsl.Companion companion = GeneratedCodeInfoKt.Dsl.INSTANCE;
        DescriptorProtos.GeneratedCodeInfo.Builder newBuilder = DescriptorProtos.GeneratedCodeInfo.newBuilder();
        newBuilder.getClass();
        GeneratedCodeInfoKt.Dsl _create = companion._create(newBuilder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final DescriptorProtos.GeneratedCodeInfo copy(DescriptorProtos.GeneratedCodeInfo generatedCodeInfo, oe0 oe0Var) {
        generatedCodeInfo.getClass();
        oe0Var.getClass();
        GeneratedCodeInfoKt.Dsl.Companion companion = GeneratedCodeInfoKt.Dsl.INSTANCE;
        DescriptorProtos.GeneratedCodeInfo.Builder builder = generatedCodeInfo.toBuilder();
        builder.getClass();
        GeneratedCodeInfoKt.Dsl _create = companion._create(builder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final DescriptorProtos.GeneratedCodeInfo.Annotation copy(DescriptorProtos.GeneratedCodeInfo.Annotation annotation, oe0 oe0Var) {
        annotation.getClass();
        oe0Var.getClass();
        GeneratedCodeInfoKt.AnnotationKt.Dsl.Companion companion = GeneratedCodeInfoKt.AnnotationKt.Dsl.INSTANCE;
        DescriptorProtos.GeneratedCodeInfo.Annotation.Builder builder = annotation.toBuilder();
        builder.getClass();
        GeneratedCodeInfoKt.AnnotationKt.Dsl _create = companion._create(builder);
        oe0Var.invoke(_create);
        return _create._build();
    }
}
