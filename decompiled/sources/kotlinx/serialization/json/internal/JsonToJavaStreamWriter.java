package kotlinx.serialization.json.internal;

import defpackage.l90;
import defpackage.se;
import defpackage.yq1;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0006H\u0082\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006H\u0082\b¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0006H\u0082\b¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u0015J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010)J\u0017\u0010*\u001a\u00020\n2\u0006\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "Ljava/io/OutputStream;", "stream", "<init>", "(Ljava/io/OutputStream;)V", "", "currentSize", "", "string", "Lod2;", "appendStringSlowPath", "(ILjava/lang/String;)V", "oldSize", "additional", "ensureTotalCapacity", "(II)I", "flush", "()V", "bytesCount", "ensure", "(I)V", "byte", "write", "rest", "()I", "", "count", "writeUtf8", "([CI)V", "codePoint", "writeUtf8CodePoint", "", "value", "writeLong", "(J)V", "", "char", "writeChar", "(C)V", "text", "(Ljava/lang/String;)V", "writeQuoted", "release", "Ljava/io/OutputStream;", "", "buffer", "[B", "charArray", "[C", "indexInBuffer", "I", "kotlinx-serialization-json"}, k = 1, mv = {2, 2, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class JsonToJavaStreamWriter implements InternalJsonWriter {
    private final byte[] buffer;
    private char[] charArray;
    private int indexInBuffer;
    private final OutputStream stream;

    public JsonToJavaStreamWriter(OutputStream outputStream) {
        outputStream.getClass();
        this.stream = outputStream;
        this.buffer = ByteArrayPool.INSTANCE.take();
        this.charArray = CharArrayPool.INSTANCE.take();
    }

    private final void appendStringSlowPath(int currentSize, String string) {
        int i;
        int length = string.length();
        for (int i2 = currentSize - 1; i2 < length; i2++) {
            int ensureTotalCapacity = ensureTotalCapacity(currentSize, 2);
            char charAt = string.charAt(i2);
            if (charAt < StringOpsKt.getESCAPE_MARKERS().length) {
                byte b = StringOpsKt.getESCAPE_MARKERS()[charAt];
                if (b == 0) {
                    i = ensureTotalCapacity + 1;
                    this.charArray[ensureTotalCapacity] = charAt;
                } else {
                    if (b == 1) {
                        String str = StringOpsKt.getESCAPE_STRINGS()[charAt];
                        str.getClass();
                        int ensureTotalCapacity2 = ensureTotalCapacity(ensureTotalCapacity, str.length());
                        str.getChars(0, str.length(), this.charArray, ensureTotalCapacity2);
                        currentSize = str.length() + ensureTotalCapacity2;
                    } else {
                        char[] cArr = this.charArray;
                        cArr[ensureTotalCapacity] = AbstractJsonLexerKt.STRING_ESC;
                        cArr[ensureTotalCapacity + 1] = (char) b;
                        currentSize = ensureTotalCapacity + 2;
                    }
                }
            } else {
                i = ensureTotalCapacity + 1;
                this.charArray[ensureTotalCapacity] = charAt;
            }
            currentSize = i;
        }
        ensureTotalCapacity(currentSize, 1);
        char[] cArr2 = this.charArray;
        cArr2[currentSize] = AbstractJsonLexerKt.STRING;
        writeUtf8(cArr2, currentSize + 1);
        flush();
    }

    private final void ensure(int bytesCount) {
        if (this.buffer.length - this.indexInBuffer < bytesCount) {
            flush();
        }
    }

    private final int ensureTotalCapacity(int oldSize, int additional) {
        int i = additional + oldSize;
        char[] cArr = this.charArray;
        if (cArr.length <= i) {
            int i2 = oldSize * 2;
            if (i < i2) {
                i = i2;
            }
            this.charArray = Arrays.copyOf(cArr, i);
        }
        return oldSize;
    }

    private final void flush() {
        this.stream.write(this.buffer, 0, this.indexInBuffer);
        this.indexInBuffer = 0;
    }

    private final int rest() {
        return this.buffer.length - this.indexInBuffer;
    }

    private final void writeUtf8(char[] string, int count) {
        char c;
        if (count >= 0) {
            if (count <= string.length) {
                int i = 0;
                while (i < count) {
                    char c2 = string[i];
                    if (c2 < 128) {
                        if (this.buffer.length - this.indexInBuffer < 1) {
                            flush();
                        }
                        byte[] bArr = this.buffer;
                        int i2 = this.indexInBuffer;
                        int i3 = i2 + 1;
                        this.indexInBuffer = i3;
                        bArr[i2] = (byte) c2;
                        i++;
                        int min = Math.min(count, (bArr.length - i3) + i);
                        while (i < min) {
                            char c3 = string[i];
                            if (c3 < 128) {
                                byte[] bArr2 = this.buffer;
                                int i4 = this.indexInBuffer;
                                this.indexInBuffer = i4 + 1;
                                bArr2[i4] = (byte) c3;
                                i++;
                            }
                        }
                    } else {
                        if (c2 < 2048) {
                            if (this.buffer.length - this.indexInBuffer < 2) {
                                flush();
                            }
                            byte[] bArr3 = this.buffer;
                            int i5 = this.indexInBuffer;
                            int i6 = i5 + 1;
                            this.indexInBuffer = i6;
                            bArr3[i5] = (byte) ((c2 >> 6) | 192);
                            this.indexInBuffer = i5 + 2;
                            bArr3[i6] = (byte) ((c2 & '?') | 128);
                        } else if (c2 >= 55296 && c2 <= 57343) {
                            int i7 = i + 1;
                            if (i7 < count) {
                                c = string[i7];
                            } else {
                                c = 0;
                            }
                            if (c2 <= 56319 && 56320 <= c && c < 57344) {
                                int i8 = (((c2 & 1023) << 10) | (c & 1023)) + 65536;
                                if (this.buffer.length - this.indexInBuffer < 4) {
                                    flush();
                                }
                                byte[] bArr4 = this.buffer;
                                int i9 = this.indexInBuffer;
                                int i10 = i9 + 1;
                                this.indexInBuffer = i10;
                                bArr4[i9] = (byte) ((i8 >> 18) | 240);
                                int i11 = i9 + 2;
                                this.indexInBuffer = i11;
                                bArr4[i10] = (byte) (((i8 >> 12) & 63) | 128);
                                int i12 = i9 + 3;
                                this.indexInBuffer = i12;
                                bArr4[i11] = (byte) (((i8 >> 6) & 63) | 128);
                                this.indexInBuffer = i9 + 4;
                                bArr4[i12] = (byte) ((i8 & 63) | 128);
                                i += 2;
                            } else {
                                if (this.buffer.length - this.indexInBuffer < 1) {
                                    flush();
                                }
                                byte[] bArr5 = this.buffer;
                                int i13 = this.indexInBuffer;
                                this.indexInBuffer = i13 + 1;
                                bArr5[i13] = 63;
                                i = i7;
                            }
                        } else {
                            if (this.buffer.length - this.indexInBuffer < 3) {
                                flush();
                            }
                            byte[] bArr6 = this.buffer;
                            int i14 = this.indexInBuffer;
                            int i15 = i14 + 1;
                            this.indexInBuffer = i15;
                            bArr6[i14] = (byte) ((c2 >> '\f') | 224);
                            int i16 = i14 + 2;
                            this.indexInBuffer = i16;
                            bArr6[i15] = (byte) (((c2 >> 6) & 63) | 128);
                            this.indexInBuffer = i14 + 3;
                            bArr6[i16] = (byte) ((c2 & '?') | 128);
                        }
                        i++;
                    }
                }
                return;
            }
            se.l(l90.q("count > string.length: ", count, " > "), string.length);
            return;
        }
        se.h("count < 0");
    }

    private final void writeUtf8CodePoint(int codePoint) {
        if (codePoint < 128) {
            if (this.buffer.length - this.indexInBuffer < 1) {
                flush();
            }
            byte[] bArr = this.buffer;
            int i = this.indexInBuffer;
            this.indexInBuffer = i + 1;
            bArr[i] = (byte) codePoint;
            return;
        }
        if (codePoint < 2048) {
            if (this.buffer.length - this.indexInBuffer < 2) {
                flush();
            }
            byte[] bArr2 = this.buffer;
            int i2 = this.indexInBuffer;
            int i3 = i2 + 1;
            this.indexInBuffer = i3;
            bArr2[i2] = (byte) ((codePoint >> 6) | 192);
            this.indexInBuffer = i2 + 2;
            bArr2[i3] = (byte) ((codePoint & 63) | 128);
            return;
        }
        if (55296 <= codePoint && codePoint < 57344) {
            if (this.buffer.length - this.indexInBuffer < 1) {
                flush();
            }
            byte[] bArr3 = this.buffer;
            int i4 = this.indexInBuffer;
            this.indexInBuffer = i4 + 1;
            bArr3[i4] = 63;
            return;
        }
        if (codePoint < 65536) {
            if (this.buffer.length - this.indexInBuffer < 3) {
                flush();
            }
            byte[] bArr4 = this.buffer;
            int i5 = this.indexInBuffer;
            int i6 = i5 + 1;
            this.indexInBuffer = i6;
            bArr4[i5] = (byte) ((codePoint >> 12) | 224);
            int i7 = i5 + 2;
            this.indexInBuffer = i7;
            bArr4[i6] = (byte) (((codePoint >> 6) & 63) | 128);
            this.indexInBuffer = i5 + 3;
            bArr4[i7] = (byte) ((codePoint & 63) | 128);
            return;
        }
        if (codePoint <= 1114111) {
            if (this.buffer.length - this.indexInBuffer < 4) {
                flush();
            }
            byte[] bArr5 = this.buffer;
            int i8 = this.indexInBuffer;
            int i9 = i8 + 1;
            this.indexInBuffer = i9;
            bArr5[i8] = (byte) ((codePoint >> 18) | 240);
            int i10 = i8 + 2;
            this.indexInBuffer = i10;
            bArr5[i9] = (byte) (((codePoint >> 12) & 63) | 128);
            int i11 = i8 + 3;
            this.indexInBuffer = i11;
            bArr5[i10] = (byte) (((codePoint >> 6) & 63) | 128);
            this.indexInBuffer = i8 + 4;
            bArr5[i11] = (byte) ((codePoint & 63) | 128);
            return;
        }
        throw new JsonEncodingException(l90.g(codePoint, "Unexpected code point: "));
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void release() {
        flush();
        CharArrayPool.INSTANCE.release(this.charArray);
        ByteArrayPool.INSTANCE.release(this.buffer);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void write(String text) {
        text.getClass();
        int length = text.length();
        ensureTotalCapacity(0, length);
        text.getChars(0, length, this.charArray, 0);
        writeUtf8(this.charArray, length);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeChar(char r1) {
        writeUtf8CodePoint(r1);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeLong(long value) {
        write(String.valueOf(value));
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeQuoted(String text) {
        text.getClass();
        ensureTotalCapacity(0, text.length() + 2);
        char[] cArr = this.charArray;
        cArr[0] = AbstractJsonLexerKt.STRING;
        int length = text.length();
        text.getChars(0, length, cArr, 1);
        int i = length + 1;
        for (int i2 = 1; i2 < i; i2++) {
            char c = cArr[i2];
            if (c < StringOpsKt.getESCAPE_MARKERS().length && StringOpsKt.getESCAPE_MARKERS()[c] != 0) {
                appendStringSlowPath(i2, text);
                return;
            }
        }
        cArr[i] = AbstractJsonLexerKt.STRING;
        writeUtf8(cArr, length + 2);
        flush();
    }

    private final void write(int r4) {
        byte[] bArr = this.buffer;
        int i = this.indexInBuffer;
        this.indexInBuffer = i + 1;
        bArr[i] = (byte) r4;
    }
}
