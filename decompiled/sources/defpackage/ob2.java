package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ob2 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ lb2 f;

    public /* synthetic */ ob2(lb2 lb2Var, int i) {
        this.e = i;
        this.f = lb2Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        lb2 lb2Var = this.f;
        switch (i) {
            case 0:
                return new pb2(lb2Var, 0);
            default:
                return new pb2(lb2Var, 1);
        }
    }
}
