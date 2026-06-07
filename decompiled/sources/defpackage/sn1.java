package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sn1 extends q42 implements se0 {
    public final /* synthetic */ int f = 1;
    public co1 g;
    public int h;
    public final /* synthetic */ o41 i;
    public final /* synthetic */ h32 j;
    public final /* synthetic */ sz1 k;
    public final /* synthetic */ co1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn1(o41 o41Var, sz1 sz1Var, h32 h32Var, co1 co1Var, vt vtVar) {
        super(2, vtVar);
        this.i = o41Var;
        this.k = sz1Var;
        this.j = h32Var;
        this.l = co1Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        switch (this.f) {
            case 0:
                return new sn1(this.i, this.k, this.j, this.l, vtVar);
            default:
                return new sn1(this.i, this.j, this.k, this.l, vtVar);
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
                return ((sn1) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((sn1) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004e A[PHI: r0
      0x004e: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v3 java.lang.String) binds: [B:37:0x005a, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn1(o41 o41Var, h32 h32Var, sz1 sz1Var, co1 co1Var, vt vtVar) {
        super(2, vtVar);
        this.i = o41Var;
        this.j = h32Var;
        this.k = sz1Var;
        this.l = co1Var;
    }
}
