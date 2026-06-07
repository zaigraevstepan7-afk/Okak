package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class t01 implements oe0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ t01(sl1 sl1Var, sl1 sl1Var2, j51 j51Var, boolean z, te teVar) {
        this.g = sl1Var;
        this.h = sl1Var2;
        this.i = j51Var;
        this.f = z;
        this.j = teVar;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        float f;
        int i = this.e;
        od2 od2Var = od2.a;
        Object obj2 = this.j;
        boolean z = this.f;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                je1 je1Var = ((p41) obj5).c;
                o41 o41Var = (o41) obj4;
                o22 o22Var = (o22) obj3;
                o22 o22Var2 = (o22) obj2;
                io1 io1Var = (io1) obj;
                float f2 = 0.8f;
                float f3 = 1.0f;
                if (!z) {
                    f = ((Number) o22Var.getValue()).floatValue();
                } else if (((Boolean) je1Var.getValue()).booleanValue()) {
                    f = 1.0f;
                } else {
                    f = 0.8f;
                }
                io1Var.j(f);
                if (!z) {
                    f2 = ((Number) o22Var.getValue()).floatValue();
                } else if (((Boolean) je1Var.getValue()).booleanValue()) {
                    f2 = 1.0f;
                }
                io1Var.k(f2);
                if (!z) {
                    f3 = ((Number) o22Var2.getValue()).floatValue();
                } else if (!((Boolean) je1Var.getValue()).booleanValue()) {
                    f3 = 0.0f;
                }
                io1Var.c(f3);
                io1Var.o(((cb2) o41Var.getValue()).a);
                return od2Var;
            default:
                d51 d51Var = (d51) obj;
                d51Var.getClass();
                ((sl1) obj5).e = true;
                ((sl1) obj4).e = true;
                ((j51) obj3).m(d51Var, z, (te) obj2);
                return od2Var;
        }
    }

    public /* synthetic */ t01(boolean z, p41 p41Var, o41 o41Var, kb2 kb2Var, kb2 kb2Var2) {
        this.f = z;
        this.g = p41Var;
        this.h = o41Var;
        this.i = kb2Var;
        this.j = kb2Var2;
    }
}
