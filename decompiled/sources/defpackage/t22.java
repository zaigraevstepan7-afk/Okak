package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class t22 extends w22 {
    public g0 c;
    public int d;
    public int e;

    public t22(long j, g0 g0Var) {
        super(j);
        this.c = g0Var;
    }

    @Override // defpackage.w22
    public final void a(w22 w22Var) {
        synchronized (c01.z) {
            w22Var.getClass();
            this.c = ((t22) w22Var).c;
            this.d = ((t22) w22Var).d;
            this.e = ((t22) w22Var).e;
        }
    }

    @Override // defpackage.w22
    public final w22 b(long j) {
        return new t22(j, this.c);
    }
}
