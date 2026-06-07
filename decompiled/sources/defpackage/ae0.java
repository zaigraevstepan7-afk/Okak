package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ae0 extends ea2 {
    public ea2 a;

    public ae0(ea2 ea2Var) {
        ea2Var.getClass();
        this.a = ea2Var;
    }

    @Override // defpackage.ea2
    public final void awaitSignal(Condition condition) {
        condition.getClass();
        this.a.awaitSignal(condition);
    }

    @Override // defpackage.ea2
    public final ea2 clearDeadline() {
        return this.a.clearDeadline();
    }

    @Override // defpackage.ea2
    public final ea2 clearTimeout() {
        return this.a.clearTimeout();
    }

    @Override // defpackage.ea2
    public final long deadlineNanoTime() {
        return this.a.deadlineNanoTime();
    }

    @Override // defpackage.ea2
    public final boolean hasDeadline() {
        return this.a.hasDeadline();
    }

    @Override // defpackage.ea2
    public final void throwIfReached() {
        this.a.throwIfReached();
    }

    @Override // defpackage.ea2
    public final ea2 timeout(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.a.timeout(j, timeUnit);
    }

    @Override // defpackage.ea2
    public final long timeoutNanos() {
        return this.a.timeoutNanos();
    }

    @Override // defpackage.ea2
    public final void waitUntilNotified(Object obj) {
        obj.getClass();
        this.a.waitUntilNotified(obj);
    }

    @Override // defpackage.ea2
    public final ea2 deadlineNanoTime(long j) {
        return this.a.deadlineNanoTime(j);
    }
}
