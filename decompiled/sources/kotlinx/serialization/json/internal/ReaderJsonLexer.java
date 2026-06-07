package kotlinx.serialization.json.internal;

import defpackage.bf;
import defpackage.se;
import defpackage.yq1;
import defpackage.yx;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0014\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010)\u001a\u00020\n2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bH\u0014¢\u0006\u0004\b)\u0010*J!\u0010-\u001a\u0004\u0018\u00010\u001d2\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\rH\u0016¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\n¢\u0006\u0004\b/\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u00105R\u0016\u00106\u001a\u00020\b8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00109\u001a\u0002088\u0014X\u0094\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "reader", "", "buffer", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonReader;[C)V", "", "unprocessedCount", "Lod2;", "preload", "(I)V", "", "canConsumeValue", "()Z", "position", "prefetchOrEof", "(I)I", "", "consumeNextToken", "()B", "", "expected", "(C)V", "skipWhitespaces", "()I", "ensureHaveChars", "()V", "", "consumeKeyString", "()Ljava/lang/String;", "char", "startPos", "indexOf", "(CI)I", "endPos", "substring", "(II)Ljava/lang/String;", "fromIndex", "toIndex", "appendRange", "(II)V", "keyToMatch", "isLenient", "peekLeadingMatchingValue", "(Ljava/lang/String;Z)Ljava/lang/String;", "release", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "getReader", "()Lkotlinx/serialization/json/internal/InternalJsonReader;", "[C", "getBuffer", "()[C", "threshold", "I", "Lkotlinx/serialization/json/internal/ArrayAsSequence;", "source", "Lkotlinx/serialization/json/internal/ArrayAsSequence;", "getSource", "()Lkotlinx/serialization/json/internal/ArrayAsSequence;", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public class ReaderJsonLexer extends AbstractJsonLexer {
    private final char[] buffer;
    private final InternalJsonReader reader;
    private final ArrayAsSequence source;
    protected int threshold;

    public ReaderJsonLexer(InternalJsonReader internalJsonReader, char[] cArr) {
        internalJsonReader.getClass();
        cArr.getClass();
        this.reader = internalJsonReader;
        this.buffer = cArr;
        this.threshold = 128;
        this.source = new ArrayAsSequence(cArr);
        preload(0);
    }

    private final void preload(int unprocessedCount) {
        char[] buffer = getSource().getBuffer();
        if (unprocessedCount != 0) {
            int i = this.currentPosition;
            bf.A(buffer, buffer, 0, i, i + unprocessedCount);
        }
        int length = getSource().length();
        while (true) {
            if (unprocessedCount == length) {
                break;
            }
            int read = this.reader.read(buffer, unprocessedCount, length - unprocessedCount);
            if (read == -1) {
                getSource().trim(unprocessedCount);
                this.threshold = -1;
                break;
            }
            unprocessedCount += read;
        }
        this.currentPosition = 0;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void appendRange(int fromIndex, int toIndex) {
        getEscapedString().append(getSource().getBuffer(), fromIndex, toIndex - fromIndex);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        ensureHaveChars();
        int i = this.currentPosition;
        while (true) {
            int prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof != -1) {
                char charAt = getSource().charAt(prefetchOrEof);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.currentPosition = prefetchOrEof;
                    return isValidValueStart(charAt);
                }
                i = prefetchOrEof + 1;
            } else {
                this.currentPosition = prefetchOrEof;
                return false;
            }
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String consumeKeyString() {
        String str;
        consumeNextToken(AbstractJsonLexerKt.STRING);
        int i = this.currentPosition;
        int indexOf = indexOf(AbstractJsonLexerKt.STRING, i);
        if (indexOf == -1) {
            int prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof == -1) {
                String str2 = AbstractJsonLexerKt.tokenDescription((byte) 1);
                int i2 = this.currentPosition;
                int i3 = i2 - 1;
                if (i2 != getSource().length() && i3 >= 0) {
                    str = String.valueOf(getSource().charAt(i3));
                } else {
                    str = "EOF";
                }
                AbstractJsonLexer.fail$default(this, "Expected " + str2 + ", but had '" + str + "' instead", i3, null, 4, null);
                se.c();
                return null;
            }
            return consumeString(getSource(), this.currentPosition, prefetchOrEof);
        }
        for (int i4 = i; i4 < indexOf; i4++) {
            if (getSource().charAt(i4) == '\\') {
                return consumeString(getSource(), this.currentPosition, i4);
            }
        }
        this.currentPosition = indexOf + 1;
        return substring(i, indexOf);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char expected) {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int i = this.currentPosition;
        while (true) {
            int prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof != -1) {
                int i2 = prefetchOrEof + 1;
                char charAt = source.charAt(prefetchOrEof);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.currentPosition = i2;
                    if (charAt == expected) {
                        return;
                    } else {
                        unexpectedToken(expected);
                    }
                }
                i = i2;
            } else {
                this.currentPosition = prefetchOrEof;
                unexpectedToken(expected);
                return;
            }
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void ensureHaveChars() {
        int length = getSource().length() - this.currentPosition;
        if (length > this.threshold) {
            return;
        }
        preload(length);
    }

    public final char[] getBuffer() {
        return this.buffer;
    }

    public final InternalJsonReader getReader() {
        return this.reader;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int indexOf(char r3, int startPos) {
        ArrayAsSequence source = getSource();
        int length = source.length();
        while (startPos < length) {
            if (source.charAt(startPos) == r3) {
                return startPos;
            }
            startPos++;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String peekLeadingMatchingValue(String keyToMatch, boolean isLenient) {
        keyToMatch.getClass();
        return null;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int prefetchOrEof(int position) {
        if (position < getSource().length()) {
            return position;
        }
        this.currentPosition = position;
        ensureHaveChars();
        if (this.currentPosition == 0 && getSource().length() != 0) {
            return 0;
        }
        return -1;
    }

    public final void release() {
        CharArrayPoolBatchSize.INSTANCE.release(this.buffer);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        int prefetchOrEof;
        char charAt;
        int i = this.currentPosition;
        while (true) {
            prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof == -1 || !((charAt = getSource().charAt(prefetchOrEof)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i = prefetchOrEof + 1;
        }
        this.currentPosition = prefetchOrEof;
        return prefetchOrEof;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String substring(int startPos, int endPos) {
        return getSource().substring(startPos, endPos);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public ArrayAsSequence getSource() {
        return this.source;
    }

    public /* synthetic */ ReaderJsonLexer(InternalJsonReader internalJsonReader, char[] cArr, int i, yx yxVar) {
        this(internalJsonReader, (i & 2) != 0 ? CharArrayPoolBatchSize.INSTANCE.take() : cArr);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int i = this.currentPosition;
        while (true) {
            int prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof != -1) {
                int i2 = prefetchOrEof + 1;
                byte charToTokenClass = AbstractJsonLexerKt.charToTokenClass(source.charAt(prefetchOrEof));
                if (charToTokenClass != 3) {
                    this.currentPosition = i2;
                    return charToTokenClass;
                }
                i = i2;
            } else {
                this.currentPosition = prefetchOrEof;
                return (byte) 10;
            }
        }
    }
}
