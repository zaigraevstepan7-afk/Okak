package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class v6 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;

    public /* synthetic */ v6(int i, long j) {
        this.e = i;
        this.f = j;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        pl plVar;
        Object fo1Var;
        int i = this.e;
        od2 od2Var = od2.a;
        long j = this.f;
        switch (i) {
            case 0:
                dl dlVar = (dl) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (dlVar.e.d() >> 32)) / 2.0f;
                return dlVar.b(new w6(intBitsToFloat, d6.u(dlVar, intBitsToFloat), new ni(5, j), 0));
            case 1:
                ak akVar = (ak) obj;
                oe0 oe0Var = akVar.b;
                if (oe0Var != null && (plVar = akVar.a) != null) {
                    try {
                        fo1Var = oe0Var.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        fo1Var = new fo1(th);
                    }
                    plVar.resumeWith(fo1Var);
                }
                return od2Var;
            case 2:
                ((av1) obj).a(gu1.a, new fu1(hg0.e, this.f, eu1.f, true));
                return od2Var;
            default:
                c40 c40Var = (c40) obj;
                float min = Math.min(c40Var.W(4.0f), Float.intBitsToFloat((int) (c40Var.d() & 4294967295L)));
                float W = c40Var.W(6.0f);
                float intBitsToFloat2 = (Float.intBitsToFloat((int) (c40Var.d() & 4294967295L)) - min) / 2.0f;
                if (intBitsToFloat2 <= W) {
                    W = intBitsToFloat2;
                }
                if (c40Var.getLayoutDirection() == jq0.f) {
                    long l0 = c40Var.l0();
                    ld b0 = c40Var.b0();
                    long k = b0.k();
                    b0.h().h();
                    try {
                        ((rg2) b0.f).z(-1.0f, 1.0f, l0);
                        hp.u(c40Var, j, min, W);
                    } finally {
                        l90.v(b0, k);
                    }
                } else {
                    hp.u(c40Var, j, min, W);
                }
                return od2Var;
        }
    }
}
