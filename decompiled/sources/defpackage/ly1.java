package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ly1 {
    public final oe0 a;
    public final dc2 b;

    public ly1(oe0 oe0Var, dc2 dc2Var) {
        this.a = oe0Var;
        this.b = dc2Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ly1) {
                ly1 ly1Var = (ly1) obj;
                if (!this.a.equals(ly1Var.a) || !this.b.equals(ly1Var.b)) {
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
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
