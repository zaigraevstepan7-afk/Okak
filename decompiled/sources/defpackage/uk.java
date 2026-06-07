package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class uk extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ r31 h;
    public final /* synthetic */ a12 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uk(r31 r31Var, a12 a12Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = r31Var;
        this.i = a12Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        switch (this.f) {
            case 0:
                return new uk(this.h, this.i, vtVar, 0);
            case 1:
                return new uk(this.h, this.i, vtVar, 1);
            default:
                return new uk(this.h, this.i, vtVar, 2);
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
                return ((uk) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((uk) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((uk) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        a12 a12Var = this.i;
        r31 r31Var = this.h;
        od2 od2Var = od2.a;
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
                sw1 sw1Var = r31Var.a;
                tk tkVar = new tk(a12Var, 0);
                this.g = 1;
                sw1Var.getClass();
                sw1.k(sw1Var, tkVar, this);
                return hvVar;
            case 1:
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
                sw1 sw1Var2 = r31Var.a;
                tk tkVar2 = new tk(a12Var, 1);
                this.g = 1;
                sw1Var2.getClass();
                sw1.k(sw1Var2, tkVar2, this);
                return hvVar;
            default:
                int i4 = this.g;
                if (i4 != 0) {
                    if (i4 == 1) {
                        io.K(obj);
                        return od2Var;
                    }
                    se.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                io.K(obj);
                sw1 sw1Var3 = r31Var.a;
                tk tkVar3 = new tk(a12Var, 2);
                this.g = 1;
                sw1Var3.getClass();
                sw1.k(sw1Var3, tkVar3, this);
                return hvVar;
        }
    }
}
