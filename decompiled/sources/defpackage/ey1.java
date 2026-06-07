package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface ey1 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    void close();

    void flush();

    ea2 timeout();

    void write(hk hkVar, long j);
}
