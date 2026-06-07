package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pv extends hp {
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pv) {
                ji jiVar = g3.o;
                if (!jiVar.equals(jiVar)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f);
    }

    @Override // defpackage.hp
    public final int m(int i, int i2, jq0 jq0Var) {
        return Math.round((1.0f - 1.0f) * ((i - i2) / 2.0f));
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + g3.o + ')';
    }
}
