package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pj2 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ rj2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pj2(rj2 rj2Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = rj2Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        rj2 rj2Var = this.h;
        switch (i) {
            case 0:
                return new pj2(rj2Var, vtVar, 0);
            default:
                return new pj2(rj2Var, vtVar, 1);
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
                return ((pj2) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((pj2) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        rj2 rj2Var = this.h;
        hv hvVar = hv.e;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                int i2 = this.g;
                if (i2 != 0) {
                    if (i2 == 1) {
                        io.K(obj);
                    } else {
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    io.K(obj);
                    q5 q5Var = rj2Var.e;
                    this.g = 1;
                    Object d = q5Var.C.d(this);
                    if (d != hvVar) {
                        d = od2Var;
                    }
                    if (d == hvVar) {
                        return hvVar;
                    }
                }
                return od2Var;
            default:
                int i3 = this.g;
                if (i3 != 0) {
                    if (i3 == 1) {
                        io.K(obj);
                    } else {
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    io.K(obj);
                    q5 q5Var2 = rj2Var.e;
                    this.g = 1;
                    Object a = q5Var2.D.a(this);
                    if (a != hvVar) {
                        a = od2Var;
                    }
                    if (a == hvVar) {
                        return hvVar;
                    }
                }
                return od2Var;
        }
    }
}
