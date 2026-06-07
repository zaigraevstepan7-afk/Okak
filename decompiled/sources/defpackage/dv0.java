package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dv0 extends zu implements oz {
    public static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(dv0.class, "runningWorkers$volatile");
    public final /* synthetic */ oz g;
    public final zu h;
    public final int i;
    public final mx0 j;
    public final Object k;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public dv0(zu zuVar, int i) {
        oz ozVar;
        if (zuVar instanceof oz) {
            ozVar = (oz) zuVar;
        } else {
            ozVar = null;
        }
        this.g = ozVar == null ? fy.a : ozVar;
        this.h = zuVar;
        this.i = i;
        this.j = new mx0();
        this.k = new Object();
    }

    @Override // defpackage.oz
    public final q10 A(long j, ga2 ga2Var, xu xuVar) {
        return this.g.A(j, ga2Var, xuVar);
    }

    @Override // defpackage.oz
    public final void D(long j, pl plVar) {
        this.g.D(j, plVar);
    }

    @Override // defpackage.zu
    public final void P(xu xuVar, Runnable runnable) {
        int i;
        boolean z;
        Runnable S;
        this.j.a(runnable);
        if (l.get(this) < this.i) {
            synchronized (this.k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
                i = 1;
                if (atomicIntegerFieldUpdater.get(this) >= this.i) {
                    z = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z = true;
                }
            }
            if (z && (S = S()) != null) {
                this.h.P(this, new lg0(this, S, i));
            }
        }
    }

    public final Runnable S() {
        while (true) {
            Runnable runnable = (Runnable) this.j.d();
            if (runnable == null) {
                synchronized (this.k) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.j.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    @Override // defpackage.zu
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h);
        sb.append(".limitedParallelism(");
        return l90.o(sb, this.i, ')');
    }
}
