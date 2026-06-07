package com.google.android.filament.utils;

import defpackage.yq1;
import java.nio.Buffer;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0082 ¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/google/android/filament/utils/HDRLoader;", "", "<init>", "()V", "", "nativeEngine", "Ljava/nio/Buffer;", "buffer", "", "remaining", "format", "nCreateHDRTexture", "(JLjava/nio/Buffer;II)J", "filament-utils-android_release"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class HDRLoader {
    static {
        new HDRLoader();
    }

    private HDRLoader() {
    }

    private final native long nCreateHDRTexture(long nativeEngine, Buffer buffer, int remaining, int format);
}
