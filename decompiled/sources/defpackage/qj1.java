package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class qj1 implements oe0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;

    public /* synthetic */ qj1(float f, rn rnVar) {
        this.f = f;
        this.g = rnVar;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.e;
        od2 od2Var = od2.a;
        float f = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                rn rnVar = (rn) obj2;
                xu1.d((av1) obj, new kj1(((Number) go.r(Float.valueOf(f), rnVar)).floatValue(), rnVar));
                return od2Var;
            default:
                lb2 lb2Var = (lb2) obj2;
                long longValue = ((Long) obj).longValue();
                boolean g = lb2Var.g();
                he1 he1Var = lb2Var.g;
                if (!g) {
                    if (he1Var.g() == Long.MIN_VALUE) {
                        he1Var.h(longValue);
                        ((je1) lb2Var.a.a).setValue(Boolean.TRUE);
                    }
                    long g2 = longValue - he1Var.g();
                    if (f != 0.0f) {
                        g2 = c01.S(g2 / f);
                    }
                    lb2Var.n(g2);
                    if (f == 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    lb2Var.h(g2, z);
                }
                return od2Var;
        }
    }

    public /* synthetic */ qj1(lb2 lb2Var, float f) {
        this.g = lb2Var;
        this.f = f;
    }
}
