package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gd2 implements ge {
    public final Object e;
    public final ArrayList f = new ArrayList();
    public Object g;

    public gd2(ar0 ar0Var) {
        this.e = ar0Var;
        this.g = ar0Var;
    }

    public final void a() {
        this.f.clear();
        this.g = this.e;
        ((ar0) this.e).R();
    }

    @Override // defpackage.ge
    public final void c(int i, Object obj) {
        ((ar0) this.g).B(i, (ar0) obj);
    }

    @Override // defpackage.ge
    public final void d(Object obj) {
        this.f.add(this.g);
        this.g = obj;
    }

    @Override // defpackage.ge
    public final void e() {
        rl1 rectManager;
        t4 t4Var;
        rl1 rectManager2;
        ar0 ar0Var = (ar0) this.g;
        a81 a81Var = ar0Var.J;
        if (!ar0Var.H()) {
            kl0.a("onReuse is only expected on attached node");
        }
        nr0 nr0Var = ar0Var.L;
        if (nr0Var != null) {
            nr0Var.h(false);
        }
        ar0Var.x = false;
        if (ar0Var.S) {
            ar0Var.S = false;
        } else {
            d21 d21Var = ar0Var.J.e;
            for (d21 d21Var2 = d21Var; d21Var2 != null; d21Var2 = d21Var2.i) {
                if (d21Var2.r) {
                    d21Var2.G0();
                }
            }
            for (d21 d21Var3 = d21Var; d21Var3 != null; d21Var3 = d21Var3.i) {
                if (d21Var3.r) {
                    d21Var3.I0();
                }
            }
            while (d21Var != null) {
                if (d21Var.r) {
                    d21Var.C0();
                }
                d21Var = d21Var.i;
            }
        }
        int i = ar0Var.f;
        jc1 jc1Var = ar0Var.s;
        if (jc1Var != null && (rectManager2 = ((q5) jc1Var).getRectManager()) != null) {
            rectManager2.h(ar0Var);
        }
        ar0Var.f = ou1.a.addAndGet(1);
        jc1 jc1Var2 = ar0Var.s;
        if (jc1Var2 != null) {
            q5 q5Var = (q5) jc1Var2;
            q5Var.m294getLayoutNodes().g(i);
            q5Var.m294getLayoutNodes().i(ar0Var.f, ar0Var);
        }
        for (d21 d21Var4 = a81Var.f; d21Var4 != null; d21Var4 = d21Var4.j) {
            d21Var4.B0();
        }
        a81Var.e();
        if (a81Var.d(8)) {
            ar0Var.F();
        }
        ar0.Y(ar0Var);
        jc1 jc1Var3 = ar0Var.s;
        if (jc1Var3 != null && (t4Var = ((q5) jc1Var3).O) != null) {
            q5 q5Var2 = t4Var.g;
            rg2 rg2Var = t4Var.e;
            q31 q31Var = t4Var.l;
            if (q31Var.e(i)) {
                rg2Var.t(q5Var2, i, false);
            }
            mu1 x = ar0Var.x();
            if (x != null && x.e.b(vu1.q)) {
                q31Var.a(ar0Var.f);
                rg2Var.t(q5Var2, ar0Var.f, true);
            }
        }
        jc1 jc1Var4 = ar0Var.s;
        if (jc1Var4 != null && (rectManager = ((q5) jc1Var4).getRectManager()) != null) {
            rectManager.f(ar0Var, true);
        }
    }

    @Override // defpackage.ge
    public final void f(int i, int i2, int i3) {
        ((ar0) this.g).L(i, i2, i3);
    }

    @Override // defpackage.ge
    public final void g(int i, int i2) {
        ((ar0) this.g).S(i, i2);
    }

    @Override // defpackage.ge
    public final void i() {
        this.g = this.f.remove(r0.size() - 1);
    }

    @Override // defpackage.ge
    public final /* bridge */ /* synthetic */ void j(int i, Object obj) {
    }

    @Override // defpackage.ge
    public final void k() {
        jc1 jc1Var = ((ar0) this.e).s;
        if (jc1Var != null) {
            ((q5) jc1Var).v();
        }
    }

    @Override // defpackage.ge
    public final Object l() {
        return this.g;
    }
}
