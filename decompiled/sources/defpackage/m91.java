package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class m91 implements pn {
    public final n90 a;
    public final oe1 b;
    public final rg2 c;
    public final ay1 d;
    public final i91 e;
    public final rg2 f;
    public final b51 g;

    public m91(n90 n90Var, oe1 oe1Var, rg2 rg2Var, ay1 ay1Var, i91 i91Var) {
        n90Var.getClass();
        oe1Var.getClass();
        ay1Var.getClass();
        this.a = n90Var;
        this.b = oe1Var;
        this.c = rg2Var;
        this.d = ay1Var;
        this.e = i91Var;
        this.f = new rg2(3);
        this.g = new b51();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(7:36|37|38|40|41|42|(1:44)(1:45))(2:53|54))|14|15|16|(2:(1:19)|20)(1:22)))|57|6|7|(0)(0)|14|15|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:22:0x0077, B:31:0x0085, B:28:0x0088, B:27:0x0080), top: B:7:0x0020, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r7v0, types: [m91] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [ax] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ax r8, defpackage.wt r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.k91
            if (r0 == 0) goto L13
            r0 = r9
            k91 r0 = (defpackage.k91) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            k91 r0 = new k91
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.g
            int r1 = r0.i
            b51 r2 = r7.g
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2e
            boolean r7 = r0.e
            h91 r8 = r0.f
            defpackage.io.K(r9)     // Catch: java.lang.Throwable -> L2c
            goto L69
        L2c:
            r9 = move-exception
            goto L80
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r7)
            return r4
        L34:
            defpackage.io.K(r9)
            rg2 r9 = r7.f
            java.lang.Object r9 = r9.f
            java.util.concurrent.atomic.AtomicBoolean r9 = (java.util.concurrent.atomic.AtomicBoolean) r9
            boolean r9 = r9.get()
            if (r9 != 0) goto L90
            boolean r9 = r2.e()
            h91 r1 = new h91     // Catch: java.lang.Throwable -> L89
            n90 r5 = r7.a     // Catch: java.lang.Throwable -> L89
            oe1 r6 = r7.b     // Catch: java.lang.Throwable -> L89
            rg2 r7 = r7.c     // Catch: java.lang.Throwable -> L89
            r1.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L89
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L7b
            r0.f = r1     // Catch: java.lang.Throwable -> L7b
            r0.e = r9     // Catch: java.lang.Throwable -> L7b
            r0.i = r3     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r7 = r8.invoke(r1, r7, r0)     // Catch: java.lang.Throwable -> L7b
            hv r8 = defpackage.hv.e
            if (r7 != r8) goto L65
            return r8
        L65:
            r8 = r9
            r9 = r7
            r7 = r8
            r8 = r1
        L69:
            r8.close()     // Catch: java.lang.Throwable -> L6e
            r8 = r4
            goto L6f
        L6e:
            r8 = move-exception
        L6f:
            if (r8 != 0) goto L77
            if (r7 == 0) goto L76
            r2.f(r4)
        L76:
            return r9
        L77:
            throw r8     // Catch: java.lang.Throwable -> L78
        L78:
            r8 = move-exception
            r9 = r7
            goto L8a
        L7b:
            r7 = move-exception
            r8 = r9
            r9 = r7
            r7 = r8
            r8 = r1
        L80:
            r8.close()     // Catch: java.lang.Throwable -> L84
            goto L88
        L84:
            r8 = move-exception
            defpackage.qo.g(r9, r8)     // Catch: java.lang.Throwable -> L78
        L88:
            throw r9     // Catch: java.lang.Throwable -> L78
        L89:
            r8 = move-exception
        L8a:
            if (r9 == 0) goto L8f
            r2.f(r4)
        L8f:
            throw r8
        L90:
            java.lang.String r7 = "StorageConnection has already been disposed."
            defpackage.se.p(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m91.a(ax, wt):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x007c, code lost:
    
        if (r12.d(r1) == r9) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00af A[Catch: all -> 0x00b9, IOException -> 0x00bc, TRY_ENTER, TryCatch #9 {IOException -> 0x00bc, all -> 0x00b9, blocks: (B:18:0x00af, B:20:0x00b5, B:24:0x00c6, B:34:0x00d1, B:31:0x00d4, B:30:0x00cc), top: B:7:0x0028, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6 A[Catch: all -> 0x00b9, IOException -> 0x00bc, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x00bc, all -> 0x00b9, blocks: (B:18:0x00af, B:20:0x00b5, B:24:0x00c6, B:34:0x00d1, B:31:0x00d4, B:30:0x00cc), top: B:7:0x0028, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12, types: [b51] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, mx] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11, types: [oe1] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.mx r11, defpackage.wt r12) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m91.b(mx, wt):java.lang.Object");
    }

    @Override // defpackage.pn
    public final void close() {
        ((AtomicBoolean) this.f.f).set(true);
        this.e.invoke();
    }
}
