package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class w60 extends cq0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ oe0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w60(oe0 oe0Var, int i) {
        super(1);
        this.e = i;
        this.f = oe0Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        oe0 oe0Var = this.f;
        switch (i) {
            case 0:
                return new en0((((Number) oe0Var.invoke(Integer.valueOf((int) (r4 & 4294967295L)))).intValue() & 4294967295L) | (((int) (((en0) obj).a >> 32)) << 32));
            case 1:
                return new en0((((Number) oe0Var.invoke(Integer.valueOf((int) (r4 & 4294967295L)))).intValue() & 4294967295L) | (((int) (((en0) obj).a >> 32)) << 32));
            case 2:
                return new xm0(((Number) oe0Var.invoke(Integer.valueOf((int) (((en0) obj).a & 4294967295L)))).intValue() & 4294967295L);
            default:
                return new xm0(((Number) oe0Var.invoke(Integer.valueOf((int) (((en0) obj).a & 4294967295L)))).intValue() & 4294967295L);
        }
    }
}
