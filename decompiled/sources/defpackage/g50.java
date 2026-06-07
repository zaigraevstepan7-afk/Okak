package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class g50 extends f50 {
    @Override // defpackage.e50, defpackage.c50
    public void a(f52 f52Var, f52 f52Var2, Window window, View view, boolean z, boolean z2) {
        f52Var.getClass();
        f52Var2.getClass();
        window.getClass();
        view.getClass();
        xq1.s(window, false);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((attributes.flags & 256) != 0 || attributes.width != -2 || attributes.height != -2) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.addView(new wj1(viewGroup.getContext(), xn.F(new ko(2, 0), new ko(1, 0), new ko(4, 0), new ko(8, 0))));
        }
        window.setNavigationBarContrastEnforced(true);
        ov1 ov1Var = new ov1(window, view);
        ov1Var.n(!z);
        ov1Var.l(!z2);
    }
}
