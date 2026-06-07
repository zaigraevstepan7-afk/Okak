package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class ea2 {
    public static final da2 Companion = new Object();
    public static final ea2 NONE = new Object();
    private volatile Object cancelMark;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public void awaitSignal(Condition condition) {
        condition.getClass();
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            if (!hasDeadline && timeoutNanos == 0) {
                condition.await();
                return;
            }
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - System.nanoTime());
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - System.nanoTime();
            }
            if (timeoutNanos > 0) {
                Object obj = this.cancelMark;
                if (condition.awaitNanos(timeoutNanos) > 0 || this.cancelMark != obj) {
                    return;
                } else {
                    throw new InterruptedIOException("timeout");
                }
            }
            throw new InterruptedIOException("timeout");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public void cancel() {
        this.cancelMark = new Object();
    }

    public ea2 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public ea2 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final ea2 deadline(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j > 0) {
            return deadlineNanoTime(timeUnit.toNanos(j) + System.nanoTime());
        }
        se.e(l90.k("duration <= 0: ", j));
        return null;
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        se.p("No deadline");
        return 0L;
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(ea2 ea2Var, de0 de0Var) {
        ea2Var.getClass();
        de0Var.getClass();
        long timeoutNanos = timeoutNanos();
        da2 da2Var = Companion;
        long timeoutNanos2 = ea2Var.timeoutNanos();
        long timeoutNanos3 = timeoutNanos();
        da2Var.getClass();
        if (timeoutNanos2 == 0 || (timeoutNanos3 != 0 && timeoutNanos2 >= timeoutNanos3)) {
            timeoutNanos2 = timeoutNanos3;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(timeoutNanos2, timeUnit);
        if (hasDeadline()) {
            long deadlineNanoTime = deadlineNanoTime();
            if (ea2Var.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), ea2Var.deadlineNanoTime()));
            }
            try {
                return (T) de0Var.invoke();
            } finally {
                timeout(timeoutNanos, timeUnit);
                if (ea2Var.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
            }
        }
        if (ea2Var.hasDeadline()) {
            deadlineNanoTime(ea2Var.deadlineNanoTime());
        }
        try {
            return (T) de0Var.invoke();
        } finally {
            timeout(timeoutNanos, timeUnit);
            if (ea2Var.hasDeadline()) {
                clearDeadline();
            }
        }
    }

    public void throwIfReached() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public ea2 timeout(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j >= 0) {
            this.timeoutNanos = timeUnit.toNanos(j);
            return this;
        }
        se.e(l90.k("timeout < 0: ", j));
        return null;
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public void waitUntilNotified(Object obj) {
        obj.getClass();
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            if (!hasDeadline && timeoutNanos == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                Object obj2 = this.cancelMark;
                long j = timeoutNanos / 1000000;
                obj.wait(j, (int) (timeoutNanos - (1000000 * j)));
                if (System.nanoTime() - nanoTime < timeoutNanos || this.cancelMark != obj2) {
                    return;
                } else {
                    throw new InterruptedIOException("timeout");
                }
            }
            throw new InterruptedIOException("timeout");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public ea2 deadlineNanoTime(long j) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j;
        return this;
    }
}
