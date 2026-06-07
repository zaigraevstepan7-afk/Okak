package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pi extends d21 implements rq0, pu1 {
    public oe0 s;

    public pi(oe0 oe0Var) {
        this.s = oe0Var;
    }

    @Override // defpackage.d21
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.rq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        ig1 x = e01Var.x(j);
        return l01Var.s0(x.e, x.f, m60.e, new i6(8, x, this));
    }

    @Override // defpackage.pu1
    public final boolean i() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.s + ')';
    }

    @Override // defpackage.pu1
    public final void u0(av1 av1Var) {
        kw1 kw1Var;
        boolean z;
        oe0 oe0Var;
        e81 K = hp.K(this, 2);
        if (!K.J) {
            io1 io1Var = d6.k;
            if (io1Var == null) {
                d6.k = new io1();
            } else {
                io1Var.b();
            }
            io1 io1Var2 = d6.k;
            io1Var2.getClass();
            io1Var2.s = K.s.C;
            io1Var2.r = vn.O(K.g);
            i02 e = nq1.e();
            if (e != null) {
                oe0Var = e.e();
            } else {
                oe0Var = null;
            }
            i02 j = nq1.j(e);
            try {
                this.s.invoke(io1Var2);
                nq1.o(e, j, oe0Var);
                kw1Var = io1Var2.p;
                z = io1Var2.q;
            } catch (Throwable th) {
                nq1.o(e, j, oe0Var);
                throw th;
            }
        } else {
            kw1Var = K.H;
            z = K.I;
        }
        if (!z) {
            return;
        }
        xu1.f(av1Var, kw1Var);
    }
}
