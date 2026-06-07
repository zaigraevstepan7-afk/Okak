package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ay1 {
    public final b51 a = new b51();
    public final rg2 b = new rg2(4);
    public final zf c = new zf(new ea(2, null, 5), 2);

    public ay1(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.b.f).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r8 != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [b51] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.oe0 r7, defpackage.wt r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.yx1
            if (r0 == 0) goto L13
            r0 = r8
            yx1 r0 = (defpackage.yx1) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            yx1 r0 = new yx1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.g
            int r1 = r0.i
            r2 = 2
            r3 = 1
            r4 = 0
            hv r5 = defpackage.hv.e
            if (r1 == 0) goto L41
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r6 = r0.e
            b51 r6 = (defpackage.b51) r6
            defpackage.io.K(r8)     // Catch: java.lang.Throwable -> L2f
            goto L60
        L2f:
            r7 = move-exception
            goto L64
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r6)
            return r4
        L37:
            b51 r6 = r0.f
            java.lang.Object r7 = r0.e
            oe0 r7 = (defpackage.oe0) r7
            defpackage.io.K(r8)
            goto L53
        L41:
            defpackage.io.K(r8)
            r0.e = r7
            b51 r6 = r6.a
            r0.f = r6
            r0.i = r3
            java.lang.Object r8 = r6.d(r0)
            if (r8 != r5) goto L53
            goto L5f
        L53:
            r0.e = r6     // Catch: java.lang.Throwable -> L2f
            r0.f = r4     // Catch: java.lang.Throwable -> L2f
            r0.i = r2     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r5) goto L60
        L5f:
            return r5
        L60:
            r6.f(r4)
            return r8
        L64:
            r6.f(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay1.b(oe0, wt):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.se0 r6, defpackage.wt r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.zx1
            if (r0 == 0) goto L13
            r0 = r7
            zx1 r0 = (defpackage.zx1) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            zx1 r0 = new zx1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.g
            int r1 = r0.i
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            boolean r5 = r0.f
            b51 r6 = r0.e
            defpackage.io.K(r7)     // Catch: java.lang.Throwable -> L2a
            goto L52
        L2a:
            r7 = move-exception
            goto L5d
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r5)
            return r3
        L32:
            defpackage.io.K(r7)
            b51 r5 = r5.a
            boolean r7 = r5.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L58
            r0.e = r5     // Catch: java.lang.Throwable -> L58
            r0.f = r7     // Catch: java.lang.Throwable -> L58
            r0.i = r2     // Catch: java.lang.Throwable -> L58
            java.lang.Object r6 = r6.invoke(r1, r0)     // Catch: java.lang.Throwable -> L58
            hv r0 = defpackage.hv.e
            if (r6 != r0) goto L4e
            return r0
        L4e:
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L52:
            if (r5 == 0) goto L57
            r6.f(r3)
        L57:
            return r7
        L58:
            r6 = move-exception
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L5d:
            if (r5 == 0) goto L62
            r6.f(r3)
        L62:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ay1.c(se0, wt):java.lang.Object");
    }
}
