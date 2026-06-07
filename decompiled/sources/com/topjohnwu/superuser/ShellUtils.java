package com.topjohnwu.superuser;

import android.os.Looper;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ShellUtils {
    private static final char SINGLE_QUOTE = '\'';

    private ShellUtils() {
    }

    public static void cleanInputStream(InputStream inputStream) {
        while (inputStream.available() != 0) {
            try {
                inputStream.skip(inputStream.available());
            } catch (IOException unused) {
                return;
            }
        }
    }

    public static String escapedString(String str) {
        StringBuilder sb = new StringBuilder("'");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\'') {
                sb.append("'\\''");
            } else {
                sb.append(charAt);
            }
        }
        sb.append(SINGLE_QUOTE);
        return sb.toString();
    }

    public static String fastCmd(Shell shell, String... strArr) {
        List<String> out = shell.newJob().add(strArr).to(new ArrayList(), null).exec().getOut();
        if (isValidOutput(out)) {
            return out.get(out.size() - 1);
        }
        return "";
    }

    public static boolean fastCmdResult(Shell shell, String... strArr) {
        return shell.newJob().add(strArr).to(null).exec().isSuccess();
    }

    public static long gcd(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int i = 0;
        while (((j | j2) & 1) == 0) {
            j >>= 1;
            j2 >>= 1;
            i++;
        }
        while ((j & 1) == 0) {
            j >>= 1;
        }
        while (true) {
            if ((j2 & 1) == 0) {
                j2 >>= 1;
            } else {
                if (j <= j2) {
                    long j3 = j2;
                    j2 = j;
                    j = j3;
                }
                long j4 = j - j2;
                if (j4 == 0) {
                    return j2 << i;
                }
                long j5 = j2;
                j2 = j4;
                j = j5;
            }
        }
    }

    public static boolean isValidOutput(List<String> list) {
        if (list != null && list.size() != 0) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (!TextUtils.isEmpty(it.next())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean onMainThread() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static boolean fastCmdResult(String... strArr) {
        return fastCmdResult(Shell.getShell(), strArr);
    }

    public static String fastCmd(String... strArr) {
        return fastCmd(Shell.getShell(), strArr);
    }
}
