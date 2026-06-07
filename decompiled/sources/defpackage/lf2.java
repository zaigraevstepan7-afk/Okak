package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class lf2 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ vf2 f;

    public /* synthetic */ lf2(vf2 vf2Var, int i) {
        this.e = i;
        this.f = vf2Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        od2 od2Var = od2.a;
        vt vtVar = null;
        vf2 vf2Var = this.f;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                vf2Var.getClass();
                rx.C(rx.x(vf2Var), null, new uf2(vf2Var, booleanValue, null), 3);
                return od2Var;
            default:
                ef2 ef2Var = (ef2) obj;
                ef2Var.getClass();
                vf2Var.getClass();
                rx.C(rx.x(vf2Var), null, new b31(ef2Var, vf2Var, vtVar, 13), 3);
                return od2Var;
        }
    }
}
