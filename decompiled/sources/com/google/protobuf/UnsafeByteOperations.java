package com.google.protobuf;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class UnsafeByteOperations {
    private UnsafeByteOperations() {
    }

    public static ByteString unsafeWrap(byte[] bArr) {
        return ByteString.wrap(bArr);
    }

    public static void unsafeWriteTo(ByteString byteString, ByteOutput byteOutput) {
        byteString.writeTo(byteOutput);
    }

    public static ByteString unsafeWrap(byte[] bArr, int i, int i2) {
        return ByteString.wrap(bArr, i, i2);
    }

    public static ByteString unsafeWrap(ByteBuffer byteBuffer) {
        return ByteString.wrap(byteBuffer);
    }
}
