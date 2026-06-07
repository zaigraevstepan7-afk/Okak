package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.elixir.loader.R;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class gj2 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final p22 a(Context context) {
        p22 p22Var;
        LinkedHashMap linkedHashMap = a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    lk c = sn0.c(-1, 6, null);
                    zf zfVar = new zf(new uw0(contentResolver, uriFor, new fj2(c, Handler.createAsync(Looper.getMainLooper())), c, context, null), 2);
                    h42 b = xq1.b();
                    vy vyVar = k10.a;
                    obj = qo.c0(zfVar, new ut(go.M(b, gz0.a)), new m22(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                p22Var = (p22) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return p22Var;
    }

    public static final xr b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof xr) {
            return (xr) tag;
        }
        return null;
    }
}
