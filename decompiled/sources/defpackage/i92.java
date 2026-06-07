package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i92 {
    public final String a;
    public String b;
    public boolean c = false;
    public ce1 d = null;

    public i92(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i92)) {
            return false;
        }
        i92 i92Var = (i92) obj;
        if (sn0.r(this.a, i92Var.a) && sn0.r(this.b, i92Var.b) && this.c == i92Var.c && sn0.r(this.d, i92Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = mb2.a(l90.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ce1 ce1Var = this.d;
        if (ce1Var == null) {
            hashCode = 0;
        } else {
            hashCode = ce1Var.hashCode();
        }
        return a + hashCode;
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ')';
    }
}
