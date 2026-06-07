package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sz1 {
    public final b51 a = new b51();
    public final je1 b = fr1.k(null);

    public static Object b(sz1 sz1Var, String str, String str2, wt wtVar, int i) {
        lz1 lz1Var;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if (str2 == null) {
            lz1Var = lz1.e;
        } else {
            lz1Var = lz1.f;
        }
        sz1Var.getClass();
        return sz1Var.a(new qz1(str, str2, lz1Var), wtVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r9 != r6) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r9 == r6) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r7v4, types: [b51] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.qz1 r8, defpackage.wt r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.rz1
            if (r0 == 0) goto L13
            r0 = r9
            rz1 r0 = (defpackage.rz1) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            rz1 r0 = new rz1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.g
            int r1 = r0.i
            je1 r2 = r7.b
            r3 = 2
            r4 = 1
            r5 = 0
            hv r6 = defpackage.hv.e
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            b51 r7 = r0.f
            defpackage.io.K(r9)     // Catch: java.lang.Throwable -> L2f
            goto L72
        L2f:
            r8 = move-exception
            goto L7b
        L31:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r7)
            return r5
        L37:
            b51 r7 = r0.f
            qz1 r8 = r0.e
            defpackage.io.K(r9)
            goto L51
        L3f:
            defpackage.io.K(r9)
            r0.e = r8
            b51 r7 = r7.a
            r0.f = r7
            r0.i = r4
            java.lang.Object r9 = r7.d(r0)
            if (r9 != r6) goto L51
            goto L71
        L51:
            r0.e = r8     // Catch: java.lang.Throwable -> L2f
            r0.f = r7     // Catch: java.lang.Throwable -> L2f
            r0.i = r3     // Catch: java.lang.Throwable -> L2f
            pl r9 = new pl     // Catch: java.lang.Throwable -> L2f
            vt r0 = defpackage.go.F(r0)     // Catch: java.lang.Throwable -> L2f
            r9.<init>(r4, r0)     // Catch: java.lang.Throwable -> L2f
            r9.r()     // Catch: java.lang.Throwable -> L2f
            pz1 r0 = new pz1     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r8, r9)     // Catch: java.lang.Throwable -> L2f
            r2.setValue(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r9 = r9.q()     // Catch: java.lang.Throwable -> L2f
            if (r9 != r6) goto L72
        L71:
            return r6
        L72:
            r2.setValue(r5)     // Catch: java.lang.Throwable -> L79
            r7.f(r5)
            return r9
        L79:
            r8 = move-exception
            goto L7f
        L7b:
            r2.setValue(r5)     // Catch: java.lang.Throwable -> L79
            throw r8     // Catch: java.lang.Throwable -> L79
        L7f:
            r7.f(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz1.a(qz1, wt):java.lang.Object");
    }
}
