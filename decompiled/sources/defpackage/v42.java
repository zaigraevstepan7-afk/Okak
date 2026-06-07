package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class v42 implements c00, vt {
    public final /* synthetic */ w42 e;
    public final pl f;
    public pl g;
    public kh1 h = kh1.f;
    public final j60 i = j60.e;
    public final /* synthetic */ w42 j;

    public v42(w42 w42Var, pl plVar) {
        this.j = w42Var;
        this.e = w42Var;
        this.f = plVar;
    }

    @Override // defpackage.c00
    public final long G(float f) {
        return this.e.G(f);
    }

    @Override // defpackage.c00
    public final float K(int i) {
        return this.e.K(i);
    }

    @Override // defpackage.c00
    public final float M(float f) {
        return f / this.e.a();
    }

    @Override // defpackage.c00
    public final float P() {
        return this.e.P();
    }

    @Override // defpackage.c00
    public final float W(float f) {
        return this.e.a() * f;
    }

    @Override // defpackage.c00
    public final float a() {
        return this.e.a();
    }

    public final Object b(kh1 kh1Var, eh ehVar) {
        pl plVar = new pl(1, go.F(ehVar));
        plVar.r();
        this.h = kh1Var;
        this.g = plVar;
        return plVar.q();
    }

    public final long c() {
        w42 w42Var = this.j;
        long n0 = w42Var.n0(hp.M(w42Var).E.d());
        long j = w42Var.B;
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (n0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (n0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    @Override // defpackage.c00
    public final int d0(long j) {
        return this.e.d0(j);
    }

    @Override // defpackage.vt
    public final xu getContext() {
        return this.i;
    }

    public final hg2 i() {
        return hp.M(this.j).E;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(long r8, defpackage.se0 r10, defpackage.eh r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.t42
            if (r0 == 0) goto L13
            r0 = r11
            t42 r0 = (defpackage.t42) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            t42 r0 = new t42
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.f
            int r1 = r0.h
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            i22 r7 = r0.e
            defpackage.io.K(r11)     // Catch: java.lang.Throwable -> L28
            goto L68
        L28:
            r8 = move-exception
            goto L72
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r7)
            return r2
        L30:
            defpackage.io.K(r11)
            r4 = 0
            int r11 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r11 > 0) goto L4a
            pl r11 = r7.g
            if (r11 == 0) goto L4a
            lh1 r1 = new lh1
            r1.<init>(r8)
            fo1 r4 = new fo1
            r4.<init>(r1)
            r11.resumeWith(r4)
        L4a:
            w42 r11 = r7.j
            gv r11 = r11.z0()
            hu1 r1 = new hu1
            r1.<init>(r8, r7, r2)
            r8 = 3
            i22 r8 = defpackage.rx.C(r11, r2, r1, r8)
            r0.e = r8     // Catch: java.lang.Throwable -> L6e
            r0.h = r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r11 = r10.invoke(r7, r0)     // Catch: java.lang.Throwable -> L6e
            hv r7 = defpackage.hv.e
            if (r11 != r7) goto L67
            return r7
        L67:
            r7 = r8
        L68:
            ml r8 = defpackage.ml.f
            r7.c(r8)
            return r11
        L6e:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L72:
            ml r9 = defpackage.ml.f
            r7.c(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v42.j(long, se0, eh):java.lang.Object");
    }

    @Override // defpackage.c00
    public final int j0(float f) {
        return this.e.j0(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(long r5, defpackage.se0 r7, defpackage.eh r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.u42
            if (r0 == 0) goto L13
            r0 = r8
            u42 r0 = (defpackage.u42) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            u42 r0 = new u42
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.e
            int r1 = r0.g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.io.K(r8)     // Catch: defpackage.lh1 -> L3b
            return r8
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            return r2
        L2c:
            defpackage.io.K(r8)
            r0.g = r3     // Catch: defpackage.lh1 -> L3b
            java.lang.Object r4 = r4.j(r5, r7, r0)     // Catch: defpackage.lh1 -> L3b
            hv r5 = defpackage.hv.e
            if (r4 != r5) goto L3a
            return r5
        L3a:
            return r4
        L3b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v42.k(long, se0, eh):java.lang.Object");
    }

    @Override // defpackage.c00
    public final long n0(long j) {
        return this.e.n0(j);
    }

    @Override // defpackage.c00
    public final long p(float f) {
        return this.e.p(f);
    }

    @Override // defpackage.c00
    public final long q(long j) {
        return this.e.q(j);
    }

    @Override // defpackage.c00
    public final float r0(long j) {
        return this.e.r0(j);
    }

    @Override // defpackage.vt
    public final void resumeWith(Object obj) {
        w42 w42Var = this.j;
        synchronized (w42Var.y) {
            w42Var.x.j(this);
        }
        this.f.resumeWith(obj);
    }

    @Override // defpackage.c00
    public final float v(long j) {
        return this.e.v(j);
    }
}
