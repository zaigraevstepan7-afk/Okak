package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class sk {
    public static final rc1 a;
    public static final rc1 b;
    public static final float c;
    public static final float d;

    static {
        float f = fc2.H;
        float f2 = fc2.I;
        a = new rc1(f, 8.0f, f2, 8.0f);
        sn0.l(16.0f, 8.0f, f2, 8.0f);
        b = new rc1(12.0f, 8.0f, 12.0f, 8.0f);
        sn0.l(12.0f, 8.0f, 16.0f, 8.0f);
        c = 58.0f;
        d = 40.0f;
    }

    public static rk a(long j, long j2, ur urVar, int i) {
        if ((i & 2) != 0) {
            j2 = co.g;
        }
        long j3 = j2;
        long j4 = co.g;
        return c((mo) urVar.j(oo.a)).a(j, j3, j4, j4);
    }

    public static wk b(int i) {
        float f;
        if ((i & 1) != 0) {
            f = 0.0f;
        } else {
            f = 2.0f;
        }
        return new wk(f, bf.A);
    }

    public static rk c(mo moVar) {
        rk rkVar = moVar.W;
        if (rkVar == null) {
            rk rkVar2 = new rk(oo.d(moVar, bf.v), oo.d(moVar, bf.B), co.b(oo.d(moVar, bf.w), bf.x), co.b(oo.d(moVar, bf.y), bf.z));
            moVar.W = rkVar2;
            return rkVar2;
        }
        return rkVar;
    }

    public static rk d(mo moVar) {
        rk rkVar = moVar.Y;
        if (rkVar == null) {
            long j = co.f;
            rk rkVar2 = new rk(j, oo.d(moVar, no.q), j, co.b(oo.d(moVar, fc2.E), fc2.F));
            moVar.Y = rkVar2;
            return rkVar2;
        }
        return rkVar;
    }
}
