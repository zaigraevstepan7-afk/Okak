package com.topjohnwu.superuser.internal;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class StreamGobbler<T> implements Callable<T> {
    private static final String TAG = "SHELLOUT";
    protected final InputStream in;
    protected final List<String> list;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class ERR extends StreamGobbler<Void> {
        public ERR(InputStream inputStream, List<String> list) {
            super(inputStream, list);
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            process(false);
            return null;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class OUT extends StreamGobbler<Integer> {
        private static final int NO_RESULT_CODE = 1;

        public OUT(InputStream inputStream, List<String> list) {
            super(inputStream, list);
        }

        @Override // java.util.concurrent.Callable
        public Integer call() {
            int parseInt;
            String process = process(true);
            if (process == null) {
                parseInt = 1;
            } else {
                try {
                    parseInt = Integer.parseInt(process);
                } catch (NumberFormatException unused) {
                    return 1;
                }
            }
            return Integer.valueOf(parseInt);
        }
    }

    public StreamGobbler(InputStream inputStream, List<String> list) {
        this.in = inputStream;
        this.list = list;
    }

    private boolean outputAndCheck(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        int i = length - 36;
        boolean startsWith = str.startsWith(JobTask.END_UUID, i);
        if (startsWith) {
            if (length == 36) {
                return false;
            }
            str = str.substring(0, i);
        }
        List<String> list = this.list;
        if (list != null) {
            list.add(str);
        }
        return !startsWith;
    }

    public String process(boolean z) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.in, StandardCharsets.UTF_8));
        do {
        } while (outputAndCheck(bufferedReader.readLine()));
        if (z) {
            return bufferedReader.readLine();
        }
        return null;
    }
}
