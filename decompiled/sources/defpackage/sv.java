package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sv implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ lb2 f;

    public /* synthetic */ sv(lb2 lb2Var, int i) {
        this.e = i;
        this.f = lb2Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int i = this.e;
        lb2 lb2Var = this.f;
        switch (i) {
            case 0:
                return lb2Var.d.getValue();
            default:
                return lb2Var.f();
        }
    }
}
