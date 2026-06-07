package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ee extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ l40 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ee(l40 l40Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = l40Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        l40 l40Var = this.h;
        switch (i) {
            case 0:
                return new ee(l40Var, vtVar, 0);
            case 1:
                return new ee(l40Var, vtVar, 1);
            case 2:
                return new ee(l40Var, vtVar, 2);
            default:
                return new ee(l40Var, vtVar, 3);
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
                return ((ee) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((ee) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 2:
                return ((ee) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((ee) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        l40 l40Var = this.h;
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
                l40Var.getClass();
                Object a = l40.a(l40Var, m40.f, l40Var.d, this);
                if (a != hvVar) {
                    a = od2Var;
                }
                if (a == hvVar) {
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
                if (l40Var.b(this) == hvVar) {
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
                if (l40Var.b(this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
            default:
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
                if (l40Var.b(this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
        }
    }
}
