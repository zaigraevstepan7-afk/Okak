package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kk implements bh2 {
    public Object e = nk.p;
    public pl f;
    public final /* synthetic */ lk g;

    public kk(lk lkVar) {
        this.g = lkVar;
    }

    @Override // defpackage.bh2
    public final void a(nt1 nt1Var, int i) {
        pl plVar = this.f;
        if (plVar != null) {
            plVar.a(nt1Var, i);
        }
    }

    public final Object b(wt wtVar) {
        om omVar;
        Object obj = this.e;
        boolean z = true;
        if (obj == nk.p || obj == nk.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = lk.k;
            lk lkVar = this.g;
            om omVar2 = (om) atomicReferenceFieldUpdater.get(lkVar);
            while (true) {
                lkVar.getClass();
                if (lkVar.t(lk.f.get(lkVar), true)) {
                    this.e = nk.l;
                    Throwable o = lkVar.o();
                    if (o == null) {
                        z = false;
                    } else {
                        int i = h22.a;
                        throw o;
                    }
                } else {
                    long andIncrement = lk.g.getAndIncrement(lkVar);
                    long j = nk.b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (omVar2.c != j2) {
                        omVar = lkVar.n(j2, omVar2);
                        if (omVar == null) {
                            continue;
                        }
                    } else {
                        omVar = omVar2;
                    }
                    Object C = lkVar.C(omVar, i2, andIncrement, null);
                    ad0 ad0Var = nk.m;
                    if (C != ad0Var) {
                        ad0 ad0Var2 = nk.o;
                        if (C == ad0Var2) {
                            if (andIncrement < lkVar.r()) {
                                omVar.a();
                            }
                            omVar2 = omVar;
                        } else {
                            if (C == nk.n) {
                                lk lkVar2 = this.g;
                                pl z2 = c01.z(go.F(wtVar));
                                try {
                                    this.f = z2;
                                    Object C2 = lkVar2.C(omVar, i2, andIncrement, this);
                                    if (C2 == ad0Var) {
                                        a(omVar, i2);
                                    } else {
                                        if (C2 == ad0Var2) {
                                            if (andIncrement < lkVar2.r()) {
                                                omVar.a();
                                            }
                                            om omVar3 = (om) lk.k.get(lkVar2);
                                            while (true) {
                                                if (lkVar2.t(lk.f.get(lkVar2), true)) {
                                                    pl plVar = this.f;
                                                    plVar.getClass();
                                                    this.f = null;
                                                    this.e = nk.l;
                                                    Throwable o2 = lkVar.o();
                                                    if (o2 == null) {
                                                        plVar.resumeWith(Boolean.FALSE);
                                                    } else {
                                                        plVar.resumeWith(new fo1(o2));
                                                    }
                                                } else {
                                                    long andIncrement2 = lk.g.getAndIncrement(lkVar2);
                                                    long j3 = nk.b;
                                                    long j4 = andIncrement2 / j3;
                                                    int i3 = (int) (andIncrement2 % j3);
                                                    if (omVar3.c != j4) {
                                                        om n = lkVar2.n(j4, omVar3);
                                                        if (n != null) {
                                                            omVar3 = n;
                                                        }
                                                    }
                                                    Object C3 = lkVar2.C(omVar3, i3, andIncrement2, this);
                                                    if (C3 == nk.m) {
                                                        a(omVar3, i3);
                                                        break;
                                                    }
                                                    if (C3 == nk.o) {
                                                        if (andIncrement2 < lkVar2.r()) {
                                                            omVar3.a();
                                                        }
                                                    } else if (C3 != nk.n) {
                                                        omVar3.a();
                                                        this.e = C3;
                                                        this.f = null;
                                                    } else {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                }
                                            }
                                        } else {
                                            omVar.a();
                                            this.e = C2;
                                            this.f = null;
                                        }
                                        z2.A(Boolean.TRUE, null);
                                    }
                                    return z2.q();
                                } catch (Throwable th) {
                                    z2.z();
                                    throw th;
                                }
                            }
                            omVar.a();
                            this.e = C;
                        }
                    } else {
                        se.p("unreachable");
                        return null;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.e;
        ad0 ad0Var = nk.p;
        if (obj != ad0Var) {
            this.e = ad0Var;
            if (obj != nk.l) {
                return obj;
            }
            Throwable p = this.g.p();
            int i = h22.a;
            throw p;
        }
        se.p("`hasNext()` has not been invoked");
        return null;
    }
}
