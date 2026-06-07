package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bw1 {
    public final boolean a;
    public final boolean b;
    public final int c;

    public bw1(int i, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw1)) {
            return false;
        }
        bw1 bw1Var = (bw1) obj;
        if (this.a == bw1Var.a && this.b == bw1Var.b && this.c == bw1Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + mb2.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "SettingsState(hideOnRecord=" + this.a + ", fixTouch=" + this.b + ", language=" + this.c + ")";
    }
}
