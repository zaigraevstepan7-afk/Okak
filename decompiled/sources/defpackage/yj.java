package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yj implements xj {
    @Override // defpackage.xj
    public final float a(float f, float f2, float f3) {
        boolean z;
        float abs = Math.abs((f2 + f) - f);
        if (abs <= f3) {
            z = true;
        } else {
            z = false;
        }
        float f4 = (0.3f * f3) - (0.0f * abs);
        float f5 = f3 - f4;
        if (z && f5 < abs) {
            f4 = f3 - abs;
        }
        return f - f4;
    }
}
