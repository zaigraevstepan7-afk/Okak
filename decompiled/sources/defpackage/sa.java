package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sa implements th2 {
    public final int a;
    public final String b;
    public final je1 c = fr1.k(yl0.e);
    public final je1 d = fr1.k(Boolean.TRUE);

    public sa(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.th2
    public final int a(c00 c00Var) {
        return e().b;
    }

    @Override // defpackage.th2
    public final int b(c00 c00Var, jq0 jq0Var) {
        return e().c;
    }

    @Override // defpackage.th2
    public final int c(c00 c00Var) {
        return e().d;
    }

    @Override // defpackage.th2
    public final int d(c00 c00Var, jq0 jq0Var) {
        return e().a;
    }

    public final yl0 e() {
        return (yl0) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sa) {
                if (this.a == ((sa) obj).a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(ni2 ni2Var, int i) {
        int i2 = this.a;
        if (i != 0 && (i & i2) == 0) {
            return;
        }
        this.c.setValue(ni2Var.a.f(i2));
        f(ni2Var.a.m(i2));
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('(');
        sb.append(e().a);
        sb.append(", ");
        sb.append(e().b);
        sb.append(", ");
        sb.append(e().c);
        sb.append(", ");
        return l90.o(sb, e().d, ')');
    }
}
