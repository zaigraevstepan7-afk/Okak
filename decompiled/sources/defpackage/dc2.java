package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dc2 implements t40 {
    public final int a;
    public final int b;
    public final x40 c;

    public dc2(int i, x40 x40Var, int i2) {
        this(i, 0, (i2 & 4) != 0 ? y40.a : x40Var);
    }

    @Override // defpackage.gc
    public final qe2 a(ec2 ec2Var) {
        return new a91(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dc2) {
            dc2 dc2Var = (dc2) obj;
            if (dc2Var.a == this.a && dc2Var.b == this.b && sn0.r(dc2Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    public dc2(int i, int i2, x40 x40Var) {
        this.a = i;
        this.b = i2;
        this.c = x40Var;
    }

    @Override // defpackage.t40, defpackage.gc
    public final se2 a(ec2 ec2Var) {
        return new a91(this.a, this.b, this.c);
    }
}
