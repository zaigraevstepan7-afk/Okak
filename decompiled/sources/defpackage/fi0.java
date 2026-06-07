package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fi0 {
    public int a;
    public float b;
    public final Object c;

    public fi0(u82 u82Var) {
        this.c = u82Var;
        this.a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public float a(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.c
            u82 r0 = (defpackage.u82) r0
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L1d
            android.text.Layout r3 = r0.f
            int r3 = defpackage.lo.E(r3, r6, r7)
            android.text.Layout r4 = r0.f
            int r4 = r4.getLineStart(r3)
            int r3 = r0.f(r3)
            if (r6 == r4) goto L1f
            if (r6 != r3) goto L1d
            goto L1f
        L1d:
            r3 = r2
            goto L20
        L1f:
            r3 = r1
        L20:
            int r4 = r6 * 4
            if (r9 == 0) goto L28
            if (r3 == 0) goto L2d
            r1 = r2
            goto L2d
        L28:
            if (r3 == 0) goto L2c
            r1 = 2
            goto L2d
        L2c:
            r1 = 3
        L2d:
            int r4 = r4 + r1
            int r1 = r5.a
            if (r1 != r4) goto L35
            float r5 = r5.b
            return r5
        L35:
            if (r9 == 0) goto L3c
            float r6 = r0.h(r6, r7)
            goto L40
        L3c:
            float r6 = r0.i(r6, r7)
        L40:
            if (r8 == 0) goto L46
            r5.a = r4
            r5.b = r6
        L46:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi0.a(int, boolean, boolean, boolean):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(float r5, defpackage.wt r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.em1
            if (r0 == 0) goto L13
            r0 = r6
            em1 r0 = (defpackage.em1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            em1 r0 = new em1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.e
            int r1 = r0.g
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.io.K(r6)
            goto L43
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.io.K(r6)
            java.lang.Object r6 = r4.c
            gh r6 = (defpackage.gh) r6
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r5)
            r0.g = r2
            java.lang.Object r6 = r6.invoke(r1, r0)
            hv r5 = defpackage.hv.e
            if (r6 != r5) goto L43
            return r5
        L43:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.b
            float r6 = r6 + r5
            r4.b = r6
            od2 r4 = defpackage.od2.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi0.b(float, wt):java.lang.Object");
    }

    public fi0(int i, gh ghVar) {
        this.a = i;
        this.c = ghVar;
    }
}
