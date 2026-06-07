package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dx1 extends q42 implements te0 {
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ tl1 h;
    public final /* synthetic */ z90 i;
    public final /* synthetic */ ex1 j;
    public final /* synthetic */ float k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx1(tl1 tl1Var, z90 z90Var, ex1 ex1Var, float f, vt vtVar) {
        super(3, vtVar);
        this.h = tl1Var;
        this.i = z90Var;
        this.j = ex1Var;
        this.k = f;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ex1 ex1Var = this.j;
        float f = this.k;
        dx1 dx1Var = new dx1(this.h, this.i, ex1Var, f, (vt) obj3);
        dx1Var.g = (m4) obj;
        return dx1Var.invokeSuspend(od2.a);
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
            int i2 = 2;
            f4 f4Var = new f4(i2, this.j, (m4) this.g);
            tl1 tl1Var2 = this.h;
            this.g = tl1Var2;
            this.f = 1;
            Object a = this.i.a(f4Var, this.k, this);
            hv hvVar = hv.e;
            if (a == hvVar) {
                return hvVar;
            }
            obj = a;
            tl1Var = tl1Var2;
        }
        tl1Var.e = ((Number) obj).floatValue();
        return od2.a;
    }
}
