package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class wg implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ wg(int i, Object obj, boolean z) {
        this.e = i;
        this.f = z;
        this.g = obj;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        float f;
        int i = this.e;
        od2 od2Var = od2.a;
        int i2 = 0;
        Object obj2 = this.g;
        boolean z = this.f;
        switch (i) {
            case 0:
                qq qqVar = (qq) obj2;
                ((tg) qqVar.a).e(z);
                ((sg) qqVar.b).f(z);
                return new yg((av0) obj, qqVar, 0);
            case 1:
                o22 o22Var = (o22) obj2;
                io1 io1Var = (io1) obj;
                io1Var.getClass();
                if (z) {
                    f = ((Number) o22Var.getValue()).floatValue();
                } else {
                    f = 0.0f;
                }
                io1Var.i(f);
                return od2Var;
            case 2:
                cr crVar = (cr) obj2;
                crVar.j(z);
                return new yg((av0) obj, crVar, 1);
            default:
                dz1 dz1Var = (dz1) obj2;
                av1 av1Var = (av1) obj;
                if (!z) {
                    ep0[] ep0VarArr = xu1.a;
                    av1Var.a(vu1.i, od2Var);
                }
                String valueOf = String.valueOf(c01.R(dz1Var.b.g() * 100.0f) / 100.0f);
                ep0[] ep0VarArr2 = xu1.a;
                zu1 zu1Var = vu1.b;
                ep0 ep0Var = xu1.a[0];
                av1Var.a(zu1Var, valueOf);
                av1Var.a(lu1.i, new s0(null, new sy1(dz1Var, i2)));
                return od2Var;
        }
    }

    public /* synthetic */ wg(x0 x0Var, boolean z, int i) {
        this.e = i;
        this.g = x0Var;
        this.f = z;
    }
}
