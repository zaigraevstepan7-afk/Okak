package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ez implements k12 {
    public final InputStream e;
    public final e12 f;
    public final /* synthetic */ q4 g;

    public ez(q4 q4Var) {
        this.g = q4Var;
        Socket socket = (Socket) q4Var.f;
        this.e = socket.getInputStream();
        this.f = new e12(socket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        q4 q4Var = this.g;
        e12 e12Var = this.f;
        e12Var.enter();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) q4Var.g;
            Socket socket = (Socket) q4Var.f;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 2;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isInputShutdown()) {
                        try {
                            socket.shutdownInput();
                        } catch (UnsupportedOperationException unused) {
                            this.e.close();
                        }
                    } else {
                        return;
                    }
                } else {
                    socket.close();
                }
                if (!e12Var.exit()) {
                } else {
                    throw e12Var.access$newTimeoutException(null);
                }
            }
        } catch (IOException e) {
            if (!e12Var.exit()) {
                throw e;
            }
            throw e12Var.access$newTimeoutException(e);
        } finally {
            e12Var.exit();
        }
    }

    @Override // defpackage.k12
    public final long read(hk hkVar, long j) {
        hkVar.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j >= 0) {
            e12 e12Var = this.f;
            e12Var.throwIfReached();
            mt1 O = hkVar.O(1);
            int min = (int) Math.min(j, 8192 - O.c);
            try {
                e12Var.enter();
                try {
                    int read = this.e.read(O.a, O.c, min);
                    if (!e12Var.exit()) {
                        if (read == -1) {
                            if (O.b == O.c) {
                                hkVar.e = O.a();
                                pt1.a(O);
                                return -1L;
                            }
                            return -1L;
                        }
                        O.c += read;
                        long j2 = read;
                        hkVar.f += j2;
                        return j2;
                    }
                    throw e12Var.access$newTimeoutException(null);
                } catch (IOException e) {
                    if (!e12Var.exit()) {
                        throw e;
                    }
                    throw e12Var.access$newTimeoutException(e);
                } finally {
                    e12Var.exit();
                }
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

    @Override // defpackage.k12
    public final ea2 timeout() {
        return this.f;
    }

    public final String toString() {
        return "source(" + ((Socket) this.g.f) + ')';
    }
}
