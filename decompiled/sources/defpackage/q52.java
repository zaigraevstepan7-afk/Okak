package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class q52 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ te0 h;
    public final /* synthetic */ qi1 i;
    public final /* synthetic */ qh1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q52(te0 te0Var, qi1 qi1Var, qh1 qh1Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = te0Var;
        this.i = qi1Var;
        this.j = qh1Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        switch (this.f) {
            case 0:
                return new q52(this.h, this.i, this.j, vtVar, 0);
            case 1:
                return new q52(this.h, this.i, this.j, vtVar, 1);
            default:
                return new q52(this.h, this.i, this.j, vtVar, 2);
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
                return ((q52) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((q52) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((q52) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        qh1 qh1Var = this.j;
        qi1 qi1Var = this.i;
        te0 te0Var = this.h;
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
                z81 z81Var = new z81(qh1Var.c);
                this.g = 1;
                if (te0Var.invoke(qi1Var, z81Var, this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
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
                z81 z81Var2 = new z81(qh1Var.c);
                this.g = 1;
                if (te0Var.invoke(qi1Var, z81Var2, this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
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
                z81 z81Var3 = new z81(qh1Var.c);
                this.g = 1;
                if (te0Var.invoke(qi1Var, z81Var3, this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
        }
    }
}
