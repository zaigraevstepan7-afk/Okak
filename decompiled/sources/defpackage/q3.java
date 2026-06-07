package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class q3 implements x01 {
    public final ii a;
    public final ii b;

    public q3(ii iiVar, ii iiVar2) {
        this.a = iiVar;
        this.b = iiVar2;
    }

    @Override // defpackage.x01
    public final int a(bn0 bn0Var, long j, int i, jq0 jq0Var) {
        int a = this.b.a(0, bn0Var.c(), jq0Var);
        return bn0Var.a + a + (-this.a.a(0, i, jq0Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q3) {
            q3 q3Var = (q3) obj;
            if (this.a.equals(q3Var.a) && this.b.equals(q3Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + l90.a(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        return "Horizontal(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ", offset=0)";
    }
}
