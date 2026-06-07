package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class hg1 implements c00 {
    public boolean e;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(hg1 hg1Var, ig1 ig1Var) {
        hg1Var.getClass();
        if (ig1Var instanceof q21) {
            ((q21) ig1Var).F(hg1Var.e);
        }
    }

    public static void i(hg1 hg1Var, ig1 ig1Var, int i, int i2) {
        hg1Var.getClass();
        b(hg1Var, ig1Var);
        ig1Var.m0(xm0.c((i2 & 4294967295L) | (i << 32), ig1Var.i), 0.0f, null);
    }

    public static void j(hg1 hg1Var, ig1 ig1Var, long j) {
        hg1Var.getClass();
        b(hg1Var, ig1Var);
        ig1Var.m0(xm0.c(j, ig1Var.i), 0.0f, null);
    }

    public static void k(hg1 hg1Var, ig1 ig1Var, int i, int i2) {
        long j = (i << 32) | (i2 & 4294967295L);
        if (hg1Var.e() != jq0.e && hg1Var.h() != 0) {
            int h = (hg1Var.h() - ig1Var.e) - ((int) (j >> 32));
            b(hg1Var, ig1Var);
            ig1Var.m0(xm0.c((h << 32) | (((int) (j & 4294967295L)) & 4294967295L), ig1Var.i), 0.0f, null);
        } else {
            b(hg1Var, ig1Var);
            ig1Var.m0(xm0.c(j, ig1Var.i), 0.0f, null);
        }
    }

    public static void l(hg1 hg1Var, ig1 ig1Var, int i, int i2) {
        int i3 = jg1.b;
        x81 x81Var = x81.n;
        long j = (i << 32) | (i2 & 4294967295L);
        if (hg1Var.e() != jq0.e && hg1Var.h() != 0) {
            int h = (hg1Var.h() - ig1Var.e) - ((int) (j >> 32));
            b(hg1Var, ig1Var);
            ig1Var.m0(xm0.c((h << 32) | (((int) (j & 4294967295L)) & 4294967295L), ig1Var.i), 0.0f, x81Var);
        } else {
            b(hg1Var, ig1Var);
            ig1Var.m0(xm0.c(j, ig1Var.i), 0.0f, x81Var);
        }
    }

    public static void m(hg1 hg1Var, ig1 ig1Var, int i, int i2, oe0 oe0Var, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = jg1.b;
            oe0Var = x81.n;
        }
        hg1Var.getClass();
        b(hg1Var, ig1Var);
        ig1Var.m0(xm0.c((i2 & 4294967295L) | (i << 32), ig1Var.i), 0.0f, oe0Var);
    }

    public static void n(hg1 hg1Var, ig1 ig1Var, long j) {
        int i = jg1.b;
        x81 x81Var = x81.n;
        hg1Var.getClass();
        b(hg1Var, ig1Var);
        ig1Var.m0(xm0.c(j, ig1Var.i), 0.0f, x81Var);
    }

    public float c(hi0 hi0Var) {
        return Float.NaN;
    }

    public abstract jq0 e();

    public abstract int h();
}
