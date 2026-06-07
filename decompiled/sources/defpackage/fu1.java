package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fu1 {
    public final hg0 a;
    public final long b;
    public final eu1 c;
    public final boolean d;

    public fu1(hg0 hg0Var, long j, eu1 eu1Var, boolean z) {
        this.a = hg0Var;
        this.b = j;
        this.c = eu1Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fu1) {
                fu1 fu1Var = (fu1) obj;
                if (this.a != fu1Var.a || !z81.b(this.b, fu1Var.b) || this.c != fu1Var.c || this.d != fu1Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + l90.e(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "SelectionHandleInfo(handle=" + this.a + ", position=" + ((Object) z81.g(this.b)) + ", anchor=" + this.c + ", visible=" + this.d + ')';
    }
}
