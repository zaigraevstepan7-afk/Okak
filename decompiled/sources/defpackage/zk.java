package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zk {
    public final kw1 a;
    public final kw1 b;

    public zk(kw1 kw1Var, kw1 kw1Var2) {
        this.a = kw1Var;
        this.b = kw1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zk)) {
            return false;
        }
        zk zkVar = (zk) obj;
        if (sn0.r(this.a, zkVar.a) && sn0.r(this.b, zkVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
