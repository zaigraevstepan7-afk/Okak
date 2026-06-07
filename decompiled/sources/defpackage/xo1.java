package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class xo1 {
    public static final js a = new js(new ax0(16));
    public static final zo1 b;
    public static final zo1 c;

    static {
        long j = co.g;
        b = new zo1(true, Float.NaN, j);
        c = new zo1(false, Float.NaN, j);
    }

    public static zo1 a(float f, int i, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        long j = co.g;
        if (f20.b(f, Float.NaN) && co.c(j, j)) {
            if (z) {
                return b;
            }
            return c;
        }
        return new zo1(z, f, j);
    }
}
