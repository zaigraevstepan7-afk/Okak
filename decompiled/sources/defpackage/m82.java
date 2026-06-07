package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class m82 {
    public static final m82 c = new m82(pp1.s(0), pp1.s(0));
    public final long a;
    public final long b;

    public m82(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m82)) {
            return false;
        }
        m82 m82Var = (m82) obj;
        if (n92.a(this.a, m82Var.a) && n92.a(this.b, m82Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        o92[] o92VarArr = n92.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) n92.d(this.a)) + ", restLine=" + ((Object) n92.d(this.b)) + ')';
    }
}
