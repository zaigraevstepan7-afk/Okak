package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jl1 extends xr {
    public final ja a;
    public final ld b;
    public final Object c;
    public go0 d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public j41 h;
    public final q41 i;
    public final ArrayList j;
    public final ArrayList k;
    public final i41 l;
    public final sl0 m;
    public final i41 n;
    public final i41 o;
    public ArrayList p;
    public LinkedHashSet q;
    public pl r;
    public rg2 s;
    public boolean t;
    public final r22 u;
    public final ld v;
    public final io0 w;
    public final xu x;
    public final wc0 y;
    public static final r22 z = d6.j(bg1.h);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    public jl1(xu xuVar) {
        ja jaVar = new ja(new el1(this, 0));
        this.a = jaVar;
        this.b = new ld(new el1(this, 1));
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new j41();
        this.i = new q41(new ds[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new i41();
        this.m = new sl0(18);
        this.n = new i41();
        this.o = new i41();
        this.u = d6.j(gl1.g);
        this.v = new ld(14);
        io0 io0Var = new io0((go0) xuVar.H(g3.O));
        io0Var.r(new hh1(this, 4));
        this.w = io0Var;
        this.x = xuVar.G(jaVar).G(io0Var);
        this.y = new wc0(29);
    }

    public static final void G(ArrayList arrayList, jl1 jl1Var, ds dsVar) {
        arrayList.clear();
        synchronized (jl1Var.c) {
            Iterator it = jl1Var.k.iterator();
            if (it.hasNext()) {
                ((d31) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void w(n41 n41Var) {
        try {
            if (!(n41Var.w() instanceof k02)) {
            } else {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            n41Var.c();
        }
    }

    public final boolean A() {
        if (this.i.g == 0 && !z() && !B() && !this.l.j()) {
            return false;
        }
        return true;
    }

    public final boolean B() {
        if (!this.t && (((mf) ((qg) this.b.g).c).get() & 134217727) > 0) {
            return true;
        }
        return false;
    }

    public final boolean C() {
        boolean z2;
        synchronized (this.c) {
            if (!this.h.h() && this.i.g == 0 && !z()) {
                if (!B()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    public final List D() {
        List arrayList;
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList2 = this.f;
        if (arrayList2.isEmpty()) {
            arrayList = l60.e;
        } else {
            arrayList = new ArrayList(arrayList2);
        }
        this.g = arrayList;
        return arrayList;
    }

    public final void E() {
        nl y;
        synchronized (this.c) {
            y = y();
            if (((gl1) this.u.getValue()).compareTo(gl1.f) <= 0) {
                Throwable th = this.e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (y != null) {
            ((pl) y).resumeWith(od2.a);
        }
    }

    public final void F(ds dsVar) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            if (arrayList.size() > 0) {
                ((d31) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0139, code lost:
    
        r3 = r11.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013e, code lost:
    
        if (r4 >= r3) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0148, code lost:
    
        if (((defpackage.xd1) r11.get(r4)).f == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x014a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014d, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015b, code lost:
    
        if (r9 >= r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015d, code lost:
    
        r12 = (defpackage.xd1) r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0165, code lost:
    
        if (r12.f != null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0167, code lost:
    
        r12 = (defpackage.d31) r12.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016e, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0171, code lost:
    
        r4 = r18.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0173, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0174, code lost:
    
        defpackage.wn.d0(r3, r18.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0179, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017a, code lost:
    
        r3 = new java.util.ArrayList(r11.size());
        r4 = r11.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0188, code lost:
    
        if (r9 >= r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018a, code lost:
    
        r12 = r11.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0193, code lost:
    
        if (((defpackage.xd1) r12).f == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0195, code lost:
    
        r3.add(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0198, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019b, code lost:
    
        r11 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List H(java.util.List r19, defpackage.j41 r20) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl1.H(java.util.List, j41):java.util.List");
    }

    public final ds I(ds dsVar, j41 j41Var) {
        n41 n41Var;
        n41 C;
        if (!dsVar.z.F) {
            int i = 3;
            if (dsVar.A == 3) {
                return null;
            }
            LinkedHashSet linkedHashSet = this.q;
            int i2 = 1;
            if (linkedHashSet == null || !linkedHashSet.contains(dsVar)) {
                hh1 hh1Var = new hh1(dsVar, i);
                i iVar = new i(29, dsVar, j41Var);
                i02 j = q02.j();
                if (j instanceof n41) {
                    n41Var = (n41) j;
                } else {
                    n41Var = null;
                }
                if (n41Var != null && (C = n41Var.C(hh1Var, iVar)) != null) {
                    try {
                        i02 j2 = C.j();
                        if (j41Var != null) {
                            try {
                                if (j41Var.h()) {
                                    ii1 ii1Var = new ii1(i2, j41Var, dsVar);
                                    ur urVar = dsVar.z;
                                    if (urVar.F) {
                                        vr.a("Preparing a composition while composing is not supported");
                                    }
                                    urVar.F = true;
                                    try {
                                        ii1Var.invoke();
                                        urVar.F = false;
                                    } catch (Throwable th) {
                                        urVar.F = false;
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                i02.q(j2);
                                throw th2;
                            }
                        }
                        boolean x = dsVar.x();
                        i02.q(j2);
                        if (x) {
                            return dsVar;
                        }
                    } finally {
                        w(C);
                    }
                } else {
                    se.p("Cannot create a mutable snapshot of an read-only snapshot");
                }
            }
        }
        return null;
    }

    public final void J(Throwable th, ds dsVar) {
        int i = 27;
        if (((Boolean) A.get()).booleanValue() && !(th instanceof dr)) {
            synchronized (this.c) {
                try {
                    Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                    this.j.clear();
                    this.i.g();
                    this.h = new j41();
                    this.k.clear();
                    this.l.a();
                    this.n.a();
                    this.s = new rg2(th, i);
                    if (dsVar != null) {
                        L(dsVar);
                    }
                    y();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        synchronized (this.c) {
            Log.e("ComposeInternal", "Error was captured in composition.", th);
            rg2 rg2Var = this.s;
            if (rg2Var == null) {
                this.s = new rg2(th, i);
            } else {
                throw ((Throwable) rg2Var.f);
            }
        }
        throw th;
    }

    public final boolean K() {
        boolean A2;
        synchronized (this.c) {
            if (this.h.g()) {
                return A();
            }
            List D = D();
            ur1 ur1Var = new ur1(this.h);
            this.h = new j41();
            try {
                int size = D.size();
                for (int i = 0; i < size; i++) {
                    ((ds) D.get(i)).y(ur1Var);
                    if (((gl1) this.u.getValue()).compareTo(gl1.f) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (y() == null) {
                        A2 = A();
                    } else {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                }
                return A2;
            } catch (Throwable th) {
                synchronized (this.c) {
                    j41 j41Var = this.h;
                    j41Var.getClass();
                    Iterator<E> it = ur1Var.iterator();
                    while (it.hasNext()) {
                        j41Var.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(ds dsVar) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(dsVar)) {
            arrayList.add(dsVar);
        }
        if (this.f.remove(dsVar)) {
            this.g = null;
        }
    }

    @Override // defpackage.xr
    public final void a(ds dsVar, se0 se0Var) {
        gl1 gl1Var;
        boolean z2;
        n41 n41Var;
        n41 C;
        boolean z3 = dsVar.z.F;
        synchronized (this.c) {
            gl1 gl1Var2 = (gl1) this.u.getValue();
            gl1Var = gl1.f;
            z2 = true;
            if (gl1Var2.compareTo(gl1Var) > 0) {
                z2 = true ^ D().contains(dsVar);
            }
        }
        try {
            hh1 hh1Var = new hh1(dsVar, 3);
            i iVar = new i(29, dsVar, null);
            i02 j = q02.j();
            if (j instanceof n41) {
                n41Var = (n41) j;
            } else {
                n41Var = null;
            }
            if (n41Var != null && (C = n41Var.C(hh1Var, iVar)) != null) {
                try {
                    i02 j2 = C.j();
                    try {
                        dsVar.j(se0Var);
                        synchronized (this.c) {
                            if (((gl1) this.u.getValue()).compareTo(gl1Var) > 0 && !D().contains(dsVar)) {
                                this.f.add(dsVar);
                                this.g = null;
                            }
                        }
                        if (!z3) {
                            q02.j().m();
                        }
                        try {
                            F(dsVar);
                            try {
                                dsVar.d();
                                dsVar.f();
                                if (!z3) {
                                    q02.j().m();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                J(th, null);
                                return;
                            }
                        } catch (Throwable th2) {
                            J(th2, dsVar);
                            return;
                        }
                    } finally {
                        i02.q(j2);
                    }
                } finally {
                    w(C);
                }
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        } catch (Throwable th3) {
            if (z2) {
                synchronized (this.c) {
                }
            }
            J(th3, dsVar);
        }
    }

    @Override // defpackage.xr
    public final j41 b(ds dsVar, se seVar, se0 se0Var) {
        ld ldVar = this.v;
        try {
            se seVar2 = dsVar.t;
            dsVar.t = seVar;
            try {
                a(dsVar, se0Var);
                j41 j41Var = (j41) ldVar.g();
                if (j41Var == null) {
                    j41Var = tr1.a;
                    j41Var.getClass();
                }
                return j41Var;
            } finally {
                dsVar.t = seVar2;
            }
        } finally {
            ldVar.q(null);
        }
    }

    @Override // defpackage.xr
    public final boolean d() {
        return ((Boolean) A.get()).booleanValue();
    }

    @Override // defpackage.xr
    public final boolean e() {
        return false;
    }

    @Override // defpackage.xr
    public final boolean f() {
        return false;
    }

    @Override // defpackage.xr
    public final long g() {
        return 1000L;
    }

    @Override // defpackage.xr
    public final wr h() {
        return null;
    }

    @Override // defpackage.xr
    public final xu j() {
        return this.x;
    }

    @Override // defpackage.xr
    public final boolean k() {
        return false;
    }

    @Override // defpackage.xr
    public final void l(ds dsVar) {
        nl nlVar;
        synchronized (this.c) {
            if (!this.i.h(dsVar)) {
                this.i.b(dsVar);
                nlVar = y();
            } else {
                nlVar = null;
            }
        }
        if (nlVar != null) {
            ((pl) nlVar).resumeWith(od2.a);
        }
    }

    @Override // defpackage.xr
    public final c31 m(d31 d31Var) {
        c31 c31Var;
        synchronized (this.c) {
            c31Var = (c31) this.n.k(d31Var);
        }
        return c31Var;
    }

    @Override // defpackage.xr
    public final j41 n(ds dsVar, se seVar, j41 j41Var) {
        ld ldVar = this.v;
        try {
            K();
            dsVar.y(new ur1(j41Var));
            se seVar2 = dsVar.t;
            dsVar.t = seVar;
            try {
                ds I = I(dsVar, null);
                if (I != null) {
                    F(dsVar);
                    I.d();
                    I.f();
                }
                j41 j41Var2 = (j41) ldVar.g();
                if (j41Var2 == null) {
                    j41Var2 = tr1.a;
                    j41Var2.getClass();
                }
                return j41Var2;
            } finally {
                dsVar.t = seVar2;
            }
        } finally {
            ldVar.q(null);
        }
    }

    @Override // defpackage.xr
    public final void q(dl1 dl1Var) {
        ld ldVar = this.v;
        j41 j41Var = (j41) ldVar.g();
        if (j41Var == null) {
            j41 j41Var2 = tr1.a;
            j41Var = new j41();
            ldVar.q(j41Var);
        }
        j41Var.a(dl1Var);
    }

    @Override // defpackage.xr
    public final void r(ds dsVar) {
        synchronized (this.c) {
            try {
                LinkedHashSet linkedHashSet = this.q;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.q = linkedHashSet;
                }
                linkedHashSet.add(dsVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [pg, java.lang.Object, s71] */
    @Override // defpackage.xr
    public final ql s(s8 s8Var) {
        ld ldVar = this.b;
        qg qgVar = (qg) ldVar.g;
        ?? obj = new Object();
        obj.a = s8Var;
        return qgVar.d(obj, (j1) ldVar.h);
    }

    @Override // defpackage.xr
    public final void v(ds dsVar) {
        synchronized (this.c) {
            if (this.f.remove(dsVar)) {
                this.g = null;
            }
            this.i.j(dsVar);
            this.j.remove(dsVar);
        }
    }

    public final void x() {
        synchronized (this.c) {
            if (((gl1) this.u.getValue()).compareTo(gl1.i) >= 0) {
                r22 r22Var = this.u;
                gl1 gl1Var = gl1.f;
                r22Var.getClass();
                r22Var.k(null, gl1Var);
            }
        }
        this.w.c(null);
    }

    public final nl y() {
        r22 r22Var = this.u;
        int compareTo = ((gl1) r22Var.getValue()).compareTo(gl1.f);
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        q41 q41Var = this.i;
        if (compareTo <= 0) {
            List D = D();
            int size = D.size();
            for (int i = 0; i < size; i++) {
            }
            this.f.clear();
            this.g = l60.e;
            this.h = new j41();
            q41Var.g();
            arrayList2.clear();
            arrayList.clear();
            this.p = null;
            pl plVar = this.r;
            if (plVar != null) {
                plVar.h(null);
            }
            this.r = null;
            this.s = null;
            return null;
        }
        rg2 rg2Var = this.s;
        gl1 gl1Var = gl1.j;
        gl1 gl1Var2 = gl1.g;
        if (rg2Var == null) {
            if (this.d == null) {
                this.h = new j41();
                q41Var.g();
                if (z() || B()) {
                    gl1Var2 = gl1.h;
                }
            } else {
                gl1Var2 = (q41Var.g != 0 || this.h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || z() || B() || this.l.j()) ? gl1Var : gl1.i;
            }
        }
        r22Var.k(null, gl1Var2);
        if (gl1Var2 != gl1Var) {
            return null;
        }
        pl plVar2 = this.r;
        this.r = null;
        return plVar2;
    }

    public final boolean z() {
        if (!this.t && (((mf) ((qg) this.a.g).c).get() & 134217727) > 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.xr
    public final void o(Set set) {
    }
}
