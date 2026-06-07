package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class od1 implements us1 {
    public long A;
    public final ss0 B;
    public final o41 C;
    public final o41 D;
    public final je1 E;
    public final je1 F;
    public final je1 G;
    public final je1 H;
    public boolean a;
    public fd1 b;
    public final je1 c;
    public final hd1 d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final xy k;
    public final boolean l;
    public int m;
    public us0 n;
    public boolean o;
    public final je1 p;
    public c00 q;
    public final r31 r;
    public final ge1 s;
    public final ge1 t;
    public final vs0 u;
    public final vc1 v;
    public final nj w;
    public final og x;
    public final je1 y;
    public final qt0 z;

    /* JADX WARN: Type inference failed for: r3v1, types: [kd1] */
    public od1(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            nl0.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = fr1.k(new z81(0L));
        this.d = new hd1(i, f, this);
        this.e = i;
        this.g = Long.MAX_VALUE;
        final int i2 = 0;
        this.k = new xy(new oe0(this) { // from class: jd1
            public final /* synthetic */ od1 f;

            {
                this.f = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
            @Override // defpackage.oe0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 246
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.jd1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final int i3 = 1;
        this.l = true;
        this.m = -1;
        this.p = new je1(qd1.b, g3.S);
        this.q = qd1.a;
        this.r = new r31();
        this.s = new ge1(-1);
        this.t = new ge1(i);
        xl1 xl1Var = xl1.o;
        fr1.i(new de0(this) { // from class: kd1
            public final /* synthetic */ od1 f;

            {
                this.f = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
            @Override // defpackage.de0
            public final Object invoke() {
                int l;
                int l2;
                int k;
                int i4 = i2;
                od1 od1Var = this.f;
                switch (i4) {
                    case 0:
                        if (od1Var.k.a()) {
                            l = od1Var.t.g();
                        } else {
                            l = od1Var.l();
                        }
                        return Integer.valueOf(l);
                    case 1:
                        boolean a = od1Var.k.a();
                        ge1 ge1Var = od1Var.s;
                        if (!a) {
                            l2 = od1Var.l();
                        } else if (ge1Var.g() != -1) {
                            l2 = ge1Var.g();
                        } else {
                            float abs = Math.abs(od1Var.m());
                            c00 c00Var = od1Var.q;
                            pd1 pd1Var = qd1.a;
                            if (abs >= Math.abs(Math.min(c00Var.W(56.0f), od1Var.p() / 2.0f) / od1Var.p())) {
                                boolean booleanValue = ((Boolean) od1Var.G.getValue()).booleanValue();
                                int i5 = od1Var.e;
                                if (booleanValue) {
                                    l2 = i5 + 1;
                                } else {
                                    l2 = i5;
                                }
                            } else {
                                l2 = od1Var.l();
                            }
                        }
                        k = od1Var.k(l2);
                        return Integer.valueOf(k);
                    default:
                        k = od1Var.o();
                        return Integer.valueOf(k);
                }
            }
        }, xl1Var);
        fr1.i(new de0(this) { // from class: kd1
            public final /* synthetic */ od1 f;

            {
                this.f = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
            @Override // defpackage.de0
            public final Object invoke() {
                int l;
                int l2;
                int k;
                int i4 = i3;
                od1 od1Var = this.f;
                switch (i4) {
                    case 0:
                        if (od1Var.k.a()) {
                            l = od1Var.t.g();
                        } else {
                            l = od1Var.l();
                        }
                        return Integer.valueOf(l);
                    case 1:
                        boolean a = od1Var.k.a();
                        ge1 ge1Var = od1Var.s;
                        if (!a) {
                            l2 = od1Var.l();
                        } else if (ge1Var.g() != -1) {
                            l2 = ge1Var.g();
                        } else {
                            float abs = Math.abs(od1Var.m());
                            c00 c00Var = od1Var.q;
                            pd1 pd1Var = qd1.a;
                            if (abs >= Math.abs(Math.min(c00Var.W(56.0f), od1Var.p() / 2.0f) / od1Var.p())) {
                                boolean booleanValue = ((Boolean) od1Var.G.getValue()).booleanValue();
                                int i5 = od1Var.e;
                                if (booleanValue) {
                                    l2 = i5 + 1;
                                } else {
                                    l2 = i5;
                                }
                            } else {
                                l2 = od1Var.l();
                            }
                        }
                        k = od1Var.k(l2);
                        return Integer.valueOf(k);
                    default:
                        k = od1Var.o();
                        return Integer.valueOf(k);
                }
            }
        }, xl1Var);
        vs0 vs0Var = new vs0(new oe0(this) { // from class: jd1
            public final /* synthetic */ od1 f;

            {
                this.f = this;
            }

            @Override // defpackage.oe0
            public final Object invoke(Object obj) {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    Method dump skipped, instructions count: 246
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.jd1.invoke(java.lang.Object):java.lang.Object");
            }
        });
        this.u = vs0Var;
        final int i4 = 2;
        this.v = new vc1(new wc0(18), vs0Var, new de0(this) { // from class: kd1
            public final /* synthetic */ od1 f;

            {
                this.f = this;
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
            @Override // defpackage.de0
            public final Object invoke() {
                int l;
                int l2;
                int k;
                int i42 = i4;
                od1 od1Var = this.f;
                switch (i42) {
                    case 0:
                        if (od1Var.k.a()) {
                            l = od1Var.t.g();
                        } else {
                            l = od1Var.l();
                        }
                        return Integer.valueOf(l);
                    case 1:
                        boolean a = od1Var.k.a();
                        ge1 ge1Var = od1Var.s;
                        if (!a) {
                            l2 = od1Var.l();
                        } else if (ge1Var.g() != -1) {
                            l2 = ge1Var.g();
                        } else {
                            float abs = Math.abs(od1Var.m());
                            c00 c00Var = od1Var.q;
                            pd1 pd1Var = qd1.a;
                            if (abs >= Math.abs(Math.min(c00Var.W(56.0f), od1Var.p() / 2.0f) / od1Var.p())) {
                                boolean booleanValue = ((Boolean) od1Var.G.getValue()).booleanValue();
                                int i5 = od1Var.e;
                                if (booleanValue) {
                                    l2 = i5 + 1;
                                } else {
                                    l2 = i5;
                                }
                            } else {
                                l2 = od1Var.l();
                            }
                        }
                        k = od1Var.k(l2);
                        return Integer.valueOf(k);
                    default:
                        k = od1Var.o();
                        return Integer.valueOf(k);
                }
            }
        });
        this.w = new nj(1);
        this.x = new og();
        this.y = fr1.k(null);
        this.z = new qt0(this, 1);
        this.A = vs.b(0, 0, 15);
        this.B = new ss0();
        this.C = go.u();
        this.D = go.u();
        Boolean bool = Boolean.FALSE;
        this.E = fr1.k(bool);
        this.F = fr1.k(bool);
        this.G = fr1.k(bool);
        this.H = fr1.k(bool);
    }

    public static int j(boolean z, fd1 fd1Var) {
        List list = fd1Var.a;
        int i = fd1Var.h;
        if (z) {
            int i2 = i + 1;
            if (i2 < 0) {
                return Integer.MAX_VALUE;
            }
            return ((m01) wn.n0(list)).a + i2;
        }
        return (((m01) wn.g0(list)).a - i) - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r9.d(r7, r8, r0) != r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.i(r0) == r5) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object u(defpackage.od1 r6, defpackage.t41 r7, defpackage.se0 r8, defpackage.wt r9) {
        /*
            boolean r0 = r9 instanceof defpackage.nd1
            if (r0 == 0) goto L13
            r0 = r9
            nd1 r0 = (defpackage.nd1) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            nd1 r0 = new nd1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.h
            int r1 = r0.j
            r2 = 0
            r3 = 2
            r4 = 1
            hv r5 = defpackage.hv.e
            if (r1 == 0) goto L40
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            od1 r6 = r0.e
            defpackage.io.K(r9)
            goto L77
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r6)
            return r2
        L33:
            q42 r6 = r0.g
            r8 = r6
            se0 r8 = (defpackage.se0) r8
            t41 r7 = r0.f
            od1 r6 = r0.e
            defpackage.io.K(r9)
            goto L55
        L40:
            defpackage.io.K(r9)
            r0.e = r6
            r0.f = r7
            r9 = r8
            q42 r9 = (defpackage.q42) r9
            r0.g = r9
            r0.j = r4
            java.lang.Object r9 = r6.i(r0)
            if (r9 != r5) goto L55
            goto L76
        L55:
            xy r9 = r6.k
            boolean r9 = r9.a()
            if (r9 != 0) goto L66
            int r9 = r6.l()
            ge1 r1 = r6.t
            r1.h(r9)
        L66:
            xy r9 = r6.k
            r0.e = r6
            r0.f = r2
            r0.g = r2
            r0.j = r3
            java.lang.Object r7 = r9.d(r7, r8, r0)
            if (r7 != r5) goto L77
        L76:
            return r5
        L77:
            r7 = -1
            ge1 r6 = r6.s
            r6.h(r7)
            od2 r6 = defpackage.od2.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od1.u(od1, t41, se0, wt):java.lang.Object");
    }

    @Override // defpackage.us1
    public final boolean a() {
        return this.k.a();
    }

    @Override // defpackage.us1
    public final boolean b() {
        return ((Boolean) this.F.getValue()).booleanValue();
    }

    @Override // defpackage.us1
    public final boolean c() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    @Override // defpackage.us1
    public final Object d(t41 t41Var, se0 se0Var, wt wtVar) {
        return u(this, t41Var, se0Var, wtVar);
    }

    @Override // defpackage.us1
    public final float e(float f) {
        return this.k.e(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r12, defpackage.f22 r13, defpackage.wt r14) {
        /*
            r11 = this;
            boolean r3 = r14 instanceof defpackage.ld1
            if (r3 == 0) goto L14
            r3 = r14
            ld1 r3 = (defpackage.ld1) r3
            int r4 = r3.i
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L14
            int r4 = r4 - r5
            r3.i = r4
        L12:
            r6 = r3
            goto L1a
        L14:
            ld1 r3 = new ld1
            r3.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r2 = r6.g
            int r3 = r6.i
            r7 = 0
            r4 = 0
            od2 r8 = defpackage.od2.a
            r9 = 2
            r5 = 1
            hv r10 = defpackage.hv.e
            if (r3 == 0) goto L40
            if (r3 == r5) goto L36
            if (r3 != r9) goto L30
            defpackage.io.K(r2)
            return r8
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r0)
            return r7
        L36:
            int r0 = r6.e
            f22 r3 = r6.f
            defpackage.io.K(r2)
            r2 = r4
            r4 = r3
            goto L69
        L40:
            defpackage.io.K(r2)
            int r2 = r11.l()
            if (r12 != r2) goto L52
            float r2 = r11.m()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L52
            goto L88
        L52:
            int r2 = r11.o()
            if (r2 != 0) goto L59
            goto L88
        L59:
            r6.f = r13
            r6.e = r12
            r6.i = r5
            java.lang.Object r3 = r11.i(r6)
            if (r3 != r10) goto L66
            goto L87
        L66:
            r0 = r12
            r2 = r4
            r4 = r13
        L69:
            int r0 = r11.k(r0)
            int r3 = r11.q()
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = r0
            md1 r0 = new md1
            r5 = 0
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f = r7
            r6.i = r9
            t41 r2 = defpackage.t41.e
            java.lang.Object r0 = r11.d(r2, r0, r6)
            if (r0 != r10) goto L88
        L87:
            return r10
        L88:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od1.f(int, f22, wt):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0121 A[Catch: all -> 0x015b, TRY_LEAVE, TryCatch #0 {all -> 0x015b, blocks: (B:28:0x00b5, B:42:0x00c4, B:45:0x00cd, B:48:0x00da, B:50:0x00e6, B:55:0x0121, B:57:0x0116, B:61:0x00fe), top: B:27:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.fd1 r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od1.h(fd1, boolean, boolean):void");
    }

    public final Object i(wt wtVar) {
        Object h;
        if (this.p.getValue() == qd1.b && (h = this.x.h(wtVar)) == hv.e) {
            return h;
        }
        return od2.a;
    }

    public final int k(int i) {
        if (o() <= 0) {
            return 0;
        }
        return go.p(i, 0, o() - 1);
    }

    public final int l() {
        return this.d.b.g();
    }

    public final float m() {
        return this.d.c.g();
    }

    public final fd1 n() {
        return (fd1) this.p.getValue();
    }

    public abstract int o();

    public final int p() {
        return ((fd1) this.p.getValue()).b;
    }

    public final int q() {
        return ((fd1) this.p.getValue()).c + p();
    }

    public final long r() {
        return ((z81) this.c.getValue()).a;
    }

    public final boolean s() {
        if (((int) Float.intBitsToFloat((int) (r() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (r() & 4294967295L))) == 0) {
            return true;
        }
        return false;
    }

    public final void t(float f, fd1 fd1Var) {
        boolean z;
        us0 us0Var;
        us0 us0Var2;
        us0 us0Var3;
        List list = fd1Var.a;
        if (this.l && !list.isEmpty()) {
            if (f > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            int j = j(z, fd1Var);
            if (j >= 0 && j < o()) {
                if (j != this.m) {
                    if (this.o != z && (us0Var3 = this.n) != null) {
                        us0Var3.cancel();
                    }
                    this.o = z;
                    this.m = j;
                    this.n = this.u.a(j, this.A, true, null);
                }
                if (z) {
                    if ((((m01) wn.n0(list)).j + (fd1Var.b + fd1Var.c)) - fd1Var.g < f && (us0Var2 = this.n) != null) {
                        us0Var2.a();
                        return;
                    }
                    return;
                }
                if (fd1Var.f - ((m01) wn.g0(list)).j < (-f) && (us0Var = this.n) != null) {
                    us0Var.a();
                }
            }
        }
    }

    public final void v(float f, int i, boolean z) {
        hd1 hd1Var = this.d;
        ge1 ge1Var = hd1Var.b;
        fe1 fe1Var = hd1Var.c;
        if (ge1Var.g() != i || fe1Var.g() != f) {
            this.v.a();
        }
        hd1Var.b.h(i);
        hd1Var.f.a(i);
        fe1Var.h(f);
        hd1Var.e = null;
        if (z) {
            ar0 ar0Var = (ar0) this.y.getValue();
            if (ar0Var != null) {
                ar0Var.k();
                return;
            }
            return;
        }
        this.D.setValue(od2.a);
    }
}
