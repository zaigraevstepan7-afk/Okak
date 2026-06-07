package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qv0 extends sv0 {
    public final String a;
    public final z82 b;

    public qv0(String str, z82 z82Var) {
        this.a = str;
        this.b = z82Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qv0) {
                qv0 qv0Var = (qv0) obj;
                if (!this.a.equals(qv0Var.a) || !sn0.r(this.b, qv0Var.b)) {
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
        return "LinkAnnotation.Clickable(tag=" + this.a + ')';
    }
}
