package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yw extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ nx h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yw(nx nxVar, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = nxVar;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        nx nxVar = this.h;
        switch (i) {
            case 0:
                return new yw(nxVar, vtVar, 0);
            case 1:
                return new yw(nxVar, vtVar, 1);
            default:
                return new yw(nxVar, vtVar, 2);
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                return ((yw) create((wa0) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 1:
                return ((yw) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            default:
                return ((yw) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r10 == r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        if (defpackage.nx.d(r7, r9) == r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007f, code lost:
    
        if (r10 == r6) goto L41;
     */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f
            od2 r1 = defpackage.od2.a
            r2 = -1
            r3 = 2
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            hv r6 = defpackage.hv.e
            nx r7 = r9.h
            r8 = 1
            switch(r0) {
                case 0: goto L9b;
                case 1: goto L57;
                default: goto L11;
            }
        L11:
            rg2 r0 = r7.g
            int r1 = r9.g
            if (r1 == 0) goto L29
            if (r1 == r8) goto L23
            if (r1 != r3) goto L1f
            defpackage.io.K(r10)
            goto L4d
        L1f:
            defpackage.se.p(r5)
            goto L56
        L23:
            defpackage.io.K(r10)     // Catch: java.lang.Throwable -> L27
            goto L42
        L27:
            r9 = move-exception
            goto L51
        L29:
            defpackage.io.K(r10)
            n22 r10 = r0.k()
            boolean r10 = r10 instanceof defpackage.s90
            if (r10 == 0) goto L39
            n22 r4 = r0.k()
            goto L56
        L39:
            r9.g = r8     // Catch: java.lang.Throwable -> L27
            java.lang.Object r10 = defpackage.nx.d(r7, r9)     // Catch: java.lang.Throwable -> L27
            if (r10 != r6) goto L42
            goto L4b
        L42:
            r9.g = r3
            r10 = 0
            java.lang.Object r10 = defpackage.nx.e(r7, r10, r9)
            if (r10 != r6) goto L4d
        L4b:
            r4 = r6
            goto L56
        L4d:
            r4 = r10
            n22 r4 = (defpackage.n22) r4
            goto L56
        L51:
            vk1 r4 = new vk1
            r4.<init>(r9, r2)
        L56:
            return r4
        L57:
            int r0 = r9.g
            if (r0 == 0) goto L6c
            if (r0 == r8) goto L68
            if (r0 != r3) goto L63
            defpackage.io.K(r10)
            goto L9a
        L63:
            defpackage.se.p(r5)
            r1 = r4
            goto L9a
        L68:
            defpackage.io.K(r10)
            goto L82
        L6c:
            defpackage.io.K(r10)
            q4 r10 = r7.h
            r9.g = r8
            java.lang.Object r10 = r10.g
            ip r10 = (defpackage.ip) r10
            java.lang.Object r10 = r10.q(r9)
            if (r10 != r6) goto L7e
            goto L7f
        L7e:
            r10 = r1
        L7f:
            if (r10 != r6) goto L82
            goto L99
        L82:
            ay1 r10 = r7.g()
            zf r10 = r10.c
            va0 r10 = defpackage.qo.k(r10, r2)
            x7 r0 = new x7
            r0.<init>(r7, r8)
            r9.g = r3
            java.lang.Object r9 = r10.a(r0, r9)
            if (r9 != r6) goto L9a
        L99:
            r1 = r6
        L9a:
            return r1
        L9b:
            int r0 = r9.g
            if (r0 == 0) goto Laa
            if (r0 != r8) goto La5
            defpackage.io.K(r10)
            goto Lb6
        La5:
            defpackage.se.p(r5)
            r1 = r4
            goto Lb6
        Laa:
            defpackage.io.K(r10)
            r9.g = r8
            java.lang.Object r9 = defpackage.nx.c(r7, r9)
            if (r9 != r6) goto Lb6
            r1 = r6
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
