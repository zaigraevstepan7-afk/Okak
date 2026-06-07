package kotlinx.serialization.json.internal;

import defpackage.i32;
import defpackage.se;
import defpackage.xd1;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0013\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lkotlinx/serialization/json/internal/ReaderJsonLexerWithComments;", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "reader", "", "buffer", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonReader;[C)V", "", "position", "Lxd1;", "", "handleComment", "(I)Lxd1;", "prefetchWithinThreshold", "(I)I", "", "expected", "Lod2;", "consumeNextToken", "(C)V", "canConsumeValue", "()Z", "", "()B", "peekNextToken", "skipWhitespaces", "()I", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class ReaderJsonLexerWithComments extends ReaderJsonLexer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderJsonLexerWithComments(InternalJsonReader internalJsonReader, char[] cArr) {
        super(internalJsonReader, cArr);
        internalJsonReader.getClass();
        cArr.getClass();
    }

    private final xd1 handleComment(int position) {
        int i = position + 2;
        char charAt = getSource().charAt(position + 1);
        if (charAt != '*') {
            if (charAt != '/') {
                return new xd1(Integer.valueOf(position), Boolean.FALSE);
            }
            while (position != -1) {
                int K = i32.K(getSource(), '\n', i, 4);
                if (K == -1) {
                    i = prefetchOrEof(getSource().length());
                    position = i;
                } else {
                    return new xd1(Integer.valueOf(K + 1), Boolean.TRUE);
                }
            }
            return new xd1(-1, Boolean.TRUE);
        }
        boolean z = false;
        while (position != -1) {
            int L = i32.L(getSource(), "*/", i, false, 4);
            if (L != -1) {
                return new xd1(Integer.valueOf(L + 2), Boolean.TRUE);
            }
            if (getSource().charAt(getSource().length() - 1) != '*') {
                i = prefetchOrEof(getSource().length());
                position = i;
            } else {
                i = prefetchWithinThreshold(getSource().length() - 1);
                if (z) {
                    break;
                }
                position = i;
                z = true;
            }
        }
        this.currentPosition = getSource().length();
        AbstractJsonLexer.fail$default(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
        se.c();
        return null;
    }

    private final int prefetchWithinThreshold(int position) {
        if (getSource().length() - position > this.threshold) {
            return position;
        }
        this.currentPosition = position;
        ensureHaveChars();
        if (this.currentPosition == 0 && getSource().length() != 0) {
            return 0;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        ensureHaveChars();
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces < getSource().length() && skipWhitespaces != -1) {
            return isValidValueStart(getSource().charAt(skipWhitespaces));
        }
        return false;
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char expected) {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= source.length() || skipWhitespaces == -1) {
            this.currentPosition = -1;
            unexpectedToken(expected);
        }
        char charAt = source.charAt(skipWhitespaces);
        this.currentPosition = skipWhitespaces + 1;
        if (charAt == expected) {
            return;
        }
        unexpectedToken(expected);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte peekNextToken() {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces < source.length() && skipWhitespaces != -1) {
            this.currentPosition = skipWhitespaces;
            return AbstractJsonLexerKt.charToTokenClass(source.charAt(skipWhitespaces));
        }
        return (byte) 10;
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        int prefetchOrEof;
        int i = this.currentPosition;
        while (true) {
            prefetchOrEof = prefetchOrEof(i);
            if (prefetchOrEof != -1) {
                char charAt = getSource().charAt(prefetchOrEof);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    if (charAt != '/' || prefetchOrEof + 1 >= getSource().length()) {
                        break;
                    }
                    xd1 handleComment = handleComment(prefetchOrEof);
                    int intValue = ((Number) handleComment.e).intValue();
                    if (!((Boolean) handleComment.f).booleanValue()) {
                        prefetchOrEof = intValue;
                        break;
                    }
                    i = intValue;
                } else {
                    i = prefetchOrEof + 1;
                }
            } else {
                break;
            }
        }
        this.currentPosition = prefetchOrEof;
        return prefetchOrEof;
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= source.length() || skipWhitespaces == -1) {
            return (byte) 10;
        }
        this.currentPosition = skipWhitespaces + 1;
        return AbstractJsonLexerKt.charToTokenClass(source.charAt(skipWhitespaces));
    }
}
