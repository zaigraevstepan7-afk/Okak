package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class x82 {
    public final w82 a;
    public iq0 b = null;
    public iq0 c;

    public x82(w82 w82Var, iq0 iq0Var) {
        this.a = w82Var;
        this.c = iq0Var;
    }

    public final long a(long j) {
        pl1 pl1Var;
        iq0 iq0Var = this.b;
        pl1 pl1Var2 = pl1.e;
        if (iq0Var != null) {
            if (iq0Var.j()) {
                iq0 iq0Var2 = this.c;
                if (iq0Var2 != null) {
                    pl1Var = iq0Var2.O(iq0Var, true);
                } else {
                    pl1Var = null;
                }
            } else {
                pl1Var = pl1Var2;
            }
            if (pl1Var != null) {
                pl1Var2 = pl1Var;
            }
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = pl1Var2.a;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f = pl1Var2.c;
            if (intBitsToFloat2 <= f) {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i2);
        float f2 = pl1Var2.b;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            f2 = pl1Var2.d;
            if (intBitsToFloat4 <= f2) {
                f2 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.g(d(j));
    }

    public final boolean c(long j) {
        long d = d(a(j));
        float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & d));
        w82 w82Var = this.a;
        int e = w82Var.b.e(intBitsToFloat);
        int i = (int) (d >> 32);
        if (Float.intBitsToFloat(i) >= w82Var.d(e) && Float.intBitsToFloat(i) <= w82Var.e(e)) {
            return true;
        }
        return false;
    }

    public final long d(long j) {
        iq0 iq0Var;
        iq0 iq0Var2 = this.b;
        if (iq0Var2 != null) {
            iq0 iq0Var3 = null;
            if (!iq0Var2.j()) {
                iq0Var2 = null;
            }
            if (iq0Var2 != null && (iq0Var = this.c) != null) {
                if (iq0Var.j()) {
                    iq0Var3 = iq0Var;
                }
                if (iq0Var3 != null) {
                    return iq0Var2.I(iq0Var3, j);
                }
            }
        }
        return j;
    }

    public final long e(long j) {
        iq0 iq0Var;
        iq0 iq0Var2 = this.b;
        if (iq0Var2 != null) {
            iq0 iq0Var3 = null;
            if (!iq0Var2.j()) {
                iq0Var2 = null;
            }
            if (iq0Var2 != null && (iq0Var = this.c) != null) {
                if (iq0Var.j()) {
                    iq0Var3 = iq0Var;
                }
                if (iq0Var3 != null) {
                    return iq0Var3.I(iq0Var2, j);
                }
            }
        }
        return j;
    }
}
