package org.jsoup.internal;

import java.util.Locale;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class Normalizer {
    public static String lowerCase(String str) {
        if (str != null) {
            return str.toLowerCase(Locale.ENGLISH);
        }
        return "";
    }

    public static String normalize(String str, boolean z) {
        if (z) {
            return lowerCase(str);
        }
        return normalize(str);
    }

    public static String normalize(String str) {
        return lowerCase(str).trim();
    }
}
