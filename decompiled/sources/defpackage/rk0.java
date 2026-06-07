package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rk0 implements gc {
    public final t40 a;
    public final nm1 b;

    public rk0(t40 t40Var, nm1 nm1Var) {
        this.a = t40Var;
        this.b = nm1Var;
    }

    @Override // defpackage.gc
    public final qe2 a(ec2 ec2Var) {
        return new ve2(this.a.a(ec2Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rk0) {
            rk0 rk0Var = (rk0) obj;
            if (rk0Var.a.equals(this.a) && rk0Var.b == this.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
