package com.google.android.filament.gltfio;

import defpackage.sl0;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class FilamentAsset {
    public long a;

    private static native void nGetBoundingBox(long j, float[] fArr);

    private static native void nGetEntities(long j, int[] iArr);

    private static native int nGetEntityCount(long j);

    private static native void nReleaseSourceData(long j);

    /* JADX WARN: Type inference failed for: r9v1, types: [sl0, java.lang.Object] */
    public final sl0 a() {
        float[] fArr = new float[6];
        nGetBoundingBox(this.a, fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        ?? obj = new Object();
        obj.e = r7;
        obj.f = r6;
        float[] fArr2 = {f, f2, f3};
        float[] fArr3 = {f4, f5, f6};
        return obj;
    }

    public final int[] b() {
        int[] iArr = new int[nGetEntityCount(this.a)];
        nGetEntities(this.a, iArr);
        return iArr;
    }

    public final void c() {
        nReleaseSourceData(this.a);
    }
}
