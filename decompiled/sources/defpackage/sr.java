package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sr extends xr {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final je1 f = new je1(sf1.h, xl1.f);
    public final /* synthetic */ ur g;

    public sr(ur urVar, long j, boolean z, boolean z2, rg2 rg2Var) {
        this.g = urVar;
        this.a = j;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.xr
    public final void a(ds dsVar, se0 se0Var) {
        this.g.b.a(dsVar, se0Var);
    }

    @Override // defpackage.xr
    public final j41 b(ds dsVar, se seVar, se0 se0Var) {
        return this.g.b.b(dsVar, seVar, se0Var);
    }

    @Override // defpackage.xr
    public final void c() {
        ur urVar = this.g;
        urVar.A--;
    }

    @Override // defpackage.xr
    public final boolean d() {
        return this.g.b.d();
    }

    @Override // defpackage.xr
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.xr
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.xr
    public final long g() {
        return this.a;
    }

    @Override // defpackage.xr
    public final wr h() {
        return this.g.h;
    }

    @Override // defpackage.xr
    public final sf1 i() {
        return (sf1) this.f.getValue();
    }

    @Override // defpackage.xr
    public final xu j() {
        return this.g.b.j();
    }

    @Override // defpackage.xr
    public final boolean k() {
        return this.g.b.k();
    }

    @Override // defpackage.xr
    public final void l(ds dsVar) {
        ur urVar = this.g;
        urVar.b.l(urVar.h);
        urVar.b.l(dsVar);
    }

    @Override // defpackage.xr
    public final c31 m(d31 d31Var) {
        return this.g.b.m(d31Var);
    }

    @Override // defpackage.xr
    public final j41 n(ds dsVar, se seVar, j41 j41Var) {
        return this.g.b.n(dsVar, seVar, j41Var);
    }

    @Override // defpackage.xr
    public final void o(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.xr
    public final void p(ur urVar) {
        this.e.add(urVar);
    }

    @Override // defpackage.xr
    public final void q(dl1 dl1Var) {
        this.g.b.q(dl1Var);
    }

    @Override // defpackage.xr
    public final void r(ds dsVar) {
        this.g.b.r(dsVar);
    }

    @Override // defpackage.xr
    public final ql s(s8 s8Var) {
        return this.g.b.s(s8Var);
    }

    @Override // defpackage.xr
    public final void t() {
        this.g.A++;
    }

    @Override // defpackage.xr
    public final void u(ur urVar) {
        HashSet hashSet = this.d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                urVar.getClass();
                set.remove(urVar.w());
            }
        }
        LinkedHashSet linkedHashSet = this.e;
        if ((linkedHashSet instanceof xo0) && !(linkedHashSet instanceof yo0)) {
            fc2.J(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        }
        linkedHashSet.remove(urVar);
    }

    @Override // defpackage.xr
    public final void v(ds dsVar) {
        this.g.b.v(dsVar);
    }

    public final void w() {
        LinkedHashSet<ur> linkedHashSet = this.e;
        if (!linkedHashSet.isEmpty()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                for (ur urVar : linkedHashSet) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(urVar.w());
                    }
                }
            }
            linkedHashSet.clear();
        }
    }
}
