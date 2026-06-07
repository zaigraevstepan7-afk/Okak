package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kr0 extends xq0 {
    public final /* synthetic */ nr0 b;
    public final /* synthetic */ se0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr0(nr0 nr0Var, se0 se0Var, String str) {
        super(str);
        this.b = nr0Var;
        this.c = se0Var;
    }

    @Override // defpackage.j01
    public final k01 b(l01 l01Var, List list, long j) {
        nr0 nr0Var = this.b;
        ir0 ir0Var = nr0Var.l;
        ir0Var.e = l01Var.getLayoutDirection();
        ir0Var.f = l01Var.a();
        ir0Var.g = l01Var.P();
        boolean S = l01Var.S();
        se0 se0Var = this.c;
        if (!S && nr0Var.e.m != null) {
            nr0Var.i = 0;
            k01 k01Var = (k01) se0Var.invoke(nr0Var.m, new us(j));
            return new jr0(k01Var, nr0Var, nr0Var.i, k01Var, 0);
        }
        nr0Var.h = 0;
        k01 k01Var2 = (k01) se0Var.invoke(ir0Var, new us(j));
        return new jr0(k01Var2, nr0Var, nr0Var.h, k01Var2, 1);
    }
}
