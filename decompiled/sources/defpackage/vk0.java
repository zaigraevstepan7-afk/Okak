package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class vk0 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ vk0(l40 l40Var, c00 c00Var, u90 u90Var, u90 u90Var2, u90 u90Var3) {
        this.e = 3;
        this.f = l40Var;
        this.g = c00Var;
        this.h = u90Var;
        this.i = u90Var2;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int i = this.e;
        int i2 = 0;
        vt vtVar = null;
        int i3 = 1;
        int i4 = 3;
        od2 od2Var = od2.a;
        Object obj = this.i;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                Float f = (Float) obj4;
                sk0 sk0Var = (sk0) obj2;
                Float f2 = (Float) obj3;
                rk0 rk0Var = (rk0) obj;
                if (!f.equals(sk0Var.e) || !f2.equals(sk0Var.f)) {
                    sk0Var.e = f;
                    sk0Var.f = f2;
                    sk0Var.h = new x52(rk0Var, f2.A, f, f2, null);
                    sk0Var.l.b.setValue(Boolean.TRUE);
                    sk0Var.i = false;
                    sk0Var.j = true;
                }
                return od2Var;
            case 1:
                rx.C((gv) obj4, null, new ey0((ex1) obj3, vtVar, i2), 3).r(new i(18, (ag) obj2, (de0) obj));
                return od2Var;
            case 2:
                ex1 ex1Var = (ex1) obj4;
                gv gvVar = (gv) obj3;
                ya yaVar = (ya) obj2;
                de0 de0Var = (de0) obj;
                if (ex1Var.c() == fx1.f && ex1Var.d.c().c(fx1.g)) {
                    rx.C(gvVar, null, new vw0(yaVar, vtVar, i3), 3);
                    rx.C(gvVar, null, new ey0(ex1Var, vtVar, 2), 3);
                } else {
                    rx.C(gvVar, null, new ey0(ex1Var, vtVar, i4), 3).r(new fd(de0Var, 1));
                }
                return od2Var;
            default:
                l40 l40Var = (l40) obj4;
                l40Var.c.setValue((c00) obj3);
                l40Var.d = (u90) obj2;
                l40Var.e = (u90) obj;
                return od2Var;
        }
    }

    public /* synthetic */ vk0(Float f, sk0 sk0Var, Float f2, rk0 rk0Var) {
        this.e = 0;
        this.f = f;
        this.h = sk0Var;
        this.g = f2;
        this.i = rk0Var;
    }

    public /* synthetic */ vk0(Object obj, Object obj2, Object obj3, de0 de0Var, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = de0Var;
    }
}
