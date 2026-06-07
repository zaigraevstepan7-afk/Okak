package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class g90 implements ey1 {
    public final i90 e;
    public long f;
    public boolean g;

    public g90(i90 i90Var) {
        i90Var.getClass();
        this.e = i90Var;
        this.f = 0L;
    }

    @Override // defpackage.ey1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
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

    @Override // defpackage.ey1, java.io.Flushable
    public final void flush() {
        if (!this.g) {
            this.e.c();
        } else {
            se.p("closed");
        }
    }

    @Override // defpackage.ey1
    public final ea2 timeout() {
        return ea2.NONE;
    }

    @Override // defpackage.ey1
    public final void write(hk hkVar, long j) {
        hkVar.getClass();
        if (!this.g) {
            long j2 = this.f;
            i90 i90Var = this.e;
            i90Var.getClass();
            rx.q(hkVar.f, 0L, j);
            long j3 = j2 + j;
            long j4 = j2;
            while (j4 < j3) {
                mt1 mt1Var = hkVar.e;
                mt1Var.getClass();
                int min = (int) Math.min(j3 - j4, mt1Var.c - mt1Var.b);
                i90Var.k(mt1Var.a, mt1Var.b, j4, min);
                int i = mt1Var.b + min;
                mt1Var.b = i;
                long j5 = min;
                j4 += j5;
                hkVar.f -= j5;
                if (i == mt1Var.c) {
                    hkVar.e = mt1Var.a();
                    pt1.a(mt1Var);
                }
            }
            this.f += j;
            return;
        }
        se.p("closed");
    }
}
