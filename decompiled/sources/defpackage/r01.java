package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class r01 {
    public static final float a = d6.t;
    public static final rc1 b;

    static {
        boolean z;
        boolean z2;
        boolean z3;
        sn0.m(10, 0.0f);
        float f = w01.a;
        b = new rc1(12.0f, 0.0f, 12.0f, 0.0f);
        boolean z4 = false;
        if (0.0f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (2.0f >= 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z & z2;
        if (0.0f >= 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 & z3;
        if (2.0f >= 0.0f) {
            z4 = true;
        }
        if (!(z6 & z4)) {
            il0.a("Padding must be non-negative");
        }
    }
}
