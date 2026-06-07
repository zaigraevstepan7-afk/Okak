package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ct {
    public final int a;
    public final long b;
    public final dt c;
    public final ov1 d;

    public ct(int i, long j, dt dtVar, ov1 ov1Var) {
        this.a = i;
        this.b = j;
        this.c = dtVar;
        this.d = ov1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ct) {
                ct ctVar = (ct) obj;
                if (this.a != ctVar.a || this.b != ctVar.b || this.c != ctVar.c || !sn0.r(this.d, ctVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + l90.e(this.b, Integer.hashCode(this.a) * 31, 31)) * 31;
        ov1 ov1Var = this.d;
        if (ov1Var == null) {
            hashCode = 0;
        } else {
            hashCode = ov1Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ')';
    }
}
