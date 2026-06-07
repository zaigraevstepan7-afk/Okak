package defpackage;

import com.topjohnwu.superuser.internal.HiddenAPIs;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class g01 {
    public final ar0 a;
    public boolean c;
    public boolean d;
    public us i;
    public final ld b = new ld(4);
    public final sl0 e = new sl0(19);
    public final q41 f = new q41(new ar0[16]);
    public final long g = 1;
    public final q41 h = new q41(new f01[16]);

    public g01(ar0 ar0Var) {
        this.a = ar0Var;
    }

    public static boolean b(ar0 ar0Var, us usVar) {
        us usVar2;
        boolean C0;
        ar0 ar0Var2 = ar0Var.m;
        er0 er0Var = ar0Var.K;
        if (ar0Var2 == null) {
            return false;
        }
        if (usVar != null) {
            if (ar0Var2 != null) {
                zy0 zy0Var = er0Var.q;
                zy0Var.getClass();
                C0 = zy0Var.C0(usVar.a);
            }
            C0 = false;
        } else {
            zy0 zy0Var2 = er0Var.q;
            if (zy0Var2 != null) {
                usVar2 = zy0Var2.r;
            } else {
                usVar2 = null;
            }
            if (usVar2 != null && ar0Var2 != null) {
                zy0Var2.getClass();
                C0 = zy0Var2.C0(usVar2.a);
            }
            C0 = false;
        }
        ar0 v = ar0Var.v();
        if (C0 && v != null) {
            if (v.m == null) {
                ar0.X(v, false, 3);
                return C0;
            }
            if (ar0Var.t() == yq0.e) {
                ar0.V(v, false, 3);
                return C0;
            }
            if (ar0Var.t() == yq0.f) {
                v.U(false);
            }
        }
        return C0;
    }

    public static boolean c(ar0 ar0Var, us usVar) {
        boolean Q;
        if (usVar != null) {
            Q = ar0Var.P(usVar);
        } else {
            Q = ar0.Q(ar0Var);
        }
        ar0 v = ar0Var.v();
        if (Q && v != null) {
            if (ar0Var.s() == yq0.e) {
                ar0.X(v, false, 3);
                return Q;
            }
            if (ar0Var.s() == yq0.f) {
                v.W(false);
            }
        }
        return Q;
    }

    public static boolean h(ar0 ar0Var) {
        zy0 zy0Var;
        br0 br0Var;
        if (ar0Var.K.e) {
            if (ar0Var.t() != yq0.g || ((zy0Var = ar0Var.K.q) != null && (br0Var = zy0Var.v) != null && br0Var.e())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean i(ar0 ar0Var) {
        wq0 wq0Var;
        if (!ar0Var.q()) {
            return false;
        }
        do {
            if (ar0Var.s() == yq0.g && !ar0Var.K.p.B.e()) {
                ar0 v = ar0Var.v();
                if (v != null) {
                    wq0Var = v.K.d;
                } else {
                    wq0Var = null;
                }
                if (wq0Var != wq0.e) {
                    return false;
                }
            }
            ar0Var = ar0Var.v();
            if (ar0Var == null) {
                return false;
            }
        } while (!ar0Var.I());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r3 < r7) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r7) {
        /*
            r6 = this;
            r0 = 1
            sl0 r1 = r6.e
            if (r7 == 0) goto L17
            java.lang.Object r7 = r1.e
            q41 r7 = (defpackage.q41) r7
            ar0 r6 = r6.a
            int r2 = r6.R
            if (r2 <= 0) goto L17
            r7.g()
            r7.b(r6)
            r6.Q = r0
        L17:
            java.lang.Object r6 = r1.e
            q41 r6 = (defpackage.q41) r6
            int r7 = r6.g
            if (r7 == 0) goto L62
            uc0 r2 = defpackage.uc0.d
            java.lang.Object[] r3 = r6.e
            r4 = 0
            java.util.Arrays.sort(r3, r4, r7, r2)
            int r7 = r6.g
            java.lang.Object r2 = r1.f
            ar0[] r2 = (defpackage.ar0[]) r2
            if (r2 == 0) goto L32
            int r3 = r2.length
            if (r3 >= r7) goto L3a
        L32:
            r2 = 16
            int r2 = java.lang.Math.max(r2, r7)
            ar0[] r2 = new defpackage.ar0[r2]
        L3a:
            r3 = 0
            r1.f = r3
        L3d:
            if (r4 >= r7) goto L48
            java.lang.Object[] r5 = r6.e
            r5 = r5[r4]
            r2[r4] = r5
            int r4 = r4 + 1
            goto L3d
        L48:
            r6.g()
            int r7 = r7 - r0
        L4c:
            r6 = -1
            if (r6 >= r7) goto L60
            r6 = r2[r7]
            r6.getClass()
            boolean r0 = r6.Q
            if (r0 == 0) goto L5b
            defpackage.sl0.s(r6)
        L5b:
            r2[r7] = r3
            int r7 = r7 + (-1)
            goto L4c
        L60:
            r1.f = r2
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g01.a(boolean):void");
    }

    public final void d() {
        q41 q41Var = this.h;
        int i = q41Var.g;
        if (i != 0) {
            Object[] objArr = q41Var.e;
            for (int i2 = 0; i2 < i; i2++) {
                f01 f01Var = (f01) objArr[i2];
                if (f01Var.a.H()) {
                    boolean z = f01Var.b;
                    ar0 ar0Var = f01Var.a;
                    boolean z2 = f01Var.c;
                    if (!z) {
                        ar0.X(ar0Var, z2, 2);
                    } else {
                        ar0.V(ar0Var, z2, 2);
                    }
                }
            }
            q41Var.g();
        }
    }

    public final void e(ar0 ar0Var) {
        q41 z = ar0Var.z();
        Object[] objArr = z.e;
        int i = z.g;
        for (int i2 = 0; i2 < i; i2++) {
            ar0 ar0Var2 = (ar0) objArr[i2];
            if (sn0.r(ar0Var2.J(), Boolean.TRUE) && !ar0Var2.S) {
                if (this.b.b(ar0Var2)) {
                    ar0Var2.K();
                }
                e(ar0Var2);
            }
        }
    }

    public final void f(ar0 ar0Var, boolean z) {
        boolean q;
        if (!this.c) {
            kl0.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z) {
            q = ar0Var.K.e;
        } else {
            q = ar0Var.q();
        }
        if (q) {
            kl0.a("node not yet measured");
        }
        g(ar0Var, z);
    }

    public final void g(ar0 ar0Var, boolean z) {
        boolean q;
        zy0 zy0Var;
        br0 br0Var;
        boolean q2;
        boolean q3;
        q41 z2 = ar0Var.z();
        Object[] objArr = z2.e;
        int i = z2.g;
        for (int i2 = 0; i2 < i; i2++) {
            ar0 ar0Var2 = (ar0) objArr[i2];
            yq0 yq0Var = yq0.e;
            if ((!z && (ar0Var2.s() == yq0Var || ar0Var2.K.p.B.e())) || (z && (ar0Var2.t() == yq0Var || ((zy0Var = ar0Var2.K.q) != null && (br0Var = zy0Var.v) != null && br0Var.e())))) {
                boolean F = vn.F(ar0Var2);
                er0 er0Var = ar0Var2.K;
                if (F && !z) {
                    if (er0Var.e && this.b.b(ar0Var2)) {
                        m(ar0Var2, true, false);
                    } else {
                        f(ar0Var2, true);
                    }
                }
                if (z) {
                    q2 = er0Var.e;
                } else {
                    q2 = ar0Var2.q();
                }
                if (q2) {
                    m(ar0Var2, z, false);
                }
                if (z) {
                    q3 = er0Var.e;
                } else {
                    q3 = ar0Var2.q();
                }
                if (!q3) {
                    g(ar0Var2, z);
                }
            }
        }
        if (z) {
            q = ar0Var.K.e;
        } else {
            q = ar0Var.q();
        }
        if (q) {
            m(ar0Var, z, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [d21] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean j(de0 de0Var) {
        boolean z;
        d21 d21Var;
        d21 d21Var2;
        boolean z2;
        ar0 ar0Var;
        boolean z3;
        ld ldVar = this.b;
        ar0 ar0Var2 = this.a;
        if (!ar0Var2.H()) {
            kl0.a("performMeasureAndLayout called with unattached root");
        }
        if (!ar0Var2.I()) {
            kl0.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            kl0.a("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean m = ldVar.m();
                rg2 rg2Var = (rg2) ldVar.f;
                if (m) {
                    z = false;
                    while (true) {
                        rg2 rg2Var2 = (rg2) ldVar.h;
                        rg2 rg2Var3 = (rg2) ldVar.g;
                        if (!((j12) rg2Var.f).isEmpty()) {
                            ar0Var = (ar0) ((j12) rg2Var.f).first();
                            rg2Var.x(ar0Var);
                            if (ar0Var.m != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z2 = false;
                        } else if (!((j12) rg2Var3.f).isEmpty()) {
                            ar0Var = (ar0) ((j12) rg2Var3.f).first();
                            rg2Var3.x(ar0Var);
                            if (ar0Var.m != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z2 = true;
                        } else {
                            if (((j12) rg2Var2.f).isEmpty()) {
                                break;
                            }
                            ar0 ar0Var3 = (ar0) ((j12) rg2Var2.f).first();
                            rg2Var2.x(ar0Var3);
                            z2 = true;
                            ar0Var = ar0Var3;
                            z3 = false;
                        }
                        boolean m2 = m(ar0Var, z3, z2);
                        if (!z2) {
                            if (ar0Var.K.f) {
                                ldVar.a(ar0Var, zn0.f);
                            }
                            if (ar0Var.p()) {
                                ldVar.a(ar0Var, zn0.h);
                            }
                        }
                        if (ar0Var == ar0Var2 && m2) {
                            z = true;
                        }
                    }
                    if (de0Var != null) {
                        de0Var.invoke();
                    }
                } else {
                    z = false;
                }
            } finally {
            }
        } else {
            z = false;
        }
        q41 q41Var = this.f;
        Object[] objArr = q41Var.e;
        int i = q41Var.g;
        int i2 = 0;
        while (i2 < i) {
            a81 a81Var = ((ar0) objArr[i2]).J;
            ql0 ql0Var = a81Var.c;
            boolean g = f81.g(HiddenAPIs.FLAG_RECEIVER_FROM_SHELL);
            if (g) {
                d21Var = ql0Var.V;
            } else {
                d21Var = ql0Var.V.i;
                if (d21Var == null) {
                    i2++;
                    z4 = false;
                }
            }
            io1 io1Var = e81.Q;
            d21 X0 = ql0Var.X0(g);
            while (X0 != null && (X0.h & HiddenAPIs.FLAG_RECEIVER_FROM_SHELL) != 0) {
                if ((X0.g & HiddenAPIs.FLAG_RECEIVER_FROM_SHELL) != 0) {
                    rz rzVar = X0;
                    q41 q41Var2 = null;
                    while (rzVar != 0) {
                        if (rzVar instanceof gq0) {
                            ((gq0) rzVar).l(a81Var.c);
                        } else if ((rzVar.g & HiddenAPIs.FLAG_RECEIVER_FROM_SHELL) != 0 && (rzVar instanceof rz)) {
                            d21 d21Var3 = rzVar.t;
                            ?? r15 = z4;
                            d21Var2 = rzVar;
                            q41Var2 = q41Var2;
                            while (d21Var3 != null) {
                                if ((d21Var3.g & HiddenAPIs.FLAG_RECEIVER_FROM_SHELL) != 0) {
                                    r15++;
                                    q41Var2 = q41Var2;
                                    if (r15 == 1) {
                                        d21Var2 = d21Var3;
                                    } else {
                                        if (q41Var2 == null) {
                                            q41Var2 = new q41(new d21[16]);
                                        }
                                        if (d21Var2 != null) {
                                            q41Var2.b(d21Var2);
                                            d21Var2 = null;
                                        }
                                        q41Var2.b(d21Var3);
                                    }
                                }
                                d21Var3 = d21Var3.j;
                                d21Var2 = d21Var2;
                                q41Var2 = q41Var2;
                                r15 = r15;
                            }
                            if (r15 == 1) {
                                z4 = false;
                                rzVar = d21Var2;
                                q41Var2 = q41Var2;
                            }
                        }
                        d21Var2 = hp.l(q41Var2);
                        z4 = false;
                        rzVar = d21Var2;
                        q41Var2 = q41Var2;
                    }
                }
                if (X0 != d21Var) {
                    X0 = X0.j;
                    z4 = false;
                }
            }
            i2++;
            z4 = false;
        }
        q41Var.g();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [d21] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [d21] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [q41] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [q41] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void k(ar0 ar0Var, long j) {
        d21 d21Var;
        if (ar0Var.S) {
            return;
        }
        ar0 ar0Var2 = this.a;
        if (ar0Var == ar0Var2) {
            kl0.a("measureAndLayout called on root");
        }
        if (!ar0Var2.H()) {
            kl0.a("performMeasureAndLayout called with unattached root");
        }
        if (!ar0Var2.I()) {
            kl0.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            kl0.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                ld ldVar = this.b;
                ((rg2) ldVar.f).x(ar0Var);
                ((rg2) ldVar.g).x(ar0Var);
                ((rg2) ldVar.h).x(ar0Var);
                if ((b(ar0Var, new us(j)) || ar0Var.K.f) && sn0.r(ar0Var.J(), Boolean.TRUE)) {
                    ar0Var.K();
                }
                e(ar0Var);
                c(ar0Var, new us(j));
                if (ar0Var.p() && ar0Var.I()) {
                    ar0Var.T();
                    sl0 sl0Var = this.e;
                    sl0Var.getClass();
                    if (ar0Var.R > 0) {
                        ((q41) sl0Var.e).b(ar0Var);
                        ar0Var.Q = true;
                    }
                }
                d();
            } finally {
            }
        }
        q41 q41Var = this.f;
        Object[] objArr = q41Var.e;
        int i = q41Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            a81 a81Var = ((ar0) objArr[i2]).J;
            ql0 ql0Var = a81Var.c;
            boolean g = f81.g(HiddenAPIs.FLAG_RECEIVER_FROM_SHELL);
            if (g) {
                d21Var = ql0Var.V;
            } else {
                d21Var = ql0Var.V.i;
                if (d21Var == null) {
                }
            }
            io1 io1Var = e81.Q;
            for (d21 X0 = ql0Var.X0(g); X0 != null && (X0.h & HiddenAPIs.FLAG_RECEIVER_FROM_SHELL) != 0; X0 = X0.j) {
                if ((X0.g & HiddenAPIs.FLAG_RECEIVER_FROM_SHELL) != 0) {
                    rz rzVar = X0;
                    ?? r8 = 0;
                    while (rzVar != 0) {
                        if (rzVar instanceof gq0) {
                            ((gq0) rzVar).l(a81Var.c);
                        } else if ((rzVar.g & HiddenAPIs.FLAG_RECEIVER_FROM_SHELL) != 0 && (rzVar instanceof rz)) {
                            d21 d21Var2 = rzVar.t;
                            int i3 = 0;
                            rzVar = rzVar;
                            r8 = r8;
                            while (d21Var2 != null) {
                                if ((d21Var2.g & HiddenAPIs.FLAG_RECEIVER_FROM_SHELL) != 0) {
                                    i3++;
                                    r8 = r8;
                                    if (i3 == 1) {
                                        rzVar = d21Var2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new q41(new d21[16]);
                                        }
                                        if (rzVar != 0) {
                                            r8.b(rzVar);
                                            rzVar = 0;
                                        }
                                        r8.b(d21Var2);
                                    }
                                }
                                d21Var2 = d21Var2.j;
                                rzVar = rzVar;
                                r8 = r8;
                            }
                            if (i3 == 1) {
                            }
                        }
                        rzVar = hp.l(r8);
                    }
                }
                if (X0 != d21Var) {
                }
            }
        }
        q41Var.g();
    }

    public final void l() {
        ld ldVar = this.b;
        if (ldVar.m()) {
            ar0 ar0Var = this.a;
            if (!ar0Var.H()) {
                kl0.a("performMeasureAndLayout called with unattached root");
            }
            if (!ar0Var.I()) {
                kl0.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                kl0.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if (!((j12) ((rg2) ldVar.h).f).isEmpty() && !((j12) ((rg2) ldVar.f).f).isEmpty()) {
                        if (ar0Var.m != null) {
                            o(ar0Var, true);
                        } else {
                            n(ar0Var);
                        }
                    }
                    o(ar0Var, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        this.c = false;
                        this.d = false;
                    }
                }
            }
        }
    }

    public final boolean m(ar0 ar0Var, boolean z, boolean z2) {
        us usVar;
        boolean z3;
        hg1 placementScope;
        ql0 ql0Var;
        ar0 v;
        zy0 zy0Var;
        br0 br0Var;
        boolean z4 = ar0Var.S;
        er0 er0Var = ar0Var.K;
        boolean z5 = false;
        if (z4 || (!ar0Var.I() && !er0Var.p.x && !i(ar0Var) && !sn0.r(ar0Var.J(), Boolean.TRUE) && !h(ar0Var) && !er0Var.p.B.e() && ((zy0Var = er0Var.q) == null || (br0Var = zy0Var.v) == null || !br0Var.e()))) {
            return false;
        }
        ar0 ar0Var2 = this.a;
        if (ar0Var == ar0Var2) {
            usVar = this.i;
            usVar.getClass();
        } else {
            usVar = null;
        }
        if (z) {
            if (er0Var.e) {
                z5 = b(ar0Var, usVar);
            }
            if (z2 && ((z5 || er0Var.f) && sn0.r(ar0Var.J(), Boolean.TRUE))) {
                ar0Var.K();
            }
        } else {
            if (ar0Var.q()) {
                z3 = c(ar0Var, usVar);
            } else {
                z3 = false;
            }
            if (z2 && ar0Var.p() && (ar0Var == ar0Var2 || ((v = ar0Var.v()) != null && v.I() && er0Var.p.x))) {
                if (ar0Var == ar0Var2) {
                    if (ar0Var.G == yq0.g) {
                        ar0Var.f();
                    }
                    ar0 v2 = ar0Var.v();
                    if (v2 == null || (ql0Var = v2.J.c) == null || (placementScope = ql0Var.p) == null) {
                        placementScope = ((q5) dr0.a(ar0Var)).getPlacementScope();
                    }
                    hg1.k(placementScope, er0Var.p, 0, 0);
                } else {
                    ar0Var.T();
                }
                sl0 sl0Var = this.e;
                sl0Var.getClass();
                if (ar0Var.R > 0) {
                    ((q41) sl0Var.e).b(ar0Var);
                    ar0Var.Q = true;
                }
            }
            z5 = z3;
        }
        d();
        return z5;
    }

    public final void n(ar0 ar0Var) {
        q41 z = ar0Var.z();
        Object[] objArr = z.e;
        int i = z.g;
        for (int i2 = 0; i2 < i; i2++) {
            ar0 ar0Var2 = (ar0) objArr[i2];
            if (ar0Var2.s() == yq0.e || ar0Var2.K.p.B.e()) {
                if (vn.F(ar0Var2)) {
                    o(ar0Var2, true);
                } else {
                    n(ar0Var2);
                }
            }
        }
    }

    public final void o(ar0 ar0Var, boolean z) {
        us usVar;
        if (ar0Var.S) {
            return;
        }
        if (ar0Var == this.a) {
            usVar = this.i;
            usVar.getClass();
        } else {
            usVar = null;
        }
        if (z) {
            b(ar0Var, usVar);
        } else {
            c(ar0Var, usVar);
        }
    }

    public final boolean p(ar0 ar0Var, boolean z) {
        int ordinal = ar0Var.K.d.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal == 4) {
                    if (!ar0Var.q() || z) {
                        ar0Var.K.p.y = true;
                        if (!ar0Var.S && (ar0Var.I() || i(ar0Var))) {
                            ar0 v = ar0Var.v();
                            if (v == null || !v.q()) {
                                this.b.a(ar0Var, zn0.g);
                            }
                            if (!this.d) {
                                return true;
                            }
                        }
                    }
                } else {
                    se.m();
                    return false;
                }
            } else {
                this.h.b(new f01(ar0Var, false, z));
            }
        }
        return false;
    }

    public final void q(long j) {
        boolean b;
        zn0 zn0Var;
        us usVar = this.i;
        if (usVar == null) {
            b = false;
        } else {
            b = us.b(usVar.a, j);
        }
        if (!b) {
            if (this.c) {
                kl0.a("updateRootConstraints called while measuring");
            }
            this.i = new us(j);
            ar0 ar0Var = this.a;
            ar0 ar0Var2 = ar0Var.m;
            er0 er0Var = ar0Var.K;
            if (ar0Var2 != null) {
                er0Var.e = true;
            }
            er0Var.p.y = true;
            if (ar0Var2 != null) {
                zn0Var = zn0.e;
            } else {
                zn0Var = zn0.g;
            }
            this.b.a(ar0Var, zn0Var);
        }
    }
}
