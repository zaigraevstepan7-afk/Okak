package com.google.android.filament.utils;

import defpackage.yq1;
import java.nio.Buffer;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0082 ¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0082 ¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000fH\u0082 ¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/android/filament/utils/KTX1Loader;", "", "<init>", "()V", "", "nativeEngine", "Ljava/nio/Buffer;", "buffer", "", "remaining", "", "srgb", "nCreateKTXTexture", "(JLjava/nio/Buffer;IZ)J", "ktxTexture", "", "sphericalHarmonics", "nCreateIndirectLight", "(JJ[F)J", "outSphericalHarmonics", "nGetSphericalHarmonics", "(Ljava/nio/Buffer;I[F)Z", "nCreateSkybox", "(JJ)J", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class KTX1Loader {
    static {
        new KTX1Loader();
    }

    private KTX1Loader() {
    }

    private final native long nCreateIndirectLight(long nativeEngine, long ktxTexture, float[] sphericalHarmonics);

    private final native long nCreateKTXTexture(long nativeEngine, Buffer buffer, int remaining, boolean srgb);

    private final native long nCreateSkybox(long nativeEngine, long ktxTexture);

    private final native boolean nGetSphericalHarmonics(Buffer buffer, int remaining, float[] outSphericalHarmonics);
}
