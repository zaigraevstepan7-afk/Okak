package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class an0 extends ym0 {
    public static final an0 h = new ym0(1, 0, 1);

    @Override // defpackage.ym0
    public final boolean equals(Object obj) {
        if (obj instanceof an0) {
            if (!isEmpty() || !((an0) obj).isEmpty()) {
                an0 an0Var = (an0) obj;
                if (this.e == an0Var.e && this.f == an0Var.f) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ym0
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.e * 31) + this.f;
    }

    @Override // defpackage.ym0
    public final boolean isEmpty() {
        if (this.e > this.f) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ym0
    public final String toString() {
        return this.e + ".." + this.f;
    }
}
