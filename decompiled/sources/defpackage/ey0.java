package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ey0 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ ex1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey0(ex1 ex1Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = ex1Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        ex1 ex1Var = this.h;
        switch (i) {
            case 0:
                return new ey0(ex1Var, vtVar, 0);
            case 1:
                return new ey0(ex1Var, vtVar, 1);
            case 2:
                return new ey0(ex1Var, vtVar, 2);
            case 3:
                return new ey0(ex1Var, vtVar, 3);
            case 4:
                return new ey0(ex1Var, vtVar, 4);
            case 5:
                return new ey0(ex1Var, vtVar, 5);
            case 6:
                return new ey0(ex1Var, vtVar, 6);
            case 7:
                return new ey0(ex1Var, vtVar, 7);
            case 8:
                return new ey0(ex1Var, vtVar, 8);
            default:
                return new ey0(ex1Var, vtVar, 9);
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
                return ((ey0) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((ey0) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 2:
                return ((ey0) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 3:
                return ((ey0) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 4:
                return ((ey0) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 5:
                return ((ey0) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 6:
                return ((ey0) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 7:
                return ((ey0) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 8:
                return ((ey0) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((ey0) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.f;
        fx1 fx1Var = fx1.f;
        od2 od2Var = od2.a;
        ex1 ex1Var = this.h;
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
                if (ex1Var.d(this) == hvVar) {
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
                this.g = 1;
                if (ex1Var.d(this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
            case 2:
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
                this.g = 1;
                if (ex1Var.f(this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
            case 3:
                int i5 = this.g;
                if (i5 != 0) {
                    if (i5 == 1) {
                        io.K(obj);
                        return od2Var;
                    }
                    se.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                io.K(obj);
                this.g = 1;
                if (ex1Var.d(this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
            case 4:
                int i6 = this.g;
                if (i6 != 0) {
                    if (i6 == 1) {
                        io.K(obj);
                        return od2Var;
                    }
                    se.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                io.K(obj);
                this.g = 1;
                if (ex1Var.g(this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
            case 5:
                int i7 = this.g;
                if (i7 != 0) {
                    if (i7 == 1) {
                        io.K(obj);
                        return od2Var;
                    }
                    se.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                io.K(obj);
                this.g = 1;
                if (ex1Var.d(this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
            case 6:
                int i8 = this.g;
                if (i8 != 0) {
                    if (i8 == 1) {
                        io.K(obj);
                        return od2Var;
                    }
                    se.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                io.K(obj);
                this.g = 1;
                if (!((Boolean) ex1Var.c.invoke(fx1Var)).booleanValue() || (obj2 = ex1Var.b(fx1Var, ex1Var.e, this)) != hvVar) {
                    obj2 = od2Var;
                }
                if (obj2 == hvVar) {
                    return hvVar;
                }
                return od2Var;
            case 7:
                int i9 = this.g;
                if (i9 != 0) {
                    if (i9 == 1) {
                        io.K(obj);
                        return od2Var;
                    }
                    se.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                io.K(obj);
                this.g = 1;
                if (ex1Var.g(this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
            case 8:
                int i10 = this.g;
                if (i10 != 0) {
                    if (i10 == 1) {
                        io.K(obj);
                        return od2Var;
                    }
                    se.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                io.K(obj);
                this.g = 1;
                if (!((Boolean) ex1Var.c.invoke(fx1Var)).booleanValue() || (obj3 = ex1Var.b(fx1Var, ex1Var.e, this)) != hvVar) {
                    obj3 = od2Var;
                }
                if (obj3 == hvVar) {
                    return hvVar;
                }
                return od2Var;
            default:
                int i11 = this.g;
                if (i11 != 0) {
                    if (i11 == 1) {
                        io.K(obj);
                        return od2Var;
                    }
                    se.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                io.K(obj);
                this.g = 1;
                if (ex1Var.f(this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
        }
    }
}
