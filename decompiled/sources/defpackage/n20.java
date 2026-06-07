package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class n20 extends cq0 implements oe0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ sl1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n20(rg2 rg2Var, o20 o20Var, sl1 sl1Var) {
        super(1);
        this.f = sl1Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        tb2 tb2Var = tb2.e;
        sl1 sl1Var = this.f;
        switch (i) {
            case 0:
                o20 o20Var = (o20) obj;
                if (!o20Var.r) {
                    return tb2.f;
                }
                if (o20Var.t != null) {
                    kl0.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                o20Var.t = null;
                sl1Var.e = sl1Var.e;
                return tb2Var;
            default:
                if (((ki0) obj).u) {
                    sl1Var.e = false;
                    return tb2.g;
                }
                return tb2Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n20(sl1 sl1Var) {
        super(1);
        this.f = sl1Var;
    }
}
