package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class no0 implements go0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(no0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(no0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public no0(boolean z) {
        g60 g60Var;
        if (z) {
            g60Var = d6.r;
        } else {
            g60Var = d6.q;
        }
        this._state$volatile = g60Var;
    }

    public static wm U(lx0 lx0Var) {
        while (lx0Var.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = lx0.f;
            lx0 f2 = lx0Var.f();
            if (f2 == null) {
                Object obj = atomicReferenceFieldUpdater.get(lx0Var);
                while (true) {
                    lx0Var = (lx0) obj;
                    if (!lx0Var.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lx0Var);
                }
            } else {
                lx0Var = f2;
            }
        }
        while (true) {
            lx0Var = lx0Var.h();
            if (!lx0Var.i()) {
                if (lx0Var instanceof wm) {
                    return (wm) lx0Var;
                }
                if (lx0Var instanceof g81) {
                    return null;
                }
            }
        }
    }

    public static String b0(Object obj) {
        if (obj instanceof mo0) {
            mo0 mo0Var = (mo0) obj;
            if (mo0Var.e()) {
                return "Cancelling";
            }
            if (mo0.f.get(mo0Var) == 0) {
                return "Active";
            }
            return "Completing";
        }
        if (obj instanceof rj0) {
            if (((rj0) obj).b()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof lp) {
            return "Cancelled";
        }
        return "Completed";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable B(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        no0 no0Var = (no0) obj;
        Object obj2 = e.get(no0Var);
        CancellationException cancellationException2 = null;
        if (obj2 instanceof mo0) {
            cancellationException = ((mo0) obj2).c();
        } else if (obj2 instanceof lp) {
            cancellationException = ((lp) obj2).a;
        } else if (!(obj2 instanceof rj0)) {
            cancellationException = null;
        } else {
            se.t(obj2, "Cannot be cancelling child in this state: ");
            return null;
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            return new ho0("Parent job is ".concat(b0(obj2)), cancellationException, no0Var);
        }
        return cancellationException2;
    }

    public final Object C(mo0 mo0Var, Object obj) {
        lp lpVar;
        Throwable D;
        Object obj2;
        Throwable th = null;
        if (obj instanceof lp) {
            lpVar = (lp) obj;
        } else {
            lpVar = null;
        }
        if (lpVar != null) {
            th = lpVar.a;
        }
        synchronized (mo0Var) {
            mo0Var.e();
            ArrayList<Throwable> f2 = mo0Var.f(th);
            D = D(mo0Var, f2);
            if (D != null && f2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f2.size()));
                for (Throwable th2 : f2) {
                    if (th2 != D && th2 != D && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        qo.g(D, th2);
                    }
                }
            }
        }
        if (D != null && D != th) {
            obj = new lp(D, false);
        }
        if (D != null && (w(D) || J(D))) {
            obj.getClass();
            lp.b.compareAndSet((lp) obj, 0, 1);
        }
        W(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        if (obj instanceof rj0) {
            obj2 = new sj0((rj0) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, mo0Var, obj2) && atomicReferenceFieldUpdater.get(this) == mo0Var) {
        }
        z(mo0Var, obj);
        return obj;
    }

    public final Throwable D(mo0 mo0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!mo0Var.e()) {
                return null;
            }
            return new ho0(x(), null, this);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof fa2) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof fa2)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean E() {
        return true;
    }

    public boolean F() {
        return this instanceof ip;
    }

    @Override // defpackage.xu
    public final xu G(xu xuVar) {
        return go.M(this, xuVar);
    }

    @Override // defpackage.xu
    public final vu H(wu wuVar) {
        return go.D(this, wuVar);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [g81, lx0] */
    public final g81 I(rj0 rj0Var) {
        g81 d = rj0Var.d();
        if (d == null) {
            if (rj0Var instanceof g60) {
                return new lx0();
            }
            if (rj0Var instanceof jo0) {
                Z((jo0) rj0Var);
                return null;
            }
            se.t(rj0Var, "State should have list: ");
            return null;
        }
        return d;
    }

    public boolean J(Throwable th) {
        return false;
    }

    public final void L(go0 go0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        l81 l81Var = l81.e;
        if (go0Var == null) {
            atomicReferenceFieldUpdater.set(this, l81Var);
            return;
        }
        go0Var.start();
        vm i = go0Var.i(this);
        atomicReferenceFieldUpdater.set(this, i);
        if (P()) {
            i.a();
            atomicReferenceFieldUpdater.set(this, l81Var);
        }
    }

    @Override // defpackage.go0
    public final Object M(wt wtVar) {
        Object obj;
        od2 od2Var;
        do {
            obj = e.get(this);
            boolean z = obj instanceof rj0;
            od2Var = od2.a;
            if (!z) {
                lo.u(wtVar.getContext());
                return od2Var;
            }
        } while (a0(obj) < 0);
        pl plVar = new pl(1, go.F(wtVar));
        plVar.r();
        plVar.u(new kl(lo.J(this, true, new um(plVar, 1)), 2));
        Object q = plVar.q();
        hv hvVar = hv.e;
        if (q != hvVar) {
            q = od2Var;
        }
        if (q == hvVar) {
            return q;
        }
        return od2Var;
    }

    public final q10 N(boolean z, jo0 jo0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        l81 l81Var;
        boolean z2;
        Throwable th;
        lp lpVar;
        boolean e2;
        mo0 mo0Var;
        Throwable th2;
        jo0Var.h = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof g60;
            l81Var = l81.e;
            z2 = true;
            th = null;
            if (z3) {
                g60 g60Var = (g60) obj;
                if (g60Var.e) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, jo0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                Y(g60Var);
            } else if (obj instanceof rj0) {
                rj0 rj0Var = (rj0) obj;
                g81 d = rj0Var.d();
                if (d == null) {
                    Z((jo0) obj);
                } else {
                    if (jo0Var.k()) {
                        if (rj0Var instanceof mo0) {
                            mo0Var = (mo0) rj0Var;
                        } else {
                            mo0Var = null;
                        }
                        if (mo0Var != null) {
                            th2 = mo0Var.c();
                        } else {
                            th2 = null;
                        }
                        if (th2 == null) {
                            e2 = d.e(jo0Var, 5);
                        } else if (z) {
                            jo0Var.l(th2);
                            return l81Var;
                        }
                    } else {
                        e2 = d.e(jo0Var, 1);
                    }
                    if (e2) {
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            return jo0Var;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof lp) {
                lpVar = (lp) obj2;
            } else {
                lpVar = null;
            }
            if (lpVar != null) {
                th = lpVar.a;
            }
            jo0Var.l(th);
        }
        return l81Var;
    }

    @Override // defpackage.go0
    public final q10 O(boolean z, boolean z2, k kVar) {
        jo0 t10Var;
        if (z) {
            t10Var = new co0(kVar);
        } else {
            t10Var = new t10(kVar, 1);
        }
        return N(z2, t10Var);
    }

    public final boolean P() {
        return !(e.get(this) instanceof rj0);
    }

    public boolean Q() {
        return this instanceof qi;
    }

    public final boolean R(Object obj) {
        Object c0;
        do {
            c0 = c0(e.get(this), obj);
            if (c0 == d6.l) {
                return false;
            }
            if (c0 == d6.m) {
                return true;
            }
        } while (c0 == d6.n);
        m(c0);
        return true;
    }

    public final Object S(Object obj) {
        Object c0;
        lp lpVar;
        do {
            c0 = c0(e.get(this), obj);
            if (c0 == d6.l) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof lp) {
                    lpVar = (lp) obj;
                } else {
                    lpVar = null;
                }
                if (lpVar != null) {
                    th = lpVar.a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (c0 == d6.n);
        return c0;
    }

    public String T() {
        return getClass().getSimpleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, mp] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final void V(g81 g81Var, Throwable th) {
        g81Var.e(new wv0(4), 4);
        Object obj = lx0.e.get(g81Var);
        obj.getClass();
        lx0 lx0Var = (lx0) obj;
        mp mpVar = 0;
        while (!lx0Var.equals(g81Var)) {
            if ((lx0Var instanceof jo0) && ((jo0) lx0Var).k()) {
                try {
                    ((jo0) lx0Var).l(th);
                } catch (Throwable th2) {
                    if (mpVar != 0) {
                        qo.g(mpVar, th2);
                    } else {
                        mpVar = new RuntimeException("Exception in completion handler " + lx0Var + " for " + this, th2);
                    }
                }
            }
            lx0Var = lx0Var.h();
            mpVar = mpVar;
        }
        if (mpVar != 0) {
            K(mpVar);
        }
        w(th);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g81, lx0] */
    public final void Y(g60 g60Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? lx0Var = new lx0();
        qj0 qj0Var = lx0Var;
        if (!g60Var.e) {
            qj0Var = new qj0(lx0Var);
        }
        do {
            atomicReferenceFieldUpdater = e;
            if (atomicReferenceFieldUpdater.compareAndSet(this, g60Var, qj0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == g60Var);
    }

    public final void Z(jo0 jo0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        lx0 lx0Var = new lx0();
        jo0Var.getClass();
        lx0.f.set(lx0Var, jo0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = lx0.e;
        atomicReferenceFieldUpdater2.set(lx0Var, jo0Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(jo0Var) != jo0Var) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(jo0Var, jo0Var, lx0Var)) {
                if (atomicReferenceFieldUpdater2.get(jo0Var) != jo0Var) {
                    break;
                }
            }
            lx0Var.g(jo0Var);
        }
        lx0 h = jo0Var.h();
        do {
            atomicReferenceFieldUpdater = e;
            if (atomicReferenceFieldUpdater.compareAndSet(this, jo0Var, h)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == jo0Var);
    }

    public final int a0(Object obj) {
        boolean z = obj instanceof g60;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        if (z) {
            if (!((g60) obj).e) {
                g60 g60Var = d6.r;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g60Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        return -1;
                    }
                }
                X();
                return 1;
            }
            return 0;
        }
        if (obj instanceof qj0) {
            g81 g81Var = ((qj0) obj).e;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g81Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            X();
            return 1;
        }
        return 0;
    }

    @Override // defpackage.go0
    public boolean b() {
        Object obj = e.get(this);
        if ((obj instanceof rj0) && ((rj0) obj).b()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.go0, defpackage.dm
    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new ho0(x(), null, this);
        }
        v(cancellationException);
    }

    public final Object c0(Object obj, Object obj2) {
        Object obj3;
        mo0 mo0Var;
        boolean z;
        lp lpVar;
        if (!(obj instanceof rj0)) {
            return d6.l;
        }
        if (((obj instanceof g60) || (obj instanceof jo0)) && !(obj instanceof wm) && !(obj2 instanceof lp)) {
            rj0 rj0Var = (rj0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            if (obj2 instanceof rj0) {
                obj3 = new sj0((rj0) obj2);
            } else {
                obj3 = obj2;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, rj0Var, obj3)) {
                if (atomicReferenceFieldUpdater.get(this) != rj0Var) {
                    return d6.n;
                }
            }
            W(obj2);
            z(rj0Var, obj2);
            return obj2;
        }
        rj0 rj0Var2 = (rj0) obj;
        g81 I = I(rj0Var2);
        if (I == null) {
            return d6.n;
        }
        Throwable th = null;
        if (rj0Var2 instanceof mo0) {
            mo0Var = (mo0) rj0Var2;
        } else {
            mo0Var = null;
        }
        if (mo0Var == null) {
            mo0Var = new mo0(I, null);
        }
        synchronized (mo0Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = mo0.f;
            if (atomicIntegerFieldUpdater.get(mo0Var) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return d6.l;
            }
            atomicIntegerFieldUpdater.set(mo0Var, 1);
            if (mo0Var != rj0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = e;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, rj0Var2, mo0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != rj0Var2) {
                        return d6.n;
                    }
                }
            }
            boolean e2 = mo0Var.e();
            if (obj2 instanceof lp) {
                lpVar = (lp) obj2;
            } else {
                lpVar = null;
            }
            if (lpVar != null) {
                mo0Var.a(lpVar.a);
            }
            Throwable c = mo0Var.c();
            if (!e2) {
                th = c;
            }
            if (th != null) {
                V(I, th);
            }
            wm U = U(I);
            if (U != null && d0(mo0Var, U, obj2)) {
                return d6.m;
            }
            I.e(new wv0(2), 2);
            wm U2 = U(I);
            if (U2 != null && d0(mo0Var, U2, obj2)) {
                return d6.m;
            }
            return C(mo0Var, obj2);
        }
    }

    public final boolean d0(mo0 mo0Var, wm wmVar, Object obj) {
        while (lo.J(wmVar.i, false, new lo0(this, mo0Var, wmVar, obj)) == l81.e) {
            wmVar = U(wmVar);
            if (wmVar == null) {
                return false;
            }
        }
        return true;
    }

    public Object g(uw0 uw0Var) {
        return q(uw0Var);
    }

    @Override // defpackage.vu
    public final wu getKey() {
        return g3.O;
    }

    @Override // defpackage.go0
    public final vm i(no0 no0Var) {
        lp lpVar;
        lp lpVar2;
        wm wmVar = new wm(no0Var);
        wmVar.h = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof g60) {
                g60 g60Var = (g60) obj;
                if (g60Var.e) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, wmVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                Y(g60Var);
            } else {
                boolean z = obj instanceof rj0;
                l81 l81Var = l81.e;
                Throwable th = null;
                if (z) {
                    g81 d = ((rj0) obj).d();
                    if (d == null) {
                        Z((jo0) obj);
                    } else if (!d.e(wmVar, 7)) {
                        boolean e2 = d.e(wmVar, 3);
                        Object obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof mo0) {
                            th = ((mo0) obj2).c();
                        } else {
                            if (obj2 instanceof lp) {
                                lpVar2 = (lp) obj2;
                            } else {
                                lpVar2 = null;
                            }
                            if (lpVar2 != null) {
                                th = lpVar2.a;
                            }
                        }
                        wmVar.l(th);
                        if (e2) {
                            break loop0;
                        }
                        return l81Var;
                    }
                } else {
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof lp) {
                        lpVar = (lp) obj3;
                    } else {
                        lpVar = null;
                    }
                    if (lpVar != null) {
                        th = lpVar.a;
                    }
                    wmVar.l(th);
                    return l81Var;
                }
            }
        }
        return wmVar;
    }

    @Override // defpackage.go0
    public final boolean isCancelled() {
        Object obj = e.get(this);
        if (!(obj instanceof lp)) {
            if (!(obj instanceof mo0) || !((mo0) obj).e()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void n(Object obj) {
        m(obj);
    }

    @Override // defpackage.go0
    public final CancellationException o() {
        Object obj = e.get(this);
        CancellationException cancellationException = null;
        if (obj instanceof mo0) {
            Throwable c = ((mo0) obj).c();
            if (c != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c instanceof CancellationException) {
                    cancellationException = (CancellationException) c;
                }
                if (cancellationException == null) {
                    return new ho0(concat, c, this);
                }
                return cancellationException;
            }
            se.t(this, "Job is still new or active: ");
            return null;
        }
        if (!(obj instanceof rj0)) {
            if (obj instanceof lp) {
                Throwable th = ((lp) obj).a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new ho0(x(), th, this);
                }
                return cancellationException;
            }
            return new ho0(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        se.t(this, "Job is still new or active: ");
        return null;
    }

    @Override // defpackage.xu
    public final Object p(se0 se0Var, Object obj) {
        return se0Var.invoke(obj, this);
    }

    public final Object q(wt wtVar) {
        Object obj;
        do {
            obj = e.get(this);
            if (!(obj instanceof rj0)) {
                if (!(obj instanceof lp)) {
                    return d6.G(obj);
                }
                throw ((lp) obj).a;
            }
        } while (a0(obj) < 0);
        ko0 ko0Var = new ko0(go.F(wtVar), this);
        ko0Var.r();
        int i = 2;
        ko0Var.u(new kl(lo.J(this, true, new t10(ko0Var, i)), i));
        return ko0Var.q();
    }

    @Override // defpackage.go0
    public final q10 r(oe0 oe0Var) {
        return N(true, new t10(oe0Var, 1));
    }

    @Override // defpackage.xu
    public final xu s(wu wuVar) {
        return go.I(this, wuVar);
    }

    @Override // defpackage.go0
    public final boolean start() {
        int a0;
        do {
            a0 = a0(e.get(this));
            if (a0 == 0) {
                return false;
            }
        } while (a0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(T() + AbstractJsonLexerKt.BEGIN_OBJ + b0(e.get(this)) + AbstractJsonLexerKt.END_OBJ);
        sb.append('@');
        sb.append(rx.w(this));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        r0 = defpackage.d6.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0 != defpackage.d6.m) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r0 = c0(r0, new defpackage.lp(B(r10), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r0 == defpackage.d6.n) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r0 != defpackage.d6.l) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        r4 = defpackage.no0.e;
        r5 = r4.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if ((r5 instanceof defpackage.mo0) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if ((r5 instanceof defpackage.rj0) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r1 != null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        r1 = B(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        r6 = (defpackage.rj0) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (F() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        if (r6.b() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c2, code lost:
    
        r4 = c0(r5, new defpackage.lp(r1, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cd, code lost:
    
        if (r4 == defpackage.d6.l) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d1, code lost:
    
        if (r4 == defpackage.d6.n) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = defpackage.no0.e.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d5, code lost:
    
        defpackage.se.t(r5, "Cannot happen in ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a3, code lost:
    
        r7 = I(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        if (r7 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00aa, code lost:
    
        r8 = new defpackage.mo0(r7, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        if (r4.compareAndSet(r9, r6, r8) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r0 instanceof defpackage.rj0) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bf, code lost:
    
        if (r4.get(r9) == r6) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b5, code lost:
    
        V(r7, r1);
        r10 = defpackage.d6.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x005f, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00db, code lost:
    
        r10 = defpackage.d6.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x004e, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x005a, code lost:
    
        if (defpackage.mo0.h.get((defpackage.mo0) r5) != defpackage.d6.p) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x005c, code lost:
    
        r10 = defpackage.d6.o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x005e, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0064, code lost:
    
        r4 = ((defpackage.mo0) r5).e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x006b, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006d, code lost:
    
        r1 = B(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if ((r0 instanceof defpackage.mo0) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0071, code lost:
    
        ((defpackage.mo0) r5).a(r1);
        r10 = ((defpackage.mo0) r5).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x007e, code lost:
    
        if (r4 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0080, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0081, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0082, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0084, code lost:
    
        V(((defpackage.mo0) r5).e, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x008b, code lost:
    
        r10 = defpackage.d6.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e0, code lost:
    
        if (r0 != defpackage.d6.l) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e5, code lost:
    
        if (r0 != defpackage.d6.m) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ea, code lost:
    
        if (r0 != defpackage.d6.o) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00ec, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ed, code lost:
    
        m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f0, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (defpackage.mo0.f.get((defpackage.mo0) r0) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean u(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no0.u(java.lang.Object):boolean");
    }

    public void v(CancellationException cancellationException) {
        u(cancellationException);
    }

    public final boolean w(Throwable th) {
        if (!Q()) {
            boolean z = th instanceof CancellationException;
            vm vmVar = (vm) f.get(this);
            if (vmVar != null && vmVar != l81.e) {
                if (!vmVar.c(th) && !z) {
                    return false;
                }
                return true;
            }
            return z;
        }
        return true;
    }

    public String x() {
        return "Job was cancelled";
    }

    public boolean y(Throwable th) {
        if (!(th instanceof CancellationException)) {
            if (u(th) && E()) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [mp, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, mp] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final void z(rj0 rj0Var, Object obj) {
        lp lpVar;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
        vm vmVar = (vm) atomicReferenceFieldUpdater.get(this);
        if (vmVar != null) {
            vmVar.a();
            atomicReferenceFieldUpdater.set(this, l81.e);
        }
        mp mpVar = 0;
        if (obj instanceof lp) {
            lpVar = (lp) obj;
        } else {
            lpVar = null;
        }
        if (lpVar != null) {
            th = lpVar.a;
        } else {
            th = null;
        }
        if (rj0Var instanceof jo0) {
            try {
                ((jo0) rj0Var).l(th);
                return;
            } catch (Throwable th2) {
                K(new RuntimeException("Exception in completion handler " + rj0Var + " for " + this, th2));
                return;
            }
        }
        g81 d = rj0Var.d();
        if (d != null) {
            d.e(new wv0(1), 1);
            Object obj2 = lx0.e.get(d);
            obj2.getClass();
            lx0 lx0Var = (lx0) obj2;
            while (!lx0Var.equals(d)) {
                if (lx0Var instanceof jo0) {
                    try {
                        ((jo0) lx0Var).l(th);
                    } catch (Throwable th3) {
                        if (mpVar != 0) {
                            qo.g(mpVar, th3);
                        } else {
                            mpVar = new RuntimeException("Exception in completion handler " + lx0Var + " for " + this, th3);
                        }
                    }
                }
                lx0Var = lx0Var.h();
                mpVar = mpVar;
            }
            if (mpVar != 0) {
                K(mpVar);
            }
        }
    }

    public void X() {
    }

    public void K(mp mpVar) {
        throw mpVar;
    }

    public void W(Object obj) {
    }

    public void m(Object obj) {
    }
}
