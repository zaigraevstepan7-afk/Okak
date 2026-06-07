package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class fb2 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ lb2 f;

    public /* synthetic */ fb2(lb2 lb2Var, int i) {
        this.e = i;
        this.f = lb2Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        boolean z;
        int i = this.e;
        lb2 lb2Var = this.f;
        switch (i) {
            case 0:
                if (sn0.r(lb2Var.d.getValue(), lb2Var.a.c()) && lb2Var.g.g() == Long.MIN_VALUE && !((Boolean) lb2Var.h.getValue()).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Long.valueOf(lb2Var.b());
        }
    }
}
