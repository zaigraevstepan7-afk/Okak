package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class h61 extends q42 implements se0 {
    public final /* synthetic */ int f = 0;
    public int g;
    public float h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h61(float f, lt1 lt1Var, d51 d51Var, vt vtVar) {
        super(2, vtVar);
        this.h = f;
        this.i = lt1Var;
        this.j = d51Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                return new h61(this.h, (lt1) this.i, (d51) obj2, vtVar);
            case 1:
                return new h61((xm) this.i, this.h, (gc) obj2, vtVar);
            default:
                h61 h61Var = new h61((lb2) obj2, vtVar);
                h61Var.i = obj;
                return h61Var;
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
                return ((h61) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((h61) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((h61) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bc, code lost:
    
        if (r12.p(r0, r12.b.getValue(), r12) == r4) goto L50;
     */
    @Override // defpackage.eh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h61.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h61(xm xmVar, float f, gc gcVar, vt vtVar) {
        super(2, vtVar);
        this.i = xmVar;
        this.h = f;
        this.j = gcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h61(lb2 lb2Var, vt vtVar) {
        super(2, vtVar);
        this.j = lb2Var;
    }
}
