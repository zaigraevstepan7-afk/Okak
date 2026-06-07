package defpackage;

import android.view.View;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mc0 implements jc0 {
    public final q5 a;
    public final q5 b;
    public final hc0 d;
    public u31 f;
    public tc0 h;
    public final tc0 c = new tc0(2, null, 14);
    public final kc0 e = new kc0(this);
    public final b41 g = new b41(1);

    public mc0(q5 q5Var, q5 q5Var2) {
        this.a = q5Var;
        this.b = q5Var2;
        this.d = new hc0(this, q5Var2);
    }

    public final boolean a(boolean z) {
        a81 a81Var;
        if (f() != null) {
            tc0 f = f();
            i(null);
            if (f != null) {
                sc0 sc0Var = sc0.e;
                sc0 sc0Var2 = sc0.g;
                f.M0(sc0Var, sc0Var2);
                if (!f.e.r) {
                    kl0.b("visitAncestors called on an unattached node");
                }
                d21 d21Var = f.e.i;
                ar0 M = hp.M(f);
                while (M != null) {
                    if ((M.J.f.h & 1024) != 0) {
                        while (d21Var != null) {
                            if ((d21Var.g & 1024) != 0) {
                                d21 d21Var2 = d21Var;
                                q41 q41Var = null;
                                while (d21Var2 != null) {
                                    if (d21Var2 instanceof tc0) {
                                        ((tc0) d21Var2).M0(sc0.f, sc0Var2);
                                    } else if ((d21Var2.g & 1024) != 0 && (d21Var2 instanceof rz)) {
                                        int i = 0;
                                        for (d21 d21Var3 = ((rz) d21Var2).t; d21Var3 != null; d21Var3 = d21Var3.j) {
                                            if ((d21Var3.g & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    d21Var2 = d21Var3;
                                                } else {
                                                    if (q41Var == null) {
                                                        q41Var = new q41(new d21[16]);
                                                    }
                                                    if (d21Var2 != null) {
                                                        q41Var.b(d21Var2);
                                                        d21Var2 = null;
                                                    }
                                                    q41Var.b(d21Var3);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    d21Var2 = hp.l(q41Var);
                                }
                            }
                            d21Var = d21Var.i;
                        }
                    }
                    M = M.v();
                    if (M != null && (a81Var = M.J) != null) {
                        d21Var = a81Var.e;
                    } else {
                        d21Var = null;
                    }
                }
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (!z) {
            int ordinal = io.G(this.c).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    se.m();
                    return false;
                }
                z3 = false;
            } else {
                a(z);
            }
        } else {
            a(z);
        }
        if (z3 && z2) {
            c();
        }
        return z3;
    }

    public final void c() {
        q5 q5Var = this.a;
        if (!q5Var.isFocused() && !q5Var.hasFocus()) {
            if (q5Var.hasFocus()) {
                View findFocus = q5Var.findFocus();
                if (findFocus != null) {
                    findFocus.clearFocus();
                }
                q5Var.clearFocus();
                return;
            }
            return;
        }
        q5Var.clearFocus();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        if (r7 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0167 A[Catch: all -> 0x02de, TryCatch #0 {all -> 0x02de, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x0019, B:13:0x0023, B:16:0x002f, B:18:0x0035, B:19:0x003a, B:21:0x0042, B:23:0x0047, B:25:0x004d, B:29:0x0053, B:34:0x0167, B:36:0x016d, B:37:0x0170, B:39:0x017b, B:42:0x0187, B:46:0x0191, B:81:0x0197, B:82:0x019c, B:75:0x01d6, B:48:0x01a0, B:50:0x01a6, B:52:0x01aa, B:54:0x01b2, B:56:0x01b8, B:62:0x01c0, B:64:0x01c9, B:65:0x01cd, B:60:0x01d0, B:84:0x01db, B:87:0x01de, B:89:0x01e4, B:96:0x01e8, B:101:0x01ef, B:103:0x01f7, B:111:0x020e, B:113:0x0213, B:147:0x0217, B:142:0x0259, B:115:0x0223, B:117:0x0229, B:119:0x022d, B:121:0x0235, B:123:0x023b, B:129:0x0243, B:131:0x024c, B:132:0x0250, B:127:0x0253, B:153:0x025e, B:157:0x026e, B:159:0x0273, B:193:0x0277, B:188:0x02b9, B:161:0x0283, B:163:0x0289, B:165:0x028d, B:167:0x0295, B:169:0x029b, B:175:0x02a3, B:177:0x02ac, B:178:0x02b0, B:173:0x02b3, B:200:0x02c0, B:202:0x02c7, B:215:0x005b, B:217:0x0061, B:218:0x0064, B:220:0x006c, B:223:0x0078, B:227:0x0082, B:262:0x00d5, B:264:0x00d9, B:229:0x0087, B:231:0x008d, B:233:0x0091, B:235:0x0099, B:237:0x009f, B:243:0x00a7, B:245:0x00b0, B:246:0x00b4, B:241:0x00b7, B:252:0x00bd, B:266:0x00c2, B:269:0x00c5, B:271:0x00cb, B:278:0x00cf, B:283:0x00df, B:285:0x00e5, B:286:0x00e8, B:288:0x00f2, B:291:0x00fe, B:295:0x0108, B:330:0x015b, B:332:0x015f, B:297:0x010d, B:299:0x0113, B:301:0x0117, B:303:0x011f, B:305:0x0125, B:311:0x012d, B:313:0x0136, B:314:0x013a, B:309:0x013d, B:320:0x0143, B:335:0x0148, B:338:0x014b, B:340:0x0151, B:347:0x0155), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [q41] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [q41] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v23, types: [d21] */
    /* JADX WARN: Type inference failed for: r12v24, types: [d21] */
    /* JADX WARN: Type inference failed for: r12v28, types: [d21] */
    /* JADX WARN: Type inference failed for: r12v29, types: [d21] */
    /* JADX WARN: Type inference failed for: r12v33, types: [d21] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v42, types: [d21] */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [q41] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [q41] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.view.KeyEvent r13, defpackage.de0 r14) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc0.d(android.view.KeyEvent, de0):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0113, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean e(int r20, defpackage.pl1 r21, defpackage.oe0 r22) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc0.e(int, pl1, oe0):java.lang.Boolean");
    }

    public final tc0 f() {
        tc0 tc0Var = this.h;
        if (tc0Var != null && tc0Var.r) {
            return tc0Var;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wl1] */
    public final boolean g(int i, boolean z) {
        boolean z2;
        ?? obj = new Object();
        obj.e = Boolean.FALSE;
        tc0 f = f();
        Boolean e = e(i, this.a.getEmbeddedViewFocusRect(), new lc0(obj, i));
        if (!sn0.r(e, Boolean.TRUE) || f == f()) {
            if (e != null && obj.e != null) {
                if (!e.booleanValue() || !((Boolean) obj.e).booleanValue()) {
                    if ((i == 1 || i == 2) && z && b(i, false, false)) {
                        Boolean e2 = e(i, null, new m5(i, 3));
                        if (e2 != null) {
                            z2 = e2.booleanValue();
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean h(int i) {
        boolean z = false;
        if (!b(i, false, false)) {
            return false;
        }
        Boolean e = e(i, null, new m5(i, 2));
        if (e != null) {
            z = e.booleanValue();
        }
        if (!z) {
            c();
        }
        return z;
    }

    public final void i(tc0 tc0Var) {
        tc0 tc0Var2 = this.h;
        this.h = tc0Var;
        b41 b41Var = this.g;
        Object[] objArr = b41Var.a;
        int i = b41Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((ic0) objArr[i2]).a(tc0Var2, tc0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        r33 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == r33) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        if (r4.e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        if (((r4.a[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c4, code lost:
    
        r0 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        if (r0 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d7, code lost:
    
        if (java.lang.Long.compareUnsigned(r4.d * 32, r0 * 25) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        r0 = r4.a;
        r6 = r4.c;
        r12 = r4.b;
        r13 = (r6 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e5, code lost:
    
        if (r14 >= r13) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e7, code lost:
    
        r8 = r0[r14] & (-9187201950435737472L);
        r0[r14] = ((~r8) + (r8 >>> 7)) & (-72340172838076674L);
        r14 = r14 + 1;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0102, code lost:
    
        r15 = r5;
        r16 = r6;
        r40 = 128;
        r5 = defpackage.bf.V(r0);
        r6 = r5 - 1;
        r13 = 72057594037927935L;
        r0[r6] = (r0[r6] & 72057594037927935L) | (-72057594037927936L);
        r0[r5] = r0[0];
        r5 = r16;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0123, code lost:
    
        if (r6 == r5) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0125, code lost:
    
        r8 = r6 >> 3;
        r9 = (r6 & 7) << 3;
        r16 = (r0[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0133, code lost:
    
        if (r16 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013a, code lost:
    
        if (r16 == 254) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x013d, code lost:
    
        r16 = java.lang.Long.hashCode(r12[r6]) * r28;
        r17 = r13;
        r13 = (r16 ^ (r16 << 16)) >>> 7;
        r14 = r4.b(r13);
        r13 = r13 & r5;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0161, code lost:
    
        if ((((r14 - r13) & r5) / 8) != (((r6 - r13) & r5) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0163, code lost:
    
        r37 = r7;
        r0[r8] = ((~(255 << r9)) & r0[r8]) | ((r16 & 127) << r9);
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0181, code lost:
    
        r13 = r17;
        r15 = r29;
        r7 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0188, code lost:
    
        r37 = r7;
        r7 = r14 >> 3;
        r26 = r0[r7];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x019a, code lost:
    
        if (((r26 >> r8) & 255) != 128) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x019c, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | ((r16 & 127) << r8);
        r0[r8] = (r0[r8] & (~(255 << r9))) | (128 << r9);
        r12[r14] = r12[r35];
        r12[r35] = r33;
        r6 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01df, code lost:
    
        r0[r0.length - 1] = (r0[0] & r17) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c3, code lost:
    
        r15 = r5;
        r35 = r6;
        r0[r7] = (r26 & (~(255 << r8))) | ((r16 & 127) << r8);
        r5 = r12[r14];
        r12[r14] = r12[r35];
        r12[r35] = r5;
        r6 = r35 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0135, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ee, code lost:
    
        r37 = r7;
        r4.e = defpackage.sr1.a(r4.c) - r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0276, code lost:
    
        r0 = r4.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027a, code lost:
    
        r14 = r0;
        r4.d++;
        r0 = r4.e;
        r3 = r4.a;
        r5 = r14 >> 3;
        r6 = r3[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0293, code lost:
    
        if (((r6 >> r8) & 255) != r40) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0295, code lost:
    
        r21 = r37 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0297, code lost:
    
        r4.e = r0 - r21;
        r0 = r4.c;
        r6 = (r6 & (~(255 << r8))) | (r10 << r8);
        r3[r5] = r6;
        r3[(((r14 - 7) & r0) + (r0 & 7)) >> 3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01fd, code lost:
    
        r37 = true;
        r40 = 128;
        r0 = defpackage.sr1.b(r4.c);
        r5 = r4.a;
        r6 = r4.b;
        r7 = r4.c;
        r4.c(r0);
        r0 = r4.a;
        r8 = r4.b;
        r9 = r4.c;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0218, code lost:
    
        if (r12 >= r7) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0227, code lost:
    
        if (((r5[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0229, code lost:
    
        r13 = r6[r12];
        r15 = java.lang.Long.hashCode(r13) * r28;
        r15 = r15 ^ (r15 << 16);
        r16 = r0;
        r0 = r4.b(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r0 >> 3;
        r19 = (r0 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r0 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r0] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x026d, code lost:
    
        r12 = r12 + 1;
        r0 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0267, code lost:
    
        r16 = r0;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00be, code lost:
    
        r37 = true;
        r40 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x033e, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0340, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(android.view.KeyEvent r41) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc0.j(android.view.KeyEvent):boolean");
    }
}
