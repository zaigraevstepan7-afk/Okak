package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ul {
    public c00 a;
    public jq0 b;
    public tl c;
    public long d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ul) {
                ul ulVar = (ul) obj;
                if (!sn0.r(this.a, ulVar.a) || this.b != ulVar.b || !sn0.r(this.c, ulVar.c) || !fy1.a(this.d, ulVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) fy1.d(this.d)) + ')';
    }
}
