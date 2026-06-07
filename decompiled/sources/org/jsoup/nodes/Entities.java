package org.jsoup.nodes;

import defpackage.d9;
import defpackage.rm;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jsoup.SerializationException;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.parser.CharacterReader;
import org.jsoup.parser.Parser;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class Entities {
    static final int ForAttribute = 2;
    static final int ForText = 1;
    static final int Normalise = 4;
    static final int TrimLeading = 8;
    static final int TrimTrailing = 16;
    static final int codepointRadix = 36;
    private static final int empty = -1;
    private static final String emptyName = "";
    private static final char[] codeDelims = {AbstractJsonLexerKt.COMMA, ';'};
    private static final HashMap<String, String> multipoints = new HashMap<>();
    private static final int BaseCount = 106;
    private static final ArrayList<String> baseSorted = new ArrayList<>(BaseCount);
    private static final ThreadLocal<char[]> charBuf = ThreadLocal.withInitial(new rm(3));
    private static final ThreadLocal<CharsetEncoder> LocalEncoder = new ThreadLocal<>();

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* renamed from: org.jsoup.nodes.Entities$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$jsoup$nodes$Entities$CoreCharset;

        static {
            int[] iArr = new int[CoreCharset.values().length];
            $SwitchMap$org$jsoup$nodes$Entities$CoreCharset = iArr;
            try {
                iArr[CoreCharset.ascii.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jsoup$nodes$Entities$CoreCharset[CoreCharset.utf.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public enum CoreCharset {
        ascii,
        utf,
        fallback;

        public static CoreCharset byName(String str) {
            if (str.equals("US-ASCII")) {
                return ascii;
            }
            if (str.startsWith("UTF-")) {
                return utf;
            }
            return fallback;
        }
    }

    /* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
    /* loaded from: classes.dex */
    public static final class EscapeMode extends Enum<EscapeMode> {
        public static final EscapeMode base;
        private int[] codeKeys;
        private int[] codeVals;
        private String[] nameKeys;
        private String[] nameVals;
        public static final EscapeMode xhtml = new EscapeMode(EntitiesData.xmlPoints, 4);
        public static final EscapeMode extended = new EscapeMode(EntitiesData.fullPoints, 2125);
        private static final /* synthetic */ EscapeMode[] $VALUES = $values();

        private static /* synthetic */ EscapeMode[] $values() {
            return new EscapeMode[]{xhtml, base, extended};
        }

        static {
            EscapeMode escapeMode = new EscapeMode(EntitiesData.basePoints, Entities.BaseCount);
            base = escapeMode;
            extended = new EscapeMode(EntitiesData.fullPoints, 2125);
            $VALUES = $values();
            Collections.addAll(Entities.baseSorted, escapeMode.nameKeys);
            Entities.baseSorted.sort(new d9(2));
        }

        private EscapeMode(String str, int i, String str2, int i2) {
            super(str, i);
            Entities.load(this, str2, i2);
        }

        public static /* synthetic */ int lambda$static$0(String str, String str2) {
            return str2.length() - str.length();
        }

        public static EscapeMode valueOf(String str) {
            return (EscapeMode) Enum.valueOf(EscapeMode.class, str);
        }

        public static EscapeMode[] values() {
            return (EscapeMode[]) $VALUES.clone();
        }

        public int codepointForName(String str) {
            int binarySearch = Arrays.binarySearch(this.nameKeys, str);
            if (binarySearch >= 0) {
                return this.codeVals[binarySearch];
            }
            return -1;
        }

        public String nameForCodepoint(int i) {
            int binarySearch = Arrays.binarySearch(this.codeKeys, i);
            if (binarySearch >= 0) {
                String[] strArr = this.nameVals;
                if (binarySearch < strArr.length - 1) {
                    int i2 = binarySearch + 1;
                    if (this.codeKeys[i2] == i) {
                        return strArr[i2];
                    }
                }
                return strArr[binarySearch];
            }
            return "";
        }
    }

    private Entities() {
    }

    private static void appendApos(Appendable appendable, int i, EscapeMode escapeMode) {
        if ((i & 2) != 0 && (i & 1) != 0) {
            if (escapeMode == EscapeMode.xhtml) {
                appendable.append("&#x27;");
                return;
            } else {
                appendable.append("&apos;");
                return;
            }
        }
        appendable.append('\'');
    }

    private static void appendEncoded(Appendable appendable, EscapeMode escapeMode, int i) {
        String nameForCodepoint = escapeMode.nameForCodepoint(i);
        if (!"".equals(nameForCodepoint)) {
            appendable.append('&').append(nameForCodepoint).append(';');
        } else {
            appendable.append("&#x").append(Integer.toHexString(i)).append(';');
        }
    }

    private static void appendEscaped(int i, Appendable appendable, int i2, EscapeMode escapeMode, Document.OutputSettings.Syntax syntax, CoreCharset coreCharset, CharsetEncoder charsetEncoder) {
        char c = (char) i;
        if (i < 65536) {
            if (c != '\t' && c != '\n' && c != '\r') {
                if (c != '\"') {
                    if (c != '<') {
                        if (c != '>') {
                            if (c != 160) {
                                if (c != '&') {
                                    if (c != '\'') {
                                        if (c >= ' ' && canEncode(coreCharset, c, charsetEncoder)) {
                                            appendable.append(c);
                                            return;
                                        } else {
                                            appendEncoded(appendable, escapeMode, i);
                                            return;
                                        }
                                    }
                                    appendApos(appendable, i2, escapeMode);
                                    return;
                                }
                                appendable.append("&amp;");
                                return;
                            }
                            appendNbsp(appendable, escapeMode);
                            return;
                        }
                        if ((i2 & 1) != 0) {
                            appendable.append("&gt;");
                            return;
                        } else {
                            appendable.append(c);
                            return;
                        }
                    }
                    appendLt(appendable, i2, escapeMode, syntax);
                    return;
                }
                if ((i2 & 2) != 0) {
                    appendable.append("&quot;");
                    return;
                } else {
                    appendable.append(c);
                    return;
                }
            }
            appendable.append(c);
            return;
        }
        if (canEncode(coreCharset, c, charsetEncoder)) {
            char[] cArr = charBuf.get();
            int chars = Character.toChars(i, cArr, 0);
            if (appendable instanceof StringBuilder) {
                ((StringBuilder) appendable).append(cArr, 0, chars);
                return;
            } else {
                appendable.append(new String(cArr, 0, chars));
                return;
            }
        }
        appendEncoded(appendable, escapeMode, i);
    }

    private static void appendLt(Appendable appendable, int i, EscapeMode escapeMode, Document.OutputSettings.Syntax syntax) {
        if ((i & 1) == 0 && escapeMode != EscapeMode.xhtml && syntax != Document.OutputSettings.Syntax.xml) {
            appendable.append('<');
        } else {
            appendable.append("&lt;");
        }
    }

    private static void appendNbsp(Appendable appendable, EscapeMode escapeMode) {
        if (escapeMode != EscapeMode.xhtml) {
            appendable.append("&nbsp;");
        } else {
            appendable.append("&#xa0;");
        }
    }

    private static boolean canEncode(CoreCharset coreCharset, char c, CharsetEncoder charsetEncoder) {
        int i = AnonymousClass1.$SwitchMap$org$jsoup$nodes$Entities$CoreCharset[coreCharset.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return charsetEncoder.canEncode(c);
            }
            if (c >= 55296 && c < 57344) {
                return false;
            }
            return true;
        }
        if (c >= 128) {
            return false;
        }
        return true;
    }

    public static int codepointsForName(String str, int[] iArr) {
        String str2 = multipoints.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int codepointForName = EscapeMode.extended.codepointForName(str);
        if (codepointForName == -1) {
            return 0;
        }
        iArr[0] = codepointForName;
        return 1;
    }

    private static void doEscape(String str, Appendable appendable, EscapeMode escapeMode, Document.OutputSettings.Syntax syntax, Charset charset, int i) {
        Document.OutputSettings.Syntax syntax2;
        boolean z;
        boolean z2;
        boolean z3;
        Appendable appendable2;
        EscapeMode escapeMode2;
        int i2;
        CoreCharset byName = CoreCharset.byName(charset.name());
        CharsetEncoder encoderFor = encoderFor(charset);
        int length = str.length();
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i3 = 0;
        while (i3 < length) {
            boolean z7 = z4;
            int codePointAt = str.codePointAt(i3);
            if ((i & 4) != 0) {
                z = true;
                if (StringUtil.isWhitespace(codePointAt)) {
                    if (((i & 8) == 0 || z5) && !z6) {
                        if ((i & 16) != 0) {
                            z7 = true;
                        } else {
                            appendable.append(' ');
                            z6 = true;
                        }
                    }
                    i3 += Character.charCount(codePointAt);
                    z4 = z7;
                } else if (z7) {
                    appendable.append(' ');
                    appendable2 = appendable;
                    escapeMode2 = escapeMode;
                    syntax2 = syntax;
                    i2 = i;
                    z3 = false;
                    z2 = false;
                } else {
                    appendable2 = appendable;
                    syntax2 = syntax;
                    i2 = i;
                    z3 = z7;
                    z2 = false;
                    escapeMode2 = escapeMode;
                }
            } else {
                syntax2 = syntax;
                z = z5;
                z2 = z6;
                z3 = z7;
                appendable2 = appendable;
                escapeMode2 = escapeMode;
                i2 = i;
            }
            appendEscaped(codePointAt, appendable2, i2, escapeMode2, syntax2, byName, encoderFor);
            z7 = z3;
            z5 = z;
            z6 = z2;
            i3 += Character.charCount(codePointAt);
            z4 = z7;
        }
    }

    private static CharsetEncoder encoderFor(Charset charset) {
        ThreadLocal<CharsetEncoder> threadLocal = LocalEncoder;
        CharsetEncoder charsetEncoder = threadLocal.get();
        if (charsetEncoder != null && charsetEncoder.charset().equals(charset)) {
            return charsetEncoder;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        threadLocal.set(newEncoder);
        return newEncoder;
    }

    public static void escape(Appendable appendable, String str, Document.OutputSettings outputSettings, int i) {
        doEscape(str, appendable, outputSettings.escapeMode(), outputSettings.syntax(), outputSettings.charset(), i);
    }

    private static String escapeString(String str, EscapeMode escapeMode, Document.OutputSettings.Syntax syntax, Charset charset) {
        if (str == null) {
            return "";
        }
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        try {
            doEscape(str, borrowBuilder, escapeMode, syntax, charset, 3);
            return StringUtil.releaseBuilder(borrowBuilder);
        } catch (IOException e) {
            throw new SerializationException(e);
        }
    }

    public static String findPrefix(String str) {
        Iterator<String> it = baseSorted.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (str.startsWith(next)) {
                return next;
            }
        }
        return "";
    }

    public static String getByName(String str) {
        String str2 = multipoints.get(str);
        if (str2 != null) {
            return str2;
        }
        int codepointForName = EscapeMode.extended.codepointForName(str);
        if (codepointForName != -1) {
            return new String(new int[]{codepointForName}, 0, 1);
        }
        return "";
    }

    public static boolean isBaseNamedEntity(String str) {
        if (EscapeMode.base.codepointForName(str) != -1) {
            return true;
        }
        return false;
    }

    public static boolean isNamedEntity(String str) {
        if (EscapeMode.extended.codepointForName(str) != -1) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ char[] lambda$static$0() {
        return new char[2];
    }

    public static void load(EscapeMode escapeMode, String str, int i) {
        int i2;
        escapeMode.nameKeys = new String[i];
        escapeMode.codeVals = new int[i];
        escapeMode.codeKeys = new int[i];
        escapeMode.nameVals = new String[i];
        CharacterReader characterReader = new CharacterReader(str);
        boolean z = false;
        int i3 = 0;
        while (!characterReader.isEmpty()) {
            try {
                String consumeTo = characterReader.consumeTo('=');
                characterReader.advance();
                int parseInt = Integer.parseInt(characterReader.consumeToAny(codeDelims), 36);
                char current = characterReader.current();
                characterReader.advance();
                if (current == ',') {
                    i2 = Integer.parseInt(characterReader.consumeTo(';'), 36);
                    characterReader.advance();
                } else {
                    i2 = -1;
                }
                int parseInt2 = Integer.parseInt(characterReader.consumeTo('&'), 36);
                characterReader.advance();
                escapeMode.nameKeys[i3] = consumeTo;
                escapeMode.codeVals[i3] = parseInt;
                escapeMode.codeKeys[parseInt2] = parseInt;
                escapeMode.nameVals[parseInt2] = consumeTo;
                if (i2 != -1) {
                    multipoints.put(consumeTo, new String(new int[]{parseInt, i2}, 0, 2));
                }
                i3++;
            } catch (Throwable th) {
                characterReader.close();
                throw th;
            }
        }
        if (i3 == i) {
            z = true;
        }
        Validate.isTrue(z, "Unexpected count of entities loaded");
        characterReader.close();
    }

    public static String unescape(String str) {
        return unescape(str, false);
    }

    public static String unescape(String str, boolean z) {
        return Parser.unescapeEntities(str, z);
    }

    public static String escape(String str) {
        return escapeString(str, EscapeMode.base, Document.OutputSettings.Syntax.html, DataUtil.UTF_8);
    }

    public static String escape(String str, Document.OutputSettings outputSettings) {
        return escapeString(str, outputSettings.escapeMode(), outputSettings.syntax(), outputSettings.charset());
    }
}
