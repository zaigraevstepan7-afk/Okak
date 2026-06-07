package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class et0 implements de0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ft0 f;

    public /* synthetic */ et0(ft0 ft0Var, int i) {
        this.e = i;
        this.f = ft0Var;
    }

    @Override // defpackage.de0
    public final Object invoke() {
        int i = this.e;
        ft0 ft0Var = this.f;
        switch (i) {
            case 0:
                return Float.valueOf(ft0Var.t.b());
            case 1:
                return Float.valueOf(ft0Var.t.e());
            default:
                return Float.valueOf(ft0Var.t.a() - ft0Var.t.d());
        }
    }
}
