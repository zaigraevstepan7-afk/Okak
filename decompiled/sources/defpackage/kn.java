package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class kn extends rz implements th1, pp0, pu1, ub2, es, w81, ok0 {
    public static final xl1 P = new xl1(14);
    public de0 A;
    public final yc0 B;
    public dk0 C;
    public qz D;
    public si1 E;
    public li0 F;
    public final t31 G;
    public long H;
    public si1 I;
    public r31 J;
    public boolean K;
    public sl0 L;
    public i22 M;
    public final xl1 N;
    public qh1 O;
    public r31 u;
    public dk0 v;
    public boolean w;
    public String x;
    public ap1 y;
    public boolean z;

    public kn(r31 r31Var, dk0 dk0Var, boolean z, boolean z2, String str, ap1 ap1Var, de0 de0Var) {
        this.u = r31Var;
        this.v = dk0Var;
        this.w = z;
        this.x = str;
        this.y = ap1Var;
        this.z = z2;
        this.A = de0Var;
        this.B = new yc0(r31Var, 0, new k(1, this, kn.class, "onFocusChange", "onFocusChange(Z)V", 0, 0));
        int i = gy0.a;
        this.G = new t31(6);
        this.H = 0L;
        r31 r31Var2 = this.u;
        this.J = r31Var2;
        this.K = r31Var2 == null;
        this.N = P;
    }

    @Override // defpackage.d21
    public final boolean A0() {
        return false;
    }

    @Override // defpackage.d21
    public final void D0() {
        e0();
        if (!this.K) {
            T0();
        }
        if (this.z) {
            L0(this.B);
        }
    }

    @Override // defpackage.th1
    public final void E() {
        li0 li0Var;
        r31 r31Var = this.u;
        if (r31Var != null && (li0Var = this.F) != null) {
            r31Var.b(new mi0(li0Var));
        }
        this.F = null;
        if (this.O != null) {
            this.O = null;
            Q0(false);
        }
    }

    @Override // defpackage.d21
    public final void E0() {
        P0();
        if (this.J == null) {
            this.u = null;
        }
        qz qzVar = this.D;
        if (qzVar != null) {
            M0(qzVar);
        }
        this.D = null;
    }

    public final void P0() {
        r31 r31Var = this.u;
        t31 t31Var = this.G;
        if (r31Var != null) {
            si1 si1Var = this.E;
            if (si1Var != null) {
                r31Var.b(new ri1(si1Var));
            }
            si1 si1Var2 = this.I;
            if (si1Var2 != null) {
                r31Var.b(new ri1(si1Var2));
            }
            li0 li0Var = this.F;
            if (li0Var != null) {
                r31Var.b(new mi0(li0Var));
            }
            Object[] objArr = t31Var.c;
            long[] jArr = t31Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                r31Var.b(new ri1((si1) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.E = null;
        this.I = null;
        this.F = null;
        t31Var.a();
    }

    public final void Q0(boolean z) {
        si1 si1Var;
        q10 q10Var;
        r31 r31Var = this.u;
        if (r31Var != null) {
            i22 i22Var = this.M;
            vt vtVar = null;
            if (i22Var != null && i22Var.b()) {
                i22 i22Var2 = this.M;
                if (i22Var2 != null) {
                    i22Var2.c(null);
                }
            } else {
                if (z) {
                    si1Var = this.I;
                } else {
                    si1Var = this.E;
                }
                if (si1Var != null) {
                    ri1 ri1Var = new ri1(si1Var);
                    go0 go0Var = (go0) ((ut) z0()).e.H(g3.O);
                    if (go0Var != null) {
                        q10Var = go0Var.r(new i(0, r31Var, ri1Var));
                    } else {
                        q10Var = null;
                    }
                    rx.C(z0(), null, new l(r31Var, ri1Var, q10Var, vtVar, 0), 3);
                }
            }
            if (z) {
                this.I = null;
            } else {
                this.E = null;
            }
        }
    }

    public final void R0(long j, boolean z) {
        si1 si1Var;
        r31 r31Var = this.u;
        if (r31Var != null) {
            i22 i22Var = this.M;
            if (i22Var != null && i22Var.b()) {
                i22Var.c(null);
                rx.C(z0(), null, new m(i22Var, j, r31Var, (vt) null, 0), 3);
            } else {
                if (z) {
                    si1Var = this.I;
                } else {
                    si1Var = this.E;
                }
                if (si1Var != null) {
                    rx.C(z0(), null, new n(si1Var, r31Var, (vt) null), 3);
                }
            }
            if (z) {
                this.I = null;
            } else {
                this.E = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [sl1, java.lang.Object] */
    public final void S0(long j, boolean z) {
        r31 r31Var = this.u;
        if (r31Var != null) {
            si1 si1Var = new si1(j);
            ?? obj = new Object();
            fr1.t(this, is1.t, new r(obj, 8));
            if (!obj.e) {
                int i = ln.b;
                ViewParent parent = vn.I(this).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (!viewGroup.shouldDelayChildPressedState()) {
                        parent = viewGroup.getParent();
                    }
                }
                if (z) {
                    this.I = si1Var;
                } else {
                    this.E = si1Var;
                }
                rx.C(z0(), null, new n(r31Var, si1Var, (vt) null), 3);
                return;
            }
            this.M = rx.C(z0(), null, new o(r31Var, si1Var, z, this, (vt) null), 3);
        }
    }

    public final void T0() {
        dk0 dk0Var;
        if (this.D == null) {
            if (this.w) {
                dk0Var = this.C;
            } else {
                dk0Var = this.v;
            }
            if (dk0Var != null) {
                if (this.u == null) {
                    this.u = new r31();
                }
                this.B.Q0(this.u);
                r31 r31Var = this.u;
                r31Var.getClass();
                qz a = dk0Var.a(r31Var);
                L0(a);
                this.D = a;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        if (r3.D == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U0(defpackage.r31 r4, defpackage.dk0 r5, boolean r6, boolean r7, java.lang.String r8, defpackage.ap1 r9, defpackage.de0 r10) {
        /*
            r3 = this;
            r31 r0 = r3.J
            boolean r0 = defpackage.sn0.r(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.P0()
            r3.J = r4
            r3.u = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            dk0 r0 = r3.v
            boolean r0 = defpackage.sn0.r(r0, r5)
            if (r0 != 0) goto L1f
            r3.v = r5
            r4 = r1
        L1f:
            boolean r5 = r3.w
            if (r5 == r6) goto L2b
            r3.w = r6
            if (r6 == 0) goto L2a
            r3.e0()
        L2a:
            r4 = r1
        L2b:
            boolean r5 = r3.z
            yc0 r6 = r3.B
            if (r5 == r7) goto L42
            if (r7 == 0) goto L37
            r3.L0(r6)
            goto L3d
        L37:
            r3.M0(r6)
            r3.P0()
        L3d:
            defpackage.xp1.m(r3)
            r3.z = r7
        L42:
            java.lang.String r5 = r3.x
            boolean r5 = defpackage.sn0.r(r5, r8)
            if (r5 != 0) goto L4f
            r3.x = r8
            defpackage.xp1.m(r3)
        L4f:
            ap1 r5 = r3.y
            boolean r5 = defpackage.sn0.r(r5, r9)
            if (r5 != 0) goto L5c
            r3.y = r9
            defpackage.xp1.m(r3)
        L5c:
            r3.A = r10
            boolean r5 = r3.K
            r31 r7 = r3.J
            if (r7 != 0) goto L66
            r8 = r1
            goto L67
        L66:
            r8 = r2
        L67:
            if (r5 == r8) goto L75
            if (r7 != 0) goto L6c
            r2 = r1
        L6c:
            r3.K = r2
            if (r2 != 0) goto L75
            qz r5 = r3.D
            if (r5 != 0) goto L75
            goto L76
        L75:
            r1 = r4
        L76:
            if (r1 == 0) goto L8b
            qz r4 = r3.D
            if (r4 != 0) goto L80
            boolean r5 = r3.K
            if (r5 != 0) goto L8b
        L80:
            if (r4 == 0) goto L85
            r3.M0(r4)
        L85:
            r4 = 0
            r3.D = r4
            r3.T0()
        L8b:
            r31 r3 = r3.u
            r6.Q0(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kn.U0(r31, dk0, boolean, boolean, java.lang.String, ap1, de0):void");
    }

    @Override // defpackage.ok0
    public final void Y() {
        sl0 sl0Var = this.L;
        if (sl0Var != null) {
            sl0Var.A();
        }
    }

    @Override // defpackage.w81
    public final void e0() {
        if (this.w) {
            io.F(this, new h(this, 0));
        }
    }

    @Override // defpackage.pp0
    public final boolean j(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ub2
    public final Object m() {
        return this.N;
    }

    @Override // defpackage.ok0
    public final void s(u7 u7Var, kh1 kh1Var) {
        ArrayList arrayList = (ArrayList) u7Var.b;
        T0();
        if (this.z) {
            if (this.L == null) {
                this.L = new sl0(this);
            }
            sl0 sl0Var = this.L;
            if (sl0Var != null) {
                de0 de0Var = this.A;
                kn knVar = (kn) sl0Var.e;
                int i = 0;
                if (kh1Var == kh1.f) {
                    fk0 fk0Var = (fk0) sl0Var.f;
                    if (fk0Var == null) {
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            fk0 fk0Var2 = (fk0) arrayList.get(i2);
                            if (!fk0Var2.h && fk0Var2.d) {
                                fk0 fk0Var3 = (fk0) arrayList.get(0);
                                sl0Var.f = fk0Var3;
                                knVar.S0(fk0Var3.c, true);
                                fk0Var3.i = true;
                                return;
                            }
                        }
                        return;
                    }
                    long j = fk0Var.c;
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        fk0 fk0Var4 = (fk0) arrayList.get(i3);
                        if (fk0Var4.h && fk0Var4.d) {
                            if (Math.abs(z81.c(z81.d(((fk0) arrayList.get(0)).c, j))) > ((hg2) hp.s(knVar, is.s)).f()) {
                                sl0Var.A();
                                return;
                            }
                            return;
                        }
                    }
                    int size3 = arrayList.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        fk0 fk0Var5 = (fk0) arrayList.get(i4);
                        if (fk0Var5.i || !fk0Var5.h || fk0Var5.d) {
                            int size4 = arrayList.size();
                            while (i < size4) {
                                if (((fk0) arrayList.get(i)).i) {
                                    sl0Var.A();
                                    return;
                                }
                                i++;
                            }
                            return;
                        }
                    }
                    ((fk0) arrayList.get(0)).i = true;
                    knVar.R0(j, true);
                    de0Var.invoke();
                    sl0Var.f = null;
                    return;
                }
                if (kh1Var == kh1.g && ((fk0) sl0Var.f) != null) {
                    int size5 = arrayList.size();
                    while (i < size5) {
                        fk0 fk0Var6 = (fk0) arrayList.get(i);
                        if (fk0Var6.i && fk0Var6 != ((fk0) sl0Var.f)) {
                            sl0Var.A();
                            return;
                        }
                        i++;
                    }
                }
            }
        }
    }

    @Override // defpackage.th1
    public final void u(jh1 jh1Var, kh1 kh1Var, long j) {
        long j2 = ((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L);
        this.H = (Float.floatToRawIntBits((int) (j2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L);
        T0();
        boolean z = this.z;
        kh1 kh1Var2 = kh1.f;
        vt vtVar = null;
        int i = 1;
        int i2 = 0;
        if (z && kh1Var == kh1Var2) {
            int i3 = jh1Var.f;
            if (i3 == 4) {
                rx.C(z0(), null, new q(this, vtVar, i2), 3);
            } else if (i3 == 5) {
                rx.C(z0(), null, new q(this, vtVar, i), 3);
            }
        }
        if (kh1Var == kh1Var2) {
            qh1 qh1Var = this.O;
            if (qh1Var == null) {
                if (w52.d(jh1Var, true)) {
                    qh1 qh1Var2 = (qh1) jh1Var.a.get(0);
                    qh1Var2.a();
                    this.O = qh1Var2;
                    if (this.z) {
                        S0(qh1Var2.c, false);
                        return;
                    }
                    return;
                }
                return;
            }
            List list = jh1Var.a;
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!qo.p((qh1) list.get(i4))) {
                    long n0 = hp.M(this).C.n0(((hg2) hp.s(this, is.s)).d());
                    float max = Math.max(0.0f, Float.intBitsToFloat((int) (n0 >> 32)) - ((int) (j >> 32))) / 2.0f;
                    float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (n0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                    long floatToRawIntBits = (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        qh1 qh1Var3 = (qh1) list.get(i5);
                        if (qh1Var3.b() || qo.R(qh1Var3, j, floatToRawIntBits)) {
                            this.O = null;
                            Q0(false);
                            return;
                        }
                    }
                    return;
                }
            }
            ((qh1) list.get(0)).a();
            if (this.z) {
                R0(qh1Var.c, false);
                this.A.invoke();
            }
            this.O = null;
            return;
        }
        if (kh1Var == kh1.g && this.O != null) {
            List list2 = jh1Var.a;
            int size3 = list2.size();
            for (int i6 = 0; i6 < size3; i6++) {
                qh1 qh1Var4 = (qh1) list2.get(i6);
                if (qh1Var4.b() && qh1Var4 != this.O) {
                    this.O = null;
                    Q0(false);
                    return;
                }
            }
        }
    }

    @Override // defpackage.pu1
    public final void u0(av1 av1Var) {
        ap1 ap1Var = this.y;
        if (ap1Var != null) {
            xu1.e(av1Var, ap1Var.a);
        }
        String str = this.x;
        h hVar = new h(this, 1);
        ep0[] ep0VarArr = xu1.a;
        av1Var.a(lu1.b, new s0(str, hVar));
        if (this.z) {
            this.B.u0(av1Var);
        } else {
            av1Var.a(vu1.i, od2.a);
        }
        O0(av1Var);
    }

    @Override // defpackage.pu1
    public final boolean w0() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
    
        if (((r7 & ((~r7) << 6)) & r14) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00cb, code lost:
    
        r16 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(android.view.KeyEvent r24) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kn.x(android.view.KeyEvent):boolean");
    }

    public void O0(av1 av1Var) {
    }
}
