package com.google.android.filament;

import defpackage.se;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class Scene {
    public long a;

    private static native void nAddEntities(long j, int[] iArr);

    private static native void nAddEntity(long j, int i);

    private static native void nRemoveEntities(long j, int[] iArr);

    public final void a(int[] iArr) {
        nAddEntities(c(), iArr);
    }

    public final void b(int i) {
        nAddEntity(c(), i);
    }

    public final long c() {
        long j = this.a;
        if (j != 0) {
            return j;
        }
        se.p("Calling method on destroyed Scene");
        return 0L;
    }

    public final void d(int[] iArr) {
        nRemoveEntities(c(), iArr);
    }
}
