package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dz0 extends d21 implements kf0, b40, pu1, w81 {
    public en0 B;
    public lk C;
    public fd s;
    public e82 t;
    public g3 u;
    public View v;
    public c00 w;
    public rg2 x;
    public j00 z;
    public final je1 y = new je1(null, g3.S);
    public long A = 9205357640488583168L;

    public dz0(fd fdVar, e82 e82Var, g3 g3Var) {
        this.s = fdVar;
        this.t = e82Var;
        this.u = g3Var;
    }

    @Override // defpackage.d21
    public final void D0() {
        e0();
        this.C = sn0.c(0, 7, null);
        rx.C(z0(), null, new vf(this, (vt) null, 7), 1);
    }

    @Override // defpackage.d21
    public final void E0() {
        rg2 rg2Var = this.x;
        if (rg2Var != null) {
            ((Magnifier) rg2Var.f).dismiss();
        }
        this.x = null;
    }

    public final long L0() {
        if (this.z == null) {
            this.z = fr1.h(new cz0(this, 2));
        }
        j00 j00Var = this.z;
        if (j00Var != null) {
            return ((z81) j00Var.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void M0() {
        rg2 rg2Var = this.x;
        if (rg2Var != null) {
            ((Magnifier) rg2Var.f).dismiss();
        }
        View view = this.v;
        if (view == null) {
            view = vn.I(this);
        }
        this.v = view;
        c00 c00Var = this.w;
        if (c00Var == null) {
            c00Var = hp.M(this).C;
        }
        this.w = c00Var;
        this.x = new rg2(new Magnifier(view), 24);
        O0();
    }

    public final void N0() {
        c00 c00Var = this.w;
        if (c00Var == null) {
            c00Var = hp.M(this).C;
            this.w = c00Var;
        }
        long j = ((z81) this.s.invoke(c00Var)).a;
        if ((j & 9223372034707292159L) != 9205357640488583168L && (L0() & 9223372034707292159L) != 9205357640488583168L) {
            this.A = z81.e(L0(), j);
            if (this.x == null) {
                M0();
            }
            rg2 rg2Var = this.x;
            if (rg2Var != null) {
                long j2 = this.A;
                Magnifier magnifier = (Magnifier) rg2Var.f;
                if (!Float.isNaN(Float.NaN)) {
                    magnifier.setZoom(Float.NaN);
                }
                if ((9205357640488583168L & 9223372034707292159L) != 9205357640488583168L) {
                    magnifier.show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (9205357640488583168L >> 32)), Float.intBitsToFloat((int) (4294967295L & 9205357640488583168L)));
                } else {
                    magnifier.show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (4294967295L & j2)));
                }
            }
            O0();
            return;
        }
        this.A = 9205357640488583168L;
        rg2 rg2Var2 = this.x;
        if (rg2Var2 != null) {
            ((Magnifier) rg2Var2.f).dismiss();
        }
    }

    public final void O0() {
        c00 c00Var;
        rg2 rg2Var = this.x;
        if (rg2Var == null || (c00Var = this.w) == null) {
            return;
        }
        long m = rg2Var.m();
        en0 en0Var = this.B;
        if (en0Var == null || m != en0Var.a) {
            this.t.invoke(new j20(c00Var.q(vn.O(rg2Var.m()))));
            this.B = new en0(rg2Var.m());
        }
    }

    @Override // defpackage.kf0
    public final void U(e81 e81Var) {
        this.y.setValue(e81Var);
    }

    @Override // defpackage.w81
    public final void e0() {
        io.F(this, new cz0(this, 0));
    }

    @Override // defpackage.b40
    public final void f0(cr0 cr0Var) {
        cr0Var.b();
        lk lkVar = this.C;
        if (lkVar != null) {
            lkVar.j(od2.a);
        }
    }

    @Override // defpackage.pu1
    public final void u0(av1 av1Var) {
        av1Var.a(ez0.a, new cz0(this, 1));
    }
}
