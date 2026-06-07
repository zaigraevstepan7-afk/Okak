package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bl1 implements pk {
    public final k12 e;
    public final hk f;
    public boolean g;

    /* JADX WARN: Type inference failed for: r1v1, types: [hk, java.lang.Object] */
    public bl1(k12 k12Var) {
        k12Var.getClass();
        this.e = k12Var;
        this.f = new Object();
    }

    @Override // defpackage.pk
    public final boolean C(long j) {
        hk hkVar;
        if (j >= 0) {
            if (this.g) {
                se.p("closed");
                return false;
            }
            do {
                hkVar = this.f;
                if (hkVar.f >= j) {
                    return true;
                }
            } while (this.e.read(hkVar, 8192L) != -1);
            return false;
        }
        se.e(l90.k("byteCount < 0: ", j));
        return false;
    }

    @Override // defpackage.pk
    public final long E(hk hkVar) {
        hk hkVar2;
        long j = 0;
        while (true) {
            k12 k12Var = this.e;
            hkVar2 = this.f;
            if (k12Var.read(hkVar2, 8192L) == -1) {
                break;
            }
            long g = hkVar2.g();
            if (g > 0) {
                j += g;
                hkVar.write(hkVar2, g);
            }
        }
        long j2 = hkVar2.f;
        if (j2 > 0) {
            long j3 = j + j2;
            hkVar.write(hkVar2, j2);
            return j3;
        }
        return j;
    }

    @Override // defpackage.pk
    public final String F() {
        return q(Long.MAX_VALUE);
    }

    @Override // defpackage.pk
    public final boolean I(long j, bl blVar) {
        blVar.getClass();
        int d = blVar.d();
        if (!this.g) {
            if (d < 0 || d > blVar.d() || (d != 0 && d6.t(this, blVar, d, 1L) == -1)) {
                return false;
            }
            return true;
        }
        se.p("closed");
        return false;
    }

    @Override // defpackage.pk
    public final int J(qb1 qb1Var) {
        qb1Var.getClass();
        if (this.g) {
            se.p("closed");
            return 0;
        }
        while (true) {
            hk hkVar = this.f;
            int d = b.d(hkVar, qb1Var, true);
            if (d != -2) {
                if (d != -1) {
                    hkVar.skip(qb1Var.e[d].d());
                    return d;
                }
            } else if (this.e.read(hkVar, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // defpackage.pk
    public final void K(long j) {
        if (C(j)) {
        } else {
            throw new EOFException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        defpackage.mp0.m(16);
        r0 = java.lang.Integer.toString(r2, 16);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r0));
     */
    @Override // defpackage.pk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long N() {
        /*
            r6 = this;
            r0 = 1
            r6.K(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.C(r2)
            hk r3 = r6.f
            if (r2 == 0) goto L4c
            long r4 = (long) r0
            byte r2 = r3.k(r4)
            r4 = 48
            if (r2 < r4) goto L1e
            r4 = 57
            if (r2 <= r4) goto L2f
        L1e:
            r4 = 97
            if (r2 < r4) goto L26
            r4 = 102(0x66, float:1.43E-43)
            if (r2 <= r4) goto L2f
        L26:
            r4 = 65
            if (r2 < r4) goto L31
            r4 = 70
            if (r2 <= r4) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L4c
        L34:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            r0 = 16
            defpackage.mp0.m(r0)
            java.lang.String r0 = java.lang.Integer.toString(r2, r0)
            r0.getClass()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r6.<init>(r0)
            throw r6
        L4c:
            long r0 = r3.N()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl1.N():long");
    }

    @Override // defpackage.pk
    public final hk a() {
        return this.f;
    }

    public final long b(byte b, long j, long j2) {
        if (!this.g) {
            if (0 <= j2) {
                long j3 = 0;
                while (j3 < j2) {
                    hk hkVar = this.f;
                    byte b2 = b;
                    long j4 = j2;
                    long o = hkVar.o(b2, j3, j4);
                    if (o != -1) {
                        return o;
                    }
                    long j5 = hkVar.f;
                    if (j5 >= j4 || this.e.read(hkVar, 8192L) == -1) {
                        break;
                    }
                    j3 = Math.max(j3, j5);
                    b = b2;
                    j2 = j4;
                }
                return -1L;
            }
            se.e(l90.k("fromIndex=0 toIndex=", j2));
            return 0L;
        }
        se.p("closed");
        return 0L;
    }

    public final int c() {
        K(4L);
        return rx.L(this.f.readInt());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.g) {
            this.g = true;
            this.e.close();
            this.f.b();
        }
    }

    @Override // defpackage.pk
    public final long d(long j, bl blVar) {
        blVar.getClass();
        return d6.t(this, blVar, blVar.d(), j);
    }

    @Override // defpackage.pk
    public final bl e(long j) {
        K(j);
        return this.f.e(j);
    }

    public final long g() {
        K(8L);
        long readLong = this.f.readLong();
        return ((readLong & 255) << 56) | (((-72057594037927936L) & readLong) >>> 56) | ((71776119061217280L & readLong) >>> 40) | ((280375465082880L & readLong) >>> 24) | ((1095216660480L & readLong) >>> 8) | ((4278190080L & readLong) << 8) | ((16711680 & readLong) << 24) | ((65280 & readLong) << 40);
    }

    @Override // defpackage.pk
    public final byte[] h() {
        k12 k12Var = this.e;
        hk hkVar = this.f;
        hkVar.l(k12Var);
        return hkVar.t(hkVar.f);
    }

    public final short i() {
        K(2L);
        return this.f.A();
    }

    @Override // defpackage.pk
    public final InputStream inputStream() {
        return new gk(this, 1);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.g;
    }

    @Override // defpackage.pk
    public final boolean j() {
        if (!this.g) {
            hk hkVar = this.f;
            if (!hkVar.j() || this.e.read(hkVar, 8192L) != -1) {
                return false;
            }
            return true;
        }
        se.p("closed");
        return false;
    }

    public final String k(long j) {
        K(j);
        return this.f.D(j, sm.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        defpackage.mp0.m(16);
        r0 = java.lang.Integer.toString(r8, 16);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(r0));
     */
    @Override // defpackage.pk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long n() {
        /*
            r11 = this;
            r0 = 1
            r11.K(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r11.C(r6)
            hk r9 = r11.f
            if (r8 == 0) goto L44
            byte r8 = r9.k(r4)
            r10 = 48
            if (r8 < r10) goto L1e
            r10 = 57
            if (r8 <= r10) goto L27
        L1e:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
            r5 = 45
            if (r8 == r5) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r4 == 0) goto L2c
            goto L44
        L2c:
            java.lang.NumberFormatException r11 = new java.lang.NumberFormatException
            r0 = 16
            defpackage.mp0.m(r0)
            java.lang.String r0 = java.lang.Integer.toString(r8, r0)
            r0.getClass()
            java.lang.String r1 = "Expected a digit or '-' but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r11.<init>(r0)
            throw r11
        L44:
            long r0 = r9.n()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl1.n():long");
    }

    @Override // defpackage.pk
    public final bl1 peek() {
        return new bl1(new of1(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [hk, java.lang.Object] */
    @Override // defpackage.pk
    public final String q(long j) {
        long j2;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long b = b((byte) 10, 0L, j2);
            hk hkVar = this.f;
            if (b != -1) {
                return b.c(hkVar, b);
            }
            if (j2 < Long.MAX_VALUE && C(j2) && hkVar.k(j2 - 1) == 13 && C(j2 + 1) && hkVar.k(j2) == 10) {
                return b.c(hkVar, j2);
            }
            ?? obj = new Object();
            hkVar.i(0L, obj, Math.min(32L, hkVar.f));
            throw new EOFException("\\n not found: limit=" + Math.min(hkVar.f, j) + " content=" + obj.e(obj.f).e() + (char) 8230);
        }
        se.e(l90.k("limit < 0: ", j));
        return null;
    }

    @Override // defpackage.k12
    public final long read(hk hkVar, long j) {
        hkVar.getClass();
        if (j >= 0) {
            if (!this.g) {
                hk hkVar2 = this.f;
                if (hkVar2.f == 0) {
                    if (j == 0) {
                        return 0L;
                    }
                    if (this.e.read(hkVar2, 8192L) == -1) {
                        return -1L;
                    }
                }
                return hkVar2.read(hkVar, Math.min(j, hkVar2.f));
            }
            se.p("closed");
            return 0L;
        }
        se.e(l90.k("byteCount < 0: ", j));
        return 0L;
    }

    @Override // defpackage.pk
    public final byte readByte() {
        K(1L);
        return this.f.readByte();
    }

    @Override // defpackage.pk
    public final void readFully(byte[] bArr) {
        hk hkVar = this.f;
        bArr.getClass();
        try {
            K(bArr.length);
            hkVar.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = hkVar.f;
                if (j > 0) {
                    int read = hkVar.read(bArr, i, (int) j);
                    if (read != -1) {
                        i += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // defpackage.pk
    public final int readInt() {
        K(4L);
        return this.f.readInt();
    }

    @Override // defpackage.pk
    public final long readLong() {
        K(8L);
        return this.f.readLong();
    }

    @Override // defpackage.pk
    public final short readShort() {
        K(2L);
        return this.f.readShort();
    }

    @Override // defpackage.pk
    public final void skip(long j) {
        if (!this.g) {
            while (j > 0) {
                hk hkVar = this.f;
                if (hkVar.f == 0 && this.e.read(hkVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, hkVar.f);
                hkVar.skip(min);
                j -= min;
            }
            return;
        }
        se.p("closed");
    }

    @Override // defpackage.k12
    public final ea2 timeout() {
        return this.e.timeout();
    }

    public final String toString() {
        return "buffer(" + this.e + ')';
    }

    @Override // defpackage.pk
    public final void v(hk hkVar, long j) {
        hk hkVar2 = this.f;
        hkVar.getClass();
        try {
            K(j);
            hkVar2.v(hkVar, j);
        } catch (EOFException e) {
            hkVar.l(hkVar2);
            throw e;
        }
    }

    @Override // defpackage.pk
    public final String x(Charset charset) {
        charset.getClass();
        k12 k12Var = this.e;
        hk hkVar = this.f;
        hkVar.l(k12Var);
        return hkVar.D(hkVar.f, charset);
    }

    @Override // defpackage.pk
    public final bl z() {
        k12 k12Var = this.e;
        hk hkVar = this.f;
        hkVar.l(k12Var);
        return hkVar.e(hkVar.f);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        hk hkVar = this.f;
        if (hkVar.f == 0 && this.e.read(hkVar, 8192L) == -1) {
            return -1;
        }
        return hkVar.read(byteBuffer);
    }
}
