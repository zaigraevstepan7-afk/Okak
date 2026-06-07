package defpackage;

import android.graphics.PathMeasure;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class o8 {
    public final PathMeasure a;

    public o8(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final boolean a(float f, float f2, n8 n8Var) {
        if (n8Var instanceof n8) {
            return this.a.getSegment(f, f2, n8Var.a, true);
        }
        se.v("Unable to obtain android.graphics.Path");
        return false;
    }
}
