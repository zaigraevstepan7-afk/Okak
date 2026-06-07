package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class od0 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile o12 b = new o12();
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.d(115, new pd0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.d(130, new pd0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.d(150, new pd0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.d(180, new pd0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.d(200, new pd0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.c(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        ml0.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static nd0 a(float f) {
        float c2;
        nd0 nd0Var;
        float f2;
        float[] fArr = a;
        if (f >= 1.03f) {
            int i = (int) (f * 100.0f);
            nd0 nd0Var2 = (nd0) b.b(i);
            if (nd0Var2 != null) {
                return nd0Var2;
            }
            o12 o12Var = b;
            if (o12Var.e) {
                f2.g(o12Var);
            }
            int m = f2.m(o12Var.f, o12Var.h, i);
            if (m >= 0) {
                return (nd0) b.f(m);
            }
            int i2 = -(m + 1);
            int i3 = i2 - 1;
            if (i2 >= b.e()) {
                pd0 pd0Var = new pd0(new float[]{1.0f}, new float[]{f});
                b(f, pd0Var);
                return pd0Var;
            }
            if (i3 < 0) {
                nd0Var = new pd0(fArr, fArr);
                c2 = 1.0f;
            } else {
                c2 = b.c(i3) / 100.0f;
                nd0Var = (nd0) b.f(i3);
            }
            float c3 = b.c(i2) / 100.0f;
            if (c2 == c3) {
                f2 = 0.0f;
            } else {
                f2 = (f - c2) / (c3 - c2);
            }
            float max = (Math.max(0.0f, Math.min(1.0f, f2)) * 1.0f) + 0.0f;
            nd0 nd0Var3 = (nd0) b.f(i2);
            float[] fArr2 = new float[9];
            for (int i4 = 0; i4 < 9; i4++) {
                float f3 = fArr[i4];
                float b2 = nd0Var.b(f3);
                fArr2[i4] = ((nd0Var3.b(f3) - b2) * max) + b2;
            }
            pd0 pd0Var2 = new pd0(fArr, fArr2);
            b(f, pd0Var2);
            return pd0Var2;
        }
        return null;
    }

    public static void b(float f, pd0 pd0Var) {
        synchronized (c) {
            o12 clone = b.clone();
            clone.d((int) (f * 100.0f), pd0Var);
            b = clone;
        }
    }
}
