package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class v31 extends qz0 {
    public final xf1 h;
    public Object i;

    public v31(xf1 xf1Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.h = xf1Var;
        this.i = obj2;
    }

    @Override // defpackage.qz0, java.util.Map.Entry
    public final Object getValue() {
        return this.i;
    }

    @Override // defpackage.qz0, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i;
        Object obj2 = this.i;
        this.i = obj;
        vf1 vf1Var = (vf1) this.h.f;
        rf1 rf1Var = vf1Var.h;
        Object obj3 = this.f;
        if (!rf1Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = vf1Var.g;
        if (z) {
            if (z) {
                zb2 zb2Var = vf1Var.e[vf1Var.f];
                Object obj4 = zb2Var.e[zb2Var.g];
                rf1Var.put(obj3, obj);
                if (obj4 != null) {
                    i = obj4.hashCode();
                } else {
                    i = 0;
                }
                vf1Var.c(i, rf1Var.f, obj4, 0);
            } else {
                y61.c();
                return null;
            }
        } else {
            rf1Var.put(obj3, obj);
        }
        vf1Var.k = rf1Var.h;
        return obj2;
    }
}
