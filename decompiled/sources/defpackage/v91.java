package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class v91 extends lo {
    public final u91 e;
    public final uu0 f;

    public v91(uu0 uu0Var, u91 u91Var) {
        u91Var.getClass();
        this.e = u91Var;
        this.f = uu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v91)) {
            return false;
        }
        v91 v91Var = (v91) obj;
        if (sn0.r(this.e, v91Var.e) && sn0.r(this.f, v91Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.e.hashCode() * 31;
        uu0 uu0Var = this.f;
        if (uu0Var == null) {
            hashCode = 0;
        } else {
            hashCode = uu0Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.e + ", owner=" + this.f + ')';
    }
}
