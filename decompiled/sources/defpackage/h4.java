package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class h4 extends m30 {
    public n4 M;
    public sb1 N;
    public Boolean O;
    public v11 P;
    public z90 Q;
    public c00 R;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r9v4, types: [tl1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g1(defpackage.h4 r7, float r8, defpackage.wt r9) {
        /*
            boolean r0 = r9 instanceof defpackage.e4
            if (r0 == 0) goto L13
            r0 = r9
            e4 r0 = (defpackage.e4) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            e4 r0 = new e4
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f
            int r1 = r0.h
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L36
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            tl1 r7 = r0.e
            defpackage.io.K(r9)
            goto Lad
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r7)
            return r4
        L32:
            defpackage.io.K(r9)
            return r9
        L36:
            defpackage.io.K(r9)
            n4 r9 = r7.M
            boolean r9 = r9.d()
            hv r1 = defpackage.hv.e
            if (r9 == 0) goto L93
            n4 r7 = r7.M
            r0.h = r3
            boolean r9 = r7.d()
            if (r9 != 0) goto L52
            java.lang.String r9 = "AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information."
            defpackage.nl0.a(r9)
        L52:
            je1 r9 = r7.g
            java.lang.Object r9 = r9.getValue()
            cy r2 = r7.c()
            float r3 = r7.f()
            p1 r5 = r7.b
            if (r5 == 0) goto L8d
            v3 r6 = r7.c
            if (r6 == 0) goto L87
            java.lang.Object r2 = defpackage.mp0.e(r2, r3, r8, r5, r6)
            oe0 r3 = r7.a
            java.lang.Object r3 = r3.invoke(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L7f
            java.lang.Object r7 = defpackage.mp0.k(r7, r2, r8, r0)
            goto L83
        L7f:
            java.lang.Object r7 = defpackage.mp0.k(r7, r9, r8, r0)
        L83:
            if (r7 != r1) goto L86
            goto Lab
        L86:
            return r7
        L87:
            java.lang.String r7 = "velocityThreshold"
            defpackage.sn0.V(r7)
            throw r4
        L8d:
            java.lang.String r7 = "positionalThreshold"
            defpackage.sn0.V(r7)
            throw r4
        L93:
            tl1 r9 = new tl1
            r9.<init>()
            r9.e = r8
            n4 r3 = r7.M
            g4 r5 = new g4
            r5.<init>(r7, r9, r8, r4)
            r0.e = r9
            r0.h = r2
            java.lang.Object r7 = defpackage.n4.b(r3, r5, r0)
            if (r7 != r1) goto Lac
        Lab:
            return r1
        Lac:
            r7 = r9
        Lad:
            float r7 = r7.e
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h4.g1(h4, float, wt):java.lang.Object");
    }

    @Override // defpackage.d21
    public final void D0() {
        i1(this.P);
    }

    @Override // defpackage.m30
    public final Object S0(l30 l30Var, l30 l30Var2) {
        Object b = n4.b(this.M, new d4(l30Var, this, null), l30Var2);
        if (b == hv.e) {
            return b;
        }
        return od2.a;
    }

    @Override // defpackage.m30
    public final void Y0(y20 y20Var) {
        if (!this.r) {
            return;
        }
        rx.C(z0(), null, new j(this, y20Var, null, 2), 3);
    }

    @Override // defpackage.qz
    public final void c() {
        E();
        if (this.r) {
            c00 c00Var = hp.M(this).C;
            c00 c00Var2 = this.R;
            if (c00Var2 == null || !c00Var2.equals(c00Var)) {
                this.R = c00Var;
                i1(this.P);
            }
        }
    }

    @Override // defpackage.m30
    public final boolean d1() {
        if (this.M.l.getValue() != null) {
            return true;
        }
        return false;
    }

    public final boolean h1() {
        Boolean bool = this.O;
        if (bool == null) {
            if (hp.M(this).D == jq0.f && this.N == sb1.f) {
                return true;
            }
            return false;
        }
        bool.getClass();
        return bool.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [c02] */
    public final void i1(v11 v11Var) {
        if (v11Var == null) {
            dc2 dc2Var = t3.a;
            p1 p1Var = t3.b;
            c00 c00Var = hp.M(this).C;
            this.R = c00Var;
            n4 n4Var = this.M;
            v11Var = new c02(new ld(n4Var, p1Var, new v3(c00Var, 0), 1), mp0.b, dc2Var);
        }
        this.Q = v11Var;
    }

    @Override // defpackage.m30
    public final void X0(long j) {
    }
}
