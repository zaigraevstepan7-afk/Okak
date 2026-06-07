package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class bg2 {
    public static ni2 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        ni2 b = ni2.b(null, rootWindowInsets);
        ji2 ji2Var = b.a;
        ji2Var.o(b);
        ji2Var.d(view.getRootView());
        return b;
    }
}
