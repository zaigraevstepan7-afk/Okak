package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hh extends q42 implements se0 {
    public final /* synthetic */ int f;
    public int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hh(Object obj, int i, vt vtVar, int i2) {
        super(2, vtVar);
        this.f = i2;
        this.i = obj;
        this.h = i;
    }

    @Override // defpackage.eh
    public final vt create(Object obj, vt vtVar) {
        int i = this.f;
        int i2 = this.h;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                return new hh((ih) obj2, i2, vtVar, 0);
            case 1:
                return new hh((ft0) obj2, i2, vtVar, 1);
            case 2:
                return new hh((uy) obj2, i2, vtVar, 2);
            default:
                return new hh((ew1) obj2, i2, vtVar, 3);
        }
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                return ((hh) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 1:
                return ((hh) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
            case 2:
                return ((hh) create((ds1) obj, (vt) obj2)).invokeSuspend(od2Var);
            default:
                return ((hh) create((gv) obj, (vt) obj2)).invokeSuspend(od2Var);
        }
    }

    @Override // defpackage.eh
    public final Object invokeSuspend(Object obj) {
        int i = this.f;
        int i2 = this.h;
        Object obj2 = this.i;
        hv hvVar = hv.e;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                ih ihVar = (ih) obj2;
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
                    float g = ihVar.B.g();
                    ya a = fc2.a(g);
                    float f = 1.0f + g;
                    Float f2 = new Float(g);
                    Float f3 = new Float(f);
                    oe0 oe0Var = f2.A.a;
                    mc mcVar = (mc) oe0Var.invoke(f2);
                    if (mcVar == null) {
                        mcVar = a.h;
                    }
                    mc mcVar2 = (mc) oe0Var.invoke(f3);
                    if (mcVar2 == null) {
                        mcVar2 = a.i;
                    }
                    int b = mcVar.b();
                    for (int i4 = 0; i4 < b; i4++) {
                        if (mcVar.a(i4) > mcVar2.a(i4)) {
                            gi1.b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + mcVar + " is greater than upper bound " + mcVar2 + " on index " + i4);
                        }
                    }
                    a.j = mcVar;
                    a.k = mcVar2;
                    if (!a.e()) {
                        Object c = a.c(a.d());
                        if (!sn0.r(c, a.d())) {
                            a.c.f.setValue(c);
                        }
                    }
                    Float f4 = new Float(f);
                    rk0 y = mp0.y(mp0.P(i2, 2, y40.c), 4);
                    r rVar = new r(ihVar, 4);
                    this.g = 1;
                    if (ya.b(a, f4, y, rVar, this, 4) == hvVar) {
                        return hvVar;
                    }
                }
                return od2Var;
            case 1:
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
                    zs0 zs0Var = ((ft0) obj2).t;
                    this.g = 1;
                    if (zs0Var.c(i2, this) == hvVar) {
                        return hvVar;
                    }
                }
                return od2Var;
            case 2:
                uy uyVar = (uy) obj2;
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
                    this.g = 1;
                    if (uyVar.i(this) == hvVar) {
                        return hvVar;
                    }
                }
                uyVar.v(0.0f, uyVar.k(i2), true);
                return od2Var;
            default:
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
                rw rwVar = ((ew1) obj2).b;
                this.g = 1;
                rwVar.getClass();
                if (i2 >= 0 && i2 < 5) {
                    Object i8 = rwVar.a.i(new nw(i2, null), this);
                    if (i8 != hvVar) {
                        i8 = od2Var;
                    }
                    if (i8 == hvVar) {
                        return hvVar;
                    }
                    return od2Var;
                }
                se.e(l90.g(i2, "unknown language id: "));
                return null;
        }
    }
}
