package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ki0 extends d21 implements ub2, th1, es {
    public k20 s;
    public u8 t;
    public boolean u;

    public ki0(u8 u8Var, k20 k20Var) {
        this.s = k20Var;
        this.t = u8Var;
    }

    @Override // defpackage.th1
    public final void E() {
        P0();
    }

    @Override // defpackage.d21
    public final void E0() {
        P0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wl1] */
    public final void L0() {
        u8 u8Var;
        ?? obj = new Object();
        fr1.u(this, new x81((wl1) obj));
        ki0 ki0Var = (ki0) obj.e;
        if (ki0Var == null || (u8Var = ki0Var.t) == null) {
            u8Var = this.t;
        }
        M0(u8Var);
    }

    public abstract void M0(oh1 oh1Var);

    /* JADX WARN: Type inference failed for: r0v0, types: [sl1, java.lang.Object] */
    public final void N0() {
        ?? obj = new Object();
        obj.e = true;
        fr1.w(this, new n20(obj));
        if (obj.e) {
            L0();
        }
    }

    public abstract boolean O0(int i);

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, wl1] */
    public final void P0() {
        if (this.u) {
            this.u = false;
            if (this.r) {
                ?? obj = new Object();
                fr1.u(this, new h5(obj, 1));
                ki0 ki0Var = (ki0) obj.e;
                if (ki0Var != null) {
                    ki0Var.L0();
                } else {
                    M0(null);
                }
            }
        }
    }

    @Override // defpackage.th1
    public final long n() {
        if (this.s != null) {
            c00 c00Var = hp.M(this).C;
            int i = ya2.b;
            return wm1.t(c00Var.j0(10.0f), c00Var.j0(40.0f), c00Var.j0(10.0f), c00Var.j0(40.0f));
        }
        return ya2.a;
    }

    @Override // defpackage.th1
    public final void u(jh1 jh1Var, kh1 kh1Var, long j) {
        if (kh1Var == kh1.f) {
            List list = jh1Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (O0(((qh1) list.get(i)).i)) {
                    int i2 = jh1Var.f;
                    if (i2 == 4) {
                        this.u = true;
                        N0();
                        return;
                    } else {
                        if (i2 == 5) {
                            P0();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }
}
