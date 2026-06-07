package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class po {
    public final String a;
    public final long b;
    public final int c;

    public po(int i, String str, long j) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() != 0) {
            if (i >= -1 && i <= 63) {
                return;
            }
            se.h("The id must be between -1 and 63");
            throw null;
        }
        se.h("The name of a color space cannot be null and must contain at least 1 character");
        throw null;
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f2, float f3);

    public abstract float e(float f, float f2, float f3);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            po poVar = (po) obj;
            if (this.c == poVar.c && this.a.equals(poVar.a)) {
                return io.u(this.b, poVar.b);
            }
            return false;
        }
        return false;
    }

    public abstract long f(float f, float f2, float f3, float f4, po poVar);

    public int hashCode() {
        return l90.e(this.b, this.a.hashCode() * 31, 31) + this.c;
    }

    public final String toString() {
        return this.a + " (id=" + this.c + ", model=" + ((Object) io.M(this.b)) + ')';
    }
}
