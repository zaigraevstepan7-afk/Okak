package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bk implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bk(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        od2 od2Var = od2.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ((ql) obj2).cancel();
                return od2Var;
            case 1:
                ((pl) obj2).resumeWith(od2Var);
                return od2Var;
            default:
                float[] fArr = ((d01) obj).a;
                iq0 iq0Var = (iq0) obj2;
                if (iq0Var.j()) {
                    qo.D(iq0Var).l(iq0Var, fArr);
                }
                return od2Var;
        }
    }
}
