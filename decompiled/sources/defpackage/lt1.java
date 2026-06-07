package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class lt1 extends ir {
    public static final ic r = new ic(0.0f);
    public static final ic s = new ic(1.0f);
    public final je1 b;
    public final je1 c;
    public Object d;
    public lb2 e;
    public long f;
    public final vm1 g;
    public final fe1 h;
    public pl i;
    public final b51 j;
    public final z41 k;
    public long l;
    public final b41 m;
    public et1 n;
    public final dt1 o;
    public float p;
    public final dt1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v6, types: [dt1] */
    /* JADX WARN: Type inference failed for: r4v7, types: [dt1] */
    public lt1(d51 d51Var) {
        super(1);
        final int i = 1;
        this.b = fr1.k(d51Var);
        this.c = fr1.k(d51Var);
        this.d = d51Var;
        this.g = new vm1(this, 7);
        this.h = new fe1(0.0f);
        this.j = new b51();
        this.k = new z41();
        this.l = Long.MIN_VALUE;
        this.m = new b41();
        final int i2 = 0;
        this.o = new oe0(this) { // from class: dt1
            public final /* synthetic */ lt1 f;

            {
                this.f = this;
            }

            @Override // defpackage.oe0
            public final Object invoke(Object obj) {
                int i3 = i2;
                od2 od2Var = od2.a;
                lt1 lt1Var = this.f;
                long longValue = ((Long) obj).longValue();
                switch (i3) {
                    case 0:
                        lt1Var.l = longValue;
                        return od2Var;
                    default:
                        long j = longValue - lt1Var.l;
                        lt1Var.l = longValue;
                        long S = c01.S(j / lt1Var.p);
                        b41 b41Var = lt1Var.m;
                        if (b41Var.i()) {
                            Object[] objArr = b41Var.a;
                            int i4 = b41Var.b;
                            int i5 = 0;
                            for (int i6 = 0; i6 < i4; i6++) {
                                et1 et1Var = (et1) objArr[i6];
                                lt1.o(et1Var, S);
                                et1Var.c = true;
                            }
                            lb2 lb2Var = lt1Var.e;
                            if (lb2Var != null) {
                                lb2Var.o();
                            }
                            int i7 = b41Var.b;
                            Object[] objArr2 = b41Var.a;
                            an0 X = go.X(0, i7);
                            int i8 = X.e;
                            int i9 = X.f;
                            if (i8 <= i9) {
                                while (true) {
                                    objArr2[i8 - i5] = objArr2[i8];
                                    if (((et1) objArr2[i8]).c) {
                                        i5++;
                                    }
                                    if (i8 != i9) {
                                        i8++;
                                    }
                                }
                            }
                            bf.M(objArr2, i7 - i5, i7);
                            b41Var.b -= i5;
                        }
                        et1 et1Var2 = lt1Var.n;
                        if (et1Var2 != null) {
                            et1Var2.g = lt1Var.f;
                            lt1.o(et1Var2, S);
                            lt1Var.r(et1Var2.d);
                            if (et1Var2.d == 1.0f) {
                                lt1Var.n = null;
                            }
                            lt1Var.q();
                        }
                        return od2Var;
                }
            }
        };
        this.q = new oe0(this) { // from class: dt1
            public final /* synthetic */ lt1 f;

            {
                this.f = this;
            }

            @Override // defpackage.oe0
            public final Object invoke(Object obj) {
                int i3 = i;
                od2 od2Var = od2.a;
                lt1 lt1Var = this.f;
                long longValue = ((Long) obj).longValue();
                switch (i3) {
                    case 0:
                        lt1Var.l = longValue;
                        return od2Var;
                    default:
                        long j = longValue - lt1Var.l;
                        lt1Var.l = longValue;
                        long S = c01.S(j / lt1Var.p);
                        b41 b41Var = lt1Var.m;
                        if (b41Var.i()) {
                            Object[] objArr = b41Var.a;
                            int i4 = b41Var.b;
                            int i5 = 0;
                            for (int i6 = 0; i6 < i4; i6++) {
                                et1 et1Var = (et1) objArr[i6];
                                lt1.o(et1Var, S);
                                et1Var.c = true;
                            }
                            lb2 lb2Var = lt1Var.e;
                            if (lb2Var != null) {
                                lb2Var.o();
                            }
                            int i7 = b41Var.b;
                            Object[] objArr2 = b41Var.a;
                            an0 X = go.X(0, i7);
                            int i8 = X.e;
                            int i9 = X.f;
                            if (i8 <= i9) {
                                while (true) {
                                    objArr2[i8 - i5] = objArr2[i8];
                                    if (((et1) objArr2[i8]).c) {
                                        i5++;
                                    }
                                    if (i8 != i9) {
                                        i8++;
                                    }
                                }
                            }
                            bf.M(objArr2, i7 - i5, i7);
                            b41Var.b -= i5;
                        }
                        et1 et1Var2 = lt1Var.n;
                        if (et1Var2 != null) {
                            et1Var2.g = lt1Var.f;
                            lt1.o(et1Var2, S);
                            lt1Var.r(et1Var2.d);
                            if (et1Var2.d == 1.0f) {
                                lt1Var.n = null;
                            }
                            lt1Var.q();
                        }
                        return od2Var;
                }
            }
        };
    }

    public static final void i(lt1 lt1Var) {
        fe1 fe1Var = lt1Var.h;
        lb2 lb2Var = lt1Var.e;
        if (lb2Var == null) {
            return;
        }
        et1 et1Var = lt1Var.n;
        if (et1Var == null) {
            if (lt1Var.f > 0 && fe1Var.g() != 1.0f && !sn0.r(lt1Var.c.getValue(), lt1Var.b.getValue())) {
                et1Var = new et1();
                et1Var.d = fe1Var.g();
                long j = lt1Var.f;
                et1Var.g = j;
                et1Var.h = c01.S((1.0d - fe1Var.g()) * j);
                et1Var.e.e(0, fe1Var.g());
            } else {
                et1Var = null;
            }
        }
        if (et1Var != null) {
            et1Var.g = lt1Var.f;
            lt1Var.m.a(et1Var);
            lb2Var.m(et1Var);
        }
        lt1Var.n = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006f, code lost:
    
        if (defpackage.qo.N(r1.getContext()).a(r12, r1) == r8) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.lt1 r11, defpackage.wt r12) {
        /*
            b41 r0 = r11.m
            boolean r1 = r12 instanceof defpackage.gt1
            if (r1 == 0) goto L15
            r1 = r12
            gt1 r1 = (defpackage.gt1) r1
            int r2 = r1.g
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.g = r2
            goto L1a
        L15:
            gt1 r1 = new gt1
            r1.<init>(r11, r12)
        L1a:
            java.lang.Object r12 = r1.e
            int r2 = r1.g
            r3 = 2
            r4 = 1
            r5 = -9223372036854775808
            od2 r7 = defpackage.od2.a
            hv r8 = defpackage.hv.e
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            goto L34
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r11)
            r11 = 0
            return r11
        L34:
            defpackage.io.K(r12)
            goto L72
        L38:
            defpackage.io.K(r12)
            boolean r12 = r0.h()
            if (r12 == 0) goto L46
            et1 r12 = r11.n
            if (r12 != 0) goto L46
            return r7
        L46:
            xu r12 = r1.getContext()
            float r12 = defpackage.yq1.r(r12)
            r2 = 0
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L59
            r11.n()
            r11.l = r5
            return r7
        L59:
            long r9 = r11.l
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 != 0) goto L72
            dt1 r12 = r11.o
            r1.g = r4
            xu r2 = r1.getContext()
            ja r2 = defpackage.qo.N(r2)
            java.lang.Object r12 = r2.a(r12, r1)
            if (r12 != r8) goto L72
            goto L88
        L72:
            boolean r12 = r0.i()
            if (r12 != 0) goto L80
            et1 r12 = r11.n
            if (r12 == 0) goto L7d
            goto L80
        L7d:
            r11.l = r5
            return r7
        L80:
            r1.g = r3
            java.lang.Object r12 = r11.m(r1)
            if (r12 != r8) goto L72
        L88:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lt1.j(lt1, wt):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        if (r0.d(r1) == r6) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.lt1 r8, defpackage.wt r9) {
        /*
            b51 r0 = r8.j
            boolean r1 = r9 instanceof defpackage.jt1
            if (r1 == 0) goto L15
            r1 = r9
            jt1 r1 = (defpackage.jt1) r1
            int r2 = r1.h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.h = r2
            goto L1a
        L15:
            jt1 r1 = new jt1
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.f
            int r2 = r1.h
            r3 = 0
            r4 = 2
            r5 = 1
            hv r6 = defpackage.hv.e
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r1.e
            defpackage.io.K(r9)
            goto L6f
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r8)
            return r3
        L35:
            java.lang.Object r2 = r1.e
            defpackage.io.K(r9)
            r9 = r2
            goto L50
        L3c:
            defpackage.io.K(r9)
            je1 r9 = r8.b
            java.lang.Object r9 = r9.getValue()
            r1.e = r9
            r1.h = r5
            java.lang.Object r2 = r0.d(r1)
            if (r2 != r6) goto L50
            goto L6b
        L50:
            r1.e = r9
            r1.h = r4
            pl r2 = new pl
            vt r1 = defpackage.go.F(r1)
            r2.<init>(r5, r1)
            r2.r()
            r8.i = r2
            r0.f(r3)
            java.lang.Object r0 = r2.q()
            if (r0 != r6) goto L6c
        L6b:
            return r6
        L6c:
            r7 = r0
            r0 = r9
            r9 = r7
        L6f:
            boolean r9 = defpackage.sn0.r(r9, r0)
            if (r9 == 0) goto L78
            od2 r8 = defpackage.od2.a
            return r8
        L78:
            r0 = -9223372036854775808
            r8.l = r0
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "targetState while waiting for composition"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lt1.k(lt1, wt):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r0.d(r1) == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(defpackage.lt1 r8, defpackage.wt r9) {
        /*
            b51 r0 = r8.j
            boolean r1 = r9 instanceof defpackage.kt1
            if (r1 == 0) goto L15
            r1 = r9
            kt1 r1 = (defpackage.kt1) r1
            int r2 = r1.h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.h = r2
            goto L1a
        L15:
            kt1 r1 = new kt1
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.f
            int r2 = r1.h
            r3 = 0
            r4 = 2
            r5 = 1
            hv r6 = defpackage.hv.e
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r1.e
            defpackage.io.K(r9)
            goto L7b
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r8)
            return r3
        L35:
            java.lang.Object r2 = r1.e
            defpackage.io.K(r9)
            r9 = r2
            goto L50
        L3c:
            defpackage.io.K(r9)
            je1 r9 = r8.b
            java.lang.Object r9 = r9.getValue()
            r1.e = r9
            r1.h = r5
            java.lang.Object r2 = r0.d(r1)
            if (r2 != r6) goto L50
            goto L77
        L50:
            java.lang.Object r2 = r8.d
            boolean r2 = defpackage.sn0.r(r9, r2)
            if (r2 == 0) goto L5c
            r0.f(r3)
            goto L81
        L5c:
            r1.e = r9
            r1.h = r4
            pl r2 = new pl
            vt r1 = defpackage.go.F(r1)
            r2.<init>(r5, r1)
            r2.r()
            r8.i = r2
            r0.f(r3)
            java.lang.Object r0 = r2.q()
            if (r0 != r6) goto L78
        L77:
            return r6
        L78:
            r7 = r0
            r0 = r9
            r9 = r7
        L7b:
            boolean r1 = defpackage.sn0.r(r9, r0)
            if (r1 == 0) goto L84
        L81:
            od2 r8 = defpackage.od2.a
            return r8
        L84:
            r1 = -9223372036854775808
            r8.l = r1
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "snapTo() was canceled because state was changed to "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = " instead of "
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lt1.l(lt1, wt):java.lang.Object");
    }

    public static void o(et1 et1Var, long j) {
        long j2 = et1Var.a + j;
        et1Var.a = j2;
        long j3 = et1Var.h;
        if (j2 >= j3) {
            et1Var.d = 1.0f;
            return;
        }
        te2 te2Var = et1Var.b;
        ic icVar = et1Var.e;
        if (te2Var != null) {
            ic icVar2 = et1Var.f;
            if (icVar2 == null) {
                icVar2 = r;
            }
            et1Var.d = go.o(((ic) te2Var.p(j2, icVar, s, icVar2)).a(0), 0.0f, 1.0f);
            return;
        }
        float f = ((float) j2) / ((float) j3);
        float f2 = 1.0f - f;
        et1Var.d = (f * 1.0f) + (f2 * icVar.a(0));
    }

    @Override // defpackage.ir
    public final Object c() {
        return this.c.getValue();
    }

    @Override // defpackage.ir
    public final Object d() {
        return this.b.getValue();
    }

    @Override // defpackage.ir
    public final void f(Object obj) {
        this.c.setValue(obj);
    }

    @Override // defpackage.ir
    public final void g(lb2 lb2Var) {
        lb2 lb2Var2 = this.e;
        if (lb2Var2 != null && lb2Var != lb2Var2) {
            gi1.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.e + ", new instance: " + lb2Var);
        }
        this.e = lb2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:4:0x0010, B:8:0x001a, B:11:0x0084, B:13:0x008c, B:15:0x009c, B:17:0x0091, B:20:0x002b, B:23:0x0037, B:25:0x004c, B:27:0x0058, B:29:0x0062, B:31:0x0072, B:39:0x007e, B:42:0x00a1), top: B:3:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    @Override // defpackage.ir
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r22 = this;
            r0 = r22
            r1 = 0
            r0.e = r1
            rr0 r2 = defpackage.qb2.b
            java.lang.Object r2 = r2.getValue()
            c12 r2 = (defpackage.c12) r2
            java.lang.Object r3 = r2.g
            monitor-enter(r3)
            q41 r2 = r2.f     // Catch: java.lang.Throwable -> L9a
            int r4 = r2.g     // Catch: java.lang.Throwable -> L9a
            r6 = 0
            r7 = 0
        L16:
            java.lang.Object[] r8 = r2.e
            if (r6 >= r4) goto La1
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L9a
            b12 r8 = (defpackage.b12) r8     // Catch: java.lang.Throwable -> L9a
            i41 r9 = r8.f     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r9 = r9.k(r0)     // Catch: java.lang.Throwable -> L9a
            x31 r9 = (defpackage.x31) r9     // Catch: java.lang.Throwable -> L9a
            if (r9 != 0) goto L2b
        L28:
            r16 = r6
            goto L84
        L2b:
            java.lang.Object[] r10 = r9.b     // Catch: java.lang.Throwable -> L9a
            int[] r11 = r9.c     // Catch: java.lang.Throwable -> L9a
            long[] r9 = r9.a     // Catch: java.lang.Throwable -> L9a
            int r12 = r9.length     // Catch: java.lang.Throwable -> L9a
            int r12 = r12 + (-2)
            if (r12 < 0) goto L28
            r13 = 0
        L37:
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L9a
            r16 = r6
            long r5 = ~r14     // Catch: java.lang.Throwable -> L9a
            r17 = 7
            long r5 = r5 << r17
            long r5 = r5 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r17
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 == 0) goto L7c
            int r5 = r13 - r12
            int r5 = ~r5     // Catch: java.lang.Throwable -> L9a
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r1 = 0
        L56:
            if (r1 >= r5) goto L79
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L70
            int r18 = r13 << 3
            int r18 = r18 + r1
            r19 = r6
            r6 = r10[r18]     // Catch: java.lang.Throwable -> L9a
            r18 = r11[r18]     // Catch: java.lang.Throwable -> L9a
            r8.c(r0, r6)     // Catch: java.lang.Throwable -> L9a
            goto L72
        L70:
            r19 = r6
        L72:
            long r14 = r14 >> r19
            int r1 = r1 + 1
            r6 = r19
            goto L56
        L79:
            r1 = r6
            if (r5 != r1) goto L84
        L7c:
            if (r13 == r12) goto L84
            int r13 = r13 + 1
            r6 = r16
            r1 = 0
            goto L37
        L84:
            i41 r1 = r8.f     // Catch: java.lang.Throwable -> L9a
            boolean r1 = r1.j()     // Catch: java.lang.Throwable -> L9a
            if (r1 != 0) goto L8f
            int r7 = r7 + 1
            goto L9c
        L8f:
            if (r7 <= 0) goto L9c
            java.lang.Object[] r1 = r2.e     // Catch: java.lang.Throwable -> L9a
            int r6 = r16 - r7
            r5 = r1[r16]     // Catch: java.lang.Throwable -> L9a
            r1[r6] = r5     // Catch: java.lang.Throwable -> L9a
            goto L9c
        L9a:
            r0 = move-exception
            goto Lab
        L9c:
            int r6 = r16 + 1
            r1 = 0
            goto L16
        La1:
            int r0 = r4 - r7
            r1 = 0
            java.util.Arrays.fill(r8, r0, r4, r1)     // Catch: java.lang.Throwable -> L9a
            r2.g = r0     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r3)
            return
        Lab:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lt1.h():void");
    }

    public final Object m(wt wtVar) {
        float r2 = yq1.r(wtVar.getContext());
        od2 od2Var = od2.a;
        if (r2 <= 0.0f) {
            n();
            return od2Var;
        }
        this.p = r2;
        Object a = qo.N(wtVar.getContext()).a(this.q, wtVar);
        if (a == hv.e) {
            return a;
        }
        return od2Var;
    }

    public final void n() {
        lb2 lb2Var = this.e;
        if (lb2Var != null) {
            lb2Var.c();
        }
        this.m.d();
        if (this.n != null) {
            this.n = null;
            r(1.0f);
            q();
        }
    }

    public final Object p(float f, Object obj, q42 q42Var) {
        if (0.0f > f || f > 1.0f) {
            gi1.a("Expecting fraction between 0 and 1. Got " + f);
        }
        lb2 lb2Var = this.e;
        if (lb2Var != null) {
            Object a = z41.a(this.k, new it1(obj, this.b.getValue(), this, lb2Var, f, null), q42Var);
            if (a == hv.e) {
                return a;
            }
        }
        return od2.a;
    }

    public final void q() {
        lb2 lb2Var = this.e;
        if (lb2Var == null) {
            return;
        }
        lb2Var.l(c01.S(this.h.g() * ((Number) lb2Var.l.getValue()).longValue()));
    }

    public final void r(float f) {
        this.h.h(f);
    }
}
