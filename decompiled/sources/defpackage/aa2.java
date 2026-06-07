package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class aa2 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ ba2 h;
    public final /* synthetic */ float i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aa2(ba2 ba2Var, float f, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = ba2Var;
        this.i = f;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        float f = this.i;
        ba2 ba2Var = this.h;
        switch (i) {
            case 0:
                return new aa2(ba2Var, f, vtVar, 0);
            default:
                return new aa2(ba2Var, f, vtVar, 1);
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
                return ((aa2) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((aa2) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        gc gcVar;
        gc gcVar2;
        int i = this.f;
        od2 od2Var = od2.a;
        float f = this.i;
        hv hvVar = hv.e;
        ba2 ba2Var = this.h;
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
                    ya yaVar = ba2Var.x;
                    if (yaVar != null) {
                        Float f2 = new Float(f);
                        if (ba2Var.v) {
                            gcVar = a52.f;
                        } else {
                            gcVar = ba2Var.u;
                        }
                        gc gcVar3 = gcVar;
                        this.g = 1;
                        obj = ya.b(yaVar, f2, gcVar3, null, this, 12);
                        if (obj == hvVar) {
                            return hvVar;
                        }
                    } else {
                        return od2Var;
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
                    ya yaVar2 = ba2Var.w;
                    if (yaVar2 != null) {
                        Float f3 = new Float(f);
                        if (ba2Var.v) {
                            gcVar2 = a52.f;
                        } else {
                            gcVar2 = ba2Var.u;
                        }
                        gc gcVar4 = gcVar2;
                        this.g = 1;
                        obj = ya.b(yaVar2, f3, gcVar4, null, this, 12);
                        if (obj == hvVar) {
                            return hvVar;
                        }
                    } else {
                        return od2Var;
                    }
                }
                return od2Var;
        }
    }
}
