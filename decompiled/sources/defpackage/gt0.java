package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gt0 implements zr0 {
    public final st0 a;

    public gt0(st0 st0Var) {
        this.a = st0Var;
    }

    @Override // defpackage.zr0
    public final int a() {
        return this.a.i().n;
    }

    @Override // defpackage.zr0
    public final int b() {
        return Math.min(a() - 1, ((nt0) wn.n0(this.a.i().k)).a);
    }

    @Override // defpackage.zr0
    public final int c() {
        long g;
        int i;
        st0 st0Var = this.a;
        if (st0Var.i().k.isEmpty()) {
            return 0;
        }
        mt0 i2 = st0Var.i();
        if (i2.o == sb1.e) {
            g = i2.g() & 4294967295L;
        } else {
            g = i2.g() >> 32;
        }
        int i3 = (int) g;
        int b0 = fp.b0(st0Var.i());
        if (b0 == 0 || (i = i3 / b0) < 1) {
            return 1;
        }
        return i;
    }

    @Override // defpackage.zr0
    public final boolean d() {
        return !this.a.i().k.isEmpty();
    }

    @Override // defpackage.zr0
    public final int e() {
        return Math.max(0, this.a.g());
    }
}
