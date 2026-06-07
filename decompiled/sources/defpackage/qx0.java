package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qx0 extends q42 implements se0 {
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ tx0 h;
    public final /* synthetic */ wl1 i;
    public final /* synthetic */ wl1 j;
    public final /* synthetic */ dj1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx0(tx0 tx0Var, wl1 wl1Var, wl1 wl1Var2, dj1 dj1Var, vt vtVar) {
        super(2, vtVar);
        this.h = tx0Var;
        this.i = wl1Var;
        this.j = wl1Var2;
        this.k = dj1Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        qx0 qx0Var = new qx0(this.h, this.i, this.j, this.k, vtVar);
        qx0Var.g = obj;
        return qx0Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((qx0) create((gv) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
    
        if (defpackage.fp.w(2000, r10) == r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r11 == r6) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        return r6;
     */
    /* JADX WARN: Type inference failed for: r1v1, types: [q42, se0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0087 -> B:18:0x0021). Please report as a decompilation issue!!! */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.g
            gv r0 = (defpackage.gv) r0
            int r1 = r10.f
            tx0 r2 = r10.h
            r3 = 2
            r4 = 1
            r5 = 0
            hv r6 = defpackage.hv.e
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L14
            goto L1e
        L14:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r10)
            return r5
        L1a:
            defpackage.io.K(r11)
            goto L3e
        L1e:
            defpackage.io.K(r11)
        L21:
            boolean r11 = defpackage.fp.J(r0)
            if (r11 == 0) goto L8a
            r10.g = r0
            r10.f = r4
            r2.getClass()
            vy r11 = defpackage.k10.a
            ny r11 = defpackage.ny.g
            sx0 r1 = new sx0
            r1.<init>(r3, r5)
            java.lang.Object r11 = defpackage.rx.S(r11, r1, r10)
            if (r11 != r6) goto L3e
            goto L89
        L3e:
            java.lang.String r11 = (java.lang.String) r11
            wl1 r1 = r10.j
            wl1 r7 = r10.i
            if (r11 == 0) goto L73
            java.lang.Object r8 = r7.e
            boolean r8 = r11.equals(r8)
            if (r8 != 0) goto L73
            r7.e = r11
            px0 r7 = new px0
            dj1 r8 = r10.k
            r7.<init>(r2, r8)
            java.lang.String r8 = "logcat --pid="
            java.lang.String r9 = " -v threadtime"
            java.lang.String r11 = defpackage.l90.m(r8, r11, r9)
            java.lang.String[] r11 = new java.lang.String[]{r11}
            com.topjohnwu.superuser.Shell$Job r11 = com.topjohnwu.superuser.Shell.cmd(r11)
            com.topjohnwu.superuser.Shell$Job r11 = r11.to(r7, r5)
            r1.e = r11
            if (r11 == 0) goto L7d
            r11.submit()
            goto L7d
        L73:
            if (r11 != 0) goto L7d
            java.lang.Object r11 = r7.e
            if (r11 == 0) goto L7d
            r7.e = r5
            r1.e = r5
        L7d:
            r10.g = r0
            r10.f = r3
            r7 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r11 = defpackage.fp.w(r7, r10)
            if (r11 != r6) goto L21
        L89:
            return r6
        L8a:
            od2 r10 = defpackage.od2.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
