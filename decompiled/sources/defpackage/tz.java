package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class tz implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ vz f;

    public /* synthetic */ tz(vz vzVar, int i) {
        this.e = i;
        this.f = vzVar;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int i = this.e;
        vz vzVar = this.f;
        switch (i) {
            case 0:
                uo1 uo1Var = (uo1) hp.s(vzVar, xo1.a);
                g9 g9Var = vzVar.y;
                if (uo1Var == null) {
                    if (g9Var != null) {
                        vzVar.M0(g9Var);
                    }
                    vzVar.y = null;
                } else if (g9Var == null) {
                    uz uzVar = new uz(vzVar, 0);
                    tz tzVar = new tz(vzVar, 1);
                    r31 r31Var = vzVar.u;
                    boolean z = vzVar.v;
                    float f = vzVar.w;
                    dc2 dc2Var = yo1.a;
                    g9 g9Var2 = new g9(r31Var, z, f, uzVar, tzVar);
                    vzVar.L0(g9Var2);
                    vzVar.y = g9Var2;
                }
                return od2.a;
            default:
                return sn0.K;
        }
    }
}
