package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class r30 extends d21 implements rq0 {
    public n4 s;
    public se0 t;
    public sb1 u;
    public boolean v;

    @Override // defpackage.d21
    public final void E0() {
        this.v = false;
    }

    @Override // defpackage.rq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        boolean z;
        ig1 x = e01Var.x(j);
        if (!l01Var.S() || !this.v) {
            xd1 xd1Var = (xd1) this.t.invoke(new en0((x.f & 4294967295L) | (x.e << 32)), new us(j));
            this.s.h((cy) xd1Var.e, xd1Var.f);
        }
        if (!l01Var.S() && !this.v) {
            z = false;
        } else {
            z = true;
        }
        this.v = z;
        return l01Var.s0(x.e, x.f, m60.e, new k1(l01Var, this, x, 9));
    }
}
