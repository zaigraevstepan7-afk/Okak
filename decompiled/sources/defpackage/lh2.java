package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class lh2 implements y01 {
    public final ji a;
    public final int b;

    public lh2(ji jiVar, int i) {
        this.a = jiVar;
        this.b = i;
    }

    @Override // defpackage.y01
    public final int a(bn0 bn0Var, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.b;
        if (i >= i2 - (i3 * 2)) {
            return Math.round(((i2 - i) / 2.0f) * 1.0f);
        }
        return go.p(this.a.a(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lh2) {
                lh2 lh2Var = (lh2) obj;
                if (!this.a.equals(lh2Var.a) || this.b != lh2Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.a);
        sb.append(", margin=");
        return l90.o(sb, this.b, ')');
    }
}
