package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fr0 implements c42, l01 {
    public final /* synthetic */ ir0 e;
    public final /* synthetic */ nr0 f;

    public fr0(nr0 nr0Var) {
        this.f = nr0Var;
        this.e = nr0Var.l;
    }

    @Override // defpackage.c00
    public final long G(float f) {
        return this.e.G(f);
    }

    @Override // defpackage.c00
    public final float K(int i) {
        return this.e.K(i);
    }

    @Override // defpackage.c00
    public final float M(float f) {
        return f / this.e.a();
    }

    @Override // defpackage.c00
    public final float P() {
        return this.e.g;
    }

    @Override // defpackage.mn0
    public final boolean S() {
        return this.e.S();
    }

    @Override // defpackage.c00
    public final float W(float f) {
        return this.e.a() * f;
    }

    @Override // defpackage.c00
    public final float a() {
        return this.e.f;
    }

    @Override // defpackage.c00
    public final int d0(long j) {
        return this.e.d0(j);
    }

    @Override // defpackage.mn0
    public final jq0 getLayoutDirection() {
        return this.e.e;
    }

    @Override // defpackage.l01
    public final k01 i0(int i, int i2, Map map, oe0 oe0Var, oe0 oe0Var2) {
        return this.e.i0(i, i2, map, oe0Var, oe0Var2);
    }

    @Override // defpackage.c00
    public final int j0(float f) {
        return this.e.j0(f);
    }

    @Override // defpackage.c00
    public final long n0(long j) {
        return this.e.n0(j);
    }

    @Override // defpackage.c00
    public final long p(float f) {
        return this.e.p(f);
    }

    @Override // defpackage.c00
    public final long q(long j) {
        return this.e.q(j);
    }

    @Override // defpackage.c00
    public final float r0(long j) {
        return this.e.r0(j);
    }

    @Override // defpackage.l01
    public final k01 s0(int i, int i2, Map map, oe0 oe0Var) {
        return this.e.i0(i, i2, map, null, oe0Var);
    }

    @Override // defpackage.c42
    public final List t(se0 se0Var, Object obj) {
        gr0 gr0Var;
        nr0 nr0Var = this.f;
        i41 i41Var = nr0Var.n;
        i41 i41Var2 = nr0Var.p;
        ar0 ar0Var = nr0Var.e;
        i41 i41Var3 = nr0Var.k;
        ar0 ar0Var2 = (ar0) i41Var3.g(obj);
        if (ar0Var2 != null && ((q41) ((z31) ar0Var.o()).f).i(ar0Var2) < nr0Var.h) {
            return ar0Var2.m();
        }
        q41 q41Var = nr0Var.q;
        if (q41Var.g < nr0Var.i) {
            kl0.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        ar0 ar0Var3 = (ar0) i41Var3.g(obj);
        int i = q41Var.g;
        int i2 = nr0Var.i;
        if (i == i2) {
            q41Var.b(obj);
        } else {
            Object[] objArr = q41Var.e;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        nr0Var.i++;
        boolean b = i41Var.b(obj);
        if (!b && ar0Var3 == null) {
            if (ar0Var.H()) {
                nr0Var.g();
                if (!i41Var3.c(obj)) {
                    i41Var2.k(obj);
                    Object g = i41Var.g(obj);
                    if (g == null) {
                        g = nr0Var.l(obj);
                        if (g != null) {
                            nr0Var.i(((q41) ((z31) ar0Var.o()).f).i(g), ((q41) ((z31) ar0Var.o()).f).g);
                            nr0Var.s++;
                        } else {
                            int i3 = ((q41) ((z31) ar0Var.o()).f).g;
                            ar0 ar0Var4 = new ar0(2);
                            ar0Var.u = true;
                            ar0Var.B(i3, ar0Var4);
                            ar0Var.u = false;
                            nr0Var.s++;
                            g = ar0Var4;
                        }
                        i41Var.m(obj, g);
                    }
                    nr0Var.k((ar0) g, obj, false, se0Var);
                }
            }
            i41Var2.m(obj, nr0Var.e(obj));
        } else {
            if (!b && ar0Var3 != null) {
                nr0Var.i(((q41) ((z31) ar0Var.o()).f).i(ar0Var3), ((q41) ((z31) ar0Var.o()).f).g);
                nr0Var.s++;
                i41Var3.k(obj);
                i41Var.m(obj, ar0Var3);
                i41Var2.m(obj, nr0Var.e(obj));
                if (ar0Var.H()) {
                    nr0Var.g();
                }
            }
            ar0 ar0Var5 = (ar0) i41Var.g(obj);
            lf1 lf1Var = null;
            if (ar0Var5 != null) {
                gr0Var = (gr0) nr0Var.j.g(ar0Var5);
            } else {
                gr0Var = null;
            }
            if (gr0Var != null && gr0Var.d) {
                nr0Var.k(ar0Var5, obj, false, se0Var);
            }
            if (gr0Var != null) {
                lf1Var = gr0Var.f;
            }
            if (lf1Var != null) {
                nr0Var.c(gr0Var, true);
            }
        }
        ar0 ar0Var6 = (ar0) i41Var.g(obj);
        if (ar0Var6 != null) {
            List t0 = ar0Var6.K.p.t0();
            z31 z31Var = (z31) t0;
            int i4 = ((q41) z31Var.f).g;
            for (int i5 = 0; i5 < i4; i5++) {
                ((i01) z31Var.get(i5)).j.b = true;
            }
            return t0;
        }
        return l60.e;
    }

    @Override // defpackage.c00
    public final float v(long j) {
        return this.e.v(j);
    }
}
