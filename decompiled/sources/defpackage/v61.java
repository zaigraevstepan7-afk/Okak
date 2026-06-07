package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class v61 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public v61(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v61.class == obj.getClass()) {
            v61 v61Var = (v61) obj;
            if (this.c == v61Var.c && this.d == v61Var.d && this.b == v61Var.b && this.a == v61Var.a && this.e == v61Var.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + l90.b(this.a, l90.a(this.b, l90.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
