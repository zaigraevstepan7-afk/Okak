package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ub0 {
    public final void a(e01 e01Var, e01 e01Var2, long j) {
        long q = io.q(j, or0.e);
        if (e01Var != null) {
            int n = e01Var.n(us.g(q));
            new sm0(sm0.a(n, e01Var.Y(n)));
        }
        if (e01Var2 != null) {
            int n2 = e01Var2.n(us.g(q));
            new sm0(sm0.a(n2, e01Var2.Y(n2)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof ub0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + l90.b(0, tb0.e.hashCode() * 31, 31);
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + tb0.e + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
