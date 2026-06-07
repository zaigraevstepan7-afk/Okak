package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ef2 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public ef2(String str, String str2, String str3, long j, String str4, String str5, String str6, boolean z, boolean z2, boolean z3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = z;
        this.i = z2;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ef2) {
                ef2 ef2Var = (ef2) obj;
                if (!sn0.r(this.a, ef2Var.a) || !sn0.r(this.b, ef2Var.b) || !sn0.r(this.c, ef2Var.c) || this.d != ef2Var.d || !sn0.r(this.e, ef2Var.e) || !this.f.equals(ef2Var.f) || !sn0.r(this.g, ef2Var.g) || this.h != ef2Var.h || this.i != ef2Var.i || this.j != ef2Var.j) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + mb2.a(mb2.a(l90.d(l90.d(l90.d(l90.e(this.d, l90.d(l90.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        return "VersionUiModel(version=" + this.a + ", gameVersion=" + this.b + ", changelog=" + this.c + ", uploadDate=" + this.d + ", filename=" + this.e + ", downloadUrl=" + this.f + ", hash=" + this.g + ", isExpired=" + this.h + ", isDownloaded=" + this.i + ", isSelected=" + this.j + ")";
    }
}
