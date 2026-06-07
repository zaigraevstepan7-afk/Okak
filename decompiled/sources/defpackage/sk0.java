package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sk0 implements o22 {
    public Float e;
    public Float f;
    public final je1 g;
    public x52 h;
    public boolean i;
    public boolean j;
    public long k;
    public final /* synthetic */ uk0 l;

    public sk0(uk0 uk0Var, Float f, Float f2, rk0 rk0Var) {
        this.l = uk0Var;
        this.e = f;
        this.f = f2;
        this.g = fr1.k(f);
        this.h = new x52(rk0Var, f2.A, this.e, this.f, null);
    }

    @Override // defpackage.o22
    public final Object getValue() {
        return this.g.getValue();
    }
}
