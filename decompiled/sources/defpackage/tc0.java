package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tc0 extends d21 implements es, gq0, w81, g21, qz {
    public final se0 s;
    public boolean t;
    public boolean u;
    public final int v;

    public tc0(int i, se0 se0Var, int i2) {
        this.s = (i2 & 4) != 0 ? null : se0Var;
        this.v = i;
    }

    @Override // defpackage.d21
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.d21
    public final void E0() {
        int ordinal = Q0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return;
                    }
                    se.m();
                    return;
                }
            } else {
                ((q5) hp.N(this)).getFocusOwner();
                lo.w(this);
                return;
            }
        }
        mc0 mc0Var = (mc0) ((q5) hp.N(this)).getFocusOwner();
        mc0Var.b(8, true, false);
        mc0Var.d.a();
    }

    @Override // defpackage.d21
    public final void F0() {
        if (Q0().a()) {
            ((mc0) ((q5) hp.N(this)).getFocusOwner()).b(8, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object[], java.lang.Object] */
    public final boolean L0() {
        q41 q41Var;
        sc0 sc0Var;
        a81 a81Var;
        Boolean bool;
        char c;
        a81 a81Var2;
        int ordinal = io.I(this).ordinal();
        int i = 0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return true;
                }
                if (ordinal != 3) {
                    se.m();
                    return false;
                }
            }
        } else {
            mc0 mc0Var = (mc0) ((q5) hp.N(this)).getFocusOwner();
            tc0 f = mc0Var.f();
            sc0 Q0 = Q0();
            if (f == this) {
                M0(Q0, Q0);
                return true;
            }
            if (f != null || ((mc0) ((q5) hp.N(this)).getFocusOwner()).a.C()) {
                char c2 = 16;
                if (f != null) {
                    q41Var = new q41(new tc0[16]);
                    if (!f.e.r) {
                        kl0.b("visitAncestors called on an unattached node");
                    }
                    d21 d21Var = f.e.i;
                    ar0 M = hp.M(f);
                    while (M != null) {
                        if ((M.J.f.h & 1024) != 0) {
                            while (d21Var != null) {
                                if ((d21Var.g & 1024) != 0) {
                                    d21 d21Var2 = d21Var;
                                    q41 q41Var2 = null;
                                    while (d21Var2 != null) {
                                        if (d21Var2 instanceof tc0) {
                                            q41Var.b((tc0) d21Var2);
                                        } else if ((d21Var2.g & 1024) != 0 && (d21Var2 instanceof rz)) {
                                            int i2 = 0;
                                            for (d21 d21Var3 = ((rz) d21Var2).t; d21Var3 != null; d21Var3 = d21Var3.j) {
                                                if ((d21Var3.g & 1024) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
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
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                        d21Var2 = hp.l(q41Var2);
                                    }
                                }
                                d21Var = d21Var.i;
                            }
                        }
                        M = M.v();
                        if (M != null && (a81Var2 = M.J) != null) {
                            d21Var = a81Var2.e;
                        } else {
                            d21Var = null;
                        }
                    }
                } else {
                    q41Var = null;
                }
                tc0[] tc0VarArr = new tc0[16];
                if (!this.e.r) {
                    kl0.b("visitAncestors called on an unattached node");
                }
                d21 d21Var4 = this.e.i;
                ar0 M2 = hp.M(this);
                int i3 = 0;
                int i4 = 1;
                while (M2 != null) {
                    if ((M2.J.f.h & 1024) != 0) {
                        while (d21Var4 != null) {
                            if ((d21Var4.g & 1024) != 0) {
                                d21 d21Var5 = d21Var4;
                                q41 q41Var3 = null;
                                while (d21Var5 != null) {
                                    if (d21Var5 instanceof tc0) {
                                        tc0 tc0Var = (tc0) d21Var5;
                                        if (q41Var != null) {
                                            bool = Boolean.valueOf(q41Var.j(tc0Var));
                                        } else {
                                            bool = null;
                                        }
                                        if (bool == null || !bool.booleanValue()) {
                                            int i5 = i3 + 1;
                                            if (tc0VarArr.length < i5) {
                                                int length = tc0VarArr.length;
                                                ?? r5 = new Object[Math.max(i5, length * 2)];
                                                System.arraycopy(tc0VarArr, i, r5, i, length);
                                                tc0VarArr = r5;
                                            }
                                            tc0VarArr[i3] = tc0Var;
                                            i3 = i5;
                                        }
                                        if (tc0Var == f) {
                                            i4 = i;
                                        }
                                    } else if ((d21Var5.g & 1024) != 0 && (d21Var5 instanceof rz)) {
                                        int i6 = i;
                                        for (d21 d21Var6 = ((rz) d21Var5).t; d21Var6 != null; d21Var6 = d21Var6.j) {
                                            if ((d21Var6.g & 1024) != 0) {
                                                i6++;
                                                if (i6 == 1) {
                                                    d21Var5 = d21Var6;
                                                } else {
                                                    if (q41Var3 == null) {
                                                        q41Var3 = new q41(new d21[16]);
                                                    }
                                                    if (d21Var5 != null) {
                                                        q41Var3.b(d21Var5);
                                                        d21Var5 = null;
                                                    }
                                                    q41Var3.b(d21Var6);
                                                }
                                            }
                                        }
                                        c = 16;
                                        if (i6 == 1) {
                                            c2 = 16;
                                            i = 0;
                                        } else {
                                            d21Var5 = hp.l(q41Var3);
                                            c2 = c;
                                            i = 0;
                                        }
                                    }
                                    c = 16;
                                    d21Var5 = hp.l(q41Var3);
                                    c2 = c;
                                    i = 0;
                                }
                            }
                            d21Var4 = d21Var4.i;
                            c2 = c2;
                            i = 0;
                        }
                    }
                    char c3 = c2;
                    M2 = M2.v();
                    if (M2 != null && (a81Var = M2.J) != null) {
                        d21Var4 = a81Var.e;
                    } else {
                        d21Var4 = null;
                    }
                    c2 = c3;
                    i = 0;
                }
                if (i4 == 0 || f == null || io.p(f, false)) {
                    io.F(this, new s8(this, 3));
                    int ordinal2 = Q0().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    se.m();
                                    return false;
                                }
                            }
                        }
                        ((mc0) ((q5) hp.N(this)).getFocusOwner()).i(this);
                    }
                    sc0 sc0Var2 = sc0.g;
                    sc0 sc0Var3 = sc0.e;
                    if (i4 != 0 && f != null) {
                        f.M0(sc0Var3, sc0Var2);
                    }
                    sc0 sc0Var4 = sc0.f;
                    if (q41Var != null) {
                        int i7 = q41Var.g - 1;
                        Object[] objArr = q41Var.e;
                        if (i7 < objArr.length) {
                            while (i7 >= 0) {
                                tc0 tc0Var2 = (tc0) objArr[i7];
                                if (mc0Var.f() != this) {
                                    break;
                                }
                                tc0Var2.M0(sc0Var4, sc0Var2);
                                i7--;
                            }
                        }
                    }
                    int i8 = i3 - 1;
                    if (i8 < tc0VarArr.length) {
                        while (i8 >= 0) {
                            tc0 tc0Var3 = tc0VarArr[i8];
                            if (mc0Var.f() != this) {
                                break;
                            }
                            if (tc0Var3 == f) {
                                sc0Var = sc0Var3;
                            } else {
                                sc0Var = sc0Var2;
                            }
                            tc0Var3.M0(sc0Var, sc0Var4);
                            i8--;
                        }
                    }
                    if (mc0Var.f() == this) {
                        M0(Q0, sc0Var3);
                        if (mc0Var.f() != this) {
                            break;
                        }
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [d21] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [d21] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [q41] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [q41] */
    public final void M0(sc0 sc0Var, sc0 sc0Var2) {
        a81 a81Var;
        se0 se0Var;
        mc0 mc0Var = (mc0) ((q5) hp.N(this)).getFocusOwner();
        tc0 f = mc0Var.f();
        if (!sc0Var.equals(sc0Var2) && (se0Var = this.s) != null) {
            se0Var.invoke(sc0Var, sc0Var2);
        }
        d21 d21Var = this.e;
        if (!d21Var.r) {
            kl0.b("visitAncestors called on an unattached node");
        }
        d21 d21Var2 = this.e;
        ar0 M = hp.M(this);
        while (M != null) {
            if ((M.J.f.h & 5120) != 0) {
                while (d21Var2 != null) {
                    int i = d21Var2.g;
                    if ((i & 5120) != 0) {
                        if (d21Var2 == d21Var || (i & 1024) == 0) {
                            if ((i & 4096) != 0) {
                                rz rzVar = d21Var2;
                                ?? r5 = 0;
                                while (rzVar != 0) {
                                    if (rzVar instanceof bc0) {
                                        bc0 bc0Var = (bc0) rzVar;
                                        if (f == mc0Var.f()) {
                                            bc0Var.A(sc0Var2);
                                        }
                                    } else if ((rzVar.g & 4096) != 0 && (rzVar instanceof rz)) {
                                        d21 d21Var3 = rzVar.t;
                                        int i2 = 0;
                                        rzVar = rzVar;
                                        r5 = r5;
                                        while (d21Var3 != null) {
                                            if ((d21Var3.g & 4096) != 0) {
                                                i2++;
                                                r5 = r5;
                                                if (i2 == 1) {
                                                    rzVar = d21Var3;
                                                } else {
                                                    if (r5 == 0) {
                                                        r5 = new q41(new d21[16]);
                                                    }
                                                    if (rzVar != 0) {
                                                        r5.b(rzVar);
                                                        rzVar = 0;
                                                    }
                                                    r5.b(d21Var3);
                                                }
                                            }
                                            d21Var3 = d21Var3.j;
                                            rzVar = rzVar;
                                            r5 = r5;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    rzVar = hp.l(r5);
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    d21Var2 = d21Var2.i;
                }
            }
            M = M.v();
            if (M != null && (a81Var = M.J) != null) {
                d21Var2 = a81Var.e;
            } else {
                d21Var2 = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nc0] */
    public final nc0 N0() {
        boolean z;
        boolean z2;
        a81 a81Var;
        ?? obj = new Object();
        obj.a = true;
        oc0 oc0Var = oc0.b;
        obj.b = oc0Var;
        obj.c = oc0Var;
        obj.d = oc0Var;
        obj.e = oc0Var;
        obj.f = oc0Var;
        obj.g = oc0Var;
        obj.h = oc0Var;
        obj.i = oc0Var;
        obj.j = i5.D;
        obj.k = i5.E;
        obj.l = g3.L;
        int i = this.v;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            if (((ul0) ((wl0) ((vl0) hp.s(this, is.m))).a.getValue()).a == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            z = !z2;
        } else if (i == 2) {
            z = false;
        } else {
            se.p("Unknown Focusability");
            return null;
        }
        obj.a = z;
        d21 d21Var = this.e;
        if (!d21Var.r) {
            kl0.b("visitAncestors called on an unattached node");
        }
        d21 d21Var2 = this.e;
        ar0 M = hp.M(this);
        loop0: while (M != null) {
            if ((M.J.f.h & 3072) != 0) {
                while (d21Var2 != null) {
                    int i2 = d21Var2.g;
                    if ((i2 & 3072) != 0) {
                        if (d21Var2 != d21Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            q41 q41Var = null;
                            d21 d21Var3 = d21Var2;
                            while (d21Var3 != null) {
                                if (!(d21Var3 instanceof dh)) {
                                    if ((d21Var3.g & 2048) != 0 && (d21Var3 instanceof rz)) {
                                        int i3 = 0;
                                        for (d21 d21Var4 = ((rz) d21Var3).t; d21Var4 != null; d21Var4 = d21Var4.j) {
                                            if ((d21Var4.g & 2048) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    d21Var3 = d21Var4;
                                                } else {
                                                    if (q41Var == null) {
                                                        q41Var = new q41(new d21[16]);
                                                    }
                                                    if (d21Var3 != null) {
                                                        q41Var.b(d21Var3);
                                                        d21Var3 = null;
                                                    }
                                                    q41Var.b(d21Var4);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    d21Var3 = hp.l(q41Var);
                                } else {
                                    c21 c21Var = ((dh) d21Var3).s;
                                    kl0.b("applyFocusProperties called on wrong node");
                                    c21Var.getClass();
                                    se.s();
                                    return null;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                    d21Var2 = d21Var2.i;
                }
            }
            M = M.v();
            if (M != null && (a81Var = M.J) != null) {
                d21Var2 = a81Var.e;
            } else {
                d21Var2 = null;
            }
        }
        return obj;
    }

    public final pl1 O0(iq0 iq0Var) {
        pl1 pl1Var = N0().l;
        if (pl1Var != g3.L) {
            if (iq0Var == null) {
                return pl1Var;
            }
            return pl1Var.i(iq0Var.L(hp.L(this), 0L));
        }
        if (iq0Var != null) {
            return iq0Var.O(hp.L(this), false);
        }
        return hp.e(0L, vn.O(hp.L(this).g));
    }

    public final yr0 P0() {
        a81 a81Var;
        Object obj;
        if (!this.e.r) {
            kl0.b("visitAncestors called on an unattached node");
        }
        d21 d21Var = this.e.i;
        ar0 M = hp.M(this);
        while (true) {
            if (M == null) {
                break;
            }
            if ((M.J.f.h & 8388640) != 0) {
                while (d21Var != null) {
                    int i = d21Var.g;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(d21Var instanceof yr0)) {
                                if (d21Var instanceof rz) {
                                    d21Var = null;
                                    for (d21 d21Var2 = ((rz) d21Var).t; d21Var2 != null; d21Var2 = d21Var2.j) {
                                        if (d21Var2 instanceof yr0) {
                                            d21Var = d21Var2;
                                        }
                                    }
                                } else {
                                    d21Var = null;
                                }
                            }
                            yr0 yr0Var = (yr0) d21Var;
                            if (yr0Var != null) {
                                return yr0Var;
                            }
                        } else if ((i & 32) != 0) {
                            if (d21Var instanceof g21) {
                                obj = d21Var;
                            } else if (d21Var instanceof rz) {
                                obj = null;
                                for (d21 d21Var3 = ((rz) d21Var).t; d21Var3 != null; d21Var3 = d21Var3.j) {
                                    if (d21Var3 instanceof g21) {
                                        obj = d21Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            g21 g21Var = (g21) obj;
                            if (g21Var != null) {
                                g21Var.O();
                            }
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
        return null;
    }

    public final sc0 Q0() {
        a81 a81Var;
        boolean z = this.r;
        sc0 sc0Var = sc0.g;
        if (!z) {
            return sc0Var;
        }
        tc0 f = ((mc0) ((q5) hp.N(this)).getFocusOwner()).f();
        if (f == null) {
            return sc0Var;
        }
        if (this == f) {
            return sc0.e;
        }
        if (f.r) {
            if (!f.e.r) {
                kl0.b("visitAncestors called on an unattached node");
            }
            d21 d21Var = f.e.i;
            ar0 M = hp.M(f);
            while (M != null) {
                if ((M.J.f.h & 1024) != 0) {
                    while (d21Var != null) {
                        if ((d21Var.g & 1024) != 0) {
                            d21 d21Var2 = d21Var;
                            q41 q41Var = null;
                            while (d21Var2 != null) {
                                if (d21Var2 instanceof tc0) {
                                    if (this == ((tc0) d21Var2)) {
                                        return sc0.f;
                                    }
                                } else if ((d21Var2.g & 1024) != 0 && (d21Var2 instanceof rz)) {
                                    int i = 0;
                                    for (d21 d21Var3 = ((rz) d21Var2).t; d21Var3 != null; d21Var3 = d21Var3.j) {
                                        if ((d21Var3.g & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                d21Var2 = d21Var3;
                                            } else {
                                                if (q41Var == null) {
                                                    q41Var = new q41(new d21[16]);
                                                }
                                                if (d21Var2 != null) {
                                                    q41Var.b(d21Var2);
                                                    d21Var2 = null;
                                                }
                                                q41Var.b(d21Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                d21Var2 = hp.l(q41Var);
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
        return sc0Var;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, wl1] */
    public final void R0() {
        int ordinal = Q0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        se.m();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        ?? obj = new Object();
        io.F(this, new f5(5, obj, this));
        Object obj2 = obj.e;
        if (obj2 != null) {
            if (!((nc0) obj2).a) {
                ((mc0) ((q5) hp.N(this)).getFocusOwner()).b(8, true, true);
                return;
            }
            return;
        }
        sn0.V("focusProperties");
        throw null;
    }

    public final boolean S0(int i) {
        boolean k;
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            if (N0().a) {
                k = L0();
            } else {
                k = pp1.k(this, i, new x81(i));
            }
            return k;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.w81
    public final void e0() {
        R0();
    }

    @Override // defpackage.gq0
    public final void l(iq0 iq0Var) {
    }
}
