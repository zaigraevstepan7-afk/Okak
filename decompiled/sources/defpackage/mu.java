package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mu extends q42 implements se0 {
    public /* synthetic */ Object f;
    public final /* synthetic */ uh1 g;
    public final /* synthetic */ b72 h;
    public final /* synthetic */ b82 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu(uh1 uh1Var, b72 b72Var, b82 b82Var, vt vtVar) {
        super(2, vtVar);
        this.g = uh1Var;
        this.h = b72Var;
        this.i = b82Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        mu muVar = new mu(this.g, this.h, this.i, vtVar);
        muVar.f = obj;
        return muVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        mu muVar = (mu) create((gv) obj, (vt) obj2);
        od2 od2Var = od2.a;
        muVar.invokeSuspend(od2Var);
        return od2Var;
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        io.K(obj);
        gv gvVar = (gv) this.f;
        uh1 uh1Var = this.g;
        vt vtVar = null;
        rx.C(gvVar, null, new lu(uh1Var, this.h, vtVar, 0), 1);
        rx.C(gvVar, null, new j(uh1Var, this.i, vtVar, 12), 1);
        return od2.a;
    }
}
