package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class qw0 {
    public static final float a;
    public static final float b;
    public static final List c;
    public static final List d;
    public static final float e;

    static {
        float f;
        char c2;
        long j;
        char c3;
        int i;
        np1 np1Var;
        float f2 = mp0.J;
        a = f2;
        float f3 = mp0.H;
        b = f3;
        float f4 = mp0.E;
        wc0 wc0Var = yz0.a;
        np1 o = wc0Var.o();
        np1 n = wc0.n();
        np1 np1Var2 = yz0.i;
        int i2 = 2;
        if (np1Var2 == null) {
            f = 0.5f;
            j = 4294967295L;
            c2 = ' ';
            np1Var2 = wc0.i(wc0Var, xn.F(new xz0((Float.floatToRawIntBits(-0.009f) & 4294967295L) | (Float.floatToRawIntBits(0.5f) << 32), new tu(2, 0.172f)), new xz0((Float.floatToRawIntBits(1.03f) << 32) | (Float.floatToRawIntBits(0.365f) & 4294967295L), new tu(2, 0.164f)), new xz0((Float.floatToRawIntBits(0.828f) << 32) | (Float.floatToRawIntBits(0.97f) & 4294967295L), new tu(2, 0.169f))), 1, 4).b();
            yz0.i = np1Var2;
        } else {
            f = 0.5f;
            c2 = ' ';
            j = 4294967295L;
        }
        np1 np1Var3 = yz0.h;
        if (np1Var3 == null) {
            c3 = c2;
            np1Var3 = wc0.i(wc0Var, xn.F(new xz0((Float.floatToRawIntBits(0.039f) & j) | (Float.floatToRawIntBits(0.961f) << c2), new tu(2, 0.426f)), new xz0((Float.floatToRawIntBits(1.001f) << c3) | (Float.floatToRawIntBits(0.428f) & j), tu.b), new xz0((Float.floatToRawIntBits(1.0f) << c3) | (Float.floatToRawIntBits(0.609f) & j), new tu(2, 1.0f))), 2, 4).b();
            yz0.h = np1Var3;
        } else {
            c3 = c2;
        }
        np1 np1Var4 = yz0.j;
        if (np1Var4 == null) {
            np1Var4 = xp1.p(8, yz0.b).b();
            yz0.j = np1Var4;
        }
        np1 np1Var5 = yz0.k;
        if (np1Var5 == null) {
            np1Var = np1Var3;
            i = 4;
            np1Var5 = wc0.i(wc0Var, xn.F(new xz0((Float.floatToRawIntBits(1.237f) << c3) | (Float.floatToRawIntBits(1.236f) & j), new tu(2, 0.258f)), new xz0((Float.floatToRawIntBits(0.918f) & j) | (Float.floatToRawIntBits(f) << c3), new tu(2, 0.233f))), 4, 12).b();
            yz0.k = np1Var5;
        } else {
            i = 4;
            np1Var = np1Var3;
        }
        np1 np1Var6 = yz0.g;
        if (np1Var6 == null) {
            float[] a2 = d01.a();
            d01.g(a2, 1.0f, 0.64f, i);
            np1Var6 = xp1.h(15).c(new p2(a2, i2)).c(new p2(yz0.d, i2)).b();
            yz0.g = np1Var6;
        }
        c = xn.F(o, n, np1Var2, np1Var, np1Var4, np1Var5, np1Var6);
        np1 np1Var7 = yz0.f;
        if (np1Var7 == null) {
            np1Var7 = xp1.h(14).b();
            yz0.f = np1Var7;
        }
        float[] a3 = d01.a();
        d01.e(a3, 18.0f);
        d = xn.F(np1Var7.c(new p2(a3, i2)), wc0Var.o());
        e = f4 / Math.min(f2, f3);
    }
}
