package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ld2 implements th2 {
    public final th2 a;
    public final th2 b;

    public ld2(th2 th2Var, th2 th2Var2) {
        this.a = th2Var;
        this.b = th2Var2;
    }

    @Override // defpackage.th2
    public final int a(c00 c00Var) {
        return Math.max(this.a.a(c00Var), this.b.a(c00Var));
    }

    @Override // defpackage.th2
    public final int b(c00 c00Var, jq0 jq0Var) {
        return Math.max(this.a.b(c00Var, jq0Var), this.b.b(c00Var, jq0Var));
    }

    @Override // defpackage.th2
    public final int c(c00 c00Var) {
        return Math.max(this.a.c(c00Var), this.b.c(c00Var));
    }

    @Override // defpackage.th2
    public final int d(c00 c00Var, jq0 jq0Var) {
        return Math.max(this.a.d(c00Var, jq0Var), this.b.d(c00Var, jq0Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld2)) {
            return false;
        }
        ld2 ld2Var = (ld2) obj;
        if (sn0.r(ld2Var.a, this.a) && sn0.r(ld2Var.b, this.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ')';
    }
}
