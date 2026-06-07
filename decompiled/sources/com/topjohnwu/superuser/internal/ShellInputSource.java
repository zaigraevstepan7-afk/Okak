package com.topjohnwu.superuser.internal;

import java.io.Closeable;
import java.io.OutputStream;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
interface ShellInputSource extends Closeable {
    public static final String TAG = "SHELL_IN";

    void serve(OutputStream outputStream);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
    }
}
