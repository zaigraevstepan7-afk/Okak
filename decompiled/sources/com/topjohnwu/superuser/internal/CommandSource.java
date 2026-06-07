package com.topjohnwu.superuser.internal;

import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
class CommandSource implements ShellInputSource {
    private final String[] cmd;

    public CommandSource(String[] strArr) {
        this.cmd = strArr;
    }

    @Override // com.topjohnwu.superuser.internal.ShellInputSource
    public void serve(OutputStream outputStream) {
        for (String str : this.cmd) {
            outputStream.write(str.getBytes(StandardCharsets.UTF_8));
            outputStream.write(10);
        }
    }
}
