package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class pp implements su0 {
    public final /* synthetic */ y91 e;
    public final /* synthetic */ yp f;

    public /* synthetic */ pp(y91 y91Var, yp ypVar) {
        this.e = y91Var;
        this.f = ypVar;
    }

    @Override // defpackage.su0
    public final void g(uu0 uu0Var, mu0 mu0Var) {
        if (mu0Var == mu0.ON_CREATE) {
            OnBackInvokedDispatcher m = d1.m(this.f);
            m.getClass();
            q4 q4Var = this.e.b;
            q4Var.e(new r91(m, 0), 1);
            q4Var.e(new r91(m, 1000000), 0);
        }
    }
}
