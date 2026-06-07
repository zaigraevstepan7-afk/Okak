package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class v90 implements th2 {
    public final int a;

    public v90(int i) {
        this.a = i;
    }

    @Override // defpackage.th2
    public final int a(c00 c00Var) {
        return this.a;
    }

    @Override // defpackage.th2
    public final int b(c00 c00Var, jq0 jq0Var) {
        return 0;
    }

    @Override // defpackage.th2
    public final int c(c00 c00Var) {
        return 0;
    }

    @Override // defpackage.th2
    public final int d(c00 c00Var, jq0 jq0Var) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof v90) && this.a == ((v90) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 961;
    }

    public final String toString() {
        return "Insets(left=0, top=" + this.a + ", right=0, bottom=0)";
    }
}
