package com.google.android.filament;

import defpackage.gf0;
import defpackage.l90;
import defpackage.mm1;
import defpackage.se;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class Renderer {
    public final Engine a;
    public final long b;

    public Renderer(Engine engine, long j) {
        this.a = engine;
        this.b = j;
    }

    private static native boolean nBeginFrame(long j, long j2, long j3);

    private static native void nEndFrame(long j);

    private static native int nReadPixels(long j, long j2, int i, int i2, int i3, int i4, Buffer buffer, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Object obj, Runnable runnable);

    private static native void nRender(long j, long j2);

    private static native void nSetClearOptions(long j, double d, double d2, double d3, double d4, boolean z, boolean z2);

    public final boolean a(SwapChain swapChain, long j) {
        long c = c();
        long j2 = swapChain.a;
        if (j2 != 0) {
            return nBeginFrame(c, j2, j);
        }
        se.p("Calling method on destroyed SwapChain");
        return false;
    }

    public final void b() {
        nEndFrame(c());
    }

    public final long c() {
        long j = this.b;
        if (j != 0) {
            return j;
        }
        se.p("Calling method on destroyed Renderer");
        return 0L;
    }

    public final void d(int i, int i2, gf0 gf0Var) {
        ByteBuffer byteBuffer = (ByteBuffer) gf0Var.e;
        if (!byteBuffer.isReadOnly()) {
            if (nReadPixels(c(), this.a.getNativeObject(), 0, 0, i, i2, byteBuffer, byteBuffer.remaining(), 0, 0, l90.y(gf0Var.b), gf0Var.c, 0, l90.y(gf0Var.d), null, null) >= 0) {
                return;
            } else {
                throw new BufferOverflowException();
            }
        }
        throw new ReadOnlyBufferException();
    }

    public final void e(View view) {
        nRender(c(), view.a());
    }

    public final void f(mm1 mm1Var) {
        long c = c();
        double[] dArr = mm1Var.a;
        nSetClearOptions(c, dArr[0], dArr[1], dArr[2], dArr[3], mm1Var.b, true);
    }
}
