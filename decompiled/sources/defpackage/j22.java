package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class j22 implements gc {
    public final gc a;
    public final long b;

    public j22(u90 u90Var, long j) {
        this.a = u90Var;
        this.b = j;
    }

    @Override // defpackage.gc
    public final qe2 a(ec2 ec2Var) {
        return new k22(this.a.a(ec2Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j22)) {
            return false;
        }
        j22 j22Var = (j22) obj;
        if (j22Var.b != this.b || !sn0.r(j22Var.a, this.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
