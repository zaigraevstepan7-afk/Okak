package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ii0 implements pq0 {
    public final u72 a;
    public final int b;
    public final db2 c;
    public final de0 d;

    public ii0(u72 u72Var, int i, db2 db2Var, de0 de0Var) {
        this.a = u72Var;
        this.b = i;
        this.c = db2Var;
        this.d = de0Var;
    }

    @Override // defpackage.pq0
    public final k01 b(l01 l01Var, e01 e01Var, long j) {
        long j2;
        if (e01Var.s(us.g(j)) < us.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = us.a(j2, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        ig1 x = e01Var.x(j);
        int min = Math.min(x.e, us.h(j2));
        return l01Var.s0(min, x.f, m60.e, new h00(this, l01Var, x, min, 1));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ii0) {
                ii0 ii0Var = (ii0) obj;
                if (this.a == ii0Var.a && this.b == ii0Var.b && this.c.equals(ii0Var.c) && sn0.r(this.d, ii0Var.d)) {
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
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.b + ", transformedText=" + this.c + ", textLayoutResultProvider=" + this.d + ')';
    }
}
