package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class r71 extends d21 implements ub2, l71 {
    public l71 s;
    public q4 t;
    public r71 u;
    public final String v;

    public r71(l71 l71Var, q4 q4Var) {
        this.s = l71Var;
        this.t = q4Var == null ? new q4() : q4Var;
        this.v = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x00ea, code lost:
    
        if (r15 == r5) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r6v10, types: [d21] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [d21] */
    /* JADX WARN: Type inference failed for: r6v8, types: [ub2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
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
    @Override // defpackage.l71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(long r13, defpackage.vt r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r71.D(long, vt):java.lang.Object");
    }

    @Override // defpackage.d21
    public final void D0() {
        q4 q4Var = this.t;
        q4Var.f = this;
        q4Var.g = null;
        this.u = null;
        q4Var.h = new s8(this, 9);
        q4Var.i = z0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wl1] */
    @Override // defpackage.d21
    public final void E0() {
        ?? obj = new Object();
        fr1.u(this, new h5(obj, 2));
        r71 r71Var = (r71) ((ub2) obj.e);
        this.u = r71Var;
        q4 q4Var = this.t;
        q4Var.g = r71Var;
        if (((r71) q4Var.f) == this) {
            q4Var.f = null;
        }
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
    /* JADX WARN: Type inference failed for: r3v8, types: [ub2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [q41] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [q41] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.l71
    public final long H(int i, long j) {
        long j2;
        a81 a81Var;
        boolean z = this.r;
        r71 r71Var = null;
        if (z && z) {
            if (!this.e.r) {
                kl0.b("visitAncestors called on an unattached node");
            }
            d21 d21Var = this.e.i;
            ar0 M = hp.M(this);
            loop0: while (true) {
                if (M == null) {
                    break;
                }
                if ((M.J.f.h & 262144) != 0) {
                    while (d21Var != null) {
                        if ((d21Var.g & 262144) != 0) {
                            rz rzVar = d21Var;
                            ?? r5 = 0;
                            while (rzVar != 0) {
                                if (rzVar instanceof ub2) {
                                    ?? r3 = (ub2) rzVar;
                                    if (sn0.r(m(), r3.m()) && r71.class == r3.getClass()) {
                                        r71Var = r3;
                                        break loop0;
                                    }
                                } else if ((rzVar.g & 262144) != 0 && (rzVar instanceof rz)) {
                                    d21 d21Var2 = rzVar.t;
                                    int i2 = 0;
                                    rzVar = rzVar;
                                    r5 = r5;
                                    while (d21Var2 != null) {
                                        if ((d21Var2.g & 262144) != 0) {
                                            i2++;
                                            r5 = r5;
                                            if (i2 == 1) {
                                                rzVar = d21Var2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new q41(new d21[16]);
                                                }
                                                if (rzVar != 0) {
                                                    r5.b(rzVar);
                                                    rzVar = 0;
                                                }
                                                r5.b(d21Var2);
                                            }
                                        }
                                        d21Var2 = d21Var2.j;
                                        rzVar = rzVar;
                                        r5 = r5;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                rzVar = hp.l(r5);
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
            r71Var = r71Var;
        }
        if (r71Var != null) {
            j2 = r71Var.H(i, j);
        } else {
            j2 = 0;
        }
        return z81.e(j2, this.s.H(i, z81.d(j, j2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [d21] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [d21] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [q41] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [q41] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final gv L0() {
        r71 r71Var;
        gv gvVar;
        ub2 ub2Var;
        a81 a81Var;
        if (this.r) {
            if (!this.e.r) {
                kl0.b("visitAncestors called on an unattached node");
            }
            d21 d21Var = this.e.i;
            ar0 M = hp.M(this);
            loop0: while (true) {
                if (M != null) {
                    if ((M.J.f.h & 262144) != 0) {
                        while (d21Var != null) {
                            if ((d21Var.g & 262144) != 0) {
                                rz rzVar = d21Var;
                                ?? r6 = 0;
                                while (rzVar != 0) {
                                    if (rzVar instanceof ub2) {
                                        ub2Var = (ub2) rzVar;
                                        if (sn0.r(m(), ub2Var.m()) && r71.class == ub2Var.getClass()) {
                                            break loop0;
                                        }
                                    } else if ((rzVar.g & 262144) != 0 && (rzVar instanceof rz)) {
                                        d21 d21Var2 = rzVar.t;
                                        int i = 0;
                                        rzVar = rzVar;
                                        r6 = r6;
                                        while (d21Var2 != null) {
                                            if ((d21Var2.g & 262144) != 0) {
                                                i++;
                                                r6 = r6;
                                                if (i == 1) {
                                                    rzVar = d21Var2;
                                                } else {
                                                    if (r6 == 0) {
                                                        r6 = new q41(new d21[16]);
                                                    }
                                                    if (rzVar != 0) {
                                                        r6.b(rzVar);
                                                        rzVar = 0;
                                                    }
                                                    r6.b(d21Var2);
                                                }
                                            }
                                            d21Var2 = d21Var2.j;
                                            rzVar = rzVar;
                                            r6 = r6;
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    rzVar = hp.l(r6);
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
                } else {
                    ub2Var = null;
                    break;
                }
            }
            r71Var = (r71) ub2Var;
        } else {
            r71Var = null;
        }
        if (r71Var != null) {
            gvVar = r71Var.L0();
        } else {
            gvVar = null;
        }
        if (gvVar != null && fp.J(gvVar)) {
            return gvVar;
        }
        gv gvVar2 = (gv) this.t.i;
        if (gvVar2 != null) {
            return gvVar2;
        }
        se.p("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    @Override // defpackage.ub2
    public final Object m() {
        return this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [ub2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [d21] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [d21] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [q41] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [q41] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.l71
    public final long o0(long j, long j2, int i) {
        long j3;
        a81 a81Var;
        long o0 = this.s.o0(j, j2, i);
        boolean z = this.r;
        r71 r71Var = null;
        if (z && z) {
            if (!this.e.r) {
                kl0.b("visitAncestors called on an unattached node");
            }
            d21 d21Var = this.e.i;
            ar0 M = hp.M(this);
            loop0: while (true) {
                if (M == null) {
                    break;
                }
                if ((M.J.f.h & 262144) != 0) {
                    while (d21Var != null) {
                        if ((d21Var.g & 262144) != 0) {
                            rz rzVar = d21Var;
                            ?? r6 = 0;
                            while (rzVar != 0) {
                                if (rzVar instanceof ub2) {
                                    ?? r4 = (ub2) rzVar;
                                    if (sn0.r(m(), r4.m()) && r71.class == r4.getClass()) {
                                        r71Var = r4;
                                        break loop0;
                                    }
                                } else if ((rzVar.g & 262144) != 0 && (rzVar instanceof rz)) {
                                    d21 d21Var2 = rzVar.t;
                                    int i2 = 0;
                                    rzVar = rzVar;
                                    r6 = r6;
                                    while (d21Var2 != null) {
                                        if ((d21Var2.g & 262144) != 0) {
                                            i2++;
                                            r6 = r6;
                                            if (i2 == 1) {
                                                rzVar = d21Var2;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new q41(new d21[16]);
                                                }
                                                if (rzVar != 0) {
                                                    r6.b(rzVar);
                                                    rzVar = 0;
                                                }
                                                r6.b(d21Var2);
                                            }
                                        }
                                        d21Var2 = d21Var2.j;
                                        rzVar = rzVar;
                                        r6 = r6;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                rzVar = hp.l(r6);
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
            r71Var = r71Var;
        }
        r71 r71Var2 = r71Var;
        if (r71Var2 != null) {
            j3 = r71Var2.o0(z81.e(j, o0), z81.d(j2, o0), i);
        } else {
            j3 = 0;
        }
        return z81.e(o0, j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r14v15, types: [ub2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [d21] */
    @Override // defpackage.l71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t0(long r18, long r20, defpackage.vt r22) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r71.t0(long, long, vt):java.lang.Object");
    }
}
