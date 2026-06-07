package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zy0 extends ig1 implements e01, o3, q21 {
    public Object B;
    public boolean F;
    public final er0 j;
    public boolean k;
    public boolean o;
    public boolean p;
    public boolean q;
    public us r;
    public oe0 t;
    public boolean y;
    public int l = Integer.MAX_VALUE;
    public int m = Integer.MAX_VALUE;
    public yq0 n = yq0.g;
    public long s = 0;
    public xy0 u = xy0.g;
    public final br0 v = new br0(this, 1);
    public final q41 w = new q41(new zy0[16]);
    public boolean x = true;
    public final yy0 z = new yy0(this, 0);
    public boolean A = true;
    public long C = vs.b(0, 0, 15);
    public final yy0 D = new yy0(this, 2);
    public final yy0 E = new yy0(this, 1);

    public zy0(er0 er0Var) {
        this.j = er0Var;
        this.B = er0Var.p.v;
    }

    public final void A0() {
        wq0 wq0Var;
        this.F = true;
        er0 er0Var = this.j;
        ar0 v = er0Var.a.v();
        xy0 xy0Var = this.u;
        if ((xy0Var != xy0.e && !er0Var.c) || (xy0Var != xy0.f && er0Var.c)) {
            w0();
            if (this.k && v != null) {
                v.U(false);
            }
        }
        if (v != null) {
            er0 er0Var2 = v.K;
            if (!this.k && ((wq0Var = er0Var2.d) == wq0.g || wq0Var == wq0.h)) {
                if (this.m != Integer.MAX_VALUE) {
                    kl0.b("Place was called on a node which was placed already");
                }
                int i = er0Var2.h;
                this.m = i;
                er0Var2.h = i + 1;
            }
        } else {
            this.m = 0;
        }
        H();
    }

    public final void B0(long j, oe0 oe0Var) {
        wq0 wq0Var;
        er0 er0Var = this.j;
        ar0 ar0Var = er0Var.a;
        ar0 ar0Var2 = er0Var.a;
        try {
            ar0 v = ar0Var.v();
            if (v != null) {
                wq0Var = v.K.d;
            } else {
                wq0Var = null;
            }
            wq0 wq0Var2 = wq0.h;
            if (wq0Var == wq0Var2) {
                er0Var.c = false;
            }
            if (ar0Var2.S) {
                kl0.a("place is called on a deactivated node");
            }
            er0Var.d = wq0Var2;
            boolean z = true;
            this.p = true;
            this.F = false;
            if (!xm0.a(j, this.s)) {
                if (er0Var.n || er0Var.m) {
                    er0Var.f = true;
                }
                x0();
            }
            jc1 a = dr0.a(ar0Var2);
            this.s = j;
            if (!er0Var.f) {
                if (this.u == xy0.g) {
                    z = false;
                }
                if (z) {
                    vy0 T0 = er0Var.a().T0();
                    T0.getClass();
                    T0.M0(xm0.c(j, T0.i));
                    A0();
                    this.t = oe0Var;
                    er0Var.d = wq0.i;
                }
            }
            er0Var.h(false);
            this.v.g = false;
            lc1 snapshotObserver = ((q5) a).getSnapshotObserver();
            snapshotObserver.a.c(ar0Var2, snapshotObserver.g, this.E);
            this.t = oe0Var;
            er0Var.d = wq0.i;
        } catch (Throwable th) {
            ar0Var.a0(th);
            throw null;
        }
    }

    @Override // defpackage.ig1, defpackage.e01
    public final Object C() {
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:38:0x0093, B:39:0x0098, B:41:0x00b5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[Catch: all -> 0x0010, LOOP:0: B:28:0x0062->B:29:0x0064, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:38:0x0093, B:39:0x0098, B:41:0x00b5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:38:0x0093, B:39:0x0098, B:41:0x00b5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0047, B:26:0x0035, B:27:0x004b, B:29:0x0064, B:31:0x0076, B:33:0x007a, B:34:0x0082, B:38:0x0093, B:39:0x0098, B:41:0x00b5), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C0(long r14) {
        /*
            r13 = this;
            er0 r0 = r13.j
            ar0 r1 = r0.a
            ar0 r2 = r0.a
            boolean r3 = r1.S     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L13
            java.lang.String r3 = "measure is called on a deactivated node"
            defpackage.kl0.a(r3)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r13 = move-exception
            goto Lbf
        L13:
            ar0 r3 = r2.v()     // Catch: java.lang.Throwable -> L10
            boolean r4 = r2.I     // Catch: java.lang.Throwable -> L10
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L26
            if (r3 == 0) goto L24
            boolean r3 = r3.I     // Catch: java.lang.Throwable -> L10
            if (r3 == 0) goto L24
            goto L26
        L24:
            r3 = r6
            goto L27
        L26:
            r3 = r5
        L27:
            r2.I = r3     // Catch: java.lang.Throwable -> L10
            er0 r3 = r2.K     // Catch: java.lang.Throwable -> L10
            boolean r3 = r3.e     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L4b
            us r3 = r13.r     // Catch: java.lang.Throwable -> L10
            if (r3 != 0) goto L35
            r3 = r6
            goto L3b
        L35:
            long r3 = r3.a     // Catch: java.lang.Throwable -> L10
            boolean r3 = defpackage.us.b(r3, r14)     // Catch: java.lang.Throwable -> L10
        L3b:
            if (r3 != 0) goto L3e
            goto L4b
        L3e:
            jc1 r13 = r2.s     // Catch: java.lang.Throwable -> L10
            if (r13 == 0) goto L47
            q5 r13 = (defpackage.q5) r13     // Catch: java.lang.Throwable -> L10
            r13.k(r2, r5)     // Catch: java.lang.Throwable -> L10
        L47:
            r2.Z()     // Catch: java.lang.Throwable -> L10
            return r6
        L4b:
            us r3 = new us     // Catch: java.lang.Throwable -> L10
            r3.<init>(r14)     // Catch: java.lang.Throwable -> L10
            r13.r = r3     // Catch: java.lang.Throwable -> L10
            r13.p0(r14)     // Catch: java.lang.Throwable -> L10
            br0 r3 = r13.v     // Catch: java.lang.Throwable -> L10
            r3.f = r6     // Catch: java.lang.Throwable -> L10
            q41 r2 = r2.z()     // Catch: java.lang.Throwable -> L10
            java.lang.Object[] r3 = r2.e     // Catch: java.lang.Throwable -> L10
            int r2 = r2.g     // Catch: java.lang.Throwable -> L10
            r4 = r6
        L62:
            if (r4 >= r2) goto L76
            r7 = r3[r4]     // Catch: java.lang.Throwable -> L10
            ar0 r7 = (defpackage.ar0) r7     // Catch: java.lang.Throwable -> L10
            er0 r7 = r7.K     // Catch: java.lang.Throwable -> L10
            zy0 r7 = r7.q     // Catch: java.lang.Throwable -> L10
            r7.getClass()     // Catch: java.lang.Throwable -> L10
            br0 r7 = r7.v     // Catch: java.lang.Throwable -> L10
            r7.c = r6     // Catch: java.lang.Throwable -> L10
            int r4 = r4 + 1
            goto L62
        L76:
            boolean r2 = r13.q     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L7d
            long r2 = r13.g     // Catch: java.lang.Throwable -> L10
            goto L82
        L7d:
            r2 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
        L82:
            r13.q = r5     // Catch: java.lang.Throwable -> L10
            e81 r4 = r0.a()     // Catch: java.lang.Throwable -> L10
            vy0 r4 = r4.T0()     // Catch: java.lang.Throwable -> L10
            if (r4 == 0) goto L90
            r7 = r5
            goto L91
        L90:
            r7 = r6
        L91:
            if (r7 != 0) goto L98
            java.lang.String r7 = "Lookahead result from lookaheadRemeasure cannot be null"
            defpackage.kl0.b(r7)     // Catch: java.lang.Throwable -> L10
        L98:
            r0.c(r14)     // Catch: java.lang.Throwable -> L10
            int r14 = r4.e     // Catch: java.lang.Throwable -> L10
            int r15 = r4.f     // Catch: java.lang.Throwable -> L10
            long r7 = (long) r14     // Catch: java.lang.Throwable -> L10
            r14 = 32
            long r7 = r7 << r14
            long r9 = (long) r15     // Catch: java.lang.Throwable -> L10
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r11
            long r7 = r7 | r9
            r13.o0(r7)     // Catch: java.lang.Throwable -> L10
            long r13 = r2 >> r14
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L10
            int r14 = r4.e     // Catch: java.lang.Throwable -> L10
            if (r13 != r14) goto Lbe
            long r13 = r2 & r11
            int r13 = (int) r13     // Catch: java.lang.Throwable -> L10
            int r14 = r4.f     // Catch: java.lang.Throwable -> L10
            if (r13 == r14) goto Lbd
            goto Lbe
        Lbd:
            return r6
        Lbe:
            return r5
        Lbf:
            r1.a0(r13)
            r13 = 0
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy0.C0(long):boolean");
    }

    @Override // defpackage.o3
    public final void E(n3 n3Var) {
        q41 z = this.j.a.z();
        Object[] objArr = z.e;
        int i = z.g;
        for (int i2 = 0; i2 < i; i2++) {
            zy0 zy0Var = ((ar0) objArr[i2]).K.q;
            zy0Var.getClass();
            n3Var.invoke(zy0Var);
        }
    }

    @Override // defpackage.q21
    public final void F(boolean z) {
        Boolean bool;
        vy0 T0;
        er0 er0Var = this.j;
        vy0 T02 = er0Var.a().T0();
        if (T02 != null) {
            bool = Boolean.valueOf(T02.m);
        } else {
            bool = null;
        }
        if (!Boolean.valueOf(z).equals(bool) && (T0 = er0Var.a().T0()) != null) {
            T0.m = z;
        }
    }

    @Override // defpackage.o3
    public final void H() {
        us usVar;
        this.y = true;
        br0 br0Var = this.v;
        br0Var.h();
        er0 er0Var = this.j;
        boolean z = er0Var.f;
        ar0 ar0Var = er0Var.a;
        if (z) {
            q41 z2 = ar0Var.z();
            Object[] objArr = z2.e;
            int i = z2.g;
            for (int i2 = 0; i2 < i; i2++) {
                ar0 ar0Var2 = (ar0) objArr[i2];
                er0 er0Var2 = ar0Var2.K;
                if (er0Var2.e && ar0Var2.t() == yq0.e) {
                    zy0 zy0Var = er0Var2.q;
                    zy0Var.getClass();
                    zy0 zy0Var2 = er0Var2.q;
                    if (zy0Var2 != null) {
                        usVar = zy0Var2.r;
                    } else {
                        usVar = null;
                    }
                    usVar.getClass();
                    if (zy0Var.C0(usVar.a)) {
                        ar0.V(ar0Var, false, 7);
                    }
                }
            }
        }
        pl0 pl0Var = h().W;
        pl0Var.getClass();
        if (er0Var.g || (!this.o && !pl0Var.o && er0Var.f)) {
            er0Var.f = false;
            wq0 wq0Var = er0Var.d;
            er0Var.d = wq0.h;
            er0Var.i(false);
            lc1 snapshotObserver = ((q5) dr0.a(ar0Var)).getSnapshotObserver();
            snapshotObserver.a.c(ar0Var, snapshotObserver.h, this.z);
            er0Var.d = wq0Var;
            if (er0Var.m && pl0Var.o) {
                requestLayout();
            }
            er0Var.g = false;
        }
        if (br0Var.d) {
            br0Var.e = true;
        }
        if (br0Var.b && br0Var.e()) {
            br0Var.g();
        }
        this.y = false;
    }

    @Override // defpackage.o3
    public final void U() {
        ar0.V(this.j.a, false, 7);
    }

    @Override // defpackage.e01
    public final int Y(int i) {
        z0();
        vy0 T0 = this.j.a().T0();
        T0.getClass();
        return T0.Y(i);
    }

    @Override // defpackage.ig1
    public final int a0(j3 j3Var) {
        wq0 wq0Var;
        er0 er0Var = this.j;
        ar0 v = er0Var.a.v();
        wq0 wq0Var2 = null;
        if (v != null) {
            wq0Var = v.K.d;
        } else {
            wq0Var = null;
        }
        wq0 wq0Var3 = wq0.f;
        br0 br0Var = this.v;
        if (wq0Var == wq0Var3) {
            br0Var.c = true;
        } else {
            ar0 v2 = er0Var.a.v();
            if (v2 != null) {
                wq0Var2 = v2.K.d;
            }
            if (wq0Var2 == wq0.h) {
                br0Var.d = true;
            }
        }
        this.o = true;
        vy0 T0 = er0Var.a().T0();
        T0.getClass();
        int a0 = T0.a0(j3Var);
        this.o = false;
        return a0;
    }

    @Override // defpackage.o3
    public final br0 b() {
        return this.v;
    }

    @Override // defpackage.e01
    public final int c(int i) {
        z0();
        vy0 T0 = this.j.a().T0();
        T0.getClass();
        return T0.c(i);
    }

    @Override // defpackage.ig1
    public final int e0() {
        vy0 T0 = this.j.a().T0();
        T0.getClass();
        return T0.e0();
    }

    @Override // defpackage.ig1
    public final int f0() {
        vy0 T0 = this.j.a().T0();
        T0.getClass();
        return T0.f0();
    }

    @Override // defpackage.o3
    public final ql0 h() {
        return this.j.a.J.c;
    }

    @Override // defpackage.o3
    public final o3 i() {
        er0 er0Var;
        ar0 v = this.j.a.v();
        if (v != null && (er0Var = v.K) != null) {
            return er0Var.q;
        }
        return null;
    }

    @Override // defpackage.ig1
    public final void m0(long j, float f, oe0 oe0Var) {
        B0(j, oe0Var);
    }

    @Override // defpackage.e01
    public final int n(int i) {
        z0();
        vy0 T0 = this.j.a().T0();
        T0.getClass();
        return T0.n(i);
    }

    @Override // defpackage.o3
    public final int o() {
        return this.m;
    }

    @Override // defpackage.o3
    public final void requestLayout() {
        this.j.a.U(false);
    }

    @Override // defpackage.e01
    public final int s(int i) {
        z0();
        vy0 T0 = this.j.a().T0();
        T0.getClass();
        return T0.s(i);
    }

    public final boolean t0() {
        er0 er0Var = this.j;
        if (!vn.F(er0Var.a) && !er0Var.c) {
            return false;
        }
        return true;
    }

    public final void u0(boolean z) {
        if (!z || !t0()) {
            if (z || t0()) {
                this.u = xy0.g;
                q41 z2 = this.j.a.z();
                Object[] objArr = z2.e;
                int i = z2.g;
                for (int i2 = 0; i2 < i; i2++) {
                    zy0 zy0Var = ((ar0) objArr[i2]).K.q;
                    zy0Var.getClass();
                    zy0Var.u0(true);
                }
            }
        }
    }

    public final void w0() {
        xy0 xy0Var = this.u;
        er0 er0Var = this.j;
        boolean z = er0Var.c;
        ar0 ar0Var = er0Var.a;
        xy0 xy0Var2 = xy0.e;
        if (z) {
            this.u = xy0.f;
        } else {
            this.u = xy0Var2;
        }
        if (xy0Var != xy0Var2 && er0Var.e) {
            ar0.V(ar0Var, true, 6);
        }
        q41 z2 = ar0Var.z();
        Object[] objArr = z2.e;
        int i = z2.g;
        for (int i2 = 0; i2 < i; i2++) {
            ar0 ar0Var2 = (ar0) objArr[i2];
            zy0 zy0Var = ar0Var2.K.q;
            if (zy0Var != null) {
                if (zy0Var.m != Integer.MAX_VALUE) {
                    zy0Var.w0();
                    ar0.Y(ar0Var2);
                }
            } else {
                se.h("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r1 == defpackage.wq0.h) goto L14;
     */
    @Override // defpackage.e01
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ig1 x(long r7) {
        /*
            r6 = this;
            er0 r0 = r6.j
            ar0 r1 = r0.a
            ar0 r2 = r0.a
            ar0 r1 = r1.v()
            r3 = 0
            if (r1 == 0) goto L12
            er0 r1 = r1.K
            wq0 r1 = r1.d
            goto L13
        L12:
            r1 = r3
        L13:
            wq0 r4 = defpackage.wq0.f
            if (r1 == r4) goto L27
            ar0 r1 = r2.v()
            if (r1 == 0) goto L22
            er0 r1 = r1.K
            wq0 r1 = r1.d
            goto L23
        L22:
            r1 = r3
        L23:
            wq0 r4 = defpackage.wq0.h
            if (r1 != r4) goto L2a
        L27:
            r1 = 0
            r0.b = r1
        L2a:
            ar0 r0 = r2.v()
            yq0 r1 = defpackage.yq0.g
            if (r0 == 0) goto L64
            er0 r0 = r0.K
            yq0 r4 = r6.n
            if (r4 == r1) goto L42
            boolean r4 = r2.I
            if (r4 == 0) goto L3d
            goto L42
        L3d:
            java.lang.String r4 = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"
            defpackage.kl0.b(r4)
        L42:
            wq0 r4 = r0.d
            int r4 = r4.ordinal()
            if (r4 == 0) goto L5f
            r5 = 1
            if (r4 == r5) goto L5f
            r5 = 2
            if (r4 == r5) goto L5c
            r5 = 3
            if (r4 != r5) goto L54
            goto L5c
        L54:
            java.lang.String r6 = "Measurable could be only measured from the parent's measure or layout block. Parents state is "
            wq0 r7 = r0.d
            defpackage.se.g(r7, r6)
            return r3
        L5c:
            yq0 r0 = defpackage.yq0.f
            goto L61
        L5f:
            yq0 r0 = defpackage.yq0.e
        L61:
            r6.n = r0
            goto L66
        L64:
            r6.n = r1
        L66:
            yq0 r0 = r2.G
            if (r0 != r1) goto L6d
            r2.e()
        L6d:
            r6.C0(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy0.x(long):ig1");
    }

    public final void x0() {
        er0 er0Var = this.j;
        if (er0Var.o > 0) {
            q41 z = er0Var.a.z();
            Object[] objArr = z.e;
            int i = z.g;
            for (int i2 = 0; i2 < i; i2++) {
                ar0 ar0Var = (ar0) objArr[i2];
                er0 er0Var2 = ar0Var.K;
                if ((er0Var2.m || er0Var2.n) && !er0Var2.f) {
                    ar0Var.U(false);
                }
                zy0 zy0Var = er0Var2.q;
                if (zy0Var != null) {
                    zy0Var.x0();
                }
            }
        }
    }

    public final void z0() {
        yq0 yq0Var;
        er0 er0Var = this.j;
        ar0.V(er0Var.a, false, 7);
        ar0 ar0Var = er0Var.a;
        ar0 v = ar0Var.v();
        if (v != null && ar0Var.G == yq0.g) {
            int ordinal = v.K.d.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    yq0Var = v.G;
                } else {
                    yq0Var = yq0.f;
                }
            } else {
                yq0Var = yq0.e;
            }
            ar0Var.G = yq0Var;
        }
    }
}
