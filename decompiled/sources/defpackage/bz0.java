package defpackage;

import android.view.View;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lbz0;", "Li21;", "Ldz0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class bz0 extends i21 {
    public final fd a;
    public final e82 b;
    public final g3 c;

    public bz0(fd fdVar, e82 e82Var, g3 g3Var) {
        this.a = fdVar;
        this.b = e82Var;
        this.c = g3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    @Override // defpackage.i21
    public final d21 f() {
        return new dz0(this.a, this.b, this.c);
    }

    @Override // defpackage.i21
    public final void g(d21 d21Var) {
        dz0 dz0Var = (dz0) d21Var;
        dz0Var.getClass();
        g3 g3Var = dz0Var.u;
        View view = dz0Var.v;
        c00 c00Var = dz0Var.w;
        dz0Var.s = this.a;
        dz0Var.t = this.b;
        g3 g3Var2 = this.c;
        dz0Var.u = g3Var2;
        View I = vn.I(dz0Var);
        c00 c00Var2 = hp.M(dz0Var).C;
        if (dz0Var.x != null) {
            zu1 zu1Var = ez0.a;
            if (Float.isNaN(Float.NaN)) {
                Float.isNaN(Float.NaN);
            }
            if (!f20.b(Float.NaN, Float.NaN) || !f20.b(Float.NaN, Float.NaN) || !g3Var2.equals(g3Var) || !I.equals(view) || !sn0.r(c00Var2, c00Var)) {
                dz0Var.M0();
            }
        }
        dz0Var.N0();
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + mb2.a(l90.a(Float.NaN, l90.a(Float.NaN, l90.e(9205357640488583168L, mb2.a(l90.a(Float.NaN, this.a.hashCode() * 961, 31), 31, true), 31), 31), 31), 31, true)) * 31);
    }
}
