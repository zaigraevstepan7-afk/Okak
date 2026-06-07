package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cm1 extends rp1 {
    public final rp1 c;
    public final int d;

    public cm1(rp1 rp1Var, int i) {
        this.c = rp1Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cm1) {
            cm1 cm1Var = (cm1) obj;
            if (cm1Var.c.equals(this.c) && cm1Var.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.d * 31);
    }
}
