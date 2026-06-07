package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class de extends q42 implements se0 {
    public final /* synthetic */ int f = 2;
    public int g;
    public final /* synthetic */ int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(ah2 ah2Var, String str, int i, int i2, vt vtVar) {
        super(2, vtVar);
        this.i = ah2Var;
        this.j = str;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        int i2 = this.h;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                return new de((l40) this.i, (uy) obj2, i2, vtVar);
            case 1:
                de deVar = new de((st0) obj2, i2, vtVar);
                deVar.i = obj;
                return deVar;
            default:
                return new de((ah2) this.i, (String) obj2, this.g, this.h, vtVar);
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                return ((de) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 1:
                return ((de) create((ds1) obj, (vt) obj2)).invokeSuspend(od2Var);
            default:
                return ((de) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        if (r10.b(r9) == r3) goto L31;
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
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            hv r3 = defpackage.hv.e
            r4 = 1
            r5 = 0
            int r6 = r9.h
            java.lang.Object r7 = r9.j
            switch(r0) {
                case 0: goto L68;
                case 1: goto L34;
                default: goto L11;
            }
        L11:
            java.lang.String r7 = (java.lang.String) r7
            defpackage.io.K(r10)
            java.lang.Object r10 = r9.i     // Catch: java.lang.Throwable -> L21
            ah2 r10 = (defpackage.ah2) r10     // Catch: java.lang.Throwable -> L21
            int r9 = r9.g     // Catch: java.lang.Throwable -> L21
            android.graphics.Bitmap r5 = defpackage.ah2.a(r10, r7, r9, r6)     // Catch: java.lang.Throwable -> L21
            goto L33
        L21:
            r9 = move-exception
            java.lang.String r10 = "render failed for "
            java.lang.String r10 = defpackage.l90.l(r10, r7)
            java.lang.String r0 = "ElixirLoader/"
            java.lang.String r1 = "VrmRenderer"
            java.lang.String r0 = r0.concat(r1)
            android.util.Log.w(r0, r10, r9)
        L33:
            return r5
        L34:
            int r0 = r9.g
            if (r0 == 0) goto L43
            if (r0 != r4) goto L3e
            defpackage.io.K(r10)
            goto L67
        L3e:
            defpackage.se.p(r2)
            r1 = r5
            goto L67
        L43:
            defpackage.io.K(r10)
            java.lang.Object r10 = r9.i
            ds1 r10 = (defpackage.ds1) r10
            st0 r7 = (defpackage.st0) r7
            ot0 r0 = new ot0
            r2 = 0
            r0.<init>(r10, r7, r2)
            je1 r10 = r7.f
            java.lang.Object r10 = r10.getValue()
            mt0 r10 = (defpackage.mt0) r10
            c00 r10 = r10.i
            r9.g = r4
            r2 = 100
            java.lang.Object r9 = defpackage.lo.h(r0, r6, r2, r10, r9)
            if (r9 != r3) goto L67
            r1 = r3
        L67:
            return r1
        L68:
            int r0 = r9.g
            r8 = 2
            if (r0 == 0) goto L7e
            if (r0 == r4) goto L7a
            if (r0 != r8) goto L75
            defpackage.io.K(r10)
            goto L99
        L75:
            defpackage.se.p(r2)
            r1 = r5
            goto L99
        L7a:
            defpackage.io.K(r10)
            goto L8e
        L7e:
            defpackage.io.K(r10)
            java.lang.Object r10 = r9.i
            l40 r10 = (defpackage.l40) r10
            r9.g = r4
            java.lang.Object r10 = r10.b(r9)
            if (r10 != r3) goto L8e
            goto L98
        L8e:
            uy r7 = (defpackage.uy) r7
            r9.g = r8
            java.lang.Object r9 = defpackage.od1.g(r7, r6, r9)
            if (r9 != r3) goto L99
        L98:
            r1 = r3
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(st0 st0Var, int i, vt vtVar) {
        super(2, vtVar);
        this.j = st0Var;
        this.h = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(l40 l40Var, uy uyVar, int i, vt vtVar) {
        super(2, vtVar);
        this.i = l40Var;
        this.j = uyVar;
        this.h = i;
    }
}
