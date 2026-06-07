package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class we2 {
    public final mc a;
    public final x40 b;

    public we2(mc mcVar, x40 x40Var) {
        this.a = mcVar;
        this.b = x40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof we2) {
            we2 we2Var = (we2) obj;
            if (sn0.r(this.a, we2Var.a) && sn0.r(this.b, we2Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
