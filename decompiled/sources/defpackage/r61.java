package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class r61 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ia0 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ boolean h;

    public /* synthetic */ r61(ia0 ia0Var, float f, boolean z, int i) {
        this.e = i;
        this.f = ia0Var;
        this.g = f;
        this.h = z;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        float f;
        float f2;
        int i = this.e;
        od2 od2Var = od2.a;
        float f3 = 0.0f;
        float f4 = 1.0f;
        boolean z = this.h;
        float f5 = this.g;
        ia0 ia0Var = this.f;
        io1 io1Var = (io1) obj;
        switch (i) {
            case 0:
                float invoke = ia0Var.invoke();
                if (invoke > 0.0f) {
                    f = 1.0f / ((invoke / f5) + 1.0f);
                } else {
                    f = 1.0f;
                }
                io1Var.j(f);
                if (z) {
                    f4 = 0.0f;
                }
                io1Var.o(yq1.a(f4, 0.0f));
                return od2Var;
            default:
                float invoke2 = ia0Var.invoke();
                if (invoke2 > 0.0f) {
                    f2 = (invoke2 / f5) + 1.0f;
                } else {
                    f2 = 1.0f;
                }
                io1Var.j(f2);
                if (!z) {
                    f3 = 1.0f;
                }
                io1Var.o(yq1.a(f3, 0.5f));
                return od2Var;
        }
    }
}
