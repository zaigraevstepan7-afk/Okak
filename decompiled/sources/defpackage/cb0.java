package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cb0 implements va0 {
    public final /* synthetic */ va0 e;
    public final /* synthetic */ te0 f;

    public cb0(va0 va0Var, te0 te0Var) {
        this.e = va0Var;
        this.f = te0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|7|(1:(1:(1:(5:12|13|14|15|16)(2:22|23))(2:24|25))(2:26|27))(2:38|39)|28|29|30|(3:32|15|16)|33))|46|6|7|(0)(0)|28|29|30|(0)|33|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0060, code lost:
    
        if (r10.a(r9, r0) == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004d, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:
    
        r10 = new defpackage.y92(r9);
        r9 = r9.f;
        r0.h = r9;
        r0.i = null;
        r0.f = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
    
        if (defpackage.hp.j(r10, r9, r9, r0) == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.va0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.wa0 r9, defpackage.vt r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.bb0
            if (r0 == 0) goto L13
            r0 = r10
            bb0 r0 = (defpackage.bb0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            bb0 r0 = new bb0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.e
            int r1 = r0.f
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            hv r6 = defpackage.hv.e
            if (r1 == 0) goto L51
            if (r1 == r4) goto L42
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L34
            java.lang.Object r8 = r0.h
            zp1 r8 = (defpackage.zp1) r8
            defpackage.io.K(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r9 = move-exception
            goto L84
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r8)
            return r5
        L3a:
            java.lang.Object r8 = r0.h
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            defpackage.io.K(r10)
            goto L9c
        L42:
            wa0 r9 = r0.i
            java.lang.Object r8 = r0.h
            cb0 r8 = (defpackage.cb0) r8
            defpackage.io.K(r10)     // Catch: java.lang.Throwable -> L4c
            goto L63
        L4c:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L88
        L51:
            defpackage.io.K(r10)
            va0 r10 = r8.e     // Catch: java.lang.Throwable -> L4c
            r0.h = r8     // Catch: java.lang.Throwable -> L4c
            r0.i = r9     // Catch: java.lang.Throwable -> L4c
            r0.f = r4     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r10 = r10.a(r9, r0)     // Catch: java.lang.Throwable -> L4c
            if (r10 != r6) goto L63
            goto L9b
        L63:
            zp1 r10 = new zp1
            xu r1 = r0.getContext()
            r10.<init>(r9, r1)
            te0 r8 = r8.f     // Catch: java.lang.Throwable -> L82
            r0.h = r10     // Catch: java.lang.Throwable -> L82
            r0.i = r5     // Catch: java.lang.Throwable -> L82
            r0.f = r2     // Catch: java.lang.Throwable -> L82
            java.lang.Object r8 = r8.invoke(r10, r5, r0)     // Catch: java.lang.Throwable -> L82
            if (r8 != r6) goto L7b
            goto L9b
        L7b:
            r8 = r10
        L7c:
            r8.releaseIntercepted()
            od2 r8 = defpackage.od2.a
            return r8
        L82:
            r9 = move-exception
            r8 = r10
        L84:
            r8.releaseIntercepted()
            throw r9
        L88:
            y92 r10 = new y92
            r10.<init>(r8)
            te0 r9 = r9.f
            r0.h = r8
            r0.i = r5
            r0.f = r3
            java.lang.Object r9 = defpackage.hp.j(r10, r9, r8, r0)
            if (r9 != r6) goto L9c
        L9b:
            return r6
        L9c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cb0.a(wa0, vt):java.lang.Object");
    }
}
