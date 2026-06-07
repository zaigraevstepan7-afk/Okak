package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hu1 extends q42 implements se0 {
    public final /* synthetic */ int f = 1;
    public int g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu1(long j, v42 v42Var, vt vtVar) {
        super(2, vtVar);
        this.h = j;
        this.i = v42Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.i;
        long j = this.h;
        switch (i) {
            case 0:
                return new hu1((ya) obj2, j, vtVar);
            default:
                return new hu1(j, (v42) obj2, vtVar);
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
                return ((hu1) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((hu1) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (defpackage.fp.w(8, r13) == r7) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (defpackage.fp.w(r8 - 8, r13) == r7) goto L16;
     */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.f
            od2 r6 = defpackage.od2.a
            java.lang.Object r1 = r13.i
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            hv r7 = defpackage.hv.e
            r5 = 1
            long r8 = r13.h
            switch(r0) {
                case 0: goto L55;
                default: goto L11;
            }
        L11:
            int r0 = r13.g
            r10 = 8
            r12 = 2
            if (r0 == 0) goto L29
            if (r0 == r5) goto L25
            if (r0 != r12) goto L20
            defpackage.io.K(r14)
            goto L41
        L20:
            defpackage.se.p(r3)
            r6 = r2
            goto L54
        L25:
            defpackage.io.K(r14)
            goto L37
        L29:
            defpackage.io.K(r14)
            long r2 = r8 - r10
            r13.g = r5
            java.lang.Object r0 = defpackage.fp.w(r2, r13)
            if (r0 != r7) goto L37
            goto L3f
        L37:
            r13.g = r12
            java.lang.Object r0 = defpackage.fp.w(r10, r13)
            if (r0 != r7) goto L41
        L3f:
            r6 = r7
            goto L54
        L41:
            v42 r1 = (defpackage.v42) r1
            pl r0 = r1.g
            if (r0 == 0) goto L54
            lh1 r1 = new lh1
            r1.<init>(r8)
            fo1 r2 = new fo1
            r2.<init>(r1)
            r0.resumeWith(r2)
        L54:
            return r6
        L55:
            int r0 = r13.g
            if (r0 == 0) goto L64
            if (r0 != r5) goto L5f
            defpackage.io.K(r14)
            goto L7e
        L5f:
            defpackage.se.p(r3)
            r6 = r2
            goto L7e
        L64:
            defpackage.io.K(r14)
            r0 = r1
            ya r0 = (defpackage.ya) r0
            z81 r1 = new z81
            r1.<init>(r8)
            f22 r2 = defpackage.ju1.d
            r13.g = r5
            r3 = 0
            r5 = 12
            r4 = r13
            java.lang.Object r0 = defpackage.ya.b(r0, r1, r2, r3, r4, r5)
            if (r0 != r7) goto L7e
            r6 = r7
        L7e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu1(ya yaVar, long j, vt vtVar) {
        super(2, vtVar);
        this.i = yaVar;
        this.h = j;
    }
}
