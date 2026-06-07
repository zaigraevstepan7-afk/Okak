package com.elixir.loader.data.api.configs;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JN\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u001a\u0010(\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001dR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\"¨\u00068"}, d2 = {"Lcom/elixir/loader/data/api/configs/ConfigResponse;", "", "", "id", "", "name", "data", "subType", "shareCode", "", "public", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lod2;", "write$Self$app_release", "(Lcom/elixir/loader/data/api/configs/ConfigResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Z", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/elixir/loader/data/api/configs/ConfigResponse;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getName", "getData", "getSubType", "getSubType$annotations", "()V", "getShareCode", "getShareCode$annotations", "Z", "getPublic", "Companion", "$serializer", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
@Serializable
/* loaded from: classes.dex */
public final /* data */ class ConfigResponse {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String data;
    private final int id;
    private final String name;
    private final boolean public;
    private final String shareCode;
    private final String subType;

    public /* synthetic */ ConfigResponse(int i, int i2, String str, String str2, String str3, String str4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (47 != (i & 47)) {
            PluginExceptionsKt.throwMissingFieldException(i, 47, ConfigResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i2;
        this.name = str;
        this.data = str2;
        this.subType = str3;
        if ((i & 16) == 0) {
            this.shareCode = null;
        } else {
            this.shareCode = str4;
        }
        this.public = z;
    }

    public static /* synthetic */ ConfigResponse copy$default(ConfigResponse configResponse, int i, String str, String str2, String str3, String str4, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = configResponse.id;
        }
        if ((i2 & 2) != 0) {
            str = configResponse.name;
        }
        if ((i2 & 4) != 0) {
            str2 = configResponse.data;
        }
        if ((i2 & 8) != 0) {
            str3 = configResponse.subType;
        }
        if ((i2 & 16) != 0) {
            str4 = configResponse.shareCode;
        }
        if ((i2 & 32) != 0) {
            z = configResponse.public;
        }
        String str5 = str4;
        boolean z2 = z;
        return configResponse.copy(i, str, str2, str3, str5, z2);
    }

    public static final /* synthetic */ void write$Self$app_release(ConfigResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.name);
        output.encodeStringElement(serialDesc, 2, self.data);
        output.encodeStringElement(serialDesc, 3, self.subType);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.shareCode != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.shareCode);
        }
        output.encodeBooleanElement(serialDesc, 5, self.public);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getShareCode() {
        return this.shareCode;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getPublic() {
        return this.public;
    }

    public final ConfigResponse copy(int id, String name, String data, String subType, String shareCode, boolean r6) {
        name.getClass();
        data.getClass();
        subType.getClass();
        return new ConfigResponse(id, name, data, subType, shareCode, r6);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigResponse)) {
            return false;
        }
        ConfigResponse configResponse = (ConfigResponse) other;
        if (this.id == configResponse.id && sn0.r(this.name, configResponse.name) && sn0.r(this.data, configResponse.data) && sn0.r(this.subType, configResponse.subType) && sn0.r(this.shareCode, configResponse.shareCode) && this.public == configResponse.public) {
            return true;
        }
        return false;
    }

    public final String getData() {
        return this.data;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getPublic() {
        return this.public;
    }

    public final String getShareCode() {
        return this.shareCode;
    }

    public final String getSubType() {
        return this.subType;
    }

    public int hashCode() {
        int hashCode;
        int d = l90.d(l90.d(l90.d(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.data), 31, this.subType);
        String str = this.shareCode;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.public) + ((d + hashCode) * 31);
    }

    public String toString() {
        return "ConfigResponse(id=" + this.id + ", name=" + this.name + ", data=" + this.data + ", subType=" + this.subType + ", shareCode=" + this.shareCode + ", public=" + this.public + ")";
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/elixir/loader/data/api/configs/ConfigResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/elixir/loader/data/api/configs/ConfigResponse;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        public final KSerializer<ConfigResponse> serializer() {
            return ConfigResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @SerialName("share_code")
    public static /* synthetic */ void getShareCode$annotations() {
    }

    @SerialName("sub_type")
    public static /* synthetic */ void getSubType$annotations() {
    }

    public ConfigResponse(int i, String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.id = i;
        this.name = str;
        this.data = str2;
        this.subType = str3;
        this.shareCode = str4;
        this.public = z;
    }

    public /* synthetic */ ConfigResponse(int i, String str, String str2, String str3, String str4, boolean z, int i2, yx yxVar) {
        this(i, str, str2, str3, (i2 & 16) != 0 ? null : str4, z);
    }
}
