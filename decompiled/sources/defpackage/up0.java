package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class up0 {
    public static final up0 b = new up0(null, 63);
    public final oe0 a;

    public up0(oe0 oe0Var, int i) {
        this.a = (i & 1) != 0 ? null : oe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof up0) {
            if (this.a == ((up0) obj).a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        oe0 oe0Var = this.a;
        if (oe0Var != null) {
            i = oe0Var.hashCode();
        } else {
            i = 0;
        }
        return i * 28629151;
    }
}
