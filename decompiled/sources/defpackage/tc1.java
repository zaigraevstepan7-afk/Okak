package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class tc1 implements zr0 {
    public final uy a;

    public tc1(uy uyVar) {
        this.a = uyVar;
    }

    @Override // defpackage.zr0
    public final int a() {
        return this.a.o();
    }

    @Override // defpackage.zr0
    public final int b() {
        return Math.min(r1.o() - 1, ((m01) wn.n0(this.a.n().a)).a);
    }

    @Override // defpackage.zr0
    public final int c() {
        int i;
        uy uyVar = this.a;
        if (uyVar.n().a.size() == 0) {
            return 0;
        }
        int C = xn.C(uyVar.n());
        int i2 = uyVar.n().b + uyVar.n().c;
        if (i2 == 0 || (i = C / i2) < 1) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.zr0
    public final boolean d() {
        return !this.a.n().a.isEmpty();
    }

    @Override // defpackage.zr0
    public final int e() {
        return Math.max(0, this.a.e);
    }
}
