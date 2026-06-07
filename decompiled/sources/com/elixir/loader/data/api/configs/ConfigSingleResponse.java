package com.elixir.loader.data.api.configs;

import defpackage.sn0;
import defpackage.yq1;
import defpackage.yx;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J>\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010 ¨\u00066"}, d2 = {"Lcom/elixir/loader/data/api/configs/ConfigSingleResponse;", "Lcom/elixir/loader/data/api/configs/BaseResponse;", "", "success", "", "message", "Lcom/elixir/loader/data/api/configs/ConfigResponse;", "config", "", "configId", "<init>", "(ZLjava/lang/String;Lcom/elixir/loader/data/api/configs/ConfigResponse;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Lcom/elixir/loader/data/api/configs/ConfigResponse;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lod2;", "write$Self$app_release", "(Lcom/elixir/loader/data/api/configs/ConfigSingleResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Lcom/elixir/loader/data/api/configs/ConfigResponse;", "component4", "()Ljava/lang/Integer;", "copy", "(ZLjava/lang/String;Lcom/elixir/loader/data/api/configs/ConfigResponse;Ljava/lang/Integer;)Lcom/elixir/loader/data/api/configs/ConfigSingleResponse;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "Ljava/lang/String;", "getMessage", "Lcom/elixir/loader/data/api/configs/ConfigResponse;", "getConfig", "Ljava/lang/Integer;", "getConfigId", "getConfigId$annotations", "()V", "Companion", "$serializer", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
@Serializable
/* loaded from: classes.dex */
public final /* data */ class ConfigSingleResponse implements BaseResponse {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ConfigResponse config;
    private final Integer configId;
    private final String message;
    private final boolean success;

    public /* synthetic */ ConfigSingleResponse(int i, boolean z, String str, ConfigResponse configResponse, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ConfigSingleResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.success = z;
        if ((i & 2) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
        if ((i & 4) == 0) {
            this.config = null;
        } else {
            this.config = configResponse;
        }
        if ((i & 8) == 0) {
            this.configId = null;
        } else {
            this.configId = num;
        }
    }

    public static /* synthetic */ ConfigSingleResponse copy$default(ConfigSingleResponse configSingleResponse, boolean z, String str, ConfigResponse configResponse, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = configSingleResponse.success;
        }
        if ((i & 2) != 0) {
            str = configSingleResponse.message;
        }
        if ((i & 4) != 0) {
            configResponse = configSingleResponse.config;
        }
        if ((i & 8) != 0) {
            num = configSingleResponse.configId;
        }
        return configSingleResponse.copy(z, str, configResponse, num);
    }

    public static final /* synthetic */ void write$Self$app_release(ConfigSingleResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.getSuccess());
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.getMessage() != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.getMessage());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.config != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, ConfigResponse$$serializer.INSTANCE, self.config);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.configId != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.configId);
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
    public final ConfigResponse getConfig() {
        return this.config;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getConfigId() {
        return this.configId;
    }

    public final ConfigSingleResponse copy(boolean success, String message, ConfigResponse config, Integer configId) {
        return new ConfigSingleResponse(success, message, config, configId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigSingleResponse)) {
            return false;
        }
        ConfigSingleResponse configSingleResponse = (ConfigSingleResponse) other;
        if (this.success == configSingleResponse.success && sn0.r(this.message, configSingleResponse.message) && sn0.r(this.config, configSingleResponse.config) && sn0.r(this.configId, configSingleResponse.configId)) {
            return true;
        }
        return false;
    }

    public final ConfigResponse getConfig() {
        return this.config;
    }

    public final Integer getConfigId() {
        return this.configId;
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
        int hashCode2;
        int hashCode3 = Boolean.hashCode(this.success) * 31;
        String str = this.message;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        ConfigResponse configResponse = this.config;
        if (configResponse == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = configResponse.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num = this.configId;
        if (num != null) {
            i = num.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        return "ConfigSingleResponse(success=" + this.success + ", message=" + this.message + ", config=" + this.config + ", configId=" + this.configId + ")";
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/elixir/loader/data/api/configs/ConfigSingleResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/elixir/loader/data/api/configs/ConfigSingleResponse;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        public final KSerializer<ConfigSingleResponse> serializer() {
            return ConfigSingleResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @SerialName("config_id")
    public static /* synthetic */ void getConfigId$annotations() {
    }

    public ConfigSingleResponse(boolean z, String str, ConfigResponse configResponse, Integer num) {
        this.success = z;
        this.message = str;
        this.config = configResponse;
        this.configId = num;
    }

    public /* synthetic */ ConfigSingleResponse(boolean z, String str, ConfigResponse configResponse, Integer num, int i, yx yxVar) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : configResponse, (i & 8) != 0 ? null : num);
    }
}
