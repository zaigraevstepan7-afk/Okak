package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vh0 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ bi0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vh0(bi0 bi0Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = bi0Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        bi0 bi0Var = this.h;
        switch (i) {
            case 0:
                return new vh0(bi0Var, vtVar, 0);
            default:
                return new vh0(bi0Var, vtVar, 1);
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
                return ((vh0) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((vh0) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        hv hvVar = hv.e;
        bi0 bi0Var = this.h;
        int i2 = 1;
        switch (i) {
            case 0:
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
                eb0 eb0Var = bi0Var.b.b;
                uh0 uh0Var = new uh0(bi0Var, 0);
                this.g = 1;
                if (eb0Var.a(uh0Var, this) == hvVar) {
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
                tx0 tx0Var = bi0Var.c;
                tx0Var.getClass();
                il ilVar = new il(new rx0(tx0Var, null), j60.e, -2, jk.e);
                vy vyVar = k10.a;
                va0 G = qo.G(ilVar, ny.g);
                uh0 uh0Var2 = new uh0(bi0Var, i2);
                this.g = 1;
                if (G.a(uh0Var2, this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
        }
    }
}
