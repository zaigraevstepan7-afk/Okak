package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class r52 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public final /* synthetic */ qi1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r52(qi1 qi1Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.g = qi1Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        qi1 qi1Var = this.g;
        switch (i) {
            case 0:
                return new r52(qi1Var, vtVar, 0);
            case 1:
                return new r52(qi1Var, vtVar, 1);
            case 2:
                return new r52(qi1Var, vtVar, 2);
            case 3:
                return new r52(qi1Var, vtVar, 3);
            case 4:
                return new r52(qi1Var, vtVar, 4);
            case 5:
                return new r52(qi1Var, vtVar, 5);
            case 6:
                return new r52(qi1Var, vtVar, 6);
            default:
                return new r52(qi1Var, vtVar, 7);
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
                ((r52) create(gvVar, vtVar)).invokeSuspend(od2Var);
                return od2Var;
            case 1:
                ((r52) create(gvVar, vtVar)).invokeSuspend(od2Var);
                return od2Var;
            case 2:
                ((r52) create(gvVar, vtVar)).invokeSuspend(od2Var);
                return od2Var;
            case 3:
                ((r52) create(gvVar, vtVar)).invokeSuspend(od2Var);
                return od2Var;
            case 4:
                ((r52) create(gvVar, vtVar)).invokeSuspend(od2Var);
                return od2Var;
            case 5:
                ((r52) create(gvVar, vtVar)).invokeSuspend(od2Var);
                return od2Var;
            case 6:
                ((r52) create(gvVar, vtVar)).invokeSuspend(od2Var);
                return od2Var;
            default:
                ((r52) create(gvVar, vtVar)).invokeSuspend(od2Var);
                return od2Var;
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        qi1 qi1Var = this.g;
        switch (i) {
            case 0:
                io.K(obj);
                qi1Var.g = true;
                b51 b51Var = qi1Var.h;
                if (b51Var.c()) {
                    b51Var.f(null);
                }
                return od2Var;
            case 1:
                io.K(obj);
                qi1Var.b();
                return od2Var;
            case 2:
                io.K(obj);
                qi1Var.b();
                return od2Var;
            case 3:
                io.K(obj);
                qi1Var.g = true;
                b51 b51Var2 = qi1Var.h;
                if (b51Var2.c()) {
                    b51Var2.f(null);
                }
                return od2Var;
            case 4:
                io.K(obj);
                qi1Var.b();
                return od2Var;
            case 5:
                io.K(obj);
                qi1Var.b();
                return od2Var;
            case 6:
                io.K(obj);
                qi1Var.g = true;
                b51 b51Var3 = qi1Var.h;
                if (b51Var3.c()) {
                    b51Var3.f(null);
                }
                return od2Var;
            default:
                io.K(obj);
                qi1Var.b();
                return od2Var;
        }
    }
}
