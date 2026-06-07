package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ri0 extends d21 implements th1 {
    public r31 s;
    public li0 t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v3, types: [li0, java.lang.Object, hn0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L0(defpackage.ri0 r4, defpackage.wt r5) {
        /*
            boolean r0 = r5 instanceof defpackage.oi0
            if (r0 == 0) goto L13
            r0 = r5
            oi0 r0 = (defpackage.oi0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            oi0 r0 = new oi0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            li0 r0 = r0.e
            defpackage.io.K(r5)
            goto L4a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.io.K(r5)
            li0 r5 = r4.t
            if (r5 != 0) goto L4c
            li0 r5 = new li0
            r5.<init>()
            r31 r1 = r4.s
            r0.e = r5
            r0.h = r2
            java.lang.Object r0 = r1.a(r5, r0)
            hv r1 = defpackage.hv.e
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            r4.t = r0
        L4c:
            od2 r4 = defpackage.od2.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri0.L0(ri0, wt):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M0(defpackage.ri0 r4, defpackage.wt r5) {
        /*
            boolean r0 = r5 instanceof defpackage.pi0
            if (r0 == 0) goto L13
            r0 = r5
            pi0 r0 = (defpackage.pi0) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            pi0 r0 = new pi0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.e
            int r1 = r0.g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.io.K(r5)
            goto L45
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            return r2
        L2c:
            defpackage.io.K(r5)
            li0 r5 = r4.t
            if (r5 == 0) goto L47
            mi0 r1 = new mi0
            r1.<init>(r5)
            r31 r5 = r4.s
            r0.g = r3
            java.lang.Object r5 = r5.a(r1, r0)
            hv r0 = defpackage.hv.e
            if (r5 != r0) goto L45
            return r0
        L45:
            r4.t = r2
        L47:
            od2 r4 = defpackage.od2.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ri0.M0(ri0, wt):java.lang.Object");
    }

    @Override // defpackage.th1
    public final void E() {
        N0();
    }

    @Override // defpackage.d21
    public final void E0() {
        N0();
    }

    public final void N0() {
        li0 li0Var = this.t;
        if (li0Var != null) {
            this.s.b(new mi0(li0Var));
            this.t = null;
        }
    }

    @Override // defpackage.th1
    public final void u(jh1 jh1Var, kh1 kh1Var, long j) {
        if (kh1Var == kh1.f) {
            int i = jh1Var.f;
            vt vtVar = null;
            if (i == 4) {
                rx.C(z0(), null, new qi0(this, vtVar, 0), 3);
            } else if (i == 5) {
                rx.C(z0(), null, new qi0(this, vtVar, 1), 3);
            }
        }
    }
}
