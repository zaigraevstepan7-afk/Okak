package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class a22 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ c22 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a22(c22 c22Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = c22Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        c22 c22Var = this.h;
        switch (i) {
            case 0:
                return new a22(c22Var, vtVar, 0);
            default:
                return new a22(c22Var, vtVar, 1);
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
                return ((a22) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((a22) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (defpackage.fp.w(500, r14) == r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        if (((defpackage.ix1) r15).a(r14) == r4) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00db, code lost:
    
        if (r15 == r4) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c3, code lost:
    
        if (r15 == r4) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a4, code lost:
    
        if (r15 == r4) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008b, code lost:
    
        if (defpackage.fp.w(1000, r14) == r4) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a22.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
