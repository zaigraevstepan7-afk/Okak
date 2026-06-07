package okhttp3;

import android.content.Context;
import defpackage.yq1;
import kotlin.Metadata;
import okhttp3.internal._InternalVersionKt;
import okhttp3.internal.platform.PlatformRegistry;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087D¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lokhttp3/OkHttp;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Lod2;", "initialize", "(Landroid/content/Context;)V", "", "VERSION", "Ljava/lang/String;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class OkHttp {
    public static final OkHttp INSTANCE = new OkHttp();
    public static final String VERSION = _InternalVersionKt.CONST_VERSION;

    private OkHttp() {
    }

    public final void initialize(Context applicationContext) {
        applicationContext.getClass();
        PlatformRegistry platformRegistry = PlatformRegistry.INSTANCE;
        if (platformRegistry.getApplicationContext() == null) {
            platformRegistry.setApplicationContext(applicationContext.getApplicationContext());
        }
    }
}
