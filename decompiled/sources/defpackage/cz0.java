package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class cz0 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ dz0 f;

    public /* synthetic */ cz0(dz0 dz0Var, int i) {
        this.e = i;
        this.f = dz0Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        long j;
        int i = this.e;
        dz0 dz0Var = this.f;
        switch (i) {
            case 0:
                dz0Var.N0();
                return od2.a;
            case 1:
                return new z81(dz0Var.A);
            default:
                iq0 iq0Var = (iq0) dz0Var.y.getValue();
                if (iq0Var != null) {
                    j = iq0Var.Q(0L);
                } else {
                    j = 9205357640488583168L;
                }
                return new z81(j);
        }
    }
}
