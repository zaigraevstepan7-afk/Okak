package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gt extends q42 implements se0 {
    public final /* synthetic */ int f = 0;
    public int g;
    public final /* synthetic */ long h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt(wg1 wg1Var, String str, long j, d92 d92Var, b82 b82Var, c91 c91Var, vt vtVar) {
        super(2, vtVar);
        this.i = wg1Var;
        this.j = str;
        this.h = j;
        this.k = d92Var;
        this.l = b82Var;
        this.m = c91Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.m;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        switch (i) {
            case 0:
                gt gtVar = new gt((wd2) obj5, (jt) obj4, (xj) obj3, this.h, (go0) obj2, vtVar);
                gtVar.i = obj;
                return gtVar;
            default:
                return new gt((wg1) this.i, (String) obj5, this.h, (d92) obj4, (b82) obj3, (c91) obj2, vtVar);
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                return ((gt) create((ys1) obj, (vt) obj2)).invokeSuspend(od2Var);
            default:
                return ((gt) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt(wd2 wd2Var, jt jtVar, xj xjVar, long j, go0 go0Var, vt vtVar) {
        super(2, vtVar);
        this.j = wd2Var;
        this.k = jtVar;
        this.l = xjVar;
        this.h = j;
        this.m = go0Var;
    }
}
