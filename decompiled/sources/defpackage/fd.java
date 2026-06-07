package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class fd implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ de0 f;

    public /* synthetic */ fd(de0 de0Var, int i) {
        this.e = i;
        this.f = de0Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        float f;
        float f2;
        int i = this.e;
        Object obj2 = null;
        od2 od2Var = od2.a;
        de0 de0Var = this.f;
        switch (i) {
            case 0:
                ((io1) obj).c(((Number) de0Var.invoke()).floatValue());
                return od2Var;
            case 1:
                de0Var.invoke();
                return od2Var;
            case 2:
                de0Var.invoke();
                return od2Var;
            case 3:
                de0Var.invoke();
                return od2Var;
            case 4:
                av1 av1Var = (av1) obj;
                Object invoke = de0Var.invoke();
                if (!Float.isNaN(((Number) invoke).floatValue())) {
                    obj2 = invoke;
                }
                Float f3 = (Float) obj2;
                if (f3 != null) {
                    f = f3.floatValue();
                } else {
                    f = 0.0f;
                }
                xu1.d(av1Var, new kj1(f, new rn(0.0f, 1.0f)));
                return od2Var;
            case 5:
                return (z81) de0Var.invoke();
            default:
                av1 av1Var2 = (av1) obj;
                Object invoke2 = de0Var.invoke();
                if (!Float.isNaN(((Number) invoke2).floatValue())) {
                    obj2 = invoke2;
                }
                Float f4 = (Float) obj2;
                if (f4 != null) {
                    f2 = f4.floatValue();
                } else {
                    f2 = 0.0f;
                }
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                xu1.d(av1Var2, new kj1(f2, new rn(0.0f, 1.0f)));
                return od2Var;
        }
    }
}
