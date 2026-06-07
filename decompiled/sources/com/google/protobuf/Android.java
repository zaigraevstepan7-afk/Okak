package com.google.protobuf;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
final class Android {
    private static boolean ASSUME_ANDROID = false;
    private static final boolean IS_ROBOLECTRIC;
    private static final Class<?> MEMORY_CLASS = getClassForName("libcore.io.Memory");
    static boolean assumeLiteRuntime = false;

    static {
        boolean z;
        if (!ASSUME_ANDROID && getClassForName("org.robolectric.Robolectric") != null) {
            z = true;
        } else {
            z = IS_ROBOLECTRIC;
        }
        IS_ROBOLECTRIC = z;
    }

    private Android() {
    }

    private static <T> Class<T> getClassForName(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> getMemoryClass() {
        return MEMORY_CLASS;
    }

    public static boolean isOnAndroidDevice() {
        if (!ASSUME_ANDROID) {
            if (MEMORY_CLASS == null || IS_ROBOLECTRIC) {
                return IS_ROBOLECTRIC;
            }
            return true;
        }
        return true;
    }
}
