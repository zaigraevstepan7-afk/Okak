package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class x3 extends q42 implements ue0 {
    public int f;
    public /* synthetic */ m4 g;
    public /* synthetic */ cy h;
    public /* synthetic */ Object i;
    public final /* synthetic */ n4 j;
    public final /* synthetic */ gc k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(n4 n4Var, gc gcVar, vt vtVar) {
        super(4, vtVar);
        this.j = n4Var;
        this.k = gcVar;
    }

    @Override // defpackage.ue0
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        x3 x3Var = new x3(this.j, this.k, (vt) obj4);
        x3Var.g = (m4) obj;
        x3Var.h = (cy) obj2;
        x3Var.i = obj3;
        return x3Var.invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                io.K(obj);
            } else {
                se.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            io.K(obj);
            m4 m4Var = this.g;
            cy cyVar = this.h;
            Object obj2 = this.i;
            n4 n4Var = this.j;
            float g = n4Var.k.g();
            this.g = null;
            this.h = null;
            this.f = 1;
            Object d = mp0.d(n4Var, g, m4Var, cyVar, obj2, this.k, this);
            hv hvVar = hv.e;
            if (d == hvVar) {
                return hvVar;
            }
        }
        return od2.a;
    }
}
