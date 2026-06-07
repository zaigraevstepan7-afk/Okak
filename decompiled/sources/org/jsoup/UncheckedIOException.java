package org.jsoup;

import java.io.IOException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Deprecated
/* loaded from: classes.dex */
public class UncheckedIOException extends java.io.UncheckedIOException {
    public UncheckedIOException(String str) {
        super(new IOException(str));
    }

    public IOException ioException() {
        return getCause();
    }

    public UncheckedIOException(IOException iOException) {
        super(iOException);
    }
}
