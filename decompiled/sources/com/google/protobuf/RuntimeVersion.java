package com.google.protobuf;

import defpackage.l90;
import java.util.Locale;
import java.util.logging.Logger;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class RuntimeVersion {
    public static final RuntimeDomain DOMAIN;
    public static final int MAJOR = 4;
    private static final int MAX_WARNING_COUNT = 20;
    public static final int MINOR = 33;
    public static final RuntimeDomain OSS_DOMAIN;
    public static final int OSS_MAJOR = 4;
    public static final int OSS_MINOR = 33;
    public static final int OSS_PATCH = 2;
    public static final String OSS_SUFFIX = "";
    public static final int PATCH = 2;
    public static final String SUFFIX = "";
    private static final String VERSION_STRING;
    private static final Logger logger;
    static int majorWarningLoggedCount;
    static int minorWarningLoggedCount;
    static boolean preleaseRuntimeWarningLogged;

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class ProtobufRuntimeVersionException extends RuntimeException {
        public ProtobufRuntimeVersionException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public enum RuntimeDomain {
        GOOGLE_INTERNAL,
        PUBLIC
    }

    static {
        RuntimeDomain runtimeDomain = RuntimeDomain.PUBLIC;
        OSS_DOMAIN = runtimeDomain;
        DOMAIN = runtimeDomain;
        majorWarningLoggedCount = 0;
        minorWarningLoggedCount = 0;
        preleaseRuntimeWarningLogged = false;
        VERSION_STRING = versionString(4, 33, 2, "");
        logger = Logger.getLogger(RuntimeVersion.class.getName());
    }

    private RuntimeVersion() {
    }

    private static boolean checkDisabled() {
        String str = System.getenv("TEMPORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        if (str != null && str.equals("true")) {
            return true;
        }
        return false;
    }

    public static void validateProtobufGencodeVersion(RuntimeDomain runtimeDomain, int i, int i2, int i3, String str, String str2) {
        validateProtobufGencodeVersionImpl(runtimeDomain, i, i2, i3, str, str2);
    }

    private static void validateProtobufGencodeVersionImpl(RuntimeDomain runtimeDomain, int i, int i2, int i3, String str, String str2) {
        String str3;
        if (!checkDisabled()) {
            if (i >= 0 && i2 >= 0 && i3 >= 0) {
                RuntimeDomain runtimeDomain2 = DOMAIN;
                if (runtimeDomain == runtimeDomain2) {
                    if (i != 4 || i2 != 33 || i3 != 2 || !str.equals("")) {
                        if (i != 4) {
                            if (i == 3 && majorWarningLoggedCount < 20) {
                                str3 = versionString(i, i2, i3, str);
                                Logger logger2 = logger;
                                Locale locale = Locale.US;
                                logger2.warning(" Protobuf gencode version " + str3 + " is exactly one major version older than the runtime version " + VERSION_STRING + " at " + str2 + ". Please update the gencode to avoid compatibility violations in the next runtime release.");
                                majorWarningLoggedCount = majorWarningLoggedCount + 1;
                            } else {
                                Locale locale2 = Locale.US;
                                String versionString = versionString(i, i2, i3, str);
                                String str4 = VERSION_STRING;
                                StringBuilder sb = new StringBuilder("Detected mismatched Protobuf Gencode/Runtime major versions when loading ");
                                sb.append(str2);
                                sb.append(": gencode ");
                                sb.append(versionString);
                                sb.append(", runtime ");
                                throw new ProtobufRuntimeVersionException(l90.p(sb, str4, ". Same major version is required."));
                            }
                        } else {
                            str3 = null;
                        }
                        if (33 >= i2 && (i2 != 33 || 2 >= i3)) {
                            if (str.isEmpty()) {
                                return;
                            }
                            if (!str.isEmpty()) {
                                if (str3 == null) {
                                    str3 = versionString(i, i2, i3, str);
                                }
                                Locale locale3 = Locale.US;
                                String str5 = VERSION_STRING;
                                StringBuilder sb2 = new StringBuilder("Detected mismatched Protobuf Gencode/Runtime version suffixes when loading ");
                                sb2.append(str2);
                                sb2.append(": gencode ");
                                sb2.append(str3);
                                sb2.append(", runtime ");
                                throw new ProtobufRuntimeVersionException(l90.p(sb2, str5, ". Prerelease gencode must be used with the same runtime."));
                            }
                            if (i == 4 && i2 == 33 && i3 == 2) {
                                if (str3 == null) {
                                    str3 = versionString(i, i2, i3, str);
                                }
                                Locale locale4 = Locale.US;
                                String str6 = VERSION_STRING;
                                StringBuilder sb3 = new StringBuilder("Detected mismatched Protobuf Gencode/Runtime version suffixes when loading ");
                                sb3.append(str2);
                                sb3.append(": gencode ");
                                sb3.append(str3);
                                sb3.append(", runtime ");
                                throw new ProtobufRuntimeVersionException(l90.p(sb3, str6, ". Prelease runtimes must only be used with exact match gencode (including suffix) or non-prerelease gencode versions of a lower version."));
                            }
                            return;
                        }
                        if (str3 == null) {
                            str3 = versionString(i, i2, i3, str);
                        }
                        Locale locale5 = Locale.US;
                        String str7 = VERSION_STRING;
                        StringBuilder sb4 = new StringBuilder("Detected incompatible Protobuf Gencode/Runtime versions when loading ");
                        sb4.append(str2);
                        sb4.append(": gencode ");
                        sb4.append(str3);
                        sb4.append(", runtime ");
                        throw new ProtobufRuntimeVersionException(l90.p(sb4, str7, ". Runtime version cannot be older than the linked gencode version."));
                    }
                    return;
                }
                Locale locale6 = Locale.US;
                throw new ProtobufRuntimeVersionException("Detected mismatched Protobuf Gencode/Runtime domains when loading " + str2 + ": gencode " + runtimeDomain + ", runtime " + runtimeDomain2 + ". Cross-domain usage of Protobuf is not supported.");
            }
            throw new ProtobufRuntimeVersionException("Invalid gencode version: " + versionString(i, i2, i3, str));
        }
    }

    private static String versionString(int i, int i2, int i3, String str) {
        Locale locale = Locale.US;
        return i + "." + i2 + "." + i3 + str;
    }
}
