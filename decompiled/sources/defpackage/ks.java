package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ks implements ge2 {
    public final oe0 a;

    public ks(oe0 oe0Var) {
        this.a = oe0Var;
    }

    @Override // defpackage.ge2
    public final Object a(sf1 sf1Var) {
        return this.a.invoke(sf1Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ks) || !this.a.equals(((ks) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ')';
    }
}
