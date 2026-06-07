package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qz1 {
    public final String a;
    public final String b;
    public final lz1 c;

    public qz1(String str, String str2, lz1 lz1Var) {
        this.a = str;
        this.b = str2;
        this.c = lz1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && qz1.class == obj.getClass()) {
                qz1 qz1Var = (qz1) obj;
                if (sn0.r(this.a, qz1Var.a) && sn0.r(this.b, qz1Var.b) && this.c == qz1Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.c.hashCode() + mb2.a((hashCode + i) * 31, 31, false);
    }
}
