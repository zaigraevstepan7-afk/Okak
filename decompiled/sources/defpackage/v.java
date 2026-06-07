package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class v extends no0 implements vt, gv {
    public final xu g;

    public v(xu xuVar, boolean z) {
        super(z);
        L((go0) xuVar.H(g3.O));
        this.g = xuVar.G(this);
    }

    @Override // defpackage.gv
    public final xu A() {
        return this.g;
    }

    @Override // defpackage.no0
    public final void K(mp mpVar) {
        qo.O(this.g, mpVar);
    }

    @Override // defpackage.no0
    public final void W(Object obj) {
        boolean z;
        if (obj instanceof lp) {
            lp lpVar = (lp) obj;
            Throwable th = lpVar.a;
            if (lp.b.get(lpVar) != 0) {
                z = true;
            } else {
                z = false;
            }
            e0(th, z);
            return;
        }
        f0(obj);
    }

    public final void g0(jv jvVar, v vVar, se0 se0Var) {
        Object invoke;
        int ordinal = jvVar.ordinal();
        od2 od2Var = od2.a;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            xu xuVar = this.g;
                            Object Q = mp0.Q(xuVar, null);
                            try {
                                if (!(se0Var instanceof eh)) {
                                    invoke = go.Z(se0Var, vVar, this);
                                } else {
                                    fc2.t(2, se0Var);
                                    invoke = se0Var.invoke(vVar, this);
                                }
                                mp0.J(xuVar, Q);
                                if (invoke != hv.e) {
                                    resumeWith(invoke);
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                mp0.J(xuVar, Q);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            return;
                        }
                    }
                    se.m();
                    return;
                }
                se0Var.getClass();
                go.F(go.w(vVar, this, se0Var)).resumeWith(od2Var);
                return;
            }
            return;
        }
        try {
            mp0.K(go.F(go.w(vVar, this, se0Var)), od2Var);
        } finally {
            resumeWith(new fo1(th2));
        }
    }

    @Override // defpackage.vt
    public final xu getContext() {
        return this.g;
    }

    @Override // defpackage.vt
    public final void resumeWith(Object obj) {
        Throwable a = go1.a(obj);
        if (a != null) {
            obj = new lp(a, false);
        }
        Object S = S(obj);
        if (S == d6.m) {
            return;
        }
        n(S);
    }

    @Override // defpackage.no0
    public final String x() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void f0(Object obj) {
    }

    public void e0(Throwable th, boolean z) {
    }
}
