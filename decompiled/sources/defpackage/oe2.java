package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class oe2 extends ud1 {
    public final je1 e = fr1.k(new fy1(0));
    public final je1 f = fr1.k(Boolean.FALSE);
    public final je2 g;
    public final je1 h;
    public float i;
    public ni j;

    public oe2(yf0 yf0Var) {
        je2 je2Var = new je2(yf0Var);
        je2Var.f = new s8(this, 14);
        this.g = je2Var;
        this.h = new je1(od2.a, g3.S);
        this.i = 1.0f;
    }

    @Override // defpackage.ud1
    public final void a(float f) {
        this.i = f;
    }

    @Override // defpackage.ud1
    public final void b(ni niVar) {
        this.j = niVar;
    }

    @Override // defpackage.ud1
    public final long d() {
        return ((fy1) this.e.getValue()).a;
    }

    @Override // defpackage.ud1
    public final void e(cr0 cr0Var) {
        vl vlVar = cr0Var.e;
        ni niVar = this.j;
        je2 je2Var = this.g;
        if (niVar == null) {
            niVar = (ni) je2Var.g.getValue();
        }
        if (((Boolean) this.f.getValue()).booleanValue() && cr0Var.getLayoutDirection() == jq0.f) {
            long l0 = vlVar.l0();
            ld ldVar = vlVar.f;
            long k = ldVar.k();
            ldVar.h().h();
            try {
                ((rg2) ldVar.f).z(-1.0f, 1.0f, l0);
                je2Var.e(cr0Var, this.i, niVar);
            } finally {
                l90.v(ldVar, k);
            }
        } else {
            je2Var.e(cr0Var, this.i, niVar);
        }
        this.h.getValue();
    }
}
