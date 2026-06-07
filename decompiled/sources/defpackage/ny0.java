package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ny0 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ b72 f;

    public /* synthetic */ ny0(b72 b72Var, int i) {
        this.e = i;
        this.f = b72Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int i = this.e;
        od2 od2Var = od2.a;
        b72 b72Var = this.f;
        switch (i) {
            case 0:
                b72Var.a();
                return od2Var;
            default:
                b72Var.onCancel();
                return od2Var;
        }
    }
}
