package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ot0 implements ds1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds1 b;
    public final /* synthetic */ us1 c;

    public /* synthetic */ ot0(ds1 ds1Var, us1 us1Var, int i) {
        this.a = i;
        this.c = us1Var;
        this.b = ds1Var;
    }

    @Override // defpackage.ds1
    public final float a(float f) {
        switch (this.a) {
            case 0:
                return this.b.a(f);
            default:
                return this.b.a(f);
        }
    }

    public final int b(int i) {
        Object obj;
        int i2 = this.a;
        us1 us1Var = this.c;
        switch (i2) {
            case 0:
                st0 st0Var = (st0) us1Var;
                mt0 i3 = st0Var.i();
                if (i3.k.isEmpty()) {
                    return 0;
                }
                int g = st0Var.g();
                if (i <= e() && g <= i) {
                    List list = i3.k;
                    int size = list.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            obj = list.get(i4);
                            if (((nt0) obj).a != i) {
                                i4++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    nt0 nt0Var = (nt0) obj;
                    if (nt0Var == null) {
                        return 0;
                    }
                    return nt0Var.j;
                }
                return ((i - st0Var.g()) * fp.b0(i3)) - st0Var.h();
            default:
                od1 od1Var = (od1) us1Var;
                return (int) (go.q(io.t(od1Var) + c01.R(((od1Var.q() * (i - od1Var.l())) - (od1Var.m() * od1Var.q())) + 0.0f), od1Var.h, od1Var.g) - io.t(od1Var));
        }
    }

    public final int c() {
        switch (this.a) {
            case 0:
                return ((st0) this.c).g();
            default:
                return ((od1) this.c).e;
        }
    }

    public final int d() {
        switch (this.a) {
            case 0:
                return ((st0) this.c).h();
            default:
                return ((od1) this.c).f;
        }
    }

    public final int e() {
        int i = this.a;
        us1 us1Var = this.c;
        switch (i) {
            case 0:
                nt0 nt0Var = (nt0) wn.o0(((st0) us1Var).i().k);
                if (nt0Var != null) {
                    return nt0Var.a;
                }
                return 0;
            default:
                return ((m01) wn.n0(((od1) us1Var).n().a)).a;
        }
    }

    public final void f(int i) {
        int i2 = this.a;
        us1 us1Var = this.c;
        switch (i2) {
            case 0:
                ((st0) us1Var).k(i);
                return;
            default:
                ((od1) us1Var).v(0.0f / r2.q(), i, true);
                return;
        }
    }
}
