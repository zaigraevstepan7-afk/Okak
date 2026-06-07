package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class e92 {
    public final long a;
    public final long b;

    public e92(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e92)) {
            return false;
        }
        e92 e92Var = (e92) obj;
        if (co.c(this.a, e92Var.a) && co.c(this.b, e92Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = co.h;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        l90.u(this.a, sb, ", selectionBackgroundColor=");
        sb.append((Object) co.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}
