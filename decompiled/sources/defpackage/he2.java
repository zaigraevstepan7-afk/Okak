package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class he2 implements th2 {
    public final String a;
    public final je1 b;

    public he2(hm0 hm0Var, String str) {
        this.a = str;
        this.b = fr1.k(hm0Var);
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

    public final hm0 e() {
        return (hm0) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof he2)) {
            return false;
        }
        return sn0.r(e(), ((he2) obj).e());
    }

    public final void f(hm0 hm0Var) {
        this.b.setValue(hm0Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return l90.o(sb, e().d, ')');
    }
}
