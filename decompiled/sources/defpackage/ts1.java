package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ts1 extends m30 implements pp0, pu1 {
    public j7 M;
    public z90 N;
    public final q4 O;
    public final is1 P;
    public final hy Q;
    public final at1 R;
    public final os1 S;
    public final tc0 T;
    public final jt U;
    public h8 V;
    public rs1 W;
    public n00 X;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [d21, is1, qz] */
    /* JADX WARN: Type inference failed for: r0v5, types: [d21, uj, qz] */
    /* JADX WARN: Type inference failed for: r10v0, types: [ts1, rz] */
    /* JADX WARN: Type inference failed for: r1v2, types: [z90] */
    public ts1(j7 j7Var, xj xjVar, z90 z90Var, r31 r31Var, sb1 sb1Var, us1 us1Var, boolean z, boolean z2) {
        super(ms1.a, z, r31Var, sb1Var);
        hy hyVar;
        this.M = j7Var;
        this.N = z90Var;
        q4 q4Var = new q4();
        this.O = q4Var;
        ?? d21Var = new d21();
        d21Var.s = z;
        L0(d21Var);
        this.P = d21Var;
        hy hyVar2 = new hy(new tx(new ov1(ms1.d)));
        this.Q = hyVar2;
        j7 j7Var2 = this.M;
        ?? r1 = this.N;
        if (r1 == 0) {
            hyVar = hyVar2;
        } else {
            hyVar = r1;
        }
        at1 at1Var = new at1(us1Var, j7Var2, hyVar, sb1Var, z2, q4Var, this, new ps1(this, 0));
        this.R = at1Var;
        os1 os1Var = new os1(at1Var, z);
        this.S = os1Var;
        tc0 tc0Var = new tc0(2, null, 10);
        L0(tc0Var);
        this.T = tc0Var;
        jt jtVar = new jt(sb1Var, at1Var, z2, xjVar, new ps1(this, 1));
        L0(jtVar);
        this.U = jtVar;
        L0(new r71(os1Var, q4Var));
        ?? d21Var2 = new d21();
        d21Var2.s = jtVar;
        L0(d21Var2);
    }

    @Override // defpackage.d21
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.d21
    public final void D0() {
        if (this.r) {
            c00 c00Var = hp.M(this).C;
            hy hyVar = this.Q;
            hyVar.getClass();
            hyVar.a = new tx(new ov1(c00Var));
        }
        n00 n00Var = this.X;
        if (n00Var != null) {
            n00Var.e = hp.M(this).C;
        }
    }

    @Override // defpackage.m30
    public final Object S0(l30 l30Var, l30 l30Var2) {
        at1 at1Var = this.R;
        Object f = at1Var.f(t41.f, new l(l30Var, at1Var, null, 28), l30Var2);
        if (f == hv.e) {
            return f;
        }
        return od2.a;
    }

    @Override // defpackage.m30
    public final void Y0(y20 y20Var) {
        gv gvVar = (gv) ((de0) this.O.h).invoke();
        if (gvVar != null) {
            rx.C(gvVar, null, new b31(y20Var, this, null, 5), 3);
        } else {
            se.p("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
    }

    @Override // defpackage.qz
    public final void c() {
        E();
        if (this.r) {
            c00 c00Var = hp.M(this).C;
            hy hyVar = this.Q;
            hyVar.getClass();
            hyVar.a = new tx(new ov1(c00Var));
        }
        n00 n00Var = this.X;
        if (n00Var != null) {
            n00Var.e = hp.M(this).C;
        }
    }

    @Override // defpackage.m30
    public final boolean d1() {
        float f;
        float f2;
        float f3;
        float f4;
        at1 at1Var = this.R;
        if (!at1Var.a.a()) {
            j7 j7Var = at1Var.b;
            if (j7Var != null) {
                a50 a50Var = j7Var.c;
                EdgeEffect edgeEffect = a50Var.d;
                if (edgeEffect != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f4 = xc.c(edgeEffect);
                    } else {
                        f4 = 0.0f;
                    }
                    if (f4 != 0.0f) {
                        return true;
                    }
                }
                EdgeEffect edgeEffect2 = a50Var.e;
                if (edgeEffect2 != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f3 = xc.c(edgeEffect2);
                    } else {
                        f3 = 0.0f;
                    }
                    if (f3 != 0.0f) {
                        return true;
                    }
                }
                EdgeEffect edgeEffect3 = a50Var.f;
                if (edgeEffect3 != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f2 = xc.c(edgeEffect3);
                    } else {
                        f2 = 0.0f;
                    }
                    if (f2 != 0.0f) {
                        return true;
                    }
                }
                EdgeEffect edgeEffect4 = a50Var.g;
                if (edgeEffect4 != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f = xc.c(edgeEffect4);
                    } else {
                        f = 0.0f;
                    }
                    if (f == 0.0f) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void g1(j7 j7Var, xj xjVar, z90 z90Var, r31 r31Var, sb1 sb1Var, us1 us1Var, boolean z, boolean z2) {
        boolean z3;
        z90 z90Var2;
        boolean z4 = true;
        boolean z5 = false;
        if (this.w != z) {
            this.S.f = z;
            this.P.s = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (z90Var == null) {
            z90Var2 = this.Q;
        } else {
            z90Var2 = z90Var;
        }
        at1 at1Var = this.R;
        if (!sn0.r(at1Var.a, us1Var)) {
            at1Var.a = us1Var;
            z5 = true;
        }
        at1Var.b = j7Var;
        if (at1Var.d != sb1Var) {
            at1Var.d = sb1Var;
            z5 = true;
        }
        if (at1Var.e != z2) {
            at1Var.e = z2;
        } else {
            z4 = z5;
        }
        at1Var.c = z90Var2;
        at1Var.f = this.O;
        jt jtVar = this.U;
        jtVar.s = sb1Var;
        jtVar.u = z2;
        jtVar.v = xjVar;
        this.M = j7Var;
        this.N = z90Var;
        hr1 hr1Var = ms1.a;
        sb1 sb1Var2 = at1Var.d;
        sb1 sb1Var3 = sb1.e;
        if (sb1Var2 != sb1Var3) {
            sb1Var3 = sb1.f;
        }
        f1(hr1Var, z, r31Var, sb1Var3, z4);
        if (z3) {
            this.V = null;
            this.W = null;
            xp1.m(this);
        }
    }

    @Override // defpackage.pp0
    public final boolean j(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.m30, defpackage.th1
    public final void u(jh1 jh1Var, kh1 kh1Var, long j) {
        List list = jh1Var.a;
        List list2 = jh1Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((Boolean) this.v.invoke(new wh1(((qh1) list.get(i)).i))).booleanValue()) {
                super.u(jh1Var, kh1Var, j);
                break;
            }
            i++;
        }
        if (this.w) {
            kh1 kh1Var2 = kh1.e;
            if (kh1Var == kh1Var2 && jh1Var.f == 6) {
                if (this.X == null) {
                    this.X = new n00(this.R, new rg2(ViewConfiguration.get(vn.I(this).getContext()), 1), new eq(2, this, ts1.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), hp.M(this).C);
                }
                n00 n00Var = this.X;
                if (n00Var != null) {
                    gv z0 = z0();
                    if (((i22) n00Var.g) == null) {
                        n00Var.g = rx.C(z0, null, new j(n00Var, null, 29), 3);
                    }
                }
            }
            n00 n00Var2 = this.X;
            if (n00Var2 != null && jh1Var.f == 6) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (((qh1) list2.get(i2)).b()) {
                        return;
                    }
                }
                if (kh1Var == kh1Var2 && n00Var2.a) {
                    n00Var2.d(jh1Var);
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((qh1) list2.get(i3)).a();
                    }
                }
                if (kh1Var == kh1.f && !n00Var2.a && n00Var2.d(jh1Var)) {
                    int size4 = list2.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        ((qh1) list2.get(i4)).a();
                    }
                }
            }
        }
    }

    @Override // defpackage.pu1
    public final void u0(av1 av1Var) {
        if (this.w && (this.V == null || this.W == null)) {
            this.V = new h8(this, 16);
            this.W = new rs1(this, null);
        }
        h8 h8Var = this.V;
        if (h8Var != null) {
            ep0[] ep0VarArr = xu1.a;
            av1Var.a(lu1.d, new s0(null, h8Var));
        }
        rs1 rs1Var = this.W;
        if (rs1Var != null) {
            ep0[] ep0VarArr2 = xu1.a;
            av1Var.a(lu1.e, rs1Var);
        }
    }

    @Override // defpackage.pp0
    public final boolean x(KeyEvent keyEvent) {
        float f;
        long floatToRawIntBits;
        float f2;
        boolean z = false;
        if (!this.w || ((!jp0.a(mp0.v(keyEvent), jp0.D) && !jp0.a(vn.i(keyEvent.getKeyCode()), jp0.C)) || mp0.w(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        if (this.R.d == sb1.e) {
            z = true;
        }
        jt jtVar = this.U;
        if (z) {
            int i = (int) (jtVar.z & 4294967295L);
            if (jp0.a(vn.i(keyEvent.getKeyCode()), jp0.C)) {
                f2 = i;
            } else {
                f2 = -i;
            }
            floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(f2));
        } else {
            int i2 = (int) (jtVar.z >> 32);
            if (jp0.a(vn.i(keyEvent.getKeyCode()), jp0.C)) {
                f = i2;
            } else {
                f = -i2;
            }
            floatToRawIntBits = (Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        }
        rx.C(z0(), null, new rs1(this, floatToRawIntBits, null, 0), 3);
        return true;
    }

    @Override // defpackage.m30
    public final void X0(long j) {
    }
}
