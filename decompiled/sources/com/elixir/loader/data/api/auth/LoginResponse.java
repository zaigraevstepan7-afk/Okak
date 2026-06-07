package com.elixir.loader.data.api.auth;

import defpackage.l90;
import defpackage.sn0;
import defpackage.yq1;
import defpackage.yx;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rB_\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010$J^\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u001fJ\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b3\u0010\u001fR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00108\u0012\u0004\b:\u00107\u001a\u0004\b9\u0010$R\"\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00104\u0012\u0004\b<\u00107\u001a\u0004\b;\u0010\"R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00108\u0012\u0004\b>\u00107\u001a\u0004\b=\u0010$R\u0013\u0010@\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b?\u0010\"R\u0013\u0010B\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\bA\u0010$¨\u0006E"}, d2 = {"Lcom/elixir/loader/data/api/auth/LoginResponse;", "", "", "success", "", "message", "code", "", "expiresIn", "lifeTime", "expiresInSnake", "lifeTimeSnake", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lod2;", "write$Self$app_release", "(Lcom/elixir/loader/data/api/auth/LoginResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Long;", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;)Lcom/elixir/loader/data/api/auth/LoginResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "Ljava/lang/String;", "getMessage", "getCode", "Ljava/lang/Long;", "getExpiresIn", "getExpiresIn$annotations", "()V", "Ljava/lang/Boolean;", "getLifeTime", "getLifeTime$annotations", "getExpiresInSnake", "getExpiresInSnake$annotations", "getLifeTimeSnake", "getLifeTimeSnake$annotations", "getEffectiveExpiresIn", "effectiveExpiresIn", "getEffectiveLifeTime", "effectiveLifeTime", "Companion", "$serializer", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
@Serializable
/* loaded from: classes.dex */
public final /* data */ class LoginResponse {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String code;
    private final Long expiresIn;
    private final Long expiresInSnake;
    private final Boolean lifeTime;
    private final Boolean lifeTimeSnake;
    private final String message;
    private final boolean success;

    public /* synthetic */ LoginResponse(int i, boolean z, String str, String str2, Long l, Boolean bool, Long l2, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, LoginResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.success = z;
        this.message = str;
        this.code = str2;
        if ((i & 8) == 0) {
            this.expiresIn = null;
        } else {
            this.expiresIn = l;
        }
        if ((i & 16) == 0) {
            this.lifeTime = null;
        } else {
            this.lifeTime = bool;
        }
        if ((i & 32) == 0) {
            this.expiresInSnake = null;
        } else {
            this.expiresInSnake = l2;
        }
        if ((i & 64) == 0) {
            this.lifeTimeSnake = null;
        } else {
            this.lifeTimeSnake = bool2;
        }
    }

    public static /* synthetic */ LoginResponse copy$default(LoginResponse loginResponse, boolean z, String str, String str2, Long l, Boolean bool, Long l2, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = loginResponse.success;
        }
        if ((i & 2) != 0) {
            str = loginResponse.message;
        }
        if ((i & 4) != 0) {
            str2 = loginResponse.code;
        }
        if ((i & 8) != 0) {
            l = loginResponse.expiresIn;
        }
        if ((i & 16) != 0) {
            bool = loginResponse.lifeTime;
        }
        if ((i & 32) != 0) {
            l2 = loginResponse.expiresInSnake;
        }
        if ((i & 64) != 0) {
            bool2 = loginResponse.lifeTimeSnake;
        }
        Long l3 = l2;
        Boolean bool3 = bool2;
        Boolean bool4 = bool;
        String str3 = str2;
        return loginResponse.copy(z, str, str3, l, bool4, l3, bool3);
    }

    public static final /* synthetic */ void write$Self$app_release(LoginResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.success);
        output.encodeStringElement(serialDesc, 1, self.message);
        output.encodeStringElement(serialDesc, 2, self.code);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.expiresIn != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.expiresIn);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.lifeTime != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.lifeTime);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.expiresInSnake != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, LongSerializer.INSTANCE, self.expiresInSnake);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.lifeTimeSnake != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, BooleanSerializer.INSTANCE, self.lifeTimeSnake);
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

    /* renamed from: component3, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getExpiresIn() {
        return this.expiresIn;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getLifeTime() {
        return this.lifeTime;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getExpiresInSnake() {
        return this.expiresInSnake;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getLifeTimeSnake() {
        return this.lifeTimeSnake;
    }

    public final LoginResponse copy(boolean success, String message, String code, Long expiresIn, Boolean lifeTime, Long expiresInSnake, Boolean lifeTimeSnake) {
        message.getClass();
        code.getClass();
        return new LoginResponse(success, message, code, expiresIn, lifeTime, expiresInSnake, lifeTimeSnake);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginResponse)) {
            return false;
        }
        LoginResponse loginResponse = (LoginResponse) other;
        if (this.success == loginResponse.success && sn0.r(this.message, loginResponse.message) && sn0.r(this.code, loginResponse.code) && sn0.r(this.expiresIn, loginResponse.expiresIn) && sn0.r(this.lifeTime, loginResponse.lifeTime) && sn0.r(this.expiresInSnake, loginResponse.expiresInSnake) && sn0.r(this.lifeTimeSnake, loginResponse.lifeTimeSnake)) {
            return true;
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final Long getEffectiveExpiresIn() {
        Long l = this.expiresIn;
        if (l == null) {
            return this.expiresInSnake;
        }
        return l;
    }

    public final Boolean getEffectiveLifeTime() {
        Boolean bool = this.lifeTime;
        if (bool == null) {
            return this.lifeTimeSnake;
        }
        return bool;
    }

    public final Long getExpiresIn() {
        return this.expiresIn;
    }

    public final Long getExpiresInSnake() {
        return this.expiresInSnake;
    }

    public final Boolean getLifeTime() {
        return this.lifeTime;
    }

    public final Boolean getLifeTimeSnake() {
        return this.lifeTimeSnake;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int d = l90.d(l90.d(Boolean.hashCode(this.success) * 31, 31, this.message), 31, this.code);
        Long l = this.expiresIn;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i2 = (d + hashCode) * 31;
        Boolean bool = this.lifeTime;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Long l2 = this.expiresInSnake;
        if (l2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Boolean bool2 = this.lifeTimeSnake;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        return "LoginResponse(success=" + this.success + ", message=" + this.message + ", code=" + this.code + ", expiresIn=" + this.expiresIn + ", lifeTime=" + this.lifeTime + ", expiresInSnake=" + this.expiresInSnake + ", lifeTimeSnake=" + this.lifeTimeSnake + ")";
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/elixir/loader/data/api/auth/LoginResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/elixir/loader/data/api/auth/LoginResponse;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        public final KSerializer<LoginResponse> serializer() {
            return LoginResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @SerialName("expiresIn")
    public static /* synthetic */ void getExpiresIn$annotations() {
    }

    @SerialName("expires_in")
    public static /* synthetic */ void getExpiresInSnake$annotations() {
    }

    @SerialName("lifeTime")
    public static /* synthetic */ void getLifeTime$annotations() {
    }

    @SerialName("life_time")
    public static /* synthetic */ void getLifeTimeSnake$annotations() {
    }

    public LoginResponse(boolean z, String str, String str2, Long l, Boolean bool, Long l2, Boolean bool2) {
        str.getClass();
        str2.getClass();
        this.success = z;
        this.message = str;
        this.code = str2;
        this.expiresIn = l;
        this.lifeTime = bool;
        this.expiresInSnake = l2;
        this.lifeTimeSnake = bool2;
    }

    public /* synthetic */ LoginResponse(boolean z, String str, String str2, Long l, Boolean bool, Long l2, Boolean bool2, int i, yx yxVar) {
        this(z, str, str2, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : l2, (i & 64) != 0 ? null : bool2);
    }
}
