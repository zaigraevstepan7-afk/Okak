package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qi0 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ ri0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi0(ri0 ri0Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = ri0Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        ri0 ri0Var = this.h;
        switch (i) {
            case 0:
                return new qi0(ri0Var, vtVar, 0);
            default:
                return new qi0(ri0Var, vtVar, 1);
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
                return ((qi0) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((qi0) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        ri0 ri0Var = this.h;
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
                this.g = 1;
                if (ri0.L0(ri0Var, this) == hvVar) {
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
                this.g = 1;
                if (ri0.M0(ri0Var, this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
        }
    }
}
