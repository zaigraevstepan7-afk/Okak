package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class c02 implements z90 {
    public final g02 a;
    public final tx b;
    public final gc c;
    public final f10 d = ms1.c;

    public c02(g02 g02Var, tx txVar, gc gcVar) {
        this.a = g02Var;
        this.b = txVar;
        this.c = gcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.c02 r4, defpackage.ds1 r5, float r6, float r7, defpackage.zz1 r8, defpackage.wt r9) {
        /*
            boolean r0 = r9 instanceof defpackage.b02
            if (r0 == 0) goto L14
            r0 = r9
            b02 r0 = (defpackage.b02) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.g = r1
        L12:
            r9 = r0
            goto L1a
        L14:
            b02 r0 = new b02
            r0.<init>(r4, r9)
            goto L12
        L1a:
            java.lang.Object r0 = r9.e
            int r1 = r9.g
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.io.K(r0)
            goto L85
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.io.K(r0)
            float r0 = java.lang.Math.abs(r6)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3b
            goto L43
        L3b:
            float r0 = java.lang.Math.abs(r7)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L4a
        L43:
            r4 = 28
            hc r4 = defpackage.c01.a(r6, r7, r4)
            return r4
        L4a:
            r9.g = r2
            tx r0 = r4.b
            float r1 = defpackage.lo.n(r0, r1, r7)
            float r1 = java.lang.Math.abs(r1)
            float r2 = java.lang.Math.abs(r6)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L67
            rg2 r4 = new rg2
            r1 = 10
            r4.<init>(r0, r1)
        L65:
            r0 = r6
            goto L71
        L67:
            ov1 r0 = new ov1
            gc r4 = r4.c
            r1 = 5
            r0.<init>(r4, r1)
            r4 = r0
            goto L65
        L71:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r0)
            r0 = r7
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r0)
            java.lang.Object r0 = r4.e(r5, r6, r7, r8, r9)
            hv r4 = defpackage.hv.e
            if (r0 != r4) goto L85
            return r4
        L85:
            dc r0 = (defpackage.dc) r0
            hc r4 = r0.b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c02.b(c02, ds1, float, float, zz1, wt):java.lang.Object");
    }

    @Override // defpackage.z90
    public Object a(ds1 ds1Var, float f, vt vtVar) {
        return d(ds1Var, f, c01.A, (wt) vtVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ds1 r10, float r11, defpackage.oe0 r12, defpackage.wt r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.yz1
            if (r0 == 0) goto L13
            r0 = r13
            yz1 r0 = (defpackage.yz1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            yz1 r0 = new yz1
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            oe0 r12 = r0.e
            defpackage.io.K(r13)
            goto L4b
        L27:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r9)
            r9 = 0
            return r9
        L2e:
            defpackage.io.K(r13)
            gy r3 = new gy
            r8 = 0
            r4 = r9
            r7 = r10
            r5 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r0.e = r6
            r0.h = r2
            f10 r9 = r4.d
            java.lang.Object r13 = defpackage.rx.S(r9, r3, r0)
            hv r9 = defpackage.hv.e
            if (r13 != r9) goto L4a
            return r9
        L4a:
            r12 = r6
        L4b:
            dc r13 = (defpackage.dc) r13
            java.lang.Float r9 = new java.lang.Float
            r10 = 0
            r9.<init>(r10)
            r12.invoke(r9)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c02.c(ds1, float, oe0, wt):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ds1 r5, float r6, defpackage.oe0 r7, defpackage.wt r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.a02
            if (r0 == 0) goto L13
            r0 = r8
            a02 r0 = (defpackage.a02) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            a02 r0 = new a02
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.e
            int r1 = r0.g
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.io.K(r8)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.io.K(r8)
            r0.g = r2
            java.lang.Object r8 = r4.c(r5, r6, r7, r0)
            hv r4 = defpackage.hv.e
            if (r8 != r4) goto L3a
            return r4
        L3a:
            dc r8 = (defpackage.dc) r8
            java.lang.Float r4 = r8.a
            float r4 = r4.floatValue()
            hc r5 = r8.b
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L4a
            goto L54
        L4a:
            java.lang.Object r4 = r5.a()
            java.lang.Number r4 = (java.lang.Number) r4
            float r6 = r4.floatValue()
        L54:
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c02.d(ds1, float, oe0, wt):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c02) {
            c02 c02Var = (c02) obj;
            if (sn0.r(c02Var.c, this.c) && sn0.r(c02Var.b, this.b) && c02Var.a.equals(this.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
