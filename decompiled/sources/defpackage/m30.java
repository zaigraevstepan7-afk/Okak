package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class m30 extends rz implements th1, ok0, es {
    public boolean A;
    public boolean B;
    public r20 C;
    public u20 D;
    public t20 E;
    public s20 F;
    public qo G;
    public ov1 H;
    public za2 J;
    public mk0 K;
    public sb1 u;
    public oe0 v;
    public boolean w;
    public r31 x;
    public lk y;
    public o30 z;
    public long I = 9205357640488583168L;
    public long L = 0;

    public m30(oe0 oe0Var, boolean z, r31 r31Var, sb1 sb1Var) {
        this.u = sb1Var;
        this.v = oe0Var;
        this.w = z;
        this.x = r31Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O0(defpackage.m30 r5, defpackage.wt r6) {
        /*
            boolean r0 = r6 instanceof defpackage.i30
            if (r0 == 0) goto L13
            r0 = r6
            i30 r0 = (defpackage.i30) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            i30 r0 = new i30
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.e
            int r1 = r0.g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.io.K(r6)
            goto L47
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r5)
            return r2
        L2c:
            defpackage.io.K(r6)
            o30 r6 = r5.z
            if (r6 == 0) goto L49
            r31 r1 = r5.x
            if (r1 == 0) goto L47
            n30 r4 = new n30
            r4.<init>(r6)
            r0.g = r3
            java.lang.Object r6 = r1.a(r4, r0)
            hv r0 = defpackage.hv.e
            if (r6 != r0) goto L47
            return r0
        L47:
            r5.z = r2
        L49:
            y20 r6 = new y20
            r0 = 0
            r2 = 0
            r6.<init>(r0, r2)
            r5.Y0(r6)
            od2 r5 = defpackage.od2.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m30.O0(m30, wt):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r1.a(r5, r0) == r4) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, hn0, o30] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P0(defpackage.m30 r6, defpackage.x20 r7, defpackage.wt r8) {
        /*
            boolean r0 = r8 instanceof defpackage.j30
            if (r0 == 0) goto L13
            r0 = r8
            j30 r0 = (defpackage.j30) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            j30 r0 = new j30
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.g
            int r1 = r0.i
            r2 = 2
            r3 = 1
            hv r4 = defpackage.hv.e
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            o30 r7 = r0.f
            x20 r0 = r0.e
            defpackage.io.K(r8)
            goto L6e
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r6)
            r6 = 0
            return r6
        L35:
            x20 r7 = r0.e
            defpackage.io.K(r8)
            goto L56
        L3b:
            defpackage.io.K(r8)
            o30 r8 = r6.z
            if (r8 == 0) goto L56
            r31 r1 = r6.x
            if (r1 == 0) goto L56
            n30 r5 = new n30
            r5.<init>(r8)
            r0.e = r7
            r0.i = r3
            java.lang.Object r8 = r1.a(r5, r0)
            if (r8 != r4) goto L56
            goto L6b
        L56:
            o30 r8 = new o30
            r8.<init>()
            r31 r1 = r6.x
            if (r1 == 0) goto L70
            r0.e = r7
            r0.f = r8
            r0.i = r2
            java.lang.Object r0 = r1.a(r8, r0)
            if (r0 != r4) goto L6c
        L6b:
            return r4
        L6c:
            r0 = r7
            r7 = r8
        L6e:
            r8 = r7
            r7 = r0
        L70:
            r6.z = r8
            long r7 = r7.a
            r6.X0(r7)
            od2 r6 = defpackage.od2.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m30.P0(m30, x20, wt):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q0(defpackage.m30 r5, defpackage.y20 r6, defpackage.wt r7) {
        /*
            boolean r0 = r7 instanceof defpackage.k30
            if (r0 == 0) goto L13
            r0 = r7
            k30 r0 = (defpackage.k30) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            k30 r0 = new k30
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f
            int r1 = r0.h
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            y20 r6 = r0.e
            defpackage.io.K(r7)
            goto L4b
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r5)
            return r2
        L2e:
            defpackage.io.K(r7)
            o30 r7 = r5.z
            if (r7 == 0) goto L4d
            r31 r1 = r5.x
            if (r1 == 0) goto L4b
            p30 r4 = new p30
            r4.<init>(r7)
            r0.e = r6
            r0.h = r3
            java.lang.Object r7 = r1.a(r4, r0)
            hv r0 = defpackage.hv.e
            if (r7 != r0) goto L4b
            return r0
        L4b:
            r5.z = r2
        L4d:
            r5.Y0(r6)
            od2 r5 = defpackage.od2.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m30.Q0(m30, y20, wt):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [t20, java.lang.Object] */
    public static void V0(m30 m30Var, qh1 qh1Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        t20 t20Var = m30Var.E;
        t20 t20Var2 = t20Var;
        if (t20Var == null) {
            ?? obj = new Object();
            obj.c = null;
            obj.d = Long.MAX_VALUE;
            obj.e = false;
            m30Var.E = obj;
            t20Var2 = obj;
        }
        t20Var2.c = qh1Var;
        t20Var2.d = j;
        za2 za2Var = m30Var.J;
        sb1 sb1Var = m30Var.u;
        if (za2Var == null) {
            m30Var.J = new za2(sb1Var);
        } else {
            za2Var.a = sb1Var;
            za2Var.b = j2;
        }
        t20Var2.e = false;
        m30Var.G = t20Var2;
    }

    @Override // defpackage.th1
    public final void E() {
        if (this.B) {
            T0();
            if (this.A) {
                Z0().j(v20.a);
            }
            this.H = null;
        }
        this.B = false;
    }

    @Override // defpackage.d21
    public final void E0() {
        this.A = false;
        R0();
        this.L = 0L;
    }

    public final void R0() {
        o30 o30Var = this.z;
        if (o30Var != null) {
            r31 r31Var = this.x;
            if (r31Var != null) {
                r31Var.b(new n30(o30Var));
            }
            this.z = null;
        }
    }

    public abstract Object S0(l30 l30Var, l30 l30Var2);

    /* JADX WARN: Type inference failed for: r0v2, types: [r20, java.lang.Object] */
    public final void T0() {
        r20 r20Var = this.C;
        q20 q20Var = q20.g;
        r20 r20Var2 = r20Var;
        if (r20Var == null) {
            ?? obj = new Object();
            obj.c = q20Var;
            obj.d = false;
            this.C = obj;
            r20Var2 = obj;
        }
        r20Var2.c = q20Var;
        r20Var2.d = false;
        this.G = r20Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [s20, java.lang.Object] */
    public final void U0(qh1 qh1Var, long j, za2 za2Var) {
        s20 s20Var = this.F;
        s20 s20Var2 = s20Var;
        if (s20Var == null) {
            ?? obj = new Object();
            obj.c = null;
            obj.d = Long.MAX_VALUE;
            this.F = obj;
            s20Var2 = obj;
        }
        s20Var2.c = qh1Var;
        s20Var2.d = j;
        za2Var.b = 0L;
        this.G = s20Var2;
    }

    public final void W0(z20 z20Var) {
        if ((z20Var instanceof x20) && !this.A) {
            this.A = true;
            e1();
        }
        Z0().j(z20Var);
    }

    public abstract void X0(long j);

    @Override // defpackage.ok0
    public final void Y() {
        mk0 mk0Var = this.K;
        if (mk0Var != null) {
            mk0Var.a();
            m30 m30Var = mk0Var.a;
            if (m30Var.A) {
                m30Var.W0(v20.a);
            }
            mk0Var.g = null;
            nk0 nk0Var = mk0Var.k;
            nk0Var.a = 0;
            nk0Var.b.clear();
        }
    }

    public abstract void Y0(y20 y20Var);

    public final dm Z0() {
        lk lkVar = this.y;
        if (lkVar != null) {
            return lkVar;
        }
        se.h("Events channel not initialized.");
        return null;
    }

    public final ov1 a1() {
        ov1 ov1Var = this.H;
        if (ov1Var != null) {
            return ov1Var;
        }
        se.h("Velocity Tracker not initialized.");
        return null;
    }

    public final void b1(qh1 qh1Var, long j) {
        long u = hp.L(this.e).u(0L);
        if (!z81.b(this.I, 9205357640488583168L) && !z81.b(u, this.I)) {
            this.L = z81.e(this.L, z81.d(u, this.I));
        }
        this.I = u;
        yq1.d(a1(), qh1Var, this.L);
        Z0().j(new w20(j, false));
    }

    public final void c1(qh1 qh1Var, qh1 qh1Var2, long j) {
        if (this.H == null) {
            this.H = new ov1(12);
        }
        yq1.d(a1(), qh1Var, 0L);
        long d = z81.d(qh1Var2.c, j);
        this.L = 0L;
        if (((Boolean) this.v.invoke(new wh1(qh1Var.i))).booleanValue()) {
            if (!this.A) {
                if (this.y == null) {
                    this.y = sn0.c(Integer.MAX_VALUE, 6, null);
                }
                e1();
            }
            this.I = hp.L(this).u(0L);
            Z0().j(new x20(d));
        }
    }

    public abstract boolean d1();

    public final void e1() {
        this.A = true;
        if (this.y == null) {
            this.y = sn0.c(Integer.MAX_VALUE, 6, null);
        }
        rx.C(z0(), null, new l30(this, null), 3);
    }

    public final void f1(oe0 oe0Var, boolean z, r31 r31Var, sb1 sb1Var, boolean z2) {
        this.v = oe0Var;
        boolean z3 = true;
        if (this.w != z) {
            this.w = z;
            if (!z) {
                R0();
                this.K = null;
            }
            z2 = true;
        }
        if (!sn0.r(this.x, r31Var)) {
            R0();
            this.x = r31Var;
        }
        if (this.u != sb1Var) {
            this.u = sb1Var;
        } else {
            z3 = z2;
        }
        if (z3) {
            boolean z4 = this.B;
            v20 v20Var = v20.a;
            if (z4) {
                T0();
                if (this.A) {
                    Z0().j(v20Var);
                }
                this.H = null;
            }
            mk0 mk0Var = this.K;
            if (mk0Var != null) {
                mk0Var.a();
                m30 m30Var = mk0Var.a;
                if (m30Var.A) {
                    m30Var.W0(v20Var);
                }
                mk0Var.g = null;
                nk0 nk0Var = mk0Var.k;
                nk0Var.a = 0;
                nk0Var.b.clear();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [kk0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [kk0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, hk0] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    @Override // defpackage.ok0
    public final void s(u7 u7Var, kh1 kh1Var) {
        Object obj;
        fk0 fk0Var;
        float f;
        fk0 fk0Var2;
        char c;
        float intBitsToFloat;
        fk0 fk0Var3;
        fk0 fk0Var4;
        gk0 gk0Var;
        int i = u7Var.a;
        ArrayList arrayList = (ArrayList) u7Var.b;
        if (this.w) {
            if (this.K == null) {
                this.K = new mk0(this);
            }
            mk0 mk0Var = this.K;
            if (mk0Var != null) {
                m30 m30Var = mk0Var.a;
                if (mk0Var.f == null) {
                    hk0 hk0Var = mk0Var.b;
                    hk0 hk0Var2 = hk0Var;
                    if (hk0Var == null) {
                        ?? obj2 = new Object();
                        obj2.d = gk0.g;
                        obj2.e = false;
                        mk0Var.b = obj2;
                        hk0Var2 = obj2;
                    }
                    mk0Var.f = hk0Var2;
                }
                vn vnVar = mk0Var.f;
                if (vnVar != null) {
                    boolean z = vnVar instanceof hk0;
                    kh1 kh1Var2 = kh1.e;
                    boolean z2 = true;
                    long j = 0;
                    kh1 kh1Var3 = kh1.f;
                    if (z) {
                        hk0 hk0Var3 = (hk0) vnVar;
                        if (!arrayList.isEmpty()) {
                            int size = arrayList.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                fk0 fk0Var5 = (fk0) arrayList.get(i2);
                                if (fk0Var5.h || !fk0Var5.d) {
                                    return;
                                }
                            }
                            fk0 fk0Var6 = (fk0) wn.g0(arrayList);
                            int i3 = lk0.a[hk0Var3.d.ordinal()];
                            gk0 gk0Var2 = gk0.f;
                            gk0 gk0Var3 = gk0.e;
                            if (i3 == 1) {
                                if (!m30Var.d1()) {
                                    gk0Var = gk0Var3;
                                } else {
                                    gk0Var = gk0Var2;
                                }
                            } else {
                                gk0Var = hk0Var3.d;
                            }
                            hk0Var3.d = gk0Var;
                            if (kh1Var == kh1Var2 && gk0Var == gk0Var2) {
                                fk0Var6.i = true;
                                hk0Var3.e = true;
                            }
                            if (kh1Var == kh1Var3) {
                                if (gk0Var == gk0Var3) {
                                    mk0.c(mk0Var, fk0Var6, fk0Var6.a, 0L, 12);
                                    return;
                                }
                                if (hk0Var3.e) {
                                    mk0Var.f(fk0Var6, fk0Var6, new ek0(i), 0L);
                                    mk0Var.e(fk0Var6, new ek0(i), 0L);
                                    long j2 = fk0Var6.a;
                                    kk0 kk0Var = mk0Var.c;
                                    kk0 kk0Var2 = kk0Var;
                                    if (kk0Var == null) {
                                        ?? obj3 = new Object();
                                        obj3.d = Long.MAX_VALUE;
                                        mk0Var.c = obj3;
                                        kk0Var2 = obj3;
                                    }
                                    kk0Var2.d = j2;
                                    mk0Var.f = kk0Var2;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    boolean z3 = vnVar instanceof jk0;
                    kh1 kh1Var4 = kh1.g;
                    if (z3) {
                        jk0 jk0Var = (jk0) vnVar;
                        if (kh1Var != kh1Var2) {
                            int size2 = arrayList.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 < size2) {
                                    ?? r14 = arrayList.get(i4);
                                    f = 0.0f;
                                    if (hp.v(((fk0) r14).a, jk0Var.e)) {
                                        fk0Var2 = r14;
                                        break;
                                    }
                                    i4++;
                                } else {
                                    f = 0.0f;
                                    fk0Var2 = null;
                                    break;
                                }
                            }
                            fk0 fk0Var7 = fk0Var2;
                            if (fk0Var7 == null) {
                                int size3 = arrayList.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 < size3) {
                                        fk0Var4 = arrayList.get(i5);
                                        if (((fk0) fk0Var4).d) {
                                            break;
                                        } else {
                                            i5++;
                                        }
                                    } else {
                                        fk0Var4 = 0;
                                        break;
                                    }
                                }
                                fk0Var7 = fk0Var4;
                                if (fk0Var7 == null) {
                                    mk0Var.a();
                                    return;
                                }
                                jk0Var.e = fk0Var7.a;
                            }
                            fk0 fk0Var8 = fk0Var7;
                            if (kh1Var == kh1Var3) {
                                if (!fk0Var8.i) {
                                    if (xn.m(fk0Var8)) {
                                        int size4 = arrayList.size();
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 < size4) {
                                                ?? r6 = arrayList.get(i6);
                                                if (((fk0) r6).d) {
                                                    fk0Var3 = r6;
                                                    break;
                                                }
                                                i6++;
                                            } else {
                                                fk0Var3 = null;
                                                break;
                                            }
                                        }
                                        fk0 fk0Var9 = fk0Var3;
                                        if (fk0Var9 == null) {
                                            mk0Var.a();
                                        } else {
                                            jk0Var.e = fk0Var9.a;
                                        }
                                    } else {
                                        hg2 hg2Var = (hg2) hp.s(m30Var, is.s);
                                        float f2 = g30.a;
                                        float f3 = hg2Var.f();
                                        za2 za2Var = mk0Var.i;
                                        if (za2Var != null) {
                                            long J = xn.J(fk0Var8, m30Var.u, new ek0(i));
                                            sb1 sb1Var = m30Var.u;
                                            long j3 = fk0Var8.g;
                                            if (sb1Var != null) {
                                                if (i == 1) {
                                                    intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
                                                    c = ' ';
                                                } else {
                                                    c = ' ';
                                                    if (i == 2) {
                                                        intBitsToFloat = Float.intBitsToFloat((int) (j3 & 4294967295L));
                                                    }
                                                }
                                                j3 = sb1Var == sb1.f ? (Float.floatToRawIntBits(intBitsToFloat) << c) | (Float.floatToRawIntBits(f) & 4294967295L) : (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(f) << c);
                                            }
                                            long a = za2Var.a(f3, J, j3);
                                            if ((9223372034707292159L & a) != 9205357640488583168L) {
                                                fk0Var8.i = true;
                                                fk0 fk0Var10 = jk0Var.d;
                                                fk0Var10.getClass();
                                                mk0Var.f(fk0Var10, fk0Var8, new ek0(i), a);
                                                mk0Var.e(fk0Var8, new ek0(i), a);
                                                long j4 = fk0Var8.a;
                                                kk0 kk0Var3 = mk0Var.c;
                                                kk0 kk0Var4 = kk0Var3;
                                                if (kk0Var3 == null) {
                                                    ?? obj4 = new Object();
                                                    obj4.d = Long.MAX_VALUE;
                                                    mk0Var.c = obj4;
                                                    kk0Var4 = obj4;
                                                }
                                                kk0Var4.d = j4;
                                                mk0Var.f = kk0Var4;
                                            } else {
                                                jk0Var.f = true;
                                            }
                                        } else {
                                            se.h("Touch slop detector not initialized.");
                                            return;
                                        }
                                    }
                                } else {
                                    fk0 fk0Var11 = jk0Var.d;
                                    if (fk0Var11 != null) {
                                        long j5 = jk0Var.e;
                                        za2 za2Var2 = mk0Var.i;
                                        if (za2Var2 != null) {
                                            mk0Var.b(fk0Var11, j5, za2Var2);
                                        } else {
                                            se.h("AwaitTouchSlop.touchSlopDetector was not initialized");
                                            return;
                                        }
                                    } else {
                                        se.h("AwaitTouchSlop.initialDown was not initialized");
                                        return;
                                    }
                                }
                            }
                            if (kh1Var == kh1Var4 && jk0Var.f) {
                                if (fk0Var8.i) {
                                    fk0 fk0Var12 = jk0Var.d;
                                    if (fk0Var12 != null) {
                                        long j6 = jk0Var.e;
                                        za2 za2Var3 = mk0Var.i;
                                        if (za2Var3 != null) {
                                            mk0Var.b(fk0Var12, j6, za2Var3);
                                            return;
                                        } else {
                                            se.h("AwaitTouchSlop.touchSlopDetector was not initialized");
                                            return;
                                        }
                                    }
                                    se.h("AwaitTouchSlop.initialDown was not initialized");
                                    return;
                                }
                                jk0Var.f = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (vnVar instanceof ik0) {
                        ik0 ik0Var = (ik0) vnVar;
                        if (kh1Var == kh1Var4) {
                            int size5 = arrayList.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size5) {
                                    break;
                                }
                                if (((fk0) arrayList.get(i7)).i) {
                                    z2 = false;
                                    break;
                                }
                                i7++;
                            }
                            int size6 = arrayList.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size6) {
                                    break;
                                }
                                if (((fk0) arrayList.get(i8)).d) {
                                    if (!arrayList.isEmpty()) {
                                        if (z2) {
                                            long J2 = xn.J((fk0) wn.g0(arrayList), m30Var.u, new ek0(i));
                                            fk0 fk0Var13 = ik0Var.d;
                                            fk0Var13.getClass();
                                            long d = z81.d(J2, xn.J(fk0Var13, m30Var.u, new ek0(i)));
                                            fk0 fk0Var14 = ik0Var.d;
                                            if (fk0Var14 != null) {
                                                mk0.c(mk0Var, fk0Var14, ik0Var.e, d, 8);
                                                return;
                                            } else {
                                                se.h("AwaitGesturePickup.initialDown was not initialized.");
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                } else {
                                    i8++;
                                }
                            }
                            mk0Var.a();
                            return;
                        }
                        return;
                    }
                    if (vnVar instanceof kk0) {
                        kk0 kk0Var5 = (kk0) vnVar;
                        if (kh1Var == kh1Var3) {
                            long j7 = kk0Var5.d;
                            int size7 = arrayList.size();
                            int i9 = 0;
                            while (true) {
                                if (i9 < size7) {
                                    obj = arrayList.get(i9);
                                    if (hp.v(((fk0) obj).a, j7)) {
                                        break;
                                    } else {
                                        i9++;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            fk0 fk0Var15 = (fk0) obj;
                            if (fk0Var15 != null) {
                                boolean m = xn.m(fk0Var15);
                                v20 v20Var = v20.a;
                                if (m) {
                                    int size8 = arrayList.size();
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 < size8) {
                                            ?? r9 = arrayList.get(i10);
                                            if (((fk0) r9).d) {
                                                fk0Var = r9;
                                                break;
                                            }
                                            i10++;
                                        } else {
                                            fk0Var = null;
                                            break;
                                        }
                                    }
                                    fk0 fk0Var16 = fk0Var;
                                    if (fk0Var16 == null) {
                                        if (!fk0Var15.i && xn.m(fk0Var15)) {
                                            xn.k(mk0Var.d(), fk0Var15, m30Var.u, new ek0(i), mk0Var.j, mk0Var.l);
                                            float e = ((hg2) hp.s(m30Var, is.s)).e();
                                            long f4 = mk0Var.d().f(xq1.c(e, e));
                                            jz jzVar = (jz) mk0Var.d().f;
                                            af2 af2Var = jzVar.a;
                                            bf.M(r6, 0, af2Var.d.length);
                                            af2Var.e = 0;
                                            af2 af2Var2 = jzVar.b;
                                            bf.M(r7, 0, af2Var2.d.length);
                                            af2Var2.e = 0;
                                            jzVar.c = 0L;
                                            m30Var.W0(new y20(u30.a(f4), true));
                                        } else {
                                            m30Var.W0(v20Var);
                                        }
                                        mk0Var.a();
                                        return;
                                    }
                                    kk0Var5.d = fk0Var16.a;
                                    return;
                                }
                                if (fk0Var15.i) {
                                    m30Var.W0(v20Var);
                                    return;
                                }
                                sb1 sb1Var2 = m30Var.u;
                                ek0 ek0Var = new ek0(i);
                                if (z81.c(z81.d(xn.J(fk0Var15, sb1Var2, ek0Var), xn.K(fk0Var15, sb1Var2, ek0Var))) != 0.0f) {
                                    sb1 sb1Var3 = m30Var.u;
                                    ek0 ek0Var2 = new ek0(i);
                                    long d2 = z81.d(xn.J(fk0Var15, sb1Var3, ek0Var2), xn.K(fk0Var15, sb1Var3, ek0Var2));
                                    if (!fk0Var15.i) {
                                        j = d2;
                                    }
                                    mk0Var.e(fk0Var15, new ek0(i), j);
                                    fk0Var15.i = true;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    se.m();
                    return;
                }
                se.h("currentDragState should not be null");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v35, types: [u20, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [u20, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [r20, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.Object] */
    @Override // defpackage.th1
    public void u(jh1 jh1Var, kh1 kh1Var, long j) {
        Object obj;
        qh1 qh1Var;
        Object obj2;
        qh1 qh1Var2;
        qh1 qh1Var3;
        q20 q20Var;
        boolean z = true;
        this.B = true;
        if (this.w) {
            if (this.G == null) {
                r20 r20Var = this.C;
                r20 r20Var2 = r20Var;
                if (r20Var == null) {
                    ?? obj3 = new Object();
                    obj3.c = q20.g;
                    obj3.d = false;
                    this.C = obj3;
                    r20Var2 = obj3;
                }
                this.G = r20Var2;
            }
            qo qoVar = this.G;
            if (qoVar != null) {
                boolean z2 = qoVar instanceof r20;
                kh1 kh1Var2 = kh1.e;
                kh1 kh1Var3 = kh1.f;
                if (z2) {
                    r20 r20Var3 = (r20) qoVar;
                    if (!jh1Var.a.isEmpty() && w52.d(jh1Var, false)) {
                        qh1 qh1Var4 = (qh1) wn.g0(jh1Var.a);
                        int i = h30.a[r20Var3.c.ordinal()];
                        q20 q20Var2 = q20.f;
                        q20 q20Var3 = q20.e;
                        if (i == 1) {
                            if (!d1()) {
                                q20Var = q20Var3;
                            } else {
                                q20Var = q20Var2;
                            }
                        } else {
                            q20Var = r20Var3.c;
                        }
                        r20Var3.c = q20Var;
                        if (kh1Var == kh1Var2 && q20Var == q20Var2) {
                            qh1Var4.a();
                            r20Var3.d = true;
                        }
                        if (kh1Var == kh1Var3) {
                            if (q20Var == q20Var3) {
                                V0(this, qh1Var4, qh1Var4.a, 0L, 12);
                                return;
                            }
                            if (r20Var3.d) {
                                c1(qh1Var4, qh1Var4, 0L);
                                b1(qh1Var4, 0L);
                                long j2 = qh1Var4.a;
                                u20 u20Var = this.D;
                                u20 u20Var2 = u20Var;
                                if (u20Var == null) {
                                    ?? obj4 = new Object();
                                    obj4.c = Long.MAX_VALUE;
                                    this.D = obj4;
                                    u20Var2 = obj4;
                                }
                                u20Var2.c = j2;
                                this.G = u20Var2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                boolean z3 = qoVar instanceof t20;
                kh1 kh1Var4 = kh1.g;
                if (z3) {
                    t20 t20Var = (t20) qoVar;
                    if (kh1Var != kh1Var2) {
                        List list = jh1Var.a;
                        int size = list.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                obj2 = list.get(i2);
                                int i3 = size;
                                if (hp.v(((qh1) obj2).a, t20Var.d)) {
                                    break;
                                }
                                i2++;
                                size = i3;
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        qh1 qh1Var5 = (qh1) obj2;
                        if (qh1Var5 == null) {
                            int size2 = list.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 < size2) {
                                    qh1Var3 = list.get(i4);
                                    if (((qh1) qh1Var3).d) {
                                        break;
                                    } else {
                                        i4++;
                                    }
                                } else {
                                    qh1Var3 = 0;
                                    break;
                                }
                            }
                            qh1Var5 = qh1Var3;
                            if (qh1Var5 == null) {
                                T0();
                                return;
                            }
                            t20Var.d = qh1Var5.a;
                        }
                        if (kh1Var == kh1Var3) {
                            if (!qh1Var5.b()) {
                                if (qo.q(qh1Var5)) {
                                    int size3 = list.size();
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 < size3) {
                                            ?? r8 = list.get(i5);
                                            if (((qh1) r8).d) {
                                                qh1Var2 = r8;
                                                break;
                                            }
                                            i5++;
                                        } else {
                                            qh1Var2 = null;
                                            break;
                                        }
                                    }
                                    qh1 qh1Var6 = qh1Var2;
                                    if (qh1Var6 == null) {
                                        T0();
                                    } else {
                                        t20Var.d = qh1Var6.a;
                                    }
                                } else {
                                    float f = g30.f((hg2) hp.s(this, is.s), qh1Var5.i);
                                    za2 za2Var = this.J;
                                    if (za2Var != null) {
                                        long a = za2Var.a(f, qh1Var5.c, qh1Var5.g);
                                        if ((9223372034707292159L & a) != 9205357640488583168L) {
                                            qh1Var5.a();
                                            qh1 qh1Var7 = t20Var.c;
                                            qh1Var7.getClass();
                                            c1(qh1Var7, qh1Var5, a);
                                            b1(qh1Var5, a);
                                            long j3 = qh1Var5.a;
                                            u20 u20Var3 = this.D;
                                            u20 u20Var4 = u20Var3;
                                            if (u20Var3 == null) {
                                                ?? obj5 = new Object();
                                                obj5.c = Long.MAX_VALUE;
                                                this.D = obj5;
                                                u20Var4 = obj5;
                                            }
                                            u20Var4.c = j3;
                                            this.G = u20Var4;
                                        } else {
                                            t20Var.e = true;
                                        }
                                    } else {
                                        se.h("Touch slop detector not initialized.");
                                        return;
                                    }
                                }
                            } else {
                                qh1 qh1Var8 = t20Var.c;
                                if (qh1Var8 != null) {
                                    long j4 = t20Var.d;
                                    za2 za2Var2 = this.J;
                                    if (za2Var2 != null) {
                                        U0(qh1Var8, j4, za2Var2);
                                    } else {
                                        se.h("AwaitTouchSlop.touchSlopDetector was not initialized");
                                        return;
                                    }
                                } else {
                                    se.h("AwaitTouchSlop.initialDown was not initialized");
                                    return;
                                }
                            }
                        }
                        if (kh1Var == kh1Var4 && t20Var.e) {
                            if (qh1Var5.b()) {
                                qh1 qh1Var9 = t20Var.c;
                                if (qh1Var9 != null) {
                                    long j5 = t20Var.d;
                                    za2 za2Var3 = this.J;
                                    if (za2Var3 != null) {
                                        U0(qh1Var9, j5, za2Var3);
                                        return;
                                    } else {
                                        se.h("AwaitTouchSlop.touchSlopDetector was not initialized");
                                        return;
                                    }
                                }
                                se.h("AwaitTouchSlop.initialDown was not initialized");
                                return;
                            }
                            t20Var.e = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (qoVar instanceof s20) {
                    s20 s20Var = (s20) qoVar;
                    if (kh1Var == kh1Var4) {
                        List list2 = jh1Var.a;
                        int size4 = list2.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size4) {
                                break;
                            }
                            if (((qh1) list2.get(i6)).b()) {
                                z = false;
                                break;
                            }
                            i6++;
                        }
                        int size5 = list2.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size5) {
                                break;
                            }
                            if (((qh1) list2.get(i7)).d) {
                                if (!list2.isEmpty()) {
                                    if (z) {
                                        long j6 = ((qh1) wn.g0(list2)).c;
                                        qh1 qh1Var10 = s20Var.c;
                                        qh1Var10.getClass();
                                        long d = z81.d(j6, qh1Var10.c);
                                        qh1 qh1Var11 = s20Var.c;
                                        if (qh1Var11 != null) {
                                            V0(this, qh1Var11, s20Var.d, d, 8);
                                            return;
                                        } else {
                                            se.h("AwaitGesturePickup.initialDown was not initialized.");
                                            return;
                                        }
                                    }
                                    return;
                                }
                            } else {
                                i7++;
                            }
                        }
                        T0();
                        return;
                    }
                    return;
                }
                if (qoVar instanceof u20) {
                    u20 u20Var5 = (u20) qoVar;
                    if (kh1Var == kh1Var3) {
                        long j7 = u20Var5.c;
                        List list3 = jh1Var.a;
                        int size6 = list3.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 < size6) {
                                obj = list3.get(i8);
                                if (hp.v(((qh1) obj).a, j7)) {
                                    break;
                                } else {
                                    i8++;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        qh1 qh1Var12 = (qh1) obj;
                        if (qh1Var12 != null) {
                            boolean q = qo.q(qh1Var12);
                            v20 v20Var = v20.a;
                            if (q) {
                                List list4 = jh1Var.a;
                                int size7 = list4.size();
                                int i9 = 0;
                                while (true) {
                                    if (i9 < size7) {
                                        ?? r6 = list4.get(i9);
                                        if (((qh1) r6).d) {
                                            qh1Var = r6;
                                            break;
                                        }
                                        i9++;
                                    } else {
                                        qh1Var = null;
                                        break;
                                    }
                                }
                                qh1 qh1Var13 = qh1Var;
                                if (qh1Var13 == null) {
                                    if (!qh1Var12.b() && qo.q(qh1Var12)) {
                                        yq1.d(a1(), qh1Var12, 0L);
                                        float e = ((hg2) hp.s(this, is.s)).e();
                                        long f2 = a1().f(xq1.c(e, e));
                                        jz jzVar = (jz) a1().f;
                                        af2 af2Var = jzVar.a;
                                        bf.M(r5, 0, af2Var.d.length);
                                        af2Var.e = 0;
                                        af2 af2Var2 = jzVar.b;
                                        bf.M(r6, 0, af2Var2.d.length);
                                        af2Var2.e = 0;
                                        jzVar.c = 0L;
                                        Z0().j(new y20(u30.a(f2), false));
                                        this.B = false;
                                    } else {
                                        Z0().j(v20Var);
                                    }
                                    T0();
                                    return;
                                }
                                u20Var5.c = qh1Var13.a;
                                return;
                            }
                            if (qh1Var12.b()) {
                                Z0().j(v20Var);
                                return;
                            } else {
                                if (z81.c(qo.X(qh1Var12, true)) != 0.0f) {
                                    b1(qh1Var12, qo.X(qh1Var12, false));
                                    qh1Var12.a();
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                se.m();
                return;
            }
            se.h("currentDragState should not be null");
        }
    }
}
