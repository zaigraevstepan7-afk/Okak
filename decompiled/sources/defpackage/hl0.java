package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hl0 {
    public final LinkedHashMap a;

    public hl0(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap(0, 0.75f, true);
                return;
            default:
                this.a = new LinkedHashMap();
                return;
        }
    }

    public void a(cn cnVar, oe0 oe0Var) {
        oe0Var.getClass();
        LinkedHashMap linkedHashMap = this.a;
        if (!linkedHashMap.containsKey(cnVar)) {
            linkedHashMap.put(cnVar, new ng2(cnVar, oe0Var));
        } else {
            se.i("A `initializer` with the same `clazz` has already been added: ", 46, cnVar.c());
        }
    }

    public gl0 b() {
        Collection values = this.a.values();
        values.getClass();
        ng2[] ng2VarArr = (ng2[]) values.toArray(new ng2[0]);
        return new gl0((ng2[]) Arrays.copyOf(ng2VarArr, ng2VarArr.length));
    }
}
