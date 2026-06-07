package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class o extends q42 implements se0 {
    public final /* synthetic */ int f = 2;
    public int g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Object i;
    public Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ya yaVar, boolean z, gc gcVar, de0 de0Var, vt vtVar) {
        super(2, vtVar);
        this.i = yaVar;
        this.h = z;
        this.j = gcVar;
        this.k = de0Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.i;
        Object obj3 = this.k;
        switch (i) {
            case 0:
                return new o((r31) obj2, (si1) this.j, this.h, (kn) obj3, vtVar);
            case 1:
                return new o((ya) obj2, this.h, (gc) this.j, (de0) obj3, vtVar);
            default:
                return new o((o41) obj3, this.h, (r31) obj2, vtVar);
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
                return ((o) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((o) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((o) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c0, code lost:
    
        if (((defpackage.r31) r1).a(r0, r12) == r7) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b5, code lost:
    
        if (defpackage.fp.w(r9, r12) == r7) goto L47;
     */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r31 r31Var, si1 si1Var, boolean z, kn knVar, vt vtVar) {
        super(2, vtVar);
        this.i = r31Var;
        this.j = si1Var;
        this.h = z;
        this.k = knVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(o41 o41Var, boolean z, r31 r31Var, vt vtVar) {
        super(2, vtVar);
        this.k = o41Var;
        this.h = z;
        this.i = r31Var;
    }
}
