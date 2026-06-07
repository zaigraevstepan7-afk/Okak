package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sv1 implements h50 {
    public final int a;
    public final int b;

    public sv1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.h50
    public final void a(i50 i50Var) {
        int p = go.p(this.a, 0, i50Var.a.b());
        int p2 = go.p(this.b, 0, i50Var.a.b());
        if (p < p2) {
            i50Var.f(p, p2);
        } else {
            i50Var.f(p2, p);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv1)) {
            return false;
        }
        sv1 sv1Var = (sv1) obj;
        if (this.a == sv1Var.a && this.b == sv1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return l90.o(sb, this.b, ')');
    }
}
