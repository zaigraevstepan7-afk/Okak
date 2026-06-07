package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dv extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(dv.class, "workerCtl$volatile");
    public final lj2 e;
    public final wl1 f;
    public ev g;
    public long h;
    public long i;
    private volatile int indexInArray;
    public int j;
    public boolean k;
    public final /* synthetic */ fv l;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, wl1] */
    public dv(fv fvVar, int i) {
        this.l = fvVar;
        setDaemon(true);
        setContextClassLoader(fv.class.getClassLoader());
        this.e = new lj2();
        this.f = new Object();
        this.g = ev.h;
        this.nextParkedWorker = fv.o;
        int nanoTime = (int) System.nanoTime();
        this.j = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final y52 a(boolean z) {
        y52 e;
        y52 e2;
        long j;
        ev evVar = this.g;
        fv fvVar = this.l;
        y52 y52Var = null;
        boolean z2 = true;
        lj2 lj2Var = this.e;
        ev evVar2 = ev.e;
        if (evVar != evVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = fv.m;
            do {
                j = atomicLongFieldUpdater.get(fvVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    lj2Var.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = lj2.b;
                        y52 y52Var2 = (y52) atomicReferenceFieldUpdater.get(lj2Var);
                        if (y52Var2 == null || !y52Var2.f) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(lj2Var, y52Var2, null)) {
                            if (atomicReferenceFieldUpdater.get(lj2Var) != y52Var2) {
                                break;
                            }
                        }
                        y52Var = y52Var2;
                    }
                    int i = lj2.d.get(lj2Var);
                    int i2 = lj2.c.get(lj2Var);
                    while (true) {
                        if (i == i2 || lj2.e.get(lj2Var) == 0) {
                            break;
                        }
                        i2--;
                        y52 c = lj2Var.c(i2, true);
                        if (c != null) {
                            y52Var = c;
                            break;
                        }
                    }
                    if (y52Var == null) {
                        y52 y52Var3 = (y52) fvVar.j.d();
                        if (y52Var3 == null) {
                            return i(1);
                        }
                        return y52Var3;
                    }
                    return y52Var;
                }
            } while (!fv.m.compareAndSet(fvVar, j, j - 4398046511104L));
            this.g = evVar2;
        }
        if (z) {
            if (d(fvVar.e * 2) != 0) {
                z2 = false;
            }
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            lj2Var.getClass();
            y52 y52Var4 = (y52) lj2.b.getAndSet(lj2Var, null);
            if (y52Var4 == null) {
                y52Var4 = lj2Var.b();
            }
            if (y52Var4 != null) {
                return y52Var4;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            y52 e3 = e();
            if (e3 != null) {
                return e3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.j;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.j = i5;
        int i6 = i - 1;
        if ((i6 & i) == 0) {
            return i6 & i5;
        }
        return (Integer.MAX_VALUE & i5) % i;
    }

    public final y52 e() {
        int d = d(2);
        fv fvVar = this.l;
        lf0 lf0Var = fvVar.j;
        lf0 lf0Var2 = fvVar.i;
        if (d == 0) {
            y52 y52Var = (y52) lf0Var2.d();
            if (y52Var != null) {
                return y52Var;
            }
            return (y52) lf0Var.d();
        }
        y52 y52Var2 = (y52) lf0Var.d();
        if (y52Var2 != null) {
            return y52Var2;
        }
        return (y52) lf0Var2.d();
    }

    public final void f(int i) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.l.h);
        sb.append("-worker-");
        if (i == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(ev evVar) {
        boolean z;
        ev evVar2 = this.g;
        if (evVar2 == ev.e) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            fv.m.addAndGet(this.l, 4398046511104L);
        }
        if (evVar2 != evVar) {
            this.g = evVar;
        }
        return z;
    }

    public final y52 i(int i) {
        boolean z;
        long j;
        y52 y52Var;
        long j2;
        long j3;
        y52 y52Var2;
        int i2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = fv.m;
        fv fvVar = this.l;
        int i3 = (int) (atomicLongFieldUpdater.get(fvVar) & 2097151);
        y52 y52Var3 = null;
        if (i3 < 2) {
            return null;
        }
        int d = d(i3);
        int i4 = 0;
        long j4 = Long.MAX_VALUE;
        while (i4 < i3) {
            d++;
            if (d > i3) {
                d = 1;
            }
            dv dvVar = (dv) fvVar.k.b(d);
            if (dvVar != null && dvVar != this) {
                lj2 lj2Var = dvVar.e;
                if (i == 3) {
                    y52Var = lj2Var.b();
                    j = 0;
                } else {
                    lj2Var.getClass();
                    int i5 = lj2.d.get(lj2Var);
                    int i6 = lj2.c.get(lj2Var);
                    if (i == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    while (true) {
                        if (i5 != i6) {
                            j = 0;
                            if (!z || lj2.e.get(lj2Var) != 0) {
                                int i7 = i5 + 1;
                                y52Var = lj2Var.c(i5, z);
                                if (y52Var != null) {
                                    break;
                                }
                                i5 = i7;
                            } else {
                                break;
                            }
                        } else {
                            j = 0;
                            break;
                        }
                    }
                    y52Var = y52Var3;
                }
                wl1 wl1Var = this.f;
                if (y52Var != null) {
                    wl1Var.e = y52Var;
                    y52Var2 = y52Var3;
                    j3 = -1;
                    j2 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = lj2.b;
                        y52 y52Var4 = (y52) atomicReferenceFieldUpdater.get(lj2Var);
                        if (y52Var4 == null) {
                            j2 = -1;
                            break;
                        }
                        j2 = -1;
                        if (y52Var4.f) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        if ((i2 & i) == 0) {
                            break;
                        }
                        a62.f.getClass();
                        lj2 lj2Var2 = lj2Var;
                        long nanoTime = System.nanoTime() - y52Var4.e;
                        long j5 = a62.b;
                        if (nanoTime < j5) {
                            j3 = j5 - nanoTime;
                            y52Var2 = null;
                            break;
                        }
                        do {
                            y52Var2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(lj2Var2, y52Var4, null)) {
                                wl1Var.e = y52Var4;
                                j3 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(lj2Var2) == y52Var4);
                        lj2Var = lj2Var2;
                        y52Var3 = null;
                    }
                    j3 = -2;
                    y52Var2 = y52Var3;
                }
                if (j3 == j2) {
                    y52 y52Var5 = (y52) wl1Var.e;
                    wl1Var.e = y52Var2;
                    return y52Var5;
                }
                if (j3 > j) {
                    j4 = Math.min(j4, j3);
                }
            }
            i4++;
            y52Var3 = null;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = 0;
        }
        this.i = j4;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dv.run():void");
    }
}
