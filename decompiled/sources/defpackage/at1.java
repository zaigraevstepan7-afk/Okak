package defpackage;

import android.view.ViewTreeObserver;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class at1 {
    public us1 a;
    public j7 b;
    public z90 c;
    public sb1 d;
    public boolean e;
    public q4 f;
    public final ts1 g;
    public final ps1 h;
    public boolean i;
    public int j = 1;
    public ds1 k = ms1.b;
    public final ys1 l = new ys1(this);
    public final hh1 m = new hh1(this, 8);

    public at1(us1 us1Var, j7 j7Var, z90 z90Var, sb1 sb1Var, boolean z, q4 q4Var, ts1 ts1Var, ps1 ps1Var) {
        this.a = us1Var;
        this.b = j7Var;
        this.c = z90Var;
        this.d = sb1Var;
        this.e = z;
        this.f = q4Var;
        this.g = ts1Var;
        this.h = ps1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, vl1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r11, defpackage.wt r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.ws1
            if (r0 == 0) goto L13
            r0 = r13
            ws1 r0 = (defpackage.ws1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ws1 r0 = new ws1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.f
            int r1 = r0.h
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            vl1 r11 = r0.e
            defpackage.io.K(r13)     // Catch: java.lang.Throwable -> L29
            r5 = r10
            goto L58
        L29:
            r0 = move-exception
            r11 = r0
            r5 = r10
            goto L68
        L2d:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r10)
            r10 = 0
            return r10
        L34:
            defpackage.io.K(r13)
            vl1 r6 = new vl1
            r6.<init>()
            r6.e = r11
            r10.i = r3
            t41 r13 = defpackage.t41.e     // Catch: java.lang.Throwable -> L65
            xs1 r4 = new xs1     // Catch: java.lang.Throwable -> L65
            r9 = 0
            r5 = r10
            r7 = r11
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L62
            r0.e = r6     // Catch: java.lang.Throwable -> L62
            r0.h = r3     // Catch: java.lang.Throwable -> L62
            java.lang.Object r10 = r5.f(r13, r4, r0)     // Catch: java.lang.Throwable -> L62
            hv r11 = defpackage.hv.e
            if (r10 != r11) goto L57
            return r11
        L57:
            r11 = r6
        L58:
            r5.i = r2
            long r10 = r11.e
            ye2 r12 = new ye2
            r12.<init>(r10)
            return r12
        L62:
            r0 = move-exception
        L63:
            r11 = r0
            goto L68
        L65:
            r0 = move-exception
            r5 = r10
            goto L63
        L68:
            r5.i = r2
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at1.a(long, wt):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if ((r7 instanceof defpackage.hy) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r5, boolean r7, defpackage.q42 r8) {
        /*
            r4 = this;
            od2 r0 = defpackage.od2.a
            if (r7 == 0) goto Ld
            z90 r7 = r4.c
            hr1 r1 = defpackage.ms1.a
            boolean r7 = r7 instanceof defpackage.hy
            if (r7 == 0) goto Ld
            goto L4f
        Ld:
            sb1 r7 = r4.d
            sb1 r1 = defpackage.sb1.f
            r2 = 0
            if (r7 != r1) goto L1a
            r7 = 1
        L15:
            long r5 = defpackage.ye2.a(r5, r2, r2, r7)
            goto L1c
        L1a:
            r7 = 2
            goto L15
        L1c:
            zs1 r7 = new zs1
            r1 = 0
            r7.<init>(r4, r1)
            j7 r1 = r4.b
            hv r2 = defpackage.hv.e
            if (r1 == 0) goto L3f
            us1 r3 = r4.a
            boolean r3 = r3.c()
            if (r3 != 0) goto L38
            us1 r4 = r4.a
            boolean r4 = r4.b()
            if (r4 == 0) goto L3f
        L38:
            java.lang.Object r4 = r1.b(r5, r7, r8)
            if (r4 != r2) goto L4f
            return r4
        L3f:
            zs1 r4 = new zs1
            at1 r7 = r7.i
            r4.<init>(r7, r8)
            r4.h = r5
            java.lang.Object r4 = r4.invokeSuspend(r0)
            if (r4 != r2) goto L4f
            return r4
        L4f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at1.b(long, boolean, q42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22, types: [d21] */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r6v16, types: [ub2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [d21] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [q41] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [q41] */
    public final long c(ds1 ds1Var, long j, int i) {
        int i2;
        r71 r71Var;
        long j2;
        long a;
        r71 r71Var2;
        long j3;
        long j4;
        r71 r71Var3;
        a81 a81Var;
        d21 d21Var;
        ub2 ub2Var;
        a81 a81Var2;
        d21 d21Var2;
        r71 r71Var4 = (r71) this.f.f;
        int i3 = 262144;
        Object obj = null;
        if (r71Var4 != null && r71Var4.r) {
            if (!r71Var4.e.r) {
                kl0.b("visitAncestors called on an unattached node");
            }
            d21 d21Var3 = r71Var4.e.i;
            ar0 M = hp.M(r71Var4);
            loop0: while (true) {
                if (M != null) {
                    if ((M.J.f.h & i3) != 0) {
                        while (d21Var3 != null) {
                            if ((d21Var3.g & i3) != 0) {
                                q41 q41Var = null;
                                rz rzVar = d21Var3;
                                while (rzVar != 0) {
                                    if (rzVar instanceof ub2) {
                                        ub2Var = (ub2) rzVar;
                                        i2 = i3;
                                        if (sn0.r(r71Var4.m(), ub2Var.m()) && r71.class == ub2Var.getClass()) {
                                            break loop0;
                                        }
                                    } else {
                                        i2 = i3;
                                        if ((rzVar.g & i2) != 0 && (rzVar instanceof rz)) {
                                            d21 d21Var4 = rzVar.t;
                                            int i4 = 0;
                                            d21Var2 = rzVar;
                                            q41Var = q41Var;
                                            while (d21Var4 != null) {
                                                if ((d21Var4.g & i2) != 0) {
                                                    i4++;
                                                    q41Var = q41Var;
                                                    if (i4 == 1) {
                                                        d21Var2 = d21Var4;
                                                    } else {
                                                        if (q41Var == null) {
                                                            q41Var = new q41(new d21[16]);
                                                        }
                                                        if (d21Var2 != null) {
                                                            q41Var.b(d21Var2);
                                                            d21Var2 = null;
                                                        }
                                                        q41Var.b(d21Var4);
                                                    }
                                                }
                                                d21Var4 = d21Var4.j;
                                                d21Var2 = d21Var2;
                                                q41Var = q41Var;
                                            }
                                            if (i4 == 1) {
                                                i3 = i2;
                                                rzVar = d21Var2;
                                                q41Var = q41Var;
                                            }
                                        }
                                    }
                                    d21Var2 = hp.l(q41Var);
                                    i3 = i2;
                                    rzVar = d21Var2;
                                    q41Var = q41Var;
                                }
                            }
                            d21Var3 = d21Var3.i;
                            i3 = i3;
                        }
                    }
                    int i5 = i3;
                    M = M.v();
                    if (M != null && (a81Var2 = M.J) != null) {
                        d21Var3 = a81Var2.e;
                    } else {
                        d21Var3 = null;
                    }
                    i3 = i5;
                } else {
                    i2 = i3;
                    ub2Var = null;
                    break;
                }
            }
            r71Var = (r71) ub2Var;
        } else {
            i2 = 262144;
            r71Var = null;
        }
        if (r71Var != null) {
            j2 = r71Var.H(i, j);
        } else {
            j2 = 0;
        }
        long d = z81.d(j, j2);
        if (this.d == sb1.f) {
            a = z81.a(d, 0.0f, 1);
        } else {
            a = z81.a(d, 0.0f, 2);
        }
        long e = e(h(ds1Var.a(g(e(a)))));
        ts1 ts1Var = this.g;
        if (ts1Var.r) {
            ViewTreeObserver viewTreeObserver = ((q5) hp.N(ts1Var)).getViewTreeObserver();
            try {
                if (q5.Q0 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    q5.Q0 = declaredMethod;
                }
                Method method = q5.Q0;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        long d2 = z81.d(d, e);
        r71 r71Var5 = (r71) this.f.f;
        if (r71Var5 != null && r71Var5.r) {
            if (!r71Var5.e.r) {
                kl0.b("visitAncestors called on an unattached node");
            }
            d21 d21Var5 = r71Var5.e.i;
            ar0 M2 = hp.M(r71Var5);
            loop3: while (true) {
                if (M2 != null) {
                    if ((M2.J.f.h & i2) != 0) {
                        while (d21Var5 != null) {
                            if ((d21Var5.g & i2) != 0) {
                                rz rzVar2 = d21Var5;
                                ?? r7 = obj;
                                while (rzVar2 != 0) {
                                    if (rzVar2 instanceof ub2) {
                                        ?? r6 = (ub2) rzVar2;
                                        if (sn0.r(r71Var5.m(), r6.m()) && r71.class == r6.getClass()) {
                                            r71Var3 = r6;
                                            break loop3;
                                        }
                                    } else if ((rzVar2.g & i2) != 0 && (rzVar2 instanceof rz)) {
                                        d21 d21Var6 = rzVar2.t;
                                        int i6 = 0;
                                        d21Var = rzVar2;
                                        r7 = r7;
                                        while (d21Var6 != null) {
                                            if ((d21Var6.g & i2) != 0) {
                                                i6++;
                                                r7 = r7;
                                                if (i6 == 1) {
                                                    d21Var = d21Var6;
                                                } else {
                                                    if (r7 == 0) {
                                                        r7 = new q41(new d21[16]);
                                                    }
                                                    if (d21Var != null) {
                                                        r7.b(d21Var);
                                                        d21Var = null;
                                                    }
                                                    r7.b(d21Var6);
                                                }
                                            }
                                            d21Var6 = d21Var6.j;
                                            d21Var = d21Var;
                                            r7 = r7;
                                        }
                                        if (i6 == 1) {
                                            rzVar2 = d21Var;
                                            r7 = r7;
                                        }
                                    }
                                    d21Var = hp.l(r7);
                                    rzVar2 = d21Var;
                                    r7 = r7;
                                }
                            }
                            d21Var5 = d21Var5.i;
                            obj = null;
                        }
                    }
                    M2 = M2.v();
                    if (M2 != null && (a81Var = M2.J) != null) {
                        d21Var5 = a81Var.e;
                    } else {
                        d21Var5 = null;
                    }
                    obj = null;
                } else {
                    r71Var3 = null;
                    break;
                }
            }
            r71Var2 = r71Var3;
        } else {
            r71Var2 = null;
        }
        if (r71Var2 != null) {
            j4 = r71Var2.o0(e, d2, i);
            j3 = e;
        } else {
            j3 = e;
            j4 = 0;
        }
        return z81.e(z81.e(j2, j3), j4);
    }

    public final float d(float f) {
        if (this.e) {
            return f * (-1.0f);
        }
        return f;
    }

    public final long e(long j) {
        if (this.e) {
            return z81.f(j, -1.0f);
        }
        return j;
    }

    public final Object f(t41 t41Var, se0 se0Var, wt wtVar) {
        Object d = this.a.d(t41Var, new l(this, se0Var, null, 29), wtVar);
        if (d == hv.e) {
            return d;
        }
        return od2.a;
    }

    public final float g(long j) {
        long j2;
        if (this.d == sb1.f) {
            j2 = j >> 32;
        } else {
            j2 = j & 4294967295L;
        }
        return Float.intBitsToFloat((int) j2);
    }

    public final long h(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == sb1.f) {
            return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
        }
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float i(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double atan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        sb1 sb1Var = this.d;
        if (atan2 >= 0.7853981633974483d) {
            if (sb1Var != sb1.e) {
                return 0.0f;
            }
            return Float.intBitsToFloat(i);
        }
        if (sb1Var != sb1.f) {
            return 0.0f;
        }
        return Float.intBitsToFloat(i2);
    }
}
