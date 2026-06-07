package org.jsoup.parser;

import defpackage.rm;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import org.jsoup.UncheckedIOException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.SoftPool;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class CharacterReader {
    static final int BufferSize = 2048;
    static final char EOF = 65535;
    private static final int MaxStringCacheLen = 12;
    static final int RefillPoint = 1024;
    private static final int RewindLimit = 1024;
    private static final int StringCacheSize = 512;
    private int bufLength;
    private int bufMark;
    private int bufPos;
    private char[] charBuf;
    private int consumed;
    private int fillPoint;
    private int lastIcIndex;
    private String lastIcSeq;
    private int lineNumberOffset;
    private ArrayList<Integer> newlinePositions;
    private boolean readFully;
    private Reader reader;
    private String[] stringCache;
    private static final SoftPool<String[]> StringPool = new SoftPool<>(new rm(0));
    private static final SoftPool<char[]> BufferPool = new SoftPool<>(new rm(1));

    public CharacterReader(Reader reader) {
        this.fillPoint = 0;
        this.bufMark = -1;
        this.newlinePositions = null;
        this.lineNumberOffset = 1;
        Validate.notNull(reader);
        this.reader = reader;
        this.charBuf = BufferPool.borrow();
        this.stringCache = StringPool.borrow();
        bufferUp();
    }

    public static /* synthetic */ char[] a() {
        return lambda$static$1();
    }

    public static /* synthetic */ String[] b() {
        return lambda$static$0();
    }

    private void bufferUp() {
        if (!this.readFully && this.bufPos >= this.fillPoint && this.bufMark == -1) {
            doBufferUp();
        }
    }

    private static String cacheString(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = i2 + i;
        int i4 = 0;
        for (int i5 = i; i5 < i3; i5++) {
            i4 = (i4 * 31) + cArr[i5];
        }
        int i6 = i4 & 511;
        String str = strArr[i6];
        if (str != null && rangeEquals(cArr, i, i2, str)) {
            return str;
        }
        String str2 = new String(cArr, i, i2);
        strArr[i6] = str2;
        return str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        r4.readFully = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void doBufferUp() {
        /*
            r4 = this;
            int r0 = r4.consumed
            int r1 = r4.bufPos
            int r0 = r0 + r1
            r4.consumed = r0
            int r0 = r4.bufLength
            int r0 = r0 - r1
            r4.bufLength = r0
            r2 = 0
            if (r0 <= 0) goto L14
            char[] r3 = r4.charBuf
            java.lang.System.arraycopy(r3, r1, r3, r2, r0)
        L14:
            r4.bufPos = r2
        L16:
            int r0 = r4.bufLength
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto L3a
            java.io.Reader r1 = r4.reader     // Catch: java.io.IOException -> L33
            char[] r2 = r4.charBuf     // Catch: java.io.IOException -> L33
            int r3 = r2.length     // Catch: java.io.IOException -> L33
            int r3 = r3 - r0
            int r0 = r1.read(r2, r0, r3)     // Catch: java.io.IOException -> L33
            r1 = -1
            if (r0 != r1) goto L2d
            r0 = 1
            r4.readFully = r0     // Catch: java.io.IOException -> L33
            goto L3a
        L2d:
            int r1 = r4.bufLength     // Catch: java.io.IOException -> L33
            int r1 = r1 + r0
            r4.bufLength = r1     // Catch: java.io.IOException -> L33
            goto L16
        L33:
            r4 = move-exception
            org.jsoup.UncheckedIOException r0 = new org.jsoup.UncheckedIOException
            r0.<init>(r4)
            throw r0
        L3a:
            int r0 = r4.bufLength
            r1 = 1024(0x400, float:1.435E-42)
            int r0 = java.lang.Math.min(r0, r1)
            r4.fillPoint = r0
            r4.scanBufferForNewlines()
            r0 = 0
            r4.lastIcSeq = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.CharacterReader.doBufferUp():void");
    }

    private boolean isEmptyNoBufferUp() {
        if (this.bufPos >= this.bufLength) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String[] lambda$static$0() {
        return new String[StringCacheSize];
    }

    public static /* synthetic */ char[] lambda$static$1() {
        return new char[BufferSize];
    }

    private int lineNumIndex(int i) {
        if (!isTrackNewlines()) {
            return 0;
        }
        int binarySearch = Collections.binarySearch(this.newlinePositions, Integer.valueOf(i));
        if (binarySearch < -1) {
            return Math.abs(binarySearch) - 2;
        }
        return binarySearch;
    }

    public static boolean rangeEquals(char[] cArr, int i, int i2, String str) {
        if (i2 != str.length()) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 != 0) {
                int i5 = i + 1;
                int i6 = i3 + 1;
                if (cArr[i] != str.charAt(i3)) {
                    return false;
                }
                i = i5;
                i2 = i4;
                i3 = i6;
            } else {
                return true;
            }
        }
    }

    private void scanBufferForNewlines() {
        if (isTrackNewlines()) {
            if (this.newlinePositions.size() > 0) {
                int lineNumIndex = lineNumIndex(this.consumed);
                if (lineNumIndex == -1) {
                    lineNumIndex = 0;
                }
                Integer num = this.newlinePositions.get(lineNumIndex);
                num.intValue();
                this.lineNumberOffset += lineNumIndex;
                this.newlinePositions.clear();
                this.newlinePositions.add(num);
            }
            for (int i = this.bufPos; i < this.bufLength; i++) {
                if (this.charBuf[i] == '\n') {
                    this.newlinePositions.add(Integer.valueOf(this.consumed + 1 + i));
                }
            }
        }
    }

    public void advance() {
        this.bufPos++;
    }

    public void close() {
        Reader reader = this.reader;
        if (reader == null) {
            return;
        }
        try {
            reader.close();
            this.reader = null;
            Arrays.fill(this.charBuf, (char) 0);
            BufferPool.release(this.charBuf);
            this.charBuf = null;
            StringPool.release(this.stringCache);
        } catch (IOException unused) {
            this.reader = null;
            Arrays.fill(this.charBuf, (char) 0);
            BufferPool.release(this.charBuf);
            this.charBuf = null;
            StringPool.release(this.stringCache);
        } catch (Throwable th) {
            this.reader = null;
            Arrays.fill(this.charBuf, (char) 0);
            BufferPool.release(this.charBuf);
            this.charBuf = null;
            StringPool.release(this.stringCache);
            this.stringCache = null;
            throw th;
        }
        this.stringCache = null;
    }

    public int columnNumber(int i) {
        if (!isTrackNewlines()) {
            return i + 1;
        }
        int lineNumIndex = lineNumIndex(i);
        if (lineNumIndex == -1) {
            return i + 1;
        }
        return (i - this.newlinePositions.get(lineNumIndex).intValue()) + 1;
    }

    public char consume() {
        char c;
        bufferUp();
        if (isEmptyNoBufferUp()) {
            c = EOF;
        } else {
            c = this.charBuf[this.bufPos];
        }
        this.bufPos++;
        return c;
    }

    public String consumeAttributeQuoted(boolean z) {
        int i = this.bufPos;
        int i2 = this.bufLength;
        char[] cArr = this.charBuf;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0) {
                break;
            }
            if (c != '\"') {
                if (c == '&') {
                    break;
                }
                if (c == '\'' && z) {
                    break;
                }
                i3++;
            } else {
                if (!z) {
                    break;
                }
                i3++;
            }
        }
        this.bufPos = i3;
        if (i3 > i) {
            return cacheString(this.charBuf, this.stringCache, i, i3 - i);
        }
        return "";
    }

    public String consumeData() {
        int i = this.bufPos;
        int i2 = this.bufLength;
        char[] cArr = this.charBuf;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.bufPos = i3;
        if (i3 > i) {
            return cacheString(this.charBuf, this.stringCache, i, i3 - i);
        }
        return "";
    }

    public String consumeDigitSequence() {
        int i;
        char c;
        bufferUp();
        int i2 = this.bufPos;
        while (true) {
            i = this.bufPos;
            if (i >= this.bufLength || (c = this.charBuf[i]) < '0' || c > '9') {
                break;
            }
            this.bufPos = i + 1;
        }
        return cacheString(this.charBuf, this.stringCache, i2, i - i2);
    }

    public String consumeHexSequence() {
        int i;
        char c;
        bufferUp();
        int i2 = this.bufPos;
        while (true) {
            i = this.bufPos;
            if (i >= this.bufLength || (((c = this.charBuf[i]) < '0' || c > '9') && ((c < 'A' || c > 'F') && (c < 'a' || c > 'f')))) {
                break;
            }
            this.bufPos = i + 1;
        }
        return cacheString(this.charBuf, this.stringCache, i2, i - i2);
    }

    public String consumeLetterSequence() {
        char c;
        bufferUp();
        int i = this.bufPos;
        while (true) {
            int i2 = this.bufPos;
            if (i2 >= this.bufLength || (((c = this.charBuf[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.bufPos++;
        }
        return cacheString(this.charBuf, this.stringCache, i, this.bufPos - i);
    }

    public String consumeLetterThenDigitSequence() {
        char c;
        bufferUp();
        int i = this.bufPos;
        while (true) {
            int i2 = this.bufPos;
            if (i2 >= this.bufLength || (((c = this.charBuf[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.bufPos++;
        }
        while (!isEmptyNoBufferUp()) {
            char[] cArr = this.charBuf;
            int i3 = this.bufPos;
            char c2 = cArr[i3];
            if (c2 < '0' || c2 > '9') {
                break;
            }
            this.bufPos = i3 + 1;
        }
        return cacheString(this.charBuf, this.stringCache, i, this.bufPos - i);
    }

    public String consumeRawData() {
        int i = this.bufPos;
        int i2 = this.bufLength;
        char[] cArr = this.charBuf;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.bufPos = i3;
        if (i3 > i) {
            return cacheString(this.charBuf, this.stringCache, i, i3 - i);
        }
        return "";
    }

    public String consumeTagName() {
        bufferUp();
        int i = this.bufPos;
        int i2 = this.bufLength;
        char[] cArr = this.charBuf;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ' || c == '/' || c == '>') {
                break;
            }
            i3++;
        }
        this.bufPos = i3;
        if (i3 > i) {
            return cacheString(this.charBuf, this.stringCache, i, i3 - i);
        }
        return "";
    }

    public String consumeTo(String str) {
        int nextIndexOf = nextIndexOf(str);
        if (nextIndexOf != -1) {
            String cacheString = cacheString(this.charBuf, this.stringCache, this.bufPos, nextIndexOf);
            this.bufPos += nextIndexOf;
            return cacheString;
        }
        if (this.bufLength - this.bufPos < str.length()) {
            return consumeToEnd();
        }
        int length = (this.bufLength - str.length()) + 1;
        char[] cArr = this.charBuf;
        String[] strArr = this.stringCache;
        int i = this.bufPos;
        String cacheString2 = cacheString(cArr, strArr, i, length - i);
        this.bufPos = length;
        return cacheString2;
    }

    public String consumeToAny(char... cArr) {
        bufferUp();
        int i = this.bufPos;
        int i2 = this.bufLength;
        char[] cArr2 = this.charBuf;
        int i3 = i;
        loop0: while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.bufPos = i3;
        if (i3 > i) {
            return cacheString(this.charBuf, this.stringCache, i, i3 - i);
        }
        return "";
    }

    public String consumeToAnySorted(char... cArr) {
        bufferUp();
        int i = this.bufPos;
        int i2 = this.bufLength;
        char[] cArr2 = this.charBuf;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.bufPos = i3;
        if (i3 > i) {
            return cacheString(this.charBuf, this.stringCache, i, i3 - i);
        }
        return "";
    }

    public String consumeToEnd() {
        bufferUp();
        char[] cArr = this.charBuf;
        String[] strArr = this.stringCache;
        int i = this.bufPos;
        String cacheString = cacheString(cArr, strArr, i, this.bufLength - i);
        this.bufPos = this.bufLength;
        return cacheString;
    }

    public boolean containsIgnoreCase(String str) {
        boolean z = false;
        int i = -1;
        if (str.equals(this.lastIcSeq)) {
            int i2 = this.lastIcIndex;
            if (i2 == -1) {
                return false;
            }
            if (i2 >= this.bufPos) {
                return true;
            }
        }
        this.lastIcSeq = str;
        Locale locale = Locale.ENGLISH;
        int nextIndexOf = nextIndexOf(str.toLowerCase(locale));
        if (nextIndexOf > -1) {
            this.lastIcIndex = this.bufPos + nextIndexOf;
            return true;
        }
        int nextIndexOf2 = nextIndexOf(str.toUpperCase(locale));
        if (nextIndexOf2 > -1) {
            z = true;
        }
        if (z) {
            i = this.bufPos + nextIndexOf2;
        }
        this.lastIcIndex = i;
        return z;
    }

    public char current() {
        bufferUp();
        if (isEmptyNoBufferUp()) {
            return EOF;
        }
        return this.charBuf[this.bufPos];
    }

    public boolean isEmpty() {
        bufferUp();
        if (this.bufPos >= this.bufLength) {
            return true;
        }
        return false;
    }

    public boolean isTrackNewlines() {
        if (this.newlinePositions != null) {
            return true;
        }
        return false;
    }

    public int lineNumber(int i) {
        if (!isTrackNewlines()) {
            return 1;
        }
        int lineNumIndex = lineNumIndex(i);
        int i2 = this.lineNumberOffset;
        if (lineNumIndex == -1) {
            return i2;
        }
        return lineNumIndex + i2 + 1;
    }

    public void mark() {
        if (this.bufLength - this.bufPos < 1024) {
            this.fillPoint = 0;
        }
        bufferUp();
        this.bufMark = this.bufPos;
    }

    public boolean matchConsume(String str) {
        bufferUp();
        if (matches(str)) {
            this.bufPos = str.length() + this.bufPos;
            return true;
        }
        return false;
    }

    public boolean matchConsumeIgnoreCase(String str) {
        if (matchesIgnoreCase(str)) {
            this.bufPos = str.length() + this.bufPos;
            return true;
        }
        return false;
    }

    public boolean matches(String str) {
        bufferUp();
        int length = str.length();
        if (length > this.bufLength - this.bufPos) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.charBuf[this.bufPos + i]) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        bufferUp();
        char c = this.charBuf[this.bufPos];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    public boolean matchesAnySorted(char[] cArr) {
        bufferUp();
        if (!isEmpty() && Arrays.binarySearch(cArr, this.charBuf[this.bufPos]) >= 0) {
            return true;
        }
        return false;
    }

    public boolean matchesAsciiAlpha() {
        if (isEmpty()) {
            return false;
        }
        char c = this.charBuf[this.bufPos];
        if (c < 'A' || c > 'Z') {
            if (c < 'a' || c > 'z') {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean matchesDigit() {
        char c;
        if (isEmpty() || (c = this.charBuf[this.bufPos]) < '0' || c > '9') {
            return false;
        }
        return true;
    }

    public boolean matchesIgnoreCase(String str) {
        bufferUp();
        int length = str.length();
        if (length > this.bufLength - this.bufPos) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.charBuf[this.bufPos + i])) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesLetter() {
        if (isEmpty()) {
            return false;
        }
        char c = this.charBuf[this.bufPos];
        if (c < 'A' || c > 'Z') {
            if ((c < 'a' || c > 'z') && !Character.isLetter(c)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        r2 = r1 + 1;
        r4 = (r9.length() + r2) - 1;
        r5 = r8.bufLength;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 >= r5) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r4 > r5) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r5 >= r4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r9.charAt(r3) != r8.charBuf[r5]) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r5 = r5 + 1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5 != r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        return r1 - r8.bufPos;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0047, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r0 != r8.charBuf[r1]) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r1 >= r8.bufLength) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r0 == r8.charBuf[r1]) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int nextIndexOf(java.lang.CharSequence r9) {
        /*
            r8 = this;
            r8.bufferUp()
            r0 = 0
            char r0 = r9.charAt(r0)
            int r1 = r8.bufPos
        La:
            int r2 = r8.bufLength
            if (r1 >= r2) goto L49
            char[] r2 = r8.charBuf
            char r2 = r2[r1]
            r3 = 1
            if (r0 == r2) goto L21
        L15:
            int r1 = r1 + r3
            int r2 = r8.bufLength
            if (r1 >= r2) goto L21
            char[] r2 = r8.charBuf
            char r2 = r2[r1]
            if (r0 == r2) goto L21
            goto L15
        L21:
            int r2 = r1 + 1
            int r4 = r9.length()
            int r4 = r4 + r2
            int r4 = r4 - r3
            int r5 = r8.bufLength
            if (r1 >= r5) goto L47
            if (r4 > r5) goto L47
            r5 = r2
        L30:
            if (r5 >= r4) goto L41
            char r6 = r9.charAt(r3)
            char[] r7 = r8.charBuf
            char r7 = r7[r5]
            if (r6 != r7) goto L41
            int r5 = r5 + 1
            int r3 = r3 + 1
            goto L30
        L41:
            if (r5 != r4) goto L47
            int r8 = r8.bufPos
            int r1 = r1 - r8
            return r1
        L47:
            r1 = r2
            goto La
        L49:
            r8 = -1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.CharacterReader.nextIndexOf(java.lang.CharSequence):int");
    }

    public int pos() {
        return this.consumed + this.bufPos;
    }

    public String posLineCol() {
        return lineNumber() + ":" + columnNumber();
    }

    public boolean readFully() {
        return this.readFully;
    }

    public void rewindToMark() {
        int i = this.bufMark;
        if (i != -1) {
            this.bufPos = i;
            unmark();
            return;
        }
        throw new UncheckedIOException(new IOException("Mark invalid"));
    }

    public String toString() {
        int i = this.bufLength;
        int i2 = this.bufPos;
        if (i - i2 < 0) {
            return "";
        }
        return new String(this.charBuf, i2, i - i2);
    }

    public void trackNewlines(boolean z) {
        if (z && this.newlinePositions == null) {
            this.newlinePositions = new ArrayList<>(25);
            scanBufferForNewlines();
        } else if (!z) {
            this.newlinePositions = null;
        }
    }

    public void unconsume() {
        int i = this.bufPos;
        if (i >= 1) {
            this.bufPos = i - 1;
            return;
        }
        throw new UncheckedIOException(new IOException("WTF: No buffer left to unconsume."));
    }

    public void unmark() {
        this.bufMark = -1;
    }

    public int lineNumber() {
        return lineNumber(pos());
    }

    public boolean rangeEquals(int i, int i2, String str) {
        return rangeEquals(this.charBuf, i, i2, str);
    }

    public int columnNumber() {
        return columnNumber(pos());
    }

    public boolean matches(char c) {
        return !isEmpty() && this.charBuf[this.bufPos] == c;
    }

    public CharacterReader(Reader reader, int i) {
        this(reader);
    }

    public CharacterReader(String str) {
        this(new StringReader(str));
    }

    public String consumeTo(char c) {
        int nextIndexOf = nextIndexOf(c);
        if (nextIndexOf != -1) {
            String cacheString = cacheString(this.charBuf, this.stringCache, this.bufPos, nextIndexOf);
            this.bufPos += nextIndexOf;
            return cacheString;
        }
        return consumeToEnd();
    }

    public int nextIndexOf(char c) {
        bufferUp();
        for (int i = this.bufPos; i < this.bufLength; i++) {
            if (c == this.charBuf[i]) {
                return i - this.bufPos;
            }
        }
        return -1;
    }
}
