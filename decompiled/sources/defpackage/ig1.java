package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ig1 {
    public int e;
    public int f;
    public long g = 0;
    public long h = jg1.a;
    public long i = 0;

    public Object C() {
        return null;
    }

    public abstract int a0(j3 j3Var);

    public int e0() {
        return (int) (this.g & 4294967295L);
    }

    public int f0() {
        return (int) (this.g >> 32);
    }

    public final void k0() {
        this.e = go.p((int) (this.g >> 32), us.j(this.h), us.h(this.h));
        this.f = go.p((int) (this.g & 4294967295L), us.i(this.h), us.g(this.h));
        int i = this.e;
        long j = this.g;
        this.i = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j & 4294967295L))) / 2));
    }

    public abstract void m0(long j, float f, oe0 oe0Var);

    public final void o0(long j) {
        if (!en0.a(this.g, j)) {
            this.g = j;
            k0();
        }
    }

    public final void p0(long j) {
        if (!us.b(this.h, j)) {
            this.h = j;
            k0();
        }
    }
}
