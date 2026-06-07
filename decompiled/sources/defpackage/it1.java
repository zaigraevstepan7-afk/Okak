package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class it1 extends q42 implements oe0 {
    public int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ lt1 i;
    public final /* synthetic */ lb2 j;
    public final /* synthetic */ float k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it1(Object obj, Object obj2, lt1 lt1Var, lb2 lb2Var, float f, vt vtVar) {
        super(1, vtVar);
        this.g = obj;
        this.h = obj2;
        this.i = lt1Var;
        this.j = lb2Var;
        this.k = f;
    }

    @Override // defpackage.eh
    public final vt create(vt vtVar) {
        return new it1(this.g, this.h, this.i, this.j, this.k, vtVar);
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        return ((it1) create((vt) obj)).invokeSuspend(od2.a);
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
            ht1 ht1Var = new ht1(this.g, this.h, this.i, this.j, this.k, null);
            this.f = 1;
            Object u = fp.u(ht1Var, this);
            hv hvVar = hv.e;
            if (u == hvVar) {
                return hvVar;
            }
        }
        return od2.a;
    }
}
