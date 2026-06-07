package defpackage;

import com.elixir.loader.ElixirApplication;
import com.elixir.loader.data.api.auth.AuthApi;
import com.elixir.loader.data.api.configs.ConfigsApi;
import com.elixir.loader.data.api.loader.LoaderApi;
import com.elixir.loader.data.api.loader.LoaderDownloadApi;
import com.elixir.loader.data.api.releases.ReleasesApi;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.Json;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jd {
    public final ElixirApplication a;
    public final boolean b;
    public final b52 c;
    public final HttpLoggingInterceptor.Level d;
    public final HttpLoggingInterceptor.Level e;
    public final b52 f;
    public final b52 g;
    public final b52 h;
    public final b52 i;
    public final b52 j;
    public final b52 k;
    public final b52 l;
    public final b52 m;
    public final b52 n;
    public final b52 o;
    public final b52 p;
    public final b52 q;
    public final b52 r;
    public final b52 s;
    public final b52 t;
    public final b52 u;
    public final b52 v;
    public final b52 w;

    public jd(ElixirApplication elixirApplication) {
        boolean z;
        HttpLoggingInterceptor.Level level;
        HttpLoggingInterceptor.Level level2;
        this.a = elixirApplication;
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        if ((elixirApplication.getApplicationInfo().flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
        final int i4 = 5;
        this.c = new b52(new h2(i4));
        if (z) {
            level = HttpLoggingInterceptor.Level.BODY;
        } else {
            level = HttpLoggingInterceptor.Level.NONE;
        }
        this.d = level;
        if (z) {
            level2 = HttpLoggingInterceptor.Level.HEADERS;
        } else {
            level2 = HttpLoggingInterceptor.Level.NONE;
        }
        this.e = level2;
        this.f = new b52(new de0(this) { // from class: id
            public final /* synthetic */ jd f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i5 = i2;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                jd jdVar = this.f;
                switch (i5) {
                    case 0:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor.level(jdVar.d);
                        return builder.addInterceptor(httpLoggingInterceptor).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
                    case 1:
                        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor2.level(jdVar.e);
                        return builder2.addInterceptor(httpLoggingInterceptor2).connectTimeout(30L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
                    case 2:
                        MediaType mediaType = MediaType.INSTANCE.get("application/json");
                        Retrofit.Builder client = new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.f.getValue());
                        Json json = (Json) jdVar.c.getValue();
                        json.getClass();
                        mediaType.getClass();
                        return client.addConverterFactory(new v80(mediaType, new ov1(json, 0))).build();
                    case 3:
                        return new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.g.getValue()).build();
                    case 4:
                        return (AuthApi) jdVar.b().create(AuthApi.class);
                    case 5:
                        return (ConfigsApi) jdVar.b().create(ConfigsApi.class);
                    case 6:
                        return (ReleasesApi) jdVar.b().create(ReleasesApi.class);
                    case 7:
                        Object value = jdVar.i.getValue();
                        value.getClass();
                        return (ReleasesApi) ((Retrofit) value).create(ReleasesApi.class);
                    case 8:
                        return (LoaderApi) jdVar.b().create(LoaderApi.class);
                    case 9:
                        Object value2 = jdVar.i.getValue();
                        value2.getClass();
                        return (LoaderDownloadApi) ((Retrofit) value2).create(LoaderDownloadApi.class);
                    case 10:
                        return new rw(jdVar.a);
                    case 11:
                        Object value3 = jdVar.j.getValue();
                        value3.getClass();
                        return new of((AuthApi) value3);
                    case 12:
                        Object value4 = jdVar.k.getValue();
                        value4.getClass();
                        Object value5 = jdVar.l.getValue();
                        value5.getClass();
                        return new kf2((ReleasesApi) value4, (ReleasesApi) value5);
                    case 13:
                        Object value6 = jdVar.m.getValue();
                        value6.getClass();
                        Object value7 = jdVar.n.getValue();
                        value7.getClass();
                        ElixirApplication elixirApplication2 = jdVar.a;
                        String packageCodePath = elixirApplication2.getPackageCodePath();
                        packageCodePath.getClass();
                        File cacheDir = elixirApplication2.getCacheDir();
                        cacheDir.getClass();
                        return new pw0((LoaderApi) value6, (LoaderDownloadApi) value7, packageCodePath, cacheDir);
                    case 14:
                        return new cd(jdVar.a);
                    default:
                        File cacheDir2 = jdVar.a.getCacheDir();
                        cacheDir2.getClass();
                        return new xg2(cacheDir2, new ah2());
                }
            }
        });
        this.g = new b52(new de0(this) { // from class: id
            public final /* synthetic */ jd f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i5 = i3;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                jd jdVar = this.f;
                switch (i5) {
                    case 0:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor.level(jdVar.d);
                        return builder.addInterceptor(httpLoggingInterceptor).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
                    case 1:
                        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor2.level(jdVar.e);
                        return builder2.addInterceptor(httpLoggingInterceptor2).connectTimeout(30L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
                    case 2:
                        MediaType mediaType = MediaType.INSTANCE.get("application/json");
                        Retrofit.Builder client = new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.f.getValue());
                        Json json = (Json) jdVar.c.getValue();
                        json.getClass();
                        mediaType.getClass();
                        return client.addConverterFactory(new v80(mediaType, new ov1(json, 0))).build();
                    case 3:
                        return new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.g.getValue()).build();
                    case 4:
                        return (AuthApi) jdVar.b().create(AuthApi.class);
                    case 5:
                        return (ConfigsApi) jdVar.b().create(ConfigsApi.class);
                    case 6:
                        return (ReleasesApi) jdVar.b().create(ReleasesApi.class);
                    case 7:
                        Object value = jdVar.i.getValue();
                        value.getClass();
                        return (ReleasesApi) ((Retrofit) value).create(ReleasesApi.class);
                    case 8:
                        return (LoaderApi) jdVar.b().create(LoaderApi.class);
                    case 9:
                        Object value2 = jdVar.i.getValue();
                        value2.getClass();
                        return (LoaderDownloadApi) ((Retrofit) value2).create(LoaderDownloadApi.class);
                    case 10:
                        return new rw(jdVar.a);
                    case 11:
                        Object value3 = jdVar.j.getValue();
                        value3.getClass();
                        return new of((AuthApi) value3);
                    case 12:
                        Object value4 = jdVar.k.getValue();
                        value4.getClass();
                        Object value5 = jdVar.l.getValue();
                        value5.getClass();
                        return new kf2((ReleasesApi) value4, (ReleasesApi) value5);
                    case 13:
                        Object value6 = jdVar.m.getValue();
                        value6.getClass();
                        Object value7 = jdVar.n.getValue();
                        value7.getClass();
                        ElixirApplication elixirApplication2 = jdVar.a;
                        String packageCodePath = elixirApplication2.getPackageCodePath();
                        packageCodePath.getClass();
                        File cacheDir = elixirApplication2.getCacheDir();
                        cacheDir.getClass();
                        return new pw0((LoaderApi) value6, (LoaderDownloadApi) value7, packageCodePath, cacheDir);
                    case 14:
                        return new cd(jdVar.a);
                    default:
                        File cacheDir2 = jdVar.a.getCacheDir();
                        cacheDir2.getClass();
                        return new xg2(cacheDir2, new ah2());
                }
            }
        });
        this.h = new b52(new de0(this) { // from class: id
            public final /* synthetic */ jd f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i5 = i;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                jd jdVar = this.f;
                switch (i5) {
                    case 0:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor.level(jdVar.d);
                        return builder.addInterceptor(httpLoggingInterceptor).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
                    case 1:
                        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor2.level(jdVar.e);
                        return builder2.addInterceptor(httpLoggingInterceptor2).connectTimeout(30L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
                    case 2:
                        MediaType mediaType = MediaType.INSTANCE.get("application/json");
                        Retrofit.Builder client = new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.f.getValue());
                        Json json = (Json) jdVar.c.getValue();
                        json.getClass();
                        mediaType.getClass();
                        return client.addConverterFactory(new v80(mediaType, new ov1(json, 0))).build();
                    case 3:
                        return new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.g.getValue()).build();
                    case 4:
                        return (AuthApi) jdVar.b().create(AuthApi.class);
                    case 5:
                        return (ConfigsApi) jdVar.b().create(ConfigsApi.class);
                    case 6:
                        return (ReleasesApi) jdVar.b().create(ReleasesApi.class);
                    case 7:
                        Object value = jdVar.i.getValue();
                        value.getClass();
                        return (ReleasesApi) ((Retrofit) value).create(ReleasesApi.class);
                    case 8:
                        return (LoaderApi) jdVar.b().create(LoaderApi.class);
                    case 9:
                        Object value2 = jdVar.i.getValue();
                        value2.getClass();
                        return (LoaderDownloadApi) ((Retrofit) value2).create(LoaderDownloadApi.class);
                    case 10:
                        return new rw(jdVar.a);
                    case 11:
                        Object value3 = jdVar.j.getValue();
                        value3.getClass();
                        return new of((AuthApi) value3);
                    case 12:
                        Object value4 = jdVar.k.getValue();
                        value4.getClass();
                        Object value5 = jdVar.l.getValue();
                        value5.getClass();
                        return new kf2((ReleasesApi) value4, (ReleasesApi) value5);
                    case 13:
                        Object value6 = jdVar.m.getValue();
                        value6.getClass();
                        Object value7 = jdVar.n.getValue();
                        value7.getClass();
                        ElixirApplication elixirApplication2 = jdVar.a;
                        String packageCodePath = elixirApplication2.getPackageCodePath();
                        packageCodePath.getClass();
                        File cacheDir = elixirApplication2.getCacheDir();
                        cacheDir.getClass();
                        return new pw0((LoaderApi) value6, (LoaderDownloadApi) value7, packageCodePath, cacheDir);
                    case 14:
                        return new cd(jdVar.a);
                    default:
                        File cacheDir2 = jdVar.a.getCacheDir();
                        cacheDir2.getClass();
                        return new xg2(cacheDir2, new ah2());
                }
            }
        });
        final int i5 = 3;
        this.i = new b52(new de0(this) { // from class: id
            public final /* synthetic */ jd f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i52 = i5;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                jd jdVar = this.f;
                switch (i52) {
                    case 0:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor.level(jdVar.d);
                        return builder.addInterceptor(httpLoggingInterceptor).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
                    case 1:
                        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor2.level(jdVar.e);
                        return builder2.addInterceptor(httpLoggingInterceptor2).connectTimeout(30L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
                    case 2:
                        MediaType mediaType = MediaType.INSTANCE.get("application/json");
                        Retrofit.Builder client = new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.f.getValue());
                        Json json = (Json) jdVar.c.getValue();
                        json.getClass();
                        mediaType.getClass();
                        return client.addConverterFactory(new v80(mediaType, new ov1(json, 0))).build();
                    case 3:
                        return new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.g.getValue()).build();
                    case 4:
                        return (AuthApi) jdVar.b().create(AuthApi.class);
                    case 5:
                        return (ConfigsApi) jdVar.b().create(ConfigsApi.class);
                    case 6:
                        return (ReleasesApi) jdVar.b().create(ReleasesApi.class);
                    case 7:
                        Object value = jdVar.i.getValue();
                        value.getClass();
                        return (ReleasesApi) ((Retrofit) value).create(ReleasesApi.class);
                    case 8:
                        return (LoaderApi) jdVar.b().create(LoaderApi.class);
                    case 9:
                        Object value2 = jdVar.i.getValue();
                        value2.getClass();
                        return (LoaderDownloadApi) ((Retrofit) value2).create(LoaderDownloadApi.class);
                    case 10:
                        return new rw(jdVar.a);
                    case 11:
                        Object value3 = jdVar.j.getValue();
                        value3.getClass();
                        return new of((AuthApi) value3);
                    case 12:
                        Object value4 = jdVar.k.getValue();
                        value4.getClass();
                        Object value5 = jdVar.l.getValue();
                        value5.getClass();
                        return new kf2((ReleasesApi) value4, (ReleasesApi) value5);
                    case 13:
                        Object value6 = jdVar.m.getValue();
                        value6.getClass();
                        Object value7 = jdVar.n.getValue();
                        value7.getClass();
                        ElixirApplication elixirApplication2 = jdVar.a;
                        String packageCodePath = elixirApplication2.getPackageCodePath();
                        packageCodePath.getClass();
                        File cacheDir = elixirApplication2.getCacheDir();
                        cacheDir.getClass();
                        return new pw0((LoaderApi) value6, (LoaderDownloadApi) value7, packageCodePath, cacheDir);
                    case 14:
                        return new cd(jdVar.a);
                    default:
                        File cacheDir2 = jdVar.a.getCacheDir();
                        cacheDir2.getClass();
                        return new xg2(cacheDir2, new ah2());
                }
            }
        });
        final int i6 = 4;
        this.j = new b52(new de0(this) { // from class: id
            public final /* synthetic */ jd f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i52 = i6;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                jd jdVar = this.f;
                switch (i52) {
                    case 0:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor.level(jdVar.d);
                        return builder.addInterceptor(httpLoggingInterceptor).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
                    case 1:
                        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor2.level(jdVar.e);
                        return builder2.addInterceptor(httpLoggingInterceptor2).connectTimeout(30L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
                    case 2:
                        MediaType mediaType = MediaType.INSTANCE.get("application/json");
                        Retrofit.Builder client = new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.f.getValue());
                        Json json = (Json) jdVar.c.getValue();
                        json.getClass();
                        mediaType.getClass();
                        return client.addConverterFactory(new v80(mediaType, new ov1(json, 0))).build();
                    case 3:
                        return new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.g.getValue()).build();
                    case 4:
                        return (AuthApi) jdVar.b().create(AuthApi.class);
                    case 5:
                        return (ConfigsApi) jdVar.b().create(ConfigsApi.class);
                    case 6:
                        return (ReleasesApi) jdVar.b().create(ReleasesApi.class);
                    case 7:
                        Object value = jdVar.i.getValue();
                        value.getClass();
                        return (ReleasesApi) ((Retrofit) value).create(ReleasesApi.class);
                    case 8:
                        return (LoaderApi) jdVar.b().create(LoaderApi.class);
                    case 9:
                        Object value2 = jdVar.i.getValue();
                        value2.getClass();
                        return (LoaderDownloadApi) ((Retrofit) value2).create(LoaderDownloadApi.class);
                    case 10:
                        return new rw(jdVar.a);
                    case 11:
                        Object value3 = jdVar.j.getValue();
                        value3.getClass();
                        return new of((AuthApi) value3);
                    case 12:
                        Object value4 = jdVar.k.getValue();
                        value4.getClass();
                        Object value5 = jdVar.l.getValue();
                        value5.getClass();
                        return new kf2((ReleasesApi) value4, (ReleasesApi) value5);
                    case 13:
                        Object value6 = jdVar.m.getValue();
                        value6.getClass();
                        Object value7 = jdVar.n.getValue();
                        value7.getClass();
                        ElixirApplication elixirApplication2 = jdVar.a;
                        String packageCodePath = elixirApplication2.getPackageCodePath();
                        packageCodePath.getClass();
                        File cacheDir = elixirApplication2.getCacheDir();
                        cacheDir.getClass();
                        return new pw0((LoaderApi) value6, (LoaderDownloadApi) value7, packageCodePath, cacheDir);
                    case 14:
                        return new cd(jdVar.a);
                    default:
                        File cacheDir2 = jdVar.a.getCacheDir();
                        cacheDir2.getClass();
                        return new xg2(cacheDir2, new ah2());
                }
            }
        });
        new b52(new de0(this) { // from class: id
            public final /* synthetic */ jd f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i52 = i4;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                jd jdVar = this.f;
                switch (i52) {
                    case 0:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor.level(jdVar.d);
                        return builder.addInterceptor(httpLoggingInterceptor).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
                    case 1:
                        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor2.level(jdVar.e);
                        return builder2.addInterceptor(httpLoggingInterceptor2).connectTimeout(30L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
                    case 2:
                        MediaType mediaType = MediaType.INSTANCE.get("application/json");
                        Retrofit.Builder client = new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.f.getValue());
                        Json json = (Json) jdVar.c.getValue();
                        json.getClass();
                        mediaType.getClass();
                        return client.addConverterFactory(new v80(mediaType, new ov1(json, 0))).build();
                    case 3:
                        return new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.g.getValue()).build();
                    case 4:
                        return (AuthApi) jdVar.b().create(AuthApi.class);
                    case 5:
                        return (ConfigsApi) jdVar.b().create(ConfigsApi.class);
                    case 6:
                        return (ReleasesApi) jdVar.b().create(ReleasesApi.class);
                    case 7:
                        Object value = jdVar.i.getValue();
                        value.getClass();
                        return (ReleasesApi) ((Retrofit) value).create(ReleasesApi.class);
                    case 8:
                        return (LoaderApi) jdVar.b().create(LoaderApi.class);
                    case 9:
                        Object value2 = jdVar.i.getValue();
                        value2.getClass();
                        return (LoaderDownloadApi) ((Retrofit) value2).create(LoaderDownloadApi.class);
                    case 10:
                        return new rw(jdVar.a);
                    case 11:
                        Object value3 = jdVar.j.getValue();
                        value3.getClass();
                        return new of((AuthApi) value3);
                    case 12:
                        Object value4 = jdVar.k.getValue();
                        value4.getClass();
                        Object value5 = jdVar.l.getValue();
                        value5.getClass();
                        return new kf2((ReleasesApi) value4, (ReleasesApi) value5);
                    case 13:
                        Object value6 = jdVar.m.getValue();
                        value6.getClass();
                        Object value7 = jdVar.n.getValue();
                        value7.getClass();
                        ElixirApplication elixirApplication2 = jdVar.a;
                        String packageCodePath = elixirApplication2.getPackageCodePath();
                        packageCodePath.getClass();
                        File cacheDir = elixirApplication2.getCacheDir();
                        cacheDir.getClass();
                        return new pw0((LoaderApi) value6, (LoaderDownloadApi) value7, packageCodePath, cacheDir);
                    case 14:
                        return new cd(jdVar.a);
                    default:
                        File cacheDir2 = jdVar.a.getCacheDir();
                        cacheDir2.getClass();
                        return new xg2(cacheDir2, new ah2());
                }
            }
        });
        final int i7 = 6;
        this.k = new b52(new de0(this) { // from class: id
            public final /* synthetic */ jd f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i52 = i7;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                jd jdVar = this.f;
                switch (i52) {
                    case 0:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor.level(jdVar.d);
                        return builder.addInterceptor(httpLoggingInterceptor).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
                    case 1:
                        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor2.level(jdVar.e);
                        return builder2.addInterceptor(httpLoggingInterceptor2).connectTimeout(30L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
                    case 2:
                        MediaType mediaType = MediaType.INSTANCE.get("application/json");
                        Retrofit.Builder client = new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.f.getValue());
                        Json json = (Json) jdVar.c.getValue();
                        json.getClass();
                        mediaType.getClass();
                        return client.addConverterFactory(new v80(mediaType, new ov1(json, 0))).build();
                    case 3:
                        return new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.g.getValue()).build();
                    case 4:
                        return (AuthApi) jdVar.b().create(AuthApi.class);
                    case 5:
                        return (ConfigsApi) jdVar.b().create(ConfigsApi.class);
                    case 6:
                        return (ReleasesApi) jdVar.b().create(ReleasesApi.class);
                    case 7:
                        Object value = jdVar.i.getValue();
                        value.getClass();
                        return (ReleasesApi) ((Retrofit) value).create(ReleasesApi.class);
                    case 8:
                        return (LoaderApi) jdVar.b().create(LoaderApi.class);
                    case 9:
                        Object value2 = jdVar.i.getValue();
                        value2.getClass();
                        return (LoaderDownloadApi) ((Retrofit) value2).create(LoaderDownloadApi.class);
                    case 10:
                        return new rw(jdVar.a);
                    case 11:
                        Object value3 = jdVar.j.getValue();
                        value3.getClass();
                        return new of((AuthApi) value3);
                    case 12:
                        Object value4 = jdVar.k.getValue();
                        value4.getClass();
                        Object value5 = jdVar.l.getValue();
                        value5.getClass();
                        return new kf2((ReleasesApi) value4, (ReleasesApi) value5);
                    case 13:
                        Object value6 = jdVar.m.getValue();
                        value6.getClass();
                        Object value7 = jdVar.n.getValue();
                        value7.getClass();
                        ElixirApplication elixirApplication2 = jdVar.a;
                        String packageCodePath = elixirApplication2.getPackageCodePath();
                        packageCodePath.getClass();
                        File cacheDir = elixirApplication2.getCacheDir();
                        cacheDir.getClass();
                        return new pw0((LoaderApi) value6, (LoaderDownloadApi) value7, packageCodePath, cacheDir);
                    case 14:
                        return new cd(jdVar.a);
                    default:
                        File cacheDir2 = jdVar.a.getCacheDir();
                        cacheDir2.getClass();
                        return new xg2(cacheDir2, new ah2());
                }
            }
        });
        final int i8 = 7;
        this.l = new b52(new de0(this) { // from class: id
            public final /* synthetic */ jd f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i52 = i8;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                jd jdVar = this.f;
                switch (i52) {
                    case 0:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor.level(jdVar.d);
                        return builder.addInterceptor(httpLoggingInterceptor).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
                    case 1:
                        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor2.level(jdVar.e);
                        return builder2.addInterceptor(httpLoggingInterceptor2).connectTimeout(30L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
                    case 2:
                        MediaType mediaType = MediaType.INSTANCE.get("application/json");
                        Retrofit.Builder client = new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.f.getValue());
                        Json json = (Json) jdVar.c.getValue();
                        json.getClass();
                        mediaType.getClass();
                        return client.addConverterFactory(new v80(mediaType, new ov1(json, 0))).build();
                    case 3:
                        return new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.g.getValue()).build();
                    case 4:
                        return (AuthApi) jdVar.b().create(AuthApi.class);
                    case 5:
                        return (ConfigsApi) jdVar.b().create(ConfigsApi.class);
                    case 6:
                        return (ReleasesApi) jdVar.b().create(ReleasesApi.class);
                    case 7:
                        Object value = jdVar.i.getValue();
                        value.getClass();
                        return (ReleasesApi) ((Retrofit) value).create(ReleasesApi.class);
                    case 8:
                        return (LoaderApi) jdVar.b().create(LoaderApi.class);
                    case 9:
                        Object value2 = jdVar.i.getValue();
                        value2.getClass();
                        return (LoaderDownloadApi) ((Retrofit) value2).create(LoaderDownloadApi.class);
                    case 10:
                        return new rw(jdVar.a);
                    case 11:
                        Object value3 = jdVar.j.getValue();
                        value3.getClass();
                        return new of((AuthApi) value3);
                    case 12:
                        Object value4 = jdVar.k.getValue();
                        value4.getClass();
                        Object value5 = jdVar.l.getValue();
                        value5.getClass();
                        return new kf2((ReleasesApi) value4, (ReleasesApi) value5);
                    case 13:
                        Object value6 = jdVar.m.getValue();
                        value6.getClass();
                        Object value7 = jdVar.n.getValue();
                        value7.getClass();
                        ElixirApplication elixirApplication2 = jdVar.a;
                        String packageCodePath = elixirApplication2.getPackageCodePath();
                        packageCodePath.getClass();
                        File cacheDir = elixirApplication2.getCacheDir();
                        cacheDir.getClass();
                        return new pw0((LoaderApi) value6, (LoaderDownloadApi) value7, packageCodePath, cacheDir);
                    case 14:
                        return new cd(jdVar.a);
                    default:
                        File cacheDir2 = jdVar.a.getCacheDir();
                        cacheDir2.getClass();
                        return new xg2(cacheDir2, new ah2());
                }
            }
        });
        final int i9 = 8;
        this.m = new b52(new de0(this) { // from class: id
            public final /* synthetic */ jd f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i52 = i9;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                jd jdVar = this.f;
                switch (i52) {
                    case 0:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor.level(jdVar.d);
                        return builder.addInterceptor(httpLoggingInterceptor).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
                    case 1:
                        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor2.level(jdVar.e);
                        return builder2.addInterceptor(httpLoggingInterceptor2).connectTimeout(30L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
                    case 2:
                        MediaType mediaType = MediaType.INSTANCE.get("application/json");
                        Retrofit.Builder client = new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.f.getValue());
                        Json json = (Json) jdVar.c.getValue();
                        json.getClass();
                        mediaType.getClass();
                        return client.addConverterFactory(new v80(mediaType, new ov1(json, 0))).build();
                    case 3:
                        return new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.g.getValue()).build();
                    case 4:
                        return (AuthApi) jdVar.b().create(AuthApi.class);
                    case 5:
                        return (ConfigsApi) jdVar.b().create(ConfigsApi.class);
                    case 6:
                        return (ReleasesApi) jdVar.b().create(ReleasesApi.class);
                    case 7:
                        Object value = jdVar.i.getValue();
                        value.getClass();
                        return (ReleasesApi) ((Retrofit) value).create(ReleasesApi.class);
                    case 8:
                        return (LoaderApi) jdVar.b().create(LoaderApi.class);
                    case 9:
                        Object value2 = jdVar.i.getValue();
                        value2.getClass();
                        return (LoaderDownloadApi) ((Retrofit) value2).create(LoaderDownloadApi.class);
                    case 10:
                        return new rw(jdVar.a);
                    case 11:
                        Object value3 = jdVar.j.getValue();
                        value3.getClass();
                        return new of((AuthApi) value3);
                    case 12:
                        Object value4 = jdVar.k.getValue();
                        value4.getClass();
                        Object value5 = jdVar.l.getValue();
                        value5.getClass();
                        return new kf2((ReleasesApi) value4, (ReleasesApi) value5);
                    case 13:
                        Object value6 = jdVar.m.getValue();
                        value6.getClass();
                        Object value7 = jdVar.n.getValue();
                        value7.getClass();
                        ElixirApplication elixirApplication2 = jdVar.a;
                        String packageCodePath = elixirApplication2.getPackageCodePath();
                        packageCodePath.getClass();
                        File cacheDir = elixirApplication2.getCacheDir();
                        cacheDir.getClass();
                        return new pw0((LoaderApi) value6, (LoaderDownloadApi) value7, packageCodePath, cacheDir);
                    case 14:
                        return new cd(jdVar.a);
                    default:
                        File cacheDir2 = jdVar.a.getCacheDir();
                        cacheDir2.getClass();
                        return new xg2(cacheDir2, new ah2());
                }
            }
        });
        final int i10 = 9;
        this.n = new b52(new de0(this) { // from class: id
            public final /* synthetic */ jd f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i52 = i10;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                jd jdVar = this.f;
                switch (i52) {
                    case 0:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor.level(jdVar.d);
                        return builder.addInterceptor(httpLoggingInterceptor).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
                    case 1:
                        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor2.level(jdVar.e);
                        return builder2.addInterceptor(httpLoggingInterceptor2).connectTimeout(30L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
                    case 2:
                        MediaType mediaType = MediaType.INSTANCE.get("application/json");
                        Retrofit.Builder client = new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.f.getValue());
                        Json json = (Json) jdVar.c.getValue();
                        json.getClass();
                        mediaType.getClass();
                        return client.addConverterFactory(new v80(mediaType, new ov1(json, 0))).build();
                    case 3:
                        return new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.g.getValue()).build();
                    case 4:
                        return (AuthApi) jdVar.b().create(AuthApi.class);
                    case 5:
                        return (ConfigsApi) jdVar.b().create(ConfigsApi.class);
                    case 6:
                        return (ReleasesApi) jdVar.b().create(ReleasesApi.class);
                    case 7:
                        Object value = jdVar.i.getValue();
                        value.getClass();
                        return (ReleasesApi) ((Retrofit) value).create(ReleasesApi.class);
                    case 8:
                        return (LoaderApi) jdVar.b().create(LoaderApi.class);
                    case 9:
                        Object value2 = jdVar.i.getValue();
                        value2.getClass();
                        return (LoaderDownloadApi) ((Retrofit) value2).create(LoaderDownloadApi.class);
                    case 10:
                        return new rw(jdVar.a);
                    case 11:
                        Object value3 = jdVar.j.getValue();
                        value3.getClass();
                        return new of((AuthApi) value3);
                    case 12:
                        Object value4 = jdVar.k.getValue();
                        value4.getClass();
                        Object value5 = jdVar.l.getValue();
                        value5.getClass();
                        return new kf2((ReleasesApi) value4, (ReleasesApi) value5);
                    case 13:
                        Object value6 = jdVar.m.getValue();
                        value6.getClass();
                        Object value7 = jdVar.n.getValue();
                        value7.getClass();
                        ElixirApplication elixirApplication2 = jdVar.a;
                        String packageCodePath = elixirApplication2.getPackageCodePath();
                        packageCodePath.getClass();
                        File cacheDir = elixirApplication2.getCacheDir();
                        cacheDir.getClass();
                        return new pw0((LoaderApi) value6, (LoaderDownloadApi) value7, packageCodePath, cacheDir);
                    case 14:
                        return new cd(jdVar.a);
                    default:
                        File cacheDir2 = jdVar.a.getCacheDir();
                        cacheDir2.getClass();
                        return new xg2(cacheDir2, new ah2());
                }
            }
        });
        final int i11 = 10;
        this.o = new b52(new de0(this) { // from class: id
            public final /* synthetic */ jd f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i52 = i11;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                jd jdVar = this.f;
                switch (i52) {
                    case 0:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor.level(jdVar.d);
                        return builder.addInterceptor(httpLoggingInterceptor).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
                    case 1:
                        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor2.level(jdVar.e);
                        return builder2.addInterceptor(httpLoggingInterceptor2).connectTimeout(30L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
                    case 2:
                        MediaType mediaType = MediaType.INSTANCE.get("application/json");
                        Retrofit.Builder client = new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.f.getValue());
                        Json json = (Json) jdVar.c.getValue();
                        json.getClass();
                        mediaType.getClass();
                        return client.addConverterFactory(new v80(mediaType, new ov1(json, 0))).build();
                    case 3:
                        return new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.g.getValue()).build();
                    case 4:
                        return (AuthApi) jdVar.b().create(AuthApi.class);
                    case 5:
                        return (ConfigsApi) jdVar.b().create(ConfigsApi.class);
                    case 6:
                        return (ReleasesApi) jdVar.b().create(ReleasesApi.class);
                    case 7:
                        Object value = jdVar.i.getValue();
                        value.getClass();
                        return (ReleasesApi) ((Retrofit) value).create(ReleasesApi.class);
                    case 8:
                        return (LoaderApi) jdVar.b().create(LoaderApi.class);
                    case 9:
                        Object value2 = jdVar.i.getValue();
                        value2.getClass();
                        return (LoaderDownloadApi) ((Retrofit) value2).create(LoaderDownloadApi.class);
                    case 10:
                        return new rw(jdVar.a);
                    case 11:
                        Object value3 = jdVar.j.getValue();
                        value3.getClass();
                        return new of((AuthApi) value3);
                    case 12:
                        Object value4 = jdVar.k.getValue();
                        value4.getClass();
                        Object value5 = jdVar.l.getValue();
                        value5.getClass();
                        return new kf2((ReleasesApi) value4, (ReleasesApi) value5);
                    case 13:
                        Object value6 = jdVar.m.getValue();
                        value6.getClass();
                        Object value7 = jdVar.n.getValue();
                        value7.getClass();
                        ElixirApplication elixirApplication2 = jdVar.a;
                        String packageCodePath = elixirApplication2.getPackageCodePath();
                        packageCodePath.getClass();
                        File cacheDir = elixirApplication2.getCacheDir();
                        cacheDir.getClass();
                        return new pw0((LoaderApi) value6, (LoaderDownloadApi) value7, packageCodePath, cacheDir);
                    case 14:
                        return new cd(jdVar.a);
                    default:
                        File cacheDir2 = jdVar.a.getCacheDir();
                        cacheDir2.getClass();
                        return new xg2(cacheDir2, new ah2());
                }
            }
        });
        final int i12 = 11;
        this.p = new b52(new de0(this) { // from class: id
            public final /* synthetic */ jd f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i52 = i12;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                jd jdVar = this.f;
                switch (i52) {
                    case 0:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor.level(jdVar.d);
                        return builder.addInterceptor(httpLoggingInterceptor).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
                    case 1:
                        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor2.level(jdVar.e);
                        return builder2.addInterceptor(httpLoggingInterceptor2).connectTimeout(30L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
                    case 2:
                        MediaType mediaType = MediaType.INSTANCE.get("application/json");
                        Retrofit.Builder client = new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.f.getValue());
                        Json json = (Json) jdVar.c.getValue();
                        json.getClass();
                        mediaType.getClass();
                        return client.addConverterFactory(new v80(mediaType, new ov1(json, 0))).build();
                    case 3:
                        return new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.g.getValue()).build();
                    case 4:
                        return (AuthApi) jdVar.b().create(AuthApi.class);
                    case 5:
                        return (ConfigsApi) jdVar.b().create(ConfigsApi.class);
                    case 6:
                        return (ReleasesApi) jdVar.b().create(ReleasesApi.class);
                    case 7:
                        Object value = jdVar.i.getValue();
                        value.getClass();
                        return (ReleasesApi) ((Retrofit) value).create(ReleasesApi.class);
                    case 8:
                        return (LoaderApi) jdVar.b().create(LoaderApi.class);
                    case 9:
                        Object value2 = jdVar.i.getValue();
                        value2.getClass();
                        return (LoaderDownloadApi) ((Retrofit) value2).create(LoaderDownloadApi.class);
                    case 10:
                        return new rw(jdVar.a);
                    case 11:
                        Object value3 = jdVar.j.getValue();
                        value3.getClass();
                        return new of((AuthApi) value3);
                    case 12:
                        Object value4 = jdVar.k.getValue();
                        value4.getClass();
                        Object value5 = jdVar.l.getValue();
                        value5.getClass();
                        return new kf2((ReleasesApi) value4, (ReleasesApi) value5);
                    case 13:
                        Object value6 = jdVar.m.getValue();
                        value6.getClass();
                        Object value7 = jdVar.n.getValue();
                        value7.getClass();
                        ElixirApplication elixirApplication2 = jdVar.a;
                        String packageCodePath = elixirApplication2.getPackageCodePath();
                        packageCodePath.getClass();
                        File cacheDir = elixirApplication2.getCacheDir();
                        cacheDir.getClass();
                        return new pw0((LoaderApi) value6, (LoaderDownloadApi) value7, packageCodePath, cacheDir);
                    case 14:
                        return new cd(jdVar.a);
                    default:
                        File cacheDir2 = jdVar.a.getCacheDir();
                        cacheDir2.getClass();
                        return new xg2(cacheDir2, new ah2());
                }
            }
        });
        final int i13 = 12;
        this.q = new b52(new de0(this) { // from class: id
            public final /* synthetic */ jd f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i52 = i13;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                jd jdVar = this.f;
                switch (i52) {
                    case 0:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor.level(jdVar.d);
                        return builder.addInterceptor(httpLoggingInterceptor).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
                    case 1:
                        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor2.level(jdVar.e);
                        return builder2.addInterceptor(httpLoggingInterceptor2).connectTimeout(30L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
                    case 2:
                        MediaType mediaType = MediaType.INSTANCE.get("application/json");
                        Retrofit.Builder client = new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.f.getValue());
                        Json json = (Json) jdVar.c.getValue();
                        json.getClass();
                        mediaType.getClass();
                        return client.addConverterFactory(new v80(mediaType, new ov1(json, 0))).build();
                    case 3:
                        return new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.g.getValue()).build();
                    case 4:
                        return (AuthApi) jdVar.b().create(AuthApi.class);
                    case 5:
                        return (ConfigsApi) jdVar.b().create(ConfigsApi.class);
                    case 6:
                        return (ReleasesApi) jdVar.b().create(ReleasesApi.class);
                    case 7:
                        Object value = jdVar.i.getValue();
                        value.getClass();
                        return (ReleasesApi) ((Retrofit) value).create(ReleasesApi.class);
                    case 8:
                        return (LoaderApi) jdVar.b().create(LoaderApi.class);
                    case 9:
                        Object value2 = jdVar.i.getValue();
                        value2.getClass();
                        return (LoaderDownloadApi) ((Retrofit) value2).create(LoaderDownloadApi.class);
                    case 10:
                        return new rw(jdVar.a);
                    case 11:
                        Object value3 = jdVar.j.getValue();
                        value3.getClass();
                        return new of((AuthApi) value3);
                    case 12:
                        Object value4 = jdVar.k.getValue();
                        value4.getClass();
                        Object value5 = jdVar.l.getValue();
                        value5.getClass();
                        return new kf2((ReleasesApi) value4, (ReleasesApi) value5);
                    case 13:
                        Object value6 = jdVar.m.getValue();
                        value6.getClass();
                        Object value7 = jdVar.n.getValue();
                        value7.getClass();
                        ElixirApplication elixirApplication2 = jdVar.a;
                        String packageCodePath = elixirApplication2.getPackageCodePath();
                        packageCodePath.getClass();
                        File cacheDir = elixirApplication2.getCacheDir();
                        cacheDir.getClass();
                        return new pw0((LoaderApi) value6, (LoaderDownloadApi) value7, packageCodePath, cacheDir);
                    case 14:
                        return new cd(jdVar.a);
                    default:
                        File cacheDir2 = jdVar.a.getCacheDir();
                        cacheDir2.getClass();
                        return new xg2(cacheDir2, new ah2());
                }
            }
        });
        this.r = new b52(new h2(i8));
        final int i14 = 13;
        this.s = new b52(new de0(this) { // from class: id
            public final /* synthetic */ jd f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i52 = i14;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                jd jdVar = this.f;
                switch (i52) {
                    case 0:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor.level(jdVar.d);
                        return builder.addInterceptor(httpLoggingInterceptor).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
                    case 1:
                        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor2.level(jdVar.e);
                        return builder2.addInterceptor(httpLoggingInterceptor2).connectTimeout(30L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
                    case 2:
                        MediaType mediaType = MediaType.INSTANCE.get("application/json");
                        Retrofit.Builder client = new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.f.getValue());
                        Json json = (Json) jdVar.c.getValue();
                        json.getClass();
                        mediaType.getClass();
                        return client.addConverterFactory(new v80(mediaType, new ov1(json, 0))).build();
                    case 3:
                        return new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.g.getValue()).build();
                    case 4:
                        return (AuthApi) jdVar.b().create(AuthApi.class);
                    case 5:
                        return (ConfigsApi) jdVar.b().create(ConfigsApi.class);
                    case 6:
                        return (ReleasesApi) jdVar.b().create(ReleasesApi.class);
                    case 7:
                        Object value = jdVar.i.getValue();
                        value.getClass();
                        return (ReleasesApi) ((Retrofit) value).create(ReleasesApi.class);
                    case 8:
                        return (LoaderApi) jdVar.b().create(LoaderApi.class);
                    case 9:
                        Object value2 = jdVar.i.getValue();
                        value2.getClass();
                        return (LoaderDownloadApi) ((Retrofit) value2).create(LoaderDownloadApi.class);
                    case 10:
                        return new rw(jdVar.a);
                    case 11:
                        Object value3 = jdVar.j.getValue();
                        value3.getClass();
                        return new of((AuthApi) value3);
                    case 12:
                        Object value4 = jdVar.k.getValue();
                        value4.getClass();
                        Object value5 = jdVar.l.getValue();
                        value5.getClass();
                        return new kf2((ReleasesApi) value4, (ReleasesApi) value5);
                    case 13:
                        Object value6 = jdVar.m.getValue();
                        value6.getClass();
                        Object value7 = jdVar.n.getValue();
                        value7.getClass();
                        ElixirApplication elixirApplication2 = jdVar.a;
                        String packageCodePath = elixirApplication2.getPackageCodePath();
                        packageCodePath.getClass();
                        File cacheDir = elixirApplication2.getCacheDir();
                        cacheDir.getClass();
                        return new pw0((LoaderApi) value6, (LoaderDownloadApi) value7, packageCodePath, cacheDir);
                    case 14:
                        return new cd(jdVar.a);
                    default:
                        File cacheDir2 = jdVar.a.getCacheDir();
                        cacheDir2.getClass();
                        return new xg2(cacheDir2, new ah2());
                }
            }
        });
        this.t = new b52(new h2(i9));
        final int i15 = 14;
        this.u = new b52(new de0(this) { // from class: id
            public final /* synthetic */ jd f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i52 = i15;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                jd jdVar = this.f;
                switch (i52) {
                    case 0:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor.level(jdVar.d);
                        return builder.addInterceptor(httpLoggingInterceptor).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
                    case 1:
                        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor2.level(jdVar.e);
                        return builder2.addInterceptor(httpLoggingInterceptor2).connectTimeout(30L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
                    case 2:
                        MediaType mediaType = MediaType.INSTANCE.get("application/json");
                        Retrofit.Builder client = new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.f.getValue());
                        Json json = (Json) jdVar.c.getValue();
                        json.getClass();
                        mediaType.getClass();
                        return client.addConverterFactory(new v80(mediaType, new ov1(json, 0))).build();
                    case 3:
                        return new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.g.getValue()).build();
                    case 4:
                        return (AuthApi) jdVar.b().create(AuthApi.class);
                    case 5:
                        return (ConfigsApi) jdVar.b().create(ConfigsApi.class);
                    case 6:
                        return (ReleasesApi) jdVar.b().create(ReleasesApi.class);
                    case 7:
                        Object value = jdVar.i.getValue();
                        value.getClass();
                        return (ReleasesApi) ((Retrofit) value).create(ReleasesApi.class);
                    case 8:
                        return (LoaderApi) jdVar.b().create(LoaderApi.class);
                    case 9:
                        Object value2 = jdVar.i.getValue();
                        value2.getClass();
                        return (LoaderDownloadApi) ((Retrofit) value2).create(LoaderDownloadApi.class);
                    case 10:
                        return new rw(jdVar.a);
                    case 11:
                        Object value3 = jdVar.j.getValue();
                        value3.getClass();
                        return new of((AuthApi) value3);
                    case 12:
                        Object value4 = jdVar.k.getValue();
                        value4.getClass();
                        Object value5 = jdVar.l.getValue();
                        value5.getClass();
                        return new kf2((ReleasesApi) value4, (ReleasesApi) value5);
                    case 13:
                        Object value6 = jdVar.m.getValue();
                        value6.getClass();
                        Object value7 = jdVar.n.getValue();
                        value7.getClass();
                        ElixirApplication elixirApplication2 = jdVar.a;
                        String packageCodePath = elixirApplication2.getPackageCodePath();
                        packageCodePath.getClass();
                        File cacheDir = elixirApplication2.getCacheDir();
                        cacheDir.getClass();
                        return new pw0((LoaderApi) value6, (LoaderDownloadApi) value7, packageCodePath, cacheDir);
                    case 14:
                        return new cd(jdVar.a);
                    default:
                        File cacheDir2 = jdVar.a.getCacheDir();
                        cacheDir2.getClass();
                        return new xg2(cacheDir2, new ah2());
                }
            }
        });
        final int i16 = 15;
        this.v = new b52(new de0(this) { // from class: id
            public final /* synthetic */ jd f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int i52 = i16;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                jd jdVar = this.f;
                switch (i52) {
                    case 0:
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor.level(jdVar.d);
                        return builder.addInterceptor(httpLoggingInterceptor).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).build();
                    case 1:
                        OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
                        HttpLoggingInterceptor httpLoggingInterceptor2 = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor2.level(jdVar.e);
                        return builder2.addInterceptor(httpLoggingInterceptor2).connectTimeout(30L, timeUnit).readTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).build();
                    case 2:
                        MediaType mediaType = MediaType.INSTANCE.get("application/json");
                        Retrofit.Builder client = new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.f.getValue());
                        Json json = (Json) jdVar.c.getValue();
                        json.getClass();
                        mediaType.getClass();
                        return client.addConverterFactory(new v80(mediaType, new ov1(json, 0))).build();
                    case 3:
                        return new Retrofit.Builder().baseUrl("https://elixir-api.cc/").client((OkHttpClient) jdVar.g.getValue()).build();
                    case 4:
                        return (AuthApi) jdVar.b().create(AuthApi.class);
                    case 5:
                        return (ConfigsApi) jdVar.b().create(ConfigsApi.class);
                    case 6:
                        return (ReleasesApi) jdVar.b().create(ReleasesApi.class);
                    case 7:
                        Object value = jdVar.i.getValue();
                        value.getClass();
                        return (ReleasesApi) ((Retrofit) value).create(ReleasesApi.class);
                    case 8:
                        return (LoaderApi) jdVar.b().create(LoaderApi.class);
                    case 9:
                        Object value2 = jdVar.i.getValue();
                        value2.getClass();
                        return (LoaderDownloadApi) ((Retrofit) value2).create(LoaderDownloadApi.class);
                    case 10:
                        return new rw(jdVar.a);
                    case 11:
                        Object value3 = jdVar.j.getValue();
                        value3.getClass();
                        return new of((AuthApi) value3);
                    case 12:
                        Object value4 = jdVar.k.getValue();
                        value4.getClass();
                        Object value5 = jdVar.l.getValue();
                        value5.getClass();
                        return new kf2((ReleasesApi) value4, (ReleasesApi) value5);
                    case 13:
                        Object value6 = jdVar.m.getValue();
                        value6.getClass();
                        Object value7 = jdVar.n.getValue();
                        value7.getClass();
                        ElixirApplication elixirApplication2 = jdVar.a;
                        String packageCodePath = elixirApplication2.getPackageCodePath();
                        packageCodePath.getClass();
                        File cacheDir = elixirApplication2.getCacheDir();
                        cacheDir.getClass();
                        return new pw0((LoaderApi) value6, (LoaderDownloadApi) value7, packageCodePath, cacheDir);
                    case 14:
                        return new cd(jdVar.a);
                    default:
                        File cacheDir2 = jdVar.a.getCacheDir();
                        cacheDir2.getClass();
                        return new xg2(cacheDir2, new ah2());
                }
            }
        });
        this.w = new b52(new h2(i7));
    }

    public final rw a() {
        return (rw) this.o.getValue();
    }

    public final Retrofit b() {
        Object value = this.h.getValue();
        value.getClass();
        return (Retrofit) value;
    }
}
