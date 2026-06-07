package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hf implements ey1 {
    public final /* synthetic */ int e;
    public final Object f;
    public final Object g;

    public /* synthetic */ hf(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.ey1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                kf kfVar = (kf) obj;
                ey1 ey1Var = (ey1) this.g;
                kfVar.enter();
                try {
                    ey1Var.close();
                    if (!kfVar.exit()) {
                        return;
                    } else {
                        throw kfVar.access$newTimeoutException(null);
                    }
                } catch (IOException e) {
                    if (!kfVar.exit()) {
                        throw e;
                    }
                    throw kfVar.access$newTimeoutException(e);
                } finally {
                    kfVar.exit();
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.ey1, java.io.Flushable
    public final void flush() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                kf kfVar = (kf) obj;
                ey1 ey1Var = (ey1) this.g;
                kfVar.enter();
                try {
                    ey1Var.flush();
                    if (!kfVar.exit()) {
                        return;
                    } else {
                        throw kfVar.access$newTimeoutException(null);
                    }
                } catch (IOException e) {
                    if (!kfVar.exit()) {
                        throw e;
                    }
                    throw kfVar.access$newTimeoutException(e);
                } finally {
                    kfVar.exit();
                }
            default:
                ((OutputStream) obj).flush();
                return;
        }
    }

    @Override // defpackage.ey1
    public final ea2 timeout() {
        switch (this.e) {
            case 0:
                return (kf) this.f;
            default:
                return (ea2) this.g;
        }
    }

    public final String toString() {
        switch (this.e) {
            case 0:
                return "AsyncTimeout.sink(" + ((ey1) this.g) + ')';
            default:
                return "sink(" + ((OutputStream) this.f) + ')';
        }
    }

    @Override // defpackage.ey1
    public final void write(hk hkVar, long j) {
        long j2;
        int i = this.e;
        Object obj = this.f;
        Object obj2 = this.g;
        hkVar.getClass();
        switch (i) {
            case 0:
                rx.q(hkVar.f, 0L, j);
                for (long j3 = j; j3 > 0; j3 -= j2) {
                    mt1 mt1Var = hkVar.e;
                    mt1Var.getClass();
                    j2 = 0;
                    while (true) {
                        if (j2 < 65536) {
                            j2 += mt1Var.c - mt1Var.b;
                            if (j2 >= j3) {
                                j2 = j3;
                            } else {
                                mt1Var = mt1Var.f;
                                mt1Var.getClass();
                            }
                        }
                    }
                    kf kfVar = (kf) obj;
                    ey1 ey1Var = (ey1) obj2;
                    kfVar.enter();
                    try {
                        ey1Var.write(hkVar, j2);
                        if (kfVar.exit()) {
                            throw kfVar.access$newTimeoutException(null);
                        }
                    } catch (IOException e) {
                        if (!kfVar.exit()) {
                            throw e;
                        }
                        throw kfVar.access$newTimeoutException(e);
                    } finally {
                        kfVar.exit();
                    }
                }
                return;
            default:
                rx.q(hkVar.f, 0L, j);
                long j4 = j;
                while (j4 > 0) {
                    ((ea2) obj2).throwIfReached();
                    mt1 mt1Var2 = hkVar.e;
                    mt1Var2.getClass();
                    int min = (int) Math.min(j4, mt1Var2.c - mt1Var2.b);
                    ((OutputStream) obj).write(mt1Var2.a, mt1Var2.b, min);
                    int i2 = mt1Var2.b + min;
                    mt1Var2.b = i2;
                    long j5 = min;
                    j4 -= j5;
                    hkVar.f -= j5;
                    if (i2 == mt1Var2.c) {
                        hkVar.e = mt1Var2.a();
                        pt1.a(mt1Var2);
                    }
                }
                return;
        }
    }
}
