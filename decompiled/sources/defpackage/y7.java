package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class y7 extends ef0 implements oe0 {
    public final /* synthetic */ bu0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(bu0 bu0Var) {
        super(1, bf.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.e = bu0Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        float[] fArr = ((d01) obj).a;
        iq0 iq0Var = (iq0) this.e.v.getValue();
        if (iq0Var != null) {
            if (!iq0Var.j()) {
                iq0Var = null;
            }
            if (iq0Var != null) {
                iq0Var.k(fArr);
            }
        }
        return od2.a;
    }
}
