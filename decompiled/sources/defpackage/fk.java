package defpackage;

import java.io.Closeable;
import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fk implements Closeable {
    public hk e;
    public boolean f;
    public mt1 g;
    public byte[] i;
    public long h = -1;
    public int j = -1;
    public int k = -1;

    public final void b(long j) {
        hk hkVar = this.e;
        if (hkVar != null) {
            if (this.f) {
                long j2 = hkVar.f;
                if (j <= j2) {
                    if (j >= 0) {
                        long j3 = j2 - j;
                        while (true) {
                            if (j3 <= 0) {
                                break;
                            }
                            mt1 mt1Var = hkVar.e;
                            mt1Var.getClass();
                            mt1 mt1Var2 = mt1Var.g;
                            mt1Var2.getClass();
                            int i = mt1Var2.c;
                            long j4 = i - mt1Var2.b;
                            if (j4 <= j3) {
                                hkVar.e = mt1Var2.a();
                                pt1.a(mt1Var2);
                                j3 -= j4;
                            } else {
                                mt1Var2.c = i - ((int) j3);
                                break;
                            }
                        }
                        this.g = null;
                        this.h = j;
                        this.i = null;
                        this.j = -1;
                        this.k = -1;
                    } else {
                        se.e(l90.k("newSize < 0: ", j));
                        return;
                    }
                } else if (j > j2) {
                    long j5 = j - j2;
                    int i2 = 1;
                    boolean z = true;
                    for (long j6 = 0; j5 > j6; j6 = 0) {
                        mt1 O = hkVar.O(i2);
                        int min = (int) Math.min(j5, 8192 - O.c);
                        int i3 = O.c + min;
                        O.c = i3;
                        j5 -= min;
                        if (z) {
                            this.g = O;
                            this.h = j2;
                            this.i = O.a;
                            this.j = i3 - min;
                            this.k = i3;
                            z = false;
                        }
                        i2 = 1;
                    }
                }
                hkVar.f = j;
                return;
            }
            se.p("resizeBuffer() only permitted for read/write buffers");
            return;
        }
        se.p("not attached to a buffer");
    }

    public final int c(long j) {
        hk hkVar = this.e;
        if (hkVar != null) {
            if (j >= -1) {
                long j2 = hkVar.f;
                if (j <= j2) {
                    if (j != -1 && j != j2) {
                        mt1 mt1Var = hkVar.e;
                        mt1 mt1Var2 = this.g;
                        long j3 = 0;
                        if (mt1Var2 != null) {
                            long j4 = this.h - (this.j - mt1Var2.b);
                            if (j4 > j) {
                                mt1Var2 = mt1Var;
                                mt1Var = mt1Var2;
                                j2 = j4;
                            } else {
                                j3 = j4;
                            }
                        } else {
                            mt1Var2 = mt1Var;
                        }
                        if (j2 - j > j - j3) {
                            while (true) {
                                mt1Var2.getClass();
                                long j5 = (mt1Var2.c - mt1Var2.b) + j3;
                                if (j < j5) {
                                    break;
                                }
                                mt1Var2 = mt1Var2.f;
                                j3 = j5;
                            }
                        } else {
                            while (j2 > j) {
                                mt1Var.getClass();
                                mt1Var = mt1Var.g;
                                mt1Var.getClass();
                                j2 -= mt1Var.c - mt1Var.b;
                            }
                            mt1Var2 = mt1Var;
                            j3 = j2;
                        }
                        if (this.f) {
                            mt1Var2.getClass();
                            if (mt1Var2.d) {
                                byte[] bArr = mt1Var2.a;
                                mt1 mt1Var3 = new mt1(Arrays.copyOf(bArr, bArr.length), mt1Var2.b, mt1Var2.c, false, true);
                                if (hkVar.e == mt1Var2) {
                                    hkVar.e = mt1Var3;
                                }
                                mt1Var2.b(mt1Var3);
                                mt1 mt1Var4 = mt1Var3.g;
                                mt1Var4.getClass();
                                mt1Var4.a();
                                mt1Var2 = mt1Var3;
                            }
                        }
                        this.g = mt1Var2;
                        this.h = j;
                        mt1Var2.getClass();
                        this.i = mt1Var2.a;
                        int i = mt1Var2.b + ((int) (j - j3));
                        this.j = i;
                        int i2 = mt1Var2.c;
                        this.k = i2;
                        return i2 - i;
                    }
                    this.g = null;
                    this.h = j;
                    this.i = null;
                    this.j = -1;
                    this.k = -1;
                    return -1;
                }
            }
            throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + hkVar.f);
        }
        se.p("not attached to a buffer");
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e != null) {
            this.e = null;
            this.g = null;
            this.h = -1L;
            this.i = null;
            this.j = -1;
            this.k = -1;
            return;
        }
        se.p("not attached to a buffer");
    }
}
