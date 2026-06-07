package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class c22 extends kg2 {
    public final rw b;
    public final gx1 c;
    public final pw0 d;
    public final cd e;
    public final boolean f;
    public final r22 g;
    public final yk1 h;

    public c22(rw rwVar, gx1 gx1Var, pw0 pw0Var, cd cdVar, boolean z) {
        rwVar.getClass();
        gx1Var.getClass();
        pw0Var.getClass();
        cdVar.getClass();
        this.b = rwVar;
        this.c = gx1Var;
        this.d = pw0Var;
        this.e = cdVar;
        this.f = z;
        r22 j = d6.j(u12.a);
        this.g = j;
        this.h = new yk1(j);
        rx.C(rx.x(this), null, new a22(this, null, 0), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(3:11|12|(2:14|15)(3:17|18|19))(2:20|21))(1:22))(3:34|35|(2:37|31))|23|(2:25|(2:27|28)(1:29))(2:32|33)))|40|6|7|(0)(0)|23|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        if (r10 == r7) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        android.util.Log.w("ElixirLoader/".concat("Splash"), "tryUpdateLoader failed", r9);
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053 A[Catch: Exception -> 0x00a4, TryCatch #0 {Exception -> 0x00a4, blocks: (B:11:0x002b, B:12:0x0088, B:14:0x008e, B:17:0x0091, B:22:0x0039, B:23:0x004d, B:25:0x0053, B:27:0x0069, B:29:0x006c, B:32:0x00a1, B:35:0x0044), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1 A[Catch: Exception -> 0x00a4, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a4, blocks: (B:11:0x002b, B:12:0x0088, B:14:0x008e, B:17:0x0091, B:22:0x0039, B:23:0x004d, B:25:0x0053, B:27:0x0069, B:29:0x006c, B:32:0x00a1, B:35:0x0044), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.c22 r9, defpackage.wt r10) {
        /*
            r22 r0 = r9.g
            pw0 r1 = r9.d
            boolean r2 = r10 instanceof defpackage.b22
            if (r2 == 0) goto L17
            r2 = r10
            b22 r2 = (defpackage.b22) r2
            int r3 = r2.g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.g = r3
            goto L1c
        L17:
            b22 r2 = new b22
            r2.<init>(r9, r10)
        L1c:
            java.lang.Object r10 = r2.e
            int r3 = r2.g
            r4 = 2
            r5 = 1
            r6 = 0
            hv r7 = defpackage.hv.e
            if (r3 == 0) goto L41
            if (r3 == r5) goto L39
            if (r3 != r4) goto L33
            defpackage.io.K(r10)     // Catch: java.lang.Exception -> La4
            go1 r10 = (defpackage.go1) r10     // Catch: java.lang.Exception -> La4
            java.lang.Object r10 = r10.e     // Catch: java.lang.Exception -> La4
            goto L88
        L33:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r9)
            return r6
        L39:
            defpackage.io.K(r10)     // Catch: java.lang.Exception -> La4
            go1 r10 = (defpackage.go1) r10     // Catch: java.lang.Exception -> La4
            java.lang.Object r10 = r10.e     // Catch: java.lang.Exception -> La4
            goto L4d
        L41:
            defpackage.io.K(r10)
            r2.g = r5     // Catch: java.lang.Exception -> La4
            java.io.Serializable r10 = r1.b(r2)     // Catch: java.lang.Exception -> La4
            if (r10 != r7) goto L4d
            goto L87
        L4d:
            java.lang.Throwable r3 = defpackage.go1.a(r10)     // Catch: java.lang.Exception -> La4
            if (r3 != 0) goto La1
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> La4
            r1.getClass()     // Catch: java.lang.Exception -> La4
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> La4
            java.lang.String r8 = r1.c     // Catch: java.lang.Exception -> La4
            r3.<init>(r8)     // Catch: java.lang.Exception -> La4
            java.lang.String r3 = defpackage.hp.P(r3)     // Catch: java.lang.Exception -> La4
            boolean r10 = defpackage.sn0.r(r10, r3)     // Catch: java.lang.Exception -> La4
            if (r10 == 0) goto L6c
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> La4
            return r9
        L6c:
            y12 r10 = new y12     // Catch: java.lang.Exception -> La4
            r3 = 0
            r10.<init>(r3)     // Catch: java.lang.Exception -> La4
            r0.getClass()     // Catch: java.lang.Exception -> La4
            r0.k(r6, r10)     // Catch: java.lang.Exception -> La4
            hh1 r10 = new hh1     // Catch: java.lang.Exception -> La4
            r3 = 15
            r10.<init>(r9, r3)     // Catch: java.lang.Exception -> La4
            r2.g = r4     // Catch: java.lang.Exception -> La4
            java.lang.Object r10 = r1.a(r10, r2)     // Catch: java.lang.Exception -> La4
            if (r10 != r7) goto L88
        L87:
            return r7
        L88:
            java.lang.Throwable r10 = defpackage.go1.a(r10)     // Catch: java.lang.Exception -> La4
            if (r10 == 0) goto L91
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> La4
            return r9
        L91:
            x12 r10 = defpackage.x12.a     // Catch: java.lang.Exception -> La4
            r0.getClass()     // Catch: java.lang.Exception -> La4
            r0.k(r6, r10)     // Catch: java.lang.Exception -> La4
            cd r9 = r9.e     // Catch: java.lang.Exception -> La4
            java.io.File r10 = r1.d     // Catch: java.lang.Exception -> La4
            r9.a(r10)     // Catch: java.lang.Exception -> La4
            goto Lb3
        La1:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> La4
            return r9
        La4:
            r9 = move-exception
            java.lang.String r10 = "ElixirLoader/"
            java.lang.String r0 = "Splash"
            java.lang.String r10 = r10.concat(r0)
            java.lang.String r0 = "tryUpdateLoader failed"
            android.util.Log.w(r10, r0, r9)
            r5 = 0
        Lb3:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c22.e(c22, wt):java.lang.Object");
    }
}
