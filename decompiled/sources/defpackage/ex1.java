package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ex1 {
    public final boolean a;
    public final de0 b;
    public final oe0 c;
    public final n4 d;
    public u90 e;
    public u90 f;

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, u90] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, u90] */
    public ex1(boolean z, de0 de0Var, fx1 fx1Var, oe0 oe0Var) {
        this.a = z;
        this.b = de0Var;
        this.c = oe0Var;
        if (z && fx1Var == fx1.g) {
            se.h("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        dc2 dc2Var = bx1.a;
        this.d = new n4(fx1Var, oe0Var);
        this.e = new Object();
        this.f = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [tl1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.z90 r10, float r11, defpackage.wt r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.cx1
            if (r0 == 0) goto L13
            r0 = r12
            cx1 r0 = (defpackage.cx1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            cx1 r0 = new cx1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            tl1 r9 = r0.e
            defpackage.io.K(r12)
            goto L4f
        L27:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r9)
            r9 = 0
            return r9
        L2e:
            defpackage.io.K(r12)
            tl1 r4 = new tl1
            r4.<init>()
            dx1 r3 = new dx1
            r8 = 0
            r6 = r9
            r5 = r10
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.e = r4
            r0.h = r2
            n4 r9 = r6.d
            java.lang.Object r9 = defpackage.n4.b(r9, r3, r0)
            hv r10 = defpackage.hv.e
            if (r9 != r10) goto L4e
            return r10
        L4e:
            r9 = r4
        L4f:
            float r9 = r9.e
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex1.a(z90, float, wt):java.lang.Object");
    }

    public final Object b(fx1 fx1Var, u90 u90Var, q42 q42Var) {
        n4 n4Var = this.d;
        Object a = n4Var.a(fx1Var, t41.e, new x3(n4Var, u90Var, null), q42Var);
        od2 od2Var = od2.a;
        hv hvVar = hv.e;
        if (a != hvVar) {
            a = od2Var;
        }
        if (a == hvVar) {
            return a;
        }
        return od2Var;
    }

    public final fx1 c() {
        return (fx1) this.d.h.getValue();
    }

    public final Object d(q42 q42Var) {
        Object b;
        oe0 oe0Var = this.c;
        fx1 fx1Var = fx1.e;
        if (((Boolean) oe0Var.invoke(fx1Var)).booleanValue() && (b = b(fx1Var, this.f, q42Var)) == hv.e) {
            return b;
        }
        return od2.a;
    }

    public final boolean e() {
        if (this.d.g.getValue() != fx1.e) {
            return true;
        }
        return false;
    }

    public final Object f(q42 q42Var) {
        Object b;
        if (!this.a) {
            oe0 oe0Var = this.c;
            fx1 fx1Var = fx1.g;
            if (((Boolean) oe0Var.invoke(fx1Var)).booleanValue() && (b = b(fx1Var, this.f, q42Var)) == hv.e) {
                return b;
            }
            return od2.a;
        }
        se.p("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        return null;
    }

    public final Object g(q42 q42Var) {
        Object b;
        cy c = this.d.c();
        fx1 fx1Var = fx1.g;
        if (!c.c(fx1Var)) {
            fx1Var = fx1.f;
        }
        if (((Boolean) this.c.invoke(fx1Var)).booleanValue() && (b = b(fx1Var, this.e, q42Var)) == hv.e) {
            return b;
        }
        return od2.a;
    }
}
