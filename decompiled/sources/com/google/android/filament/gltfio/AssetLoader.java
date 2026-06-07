package com.google.android.filament.gltfio;

import com.google.android.filament.Engine;
import com.google.android.filament.EntityManager;
import defpackage.se;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class AssetLoader {
    public final long a;

    public AssetLoader(Engine engine, UbershaderProvider ubershaderProvider, EntityManager entityManager) {
        long nCreateAssetLoader = nCreateAssetLoader(engine.getNativeObject(), ubershaderProvider, entityManager.getNativeObject());
        this.a = nCreateAssetLoader;
        if (nCreateAssetLoader != 0) {
            return;
        }
        se.p("Unable to parse glTF asset.");
        throw null;
    }

    private static native long nCreateAsset(long j, Buffer buffer, int i);

    private static native long nCreateAssetLoader(long j, Object obj, long j2);

    private static native void nDestroyAsset(long j, long j2);

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.google.android.filament.gltfio.FilamentAsset] */
    public final FilamentAsset a(ByteBuffer byteBuffer) {
        long nCreateAsset = nCreateAsset(this.a, byteBuffer, byteBuffer.remaining());
        if (nCreateAsset != 0) {
            ?? obj = new Object();
            obj.a = nCreateAsset;
            return obj;
        }
        return null;
    }

    public final void b(FilamentAsset filamentAsset) {
        nDestroyAsset(this.a, filamentAsset.a);
        filamentAsset.a = 0L;
    }
}
