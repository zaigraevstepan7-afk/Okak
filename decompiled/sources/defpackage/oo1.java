package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class oo1 extends cq0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ po1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oo1(po1 po1Var, int i) {
        super(1);
        this.e = i;
        this.f = po1Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        po1 po1Var = this.f;
        switch (i) {
            case 0:
                return Double.valueOf(po1Var.n.b(go.n(((Number) obj).doubleValue(), po1Var.e, po1Var.f)));
            default:
                return Double.valueOf(go.n(po1Var.k.b(((Number) obj).doubleValue()), po1Var.e, po1Var.f));
        }
    }
}
