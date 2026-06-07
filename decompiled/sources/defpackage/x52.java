package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class x52 implements bc {
    public final qe2 a;
    public final ec2 b;
    public Object c;
    public Object d;
    public mc e;
    public mc f;
    public final mc g;
    public long h;
    public mc i;

    public x52(gc gcVar, ec2 ec2Var, Object obj, Object obj2, mc mcVar) {
        mc c;
        this.a = gcVar.a(ec2Var);
        this.b = ec2Var;
        this.c = obj2;
        this.d = obj;
        this.e = (mc) ec2Var.a.invoke(obj);
        oe0 oe0Var = ec2Var.a;
        this.f = (mc) oe0Var.invoke(obj2);
        if (mcVar != null) {
            c = fc2.v(mcVar);
        } else {
            c = ((mc) oe0Var.invoke(obj)).c();
        }
        this.g = c;
        this.h = -1L;
    }

    @Override // defpackage.bc
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.bc
    public final long b() {
        if (this.h < 0) {
            this.h = this.a.b(this.e, this.f, this.g);
        }
        return this.h;
    }

    @Override // defpackage.bc
    public final ec2 c() {
        return this.b;
    }

    @Override // defpackage.bc
    public final mc d(long j) {
        if (!e(j)) {
            return this.a.h(j, this.e, this.f, this.g);
        }
        mc mcVar = this.i;
        if (mcVar == null) {
            mc q = this.a.q(this.e, this.f, this.g);
            this.i = q;
            return q;
        }
        return mcVar;
    }

    @Override // defpackage.bc
    public final Object f(long j) {
        if (!e(j)) {
            mc p = this.a.p(j, this.e, this.f, this.g);
            int b = p.b();
            for (int i = 0; i < b; i++) {
                if (Float.isNaN(p.a(i))) {
                    gi1.b("AnimationVector cannot contain a NaN. " + p + ". Animation: " + this + ", playTimeNanos: " + j);
                }
            }
            return this.b.b.invoke(p);
        }
        return this.c;
    }

    @Override // defpackage.bc
    public final Object g() {
        return this.c;
    }

    public final void h(Object obj) {
        if (!sn0.r(obj, this.d)) {
            this.d = obj;
            this.e = (mc) this.b.a.invoke(obj);
            this.i = null;
            this.h = -1L;
        }
    }

    public final void i(Object obj) {
        if (!sn0.r(this.c, obj)) {
            this.c = obj;
            this.f = (mc) this.b.a.invoke(obj);
            this.i = null;
            this.h = -1L;
        }
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (b() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
