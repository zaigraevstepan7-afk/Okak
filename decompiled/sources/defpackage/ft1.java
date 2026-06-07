package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ft1 extends q42 implements oe0 {
    public final /* synthetic */ int f = 0;
    public int g;
    public final /* synthetic */ lt1 h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ lb2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft1(lb2 lb2Var, lt1 lt1Var, Object obj, vt vtVar) {
        super(1, vtVar);
        this.j = lb2Var;
        this.h = lt1Var;
        this.i = obj;
    }

    @Override // defpackage.eh
    public final vt create(vt vtVar) {
        int i = this.f;
        lb2 lb2Var = this.j;
        Object obj = this.i;
        lt1 lt1Var = this.h;
        switch (i) {
            case 0:
                return new ft1(lb2Var, lt1Var, obj, vtVar);
            default:
                return new ft1(lt1Var, obj, lb2Var, vtVar);
        }
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        vt vtVar = (vt) obj;
        switch (i) {
            case 0:
                return ((ft1) create(vtVar)).invokeSuspend(od2Var);
            default:
                return ((ft1) create(vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        float f;
        int i = this.f;
        od2 od2Var = od2.a;
        hv hvVar = hv.e;
        lt1 lt1Var = this.h;
        Object obj2 = this.i;
        lb2 lb2Var = this.j;
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
                    z7 z7Var = new z7(lt1Var, obj2, lb2Var, null);
                    this.g = 1;
                    if (fp.u(z7Var, this) == hvVar) {
                        return hvVar;
                    }
                }
                lb2Var.i();
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
                    lt1Var.n();
                    je1 je1Var = lt1Var.b;
                    lt1Var.l = Long.MIN_VALUE;
                    lt1Var.r(0.0f);
                    if (obj2.equals(lt1Var.c.getValue())) {
                        f = -4.0f;
                    } else if (obj2.equals(je1Var.getValue())) {
                        f = -5.0f;
                    } else {
                        f = -3.0f;
                    }
                    lb2Var.p(obj2);
                    lb2Var.n(0L);
                    je1Var.setValue(obj2);
                    lt1Var.r(0.0f);
                    lt1Var.f(obj2);
                    lb2Var.j(f);
                    if (f == -3.0f) {
                        this.g = 1;
                        if (lt1.l(lt1Var, this) == hvVar) {
                            return hvVar;
                        }
                    }
                }
                lb2Var.i();
                return od2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft1(lt1 lt1Var, Object obj, lb2 lb2Var, vt vtVar) {
        super(1, vtVar);
        this.h = lt1Var;
        this.i = obj;
        this.j = lb2Var;
    }
}
