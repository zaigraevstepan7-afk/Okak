package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fv implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(fv.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater m = AtomicLongFieldUpdater.newUpdater(fv.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(fv.class, "_isTerminated$volatile");
    public static final ad0 o = new ad0("NOT_IN_STACK", 5);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int e;
    public final int f;
    public final long g;
    public final String h;
    public final lf0 i;
    public final lf0 j;
    public final sm1 k;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX WARN: Type inference failed for: r4v3, types: [mx0, lf0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [mx0, lf0] */
    public fv(int i, int i2, long j, String str) {
        this.e = i;
        this.f = i2;
        this.g = j;
        this.h = str;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j > 0) {
                        this.i = new mx0();
                        this.j = new mx0();
                        this.k = new sm1((i + 1) * 2);
                        this.controlState$volatile = i << 42;
                        this._isTerminated$volatile = 0;
                        return;
                    }
                    y61.m("Idle worker keep alive time ", j, " must be positive");
                    throw null;
                }
                se.e(l90.i("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150"));
                throw null;
            }
            se.e(l90.j("Max pool size ", i2, " should be greater than or equals to core pool size ", i));
            throw null;
        }
        se.e(l90.i("Core pool size ", i, " should be at least 1"));
        throw null;
    }

    public static /* synthetic */ void g(fv fvVar, Runnable runnable, int i) {
        boolean z;
        if ((i & 4) != 0) {
            z = false;
        } else {
            z = true;
        }
        fvVar.c(runnable, false, z);
    }

    public final int b() {
        boolean z;
        synchronized (this.k) {
            try {
                if (n.get(this) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = m;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.e) {
                    return 0;
                }
                if (i >= this.f) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 > 0 && this.k.b(i3) == null) {
                    dv dvVar = new dv(this, i3);
                    this.k.c(i3, dvVar);
                    if (i3 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i4 = i2 + 1;
                        dvVar.start();
                        return i4;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, boolean z, boolean z2) {
        y52 z52Var;
        long j;
        dv dvVar;
        boolean a;
        ev evVar;
        a62.f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof y52) {
            z52Var = (y52) runnable;
            z52Var.e = nanoTime;
            z52Var.f = z;
        } else {
            z52Var = new z52(runnable, nanoTime, z);
        }
        boolean z3 = z52Var.f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = m;
        if (z3) {
            j = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof dv) {
            dvVar = (dv) currentThread;
        } else {
            dvVar = null;
        }
        if (dvVar == null || dvVar.l != this) {
            dvVar = null;
        }
        boolean z4 = true;
        if (dvVar != null && (evVar = dvVar.g) != ev.i && (z52Var.f || evVar != ev.f)) {
            dvVar.k = true;
            lj2 lj2Var = dvVar.e;
            if (z2) {
                z52Var = lj2Var.a(z52Var);
            } else {
                lj2Var.getClass();
                y52 y52Var = (y52) lj2.b.getAndSet(lj2Var, z52Var);
                if (y52Var == null) {
                    z52Var = null;
                } else {
                    z52Var = lj2Var.a(y52Var);
                }
            }
        }
        if (z52Var != null) {
            if (z52Var.f) {
                a = this.j.a(z52Var);
            } else {
                a = this.i.a(z52Var);
            }
            if (!a) {
                throw new RejectedExecutionException(l90.p(new StringBuilder(), this.h, " was terminated"));
            }
        }
        if (!z2 || dvVar == null) {
            z4 = false;
        }
        if (z3) {
            if (!z4 && !o() && !k(j)) {
                o();
                return;
            }
            return;
        }
        if (z4 || o() || k(atomicLongFieldUpdater.get(this))) {
            return;
        }
        o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r1 == null) goto L38;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.fv.n
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.dv
            r3 = 0
            if (r1 == 0) goto L17
            dv r0 = (defpackage.dv) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L1e
            fv r1 = r0.l
            if (r1 == r8) goto L1f
        L1e:
            r0 = r3
        L1f:
            sm1 r1 = r8.k
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = defpackage.fv.m     // Catch: java.lang.Throwable -> Lbe
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lbe
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L73
            r1 = r2
        L31:
            sm1 r5 = r8.k
            java.lang.Object r5 = r5.b(r1)
            r5.getClass()
            dv r5 = (defpackage.dv) r5
            if (r5 == r0) goto L6e
        L3e:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L4f
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L3e
        L4f:
            lj2 r5 = r5.e
            lf0 r6 = r8.j
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.lj2.b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            y52 r7 = (defpackage.y52) r7
            if (r7 == 0) goto L63
            r6.a(r7)
        L63:
            y52 r7 = r5.b()
            if (r7 != 0) goto L6a
            goto L6e
        L6a:
            r6.a(r7)
            goto L63
        L6e:
            if (r1 == r4) goto L73
            int r1 = r1 + 1
            goto L31
        L73:
            lf0 r1 = r8.j
            r1.b()
            lf0 r1 = r8.i
            r1.b()
        L7d:
            if (r0 == 0) goto L85
            y52 r1 = r0.a(r2)
            if (r1 != 0) goto Lad
        L85:
            lf0 r1 = r8.i
            java.lang.Object r1 = r1.d()
            y52 r1 = (defpackage.y52) r1
            if (r1 != 0) goto Lad
            lf0 r1 = r8.j
            java.lang.Object r1 = r1.d()
            y52 r1 = (defpackage.y52) r1
            if (r1 != 0) goto Lad
            if (r0 == 0) goto La0
            ev r1 = defpackage.ev.i
            r0.h(r1)
        La0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.fv.l
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.fv.m
            r0.set(r8, r1)
            return
        Lad:
            r1.run()     // Catch: java.lang.Throwable -> Lb1
            goto L7d
        Lb1:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L7d
        Lbe:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g(this, runnable, 6);
    }

    public final void i(dv dvVar, int i, int i2) {
        while (true) {
            long j = l.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object c = dvVar.c();
                    while (true) {
                        if (c == o) {
                            i3 = -1;
                            break;
                        }
                        if (c == null) {
                            i3 = 0;
                            break;
                        }
                        dv dvVar2 = (dv) c;
                        int b = dvVar2.b();
                        if (b != 0) {
                            i3 = b;
                            break;
                        }
                        c = dvVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                fv fvVar = this;
                if (l.compareAndSet(fvVar, j, i3 | j2)) {
                    return;
                } else {
                    this = fvVar;
                }
            }
        }
    }

    public final boolean k(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.e;
        if (i < i2) {
            int b = b();
            if (b == 1 && i2 > 1) {
                b();
            }
            if (b > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        fv fvVar;
        ad0 ad0Var;
        int i;
        while (true) {
            long j = l.get(this);
            dv dvVar = (dv) this.k.b((int) (2097151 & j));
            if (dvVar == null) {
                dvVar = null;
                fvVar = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object c = dvVar.c();
                while (true) {
                    ad0Var = o;
                    if (c == ad0Var) {
                        i = -1;
                        break;
                    }
                    if (c == null) {
                        i = 0;
                        break;
                    }
                    dv dvVar2 = (dv) c;
                    i = dvVar2.b();
                    if (i != 0) {
                        break;
                    }
                    c = dvVar2.c();
                    j = j;
                }
                if (i >= 0) {
                    fv fvVar2 = this;
                    boolean compareAndSet = l.compareAndSet(fvVar2, j, i | j2);
                    fvVar = fvVar2;
                    if (compareAndSet) {
                        dvVar.g(ad0Var);
                    }
                    this = fvVar;
                } else {
                    continue;
                }
            }
            if (dvVar == null) {
                return false;
            }
            if (dv.m.compareAndSet(dvVar, -1, 0)) {
                LockSupport.unpark(dvVar);
                return true;
            }
            this = fvVar;
        }
    }

    public final String toString() {
        int i;
        ArrayList arrayList = new ArrayList();
        sm1 sm1Var = this.k;
        int a = sm1Var.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < a; i7++) {
            dv dvVar = (dv) sm1Var.b(i7);
            if (dvVar != null) {
                lj2 lj2Var = dvVar.e;
                lj2Var.getClass();
                if (lj2.b.get(lj2Var) != null) {
                    i = (lj2.c.get(lj2Var) - lj2.d.get(lj2Var)) + 1;
                } else {
                    i = lj2.c.get(lj2Var) - lj2.d.get(lj2Var);
                }
                int ordinal = dvVar.g.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i6++;
                                } else {
                                    se.m();
                                    return null;
                                }
                            } else {
                                i5++;
                                if (i > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(i);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            i4++;
                        }
                    } else {
                        i3++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i);
                        sb2.append('b');
                        arrayList.add(sb2.toString());
                    }
                } else {
                    i2++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                }
            }
        }
        long j = m.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.h);
        sb4.append('@');
        sb4.append(rx.w(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.e;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.f);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i2);
        sb4.append(", blocking = ");
        sb4.append(i3);
        sb4.append(", parked = ");
        sb4.append(i4);
        sb4.append(", dormant = ");
        sb4.append(i5);
        sb4.append(", terminated = ");
        sb4.append(i6);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.i.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.j.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
