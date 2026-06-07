package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zs1 extends q42 implements se0 {
    public long f;
    public int g;
    public /* synthetic */ long h;
    public final /* synthetic */ at1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs1(at1 at1Var, vt vtVar) {
        super(2, vtVar);
        this.i = at1Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        zs1 zs1Var = new zs1(this.i, vtVar);
        zs1Var.h = ((ye2) obj).a;
        return zs1Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        long j = ((ye2) obj).a;
        zs1 zs1Var = new zs1(this.i, (vt) obj2);
        zs1Var.h = j;
        return zs1Var.invokeSuspend(od2.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r15 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.g
            r1 = 3
            r2 = 2
            r3 = 1
            at1 r4 = r14.i
            hv r5 = defpackage.hv.e
            if (r0 == 0) goto L2e
            if (r0 == r3) goto L28
            if (r0 == r2) goto L20
            if (r0 != r1) goto L19
            long r0 = r14.f
            long r2 = r14.h
            defpackage.io.K(r15)
            goto L70
        L19:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r14)
            r14 = 0
            return r14
        L20:
            long r2 = r14.f
            long r6 = r14.h
            defpackage.io.K(r15)
            goto L56
        L28:
            long r6 = r14.h
            defpackage.io.K(r15)
            goto L40
        L2e:
            defpackage.io.K(r15)
            long r6 = r14.h
            q4 r15 = r4.f
            r14.h = r6
            r14.g = r3
            java.lang.Object r15 = r15.i(r6, r14)
            if (r15 != r5) goto L40
            goto L6d
        L40:
            ye2 r15 = (defpackage.ye2) r15
            long r8 = r15.a
            long r8 = defpackage.ye2.d(r6, r8)
            r14.h = r6
            r14.f = r8
            r14.g = r2
            java.lang.Object r15 = r4.a(r8, r14)
            if (r15 != r5) goto L55
            goto L6d
        L55:
            r2 = r8
        L56:
            ye2 r15 = (defpackage.ye2) r15
            long r11 = r15.a
            q4 r8 = r4.f
            long r9 = defpackage.ye2.d(r2, r11)
            r14.h = r6
            r14.f = r11
            r14.g = r1
            r13 = r14
            java.lang.Object r15 = r8.g(r9, r11, r13)
            if (r15 != r5) goto L6e
        L6d:
            return r5
        L6e:
            r2 = r6
            r0 = r11
        L70:
            ye2 r15 = (defpackage.ye2) r15
            long r14 = r15.a
            long r14 = defpackage.ye2.d(r0, r14)
            long r14 = defpackage.ye2.d(r2, r14)
            ye2 r0 = new ye2
            r0.<init>(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zs1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
