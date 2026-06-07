package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class st implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ st(boolean z, oe0 oe0Var) {
        this.e = 3;
        this.g = oe0Var;
        this.f = z;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        m41 i;
        int i2 = this.e;
        od2 od2Var = od2.a;
        boolean z = this.f;
        Object obj = this.g;
        switch (i2) {
            case 0:
                de0 de0Var = (de0) obj;
                if (z) {
                    de0Var.invoke();
                }
                return od2Var;
            case 1:
                b8 b8Var = (b8) obj;
                if (z && (i = b8Var.i()) != null) {
                    ((sw1) i).q(od2Var);
                }
                return od2Var;
            case 2:
                oc0 oc0Var = (oc0) obj;
                if (z) {
                    oc0.a(oc0Var);
                }
                return od2Var;
            default:
                ((oe0) obj).invoke(Boolean.valueOf(!z));
                return od2Var;
        }
    }

    public /* synthetic */ st(int i, Object obj, boolean z) {
        this.e = i;
        this.f = z;
        this.g = obj;
    }
}
