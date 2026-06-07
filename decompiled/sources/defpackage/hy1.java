package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class hy1 {
    public static final p90 a;
    public static final p90 b;
    public static final p90 c;
    public static final mj2 d;
    public static final mj2 e;
    public static final mj2 f;
    public static final mj2 g;
    public static final mj2 h;
    public static final mj2 i;

    static {
        e10 e10Var = e10.f;
        a = new p90(e10Var, 1.0f);
        e10 e10Var2 = e10.e;
        b = new p90(e10Var2, 1.0f);
        e10 e10Var3 = e10.g;
        c = new p90(e10Var3, 1.0f);
        ii iiVar = g3.s;
        d = new mj2(e10Var, new h8(iiVar, 25), iiVar);
        ii iiVar2 = g3.r;
        e = new mj2(e10Var, new h8(iiVar2, 25), iiVar2);
        ji jiVar = g3.p;
        f = new mj2(e10Var2, new h8(jiVar, 26), jiVar);
        ji jiVar2 = g3.o;
        g = new mj2(e10Var2, new h8(jiVar2, 26), jiVar2);
        ki kiVar = g3.j;
        h = new mj2(e10Var3, new h8(kiVar, 27), kiVar);
        ki kiVar2 = g3.f;
        i = new mj2(e10Var3, new h8(kiVar2, 27), kiVar2);
    }

    public static final e21 a(e21 e21Var, float f2, float f3) {
        return e21Var.d(new td2(f2, f3));
    }

    public static final e21 b(e21 e21Var, float f2) {
        p90 p90Var;
        if (f2 == 1.0f) {
            p90Var = a;
        } else {
            p90Var = new p90(e10.f, f2);
        }
        return e21Var.d(p90Var);
    }

    public static final e21 c(e21 e21Var, float f2) {
        return e21Var.d(new gy1(0.0f, f2, 0.0f, f2, 5));
    }

    public static final e21 d(e21 e21Var, float f2, float f3) {
        return e21Var.d(new gy1(0.0f, f2, 0.0f, f3, 5));
    }

    public static e21 e(e21 e21Var, float f2, float f3, float f4, float f5, int i2) {
        float f6;
        float f7;
        float f8;
        if ((i2 & 2) != 0) {
            f6 = Float.NaN;
        } else {
            f6 = f3;
        }
        if ((i2 & 4) != 0) {
            f7 = Float.NaN;
        } else {
            f7 = f4;
        }
        if ((i2 & 8) != 0) {
            f8 = Float.NaN;
        } else {
            f8 = f5;
        }
        return e21Var.d(new gy1(f2, f6, f7, f8, false));
    }

    public static final e21 f(e21 e21Var, float f2) {
        return e21Var.d(new gy1(f2, f2, f2, f2, true));
    }

    public static final e21 g(e21 e21Var, float f2, float f3) {
        return e21Var.d(new gy1(f2, f3, f2, f3, true));
    }

    public static final e21 h(e21 e21Var, float f2, float f3, float f4, float f5) {
        return e21Var.d(new gy1(f2, f3, f4, f5, true));
    }

    public static /* synthetic */ e21 i(e21 e21Var, float f2, float f3, float f4, int i2) {
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        return h(e21Var, f2, f3, f4, Float.NaN);
    }

    public static final e21 j(e21 e21Var, float f2) {
        return e21Var.d(new gy1(f2, 0.0f, f2, 0.0f, 10));
    }

    public static e21 k(e21 e21Var, float f2) {
        return e21Var.d(new gy1(Float.NaN, 0.0f, f2, 0.0f, 10));
    }

    public static e21 l(e21 e21Var) {
        mj2 mj2Var;
        ji jiVar = g3.p;
        if (sn0.r(jiVar, jiVar)) {
            mj2Var = f;
        } else if (sn0.r(jiVar, g3.o)) {
            mj2Var = g;
        } else {
            mj2Var = new mj2(e10.e, new h8(jiVar, 26), jiVar);
        }
        return e21Var.d(mj2Var);
    }

    public static e21 m(e21 e21Var) {
        mj2 mj2Var;
        ki kiVar = g3.j;
        if (kiVar.equals(kiVar)) {
            mj2Var = h;
        } else if (kiVar.equals(g3.f)) {
            mj2Var = i;
        } else {
            mj2Var = new mj2(e10.g, new h8(kiVar, 27), kiVar);
        }
        return e21Var.d(mj2Var);
    }

    public static e21 n(e21 e21Var) {
        mj2 mj2Var;
        ii iiVar = g3.s;
        if (sn0.r(iiVar, iiVar)) {
            mj2Var = d;
        } else if (sn0.r(iiVar, g3.r)) {
            mj2Var = e;
        } else {
            mj2Var = new mj2(e10.f, new h8(iiVar, 25), iiVar);
        }
        return e21Var.d(mj2Var);
    }
}
