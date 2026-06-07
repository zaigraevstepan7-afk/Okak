package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class d90 extends e90 {
    @Override // defpackage.e90
    public final e90 a(ih1 ih1Var) {
        vv0 v = xn.v();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            v.add(((uv) list.get(i)).e(ih1Var));
        }
        vv0 s = xn.s(v);
        s.getClass();
        return new e90(s);
    }

    public final String toString() {
        return "Edge";
    }
}
