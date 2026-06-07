package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class rx1 {
    public static SidecarInterface a(Context context) {
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }

    public static df2 b() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (!TextUtils.isEmpty(apiVersion)) {
                df2 df2Var = df2.j;
                return fr1.m(apiVersion);
            }
            return null;
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }
}
