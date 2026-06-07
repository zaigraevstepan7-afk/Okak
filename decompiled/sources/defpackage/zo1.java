package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zo1 implements dk0 {
    public final boolean a;
    public final float b;
    public final long c;

    public zo1(boolean z, float f, long j) {
        this.a = z;
        this.b = f;
        this.c = j;
    }

    @Override // defpackage.dk0
    public final qz a(r31 r31Var) {
        return new vz(r31Var, this.a, this.b, new uz(this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zo1) {
            zo1 zo1Var = (zo1) obj;
            if (this.a != zo1Var.a || !f20.b(this.b, zo1Var.b)) {
                return false;
            }
            return co.c(this.c, zo1Var.c);
        }
        return false;
    }

    @Override // defpackage.dk0
    public final int hashCode() {
        int a = l90.a(this.b, Boolean.hashCode(this.a) * 31, 961);
        int i = co.h;
        return Long.hashCode(this.c) + a;
    }
}
