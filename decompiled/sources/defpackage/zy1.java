package defpackage;

import android.view.KeyEvent;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zy1 implements oe0 {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ rn f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ oe0 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ float j;

    public zy1(boolean z, rn rnVar, boolean z2, oe0 oe0Var, boolean z3, float f) {
        this.e = z;
        this.f = rnVar;
        this.g = z2;
        this.h = oe0Var;
        this.i = z3;
        this.j = f;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i;
        KeyEvent keyEvent = ((lp0) obj).a;
        if (!this.e) {
            return Boolean.FALSE;
        }
        int w = mp0.w(keyEvent);
        boolean z = this.i;
        if (w == 2) {
            rn rnVar = this.f;
            float f = rnVar.b;
            float f2 = rnVar.a;
            float abs = Math.abs(f - f2) / 100.0f;
            if (this.g) {
                i = -1;
            } else {
                i = 1;
            }
            boolean a = jp0.a(vn.i(keyEvent.getKeyCode()), jp0.v);
            oe0 oe0Var = this.h;
            if (a) {
                oe0Var.invoke(Float.valueOf(f2));
                return Boolean.TRUE;
            }
            if (jp0.a(vn.i(keyEvent.getKeyCode()), jp0.w)) {
                oe0Var.invoke(Float.valueOf(rnVar.b));
                return Boolean.TRUE;
            }
            float f3 = this.j;
            if (z) {
                long i2 = vn.i(keyEvent.getKeyCode());
                if (jp0.a(i2, jp0.d)) {
                    oe0Var.invoke(go.r(Float.valueOf(f3 - (i * abs)), rnVar));
                    return Boolean.TRUE;
                }
                if (jp0.a(i2, jp0.e)) {
                    oe0Var.invoke(go.r(Float.valueOf((i * abs) + f3), rnVar));
                    return Boolean.TRUE;
                }
                if (jp0.a(i2, jp0.C)) {
                    oe0Var.invoke(go.r(Float.valueOf(f3 - ((go.p(10, 1, 10) * i) * abs)), rnVar));
                    return Boolean.TRUE;
                }
                if (jp0.a(i2, jp0.D)) {
                    oe0Var.invoke(go.r(Float.valueOf((go.p(10, 1, 10) * i * abs) + f3), rnVar));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
            long i3 = vn.i(keyEvent.getKeyCode());
            if (jp0.a(i3, jp0.g)) {
                oe0Var.invoke(go.r(Float.valueOf((i * abs) + f3), rnVar));
                return Boolean.TRUE;
            }
            if (jp0.a(i3, jp0.f)) {
                oe0Var.invoke(go.r(Float.valueOf(f3 - (i * abs)), rnVar));
                return Boolean.TRUE;
            }
            if (jp0.a(i3, jp0.C)) {
                oe0Var.invoke(go.r(Float.valueOf((go.p(10, 1, 10) * abs) + f3), rnVar));
                return Boolean.TRUE;
            }
            if (jp0.a(i3, jp0.D)) {
                oe0Var.invoke(go.r(Float.valueOf(f3 - (go.p(10, 1, 10) * abs)), rnVar));
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        if (w == 1) {
            if (z) {
                long i4 = vn.i(keyEvent.getKeyCode());
                if (!jp0.a(i4, jp0.d) && !jp0.a(i4, jp0.e) && !jp0.a(i4, jp0.v) && !jp0.a(i4, jp0.w) && !jp0.a(i4, jp0.C) && !jp0.a(i4, jp0.D)) {
                    return Boolean.FALSE;
                }
                return Boolean.TRUE;
            }
            long i5 = vn.i(keyEvent.getKeyCode());
            if (!jp0.a(i5, jp0.g) && !jp0.a(i5, jp0.f) && !jp0.a(i5, jp0.v) && !jp0.a(i5, jp0.w) && !jp0.a(i5, jp0.C) && !jp0.a(i5, jp0.D)) {
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
