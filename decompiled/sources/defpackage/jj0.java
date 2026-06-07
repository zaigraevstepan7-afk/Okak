package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jj0 {
    public final ij0 a;
    public final int b;

    public jj0(ij0 ij0Var, int i) {
        this.a = ij0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jj0) {
                jj0 jj0Var = (jj0) obj;
                if (!this.a.equals(jj0Var.a) || this.b != jj0Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.a);
        sb.append(", configFlags=");
        return l90.o(sb, this.b, ')');
    }
}
