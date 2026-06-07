package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ro1 extends eo1 implements se0 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ oe0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ro1(oe0 oe0Var, vt vtVar, int i) {
        super(2, vtVar);
        this.e = i;
        this.h = oe0Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        switch (this.e) {
            case 0:
                ro1 ro1Var = new ro1(this.h, vtVar, 0);
                ro1Var.g = obj;
                return ro1Var;
            default:
                ro1 ro1Var2 = new ro1(this.h, vtVar, 1);
                ro1Var2.g = obj;
                return ro1Var2;
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        od2 od2Var = od2.a;
        v42 v42Var = (v42) obj;
        vt vtVar = (vt) obj2;
        switch (i) {
            case 0:
                return ((ro1) create(v42Var, vtVar)).invokeSuspend(od2Var);
            default:
                ((ro1) create(v42Var, vtVar)).invokeSuspend(od2Var);
                return hv.e;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0032 -> B:7:0x0035). Please report as a decompilation issue!!! */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.e
            oe0 r1 = r9.h
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            hv r3 = defpackage.hv.e
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto L44;
                default: goto Ld;
            }
        Ld:
            int r0 = r9.f
            if (r0 == 0) goto L20
            if (r0 != r4) goto L1b
            java.lang.Object r0 = r9.g
            v42 r0 = (defpackage.v42) r0
            defpackage.io.K(r10)
            goto L35
        L1b:
            defpackage.se.p(r2)
            r3 = r5
            goto L34
        L20:
            defpackage.io.K(r10)
            java.lang.Object r10 = r9.g
            v42 r10 = (defpackage.v42) r10
            r0 = r10
        L28:
            r9.g = r0
            r9.f = r4
            kh1 r10 = defpackage.kh1.e
            java.lang.Object r10 = r0.b(r10, r9)
            if (r10 != r3) goto L35
        L34:
            return r3
        L35:
            jh1 r10 = (defpackage.jh1) r10
            boolean r10 = defpackage.fr1.j(r10)
            r10 = r10 ^ r4
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r1.invoke(r10)
            goto L28
        L44:
            int r0 = r9.f
            r6 = 2
            if (r0 == 0) goto L5e
            if (r0 == r4) goto L56
            if (r0 != r6) goto L51
            defpackage.io.K(r10)
            goto L8d
        L51:
            defpackage.se.p(r2)
            r3 = r5
            goto L96
        L56:
            java.lang.Object r0 = r9.g
            v42 r0 = (defpackage.v42) r0
            defpackage.io.K(r10)
            goto L71
        L5e:
            defpackage.io.K(r10)
            java.lang.Object r10 = r9.g
            r0 = r10
            v42 r0 = (defpackage.v42) r0
            r9.g = r0
            r9.f = r4
            java.lang.Object r10 = defpackage.qo.c(r0, r9)
            if (r10 != r3) goto L71
            goto L96
        L71:
            qh1 r10 = (defpackage.qh1) r10
            r10.a()
            long r7 = r10.c
            z81 r10 = new z81
            r10.<init>(r7)
            r1.invoke(r10)
            r9.g = r5
            r9.f = r6
            kh1 r10 = defpackage.kh1.f
            java.lang.Object r10 = defpackage.w52.f(r0, r10, r9)
            if (r10 != r3) goto L8d
            goto L96
        L8d:
            qh1 r10 = (defpackage.qh1) r10
            if (r10 == 0) goto L94
            r10.a()
        L94:
            od2 r3 = defpackage.od2.a
        L96:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
