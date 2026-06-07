package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i01 extends ig1 implements e01, o3, q21 {
    public boolean A;
    public boolean E;
    public float I;
    public boolean J;
    public oe0 K;
    public float M;
    public boolean O;
    public final er0 j;
    public boolean k;
    public boolean n;
    public boolean o;
    public boolean q;
    public oe0 s;
    public float t;
    public Object v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public int l = Integer.MAX_VALUE;
    public int m = Integer.MAX_VALUE;
    public yq0 p = yq0.g;
    public long r = 0;
    public boolean u = true;
    public final br0 B = new br0(this, 0);
    public final q41 C = new q41(new i01[16]);
    public boolean D = true;
    public long F = vs.b(0, 0, 15);
    public final h01 G = new h01(this, 1);
    public final h01 H = new h01(this, 0);
    public long L = 0;
    public final h01 N = new h01(this, 2);

    public i01(er0 er0Var) {
        this.j = er0Var;
    }

    public final void A0() {
        this.J = true;
        er0 er0Var = this.j;
        ar0 v = er0Var.a.v();
        float f = h().E;
        ar0 ar0Var = er0Var.a;
        a81 a81Var = ar0Var.J;
        e81 e81Var = a81Var.d;
        ql0 ql0Var = a81Var.c;
        while (e81Var != ql0Var) {
            e81Var.getClass();
            tq0 tq0Var = (tq0) e81Var;
            f += tq0Var.E;
            e81Var = tq0Var.t;
        }
        if (f != this.I) {
            this.I = f;
            if (v != null) {
                v.O();
            }
            if (v != null) {
                v.C();
            }
        }
        if (!h().o) {
            boolean z = this.w;
            if (!z || this.B.d()) {
                u0();
            }
            if (!z) {
                if (v != null) {
                    v.C();
                }
                if (this.k && v != null) {
                    v.W(false);
                }
            } else {
                ar0Var.J.c.g1();
            }
        }
        if (v != null) {
            er0 er0Var2 = v.K;
            if (!this.k && er0Var2.d == wq0.g) {
                if (this.m != Integer.MAX_VALUE) {
                    kl0.b("Place was called on a node which was placed already");
                }
                int i = er0Var2.i;
                this.m = i;
                er0Var2.i = i + 1;
            }
        } else {
            this.m = 0;
        }
        H();
    }

    public final void B0(long j, float f, oe0 oe0Var) {
        er0 er0Var = this.j;
        ar0 ar0Var = er0Var.a;
        ar0 ar0Var2 = er0Var.a;
        if (ar0Var.S) {
            kl0.a("place is called on a deactivated node");
        }
        er0Var.d = wq0.g;
        this.r = j;
        this.t = f;
        this.s = oe0Var;
        this.J = false;
        jc1 a = dr0.a(ar0Var2);
        if (!this.z && this.w) {
            e81 a2 = er0Var.a();
            a2.l1(xm0.c(j, a2.i), f, oe0Var);
            A0();
        } else {
            this.B.g = false;
            er0Var.f(false);
            this.K = oe0Var;
            this.L = j;
            this.M = f;
            lc1 snapshotObserver = ((q5) a).getSnapshotObserver();
            snapshotObserver.a.c(ar0Var2, snapshotObserver.f, this.N);
        }
        er0Var.d = wq0.i;
        if (er0Var.a().o && (er0Var.k || er0Var.j)) {
            requestLayout();
        }
        this.o = true;
    }

    @Override // defpackage.ig1, defpackage.e01
    public final Object C() {
        return this.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: all -> 0x0010, LOOP:0: B:22:0x0052->B:23:0x0054, LOOP_END, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0063, B:28:0x007a, B:30:0x0099, B:31:0x009f, B:33:0x00ab, B:35:0x00b5, B:39:0x00c1, B:41:0x0075), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0063, B:28:0x007a, B:30:0x0099, B:31:0x009f, B:33:0x00ab, B:35:0x00b5, B:39:0x00c1, B:41:0x0075), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x0023, B:13:0x002b, B:15:0x0033, B:18:0x003c, B:21:0x0045, B:23:0x0054, B:25:0x0063, B:28:0x007a, B:30:0x0099, B:31:0x009f, B:33:0x00ab, B:35:0x00b5, B:39:0x00c1, B:41:0x0075), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C0(long r11) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i01.C0(long):boolean");
    }

    @Override // defpackage.o3
    public final void E(n3 n3Var) {
        q41 z = this.j.a.z();
        Object[] objArr = z.e;
        int i = z.g;
        for (int i2 = 0; i2 < i; i2++) {
            n3Var.invoke(((ar0) objArr[i2]).K.p);
        }
    }

    @Override // defpackage.q21
    public final void F(boolean z) {
        er0 er0Var = this.j;
        if (z != er0Var.a().m) {
            er0Var.a().m = z;
            this.O = true;
        }
    }

    @Override // defpackage.o3
    public final void H() {
        this.E = true;
        br0 br0Var = this.B;
        br0Var.h();
        boolean z = this.z;
        er0 er0Var = this.j;
        if (z) {
            q41 z2 = er0Var.a.z();
            Object[] objArr = z2.e;
            int i = z2.g;
            for (int i2 = 0; i2 < i; i2++) {
                ar0 ar0Var = (ar0) objArr[i2];
                if (ar0Var.q() && ar0Var.s() == yq0.e && ar0.Q(ar0Var)) {
                    ar0.X(er0Var.a, false, 7);
                }
            }
        }
        if (this.A || (!this.q && !h().o && this.z)) {
            this.z = false;
            wq0 wq0Var = er0Var.d;
            er0Var.d = wq0.g;
            er0Var.g(false);
            ar0 ar0Var2 = er0Var.a;
            lc1 snapshotObserver = ((q5) dr0.a(ar0Var2)).getSnapshotObserver();
            snapshotObserver.a.c(ar0Var2, snapshotObserver.e, this.H);
            er0Var.d = wq0Var;
            this.A = false;
        }
        if (br0Var.d) {
            br0Var.e = true;
        }
        if (br0Var.b && br0Var.e()) {
            br0Var.g();
        }
        this.E = false;
    }

    @Override // defpackage.o3
    public final void U() {
        ar0.X(this.j.a, false, 7);
    }

    @Override // defpackage.e01
    public final int Y(int i) {
        er0 er0Var = this.j;
        if (vn.F(er0Var.a)) {
            zy0 zy0Var = er0Var.q;
            zy0Var.getClass();
            return zy0Var.Y(i);
        }
        z0();
        return er0Var.a().Y(i);
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
        wq0 wq0Var3 = wq0.e;
        br0 br0Var = this.B;
        if (wq0Var == wq0Var3) {
            br0Var.c = true;
        } else {
            ar0 v2 = er0Var.a.v();
            if (v2 != null) {
                wq0Var2 = v2.K.d;
            }
            if (wq0Var2 == wq0.g) {
                br0Var.d = true;
            }
        }
        this.q = true;
        int a0 = er0Var.a().a0(j3Var);
        this.q = false;
        return a0;
    }

    @Override // defpackage.o3
    public final br0 b() {
        return this.B;
    }

    @Override // defpackage.e01
    public final int c(int i) {
        er0 er0Var = this.j;
        if (vn.F(er0Var.a)) {
            zy0 zy0Var = er0Var.q;
            zy0Var.getClass();
            return zy0Var.c(i);
        }
        z0();
        return er0Var.a().c(i);
    }

    @Override // defpackage.ig1
    public final int e0() {
        return this.j.a().e0();
    }

    @Override // defpackage.ig1
    public final int f0() {
        return this.j.a().f0();
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
            return er0Var.p;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x002d, B:10:0x0031, B:12:0x0039, B:15:0x0042, B:16:0x0044, B:18:0x0048, B:20:0x004e, B:22:0x0056, B:24:0x0064, B:26:0x006f, B:27:0x0073, B:28:0x005a, B:29:0x0087, B:31:0x008b, B:33:0x008f, B:34:0x0094, B:38:0x001a, B:40:0x001e, B:42:0x0022, B:44:0x002a, B:45:0x0026), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x002d, B:10:0x0031, B:12:0x0039, B:15:0x0042, B:16:0x0044, B:18:0x0048, B:20:0x004e, B:22:0x0056, B:24:0x0064, B:26:0x006f, B:27:0x0073, B:28:0x005a, B:29:0x0087, B:31:0x008b, B:33:0x008f, B:34:0x0094, B:38:0x001a, B:40:0x001e, B:42:0x0022, B:44:0x002a, B:45:0x0026), top: B:2:0x0007 }] */
    @Override // defpackage.ig1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0(long r9, float r11, defpackage.oe0 r12) {
        /*
            r8 = this;
            er0 r0 = r8.j
            ar0 r1 = r0.a
            ar0 r2 = r0.a
            r3 = 1
            r8.x = r3     // Catch: java.lang.Throwable -> L17
            long r4 = r8.r     // Catch: java.lang.Throwable -> L17
            boolean r4 = defpackage.xm0.a(r9, r4)     // Catch: java.lang.Throwable -> L17
            r5 = 0
            if (r4 == 0) goto L1a
            boolean r4 = r8.O     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L2d
            goto L1a
        L17:
            r8 = move-exception
            goto L98
        L1a:
            boolean r4 = r0.k     // Catch: java.lang.Throwable -> L17
            if (r4 != 0) goto L26
            boolean r4 = r0.j     // Catch: java.lang.Throwable -> L17
            if (r4 != 0) goto L26
            boolean r4 = r8.O     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L2a
        L26:
            r8.z = r3     // Catch: java.lang.Throwable -> L17
            r8.O = r5     // Catch: java.lang.Throwable -> L17
        L2a:
            r8.x0()     // Catch: java.lang.Throwable -> L17
        L2d:
            zy0 r4 = r0.q     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L44
            er0 r6 = r4.j     // Catch: java.lang.Throwable -> L17
            xy0 r4 = r4.u     // Catch: java.lang.Throwable -> L17
            xy0 r7 = defpackage.xy0.g     // Catch: java.lang.Throwable -> L17
            if (r4 != r7) goto L44
            ar0 r4 = r6.a     // Catch: java.lang.Throwable -> L17
            boolean r4 = defpackage.vn.F(r4)     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L42
            goto L44
        L42:
            r6.c = r3     // Catch: java.lang.Throwable -> L17
        L44:
            zy0 r4 = r0.q     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L87
            boolean r4 = r4.t0()     // Catch: java.lang.Throwable -> L17
            if (r4 != r3) goto L87
            e81 r3 = r0.a()     // Catch: java.lang.Throwable -> L17
            e81 r3 = r3.u     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L5a
            uy0 r3 = r3.p     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L64
        L5a:
            jc1 r3 = defpackage.dr0.a(r2)     // Catch: java.lang.Throwable -> L17
            q5 r3 = (defpackage.q5) r3     // Catch: java.lang.Throwable -> L17
            hg1 r3 = r3.getPlacementScope()     // Catch: java.lang.Throwable -> L17
        L64:
            zy0 r4 = r0.q     // Catch: java.lang.Throwable -> L17
            r4.getClass()     // Catch: java.lang.Throwable -> L17
            ar0 r2 = r2.v()     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L73
            er0 r2 = r2.K     // Catch: java.lang.Throwable -> L17
            r2.h = r5     // Catch: java.lang.Throwable -> L17
        L73:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4.m = r2     // Catch: java.lang.Throwable -> L17
            r2 = 32
            long r5 = r9 >> r2
            int r2 = (int) r5     // Catch: java.lang.Throwable -> L17
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r9
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L17
            defpackage.hg1.i(r3, r4, r2, r5)     // Catch: java.lang.Throwable -> L17
        L87:
            zy0 r0 = r0.q     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L94
            boolean r0 = r0.p     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L94
            java.lang.String r0 = "Error: Placement happened before lookahead."
            defpackage.kl0.b(r0)     // Catch: java.lang.Throwable -> L17
        L94:
            r8.B0(r9, r11, r12)     // Catch: java.lang.Throwable -> L17
            return
        L98:
            r1.a0(r8)
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i01.m0(long, float, oe0):void");
    }

    @Override // defpackage.e01
    public final int n(int i) {
        er0 er0Var = this.j;
        if (vn.F(er0Var.a)) {
            zy0 zy0Var = er0Var.q;
            zy0Var.getClass();
            return zy0Var.n(i);
        }
        z0();
        return er0Var.a().n(i);
    }

    @Override // defpackage.o3
    public final int o() {
        return this.m;
    }

    @Override // defpackage.o3
    public final void requestLayout() {
        this.j.a.W(false);
    }

    @Override // defpackage.e01
    public final int s(int i) {
        er0 er0Var = this.j;
        if (vn.F(er0Var.a)) {
            zy0 zy0Var = er0Var.q;
            zy0Var.getClass();
            return zy0Var.s(i);
        }
        z0();
        return er0Var.a().s(i);
    }

    public final List t0() {
        er0 er0Var = this.j;
        er0Var.a.h0();
        boolean z = this.D;
        q41 q41Var = this.C;
        if (!z) {
            return q41Var.f();
        }
        ar0 ar0Var = er0Var.a;
        q41 z2 = ar0Var.z();
        Object[] objArr = z2.e;
        int i = z2.g;
        for (int i2 = 0; i2 < i; i2++) {
            ar0 ar0Var2 = (ar0) objArr[i2];
            if (q41Var.g <= i2) {
                q41Var.b(ar0Var2.K.p);
            } else {
                i01 i01Var = ar0Var2.K.p;
                Object[] objArr2 = q41Var.e;
                Object obj = objArr2[i2];
                objArr2[i2] = i01Var;
            }
        }
        q41Var.l(((q41) ((z31) ar0Var.n()).f).g, q41Var.g);
        this.D = false;
        return q41Var.f();
    }

    public final void u0() {
        boolean z = this.w;
        this.w = true;
        er0 er0Var = this.j;
        ar0 ar0Var = er0Var.a;
        a81 a81Var = ar0Var.J;
        if (!z) {
            a81Var.c.g1();
            ((q5) dr0.a(ar0Var)).getRectManager().f(er0Var.a, true);
            if (ar0Var.q()) {
                ar0.X(ar0Var, true, 6);
            } else if (ar0Var.K.e) {
                ar0.V(ar0Var, true, 6);
            }
        }
        e81 e81Var = a81Var.c.t;
        for (e81 e81Var2 = a81Var.d; !sn0.r(e81Var2, e81Var) && e81Var2 != null; e81Var2 = e81Var2.t) {
            if (e81Var2.O) {
                e81Var2.c1();
            }
        }
        q41 z2 = ar0Var.z();
        Object[] objArr = z2.e;
        int i = z2.g;
        for (int i2 = 0; i2 < i; i2++) {
            ar0 ar0Var2 = (ar0) objArr[i2];
            if (ar0Var2.w() != Integer.MAX_VALUE) {
                ar0Var2.K.p.u0();
                ar0.Y(ar0Var2);
            }
        }
    }

    public final void w0() {
        if (this.w) {
            this.w = false;
            er0 er0Var = this.j;
            ar0 ar0Var = er0Var.a;
            ar0 ar0Var2 = er0Var.a;
            ((q5) dr0.a(ar0Var)).getRectManager().h(ar0Var2);
            a81 a81Var = ar0Var2.J;
            e81 e81Var = a81Var.c.t;
            for (e81 e81Var2 = a81Var.d; !sn0.r(e81Var2, e81Var) && e81Var2 != null; e81Var2 = e81Var2.t) {
                e81Var2.i1();
                e81Var2.n1();
            }
            q41 z = ar0Var2.z();
            Object[] objArr = z.e;
            int i = z.g;
            for (int i2 = 0; i2 < i; i2++) {
                ((ar0) objArr[i2]).K.p.w0();
            }
        }
    }

    @Override // defpackage.e01
    public final ig1 x(long j) {
        yq0 yq0Var;
        er0 er0Var = this.j;
        ar0 ar0Var = er0Var.a;
        ar0 ar0Var2 = er0Var.a;
        yq0 yq0Var2 = ar0Var.G;
        yq0 yq0Var3 = yq0.g;
        if (yq0Var2 == yq0Var3) {
            ar0Var.e();
        }
        if (vn.F(ar0Var2)) {
            zy0 zy0Var = er0Var.q;
            zy0Var.getClass();
            zy0Var.n = yq0Var3;
            zy0Var.x(j);
        }
        ar0 v = ar0Var2.v();
        if (v != null) {
            er0 er0Var2 = v.K;
            if (this.p != yq0Var3 && !ar0Var2.I) {
                kl0.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int ordinal = er0Var2.d.ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    yq0Var = yq0.f;
                } else {
                    se.g(er0Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
            } else {
                yq0Var = yq0.e;
            }
            this.p = yq0Var;
        } else {
            this.p = yq0Var3;
        }
        C0(j);
        return this;
    }

    public final void x0() {
        er0 er0Var = this.j;
        if (er0Var.l > 0) {
            q41 z = er0Var.a.z();
            Object[] objArr = z.e;
            int i = z.g;
            for (int i2 = 0; i2 < i; i2++) {
                ar0 ar0Var = (ar0) objArr[i2];
                er0 er0Var2 = ar0Var.K;
                boolean z2 = er0Var2.j;
                i01 i01Var = er0Var2.p;
                if ((z2 || er0Var2.k) && !i01Var.z) {
                    ar0Var.W(false);
                }
                i01Var.x0();
            }
        }
    }

    public final void z0() {
        yq0 yq0Var;
        er0 er0Var = this.j;
        ar0.X(er0Var.a, false, 7);
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
