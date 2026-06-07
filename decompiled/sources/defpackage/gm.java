package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class gm extends fm {
    public final va0 h;

    public gm(va0 va0Var, xu xuVar, int i, jk jkVar) {
        super(xuVar, i, jkVar);
        this.h = va0Var;
    }

    @Override // defpackage.fm, defpackage.va0
    public final Object a(wa0 wa0Var, vt vtVar) {
        xu v;
        int i = this.f;
        hv hvVar = hv.e;
        if (i == -3) {
            xu context = vtVar.getContext();
            Boolean bool = Boolean.FALSE;
            le leVar = new le(20);
            xu xuVar = this.e;
            if (!((Boolean) xuVar.p(leVar, bool)).booleanValue()) {
                v = context.G(xuVar);
            } else {
                v = io.v(context, xuVar, false);
            }
            if (sn0.r(v, context)) {
                Object h = h(wa0Var, vtVar);
                if (h == hvVar) {
                    return h;
                }
            } else {
                g3 g3Var = g3.y;
                if (sn0.r(v.H(g3Var), context.H(g3Var))) {
                    xu context2 = vtVar.getContext();
                    if (!(wa0Var instanceof jv1) && !(wa0Var instanceof m81)) {
                        wa0Var = new c4(wa0Var, context2);
                    }
                    Object f0 = bf.f0(v, wa0Var, mp0.N(v), new j(this, null, 9), vtVar);
                    if (f0 == hvVar) {
                        return f0;
                    }
                }
            }
            return od2.a;
        }
        Object a = super.a(wa0Var, vtVar);
        if (a == hvVar) {
            return a;
        }
        return od2.a;
    }

    @Override // defpackage.fm
    public final Object d(dj1 dj1Var, vt vtVar) {
        Object h = h(new jv1(dj1Var), vtVar);
        if (h == hv.e) {
            return h;
        }
        return od2.a;
    }

    public abstract Object h(wa0 wa0Var, vt vtVar);

    @Override // defpackage.fm
    public final String toString() {
        return this.h + " -> " + super.toString();
    }
}
