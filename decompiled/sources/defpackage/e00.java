package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class e00 implements c00 {
    public final float e;
    public final float f;
    public final nd0 g;

    public e00(float f, float f2, nd0 nd0Var) {
        this.e = f;
        this.f = f2;
        this.g = nd0Var;
    }

    @Override // defpackage.c00
    public final float P() {
        return this.f;
    }

    @Override // defpackage.c00
    public final float a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e00) {
                e00 e00Var = (e00) obj;
                if (Float.compare(this.e, e00Var.e) != 0 || Float.compare(this.f, e00Var.f) != 0 || !this.g.equals(e00Var.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.g.hashCode() + l90.a(this.f, Float.hashCode(this.e) * 31, 31);
    }

    @Override // defpackage.c00
    public final long p(float f) {
        return pp1.C(4294967296L, this.g.a(f));
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.e + ", fontScale=" + this.f + ", converter=" + this.g + ')';
    }

    @Override // defpackage.c00
    public final float v(long j) {
        if (o92.a(n92.b(j), 4294967296L)) {
            return this.g.b(n92.c(j));
        }
        se.p("Only Sp can convert to Px");
        return 0.0f;
    }
}
