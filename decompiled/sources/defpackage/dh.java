package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dh extends d21 implements rq0, b40, pu1, th1, g21, ke1, gq0, kf0, bc0, qc0, kc1, qk {
    public c21 s;

    @Override // defpackage.bc0
    public final void A(sc0 sc0Var) {
        c21 c21Var = this.s;
        kl0.b("onFocusEvent called on wrong node");
        c21Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.d21
    public final void D0() {
        L0(true);
    }

    @Override // defpackage.th1
    public final void E() {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.d21
    public final void E0() {
        if (!this.r) {
            kl0.b("unInitializeModifier called on unattached node");
        }
        if ((this.g & 8) != 0) {
            ((q5) hp.N(this)).z();
        }
    }

    @Override // defpackage.b40
    public final void I() {
        fp.I(this);
    }

    @Override // defpackage.th1
    public final boolean J() {
        this.s.getClass();
        throw new ClassCastException();
    }

    public final void L0(boolean z) {
        if (!this.r) {
            kl0.b("initializeModifier called on unattached node");
        }
        c21 c21Var = this.s;
        if ((this.g & 4) != 0 && !z) {
            hp.K(this, 2).c1();
        }
        if ((this.g & 2) != 0) {
            n52 n52Var = hp.M(this).J.e;
            n52Var.getClass();
            if (n52Var.s) {
                e81 e81Var = this.l;
                e81Var.getClass();
                ((tq0) e81Var).w1(this);
                ic1 ic1Var = e81Var.P;
                if (ic1Var != null) {
                    ((vf0) ic1Var).c();
                }
            }
            if (!z) {
                hp.K(this, 2).c1();
                hp.M(this).E();
            }
        }
        if (c21Var instanceof qt0) {
            qt0 qt0Var = (qt0) c21Var;
            ar0 M = hp.M(this);
            switch (qt0Var.a) {
                case 0:
                    ((st0) qt0Var.b).k = M;
                    break;
                default:
                    ((od1) qt0Var.b).y.setValue(M);
                    break;
            }
        }
        if ((this.g & 8) != 0) {
            ((q5) hp.N(this)).z();
        }
    }

    @Override // defpackage.g21
    public final g3 O() {
        return g3.I;
    }

    @Override // defpackage.rq0
    public final int Q(ty0 ty0Var, e01 e01Var, int i) {
        c21 c21Var = this.s;
        c21Var.getClass();
        return ((pq0) c21Var).b(new yn0(ty0Var, ty0Var.getLayoutDirection()), new my(e01Var, p01.f, q01.f, 1), vs.b(i, 0, 13)).c();
    }

    @Override // defpackage.kf0
    public final void U(e81 e81Var) {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.qk
    public final c00 a() {
        return hp.M(this).C;
    }

    @Override // defpackage.rq0
    public final int a0(ty0 ty0Var, e01 e01Var, int i) {
        c21 c21Var = this.s;
        c21Var.getClass();
        return ((pq0) c21Var).b(new yn0(ty0Var, ty0Var.getLayoutDirection()), new my(e01Var, p01.e, q01.f, 1), vs.b(i, 0, 13)).c();
    }

    @Override // defpackage.rq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        c21 c21Var = this.s;
        c21Var.getClass();
        return ((pq0) c21Var).b(l01Var, e01Var, j);
    }

    @Override // defpackage.qk
    public final long d() {
        return vn.O(hp.K(this, 128).g);
    }

    @Override // defpackage.rq0
    public final int e(ty0 ty0Var, e01 e01Var, int i) {
        c21 c21Var = this.s;
        c21Var.getClass();
        return ((pq0) c21Var).b(new yn0(ty0Var, ty0Var.getLayoutDirection()), new my(e01Var, p01.f, q01.e, 1), vs.b(0, i, 7)).d();
    }

    @Override // defpackage.b40
    public final void f0(cr0 cr0Var) {
        c21 c21Var = this.s;
        c21Var.getClass();
        cr0Var.b();
    }

    @Override // defpackage.qk
    public final jq0 getLayoutDirection() {
        return hp.M(this).D;
    }

    @Override // defpackage.rq0
    public final int k0(ty0 ty0Var, e01 e01Var, int i) {
        c21 c21Var = this.s;
        c21Var.getClass();
        return ((pq0) c21Var).b(new yn0(ty0Var, ty0Var.getLayoutDirection()), new my(e01Var, p01.e, q01.e, 1), vs.b(0, i, 7)).d();
    }

    @Override // defpackage.th1
    public final boolean m0() {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.kc1
    public final boolean r() {
        return this.r;
    }

    public final String toString() {
        return this.s.toString();
    }

    @Override // defpackage.th1
    public final void u(jh1 jh1Var, kh1 kh1Var, long j) {
        this.s.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.pu1
    public final void u0(av1 av1Var) {
        c21 c21Var = this.s;
        c21Var.getClass();
        mu1 e = ((nu1) c21Var).e();
        av1Var.getClass();
        mu1 mu1Var = (mu1) av1Var;
        i41 i41Var = mu1Var.e;
        if (e.g) {
            mu1Var.g = true;
        }
        if (e.h) {
            mu1Var.h = true;
        }
        i41 i41Var2 = e.e;
        Object[] objArr = i41Var2.b;
        Object[] objArr2 = i41Var2.c;
        long[] jArr = i41Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            zu1 zu1Var = (zu1) obj;
                            if (!i41Var.b(zu1Var)) {
                                i41Var.m(zu1Var, obj2);
                            } else if (obj2 instanceof s0) {
                                Object g = i41Var.g(zu1Var);
                                g.getClass();
                                s0 s0Var = (s0) g;
                                String str = s0Var.a;
                                if (str == null) {
                                    str = ((s0) obj2).a;
                                }
                                af0 af0Var = s0Var.b;
                                if (af0Var == null) {
                                    af0Var = ((s0) obj2).b;
                                }
                                i41Var.m(zu1Var, new s0(str, af0Var));
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.ke1
    public final Object x0(Object obj) {
        c21 c21Var = this.s;
        c21Var.getClass();
        return (kb) c21Var;
    }

    @Override // defpackage.qz
    public final void c() {
    }

    @Override // defpackage.gq0
    public final void l(iq0 iq0Var) {
    }

    @Override // defpackage.gq0
    public final void o(long j) {
    }
}
