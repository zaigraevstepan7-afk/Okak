package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class sf1 extends tf1 implements gs {
    public static final sf1 h = new tf1(yb2.e, 0);

    /* JADX WARN: Type inference failed for: r5v1, types: [tf1, sf1] */
    public final sf1 b(xj1 xj1Var, ge2 ge2Var) {
        np u = this.e.u(xj1Var, xj1Var.hashCode(), 0, ge2Var);
        if (u == null) {
            return this;
        }
        return new tf1((yb2) u.b, this.f + u.a);
    }

    @Override // defpackage.tf1, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof xj1)) {
            return false;
        }
        return super.containsKey((xj1) obj);
    }

    @Override // defpackage.tf1, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof ge2)) {
            return false;
        }
        return super.containsValue((ge2) obj);
    }

    @Override // defpackage.tf1, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof xj1)) {
            return null;
        }
        return (ge2) super.get((xj1) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof xj1)) {
            return obj2;
        }
        return (ge2) super.getOrDefault((xj1) obj, (ge2) obj2);
    }
}
