package defpackage;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class s80 {
    public static final String a = yl1.a(s80.class).d();

    public static int a() {
        cf2 cf2Var = cf2.e;
        cf2 cf2Var2 = rx.c;
        String str = a;
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (cf2Var2 == cf2Var) {
                Log.d(str, "Embedding extension version not found");
                return 0;
            }
            return 0;
        } catch (NullPointerException unused2) {
            if (cf2Var2 == cf2Var) {
                Log.d(str, "Error with Extension implementation");
                return 0;
            }
            return 0;
        } catch (UnsupportedOperationException unused3) {
            if (cf2Var2 == cf2Var) {
                Log.d(str, "Stub Extension");
                return 0;
            }
            return 0;
        }
    }
}
