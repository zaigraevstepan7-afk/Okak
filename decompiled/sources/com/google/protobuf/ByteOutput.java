package com.google.protobuf;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ByteOutput {
    public abstract void write(byte b);

    public abstract void write(ByteBuffer byteBuffer);

    public abstract void write(byte[] bArr, int i, int i2);

    public abstract void writeLazy(ByteBuffer byteBuffer);

    public abstract void writeLazy(byte[] bArr, int i, int i2);
}
