package org.jsoup.internal;

import defpackage.m50;
import defpackage.rm;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class StringUtil {
    private static final int InitBuilderSize = 1024;
    private static final int MaxBuilderSize = 8192;
    static final String[] padding = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
    private static final Pattern extraDotSegmentsPattern = Pattern.compile("^/(?>(?>\\.\\.?/)+)");
    private static final Pattern validUriScheme = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");
    private static final Pattern controlChars = Pattern.compile("[\\x00-\\x1f]*");
    private static final SoftPool<StringBuilder> BuilderPool = new SoftPool<>(new rm(5));

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static class StringJoiner {
        final String separator;
        StringBuilder sb = StringUtil.borrowBuilder();
        boolean first = true;

        public StringJoiner(String str) {
            this.separator = str;
        }

        public StringJoiner add(Object obj) {
            Validate.notNull(this.sb);
            if (!this.first) {
                this.sb.append(this.separator);
            }
            this.sb.append(obj);
            this.first = false;
            return this;
        }

        public StringJoiner append(Object obj) {
            Validate.notNull(this.sb);
            this.sb.append(obj);
            return this;
        }

        public String complete() {
            String releaseBuilder = StringUtil.releaseBuilder(this.sb);
            this.sb = null;
            return releaseBuilder;
        }
    }

    public static void appendNormalisedWhitespace(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (isActuallyWhitespace(codePointAt)) {
                if ((!z || z2) && !z3) {
                    sb.append(' ');
                    z3 = true;
                }
            } else if (!isInvisibleChar(codePointAt)) {
                sb.appendCodePoint(codePointAt);
                z3 = false;
                z2 = true;
            }
            i += Character.charCount(codePointAt);
        }
    }

    public static StringBuilder borrowBuilder() {
        return BuilderPool.borrow();
    }

    public static /* synthetic */ StringBuilder c() {
        return lambda$static$0();
    }

    public static boolean in(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean inSorted(String str, String[] strArr) {
        if (Arrays.binarySearch(strArr, str) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean isActuallyWhitespace(int i) {
        if (i != 32 && i != 9 && i != 10 && i != 12 && i != 13 && i != 160) {
            return false;
        }
        return true;
    }

    public static boolean isAscii(String str) {
        Validate.notNull(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBlank(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!isWhitespace(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isInvisibleChar(int i) {
        if (i != 8203 && i != 173) {
            return false;
        }
        return true;
    }

    public static boolean isNumeric(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.codePointAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isWhitespace(int i) {
        if (i != 32 && i != 9 && i != 10 && i != 12 && i != 13) {
            return false;
        }
        return true;
    }

    public static String join(Iterator<?> it, String str) {
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        StringJoiner stringJoiner = new StringJoiner(str);
        stringJoiner.add(obj);
        while (it.hasNext()) {
            stringJoiner.add(it.next());
        }
        return stringJoiner.complete();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.function.BinaryOperator] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.function.BiConsumer, java.lang.Object] */
    public static Collector<CharSequence, ?, String> joining(final String str) {
        return Collector.of(new Supplier() { // from class: e32
            @Override // java.util.function.Supplier
            public final Object get() {
                StringUtil.StringJoiner lambda$joining$1;
                lambda$joining$1 = StringUtil.lambda$joining$1(str);
                return lambda$joining$1;
            }
        }, new Object(), new Object(), new m50(10), new Collector.Characteristics[0]);
    }

    public static /* synthetic */ StringJoiner lambda$joining$1(String str) {
        return new StringJoiner(str);
    }

    public static /* synthetic */ StringJoiner lambda$joining$2(StringJoiner stringJoiner, StringJoiner stringJoiner2) {
        stringJoiner.append(stringJoiner2.complete());
        return stringJoiner;
    }

    public static /* synthetic */ StringBuilder lambda$static$0() {
        return new StringBuilder(InitBuilderSize);
    }

    public static String normaliseWhitespace(String str) {
        StringBuilder borrowBuilder = borrowBuilder();
        appendNormalisedWhitespace(borrowBuilder, str, false);
        return releaseBuilder(borrowBuilder);
    }

    public static String padding(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Validate.isTrue(z, "width must be >= 0");
        if (i2 < -1) {
            z2 = false;
        }
        Validate.isTrue(z2);
        if (i2 != -1) {
            i = Math.min(i, i2);
        }
        String[] strArr = padding;
        if (i < strArr.length) {
            return strArr[i];
        }
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = ' ';
        }
        return String.valueOf(cArr);
    }

    public static String releaseBuilder(StringBuilder sb) {
        Validate.notNull(sb);
        String sb2 = sb.toString();
        if (sb.length() <= 8192) {
            sb.delete(0, sb.length());
            BuilderPool.release(sb);
        }
        return sb2;
    }

    public static URL resolve(URL url, String str) {
        String stripControlChars = stripControlChars(str);
        if (stripControlChars.startsWith("?")) {
            stripControlChars = url.getPath() + stripControlChars;
        }
        URL url2 = new URL(url, stripControlChars);
        String replaceFirst = extraDotSegmentsPattern.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            replaceFirst = replaceFirst + "#" + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), replaceFirst);
    }

    public static boolean startsWithNewline(String str) {
        if (str == null || str.length() == 0 || str.charAt(0) != '\n') {
            return false;
        }
        return true;
    }

    private static String stripControlChars(String str) {
        return controlChars.matcher(str).replaceAll("");
    }

    public static String padding(int i) {
        return padding(i, 30);
    }

    public static String join(Collection<?> collection, String str) {
        return join(collection.iterator(), str);
    }

    public static String join(String[] strArr, String str) {
        return join(Arrays.asList(strArr), str);
    }

    public static String resolve(String str, String str2) {
        String stripControlChars = stripControlChars(str);
        String stripControlChars2 = stripControlChars(str2);
        try {
            try {
                return resolve(new URL(stripControlChars), stripControlChars2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(stripControlChars2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return validUriScheme.matcher(stripControlChars2).find() ? stripControlChars2 : "";
        }
    }
}
