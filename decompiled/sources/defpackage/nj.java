package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class nj {
    public final q41 a;

    public nj(int i) {
        switch (i) {
            case 1:
                this.a = new q41(new ur0[16]);
                return;
            default:
                this.a = new q41(new ft[16]);
                return;
        }
    }

    public void a(CancellationException cancellationException) {
        q41 q41Var = this.a;
        int i = q41Var.g;
        nl[] nlVarArr = new nl[i];
        for (int i2 = 0; i2 < i; i2++) {
            nlVarArr[i2] = ((ft) q41Var.e[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            nlVarArr[i3].h(cancellationException);
        }
        if (q41Var.g == 0) {
            return;
        }
        nl0.c("uncancelled requests present");
    }

    public void b() {
        q41 q41Var = this.a;
        an0 X = go.X(0, q41Var.g);
        int i = X.e;
        int i2 = X.f;
        if (i <= i2) {
            while (true) {
                ((ft) q41Var.e[i]).b.resumeWith(od2.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        q41Var.g();
    }
}
