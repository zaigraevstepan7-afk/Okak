package defpackage;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class i90 implements Closeable {
    public final boolean e;
    public boolean f;
    public int g;
    public final ReentrantLock h = new ReentrantLock();

    public i90(boolean z) {
        this.e = z;
    }

    public static g90 o(i90 i90Var) {
        if (i90Var.e) {
            ReentrantLock reentrantLock = i90Var.h;
            reentrantLock.lock();
            try {
                if (!i90Var.f) {
                    i90Var.g++;
                    reentrantLock.unlock();
                    return new g90(i90Var);
                }
                throw new IllegalStateException("closed");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        se.p("file handle is read-only");
        return null;
    }

    public abstract void b();

    public abstract void c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (this.f) {
                return;
            }
            this.f = true;
            if (this.g != 0) {
                return;
            }
            reentrantLock.unlock();
            b();
        } finally {
            reentrantLock.unlock();
        }
    }

    public abstract int g(byte[] bArr, int i, long j, int i2);

    public abstract long i();

    public abstract void k(byte[] bArr, int i, long j, int i2);

    public final h90 p(long j) {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (!this.f) {
                this.g++;
                reentrantLock.unlock();
                return new h90(this, j);
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (!this.f) {
                reentrantLock.unlock();
                return i();
            }
            throw new IllegalStateException("closed");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
