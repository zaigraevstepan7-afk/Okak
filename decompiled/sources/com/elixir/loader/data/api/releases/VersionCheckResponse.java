package com.elixir.loader.data.api.releases;

import defpackage.l90;
import defpackage.mb2;
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

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJL\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b/\u0010-\u001a\u0004\b.\u0010\u001bR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b1\u0010-\u001a\u0004\b0\u0010\u001bR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b3\u0010-\u001a\u0004\b\u0007\u0010\u001fR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010\u001bR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010*\u0012\u0004\b7\u0010-\u001a\u0004\b6\u0010\u001b¨\u0006:"}, d2 = {"Lcom/elixir/loader/data/api/releases/VersionCheckResponse;", "", "", "latestVersion", "gameVersion", "changelog", "", "isOutdated", "hash", "downloadUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lod2;", "write$Self$app_release", "(Lcom/elixir/loader/data/api/releases/VersionCheckResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/elixir/loader/data/api/releases/VersionCheckResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLatestVersion", "getLatestVersion$annotations", "()V", "getGameVersion", "getGameVersion$annotations", "getChangelog", "getChangelog$annotations", "Z", "isOutdated$annotations", "getHash", "getHash$annotations", "getDownloadUrl", "getDownloadUrl$annotations", "Companion", "$serializer", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
@Serializable
/* loaded from: classes.dex */
public final /* data */ class VersionCheckResponse {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String changelog;
    private final String downloadUrl;
    private final String gameVersion;
    private final String hash;
    private final boolean isOutdated;
    private final String latestVersion;

    public /* synthetic */ VersionCheckResponse(int i, String str, String str2, String str3, boolean z, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, VersionCheckResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.latestVersion = str;
        this.gameVersion = str2;
        this.changelog = str3;
        this.isOutdated = z;
        this.hash = str4;
        this.downloadUrl = str5;
    }

    public static /* synthetic */ VersionCheckResponse copy$default(VersionCheckResponse versionCheckResponse, String str, String str2, String str3, boolean z, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = versionCheckResponse.latestVersion;
        }
        if ((i & 2) != 0) {
            str2 = versionCheckResponse.gameVersion;
        }
        if ((i & 4) != 0) {
            str3 = versionCheckResponse.changelog;
        }
        if ((i & 8) != 0) {
            z = versionCheckResponse.isOutdated;
        }
        if ((i & 16) != 0) {
            str4 = versionCheckResponse.hash;
        }
        if ((i & 32) != 0) {
            str5 = versionCheckResponse.downloadUrl;
        }
        String str6 = str4;
        String str7 = str5;
        return versionCheckResponse.copy(str, str2, str3, z, str6, str7);
    }

    public static final /* synthetic */ void write$Self$app_release(VersionCheckResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.latestVersion);
        output.encodeStringElement(serialDesc, 1, self.gameVersion);
        output.encodeStringElement(serialDesc, 2, self.changelog);
        output.encodeBooleanElement(serialDesc, 3, self.isOutdated);
        output.encodeStringElement(serialDesc, 4, self.hash);
        output.encodeStringElement(serialDesc, 5, self.downloadUrl);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLatestVersion() {
        return this.latestVersion;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGameVersion() {
        return this.gameVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChangelog() {
        return this.changelog;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsOutdated() {
        return this.isOutdated;
    }

    /* renamed from: component5, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final VersionCheckResponse copy(String latestVersion, String gameVersion, String changelog, boolean isOutdated, String hash, String downloadUrl) {
        latestVersion.getClass();
        gameVersion.getClass();
        changelog.getClass();
        hash.getClass();
        downloadUrl.getClass();
        return new VersionCheckResponse(latestVersion, gameVersion, changelog, isOutdated, hash, downloadUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VersionCheckResponse)) {
            return false;
        }
        VersionCheckResponse versionCheckResponse = (VersionCheckResponse) other;
        if (sn0.r(this.latestVersion, versionCheckResponse.latestVersion) && sn0.r(this.gameVersion, versionCheckResponse.gameVersion) && sn0.r(this.changelog, versionCheckResponse.changelog) && this.isOutdated == versionCheckResponse.isOutdated && sn0.r(this.hash, versionCheckResponse.hash) && sn0.r(this.downloadUrl, versionCheckResponse.downloadUrl)) {
            return true;
        }
        return false;
    }

    public final String getChangelog() {
        return this.changelog;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getGameVersion() {
        return this.gameVersion;
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getLatestVersion() {
        return this.latestVersion;
    }

    public int hashCode() {
        return this.downloadUrl.hashCode() + l90.d(mb2.a(l90.d(l90.d(this.latestVersion.hashCode() * 31, 31, this.gameVersion), 31, this.changelog), 31, this.isOutdated), 31, this.hash);
    }

    public final boolean isOutdated() {
        return this.isOutdated;
    }

    public String toString() {
        return "VersionCheckResponse(latestVersion=" + this.latestVersion + ", gameVersion=" + this.gameVersion + ", changelog=" + this.changelog + ", isOutdated=" + this.isOutdated + ", hash=" + this.hash + ", downloadUrl=" + this.downloadUrl + ")";
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/elixir/loader/data/api/releases/VersionCheckResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/elixir/loader/data/api/releases/VersionCheckResponse;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        public final KSerializer<VersionCheckResponse> serializer() {
            return VersionCheckResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @SerialName("changelog")
    public static /* synthetic */ void getChangelog$annotations() {
    }

    @SerialName("download_url")
    public static /* synthetic */ void getDownloadUrl$annotations() {
    }

    @SerialName("game_version")
    public static /* synthetic */ void getGameVersion$annotations() {
    }

    @SerialName("hash")
    public static /* synthetic */ void getHash$annotations() {
    }

    @SerialName("latest_version")
    public static /* synthetic */ void getLatestVersion$annotations() {
    }

    @SerialName("is_outdated")
    public static /* synthetic */ void isOutdated$annotations() {
    }

    public VersionCheckResponse(String str, String str2, String str3, boolean z, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.latestVersion = str;
        this.gameVersion = str2;
        this.changelog = str3;
        this.isOutdated = z;
        this.hash = str4;
        this.downloadUrl = str5;
    }
}
