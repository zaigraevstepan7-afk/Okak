package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import defpackage.oe0;
import defpackage.yq1;
import defpackage.yx;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/google/protobuf/DescriptorProtoKt;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/google/protobuf/DescriptorProtoKt$ExtensionRangeKt$Dsl;", "Lod2;", "block", "Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;", "-initializeextensionRange", "(Loe0;)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;", "extensionRange", "Lcom/google/protobuf/DescriptorProtoKt$ReservedRangeKt$Dsl;", "Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ReservedRange;", "-initializereservedRange", "(Loe0;)Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ReservedRange;", "reservedRange", "Dsl", "ExtensionRangeKt", "ReservedRangeKt", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class DescriptorProtoKt {
    public static final DescriptorProtoKt INSTANCE = new DescriptorProtoKt();

    private DescriptorProtoKt() {
    }

    /* renamed from: -initializeextensionRange, reason: not valid java name */
    public final DescriptorProtos.DescriptorProto.ExtensionRange m8initializeextensionRange(oe0 block) {
        block.getClass();
        ExtensionRangeKt.Dsl.Companion companion = ExtensionRangeKt.Dsl.INSTANCE;
        DescriptorProtos.DescriptorProto.ExtensionRange.Builder newBuilder = DescriptorProtos.DescriptorProto.ExtensionRange.newBuilder();
        newBuilder.getClass();
        ExtensionRangeKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    /* renamed from: -initializereservedRange, reason: not valid java name */
    public final DescriptorProtos.DescriptorProto.ReservedRange m9initializereservedRange(oe0 block) {
        block.getClass();
        ReservedRangeKt.Dsl.Companion companion = ReservedRangeKt.Dsl.INSTANCE;
        DescriptorProtos.DescriptorProto.ReservedRange.Builder newBuilder = DescriptorProtos.DescriptorProto.ReservedRange.newBuilder();
        newBuilder.getClass();
        ReservedRangeKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/DescriptorProtoKt$ExtensionRangeKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class ExtensionRangeKt {
        public static final ExtensionRangeKt INSTANCE = new ExtensionRangeKt();

        private ExtensionRangeKt() {
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R$\u0010#\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u001e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0017\u0010&\u001a\u0004\u0018\u00010\u001e*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/google/protobuf/DescriptorProtoKt$ExtensionRangeKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;", "_build", "()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;", "Lod2;", "clearStart", "()V", "", "hasStart", "()Z", "clearEnd", "hasEnd", "clearOptions", "hasOptions", "Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$Builder;", "", "value", "getStart", "()I", "setStart", "(I)V", "start", "getEnd", "setEnd", "end", "Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;", "getOptions", "()Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;", "setOptions", "(Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;)V", "options", "getOptionsOrNull", "(Lcom/google/protobuf/DescriptorProtoKt$ExtensionRangeKt$Dsl;)Lcom/google/protobuf/DescriptorProtos$ExtensionRangeOptions;", "optionsOrNull", "Companion", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final DescriptorProtos.DescriptorProto.ExtensionRange.Builder _builder;

            private Dsl(DescriptorProtos.DescriptorProto.ExtensionRange.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ DescriptorProtos.DescriptorProto.ExtensionRange _build() {
                DescriptorProtos.DescriptorProto.ExtensionRange build = this._builder.build();
                build.getClass();
                return build;
            }

            public final void clearEnd() {
                this._builder.clearEnd();
            }

            public final void clearOptions() {
                this._builder.clearOptions();
            }

            public final void clearStart() {
                this._builder.clearStart();
            }

            public final int getEnd() {
                return this._builder.getEnd();
            }

            public final DescriptorProtos.ExtensionRangeOptions getOptions() {
                DescriptorProtos.ExtensionRangeOptions options = this._builder.getOptions();
                options.getClass();
                return options;
            }

            public final DescriptorProtos.ExtensionRangeOptions getOptionsOrNull(Dsl dsl) {
                dsl.getClass();
                return DescriptorProtoKtKt.getOptionsOrNull(dsl._builder);
            }

            public final int getStart() {
                return this._builder.getStart();
            }

            public final boolean hasEnd() {
                return this._builder.hasEnd();
            }

            public final boolean hasOptions() {
                return this._builder.hasOptions();
            }

            public final boolean hasStart() {
                return this._builder.hasStart();
            }

            public final void setEnd(int i) {
                this._builder.setEnd(i);
            }

            public final void setOptions(DescriptorProtos.ExtensionRangeOptions extensionRangeOptions) {
                extensionRangeOptions.getClass();
                this._builder.setOptions(extensionRangeOptions);
            }

            public final void setStart(int i) {
                this._builder.setStart(i);
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/DescriptorProtoKt$ExtensionRangeKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/DescriptorProtoKt$ExtensionRangeKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
            /* loaded from: classes.dex */
            public static final class Companion {
                public /* synthetic */ Companion(yx yxVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(DescriptorProtos.DescriptorProto.ExtensionRange.Builder builder) {
                    builder.getClass();
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(DescriptorProtos.DescriptorProto.ExtensionRange.Builder builder, yx yxVar) {
                this(builder);
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/DescriptorProtoKt$ReservedRangeKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class ReservedRangeKt {
        public static final ReservedRangeKt INSTANCE = new ReservedRangeKt();

        private ReservedRangeKt() {
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/google/protobuf/DescriptorProtoKt$ReservedRangeKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ReservedRange$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ReservedRange$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ReservedRange;", "_build", "()Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ReservedRange;", "Lod2;", "clearStart", "()V", "", "hasStart", "()Z", "clearEnd", "hasEnd", "Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ReservedRange$Builder;", "", "value", "getStart", "()I", "setStart", "(I)V", "start", "getEnd", "setEnd", "end", "Companion", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Dsl {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final DescriptorProtos.DescriptorProto.ReservedRange.Builder _builder;

            private Dsl(DescriptorProtos.DescriptorProto.ReservedRange.Builder builder) {
                this._builder = builder;
            }

            public final /* synthetic */ DescriptorProtos.DescriptorProto.ReservedRange _build() {
                DescriptorProtos.DescriptorProto.ReservedRange build = this._builder.build();
                build.getClass();
                return build;
            }

            public final void clearEnd() {
                this._builder.clearEnd();
            }

            public final void clearStart() {
                this._builder.clearStart();
            }

            public final int getEnd() {
                return this._builder.getEnd();
            }

            public final int getStart() {
                return this._builder.getStart();
            }

            public final boolean hasEnd() {
                return this._builder.hasEnd();
            }

            public final boolean hasStart() {
                return this._builder.hasStart();
            }

            public final void setEnd(int i) {
                this._builder.setEnd(i);
            }

            public final void setStart(int i) {
                this._builder.setStart(i);
            }

            /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/DescriptorProtoKt$ReservedRangeKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/DescriptorProtoKt$ReservedRangeKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ReservedRange$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
            /* loaded from: classes.dex */
            public static final class Companion {
                public /* synthetic */ Companion(yx yxVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(DescriptorProtos.DescriptorProto.ReservedRange.Builder builder) {
                    builder.getClass();
                    return new Dsl(builder, null);
                }

                private Companion() {
                }
            }

            public /* synthetic */ Dsl(DescriptorProtos.DescriptorProto.ReservedRange.Builder builder, yx yxVar) {
                this(builder);
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u0091\u00012\u00020\u0001:\u0012\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0012\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0012\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0016\u0010\u0014J-\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0087\n¢\u0006\u0004\b\u001d\u0010\u001bJ0\u0010\"\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0010H\u0087\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0007¢\u0006\u0004\b#\u0010$J'\u0010\u0015\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&0\u000f2\u0006\u0010\u0012\u001a\u00020\u0010H\u0007¢\u0006\u0004\b'\u0010\u0014J(\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&0\u000f2\u0006\u0010\u0012\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b(\u0010\u0014J-\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&0\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0007¢\u0006\u0004\b)\u0010\u001bJ.\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&0\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0087\n¢\u0006\u0004\b*\u0010\u001bJ0\u0010\"\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&0\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0010H\u0087\u0002¢\u0006\u0004\b+\u0010!J\u001f\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&0\u000fH\u0007¢\u0006\u0004\b,\u0010$J'\u0010\u0015\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-0\u000f2\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b.\u0010/J(\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-0\u000f2\u0006\u0010\u0012\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b0\u0010/J-\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-0\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0007¢\u0006\u0004\b1\u0010\u001bJ.\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-0\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0087\n¢\u0006\u0004\b2\u0010\u001bJ0\u0010\"\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-0\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0006H\u0087\u0002¢\u0006\u0004\b3\u00104J\u001f\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-0\u000fH\u0007¢\u0006\u0004\b5\u0010$J'\u0010\u0015\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u000f2\u0006\u0010\u0012\u001a\u000206H\u0007¢\u0006\u0004\b8\u00109J(\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u000f2\u0006\u0010\u0012\u001a\u000206H\u0087\n¢\u0006\u0004\b:\u00109J-\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002060\u0018H\u0007¢\u0006\u0004\b;\u0010\u001bJ.\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002060\u0018H\u0087\n¢\u0006\u0004\b<\u0010\u001bJ0\u0010\"\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u000206H\u0087\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u000fH\u0007¢\u0006\u0004\b?\u0010$J'\u0010\u0015\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0\u000f2\u0006\u0010\u0012\u001a\u00020@H\u0007¢\u0006\u0004\bB\u0010CJ(\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0\u000f2\u0006\u0010\u0012\u001a\u00020@H\u0087\n¢\u0006\u0004\bD\u0010CJ-\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020@0\u0018H\u0007¢\u0006\u0004\bE\u0010\u001bJ.\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020@0\u0018H\u0087\n¢\u0006\u0004\bF\u0010\u001bJ0\u0010\"\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020@H\u0087\u0002¢\u0006\u0004\bG\u0010HJ\u001f\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0\u000fH\u0007¢\u0006\u0004\bI\u0010$J'\u0010\u0015\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020K0\u000f2\u0006\u0010\u0012\u001a\u00020JH\u0007¢\u0006\u0004\bL\u0010MJ(\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020K0\u000f2\u0006\u0010\u0012\u001a\u00020JH\u0087\n¢\u0006\u0004\bN\u0010MJ-\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020K0\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020J0\u0018H\u0007¢\u0006\u0004\bO\u0010\u001bJ.\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020K0\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020J0\u0018H\u0087\n¢\u0006\u0004\bP\u0010\u001bJ0\u0010\"\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020K0\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020JH\u0087\u0002¢\u0006\u0004\bQ\u0010RJ\u001f\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020K0\u000fH\u0007¢\u0006\u0004\bS\u0010$J\r\u0010T\u001a\u00020\t¢\u0006\u0004\bT\u0010\u000bJ\r\u0010U\u001a\u00020\f¢\u0006\u0004\bU\u0010\u000eJ'\u0010\u0015\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020W0\u000f2\u0006\u0010\u0012\u001a\u00020VH\u0007¢\u0006\u0004\bX\u0010YJ(\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020W0\u000f2\u0006\u0010\u0012\u001a\u00020VH\u0087\n¢\u0006\u0004\bZ\u0010YJ-\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020W0\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020V0\u0018H\u0007¢\u0006\u0004\b[\u0010\u001bJ.\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020W0\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020V0\u0018H\u0087\n¢\u0006\u0004\b\\\u0010\u001bJ0\u0010\"\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020W0\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020VH\u0087\u0002¢\u0006\u0004\b]\u0010^J\u001f\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020W0\u000fH\u0007¢\u0006\u0004\b_\u0010$J'\u0010\u0015\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a0\u000f2\u0006\u0010\u0012\u001a\u00020`H\u0007¢\u0006\u0004\bb\u0010cJ(\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a0\u000f2\u0006\u0010\u0012\u001a\u00020`H\u0087\n¢\u0006\u0004\bd\u0010cJ-\u0010\u001c\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a0\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020`0\u0018H\u0007¢\u0006\u0004\be\u0010\u001bJ.\u0010\u0017\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a0\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020`0\u0018H\u0087\n¢\u0006\u0004\bf\u0010\u001bJ0\u0010\"\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a0\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020`H\u0087\u0002¢\u0006\u0004\bg\u0010hJ\u001f\u0010%\u001a\u00020\t*\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a0\u000fH\u0007¢\u0006\u0004\bg\u0010$J\r\u0010i\u001a\u00020\t¢\u0006\u0004\bi\u0010\u000bJ\r\u0010j\u001a\u00020\f¢\u0006\u0004\bj\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010kR$\u0010p\u001a\u00020`2\u0006\u0010\u0012\u001a\u00020`8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u001d\u0010s\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u001d\u0010u\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020&0\u000f8F¢\u0006\u0006\u001a\u0004\bt\u0010rR\u001d\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-0\u000f8F¢\u0006\u0006\u001a\u0004\bv\u0010rR\u001d\u0010y\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u000f8F¢\u0006\u0006\u001a\u0004\bx\u0010rR\u001d\u0010{\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0\u000f8F¢\u0006\u0006\u001a\u0004\bz\u0010rR\u001d\u0010}\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020K0\u000f8F¢\u0006\u0006\u001a\u0004\b|\u0010rR(\u0010\u0083\u0001\u001a\u00020~2\u0006\u0010\u0012\u001a\u00020~8G@GX\u0086\u000e¢\u0006\u000f\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u0086\u0001\u001a\u0004\u0018\u00010~*\u00020\u00008F¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001f\u0010\u0088\u0001\u001a\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020W0\u000f8F¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010rR\u001f\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a0\u000f8F¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010rR+\u0010\u0090\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u0012\u001a\u00030\u008b\u00018G@GX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u009a\u0001"}, d2 = {"Lcom/google/protobuf/DescriptorProtoKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$DescriptorProto$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$DescriptorProto$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$DescriptorProto;", "_build", "()Lcom/google/protobuf/DescriptorProtos$DescriptorProto;", "Lod2;", "clearName", "()V", "", "hasName", "()Z", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;", "Lcom/google/protobuf/DescriptorProtoKt$Dsl$FieldProxy;", "value", "addField", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;)V", "add", "plusAssignField", "plusAssign", "", "values", "addAllField", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/Iterable;)V", "addAll", "plusAssignAllField", "", "index", "setField", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$FieldDescriptorProto;)V", "set", "clearField", "(Lcom/google/protobuf/kotlin/DslList;)V", "clear", "Lcom/google/protobuf/DescriptorProtoKt$Dsl$ExtensionProxy;", "addExtension", "plusAssignExtension", "addAllExtension", "plusAssignAllExtension", "setExtension", "clearExtension", "Lcom/google/protobuf/DescriptorProtoKt$Dsl$NestedTypeProxy;", "addNestedType", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$DescriptorProto;)V", "plusAssignNestedType", "addAllNestedType", "plusAssignAllNestedType", "setNestedType", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$DescriptorProto;)V", "clearNestedType", "Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;", "Lcom/google/protobuf/DescriptorProtoKt$Dsl$EnumTypeProxy;", "addEnumType", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;)V", "plusAssignEnumType", "addAllEnumType", "plusAssignAllEnumType", "setEnumType", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$EnumDescriptorProto;)V", "clearEnumType", "Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;", "Lcom/google/protobuf/DescriptorProtoKt$Dsl$ExtensionRangeProxy;", "addExtensionRange", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;)V", "plusAssignExtensionRange", "addAllExtensionRange", "plusAssignAllExtensionRange", "setExtensionRange", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$DescriptorProto$ExtensionRange;)V", "clearExtensionRange", "Lcom/google/protobuf/DescriptorProtos$OneofDescriptorProto;", "Lcom/google/protobuf/DescriptorProtoKt$Dsl$OneofDeclProxy;", "addOneofDecl", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$OneofDescriptorProto;)V", "plusAssignOneofDecl", "addAllOneofDecl", "plusAssignAllOneofDecl", "setOneofDecl", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$OneofDescriptorProto;)V", "clearOneofDecl", "clearOptions", "hasOptions", "Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ReservedRange;", "Lcom/google/protobuf/DescriptorProtoKt$Dsl$ReservedRangeProxy;", "addReservedRange", "(Lcom/google/protobuf/kotlin/DslList;Lcom/google/protobuf/DescriptorProtos$DescriptorProto$ReservedRange;)V", "plusAssignReservedRange", "addAllReservedRange", "plusAssignAllReservedRange", "setReservedRange", "(Lcom/google/protobuf/kotlin/DslList;ILcom/google/protobuf/DescriptorProtos$DescriptorProto$ReservedRange;)V", "clearReservedRange", "", "Lcom/google/protobuf/DescriptorProtoKt$Dsl$ReservedNameProxy;", "addReservedName", "(Lcom/google/protobuf/kotlin/DslList;Ljava/lang/String;)V", "plusAssignReservedName", "addAllReservedName", "plusAssignAllReservedName", "setReservedName", "(Lcom/google/protobuf/kotlin/DslList;ILjava/lang/String;)V", "clearVisibility", "hasVisibility", "Lcom/google/protobuf/DescriptorProtos$DescriptorProto$Builder;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "getField", "()Lcom/google/protobuf/kotlin/DslList;", "field", "getExtension", "extension", "getNestedType", "nestedType", "getEnumType", "enumType", "getExtensionRange", "extensionRange", "getOneofDecl", "oneofDecl", "Lcom/google/protobuf/DescriptorProtos$MessageOptions;", "getOptions", "()Lcom/google/protobuf/DescriptorProtos$MessageOptions;", "setOptions", "(Lcom/google/protobuf/DescriptorProtos$MessageOptions;)V", "options", "getOptionsOrNull", "(Lcom/google/protobuf/DescriptorProtoKt$Dsl;)Lcom/google/protobuf/DescriptorProtos$MessageOptions;", "optionsOrNull", "getReservedRange", "reservedRange", "getReservedName", "reservedName", "Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;", "getVisibility", "()Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;", "setVisibility", "(Lcom/google/protobuf/DescriptorProtos$SymbolVisibility;)V", "visibility", "Companion", "EnumTypeProxy", "ExtensionProxy", "ExtensionRangeProxy", "FieldProxy", "NestedTypeProxy", "OneofDeclProxy", "ReservedNameProxy", "ReservedRangeProxy", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DescriptorProtos.DescriptorProto.Builder _builder;

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/DescriptorProtoKt$Dsl$EnumTypeProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class EnumTypeProxy extends DslProxy {
            private EnumTypeProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/DescriptorProtoKt$Dsl$ExtensionProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class ExtensionProxy extends DslProxy {
            private ExtensionProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/DescriptorProtoKt$Dsl$ExtensionRangeProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class ExtensionRangeProxy extends DslProxy {
            private ExtensionRangeProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/DescriptorProtoKt$Dsl$FieldProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class FieldProxy extends DslProxy {
            private FieldProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/DescriptorProtoKt$Dsl$NestedTypeProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class NestedTypeProxy extends DslProxy {
            private NestedTypeProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/DescriptorProtoKt$Dsl$OneofDeclProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class OneofDeclProxy extends DslProxy {
            private OneofDeclProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/DescriptorProtoKt$Dsl$ReservedNameProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class ReservedNameProxy extends DslProxy {
            private ReservedNameProxy() {
            }
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/protobuf/DescriptorProtoKt$Dsl$ReservedRangeProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "()V", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class ReservedRangeProxy extends DslProxy {
            private ReservedRangeProxy() {
            }
        }

        private Dsl(DescriptorProtos.DescriptorProto.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ DescriptorProtos.DescriptorProto _build() {
            DescriptorProtos.DescriptorProto build = this._builder.build();
            build.getClass();
            return build;
        }

        public final /* synthetic */ void addAllEnumType(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllEnumType(iterable);
        }

        public final /* synthetic */ void addAllExtension(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllExtension(iterable);
        }

        public final /* synthetic */ void addAllExtensionRange(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllExtensionRange(iterable);
        }

        public final /* synthetic */ void addAllField(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllField(iterable);
        }

        public final /* synthetic */ void addAllNestedType(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllNestedType(iterable);
        }

        public final /* synthetic */ void addAllOneofDecl(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllOneofDecl(iterable);
        }

        public final /* synthetic */ void addAllReservedName(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllReservedName(iterable);
        }

        public final /* synthetic */ void addAllReservedRange(DslList dslList, Iterable iterable) {
            dslList.getClass();
            iterable.getClass();
            this._builder.addAllReservedRange(iterable);
        }

        public final /* synthetic */ void addEnumType(DslList dslList, DescriptorProtos.EnumDescriptorProto enumDescriptorProto) {
            dslList.getClass();
            enumDescriptorProto.getClass();
            this._builder.addEnumType(enumDescriptorProto);
        }

        public final /* synthetic */ void addExtension(DslList dslList, DescriptorProtos.FieldDescriptorProto fieldDescriptorProto) {
            dslList.getClass();
            fieldDescriptorProto.getClass();
            this._builder.addExtension(fieldDescriptorProto);
        }

        public final /* synthetic */ void addExtensionRange(DslList dslList, DescriptorProtos.DescriptorProto.ExtensionRange extensionRange) {
            dslList.getClass();
            extensionRange.getClass();
            this._builder.addExtensionRange(extensionRange);
        }

        public final /* synthetic */ void addField(DslList dslList, DescriptorProtos.FieldDescriptorProto fieldDescriptorProto) {
            dslList.getClass();
            fieldDescriptorProto.getClass();
            this._builder.addField(fieldDescriptorProto);
        }

        public final /* synthetic */ void addNestedType(DslList dslList, DescriptorProtos.DescriptorProto descriptorProto) {
            dslList.getClass();
            descriptorProto.getClass();
            this._builder.addNestedType(descriptorProto);
        }

        public final /* synthetic */ void addOneofDecl(DslList dslList, DescriptorProtos.OneofDescriptorProto oneofDescriptorProto) {
            dslList.getClass();
            oneofDescriptorProto.getClass();
            this._builder.addOneofDecl(oneofDescriptorProto);
        }

        public final /* synthetic */ void addReservedName(DslList dslList, String str) {
            dslList.getClass();
            str.getClass();
            this._builder.addReservedName(str);
        }

        public final /* synthetic */ void addReservedRange(DslList dslList, DescriptorProtos.DescriptorProto.ReservedRange reservedRange) {
            dslList.getClass();
            reservedRange.getClass();
            this._builder.addReservedRange(reservedRange);
        }

        public final /* synthetic */ void clearEnumType(DslList dslList) {
            dslList.getClass();
            this._builder.clearEnumType();
        }

        public final /* synthetic */ void clearExtension(DslList dslList) {
            dslList.getClass();
            this._builder.clearExtension();
        }

        public final /* synthetic */ void clearExtensionRange(DslList dslList) {
            dslList.getClass();
            this._builder.clearExtensionRange();
        }

        public final /* synthetic */ void clearField(DslList dslList) {
            dslList.getClass();
            this._builder.clearField();
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final /* synthetic */ void clearNestedType(DslList dslList) {
            dslList.getClass();
            this._builder.clearNestedType();
        }

        public final /* synthetic */ void clearOneofDecl(DslList dslList) {
            dslList.getClass();
            this._builder.clearOneofDecl();
        }

        public final void clearOptions() {
            this._builder.clearOptions();
        }

        public final /* synthetic */ void clearReservedRange(DslList dslList) {
            dslList.getClass();
            this._builder.clearReservedRange();
        }

        public final void clearVisibility() {
            this._builder.clearVisibility();
        }

        public final /* synthetic */ DslList getEnumType() {
            List<DescriptorProtos.EnumDescriptorProto> enumTypeList = this._builder.getEnumTypeList();
            enumTypeList.getClass();
            return new DslList(enumTypeList);
        }

        public final /* synthetic */ DslList getExtension() {
            List<DescriptorProtos.FieldDescriptorProto> extensionList = this._builder.getExtensionList();
            extensionList.getClass();
            return new DslList(extensionList);
        }

        public final /* synthetic */ DslList getExtensionRange() {
            List<DescriptorProtos.DescriptorProto.ExtensionRange> extensionRangeList = this._builder.getExtensionRangeList();
            extensionRangeList.getClass();
            return new DslList(extensionRangeList);
        }

        public final /* synthetic */ DslList getField() {
            List<DescriptorProtos.FieldDescriptorProto> fieldList = this._builder.getFieldList();
            fieldList.getClass();
            return new DslList(fieldList);
        }

        public final String getName() {
            String name = this._builder.getName();
            name.getClass();
            return name;
        }

        public final /* synthetic */ DslList getNestedType() {
            List<DescriptorProtos.DescriptorProto> nestedTypeList = this._builder.getNestedTypeList();
            nestedTypeList.getClass();
            return new DslList(nestedTypeList);
        }

        public final /* synthetic */ DslList getOneofDecl() {
            List<DescriptorProtos.OneofDescriptorProto> oneofDeclList = this._builder.getOneofDeclList();
            oneofDeclList.getClass();
            return new DslList(oneofDeclList);
        }

        public final DescriptorProtos.MessageOptions getOptions() {
            DescriptorProtos.MessageOptions options = this._builder.getOptions();
            options.getClass();
            return options;
        }

        public final DescriptorProtos.MessageOptions getOptionsOrNull(Dsl dsl) {
            dsl.getClass();
            return DescriptorProtoKtKt.getOptionsOrNull(dsl._builder);
        }

        public final DslList<String, ReservedNameProxy> getReservedName() {
            List<String> reservedNameList = this._builder.getReservedNameList();
            reservedNameList.getClass();
            return new DslList<>(reservedNameList);
        }

        public final /* synthetic */ DslList getReservedRange() {
            List<DescriptorProtos.DescriptorProto.ReservedRange> reservedRangeList = this._builder.getReservedRangeList();
            reservedRangeList.getClass();
            return new DslList(reservedRangeList);
        }

        public final DescriptorProtos.SymbolVisibility getVisibility() {
            DescriptorProtos.SymbolVisibility visibility = this._builder.getVisibility();
            visibility.getClass();
            return visibility;
        }

        public final boolean hasName() {
            return this._builder.hasName();
        }

        public final boolean hasOptions() {
            return this._builder.hasOptions();
        }

        public final boolean hasVisibility() {
            return this._builder.hasVisibility();
        }

        public final /* synthetic */ void plusAssignAllEnumType(DslList<DescriptorProtos.EnumDescriptorProto, EnumTypeProxy> dslList, Iterable<DescriptorProtos.EnumDescriptorProto> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllEnumType(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllExtension(DslList<DescriptorProtos.FieldDescriptorProto, ExtensionProxy> dslList, Iterable<DescriptorProtos.FieldDescriptorProto> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllExtension(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllExtensionRange(DslList<DescriptorProtos.DescriptorProto.ExtensionRange, ExtensionRangeProxy> dslList, Iterable<DescriptorProtos.DescriptorProto.ExtensionRange> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllExtensionRange(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllField(DslList<DescriptorProtos.FieldDescriptorProto, FieldProxy> dslList, Iterable<DescriptorProtos.FieldDescriptorProto> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllField(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllNestedType(DslList<DescriptorProtos.DescriptorProto, NestedTypeProxy> dslList, Iterable<DescriptorProtos.DescriptorProto> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllNestedType(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllOneofDecl(DslList<DescriptorProtos.OneofDescriptorProto, OneofDeclProxy> dslList, Iterable<DescriptorProtos.OneofDescriptorProto> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllOneofDecl(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllReservedName(DslList<String, ReservedNameProxy> dslList, Iterable<String> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllReservedName(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllReservedRange(DslList<DescriptorProtos.DescriptorProto.ReservedRange, ReservedRangeProxy> dslList, Iterable<DescriptorProtos.DescriptorProto.ReservedRange> iterable) {
            dslList.getClass();
            iterable.getClass();
            addAllReservedRange(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignEnumType(DslList<DescriptorProtos.EnumDescriptorProto, EnumTypeProxy> dslList, DescriptorProtos.EnumDescriptorProto enumDescriptorProto) {
            dslList.getClass();
            enumDescriptorProto.getClass();
            addEnumType(dslList, enumDescriptorProto);
        }

        public final /* synthetic */ void plusAssignExtension(DslList<DescriptorProtos.FieldDescriptorProto, ExtensionProxy> dslList, DescriptorProtos.FieldDescriptorProto fieldDescriptorProto) {
            dslList.getClass();
            fieldDescriptorProto.getClass();
            addExtension(dslList, fieldDescriptorProto);
        }

        public final /* synthetic */ void plusAssignExtensionRange(DslList<DescriptorProtos.DescriptorProto.ExtensionRange, ExtensionRangeProxy> dslList, DescriptorProtos.DescriptorProto.ExtensionRange extensionRange) {
            dslList.getClass();
            extensionRange.getClass();
            addExtensionRange(dslList, extensionRange);
        }

        public final /* synthetic */ void plusAssignField(DslList<DescriptorProtos.FieldDescriptorProto, FieldProxy> dslList, DescriptorProtos.FieldDescriptorProto fieldDescriptorProto) {
            dslList.getClass();
            fieldDescriptorProto.getClass();
            addField(dslList, fieldDescriptorProto);
        }

        public final /* synthetic */ void plusAssignNestedType(DslList<DescriptorProtos.DescriptorProto, NestedTypeProxy> dslList, DescriptorProtos.DescriptorProto descriptorProto) {
            dslList.getClass();
            descriptorProto.getClass();
            addNestedType(dslList, descriptorProto);
        }

        public final /* synthetic */ void plusAssignOneofDecl(DslList<DescriptorProtos.OneofDescriptorProto, OneofDeclProxy> dslList, DescriptorProtos.OneofDescriptorProto oneofDescriptorProto) {
            dslList.getClass();
            oneofDescriptorProto.getClass();
            addOneofDecl(dslList, oneofDescriptorProto);
        }

        public final /* synthetic */ void plusAssignReservedName(DslList<String, ReservedNameProxy> dslList, String str) {
            dslList.getClass();
            str.getClass();
            addReservedName(dslList, str);
        }

        public final /* synthetic */ void plusAssignReservedRange(DslList<DescriptorProtos.DescriptorProto.ReservedRange, ReservedRangeProxy> dslList, DescriptorProtos.DescriptorProto.ReservedRange reservedRange) {
            dslList.getClass();
            reservedRange.getClass();
            addReservedRange(dslList, reservedRange);
        }

        public final /* synthetic */ void setEnumType(DslList dslList, int i, DescriptorProtos.EnumDescriptorProto enumDescriptorProto) {
            dslList.getClass();
            enumDescriptorProto.getClass();
            this._builder.setEnumType(i, enumDescriptorProto);
        }

        public final /* synthetic */ void setExtension(DslList dslList, int i, DescriptorProtos.FieldDescriptorProto fieldDescriptorProto) {
            dslList.getClass();
            fieldDescriptorProto.getClass();
            this._builder.setExtension(i, fieldDescriptorProto);
        }

        public final /* synthetic */ void setExtensionRange(DslList dslList, int i, DescriptorProtos.DescriptorProto.ExtensionRange extensionRange) {
            dslList.getClass();
            extensionRange.getClass();
            this._builder.setExtensionRange(i, extensionRange);
        }

        public final /* synthetic */ void setField(DslList dslList, int i, DescriptorProtos.FieldDescriptorProto fieldDescriptorProto) {
            dslList.getClass();
            fieldDescriptorProto.getClass();
            this._builder.setField(i, fieldDescriptorProto);
        }

        public final void setName(String str) {
            str.getClass();
            this._builder.setName(str);
        }

        public final /* synthetic */ void setNestedType(DslList dslList, int i, DescriptorProtos.DescriptorProto descriptorProto) {
            dslList.getClass();
            descriptorProto.getClass();
            this._builder.setNestedType(i, descriptorProto);
        }

        public final /* synthetic */ void setOneofDecl(DslList dslList, int i, DescriptorProtos.OneofDescriptorProto oneofDescriptorProto) {
            dslList.getClass();
            oneofDescriptorProto.getClass();
            this._builder.setOneofDecl(i, oneofDescriptorProto);
        }

        public final void setOptions(DescriptorProtos.MessageOptions messageOptions) {
            messageOptions.getClass();
            this._builder.setOptions(messageOptions);
        }

        public final /* synthetic */ void setReservedName(DslList dslList, int i, String str) {
            dslList.getClass();
            str.getClass();
            this._builder.setReservedName(i, str);
        }

        public final /* synthetic */ void setReservedRange(DslList dslList, int i, DescriptorProtos.DescriptorProto.ReservedRange reservedRange) {
            dslList.getClass();
            reservedRange.getClass();
            this._builder.setReservedRange(i, reservedRange);
        }

        public final void setVisibility(DescriptorProtos.SymbolVisibility symbolVisibility) {
            symbolVisibility.getClass();
            this._builder.setVisibility(symbolVisibility);
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/DescriptorProtoKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/DescriptorProtoKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$DescriptorProto$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(yx yxVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DescriptorProtos.DescriptorProto.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DescriptorProtos.DescriptorProto.Builder builder, yx yxVar) {
            this(builder);
        }

        public final /* synthetic */ void setReservedName(DslList dslList) {
            dslList.getClass();
            this._builder.clearReservedName();
        }
    }
}
