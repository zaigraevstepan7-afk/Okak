package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class b82 {
    public boolean A;
    public final kd2 a;
    public gu0 d;
    public de0 f;
    public nn g;
    public gv h;
    public wg1 i;
    public rg0 j;
    public oc0 k;
    public final je1 l;
    public final je1 m;
    public long n;
    public d92 o;
    public long p;
    public final je1 q;
    public final je1 r;
    public int s;
    public i82 t;
    public cy1 u;
    public d92 v;
    public final je1 w;
    public final h12 x;
    public final z72 y;
    public final cy1 z;
    public c91 b = fc2.G;
    public oe0 c = new mm0(12);
    public final je1 e = fr1.k(new i82(7, (String) null, 0));

    public b82(kd2 kd2Var) {
        this.a = kd2Var;
        Boolean bool = Boolean.TRUE;
        this.l = fr1.k(bool);
        this.m = fr1.k(bool);
        this.n = 0L;
        this.p = 0L;
        this.q = fr1.k(null);
        this.r = fr1.k(null);
        this.s = -1;
        this.t = new i82(7, (String) null, 0L);
        this.w = fr1.k(Boolean.FALSE);
        h12 h12Var = new h12(2);
        h12Var.g = ma2.e;
        this.x = h12Var;
        this.y = new z72(this);
        this.z = new cy1(this);
    }

    public static final xd1 a(b82 b82Var) {
        String str;
        d92 d92Var;
        rc m = b82Var.m();
        if (m != null && (str = m.f) != null && (d92Var = b82Var.v) != null) {
            long j = d92Var.a;
            return new xd1(str, new d92(fr1.a(b82Var.b.d((int) (j >> 32)), b82Var.b.d((int) (j & 4294967295L)))));
        }
        return null;
    }

    public static final void b(b82 b82Var, d92 d92Var) {
        rc m;
        String str;
        gv gvVar;
        if (d92Var != null) {
            long j = d92Var.a;
            wg1 wg1Var = b82Var.i;
            if (wg1Var != null && (m = b82Var.m()) != null && (str = m.f) != null) {
                c91 c91Var = b82Var.b;
                long a = fr1.a(c91Var.d((int) (j >> 32)), c91Var.d((int) (j & 4294967295L)));
                if (str.length() > 0 && !d92.c(a) && (gvVar = b82Var.h) != null) {
                    rx.C(gvVar, null, new gt(wg1Var, str, a, d92Var, b82Var, c91Var, null), 3);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x012b, code lost:
    
        if (r1.b == r7.b) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0154, code lost:
    
        r5 = (defpackage.wt1) r9.c;
        r6 = ((defpackage.w82) r4.e).a.a.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0162, code lost:
    
        if (r5 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0168, code lost:
    
        if (r6.length() != 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x016c, code lost:
    
        r6 = r9.b;
        r8 = ((defpackage.w82) r4.e).a.a.f;
        r9 = r4.b;
        r10 = r8.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x017f, code lost:
    
        if (r9 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0181, code lost:
    
        r5 = defpackage.rp1.h(0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0186, code lost:
    
        if (r6 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0188, code lost:
    
        r1 = defpackage.wt1.a(r2, defpackage.xq1.i(r1, r4, r5), null, true, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0193, code lost:
    
        r1 = defpackage.wt1.a(r2, null, defpackage.xq1.i(r7, r4, r5), false, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01a0, code lost:
    
        if (r9 != r10) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01a2, code lost:
    
        r5 = defpackage.rp1.i(r10, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01a6, code lost:
    
        if (r6 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01a8, code lost:
    
        r1 = defpackage.wt1.a(r2, defpackage.xq1.i(r1, r4, r5), null, false, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01b1, code lost:
    
        r1 = defpackage.wt1.a(r2, null, defpackage.xq1.i(r7, r4, r5), true, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01bc, code lost:
    
        if (r5.c != true) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01be, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01c3, code lost:
    
        if ((r6 ^ r13) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01c5, code lost:
    
        r5 = defpackage.rp1.i(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01ce, code lost:
    
        if (r6 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01d0, code lost:
    
        r1 = defpackage.wt1.a(r2, defpackage.xq1.i(r1, r4, r5), null, r13, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01da, code lost:
    
        r1 = defpackage.wt1.a(r2, null, defpackage.xq1.i(r7, r4, r5), r13, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01ca, code lost:
    
        r5 = defpackage.rp1.h(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01c0, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0150, code lost:
    
        if (((defpackage.w82) r4.e).a.a.f.length() != r5.b) goto L108;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long c(defpackage.b82 r22, defpackage.i82 r23, long r24, boolean r26, boolean r27, defpackage.y61 r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b82.c(b82, i82, long, boolean, boolean, y61, boolean):long");
    }

    public static i82 e(rc rcVar, long j) {
        return new i82(rcVar, j, (d92) null);
    }

    public final i22 d(boolean z) {
        gv gvVar = this.h;
        vt vtVar = null;
        if (gvVar == null) {
            return null;
        }
        return rx.C(gvVar, null, new wf(this, z, vtVar, 1), 1);
    }

    public final void f() {
        gv gvVar = this.h;
        if (gvVar != null) {
            rx.C(gvVar, null, new v72(this, null, 1), 1);
        }
    }

    public final void g(z81 z81Var) {
        jg0 jg0Var;
        x82 x82Var;
        int e;
        if (!d92.c(n().b)) {
            gu0 gu0Var = this.d;
            if (gu0Var != null) {
                x82Var = gu0Var.d();
            } else {
                x82Var = null;
            }
            if (z81Var != null && x82Var != null) {
                e = this.b.c(x82Var.b(z81Var.a, true));
            } else {
                e = d92.e(n().b);
            }
            i82 a = i82.a(n(), null, fr1.a(e, e), 5);
            this.c.invoke(a);
            this.v = new d92(a.b);
        }
        if (z81Var != null && n().a.f.length() > 0) {
            jg0Var = jg0.g;
        } else {
            jg0Var = jg0.e;
        }
        q(jg0Var);
        t(false);
    }

    public final void h(boolean z) {
        oc0 oc0Var;
        gu0 gu0Var = this.d;
        if (gu0Var != null && !gu0Var.b() && (oc0Var = this.k) != null) {
            oc0.a(oc0Var);
        }
        this.t = n();
        t(z);
        q(jg0.f);
    }

    public final z81 i() {
        return (z81) this.r.getValue();
    }

    public final boolean j() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) this.m.getValue()).booleanValue();
    }

    public final long l(boolean z) {
        x82 d;
        long j;
        int max;
        boolean z2;
        int x;
        float i;
        gu0 gu0Var = this.d;
        if (gu0Var != null && (d = gu0Var.d()) != null) {
            w82 w82Var = d.a;
            g31 g31Var = w82Var.b;
            rc m = m();
            if (m != null) {
                if (sn0.r(m.f, w82Var.a.a.f)) {
                    i82 n = n();
                    if (z) {
                        long j2 = n.b;
                        int i2 = d92.c;
                        j = j2 >> 32;
                    } else {
                        long j3 = n.b;
                        int i3 = d92.c;
                        j = j3 & 4294967295L;
                    }
                    int d2 = this.b.d((int) j);
                    boolean g = d92.g(n().b);
                    long j4 = w82Var.c;
                    if (g31Var.d(d2) < g31Var.f) {
                        if ((z && !g) || (!z && g)) {
                            max = d2;
                        } else {
                            max = Math.max(d2 - 1, 0);
                        }
                        if (w82Var.a(max) == w82Var.g(d2)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        g31Var.k(d2);
                        int length = ((rc) g31Var.a.a).f.length();
                        ArrayList arrayList = g31Var.h;
                        if (d2 == length) {
                            x = xn.A(arrayList);
                        } else {
                            x = vn.x(d2, arrayList);
                        }
                        zd1 zd1Var = (zd1) arrayList.get(x);
                        i8 i8Var = zd1Var.a;
                        int d3 = zd1Var.d(d2);
                        u82 u82Var = i8Var.d;
                        if (z2) {
                            i = u82Var.h(d3, false);
                        } else {
                            i = u82Var.i(d3, false);
                        }
                        float o = go.o(i, 0.0f, (int) (j4 >> 32));
                        return (Float.floatToRawIntBits(go.o(g31Var.b(r8), 0.0f, (int) (j4 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(o) << 32);
                    }
                    return 9205357640488583168L;
                }
                return 9205357640488583168L;
            }
            return 9205357640488583168L;
        }
        return 9205357640488583168L;
    }

    public final rc m() {
        gu0 gu0Var = this.d;
        if (gu0Var != null) {
            return gu0Var.a.a;
        }
        return null;
    }

    public final i82 n() {
        return (i82) this.e.getValue();
    }

    public final void o() {
        i22 i22Var;
        w62 w62Var = (w62) this.x.f;
        if (w62Var != null && (i22Var = w62Var.y) != null) {
            i22Var.c(null);
            w62Var.y = null;
        }
    }

    public final void p() {
        gv gvVar = this.h;
        if (gvVar != null) {
            rx.C(gvVar, null, new v72(this, null, 2), 1);
        }
    }

    public final void q(jg0 jg0Var) {
        gu0 gu0Var = this.d;
        if (gu0Var != null) {
            if (gu0Var.a() == jg0Var) {
                gu0Var = null;
            }
            if (gu0Var != null) {
                gu0Var.k.setValue(jg0Var);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (((java.lang.Boolean) r4.q.getValue()).booleanValue() == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            r6 = this;
            i02 r0 = defpackage.nq1.e()
            r1 = 0
            if (r0 == 0) goto Lc
            oe0 r2 = r0.e()
            goto Ld
        Lc:
            r2 = r1
        Ld:
            i02 r3 = defpackage.nq1.j(r0)
            boolean r4 = r6.k()     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L71
            gu0 r4 = r6.d     // Catch: java.lang.Throwable -> L6f
            if (r4 == 0) goto L2a
            je1 r4 = r4.q     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L6f
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L6f
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L6f
            if (r4 != 0) goto L2a
            goto L71
        L2a:
            defpackage.nq1.o(r0, r3, r2)
            h12 r6 = r6.x
            java.lang.Object r0 = r6.g
            ma2 r0 = (defpackage.ma2) r0
            ma2 r2 = defpackage.ma2.e
            if (r0 == r2) goto L38
            goto L3d
        L38:
            java.lang.String r0 = "ToolbarRequester is not initialized."
            defpackage.nl0.c(r0)
        L3d:
            java.lang.Object r6 = r6.f
            w62 r6 = (defpackage.w62) r6
            if (r6 == 0) goto L6e
            boolean r0 = r6.r
            if (r0 == 0) goto L6e
            i22 r0 = r6.y
            r2 = 1
            if (r0 == 0) goto L53
            boolean r0 = r0.b()
            if (r0 != r2) goto L53
            goto L6e
        L53:
            js r0 = defpackage.r62.b
            java.lang.Object r0 = defpackage.hp.s(r6, r0)
            q62 r0 = (defpackage.q62) r0
            if (r0 != 0) goto L5e
            goto L6e
        L5e:
            gv r3 = r6.z0()
            iu1 r4 = new iu1
            r5 = 4
            r4.<init>(r6, r0, r1, r5)
            i22 r0 = defpackage.rx.C(r3, r1, r4, r2)
            r6.y = r0
        L6e:
            return
        L6f:
            r6 = move-exception
            goto L75
        L71:
            defpackage.nq1.o(r0, r3, r2)
            return
        L75:
            defpackage.nq1.o(r0, r3, r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b82.r():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.wt r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.a82
            if (r0 == 0) goto L13
            r0 = r5
            a82 r0 = (defpackage.a82) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            a82 r0 = new a82
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            b82 r4 = r0.e
            defpackage.io.K(r5)
            goto L59
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.io.K(r5)
            nn r5 = r4.g
            if (r5 == 0) goto L63
            r0.e = r4
            r0.h = r2
            w4 r5 = (defpackage.w4) r5
            x4 r5 = r5.a
            android.content.ClipboardManager r5 = r5.a
            android.content.ClipDescription r5 = r5.getPrimaryClipDescription()
            r0 = 0
            if (r5 == 0) goto L4f
            java.lang.String r1 = "text/*"
            boolean r5 = r5.hasMimeType(r1)
            if (r5 != r2) goto L4f
            goto L50
        L4f:
            r2 = r0
        L50:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            hv r0 = defpackage.hv.e
            if (r5 != r0) goto L59
            return r0
        L59:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            je1 r4 = r4.w
            r4.setValue(r5)
        L63:
            od2 r4 = defpackage.od2.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b82.s(wt):java.lang.Object");
    }

    public final void t(boolean z) {
        gu0 gu0Var = this.d;
        if (gu0Var != null) {
            gu0Var.l.setValue(Boolean.valueOf(z));
        }
        if (z) {
            r();
        } else {
            o();
        }
    }
}
