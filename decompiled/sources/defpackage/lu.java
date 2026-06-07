package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class lu extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ uh1 h;
    public final /* synthetic */ b72 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lu(uh1 uh1Var, b72 b72Var, vt vtVar, int i) {
        super(2, vtVar);
        this.f = i;
        this.h = uh1Var;
        this.i = b72Var;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        switch (this.f) {
            case 0:
                return new lu(this.h, this.i, vtVar, 0);
            case 1:
                return new lu(this.h, this.i, vtVar, 1);
            default:
                return new lu(this.h, this.i, vtVar, 2);
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
                return ((lu) create(gvVar, vtVar)).invokeSuspend(od2Var);
            case 1:
                return ((lu) create(gvVar, vtVar)).invokeSuspend(od2Var);
            default:
                return ((lu) create(gvVar, vtVar)).invokeSuspend(od2Var);
        }
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, vl1] */
    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        int i2 = 2;
        b72 b72Var = this.i;
        uh1 uh1Var = this.h;
        hv hvVar = hv.e;
        od2 od2Var = od2.a;
        vt vtVar = null;
        switch (i) {
            case 0:
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
                    this.g = 1;
                    Object u = fp.u(new tb(uh1Var, b72Var, vtVar, 3), this);
                    if (u != hvVar) {
                        u = od2Var;
                    }
                    if (u == hvVar) {
                        return hvVar;
                    }
                }
                return od2Var;
            case 1:
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
                    this.g = 1;
                    Object o = vn.o(uh1Var, new d(b72Var, vtVar, i2), this);
                    if (o != hvVar) {
                        o = od2Var;
                    }
                    if (o == hvVar) {
                        return hvVar;
                    }
                }
                return od2Var;
            default:
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
                    this.g = 1;
                    my0 my0Var = new my0(b72Var, 0);
                    ny0 ny0Var = new ny0(b72Var, 0);
                    ny0 ny0Var2 = new ny0(b72Var, 1);
                    h8 h8Var = new h8(b72Var, 10);
                    ol olVar = new ol(my0Var, 2);
                    r rVar = new r(ny0Var, 12);
                    h2 h2Var = new h2(18);
                    float f = g30.a;
                    Object o2 = vn.o(uh1Var, new e30(h2Var, new Object(), null, olVar, h8Var, ny0Var2, rVar, null), this);
                    if (o2 != hvVar) {
                        o2 = od2Var;
                    }
                    if (o2 != hvVar) {
                        o2 = od2Var;
                    }
                    if (o2 != hvVar) {
                        o2 = od2Var;
                    }
                    if (o2 == hvVar) {
                        return hvVar;
                    }
                }
                return od2Var;
        }
    }
}
