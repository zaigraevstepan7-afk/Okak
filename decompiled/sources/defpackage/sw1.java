package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class sw1 extends q0 implements m41, va0, ff0 {
    public final int i;
    public final int j;
    public final jk k;
    public Object[] l;
    public long m;
    public long n;
    public int o;
    public int p;

    public sw1(int i, int i2, jk jkVar) {
        this.i = i;
        this.j = i2;
        this.k = jkVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(7:(2:3|(10:5|6|7|(2:9|(1:(1:(7:13|14|15|16|17|(3:18|19|(10:28|(2:33|34)|36|(1:38)|15|16|17|18|19|(0)(1:21))(0))|25)(2:39|40))(5:41|42|17|(3:18|19|(0)(0))|25))(4:43|44|45|46))(1:57)|47|48|16|17|(3:18|19|(0)(0))|25))|47|48|16|17|(3:18|19|(0)(0))|25)|59|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0036, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x002f, B:18:0x0075, B:21:0x007f, B:30:0x0092, B:33:0x0099, B:34:0x009d, B:36:0x009e, B:42:0x0047), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v1, types: [q0] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [sw1] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [wa0] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [r0] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [tw1] */
    /* JADX WARN: Type inference failed for: r9v8, types: [tw1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ac -> B:15:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(defpackage.sw1 r8, defpackage.wa0 r9, defpackage.vt r10) {
        /*
            boolean r0 = r10 instanceof defpackage.rw1
            if (r0 == 0) goto L13
            r0 = r10
            rw1 r0 = (defpackage.rw1) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            rw1 r0 = new rw1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.i
            int r1 = r0.k
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5a
            r8 = 1
            if (r1 == r8) goto L4b
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            go0 r8 = r0.h
            tw1 r9 = r0.g
            wa0 r1 = r0.f
            sw1 r4 = r0.e
            defpackage.io.K(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L72
        L36:
            r8 = move-exception
            goto Lb2
        L39:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r8)
            return
        L3f:
            go0 r8 = r0.h
            tw1 r9 = r0.g
            wa0 r1 = r0.f
            sw1 r4 = r0.e
            defpackage.io.K(r10)     // Catch: java.lang.Throwable -> L36
            goto L75
        L4b:
            tw1 r9 = r0.g
            wa0 r8 = r0.f
            sw1 r1 = r0.e
            defpackage.io.K(r10)     // Catch: java.lang.Throwable -> L57
            r10 = r8
            r8 = r1
            goto L66
        L57:
            r8 = move-exception
            r4 = r1
            goto Lb2
        L5a:
            defpackage.io.K(r10)
            r0 r10 = r8.d()
            tw1 r10 = (defpackage.tw1) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L66:
            xu r1 = r0.getContext()     // Catch: java.lang.Throwable -> Laf
            g3 r4 = defpackage.g3.O     // Catch: java.lang.Throwable -> Laf
            vu r1 = r1.H(r4)     // Catch: java.lang.Throwable -> Laf
            go0 r1 = (defpackage.go0) r1     // Catch: java.lang.Throwable -> Laf
        L72:
            r4 = r8
            r8 = r1
            r1 = r10
        L75:
            java.lang.Object r10 = r4.t(r9)     // Catch: java.lang.Throwable -> L36
            ad0 r5 = defpackage.fc2.C     // Catch: java.lang.Throwable -> L36
            hv r6 = defpackage.hv.e
            if (r10 != r5) goto L90
            r0.e = r4     // Catch: java.lang.Throwable -> L36
            r0.f = r1     // Catch: java.lang.Throwable -> L36
            r0.g = r9     // Catch: java.lang.Throwable -> L36
            r0.h = r8     // Catch: java.lang.Throwable -> L36
            r0.k = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.i(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L75
            goto Lae
        L90:
            if (r8 == 0) goto L9e
            boolean r5 = r8.b()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L99
            goto L9e
        L99:
            java.util.concurrent.CancellationException r8 = r8.o()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        L9e:
            r0.e = r4     // Catch: java.lang.Throwable -> L36
            r0.f = r1     // Catch: java.lang.Throwable -> L36
            r0.g = r9     // Catch: java.lang.Throwable -> L36
            r0.h = r8     // Catch: java.lang.Throwable -> L36
            r0.k = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.b(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Lae:
            return
        Laf:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb2:
            r4.g(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw1.k(sw1, wa0, vt):void");
    }

    @Override // defpackage.va0
    public final Object a(wa0 wa0Var, vt vtVar) {
        k(this, wa0Var, vtVar);
        return hv.e;
    }

    @Override // defpackage.wa0
    public final Object b(Object obj, vt vtVar) {
        sw1 sw1Var;
        Throwable th;
        vt[] n;
        qw1 qw1Var;
        if (q(obj)) {
            return od2.a;
        }
        pl plVar = new pl(1, go.F(vtVar));
        plVar.r();
        vt[] vtVarArr = sn0.a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        plVar.resumeWith(od2.a);
                        n = n(vtVarArr);
                        qw1Var = null;
                        sw1Var = this;
                    } catch (Throwable th2) {
                        th = th2;
                        sw1Var = this;
                        throw th;
                    }
                } else {
                    try {
                        sw1Var = this;
                        try {
                            qw1 qw1Var2 = new qw1(sw1Var, o() + this.o + this.p, obj, plVar);
                            sw1Var.m(qw1Var2);
                            sw1Var.p++;
                            if (sw1Var.j == 0) {
                                vtVarArr = sw1Var.n(vtVarArr);
                            }
                            n = vtVarArr;
                            qw1Var = qw1Var2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        sw1Var = this;
                        th = th4;
                        throw th;
                    }
                }
                if (qw1Var != null) {
                    plVar.u(new kl(qw1Var, 2));
                }
                for (vt vtVar2 : n) {
                    if (vtVar2 != null) {
                        vtVar2.resumeWith(od2.a);
                    }
                }
                Object q = plVar.q();
                hv hvVar = hv.e;
                if (q != hvVar) {
                    q = od2.a;
                }
                if (q == hvVar) {
                    return q;
                }
                return od2.a;
            } catch (Throwable th5) {
                th = th5;
                sw1Var = this;
            }
        }
    }

    @Override // defpackage.ff0
    public final va0 c(xu xuVar, int i, jk jkVar) {
        if ((i == 0 || i == -3) && jkVar == jk.e) {
            return this;
        }
        return new gm(this, xuVar, i, jkVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, r0, tw1] */
    @Override // defpackage.q0
    public final r0 e() {
        ?? obj = new Object();
        obj.a = -1L;
        return obj;
    }

    @Override // defpackage.q0
    public final r0[] f() {
        return new tw1[2];
    }

    public final Object i(tw1 tw1Var, rw1 rw1Var) {
        pl plVar = new pl(1, go.F(rw1Var));
        plVar.r();
        synchronized (this) {
            try {
                if (s(tw1Var) < 0) {
                    tw1Var.b = plVar;
                } else {
                    plVar.resumeWith(od2.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object q = plVar.q();
        if (q == hv.e) {
            return q;
        }
        return od2.a;
    }

    public final void j() {
        if (this.j != 0 || this.p > 1) {
            Object[] objArr = this.l;
            objArr.getClass();
            while (this.p > 0) {
                long o = o();
                int i = this.o;
                int i2 = this.p;
                if (objArr[((int) ((o + (i + i2)) - 1)) & (objArr.length - 1)] == fc2.C) {
                    this.p = i2 - 1;
                    fc2.o(objArr, o() + this.o + this.p, null);
                } else {
                    return;
                }
            }
        }
    }

    public final void l() {
        r0[] r0VarArr;
        Object[] objArr = this.l;
        objArr.getClass();
        fc2.o(objArr, o(), null);
        this.o--;
        long o = o() + 1;
        if (this.m < o) {
            this.m = o;
        }
        if (this.n < o) {
            if (this.f != 0 && (r0VarArr = this.e) != null) {
                for (r0 r0Var : r0VarArr) {
                    if (r0Var != null) {
                        tw1 tw1Var = (tw1) r0Var;
                        long j = tw1Var.a;
                        if (j >= 0 && j < o) {
                            tw1Var.a = o;
                        }
                    }
                }
            }
            this.n = o;
        }
    }

    public final void m(Object obj) {
        int i = this.o + this.p;
        Object[] objArr = this.l;
        if (objArr == null) {
            objArr = p(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = p(objArr, i, objArr.length * 2);
        }
        fc2.o(objArr, o() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vt[] n(vt[] vtVarArr) {
        r0[] r0VarArr;
        tw1 tw1Var;
        pl plVar;
        int length = vtVarArr.length;
        if (this.f != 0 && (r0VarArr = this.e) != null) {
            int length2 = r0VarArr.length;
            int i = 0;
            vtVarArr = vtVarArr;
            while (i < length2) {
                r0 r0Var = r0VarArr[i];
                if (r0Var != null && (plVar = (tw1Var = (tw1) r0Var).b) != null && s(tw1Var) >= 0) {
                    int length3 = vtVarArr.length;
                    vtVarArr = vtVarArr;
                    if (length >= length3) {
                        vtVarArr = Arrays.copyOf(vtVarArr, Math.max(2, vtVarArr.length * 2));
                    }
                    vtVarArr[length] = plVar;
                    tw1Var.b = null;
                    length++;
                }
                i++;
                vtVarArr = vtVarArr;
            }
        }
        return vtVarArr;
    }

    public final long o() {
        return Math.min(this.n, this.m);
    }

    public final Object[] p(Object[] objArr, int i, int i2) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.l = objArr2;
            if (objArr != null) {
                long o = o();
                for (int i3 = 0; i3 < i; i3++) {
                    long j = i3 + o;
                    fc2.o(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
                }
            }
            return objArr2;
        }
        se.p("Buffer size overflow");
        return null;
    }

    public final boolean q(Object obj) {
        int i;
        boolean z;
        vt[] vtVarArr = sn0.a;
        synchronized (this) {
            if (r(obj)) {
                vtVarArr = n(vtVarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (vt vtVar : vtVarArr) {
            if (vtVar != null) {
                vtVar.resumeWith(od2.a);
            }
        }
        return z;
    }

    public final boolean r(Object obj) {
        int i = this.f;
        int i2 = this.i;
        if (i == 0) {
            if (i2 != 0) {
                m(obj);
                int i3 = this.o + 1;
                this.o = i3;
                if (i3 > i2) {
                    l();
                }
                this.n = o() + this.o;
                return true;
            }
        } else {
            int i4 = this.o;
            int i5 = this.j;
            if (i4 >= i5 && this.n <= this.m) {
                int ordinal = this.k.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            se.m();
                        }
                    }
                }
                return false;
            }
            m(obj);
            int i6 = this.o + 1;
            this.o = i6;
            if (i6 > i5) {
                l();
            }
            long o = o() + this.o;
            long j = this.m;
            if (((int) (o - j)) > i2) {
                u(1 + j, this.n, o() + this.o, o() + this.o + this.p);
            }
        }
        return true;
    }

    public final long s(tw1 tw1Var) {
        long j = tw1Var.a;
        if (j >= o() + this.o && (this.j > 0 || j > o() || this.p == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object t(tw1 tw1Var) {
        Object obj;
        vt[] vtVarArr = sn0.a;
        synchronized (this) {
            try {
                long s = s(tw1Var);
                if (s < 0) {
                    obj = fc2.C;
                } else {
                    long j = tw1Var.a;
                    Object[] objArr = this.l;
                    objArr.getClass();
                    Object obj2 = objArr[((int) s) & (objArr.length - 1)];
                    if (obj2 instanceof qw1) {
                        obj2 = ((qw1) obj2).g;
                    }
                    tw1Var.a = s + 1;
                    Object obj3 = obj2;
                    vtVarArr = v(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (vt vtVar : vtVarArr) {
            if (vtVar != null) {
                vtVar.resumeWith(od2.a);
            }
        }
        return obj;
    }

    public final void u(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long o = o(); o < min; o++) {
            Object[] objArr = this.l;
            objArr.getClass();
            fc2.o(objArr, o, null);
        }
        this.m = j;
        this.n = j2;
        this.o = (int) (j3 - min);
        this.p = (int) (j4 - j3);
    }

    public final vt[] v(long j) {
        long j2;
        long j3;
        long j4;
        vt[] vtVarArr;
        long j5;
        vt[] vtVarArr2;
        r0[] r0VarArr;
        ad0 ad0Var = fc2.C;
        vt[] vtVarArr3 = sn0.a;
        if (j <= this.n) {
            long o = o();
            long j6 = this.o + o;
            int i = this.j;
            if (i == 0 && this.p > 0) {
                j6++;
            }
            int i2 = 0;
            if (this.f != 0 && (r0VarArr = this.e) != null) {
                for (r0 r0Var : r0VarArr) {
                    if (r0Var != null) {
                        long j7 = ((tw1) r0Var).a;
                        if (j7 >= 0 && j7 < j6) {
                            j6 = j7;
                        }
                    }
                }
            }
            if (j6 > this.n) {
                long o2 = o() + this.o;
                int i3 = this.f;
                int i4 = this.p;
                if (i3 > 0) {
                    j2 = 1;
                    i4 = Math.min(i4, i - ((int) (o2 - j6)));
                } else {
                    j2 = 1;
                }
                long j8 = this.p + o2;
                if (i4 > 0) {
                    Object[] objArr = this.l;
                    objArr.getClass();
                    j3 = o;
                    vt[] vtVarArr4 = new vt[i4];
                    long j9 = o2;
                    while (true) {
                        if (o2 < j8) {
                            vtVarArr2 = vtVarArr4;
                            Object obj = objArr[((int) o2) & (objArr.length - 1)];
                            if (obj != ad0Var) {
                                obj.getClass();
                                qw1 qw1Var = (qw1) obj;
                                j4 = j6;
                                int i5 = i2 + 1;
                                vtVarArr2[i2] = qw1Var.h;
                                fc2.o(objArr, o2, ad0Var);
                                fc2.o(objArr, j9, qw1Var.g);
                                j9 += j2;
                                if (i5 >= i4) {
                                    break;
                                }
                                i2 = i5;
                            } else {
                                j4 = j6;
                            }
                            o2 += j2;
                            vtVarArr4 = vtVarArr2;
                            j6 = j4;
                        } else {
                            vtVarArr2 = vtVarArr4;
                            j4 = j6;
                            break;
                        }
                    }
                    o2 = j9;
                    vtVarArr = vtVarArr2;
                } else {
                    j3 = o;
                    j4 = j6;
                    vtVarArr = vtVarArr3;
                }
                int i6 = (int) (o2 - j3);
                if (this.f == 0) {
                    j5 = o2;
                } else {
                    j5 = j4;
                }
                long max = Math.max(this.m, o2 - Math.min(this.i, i6));
                if (i == 0 && max < j8) {
                    Object[] objArr2 = this.l;
                    objArr2.getClass();
                    if (sn0.r(objArr2[((int) max) & (objArr2.length - 1)], ad0Var)) {
                        o2 += j2;
                        max += j2;
                    }
                }
                u(max, j5, o2, j8);
                j();
                if (vtVarArr.length == 0) {
                    return vtVarArr;
                }
                return n(vtVarArr);
            }
        }
        return vtVarArr3;
    }
}
