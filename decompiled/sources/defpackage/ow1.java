package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ow1 {
    public final kp1 a;
    public final kp1 b;
    public final kp1 c;
    public final kp1 d;
    public final kp1 e;
    public final kp1 f;
    public final kp1 g;
    public final kp1 h;
    public zk i;

    public ow1() {
        kp1 kp1Var = lw1.a;
        kp1 kp1Var2 = lw1.b;
        kp1 kp1Var3 = lw1.c;
        kp1 kp1Var4 = lw1.d;
        kp1 kp1Var5 = lw1.f;
        kp1 kp1Var6 = lw1.e;
        kp1 kp1Var7 = lw1.g;
        kp1 kp1Var8 = lw1.h;
        this.a = kp1Var;
        this.b = kp1Var2;
        this.c = kp1Var3;
        this.d = kp1Var4;
        this.e = kp1Var5;
        this.f = kp1Var6;
        this.g = kp1Var7;
        this.h = kp1Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow1)) {
            return false;
        }
        ow1 ow1Var = (ow1) obj;
        if (sn0.r(this.a, ow1Var.a) && sn0.r(this.b, ow1Var.b) && sn0.r(this.c, ow1Var.c) && sn0.r(this.d, ow1Var.d) && sn0.r(this.e, ow1Var.e) && sn0.r(this.f, ow1Var.f) && sn0.r(this.g, ow1Var.g) && sn0.r(this.h, ow1Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
