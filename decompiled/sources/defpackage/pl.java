package defpackage;

import com.topjohnwu.superuser.nio.FileSystemManager;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class pl extends i10 implements nl, iv, bh2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(pl.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(pl.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(pl.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final vt h;
    public final xu i;

    public pl(int i, vt vtVar) {
        super(i);
        this.h = vtVar;
        this.i = vtVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = z1.a;
    }

    public static Object D(n81 n81Var, Object obj, int i, te0 te0Var) {
        kl klVar;
        if (obj instanceof lp) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (te0Var == null && !(n81Var instanceof kl)) {
            return obj;
        }
        if (n81Var instanceof kl) {
            klVar = (kl) n81Var;
        } else {
            klVar = null;
        }
        return new jp(obj, klVar, te0Var, (Throwable) null, 16);
    }

    public static void x(n81 n81Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + n81Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, te0 te0Var) {
        B(obj, this.g, te0Var);
    }

    public final void B(Object obj, int i, te0 te0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof n81) {
                Object D = D((n81) obj2, obj, i, te0Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    n();
                }
                o(i);
                return;
            }
            if (obj2 instanceof rl) {
                rl rlVar = (rl) obj2;
                if (rl.c.compareAndSet(rlVar, 0, 1)) {
                    if (te0Var != null) {
                        k(te0Var, rlVar.a, obj);
                        return;
                    }
                    return;
                }
            }
            se.t(obj, "Already resumed, but proposed with update ");
            return;
        }
    }

    public final void C(zu zuVar) {
        g10 g10Var;
        zu zuVar2;
        int i;
        vt vtVar = this.h;
        if (vtVar instanceof g10) {
            g10Var = (g10) vtVar;
        } else {
            g10Var = null;
        }
        if (g10Var != null) {
            zuVar2 = g10Var.h;
        } else {
            zuVar2 = null;
        }
        if (zuVar2 == zuVar) {
            i = 4;
        } else {
            i = this.g;
        }
        B(od2.a, i, null);
    }

    @Override // defpackage.bh2
    public final void a(nt1 nt1Var, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = j;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                se.p("invokeOnCancellation should be called at most once");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        u(nt1Var);
    }

    @Override // defpackage.i10
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof n81)) {
                if (!(obj instanceof lp)) {
                    if (obj instanceof jp) {
                        jp jpVar = (jp) obj;
                        if (jpVar.e == null) {
                            jp a = jp.a(jpVar, null, cancellationException, 15);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    cancellationException2 = cancellationException;
                                }
                            }
                            kl klVar = jpVar.b;
                            if (klVar != null) {
                                j(klVar, cancellationException);
                            }
                            te0 te0Var = jpVar.c;
                            if (te0Var != null) {
                                k(te0Var, cancellationException, jpVar.a);
                                return;
                            }
                            return;
                        }
                        se.p("Must be called at most once");
                        return;
                    }
                    cancellationException2 = cancellationException;
                    jp jpVar2 = new jp(obj, (kl) null, (te0) null, cancellationException2, 14);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, jpVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    return;
                    cancellationException = cancellationException2;
                } else {
                    return;
                }
            } else {
                se.p("Not completed");
                return;
            }
        }
    }

    @Override // defpackage.i10
    public final vt c() {
        return this.h;
    }

    @Override // defpackage.i10
    public final Throwable d(Object obj) {
        Throwable d = super.d(obj);
        if (d != null) {
            return d;
        }
        return null;
    }

    @Override // defpackage.nl
    public final ad0 e(Object obj, te0 te0Var) {
        ad0 ad0Var = c01.j;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof n81) {
                Object D = D((n81) obj2, obj, this.g, te0Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    n();
                }
                return ad0Var;
            }
            return null;
        }
    }

    @Override // defpackage.i10
    public final Object f(Object obj) {
        if (obj instanceof jp) {
            return ((jp) obj).a;
        }
        return obj;
    }

    @Override // defpackage.iv
    public final iv getCallerFrame() {
        vt vtVar = this.h;
        if (vtVar instanceof iv) {
            return (iv) vtVar;
        }
        return null;
    }

    @Override // defpackage.vt
    public final xu getContext() {
        return this.i;
    }

    @Override // defpackage.nl
    public final boolean h(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z = false;
            if (!(obj instanceof n81)) {
                return false;
            }
            if ((obj instanceof kl) || (obj instanceof nt1)) {
                z = true;
            }
            rl rlVar = new rl(this, th, z);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rlVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            n81 n81Var = (n81) obj;
            if (n81Var instanceof kl) {
                j((kl) obj, th);
            } else if (n81Var instanceof nt1) {
                m((nt1) obj, th);
            }
            if (!w()) {
                n();
            }
            o(this.g);
            return true;
        }
    }

    @Override // defpackage.i10
    public final Object i() {
        return k.get(this);
    }

    public final void j(kl klVar, Throwable th) {
        try {
            switch (klVar.a) {
                case 0:
                    ((ScheduledFuture) klVar.b).cancel(false);
                    return;
                case 1:
                    ((oe0) klVar.b).invoke(th);
                    return;
                default:
                    ((q10) klVar.b).a();
                    return;
            }
        } catch (Throwable th2) {
            qo.O(this.i, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(te0 te0Var, Throwable th, Object obj) {
        xu xuVar = this.i;
        try {
            te0Var.invoke(th, obj, xuVar);
        } catch (Throwable th2) {
            qo.O(xuVar, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.nl
    public final void l(Object obj) {
        o(this.g);
    }

    public final void m(nt1 nt1Var, Throwable th) {
        xu xuVar = this.i;
        int i = j.get(this) & 536870911;
        if (i != 536870911) {
            try {
                nt1Var.g(i, xuVar);
                return;
            } catch (Throwable th2) {
                qo.O(xuVar, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        se.p("The index for Segment.onCancellation(..) is broken");
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l;
        q10 q10Var = (q10) atomicReferenceFieldUpdater.get(this);
        if (q10Var == null) {
            return;
        }
        q10Var.a();
        atomicReferenceFieldUpdater.set(this, l81.e);
    }

    public final void o(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean z;
        boolean z2;
        do {
            atomicIntegerFieldUpdater = j;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 1) {
                    boolean z3 = false;
                    if (i == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    vt vtVar = this.h;
                    if (!z && (vtVar instanceof g10)) {
                        if (i != 1 && i != 2) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        int i4 = this.g;
                        if (i4 == 1 || i4 == 2) {
                            z3 = true;
                        }
                        if (z2 == z3) {
                            g10 g10Var = (g10) vtVar;
                            zu zuVar = g10Var.h;
                            xu context = g10Var.i.getContext();
                            if (zuVar.Q(context)) {
                                zuVar.P(context, this);
                                return;
                            }
                            l70 a = r92.a();
                            if (a.g >= 4294967296L) {
                                a.T(this);
                                return;
                            }
                            a.U(true);
                            try {
                                fp.T(this, vtVar, true);
                                do {
                                } while (a.W());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        }
                    }
                    fp.T(this, vtVar, z);
                    return;
                }
                se.p("Already resumed");
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    public Throwable p(no0 no0Var) {
        return no0Var.o();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        go0 go0Var;
        boolean w = w();
        do {
            atomicIntegerFieldUpdater = j;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    if (w) {
                        z();
                    }
                    Object obj = k.get(this);
                    if (!(obj instanceof lp)) {
                        int i3 = this.g;
                        if ((i3 == 1 || i3 == 2) && (go0Var = (go0) this.i.H(g3.O)) != null && !go0Var.b()) {
                            CancellationException o = go0Var.o();
                            b(o);
                            throw o;
                        }
                        return f(obj);
                    }
                    throw ((lp) obj).a;
                }
                se.p("Already suspended");
                return null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, FileSystemManager.MODE_WRITE_ONLY + (536870911 & i)));
        if (((q10) l.get(this)) == null) {
            s();
        }
        if (w) {
            z();
        }
        return hv.e;
    }

    public final void r() {
        q10 s = s();
        if (s != null && !(k.get(this) instanceof n81)) {
            s.a();
            l.set(this, l81.e);
        }
    }

    @Override // defpackage.vt
    public final void resumeWith(Object obj) {
        Throwable a = go1.a(obj);
        if (a != null) {
            obj = new lp(a, false);
        }
        B(obj, this.g, null);
    }

    public final q10 s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        go0 go0Var = (go0) this.i.H(g3.O);
        if (go0Var == null) {
            return null;
        }
        q10 J = lo.J(go0Var, true, new um(this, 0));
        do {
            atomicReferenceFieldUpdater = l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, J)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return J;
    }

    public final void t(oe0 oe0Var) {
        u(new kl(oe0Var, 1));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(rx.N(this.h));
        sb.append("){");
        Object obj = k.get(this);
        if (obj instanceof n81) {
            str = "Active";
        } else if (obj instanceof rl) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(rx.w(this));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a0, code lost:
    
        x(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a3, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(defpackage.n81 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.pl.k
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof defpackage.z1
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto L97
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof defpackage.kl
            r3 = 0
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof defpackage.nt1
            if (r1 != 0) goto La0
            boolean r1 = r2 instanceof defpackage.lp
            if (r1 == 0) goto L4d
            r0 = r2
            lp r0 = (defpackage.lp) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.lp.b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L49
            boolean r1 = r2 instanceof defpackage.rl
            if (r1 == 0) goto L97
            java.lang.Throwable r0 = r0.a
            boolean r1 = r8 instanceof defpackage.kl
            if (r1 == 0) goto L43
            kl r8 = (defpackage.kl) r8
            r7.j(r8, r0)
            return
        L43:
            nt1 r8 = (defpackage.nt1) r8
            r7.m(r8, r0)
            return
        L49:
            x(r8, r2)
            throw r3
        L4d:
            boolean r1 = r2 instanceof defpackage.jp
            if (r1 == 0) goto L80
            r1 = r2
            jp r1 = (defpackage.jp) r1
            kl r4 = r1.b
            if (r4 != 0) goto L7c
            boolean r4 = r8 instanceof defpackage.nt1
            if (r4 == 0) goto L5d
            goto L97
        L5d:
            r4 = r8
            kl r4 = (defpackage.kl) r4
            java.lang.Throwable r5 = r1.e
            if (r5 == 0) goto L68
            r7.j(r4, r5)
            return
        L68:
            r5 = 29
            jp r1 = defpackage.jp.a(r1, r4, r3, r5)
        L6e:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L75
            goto L97
        L75:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L6e
            goto L0
        L7c:
            x(r8, r2)
            throw r3
        L80:
            boolean r1 = r8 instanceof defpackage.nt1
            if (r1 == 0) goto L85
            goto L97
        L85:
            r3 = r8
            kl r3 = (defpackage.kl) r3
            jp r1 = new jp
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L91:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L98
        L97:
            return
        L98:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L91
            goto L0
        La0:
            x(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl.u(n81):void");
    }

    public final boolean v() {
        return k.get(this) instanceof n81;
    }

    public final boolean w() {
        if (this.g == 2) {
            if (g10.l.get((g10) this.h) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        g10 g10Var;
        vt vtVar = this.h;
        Throwable th = null;
        if (vtVar instanceof g10) {
            g10Var = (g10) vtVar;
        } else {
            g10Var = null;
        }
        if (g10Var != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g10.l;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(g10Var);
                ad0 ad0Var = mp0.p;
                if (obj != ad0Var) {
                    if (!(obj instanceof Throwable)) {
                        se.t(obj, "Inconsistent state ");
                        return;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(g10Var, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(g10Var) != obj) {
                            se.h("Failed requirement.");
                            return;
                        }
                    }
                    th = (Throwable) obj;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(g10Var, ad0Var, this)) {
                    if (atomicReferenceFieldUpdater.get(g10Var) != ad0Var) {
                        break;
                    }
                }
            }
            if (th != null) {
                n();
                h(th);
            }
        }
    }
}
