package kotlinx.serialization.json.internal;

import defpackage.i32;
import defpackage.se;
import defpackage.yq1;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0007\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lkotlinx/serialization/json/internal/StringJsonLexerWithComments;", "Lkotlinx/serialization/json/internal/StringJsonLexer;", "", "source", "<init>", "(Ljava/lang/String;)V", "", "consumeNextToken", "()B", "", "canConsumeValue", "()Z", "", "expected", "Lod2;", "(C)V", "peekNextToken", "", "skipWhitespaces", "()I", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class StringJsonLexerWithComments extends StringJsonLexer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringJsonLexerWithComments(String str) {
        super(str);
        str.getClass();
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces < getSource().length() && skipWhitespaces != -1) {
            return isValidValueStart(getSource().charAt(skipWhitespaces));
        }
        return false;
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char expected) {
        String source = getSource();
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
        String source = getSource();
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces < source.length() && skipWhitespaces != -1) {
            this.currentPosition = skipWhitespaces;
            return AbstractJsonLexerKt.charToTokenClass(source.charAt(skipWhitespaces));
        }
        return (byte) 10;
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        int i;
        int i2 = this.currentPosition;
        if (i2 == -1) {
            return i2;
        }
        String source = getSource();
        while (i2 < source.length()) {
            char charAt = source.charAt(i2);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt != '/' || (i = i2 + 1) >= source.length()) {
                    break;
                }
                char charAt2 = source.charAt(i);
                if (charAt2 != '*') {
                    if (charAt2 != '/') {
                        break;
                    }
                    int K = i32.K(source, '\n', i2 + 2, 4);
                    if (K == -1) {
                        i2 = source.length();
                    } else {
                        i2 = K + 1;
                    }
                } else {
                    int L = i32.L(source, "*/", i2 + 2, false, 4);
                    if (L != -1) {
                        i2 = L + 2;
                    } else {
                        this.currentPosition = source.length();
                        AbstractJsonLexer.fail$default(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        se.c();
                        return 0;
                    }
                }
            } else {
                i2++;
                this = this;
            }
        }
        this.currentPosition = i2;
        return i2;
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        String source = getSource();
        int skipWhitespaces = skipWhitespaces();
        if (skipWhitespaces >= source.length() || skipWhitespaces == -1) {
            return (byte) 10;
        }
        this.currentPosition = skipWhitespaces + 1;
        return AbstractJsonLexerKt.charToTokenClass(source.charAt(skipWhitespaces));
    }
}
