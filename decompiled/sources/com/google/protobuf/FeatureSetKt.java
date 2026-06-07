package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.kotlin.ExtensionList;
import defpackage.oe0;
import defpackage.yq1;
import defpackage.yx;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"Lcom/google/protobuf/FeatureSetKt;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/google/protobuf/FeatureSetKt$VisibilityFeatureKt$Dsl;", "Lod2;", "block", "Lcom/google/protobuf/DescriptorProtos$FeatureSet$VisibilityFeature;", "-initializevisibilityFeature", "(Loe0;)Lcom/google/protobuf/DescriptorProtos$FeatureSet$VisibilityFeature;", "visibilityFeature", "Dsl", "VisibilityFeatureKt", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class FeatureSetKt {
    public static final FeatureSetKt INSTANCE = new FeatureSetKt();

    private FeatureSetKt() {
    }

    /* renamed from: -initializevisibilityFeature, reason: not valid java name */
    public final DescriptorProtos.FeatureSet.VisibilityFeature m28initializevisibilityFeature(oe0 block) {
        block.getClass();
        VisibilityFeatureKt.Dsl.Companion companion = VisibilityFeatureKt.Dsl.INSTANCE;
        DescriptorProtos.FeatureSet.VisibilityFeature.Builder newBuilder = DescriptorProtos.FeatureSet.VisibilityFeature.newBuilder();
        newBuilder.getClass();
        VisibilityFeatureKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/FeatureSetKt$VisibilityFeatureKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class VisibilityFeatureKt {
        public static final VisibilityFeatureKt INSTANCE = new VisibilityFeatureKt();

        private VisibilityFeatureKt() {
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/google/protobuf/FeatureSetKt$VisibilityFeatureKt$Dsl;", "", "_builder", "Lcom/google/protobuf/DescriptorProtos$FeatureSet$VisibilityFeature$Builder;", "(Lcom/google/protobuf/DescriptorProtos$FeatureSet$VisibilityFeature$Builder;)V", "_build", "Lcom/google/protobuf/DescriptorProtos$FeatureSet$VisibilityFeature;", "Companion", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final DescriptorProtos.FeatureSet.VisibilityFeature.Builder _builder;

            private Dsl(DescriptorProtos.FeatureSet.VisibilityFeature.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ DescriptorProtos.FeatureSet.VisibilityFeature _build() {
                DescriptorProtos.FeatureSet.VisibilityFeature build = this._builder.build();
                build.getClass();
                return build;
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/FeatureSetKt$VisibilityFeatureKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/FeatureSetKt$VisibilityFeatureKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$FeatureSet$VisibilityFeature$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
            /* loaded from: classes.dex */
            public static final class Companion {
                public /* synthetic */ Companion(yx yxVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(DescriptorProtos.FeatureSet.VisibilityFeature.Builder builder) {
                    builder.getClass();
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(DescriptorProtos.FeatureSet.VisibilityFeature.Builder builder, yx yxVar) {
                this(builder);
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 q2\u00020\u0001:\u0001qB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u000eJ\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u000eJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u000eJ.\u0010 \u001a\u00028\u0000\"\b\b\u0000\u0010\u001d*\u00020\u00012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\u0002¢\u0006\u0004\b \u0010!J@\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060$\"\b\b\u0000\u0010\"*\u00020\u00012\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#0\u001eH\u0087\u0002¢\u0006\u0004\b%\u0010&J\"\u0010'\u001a\u00020\f2\u0010\u0010\u001f\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u001eH\u0086\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\t2\u0010\u0010\u001f\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u00030\u001e¢\u0006\u0004\b)\u0010*J3\u0010,\u001a\u00020\t\"\b\b\u0000\u0010\u001d*\u00020\u00012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010+\u001a\u00028\u0000¢\u0006\u0004\b,\u0010-J<\u0010/\u001a\u00020\t\"\u000e\b\u0000\u0010\u001d*\b\u0012\u0004\u0012\u00028\u00000.2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010+\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b/\u00100J,\u0010/\u001a\u00020\t2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002010\u001e2\u0006\u0010+\u001a\u000201H\u0086\n¢\u0006\u0004\b/\u00102J6\u0010/\u001a\u00020\t\"\b\b\u0000\u0010\u001d*\u0002032\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010+\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b/\u00104J/\u00105\u001a\u00020\t\"\b\b\u0000\u0010\"*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060$2\u0006\u0010+\u001a\u00028\u0000¢\u0006\u0004\b5\u00106J2\u00107\u001a\u00020\t\"\b\b\u0000\u0010\"*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060$2\u0006\u0010+\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b7\u00106J5\u0010:\u001a\u00020\t\"\b\b\u0000\u0010\"*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060$2\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u000008¢\u0006\u0004\b:\u0010;J8\u00107\u001a\u00020\t\"\b\b\u0000\u0010\"*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060$2\f\u00109\u001a\b\u0012\u0004\u0012\u00028\u000008H\u0086\n¢\u0006\u0004\b7\u0010;J:\u0010/\u001a\u00020\t\"\b\b\u0000\u0010\"*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060$2\u0006\u0010=\u001a\u00020<2\u0006\u0010+\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b/\u0010>J\u001e\u0010)\u001a\u00020\t*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u00060$H\u0086\b¢\u0006\u0004\b)\u0010?R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R$\u0010F\u001a\u00020A2\u0006\u0010+\u001a\u00020A8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010L\u001a\u00020G2\u0006\u0010+\u001a\u00020G8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010R\u001a\u00020M2\u0006\u0010+\u001a\u00020M8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010X\u001a\u00020S2\u0006\u0010+\u001a\u00020S8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010^\u001a\u00020Y2\u0006\u0010+\u001a\u00020Y8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010d\u001a\u00020_2\u0006\u0010+\u001a\u00020_8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010j\u001a\u00020e2\u0006\u0010+\u001a\u00020e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR$\u0010p\u001a\u00020k2\u0006\u0010+\u001a\u00020k8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o¨\u0006r"}, d2 = {"Lcom/google/protobuf/FeatureSetKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "_build", "()Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "Lod2;", "clearFieldPresence", "()V", "", "hasFieldPresence", "()Z", "clearEnumType", "hasEnumType", "clearRepeatedFieldEncoding", "hasRepeatedFieldEncoding", "clearUtf8Validation", "hasUtf8Validation", "clearMessageEncoding", "hasMessageEncoding", "clearJsonFormat", "hasJsonFormat", "clearEnforceNamingStyle", "hasEnforceNamingStyle", "clearDefaultSymbolVisibility", "hasDefaultSymbolVisibility", "T", "Lcom/google/protobuf/ExtensionLite;", "extension", "get", "(Lcom/google/protobuf/ExtensionLite;)Ljava/lang/Object;", "E", "", "Lcom/google/protobuf/kotlin/ExtensionList;", "-getRepeatedExtension", "(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/kotlin/ExtensionList;", "contains", "(Lcom/google/protobuf/ExtensionLite;)Z", "clear", "(Lcom/google/protobuf/ExtensionLite;)V", "value", "setExtension", "(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)V", "", "set", "(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Comparable;)V", "Lcom/google/protobuf/ByteString;", "(Lcom/google/protobuf/ExtensionLite;Lcom/google/protobuf/ByteString;)V", "Lcom/google/protobuf/MessageLite;", "(Lcom/google/protobuf/ExtensionLite;Lcom/google/protobuf/MessageLite;)V", "add", "(Lcom/google/protobuf/kotlin/ExtensionList;Ljava/lang/Object;)V", "plusAssign", "", "values", "addAll", "(Lcom/google/protobuf/kotlin/ExtensionList;Ljava/lang/Iterable;)V", "", "index", "(Lcom/google/protobuf/kotlin/ExtensionList;ILjava/lang/Object;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;)V", "Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;", "Lcom/google/protobuf/DescriptorProtos$FeatureSet$FieldPresence;", "getFieldPresence", "()Lcom/google/protobuf/DescriptorProtos$FeatureSet$FieldPresence;", "setFieldPresence", "(Lcom/google/protobuf/DescriptorProtos$FeatureSet$FieldPresence;)V", "fieldPresence", "Lcom/google/protobuf/DescriptorProtos$FeatureSet$EnumType;", "getEnumType", "()Lcom/google/protobuf/DescriptorProtos$FeatureSet$EnumType;", "setEnumType", "(Lcom/google/protobuf/DescriptorProtos$FeatureSet$EnumType;)V", "enumType", "Lcom/google/protobuf/DescriptorProtos$FeatureSet$RepeatedFieldEncoding;", "getRepeatedFieldEncoding", "()Lcom/google/protobuf/DescriptorProtos$FeatureSet$RepeatedFieldEncoding;", "setRepeatedFieldEncoding", "(Lcom/google/protobuf/DescriptorProtos$FeatureSet$RepeatedFieldEncoding;)V", "repeatedFieldEncoding", "Lcom/google/protobuf/DescriptorProtos$FeatureSet$Utf8Validation;", "getUtf8Validation", "()Lcom/google/protobuf/DescriptorProtos$FeatureSet$Utf8Validation;", "setUtf8Validation", "(Lcom/google/protobuf/DescriptorProtos$FeatureSet$Utf8Validation;)V", "utf8Validation", "Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;", "getMessageEncoding", "()Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;", "setMessageEncoding", "(Lcom/google/protobuf/DescriptorProtos$FeatureSet$MessageEncoding;)V", "messageEncoding", "Lcom/google/protobuf/DescriptorProtos$FeatureSet$JsonFormat;", "getJsonFormat", "()Lcom/google/protobuf/DescriptorProtos$FeatureSet$JsonFormat;", "setJsonFormat", "(Lcom/google/protobuf/DescriptorProtos$FeatureSet$JsonFormat;)V", "jsonFormat", "Lcom/google/protobuf/DescriptorProtos$FeatureSet$EnforceNamingStyle;", "getEnforceNamingStyle", "()Lcom/google/protobuf/DescriptorProtos$FeatureSet$EnforceNamingStyle;", "setEnforceNamingStyle", "(Lcom/google/protobuf/DescriptorProtos$FeatureSet$EnforceNamingStyle;)V", "enforceNamingStyle", "Lcom/google/protobuf/DescriptorProtos$FeatureSet$VisibilityFeature$DefaultSymbolVisibility;", "getDefaultSymbolVisibility", "()Lcom/google/protobuf/DescriptorProtos$FeatureSet$VisibilityFeature$DefaultSymbolVisibility;", "setDefaultSymbolVisibility", "(Lcom/google/protobuf/DescriptorProtos$FeatureSet$VisibilityFeature$DefaultSymbolVisibility;)V", "defaultSymbolVisibility", "Companion", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DescriptorProtos.FeatureSet.Builder _builder;

        private Dsl(DescriptorProtos.FeatureSet.Builder builder) {
            this._builder = builder;
        }

        /* renamed from: -getRepeatedExtension, reason: not valid java name */
        public final /* synthetic */ ExtensionList m29getRepeatedExtension(ExtensionLite extension) {
            extension.getClass();
            Object extension2 = this._builder.getExtension(extension);
            extension2.getClass();
            return new ExtensionList(extension, (List) extension2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final /* synthetic */ DescriptorProtos.FeatureSet _build() {
            MessageType build = this._builder.build();
            build.getClass();
            return (DescriptorProtos.FeatureSet) build;
        }

        public final /* synthetic */ void add(ExtensionList extensionList, Object obj) {
            extensionList.getClass();
            obj.getClass();
            this._builder.addExtension(extensionList.getExtension(), obj);
        }

        public final /* synthetic */ void addAll(ExtensionList extensionList, Iterable iterable) {
            extensionList.getClass();
            iterable.getClass();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                add(extensionList, it.next());
            }
        }

        public final /* synthetic */ void clear(ExtensionList<?, DescriptorProtos.FeatureSet> extensionList) {
            extensionList.getClass();
            clear(extensionList.getExtension());
        }

        public final void clearDefaultSymbolVisibility() {
            this._builder.clearDefaultSymbolVisibility();
        }

        public final void clearEnforceNamingStyle() {
            this._builder.clearEnforceNamingStyle();
        }

        public final void clearEnumType() {
            this._builder.clearEnumType();
        }

        public final void clearFieldPresence() {
            this._builder.clearFieldPresence();
        }

        public final void clearJsonFormat() {
            this._builder.clearJsonFormat();
        }

        public final void clearMessageEncoding() {
            this._builder.clearMessageEncoding();
        }

        public final void clearRepeatedFieldEncoding() {
            this._builder.clearRepeatedFieldEncoding();
        }

        public final void clearUtf8Validation() {
            this._builder.clearUtf8Validation();
        }

        public final /* synthetic */ boolean contains(ExtensionLite extension) {
            extension.getClass();
            return this._builder.hasExtension(extension);
        }

        public final /* synthetic */ Object get(ExtensionLite extension) {
            extension.getClass();
            if (extension.isRepeated()) {
                Object obj = get(extension);
                obj.getClass();
                return obj;
            }
            Object extension2 = this._builder.getExtension(extension);
            extension2.getClass();
            return extension2;
        }

        public final DescriptorProtos.FeatureSet.VisibilityFeature.DefaultSymbolVisibility getDefaultSymbolVisibility() {
            DescriptorProtos.FeatureSet.VisibilityFeature.DefaultSymbolVisibility defaultSymbolVisibility = this._builder.getDefaultSymbolVisibility();
            defaultSymbolVisibility.getClass();
            return defaultSymbolVisibility;
        }

        public final DescriptorProtos.FeatureSet.EnforceNamingStyle getEnforceNamingStyle() {
            DescriptorProtos.FeatureSet.EnforceNamingStyle enforceNamingStyle = this._builder.getEnforceNamingStyle();
            enforceNamingStyle.getClass();
            return enforceNamingStyle;
        }

        public final DescriptorProtos.FeatureSet.EnumType getEnumType() {
            DescriptorProtos.FeatureSet.EnumType enumType = this._builder.getEnumType();
            enumType.getClass();
            return enumType;
        }

        public final DescriptorProtos.FeatureSet.FieldPresence getFieldPresence() {
            DescriptorProtos.FeatureSet.FieldPresence fieldPresence = this._builder.getFieldPresence();
            fieldPresence.getClass();
            return fieldPresence;
        }

        public final DescriptorProtos.FeatureSet.JsonFormat getJsonFormat() {
            DescriptorProtos.FeatureSet.JsonFormat jsonFormat = this._builder.getJsonFormat();
            jsonFormat.getClass();
            return jsonFormat;
        }

        public final DescriptorProtos.FeatureSet.MessageEncoding getMessageEncoding() {
            DescriptorProtos.FeatureSet.MessageEncoding messageEncoding = this._builder.getMessageEncoding();
            messageEncoding.getClass();
            return messageEncoding;
        }

        public final DescriptorProtos.FeatureSet.RepeatedFieldEncoding getRepeatedFieldEncoding() {
            DescriptorProtos.FeatureSet.RepeatedFieldEncoding repeatedFieldEncoding = this._builder.getRepeatedFieldEncoding();
            repeatedFieldEncoding.getClass();
            return repeatedFieldEncoding;
        }

        public final DescriptorProtos.FeatureSet.Utf8Validation getUtf8Validation() {
            DescriptorProtos.FeatureSet.Utf8Validation utf8Validation = this._builder.getUtf8Validation();
            utf8Validation.getClass();
            return utf8Validation;
        }

        public final boolean hasDefaultSymbolVisibility() {
            return this._builder.hasDefaultSymbolVisibility();
        }

        public final boolean hasEnforceNamingStyle() {
            return this._builder.hasEnforceNamingStyle();
        }

        public final boolean hasEnumType() {
            return this._builder.hasEnumType();
        }

        public final boolean hasFieldPresence() {
            return this._builder.hasFieldPresence();
        }

        public final boolean hasJsonFormat() {
            return this._builder.hasJsonFormat();
        }

        public final boolean hasMessageEncoding() {
            return this._builder.hasMessageEncoding();
        }

        public final boolean hasRepeatedFieldEncoding() {
            return this._builder.hasRepeatedFieldEncoding();
        }

        public final boolean hasUtf8Validation() {
            return this._builder.hasUtf8Validation();
        }

        public final /* synthetic */ <E> void plusAssign(ExtensionList<E, DescriptorProtos.FeatureSet> extensionList, E e) {
            extensionList.getClass();
            e.getClass();
            add(extensionList, e);
        }

        public final /* synthetic */ void set(ExtensionList extensionList, int i, Object obj) {
            extensionList.getClass();
            obj.getClass();
            this._builder.setExtension(extensionList.getExtension(), i, obj);
        }

        public final void setDefaultSymbolVisibility(DescriptorProtos.FeatureSet.VisibilityFeature.DefaultSymbolVisibility defaultSymbolVisibility) {
            defaultSymbolVisibility.getClass();
            this._builder.setDefaultSymbolVisibility(defaultSymbolVisibility);
        }

        public final void setEnforceNamingStyle(DescriptorProtos.FeatureSet.EnforceNamingStyle enforceNamingStyle) {
            enforceNamingStyle.getClass();
            this._builder.setEnforceNamingStyle(enforceNamingStyle);
        }

        public final void setEnumType(DescriptorProtos.FeatureSet.EnumType enumType) {
            enumType.getClass();
            this._builder.setEnumType(enumType);
        }

        public final /* synthetic */ void setExtension(ExtensionLite extension, Object value) {
            extension.getClass();
            value.getClass();
            this._builder.setExtension(extension, value);
        }

        public final void setFieldPresence(DescriptorProtos.FeatureSet.FieldPresence fieldPresence) {
            fieldPresence.getClass();
            this._builder.setFieldPresence(fieldPresence);
        }

        public final void setJsonFormat(DescriptorProtos.FeatureSet.JsonFormat jsonFormat) {
            jsonFormat.getClass();
            this._builder.setJsonFormat(jsonFormat);
        }

        public final void setMessageEncoding(DescriptorProtos.FeatureSet.MessageEncoding messageEncoding) {
            messageEncoding.getClass();
            this._builder.setMessageEncoding(messageEncoding);
        }

        public final void setRepeatedFieldEncoding(DescriptorProtos.FeatureSet.RepeatedFieldEncoding repeatedFieldEncoding) {
            repeatedFieldEncoding.getClass();
            this._builder.setRepeatedFieldEncoding(repeatedFieldEncoding);
        }

        public final void setUtf8Validation(DescriptorProtos.FeatureSet.Utf8Validation utf8Validation) {
            utf8Validation.getClass();
            this._builder.setUtf8Validation(utf8Validation);
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/FeatureSetKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/FeatureSetKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$FeatureSet$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(yx yxVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DescriptorProtos.FeatureSet.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DescriptorProtos.FeatureSet.Builder builder, yx yxVar) {
            this(builder);
        }

        public final /* synthetic */ <E> void plusAssign(ExtensionList<E, DescriptorProtos.FeatureSet> extensionList, Iterable<? extends E> iterable) {
            extensionList.getClass();
            iterable.getClass();
            addAll(extensionList, iterable);
        }

        public final /* synthetic */ void clear(ExtensionLite extension) {
            extension.getClass();
            this._builder.clearExtension(extension);
        }

        public final /* synthetic */ void set(ExtensionLite<DescriptorProtos.FeatureSet, ByteString> extension, ByteString value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }

        public final /* synthetic */ <T extends MessageLite> void set(ExtensionLite<DescriptorProtos.FeatureSet, T> extension, T value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }

        public final /* synthetic */ <T extends Comparable<? super T>> void set(ExtensionLite<DescriptorProtos.FeatureSet, T> extension, T value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }
    }
}
