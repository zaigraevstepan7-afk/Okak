package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qr1 {
    public final float a;
    public final long b;
    public final dc2 c;

    public qr1(float f, long j, dc2 dc2Var) {
        this.a = f;
        this.b = j;
        this.c = dc2Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qr1) {
                qr1 qr1Var = (qr1) obj;
                if (Float.compare(this.a, qr1Var.a) != 0 || !cb2.a(this.b, qr1Var.b) || !this.c.equals(qr1Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.a) * 31;
        int i = cb2.c;
        return this.c.hashCode() + l90.e(this.b, hashCode, 31);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + ((Object) cb2.b(this.b)) + ", animationSpec=" + this.c + ')';
    }
}
