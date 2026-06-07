package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bs implements ob1, vu {
    public static final xl1 f = new xl1(24);
    public final ur e;

    public bs(ur urVar) {
        this.e = urVar;
    }

    @Override // defpackage.xu
    public final /* bridge */ xu G(xu xuVar) {
        return go.M(this, xuVar);
    }

    @Override // defpackage.xu
    public final /* bridge */ vu H(wu wuVar) {
        return go.D(this, wuVar);
    }

    @Override // defpackage.vu
    public final wu getKey() {
        return f;
    }

    @Override // defpackage.ob1
    public final List j(Integer num) {
        return this.e.E();
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
