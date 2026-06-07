package com.elixir.loader.data.api.configs;

import defpackage.sn0;
import defpackage.yq1;
import defpackage.yx;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006)"}, d2 = {"Lcom/elixir/loader/data/api/configs/CommonResponse;", "Lcom/elixir/loader/data/api/configs/BaseResponse;", "", "success", "", "message", "<init>", "(ZLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lod2;", "write$Self$app_release", "(Lcom/elixir/loader/data/api/configs/CommonResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/elixir/loader/data/api/configs/CommonResponse;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "Ljava/lang/String;", "getMessage", "Companion", "$serializer", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
@Serializable
/* loaded from: classes.dex */
public final /* data */ class CommonResponse implements BaseResponse {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String message;
    private final boolean success;

    public /* synthetic */ CommonResponse(int i, boolean z, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CommonResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.success = z;
        if ((i & 2) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
    }

    public static /* synthetic */ CommonResponse copy$default(CommonResponse commonResponse, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = commonResponse.success;
        }
        if ((i & 2) != 0) {
            str = commonResponse.message;
        }
        return commonResponse.copy(z, str);
    }

    public static final /* synthetic */ void write$Self$app_release(CommonResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.getSuccess());
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.getMessage() != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.getMessage());
        }
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final CommonResponse copy(boolean success, String message) {
        return new CommonResponse(success, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonResponse)) {
            return false;
        }
        CommonResponse commonResponse = (CommonResponse) other;
        if (this.success == commonResponse.success && sn0.r(this.message, commonResponse.message)) {
            return true;
        }
        return false;
    }

    @Override // com.elixir.loader.data.api.configs.BaseResponse
    public String getMessage() {
        return this.message;
    }

    @Override // com.elixir.loader.data.api.configs.BaseResponse
    public boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Boolean.hashCode(this.success) * 31;
        String str = this.message;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "CommonResponse(success=" + this.success + ", message=" + this.message + ")";
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/elixir/loader/data/api/configs/CommonResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/elixir/loader/data/api/configs/CommonResponse;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        public final KSerializer<CommonResponse> serializer() {
            return CommonResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CommonResponse(boolean z, String str) {
        this.success = z;
        this.message = str;
    }

    public /* synthetic */ CommonResponse(boolean z, String str, int i, yx yxVar) {
        this(z, (i & 2) != 0 ? null : str);
    }
}
