package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ad1 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ uy h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ad1(uy uyVar, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = uyVar;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        uy uyVar = this.h;
        switch (i) {
            case 0:
                return new ad1(uyVar, vtVar, 0);
            case 1:
                return new ad1(uyVar, vtVar, 1);
            default:
                return new ad1(uyVar, vtVar, 2);
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        gv gvVar = (gv) obj;
        vt vtVar = (vt) obj2;
        switch (i) {
            case 0:
                return ((ad1) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((ad1) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((ad1) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        r7 = r1.f(r1.l() + 1, defpackage.mp0.M(0.0f, 0.0f, null, 7), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        r7 = r1.f(r1.l() - 1, defpackage.mp0.M(0.0f, 0.0f, null, 7), r7);
     */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f
            uy r1 = r7.h
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            hv r3 = defpackage.hv.e
            r4 = 1
            od2 r5 = defpackage.od2.a
            r6 = 0
            switch(r0) {
                case 0: goto L69;
                case 1: goto L37;
                default: goto Lf;
            }
        Lf:
            int r0 = r7.g
            if (r0 == 0) goto L1f
            if (r0 != r4) goto L1a
            defpackage.io.K(r8)
        L18:
            r3 = r5
            goto L36
        L1a:
            defpackage.se.p(r2)
            r3 = r6
            goto L36
        L1f:
            defpackage.io.K(r8)
            r7.g = r4
            ea r8 = new ea
            r0 = 2
            r8.<init>(r0, r6, r0)
            t41 r0 = defpackage.t41.e
            java.lang.Object r7 = defpackage.od1.u(r1, r0, r8, r7)
            if (r7 != r3) goto L33
            goto L34
        L33:
            r7 = r5
        L34:
            if (r7 != r3) goto L18
        L36:
            return r3
        L37:
            int r0 = r7.g
            if (r0 == 0) goto L47
            if (r0 != r4) goto L42
            defpackage.io.K(r8)
        L40:
            r3 = r5
            goto L68
        L42:
            defpackage.se.p(r2)
            r3 = r6
            goto L68
        L47:
            defpackage.io.K(r8)
            r7.g = r4
            pd1 r8 = defpackage.qd1.a
            int r8 = r1.l()
            int r8 = r8 + r4
            int r0 = r1.o()
            if (r8 >= r0) goto L65
            int r8 = r1.l()
            int r8 = r8 + r4
            java.lang.Object r7 = defpackage.od1.g(r1, r8, r7)
            if (r7 != r3) goto L65
            goto L66
        L65:
            r7 = r5
        L66:
            if (r7 != r3) goto L40
        L68:
            return r3
        L69:
            int r0 = r7.g
            if (r0 == 0) goto L79
            if (r0 != r4) goto L74
            defpackage.io.K(r8)
        L72:
            r3 = r5
            goto L96
        L74:
            defpackage.se.p(r2)
            r3 = r6
            goto L96
        L79:
            defpackage.io.K(r8)
            r7.g = r4
            pd1 r8 = defpackage.qd1.a
            int r8 = r1.l()
            int r8 = r8 - r4
            if (r8 < 0) goto L93
            int r8 = r1.l()
            int r8 = r8 - r4
            java.lang.Object r7 = defpackage.od1.g(r1, r8, r7)
            if (r7 != r3) goto L93
            goto L94
        L93:
            r7 = r5
        L94:
            if (r7 != r3) goto L72
        L96:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
