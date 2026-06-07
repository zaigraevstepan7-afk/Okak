package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class gl0 implements pg2 {
    public final ng2[] a;

    public gl0(ng2... ng2VarArr) {
        this.a = ng2VarArr;
    }

    @Override // defpackage.pg2
    public final kg2 b(Class cls, k31 k31Var) {
        ng2 ng2Var;
        kg2 kg2Var;
        oe0 oe0Var;
        cn a = yl1.a(cls);
        ng2[] ng2VarArr = this.a;
        ng2[] ng2VarArr2 = (ng2[]) Arrays.copyOf(ng2VarArr, ng2VarArr.length);
        int length = ng2VarArr2.length;
        int i = 0;
        while (true) {
            if (i < length) {
                ng2Var = ng2VarArr2[i];
                if (ng2Var.a.equals(a)) {
                    break;
                }
                i++;
            } else {
                ng2Var = null;
                break;
            }
        }
        if (ng2Var != null && (oe0Var = ng2Var.b) != null) {
            kg2Var = (kg2) oe0Var.invoke(k31Var);
        } else {
            kg2Var = null;
        }
        if (kg2Var != null) {
            return kg2Var;
        }
        y61.q(a.c(), "No initializer set for given class ");
        return null;
    }
}
