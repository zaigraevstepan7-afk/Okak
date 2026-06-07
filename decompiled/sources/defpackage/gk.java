package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gk extends InputStream {
    public final /* synthetic */ int e;
    public final /* synthetic */ pk f;

    public /* synthetic */ gk(pk pkVar, int i) {
        this.e = i;
        this.f = pkVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        int i = this.e;
        pk pkVar = this.f;
        switch (i) {
            case 0:
                return (int) Math.min(((hk) pkVar).f, 2147483647L);
            default:
                bl1 bl1Var = (bl1) pkVar;
                if (!bl1Var.g) {
                    return (int) Math.min(bl1Var.f.f, 2147483647L);
                }
                se.w("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.e) {
            case 0:
                return;
            default:
                ((bl1) this.f).close();
                return;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.e;
        pk pkVar = this.f;
        switch (i) {
            case 0:
                hk hkVar = (hk) pkVar;
                if (hkVar.f <= 0) {
                    return -1;
                }
                return hkVar.readByte() & 255;
            default:
                bl1 bl1Var = (bl1) pkVar;
                hk hkVar2 = bl1Var.f;
                if (!bl1Var.g) {
                    if (hkVar2.f == 0 && bl1Var.e.read(hkVar2, 8192L) == -1) {
                        return -1;
                    }
                    return hkVar2.readByte() & 255;
                }
                se.w("closed");
                return 0;
        }
    }

    public final String toString() {
        int i = this.e;
        pk pkVar = this.f;
        switch (i) {
            case 0:
                return ((hk) pkVar) + ".inputStream()";
            default:
                return ((bl1) pkVar) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) {
        switch (this.e) {
            case 1:
                outputStream.getClass();
                bl1 bl1Var = (bl1) this.f;
                hk hkVar = bl1Var.f;
                if (!bl1Var.g) {
                    long j = 0;
                    while (true) {
                        if (hkVar.f == 0 && bl1Var.e.read(hkVar, 8192L) == -1) {
                            return j;
                        }
                        long j2 = hkVar.f;
                        j += j2;
                        rx.q(j2, 0L, j2);
                        mt1 mt1Var = hkVar.e;
                        while (j2 > 0) {
                            mt1Var.getClass();
                            int min = (int) Math.min(j2, mt1Var.c - mt1Var.b);
                            outputStream.write(mt1Var.a, mt1Var.b, min);
                            int i = mt1Var.b + min;
                            mt1Var.b = i;
                            long j3 = min;
                            hkVar.f -= j3;
                            j2 -= j3;
                            if (i == mt1Var.c) {
                                mt1 a = mt1Var.a();
                                hkVar.e = a;
                                pt1.a(mt1Var);
                                mt1Var = a;
                            }
                        }
                    }
                } else {
                    se.w("closed");
                    return 0L;
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    private final void b() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        pk pkVar = this.f;
        bArr.getClass();
        switch (i3) {
            case 0:
                return ((hk) pkVar).read(bArr, i, i2);
            default:
                bl1 bl1Var = (bl1) pkVar;
                hk hkVar = bl1Var.f;
                if (!bl1Var.g) {
                    rx.q(bArr.length, i, i2);
                    if (hkVar.f == 0 && bl1Var.e.read(hkVar, 8192L) == -1) {
                        return -1;
                    }
                    return hkVar.read(bArr, i, i2);
                }
                se.w("closed");
                return 0;
        }
    }
}
