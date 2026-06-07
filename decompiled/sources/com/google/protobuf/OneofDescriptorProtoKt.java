package com.google.protobuf;

import com.google.protobuf.DescriptorProtos;
import defpackage.yq1;
import defpackage.yx;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/OneofDescriptorProtoKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class OneofDescriptorProtoKt {
    public static final OneofDescriptorProtoKt INSTANCE = new OneofDescriptorProtoKt();

    private OneofDescriptorProtoKt() {
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000bJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00198G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\u0004\u0018\u00010\u0019*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/google/protobuf/OneofDescriptorProtoKt$Dsl;", "", "Lcom/google/protobuf/DescriptorProtos$OneofDescriptorProto$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/DescriptorProtos$OneofDescriptorProto$Builder;)V", "Lcom/google/protobuf/DescriptorProtos$OneofDescriptorProto;", "_build", "()Lcom/google/protobuf/DescriptorProtos$OneofDescriptorProto;", "Lod2;", "clearName", "()V", "", "hasName", "()Z", "clearOptions", "hasOptions", "Lcom/google/protobuf/DescriptorProtos$OneofDescriptorProto$Builder;", "", "value", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "name", "Lcom/google/protobuf/DescriptorProtos$OneofOptions;", "getOptions", "()Lcom/google/protobuf/DescriptorProtos$OneofOptions;", "setOptions", "(Lcom/google/protobuf/DescriptorProtos$OneofOptions;)V", "options", "getOptionsOrNull", "(Lcom/google/protobuf/OneofDescriptorProtoKt$Dsl;)Lcom/google/protobuf/DescriptorProtos$OneofOptions;", "optionsOrNull", "Companion", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DescriptorProtos.OneofDescriptorProto.Builder _builder;

        private Dsl(DescriptorProtos.OneofDescriptorProto.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ DescriptorProtos.OneofDescriptorProto _build() {
            DescriptorProtos.OneofDescriptorProto build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearOptions() {
            this._builder.clearOptions();
        }

        public final String getName() {
            String name = this._builder.getName();
            name.getClass();
            return name;
        }

        public final DescriptorProtos.OneofOptions getOptions() {
            DescriptorProtos.OneofOptions options = this._builder.getOptions();
            options.getClass();
            return options;
        }

        public final DescriptorProtos.OneofOptions getOptionsOrNull(Dsl dsl) {
            dsl.getClass();
            return OneofDescriptorProtoKtKt.getOptionsOrNull(dsl._builder);
        }

        public final boolean hasName() {
            return this._builder.hasName();
        }

        public final boolean hasOptions() {
            return this._builder.hasOptions();
        }

        public final void setName(String str) {
            str.getClass();
            this._builder.setName(str);
        }

        public final void setOptions(DescriptorProtos.OneofOptions oneofOptions) {
            oneofOptions.getClass();
            this._builder.setOptions(oneofOptions);
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/OneofDescriptorProtoKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/OneofDescriptorProtoKt$Dsl;", "builder", "Lcom/google/protobuf/DescriptorProtos$OneofDescriptorProto$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(yx yxVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(DescriptorProtos.OneofDescriptorProto.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(DescriptorProtos.OneofDescriptorProto.Builder builder, yx yxVar) {
            this(builder);
        }
    }
}
