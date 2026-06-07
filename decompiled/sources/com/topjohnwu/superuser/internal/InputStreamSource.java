package com.topjohnwu.superuser.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class InputStreamSource implements ShellInputSource {
    private final InputStream in;

    public InputStreamSource(InputStream inputStream) {
        this.in = inputStream;
    }

    @Override // com.topjohnwu.superuser.internal.ShellInputSource, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.in.close();
        } catch (IOException unused) {
        }
    }

    @Override // com.topjohnwu.superuser.internal.ShellInputSource
    public void serve(OutputStream outputStream) {
        Utils.pump(this.in, outputStream);
        this.in.close();
        outputStream.write(10);
    }
}
