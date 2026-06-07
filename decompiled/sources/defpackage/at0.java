package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class at0 implements zs0 {
    public final /* synthetic */ uy a;
    public final /* synthetic */ boolean b;

    public at0(uy uyVar, boolean z) {
        this.a = uyVar;
        this.b = z;
    }

    @Override // defpackage.zs0
    public final int a() {
        long g;
        uy uyVar = this.a;
        if (uyVar.n().e == sb1.e) {
            g = uyVar.n().g() & 4294967295L;
        } else {
            g = uyVar.n().g() >> 32;
        }
        return (int) g;
    }

    @Override // defpackage.zs0
    public final float b() {
        return (float) io.t(this.a);
    }

    @Override // defpackage.zs0
    public final Object c(int i, hh hhVar) {
        uy uyVar = this.a;
        Object d = uyVar.d(t41.e, new hh(uyVar, i, null, 2), hhVar);
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
        uy uyVar = this.a;
        return (-uyVar.n().f) + uyVar.n().d;
    }

    @Override // defpackage.zs0
    public final float e() {
        uy uyVar = this.a;
        return (float) qd1.a(uyVar.n(), uyVar.o());
    }

    @Override // defpackage.zs0
    public final un f() {
        boolean z = this.b;
        uy uyVar = this.a;
        if (z) {
            return new un(uyVar.o(), 1);
        }
        return new un(1, uyVar.o());
    }
}
