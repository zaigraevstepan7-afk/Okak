package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cv0 implements th2 {
    public final th2 a;
    public final int b;

    public cv0(th2 th2Var, int i) {
        this.a = th2Var;
        this.b = i;
    }

    @Override // defpackage.th2
    public final int a(c00 c00Var) {
        if ((this.b & 16) != 0) {
            return this.a.a(c00Var);
        }
        return 0;
    }

    @Override // defpackage.th2
    public final int b(c00 c00Var, jq0 jq0Var) {
        int i;
        if (jq0Var == jq0.e) {
            i = 4;
        } else {
            i = 1;
        }
        if ((i & this.b) != 0) {
            return this.a.b(c00Var, jq0Var);
        }
        return 0;
    }

    @Override // defpackage.th2
    public final int c(c00 c00Var) {
        if ((this.b & 32) != 0) {
            return this.a.c(c00Var);
        }
        return 0;
    }

    @Override // defpackage.th2
    public final int d(c00 c00Var, jq0 jq0Var) {
        int i;
        if (jq0Var == jq0.e) {
            i = 8;
        } else {
            i = 2;
        }
        if ((i & this.b) != 0) {
            return this.a.d(c00Var, jq0Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv0)) {
            return false;
        }
        cv0 cv0Var = (cv0) obj;
        if (sn0.r(this.a, cv0Var.a) && this.b == cv0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.b;
        int i2 = yq1.a;
        if ((i & i2) == i2) {
            yq1.D(sb3, "Start");
        }
        int i3 = yq1.c;
        if ((i & i3) == i3) {
            yq1.D(sb3, "Left");
        }
        if ((i & 16) == 16) {
            yq1.D(sb3, "Top");
        }
        int i4 = yq1.b;
        if ((i & i4) == i4) {
            yq1.D(sb3, "End");
        }
        int i5 = yq1.d;
        if ((i & i5) == i5) {
            yq1.D(sb3, "Right");
        }
        if ((i & 32) == 32) {
            yq1.D(sb3, "Bottom");
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
