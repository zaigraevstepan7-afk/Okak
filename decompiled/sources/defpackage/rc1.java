package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rc1 implements pc1 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public rc1(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2;
        boolean z3;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (f2 >= 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z & z2;
        if (f3 >= 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!(z4 & z3 & (f4 >= 0.0f))) {
            il0.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.pc1
    public final float a() {
        return this.d;
    }

    @Override // defpackage.pc1
    public final float b(jq0 jq0Var) {
        if (jq0Var == jq0.e) {
            return this.a;
        }
        return this.c;
    }

    @Override // defpackage.pc1
    public final float c(jq0 jq0Var) {
        if (jq0Var == jq0.e) {
            return this.c;
        }
        return this.a;
    }

    @Override // defpackage.pc1
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rc1) {
            rc1 rc1Var = (rc1) obj;
            if (f20.b(this.a, rc1Var.a) && f20.b(this.b, rc1Var.b) && f20.b(this.c, rc1Var.c) && f20.b(this.d, rc1Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + l90.a(this.c, l90.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) f20.c(this.a)) + ", top=" + ((Object) f20.c(this.b)) + ", end=" + ((Object) f20.c(this.c)) + ", bottom=" + ((Object) f20.c(this.d)) + ')';
    }
}
