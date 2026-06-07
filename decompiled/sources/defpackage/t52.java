package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class t52 extends eo1 implements se0 {
    public i22 e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ gv h;
    public final /* synthetic */ te0 i;
    public final /* synthetic */ oe0 j;
    public final /* synthetic */ qi1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t52(gv gvVar, te0 te0Var, oe0 oe0Var, qi1 qi1Var, vt vtVar) {
        super(2, vtVar);
        this.h = gvVar;
        this.i = te0Var;
        this.j = oe0Var;
        this.k = qi1Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        t52 t52Var = new t52(this.h, this.i, this.j, this.k, vtVar);
        t52Var.g = obj;
        return t52Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((t52) create((v42) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r14 == r11) goto L20;
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
            r1 = 0
            gv r2 = r13.h
            r3 = 2
            r4 = 1
            qi1 r7 = r13.k
            r9 = 0
            hv r11 = defpackage.hv.e
            if (r0 == 0) goto L2c
            if (r0 == r4) goto L21
            if (r0 != r3) goto L1a
            java.lang.Object r0 = r13.g
            go0 r0 = (defpackage.go0) r0
            defpackage.io.K(r14)
            goto L75
        L1a:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r13)
            r13 = 0
            return r13
        L21:
            i22 r0 = r13.e
            java.lang.Object r5 = r13.g
            v42 r5 = (defpackage.v42) r5
            defpackage.io.K(r14)
        L2a:
            r12 = r5
            goto L51
        L2c:
            defpackage.io.K(r14)
            java.lang.Object r14 = r13.g
            r5 = r14
            v42 r5 = (defpackage.v42) r5
            t30 r14 = defpackage.w52.a
            s52 r14 = new s52
            r14.<init>(r7, r9, r1)
            i22 r14 = defpackage.rx.C(r2, r9, r14, r4)
            r13.g = r5
            r13.e = r14
            r13.f = r4
            r0 = 3
            java.lang.Object r0 = defpackage.w52.b(r5, r13, r0)
            if (r0 != r11) goto L4d
            goto L74
        L4d:
            r12 = r0
            r0 = r14
            r14 = r12
            goto L2a
        L51:
            r8 = r14
            qh1 r8 = (defpackage.qh1) r8
            r8.a()
            t30 r14 = defpackage.w52.a
            te0 r6 = r13.i
            if (r6 == r14) goto L66
            q52 r5 = new q52
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            defpackage.w52.e(r2, r0, r5)
        L66:
            r13.g = r0
            r13.e = r9
            r13.f = r3
            kh1 r14 = defpackage.kh1.f
            java.lang.Object r14 = defpackage.w52.f(r12, r14, r13)
            if (r14 != r11) goto L75
        L74:
            return r11
        L75:
            qh1 r14 = (defpackage.qh1) r14
            if (r14 != 0) goto L82
            r52 r13 = new r52
            r13.<init>(r7, r9, r1)
            defpackage.w52.e(r2, r0, r13)
            goto L99
        L82:
            r14.a()
            r52 r1 = new r52
            r1.<init>(r7, r9, r4)
            defpackage.w52.e(r2, r0, r1)
            long r0 = r14.c
            z81 r14 = new z81
            r14.<init>(r0)
            oe0 r13 = r13.j
            r13.invoke(r14)
        L99:
            od2 r13 = defpackage.od2.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t52.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
