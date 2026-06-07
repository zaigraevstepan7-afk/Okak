package com.elixir.loader.data.api.releases;

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

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fB_\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJV\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010\u001cR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b4\u00100\u001a\u0004\b3\u0010\u001cR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00105\u0012\u0004\b7\u00100\u001a\u0004\b6\u0010 R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b9\u00100\u001a\u0004\b8\u0010\u001cR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010-\u0012\u0004\b;\u00100\u001a\u0004\b:\u0010\u001cR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b=\u00100\u001a\u0004\b<\u0010\u001c¨\u0006@"}, d2 = {"Lcom/elixir/loader/data/api/releases/VersionResponse;", "", "", "version", "gameVersion", "changelog", "", "uploadDate", "filename", "hash", "subType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lod2;", "write$Self$app_release", "(Lcom/elixir/loader/data/api/releases/VersionResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/elixir/loader/data/api/releases/VersionResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVersion", "getVersion$annotations", "()V", "getGameVersion", "getGameVersion$annotations", "getChangelog", "getChangelog$annotations", "J", "getUploadDate", "getUploadDate$annotations", "getFilename", "getFilename$annotations", "getHash", "getHash$annotations", "getSubType", "getSubType$annotations", "Companion", "$serializer", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
@Serializable
/* loaded from: classes.dex */
public final /* data */ class VersionResponse {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String changelog;
    private final String filename;
    private final String gameVersion;
    private final String hash;
    private final String subType;
    private final long uploadDate;
    private final String version;

    public VersionResponse(String str, String str2, String str3, long j, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.version = str;
        this.gameVersion = str2;
        this.changelog = str3;
        this.uploadDate = j;
        this.filename = str4;
        this.hash = str5;
        this.subType = str6;
    }

    public static /* synthetic */ VersionResponse copy$default(VersionResponse versionResponse, String str, String str2, String str3, long j, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = versionResponse.version;
        }
        if ((i & 2) != 0) {
            str2 = versionResponse.gameVersion;
        }
        if ((i & 4) != 0) {
            str3 = versionResponse.changelog;
        }
        if ((i & 8) != 0) {
            j = versionResponse.uploadDate;
        }
        if ((i & 16) != 0) {
            str4 = versionResponse.filename;
        }
        if ((i & 32) != 0) {
            str5 = versionResponse.hash;
        }
        if ((i & 64) != 0) {
            str6 = versionResponse.subType;
        }
        String str7 = str6;
        String str8 = str4;
        long j2 = j;
        String str9 = str3;
        return versionResponse.copy(str, str2, str9, j2, str8, str5, str7);
    }

    public static final /* synthetic */ void write$Self$app_release(VersionResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.version);
        output.encodeStringElement(serialDesc, 1, self.gameVersion);
        output.encodeStringElement(serialDesc, 2, self.changelog);
        output.encodeLongElement(serialDesc, 3, self.uploadDate);
        output.encodeStringElement(serialDesc, 4, self.filename);
        output.encodeStringElement(serialDesc, 5, self.hash);
        output.encodeStringElement(serialDesc, 6, self.subType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
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
    public final long getUploadDate() {
        return this.uploadDate;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* renamed from: component6, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSubType() {
        return this.subType;
    }

    public final VersionResponse copy(String version, String gameVersion, String changelog, long uploadDate, String filename, String hash, String subType) {
        version.getClass();
        gameVersion.getClass();
        changelog.getClass();
        filename.getClass();
        hash.getClass();
        subType.getClass();
        return new VersionResponse(version, gameVersion, changelog, uploadDate, filename, hash, subType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VersionResponse)) {
            return false;
        }
        VersionResponse versionResponse = (VersionResponse) other;
        if (sn0.r(this.version, versionResponse.version) && sn0.r(this.gameVersion, versionResponse.gameVersion) && sn0.r(this.changelog, versionResponse.changelog) && this.uploadDate == versionResponse.uploadDate && sn0.r(this.filename, versionResponse.filename) && sn0.r(this.hash, versionResponse.hash) && sn0.r(this.subType, versionResponse.subType)) {
            return true;
        }
        return false;
    }

    public final String getChangelog() {
        return this.changelog;
    }

    public final String getFilename() {
        return this.filename;
    }

    public final String getGameVersion() {
        return this.gameVersion;
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getSubType() {
        return this.subType;
    }

    public final long getUploadDate() {
        return this.uploadDate;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.subType.hashCode() + l90.d(l90.d(l90.e(this.uploadDate, l90.d(l90.d(this.version.hashCode() * 31, 31, this.gameVersion), 31, this.changelog), 31), 31, this.filename), 31, this.hash);
    }

    public String toString() {
        return "VersionResponse(version=" + this.version + ", gameVersion=" + this.gameVersion + ", changelog=" + this.changelog + ", uploadDate=" + this.uploadDate + ", filename=" + this.filename + ", hash=" + this.hash + ", subType=" + this.subType + ")";
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/elixir/loader/data/api/releases/VersionResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/elixir/loader/data/api/releases/VersionResponse;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(yx yxVar) {
            this();
        }

        public final KSerializer<VersionResponse> serializer() {
            return VersionResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @SerialName("changelog")
    public static /* synthetic */ void getChangelog$annotations() {
    }

    @SerialName("filename")
    public static /* synthetic */ void getFilename$annotations() {
    }

    @SerialName("game_version")
    public static /* synthetic */ void getGameVersion$annotations() {
    }

    @SerialName("hash")
    public static /* synthetic */ void getHash$annotations() {
    }

    @SerialName("sub_type")
    public static /* synthetic */ void getSubType$annotations() {
    }

    @SerialName("upload_date")
    public static /* synthetic */ void getUploadDate$annotations() {
    }

    @SerialName("version")
    public static /* synthetic */ void getVersion$annotations() {
    }

    public /* synthetic */ VersionResponse(int i, String str, String str2, String str3, long j, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, VersionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.version = str;
        this.gameVersion = str2;
        this.changelog = str3;
        this.uploadDate = j;
        this.filename = str4;
        this.hash = str5;
        this.subType = str6;
    }
}
