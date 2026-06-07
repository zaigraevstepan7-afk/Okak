package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class s9 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ x9 f;
    public final /* synthetic */ i62 g;

    public /* synthetic */ s9(x9 x9Var, i62 i62Var, int i) {
        this.e = i;
        this.f = x9Var;
        this.g = i62Var;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, wl1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, wl1] */
    @Override // defpackage.de0
    public final Object invoke() {
        int i = this.e;
        int i2 = 1;
        int i3 = 2;
        Object obj = null;
        i62 i62Var = this.g;
        x9 x9Var = this.f;
        switch (i) {
            case 0:
                r9 r9Var = x9Var.f;
                v3 v3Var = new v3(i62Var, i3);
                ?? obj2 = new Object();
                x9Var.e.c("dataBuilder", r9Var, new j1(i2, (Object) obj2, v3Var));
                Object obj3 = obj2.e;
                if (obj3 != null) {
                    return (h62) obj3;
                }
                sn0.V("result");
                throw null;
            case 1:
                r9 r9Var2 = x9Var.g;
                s9 s9Var = new s9(x9Var, i62Var, i3);
                ?? obj4 = new Object();
                x9Var.e.c("positioner", r9Var2, new j1(i2, (Object) obj4, s9Var));
                Object obj5 = obj4.e;
                if (obj5 != null) {
                    return (pl1) obj5;
                }
                sn0.V("result");
                throw null;
            default:
                Object invoke = x9Var.c.invoke();
                if (((iq0) invoke).j()) {
                    obj = invoke;
                }
                iq0 iq0Var = (iq0) obj;
                if (iq0Var == null) {
                    return pl1.e;
                }
                return i62Var.k(iq0Var).i(iq0Var.Q(0L));
        }
    }
}
