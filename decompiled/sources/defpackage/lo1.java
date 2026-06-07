package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class lo1 implements b20 {
    public final /* synthetic */ int e;
    public final /* synthetic */ po1 f;

    public /* synthetic */ lo1(po1 po1Var, int i) {
        this.e = i;
        this.f = po1Var;
    }

    @Override // defpackage.b20
    public final double b(double d) {
        int i = this.e;
        po1 po1Var = this.f;
        switch (i) {
            case 0:
                return go.n(po1Var.k.b(d), po1Var.e, po1Var.f);
            default:
                return po1Var.n.b(go.n(d, po1Var.e, po1Var.f));
        }
    }
}
