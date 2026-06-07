package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pj0 extends b0 {
    public final g0 e;
    public final int f;
    public final int g;

    public pj0(g0 g0Var, int i, int i2) {
        this.e = g0Var;
        this.f = i;
        qo.t(i, i2, g0Var.a());
        this.g = i2 - i;
    }

    @Override // defpackage.s
    public final int a() {
        return this.g;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qo.r(i, this.g);
        return this.e.get(this.f + i);
    }

    @Override // defpackage.b0, java.util.List
    public final List subList(int i, int i2) {
        qo.t(i, i2, this.g);
        int i3 = this.f;
        return new pj0(this.e, i + i3, i3 + i2);
    }
}
