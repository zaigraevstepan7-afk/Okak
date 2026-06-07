package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kx extends q42 implements oe0 {
    public final /* synthetic */ int f = 1;
    public int g;
    public final /* synthetic */ nx h;
    public Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(wl1 wl1Var, nx nxVar, ul1 ul1Var, vt vtVar) {
        super(1, vtVar);
        this.j = wl1Var;
        this.h = nxVar;
        this.k = ul1Var;
    }

    @Override // defpackage.eh
    public final vt create(vt vtVar) {
        int i = this.f;
        Object obj = this.k;
        Object obj2 = this.j;
        nx nxVar = this.h;
        switch (i) {
            case 0:
                return new kx((wl1) obj2, nxVar, (ul1) obj, vtVar);
            default:
                return new kx(nxVar, (xu) obj2, (se0) obj, vtVar);
        }
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        vt vtVar = (vt) obj;
        switch (i) {
            case 0:
                return ((kx) create(vtVar)).invokeSuspend(od2Var);
            default:
                return ((kx) create(vtVar)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx(nx nxVar, xu xuVar, se0 se0Var, vt vtVar) {
        super(1, vtVar);
        this.h = nxVar;
        this.j = xuVar;
        this.k = se0Var;
    }
}
