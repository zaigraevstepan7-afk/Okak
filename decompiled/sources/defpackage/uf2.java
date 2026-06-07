package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class uf2 extends q42 implements se0 {
    public vf2 f;
    public String g;
    public int h;
    public int i;
    public final /* synthetic */ vf2 j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf2(vf2 vf2Var, boolean z, vt vtVar) {
        super(2, vtVar);
        this.j = vf2Var;
        this.k = z;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        return new uf2(this.j, this.k, vtVar);
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((uf2) create((gv) obj, (vt) obj2)).invokeSuspend(od2.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
    
        if (r11 == r9) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.i
            od2 r1 = defpackage.od2.a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            boolean r6 = r10.k
            vf2 r7 = r10.j
            r8 = 0
            hv r9 = defpackage.hv.e
            if (r0 == 0) goto L3f
            if (r0 == r5) goto L3b
            if (r0 == r4) goto L31
            if (r0 == r3) goto L28
            if (r0 != r2) goto L22
            vf2 r10 = r10.f
            java.lang.String r10 = (java.lang.String) r10
            defpackage.io.K(r11)
            goto Lae
        L22:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r10)
            return r8
        L28:
            int r0 = r10.h
            vf2 r3 = r10.f
            defpackage.io.K(r11)
            goto L9f
        L31:
            int r0 = r10.h
            java.lang.String r4 = r10.g
            vf2 r7 = r10.f
            defpackage.io.K(r11)
            goto L81
        L3b:
            defpackage.io.K(r11)
            goto L58
        L3f:
            defpackage.io.K(r11)
            rw r11 = r7.b
            r10.i = r5
            nx r11 = r11.a
            iw r0 = new iw
            r0.<init>(r6, r8)
            java.lang.Object r11 = r11.i(r0, r10)
            if (r11 != r9) goto L54
            goto L55
        L54:
            r11 = r1
        L55:
            if (r11 != r9) goto L58
            goto Lad
        L58:
            r22 r11 = r7.i
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r11.getClass()
            r11.k(r8, r0)
            if (r6 == 0) goto Lae
            java.lang.String r11 = r7.k
            if (r11 == 0) goto Lae
            rw r0 = r7.b
            eb0 r0 = r0.b
            r10.f = r7
            r10.g = r11
            r5 = 0
            r10.h = r5
            r10.i = r4
            java.lang.Object r0 = defpackage.qo.F(r0, r10)
            if (r0 != r9) goto L7e
            goto Lad
        L7e:
            r4 = r11
            r11 = r0
            r0 = r5
        L81:
            com.elixir.loader.UserSettings r11 = (com.elixir.loader.UserSettings) r11
            java.lang.String r11 = r11.getSelectedRelease()
            boolean r11 = defpackage.sn0.r(r11, r4)
            if (r11 != 0) goto Lae
            rw r11 = r7.b
            r10.f = r7
            r10.g = r8
            r10.h = r0
            r10.i = r3
            java.lang.Object r11 = r11.b(r4, r10)
            if (r11 != r9) goto L9e
            goto Lad
        L9e:
            r3 = r7
        L9f:
            r10.f = r8
            r10.g = r8
            r10.h = r0
            r10.i = r2
            java.lang.Object r10 = defpackage.vf2.e(r3, r10)
            if (r10 != r9) goto Lae
        Lad:
            return r9
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uf2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
