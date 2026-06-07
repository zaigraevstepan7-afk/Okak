package com.elixir.loader.data.api.releases;

import defpackage.se;
import defpackage.vt;
import defpackage.yq1;
import java.util.List;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000b\u0010\bJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\f\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/elixir/loader/data/api/releases/ReleasesApi;", "", "", "isPc", "", "subType", "Lcom/elixir/loader/data/api/releases/VersionCheckResponse;", "checkVersion", "(ZLjava/lang/String;Lvt;)Ljava/lang/Object;", "", "Lcom/elixir/loader/data/api/releases/VersionResponse;", "getHistory", "fileUrl", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "downloadBinary", "(Ljava/lang/String;Lvt;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public interface ReleasesApi {

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object checkVersion$default(ReleasesApi releasesApi, boolean z, String str, vt vtVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                str = "external";
            }
            return releasesApi.checkVersion(z, str, vtVar);
        }
        se.v("Super calls with default arguments not supported in this target, function: checkVersion");
        return null;
    }

    static /* synthetic */ Object getHistory$default(ReleasesApi releasesApi, boolean z, String str, vt vtVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                str = "external";
            }
            return releasesApi.getHistory(z, str, vtVar);
        }
        se.v("Super calls with default arguments not supported in this target, function: getHistory");
        return null;
    }

    @GET("version/check")
    Object checkVersion(@Query("is_pc") boolean z, @Query("sub_type") String str, vt<? super VersionCheckResponse> vtVar);

    @Streaming
    @GET
    Object downloadBinary(@Url String str, vt<? super Response<ResponseBody>> vtVar);

    @GET("version/history")
    Object getHistory(@Query("is_pc") boolean z, @Query("sub_type") String str, vt<? super List<VersionResponse>> vtVar);
}
