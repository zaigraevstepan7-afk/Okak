package com.google.android.filament.gltfio;

import com.google.android.filament.Engine;
import defpackage.mb2;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class UbershaderProvider implements MaterialProvider {
    public final long a;

    static {
        mb2._values();
    }

    public UbershaderProvider(Engine engine) {
        this.a = nCreateUbershaderProvider(engine.getNativeObject());
    }

    private static native long nCreateUbershaderProvider(long j);

    public long getNativeObject() {
        return this.a;
    }
}
