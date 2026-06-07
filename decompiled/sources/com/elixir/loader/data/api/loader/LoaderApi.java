package com.elixir.loader.data.api.loader;

import defpackage.vt;
import defpackage.yq1;
import kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Path;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/elixir/loader/data/api/loader/LoaderApi;", "", "", "ext", "Lcom/elixir/loader/data/api/loader/HashResponse;", "getHash", "(Ljava/lang/String;Lvt;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public interface LoaderApi {
    @GET("loader/hash/{ext}")
    Object getHash(@Path("ext") String str, vt<? super HashResponse> vtVar);
}
