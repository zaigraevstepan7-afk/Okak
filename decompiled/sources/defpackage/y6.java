package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class y6 extends cq0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ b10 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6(b10 b10Var, int i) {
        super(1);
        this.e = i;
        this.f = b10Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        b10 b10Var = this.f;
        switch (i) {
            case 0:
                b10Var.show();
                return new m2(b10Var, 2);
            default:
                if (b10Var.j.a) {
                    b10Var.i.invoke();
                }
                return od2.a;
        }
    }
}
