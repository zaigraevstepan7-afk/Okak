package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class vs0 {
    public final oe0 a;
    public dq0 c;
    public int f;
    public final ld b = new ld(10);
    public int d = -1;
    public int e = -1;

    public vs0(oe0 oe0Var) {
        this.a = oe0Var;
    }

    public final us0 a(int i, long j, boolean z, oe0 oe0Var) {
        dq0 dq0Var = this.c;
        if (dq0Var != null) {
            li1 li1Var = (li1) dq0Var.d;
            boolean z2 = li1Var instanceof f9;
            ki1 ki1Var = new ki1(dq0Var, i, this.b, oe0Var);
            ki1Var.d = new us(j);
            if (z2) {
                if (z) {
                    f9 f9Var = (f9) li1Var;
                    f9Var.f.add(new wi1(1, ki1Var));
                    if (!f9Var.g) {
                        f9Var.g = true;
                        f9Var.e.post(f9Var);
                    }
                } else {
                    f9 f9Var2 = (f9) li1Var;
                    f9Var2.f.add(new wi1(0, ki1Var));
                    if (!f9Var2.g) {
                        f9Var2.g = true;
                        f9Var2.e.post(f9Var2);
                    }
                }
            } else {
                li1Var.a(ki1Var);
            }
            Trace.setCounter("compose:lazy:schedule_prefetch:index", i);
            return ki1Var;
        }
        return q40.a;
    }
}
