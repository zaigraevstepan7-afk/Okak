package com.google.android.filament;

import defpackage.l90;
import defpackage.se;
import defpackage.u80;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class View {
    public long a;
    public u80 b;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class InternalOnPickCallback implements Runnable {
        float mDepth;
        float mFragCoordsX;
        float mFragCoordsY;
        float mFragCoordsZ;
        int mRenderable;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    static {
        l90.z(2);
        l90.z(2);
        l90.z(2);
    }

    private static native void nSetBlendMode(long j, int i);

    private static native void nSetCamera(long j, long j2);

    private static native void nSetPostProcessingEnabled(long j, boolean z);

    private static native void nSetScene(long j, long j2);

    private static native void nSetViewport(long j, int i, int i2, int i3, int i4);

    public final long a() {
        long j = this.a;
        if (j != 0) {
            return j;
        }
        se.p("Calling method on destroyed View");
        return 0L;
    }

    public final void b() {
        nSetBlendMode(a(), l90.y(2));
    }

    public final void c(Camera camera) {
        nSetCamera(a(), camera.a());
    }

    public final void d() {
        nSetPostProcessingEnabled(a(), false);
    }

    public final void e(Scene scene) {
        nSetScene(a(), scene.c());
    }

    public final void f(u80 u80Var) {
        this.b = u80Var;
        long a = a();
        u80 u80Var2 = this.b;
        u80Var2.getClass();
        nSetViewport(a, 0, 0, u80Var2.e, u80Var2.f);
    }
}
