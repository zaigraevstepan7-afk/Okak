package kotlinx.serialization.json.internal;

import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/serialization/json/internal/CharArrayPool;", "Lkotlinx/serialization/json/internal/CharArrayPoolBase;", "<init>", "()V", "", "take", "()[C", "array", "Lod2;", "release", "([C)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class CharArrayPool extends CharArrayPoolBase {
    public static final CharArrayPool INSTANCE = new CharArrayPool();

    private CharArrayPool() {
    }

    public final void release(char[] array) {
        array.getClass();
        releaseImpl(array);
    }

    public final char[] take() {
        return take(128);
    }
}
