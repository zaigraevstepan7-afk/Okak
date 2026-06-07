package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yc0 extends rz implements pu1, kf0, es, w81, ub2 {
    public static final wc0 A = new wc0(0);
    public r31 u;
    public final oe0 v;
    public cc0 w;
    public qs0 x;
    public e81 y;
    public final tc0 z;

    /* JADX WARN: Type inference failed for: r0v0, types: [df0, se0] */
    public yc0(r31 r31Var, int i, k kVar) {
        this.u = r31Var;
        this.v = kVar;
        tc0 tc0Var = new tc0(i, new df0(2, 0, yc0.class, this, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V"), 10);
        L0(tc0Var);
        this.z = tc0Var;
    }

    @Override // defpackage.d21
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.d21
    public final void F0() {
        qs0 qs0Var = this.x;
        if (qs0Var != null) {
            qs0Var.b();
        }
        this.x = null;
    }

    public final void O0(r31 r31Var, hn0 hn0Var) {
        q10 q10Var;
        if (this.r) {
            go0 go0Var = (go0) ((ut) z0()).e.H(g3.O);
            vt vtVar = null;
            if (go0Var != null) {
                q10Var = go0Var.r(new i(13, r31Var, hn0Var));
            } else {
                q10Var = null;
            }
            rx.C(z0(), null, new l(r31Var, hn0Var, q10Var, vtVar, 18), 3);
            return;
        }
        r31Var.b(hn0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [d21] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [d21] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [q41] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [q41] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void P0() {
        a81 a81Var;
        if (this.r) {
            if (!this.e.r) {
                kl0.b("visitAncestors called on an unattached node");
            }
            d21 d21Var = this.e.i;
            ar0 M = hp.M(this);
            while (M != null) {
                if ((M.J.f.h & 262144) != 0) {
                    while (d21Var != null) {
                        if ((d21Var.g & 262144) != 0) {
                            rz rzVar = d21Var;
                            ?? r4 = 0;
                            while (rzVar != 0) {
                                if (rzVar instanceof ub2) {
                                    if (zc0.s == ((ub2) rzVar).m()) {
                                        return;
                                    }
                                } else if ((rzVar.g & 262144) != 0 && (rzVar instanceof rz)) {
                                    d21 d21Var2 = rzVar.t;
                                    int i = 0;
                                    rzVar = rzVar;
                                    r4 = r4;
                                    while (d21Var2 != null) {
                                        if ((d21Var2.g & 262144) != 0) {
                                            i++;
                                            r4 = r4;
                                            if (i == 1) {
                                                rzVar = d21Var2;
                                            } else {
                                                if (r4 == 0) {
                                                    r4 = new q41(new d21[16]);
                                                }
                                                if (rzVar != 0) {
                                                    r4.b(rzVar);
                                                    rzVar = 0;
                                                }
                                                r4.b(d21Var2);
                                            }
                                        }
                                        d21Var2 = d21Var2.j;
                                        rzVar = rzVar;
                                        r4 = r4;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                rzVar = hp.l(r4);
                            }
                        }
                        d21Var = d21Var.i;
                    }
                }
                M = M.v();
                if (M != null && (a81Var = M.J) != null) {
                    d21Var = a81Var.e;
                } else {
                    d21Var = null;
                }
            }
        }
    }

    public final void Q0(r31 r31Var) {
        cc0 cc0Var;
        if (!sn0.r(this.u, r31Var)) {
            r31 r31Var2 = this.u;
            if (r31Var2 != null && (cc0Var = this.w) != null) {
                r31Var2.b(new dc0(cc0Var));
            }
            this.w = null;
            this.u = r31Var;
        }
    }

    @Override // defpackage.kf0
    public final void U(e81 e81Var) {
        this.y = e81Var;
        if (this.z.Q0().a()) {
            if (e81Var.V0().r) {
                e81 e81Var2 = this.y;
                if (e81Var2 != null && e81Var2.V0().r) {
                    P0();
                    return;
                }
                return;
            }
            P0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wl1] */
    @Override // defpackage.w81
    public final void e0() {
        ?? obj = new Object();
        io.F(this, new j1(15, (Object) obj, this));
        qs0 qs0Var = (qs0) obj.e;
        if (this.z.Q0().a()) {
            qs0 qs0Var2 = this.x;
            if (qs0Var2 != null) {
                qs0Var2.b();
            }
            if (qs0Var != null) {
                qs0Var.a();
            } else {
                qs0Var = null;
            }
            this.x = qs0Var;
        }
    }

    @Override // defpackage.ub2
    public final Object m() {
        return A;
    }

    @Override // defpackage.pu1
    public final void u0(av1 av1Var) {
        boolean a = this.z.Q0().a();
        ep0[] ep0VarArr = xu1.a;
        zu1 zu1Var = vu1.k;
        ep0 ep0Var = xu1.a[4];
        av1Var.a(zu1Var, Boolean.valueOf(a));
        av1Var.a(lu1.w, new s0(null, new e5(0, this, yc0.class, "requestFocus", "requestFocus()Z", 0, 3)));
    }
}
