package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ey extends q70 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final ey n;
    public static final long o;

    /* JADX WARN: Type inference failed for: r0v0, types: [ey, l70, q70] */
    static {
        Long l;
        ?? q70Var = new q70();
        n = q70Var;
        q70Var.U(false);
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        o = TimeUnit.MILLISECONDS.toNanos(l.longValue());
    }

    @Override // defpackage.q70, defpackage.oz
    public final q10 A(long j, ga2 ga2Var, xu xuVar) {
        long j2 = 0;
        if (j > 0) {
            if (j >= 9223372036854L) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = 1000000 * j;
            }
        }
        if (j2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            n70 n70Var = new n70(j2 + nanoTime, ga2Var);
            d0(nanoTime, n70Var);
            return n70Var;
        }
        return l81.e;
    }

    @Override // defpackage.q70
    public final void X(Runnable runnable) {
        if (debugStatus != 4) {
            super.X(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.q70
    public final Thread a0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(n.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }

    @Override // defpackage.q70
    public final void c0(long j, o70 o70Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void e0() {
        boolean z;
        int i = debugStatus;
        if (i != 2 && i != 3) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return;
        }
        debugStatus = 3;
        q70.k.set(this, null);
        q70.l.set(this, null);
        notifyAll();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean b0;
        r92.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i != 2 && i != 3) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (!b0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long V = V();
                    if (V == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = o + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            e0();
                            if (!b0()) {
                                a0();
                                return;
                            }
                            return;
                        }
                        if (V > j2) {
                            V = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (V > 0) {
                        int i2 = debugStatus;
                        if (i2 != 2 && i2 != 3) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            _thread = null;
                            e0();
                            if (!b0()) {
                                a0();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, V);
                    }
                }
            }
        } finally {
            _thread = null;
            e0();
            if (!b0()) {
                a0();
            }
        }
    }

    @Override // defpackage.q70, defpackage.l70
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.zu
    public final String toString() {
        return "DefaultExecutor";
    }
}
