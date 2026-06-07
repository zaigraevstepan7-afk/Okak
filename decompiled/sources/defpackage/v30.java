package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class v30 extends q42 implements se0 {
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ w30 h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(w30 w30Var, long j, vt vtVar) {
        super(2, vtVar);
        this.h = w30Var;
        this.i = j;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        v30 v30Var = new v30(this.h, this.i, vtVar);
        v30Var.g = obj;
        return v30Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        return ((v30) create((gv) obj, (vt) obj2)).invokeSuspend(od2.a);
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
            gv gvVar = (gv) this.g;
            te0 te0Var = this.h.P;
            z81 z81Var = new z81(this.i);
            this.f = 1;
            Object invoke = te0Var.invoke(gvVar, z81Var, this);
            hv hvVar = hv.e;
            if (invoke == hvVar) {
                return hvVar;
            }
        }
        return od2.a;
    }
}
