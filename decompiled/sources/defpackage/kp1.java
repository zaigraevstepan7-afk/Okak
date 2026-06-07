package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kp1 implements kw1 {
    public final uu a;
    public final uu b;
    public final uu c;
    public final uu d;

    public kp1(uu uuVar, uu uuVar2, uu uuVar3, uu uuVar4) {
        this.a = uuVar;
        this.b = uuVar2;
        this.c = uuVar3;
        this.d = uuVar4;
    }

    public static kp1 b(kp1 kp1Var, uu uuVar, uu uuVar2, uu uuVar3, uu uuVar4, int i) {
        if ((i & 1) != 0) {
            uuVar = kp1Var.a;
        }
        if ((i & 2) != 0) {
            uuVar2 = kp1Var.b;
        }
        if ((i & 4) != 0) {
            uuVar3 = kp1Var.c;
        }
        if ((i & 8) != 0) {
            uuVar4 = kp1Var.d;
        }
        kp1Var.getClass();
        return new kp1(uuVar, uuVar2, uuVar3, uuVar4);
    }

    @Override // defpackage.kw1
    public final lo a(long j, jq0 jq0Var, c00 c00Var) {
        float f;
        float f2;
        float a = this.a.a(j, c00Var);
        float a2 = this.b.a(j, c00Var);
        float a3 = this.c.a(j, c00Var);
        float a4 = this.d.a(j, c00Var);
        float b = fy1.b(j);
        float f3 = a + a4;
        if (f3 > b) {
            float f4 = b / f3;
            a *= f4;
            a4 *= f4;
        }
        float f5 = a2 + a3;
        if (f5 > b) {
            float f6 = b / f5;
            a2 *= f6;
            a3 *= f6;
        }
        if (a < 0.0f || a2 < 0.0f || a3 < 0.0f || a4 < 0.0f) {
            nl0.a("Corner size in Px can't be negative(topStart = " + a + ", topEnd = " + a2 + ", bottomEnd = " + a3 + ", bottomStart = " + a4 + ")!");
        }
        if (a + a2 + a3 + a4 == 0.0f) {
            return new vb1(hp.e(0L, j));
        }
        pl1 e = hp.e(0L, j);
        jq0 jq0Var2 = jq0.e;
        if (jq0Var == jq0Var2) {
            f = a;
        } else {
            f = a2;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
        if (jq0Var == jq0Var2) {
            a = a2;
        }
        long floatToRawIntBits2 = (Float.floatToRawIntBits(a) << 32) | (Float.floatToRawIntBits(a) & 4294967295L);
        if (jq0Var == jq0Var2) {
            f2 = a3;
        } else {
            f2 = a4;
        }
        long floatToRawIntBits3 = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
        if (jq0Var != jq0Var2) {
            a4 = a3;
        }
        return new wb1(new ip1(e.a, e.b, e.c, e.d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits3, (Float.floatToRawIntBits(a4) << 32) | (Float.floatToRawIntBits(a4) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp1)) {
            return false;
        }
        kp1 kp1Var = (kp1) obj;
        if (sn0.r(this.a, kp1Var.a) && sn0.r(this.b, kp1Var.b) && sn0.r(this.c, kp1Var.c) && sn0.r(this.d, kp1Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
