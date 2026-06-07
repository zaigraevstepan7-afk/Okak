package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ij0 {
    public static int k;
    public static final wc0 l = new wc0(4);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final le2 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public ij0(String str, float f, float f2, float f3, float f4, le2 le2Var, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = le2Var;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ij0) {
                ij0 ij0Var = (ij0) obj;
                if (sn0.r(this.a, ij0Var.a) && f20.b(this.b, ij0Var.b) && f20.b(this.c, ij0Var.c) && this.d == ij0Var.d && this.e == ij0Var.e && this.f.equals(ij0Var.f) && co.c(this.g, ij0Var.g) && this.h == ij0Var.h && this.i == ij0Var.i) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + l90.a(this.e, l90.a(this.d, l90.a(this.c, l90.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = co.h;
        return Boolean.hashCode(this.i) + l90.b(this.h, l90.e(this.g, hashCode, 31), 31);
    }
}
