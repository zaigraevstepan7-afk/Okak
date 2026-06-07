package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zf implements va0 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ zf(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    @Override // defpackage.va0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.wa0 r10, defpackage.vt r11) {
        /*
            r9 = this;
            int r0 = r9.e
            r1 = 1
            od2 r2 = defpackage.od2.a
            java.lang.Object r3 = r9.f
            hv r4 = defpackage.hv.e
            switch(r0) {
                case 0: goto L78;
                case 1: goto L68;
                default: goto Lc;
            }
        Lc:
            boolean r0 = r11 instanceof defpackage.x
            if (r0 == 0) goto L1f
            r0 = r11
            x r0 = (defpackage.x) r0
            int r5 = r0.h
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1f
            int r5 = r5 - r6
            r0.h = r5
            goto L24
        L1f:
            x r0 = new x
            r0.<init>(r9, r11)
        L24:
            java.lang.Object r9 = r0.f
            int r11 = r0.h
            if (r11 == 0) goto L3b
            if (r11 != r1) goto L34
            zp1 r10 = r0.e
            defpackage.io.K(r9)     // Catch: java.lang.Throwable -> L32
            goto L5a
        L32:
            r9 = move-exception
            goto L64
        L34:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r9)
            r2 = 0
            goto L5d
        L3b:
            defpackage.io.K(r9)
            zp1 r9 = new zp1
            xu r11 = r0.getContext()
            r9.<init>(r10, r11)
            r0.e = r9     // Catch: java.lang.Throwable -> L62
            r0.h = r1     // Catch: java.lang.Throwable -> L62
            se0 r3 = (defpackage.se0) r3     // Catch: java.lang.Throwable -> L62
            java.lang.Object r10 = r3.invoke(r9, r0)     // Catch: java.lang.Throwable -> L62
            if (r10 != r4) goto L54
            goto L55
        L54:
            r10 = r2
        L55:
            if (r10 != r4) goto L59
            r2 = r4
            goto L5d
        L59:
            r10 = r9
        L5a:
            r10.releaseIntercepted()
        L5d:
            return r2
        L5e:
            r8 = r10
            r10 = r9
            r9 = r8
            goto L64
        L62:
            r10 = move-exception
            goto L5e
        L64:
            r10.releaseIntercepted()
            throw r9
        L68:
            eb0 r3 = (defpackage.eb0) r3
            qa r9 = new qa
            r0 = 2
            r9.<init>(r10, r0)
            java.lang.Object r9 = r3.a(r9, r11)
            if (r9 != r4) goto L77
            r2 = r9
        L77:
            return r2
        L78:
            r22 r3 = (defpackage.r22) r3
            qa r9 = new qa
            r9.<init>(r10, r1)
            r3.a(r9, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zf.a(wa0, vt):java.lang.Object");
    }
}
