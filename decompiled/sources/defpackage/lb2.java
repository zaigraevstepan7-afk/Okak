package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class lb2 {
    public final ir a;
    public final lb2 b;
    public final String c;
    public final je1 d;
    public final je1 e;
    public final he1 f = new he1(0);
    public final he1 g = new he1(Long.MIN_VALUE);
    public final je1 h;
    public final a12 i;
    public final a12 j;
    public final je1 k;
    public final j00 l;

    public lb2(ir irVar, lb2 lb2Var, String str) {
        this.a = irVar;
        this.b = lb2Var;
        this.c = str;
        this.d = fr1.k(irVar.c());
        this.e = fr1.k(new jb2(irVar.c(), irVar.c()));
        Boolean bool = Boolean.FALSE;
        this.h = fr1.k(bool);
        this.i = new a12();
        this.j = new a12();
        this.k = fr1.k(bool);
        this.l = fr1.h(new fb2(this, 1));
        irVar.g(this);
    }

    public final void a(Object obj, ur urVar, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        boolean h;
        int i4;
        urVar.Y(-1493585151);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = urVar.f(obj);
            } else {
                h = urVar.h(obj);
            }
            if (h) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.f(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        boolean z3 = true;
        int i5 = 0;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            if (!g()) {
                urVar.X(466062241);
                p(obj);
                int i6 = i2 & 112;
                if (i6 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object L = urVar.L();
                xl1 xl1Var = or.a;
                if (z2 || L == xl1Var) {
                    L = fr1.h(new fb2(this, i5));
                    urVar.h0(L);
                }
                if (((Boolean) ((o22) L).getValue()).booleanValue()) {
                    urVar.X(466470356);
                    Object L2 = urVar.L();
                    if (L2 == xl1Var) {
                        L2 = bf.K(urVar);
                        urVar.h0(L2);
                    }
                    gv gvVar = (gv) L2;
                    boolean h2 = urVar.h(gvVar);
                    if (i6 != 32) {
                        z3 = false;
                    }
                    boolean z4 = h2 | z3;
                    Object L3 = urVar.L();
                    if (z4 || L3 == xl1Var) {
                        L3 = new fl1(9, gvVar, this);
                        urVar.h0(L3);
                    }
                    bf.e(gvVar, this, (oe0) L3, urVar);
                } else {
                    urVar.X(416369985);
                }
                urVar.p(false);
            } else {
                urVar.X(416369985);
            }
            urVar.p(false);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new cq(this, i, 8, obj);
        }
    }

    public final long b() {
        a12 a12Var = this.i;
        int size = a12Var.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((kb2) a12Var.get(i)).p.g());
        }
        a12 a12Var2 = this.j;
        int size2 = a12Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, ((lb2) a12Var2.get(i2)).b());
        }
        return j;
    }

    public final void c() {
        a12 a12Var = this.i;
        int size = a12Var.size();
        for (int i = 0; i < size; i++) {
            kb2 kb2Var = (kb2) a12Var.get(i);
            kb2Var.j = null;
            kb2Var.i = null;
            kb2Var.m = false;
        }
        a12 a12Var2 = this.j;
        int size2 = a12Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((lb2) a12Var2.get(i2)).c();
        }
    }

    public final boolean d() {
        a12 a12Var = this.i;
        int size = a12Var.size();
        for (int i = 0; i < size; i++) {
            if (((kb2) a12Var.get(i)).i != null) {
                return true;
            }
        }
        a12 a12Var2 = this.j;
        int size2 = a12Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((lb2) a12Var2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        lb2 lb2Var = this.b;
        if (lb2Var != null) {
            return lb2Var.e();
        }
        return this.f.g();
    }

    public final ib2 f() {
        return (ib2) this.e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final void h(long j, boolean z) {
        long j2;
        he1 he1Var = this.g;
        long g = he1Var.g();
        ir irVar = this.a;
        if (g == Long.MIN_VALUE) {
            he1Var.h(j);
            ((je1) irVar.a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((je1) irVar.a).getValue()).booleanValue()) {
            ((je1) irVar.a).setValue(Boolean.TRUE);
        }
        this.h.setValue(Boolean.FALSE);
        a12 a12Var = this.i;
        int size = a12Var.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            kb2 kb2Var = (kb2) a12Var.get(i);
            je1 je1Var = kb2Var.k;
            je1 je1Var2 = kb2Var.k;
            if (!((Boolean) je1Var.getValue()).booleanValue()) {
                if (z) {
                    j2 = kb2Var.a().b();
                } else {
                    j2 = j;
                }
                kb2Var.e(kb2Var.a().f(j2));
                kb2Var.o = kb2Var.a().d(j2);
                if (kb2Var.a().e(j2)) {
                    je1Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) je1Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        a12 a12Var2 = this.j;
        int size2 = a12Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            lb2 lb2Var = (lb2) a12Var2.get(i2);
            je1 je1Var3 = lb2Var.d;
            ir irVar2 = lb2Var.a;
            if (!sn0.r(je1Var3.getValue(), irVar2.c())) {
                lb2Var.h(j, z);
            }
            if (!sn0.r(lb2Var.d.getValue(), irVar2.c())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.g.h(Long.MIN_VALUE);
        ir irVar = this.a;
        if (irVar instanceof p41) {
            ((p41) irVar).f(this.d.getValue());
        }
        n(0L);
        ((je1) irVar.a).setValue(Boolean.FALSE);
        a12 a12Var = this.j;
        int size = a12Var.size();
        for (int i = 0; i < size; i++) {
            ((lb2) a12Var.get(i)).i();
        }
    }

    public final void j(float f) {
        Object obj;
        a12 a12Var = this.i;
        int size = a12Var.size();
        for (int i = 0; i < size; i++) {
            kb2 kb2Var = (kb2) a12Var.get(i);
            kb2Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                x52 x52Var = kb2Var.j;
                if (x52Var != null) {
                    kb2Var.a().h(x52Var.c);
                    kb2Var.i = null;
                    kb2Var.j = null;
                }
                if (f == -4.0f) {
                    obj = kb2Var.a().d;
                } else {
                    obj = kb2Var.a().c;
                }
                kb2Var.a().h(obj);
                kb2Var.a().i(obj);
                kb2Var.e(obj);
                kb2Var.p.h(kb2Var.a().b());
            } else {
                kb2Var.l.h(f);
            }
        }
        a12 a12Var2 = this.j;
        int size2 = a12Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((lb2) a12Var2.get(i2)).j(f);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.g.h(Long.MIN_VALUE);
        ir irVar = this.a;
        ((je1) irVar.a).setValue(Boolean.FALSE);
        boolean g = g();
        je1 je1Var = this.d;
        if (!g || !sn0.r(irVar.c(), obj) || !sn0.r(je1Var.getValue(), obj2)) {
            if (!sn0.r(irVar.c(), obj) && (irVar instanceof p41)) {
                ((p41) irVar).f(obj);
            }
            je1Var.setValue(obj2);
            this.k.setValue(Boolean.TRUE);
            this.e.setValue(new jb2(obj, obj2));
        }
        a12 a12Var = this.j;
        int size = a12Var.size();
        for (int i = 0; i < size; i++) {
            lb2 lb2Var = (lb2) a12Var.get(i);
            lb2Var.getClass();
            if (lb2Var.g()) {
                lb2Var.k(lb2Var.a.c(), lb2Var.d.getValue());
            }
        }
        a12 a12Var2 = this.i;
        int size2 = a12Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((kb2) a12Var2.get(i2)).d(0L);
        }
    }

    public final void l(long j) {
        he1 he1Var = this.g;
        if (he1Var.g() == Long.MIN_VALUE) {
            he1Var.h(j);
        }
        n(j);
        this.h.setValue(Boolean.FALSE);
        a12 a12Var = this.i;
        int size = a12Var.size();
        for (int i = 0; i < size; i++) {
            ((kb2) a12Var.get(i)).d(j);
        }
        a12 a12Var2 = this.j;
        int size2 = a12Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            lb2 lb2Var = (lb2) a12Var2.get(i2);
            if (!sn0.r(lb2Var.d.getValue(), lb2Var.a.c())) {
                lb2Var.l(j);
            }
        }
    }

    public final void m(et1 et1Var) {
        a12 a12Var = this.i;
        int size = a12Var.size();
        for (int i = 0; i < size; i++) {
            kb2 kb2Var = (kb2) a12Var.get(i);
            je1 je1Var = kb2Var.n;
            if (!sn0.r(kb2Var.a().c, kb2Var.a().d)) {
                kb2Var.j = kb2Var.a();
                kb2Var.i = et1Var;
            }
            kb2Var.h.setValue(new x52(kb2Var.r, kb2Var.e, je1Var.getValue(), je1Var.getValue(), kb2Var.o.c()));
            kb2Var.p.h(kb2Var.a().b());
            kb2Var.m = true;
        }
        a12 a12Var2 = this.j;
        int size2 = a12Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((lb2) a12Var2.get(i2)).m(et1Var);
        }
    }

    public final void n(long j) {
        if (this.b == null) {
            this.f.h(j);
        }
    }

    public final void o() {
        x52 x52Var;
        a12 a12Var = this.i;
        int size = a12Var.size();
        for (int i = 0; i < size; i++) {
            kb2 kb2Var = (kb2) a12Var.get(i);
            et1 et1Var = kb2Var.i;
            if (et1Var != null && (x52Var = kb2Var.j) != null) {
                long S = c01.S(et1Var.g * et1Var.d);
                Object f = x52Var.f(S);
                if (kb2Var.m) {
                    kb2Var.a().i(f);
                }
                kb2Var.a().h(f);
                kb2Var.p.h(kb2Var.a().b());
                if (kb2Var.l.g() == -2.0f || kb2Var.m) {
                    kb2Var.e(f);
                } else {
                    kb2Var.d(kb2Var.s.e());
                }
                if (S >= et1Var.g) {
                    kb2Var.i = null;
                    kb2Var.j = null;
                } else {
                    et1Var.c = false;
                }
            }
        }
        a12 a12Var2 = this.j;
        int size2 = a12Var2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((lb2) a12Var2.get(i2)).o();
        }
    }

    public final void p(Object obj) {
        je1 je1Var = this.d;
        if (!sn0.r(je1Var.getValue(), obj)) {
            this.e.setValue(new jb2(je1Var.getValue(), obj));
            ir irVar = this.a;
            if (!sn0.r(irVar.c(), je1Var.getValue())) {
                irVar.f(je1Var.getValue());
            }
            je1Var.setValue(obj);
            if (this.g.g() == Long.MIN_VALUE) {
                this.h.setValue(Boolean.TRUE);
            }
            a12 a12Var = this.i;
            int size = a12Var.size();
            for (int i = 0; i < size; i++) {
                ((kb2) a12Var.get(i)).l.h(-2.0f);
            }
        }
    }

    public final String toString() {
        a12 a12Var = this.i;
        int size = a12Var.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((kb2) a12Var.get(i)) + ", ";
        }
        return str;
    }
}
