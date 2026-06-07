package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class l4 extends q42 implements oe0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ af0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4(Object obj, Object obj2, af0 af0Var, vt vtVar, int i) {
        super(1, vtVar);
        this.f = i;
        this.h = obj;
        this.i = obj2;
        this.j = af0Var;
    }

    @Override // defpackage.eh
    public final vt create(vt vtVar) {
        int i = this.f;
        af0 af0Var = this.j;
        Object obj = this.h;
        switch (i) {
            case 0:
                return new l4((n4) obj, this.i, (ue0) af0Var, vtVar, 0);
            default:
                return new l4((ta2) obj, (t41) this.i, (dx) af0Var, vtVar, 1);
        }
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        vt vtVar = (vt) obj;
        switch (i) {
            case 0:
                return ((l4) create(vtVar)).invokeSuspend(od2Var);
            default:
                return ((l4) create(vtVar)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (defpackage.xp1.o(new defpackage.ga2(1500, r11), r12) == r3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f
            od2 r1 = defpackage.od2.a
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            hv r3 = defpackage.hv.e
            java.lang.Object r4 = r11.h
            java.lang.Object r5 = r11.i
            r6 = 1
            af0 r7 = r11.j
            r8 = 0
            switch(r0) {
                case 0: goto L63;
                default: goto L13;
            }
        L13:
            dx r7 = (defpackage.dx) r7
            t41 r5 = (defpackage.t41) r5
            ta2 r4 = (defpackage.ta2) r4
            int r0 = r11.g
            t41 r9 = defpackage.t41.g
            r10 = 2
            if (r0 == 0) goto L2f
            if (r0 == r6) goto L24
            if (r0 != r10) goto L2a
        L24:
            defpackage.io.K(r12)     // Catch: java.lang.Throwable -> L28
            goto L57
        L28:
            r11 = move-exception
            goto L5d
        L2a:
            defpackage.se.p(r2)
            r1 = r8
            goto L5c
        L2f:
            defpackage.io.K(r12)
            t41 r12 = defpackage.t41.f     // Catch: java.lang.Throwable -> L28
            if (r5 != r12) goto L3f
            r11.g = r6     // Catch: java.lang.Throwable -> L28
            java.lang.Object r11 = r7.invoke(r11)     // Catch: java.lang.Throwable -> L28
            if (r11 != r3) goto L57
            goto L55
        L3f:
            vf r12 = new vf     // Catch: java.lang.Throwable -> L28
            r0 = 17
            r12.<init>(r7, r8, r0)     // Catch: java.lang.Throwable -> L28
            r11.g = r10     // Catch: java.lang.Throwable -> L28
            ga2 r0 = new ga2     // Catch: java.lang.Throwable -> L28
            r6 = 1500(0x5dc, double:7.41E-321)
            r0.<init>(r6, r11)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r11 = defpackage.xp1.o(r0, r12)     // Catch: java.lang.Throwable -> L28
            if (r11 != r3) goto L57
        L55:
            r1 = r3
            goto L5c
        L57:
            if (r5 == r9) goto L5c
            r4.a()
        L5c:
            return r1
        L5d:
            if (r5 == r9) goto L62
            r4.a()
        L62:
            throw r11
        L63:
            n4 r4 = (defpackage.n4) r4
            int r0 = r11.g
            if (r0 == 0) goto L74
            if (r0 != r6) goto L6f
            defpackage.io.K(r12)
            goto L94
        L6f:
            defpackage.se.p(r2)
            r1 = r8
            goto Lbd
        L74:
            defpackage.io.K(r12)
            je1 r12 = r4.l
            r12.setValue(r5)
            i4 r12 = new i4
            r0 = 3
            r12.<init>(r4, r0)
            l r0 = new l
            ue0 r7 = (defpackage.ue0) r7
            r2 = 4
            r0.<init>(r7, r4, r8, r2)
            r11.g = r6
            java.lang.Object r11 = defpackage.mp0.g(r12, r0, r11)
            if (r11 != r3) goto L94
            r1 = r3
            goto Lbd
        L94:
            oe0 r11 = r4.a
            java.lang.Object r11 = r11.invoke(r5)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lbd
            cy r11 = r4.c()
            float r11 = r11.f(r5)
            m4 r12 = r4.n
            fe1 r0 = r4.k
            float r0 = r0.g()
            r12.a(r11, r0)
            je1 r11 = r4.h
            r11.setValue(r5)
            r4.g(r5)
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
