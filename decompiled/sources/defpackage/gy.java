package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gy extends q42 implements se0 {
    public final /* synthetic */ int f = 0;
    public tl1 g;
    public int h;
    public final /* synthetic */ float i;
    public final /* synthetic */ ds1 j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy(c02 c02Var, float f, oe0 oe0Var, ds1 ds1Var, vt vtVar) {
        super(2, vtVar);
        this.k = c02Var;
        this.i = f;
        this.l = oe0Var;
        this.j = ds1Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.l;
        switch (i) {
            case 0:
                ds1 ds1Var = this.j;
                return new gy(this.i, (hy) obj2, ds1Var, vtVar);
            default:
                ds1 ds1Var2 = this.j;
                return new gy((c02) this.k, this.i, (oe0) obj2, ds1Var2, vtVar);
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
                return ((gy) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((gy) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r1 == r7) goto L22;
     */
    /* JADX WARN: Type inference failed for: r0v4, types: [tl1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [tl1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [tl1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [zz1] */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy(float f, hy hyVar, ds1 ds1Var, vt vtVar) {
        super(2, vtVar);
        this.i = f;
        this.l = hyVar;
        this.j = ds1Var;
    }
}
