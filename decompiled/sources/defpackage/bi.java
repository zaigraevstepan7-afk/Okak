package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bi extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ uh1 i;
    public final /* synthetic */ ta2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bi(uh1 uh1Var, ta2 ta2Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.i = uh1Var;
        this.j = ta2Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        switch (this.f) {
            case 0:
                bi biVar = new bi(this.i, this.j, vtVar, 0);
                biVar.h = obj;
                return biVar;
            default:
                bi biVar2 = new bi(this.i, this.j, vtVar, 1);
                biVar2.h = obj;
                return biVar2;
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
                return ((bi) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((bi) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        ta2 ta2Var = this.j;
        uh1 uh1Var = this.i;
        hv hvVar = hv.e;
        switch (i) {
            case 0:
                int i2 = this.g;
                if (i2 != 0) {
                    if (i2 == 1) {
                        io.K(obj);
                        return od2Var;
                    }
                    se.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                io.K(obj);
                ai aiVar = new ai((gv) this.h, ta2Var, null);
                this.g = 1;
                if (vn.o(uh1Var, aiVar, this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
            default:
                int i3 = this.g;
                if (i3 != 0) {
                    if (i3 == 1) {
                        io.K(obj);
                        return od2Var;
                    }
                    se.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                io.K(obj);
                di diVar = new di((gv) this.h, ta2Var, (vt) null);
                this.g = 1;
                if (((w42) uh1Var).L0(diVar, this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
        }
    }
}
