package kotlinx.serialization.json.internal;

import defpackage.fr1;
import defpackage.i32;
import defpackage.oe0;
import defpackage.se;
import defpackage.sn0;
import defpackage.yq1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u000b\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u000b\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\r2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0017¨\u0006\""}, d2 = {"Lkotlinx/serialization/json/internal/StringJsonLexer;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "", "source", "<init>", "(Ljava/lang/String;)V", "", "position", "prefetchOrEof", "(I)I", "", "consumeNextToken", "()B", "", "canConsumeValue", "()Z", "skipWhitespaces", "()I", "", "expected", "Lod2;", "(C)V", "consumeKeyString", "()Ljava/lang/String;", "isLenient", "Lkotlin/Function1;", "consumeChunk", "consumeStringChunked", "(ZLoe0;)V", "keyToMatch", "peekLeadingMatchingValue", "(Ljava/lang/String;Z)Ljava/lang/String;", "Ljava/lang/String;", "getSource", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public class StringJsonLexer extends AbstractJsonLexer {
    private final String source;

    public StringJsonLexer(String str) {
        str.getClass();
        this.source = str;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        int i = this.currentPosition;
        if (i == -1) {
            return false;
        }
        String source = getSource();
        while (i < source.length()) {
            char charAt = source.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.currentPosition = i;
                return isValidValueStart(charAt);
            }
            i++;
        }
        this.currentPosition = i;
        return false;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String consumeKeyString() {
        String str;
        consumeNextToken(AbstractJsonLexerKt.STRING);
        int i = this.currentPosition;
        int K = i32.K(getSource(), AbstractJsonLexerKt.STRING, i, 4);
        if (K == -1) {
            consumeStringLenient();
            String str2 = AbstractJsonLexerKt.tokenDescription((byte) 1);
            int i2 = this.currentPosition;
            if (i2 != getSource().length() && i2 >= 0) {
                str = String.valueOf(getSource().charAt(i2));
            } else {
                str = "EOF";
            }
            AbstractJsonLexer.fail$default(this, "Expected " + str2 + ", but had '" + str + "' instead", i2, null, 4, null);
            se.c();
            return null;
        }
        for (int i3 = i; i3 < K; i3++) {
            if (getSource().charAt(i3) == '\\') {
                return consumeString(getSource(), this.currentPosition, i3);
            }
        }
        this.currentPosition = K + 1;
        return getSource().substring(i, K);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char expected) {
        if (this.currentPosition == -1) {
            unexpectedToken(expected);
        }
        String source = getSource();
        int i = this.currentPosition;
        while (i < source.length()) {
            int i2 = i + 1;
            char charAt = source.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.currentPosition = i2;
                if (charAt == expected) {
                    return;
                } else {
                    unexpectedToken(expected);
                }
            }
            i = i2;
        }
        this.currentPosition = -1;
        unexpectedToken(expected);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeStringChunked(boolean isLenient, oe0 consumeChunk) {
        String consumeString;
        int i;
        int i2;
        consumeChunk.getClass();
        if (isLenient) {
            consumeString = consumeStringLenient();
        } else {
            consumeString = consumeString();
        }
        consumeString.getClass();
        fr1.b(16384, 16384);
        int length = consumeString.length();
        int i3 = length / 16384;
        int i4 = 0;
        if (length % 16384 == 0) {
            i = 0;
        } else {
            i = 1;
        }
        ArrayList arrayList = new ArrayList(i3 + i);
        while (i4 >= 0 && i4 < length) {
            int i5 = i4 + 16384;
            if (i5 >= 0 && i5 <= length) {
                i2 = i5;
            } else {
                i2 = length;
            }
            CharSequence subSequence = consumeString.subSequence(i4, i2);
            subSequence.getClass();
            arrayList.add(subSequence.toString());
            i4 = i5;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            consumeChunk.invoke(it.next());
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String peekLeadingMatchingValue(String keyToMatch, boolean isLenient) {
        keyToMatch.getClass();
        int i = this.currentPosition;
        try {
            if (consumeNextToken() == 6 && sn0.r(peekString(isLenient), keyToMatch)) {
                discardPeeked();
                if (consumeNextToken() == 5) {
                    return peekString(isLenient);
                }
            }
            return null;
        } finally {
            this.currentPosition = i;
            discardPeeked();
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int prefetchOrEof(int position) {
        if (position < getSource().length()) {
            return position;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        char charAt;
        int i = this.currentPosition;
        if (i == -1) {
            return i;
        }
        String source = getSource();
        while (i < source.length() && ((charAt = source.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i++;
        }
        this.currentPosition = i;
        return i;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public String getSource() {
        return this.source;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        String source = getSource();
        int i = this.currentPosition;
        while (i != -1 && i < source.length()) {
            int i2 = i + 1;
            char charAt = source.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.currentPosition = i2;
                return AbstractJsonLexerKt.charToTokenClass(charAt);
            }
            i = i2;
        }
        this.currentPosition = source.length();
        return (byte) 10;
    }
}
