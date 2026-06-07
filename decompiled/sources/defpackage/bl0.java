package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bl0 implements dl0 {
    public final zd2 a;
    public final kd b;
    public final kd c;

    public bl0(zd2 zd2Var, kd kdVar, kd kdVar2) {
        kdVar.getClass();
        this.a = zd2Var;
        this.b = kdVar;
        this.c = kdVar2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bl0) {
                bl0 bl0Var = (bl0) obj;
                if (!this.a.equals(bl0Var.a) || !sn0.r(this.b, bl0Var.b) || !this.c.equals(bl0Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Content(userInfo=" + this.a + ", gameInfo=" + this.b + ", loaderInfo=" + this.c + ")";
    }
}
