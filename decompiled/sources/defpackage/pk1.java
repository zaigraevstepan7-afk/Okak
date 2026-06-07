package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pk1 extends rz implements l71 {
    public boolean u;
    public de0 v;
    public qk1 x;
    public float y;
    public boolean w = true;
    public final r71 z = new r71(this, null);
    public final fe1 A = new fe1(0.0f);
    public final fe1 B = new fe1(0.0f);

    public pk1(boolean z, de0 de0Var, qk1 qk1Var, float f) {
        this.u = z;
        this.v = de0Var;
        this.x = qk1Var;
        this.y = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O0(defpackage.pk1 r8, defpackage.wt r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof defpackage.lk1
            if (r0 == 0) goto L17
            r0 = r9
            lk1 r0 = (defpackage.lk1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.g = r1
        L15:
            r5 = r0
            goto L1d
        L17:
            lk1 r0 = new lk1
            r0.<init>(r8, r9)
            goto L15
        L1d:
            java.lang.Object r9 = r5.e
            int r0 = r5.g
            od2 r7 = defpackage.od2.a
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L2f
            defpackage.io.K(r9)     // Catch: java.lang.Throwable -> L2c
            goto L57
        L2c:
            r0 = move-exception
            r9 = r0
            goto L6c
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r8)
            r8 = 0
            return r8
        L36:
            defpackage.io.K(r9)
            qk1 r9 = r8.x     // Catch: java.lang.Throwable -> L2c
            r5.g = r1     // Catch: java.lang.Throwable -> L2c
            ya r1 = r9.a     // Catch: java.lang.Throwable -> L2c
            java.lang.Float r2 = new java.lang.Float     // Catch: java.lang.Throwable -> L2c
            r9 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L2c
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r9 = defpackage.ya.b(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2c
            hv r0 = defpackage.hv.e
            if (r9 != r0) goto L53
            goto L54
        L53:
            r9 = r7
        L54:
            if (r9 != r0) goto L57
            return r0
        L57:
            boolean r9 = r8.r
            if (r9 == 0) goto L6b
            int r9 = r8.R0()
            float r9 = (float) r9
            r8.T0(r9)
            int r9 = r8.R0()
            float r9 = (float) r9
            r8.U0(r9)
        L6b:
            return r7
        L6c:
            boolean r0 = r8.r
            if (r0 == 0) goto L80
            int r0 = r8.R0()
            float r0 = (float) r0
            r8.T0(r0)
            int r0 = r8.R0()
            float r0 = (float) r0
            r8.U0(r0)
        L80:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk1.O0(pk1, wt):java.lang.Object");
    }

    @Override // defpackage.d21
    public final boolean A0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.l71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(long r5, defpackage.vt r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.nk1
            if (r0 == 0) goto L13
            r0 = r7
            nk1 r0 = (defpackage.nk1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L1a
        L13:
            nk1 r0 = new nk1
            wt r7 = (defpackage.wt) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.e
            int r1 = r0.g
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.io.K(r7)
            goto L40
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.io.K(r7)
            float r5 = defpackage.ye2.c(r5)
            r0.g = r2
            java.lang.Object r7 = r4.S0(r5, r0)
            hv r4 = defpackage.hv.e
            if (r7 != r4) goto L40
            return r4
        L40:
            java.lang.Number r7 = (java.lang.Number) r7
            float r4 = r7.floatValue()
            r5 = 0
            long r4 = defpackage.xq1.c(r5, r4)
            ye2 r6 = new ye2
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk1.D(long, vt):java.lang.Object");
    }

    @Override // defpackage.d21
    public final void D0() {
        float f;
        L0(this.z);
        rx.C(z0(), null, new mk1(this, null, 0), 3);
        if (this.u) {
            f = R0();
        } else {
            f = 0.0f;
        }
        U0(f);
    }

    @Override // defpackage.l71
    public final long H(int i, long j) {
        if (!this.x.a.e() && this.w && i == 1 && Float.intBitsToFloat((int) (4294967295L & j)) < 0.0f) {
            return Q0(j);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P0(defpackage.wt r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.kk1
            if (r0 == 0) goto L14
            r0 = r10
            kk1 r0 = (defpackage.kk1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.g = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            kk1 r0 = new kk1
            r0.<init>(r9, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.e
            int r0 = r5.g
            od2 r7 = defpackage.od2.a
            r1 = 1
            r8 = 0
            if (r0 == 0) goto L34
            if (r0 != r1) goto L2d
            defpackage.io.K(r10)     // Catch: java.lang.Throwable -> L2a
            goto L53
        L2a:
            r0 = move-exception
            r10 = r0
            goto L5a
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r9)
            r9 = 0
            return r9
        L34:
            defpackage.io.K(r10)
            qk1 r10 = r9.x     // Catch: java.lang.Throwable -> L2a
            r5.g = r1     // Catch: java.lang.Throwable -> L2a
            ya r1 = r10.a     // Catch: java.lang.Throwable -> L2a
            java.lang.Float r2 = new java.lang.Float     // Catch: java.lang.Throwable -> L2a
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L2a
            r4 = 0
            r6 = 14
            r3 = 0
            java.lang.Object r10 = defpackage.ya.b(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2a
            hv r0 = defpackage.hv.e
            if (r10 != r0) goto L4f
            goto L50
        L4f:
            r10 = r7
        L50:
            if (r10 != r0) goto L53
            return r0
        L53:
            r9.T0(r8)
            r9.U0(r8)
            return r7
        L5a:
            r9.T0(r8)
            r9.U0(r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk1.P0(wt):java.lang.Object");
    }

    public final long Q0(long j) {
        float g;
        float R0;
        if (this.u) {
            g = 0.0f;
        } else {
            fe1 fe1Var = this.B;
            float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + fe1Var.g();
            if (intBitsToFloat < 0.0f) {
                intBitsToFloat = 0.0f;
            }
            g = intBitsToFloat - fe1Var.g();
            T0(intBitsToFloat);
            if (fe1Var.g() * 0.5f <= R0()) {
                R0 = fe1Var.g() * 0.5f;
            } else {
                float o = go.o(Math.abs((fe1Var.g() * 0.5f) / R0()) - 1.0f, 0.0f, 2.0f);
                R0 = R0() + (R0() * (o - (((float) Math.pow(o, 2.0d)) / 4.0f)));
            }
            U0(R0);
        }
        return (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(g) & 4294967295L);
    }

    public final int R0() {
        return hp.M(this).C.j0(this.y);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S0(float r6, defpackage.wt r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ok1
            if (r0 == 0) goto L13
            r0 = r7
            ok1 r0 = (defpackage.ok1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ok1 r0 = new ok1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f
            int r1 = r0.h
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L28
            float r6 = r0.e
            defpackage.io.K(r7)
            goto L6f
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r5)
            r5 = 0
            return r5
        L2f:
            defpackage.io.K(r7)
            boolean r7 = r5.u
            if (r7 == 0) goto L3c
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r3)
            return r5
        L3c:
            fe1 r7 = r5.B
            float r1 = r7.g()
            r4 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r4
            int r4 = r5.R0()
            float r4 = (float) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L53
            de0 r1 = r5.v
            r1.invoke()
        L53:
            float r7 = r7.g()
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 != 0) goto L5d
        L5b:
            r6 = r3
            goto L62
        L5d:
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 >= 0) goto L62
            goto L5b
        L62:
            r0.e = r6
            r0.h = r2
            java.lang.Object r7 = r5.P0(r0)
            hv r0 = defpackage.hv.e
            if (r7 != r0) goto L6f
            return r0
        L6f:
            r5.T0(r3)
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk1.S0(float, wt):java.lang.Object");
    }

    public final void T0(float f) {
        this.B.h(f);
    }

    public final void U0(float f) {
        this.A.h(f);
    }

    @Override // defpackage.l71
    public final long o0(long j, long j2, int i) {
        if (!this.x.a.e() && this.w) {
            int i2 = 1;
            if (i == 1) {
                long Q0 = Q0(j2);
                rx.C(z0(), null, new mk1(this, null, i2), 3);
                return Q0;
            }
            return 0L;
        }
        return 0L;
    }
}
