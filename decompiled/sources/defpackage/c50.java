package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class c50 {
    public void a(f52 f52Var, f52 f52Var2, Window window, View view, boolean z, boolean z2) {
        int i;
        int i2;
        f52Var.getClass();
        f52Var2.getClass();
        window.getClass();
        view.getClass();
        xq1.s(window, false);
        if (z) {
            i = f52Var.b;
        } else {
            i = f52Var.a;
        }
        window.setStatusBarColor(i);
        if (z2) {
            i2 = f52Var2.b;
        } else {
            i2 = f52Var2.a;
        }
        window.setNavigationBarColor(i2);
        ov1 ov1Var = new ov1(window, view);
        ov1Var.n(!z);
        ov1Var.l(!z2);
    }
}
