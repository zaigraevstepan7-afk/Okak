package com.google.protobuf;

import com.google.protobuf.Mixin;
import com.google.protobuf.MixinKt;
import defpackage.oe0;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lcom/google/protobuf/MixinKt$Dsl;", "Lod2;", "block", "Lcom/google/protobuf/Mixin;", "-initializemixin", "(Loe0;)Lcom/google/protobuf/Mixin;", "mixin", "copy", "(Lcom/google/protobuf/Mixin;Loe0;)Lcom/google/protobuf/Mixin;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 2, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class MixinKtKt {
    /* renamed from: -initializemixin, reason: not valid java name */
    public static final Mixin m58initializemixin(oe0 oe0Var) {
        oe0Var.getClass();
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.INSTANCE;
        Mixin.Builder newBuilder = Mixin.newBuilder();
        newBuilder.getClass();
        MixinKt.Dsl _create = companion._create(newBuilder);
        oe0Var.invoke(_create);
        return _create._build();
    }

    public static final Mixin copy(Mixin mixin, oe0 oe0Var) {
        mixin.getClass();
        oe0Var.getClass();
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.INSTANCE;
        Mixin.Builder builder = mixin.toBuilder();
        builder.getClass();
        MixinKt.Dsl _create = companion._create(builder);
        oe0Var.invoke(_create);
        return _create._build();
    }
}
