package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.internal.ws.RealWebSocket;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class kf extends ea2 {
    private static final ff Companion = new Object();
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int STATE_CANCELED = 3;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_QUEUE = 1;
    private static final int STATE_TIMED_OUT = 2;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static kf idleSentinel;
    private static final ReentrantLock lock;
    private static final vi1 queue;
    public int index = -1;
    private int state;
    private long timeoutAt;

    /* JADX WARN: Type inference failed for: r0v0, types: [ff, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, vi1] */
    static {
        ?? obj = new Object();
        obj.b = new kf[8];
        queue = obj;
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        condition = newCondition;
        IDLE_TIMEOUT_MILLIS = RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
    }

    public static /* synthetic */ void setTimeoutAt$okio$default(kf kfVar, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                j = System.nanoTime();
            }
            kfVar.setTimeoutAt$okio(j);
            return;
        }
        se.v("Super calls with default arguments not supported in this target, function: setTimeoutAt");
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    @Override // defpackage.ea2
    public void cancel() {
        super.cancel();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 1) {
                queue.b(this);
                this.state = 3;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos == 0 && !hasDeadline) {
            return;
        }
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (this.state == 0) {
                this.state = 1;
                ff.a(Companion, this);
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean exit() {
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            int i = this.state;
            boolean z = false;
            this.state = 0;
            if (i == 1) {
                queue.b(this);
                return false;
            }
            if (i == 2) {
                z = true;
            }
            return z;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long getTimeoutAt$okio() {
        return this.timeoutAt;
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long remainingNanos$okio(long j) {
        return this.timeoutAt - j;
    }

    public final void setTimeoutAt$okio(long j) {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos() != 0 && hasDeadline()) {
            this.timeoutAt = Math.min(timeoutNanos, deadlineNanoTime() - j) + j;
        } else if (timeoutNanos != 0) {
            this.timeoutAt = j + timeoutNanos;
        } else {
            if (hasDeadline) {
                this.timeoutAt = deadlineNanoTime();
                return;
            }
            throw new AssertionError();
        }
    }

    public final ey1 sink(ey1 ey1Var) {
        ey1Var.getClass();
        return new hf(0, this, ey1Var);
    }

    public final k12 source(k12 k12Var) {
        k12Var.getClass();
        return new jf(this, k12Var);
    }

    public final <T> T withTimeout(de0 de0Var) {
        de0Var.getClass();
        enter();
        try {
            T t = (T) de0Var.invoke();
            if (!exit()) {
                return t;
            }
            throw access$newTimeoutException(null);
        } catch (IOException e) {
            if (!exit()) {
                throw e;
            }
            throw access$newTimeoutException(e);
        } finally {
            exit();
        }
    }

    public void timedOut() {
    }
}
