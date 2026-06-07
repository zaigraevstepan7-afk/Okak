package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class il extends fm {
    public final se0 h;
    public final se0 i;

    public il(se0 se0Var, xu xuVar, int i, jk jkVar) {
        super(xuVar, i, jkVar);
        this.h = se0Var;
        this.i = se0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.fm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.dj1 r6, defpackage.vt r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.hl
            if (r0 == 0) goto L13
            r0 = r7
            hl r0 = (defpackage.hl) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L1a
        L13:
            hl r0 = new hl
            wt r7 = (defpackage.wt) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.f
            int r1 = r0.h
            r2 = 0
            od2 r3 = defpackage.od2.a
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 != r4) goto L2c
            dj1 r6 = r0.e
            defpackage.io.K(r7)
            goto L48
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r5)
            return r2
        L32:
            defpackage.io.K(r7)
            r0.e = r6
            r0.h = r4
            se0 r5 = r5.h
            java.lang.Object r5 = r5.invoke(r6, r0)
            hv r7 = defpackage.hv.e
            if (r5 != r7) goto L44
            goto L45
        L44:
            r5 = r3
        L45:
            if (r5 != r7) goto L48
            return r7
        L48:
            lk r5 = r6.h
            boolean r5 = r5.u()
            if (r5 == 0) goto L51
            return r3
        L51:
            java.lang.String r5 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            defpackage.se.p(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il.d(dj1, vt):java.lang.Object");
    }

    @Override // defpackage.fm
    public final fm e(xu xuVar, int i, jk jkVar) {
        return new il(this.i, xuVar, i, jkVar);
    }

    @Override // defpackage.fm
    public final String toString() {
        return "block[" + this.h + "] -> " + super.toString();
    }
}
