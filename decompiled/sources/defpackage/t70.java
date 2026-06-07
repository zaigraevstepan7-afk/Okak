package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class t70 extends s70 implements oz {
    public final ExecutorService g;

    public t70(ExecutorService executorService) {
        this.g = executorService;
        if (executorService instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executorService).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // defpackage.oz
    public final q10 A(long j, ga2 ga2Var, xu xuVar) {
        ScheduledExecutorService scheduledExecutorService;
        ExecutorService executorService = this.g;
        ScheduledFuture<?> scheduledFuture = null;
        if (executorService instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executorService;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(ga2Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                lo.o(xuVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            return new p10(scheduledFuture);
        }
        return ey.n.A(j, ga2Var, xuVar);
    }

    @Override // defpackage.oz
    public final void D(long j, pl plVar) {
        ScheduledExecutorService scheduledExecutorService;
        ExecutorService executorService = this.g;
        ScheduledFuture<?> scheduledFuture = null;
        if (executorService instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executorService;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            lg0 lg0Var = new lg0(this, plVar, 2);
            xu xuVar = plVar.i;
            try {
                scheduledFuture = scheduledExecutorService.schedule(lg0Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                lo.o(xuVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            plVar.u(new kl(scheduledFuture, 0));
        } else {
            ey.n.D(j, plVar);
        }
    }

    @Override // defpackage.zu
    public final void P(xu xuVar, Runnable runnable) {
        try {
            this.g.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            lo.o(xuVar, cancellationException);
            vy vyVar = k10.a;
            ny.g.P(xuVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService = this.g;
        if (executorService == null) {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof t70) && ((t70) obj).g == this.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.g);
    }

    @Override // defpackage.zu
    public final String toString() {
        return this.g.toString();
    }
}
