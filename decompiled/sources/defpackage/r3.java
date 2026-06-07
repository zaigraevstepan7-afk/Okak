package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class r3 implements y01 {
    public final ji a;
    public final ji b;

    public r3(ji jiVar, ji jiVar2) {
        this.a = jiVar;
        this.b = jiVar2;
    }

    @Override // defpackage.y01
    public final int a(bn0 bn0Var, long j, int i) {
        int a = this.b.a(0, bn0Var.b());
        return bn0Var.b + a + (-this.a.a(0, i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r3) {
            r3 r3Var = (r3) obj;
            if (this.a.equals(r3Var.a) && this.b.equals(r3Var.b)) {
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
        return "Vertical(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ", offset=0)";
    }
}
