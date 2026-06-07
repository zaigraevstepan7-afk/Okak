package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zm1 {
    public final String a;
    public final an1 b;
    public final String c;
    public final long d;

    public zm1(String str, an1 an1Var, String str2, long j) {
        this.a = str;
        this.b = an1Var;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zm1) {
                zm1 zm1Var = (zm1) obj;
                if (!this.a.equals(zm1Var.a) || this.b != zm1Var.b || !this.c.equals(zm1Var.c) || this.d != zm1Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + l90.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "ResourceItem(name=" + this.a + ", type=" + this.b + ", path=" + this.c + ", size=" + this.d + ")";
    }
}
