package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class a81 {
    public final ar0 a;
    public final z71 b;
    public final ql0 c;
    public e81 d;
    public final n52 e;
    public d21 f;
    public q41 g;
    public q41 h;
    public final q41 i;
    public y71 j;

    /* JADX WARN: Type inference failed for: r0v0, types: [d21, z71] */
    public a81(ar0 ar0Var) {
        this.a = ar0Var;
        ?? d21Var = new d21();
        d21Var.h = -1;
        this.b = d21Var;
        ql0 ql0Var = new ql0(ar0Var);
        this.c = ql0Var;
        this.d = ql0Var;
        n52 n52Var = ql0Var.V;
        this.e = n52Var;
        this.f = n52Var;
        this.i = new q41(new e21[16]);
    }

    public static final void a(a81 a81Var, d21 d21Var, e81 e81Var) {
        ql0 ql0Var;
        for (d21 d21Var2 = d21Var.i; d21Var2 != null; d21Var2 = d21Var2.i) {
            if (d21Var2 == a81Var.b) {
                ar0 v = a81Var.a.v();
                if (v != null) {
                    ql0Var = v.J.c;
                } else {
                    ql0Var = null;
                }
                e81Var.u = ql0Var;
                a81Var.d = e81Var;
                return;
            }
            if ((d21Var2.g & 2) == 0) {
                d21Var2.K0(e81Var);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [d21, dh] */
    public static d21 b(c21 c21Var, d21 d21Var) {
        d21 d21Var2;
        if (c21Var instanceof i21) {
            d21Var2 = ((i21) c21Var).f();
            d21Var2.g = f81.f(d21Var2);
        } else {
            ?? d21Var3 = new d21();
            d21Var3.g = f81.d(c21Var);
            d21Var3.s = c21Var;
            new HashSet();
            d21Var2 = d21Var3;
        }
        if (d21Var2.r) {
            kl0.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        d21Var2.m = true;
        d21 d21Var4 = d21Var.j;
        if (d21Var4 != null) {
            d21Var4.i = d21Var2;
            d21Var2.j = d21Var4;
        }
        d21Var.j = d21Var2;
        d21Var2.i = d21Var;
        return d21Var2;
    }

    public static d21 c(d21 d21Var) {
        boolean z = d21Var.r;
        if (z) {
            x31 x31Var = f81.a;
            if (!z) {
                kl0.b("autoInvalidateRemovedNode called on unattached node");
            }
            f81.a(d21Var, -1, 2);
            d21Var.I0();
            d21Var.C0();
        }
        d21 d21Var2 = d21Var.j;
        d21 d21Var3 = d21Var.i;
        if (d21Var2 != null) {
            d21Var2.i = d21Var3;
            d21Var.j = null;
        }
        if (d21Var3 != null) {
            d21Var3.j = d21Var2;
            d21Var.i = null;
        }
        d21Var3.getClass();
        return d21Var3;
    }

    public static void h(c21 c21Var, c21 c21Var2, d21 d21Var) {
        if ((c21Var instanceof i21) && (c21Var2 instanceof i21)) {
            d21Var.getClass();
            ((i21) c21Var2).g(d21Var);
            if (d21Var.r) {
                f81.c(d21Var);
                return;
            } else {
                d21Var.n = true;
                return;
            }
        }
        if (d21Var instanceof dh) {
            dh dhVar = (dh) d21Var;
            boolean z = dhVar.r;
            if (z) {
                if (!z) {
                    kl0.b("unInitializeModifier called on unattached node");
                }
                if ((dhVar.g & 8) != 0) {
                    ((q5) hp.N(dhVar)).z();
                }
            }
            dhVar.s = c21Var2;
            dhVar.g = f81.d(c21Var2);
            if (dhVar.r) {
                dhVar.L0(false);
            }
            if (d21Var.r) {
                f81.c(d21Var);
                return;
            } else {
                d21Var.n = true;
                return;
            }
        }
        kl0.b("Unknown Modifier.Node type");
    }

    public final boolean d(int i) {
        if ((this.f.h & i) != 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        for (d21 d21Var = this.f; d21Var != null; d21Var = d21Var.j) {
            d21Var.H0();
            if (d21Var.m) {
                x31 x31Var = f81.a;
                if (!d21Var.r) {
                    kl0.b("autoInvalidateInsertedNode called on unattached node");
                }
                f81.a(d21Var, -1, 1);
            }
            if (d21Var.n) {
                f81.c(d21Var);
            }
            d21Var.m = false;
            d21Var.n = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018f, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0194, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x019e, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a0, code lost:
    
        if (r11 <= r15) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a2, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ae, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b0, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bb, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bf, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c1, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c3, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c5, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cb, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cd, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0262, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b7, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0192, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018b, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0179, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016c, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0177, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0268, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0152, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ce, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0148, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014e, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0150, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0154, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0155, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0157, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0159, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0169, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016e, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0180, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0186, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0188, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018d, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(int r32, defpackage.q41 r33, defpackage.q41 r34, defpackage.d21 r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a81.f(int, q41, q41, d21, boolean):void");
    }

    public final void g() {
        ar0 ar0Var;
        ql0 ql0Var;
        tq0 tq0Var;
        d21 d21Var = this.e.i;
        e81 e81Var = this.c;
        d21 d21Var2 = d21Var;
        while (true) {
            ar0Var = this.a;
            if (d21Var2 == null) {
                break;
            }
            rq0 n = hp.n(d21Var2);
            if (n != null) {
                e81 e81Var2 = d21Var2.l;
                if (e81Var2 != null) {
                    tq0 tq0Var2 = (tq0) e81Var2;
                    rq0 rq0Var = tq0Var2.V;
                    tq0Var2.w1(n);
                    tq0Var = tq0Var2;
                    if (rq0Var != d21Var2) {
                        ic1 ic1Var = tq0Var2.P;
                        tq0Var = tq0Var2;
                        if (ic1Var != null) {
                            ((vf0) ic1Var).c();
                            tq0Var = tq0Var2;
                        }
                    }
                } else {
                    tq0 tq0Var3 = new tq0(ar0Var, n);
                    d21Var2.K0(tq0Var3);
                    tq0Var = tq0Var3;
                }
                e81Var.u = tq0Var;
                tq0Var.t = e81Var;
                e81Var = tq0Var;
            } else {
                d21Var2.K0(e81Var);
            }
            d21Var2 = d21Var2.i;
        }
        ar0 v = ar0Var.v();
        if (v != null) {
            ql0Var = v.J.c;
        } else {
            ql0Var = null;
        }
        e81Var.u = ql0Var;
        this.d = e81Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        d21 d21Var = this.f;
        n52 n52Var = this.e;
        if (d21Var != n52Var) {
            while (true) {
                if (d21Var == null || d21Var == n52Var) {
                    break;
                }
                sb.append(String.valueOf(d21Var));
                if (d21Var.j == n52Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                d21Var = d21Var.j;
            }
        } else {
            sb.append("]");
        }
        return sb.toString();
    }
}
