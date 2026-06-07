package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pz1 {
    public final qz1 a;
    public final pl b;

    public pz1(qz1 qz1Var, pl plVar) {
        this.a = qz1Var;
        this.b = plVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pz1.class == obj.getClass()) {
            pz1 pz1Var = (pz1) obj;
            if (sn0.r(this.a, pz1Var.a) && this.b == pz1Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
