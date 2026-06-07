package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class lk implements dm {
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(lk.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(lk.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(lk.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater i = AtomicLongFieldUpdater.newUpdater(lk.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(lk.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(lk.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(lk.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(lk.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(lk.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final int e;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public lk(int i2) {
        long j2;
        this.e = i2;
        if (i2 >= 0) {
            om omVar = nk.a;
            if (i2 != 0) {
                if (i2 != Integer.MAX_VALUE) {
                    j2 = i2;
                } else {
                    j2 = Long.MAX_VALUE;
                }
            } else {
                j2 = 0;
            }
            this.bufferEnd$volatile = j2;
            this.completedExpandBuffersAndPauseFlag$volatile = h.get(this);
            om omVar2 = new om(0L, null, this, 3);
            this.sendSegment$volatile = omVar2;
            this.receiveSegment$volatile = omVar2;
            if (w()) {
                omVar2 = nk.a;
                omVar2.getClass();
            }
            this.bufferEndSegment$volatile = omVar2;
            this._closeCause$volatile = nk.s;
            return;
        }
        se.e(l90.i("Invalid channel capacity: ", i2, ", should be >=0"));
        throw null;
    }

    public static boolean B(Object obj) {
        if (obj instanceof nl) {
            nl nlVar = (nl) obj;
            om omVar = nk.a;
            ad0 e = nlVar.e(od2.a, null);
            if (e == null) {
                return false;
            }
            nlVar.l(e);
            return true;
        }
        se.t(obj, "Unexpected waiter: ");
        return false;
    }

    public static final om b(lk lkVar, long j2, om omVar) {
        Object x;
        lk lkVar2;
        om omVar2 = nk.a;
        mk mkVar = mk.e;
        loop0: while (true) {
            x = fc2.x(omVar, j2, mkVar);
            if (!nq1.h(x)) {
                nt1 f2 = nq1.f(x);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j;
                    nt1 nt1Var = (nt1) atomicReferenceFieldUpdater.get(lkVar);
                    if (nt1Var.c >= f2.c) {
                        break loop0;
                    }
                    if (!f2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(lkVar, nt1Var, f2)) {
                        if (atomicReferenceFieldUpdater.get(lkVar) != nt1Var) {
                            if (f2.e()) {
                                f2.d();
                            }
                        }
                    }
                    if (nt1Var.e()) {
                        nt1Var.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean h2 = nq1.h(x);
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        if (h2) {
            lkVar.u();
            if (omVar.c * nk.b < atomicLongFieldUpdater.get(lkVar)) {
                omVar.a();
                return null;
            }
        } else {
            om omVar3 = (om) nq1.f(x);
            long j3 = omVar3.c;
            if (j3 > j2) {
                long j4 = nk.b * j3;
                while (true) {
                    long j5 = f.get(lkVar);
                    long j6 = 1152921504606846975L & j5;
                    if (j6 >= j4) {
                        lkVar2 = lkVar;
                        break;
                    }
                    lkVar2 = lkVar;
                    if (f.compareAndSet(lkVar2, j5, (((int) (j5 >> 60)) << 60) + j6)) {
                        break;
                    }
                    lkVar = lkVar2;
                }
                if (j3 * nk.b < atomicLongFieldUpdater.get(lkVar2)) {
                    omVar3.a();
                }
            } else {
                return omVar3;
            }
        }
        return null;
    }

    public static final void e(lk lkVar, Object obj, pl plVar) {
        plVar.resumeWith(new fo1(lkVar.q()));
    }

    public static final int g(lk lkVar, om omVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        omVar.m(i2, obj);
        if (z) {
            return lkVar.D(omVar, i2, obj, j2, obj2, z);
        }
        Object k2 = omVar.k(i2);
        if (k2 == null) {
            if (lkVar.h(j2)) {
                if (omVar.j(i2, null, nk.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (omVar.j(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (k2 instanceof bh2) {
            omVar.m(i2, null);
            if (lkVar.A(k2, obj)) {
                omVar.n(i2, nk.i);
                return 0;
            }
            ad0 ad0Var = nk.k;
            if (omVar.f.getAndSet((i2 * 2) + 1, ad0Var) != ad0Var) {
                omVar.l(i2, true);
                return 5;
            }
            return 5;
        }
        return lkVar.D(omVar, i2, obj, j2, obj2, z);
    }

    public static void s(lk lkVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        if ((atomicLongFieldUpdater.addAndGet(lkVar, 1L) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(lkVar) & 4611686018427387904L) != 0);
    }

    public final boolean A(Object obj, Object obj2) {
        if (obj instanceof kk) {
            kk kkVar = (kk) obj;
            pl plVar = kkVar.f;
            plVar.getClass();
            kkVar.f = null;
            kkVar.e = obj2;
            Boolean bool = Boolean.TRUE;
            kkVar.g.getClass();
            om omVar = nk.a;
            ad0 e = plVar.e(bool, null);
            if (e == null) {
                return false;
            }
            plVar.l(e);
            return true;
        }
        if (obj instanceof nl) {
            nl nlVar = (nl) obj;
            om omVar2 = nk.a;
            ad0 e2 = nlVar.e(obj2, null);
            if (e2 == null) {
                return false;
            }
            nlVar.l(e2);
            return true;
        }
        se.t(obj, "Unexpected receiver type: ");
        return false;
    }

    public final Object C(om omVar, int i2, long j2, Object obj) {
        AtomicReferenceArray atomicReferenceArray = omVar.f;
        Object k2 = omVar.k(i2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        if (k2 == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return nk.n;
                }
                if (omVar.j(i2, k2, obj)) {
                    m();
                    return nk.m;
                }
            }
        } else if (k2 == nk.d && omVar.j(i2, k2, nk.i)) {
            m();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            omVar.m(i2, null);
            return obj2;
        }
        while (true) {
            Object k3 = omVar.k(i2);
            if (k3 != null && k3 != nk.e) {
                if (k3 == nk.d) {
                    if (omVar.j(i2, k3, nk.i)) {
                        m();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        omVar.m(i2, null);
                        return obj3;
                    }
                } else {
                    ad0 ad0Var = nk.j;
                    if (k3 == ad0Var) {
                        return nk.o;
                    }
                    if (k3 == nk.h) {
                        return nk.o;
                    }
                    if (k3 == nk.l) {
                        m();
                        return nk.o;
                    }
                    if (k3 != nk.g && omVar.j(i2, k3, nk.f)) {
                        boolean z = k3 instanceof ch2;
                        if (z) {
                            k3 = ((ch2) k3).a;
                        }
                        if (B(k3)) {
                            omVar.n(i2, nk.i);
                            m();
                            Object obj4 = atomicReferenceArray.get(i2 * 2);
                            omVar.m(i2, null);
                            return obj4;
                        }
                        omVar.n(i2, ad0Var);
                        omVar.h();
                        if (z) {
                            m();
                        }
                        return nk.o;
                    }
                }
            } else if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (omVar.j(i2, k3, nk.h)) {
                    m();
                    return nk.o;
                }
            } else {
                if (obj == null) {
                    return nk.n;
                }
                if (omVar.j(i2, k3, obj)) {
                    m();
                    return nk.m;
                }
            }
        }
    }

    public final int D(om omVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object k2 = omVar.k(i2);
            if (k2 == null) {
                if (h(j2) && !z) {
                    if (omVar.j(i2, null, nk.d)) {
                        break;
                    }
                } else if (z) {
                    if (omVar.j(i2, null, nk.j)) {
                        omVar.h();
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (omVar.j(i2, null, obj2)) {
                        return 2;
                    }
                }
            } else if (k2 == nk.e) {
                if (omVar.j(i2, k2, nk.d)) {
                    break;
                }
            } else {
                ad0 ad0Var = nk.k;
                if (k2 == ad0Var) {
                    omVar.m(i2, null);
                    return 5;
                }
                if (k2 == nk.h) {
                    omVar.m(i2, null);
                    return 5;
                }
                if (k2 == nk.l) {
                    omVar.m(i2, null);
                    u();
                    return 4;
                }
                omVar.m(i2, null);
                if (k2 instanceof ch2) {
                    k2 = ((ch2) k2).a;
                }
                if (A(k2, obj)) {
                    omVar.n(i2, nk.i);
                    return 0;
                }
                if (omVar.f.getAndSet((i2 * 2) + 1, ad0Var) != ad0Var) {
                    omVar.l(i2, true);
                }
                return 5;
            }
        }
        return 1;
    }

    public final void E(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z;
        lk lkVar = this;
        if (!lkVar.w()) {
            while (true) {
                atomicLongFieldUpdater = h;
                if (atomicLongFieldUpdater.get(lkVar) > j2) {
                    break;
                } else {
                    lkVar = this;
                }
            }
            int i2 = nk.c;
            int i3 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = i;
                if (i3 < i2) {
                    long j3 = atomicLongFieldUpdater.get(lkVar);
                    if (j3 != (4611686018427387903L & atomicLongFieldUpdater2.get(lkVar)) || j3 != atomicLongFieldUpdater.get(lkVar)) {
                        i3++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        long j4 = atomicLongFieldUpdater2.get(lkVar);
                        if (atomicLongFieldUpdater2.compareAndSet(lkVar, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                            break;
                        } else {
                            lkVar = this;
                        }
                    }
                    while (true) {
                        long j5 = atomicLongFieldUpdater.get(lkVar);
                        long j6 = atomicLongFieldUpdater2.get(lkVar);
                        long j7 = j6 & 4611686018427387903L;
                        if ((j6 & 4611686018427387904L) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (j5 == j7 && j5 == atomicLongFieldUpdater.get(lkVar)) {
                            break;
                        }
                        if (!z) {
                            lkVar = this;
                            atomicLongFieldUpdater2.compareAndSet(lkVar, j6, 4611686018427387904L + j7);
                        } else {
                            lkVar = this;
                        }
                    }
                    while (true) {
                        long j8 = atomicLongFieldUpdater2.get(lkVar);
                        if (atomicLongFieldUpdater2.compareAndSet(lkVar, j8, j8 & 4611686018427387903L)) {
                            return;
                        } else {
                            lkVar = this;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0144 A[RETURN] */
    @Override // defpackage.iv1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.vt r24, java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk.a(vt, java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.dm
    public final void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        i(cancellationException, true);
    }

    @Override // defpackage.dm
    public final Object d() {
        om omVar;
        nm nmVar = fc2.i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        long j2 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
        long j3 = atomicLongFieldUpdater2.get(this);
        if (t(j3, true)) {
            return new mm(o());
        }
        if (j2 >= (j3 & 1152921504606846975L)) {
            return nmVar;
        }
        Object obj = nk.k;
        om omVar2 = (om) k.get(this);
        while (!this.t(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = nk.b;
            long j5 = andIncrement / j4;
            int i2 = (int) (andIncrement % j4);
            if (omVar2.c != j5) {
                om n2 = this.n(j5, omVar2);
                if (n2 == null) {
                    continue;
                } else {
                    omVar = n2;
                }
            } else {
                omVar = omVar2;
            }
            lk lkVar = this;
            Object C = lkVar.C(omVar, i2, andIncrement, obj);
            omVar2 = omVar;
            bh2 bh2Var = null;
            if (C == nk.m) {
                if (obj instanceof bh2) {
                    bh2Var = (bh2) obj;
                }
                if (bh2Var != null) {
                    bh2Var.a(omVar2, i2);
                }
                lkVar.E(andIncrement);
                omVar2.h();
                return nmVar;
            }
            if (C == nk.o) {
                if (andIncrement < lkVar.r()) {
                    omVar2.a();
                }
                this = lkVar;
            } else {
                if (C != nk.n) {
                    omVar2.a();
                    return C;
                }
                se.p("unexpected");
                return null;
            }
        }
        return new mm(this.o());
    }

    @Override // defpackage.dm
    public final Object f(vt vtVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
        om omVar = (om) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            boolean z = true;
            if (!t(atomicLongFieldUpdater.get(this), true)) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = g;
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(this);
                long j2 = nk.b;
                long j3 = andIncrement / j2;
                int i2 = (int) (andIncrement % j2);
                if (omVar.c != j3) {
                    om n2 = n(j3, omVar);
                    if (n2 == null) {
                        continue;
                    } else {
                        omVar = n2;
                    }
                }
                Object C = C(omVar, i2, andIncrement, null);
                Object obj = nk.m;
                if (C != obj) {
                    Object obj2 = nk.o;
                    if (C == obj2) {
                        if (andIncrement < r()) {
                            omVar.a();
                        }
                    } else {
                        if (C == nk.n) {
                            pl z2 = c01.z(go.F(vtVar));
                            try {
                                Object C2 = C(omVar, i2, andIncrement, z2);
                                if (C2 == obj) {
                                    z2.a(omVar, i2);
                                } else if (C2 == obj2) {
                                    if (andIncrement < r()) {
                                        omVar.a();
                                    }
                                    om omVar2 = (om) atomicReferenceFieldUpdater.get(this);
                                    while (true) {
                                        if (t(atomicLongFieldUpdater.get(this), z)) {
                                            z2.resumeWith(new fo1(p()));
                                            break;
                                        }
                                        long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(this);
                                        long j4 = nk.b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                                        long j5 = andIncrement2 / j4;
                                        int i3 = (int) (andIncrement2 % j4);
                                        if (omVar2.c != j5) {
                                            om n3 = n(j5, omVar2);
                                            if (n3 == null) {
                                                continue;
                                                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                                z = true;
                                            } else {
                                                omVar2 = n3;
                                            }
                                        }
                                        Object C3 = C(omVar2, i3, andIncrement2, z2);
                                        if (C3 == nk.m) {
                                            z2.a(omVar2, i3);
                                            break;
                                        }
                                        if (C3 == nk.o) {
                                            if (andIncrement2 < r()) {
                                                omVar2.a();
                                            }
                                            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                                            z = true;
                                        } else if (C3 != nk.n) {
                                            omVar2.a();
                                            z2.A(C3, null);
                                        } else {
                                            throw new IllegalStateException("unexpected");
                                        }
                                    }
                                } else {
                                    omVar.a();
                                    z2.A(C2, null);
                                }
                                return z2.q();
                            } catch (Throwable th) {
                                z2.z();
                                throw th;
                            }
                        }
                        omVar.a();
                        return C;
                    }
                } else {
                    se.p("unexpected");
                    return null;
                }
            } else {
                Throwable p = p();
                int i4 = h22.a;
                throw p;
            }
        }
    }

    public final boolean h(long j2) {
        if (j2 >= h.get(this) && j2 >= g.get(this) + this.e) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        if (r15 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        r5 = r3.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r3.compareAndSet(r4, r5, 3458764513820540928L + (r5 & 1152921504606846975L)) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        r4.u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r10 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r13 = defpackage.lk.n;
        r14 = r13.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r14 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        r15 = defpackage.nk.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (r13.compareAndSet(r4, r14, r15) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        if (r13.get(r4) == r14) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r14 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        defpackage.fc2.t(1, r14);
        ((defpackage.oe0) r14).invoke(r4.o());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007b, code lost:
    
        r15 = defpackage.nk.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004e, code lost:
    
        r5 = r3.get(r4);
        r13 = (int) (r5 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r13 == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0057, code lost:
    
        if (r13 == 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005a, code lost:
    
        r13 = (r5 & 1152921504606846975L) + 3458764513820540928L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0069, code lost:
    
        if (r3.compareAndSet(r4, r5, r13) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x005f, code lost:
    
        r13 = (r5 & 1152921504606846975L) + 2305843009213693952L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(java.lang.Throwable r14, boolean r15) {
        /*
            r13 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.lk.f
            if (r15 == 0) goto L25
        Lb:
            long r5 = r3.get(r13)
            long r7 = r5 >> r0
            int r4 = (int) r7
            if (r4 != 0) goto L25
            long r7 = r5 & r1
            om r4 = defpackage.nk.a
            r9 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r7 = r7 + r9
            r4 = r13
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L23
            goto L26
        L23:
            r13 = r4
            goto Lb
        L25:
            r4 = r13
        L26:
            ad0 r13 = defpackage.nk.s
        L28:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.lk.m
            boolean r6 = r5.compareAndSet(r4, r13, r14)
            r9 = 1
            if (r6 == 0) goto L33
            r10 = r9
            goto L3b
        L33:
            java.lang.Object r5 = r5.get(r4)
            if (r5 == r13) goto L28
            r13 = 0
            r10 = r13
        L3b:
            r11 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            if (r15 == 0) goto L4e
        L3f:
            long r5 = r3.get(r4)
            long r13 = r5 & r1
            long r7 = r11 + r13
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L3f
            goto L6b
        L4e:
            long r5 = r3.get(r4)
            long r13 = r5 >> r0
            int r13 = (int) r13
            if (r13 == 0) goto L5f
            if (r13 == r9) goto L5a
            goto L6b
        L5a:
            long r13 = r5 & r1
            long r13 = r13 + r11
        L5d:
            r7 = r13
            goto L65
        L5f:
            long r13 = r5 & r1
            r7 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r13 = r13 + r7
            goto L5d
        L65:
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L4e
        L6b:
            r4.u()
            if (r10 == 0) goto L9a
        L70:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = defpackage.lk.n
            java.lang.Object r14 = r13.get(r4)
            if (r14 != 0) goto L7b
            ad0 r15 = defpackage.nk.q
            goto L7d
        L7b:
            ad0 r15 = defpackage.nk.r
        L7d:
            boolean r0 = r13.compareAndSet(r4, r14, r15)
            if (r0 == 0) goto L93
            if (r14 != 0) goto L86
            goto L9a
        L86:
            defpackage.fc2.t(r9, r14)
            oe0 r14 = (defpackage.oe0) r14
            java.lang.Throwable r13 = r4.o()
            r14.invoke(r13)
            return r10
        L93:
            java.lang.Object r0 = r13.get(r4)
            if (r0 == r14) goto L7d
            goto L70
        L9a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk.i(java.lang.Throwable, boolean):boolean");
    }

    @Override // defpackage.dm
    public final kk iterator() {
        return new kk(this);
    }

    @Override // defpackage.iv1
    public Object j(Object obj) {
        boolean z;
        nm nmVar = fc2.i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f;
        long j2 = atomicLongFieldUpdater.get(this);
        boolean z2 = false;
        long j3 = 1152921504606846975L;
        if (t(j2, false)) {
            z = false;
        } else {
            z = !h(j2 & 1152921504606846975L);
        }
        if (z) {
            return nmVar;
        }
        Object obj2 = nk.j;
        om omVar = (om) j.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = andIncrement & j3;
            boolean t = t(andIncrement, z2);
            int i2 = nk.b;
            long j5 = i2;
            long j6 = j4 / j5;
            int i3 = (int) (j4 % j5);
            if (omVar.c != j6) {
                om b = b(this, j6, omVar);
                if (b == null) {
                    if (t) {
                        return new mm(q());
                    }
                    z2 = false;
                    j3 = 1152921504606846975L;
                } else {
                    omVar = b;
                }
            }
            int g2 = g(this, omVar, i3, obj, j4, obj2, t);
            od2 od2Var = od2.a;
            if (g2 != 0) {
                if (g2 != 1) {
                    bh2 bh2Var = null;
                    if (g2 != 2) {
                        if (g2 != 3) {
                            if (g2 != 4) {
                                if (g2 == 5) {
                                    omVar.a();
                                }
                                z2 = false;
                                j3 = 1152921504606846975L;
                            } else {
                                if (j4 < g.get(this)) {
                                    omVar.a();
                                }
                                return new mm(q());
                            }
                        } else {
                            se.p("unexpected");
                            return null;
                        }
                    } else {
                        if (t) {
                            omVar.h();
                            return new mm(q());
                        }
                        if (obj2 instanceof bh2) {
                            bh2Var = (bh2) obj2;
                        }
                        if (bh2Var != null) {
                            bh2Var.a(omVar, i3 + i2);
                        }
                        omVar.h();
                        return nmVar;
                    }
                } else {
                    return od2Var;
                }
            } else {
                omVar.a();
                return od2Var;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (defpackage.om) ((defpackage.ns) defpackage.ns.b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.om k(long r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk.k(long):om");
    }

    public final void l(long j2) {
        om omVar = (om) k.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = g;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.e + j3, h.get(this))) {
                return;
            }
            lk lkVar = this;
            if (atomicLongFieldUpdater.compareAndSet(lkVar, j3, 1 + j3)) {
                long j4 = nk.b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (omVar.c != j5) {
                    om n2 = lkVar.n(j5, omVar);
                    if (n2 != null) {
                        omVar = n2;
                    }
                }
                om omVar2 = omVar;
                if (lkVar.C(omVar2, i2, j3, null) == nk.o) {
                    if (j3 < lkVar.r()) {
                        omVar2.a();
                    }
                } else {
                    omVar2.a();
                }
                this = lkVar;
                omVar = omVar2;
            }
            this = lkVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00bd, code lost:
    
        if ((r0.addAndGet(r15, r4 - r8) & 4611686018427387904L) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00c6, code lost:
    
        if ((r0.get(r15) & 4611686018427387904L) == 0) goto L144;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk.m():void");
    }

    public final om n(long j2, om omVar) {
        Object x;
        lk lkVar;
        om omVar2 = nk.a;
        mk mkVar = mk.e;
        loop0: while (true) {
            x = fc2.x(omVar, j2, mkVar);
            if (!nq1.h(x)) {
                nt1 f2 = nq1.f(x);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
                    nt1 nt1Var = (nt1) atomicReferenceFieldUpdater.get(this);
                    if (nt1Var.c >= f2.c) {
                        break loop0;
                    }
                    if (!f2.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, nt1Var, f2)) {
                        if (atomicReferenceFieldUpdater.get(this) != nt1Var) {
                            if (f2.e()) {
                                f2.d();
                            }
                        }
                    }
                    if (nt1Var.e()) {
                        nt1Var.d();
                    }
                }
            } else {
                break;
            }
        }
        if (nq1.h(x)) {
            u();
            if (omVar.c * nk.b < r()) {
                omVar.a();
                return null;
            }
        } else {
            om omVar3 = (om) nq1.f(x);
            long j3 = omVar3.c;
            if (!w() && j2 <= h.get(this) / nk.b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l;
                    nt1 nt1Var2 = (nt1) atomicReferenceFieldUpdater2.get(this);
                    if (nt1Var2.c >= j3) {
                        break;
                    }
                    if (!omVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, nt1Var2, omVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != nt1Var2) {
                            if (omVar3.e()) {
                                omVar3.d();
                            }
                        }
                    }
                    if (nt1Var2.e()) {
                        nt1Var2.d();
                    }
                }
            }
            if (j3 > j2) {
                long j4 = j3 * nk.b;
                while (true) {
                    long j5 = g.get(this);
                    if (j5 >= j4) {
                        lkVar = this;
                        break;
                    }
                    lkVar = this;
                    if (g.compareAndSet(lkVar, j5, j4)) {
                        break;
                    }
                    this = lkVar;
                }
                if (j3 * nk.b < lkVar.r()) {
                    omVar3.a();
                }
            } else {
                return omVar3;
            }
        }
        return null;
    }

    public final Throwable o() {
        return (Throwable) m.get(this);
    }

    public final Throwable p() {
        Throwable o = o();
        if (o == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return o;
    }

    public final Throwable q() {
        Throwable o = o();
        if (o == null) {
            return new IllegalStateException("Channel was closed");
        }
        return o;
    }

    public final long r() {
        return f.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (defpackage.om) ((defpackage.ns) defpackage.ns.b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t(long r14, boolean r16) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk.t(long, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x018b, code lost:
    
        r3 = (defpackage.om) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0192, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk.toString():java.lang.String");
    }

    public final boolean u() {
        return t(f.get(this), false);
    }

    public boolean v() {
        return false;
    }

    public final boolean w() {
        long j2 = h.get(this);
        if (j2 != 0 && j2 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(long r5, defpackage.om r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            ns r0 = r7.b()
            om r0 = (defpackage.om) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            ns r5 = r7.b()
            om r5 = (defpackage.om) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.lk.l
            java.lang.Object r6 = r5.get(r4)
            nt1 r6 = (defpackage.nt1) r6
            long r0 = r6.c
            long r2 = r7.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r4 = r6.e()
            if (r4 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk.x(long, om):void");
    }

    public final Object y(vt vtVar, Object obj) {
        pl plVar = new pl(1, go.F(vtVar));
        plVar.r();
        plVar.resumeWith(new fo1(q()));
        Object q = plVar.q();
        if (q == hv.e) {
            return q;
        }
        return od2.a;
    }

    public final void z(bh2 bh2Var, boolean z) {
        Throwable q;
        if (bh2Var instanceof nl) {
            vt vtVar = (vt) bh2Var;
            if (z) {
                q = p();
            } else {
                q = q();
            }
            vtVar.resumeWith(new fo1(q));
            return;
        }
        if (bh2Var instanceof kk) {
            kk kkVar = (kk) bh2Var;
            pl plVar = kkVar.f;
            plVar.getClass();
            kkVar.f = null;
            kkVar.e = nk.l;
            Throwable o = kkVar.g.o();
            if (o == null) {
                plVar.resumeWith(Boolean.FALSE);
                return;
            } else {
                plVar.resumeWith(new fo1(o));
                return;
            }
        }
        se.t(bh2Var, "Unexpected waiter: ");
    }
}
