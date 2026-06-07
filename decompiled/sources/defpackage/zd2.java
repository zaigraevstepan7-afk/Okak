package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zd2 {
    public final String a;
    public final long b;
    public final boolean c;

    public zd2(String str, long j, boolean z) {
        this.a = str;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zd2) {
                zd2 zd2Var = (zd2) obj;
                if (!this.a.equals(zd2Var.a) || this.b != zd2Var.b || this.c != zd2Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + l90.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "UserInfo(licenseKey=" + this.a + ", expiresAt=" + this.b + ", isLifetime=" + this.c + ")";
    }
}
