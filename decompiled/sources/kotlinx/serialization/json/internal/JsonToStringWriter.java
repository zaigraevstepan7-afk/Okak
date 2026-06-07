package kotlinx.serialization.json.internal;

import defpackage.yq1;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\n\n\u0002\u0010\u0019\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0007H\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lkotlinx/serialization/json/internal/JsonToStringWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "<init>", "()V", "", "firstEscapedChar", "currentSize", "", "string", "Lod2;", "appendStringSlowPath", "(IILjava/lang/String;)V", "expected", "ensureAdditionalCapacity", "(I)V", "oldSize", "additional", "ensureTotalCapacity", "(II)I", "", "value", "writeLong", "(J)V", "", "char", "writeChar", "(C)V", "text", "write", "(Ljava/lang/String;)V", "writeQuoted", "release", "toString", "()Ljava/lang/String;", "", "array", "[C", "size", "I", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonToStringWriter implements InternalJsonWriter {
    private char[] array = CharArrayPool.INSTANCE.take();
    private int size;

    private final void appendStringSlowPath(int firstEscapedChar, int currentSize, String string) {
        int i;
        int length = string.length();
        while (firstEscapedChar < length) {
            int ensureTotalCapacity = ensureTotalCapacity(currentSize, 2);
            char charAt = string.charAt(firstEscapedChar);
            if (charAt < StringOpsKt.getESCAPE_MARKERS().length) {
                byte b = StringOpsKt.getESCAPE_MARKERS()[charAt];
                if (b == 0) {
                    i = ensureTotalCapacity + 1;
                    this.array[ensureTotalCapacity] = charAt;
                } else {
                    if (b == 1) {
                        String str = StringOpsKt.getESCAPE_STRINGS()[charAt];
                        str.getClass();
                        int ensureTotalCapacity2 = ensureTotalCapacity(ensureTotalCapacity, str.length());
                        str.getChars(0, str.length(), this.array, ensureTotalCapacity2);
                        int length2 = str.length() + ensureTotalCapacity2;
                        this.size = length2;
                        currentSize = length2;
                    } else {
                        char[] cArr = this.array;
                        cArr[ensureTotalCapacity] = AbstractJsonLexerKt.STRING_ESC;
                        cArr[ensureTotalCapacity + 1] = (char) b;
                        currentSize = ensureTotalCapacity + 2;
                        this.size = currentSize;
                    }
                    firstEscapedChar++;
                }
            } else {
                i = ensureTotalCapacity + 1;
                this.array[ensureTotalCapacity] = charAt;
            }
            currentSize = i;
            firstEscapedChar++;
        }
        int ensureTotalCapacity3 = ensureTotalCapacity(currentSize, 1);
        this.array[ensureTotalCapacity3] = AbstractJsonLexerKt.STRING;
        this.size = ensureTotalCapacity3 + 1;
    }

    private final void ensureAdditionalCapacity(int expected) {
        ensureTotalCapacity(this.size, expected);
    }

    private final int ensureTotalCapacity(int oldSize, int additional) {
        int i = additional + oldSize;
        char[] cArr = this.array;
        if (cArr.length <= i) {
            int i2 = oldSize * 2;
            if (i < i2) {
                i = i2;
            }
            this.array = Arrays.copyOf(cArr, i);
        }
        return oldSize;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void release() {
        CharArrayPool.INSTANCE.release(this.array);
    }

    public String toString() {
        return new String(this.array, 0, this.size);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void write(String text) {
        text.getClass();
        int length = text.length();
        if (length == 0) {
            return;
        }
        ensureAdditionalCapacity(length);
        text.getChars(0, text.length(), this.array, this.size);
        this.size += length;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeChar(char r4) {
        ensureAdditionalCapacity(1);
        char[] cArr = this.array;
        int i = this.size;
        this.size = i + 1;
        cArr[i] = r4;
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeLong(long value) {
        write(String.valueOf(value));
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeQuoted(String text) {
        text.getClass();
        ensureAdditionalCapacity(text.length() + 2);
        char[] cArr = this.array;
        int i = this.size;
        int i2 = i + 1;
        cArr[i] = AbstractJsonLexerKt.STRING;
        int length = text.length();
        text.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        for (int i4 = i2; i4 < i3; i4++) {
            char c = cArr[i4];
            if (c < StringOpsKt.getESCAPE_MARKERS().length && StringOpsKt.getESCAPE_MARKERS()[c] != 0) {
                appendStringSlowPath(i4 - i2, i4, text);
                return;
            }
        }
        cArr[i3] = AbstractJsonLexerKt.STRING;
        this.size = i3 + 1;
    }
}
