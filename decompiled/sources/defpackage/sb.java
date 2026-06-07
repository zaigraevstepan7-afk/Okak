package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sb extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ ub h;
    public final /* synthetic */ kp1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb(ub ubVar, kp1 kp1Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = ubVar;
        this.i = kp1Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        switch (this.f) {
            case 0:
                return new sb(this.h, this.i, vtVar, 0);
            case 1:
                return new sb(this.h, this.i, vtVar, 1);
            case 2:
                return new sb(this.h, this.i, vtVar, 2);
            case 3:
                return new sb(this.h, this.i, vtVar, 3);
            default:
                return new sb(this.h, this.i, vtVar, 4);
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
                return ((sb) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((sb) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 2:
                return ((sb) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 3:
                return ((sb) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((sb) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        kp1 kp1Var = this.i;
        hv hvVar = hv.e;
        ub ubVar = this.h;
        vt vtVar = null;
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
                ubVar.getClass();
                if (fp.u(new tb(ubVar, kp1Var, vtVar, 0), this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
            case 1:
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
                    ya yaVar = ubVar.e;
                    if (yaVar != null) {
                        Float f = new Float(kp1Var.a.a(ubVar.c, ubVar.d));
                        u90 u90Var = ubVar.b;
                        this.g = 1;
                        obj = ya.b(yaVar, f, u90Var, null, this, 12);
                        if (obj == hvVar) {
                            return hvVar;
                        }
                    } else {
                        return od2Var;
                    }
                }
                return od2Var;
            case 2:
                int i4 = this.g;
                if (i4 != 0) {
                    if (i4 == 1) {
                        io.K(obj);
                    } else {
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    io.K(obj);
                    ya yaVar2 = ubVar.f;
                    if (yaVar2 != null) {
                        Float f2 = new Float(kp1Var.b.a(ubVar.c, ubVar.d));
                        u90 u90Var2 = ubVar.b;
                        this.g = 1;
                        obj = ya.b(yaVar2, f2, u90Var2, null, this, 12);
                        if (obj == hvVar) {
                            return hvVar;
                        }
                    } else {
                        return od2Var;
                    }
                }
                return od2Var;
            case 3:
                int i5 = this.g;
                if (i5 != 0) {
                    if (i5 == 1) {
                        io.K(obj);
                    } else {
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    io.K(obj);
                    ya yaVar3 = ubVar.g;
                    if (yaVar3 != null) {
                        Float f3 = new Float(kp1Var.d.a(ubVar.c, ubVar.d));
                        u90 u90Var3 = ubVar.b;
                        this.g = 1;
                        obj = ya.b(yaVar3, f3, u90Var3, null, this, 12);
                        if (obj == hvVar) {
                            return hvVar;
                        }
                    } else {
                        return od2Var;
                    }
                }
                return od2Var;
            default:
                int i6 = this.g;
                if (i6 != 0) {
                    if (i6 == 1) {
                        io.K(obj);
                    } else {
                        se.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    io.K(obj);
                    ya yaVar4 = ubVar.h;
                    if (yaVar4 != null) {
                        Float f4 = new Float(kp1Var.c.a(ubVar.c, ubVar.d));
                        u90 u90Var4 = ubVar.b;
                        this.g = 1;
                        obj = ya.b(yaVar4, f4, u90Var4, null, this, 12);
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
