package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class j81 {
    public final q41 a = new q41(new x71[16]);
    public final b41 b = new b41(10);

    public boolean a(py0 py0Var, iq0 iq0Var, sl0 sl0Var, boolean z) {
        q41 q41Var = this.a;
        Object[] objArr = q41Var.e;
        int i = q41Var.g;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (!((x71) objArr[i2]).a(py0Var, iq0Var, sl0Var, z) && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        return z2;
    }

    public void b(sl0 sl0Var) {
        q41 q41Var = this.a;
        int i = q41Var.g;
        while (true) {
            i--;
            if (-1 < i) {
                if (((x71) q41Var.e[i]).d.a == 0) {
                    q41Var.k(i);
                }
            } else {
                return;
            }
        }
    }
}
