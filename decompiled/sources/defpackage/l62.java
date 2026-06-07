package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class l62 implements i62 {
    public final long e;
    public final /* synthetic */ m62 f;

    public l62(m62 m62Var, long j) {
        this.f = m62Var;
        this.e = j;
    }

    @Override // defpackage.i62
    public final h62 data() {
        return nq1.b(this.f);
    }

    @Override // defpackage.i62
    public final long h(iq0 iq0Var) {
        iq0 iq0Var2 = (iq0) this.f.v.getValue();
        if (iq0Var2 != null) {
            return iq0Var.I(iq0Var2, this.e);
        }
        nl0.d("Tried to open context menu before the anchor was placed.");
        se.c();
        return 0L;
    }

    @Override // defpackage.i62
    public final pl1 k(iq0 iq0Var) {
        return hp.e(h(iq0Var), 0L);
    }
}
