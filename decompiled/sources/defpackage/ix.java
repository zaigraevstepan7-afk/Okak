package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ix extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public /* synthetic */ boolean h;
    public final /* synthetic */ nx i;
    public final /* synthetic */ int j;
    public Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ix(nx nxVar, int i, vt vtVar, int i2) {
        super(2, vtVar);
        this.f = i2;
        this.i = nxVar;
        this.j = i;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        int i2 = this.j;
        nx nxVar = this.i;
        switch (i) {
            case 0:
                ix ixVar = new ix(nxVar, i2, vtVar, 0);
                ixVar.h = ((Boolean) obj).booleanValue();
                return ixVar;
            default:
                ix ixVar2 = new ix(nxVar, i2, vtVar, 1);
                ixVar2.h = ((Boolean) obj).booleanValue();
                return ixVar2;
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        vt vtVar = (vt) obj2;
        switch (i) {
            case 0:
                return ((ix) create(bool, vtVar)).invokeSuspend(od2Var);
            default:
                return ((ix) create(bool, vtVar)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
    
        if (r10 == r4) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f
            int r1 = r9.j
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            hv r4 = defpackage.hv.e
            r5 = 1
            r6 = 2
            nx r7 = r9.i
            switch(r0) {
                case 0: goto L62;
                default: goto L10;
            }
        L10:
            int r0 = r9.g
            if (r0 == 0) goto L28
            if (r0 == r5) goto L22
            if (r0 != r6) goto L1e
            java.lang.Object r9 = r9.k
            defpackage.io.K(r10)
            goto L4d
        L1e:
            defpackage.se.p(r3)
            goto L61
        L22:
            boolean r0 = r9.h
            defpackage.io.K(r10)
            goto L38
        L28:
            defpackage.io.K(r10)
            boolean r0 = r9.h
            r9.h = r0
            r9.g = r5
            java.lang.Object r10 = r7.h(r9)
            if (r10 != r4) goto L38
            goto L48
        L38:
            if (r0 == 0) goto L54
            ay1 r0 = r7.g()
            r9.k = r10
            r9.g = r6
            java.lang.Integer r9 = r0.a()
            if (r9 != r4) goto L4a
        L48:
            r2 = r4
            goto L61
        L4a:
            r8 = r10
            r10 = r9
            r9 = r8
        L4d:
            java.lang.Number r10 = (java.lang.Number) r10
            int r1 = r10.intValue()
            r10 = r9
        L54:
            aw r2 = new aw
            if (r10 == 0) goto L5d
            int r9 = r10.hashCode()
            goto L5e
        L5d:
            r9 = 0
        L5e:
            r2.<init>(r10, r9, r1)
        L61:
            return r2
        L62:
            int r0 = r9.g
            if (r0 == 0) goto L80
            if (r0 == r5) goto L78
            if (r0 != r6) goto L74
            boolean r0 = r9.h
            java.lang.Object r9 = r9.k
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            defpackage.io.K(r10)
            goto Laa
        L74:
            defpackage.se.p(r3)
            goto Lc0
        L78:
            boolean r0 = r9.h
            defpackage.io.K(r10)     // Catch: java.lang.Throwable -> L7e
            goto L90
        L7e:
            r10 = move-exception
            goto L93
        L80:
            defpackage.io.K(r10)
            boolean r0 = r9.h
            r9.h = r0     // Catch: java.lang.Throwable -> L7e
            r9.g = r5     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r10 = defpackage.nx.f(r7, r0, r9)     // Catch: java.lang.Throwable -> L7e
            if (r10 != r4) goto L90
            goto La5
        L90:
            n22 r10 = (defpackage.n22) r10     // Catch: java.lang.Throwable -> L7e
            goto Lb7
        L93:
            if (r0 == 0) goto Lb1
            ay1 r1 = r7.g()
            r9.k = r10
            r9.h = r0
            r9.g = r6
            java.lang.Integer r9 = r1.a()
            if (r9 != r4) goto La7
        La5:
            r2 = r4
            goto Lc0
        La7:
            r8 = r10
            r10 = r9
            r9 = r8
        Laa:
            java.lang.Number r10 = (java.lang.Number) r10
            int r1 = r10.intValue()
            r10 = r9
        Lb1:
            vk1 r9 = new vk1
            r9.<init>(r10, r1)
            r10 = r9
        Lb7:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            xd1 r2 = new xd1
            r2.<init>(r10, r9)
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ix.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
