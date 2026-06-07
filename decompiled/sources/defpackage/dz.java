package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dz implements ey1 {
    public final OutputStream e;
    public final e12 f;
    public final /* synthetic */ q4 g;

    public dz(q4 q4Var) {
        this.g = q4Var;
        Socket socket = (Socket) q4Var.f;
        this.e = socket.getOutputStream();
        this.f = new e12(socket);
    }

    @Override // defpackage.ey1, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        int i;
        OutputStream outputStream = this.e;
        q4 q4Var = this.g;
        e12 e12Var = this.f;
        e12Var.enter();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) q4Var.g;
            Socket socket = (Socket) q4Var.f;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 1;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
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

    @Override // defpackage.ey1, java.io.Flushable
    public final void flush() {
        e12 e12Var = this.f;
        e12Var.enter();
        try {
            this.e.flush();
            if (!e12Var.exit()) {
            } else {
                throw e12Var.access$newTimeoutException(null);
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

    @Override // defpackage.ey1
    public final ea2 timeout() {
        return this.f;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.g.f) + ')';
    }

    @Override // defpackage.ey1
    public final void write(hk hkVar, long j) {
        hkVar.getClass();
        rx.q(hkVar.f, 0L, j);
        while (j > 0) {
            e12 e12Var = this.f;
            e12Var.throwIfReached();
            mt1 mt1Var = hkVar.e;
            mt1Var.getClass();
            int min = (int) Math.min(j, mt1Var.c - mt1Var.b);
            e12Var.enter();
            try {
                try {
                    this.e.write(mt1Var.a, mt1Var.b, min);
                    if (!e12Var.exit()) {
                        int i = mt1Var.b + min;
                        mt1Var.b = i;
                        long j2 = min;
                        j -= j2;
                        hkVar.f -= j2;
                        if (i == mt1Var.c) {
                            hkVar.e = mt1Var.a();
                            pt1.a(mt1Var);
                        }
                    } else {
                        throw e12Var.access$newTimeoutException(null);
                    }
                } catch (IOException e) {
                    if (!e12Var.exit()) {
                        throw e;
                    }
                    throw e12Var.access$newTimeoutException(e);
                }
            } catch (Throwable th) {
                e12Var.exit();
                throw th;
            }
        }
    }
}
