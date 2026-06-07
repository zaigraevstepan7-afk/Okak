package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class h5 extends cq0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ wl1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h5(wl1 wl1Var, int i) {
        super(1);
        this.e = i;
        this.f = wl1Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.e;
        wl1 wl1Var = this.f;
        switch (i) {
            case 0:
                wl1Var.e = (tc0) obj;
                return Boolean.TRUE;
            case 1:
                ki0 ki0Var = (ki0) obj;
                Object obj2 = wl1Var.e;
                if (obj2 == null && ki0Var.u) {
                    wl1Var.e = ki0Var;
                } else if (obj2 != null) {
                    ki0Var.getClass();
                }
                return Boolean.TRUE;
            default:
                qz qzVar = (ub2) obj;
                if (((d21) qzVar).e.r) {
                    wl1Var.e = qzVar;
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
