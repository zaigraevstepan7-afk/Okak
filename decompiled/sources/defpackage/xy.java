package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xy implements us1 {
    public final oe0 a;
    public final wy b = new wy(this);
    public final y41 c = new y41();
    public final je1 d;
    public final je1 e;
    public final je1 f;

    public xy(oe0 oe0Var) {
        this.a = oe0Var;
        Boolean bool = Boolean.FALSE;
        this.d = fr1.k(bool);
        this.e = fr1.k(bool);
        this.f = fr1.k(bool);
    }

    @Override // defpackage.us1
    public final boolean a() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // defpackage.us1
    public final Object d(t41 t41Var, se0 se0Var, wt wtVar) {
        Object u = fp.u(new l(this, t41Var, se0Var, null, 13), wtVar);
        if (u == hv.e) {
            return u;
        }
        return od2.a;
    }

    @Override // defpackage.us1
    public final float e(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }
}
