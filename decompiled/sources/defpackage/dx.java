package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dx extends q42 implements oe0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dx(Object obj, vt vtVar, int i) {
        super(1, vtVar);
        this.f = i;
        this.h = obj;
    }

    @Override // defpackage.eh
    public final vt create(vt vtVar) {
        int i = this.f;
        Object obj = this.h;
        switch (i) {
            case 0:
                return new dx((kx) obj, vtVar, 0);
            case 1:
                return new dx((b82) obj, vtVar, 1);
            default:
                return new dx((ta2) obj, vtVar, 2);
        }
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        vt vtVar = (vt) obj;
        switch (i) {
            case 0:
                return ((dx) create(vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((dx) create(vtVar)).invokeSuspend(od2Var);
            default:
                return ((dx) create(vtVar)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (r14 == r4) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0065, code lost:
    
        if (r2.s(r14) == r4) goto L38;
     */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.f
            od2 r1 = defpackage.od2.a
            java.lang.Object r2 = r14.h
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            hv r4 = defpackage.hv.e
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto Lac;
                case 1: goto L44;
                default: goto Lf;
            }
        Lf:
            int r0 = r14.g
            if (r0 == 0) goto L1e
            if (r0 != r5) goto L19
            defpackage.io.K(r15)
            goto L43
        L19:
            defpackage.se.p(r3)
            r1 = r6
            goto L43
        L1e:
            defpackage.io.K(r15)
            ta2 r2 = (defpackage.ta2) r2
            r14.g = r5
            pl r15 = new pl
            vt r14 = defpackage.go.F(r14)
            r15.<init>(r5, r14)
            r15.r()
            p41 r14 = r2.b
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            je1 r14 = r14.c
            r14.setValue(r0)
            r2.c = r15
            java.lang.Object r14 = r15.q()
            if (r14 != r4) goto L43
            r1 = r4
        L43:
            return r1
        L44:
            b82 r2 = (defpackage.b82) r2
            int r0 = r14.g
            r7 = 2
            if (r0 == 0) goto L5c
            if (r0 == r5) goto L58
            if (r0 != r7) goto L53
            defpackage.io.K(r15)
            goto La9
        L53:
            defpackage.se.p(r3)
            r1 = r6
            goto Lab
        L58:
            defpackage.io.K(r15)
            goto L68
        L5c:
            defpackage.io.K(r15)
            r14.g = r5
            java.lang.Object r15 = r2.s(r14)
            if (r15 != r4) goto L68
            goto La7
        L68:
            xd1 r15 = defpackage.b82.a(r2)
            if (r15 == 0) goto La9
            java.lang.Object r0 = r15.e
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r15 = r15.f
            d92 r15 = (defpackage.d92) r15
            long r9 = r15.a
            wg1 r12 = r2.i
            if (r12 == 0) goto La9
            r14.g = r7
            int r15 = r13.length()
            if (r15 != 0) goto L86
            goto L8c
        L86:
            boolean r15 = defpackage.d92.c(r9)
            if (r15 == 0) goto L8e
        L8c:
            r14 = r1
            goto La1
        L8e:
            m r8 = new m
            r11 = 0
            r8.<init>(r9, r11, r12, r13)
            xu r15 = r12.a
            a8 r0 = new a8
            r3 = 8
            r0.<init>(r12, r8, r6, r3)
            java.lang.Object r14 = defpackage.rx.S(r15, r0, r14)
        La1:
            if (r14 != r4) goto La4
            goto La5
        La4:
            r14 = r1
        La5:
            if (r14 != r4) goto La9
        La7:
            r1 = r4
            goto Lab
        La9:
            r2.A = r5
        Lab:
            return r1
        Lac:
            int r0 = r14.g
            if (r0 == 0) goto Lbb
            if (r0 != r5) goto Lb6
            defpackage.io.K(r15)
            goto Lc9
        Lb6:
            defpackage.se.p(r3)
            r15 = r6
            goto Lc9
        Lbb:
            defpackage.io.K(r15)
            kx r2 = (defpackage.kx) r2
            r14.g = r5
            java.lang.Object r15 = r2.invoke(r14)
            if (r15 != r4) goto Lc9
            r15 = r4
        Lc9:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
