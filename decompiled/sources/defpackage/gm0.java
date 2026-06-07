package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gm0 implements pc1 {
    public final th2 a;
    public final c00 b;

    public gm0(th2 th2Var, c42 c42Var) {
        this.a = th2Var;
        this.b = c42Var;
    }

    @Override // defpackage.pc1
    public final float a() {
        th2 th2Var = this.a;
        c00 c00Var = this.b;
        return c00Var.K(th2Var.c(c00Var));
    }

    @Override // defpackage.pc1
    public final float b(jq0 jq0Var) {
        th2 th2Var = this.a;
        c00 c00Var = this.b;
        return c00Var.K(th2Var.d(c00Var, jq0Var));
    }

    @Override // defpackage.pc1
    public final float c(jq0 jq0Var) {
        th2 th2Var = this.a;
        c00 c00Var = this.b;
        return c00Var.K(th2Var.b(c00Var, jq0Var));
    }

    @Override // defpackage.pc1
    public final float d() {
        th2 th2Var = this.a;
        c00 c00Var = this.b;
        return c00Var.K(th2Var.a(c00Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm0)) {
            return false;
        }
        gm0 gm0Var = (gm0) obj;
        if (sn0.r(this.a, gm0Var.a) && sn0.r(this.b, gm0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ')';
    }
}
