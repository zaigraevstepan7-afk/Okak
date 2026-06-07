package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sb0 {
    public final ub0 a;
    public final long b;
    public final int c;
    public final int d;

    public sb0(ub0 ub0Var, long j, int i, int i2) {
        this.a = ub0Var;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    public final vn a(rb0 rb0Var, boolean z, int i, int i2, int i3, int i4) {
        if (rb0Var.b) {
            this.a.getClass();
            return null;
        }
        return null;
    }

    public final rb0 b(boolean z, int i, long j, sm0 sm0Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = i3 + i4;
        if (sm0Var == null) {
            return new rb0(true, true);
        }
        long j2 = sm0Var.a;
        this.a.getClass();
        if (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)) < 0) {
            return new rb0(true, true);
        }
        if (i != 0 && (i >= Integer.MAX_VALUE || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
            if (z2) {
                return new rb0(true, true);
            }
            return new rb0(true, b(z, 0, sm0.a(us.h(this.b), (((int) (j & 4294967295L)) - this.d) - i4), new sm0(sm0.a(((int) (j2 >> 32)) - this.c, (int) (j2 & 4294967295L))), i2 + 1, i5, 0, true, false).b);
        }
        Math.max(i4, (int) (j2 & 4294967295L));
        return new rb0(false, false);
    }
}
