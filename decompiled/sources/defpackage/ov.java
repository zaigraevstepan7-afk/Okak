package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ov extends hp {
    public final h3 b;

    public ov(ii iiVar) {
        this.b = iiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ov) && sn0.r(this.b, ((ov) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.hp
    public final int m(int i, int i2, jq0 jq0Var) {
        return this.b.a(i2, i, jq0Var);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.b + ')';
    }
}
