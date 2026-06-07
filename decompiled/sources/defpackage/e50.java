package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class e50 extends d50 {
    @Override // defpackage.c50
    public void a(f52 f52Var, f52 f52Var2, Window window, View view, boolean z, boolean z2) {
        f52Var.getClass();
        f52Var2.getClass();
        window.getClass();
        view.getClass();
        xq1.s(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        ov1 ov1Var = new ov1(window, view);
        ov1Var.n(!z);
        ov1Var.l(true ^ z2);
    }
}
