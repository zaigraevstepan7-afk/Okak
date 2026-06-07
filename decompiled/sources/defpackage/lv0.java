package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class lv0 implements nd0 {
    public final float a;

    public lv0(float f) {
        this.a = f;
    }

    @Override // defpackage.nd0
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.nd0
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lv0) && Float.compare(this.a, ((lv0) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return l90.n(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
