package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ae1 {
    public final m8 a;
    public final int b;
    public final int c;

    public ae1(m8 m8Var, int i, int i2) {
        this.a = m8Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ae1) {
                ae1 ae1Var = (ae1) obj;
                if (this.a == ae1Var.a && this.b == ae1Var.b && this.c == ae1Var.c) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + l90.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return l90.o(sb, this.c, ')');
    }
}
