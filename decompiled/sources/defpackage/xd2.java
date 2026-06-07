package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xd2 implements vu {
    public final xd2 e;
    public final nx f;

    public xd2(xd2 xd2Var, nx nxVar) {
        this.e = xd2Var;
        this.f = nxVar;
    }

    @Override // defpackage.xu
    public final /* bridge */ xu G(xu xuVar) {
        return go.M(this, xuVar);
    }

    @Override // defpackage.xu
    public final /* bridge */ vu H(wu wuVar) {
        return go.D(this, wuVar);
    }

    public final void a(nx nxVar) {
        if (this.f != nxVar) {
            xd2 xd2Var = this.e;
            if (xd2Var != null) {
                xd2Var.a(nxVar);
                return;
            }
            return;
        }
        se.p("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
    }

    @Override // defpackage.vu
    public final wu getKey() {
        return xl1.t;
    }

    @Override // defpackage.xu
    public final Object p(se0 se0Var, Object obj) {
        return se0Var.invoke(obj, this);
    }

    @Override // defpackage.xu
    public final /* bridge */ xu s(wu wuVar) {
        return go.I(this, wuVar);
    }
}
