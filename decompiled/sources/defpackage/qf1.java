package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qf1 implements uu {
    public final float a;

    public qf1(float f) {
        this.a = f;
        if (f >= 0.0f && f <= 100.0f) {
            return;
        }
        nl0.a("The percent should be in the range of [0, 100]");
    }

    @Override // defpackage.uu
    public final float a(long j, c00 c00Var) {
        return (this.a / 100.0f) * fy1.b(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qf1) && Float.compare(this.a, ((qf1) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
