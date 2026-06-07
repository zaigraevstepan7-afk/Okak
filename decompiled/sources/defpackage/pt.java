package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pt {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public pt(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pt)) {
            return false;
        }
        pt ptVar = (pt) obj;
        if (co.c(this.a, ptVar.a) && co.c(this.b, ptVar.b) && co.c(this.c, ptVar.c) && co.c(this.d, ptVar.d) && co.c(this.e, ptVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = co.h;
        return Long.hashCode(this.e) + l90.e(this.d, l90.e(this.c, l90.e(this.b, Long.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextMenuColors(backgroundColor=");
        l90.u(this.a, sb, ", textColor=");
        l90.u(this.b, sb, ", iconColor=");
        l90.u(this.c, sb, ", disabledTextColor=");
        l90.u(this.d, sb, ", disabledIconColor=");
        sb.append((Object) co.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
