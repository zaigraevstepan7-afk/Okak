package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class h90 implements k12 {
    public final i90 e;
    public long f;
    public boolean g;

    public h90(i90 i90Var, long j) {
        this.e = i90Var;
        this.f = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g) {
            return;
        }
        this.g = true;
        i90 i90Var = this.e;
        ReentrantLock reentrantLock = i90Var.h;
        reentrantLock.lock();
        try {
            int i = i90Var.g - 1;
            i90Var.g = i;
            if (i == 0) {
                if (i90Var.f) {
                    reentrantLock.unlock();
                    i90Var.b();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.k12
    public final long read(hk hkVar, long j) {
        long j2;
        long j3;
        hkVar.getClass();
        if (!this.g) {
            long j4 = this.f;
            if (j >= 0) {
                long j5 = j + j4;
                long j6 = j4;
                while (true) {
                    if (j6 < j5) {
                        mt1 O = hkVar.O(1);
                        j2 = -1;
                        int g = this.e.g(O.a, O.c, j6, (int) Math.min(j5 - j6, 8192 - r11));
                        if (g == -1) {
                            if (O.b == O.c) {
                                hkVar.e = O.a();
                                pt1.a(O);
                            }
                            if (j4 == j6) {
                                j3 = -1;
                            }
                        } else {
                            O.c += g;
                            long j7 = g;
                            j6 += j7;
                            hkVar.f += j7;
                        }
                    } else {
                        j2 = -1;
                        break;
                    }
                }
                j3 = j6 - j4;
                if (j3 != j2) {
                    this.f += j3;
                }
                return j3;
            }
            se.e(l90.k("byteCount < 0: ", j));
            return 0L;
        }
        se.p("closed");
        return 0L;
    }

    @Override // defpackage.k12
    public final ea2 timeout() {
        return ea2.NONE;
    }
}
