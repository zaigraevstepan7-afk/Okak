package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class q70 extends l70 implements oz {
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(q70.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(q70.class, Object.class, "_delayed$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(q70.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    public q10 A(long j, ga2 ga2Var, xu xuVar) {
        return fy.a.A(j, ga2Var, xuVar);
    }

    @Override // defpackage.oz
    public final void D(long j, pl plVar) {
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
            m70 m70Var = new m70(this, j2 + nanoTime, plVar);
            d0(nanoTime, m70Var);
            plVar.u(new kl(m70Var, 2));
        }
    }

    @Override // defpackage.zu
    public final void P(xu xuVar, Runnable runnable) {
        X(runnable);
    }

    @Override // defpackage.l70
    public final long V() {
        o70 o70Var;
        Runnable runnable;
        long j;
        ad0 ad0Var = mp0.r;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        if (!W()) {
            Y();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                o70Var = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof ox0) {
                    ox0 ox0Var = (ox0) obj;
                    Object d = ox0Var.d();
                    if (d != ox0.g) {
                        runnable = (Runnable) d;
                        break;
                    }
                    ox0 c = ox0Var.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else {
                    if (obj == ad0Var) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            te teVar = this.i;
            if (teVar == null || teVar.isEmpty()) {
                j = Long.MAX_VALUE;
            } else {
                j = 0;
            }
            if (j != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof ox0) {
                        long j2 = ox0.f.get((ox0) obj2);
                        if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == ad0Var) {
                        return Long.MAX_VALUE;
                    }
                }
                p70 p70Var = (p70) l.get(this);
                if (p70Var != null) {
                    synchronized (p70Var) {
                        o70[] o70VarArr = p70Var.a;
                        if (o70VarArr != null) {
                            o70Var = o70VarArr[0];
                        }
                    }
                    if (o70Var != null) {
                        long nanoTime = o70Var.e - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void X(Runnable runnable) {
        Y();
        if (Z(runnable)) {
            Thread a0 = a0();
            if (Thread.currentThread() != a0) {
                LockSupport.unpark(a0);
                return;
            }
            return;
        }
        ey.n.X(runnable);
    }

    public final void Y() {
        o70 o70Var;
        o70 o70Var2;
        boolean z;
        p70 p70Var = (p70) l.get(this);
        if (p70Var == null || t92.b.get(p70Var) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (p70Var) {
                try {
                    o70[] o70VarArr = p70Var.a;
                    o70Var = null;
                    if (o70VarArr != null) {
                        o70Var2 = o70VarArr[0];
                    } else {
                        o70Var2 = null;
                    }
                    if (o70Var2 != null) {
                        if (nanoTime - o70Var2.e >= 0) {
                            z = Z(o70Var2);
                        } else {
                            z = false;
                        }
                        if (z) {
                            o70Var = p70Var.b(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (o70Var != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Z(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.q70.k
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.q70.m
            int r2 = r2.get(r6)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            r2 = 1
            if (r1 != 0) goto L22
        L13:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L1b
            goto L62
        L1b:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L13
            goto L0
        L22:
            boolean r4 = r1 instanceof defpackage.ox0
            if (r4 == 0) goto L47
            r4 = r1
            ox0 r4 = (defpackage.ox0) r4
            int r5 = r4.a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            ox0 r3 = r4.c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            ad0 r4 = defpackage.mp0.r
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            ox0 r3 = new ox0
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.a(r4)
            r3.a(r7)
        L5c:
            boolean r4 = r0.compareAndSet(r6, r1, r3)
            if (r4 == 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q70.Z(java.lang.Runnable):boolean");
    }

    public abstract Thread a0();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r0 == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b0() {
        /*
            r7 = this;
            te r0 = r7.i
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.q70.l
            java.lang.Object r0 = r0.get(r7)
            p70 r0 = (defpackage.p70) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.t92.b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.q70.k
            java.lang.Object r7 = r0.get(r7)
            if (r7 != 0) goto L30
            goto L53
        L30:
            boolean r0 = r7 instanceof defpackage.ox0
            if (r0 == 0) goto L4f
            ox0 r7 = (defpackage.ox0) r7
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ox0.f
            long r3 = r0.get(r7)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r7 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r0 = 30
            long r3 = r3 >> r0
            int r0 = (int) r3
            if (r7 != r0) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            ad0 r0 = defpackage.mp0.r
            if (r7 != r0) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q70.b0():boolean");
    }

    public void c0(long j, o70 o70Var) {
        ey.n.d0(j, o70Var);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [p70, java.lang.Object] */
    public final void d0(long j, o70 o70Var) {
        int b;
        Thread a0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
        o70 o70Var2 = null;
        if (m.get(this) != 0) {
            b = 1;
        } else {
            p70 p70Var = (p70) atomicReferenceFieldUpdater.get(this);
            if (p70Var == null) {
                ?? obj = new Object();
                obj.c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                obj2.getClass();
                p70Var = (p70) obj2;
            }
            b = o70Var.b(j, p70Var, this);
        }
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    se.p("unexpected result");
                    return;
                }
                return;
            }
            c0(j, o70Var);
            return;
        }
        p70 p70Var2 = (p70) atomicReferenceFieldUpdater.get(this);
        if (p70Var2 != null) {
            synchronized (p70Var2) {
                o70[] o70VarArr = p70Var2.a;
                if (o70VarArr != null) {
                    o70Var2 = o70VarArr[0];
                }
            }
        }
        if (o70Var2 == o70Var && Thread.currentThread() != (a0 = a0())) {
            LockSupport.unpark(a0);
        }
    }

    @Override // defpackage.l70
    public void shutdown() {
        o70 o70Var;
        r92.a.set(null);
        m.set(this, 1);
        ad0 ad0Var = mp0.r;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, ad0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else {
                if (obj instanceof ox0) {
                    ((ox0) obj).b();
                    break;
                }
                if (obj != ad0Var) {
                    ox0 ox0Var = new ox0(8, true);
                    ox0Var.a((Runnable) obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ox0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
        }
        do {
        } while (V() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            p70 p70Var = (p70) l.get(this);
            if (p70Var != null) {
                synchronized (p70Var) {
                    if (t92.b.get(p70Var) > 0) {
                        o70Var = p70Var.b(0);
                    } else {
                        o70Var = null;
                    }
                }
                if (o70Var != null) {
                    c0(nanoTime, o70Var);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
