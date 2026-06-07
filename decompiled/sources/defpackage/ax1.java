package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ax1 implements l71 {
    public final /* synthetic */ ex1 e;
    public final /* synthetic */ z90 f;

    public ax1(ex1 ex1Var, v11 v11Var) {
        this.e = ex1Var;
        this.f = v11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.l71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(long r7, defpackage.vt r9) {
        /*
            r6 = this;
            ex1 r0 = r6.e
            n4 r1 = r0.d
            boolean r2 = r9 instanceof defpackage.zw1
            if (r2 == 0) goto L17
            r2 = r9
            zw1 r2 = (defpackage.zw1) r2
            int r3 = r2.h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.h = r3
            goto L1e
        L17:
            zw1 r2 = new zw1
            wt r9 = (defpackage.wt) r9
            r2.<init>(r6, r9)
        L1e:
            java.lang.Object r9 = r2.f
            int r3 = r2.h
            r4 = 1
            if (r3 == 0) goto L34
            if (r3 != r4) goto L2d
            long r7 = r2.e
            defpackage.io.K(r9)
            goto L61
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r6)
            r6 = 0
            return r6
        L34:
            defpackage.io.K(r9)
            float r9 = defpackage.ye2.c(r7)
            float r3 = r1.f()
            cy r1 = r1.c()
            float r1 = r1.e()
            r5 = 0
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 >= 0) goto L5f
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L5f
            r2.e = r7
            r2.h = r4
            z90 r6 = r6.f
            java.lang.Object r6 = r0.a(r6, r9, r2)
            hv r9 = defpackage.hv.e
            if (r6 != r9) goto L61
            return r9
        L5f:
            r7 = 0
        L61:
            ye2 r6 = new ye2
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax1.D(long, vt):java.lang.Object");
    }

    @Override // defpackage.l71
    public final long H(int i, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat < 0.0f && i == 1) {
            n4 n4Var = this.e.d;
            float e = n4Var.e(intBitsToFloat);
            float f = e - n4Var.f();
            n4Var.n.a(e, 0.0f);
            return a(f);
        }
        return 0L;
    }

    public final long a(float f) {
        return (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    @Override // defpackage.l71
    public final long o0(long j, long j2, int i) {
        if (i == 1) {
            n4 n4Var = this.e.d;
            float e = n4Var.e(Float.intBitsToFloat((int) (j2 & 4294967295L)));
            float f = e - n4Var.f();
            n4Var.n.a(e, 0.0f);
            return a(f);
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.l71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t0(long r5, long r7, defpackage.vt r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.yw1
            if (r0 == 0) goto L13
            r0 = r9
            yw1 r0 = (defpackage.yw1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L1a
        L13:
            yw1 r0 = new yw1
            wt r9 = (defpackage.wt) r9
            r0.<init>(r4, r9)
        L1a:
            java.lang.Object r9 = r0.f
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            long r5 = r0.e
            defpackage.io.K(r9)
            goto L48
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            r4 = 0
            return r4
        L30:
            defpackage.io.K(r9)
            float r7 = defpackage.ye2.c(r7)
            r0.e = r5
            r0.h = r2
            ex1 r8 = r4.e
            z90 r4 = r4.f
            java.lang.Object r9 = r8.a(r4, r7, r0)
            hv r4 = defpackage.hv.e
            if (r9 != r4) goto L48
            return r4
        L48:
            java.lang.Number r9 = (java.lang.Number) r9
            float r4 = r9.floatValue()
            float r5 = defpackage.ye2.b(r5)
            long r4 = defpackage.xq1.c(r5, r4)
            ye2 r6 = new ye2
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax1.t0(long, long, vt):java.lang.Object");
    }
}
