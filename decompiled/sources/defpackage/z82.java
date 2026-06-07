package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class z82 {
    public final m12 a;
    public final m12 b;
    public final m12 c;
    public final m12 d;

    public z82(m12 m12Var, m12 m12Var2, m12 m12Var3, m12 m12Var4) {
        this.a = m12Var;
        this.b = m12Var2;
        this.c = m12Var3;
        this.d = m12Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z82)) {
            return false;
        }
        z82 z82Var = (z82) obj;
        if (sn0.r(this.a, z82Var.a) && sn0.r(this.b, z82Var.b) && sn0.r(this.c, z82Var.c) && sn0.r(this.d, z82Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        m12 m12Var = this.a;
        if (m12Var != null) {
            i = m12Var.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        m12 m12Var2 = this.b;
        if (m12Var2 != null) {
            i2 = m12Var2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        m12 m12Var3 = this.c;
        if (m12Var3 != null) {
            i3 = m12Var3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        m12 m12Var4 = this.d;
        if (m12Var4 != null) {
            i4 = m12Var4.hashCode();
        }
        return i7 + i4;
    }
}
