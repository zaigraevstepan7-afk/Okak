package com.elixir.loader.data.api.configs;

import defpackage.se;
import defpackage.vt;
import defpackage.yq1;
import kotlin.Metadata;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001JB\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\nJR\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0014\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u0019\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0016H§@¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001eÀ\u0006\u0003"}, d2 = {"Lcom/elixir/loader/data/api/configs/ConfigsApi;", "", "", "key", "hwid", "name", "data", "subType", "Lcom/elixir/loader/data/api/configs/ConfigSingleResponse;", "createConfig", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvt;)Ljava/lang/Object;", "", "configId", "newName", "newData", "", "public", "Lcom/elixir/loader/data/api/configs/CommonResponse;", "updateConfig", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lvt;)Ljava/lang/Object;", "deleteConfig", "(Ljava/lang/String;Ljava/lang/String;ILvt;)Ljava/lang/Object;", "Lcom/elixir/loader/data/api/configs/ConfigsListResponse;", "getUserConfigs", "(Ljava/lang/String;Ljava/lang/String;Lvt;)Ljava/lang/Object;", "code", "getConfigByShareCode", "(Ljava/lang/String;Lvt;)Ljava/lang/Object;", "getMarketConfigs", "(Lvt;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public interface ConfigsApi {

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = yq1.f)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getUserConfigs$default(ConfigsApi configsApi, String str, String str2, vt vtVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return configsApi.getUserConfigs(str, str2, vtVar);
        }
        se.v("Super calls with default arguments not supported in this target, function: getUserConfigs");
        return null;
    }

    static /* synthetic */ Object updateConfig$default(ConfigsApi configsApi, String str, String str2, int i, String str3, String str4, Boolean bool, vt vtVar, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 8) != 0) {
                str3 = null;
            }
            if ((i2 & 16) != 0) {
                str4 = null;
            }
            if ((i2 & 32) != 0) {
                bool = null;
            }
            return configsApi.updateConfig(str, str2, i, str3, str4, bool, vtVar);
        }
        se.v("Super calls with default arguments not supported in this target, function: updateConfig");
        return null;
    }

    @FormUrlEncoded
    @POST("configs/create")
    Object createConfig(@Field("key") String str, @Field("token") String str2, @Field("name") String str3, @Field("data") String str4, @Field("sub_type") String str5, vt<? super ConfigSingleResponse> vtVar);

    @FormUrlEncoded
    @POST("configs/delete")
    Object deleteConfig(@Field("key") String str, @Field("token") String str2, @Field("config_id") int i, vt<? super CommonResponse> vtVar);

    @GET("configs/share/{code}")
    Object getConfigByShareCode(@Path("code") String str, vt<? super ConfigSingleResponse> vtVar);

    @GET("configs/market")
    Object getMarketConfigs(vt<? super ConfigsListResponse> vtVar);

    @GET("configs/list")
    Object getUserConfigs(@Query("key") String str, @Query("sub_type") String str2, vt<? super ConfigsListResponse> vtVar);

    @FormUrlEncoded
    @POST("configs/update")
    Object updateConfig(@Field("key") String str, @Field("token") String str2, @Field("config_id") int i, @Field("new_name") String str3, @Field("new_data") String str4, @Field("public") Boolean bool, vt<? super CommonResponse> vtVar);
}
