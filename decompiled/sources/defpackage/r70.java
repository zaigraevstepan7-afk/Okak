package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class r70 implements th2 {
    public final th2 a;
    public final th2 b;

    public r70(th2 th2Var, th2 th2Var2) {
        this.a = th2Var;
        this.b = th2Var2;
    }

    @Override // defpackage.th2
    public final int a(c00 c00Var) {
        int a = this.a.a(c00Var) - this.b.a(c00Var);
        if (a < 0) {
            return 0;
        }
        return a;
    }

    @Override // defpackage.th2
    public final int b(c00 c00Var, jq0 jq0Var) {
        int b = this.a.b(c00Var, jq0Var) - this.b.b(c00Var, jq0Var);
        if (b < 0) {
            return 0;
        }
        return b;
    }

    @Override // defpackage.th2
    public final int c(c00 c00Var) {
        int c = this.a.c(c00Var) - this.b.c(c00Var);
        if (c < 0) {
            return 0;
        }
        return c;
    }

    @Override // defpackage.th2
    public final int d(c00 c00Var, jq0 jq0Var) {
        int d = this.a.d(c00Var, jq0Var) - this.b.d(c00Var, jq0Var);
        if (d < 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r70)) {
            return false;
        }
        r70 r70Var = (r70) obj;
        if (sn0.r(r70Var.a, this.a) && sn0.r(r70Var.b, this.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.a + " - " + this.b + ')';
    }
}
