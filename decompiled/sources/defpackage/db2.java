package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class db2 {
    public final rc a;
    public final c91 b;

    public db2(rc rcVar, c91 c91Var) {
        this.a = rcVar;
        this.b = c91Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof db2) {
                db2 db2Var = (db2) obj;
                if (!sn0.r(this.a, db2Var.a) || !this.b.equals(db2Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ')';
    }
}
