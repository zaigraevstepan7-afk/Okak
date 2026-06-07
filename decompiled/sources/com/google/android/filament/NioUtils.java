package com.google.android.filament;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
final class NioUtils {
    private NioUtils() {
    }

    public static Object getBaseArray(Buffer buffer) {
        if (buffer.hasArray()) {
            return buffer.array();
        }
        return null;
    }

    public static int getBaseArrayOffset(Buffer buffer, int i) {
        if (buffer.hasArray()) {
            return (buffer.position() + buffer.arrayOffset()) << i;
        }
        return 0;
    }

    public static long getBasePointer(Buffer buffer, long j, int i) {
        if (j == 0) {
            return 0L;
        }
        return j + (buffer.position() << i);
    }

    public static int getBufferType(Buffer buffer) {
        if (buffer instanceof ByteBuffer) {
            return 0;
        }
        if (buffer instanceof CharBuffer) {
            return 1;
        }
        if (buffer instanceof ShortBuffer) {
            return 2;
        }
        if (buffer instanceof IntBuffer) {
            return 3;
        }
        if (buffer instanceof LongBuffer) {
            return 4;
        }
        if (buffer instanceof FloatBuffer) {
            return 5;
        }
        return 6;
    }
}
