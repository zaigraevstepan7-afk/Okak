package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class j92 extends d21 implements rq0, b40, pu1 {
    public ce1 A;
    public h92 B;
    public i92 C;
    public String s;
    public k92 t;
    public cd0 u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public HashMap z;

    @Override // defpackage.d21
    public final boolean A0() {
        return false;
    }

    public final ce1 L0() {
        if (this.A == null) {
            this.A = new ce1(this.s, this.t, this.u, this.v, this.w, this.x, this.y);
        }
        ce1 ce1Var = this.A;
        ce1Var.getClass();
        return ce1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r3 != null) goto L12;
     */
    @Override // defpackage.rq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Q(defpackage.ty0 r2, defpackage.e01 r3, int r4) {
        /*
            r1 = this;
            i92 r3 = r1.C
            if (r3 == 0) goto L10
            boolean r0 = r3.c
            if (r0 == 0) goto L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L10
            ce1 r3 = r3.d
            if (r3 != 0) goto L14
        L10:
            ce1 r3 = r1.L0()
        L14:
            r3.d(r2)
            jq0 r1 = r2.getLayoutDirection()
            int r1 = r3.a(r4, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j92.Q(ty0, e01, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r3 != null) goto L12;
     */
    @Override // defpackage.rq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a0(defpackage.ty0 r2, defpackage.e01 r3, int r4) {
        /*
            r1 = this;
            i92 r3 = r1.C
            if (r3 == 0) goto L10
            boolean r0 = r3.c
            if (r0 == 0) goto L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L10
            ce1 r3 = r3.d
            if (r3 != 0) goto L14
        L10:
            ce1 r3 = r1.L0()
        L14:
            r3.d(r2)
            jq0 r1 = r2.getLayoutDirection()
            int r1 = r3.a(r4, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j92.a0(ty0, e01, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        if (r0 != null) goto L13;
     */
    @Override // defpackage.rq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.k01 b(defpackage.l01 r5, defpackage.e01 r6, long r7) {
        /*
            r4 = this;
            java.lang.String r0 = "TextStringSimpleNode::measure"
            android.os.Trace.beginSection(r0)
            i92 r0 = r4.C     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L15
            boolean r1 = r0.c     // Catch: java.lang.Throwable -> L98
            if (r1 == 0) goto Le
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L15
            ce1 r0 = r0.d     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto L19
        L15:
            ce1 r0 = r4.L0()     // Catch: java.lang.Throwable -> L98
        L19:
            r0.d(r5)     // Catch: java.lang.Throwable -> L98
            jq0 r1 = r5.getLayoutDirection()     // Catch: java.lang.Throwable -> L98
            boolean r7 = r0.b(r7, r1)     // Catch: java.lang.Throwable -> L98
            be1 r8 = r0.n     // Catch: java.lang.Throwable -> L98
            if (r8 == 0) goto L2b
            r8.a()     // Catch: java.lang.Throwable -> L98
        L2b:
            i8 r8 = r0.j     // Catch: java.lang.Throwable -> L98
            r8.getClass()     // Catch: java.lang.Throwable -> L98
            u82 r8 = r8.d     // Catch: java.lang.Throwable -> L98
            long r0 = r0.l     // Catch: java.lang.Throwable -> L98
            if (r7 == 0) goto L70
            r7 = 2
            e81 r2 = defpackage.hp.K(r4, r7)     // Catch: java.lang.Throwable -> L98
            r2.c1()     // Catch: java.lang.Throwable -> L98
            java.util.HashMap r2 = r4.z     // Catch: java.lang.Throwable -> L98
            if (r2 != 0) goto L49
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L98
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L98
            r4.z = r2     // Catch: java.lang.Throwable -> L98
        L49:
            ei0 r7 = defpackage.m3.a     // Catch: java.lang.Throwable -> L98
            r3 = 0
            float r3 = r8.d(r3)     // Catch: java.lang.Throwable -> L98
            int r3 = java.lang.Math.round(r3)     // Catch: java.lang.Throwable -> L98
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L98
            r2.put(r7, r3)     // Catch: java.lang.Throwable -> L98
            ei0 r7 = defpackage.m3.b     // Catch: java.lang.Throwable -> L98
            int r3 = r8.g     // Catch: java.lang.Throwable -> L98
            int r3 = r3 + (-1)
            float r8 = r8.d(r3)     // Catch: java.lang.Throwable -> L98
            int r8 = java.lang.Math.round(r8)     // Catch: java.lang.Throwable -> L98
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L98
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L98
        L70:
            r7 = 32
            long r7 = r0 >> r7
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L98
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r8 = (int) r0     // Catch: java.lang.Throwable -> L98
            long r0 = defpackage.go.B(r7, r7, r8, r8)     // Catch: java.lang.Throwable -> L98
            ig1 r6 = r6.x(r0)     // Catch: java.lang.Throwable -> L98
            java.util.HashMap r4 = r4.z     // Catch: java.lang.Throwable -> L98
            r4.getClass()     // Catch: java.lang.Throwable -> L98
            df r0 = new df     // Catch: java.lang.Throwable -> L98
            r1 = 9
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L98
            k01 r4 = r5.s0(r7, r8, r4, r0)     // Catch: java.lang.Throwable -> L98
            android.os.Trace.endSection()
            return r4
        L98:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j92.b(l01, e01, long):k01");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r2 != null) goto L12;
     */
    @Override // defpackage.rq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(defpackage.ty0 r1, defpackage.e01 r2, int r3) {
        /*
            r0 = this;
            i92 r2 = r0.C
            if (r2 == 0) goto L10
            boolean r3 = r2.c
            if (r3 == 0) goto L9
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto L10
            ce1 r2 = r2.d
            if (r2 != 0) goto L14
        L10:
            ce1 r2 = r0.L0()
        L14:
            r2.d(r1)
            jq0 r0 = r1.getLayoutDirection()
            be1 r0 = r2.e(r0)
            float r0 = r0.c()
            int r0 = defpackage.xq1.h(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j92.e(ty0, e01, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r0 != null) goto L15;
     */
    @Override // defpackage.b40
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0(defpackage.cr0 r11) {
        /*
            r10 = this;
            boolean r0 = r10.r
            if (r0 != 0) goto L6
            goto L9a
        L6:
            i92 r0 = r10.C
            if (r0 == 0) goto L16
            boolean r1 = r0.c
            if (r1 == 0) goto Lf
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L16
            ce1 r0 = r0.d
            if (r0 != 0) goto L1a
        L16:
            ce1 r0 = r10.L0()
        L1a:
            i8 r1 = r0.j
            if (r1 == 0) goto La1
            vl r11 = r11.e
            ld r11 = r11.f
            tl r2 = r11.h()
            boolean r11 = r0.k
            if (r11 == 0) goto L43
            long r3 = r0.l
            r0 = 32
            long r5 = r3 >> r0
            int r0 = (int) r5
            float r5 = (float) r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r0 = (int) r3
            float r6 = (float) r0
            r2.h()
            r4 = 0
            r7 = 1
            r3 = 0
            r2.n(r3, r4, r5, r6, r7)
        L43:
            k92 r0 = r10.t     // Catch: java.lang.Throwable -> L4f
            m12 r0 = r0.a     // Catch: java.lang.Throwable -> L4f
            x62 r3 = r0.m     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L4d
            x62 r3 = defpackage.x62.b     // Catch: java.lang.Throwable -> L4f
        L4d:
            r6 = r3
            goto L52
        L4f:
            r0 = move-exception
            r10 = r0
            goto L9b
        L52:
            hw1 r3 = r0.n     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L58
            hw1 r3 = defpackage.hw1.d     // Catch: java.lang.Throwable -> L4f
        L58:
            r5 = r3
            d40 r3 = r0.p     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L5f
            o90 r3 = defpackage.o90.a     // Catch: java.lang.Throwable -> L4f
        L5f:
            r7 = r3
            k82 r0 = r0.a     // Catch: java.lang.Throwable -> L4f
            ck r3 = r0.b()     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L76
            k92 r10 = r10.t     // Catch: java.lang.Throwable -> L4f
            m12 r10 = r10.a     // Catch: java.lang.Throwable -> L4f
            k82 r10 = r10.a     // Catch: java.lang.Throwable -> L4f
            float r4 = r10.c()     // Catch: java.lang.Throwable -> L4f
            r1.g(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4f
            goto L95
        L76:
            long r3 = defpackage.co.g     // Catch: java.lang.Throwable -> L4f
            r8 = 16
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L7f
            goto L92
        L7f:
            k92 r0 = r10.t     // Catch: java.lang.Throwable -> L4f
            long r3 = r0.b()     // Catch: java.lang.Throwable -> L4f
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L90
            k92 r10 = r10.t     // Catch: java.lang.Throwable -> L4f
            long r3 = r10.b()     // Catch: java.lang.Throwable -> L4f
            goto L92
        L90:
            long r3 = defpackage.co.b     // Catch: java.lang.Throwable -> L4f
        L92:
            r1.f(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L4f
        L95:
            if (r11 == 0) goto L9a
            r2.p()
        L9a:
            return
        L9b:
            if (r11 == 0) goto La0
            r2.p()
        La0:
            throw r10
        La1:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache="
            r11.<init>(r0)
            ce1 r0 = r10.A
            r11.append(r0)
            java.lang.String r0 = ", textSubstitution="
            r11.append(r0)
            i92 r10 = r10.C
            r11.append(r10)
            r10 = 41
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            defpackage.nl0.b(r10)
            defpackage.se.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j92.f0(cr0):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r2 != null) goto L12;
     */
    @Override // defpackage.rq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k0(defpackage.ty0 r1, defpackage.e01 r2, int r3) {
        /*
            r0 = this;
            i92 r2 = r0.C
            if (r2 == 0) goto L10
            boolean r3 = r2.c
            if (r3 == 0) goto L9
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto L10
            ce1 r2 = r2.d
            if (r2 != 0) goto L14
        L10:
            ce1 r2 = r0.L0()
        L14:
            r2.d(r1)
            jq0 r0 = r1.getLayoutDirection()
            be1 r0 = r2.e(r0)
            float r0 = r0.b()
            int r0 = defpackage.xq1.h(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j92.k0(ty0, e01, int):int");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [h92] */
    @Override // defpackage.pu1
    public final void u0(av1 av1Var) {
        h92 h92Var = this.B;
        h92 h92Var2 = h92Var;
        if (h92Var == null) {
            final int i = 0;
            ?? r0 = new oe0(this) { // from class: h92
                public final /* synthetic */ j92 f;

                {
                    this.f = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x011e  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0125  */
                @Override // defpackage.oe0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r31) {
                    /*
                        Method dump skipped, instructions count: 308
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.h92.invoke(java.lang.Object):java.lang.Object");
                }
            };
            this.B = r0;
            h92Var2 = r0;
        }
        rc rcVar = new rc(this.s);
        ep0[] ep0VarArr = xu1.a;
        av1Var.a(vu1.B, xn.E(rcVar));
        i92 i92Var = this.C;
        if (i92Var != null) {
            boolean z = i92Var.c;
            zu1 zu1Var = vu1.D;
            ep0[] ep0VarArr2 = xu1.a;
            ep0 ep0Var = ep0VarArr2[17];
            av1Var.a(zu1Var, Boolean.valueOf(z));
            rc rcVar2 = new rc(i92Var.b);
            zu1 zu1Var2 = vu1.C;
            ep0 ep0Var2 = ep0VarArr2[16];
            av1Var.a(zu1Var2, rcVar2);
        }
        final int i2 = 1;
        av1Var.a(lu1.l, new s0(null, new oe0(this) { // from class: h92
            public final /* synthetic */ j92 f;

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
                    Method dump skipped, instructions count: 308
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.h92.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        final int i3 = 2;
        av1Var.a(lu1.m, new s0(null, new oe0(this) { // from class: h92
            public final /* synthetic */ j92 f;

            {
                this.f = this;
            }

            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                */
            @Override // defpackage.oe0
            public final java.lang.Object invoke(java.lang.Object r31) {
                /*
                    Method dump skipped, instructions count: 308
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.h92.invoke(java.lang.Object):java.lang.Object");
            }
        }));
        av1Var.a(lu1.n, new s0(null, new vm1(this, 15)));
        xu1.a(av1Var, h92Var2);
    }
}
