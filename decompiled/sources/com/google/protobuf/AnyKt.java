package com.google.protobuf;

import com.google.protobuf.Any;
import defpackage.yq1;
import defpackage.yx;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/google/protobuf/AnyKt;", "", "()V", "Dsl", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class AnyKt {
    public static final AnyKt INSTANCE = new AnyKt();

    private AnyKt() {
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00158G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/google/protobuf/AnyKt$Dsl;", "", "Lcom/google/protobuf/Any$Builder;", "_builder", "<init>", "(Lcom/google/protobuf/Any$Builder;)V", "Lcom/google/protobuf/Any;", "_build", "()Lcom/google/protobuf/Any;", "Lod2;", "clearTypeUrl", "()V", "clearValue", "Lcom/google/protobuf/Any$Builder;", "", "value", "getTypeUrl", "()Ljava/lang/String;", "setTypeUrl", "(Ljava/lang/String;)V", "typeUrl", "Lcom/google/protobuf/ByteString;", "getValue", "()Lcom/google/protobuf/ByteString;", "setValue", "(Lcom/google/protobuf/ByteString;)V", "Companion", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Dsl {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final Any.Builder _builder;

        private Dsl(Any.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Any _build() {
            Any build = this._builder.build();
            build.getClass();
            return build;
        }

        public final void clearTypeUrl() {
            this._builder.clearTypeUrl();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final String getTypeUrl() {
            String typeUrl = this._builder.getTypeUrl();
            typeUrl.getClass();
            return typeUrl;
        }

        public final ByteString getValue() {
            ByteString value = this._builder.getValue();
            value.getClass();
            return value;
        }

        public final void setTypeUrl(String str) {
            str.getClass();
            this._builder.setTypeUrl(str);
        }

        public final void setValue(ByteString byteString) {
            byteString.getClass();
            this._builder.setValue(byteString);
        }

        /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/AnyKt$Dsl$Companion;", "", "()V", "_create", "Lcom/google/protobuf/AnyKt$Dsl;", "builder", "Lcom/google/protobuf/Any$Builder;", "java_kotlin-lite-well_known_protos_kotlin_lite"}, k = 1, mv = {1, 9, 0}, xi = yq1.f)
        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(yx yxVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(Any.Builder builder) {
                builder.getClass();
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(Any.Builder builder, yx yxVar) {
            this(builder);
        }
    }
}
