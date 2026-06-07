package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class fv1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(fv1.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c = AtomicLongFieldUpdater.newUpdater(fv1.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(fv1.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(fv1.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(fv1.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final ol a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public fv1() {
        hv1 hv1Var = new hv1(0L, null, 2);
        this.head$volatile = hv1Var;
        this.tail$volatile = hv1Var;
        this._availablePermits$volatile = 1;
        this.a = new ol(this, 6);
    }

    public final void a(a51 a51Var) {
        Object x;
        hv1 hv1Var;
        pl plVar = a51Var.e;
        b51 b51Var = a51Var.f;
        while (true) {
            int andDecrement = f.getAndDecrement(this);
            if (andDecrement <= 1) {
                int i = 0;
                int i2 = 25;
                od2 od2Var = od2.a;
                if (andDecrement > 0) {
                    b51.g.set(b51Var, null);
                    plVar.B(od2Var, plVar.g, new ol(new r(i2, b51Var, a51Var), i));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
                hv1 hv1Var2 = (hv1) atomicReferenceFieldUpdater.get(this);
                long andIncrement = e.getAndIncrement(this);
                dv1 dv1Var = dv1.e;
                long j = andIncrement / gv1.f;
                while (true) {
                    x = fc2.x(hv1Var2, j, dv1Var);
                    if (!nq1.h(x)) {
                        nt1 f2 = nq1.f(x);
                        while (true) {
                            nt1 nt1Var = (nt1) atomicReferenceFieldUpdater.get(this);
                            hv1Var = hv1Var2;
                            if (nt1Var.c >= f2.c) {
                                break;
                            }
                            if (!f2.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, nt1Var, f2)) {
                                if (atomicReferenceFieldUpdater.get(this) != nt1Var) {
                                    if (f2.e()) {
                                        f2.d();
                                    }
                                    hv1Var2 = hv1Var;
                                }
                            }
                            if (nt1Var.e()) {
                                nt1Var.d();
                            }
                        }
                    } else {
                        break;
                    }
                    hv1Var2 = hv1Var;
                }
                hv1 hv1Var3 = (hv1) nq1.f(x);
                AtomicReferenceArray atomicReferenceArray = hv1Var3.e;
                int i3 = (int) (andIncrement % gv1.f);
                while (!atomicReferenceArray.compareAndSet(i3, null, a51Var)) {
                    if (atomicReferenceArray.get(i3) != null) {
                        ad0 ad0Var = gv1.b;
                        ad0 ad0Var2 = gv1.c;
                        while (!atomicReferenceArray.compareAndSet(i3, ad0Var, ad0Var2)) {
                            if (atomicReferenceArray.get(i3) != ad0Var) {
                                break;
                            }
                        }
                        b51.g.set(b51Var, null);
                        plVar.B(od2Var, plVar.g, new ol(new r(25, b51Var, a51Var), 0));
                        return;
                    }
                }
                a51Var.a(hv1Var3, i3);
                return;
            }
        }
    }

    public final void b() {
        boolean z;
        int i;
        Object x;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z = true;
            if (andIncrement < 1) {
                if (andIncrement < 0) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                    hv1 hv1Var = (hv1) atomicReferenceFieldUpdater.get(this);
                    long andIncrement2 = c.getAndIncrement(this);
                    long j = andIncrement2 / gv1.f;
                    ev1 ev1Var = ev1.e;
                    while (true) {
                        x = fc2.x(hv1Var, j, ev1Var);
                        if (!nq1.h(x)) {
                            nt1 f2 = nq1.f(x);
                            while (true) {
                                nt1 nt1Var = (nt1) atomicReferenceFieldUpdater.get(this);
                                if (nt1Var.c >= f2.c) {
                                    break;
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
                    hv1 hv1Var2 = (hv1) nq1.f(x);
                    AtomicReferenceArray atomicReferenceArray = hv1Var2.e;
                    hv1Var2.a();
                    boolean z2 = false;
                    if (hv1Var2.c <= j) {
                        int i2 = (int) (andIncrement2 % gv1.f);
                        Object andSet = atomicReferenceArray.getAndSet(i2, gv1.b);
                        if (andSet == null) {
                            int i3 = gv1.a;
                            int i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    if (atomicReferenceArray.get(i2) == gv1.c) {
                                        break;
                                    } else {
                                        i4++;
                                    }
                                } else {
                                    ad0 ad0Var = gv1.b;
                                    ad0 ad0Var2 = gv1.d;
                                    while (true) {
                                        if (atomicReferenceArray.compareAndSet(i2, ad0Var, ad0Var2)) {
                                            z2 = true;
                                            break;
                                        } else if (atomicReferenceArray.get(i2) != ad0Var) {
                                            break;
                                        }
                                    }
                                    z = true ^ z2;
                                }
                            }
                        } else if (andSet != gv1.e) {
                            if (andSet instanceof nl) {
                                nl nlVar = (nl) andSet;
                                ad0 e2 = nlVar.e(od2.a, this.a);
                                if (e2 != null) {
                                    nlVar.l(e2);
                                }
                            } else {
                                se.t(andSet, "unexpected: ");
                                return;
                            }
                        }
                    }
                    z = false;
                } else {
                    return;
                }
            } else {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                y61.f("The number of released permits cannot be greater than 1");
                return;
            }
        } while (!z);
    }
}
