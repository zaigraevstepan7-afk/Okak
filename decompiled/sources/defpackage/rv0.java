package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class rv0 extends sv0 {
    public final String a;
    public final z82 b;

    public rv0(String str, z82 z82Var) {
        this.a = str;
        this.b = z82Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rv0) {
                rv0 rv0Var = (rv0) obj;
                if (!this.a.equals(rv0Var.a) || !sn0.r(this.b, rv0Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        z82 z82Var = this.b;
        if (z82Var != null) {
            i = z82Var.hashCode();
        } else {
            i = 0;
        }
        return (hashCode + i) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Url(url=" + this.a + ')';
    }
}
