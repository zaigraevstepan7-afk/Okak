package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gg0 implements k12 {
    public byte e;
    public final bl1 f;
    public final Inflater g;
    public final wk0 h;
    public final CRC32 i;

    public gg0(pk pkVar) {
        pkVar.getClass();
        bl1 bl1Var = new bl1(pkVar);
        this.f = bl1Var;
        Inflater inflater = new Inflater(true);
        this.g = inflater;
        this.h = new wk0(bl1Var, inflater);
        this.i = new CRC32();
    }

    public static void b(int i, int i2, String str) {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + i32.S(8, rx.P(i2)) + " != expected 0x" + i32.S(8, rx.P(i)));
    }

    public final void c(long j, hk hkVar, long j2) {
        mt1 mt1Var = hkVar.e;
        mt1Var.getClass();
        while (true) {
            int i = mt1Var.c;
            int i2 = mt1Var.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            mt1Var = mt1Var.f;
            mt1Var.getClass();
        }
        while (j2 > 0) {
            int min = (int) Math.min(mt1Var.c - r5, j2);
            this.i.update(mt1Var.a, (int) (mt1Var.b + j), min);
            j2 -= min;
            mt1Var = mt1Var.f;
            mt1Var.getClass();
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h.close();
    }

    @Override // defpackage.k12
    public final long read(hk hkVar, long j) {
        boolean z;
        gg0 gg0Var = this;
        hkVar.getClass();
        if (j >= 0) {
            if (j == 0) {
                return 0L;
            }
            byte b = gg0Var.e;
            CRC32 crc32 = gg0Var.i;
            bl1 bl1Var = gg0Var.f;
            if (b == 0) {
                bl1Var.K(10L);
                hk hkVar2 = bl1Var.f;
                byte k = hkVar2.k(3L);
                if (((k >> 1) & 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    gg0Var.c(0L, hkVar2, 10L);
                }
                b(8075, bl1Var.readShort(), "ID1ID2");
                bl1Var.skip(8L);
                if (((k >> 2) & 1) == 1) {
                    bl1Var.K(2L);
                    if (z) {
                        c(0L, hkVar2, 2L);
                    }
                    long A = hkVar2.A() & 65535;
                    bl1Var.K(A);
                    if (z) {
                        c(0L, hkVar2, A);
                    }
                    bl1Var.skip(A);
                }
                if (((k >> 3) & 1) == 1) {
                    long b2 = bl1Var.b((byte) 0, 0L, Long.MAX_VALUE);
                    if (b2 != -1) {
                        if (z) {
                            c(0L, hkVar2, b2 + 1);
                        }
                        bl1Var.skip(b2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((k >> 4) & 1) == 1) {
                    long b3 = bl1Var.b((byte) 0, 0L, Long.MAX_VALUE);
                    if (b3 != -1) {
                        if (z) {
                            gg0Var = this;
                            gg0Var.c(0L, hkVar2, b3 + 1);
                        } else {
                            gg0Var = this;
                        }
                        bl1Var.skip(b3 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    gg0Var = this;
                }
                if (z) {
                    b(bl1Var.i(), (short) crc32.getValue(), "FHCRC");
                    crc32.reset();
                }
                gg0Var.e = (byte) 1;
            }
            if (gg0Var.e == 1) {
                long j2 = hkVar.f;
                long read = gg0Var.h.read(hkVar, j);
                if (read != -1) {
                    gg0Var.c(j2, hkVar, read);
                    return read;
                }
                gg0Var.e = (byte) 2;
            }
            if (gg0Var.e == 2) {
                b(bl1Var.c(), (int) crc32.getValue(), "CRC");
                b(bl1Var.c(), (int) gg0Var.g.getBytesWritten(), "ISIZE");
                gg0Var.e = (byte) 3;
                if (!bl1Var.j()) {
                    se.w("gzip finished without exhausting source");
                    return 0L;
                }
            }
            return -1L;
        }
        se.e(l90.k("byteCount < 0: ", j));
        return 0L;
    }

    @Override // defpackage.k12
    public final ea2 timeout() {
        return this.f.e.timeout();
    }
}
