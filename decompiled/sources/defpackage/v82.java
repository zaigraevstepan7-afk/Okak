package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class v82 {
    public final rc a;
    public final k92 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final c00 g;
    public final jq0 h;
    public final cd0 i;
    public final long j;

    public v82(rc rcVar, k92 k92Var, List list, int i, boolean z, int i2, c00 c00Var, jq0 jq0Var, cd0 cd0Var, long j) {
        this.a = rcVar;
        this.b = k92Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = c00Var;
        this.h = jq0Var;
        this.i = cd0Var;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v82) {
                v82 v82Var = (v82) obj;
                if (sn0.r(this.a, v82Var.a) && sn0.r(this.b, v82Var.b) && sn0.r(this.c, v82Var.c) && this.d == v82Var.d && this.e == v82Var.e && this.f == v82Var.f && sn0.r(this.g, v82Var.g) && this.h == v82Var.h && sn0.r(this.i, v82Var.i) && us.b(this.j, v82Var.j)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + l90.b(this.f, mb2.a((((this.c.hashCode() + l90.c(this.a.hashCode() * 31, 31, this.b)) * 31) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        if (i == 1) {
            str = "Clip";
        } else if (i == 2) {
            str = "Ellipsis";
        } else if (i == 5) {
            str = "MiddleEllipsis";
        } else if (i == 3) {
            str = "Visible";
        } else if (i == 4) {
            str = "StartEllipsis";
        } else {
            str = "Invalid";
        }
        sb.append((Object) str);
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) us.k(this.j));
        sb.append(')');
        return sb.toString();
    }
}
