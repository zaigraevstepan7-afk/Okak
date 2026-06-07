package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class m1 implements su0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m1(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.su0
    public final void g(uu0 uu0Var, mu0 mu0Var) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((oe0) obj).invoke(mu0Var);
                return;
            case 1:
                j51 j51Var = (j51) obj;
                j51Var.q = mu0Var.a();
                if (j51Var.c != null) {
                    Iterator it = wn.B0(j51Var.f).iterator();
                    while (it.hasNext()) {
                        d51 d51Var = (d51) it.next();
                        d51Var.getClass();
                        f51 f51Var = d51Var.l;
                        f51Var.getClass();
                        f51Var.a.h = mu0Var.a();
                        f51Var.d = mu0Var.a();
                        f51Var.b();
                    }
                    return;
                }
                return;
            default:
                br1 br1Var = (br1) obj;
                if (mu0Var == mu0.ON_START) {
                    br1Var.h = true;
                    return;
                } else {
                    if (mu0Var == mu0.ON_STOP) {
                        br1Var.h = false;
                        return;
                    }
                    return;
                }
        }
    }
}
