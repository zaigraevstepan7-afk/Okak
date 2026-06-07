package defpackage;

import com.topjohnwu.superuser.internal.HiddenAPIs;
import com.topjohnwu.superuser.nio.FileSystemManager;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class xn {
    public static ij0 a;
    public static ij0 b;
    public static ij0 c;

    public static int A(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final Object B(e01 e01Var) {
        nq0 nq0Var;
        Object C = e01Var.C();
        if (C instanceof nq0) {
            nq0Var = (nq0) C;
        } else {
            nq0Var = null;
        }
        if (nq0Var == null) {
            return null;
        }
        return nq0Var.s;
    }

    public static final int C(fd1 fd1Var) {
        long g;
        if (fd1Var.e == sb1.e) {
            g = fd1Var.g() & 4294967295L;
        } else {
            g = fd1Var.g() >> 32;
        }
        return (int) g;
    }

    public static final ij0 D() {
        ij0 ij0Var = c;
        if (ij0Var != null) {
            return ij0Var;
        }
        hj0 hj0Var = new hj0("Rounded.MusicNote", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = me2.a;
        i12 i12Var = new i12(co.b);
        rg2 rg2Var = new rg2(21);
        rg2Var.s(12.0f, 5.0f);
        rg2Var.E(8.55f);
        rg2Var.i(-0.94f, -0.54f, -2.1f, -0.75f, -3.33f, -0.32f);
        rg2Var.i(-1.34f, 0.48f, -2.37f, 1.67f, -2.61f, 3.07f);
        rg2Var.i(-0.46f, 2.74f, 1.86f, 5.08f, 4.59f, 4.65f);
        rg2Var.i(1.96f, -0.31f, 3.35f, -2.11f, 3.35f, -4.1f);
        rg2Var.D(7.0f);
        rg2Var.o(2.0f);
        rg2Var.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        rg2Var.w(-0.9f, -2.0f, -2.0f, -2.0f);
        rg2Var.o(-2.0f);
        rg2Var.i(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        rg2Var.f();
        hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
        ij0 b2 = hj0Var.b();
        c = b2;
        return b2;
    }

    public static List E(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static List F(Object... objArr) {
        if (objArr.length > 0) {
            List asList = Arrays.asList(objArr);
            asList.getClass();
            return asList;
        }
        return l60.e;
    }

    public static ArrayList G(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new re(objArr, true));
    }

    public static final List H(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return list;
            }
            return E(list.get(0));
        }
        return l60.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0363 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x036b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void I(android.view.ViewStructure r38, defpackage.ar0 r39, android.view.autofill.AutofillId r40, java.lang.String r41, defpackage.rl1 r42) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn.I(android.view.ViewStructure, ar0, android.view.autofill.AutofillId, java.lang.String, rl1):void");
    }

    public static final long J(fk0 fk0Var, sb1 sb1Var, ek0 ek0Var) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        if (sb1Var == null) {
            return fk0Var.c;
        }
        int i = ek0Var.a;
        if (i == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (fk0Var.c >> 32));
        } else if (i == 2) {
            intBitsToFloat = Float.intBitsToFloat((int) (fk0Var.c & 4294967295L));
        } else {
            return fk0Var.c;
        }
        if (sb1Var == sb1.f) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            j = floatToRawIntBits3 << 32;
        }
        return j | (4294967295L & floatToRawIntBits);
    }

    public static final long K(fk0 fk0Var, sb1 sb1Var, ek0 ek0Var) {
        float intBitsToFloat;
        long j = fk0Var.g;
        if (sb1Var == null) {
            return j;
        }
        int i = ek0Var.a;
        if (i == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        } else if (i == 2) {
            intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        } else {
            return j;
        }
        if (sb1Var == sb1.f) {
            return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        }
        return (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [mz0, b11] */
    public static b11 L(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    int i3 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i3) {
                        break;
                    }
                    i2++;
                } else {
                    j = -1;
                    break;
                }
            }
            if (j != -1) {
                duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j2 = duplicate.getInt() & 4294967295L;
                for (int i4 = 0; i4 < j2; i4++) {
                    int i5 = duplicate.getInt();
                    long j3 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i5 || 1701669481 == i5) {
                        duplicate.position((int) (j3 + j));
                        ?? mz0Var = new mz0();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        mz0Var.h = duplicate;
                        mz0Var.e = position;
                        int i6 = position - duplicate.getInt(position);
                        mz0Var.f = i6;
                        mz0Var.g = ((ByteBuffer) mz0Var.h).getShort(i6);
                        return mz0Var;
                    }
                }
            }
            se.w("Cannot read metadata.");
            return null;
        }
        se.w("Cannot read metadata.");
        return null;
    }

    public static final Object M(sf1 sf1Var, xj1 xj1Var) {
        xj1Var.getClass();
        Object obj = sf1Var.get(xj1Var);
        if (obj == null) {
            obj = xj1Var.b();
        }
        return ((ge2) obj).a(sf1Var);
    }

    public static byte[] N(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                se.p(l90.g(i, "Not enough bytes to read: "));
                return null;
            }
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] O(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn.O(java.io.FileInputStream, int, int):byte[]");
    }

    public static ArrayList P(File file) {
        Charset charset = sm.a;
        charset.getClass();
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        try {
            Iterator it = ((ts) mv1.F(new bo(bufferedReader, 1))).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                str.getClass();
                arrayList.add(str);
            }
            bufferedReader.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fc2.u(bufferedReader, th);
                throw th2;
            }
        }
    }

    public static String Q(File file) {
        Charset charset = sm.a;
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[SharedConstants.DefaultBufferSize];
            for (int read = inputStreamReader.read(cArr); read >= 0; read = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, read);
            }
            String stringWriter2 = stringWriter.toString();
            stringWriter2.getClass();
            inputStreamReader.close();
            return stringWriter2;
        } finally {
        }
    }

    public static long R(InputStream inputStream, int i) {
        byte[] N = N(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (N[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static final Object S(Object obj) {
        if (obj instanceof lp) {
            return io.s(((lp) obj).a);
        }
        return obj;
    }

    public static final int T(int i, int i2) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public static void U() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static String V(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + go.W(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + go.W(Float.intBitsToFloat(i)) + ", " + go.W(Float.intBitsToFloat(i2)) + ')';
    }

    public static final sf1 W(zj1[] zj1VarArr, sf1 sf1Var, sf1 sf1Var2) {
        rf1 rf1Var = new rf1(sf1.h);
        for (zj1 zj1Var : zj1VarArr) {
            xj1 xj1Var = zj1Var.a;
            if (zj1Var.f || !sf1Var.containsKey(xj1Var)) {
                rf1Var.put(xj1Var, xj1Var.c(zj1Var, (ge2) sf1Var2.get(xj1Var)));
            }
        }
        return rf1Var.a();
    }

    public static final void X(FileOutputStream fileOutputStream, String str, Charset charset) {
        boolean z;
        charset.getClass();
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(SharedConstants.DefaultBufferSize);
        onUnmappableCharacter.getClass();
        ByteBuffer allocate2 = ByteBuffer.allocate(SharedConstants.DefaultBufferSize * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        allocate2.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int min = Math.min(8192 - i2, str.length() - i);
            int i3 = i + min;
            char[] array = allocate.array();
            array.getClass();
            str.getChars(i, i3, array, i2);
            allocate.limit(min + i2);
            i2 = 1;
            if (i3 == str.length()) {
                z = true;
            } else {
                z = false;
            }
            if (onUnmappableCharacter.encode(allocate, allocate2, z).isUnderflow()) {
                fileOutputStream.write(allocate2.array(), 0, allocate2.position());
                if (allocate.position() != allocate.limit()) {
                    allocate.put(0, allocate.get());
                } else {
                    i2 = 0;
                }
                allocate.clear();
                allocate2.clear();
                i = i3;
            } else {
                se.p("Check failed.");
                return;
            }
        }
    }

    public static void Y(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void Z(ByteArrayOutputStream byteArrayOutputStream, int i) {
        Y(byteArrayOutputStream, i, 2);
    }

    public static final uv a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        return new uv(new float[]{f, f2, f3, f4, f5, f6, f7, f8});
    }

    public static final long b(float f, boolean z, boolean z2) {
        long j;
        long floatToRawIntBits = Float.floatToRawIntBits(f);
        long j2 = 0;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        if (z2) {
            j2 = 2;
        }
        return ((j | j2) & 4294967295L) | (floatToRawIntBits << 32);
    }

    /* JADX WARN: Type inference failed for: r6v13, types: [pv, java.lang.Object] */
    public static final void c(e21 e21Var, oe oeVar, qe qeVar, g3 g3Var, fq fqVar, ur urVar, int i) {
        int i2;
        Object obj;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        Object obj2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Object obj3 = g3.o;
        urVar.Y(-1956591841);
        if ((i & 6) == 0) {
            if (urVar.f(e21Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.f(oeVar)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if (urVar.f(qeVar)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (urVar.f(obj3)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (urVar.d(Integer.MAX_VALUE)) {
                i6 = 16384;
            } else {
                i6 = SharedConstants.DefaultBufferSize;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (urVar.d(Integer.MAX_VALUE)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            obj = g3Var;
            if (urVar.f(obj)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        } else {
            obj = g3Var;
        }
        if ((i & 12582912) == 0) {
            if (urVar.h(fqVar)) {
                i3 = 8388608;
            } else {
                i3 = HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if ((i11 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i11 & 1, z)) {
            int i12 = i11 & 3670016;
            if (i12 == 1048576) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object L = urVar.L();
            Object obj4 = or.a;
            if (z2 || L == obj4) {
                obj.getClass();
                L = new Object();
                urVar.h0(L);
            }
            ub0 ub0Var = (ub0) L;
            int i13 = i11 >> 3;
            if ((((i13 & 14) ^ 6) > 4 && urVar.f(oeVar)) || (i13 & 6) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((((i13 & 112) ^ 48) > 32 && urVar.f(qeVar)) || (i13 & 48) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z12 = z3 | z4;
            if ((((i13 & 896) ^ 384) > 256 && urVar.f(obj3)) || (i13 & 384) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z13 = z5 | z12;
            if ((((i13 & 7168) ^ 3072) > 2048 && urVar.d(Integer.MAX_VALUE)) || (i13 & 3072) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z14 = z13 | z6;
            if ((((57344 & i13) ^ 24576) > 16384 && urVar.d(Integer.MAX_VALUE)) || (i13 & 24576) == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean f = z14 | z7 | urVar.f(ub0Var);
            Object L2 = urVar.L();
            if (f || L2 == obj4) {
                Object wb0Var = new wb0(oeVar, qeVar, oeVar.a(), new Object(), qeVar.a(), ub0Var);
                urVar.h0(wb0Var);
                L2 = wb0Var;
            }
            wb0 wb0Var2 = (wb0) L2;
            if (i12 == 1048576) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i11 & 29360128) == 8388608) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z15 = z8 | z9;
            if ((i11 & 458752) == 131072) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z16 = z15 | z10;
            Object L3 = urVar.L();
            if (!z16 && L3 != obj4) {
                z11 = true;
                obj2 = L3;
            } else {
                ArrayList arrayList = new ArrayList();
                z11 = true;
                arrayList.add(new fq(-1192950673, true, new bj0(fqVar, 3)));
                g3Var.getClass();
                urVar.h0(arrayList);
                obj2 = arrayList;
            }
            fq fqVar2 = new fq(1271844412, z11, new t((List) obj2, 7));
            boolean f2 = urVar.f(wb0Var2);
            Object L4 = urVar.L();
            if (f2 || L4 == obj4) {
                L4 = new f31(wb0Var2);
                urVar.h0(L4);
            }
            j01 j01Var = (j01) L4;
            int hashCode = Long.hashCode(urVar.T);
            sf1 l = urVar.l();
            e21 Q = fp.Q(urVar, e21Var);
            lr.b.getClass();
            de0 de0Var = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(de0Var);
            } else {
                urVar.k0();
            }
            op1.q(urVar, kr.f, j01Var);
            op1.q(urVar, kr.e, l);
            op1.l(urVar, Integer.valueOf(hashCode), kr.g);
            op1.o(urVar, kr.h);
            op1.q(urVar, kr.d, Q);
            fqVar2.invoke(urVar, 0);
            urVar.p(true);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new uh(e21Var, oeVar, qeVar, g3Var, fqVar, i);
        }
    }

    public static final void d(e21 e21Var, oe oeVar, qe qeVar, ji jiVar, int i, int i2, fq fqVar, ur urVar, int i3) {
        int i4;
        int i5;
        boolean z;
        e21 e21Var2;
        ji jiVar2;
        int i6;
        int i7;
        urVar.Y(-1303174015);
        int i8 = i3 | 6;
        if (urVar.f(oeVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (urVar.f(qeVar)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i10 = i9 | i5 | 224256;
        if ((599187 & i10) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i10 & 1, z)) {
            ji jiVar3 = g3.o;
            g3 g3Var = g3.K;
            int i11 = (i10 & 896) | (i10 & 112) | 1572870 | 12807168;
            b21 b21Var = b21.a;
            c(b21Var, oeVar, qeVar, g3Var, fqVar, urVar, i11);
            e21Var2 = b21Var;
            i6 = Integer.MAX_VALUE;
            jiVar2 = jiVar3;
            i7 = Integer.MAX_VALUE;
        } else {
            urVar.R();
            e21Var2 = e21Var;
            jiVar2 = jiVar;
            i6 = i;
            i7 = i2;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new yl(e21Var2, oeVar, qeVar, jiVar2, i6, i7, fqVar, i3);
        }
    }

    public static final void e(de0 de0Var, e21 e21Var, vs0 vs0Var, ks0 ks0Var, ur urVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        urVar.Y(1055276397);
        if (urVar.h(de0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (urVar.f(e21Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (urVar.f(vs0Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (urVar.f(ks0Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i9 & 1, z)) {
            hp.c(go.N(-933153643, new js0(vs0Var, e21Var, ks0Var, fr1.p(de0Var, urVar), 0), urVar), urVar, 6);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new be(de0Var, e21Var, vs0Var, ks0Var, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0518 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x03dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.c61 r43, final defpackage.w51 r44, final defpackage.e21 r45, final defpackage.i3 r46, final defpackage.oe0 r47, final defpackage.oe0 r48, final defpackage.oe0 r49, final defpackage.oe0 r50, defpackage.ur r51, final int r52) {
        /*
            Method dump skipped, instructions count: 2967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn.f(c61, w51, e21, i3, oe0, oe0, oe0, oe0, ur, int):void");
    }

    public static final void g(final c61 c61Var, final String str, e21 e21Var, i3 i3Var, final oe0 oe0Var, final oe0 oe0Var2, final oe0 oe0Var3, final oe0 oe0Var4, final oe0 oe0Var5, ur urVar, final int i) {
        int i2;
        oe0 oe0Var6;
        oe0 oe0Var7;
        oe0 oe0Var8;
        oe0 oe0Var9;
        char c2;
        i3 i3Var2;
        e21 e21Var2;
        boolean z;
        boolean z2;
        final i3 i3Var3;
        final e21 e21Var3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        urVar.Y(1840250294);
        if ((i & 6) == 0) {
            if (urVar.h(c61Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i | i8;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.f(str)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        int i9 = i2 | 28032;
        if ((i & 196608) == 0) {
            oe0Var6 = oe0Var;
            if (urVar.h(oe0Var6)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i9 |= i6;
        } else {
            oe0Var6 = oe0Var;
        }
        if ((i & 1572864) == 0) {
            oe0Var7 = oe0Var2;
            if (urVar.h(oe0Var7)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i9 |= i5;
        } else {
            oe0Var7 = oe0Var2;
        }
        if ((i & 12582912) == 0) {
            oe0Var8 = oe0Var3;
            if (urVar.h(oe0Var8)) {
                i4 = 8388608;
            } else {
                i4 = HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
            }
            i9 |= i4;
        } else {
            oe0Var8 = oe0Var3;
        }
        if ((i & 100663296) == 0) {
            oe0Var9 = oe0Var4;
            if (urVar.h(oe0Var9)) {
                i3 = FileSystemManager.MODE_TRUNCATE;
            } else {
                i3 = FileSystemManager.MODE_APPEND;
            }
            i9 |= i3;
        } else {
            oe0Var9 = oe0Var4;
        }
        int i10 = i9 | FileSystemManager.MODE_READ_WRITE;
        if (urVar.h(oe0Var5)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if ((306783379 & i10) == 306783378 && (c2 & 3) == 2 && urVar.A()) {
            urVar.R();
            e21Var3 = e21Var;
            i3Var3 = i3Var;
        } else {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                e21Var2 = e21Var;
                i3Var2 = i3Var;
            } else {
                i3Var2 = g3.f;
                e21Var2 = b21.a;
            }
            urVar.q();
            boolean z3 = false;
            if ((i10 & 57344) == 16384) {
                z = true;
            } else {
                z = false;
            }
            if ((i10 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z2 | z;
            if ((c2 & 14) == 4) {
                z3 = true;
            }
            boolean z5 = z4 | z3;
            Object L = urVar.L();
            if (z5 || L == or.a) {
                x51 x51Var = new x51(c61Var.b.s, str);
                oe0Var5.invoke(x51Var);
                L = x51Var.c();
                urVar.h0(L);
            }
            int i11 = i10 & 8078;
            int i12 = i10 >> 3;
            int i13 = (i12 & 234881024) | i11 | (i12 & 57344) | (458752 & i12) | (3670016 & i12) | (29360128 & i12);
            i3 i3Var4 = i3Var2;
            f(c61Var, (w51) L, e21Var2, i3Var4, oe0Var6, oe0Var7, oe0Var8, oe0Var9, urVar, i13);
            i3Var3 = i3Var4;
            e21Var3 = e21Var2;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0() { // from class: d61
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xn.g(c61.this, str, e21Var3, i3Var3, oe0Var, oe0Var2, oe0Var3, oe0Var4, oe0Var5, (ur) obj, lo.b0(i | 1));
                    return od2.a;
                }
            };
        }
    }

    public static final void h(e21 e21Var, fq fqVar, ur urVar, int i) {
        int i2;
        boolean z;
        e21 e21Var2;
        fq fqVar2;
        int i3;
        int i4;
        urVar.Y(790527681);
        int i5 = 4;
        if ((i & 6) == 0) {
            if (urVar.f(e21Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.h(fqVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            Object L = urVar.L();
            xl1 xl1Var = or.a;
            if (L == xl1Var) {
                je1 je1Var = new je1(null, g3.S);
                urVar.h0(je1Var);
                L = je1Var;
            }
            o41 o41Var = (o41) L;
            Object L2 = urVar.L();
            if (L2 == xl1Var) {
                L2 = new z9(o41Var, 10);
                urVar.h0(L2);
            }
            de0 de0Var = (de0) L2;
            ci1 ci1Var = iz.a;
            nh l = f2.l(sn0.h, urVar, 6);
            e21Var2 = e21Var;
            fqVar2 = fqVar;
            vn.c(new zj1[]{r62.b.a(rx.I(de0Var, urVar, 2)), r62.a.a(l)}, go.N(1070596993, new aw0(e21Var2, o41Var, fqVar2, l, de0Var, 2), urVar), urVar, 56);
        } else {
            e21Var2 = e21Var;
            fqVar2 = fqVar;
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new y9(e21Var2, fqVar2, i, i5);
        }
    }

    public static final void i(long j, k92 k92Var, se0 se0Var, ur urVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        urVar.Y(-684938728);
        if ((i & 6) == 0) {
            if (urVar.e(j)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.f(k92Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (urVar.h(se0Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            js jsVar = t82.a;
            vn.c(new zj1[]{et.a.a(new co(j)), jsVar.a(((k92) urVar.j(jsVar)).d(k92Var))}, se0Var, urVar, ((i2 >> 3) & 112) | 8);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new yj1(j, k92Var, se0Var, i, 0);
        }
    }

    public static final void j(e21 e21Var, fq fqVar, ur urVar, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        urVar.Y(155925518);
        if ((i & 6) == 0) {
            if (urVar.f(e21Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.h(fqVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        int i5 = 3;
        if (urVar.O(i2 & 1, z)) {
            if (urVar.j(r62.a) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (urVar.j(r62.b) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && z3) {
                urVar.X(-1977187922);
                j01 d = hj.d(g3.f, true);
                int hashCode = Long.hashCode(urVar.T);
                sf1 l = urVar.l();
                e21 Q = fp.Q(urVar, e21Var);
                lr.b.getClass();
                hs hsVar = kr.b;
                urVar.a0();
                if (urVar.S) {
                    urVar.k(hsVar);
                } else {
                    urVar.k0();
                }
                op1.q(urVar, kr.f, d);
                op1.q(urVar, kr.e, l);
                op1.l(urVar, Integer.valueOf(hashCode), kr.g);
                op1.o(urVar, kr.h);
                op1.q(urVar, kr.d, Q);
                fqVar.invoke(urVar, Integer.valueOf((i2 >> 3) & 14));
                urVar.p(true);
                urVar.p(false);
            } else if (z2) {
                urVar.X(-1976997706);
                rx.g(e21Var, fqVar, urVar, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                urVar.p(false);
            } else if (z3) {
                urVar.X(-1976846922);
                iz.d(e21Var, fqVar, urVar, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                urVar.p(false);
            } else {
                urVar.X(-1976716505);
                h(e21Var, fqVar, urVar, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                urVar.p(false);
            }
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new y9(e21Var, fqVar, i, i5);
        }
    }

    public static final void k(ov1 ov1Var, fk0 fk0Var, sb1 sb1Var, ek0 ek0Var, nk0 nk0Var, long j) {
        float intBitsToFloat;
        ArrayList arrayList = nk0Var.b;
        long j2 = fk0Var.c;
        boolean z = fk0Var.d;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (fk0Var.c & 4294967295L));
        boolean z2 = fk0Var.h;
        if (!z2 && z) {
            nk0Var.a = 0;
            arrayList.clear();
        }
        if (!m(fk0Var) && (z2 || !z)) {
            if (arrayList.size() == 3) {
                int i = nk0Var.a;
                nk0Var.a = i + 1;
                arrayList.set(i, fk0Var);
            } else {
                arrayList.add(fk0Var);
            }
            if (nk0Var.a == 3) {
                nk0Var.a = 0;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((fk0) arrayList.get(i2)).c >> 32))));
            }
            intBitsToFloat2 = (float) wn.e0(arrayList2);
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(Float.valueOf(Float.intBitsToFloat((int) (((fk0) arrayList.get(i3)).c & 4294967295L))));
            }
            intBitsToFloat3 = (float) wn.e0(arrayList3);
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        if (sb1Var != null) {
            int i4 = ek0Var.a;
            if (i4 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else if (i4 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            floatToRawIntBits = sb1Var == sb1.f ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L) : (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        ((jz) ov1Var.f).a(fk0Var.b, z81.e(floatToRawIntBits, j));
    }

    public static final int l(int i, q41 q41Var) {
        int i2 = q41Var.g - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = q41Var.e;
            int i5 = ((ln0) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((ln0) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final boolean m(fk0 fk0Var) {
        if (fk0Var.h && !fk0Var.d) {
            return true;
        }
        return false;
    }

    public static final q4 n(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new q4(matcher, charSequence);
    }

    public static final d21 o(qz qzVar, int i) {
        d21 d21Var = ((d21) qzVar).e.j;
        if (d21Var != null && (d21Var.h & i) != 0) {
            while (d21Var != null) {
                int i2 = d21Var.g;
                if ((i2 & 2) == 0) {
                    if ((i2 & i) != 0) {
                        return d21Var;
                    }
                    d21Var = d21Var.j;
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static ArrayList p(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new re(objArr, true));
    }

    public static final void q(kg2 kg2Var, sl0 sl0Var, wu0 wu0Var) {
        sl0Var.getClass();
        wu0Var.getClass();
        tq1 tq1Var = (tq1) kg2Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (tq1Var != null && !tq1Var.g) {
            tq1Var.k(sl0Var, wu0Var);
            nu0 nu0Var = wu0Var.c;
            if (nu0Var != nu0.f && nu0Var.compareTo(nu0.h) < 0) {
                wu0Var.a(new sy(sl0Var, wu0Var));
            } else {
                sl0Var.B();
            }
        }
    }

    public static int r(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        int i = 0;
        if (size >= 0) {
            if (size <= size2) {
                int i2 = size - 1;
                while (i <= i2) {
                    int i3 = (i + i2) >>> 1;
                    int p = hp.p((Comparable) arrayList.get(i3), comparable);
                    if (p < 0) {
                        i = i3 + 1;
                    } else if (p > 0) {
                        i2 = i3 - 1;
                    } else {
                        return i3;
                    }
                }
                return -(i + 1);
            }
            y61.l("toIndex (", size, size2, ") is greater than size (");
            return 0;
        }
        throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
    }

    public static vv0 s(vv0 vv0Var) {
        vv0Var.f();
        vv0Var.g = true;
        if (vv0Var.f > 0) {
            return vv0Var;
        }
        return vv0.h;
    }

    public static byte[] t(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static final long u(long j, v40 v40Var) {
        long j2;
        int ordinal = v40Var.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        if (ordinal == 6) {
                            j2 = 86400000;
                        } else {
                            se.t(v40Var, "Wrong unit for millisMultiplier: ");
                            return 0L;
                        }
                    } else {
                        j2 = 3600000;
                    }
                } else {
                    j2 = RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
                }
            } else {
                j2 = 1000;
            }
        } else {
            j2 = 1;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 == 1) {
            if (j <= 4611686018427387903L) {
                return j;
            }
        } else {
            int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (numberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (numberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        }
        return 4611686018427387903L;
    }

    public static vv0 v() {
        return new vv0(10);
    }

    public static final boolean w(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ va0 x(ff0 ff0Var, xu xuVar, int i, jk jkVar, int i2) {
        if ((i2 & 1) != 0) {
            xuVar = j60.e;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            jkVar = jk.e;
        }
        return ff0Var.c(xuVar, i, jkVar);
    }

    public static final ij0 y() {
        ij0 ij0Var = a;
        if (ij0Var != null) {
            return ij0Var;
        }
        hj0 hj0Var = new hj0("Rounded.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = me2.a;
        i12 i12Var = new i12(co.b);
        rg2 rg2Var = new rg2(21);
        rg2Var.s(6.0f, 19.0f);
        rg2Var.i(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        rg2Var.o(8.0f);
        rg2Var.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        rg2Var.D(9.0f);
        rg2Var.i(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        rg2Var.n(8.0f);
        rg2Var.i(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        rg2Var.E(10.0f);
        rg2Var.f();
        rg2Var.s(18.0f, 4.0f);
        rg2Var.o(-2.5f);
        rg2Var.r(-0.71f, -0.71f);
        rg2Var.i(-0.18f, -0.18f, -0.44f, -0.29f, -0.7f, -0.29f);
        rg2Var.n(9.91f);
        rg2Var.i(-0.26f, 0.0f, -0.52f, 0.11f, -0.7f, 0.29f);
        rg2Var.q(8.5f, 4.0f);
        rg2Var.n(6.0f);
        rg2Var.i(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        rg2Var.w(0.45f, 1.0f, 1.0f, 1.0f);
        rg2Var.o(12.0f);
        rg2Var.i(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        rg2Var.w(-0.45f, -1.0f, -1.0f, -1.0f);
        rg2Var.f();
        hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
        ij0 b2 = hj0Var.b();
        a = b2;
        return b2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [an0, ym0] */
    public static an0 z(Collection collection) {
        collection.getClass();
        return new ym0(0, collection.size() - 1, 1);
    }
}
