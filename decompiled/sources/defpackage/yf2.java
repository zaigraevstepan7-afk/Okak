package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yf2 implements pq0 {
    public final u72 a;
    public final int b;
    public final db2 c;
    public final de0 d;

    public yf2(u72 u72Var, int i, db2 db2Var, de0 de0Var) {
        this.a = u72Var;
        this.b = i;
        this.c = db2Var;
        this.d = de0Var;
    }

    @Override // defpackage.pq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        ig1 x = e01Var.x(us.a(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(x.f, us.g(j));
        return l01Var.s0(x.e, min, m60.e, new cl1(this, x, min));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yf2) {
                yf2 yf2Var = (yf2) obj;
                if (this.a == yf2Var.a && this.b == yf2Var.b && this.c.equals(yf2Var.c) && sn0.r(this.d, yf2Var.d)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + l90.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
