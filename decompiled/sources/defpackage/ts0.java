package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ts0 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final /* synthetic */ vs0 c;

    public ts0(vs0 vs0Var, int i) {
        this.c = vs0Var;
        this.a = i;
    }

    public final void a(int i) {
        vs0 vs0Var = this.c;
        dq0 dq0Var = vs0Var.c;
        if (dq0Var == null) {
            return;
        }
        this.b.add(new ki1(dq0Var, i, vs0Var.b, null));
    }
}
