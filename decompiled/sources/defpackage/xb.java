package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xb extends cq0 implements te0 {
    public final /* synthetic */ oe0 e;
    public final /* synthetic */ lb2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(oe0 oe0Var, lb2 lb2Var) {
        super(3);
        this.e = oe0Var;
        this.f = lb2Var;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        l01 l01Var = (l01) obj;
        ig1 x = ((e01) obj2).x(((us) obj3).a);
        if (l01Var.S()) {
            if (!((Boolean) this.e.invoke(this.f.d.getValue())).booleanValue()) {
                j = 0;
                return l01Var.s0((int) (j >> 32), (int) (4294967295L & j), m60.e, new b5(x, 2));
            }
        }
        j = (x.e << 32) | (x.f & 4294967295L);
        return l01Var.s0((int) (j >> 32), (int) (4294967295L & j), m60.e, new b5(x, 2));
    }
}
