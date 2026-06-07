package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mf1 implements gm1 {
    public final Set e;
    public final q41 f = new q41(new hm1[16]);

    public mf1(Set set) {
        this.e = set;
    }

    @Override // defpackage.gm1
    public final void e() {
        q41 q41Var = this.f;
        Object[] objArr = q41Var.e;
        int i = q41Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            gm1 gm1Var = ((hm1) objArr[i2]).a;
            this.e.remove(gm1Var);
            gm1Var.e();
        }
    }

    @Override // defpackage.gm1
    public final void a() {
    }

    @Override // defpackage.gm1
    public final void d() {
    }
}
