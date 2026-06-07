package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class wb0 implements e31, qp1 {
    public final oe a;
    public final qe b;
    public final float c;
    public final pv d;
    public final float e;
    public final ub0 f;

    public wb0(oe oeVar, qe qeVar, float f, pv pvVar, float f2, ub0 ub0Var) {
        this.a = oeVar;
        this.b = qeVar;
        this.c = f;
        this.d = pvVar;
        this.e = f2;
        this.f = ub0Var;
    }

    public static int k(List list, int i, int i2, int i3, ub0 ub0Var) {
        int i4;
        int i5;
        boolean z;
        sm0 sm0Var;
        int i6;
        boolean z2;
        sm0 sm0Var2;
        boolean z3;
        long a = sm0.a(0, 0);
        if (!list.isEmpty()) {
            int i7 = Integer.MAX_VALUE;
            sb0 sb0Var = new sb0(ub0Var, vs.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            e01 e01Var = (e01) wn.i0(0, list);
            if (e01Var != null) {
                i4 = e01Var.Y(i);
            } else {
                i4 = 0;
            }
            if (e01Var != null) {
                i5 = e01Var.n(i4);
            } else {
                i5 = 0;
            }
            boolean z4 = true;
            if (list.size() > 1) {
                z = true;
            } else {
                z = true;
                z4 = false;
            }
            long a2 = sm0.a(i, Integer.MAX_VALUE);
            if (e01Var == null) {
                sm0Var = null;
            } else {
                sm0Var = new sm0(sm0.a(i5, i4));
            }
            int i8 = 0;
            if (sb0Var.b(z4, 0, a2, sm0Var, 0, 0, 0, false, false).b) {
                ub0Var.getClass();
                a = a;
            } else {
                int size = list.size();
                int i9 = i;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i12 >= size) {
                        break;
                    }
                    int i15 = i9 - i5;
                    int i16 = i12 + 1;
                    int max = Math.max(i11, i4);
                    e01 e01Var2 = (e01) wn.i0(i16, list);
                    if (e01Var2 != null) {
                        i4 = e01Var2.Y(i);
                    } else {
                        i4 = 0;
                    }
                    if (e01Var2 != null) {
                        i6 = e01Var2.n(i4) + i2;
                    } else {
                        i6 = 0;
                    }
                    if (i12 + 2 < list.size()) {
                        i12 = i16;
                        z2 = z;
                    } else {
                        i12 = i16;
                        z2 = false;
                    }
                    int i17 = i12 - i14;
                    int i18 = i10;
                    long a3 = sm0.a(i15, i7);
                    if (e01Var2 == null) {
                        sm0Var2 = null;
                    } else {
                        sm0Var2 = new sm0(sm0.a(i6, i4));
                    }
                    int i19 = i6;
                    rb0 b = sb0Var.b(z2, i17, a3, sm0Var2, i18, i8, max, false, false);
                    if (b.a) {
                        int i20 = max + i3 + i8;
                        if (e01Var2 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        sb0Var.a(b, z3, i18, i20, i15, i17);
                        int i21 = i19 - i2;
                        i10 = i18 + 1;
                        if (b.b) {
                            i13 = i12;
                            i8 = i20;
                            break;
                        }
                        i9 = i;
                        i14 = i12;
                        i5 = i21;
                        i8 = i20;
                        i11 = 0;
                    } else {
                        i5 = i19;
                        i9 = i15;
                        i10 = i18;
                        i11 = max;
                    }
                    i13 = i12;
                    i7 = Integer.MAX_VALUE;
                    z = true;
                }
                a = sm0.a(i8 - i3, i13);
            }
        }
        return (int) (a >> 32);
    }

    @Override // defpackage.e31
    public final int a(mn0 mn0Var, List list, int i) {
        e01 e01Var;
        List list2 = (List) wn.i0(1, list);
        e01 e01Var2 = null;
        if (list2 != null) {
            e01Var = (e01) wn.h0(list2);
        } else {
            e01Var = null;
        }
        List list3 = (List) wn.i0(2, list);
        if (list3 != null) {
            e01Var2 = (e01) wn.h0(list3);
        }
        this.f.a(e01Var, e01Var2, vs.b(0, i, 7));
        List list4 = (List) wn.h0(list);
        if (list4 == null) {
            list4 = l60.e;
        }
        int j0 = mn0Var.j0(this.c);
        int size = list4.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < size) {
            int s = ((e01) list4.get(i2)).s(i) + j0;
            int i6 = i2 + 1;
            if (i6 - i4 != Integer.MAX_VALUE && i6 != list4.size()) {
                i5 += s;
            } else {
                i3 = Math.max(i3, (i5 + s) - j0);
                i4 = i2;
                i5 = 0;
            }
            i2 = i6;
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03ab A[LOOP:1: B:104:0x03a9->B:105:0x03ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.e31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.k01 b(defpackage.l01 r54, java.util.List r55, long r56) {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb0.b(l01, java.util.List, long):k01");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.e31
    public final int c(mn0 mn0Var, List list, int i) {
        e01 e01Var;
        e01 e01Var2;
        int i2;
        int[] iArr;
        ub0 ub0Var;
        int i3;
        int i4;
        boolean z;
        int[] iArr2;
        sm0 sm0Var;
        List list2;
        long a;
        int i5;
        int i6;
        boolean z2;
        sm0 sm0Var2;
        int i7;
        boolean z3;
        int i8 = i;
        int i9 = 1;
        List list3 = (List) wn.i0(1, list);
        if (list3 != null) {
            e01Var = (e01) wn.h0(list3);
        } else {
            e01Var = null;
        }
        char c = 2;
        List list4 = (List) wn.i0(2, list);
        if (list4 != null) {
            e01Var2 = (e01) wn.h0(list4);
        } else {
            e01Var2 = null;
        }
        this.f.a(e01Var, e01Var2, vs.b(0, i8, 7));
        List list5 = (List) wn.h0(list);
        if (list5 == null) {
            list5 = l60.e;
        }
        int j0 = mn0Var.j0(this.c);
        int j02 = mn0Var.j0(this.e);
        long a2 = sm0.a(0, 0);
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr3 = new int[size];
        int size2 = list5.size();
        int[] iArr4 = new int[size2];
        int size3 = list5.size();
        int i10 = 0;
        while (i10 < size3) {
            e01 e01Var3 = (e01) list5.get(i10);
            char c2 = c;
            int n = e01Var3.n(i8);
            iArr3[i10] = n;
            iArr4[i10] = e01Var3.Y(n);
            i10++;
            c = c2;
        }
        int size4 = list5.size();
        ub0 ub0Var2 = this.f;
        if (Integer.MAX_VALUE < size4) {
            ub0Var2.getClass();
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            ub0Var2.getClass();
        }
        int min = Math.min(Integer.MAX_VALUE, list5.size());
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += iArr3[i12];
        }
        int size5 = ((list5.size() - 1) * j0) + i11;
        if (size2 != 0) {
            int i13 = iArr4[0];
            int i14 = size2 - 1;
            if (1 <= i14) {
                int i15 = 1;
                i2 = 0;
                while (true) {
                    int i16 = iArr4[i15];
                    if (i13 < i16) {
                        i13 = i16;
                    }
                    if (i15 == i14) {
                        break;
                    }
                    i15++;
                }
            } else {
                i2 = 0;
            }
            if (size != 0) {
                int i17 = iArr3[i2];
                int i18 = size - 1;
                if (1 <= i18) {
                    int i19 = 1;
                    while (true) {
                        int i20 = iArr3[i19];
                        if (i17 < i20) {
                            i17 = i20;
                        }
                        if (i19 == i18) {
                            break;
                        }
                        i19++;
                    }
                }
                int i21 = size5;
                while (i17 <= i21 && i13 != i8) {
                    int i22 = (i17 + i21) / 2;
                    if (list5.isEmpty()) {
                        list2 = list5;
                        iArr2 = iArr3;
                        a = a2;
                        iArr = iArr4;
                        ub0Var = ub0Var2;
                    } else {
                        int i23 = i2;
                        iArr = iArr4;
                        ub0Var = ub0Var2;
                        sb0 sb0Var = new sb0(ub0Var, vs.a(i23, i22, i23, Integer.MAX_VALUE), j0, j02);
                        e01 e01Var4 = (e01) wn.i0(i23, list5);
                        if (e01Var4 != null) {
                            i3 = iArr[i23];
                        } else {
                            i3 = i23;
                        }
                        if (e01Var4 != null) {
                            i4 = iArr3[i23];
                        } else {
                            i4 = 0;
                        }
                        if (list5.size() > i9) {
                            z = i9;
                        } else {
                            z = 0;
                        }
                        long a3 = sm0.a(i22, Integer.MAX_VALUE);
                        if (e01Var4 == null) {
                            iArr2 = iArr3;
                            sm0Var = null;
                        } else {
                            iArr2 = iArr3;
                            sm0Var = new sm0(sm0.a(i4, i3));
                        }
                        int i24 = 0;
                        if (sb0Var.b(z, 0, a3, sm0Var, 0, 0, 0, false, false).b) {
                            ub0Var.getClass();
                            list2 = list5;
                            a = a2;
                        } else {
                            int size6 = list5.size();
                            int i25 = i22;
                            int i26 = i4;
                            int i27 = 0;
                            int i28 = 0;
                            int i29 = 0;
                            int i30 = 0;
                            int i31 = i3;
                            int i32 = 0;
                            while (true) {
                                if (i30 < size6) {
                                    int i33 = i25 - i26;
                                    int i34 = size6;
                                    int i35 = i30 + 1;
                                    int max = Math.max(i28, i31);
                                    e01 e01Var5 = (e01) wn.i0(i35, list5);
                                    if (e01Var5 != null) {
                                        i31 = iArr[i35];
                                    } else {
                                        i31 = 0;
                                    }
                                    if (e01Var5 != null) {
                                        i5 = i35;
                                        i6 = iArr2[i35] + j0;
                                    } else {
                                        i5 = i35;
                                        i6 = 0;
                                    }
                                    list2 = list5;
                                    if (i30 + 2 < list2.size()) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    int i36 = i5 - i29;
                                    int i37 = i27;
                                    long a4 = sm0.a(i33, Integer.MAX_VALUE);
                                    if (e01Var5 == null) {
                                        sm0Var2 = null;
                                    } else {
                                        sm0Var2 = new sm0(sm0.a(i6, i31));
                                    }
                                    rb0 b = sb0Var.b(z2, i36, a4, sm0Var2, i37, i24, max, false, false);
                                    if (b.a) {
                                        int i38 = max + j02 + i24;
                                        if (e01Var5 != null) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        sb0Var.a(b, z3, i37, i38, i33, i36);
                                        int i39 = i6 - j0;
                                        i27 = i37 + 1;
                                        if (b.b) {
                                            i24 = i38;
                                            i32 = i5;
                                            break;
                                        }
                                        i26 = i39;
                                        i25 = i22;
                                        i24 = i38;
                                        i7 = i5;
                                        i28 = 0;
                                    } else {
                                        i26 = i6;
                                        i25 = i33;
                                        i27 = i37;
                                        i28 = max;
                                        i7 = i29;
                                    }
                                    i29 = i7;
                                    size6 = i34;
                                    i30 = i5;
                                    i32 = i30;
                                    list5 = list2;
                                } else {
                                    list2 = list5;
                                    break;
                                }
                            }
                            a = sm0.a(i24 - j02, i32);
                        }
                    }
                    i13 = (int) (a >> 32);
                    int i40 = (int) (a & 4294967295L);
                    i8 = i;
                    if (i13 <= i8 && i40 >= min) {
                        if (i13 >= i8) {
                            return i22;
                        }
                        i21 = i22 - 1;
                    } else {
                        i17 = i22 + 1;
                        if (i17 > i21) {
                            return i17;
                        }
                    }
                    size5 = i22;
                    iArr3 = iArr2;
                    ub0Var2 = ub0Var;
                    iArr4 = iArr;
                    list5 = list2;
                    i9 = 1;
                    i2 = 0;
                }
                return size5;
            }
            y61.c();
            return 0;
        }
        y61.c();
        return 0;
    }

    @Override // defpackage.e31
    public final int d(mn0 mn0Var, List list, int i) {
        e01 e01Var;
        List list2 = (List) wn.i0(1, list);
        e01 e01Var2 = null;
        if (list2 != null) {
            e01Var = (e01) wn.h0(list2);
        } else {
            e01Var = null;
        }
        List list3 = (List) wn.i0(2, list);
        if (list3 != null) {
            e01Var2 = (e01) wn.h0(list3);
        }
        long b = vs.b(i, 0, 13);
        ub0 ub0Var = this.f;
        ub0Var.a(e01Var, e01Var2, b);
        List list4 = (List) wn.h0(list);
        if (list4 == null) {
            list4 = l60.e;
        }
        return k(list4, i, mn0Var.j0(this.c), mn0Var.j0(this.e), ub0Var);
    }

    @Override // defpackage.e31
    public final int e(mn0 mn0Var, List list, int i) {
        e01 e01Var;
        List list2 = (List) wn.i0(1, list);
        e01 e01Var2 = null;
        if (list2 != null) {
            e01Var = (e01) wn.h0(list2);
        } else {
            e01Var = null;
        }
        List list3 = (List) wn.i0(2, list);
        if (list3 != null) {
            e01Var2 = (e01) wn.h0(list3);
        }
        long b = vs.b(i, 0, 13);
        ub0 ub0Var = this.f;
        ub0Var.a(e01Var, e01Var2, b);
        List list4 = (List) wn.h0(list);
        if (list4 == null) {
            list4 = l60.e;
        }
        return k(list4, i, mn0Var.j0(this.c), mn0Var.j0(this.e), ub0Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wb0) {
                wb0 wb0Var = (wb0) obj;
                if (!this.a.equals(wb0Var.a) || !this.b.equals(wb0Var.b) || !f20.b(this.c, wb0Var.c) || !this.d.equals(wb0Var.d) || !f20.b(this.e, wb0Var.e) || !sn0.r(this.f, wb0Var.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.qp1
    public final void f(int i, int[] iArr, int[] iArr2, l01 l01Var) {
        this.a.b(l01Var, i, iArr, l01Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.qp1
    public final long g(int i, int i2, int i3, boolean z) {
        up1 up1Var = tp1.a;
        if (!z) {
            return vs.a(i, i2, 0, i3);
        }
        return go.B(i, i2, 0, i3);
    }

    @Override // defpackage.qp1
    public final k01 h(final ig1[] ig1VarArr, l01 l01Var, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final jq0 jq0Var = jq0.e;
        return l01Var.s0(i, i2, m60.e, new oe0() { // from class: vb0
            @Override // defpackage.oe0
            public final Object invoke(Object obj) {
                int i6;
                sp1 sp1Var;
                hp hpVar;
                hg1 hg1Var = (hg1) obj;
                int[] iArr3 = iArr2;
                if (iArr3 != null) {
                    i6 = iArr3[i3];
                } else {
                    i6 = 0;
                }
                int i7 = i4;
                for (int i8 = i7; i8 < i5; i8++) {
                    ig1 ig1Var = ig1VarArr[i8];
                    ig1Var.getClass();
                    Object C = ig1Var.C();
                    if (C instanceof sp1) {
                        sp1Var = (sp1) C;
                    } else {
                        sp1Var = null;
                    }
                    if (sp1Var == null || (hpVar = sp1Var.c) == null) {
                        hpVar = this.d;
                    }
                    hg1.i(hg1Var, ig1Var, iArr[i8 - i7], hpVar.m(i2, ig1Var.e0(), jq0Var) + i6);
                }
                return od2.a;
            }
        });
    }

    public final int hashCode() {
        return this.f.hashCode() + l90.b(Integer.MAX_VALUE, l90.b(Integer.MAX_VALUE, l90.a(this.e, l90.a(-1.0f, l90.a(this.c, (this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31), 31), 31), 31), 31);
    }

    @Override // defpackage.qp1
    public final int i(ig1 ig1Var) {
        return ig1Var.e0();
    }

    @Override // defpackage.qp1
    public final int j(ig1 ig1Var) {
        return ig1Var.f0();
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + ((Object) f20.c(this.c)) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + ((Object) f20.c(this.e)) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f + ')';
    }
}
