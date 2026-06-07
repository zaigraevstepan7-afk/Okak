package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bs1 extends d21 implements rq0, pu1 {
    public fs1 s;
    public boolean t;

    @Override // defpackage.rq0
    public final int Q(ty0 ty0Var, e01 e01Var, int i) {
        if (!this.t) {
            i = Integer.MAX_VALUE;
        }
        return e01Var.c(i);
    }

    @Override // defpackage.rq0
    public final int a0(ty0 ty0Var, e01 e01Var, int i) {
        if (!this.t) {
            i = Integer.MAX_VALUE;
        }
        return e01Var.Y(i);
    }

    @Override // defpackage.rq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        sb1 sb1Var;
        int g;
        oe0 oe0Var;
        int i;
        int i2;
        if (this.t) {
            sb1Var = sb1.e;
        } else {
            sb1Var = sb1.f;
        }
        f2.p(j, sb1Var);
        int i3 = Integer.MAX_VALUE;
        if (this.t) {
            g = Integer.MAX_VALUE;
        } else {
            g = us.g(j);
        }
        if (this.t) {
            i3 = us.h(j);
        }
        ig1 x = e01Var.x(us.a(j, 0, i3, 0, g, 5));
        int i4 = x.e;
        int h = us.h(j);
        if (i4 > h) {
            i4 = h;
        }
        int i5 = x.f;
        int g2 = us.g(j);
        if (i5 > g2) {
            i5 = g2;
        }
        int i6 = x.f - i5;
        int i7 = x.e - i4;
        if (!this.t) {
            i6 = i7;
        }
        fs1 fs1Var = this.s;
        ge1 ge1Var = fs1Var.e;
        ge1 ge1Var2 = fs1Var.a;
        ge1Var.h(i6);
        i02 e = nq1.e();
        if (e != null) {
            oe0Var = e.e();
        } else {
            oe0Var = null;
        }
        i02 j2 = nq1.j(e);
        try {
            if (ge1Var2.g() > i6) {
                ge1Var2.h(i6);
            }
            nq1.o(e, j2, oe0Var);
            fs1 fs1Var2 = this.s;
            if (this.t) {
                i = i5;
            } else {
                i = i4;
            }
            fs1Var2.b.h(i);
            fs1 fs1Var3 = this.s;
            if (this.t) {
                i2 = x.f;
            } else {
                i2 = x.e;
            }
            fs1Var3.c.h(i2);
            return l01Var.s0(i4, i5, m60.e, new cl1(this, i6, 1, x));
        } catch (Throwable th) {
            nq1.o(e, j2, oe0Var);
            throw th;
        }
    }

    @Override // defpackage.rq0
    public final int e(ty0 ty0Var, e01 e01Var, int i) {
        if (this.t) {
            i = Integer.MAX_VALUE;
        }
        return e01Var.s(i);
    }

    @Override // defpackage.rq0
    public final int k0(ty0 ty0Var, e01 e01Var, int i) {
        if (this.t) {
            i = Integer.MAX_VALUE;
        }
        return e01Var.n(i);
    }

    @Override // defpackage.pu1
    public final void u0(av1 av1Var) {
        xu1.g(av1Var);
        final int i = 0;
        final int i2 = 1;
        xr1 xr1Var = new xr1(new de0(this) { // from class: as1
            public final /* synthetic */ bs1 f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int g;
                int i3 = i;
                bs1 bs1Var = this.f;
                switch (i3) {
                    case 0:
                        g = bs1Var.s.a.g();
                        break;
                    default:
                        g = bs1Var.s.e.g();
                        break;
                }
                return Float.valueOf(g);
            }
        }, new de0(this) { // from class: as1
            public final /* synthetic */ bs1 f;

            {
                this.f = this;
            }

            @Override // defpackage.de0
            public final Object invoke() {
                int g;
                int i3 = i2;
                bs1 bs1Var = this.f;
                switch (i3) {
                    case 0:
                        g = bs1Var.s.a.g();
                        break;
                    default:
                        g = bs1Var.s.e.g();
                        break;
                }
                return Float.valueOf(g);
            }
        });
        if (this.t) {
            zu1 zu1Var = vu1.v;
            ep0 ep0Var = xu1.a[13];
            av1Var.a(zu1Var, xr1Var);
        } else {
            zu1 zu1Var2 = vu1.u;
            ep0 ep0Var2 = xu1.a[12];
            av1Var.a(zu1Var2, xr1Var);
        }
    }
}
