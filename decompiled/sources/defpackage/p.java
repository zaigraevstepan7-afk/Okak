package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class p extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ kn h;
    public final /* synthetic */ si1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(kn knVar, si1 si1Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = knVar;
        this.i = si1Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        si1 si1Var = this.i;
        kn knVar = this.h;
        switch (i) {
            case 0:
                return new p(knVar, si1Var, vtVar, 0);
            case 1:
                return new p(knVar, si1Var, vtVar, 1);
            case 2:
                return new p(knVar, si1Var, vtVar, 2);
            default:
                return new p(knVar, si1Var, vtVar, 3);
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
                return ((p) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((p) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 2:
                return ((p) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((p) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        od2 od2Var = od2.a;
        si1 si1Var = this.i;
        kn knVar = this.h;
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
                r31 r31Var = knVar.u;
                if (r31Var != null) {
                    ri1 ri1Var = new ri1(si1Var);
                    this.g = 1;
                    if (r31Var.a(ri1Var, this) == hvVar) {
                        return hvVar;
                    }
                    return od2Var;
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
                r31 r31Var2 = knVar.u;
                if (r31Var2 != null) {
                    ri1 ri1Var2 = new ri1(si1Var);
                    this.g = 1;
                    if (r31Var2.a(ri1Var2, this) == hvVar) {
                        return hvVar;
                    }
                    return od2Var;
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
                r31 r31Var3 = knVar.u;
                if (r31Var3 != null) {
                    this.g = 1;
                    if (r31Var3.a(si1Var, this) == hvVar) {
                        return hvVar;
                    }
                    return od2Var;
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
                r31 r31Var4 = knVar.u;
                if (r31Var4 != null) {
                    ti1 ti1Var = new ti1(si1Var);
                    this.g = 1;
                    if (r31Var4.a(ti1Var, this) == hvVar) {
                        return hvVar;
                    }
                    return od2Var;
                }
                return od2Var;
        }
    }
}
