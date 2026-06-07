package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class be2 {
    public static final long a = ha0.a(0.0f, 0.0f);
    public static final float b = 3.1415927f;
    public static final float c = 6.2831855f;

    public static final float a(float f, float f2) {
        float atan2 = (float) Math.atan2(f2, f);
        float f3 = c;
        return (atan2 + f3) % f3;
    }

    public static final long b(float f, float f2) {
        float sqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        if (sqrt > 0.0f) {
            return ha0.a(f / sqrt, f2 / sqrt);
        }
        se.h("Required distance greater than zero");
        return 0L;
    }

    public static final float c(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final float d(float f, float f2) {
        return ((f % f2) + f2) % f2;
    }

    public static long e(float f, float f2) {
        double d = f2;
        return lo.U(lo.Y(ha0.a((float) Math.cos(d), (float) Math.sin(d)), f), a);
    }
}
