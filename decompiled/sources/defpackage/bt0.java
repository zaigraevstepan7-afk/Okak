package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bt0 implements zs0 {
    public final j00 a;
    public final /* synthetic */ st0 b;

    public bt0(st0 st0Var) {
        this.b = st0Var;
        this.a = fr1.h(new v3(st0Var, 16));
    }

    @Override // defpackage.zs0
    public final int a() {
        long g;
        st0 st0Var = this.b;
        if (st0Var.i().o == sb1.e) {
            g = st0Var.i().g() & 4294967295L;
        } else {
            g = st0Var.i().g() >> 32;
        }
        return (int) g;
    }

    @Override // defpackage.zs0
    public final float b() {
        st0 st0Var = this.b;
        return (st0Var.g() * 500) + st0Var.h();
    }

    @Override // defpackage.zs0
    public final Object c(int i, hh hhVar) {
        sl0 sl0Var = st0.x;
        st0 st0Var = this.b;
        st0Var.getClass();
        Object d = st0Var.d(t41.e, new vf(st0Var, i, (vt) null), hhVar);
        od2 od2Var = od2.a;
        hv hvVar = hv.e;
        if (d != hvVar) {
            d = od2Var;
        }
        if (d == hvVar) {
            return d;
        }
        return od2Var;
    }

    @Override // defpackage.zs0
    public final int d() {
        st0 st0Var = this.b;
        return (-st0Var.i().l) + st0Var.i().p;
    }

    @Override // defpackage.zs0
    public final float e() {
        st0 st0Var = this.b;
        int g = st0Var.g();
        int h = st0Var.h();
        if (st0Var.c()) {
            return (g * 500) + h + 100.0f;
        }
        return (g * 500) + h;
    }

    @Override // defpackage.zs0
    public final un f() {
        return new un(((Number) this.a.getValue()).intValue(), 1);
    }
}
