package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yu1 extends cq0 implements se0 {
    public static final yu1 f;
    public static final yu1 g;
    public final /* synthetic */ int e;

    static {
        int i = 2;
        f = new yu1(i, 0);
        g = new yu1(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yu1(int i, int i2) {
        super(i);
        this.e = i2;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                if (obj == null) {
                    return obj2;
                }
                return obj;
            default:
                ru1 ru1Var = (ru1) obj2;
                Object valueOf = Float.valueOf(0.0f);
                mu1 mu1Var = ((ru1) obj).d;
                zu1 zu1Var = vu1.t;
                Object g2 = mu1Var.e.g(zu1Var);
                if (g2 == null) {
                    g2 = valueOf;
                }
                float floatValue = ((Number) g2).floatValue();
                Object g3 = ru1Var.d.e.g(zu1Var);
                if (g3 != null) {
                    valueOf = g3;
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) valueOf).floatValue()));
        }
    }
}
