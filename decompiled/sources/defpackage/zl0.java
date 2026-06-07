package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class zl0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ am0 f;

    public /* synthetic */ zl0(am0 am0Var, int i) {
        this.e = i;
        this.f = am0Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        am0 am0Var = this.f;
        ub2 ub2Var = (ub2) obj;
        switch (i) {
            case 0:
                ub2Var.getClass();
                am0 am0Var2 = (am0) ub2Var;
                th2 th2Var = am0Var.t;
                if (!sn0.r(am0Var2.s, th2Var)) {
                    am0Var2.s = th2Var;
                    am0Var2.M0();
                }
                return tb2.f;
            default:
                ub2Var.getClass();
                am0Var.s = ((am0) ub2Var).t;
                return Boolean.FALSE;
        }
    }
}
