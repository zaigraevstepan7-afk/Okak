package com.elixir.loader.data.api.auth;

import defpackage.vt;
import defpackage.yq1;
import kotlin.Metadata;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J8\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/elixir/loader/data/api/auth/AuthApi;", "", "", "key", "hwid", "subType", "", "unfreezeKey", "Lcom/elixir/loader/data/api/auth/LoginResponse;", "login", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLvt;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public interface AuthApi {
    @FormUrlEncoded
    @POST("client/login/{key}")
    Object login(@Path("key") String str, @Field("hwid") String str2, @Field("sub_type") String str3, @Field("unfreeze_key") boolean z, vt<? super LoginResponse> vtVar);
}
