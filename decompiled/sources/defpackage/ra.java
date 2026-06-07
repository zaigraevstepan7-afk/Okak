package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ra implements va0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ va0 f;

    public /* synthetic */ ra(va0 va0Var, int i) {
        this.e = i;
        this.f = va0Var;
    }

    @Override // defpackage.va0
    public final Object a(wa0 wa0Var, vt vtVar) {
        int i = this.e;
        od2 od2Var = od2.a;
        hv hvVar = hv.e;
        va0 va0Var = this.f;
        switch (i) {
            case 0:
                Object a = va0Var.a(new qa(wa0Var, 0), vtVar);
                if (a == hvVar) {
                    return a;
                }
                return od2Var;
            default:
                Object a2 = va0Var.a(new qa(wa0Var, 3), vtVar);
                if (a2 == hvVar) {
                    return a2;
                }
                return od2Var;
        }
    }
}
