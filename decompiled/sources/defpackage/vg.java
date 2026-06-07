package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vg extends lo {
    public final Object e;
    public final long f;

    public vg(Object obj, long j) {
        this.e = obj;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vg) {
                vg vgVar = (vg) obj;
                if (!this.e.equals(vgVar.e) || this.f != vgVar.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + (this.e.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.e + ", compositeKey=" + this.f + ')';
    }
}
