package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ca2 extends ea2 {
    @Override // defpackage.ea2
    public final ea2 timeout(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this;
    }

    @Override // defpackage.ea2
    public final void throwIfReached() {
    }

    @Override // defpackage.ea2
    public final ea2 deadlineNanoTime(long j) {
        return this;
    }
}
