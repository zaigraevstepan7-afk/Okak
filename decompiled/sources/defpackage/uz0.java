package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class uz0 {
    public final String a;
    public final an0 b;

    public uz0(String str, an0 an0Var) {
        this.a = str;
        this.b = an0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uz0) {
                uz0 uz0Var = (uz0) obj;
                if (!this.a.equals(uz0Var.a) || !this.b.equals(uz0Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
