package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class y02 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ se0 i;
    public final /* synthetic */ o41 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y02(se0 se0Var, o41 o41Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.i = se0Var;
        this.j = o41Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        switch (this.f) {
            case 0:
                y02 y02Var = new y02(this.i, this.j, vtVar, 0);
                y02Var.h = obj;
                return y02Var;
            case 1:
                y02 y02Var2 = new y02(this.i, this.j, vtVar, 1);
                y02Var2.h = obj;
                return y02Var2;
            case 2:
                y02 y02Var3 = new y02(this.i, this.j, vtVar, 2);
                y02Var3.h = obj;
                return y02Var3;
            default:
                y02 y02Var4 = new y02(this.i, this.j, vtVar, 3);
                y02Var4.h = obj;
                return y02Var4;
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
                return ((y02) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((y02) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 2:
                return ((y02) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((y02) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        o41 o41Var = this.j;
        se0 se0Var = this.i;
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
                cj1 cj1Var = new cj1(o41Var, ((gv) this.h).A());
                this.g = 1;
                if (se0Var.invoke(cj1Var, this) == hvVar) {
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
                cj1 cj1Var2 = new cj1(o41Var, ((gv) this.h).A());
                this.g = 1;
                if (se0Var.invoke(cj1Var2, this) == hvVar) {
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
                cj1 cj1Var3 = new cj1(o41Var, ((gv) this.h).A());
                this.g = 1;
                if (se0Var.invoke(cj1Var3, this) == hvVar) {
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
                cj1 cj1Var4 = new cj1(o41Var, ((gv) this.h).A());
                this.g = 1;
                if (se0Var.invoke(cj1Var4, this) == hvVar) {
                    return hvVar;
                }
                return od2Var;
        }
    }
}
