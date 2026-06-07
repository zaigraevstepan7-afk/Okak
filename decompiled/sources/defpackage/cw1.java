package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cw1 extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ ew1 h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cw1(ew1 ew1Var, boolean z, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = ew1Var;
        this.i = z;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        switch (this.f) {
            case 0:
                return new cw1(this.h, this.i, vtVar, 0);
            default:
                return new cw1(this.h, this.i, vtVar, 1);
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
                return ((cw1) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((cw1) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        boolean z = this.i;
        ew1 ew1Var = this.h;
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
                    rw rwVar = ew1Var.b;
                    this.g = 1;
                    Object i3 = rwVar.a.i(new kw(z, null), this);
                    if (i3 != hvVar) {
                        i3 = od2Var;
                    }
                    if (i3 == hvVar) {
                        return hvVar;
                    }
                }
                return od2Var;
            default:
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
                    rw rwVar2 = ew1Var.b;
                    this.g = 1;
                    Object i5 = rwVar2.a.i(new lw(z, null), this);
                    if (i5 != hvVar) {
                        i5 = od2Var;
                    }
                    if (i5 == hvVar) {
                        return hvVar;
                    }
                }
                return od2Var;
        }
    }
}
