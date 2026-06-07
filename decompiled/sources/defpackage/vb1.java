package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vb1 extends lo {
    public final pl1 e;

    public vb1(pl1 pl1Var) {
        this.e = pl1Var;
    }

    @Override // defpackage.lo
    public final pl1 A() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vb1) {
                if (!this.e.equals(((vb1) obj).e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
