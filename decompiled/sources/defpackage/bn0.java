package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bn0 {
    public static final bn0 e = new bn0(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public bn0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        return (((b() / 2) + this.b) & 4294967295L) | (((c() / 2) + this.a) << 32);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final int c() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn0)) {
            return false;
        }
        bn0 bn0Var = (bn0) obj;
        if (this.a == bn0Var.a && this.b == bn0Var.b && this.c == bn0Var.c && this.d == bn0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + l90.b(this.c, l90.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return l90.o(sb, this.d, ')');
    }
}
