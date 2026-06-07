package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kb2 implements o22 {
    public final ec2 e;
    public final je1 f;
    public final je1 g;
    public final je1 h;
    public et1 i;
    public x52 j;
    public final je1 k;
    public final fe1 l;
    public boolean m;
    public final je1 n;
    public mc o;
    public final he1 p;
    public boolean q;
    public final f22 r;
    public final /* synthetic */ lb2 s;

    public kb2(lb2 lb2Var, Object obj, mc mcVar, ec2 ec2Var) {
        this.s = lb2Var;
        this.e = ec2Var;
        je1 k = fr1.k(obj);
        this.f = k;
        Object obj2 = null;
        this.g = fr1.k(mp0.M(0.0f, 0.0f, null, 7));
        this.h = fr1.k(new x52(b(), ec2Var, obj, k.getValue(), mcVar));
        this.k = fr1.k(Boolean.TRUE);
        this.l = new fe1(-1.0f);
        this.n = fr1.k(obj);
        this.o = mcVar;
        this.p = new he1(a().b());
        Float f = (Float) vg2.a.get(ec2Var);
        if (f != null) {
            float floatValue = f.floatValue();
            mc mcVar2 = (mc) ec2Var.a.invoke(obj);
            int b = mcVar2.b();
            for (int i = 0; i < b; i++) {
                mcVar2.e(i, floatValue);
            }
            obj2 = this.e.b.invoke(mcVar2);
        }
        this.r = mp0.M(0.0f, 0.0f, obj2, 3);
    }

    public final x52 a() {
        return (x52) this.h.getValue();
    }

    public final u90 b() {
        return (u90) this.g.getValue();
    }

    public final void d(long j) {
        if (this.l.g() == -1.0f) {
            this.q = true;
            if (sn0.r(a().c, a().d)) {
                e(a().c);
            } else {
                e(a().f(j));
                this.o = a().d(j);
            }
        }
    }

    public final void e(Object obj) {
        this.n.setValue(obj);
    }

    public final void f(Object obj, boolean z) {
        Object obj2;
        u90 b;
        gc j22Var;
        x52 x52Var = this.j;
        if (x52Var != null) {
            obj2 = x52Var.c;
        } else {
            obj2 = null;
        }
        je1 je1Var = this.f;
        boolean r = sn0.r(obj2, je1Var.getValue());
        he1 he1Var = this.p;
        je1 je1Var2 = this.h;
        if (r) {
            je1Var2.setValue(new x52(this.r, this.e, obj, obj, this.o.c()));
            this.m = true;
            he1Var.h(a().b());
            return;
        }
        if (z && !this.q) {
            if (b() instanceof f22) {
                b = b();
            } else {
                b = this.r;
            }
        } else {
            b = b();
        }
        lb2 lb2Var = this.s;
        long e = lb2Var.e();
        je1 je1Var3 = lb2Var.h;
        if (e <= 0) {
            j22Var = b;
        } else {
            j22Var = new j22(b, lb2Var.e());
        }
        je1Var2.setValue(new x52(j22Var, this.e, obj, je1Var.getValue(), this.o));
        he1Var.h(a().b());
        this.m = false;
        je1Var3.setValue(Boolean.TRUE);
        if (lb2Var.g()) {
            a12 a12Var = lb2Var.i;
            int size = a12Var.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                kb2 kb2Var = (kb2) a12Var.get(i);
                j = Math.max(j, kb2Var.p.g());
                kb2Var.d(0L);
            }
            je1Var3.setValue(Boolean.FALSE);
        }
    }

    public final void g(Object obj, Object obj2, u90 u90Var) {
        this.f.setValue(obj2);
        this.g.setValue(u90Var);
        if (sn0.r(a().d, obj) && sn0.r(a().c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // defpackage.o22
    public final Object getValue() {
        return this.n.getValue();
    }

    public final void h(Object obj, u90 u90Var) {
        Object value;
        Object obj2;
        if (this.m) {
            x52 x52Var = this.j;
            if (x52Var != null) {
                obj2 = x52Var.c;
            } else {
                obj2 = null;
            }
            if (sn0.r(obj, obj2)) {
                return;
            }
        }
        je1 je1Var = this.f;
        boolean r = sn0.r(je1Var.getValue(), obj);
        fe1 fe1Var = this.l;
        if (r && fe1Var.g() == -1.0f) {
            return;
        }
        je1Var.setValue(obj);
        this.g.setValue(u90Var);
        if (fe1Var.g() == -3.0f) {
            value = obj;
        } else {
            value = this.n.getValue();
        }
        je1 je1Var2 = this.k;
        boolean z = true;
        f(value, !((Boolean) je1Var2.getValue()).booleanValue());
        if (fe1Var.g() != -3.0f) {
            z = false;
        }
        je1Var2.setValue(Boolean.valueOf(z));
        if (fe1Var.g() >= 0.0f) {
            long b = a().b();
            e(a().f(fe1Var.g() * ((float) b)));
        } else if (fe1Var.g() == -3.0f) {
            e(obj);
        }
        this.m = false;
        fe1Var.h(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.n.getValue() + ", target: " + this.f.getValue() + ", spec: " + b();
    }
}
