package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class nf0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ oe0 f;

    public /* synthetic */ nf0(oe0 oe0Var, int i) {
        this.e = i;
        this.f = oe0Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        long j;
        switch (this.e) {
            case 0:
                o02 o02Var = (o02) obj;
                synchronized (q02.c) {
                    j = q02.e;
                    q02.e = 1 + j;
                }
                return new xk1(j, o02Var, this.f);
            default:
                return this.f.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
