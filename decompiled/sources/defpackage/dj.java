package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class dj implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ex1 f;

    public /* synthetic */ dj(ex1 ex1Var, int i) {
        this.e = i;
        this.f = ex1Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        float f;
        float f2;
        int i = this.e;
        od2 od2Var = od2.a;
        float f3 = 1.0f;
        ex1 ex1Var = this.f;
        switch (i) {
            case 0:
                io1 io1Var = (io1) obj;
                n4 n4Var = ex1Var.d;
                float g = n4Var.j.g();
                float e = n4Var.c().e();
                if (g < e) {
                    f = e - g;
                } else {
                    f = 0.0f;
                }
                if (f > 0.0f) {
                    f3 = (Float.intBitsToFloat((int) (io1Var.r & 4294967295L)) + f) / Float.intBitsToFloat((int) (io1Var.r & 4294967295L));
                }
                io1Var.k(f3);
                io1Var.o(yq1.a(0.5f, 0.0f));
                return od2Var;
            case 1:
                io1 io1Var2 = (io1) obj;
                n4 n4Var2 = ex1Var.d;
                float g2 = n4Var2.j.g();
                float e2 = n4Var2.c().e();
                if (g2 < e2) {
                    f2 = e2 - g2;
                } else {
                    f2 = 0.0f;
                }
                if (f2 > 0.0f) {
                    f3 = 1.0f / ((Float.intBitsToFloat((int) (io1Var2.r & 4294967295L)) + f2) / Float.intBitsToFloat((int) (4294967295L & io1Var2.r)));
                }
                io1Var2.k(f3);
                io1Var2.o(yq1.a(0.5f, 0.0f));
                return od2Var;
            default:
                ((Float) obj).getClass();
                return Float.valueOf(((Number) ex1Var.b.invoke()).floatValue());
        }
    }
}
