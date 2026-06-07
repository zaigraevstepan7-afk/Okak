package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ExtensionList;
import defpackage.oe0;
import defpackage.yq1;
import defpackage.yx;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"Lcom/google/protobuf/ExtensionRangeOptionsKt;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/google/protobuf/ExtensionRangeOptionsKt$DeclarationKt$Dsl;", "Lod2;", "block", "Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;", "-initializedeclaration", "(Loe0;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;", "declaration", "DeclarationKt", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ExtensionRangeOptionsKt {
    public static final ExtensionRangeOptionsKt INSTANCE = new ExtensionRangeOptionsKt();

    private ExtensionRangeOptionsKt() {
    }

    /* renamed from: -initializedeclaration, reason: not valid java name */
    public final DescriptorProtos.ExtensionRangeOptions.Declaration m23initializedeclaration(oe0 block) {
        block.getClass();
        DeclarationKt.Dsl.Companion companion = DeclarationKt.Dsl.INSTANCE;
        DescriptorProtos.ExtensionRangeOptions.Declaration.Builder newBuilder = DescriptorProtos.ExtensionRangeOptions.Declaration.newBuilder();
        newBuilder.getClass();
        DeclarationKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/ExtensionRangeOptionsKt$DeclarationKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class DeclarationKt {
        public static final DeclarationKt INSTANCE = new DeclarationKt();

        private DeclarationKt() {
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000bJ\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u000eJ\r\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u000bJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010'\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R$\u0010+\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010*R$\u0010.\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\u000e\"\u0004\b-\u0010*¨\u00060"}, d2 = {"Lcom/google/protobuf/ExtensionRangeOptionsKt$DeclarationKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;", "_build", "()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;", "Lod2;", "clearNumber", "()V", "", "hasNumber", "()Z", "clearFullName", "hasFullName", "clearType", "hasType", "clearReserved", "hasReserved", "clearRepeated", "hasRepeated", "Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$Builder;", "", "value", "getNumber", "()I", "setNumber", "(I)V", "number", "", "getFullName", "()Ljava/lang/String;", "setFullName", "(Ljava/lang/String;)V", "fullName", "getType", "setType", "type", "getReserved", "setReserved", "(Z)V", "reserved", "getRepeated", "setRepeated", "repeated", "Companion", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final DescriptorProtos.ExtensionRangeOptions.Declaration.Builder _builder;

            private Dsl(DescriptorProtos.ExtensionRangeOptions.Declaration.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ DescriptorProtos.ExtensionRangeOptions.Declaration _build() {
                DescriptorProtos.ExtensionRangeOptions.Declaration build = this._builder.build();
                build.getClass();
                return build;
            }

            public final void clearFullName() {
                this._builder.clearFullName();
            }

            public final void clearNumber() {
                this._builder.clearNumber();
            }

            public final void clearRepeated() {
                this._builder.clearRepeated();
            }

            public final void clearReserved() {
                this._builder.clearReserved();
            }

            public final void clearType() {
                this._builder.clearType();
            }

            public final String getFullName() {
                String fullName = this._builder.getFullName();
                fullName.getClass();
                return fullName;
            }

            public final int getNumber() {
                return this._builder.getNumber();
            }

            public final boolean getRepeated() {
                return this._builder.getRepeated();
            }

            public final boolean getReserved() {
                return this._builder.getReserved();
            }

            public final String getType() {
                String type = this._builder.getType();
                type.getClass();
                return type;
            }

            public final boolean hasFullName() {
                return this._builder.hasFullName();
            }

            public final boolean hasNumber() {
                return this._builder.hasNumber();
            }

            public final boolean hasRepeated() {
                return this._builder.hasRepeated();
            }

            public final boolean hasReserved() {
                return this._builder.hasReserved();
            }

            public final boolean hasType() {
                return this._builder.hasType();
            }

            public final void setFullName(String str) {
                str.getClass();
                this._builder.setFullName(str);
            }

            public final void setNumber(int i) {
                this._builder.setNumber(i);
            }

            public final void setRepeated(boolean z) {
                this._builder.setRepeated(z);
            }

            public final void setReserved(boolean z) {
                this._builder.setReserved(z);
            }

            public final void setType(String str) {
                str.getClass();
                this._builder.setType(str);
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/ExtensionRangeOptionsKt$DeclarationKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/ExtensionRangeOptionsKt$DeclarationKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
            /* loaded from: classes.dex */
            public static final class Companion {
                public /* synthetic */ Companion(yx yxVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(DescriptorProtos.ExtensionRangeOptions.Declaration.Builder builder) {
                    builder.getClass();
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(DescriptorProtos.ExtensionRangeOptions.Declaration.Builder builder, yx yxVar) {
                this(builder);
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 `2\u00020\u0001:\u0003`abB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u0011\u0010\u000fJ-\u0010\u0017\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J.\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0013H\u0087\n¢\u0006\u0004\b\u0018\u0010\u0016J0\u0010\u001d\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\nH\u0087\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\u0010\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\t2\u0006\u0010\f\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J(\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\t2\u0006\u0010\f\u001a\u00020!H\u0087\n¢\u0006\u0004\b%\u0010$J-\u0010\u0017\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020!0\u0013H\u0007¢\u0006\u0004\b&\u0010\u0016J.\u0010\u0012\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020!0\u0013H\u0087\n¢\u0006\u0004\b'\u0010\u0016J0\u0010\u001d\u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\t2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020!H\u0087\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010 \u001a\u00020\r*\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\tH\u0007¢\u0006\u0004\b*\u0010\u001fJ\r\u0010+\u001a\u00020\r¢\u0006\u0004\b+\u0010,J\r\u0010.\u001a\u00020-¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\r¢\u0006\u0004\b0\u0010,J\r\u00101\u001a\u00020-¢\u0006\u0004\b1\u0010/J.\u00105\u001a\u00028\u0000\"\b\b\u0000\u00102*\u00020\u00012\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u000003H\u0086\u0002¢\u0006\u0004\b5\u00106J@\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000609\"\b\b\u0000\u00107*\u00020\u00012\u0018\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000803H\u0087\u0002¢\u0006\u0004\b:\u0010;J\"\u0010<\u001a\u00020-2\u0010\u00104\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u000303H\u0086\u0002¢\u0006\u0004\b<\u0010=J\u001f\u0010 \u001a\u00020\r2\u0010\u00104\u001a\f\u0012\u0004\u0012\u00020\u0006\u0012\u0002\b\u000303¢\u0006\u0004\b \u0010>J3\u0010?\u001a\u00020\r\"\b\b\u0000\u00102*\u00020\u00012\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000032\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b?\u0010@J<\u0010\u001d\u001a\u00020\r\"\u000e\b\u0000\u00102*\b\u0012\u0004\u0012\u00028\u00000A2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000032\u0006\u0010\f\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u001d\u0010BJ,\u0010\u001d\u001a\u00020\r2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020C032\u0006\u0010\f\u001a\u00020CH\u0086\n¢\u0006\u0004\b\u001d\u0010DJ6\u0010\u001d\u001a\u00020\r\"\b\b\u0000\u00102*\u00020E2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000032\u0006\u0010\f\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u001d\u0010FJ/\u0010\u0010\u001a\u00020\r\"\b\b\u0000\u00107*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006092\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010GJ2\u0010\u0012\u001a\u00020\r\"\b\b\u0000\u00107*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006092\u0006\u0010\f\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u0012\u0010GJ5\u0010\u0017\u001a\u00020\r\"\b\b\u0000\u00107*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006092\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0017\u0010HJ8\u0010\u0012\u001a\u00020\r\"\b\b\u0000\u00107*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006092\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\n¢\u0006\u0004\b\u0012\u0010HJ:\u0010\u001d\u001a\u00020\r\"\b\b\u0000\u00107*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006092\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010IJ\u001e\u0010 \u001a\u00020\r*\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u000609H\u0086\b¢\u0006\u0004\b \u0010JR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010KR\u001d\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8F¢\u0006\u0006\u001a\u0004\bL\u0010MR\u001d\u0010P\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\t8F¢\u0006\u0006\u001a\u0004\bO\u0010MR$\u0010V\u001a\u00020Q2\u0006\u0010\f\u001a\u00020Q8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0017\u0010Y\u001a\u0004\u0018\u00010Q*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bW\u0010XR$\u0010_\u001a\u00020Z2\u0006\u0010\f\u001a\u00020Z8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^¨\u0006c"}, d2 = {"Lcom/google/protobuf/ExtensionRangeOptionsKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;", "_build", "()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;", "Lcom/google/protobuf/ExtensionRangeOptionsKt$Dsl$UninterpretedOptionProxy;", "value", "Lod2;", "addUninterpretedOption", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$UninterpretedOption;)V", "add", "plusAssignUninterpretedOption", "plusAssign", "", "values", "addAllUninterpretedOption", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllUninterpretedOption", "", "index", "setUninterpretedOption", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$UninterpretedOption;)V", "set", "clearUninterpretedOption", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;", "Lcom/google/protobuf/ExtensionRangeOptionsKt$Dsl$DeclarationProxy;", "addDeclaration", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;)V", "plusAssignDeclaration", "addAllDeclaration", "plusAssignAllDeclaration", "setDeclaration", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Declaration;)V", "clearDeclaration", "clearFeatures", "()V", "", "hasFeatures", "()Z", "clearVerification", "hasVerification", "T", "Lcom/google/protobuf/ExtensionLite;", "extension", "get", "(Lcom/google/protobuf/ExtensionLite;)Ljava/lang/Object;", "E", "", "Lcom/google/protobuf/kotlin/ExtensionList;", "-getRepeatedExtension", "(Lcom/google/protobuf/ExtensionLite;)Lcom/google/protobuf/kotlin/ExtensionList;", "contains", "(Lcom/google/protobuf/ExtensionLite;)Z", "(Lcom/google/protobuf/ExtensionLite;)V", "setExtension", "(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Object;)V", "", "(Lcom/google/protobuf/ExtensionLite;Ljava/lang/Comparable;)V", "Lcom/google/protobuf/ByteString;", "(Lcom/google/protobuf/ExtensionLite;Lcom/google/protobuf/ByteString;)V", "Lcom/google/protobuf/MessageLite;", "(Lcom/google/protobuf/ExtensionLite;Lcom/google/protobuf/MessageLite;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;Ljava/lang/Object;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;Ljava/lang/Iterable;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;ILjava/lang/Object;)V", "(Lcom/google/protobuf/kotlin/ExtensionList;)V", "Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Builder;", "getUninterpretedOption", "()Lcom/google/protobuf/kotlin/DslList;", "uninterpretedOption", "getDeclaration", "declaration", "Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "getFeatures", "()Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "setFeatures", "(Lcom/google/protobuf/DescriptorProtos$FeatureSet;)V", "features", "getFeaturesOrNull", "(Lcom/google/protobuf/ExtensionRangeOptionsKt$Dsl;)Lcom/google/protobuf/DescriptorProtos$FeatureSet;", "featuresOrNull", "Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$VerificationState;", "getVerification", "()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$VerificationState;", "setVerification", "(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$VerificationState;)V", "verification", "Companion", "DeclarationProxy", "UninterpretedOptionProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DescriptorProtos.ExtensionRangeOptions.Builder _builder;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/ExtensionRangeOptionsKt$Dsl$DeclarationProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class DeclarationProxy extends DslProxy {
            private DeclarationProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/ExtensionRangeOptionsKt$Dsl$UninterpretedOptionProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class UninterpretedOptionProxy extends DslProxy {
            private UninterpretedOptionProxy() {
            }
        }

        private Dsl(DescriptorProtos.ExtensionRangeOptions.Builder builder) {
            this._builder = builder;
        }

        /* renamed from: -getRepeatedExtension, reason: not valid java name */
        public final /* synthetic */ ExtensionList m24getRepeatedExtension(ExtensionLite extension) {
            extension.getClass();
            Object extension2 = this._builder.getExtension(extension);
            extension2.getClass();
            return new ExtensionList(extension, (List) extension2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final /* synthetic */ DescriptorProtos.ExtensionRangeOptions _build() {
            MessageType build = this._builder.build();
            build.getClass();
            return (DescriptorProtos.ExtensionRangeOptions) build;
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

        public final /* synthetic */ void addAllDeclaration(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllDeclaration(iterable);
        }

        public final /* synthetic */ void addAllUninterpretedOption(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllUninterpretedOption(iterable);
        }

        public final /* synthetic */ void addDeclaration(DslList dslList, DescriptorProtos.ExtensionRangeOptions.Declaration declaration) {
            dslList.getClass();
            declaration.getClass();
            this._builder.addDeclaration(declaration);
        }

        public final /* synthetic */ void addUninterpretedOption(DslList dslList, DescriptorProtos.UninterpretedOption uninterpretedOption) {
            dslList.getClass();
            uninterpretedOption.getClass();
            this._builder.addUninterpretedOption(uninterpretedOption);
        }

        public final /* synthetic */ void clear(ExtensionList<?, DescriptorProtos.ExtensionRangeOptions> extensionList) {
            extensionList.getClass();
            clear(extensionList.getExtension());
        }

        public final /* synthetic */ void clearDeclaration(DslList dslList) {
            dslList.getClass();
            this._builder.clearDeclaration();
        }

        public final void clearFeatures() {
            this._builder.clearFeatures();
        }

        public final /* synthetic */ void clearUninterpretedOption(DslList dslList) {
            dslList.getClass();
            this._builder.clearUninterpretedOption();
        }

        public final void clearVerification() {
            this._builder.clearVerification();
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

        public final /* synthetic */ DslList getDeclaration() {
            List<DescriptorProtos.ExtensionRangeOptions.Declaration> declarationList = this._builder.getDeclarationList();
            declarationList.getClass();
            return new DslList(declarationList);
        }

        public final DescriptorProtos.FeatureSet getFeatures() {
            DescriptorProtos.FeatureSet features = this._builder.getFeatures();
            features.getClass();
            return features;
        }

        public final DescriptorProtos.FeatureSet getFeaturesOrNull(Dsl dsl) {
            dsl.getClass();
            return ExtensionRangeOptionsKtKt.getFeaturesOrNull(dsl._builder);
        }

        public final /* synthetic */ DslList getUninterpretedOption() {
            List<DescriptorProtos.UninterpretedOption> uninterpretedOptionList = this._builder.getUninterpretedOptionList();
            uninterpretedOptionList.getClass();
            return new DslList(uninterpretedOptionList);
        }

        public final DescriptorProtos.ExtensionRangeOptions.VerificationState getVerification() {
            DescriptorProtos.ExtensionRangeOptions.VerificationState verification = this._builder.getVerification();
            verification.getClass();
            return verification;
        }

        public final boolean hasFeatures() {
            return this._builder.hasFeatures();
        }

        public final boolean hasVerification() {
            return this._builder.hasVerification();
        }

        public final /* synthetic */ <E> void plusAssign(ExtensionList<E, DescriptorProtos.ExtensionRangeOptions> extensionList, E e) {
            extensionList.getClass();
            e.getClass();
            add(extensionList, e);
        }

        public final /* synthetic */ void plusAssignAllDeclaration(DslList<DescriptorProtos.ExtensionRangeOptions.Declaration, DeclarationProxy> dslList, Iterable<DescriptorProtos.ExtensionRangeOptions.Declaration> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllDeclaration(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllUninterpretedOption(DslList<DescriptorProtos.UninterpretedOption, UninterpretedOptionProxy> dslList, Iterable<DescriptorProtos.UninterpretedOption> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllUninterpretedOption(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignDeclaration(DslList<DescriptorProtos.ExtensionRangeOptions.Declaration, DeclarationProxy> dslList, DescriptorProtos.ExtensionRangeOptions.Declaration declaration) {
            dslList.getClass();
            declaration.getClass();
            addDeclaration(dslList, declaration);
        }

        public final /* synthetic */ void plusAssignUninterpretedOption(DslList<DescriptorProtos.UninterpretedOption, UninterpretedOptionProxy> dslList, DescriptorProtos.UninterpretedOption uninterpretedOption) {
            dslList.getClass();
            uninterpretedOption.getClass();
            addUninterpretedOption(dslList, uninterpretedOption);
        }

        public final /* synthetic */ void set(ExtensionList extensionList, int i, Object obj) {
            extensionList.getClass();
            obj.getClass();
            this._builder.setExtension(extensionList.getExtension(), i, obj);
        }

        public final /* synthetic */ void setDeclaration(DslList dslList, int i, DescriptorProtos.ExtensionRangeOptions.Declaration declaration) {
            dslList.getClass();
            declaration.getClass();
            this._builder.setDeclaration(i, declaration);
        }

        public final /* synthetic */ void setExtension(ExtensionLite extension, Object value) {
            extension.getClass();
            value.getClass();
            this._builder.setExtension(extension, value);
        }

        public final void setFeatures(DescriptorProtos.FeatureSet featureSet) {
            featureSet.getClass();
            this._builder.setFeatures(featureSet);
        }

        public final /* synthetic */ void setUninterpretedOption(DslList dslList, int i, DescriptorProtos.UninterpretedOption uninterpretedOption) {
            dslList.getClass();
            uninterpretedOption.getClass();
            this._builder.setUninterpretedOption(i, uninterpretedOption);
        }

        public final void setVerification(DescriptorProtos.ExtensionRangeOptions.VerificationState verificationState) {
            verificationState.getClass();
            this._builder.setVerification(verificationState);
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/ExtensionRangeOptionsKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/ExtensionRangeOptionsKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(yx yxVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DescriptorProtos.ExtensionRangeOptions.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DescriptorProtos.ExtensionRangeOptions.Builder builder, yx yxVar) {
            this(builder);
        }

        public final /* synthetic */ <E> void plusAssign(ExtensionList<E, DescriptorProtos.ExtensionRangeOptions> extensionList, Iterable<? extends E> iterable) {
            extensionList.getClass();
            iterable.getClass();
            addAll(extensionList, iterable);
        }

        public final /* synthetic */ void clear(ExtensionLite extension) {
            extension.getClass();
            this._builder.clearExtension(extension);
        }

        public final /* synthetic */ void set(ExtensionLite<DescriptorProtos.ExtensionRangeOptions, ByteString> extension, ByteString value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }

        public final /* synthetic */ <T extends MessageLite> void set(ExtensionLite<DescriptorProtos.ExtensionRangeOptions, T> extension, T value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }

        public final /* synthetic */ <T extends Comparable<? super T>> void set(ExtensionLite<DescriptorProtos.ExtensionRangeOptions, T> extension, T value) {
            extension.getClass();
            value.getClass();
            setExtension(extension, value);
        }
    }
}
