package kotlinx.serialization.json.internal;

import defpackage.de0;
import defpackage.i32;
import defpackage.l90;
import defpackage.oe0;
import defpackage.se;
import defpackage.se0;
import defpackage.sn0;
import defpackage.wn;
import defpackage.yq1;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0084\b¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0003J\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H&¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0016\u0010\u0007J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0003J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0019J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b\u0012\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u001b\u0010\u001aJA\u0010$\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00052\u001a\b\u0002\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001eH\u0080\bø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010\u0013J\u0017\u0010'\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH&¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u0004\u0018\u00010\u001f2\u0006\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u0005H&¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u0004\u0018\u00010\u001f2\u0006\u0010,\u001a\u00020\u0005¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\b¢\u0006\u0004\b1\u0010\u0003J\u001f\u00104\u001a\u00020\f2\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\f2\u0006\u00106\u001a\u00020\fH\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u001fH&¢\u0006\u0004\b9\u0010:J+\u0010=\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u00052\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0;H\u0016¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u001f¢\u0006\u0004\b?\u0010:J'\u0010?\u001a\u00020\u001f2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\f2\u0006\u0010C\u001a\u00020\fH\u0005¢\u0006\u0004\b?\u0010DJ\r\u0010E\u001a\u00020\u001f¢\u0006\u0004\bE\u0010:J\r\u0010F\u001a\u00020\u001f¢\u0006\u0004\bF\u0010:J\u001f\u0010I\u001a\u00020\b2\u0006\u0010G\u001a\u00020\f2\u0006\u0010H\u001a\u00020\fH\u0014¢\u0006\u0004\bI\u0010JJ3\u0010O\u001a\u00020\b2\u0006\u0010K\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0LH\u0080\bø\u0001\u0000¢\u0006\u0004\bM\u0010NJ\u0015\u0010Q\u001a\u00020\b2\u0006\u0010P\u001a\u00020\u0005¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u001fH\u0016¢\u0006\u0004\bS\u0010:J\u0015\u0010U\u001a\u00020\b2\u0006\u0010T\u001a\u00020\u001f¢\u0006\u0004\bU\u0010VJ)\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010W\u001a\u00020\u001f¢\u0006\u0004\b$\u0010XJ\r\u0010Z\u001a\u00020Y¢\u0006\u0004\bZ\u0010[J\r\u0010\\\u001a\u00020Y¢\u0006\u0004\b\\\u0010[J\r\u0010]\u001a\u00020\u0005¢\u0006\u0004\b]\u0010\u000bJ\r\u0010^\u001a\u00020\u0005¢\u0006\u0004\b^\u0010\u000bJ\u001f\u0010_\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u0004H\u0002¢\u0006\u0004\b_\u0010`J;\u0010b\u001a\u00020\b2\u0006\u0010G\u001a\u00020\f2\u0006\u0010H\u001a\u00020\f2\u0006\u0010a\u001a\u00020\u00052\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0;H\u0002¢\u0006\u0004\bb\u0010cJ\u001f\u0010e\u001a\u00020\f2\u0006\u0010d\u001a\u00020\f2\u0006\u0010C\u001a\u00020\fH\u0002¢\u0006\u0004\be\u0010fJ\u001f\u0010h\u001a\u00020\u001f2\u0006\u0010d\u001a\u00020\f2\u0006\u0010g\u001a\u00020\fH\u0002¢\u0006\u0004\bh\u00108J\u000f\u0010i\u001a\u00020\u001fH\u0002¢\u0006\u0004\bi\u0010:J\u000f\u0010j\u001a\u00020\u0005H\u0002¢\u0006\u0004\bj\u0010\u000bJ\u0017\u0010k\u001a\u00020\f2\u0006\u0010B\u001a\u00020\fH\u0002¢\u0006\u0004\bk\u0010\u000fJ\u001f\u0010l\u001a\u00020\f2\u0006\u0010A\u001a\u00020@2\u0006\u00103\u001a\u00020\fH\u0002¢\u0006\u0004\bl\u0010mJ\u001f\u0010n\u001a\u00020\f2\u0006\u0010A\u001a\u00020@2\u0006\u0010g\u001a\u00020\fH\u0002¢\u0006\u0004\bn\u0010mJ\u0017\u0010]\u001a\u00020\u00052\u0006\u0010o\u001a\u00020\fH\u0003¢\u0006\u0004\b]\u0010pJ\u001f\u0010r\u001a\u00020\b2\u0006\u0010q\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020\fH\u0002¢\u0006\u0004\br\u0010sJ$\u0010v\u001a\u00028\u0000\"\u0004\b\u0000\u0010t2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000LH\u0082\b¢\u0006\u0004\bv\u0010wR\u0016\u0010g\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bg\u0010xR\u0014\u0010z\u001a\u00020y8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u0010|\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R-\u0010\u0080\u0001\u001a\u00060~j\u0002`\u007f8\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010A\u001a\u00020@8$X¤\u0004¢\u0006\b\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0088\u0001"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "", "<init>", "()V", "", "", "isWs", "(C)Z", "Lod2;", "ensureHaveChars", "isNotEof", "()Z", "", "position", "prefetchOrEof", "(I)I", "canConsumeValue", "", "consumeNextToken", "()B", "tryConsumeComma", "c", "isValidValueStart", "expectEof", "expected", "(B)B", "(C)V", "unexpectedToken", "expectedToken", "wasConsumed", "Lkotlin/Function2;", "", "message", "", "fail$kotlinx_serialization_json", "(BZLse0;)Ljava/lang/Void;", "fail", "peekNextToken", "doConsume", "tryConsumeNull", "(Z)Z", "skipWhitespaces", "()I", "keyToMatch", "isLenient", "peekLeadingMatchingValue", "(Ljava/lang/String;Z)Ljava/lang/String;", "peekString", "(Z)Ljava/lang/String;", "discardPeeked", "char", "startPos", "indexOf", "(CI)I", "endPos", "substring", "(II)Ljava/lang/String;", "consumeKeyString", "()Ljava/lang/String;", "Lkotlin/Function1;", "consumeChunk", "consumeStringChunked", "(ZLoe0;)V", "consumeString", "", "source", "startPosition", "current", "(Ljava/lang/CharSequence;II)Ljava/lang/String;", "consumeStringLenientNotNull", "consumeStringLenient", "fromIndex", "toIndex", "appendRange", "(II)V", "condition", "Lkotlin/Function0;", "require$kotlinx_serialization_json", "(ZILde0;)V", "require", "allowLenientStrings", "skipElement", "(Z)V", "toString", "key", "failOnUnknownKey", "(Ljava/lang/String;)V", "hint", "(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/Void;", "", "consumeNumericLiteral", "()J", "consumeNumericLiteralFully", "consumeBoolean", "consumeBooleanLenient", "insideString", "(ZC)Z", "currentChunkHasEscape", "writeRange", "(IIZLoe0;)V", "lastPosition", "appendEscape", "(II)I", "currentPosition", "decodedString", "takePeeked", "wasUnquotedString", "appendEsc", "appendHex", "(Ljava/lang/CharSequence;I)I", "fromHexChar", "start", "(I)Z", "literalSuffix", "consumeBooleanLiteral", "(Ljava/lang/String;I)V", "T", "action", "withPositionRollback", "(Lde0;)Ljava/lang/Object;", "I", "Lkotlinx/serialization/json/internal/JsonPath;", "path", "Lkotlinx/serialization/json/internal/JsonPath;", "peekedString", "Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "escapedString", "Ljava/lang/StringBuilder;", "getEscapedString", "()Ljava/lang/StringBuilder;", "setEscapedString", "(Ljava/lang/StringBuilder;)V", "getSource", "()Ljava/lang/CharSequence;", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public abstract class AbstractJsonLexer {
    public int currentPosition;
    private String peekedString;
    public final JsonPath path = new JsonPath();
    private StringBuilder escapedString = new StringBuilder();

    private final int appendEsc(int startPosition) {
        int prefetchOrEof = prefetchOrEof(startPosition);
        if (prefetchOrEof != -1) {
            int i = prefetchOrEof + 1;
            char charAt = getSource().charAt(prefetchOrEof);
            if (charAt == 'u') {
                return appendHex(getSource(), i);
            }
            char escapeToChar = AbstractJsonLexerKt.escapeToChar(charAt);
            if (escapeToChar != 0) {
                this.escapedString.append(escapeToChar);
                return i;
            }
            fail$default(this, "Invalid escaped char '" + charAt + '\'', 0, null, 6, null);
            se.c();
            return 0;
        }
        fail$default(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
        se.c();
        return 0;
    }

    private final int appendEscape(int lastPosition, int current) {
        appendRange(lastPosition, current);
        return appendEsc(current + 1);
    }

    private final int appendHex(CharSequence source, int startPos) {
        int i = startPos + 4;
        if (i >= source.length()) {
            this.currentPosition = startPos;
            ensureHaveChars();
            if (this.currentPosition + 4 < source.length()) {
                return appendHex(source, this.currentPosition);
            }
            fail$default(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
            se.c();
            return 0;
        }
        this.escapedString.append((char) ((fromHexChar(source, startPos) << 12) + (fromHexChar(source, startPos + 1) << 8) + (fromHexChar(source, startPos + 2) << 4) + fromHexChar(source, startPos + 3)));
        return i;
    }

    private final boolean consumeBoolean(int start) {
        int prefetchOrEof = prefetchOrEof(start);
        if (prefetchOrEof < getSource().length() && prefetchOrEof != -1) {
            int i = prefetchOrEof + 1;
            int charAt = getSource().charAt(prefetchOrEof) | ' ';
            if (charAt != 102) {
                if (charAt == 116) {
                    consumeBooleanLiteral("rue", i);
                    return true;
                }
                fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
                se.c();
                return false;
            }
            consumeBooleanLiteral("alse", i);
            return false;
        }
        fail$default(this, "EOF", 0, null, 6, null);
        se.c();
        return false;
    }

    private final void consumeBooleanLiteral(String literalSuffix, int current) {
        if (getSource().length() - current >= literalSuffix.length()) {
            int length = literalSuffix.length();
            for (int i = 0; i < length; i++) {
                if (literalSuffix.charAt(i) != (getSource().charAt(current + i) | ' ')) {
                    fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
                    se.c();
                    return;
                }
            }
            this.currentPosition = literalSuffix.length() + current;
            return;
        }
        fail$default(this, "Unexpected end of boolean literal", 0, null, 6, null);
        se.c();
    }

    private static final double consumeNumericLiteral$calculateExponent(long j, boolean z) {
        if (!z) {
            return Math.pow(10.0d, -j);
        }
        if (z) {
            return Math.pow(10.0d, j);
        }
        se.m();
        return 0.0d;
    }

    private final String decodedString(int lastPosition, int currentPosition) {
        appendRange(lastPosition, currentPosition);
        String sb = this.escapedString.toString();
        this.escapedString.setLength(0);
        return sb;
    }

    public static /* synthetic */ Void fail$default(AbstractJsonLexer abstractJsonLexer, String str, int i, String str2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = abstractJsonLexer.currentPosition;
            }
            if ((i2 & 4) != 0) {
                str2 = "";
            }
            return abstractJsonLexer.fail(str, i, str2);
        }
        se.v("Super calls with default arguments not supported in this target, function: fail");
        return null;
    }

    public static Void fail$kotlinx_serialization_json$default(AbstractJsonLexer abstractJsonLexer, byte b, boolean z, se0 se0Var, int i, Object obj) {
        int i2;
        String str;
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                se0Var = new se0() { // from class: kotlinx.serialization.json.internal.AbstractJsonLexer$fail$1
                    @Override // defpackage.se0
                    public final String invoke(String str2, String str3) {
                        str2.getClass();
                        str3.getClass();
                        StringBuilder sb = new StringBuilder("Expected ");
                        sb.append(str2);
                        sb.append(", but had '");
                        return l90.p(sb, str3, "' instead");
                    }
                };
            }
            se0Var.getClass();
            String str2 = AbstractJsonLexerKt.tokenDescription(b);
            if (z) {
                i2 = abstractJsonLexer.currentPosition - 1;
            } else {
                i2 = abstractJsonLexer.currentPosition;
            }
            int i3 = i2;
            if (abstractJsonLexer.currentPosition != abstractJsonLexer.getSource().length() && i3 >= 0) {
                str = String.valueOf(abstractJsonLexer.getSource().charAt(i3));
            } else {
                str = "EOF";
            }
            fail$default(abstractJsonLexer, (String) se0Var.invoke(str2, str), i3, null, 4, null);
            throw new RuntimeException();
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    private final int fromHexChar(CharSequence source, int currentPosition) {
        char charAt = source.charAt(currentPosition);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        fail$default(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
        se.c();
        return 0;
    }

    private final boolean insideString(boolean isLenient, char r3) {
        if (isLenient) {
            if (AbstractJsonLexerKt.charToTokenClass(r3) != 0) {
                return false;
            }
            return true;
        }
        if (r3 == '\"') {
            return false;
        }
        return true;
    }

    public static void require$kotlinx_serialization_json$default(AbstractJsonLexer abstractJsonLexer, boolean z, int i, de0 de0Var, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = abstractJsonLexer.currentPosition;
            }
            int i3 = i;
            de0Var.getClass();
            if (z) {
                return;
            }
            fail$default(abstractJsonLexer, (String) de0Var.invoke(), i3, null, 4, null);
            se.c();
            return;
        }
        se.v("Super calls with default arguments not supported in this target, function: require");
    }

    private final String takePeeked() {
        String str = this.peekedString;
        str.getClass();
        this.peekedString = null;
        return str;
    }

    public static /* synthetic */ boolean tryConsumeNull$default(AbstractJsonLexer abstractJsonLexer, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            return abstractJsonLexer.tryConsumeNull(z);
        }
        se.v("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        return false;
    }

    private final boolean wasUnquotedString() {
        if (getSource().charAt(this.currentPosition - 1) != '\"') {
            return true;
        }
        return false;
    }

    private final <T> T withPositionRollback(de0 action) {
        int i = this.currentPosition;
        try {
            return (T) action.invoke();
        } finally {
            this.currentPosition = i;
        }
    }

    private final void writeRange(int fromIndex, int toIndex, boolean currentChunkHasEscape, oe0 consumeChunk) {
        if (currentChunkHasEscape) {
            consumeChunk.invoke(decodedString(fromIndex, toIndex));
        } else {
            consumeChunk.invoke(substring(fromIndex, toIndex));
        }
    }

    public void appendRange(int fromIndex, int toIndex) {
        this.escapedString.append(getSource(), fromIndex, toIndex);
    }

    public abstract boolean canConsumeValue();

    public final boolean consumeBooleanLenient() {
        boolean z;
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces != getSource().length()) {
            if (getSource().charAt(skipWhitespaces) == '\"') {
                skipWhitespaces++;
                z = true;
            } else {
                z = false;
            }
            boolean consumeBoolean = consumeBoolean(skipWhitespaces);
            if (z) {
                if (this.currentPosition != getSource().length()) {
                    if (getSource().charAt(this.currentPosition) == '\"') {
                        this.currentPosition++;
                        return consumeBoolean;
                    }
                    fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
                    se.c();
                    return false;
                }
                fail$default(this, "EOF", 0, null, 6, null);
                se.c();
                return false;
            }
            return consumeBoolean;
        }
        fail$default(this, "EOF", 0, null, 6, null);
        se.c();
        return false;
    }

    public abstract String consumeKeyString();

    public abstract byte consumeNextToken();

    public final byte consumeNextToken(byte expected) {
        String str;
        byte consumeNextToken = consumeNextToken();
        if (consumeNextToken != expected) {
            String str2 = AbstractJsonLexerKt.tokenDescription(expected);
            int i = this.currentPosition;
            int i2 = i - 1;
            if (i != getSource().length() && i2 >= 0) {
                str = String.valueOf(getSource().charAt(i2));
            } else {
                str = "EOF";
            }
            fail$default(this, "Expected " + str2 + ", but had '" + str + "' instead", i2, null, 4, null);
            se.c();
            return (byte) 0;
        }
        return consumeNextToken;
    }

    public abstract void consumeNextToken(char expected);

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
    
        fail$default(r18, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6, null);
        defpackage.se.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0127, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0128, code lost:
    
        if (r2 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012a, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
    
        if (r1 == r2) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012f, code lost:
    
        if (r9 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0133, code lost:
    
        if (r1 == (r2 - 1)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0135, code lost:
    
        if (r0 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0137, code lost:
    
        if (r4 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0141, code lost:
    
        if (getSource().charAt(r2) != '\"') goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0143, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0148, code lost:
    
        fail$default(r18, "Expected closing quotation mark", 0, null, 6, null);
        defpackage.se.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0156, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0157, code lost:
    
        fail$default(r18, "EOF", 0, null, 6, null);
        defpackage.se.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0165, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0166, code lost:
    
        r18.currentPosition = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0168, code lost:
    
        if (r8 == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016a, code lost:
    
        r1 = r10 * consumeNumericLiteral$calculateExponent(r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0174, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017a, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0182, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0184, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0186, code lost:
    
        fail$default(r18, "Can't convert " + r1 + " to Long", 0, null, 6, null);
        defpackage.se.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a3, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a4, code lost:
    
        fail$default(r18, "Numeric value overflow", 0, null, 6, null);
        defpackage.se.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b2, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b3, code lost:
    
        if (r9 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b5, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ba, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bd, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01be, code lost:
    
        fail$default(r18, "Numeric value overflow", 0, null, 6, null);
        defpackage.se.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01cc, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01cd, code lost:
    
        fail$default(r18, "Expected numeric literal", 0, null, 6, null);
        defpackage.se.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01db, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x012c, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long consumeNumericLiteral() {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.AbstractJsonLexer.consumeNumericLiteral():long");
    }

    public final long consumeNumericLiteralFully() {
        String str;
        long consumeNumericLiteral = consumeNumericLiteral();
        if (consumeNextToken() != 10) {
            AbstractJsonLexerKt.tokenDescription((byte) 10);
            int i = this.currentPosition;
            int i2 = i - 1;
            if (i != getSource().length() && i2 >= 0) {
                str = String.valueOf(getSource().charAt(i2));
            } else {
                str = "EOF";
            }
            fail$default(this, l90.m("Expected input to contain a single valid number, but got '", str, "' after it"), i2, null, 4, null);
            se.c();
            return 0L;
        }
        return consumeNumericLiteral;
    }

    public final String consumeString(CharSequence source, int startPosition, int current) {
        String decodedString;
        source.getClass();
        int i = startPosition;
        boolean z = false;
        char charAt = source.charAt(current);
        int i2 = current;
        while (charAt != '\"') {
            if (charAt == '\\') {
                i = prefetchOrEof(appendEscape(i, i2));
                if (i == -1) {
                    fail$default(this, "Unexpected EOF", i, null, 4, null);
                    se.c();
                    return null;
                }
            } else {
                i2++;
                if (i2 >= source.length()) {
                    appendRange(i, i2);
                    i = prefetchOrEof(i2);
                    if (i == -1) {
                        fail$default(this, "Unexpected EOF", i, null, 4, null);
                        se.c();
                        return null;
                    }
                } else {
                    continue;
                    charAt = source.charAt(i2);
                }
            }
            i2 = i;
            z = true;
            charAt = source.charAt(i2);
        }
        if (!z) {
            decodedString = substring(i, i2);
        } else {
            decodedString = decodedString(i, i2);
        }
        this.currentPosition = i2 + 1;
        return decodedString;
    }

    public void consumeStringChunked(boolean isLenient, oe0 consumeChunk) {
        int i;
        int i2;
        consumeChunk.getClass();
        byte peekNextToken = peekNextToken();
        if (!isLenient || peekNextToken == 0) {
            if (!isLenient) {
                consumeNextToken(AbstractJsonLexerKt.STRING);
            }
            int i3 = this.currentPosition;
            char charAt = getSource().charAt(i3);
            boolean z = false;
            int i4 = i3;
            while (this.insideString(isLenient, charAt)) {
                if (!isLenient && charAt == '\\') {
                    i2 = this.prefetchOrEof(this.appendEscape(i3, i4));
                    z = true;
                    i = i2;
                } else {
                    int i5 = i4 + 1;
                    i = i3;
                    i2 = i5;
                }
                if (i2 >= this.getSource().length()) {
                    this.writeRange(i, i2, z, consumeChunk);
                    int prefetchOrEof = this.prefetchOrEof(i2);
                    if (prefetchOrEof != -1) {
                        z = false;
                        i3 = prefetchOrEof;
                        i4 = i3;
                    } else {
                        fail$default(this, "EOF", prefetchOrEof, null, 4, null);
                        se.c();
                        return;
                    }
                } else {
                    int i6 = i;
                    i4 = i2;
                    i3 = i6;
                }
                AbstractJsonLexer abstractJsonLexer = this;
                charAt = abstractJsonLexer.getSource().charAt(i4);
                this = abstractJsonLexer;
            }
            AbstractJsonLexer abstractJsonLexer2 = this;
            abstractJsonLexer2.writeRange(i3, i4, z, consumeChunk);
            abstractJsonLexer2.currentPosition = i4;
            if (!isLenient) {
                abstractJsonLexer2.consumeNextToken(AbstractJsonLexerKt.STRING);
            }
        }
    }

    public final String consumeStringLenient() {
        String decodedString;
        if (this.peekedString != null) {
            return takePeeked();
        }
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces < getSource().length() && skipWhitespaces != -1) {
            byte charToTokenClass = AbstractJsonLexerKt.charToTokenClass(getSource().charAt(skipWhitespaces));
            if (charToTokenClass == 1) {
                return consumeString();
            }
            if (charToTokenClass == 0) {
                boolean z = false;
                while (AbstractJsonLexerKt.charToTokenClass(getSource().charAt(skipWhitespaces)) == 0) {
                    skipWhitespaces++;
                    if (skipWhitespaces >= getSource().length()) {
                        appendRange(this.currentPosition, skipWhitespaces);
                        int prefetchOrEof = prefetchOrEof(skipWhitespaces);
                        if (prefetchOrEof == -1) {
                            this.currentPosition = skipWhitespaces;
                            return decodedString(0, 0);
                        }
                        skipWhitespaces = prefetchOrEof;
                        z = true;
                    }
                }
                int i = this.currentPosition;
                if (!z) {
                    decodedString = substring(i, skipWhitespaces);
                } else {
                    decodedString = decodedString(i, skipWhitespaces);
                }
                this.currentPosition = skipWhitespaces;
                return decodedString;
            }
            fail$default(this, "Expected beginning of the string, but got " + getSource().charAt(skipWhitespaces), 0, null, 6, null);
            se.c();
            return null;
        }
        fail$default(this, "EOF", skipWhitespaces, null, 4, null);
        se.c();
        return null;
    }

    public final String consumeStringLenientNotNull() {
        String consumeStringLenient = consumeStringLenient();
        if (sn0.r(consumeStringLenient, AbstractJsonLexerKt.NULL) && wasUnquotedString()) {
            fail$default(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
            se.c();
            return null;
        }
        return consumeStringLenient;
    }

    public final void discardPeeked() {
        this.peekedString = null;
    }

    public final void expectEof() {
        if (consumeNextToken() == 10) {
            return;
        }
        fail$default(this, "Expected EOF after parsing, but had " + getSource().charAt(this.currentPosition - 1) + " instead", 0, null, 6, null);
        se.c();
    }

    public final Void fail(String message, int position, String hint) {
        String concat;
        message.getClass();
        hint.getClass();
        if (hint.length() == 0) {
            concat = "";
        } else {
            concat = "\n".concat(hint);
        }
        throw JsonExceptionsKt.JsonDecodingException(position, message + " at path: " + this.path.getPath() + concat, getSource());
    }

    public final Void fail$kotlinx_serialization_json(byte expectedToken, boolean wasConsumed, se0 message) {
        String str;
        message.getClass();
        String str2 = AbstractJsonLexerKt.tokenDescription(expectedToken);
        int i = this.currentPosition;
        if (wasConsumed) {
            i--;
        }
        int i2 = i;
        if (this.currentPosition != getSource().length() && i2 >= 0) {
            str = String.valueOf(getSource().charAt(i2));
        } else {
            str = "EOF";
        }
        fail$default(this, (String) message.invoke(str2, str), i2, null, 4, null);
        throw new RuntimeException();
    }

    public final void failOnUnknownKey(String key) {
        key.getClass();
        int Q = i32.Q(substring(0, this.currentPosition), key);
        throw new JsonDecodingException("Encountered an unknown key '" + key + "' at offset " + Q + " at path: " + this.path.getPath() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) JsonExceptionsKt.minify(getSource(), Q)));
    }

    public final StringBuilder getEscapedString() {
        return this.escapedString;
    }

    public abstract CharSequence getSource();

    public int indexOf(char r2, int startPos) {
        return i32.K(getSource(), r2, startPos, 4);
    }

    public final boolean isNotEof() {
        if (peekNextToken() != 10) {
            return true;
        }
        return false;
    }

    public final boolean isValidValueStart(char c) {
        if (c != ',' && c != ':' && c != ']' && c != '}') {
            return true;
        }
        return false;
    }

    public final boolean isWs(char c) {
        if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
            return false;
        }
        return true;
    }

    public abstract String peekLeadingMatchingValue(String keyToMatch, boolean isLenient);

    public byte peekNextToken() {
        CharSequence source = getSource();
        int i = this.currentPosition;
        while (true) {
            int prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof != -1) {
                char charAt = source.charAt(prefetchOrEof);
                if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                    this.currentPosition = prefetchOrEof;
                    return AbstractJsonLexerKt.charToTokenClass(charAt);
                }
                i = prefetchOrEof + 1;
            } else {
                this.currentPosition = prefetchOrEof;
                return (byte) 10;
            }
        }
    }

    public final String peekString(boolean isLenient) {
        String consumeString;
        byte peekNextToken = peekNextToken();
        if (isLenient) {
            if (peekNextToken != 1 && peekNextToken != 0) {
                return null;
            }
            consumeString = consumeStringLenient();
        } else {
            if (peekNextToken != 1) {
                return null;
            }
            consumeString = consumeString();
        }
        this.peekedString = consumeString;
        return consumeString;
    }

    public abstract int prefetchOrEof(int position);

    public final void require$kotlinx_serialization_json(boolean condition, int position, de0 message) {
        message.getClass();
        if (condition) {
            return;
        }
        fail$default(this, (String) message.invoke(), position, null, 4, null);
        se.c();
    }

    public final void setEscapedString(StringBuilder sb) {
        sb.getClass();
        this.escapedString = sb;
    }

    public final void skipElement(boolean allowLenientStrings) {
        AbstractJsonLexer abstractJsonLexer;
        ArrayList arrayList = new ArrayList();
        byte peekNextToken = peekNextToken();
        if (peekNextToken != 8 && peekNextToken != 6) {
            consumeStringLenient();
            return;
        }
        while (true) {
            byte peekNextToken2 = this.peekNextToken();
            if (peekNextToken2 == 1) {
                if (allowLenientStrings) {
                    this.consumeStringLenient();
                } else {
                    this.consumeKeyString();
                }
            } else {
                if (peekNextToken2 == 8 || peekNextToken2 == 6) {
                    abstractJsonLexer = this;
                    arrayList.add(Byte.valueOf(peekNextToken2));
                } else {
                    if (peekNextToken2 == 9) {
                        if (((Number) wn.n0(arrayList)).byteValue() == 8) {
                            wn.u0(arrayList);
                        } else {
                            throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found ] instead of } at path: " + this.path, this.getSource());
                        }
                    } else if (peekNextToken2 == 7) {
                        if (((Number) wn.n0(arrayList)).byteValue() == 6) {
                            wn.u0(arrayList);
                        } else {
                            throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found } instead of ] at path: " + this.path, this.getSource());
                        }
                    } else if (peekNextToken2 == 10) {
                        fail$default(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                        se.c();
                        return;
                    }
                    abstractJsonLexer = this;
                }
                abstractJsonLexer.consumeNextToken();
                if (arrayList.size() == 0) {
                    return;
                } else {
                    this = abstractJsonLexer;
                }
            }
        }
    }

    public abstract int skipWhitespaces();

    public String substring(int startPos, int endPos) {
        return getSource().subSequence(startPos, endPos).toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) getSource());
        sb.append("', currentPosition=");
        return l90.o(sb, this.currentPosition, ')');
    }

    public final boolean tryConsumeComma() {
        int skipWhitespaces = skipWhitespaces();
        CharSequence source = getSource();
        if (skipWhitespaces >= source.length() || skipWhitespaces == -1 || source.charAt(skipWhitespaces) != ',') {
            return false;
        }
        this.currentPosition++;
        return true;
    }

    public final boolean tryConsumeNull(boolean doConsume) {
        int prefetchOrEof = prefetchOrEof(skipWhitespaces());
        int length = getSource().length() - prefetchOrEof;
        if (length < 4 || prefetchOrEof == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (AbstractJsonLexerKt.NULL.charAt(i) != getSource().charAt(prefetchOrEof + i)) {
                return false;
            }
        }
        if (length > 4 && AbstractJsonLexerKt.charToTokenClass(getSource().charAt(prefetchOrEof + 4)) == 0) {
            return false;
        }
        if (doConsume) {
            this.currentPosition = prefetchOrEof + 4;
            return true;
        }
        return true;
    }

    public final void unexpectedToken(char expected) {
        String str;
        int i = this.currentPosition;
        if (i > 0 && expected == '\"') {
            try {
                this.currentPosition = i - 1;
                String consumeStringLenient = consumeStringLenient();
                this.currentPosition = i;
                if (sn0.r(consumeStringLenient, AbstractJsonLexerKt.NULL)) {
                    fail("Expected string literal but 'null' literal was found", this.currentPosition - 1, AbstractJsonLexerKt.coerceInputValuesHint);
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                this.currentPosition = i;
                throw th;
            }
        }
        String str2 = AbstractJsonLexerKt.tokenDescription(AbstractJsonLexerKt.charToTokenClass(expected));
        int i2 = this.currentPosition;
        int i3 = i2 - 1;
        if (i2 != getSource().length() && i3 >= 0) {
            str = String.valueOf(getSource().charAt(i3));
        } else {
            str = "EOF";
        }
        fail$default(this, "Expected " + str2 + ", but had '" + str + "' instead", i3, null, 4, null);
        throw new RuntimeException();
    }

    public void ensureHaveChars() {
    }

    public final String consumeString() {
        if (this.peekedString != null) {
            return takePeeked();
        }
        return consumeKeyString();
    }

    public final boolean consumeBoolean() {
        return consumeBoolean(skipWhitespaces());
    }
}
