package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mx extends q42 implements se0 {
    public ul1 f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ ul1 i;
    public final /* synthetic */ nx j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx(ul1 ul1Var, nx nxVar, Object obj, boolean z, vt vtVar) {
        super(2, vtVar);
        this.i = ul1Var;
        this.j = nxVar;
        this.k = obj;
        this.l = z;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        mx mxVar = new mx(this.i, this.j, this.k, this.l, vtVar);
        mxVar.h = obj;
        return mxVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((mx) create((o91) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r6.b(r2, r8) == r7) goto L16;
     */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.g
            r1 = 0
            java.lang.Object r2 = r8.k
            nx r3 = r8.j
            ul1 r4 = r8.i
            r5 = 2
            r6 = 1
            hv r7 = defpackage.hv.e
            if (r0 == 0) goto L27
            if (r0 == r6) goto L1d
            if (r0 != r5) goto L17
            defpackage.io.K(r9)
            goto L63
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r8)
            return r1
        L1d:
            ul1 r0 = r8.f
            java.lang.Object r6 = r8.h
            o91 r6 = (defpackage.o91) r6
            defpackage.io.K(r9)
            goto L4e
        L27:
            defpackage.io.K(r9)
            java.lang.Object r9 = r8.h
            o91 r9 = (defpackage.o91) r9
            ay1 r0 = r3.g()
            r8.h = r9
            r8.f = r4
            r8.g = r6
            rg2 r0 = r0.b
            java.lang.Object r0 = r0.f
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.incrementAndGet()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r0)
            if (r6 != r7) goto L4a
            goto L62
        L4a:
            r0 = r6
            r6 = r9
            r9 = r0
            r0 = r4
        L4e:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r0.e = r9
            r8.h = r1
            r8.f = r1
            r8.g = r5
            java.lang.Object r9 = r6.b(r2, r8)
            if (r9 != r7) goto L63
        L62:
            return r7
        L63:
            boolean r8 = r8.l
            if (r8 == 0) goto L7b
            rg2 r8 = r3.g
            aw r9 = new aw
            if (r2 == 0) goto L72
            int r0 = r2.hashCode()
            goto L73
        L72:
            r0 = 0
        L73:
            int r1 = r4.e
            r9.<init>(r2, r0, r1)
            r8.C(r9)
        L7b:
            od2 r8 = defpackage.od2.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
