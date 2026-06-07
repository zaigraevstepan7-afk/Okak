package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class l22 extends q42 implements te0 {
    public int f;
    public /* synthetic */ wa0 g;
    public /* synthetic */ int h;
    public final /* synthetic */ m22 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l22(m22 m22Var, vt vtVar) {
        super(3, vtVar);
        this.i = m22Var;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        l22 l22Var = new l22(this.i, (vt) obj3);
        l22Var.g = (wa0) obj;
        l22Var.h = intValue;
        return l22Var.invokeSuspend(od2.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0081, code lost:
    
        if (r0.b(defpackage.uw1.g, r13) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (defpackage.fp.w(r1, r13) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r0.b(defpackage.uw1.f, r13) == r10) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        if (r14.b(defpackage.uw1.e, r13) == r10) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            m22 r0 = r13.i
            long r1 = r0.b
            int r3 = r13.f
            r4 = 0
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            hv r10 = defpackage.hv.e
            if (r3 == 0) goto L37
            if (r3 == r9) goto L33
            if (r3 == r8) goto L2d
            if (r3 == r7) goto L27
            if (r3 == r6) goto L21
            if (r3 != r5) goto L1b
            goto L33
        L1b:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r13)
            return r4
        L21:
            wa0 r0 = r13.g
            defpackage.io.K(r14)
            goto L77
        L27:
            wa0 r0 = r13.g
            defpackage.io.K(r14)
            goto L6c
        L2d:
            wa0 r0 = r13.g
            defpackage.io.K(r14)
            goto L59
        L33:
            defpackage.io.K(r14)
            goto L84
        L37:
            defpackage.io.K(r14)
            wa0 r14 = r13.g
            int r3 = r13.h
            if (r3 <= 0) goto L4b
            r13.f = r9
            uw1 r0 = defpackage.uw1.e
            java.lang.Object r13 = r14.b(r0, r13)
            if (r13 != r10) goto L84
            goto L83
        L4b:
            long r11 = r0.a
            r13.g = r14
            r13.f = r8
            java.lang.Object r0 = defpackage.fp.w(r11, r13)
            if (r0 != r10) goto L58
            goto L83
        L58:
            r0 = r14
        L59:
            r8 = 0
            int r14 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r14 <= 0) goto L77
            r13.g = r0
            r13.f = r7
            uw1 r14 = defpackage.uw1.f
            java.lang.Object r14 = r0.b(r14, r13)
            if (r14 != r10) goto L6c
            goto L83
        L6c:
            r13.g = r0
            r13.f = r6
            java.lang.Object r14 = defpackage.fp.w(r1, r13)
            if (r14 != r10) goto L77
            goto L83
        L77:
            r13.g = r4
            r13.f = r5
            uw1 r14 = defpackage.uw1.g
            java.lang.Object r13 = r0.b(r14, r13)
            if (r13 != r10) goto L84
        L83:
            return r10
        L84:
            od2 r13 = defpackage.od2.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l22.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
