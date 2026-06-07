package com.google.android.filament;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class EntityManager {
    public final long a;

    public EntityManager() {
        this.a = nGetEntityManager();
    }

    private static native int nCreate(long j);

    private static native long nGetEntityManager();

    public final int a() {
        return nCreate(this.a);
    }

    public long getNativeObject() {
        return this.a;
    }

    public EntityManager(long j) {
        nGetEntityManager();
        this.a = j;
    }
}
