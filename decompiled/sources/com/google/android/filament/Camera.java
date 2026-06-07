package com.google.android.filament;

import defpackage.l90;
import defpackage.se;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class Camera {
    public long a;

    private static native void nLookAt(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9);

    private static native void nSetExposure(long j, float f, float f2, float f3);

    private static native void nSetProjectionFov(long j, double d, double d2, double d3, double d4, int i);

    public final long a() {
        long j = this.a;
        if (j != 0) {
            return j;
        }
        se.p("Calling method on destroyed Camera");
        return 0L;
    }

    public final void b(double d, double d2, double d3, double d4, double d5, double d6) {
        nLookAt(a(), d, d2, d3, d4, d5, d6, 0.0d, 1.0d, 0.0d);
    }

    public final void c() {
        nSetExposure(a(), 1.0f, 0.016666668f, 400.0f);
    }

    public final void d(double d, double d2) {
        nSetProjectionFov(a(), 28.0d, d, 0.05d, d2, l90.y(1));
    }
}
