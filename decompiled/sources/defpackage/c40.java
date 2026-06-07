package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface c40 extends c00 {
    static /* synthetic */ void B(c40 c40Var, long j, float f, float f2, long j2, long j3, float f3, q32 q32Var, int i) {
        float f4;
        if ((i & 64) != 0) {
            f4 = 1.0f;
        } else {
            f4 = f3;
        }
        c40Var.Z(j, f, f2, j2, j3, f4, q32Var);
    }

    static long N(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    static /* synthetic */ void T(c40 c40Var, n8 n8Var, ck ckVar, float f, q32 q32Var, int i) {
        int i2;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        d40 d40Var = q32Var;
        if ((i & 8) != 0) {
            d40Var = o90.a;
        }
        d40 d40Var2 = d40Var;
        if ((i & 32) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        c40Var.f(n8Var, ckVar, f2, d40Var2, i2);
    }

    static /* synthetic */ void X(c40 c40Var, long j, long j2, long j3, float f, int i) {
        long j4;
        float f2;
        int i2;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j4 = N(c40Var.d(), j5);
        } else {
            j4 = j3;
        }
        if ((i & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i & 64) != 0) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        c40Var.v0(j, j5, j4, f2, i2);
    }

    static void c0(cr0 cr0Var, ck ckVar, long j, long j2, long j3, d40 d40Var, int i) {
        long j4;
        d40 d40Var2;
        if ((i & 2) != 0) {
            j = 0;
        }
        long j5 = j;
        if ((i & 4) != 0) {
            j4 = N(cr0Var.e.d(), j5);
        } else {
            j4 = j2;
        }
        if ((i & 32) != 0) {
            d40Var2 = o90.a;
        } else {
            d40Var2 = d40Var;
        }
        cr0Var.h(ckVar, j5, j4, j3, 1.0f, d40Var2);
    }

    static /* synthetic */ void g0(c40 c40Var, long j, long j2, long j3, float f, int i, int i2) {
        int i3;
        if ((i2 & 16) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        c40Var.y(j, j2, j3, f, i3);
    }

    static /* synthetic */ void q0(c40 c40Var, long j, float f, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = c40Var.l0();
        }
        c40Var.R(f, j, j2);
    }

    static void w(c40 c40Var, t7 t7Var, long j, long j2, float f, ni niVar, int i, int i2) {
        long j3;
        float f2;
        int i3;
        if ((i2 & 16) != 0) {
            j3 = j;
        } else {
            j3 = j2;
        }
        if ((i2 & 32) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 512) != 0) {
            i3 = 1;
        } else {
            i3 = i;
        }
        c40Var.h0(t7Var, 0L, j, j3, f2, niVar, i3);
    }

    static /* synthetic */ void y0(c40 c40Var, n8 n8Var, long j, float f, d40 d40Var, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 8) != 0) {
            d40Var = o90.a;
        }
        c40Var.g(n8Var, j, f2, d40Var);
    }

    static void z(cr0 cr0Var, ck ckVar, long j, long j2, float f, d40 d40Var, int i) {
        float f2;
        d40 d40Var2;
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = N(cr0Var.e.d(), j3);
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i & 16) != 0) {
            d40Var2 = o90.a;
        } else {
            d40Var2 = d40Var;
        }
        cr0Var.e(ckVar, j3, j4, f2, d40Var2);
    }

    void R(float f, long j, long j2);

    void V(long j, long j2, long j3, long j4);

    void Z(long j, float f, float f2, long j2, long j3, float f3, q32 q32Var);

    ld b0();

    default long d() {
        return b0().k();
    }

    void f(n8 n8Var, ck ckVar, float f, d40 d40Var, int i);

    void g(n8 n8Var, long j, float f, d40 d40Var);

    jq0 getLayoutDirection();

    void h0(t7 t7Var, long j, long j2, long j3, float f, ni niVar, int i);

    default long l0() {
        return yq1.p(b0().k());
    }

    void v0(long j, long j2, long j3, float f, int i);

    void y(long j, long j2, long j3, float f, int i);
}
