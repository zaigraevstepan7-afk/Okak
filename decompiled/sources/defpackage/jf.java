package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jf implements k12 {
    public final /* synthetic */ int e = 1;
    public final Object f;
    public final Object g;

    public jf(InputStream inputStream, ea2 ea2Var) {
        ea2Var.getClass();
        this.f = inputStream;
        this.g = ea2Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                kf kfVar = (kf) obj;
                k12 k12Var = (k12) this.g;
                kfVar.enter();
                try {
                    k12Var.close();
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
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // defpackage.k12
    public final long read(hk hkVar, long j) {
        int i = this.e;
        Object obj = this.f;
        Object obj2 = this.g;
        hkVar.getClass();
        switch (i) {
            case 0:
                kf kfVar = (kf) obj;
                k12 k12Var = (k12) obj2;
                kfVar.enter();
                try {
                    long read = k12Var.read(hkVar, j);
                    if (!kfVar.exit()) {
                        return read;
                    }
                    throw kfVar.access$newTimeoutException(null);
                } catch (IOException e) {
                    if (!kfVar.exit()) {
                        throw e;
                    }
                    throw kfVar.access$newTimeoutException(e);
                } finally {
                    kfVar.exit();
                }
            default:
                if (j == 0) {
                    return 0L;
                }
                if (j >= 0) {
                    try {
                        ((ea2) obj2).throwIfReached();
                        mt1 O = hkVar.O(1);
                        int read2 = ((InputStream) obj).read(O.a, O.c, (int) Math.min(j, 8192 - O.c));
                        if (read2 == -1) {
                            if (O.b == O.c) {
                                hkVar.e = O.a();
                                pt1.a(O);
                            }
                            return -1L;
                        }
                        O.c += read2;
                        long j2 = read2;
                        hkVar.f += j2;
                        return j2;
                    } catch (AssertionError e2) {
                        if (zj2.a(e2)) {
                            throw new IOException(e2);
                        }
                        throw e2;
                    }
                }
                se.e(l90.k("byteCount < 0: ", j));
                return 0L;
        }
    }

    @Override // defpackage.k12
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
                return "AsyncTimeout.source(" + ((k12) this.g) + ')';
            default:
                return "source(" + ((InputStream) this.f) + ')';
        }
    }

    public jf(kf kfVar, k12 k12Var) {
        this.f = kfVar;
        this.g = k12Var;
    }
}
