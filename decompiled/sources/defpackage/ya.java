package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ya {
    public final ec2 a;
    public final Object b;
    public final hc c;
    public final je1 d;
    public final je1 e;
    public final z41 f;
    public final f22 g;
    public final mc h;
    public final mc i;
    public mc j;
    public mc k;

    public ya(Object obj, ec2 ec2Var, Object obj2) {
        mc mcVar;
        mc mcVar2;
        this.a = ec2Var;
        this.b = obj2;
        hc hcVar = new hc(ec2Var, obj, null, 60);
        this.c = hcVar;
        this.d = fr1.k(Boolean.FALSE);
        this.e = fr1.k(obj);
        this.f = new z41();
        this.g = new f22(obj2);
        mc mcVar3 = hcVar.g;
        boolean z = mcVar3 instanceof ic;
        if (z) {
            mcVar = fc2.e;
        } else if (mcVar3 instanceof jc) {
            mcVar = fc2.f;
        } else if (mcVar3 instanceof kc) {
            mcVar = fc2.g;
        } else {
            mcVar = fc2.h;
        }
        this.h = mcVar;
        if (z) {
            mcVar2 = fc2.a;
        } else if (mcVar3 instanceof jc) {
            mcVar2 = fc2.b;
        } else if (mcVar3 instanceof kc) {
            mcVar2 = fc2.c;
        } else {
            mcVar2 = fc2.d;
        }
        this.i = mcVar2;
        this.j = mcVar;
        this.k = mcVar2;
    }

    public static final void a(ya yaVar) {
        hc hcVar = yaVar.c;
        hcVar.g.d();
        hcVar.h = Long.MIN_VALUE;
        yaVar.d.setValue(Boolean.FALSE);
    }

    public static Object b(ya yaVar, Object obj, gc gcVar, oe0 oe0Var, vt vtVar, int i) {
        if ((i & 2) != 0) {
            gcVar = yaVar.g;
        }
        gc gcVar2 = gcVar;
        Object invoke = yaVar.a.b.invoke(yaVar.c.g);
        if ((i & 8) != 0) {
            oe0Var = null;
        }
        oe0 oe0Var2 = oe0Var;
        Object d = yaVar.d();
        ec2 ec2Var = yaVar.a;
        return z41.a(yaVar.f, new wa(yaVar, invoke, new x52(gcVar2, ec2Var, d, obj, (mc) ec2Var.a.invoke(invoke)), yaVar.c.h, oe0Var2, null), vtVar);
    }

    public final Object c(Object obj) {
        if (!sn0.r(this.j, this.h) || !sn0.r(this.k, this.i)) {
            ec2 ec2Var = this.a;
            mc mcVar = (mc) ec2Var.a.invoke(obj);
            int b = mcVar.b();
            boolean z = false;
            for (int i = 0; i < b; i++) {
                if (mcVar.a(i) < this.j.a(i) || mcVar.a(i) > this.k.a(i)) {
                    mcVar.e(i, go.o(mcVar.a(i), this.j.a(i), this.k.a(i)));
                    z = true;
                }
            }
            if (z) {
                return ec2Var.b.invoke(mcVar);
            }
        }
        return obj;
    }

    public final Object d() {
        return this.c.f.getValue();
    }

    public final boolean e() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final Object f(vt vtVar, Object obj) {
        Object a = z41.a(this.f, new xa(this, obj, null), vtVar);
        if (a == hv.e) {
            return a;
        }
        return od2.a;
    }

    public /* synthetic */ ya(Object obj, ec2 ec2Var, Object obj2, int i) {
        this(obj, ec2Var, (i & 4) != 0 ? null : obj2);
    }
}
