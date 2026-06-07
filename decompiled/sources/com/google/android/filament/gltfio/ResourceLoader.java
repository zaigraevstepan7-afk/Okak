package com.google.android.filament.gltfio;

import com.google.android.filament.Engine;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class ResourceLoader {
    public final long a;

    public ResourceLoader(Engine engine) {
        long nativeObject = engine.getNativeObject();
        long nCreateResourceLoader = nCreateResourceLoader(nativeObject, false);
        this.a = nCreateResourceLoader;
        long nCreateStbProvider = nCreateStbProvider(nativeObject);
        long nCreateKtx2Provider = nCreateKtx2Provider(nativeObject);
        nAddTextureProvider(nCreateResourceLoader, "image/jpeg", nCreateStbProvider);
        nAddTextureProvider(nCreateResourceLoader, "image/png", nCreateStbProvider);
        nAddTextureProvider(nCreateResourceLoader, "image/ktx2", nCreateKtx2Provider);
        if (nIsWebpSupported()) {
            nAddTextureProvider(nCreateResourceLoader, "image/webp", nCreateWebpProvider(nativeObject));
        }
    }

    private static native void nAddTextureProvider(long j, String str, long j2);

    private static native long nCreateKtx2Provider(long j);

    private static native long nCreateResourceLoader(long j, boolean z);

    private static native long nCreateStbProvider(long j);

    private static native long nCreateWebpProvider(long j);

    private static native boolean nIsWebpSupported();

    private static native void nLoadResources(long j, long j2);

    public final void a(FilamentAsset filamentAsset) {
        nLoadResources(this.a, filamentAsset.a);
    }
}
