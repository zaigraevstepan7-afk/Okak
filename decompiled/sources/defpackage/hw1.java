package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hw1 {
    public static final hw1 d = new hw1();
    public final long a;
    public final long b;
    public final float c;

    public /* synthetic */ hw1() {
        this(0.0f, go.c(4278190080L), 0L);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hw1) {
                hw1 hw1Var = (hw1) obj;
                if (co.c(this.a, hw1Var.a) && z81.b(this.b, hw1Var.b) && this.c == hw1Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = co.h;
        return Float.hashCode(this.c) + l90.e(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        l90.u(this.a, sb, ", offset=");
        sb.append((Object) z81.g(this.b));
        sb.append(", blurRadius=");
        return l90.n(sb, this.c, ')');
    }

    public hw1(float f, long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }
}
