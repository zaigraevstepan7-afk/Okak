package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i82 {
    public final rc a;
    public final long b;
    public final d92 c;

    public i82(rc rcVar, long j, d92 d92Var) {
        d92 d92Var2;
        this.a = rcVar;
        this.b = fr1.c(rcVar.f.length(), j);
        if (d92Var != null) {
            d92Var2 = new d92(fr1.c(rcVar.f.length(), d92Var.a));
        } else {
            d92Var2 = null;
        }
        this.c = d92Var2;
    }

    public static i82 a(i82 i82Var, rc rcVar, long j, int i) {
        d92 d92Var;
        if ((i & 1) != 0) {
            rcVar = i82Var.a;
        }
        if ((i & 2) != 0) {
            j = i82Var.b;
        }
        if ((i & 4) != 0) {
            d92Var = i82Var.c;
        } else {
            d92Var = null;
        }
        i82Var.getClass();
        return new i82(rcVar, j, d92Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i82)) {
            return false;
        }
        i82 i82Var = (i82) obj;
        if (d92.b(this.b, i82Var.b) && sn0.r(this.c, i82Var.c) && sn0.r(this.a, i82Var.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        int i2 = d92.c;
        int e = l90.e(this.b, hashCode, 31);
        d92 d92Var = this.c;
        if (d92Var != null) {
            i = Long.hashCode(d92Var.a);
        } else {
            i = 0;
        }
        return e + i;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) d92.h(this.b)) + ", composition=" + this.c + ')';
    }

    public i82(int i, String str, long j) {
        this(new rc((i & 1) != 0 ? "" : str), (i & 2) != 0 ? d92.b : j, (d92) null);
    }
}
