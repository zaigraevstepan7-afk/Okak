package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i11 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ j11 h;
    public final /* synthetic */ rg i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i11(j11 j11Var, rg rgVar, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = j11Var;
        this.i = rgVar;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        rg rgVar = this.i;
        j11 j11Var = this.h;
        switch (i) {
            case 0:
                return new i11(j11Var, rgVar, vtVar, 0);
            default:
                return new i11(j11Var, rgVar, vtVar, 1);
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
                return ((i11) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((i11) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        rg rgVar = this.i;
        j11 j11Var = this.h;
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
                ya yaVar = j11Var.e;
                Float f = new Float(zg.a.a(rgVar.c));
                this.g = 1;
                if (yaVar.f(this, f) == hvVar) {
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
                ya yaVar2 = j11Var.e;
                Float f2 = new Float(zg.a.a(rgVar.c));
                this.g = 1;
                if (yaVar2.f(this, f2) == hvVar) {
                    return hvVar;
                }
                return od2Var;
        }
    }
}
