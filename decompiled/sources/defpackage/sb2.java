package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sb2 extends i02 {
    public final i02 e;
    public final boolean f;
    public final boolean g;
    public oe0 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb2(i02 i02Var, oe0 oe0Var, boolean z, boolean z2) {
        super(0L, o02.i);
        oe0 e;
        nv1 nv1Var = q02.a;
        this.e = i02Var;
        this.f = z;
        this.g = z2;
        this.h = q02.k(oe0Var, (i02Var == null || (e = i02Var.e()) == null) ? q02.j.e : e, z);
        this.i = rp1.g();
    }

    @Override // defpackage.i02
    public final void c() {
        i02 i02Var;
        this.c = true;
        if (this.g && (i02Var = this.e) != null) {
            i02Var.c();
        }
    }

    @Override // defpackage.i02
    public final o02 d() {
        return v().d();
    }

    @Override // defpackage.i02
    public final oe0 e() {
        return this.h;
    }

    @Override // defpackage.i02
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.i02
    public final long g() {
        return v().g();
    }

    @Override // defpackage.i02
    public final oe0 i() {
        return null;
    }

    @Override // defpackage.i02
    public final void k() {
        op1.r();
        throw null;
    }

    @Override // defpackage.i02
    public final void l() {
        op1.r();
        throw null;
    }

    @Override // defpackage.i02
    public final void m() {
        v().m();
    }

    @Override // defpackage.i02
    public final void n(u22 u22Var) {
        v().n(u22Var);
    }

    @Override // defpackage.i02
    public final i02 u(oe0 oe0Var) {
        oe0 k = q02.k(oe0Var, this.h, true);
        if (!this.f) {
            return q02.g(v().u(null), k, true);
        }
        return v().u(k);
    }

    public final i02 v() {
        i02 i02Var = this.e;
        if (i02Var == null) {
            return q02.j;
        }
        return i02Var;
    }
}
