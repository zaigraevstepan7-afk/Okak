package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class d71 extends qo {
    public final v61 c;

    public d71(v61 v61Var) {
        v61Var.getClass();
        this.c = v61Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && d71.class == obj.getClass() && sn0.r(this.c, ((d71) obj).c)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.c + ", direction=-1)";
    }
}
