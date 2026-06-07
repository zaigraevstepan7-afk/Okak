package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class q72 extends q42 implements te0 {
    public int f;
    public /* synthetic */ qi1 g;
    public /* synthetic */ long h;
    public final /* synthetic */ gv i;
    public final /* synthetic */ o41 j;
    public final /* synthetic */ r31 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q72(gv gvVar, o41 o41Var, r31 r31Var, vt vtVar) {
        super(3, vtVar);
        this.i = gvVar;
        this.j = o41Var;
        this.k = r31Var;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((z81) obj2).a;
        o41 o41Var = this.j;
        r31 r31Var = this.k;
        q72 q72Var = new q72(this.i, o41Var, r31Var, (vt) obj3);
        q72Var.g = (qi1) obj;
        q72Var.h = j;
        return q72Var.invokeSuspend(od2.a);
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        gv gvVar = this.i;
        if (i != 0) {
            if (i == 1) {
                io.K(obj);
            } else {
                se.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            io.K(obj);
            qi1 qi1Var = this.g;
            rx.C(gvVar, null, new m(this.j, this.h, this.k, (vt) null, 4), 3);
            this.f = 1;
            obj = qi1Var.e(this);
            hv hvVar = hv.e;
            if (obj == hvVar) {
                return hvVar;
            }
        }
        rx.C(gvVar, null, new o(this.j, ((Boolean) obj).booleanValue(), this.k, null), 3);
        return od2.a;
    }
}
