package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mc1 implements bn {
    public final Class e;

    public mc1(Class cls) {
        cls.getClass();
        this.e = cls;
    }

    @Override // defpackage.bn
    public final Class b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mc1) {
            if (sn0.r(this.e, ((mc1) obj).e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return this.e.toString() + " (Kotlin reflection is not available)";
    }
}
