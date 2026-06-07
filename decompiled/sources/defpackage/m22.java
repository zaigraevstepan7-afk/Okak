package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class m22 {
    public final long a;
    public final long b;

    public m22(long j, long j2) {
        this.a = j;
        this.b = j2;
        if (j >= 0) {
            if (j2 >= 0) {
                return;
            }
            y61.m("replayExpiration(", j2, " ms) cannot be negative");
            throw null;
        }
        y61.m("stopTimeout(", j, " ms) cannot be negative");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m22) {
            m22 m22Var = (m22) obj;
            if (this.a == m22Var.a && this.b == m22Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        vv0 vv0Var = new vv0(2);
        long j = this.a;
        if (j > 0) {
            vv0Var.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.b;
        if (j2 < Long.MAX_VALUE) {
            vv0Var.add("replayExpiration=" + j2 + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + wn.m0(xn.s(vv0Var), null, null, null, null, 63) + ')';
    }
}
