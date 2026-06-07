package com.elixir.loader.data.api.configs;

import defpackage.h2;
import defpackage.l60;
import defpackage.lo;
import defpackage.rr0;
import defpackage.sn0;
import defpackage.xt0;
import defpackage.yq1;
import defpackage.yx;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, d2 = {"Lcom/elixir/loader/data/api/configs/ConfigsListResponse;", "Lcom/elixir/loader/data/api/configs/BaseResponse;", "", "success", "", "message", "", "Lcom/elixir/loader/data/api/configs/ConfigResponse;", "configs", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lod2;", "write$Self$app_release", "(Lcom/elixir/loader/data/api/configs/ConfigsListResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(ZLjava/lang/String;Ljava/util/List;)Lcom/elixir/loader/data/api/configs/ConfigsListResponse;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "Ljava/lang/String;", "getMessage", "Ljava/util/List;", "getConfigs", "Companion", "$serializer", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
@Serializable
/* loaded from: classes.dex */
public final /* data */ class ConfigsListResponse implements BaseResponse {
    private final List<ConfigResponse> configs;
    private final String message;
    private final boolean success;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final rr0[] $childSerializers = {null, null, lo.O(xt0.e, new h2(16))};

    public /* synthetic */ ConfigsListResponse(int i, boolean z, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, ConfigsListResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.success = z;
        if ((i & 2) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
        if ((i & 4) == 0) {
            this.configs = l60.e;
        } else {
            this.configs = list;
        }
    }

    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ConfigResponse$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConfigsListResponse copy$default(ConfigsListResponse configsListResponse, boolean z, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = configsListResponse.success;
        }
        if ((i & 2) != 0) {
            str = configsListResponse.message;
        }
        if ((i & 4) != 0) {
            list = configsListResponse.configs;
        }
        return configsListResponse.copy(z, str, list);
    }

    public static final /* synthetic */ void write$Self$app_release(ConfigsListResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        rr0[] rr0VarArr = $childSerializers;
        output.encodeBooleanElement(serialDesc, 0, self.getSuccess());
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.getMessage() != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.getMessage());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !sn0.r(self.configs, l60.e)) {
            output.encodeSerializableElement(serialDesc, 2, (SerializationStrategy) rr0VarArr[2].getValue(), self.configs);
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

    public final List<ConfigResponse> component3() {
        return this.configs;
    }

    public final ConfigsListResponse copy(boolean success, String message, List<ConfigResponse> configs) {
        configs.getClass();
        return new ConfigsListResponse(success, message, configs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigsListResponse)) {
            return false;
        }
        ConfigsListResponse configsListResponse = (ConfigsListResponse) other;
        if (this.success == configsListResponse.success && sn0.r(this.message, configsListResponse.message) && sn0.r(this.configs, configsListResponse.configs)) {
            return true;
        }
        return false;
    }

    public final List<ConfigResponse> getConfigs() {
        return this.configs;
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
        return this.configs.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public String toString() {
        return "ConfigsListResponse(success=" + this.success + ", message=" + this.message + ", configs=" + this.configs + ")";
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/elixir/loader/data/api/configs/ConfigsListResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/elixir/loader/data/api/configs/ConfigsListResponse;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        public final KSerializer<ConfigsListResponse> serializer() {
            return ConfigsListResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ConfigsListResponse(boolean z, String str, List<ConfigResponse> list) {
        list.getClass();
        this.success = z;
        this.message = str;
        this.configs = list;
    }

    public /* synthetic */ ConfigsListResponse(boolean z, String str, List list, int i, yx yxVar) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? l60.e : list);
    }
}
