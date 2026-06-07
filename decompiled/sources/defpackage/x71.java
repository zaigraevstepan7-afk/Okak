package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class x71 extends j81 {
    public final d21 c;
    public final np d;
    public final py0 e;
    public e81 f;
    public jh1 g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* JADX WARN: Type inference failed for: r3v1, types: [np, java.lang.Object] */
    public x71(d21 d21Var) {
        this.c = d21Var;
        ?? obj = new Object();
        obj.b = new long[2];
        this.d = obj;
        this.e = new py0(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [d21] */
    /* JADX WARN: Type inference failed for: r5v1, types: [d21] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42, types: [d21] */
    /* JADX WARN: Type inference failed for: r5v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [q41] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [q41] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    @Override // defpackage.j81
    public final boolean a(py0 py0Var, iq0 iq0Var, sl0 sl0Var, boolean z) {
        np npVar;
        py0 py0Var2;
        Object obj;
        boolean z2;
        boolean z3;
        jh1 jh1Var;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i;
        int i2;
        boolean z8;
        int i3;
        boolean z9;
        int i4;
        List list;
        List list2;
        int i5;
        qh1 qh1Var;
        boolean a = super.a(py0Var, iq0Var, sl0Var, z);
        rz rzVar = this.c;
        boolean z10 = true;
        if (rzVar.r) {
            ?? r8 = 0;
            while (rzVar != 0) {
                if (rzVar instanceof th1) {
                    this.f = hp.K((th1) rzVar, 16);
                } else if ((rzVar.g & 16) != 0 && (rzVar instanceof rz)) {
                    d21 d21Var = rzVar.t;
                    int i6 = 0;
                    rzVar = rzVar;
                    r8 = r8;
                    while (d21Var != null) {
                        if ((d21Var.g & 16) != 0) {
                            i6++;
                            r8 = r8;
                            if (i6 == 1) {
                                rzVar = d21Var;
                            } else {
                                if (r8 == 0) {
                                    r8 = new q41(new d21[16]);
                                }
                                if (rzVar != 0) {
                                    r8.b(rzVar);
                                    rzVar = 0;
                                }
                                r8.b(d21Var);
                            }
                        }
                        d21Var = d21Var.j;
                        rzVar = rzVar;
                        r8 = r8;
                    }
                    if (i6 == 1) {
                    }
                }
                rzVar = hp.l(r8);
            }
            if (this.f != null) {
                int d = py0Var.d();
                int i7 = 0;
                while (true) {
                    npVar = this.d;
                    py0Var2 = this.e;
                    if (i7 >= d) {
                        break;
                    }
                    long a2 = py0Var.a(i7);
                    qh1 qh1Var2 = (qh1) py0Var.e(i7);
                    if (npVar.b(a2)) {
                        boolean z11 = z10;
                        long j = qh1Var2.g;
                        List list3 = qh1Var2.k;
                        long j2 = qh1Var2.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z9 = z11;
                            List list4 = l60.e;
                            if (list3 == null) {
                                list = list4;
                            } else {
                                list = list3;
                            }
                            z8 = a;
                            ArrayList arrayList = new ArrayList(list.size());
                            if (list3 == null) {
                                list2 = list4;
                            } else {
                                list2 = list3;
                            }
                            i3 = d;
                            int size = list2.size();
                            i4 = i7;
                            int i8 = 0;
                            while (i8 < size) {
                                List list5 = list2;
                                yg0 yg0Var = (yg0) list2.get(i8);
                                py0 py0Var3 = py0Var2;
                                long j3 = a2;
                                long j4 = yg0Var.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    qh1Var = qh1Var2;
                                    long j5 = yg0Var.a;
                                    i5 = size;
                                    e81 e81Var = this.f;
                                    e81Var.getClass();
                                    arrayList.add(new yg0(j5, e81Var.L(iq0Var, j4), yg0Var.c));
                                } else {
                                    i5 = size;
                                    qh1Var = qh1Var2;
                                }
                                i8++;
                                size = i5;
                                list2 = list5;
                                py0Var2 = py0Var3;
                                a2 = j3;
                                qh1Var2 = qh1Var;
                            }
                            py0 py0Var4 = py0Var2;
                            long j6 = a2;
                            e81 e81Var2 = this.f;
                            e81Var2.getClass();
                            long L = e81Var2.L(iq0Var, j);
                            e81 e81Var3 = this.f;
                            e81Var3.getClass();
                            qh1 qh1Var3 = new qh1(qh1Var2.a, qh1Var2.b, e81Var3.L(iq0Var, j2), qh1Var2.d, qh1Var2.e, qh1Var2.f, L, qh1Var2.h, qh1Var2.i, arrayList, qh1Var2.j, qh1Var2.l);
                            qh1 qh1Var4 = qh1Var2.o;
                            if (qh1Var4 == null) {
                                qh1Var4 = qh1Var2;
                            }
                            qh1Var3.o = qh1Var4;
                            qh1 qh1Var5 = qh1Var2.o;
                            if (qh1Var5 != null) {
                                qh1Var2 = qh1Var5;
                            }
                            qh1Var3.o = qh1Var2;
                            py0Var4.b(qh1Var3, j6);
                        } else {
                            z8 = a;
                            i3 = d;
                            i4 = i7;
                            z9 = z11;
                        }
                    } else {
                        z8 = a;
                        i3 = d;
                        z9 = z10;
                        i4 = i7;
                    }
                    i7 = i4 + 1;
                    d = i3;
                    z10 = z9;
                    a = z8;
                }
                boolean z12 = a;
                boolean z13 = z10;
                if (py0Var2.d() == 0) {
                    npVar.a = 0;
                    this.a.g();
                    return z13;
                }
                int i9 = npVar.a;
                while (true) {
                    i9--;
                    if (-1 >= i9) {
                        break;
                    }
                    long j7 = ((long[]) npVar.b)[i9];
                    if (py0Var.e) {
                        int i10 = py0Var.h;
                        long[] jArr = py0Var.f;
                        Object[] objArr = py0Var.g;
                        int i11 = 0;
                        for (int i12 = 0; i12 < i10; i12++) {
                            Object obj2 = objArr[i12];
                            if (obj2 != f2.k) {
                                if (i12 != i11) {
                                    jArr[i11] = jArr[i12];
                                    objArr[i11] = obj2;
                                    objArr[i12] = null;
                                }
                                i11++;
                            }
                        }
                        py0Var.e = false;
                        py0Var.h = i11;
                    }
                    if (f2.n(py0Var.f, py0Var.h, j7) < 0 && i9 < (i2 = npVar.a)) {
                        int i13 = i2 - 1;
                        int i14 = i9;
                        while (i14 < i13) {
                            long[] jArr2 = (long[]) npVar.b;
                            int i15 = i14 + 1;
                            jArr2[i14] = jArr2[i15];
                            i14 = i15;
                        }
                        npVar.a--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(py0Var2.d());
                int d2 = py0Var2.d();
                for (int i16 = 0; i16 < d2; i16++) {
                    arrayList2.add(py0Var2.e(i16));
                }
                jh1 jh1Var2 = new jh1(arrayList2, sl0Var);
                int size2 = arrayList2.size();
                int i17 = 0;
                while (true) {
                    if (i17 < size2) {
                        obj = arrayList2.get(i17);
                        if (sl0Var.n(((qh1) obj).a)) {
                            break;
                        }
                        i17++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                qh1 qh1Var6 = (qh1) obj;
                if (qh1Var6 != null) {
                    boolean z14 = qh1Var6.d;
                    if (!z) {
                        z2 = false;
                        this.i = false;
                    } else {
                        z2 = false;
                        if (!this.i && (z14 || qh1Var6.h)) {
                            e81 e81Var4 = this.f;
                            e81Var4.getClass();
                            long j8 = e81Var4.g;
                            long j9 = qh1Var6.c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                            int i18 = (int) (j8 >> 32);
                            int i19 = (int) (j8 & 4294967295L);
                            if (intBitsToFloat < 0.0f) {
                                z4 = z13;
                            } else {
                                z4 = false;
                            }
                            if (intBitsToFloat > i18) {
                                z5 = z13;
                            } else {
                                z5 = false;
                            }
                            boolean z15 = z5 | z4;
                            if (intBitsToFloat2 < 0.0f) {
                                z6 = z13;
                            } else {
                                z6 = false;
                            }
                            boolean z16 = z6 | z15;
                            if (intBitsToFloat2 > i19) {
                                z7 = z13;
                            } else {
                                z7 = false;
                            }
                            this.i = !(z7 | z16);
                        }
                    }
                    boolean z17 = this.i;
                    boolean z18 = this.h;
                    int i20 = 5;
                    if (z17 != z18 && ((i = jh1Var2.f) == 3 || i == 4 || i == 5)) {
                        if (z17) {
                            i20 = 4;
                        }
                        jh1Var2.f = i20;
                    } else {
                        int i21 = jh1Var2.f;
                        if (i21 == 4 && z18 && !this.j) {
                            jh1Var2.f = 3;
                        } else if (i21 == 5 && z17 && z14) {
                            jh1Var2.f = 3;
                        }
                    }
                } else {
                    z2 = false;
                }
                if (!z12 && jh1Var2.f == 3 && (jh1Var = this.g) != null) {
                    ?? r1 = jh1Var.a;
                    int size3 = r1.size();
                    ?? r4 = jh1Var2.a;
                    if (size3 == r4.size()) {
                        int size4 = r4.size();
                        for (?? r5 = z2; r5 < size4; r5++) {
                            if (z81.b(((qh1) r1.get(r5)).c, ((qh1) r4.get(r5)).c)) {
                            }
                        }
                        z3 = z2;
                        this.g = jh1Var2;
                        return z3;
                    }
                }
                z3 = z13;
                this.g = jh1Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.j81
    public final void b(sl0 sl0Var) {
        super.b(sl0Var);
        jh1 jh1Var = this.g;
        if (jh1Var == null) {
            return;
        }
        this.h = this.i;
        List list = jh1Var.a;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            qh1 qh1Var = (qh1) list.get(i);
            boolean z2 = qh1Var.d;
            long j = qh1Var.a;
            boolean n = sl0Var.n(j);
            boolean z3 = this.i;
            if ((!z2 && !n) || (!z2 && !z3)) {
                this.d.d(j);
            }
        }
        this.i = false;
        if (jh1Var.f == 5) {
            z = true;
        }
        this.j = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [q41] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [q41] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [d21] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [d21] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [d21] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        q41 q41Var = this.a;
        Object[] objArr = q41Var.e;
        int i = q41Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((x71) objArr[i2]).c();
        }
        rz rzVar = this.c;
        ?? r1 = 0;
        while (rzVar != 0) {
            if (rzVar instanceof th1) {
                ((th1) rzVar).E();
            } else if ((rzVar.g & 16) != 0 && (rzVar instanceof rz)) {
                d21 d21Var = rzVar.t;
                int i3 = 0;
                r1 = r1;
                rzVar = rzVar;
                while (d21Var != null) {
                    if ((d21Var.g & 16) != 0) {
                        i3++;
                        r1 = r1;
                        if (i3 == 1) {
                            rzVar = d21Var;
                        } else {
                            if (r1 == 0) {
                                r1 = new q41(new d21[16]);
                            }
                            if (rzVar != 0) {
                                r1.b(rzVar);
                                rzVar = 0;
                            }
                            r1.b(d21Var);
                        }
                    }
                    d21Var = d21Var.j;
                    r1 = r1;
                    rzVar = rzVar;
                }
                if (i3 == 1) {
                }
            }
            rzVar = hp.l(r1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008d A[LOOP:0: B:5:0x008b->B:6:0x008d, LOOP_END] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [d21] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [d21] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [q41] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [q41] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.sl0 r15) {
        /*
            r14 = this;
            py0 r0 = r14.e
            int r1 = r0.d()
            r2 = 0
            r3 = 0
            if (r1 != 0) goto Ld
        La:
            r9 = r3
            goto L83
        Ld:
            d21 r1 = r14.c
            boolean r4 = r1.r
            if (r4 != 0) goto L14
            goto La
        L14:
            jh1 r4 = r14.g
            r4.getClass()
            e81 r5 = r14.f
            r5.getClass()
            long r5 = r5.g
            r7 = r1
            r8 = r2
        L22:
            r9 = 1
            if (r7 == 0) goto L6c
            boolean r10 = r7 instanceof defpackage.th1
            if (r10 == 0) goto L31
            th1 r7 = (defpackage.th1) r7
            kh1 r9 = defpackage.kh1.g
            r7.u(r4, r9, r5)
            goto L67
        L31:
            int r10 = r7.g
            r11 = 16
            r10 = r10 & r11
            if (r10 == 0) goto L67
            boolean r10 = r7 instanceof defpackage.rz
            if (r10 == 0) goto L67
            r10 = r7
            rz r10 = (defpackage.rz) r10
            d21 r10 = r10.t
            r12 = r3
        L42:
            if (r10 == 0) goto L64
            int r13 = r10.g
            r13 = r13 & r11
            if (r13 == 0) goto L61
            int r12 = r12 + 1
            if (r12 != r9) goto L4f
            r7 = r10
            goto L61
        L4f:
            if (r8 != 0) goto L58
            q41 r8 = new q41
            d21[] r13 = new defpackage.d21[r11]
            r8.<init>(r13)
        L58:
            if (r7 == 0) goto L5e
            r8.b(r7)
            r7 = r2
        L5e:
            r8.b(r10)
        L61:
            d21 r10 = r10.j
            goto L42
        L64:
            if (r12 != r9) goto L67
            goto L22
        L67:
            d21 r7 = defpackage.hp.l(r8)
            goto L22
        L6c:
            boolean r1 = r1.r
            if (r1 == 0) goto L83
            q41 r1 = r14.a
            java.lang.Object[] r4 = r1.e
            int r1 = r1.g
            r5 = r3
        L77:
            if (r5 >= r1) goto L83
            r6 = r4[r5]
            x71 r6 = (defpackage.x71) r6
            r6.d(r15)
            int r5 = r5 + 1
            goto L77
        L83:
            r14.b(r15)
            int r15 = r0.h
            java.lang.Object[] r1 = r0.g
            r4 = r3
        L8b:
            if (r4 >= r15) goto L92
            r1[r4] = r2
            int r4 = r4 + 1
            goto L8b
        L92:
            r0.h = r3
            r0.e = r3
            r14.f = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x71.d(sl0):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [d21] */
    /* JADX WARN: Type inference failed for: r0v3, types: [d21] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [d21] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [q41] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [q41] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [d21] */
    /* JADX WARN: Type inference failed for: r6v10, types: [d21] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [q41] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [q41] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(sl0 sl0Var, boolean z) {
        if (this.e.d() == 0) {
            return false;
        }
        rz rzVar = this.c;
        if (!rzVar.r) {
            return false;
        }
        jh1 jh1Var = this.g;
        jh1Var.getClass();
        e81 e81Var = this.f;
        e81Var.getClass();
        long j = e81Var.g;
        rz rzVar2 = rzVar;
        ?? r7 = 0;
        while (rzVar2 != 0) {
            if (rzVar2 instanceof th1) {
                ((th1) rzVar2).u(jh1Var, kh1.e, j);
            } else if ((rzVar2.g & 16) != 0 && (rzVar2 instanceof rz)) {
                d21 d21Var = rzVar2.t;
                int i = 0;
                rzVar2 = rzVar2;
                r7 = r7;
                while (d21Var != null) {
                    if ((d21Var.g & 16) != 0) {
                        i++;
                        r7 = r7;
                        if (i == 1) {
                            rzVar2 = d21Var;
                        } else {
                            if (r7 == 0) {
                                r7 = new q41(new d21[16]);
                            }
                            if (rzVar2 != 0) {
                                r7.b(rzVar2);
                                rzVar2 = 0;
                            }
                            r7.b(d21Var);
                        }
                    }
                    d21Var = d21Var.j;
                    rzVar2 = rzVar2;
                    r7 = r7;
                }
                if (i == 1) {
                }
            }
            rzVar2 = hp.l(r7);
        }
        if (rzVar.r) {
            q41 q41Var = this.a;
            Object[] objArr = q41Var.e;
            int i2 = q41Var.g;
            for (int i3 = 0; i3 < i2; i3++) {
                x71 x71Var = (x71) objArr[i3];
                this.f.getClass();
                x71Var.e(sl0Var, z);
            }
        }
        if (rzVar.r) {
            ?? r13 = 0;
            while (rzVar != 0) {
                if (rzVar instanceof th1) {
                    ((th1) rzVar).u(jh1Var, kh1.f, j);
                } else if ((rzVar.g & 16) != 0 && (rzVar instanceof rz)) {
                    d21 d21Var2 = rzVar.t;
                    int i4 = 0;
                    rzVar = rzVar;
                    r13 = r13;
                    while (d21Var2 != null) {
                        if ((d21Var2.g & 16) != 0) {
                            i4++;
                            r13 = r13;
                            if (i4 == 1) {
                                rzVar = d21Var2;
                            } else {
                                if (r13 == 0) {
                                    r13 = new q41(new d21[16]);
                                }
                                if (rzVar != 0) {
                                    r13.b(rzVar);
                                    rzVar = 0;
                                }
                                r13.b(d21Var2);
                            }
                        }
                        d21Var2 = d21Var2.j;
                        rzVar = rzVar;
                        r13 = r13;
                    }
                    if (i4 == 1) {
                    }
                }
                rzVar = hp.l(r13);
            }
        }
        return true;
    }

    public final void f(long j, b41 b41Var) {
        np npVar = this.d;
        if (npVar.b(j) && b41Var.g(this) < 0) {
            npVar.d(j);
            this.e.c(j);
        }
        q41 q41Var = this.a;
        Object[] objArr = q41Var.e;
        int i = q41Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((x71) objArr[i2]).f(j, b41Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
