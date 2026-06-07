package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ps1 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ts1 f;

    public /* synthetic */ ps1(ts1 ts1Var, int i) {
        this.e = i;
        this.f = ts1Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int i = this.e;
        ts1 ts1Var = this.f;
        switch (i) {
            case 0:
                return Boolean.valueOf(ts1Var.r);
            default:
                tc0 tc0Var = ts1Var.T;
                if (!tc0Var.e.r) {
                    return null;
                }
                sc0 Q0 = tc0Var.Q0();
                int ordinal = Q0.ordinal();
                if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                    if (ordinal == 3) {
                        return null;
                    }
                    se.m();
                    return null;
                }
                if (Q0.a()) {
                    return tc0Var.O0(null);
                }
                tc0 f = ((mc0) ((q5) hp.N(tc0Var)).getFocusOwner()).f();
                if (f == null) {
                    return null;
                }
                return f.O0(hp.L(tc0Var));
        }
    }
}
