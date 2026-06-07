package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pa0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final ya e;
    public hn0 f;
    public hn0 g;

    public pa0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = new ya(new f20(f), f2.C, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, od2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.hn0 r6, defpackage.wt r7) {
        /*
            r5 = this;
            ya r0 = r5.e
            boolean r1 = r7 instanceof defpackage.na0
            if (r1 == 0) goto L15
            r1 = r7
            na0 r1 = (defpackage.na0) r1
            int r2 = r1.h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.h = r2
            goto L1a
        L15:
            na0 r1 = new na0
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.f
            int r2 = r1.h
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            hn0 r6 = r1.e
            defpackage.io.K(r7)     // Catch: java.lang.Throwable -> L29
            goto L6d
        L29:
            r7 = move-exception
            goto L72
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r5)
            r5 = 0
            return r5
        L32:
            defpackage.io.K(r7)
            boolean r7 = r6 instanceof defpackage.si1
            if (r7 == 0) goto L3c
            float r7 = r5.b
            goto L4c
        L3c:
            boolean r7 = r6 instanceof defpackage.li0
            if (r7 == 0) goto L43
            float r7 = r5.c
            goto L4c
        L43:
            boolean r7 = r6 instanceof defpackage.cc0
            if (r7 == 0) goto L4a
            float r7 = r5.d
            goto L4c
        L4a:
            float r7 = r5.a
        L4c:
            r5.g = r6
            je1 r2 = r0.e     // Catch: java.lang.Throwable -> L29
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L29
            f20 r2 = (defpackage.f20) r2     // Catch: java.lang.Throwable -> L29
            float r2 = r2.e     // Catch: java.lang.Throwable -> L29
            boolean r2 = defpackage.f20.b(r2, r7)     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L6d
            hn0 r2 = r5.f     // Catch: java.lang.Throwable -> L29
            r1.e = r6     // Catch: java.lang.Throwable -> L29
            r1.h = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = defpackage.n50.a(r0, r7, r2, r6, r1)     // Catch: java.lang.Throwable -> L29
            hv r0 = defpackage.hv.e
            if (r7 != r0) goto L6d
            return r0
        L6d:
            r5.f = r6
            od2 r5 = defpackage.od2.a
            return r5
        L72:
            r5.f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa0.a(hn0, wt):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.wt r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.oa0
            if (r0 == 0) goto L13
            r0 = r5
            oa0 r0 = (defpackage.oa0) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            oa0 r0 = new oa0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.e
            int r1 = r0.g
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.io.K(r5)     // Catch: java.lang.Throwable -> L25
            goto L6c
        L25:
            r5 = move-exception
            goto L71
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.io.K(r5)
            hn0 r5 = r4.g
            boolean r1 = r5 instanceof defpackage.si1
            if (r1 == 0) goto L3a
            float r5 = r4.b
            goto L4a
        L3a:
            boolean r1 = r5 instanceof defpackage.li0
            if (r1 == 0) goto L41
            float r5 = r4.c
            goto L4a
        L41:
            boolean r5 = r5 instanceof defpackage.cc0
            if (r5 == 0) goto L48
            float r5 = r4.d
            goto L4a
        L48:
            float r5 = r4.a
        L4a:
            ya r1 = r4.e
            je1 r3 = r1.e
            java.lang.Object r3 = r3.getValue()
            f20 r3 = (defpackage.f20) r3
            float r3 = r3.e
            boolean r3 = defpackage.f20.b(r3, r5)
            if (r3 != 0) goto L76
            f20 r3 = new f20     // Catch: java.lang.Throwable -> L25
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L25
            r0.g = r2     // Catch: java.lang.Throwable -> L25
            java.lang.Object r5 = r1.f(r0, r3)     // Catch: java.lang.Throwable -> L25
            hv r0 = defpackage.hv.e
            if (r5 != r0) goto L6c
            return r0
        L6c:
            hn0 r5 = r4.g
            r4.f = r5
            goto L76
        L71:
            hn0 r0 = r4.g
            r4.f = r0
            throw r5
        L76:
            od2 r4 = defpackage.od2.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa0.b(wt):java.lang.Object");
    }
}
