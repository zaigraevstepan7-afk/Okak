package com.google.android.filament;

import defpackage.l90;
import defpackage.se;
import defpackage.u80;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class Engine {
    public final long a;

    static {
        l90.z(6);
        l90.z(4);
    }

    public Engine(long j) {
        this.a = j;
        nGetTransformManager(j);
        nGetLightManager(j);
        nGetRenderableManager(j);
        new EntityManager(nGetEntityManager(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    private static native long nCreateCamera(long j, int i);

    private static native long nCreateRenderer(long j);

    private static native long nCreateScene(long j);

    private static native long nCreateSwapChainHeadless(long j, int i, int i2, long j2);

    private static native long nCreateView(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native boolean nDestroySwapChain(long j, long j2);

    private static native boolean nFlushAndWait(long j, long j2);

    private static native long nGetEntityManager(long j);

    private static native long nGetJobSystem(long j);

    private static native long nGetLightManager(long j);

    private static native long nGetRenderableManager(long j);

    private static native long nGetTransformManager(long j);

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.filament.Camera, java.lang.Object] */
    public final Camera d(int i) {
        long nCreateCamera = nCreateCamera(getNativeObject(), i);
        if (nCreateCamera != 0) {
            ?? obj = new Object();
            obj.a = nCreateCamera;
            return obj;
        }
        se.p("Couldn't create Camera");
        return null;
    }

    public final Renderer e() {
        long nCreateRenderer = nCreateRenderer(getNativeObject());
        if (nCreateRenderer != 0) {
            return new Renderer(this, nCreateRenderer);
        }
        se.p("Couldn't create Renderer");
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.google.android.filament.Scene] */
    public final Scene f() {
        long nCreateScene = nCreateScene(getNativeObject());
        if (nCreateScene != 0) {
            ?? obj = new Object();
            obj.a = nCreateScene;
            return obj;
        }
        se.p("Couldn't create Scene");
        return null;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [com.google.android.filament.SwapChain, java.lang.Object] */
    public final SwapChain g(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            long nCreateSwapChainHeadless = nCreateSwapChainHeadless(getNativeObject(), i, i2, 3L);
            if (nCreateSwapChainHeadless != 0) {
                ?? obj = new Object();
                obj.a = nCreateSwapChainHeadless;
                return obj;
            }
            se.p("Couldn't create SwapChain");
            return null;
        }
        se.h("Invalid parameters");
        return null;
    }

    public long getNativeJobSystem() {
        if (this.a != 0) {
            return nGetJobSystem(getNativeObject());
        }
        se.p("Calling method on destroyed Engine");
        return 0L;
    }

    public long getNativeObject() {
        long j = this.a;
        if (j != 0) {
            return j;
        }
        se.p("Calling method on destroyed Engine");
        return 0L;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.google.android.filament.View] */
    public final View h() {
        long nCreateView = nCreateView(getNativeObject());
        if (nCreateView != 0) {
            ?? obj = new Object();
            obj.b = new u80(0, 0);
            obj.a = nCreateView;
            return obj;
        }
        se.p("Couldn't create View");
        return null;
    }

    public final void i(SwapChain swapChain) {
        long nativeObject = getNativeObject();
        long j = swapChain.a;
        if (j != 0) {
            if (nDestroySwapChain(nativeObject, j)) {
                swapChain.a = 0L;
                return;
            } else {
                se.p("Object couldn't be destroyed (double destroy()?)");
                return;
            }
        }
        se.p("Calling method on destroyed SwapChain");
    }

    public final void j() {
        nFlushAndWait(getNativeObject(), -1L);
    }
}
