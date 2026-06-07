package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kj1 {
    public static final kj1 c = new kj1(0.0f, new rn(0.0f, 0.0f));
    public final float a;
    public final rn b;

    public kj1(float f, rn rnVar) {
        this.a = f;
        this.b = rnVar;
        if (!Float.isNaN(f)) {
            return;
        }
        se.h("current must not be NaN");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kj1) {
            kj1 kj1Var = (kj1) obj;
            if (this.a == kj1Var.a && sn0.r(this.b, kj1Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=0)";
    }
}
