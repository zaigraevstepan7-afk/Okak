package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class qi extends v {
    public final Thread h;
    public final l70 i;

    public qi(xu xuVar, Thread thread, l70 l70Var) {
        super(xuVar, true);
        this.h = thread;
        this.i = l70Var;
    }

    @Override // defpackage.no0
    public final void m(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.h;
        if (!sn0.r(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
