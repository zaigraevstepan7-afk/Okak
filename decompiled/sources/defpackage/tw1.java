package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tw1 extends r0 {
    public long a;
    public pl b;

    @Override // defpackage.r0
    public final boolean a(q0 q0Var) {
        sw1 sw1Var = (sw1) q0Var;
        if (this.a >= 0) {
            return false;
        }
        long j = sw1Var.m;
        if (j < sw1Var.n) {
            sw1Var.n = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.r0
    public final vt[] b(q0 q0Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((sw1) q0Var).v(j);
    }
}
