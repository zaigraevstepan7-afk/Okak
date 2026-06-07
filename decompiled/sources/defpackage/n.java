package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class n extends q42 implements se0 {
    public final /* synthetic */ int f = 1;
    public int g;
    public final /* synthetic */ r31 h;
    public final /* synthetic */ si1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r31 r31Var, si1 si1Var, vt vtVar) {
        super(2, vtVar);
        this.h = r31Var;
        this.i = si1Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        si1 si1Var = this.i;
        r31 r31Var = this.h;
        switch (i) {
            case 0:
                return new n(si1Var, r31Var, vtVar);
            default:
                return new n(r31Var, si1Var, vtVar);
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
                return ((n) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((n) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        si1 si1Var = this.i;
        r31 r31Var = this.h;
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
                ti1 ti1Var = new ti1(si1Var);
                this.g = 1;
                if (r31Var.a(ti1Var, this) == hvVar) {
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
                if (r31Var.a(si1Var, this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(si1 si1Var, r31 r31Var, vt vtVar) {
        super(2, vtVar);
        this.i = si1Var;
        this.h = r31Var;
    }
}
