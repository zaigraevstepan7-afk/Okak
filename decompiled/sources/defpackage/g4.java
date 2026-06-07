package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class g4 extends q42 implements te0 {
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ h4 h;
    public final /* synthetic */ tl1 i;
    public final /* synthetic */ float j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(h4 h4Var, tl1 tl1Var, float f, vt vtVar) {
        super(3, vtVar);
        this.h = h4Var;
        this.i = tl1Var;
        this.j = f;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        tl1 tl1Var = this.i;
        float f = this.j;
        g4 g4Var = new g4(this.h, tl1Var, f, (vt) obj3);
        g4Var.g = (m4) obj;
        return g4Var.invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        tl1 tl1Var;
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                tl1Var = (tl1) this.g;
                io.K(obj);
            } else {
                se.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            io.K(obj);
            m4 m4Var = (m4) this.g;
            h4 h4Var = this.h;
            f4 f4Var = new f4(0, h4Var, m4Var);
            z90 z90Var = h4Var.Q;
            if (z90Var != null) {
                tl1 tl1Var2 = this.i;
                this.g = tl1Var2;
                this.f = 1;
                obj = z90Var.a(f4Var, this.j, this);
                hv hvVar = hv.e;
                if (obj == hvVar) {
                    return hvVar;
                }
                tl1Var = tl1Var2;
            } else {
                sn0.V("resolvedFlingBehavior");
                throw null;
            }
        }
        tl1Var.e = ((Number) obj).floatValue();
        return od2.a;
    }
}
