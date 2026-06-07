package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qv1 implements h50 {
    public final int a;
    public final int b;

    public qv1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.h50
    public final void a(i50 i50Var) {
        boolean z;
        if (i50Var.d != -1) {
            z = true;
        } else {
            z = false;
        }
        ne1 ne1Var = i50Var.a;
        if (z) {
            i50Var.d = -1;
            i50Var.e = -1;
        }
        int p = go.p(this.a, 0, ne1Var.b());
        int p2 = go.p(this.b, 0, ne1Var.b());
        if (p != p2) {
            if (p < p2) {
                i50Var.e(p, p2);
            } else {
                i50Var.e(p2, p);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv1)) {
            return false;
        }
        qv1 qv1Var = (qv1) obj;
        if (this.a == qv1Var.a && this.b == qv1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return l90.o(sb, this.b, ')');
    }
}
