package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class d4 extends q42 implements te0 {
    public final /* synthetic */ int f = 0;
    public int g;
    public /* synthetic */ Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(l30 l30Var, h4 h4Var, vt vtVar) {
        super(3, vtVar);
        this.i = l30Var;
        this.j = h4Var;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        od2 od2Var = od2.a;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                d4 d4Var = new d4((l30) this.i, (h4) obj4, (vt) obj3);
                d4Var.h = (m4) obj;
                return d4Var.invokeSuspend(od2Var);
            default:
                d4 d4Var2 = new d4((se0) obj4, (vt) obj3);
                d4Var2.h = (wa0) obj;
                d4Var2.i = obj2;
                return d4Var2.invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        if (r9 == r4) goto L16;
     */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f
            od2 r1 = defpackage.od2.a
            java.lang.Object r2 = r8.j
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            hv r4 = defpackage.hv.e
            r5 = 1
            r6 = 2
            r7 = 0
            switch(r0) {
                case 0: goto L4c;
                default: goto L10;
            }
        L10:
            int r0 = r8.g
            if (r0 == 0) goto L29
            if (r0 == r5) goto L21
            if (r0 != r6) goto L1c
            defpackage.io.K(r9)
            goto L4b
        L1c:
            defpackage.se.p(r3)
            r1 = r7
            goto L4b
        L21:
            java.lang.Object r0 = r8.h
            wa0 r0 = (defpackage.wa0) r0
            defpackage.io.K(r9)
            goto L40
        L29:
            defpackage.io.K(r9)
            java.lang.Object r9 = r8.h
            r0 = r9
            wa0 r0 = (defpackage.wa0) r0
            java.lang.Object r9 = r8.i
            se0 r2 = (defpackage.se0) r2
            r8.h = r0
            r8.g = r5
            java.lang.Object r9 = r2.invoke(r9, r8)
            if (r9 != r4) goto L40
            goto L4a
        L40:
            r8.h = r7
            r8.g = r6
            java.lang.Object r8 = r0.b(r9, r8)
            if (r8 != r4) goto L4b
        L4a:
            r1 = r4
        L4b:
            return r1
        L4c:
            int r0 = r8.g
            if (r0 == 0) goto L5b
            if (r0 != r5) goto L56
            defpackage.io.K(r9)
            goto L76
        L56:
            defpackage.se.p(r3)
            r1 = r7
            goto L76
        L5b:
            defpackage.io.K(r9)
            java.lang.Object r9 = r8.h
            m4 r9 = (defpackage.m4) r9
            java.lang.Object r0 = r8.i
            l30 r0 = (defpackage.l30) r0
            h4 r2 = (defpackage.h4) r2
            i r3 = new i
            r3.<init>(r6, r2, r9)
            r8.g = r5
            java.lang.Object r8 = r0.invoke(r3, r8)
            if (r8 != r4) goto L76
            r1 = r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(se0 se0Var, vt vtVar) {
        super(3, vtVar);
        this.j = se0Var;
    }
}
