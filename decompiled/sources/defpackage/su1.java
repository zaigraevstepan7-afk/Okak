package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class su1 {
    public final mu1 a;
    public final q31 b;

    public su1(ru1 ru1Var, vm0 vm0Var) {
        this.a = ru1Var.d;
        this.b = new q31(ru1.j(4, ru1Var).size());
        List j = ru1.j(4, ru1Var);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            ru1 ru1Var2 = (ru1) j.get(i);
            if (vm0Var.a(ru1Var2.g)) {
                this.b.a(ru1Var2.g);
            }
        }
    }
}
