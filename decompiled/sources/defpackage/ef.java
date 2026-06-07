package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ef extends d21 implements rq0 {
    public float s;
    public boolean t;

    public final long L0(long j, boolean z) {
        int round;
        int g = us.g(j);
        if (g != Integer.MAX_VALUE && (round = Math.round(g * this.s)) > 0) {
            if (!z || fc2.D(j, round, g)) {
                return (round << 32) | (g & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long M0(long j, boolean z) {
        int round;
        int h = us.h(j);
        if (h != Integer.MAX_VALUE && (round = Math.round(h / this.s)) > 0) {
            if (!z || fc2.D(j, h, round)) {
                return (h << 32) | (round & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long N0(long j, boolean z) {
        int i = us.i(j);
        int round = Math.round(i * this.s);
        if (round > 0) {
            if (!z || fc2.D(j, round, i)) {
                return (round << 32) | (i & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    public final long O0(long j, boolean z) {
        int j2 = us.j(j);
        int round = Math.round(j2 / this.s);
        if (round > 0) {
            if (!z || fc2.D(j, j2, round)) {
                return (j2 << 32) | (round & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.rq0
    public final int Q(ty0 ty0Var, e01 e01Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.s);
        }
        return e01Var.c(i);
    }

    @Override // defpackage.rq0
    public final int a0(ty0 ty0Var, e01 e01Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i / this.s);
        }
        return e01Var.Y(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (defpackage.en0.a(r5, 0) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00bf, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
    
        if (defpackage.en0.a(r5, 0) == false) goto L53;
     */
    @Override // defpackage.rq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.k01 b(defpackage.l01 r8, defpackage.e01 r9, long r10) {
        /*
            r7 = this;
            boolean r0 = r7.t
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L67
            long r5 = r7.M0(r10, r2)
            boolean r0 = defpackage.en0.a(r5, r3)
            if (r0 != 0) goto L14
            goto Lc0
        L14:
            long r5 = r7.L0(r10, r2)
            boolean r0 = defpackage.en0.a(r5, r3)
            if (r0 != 0) goto L20
            goto Lc0
        L20:
            long r5 = r7.O0(r10, r2)
            boolean r0 = defpackage.en0.a(r5, r3)
            if (r0 != 0) goto L2c
            goto Lc0
        L2c:
            long r5 = r7.N0(r10, r2)
            boolean r0 = defpackage.en0.a(r5, r3)
            if (r0 != 0) goto L38
            goto Lc0
        L38:
            long r5 = r7.M0(r10, r1)
            boolean r0 = defpackage.en0.a(r5, r3)
            if (r0 != 0) goto L44
            goto Lc0
        L44:
            long r5 = r7.L0(r10, r1)
            boolean r0 = defpackage.en0.a(r5, r3)
            if (r0 != 0) goto L50
            goto Lc0
        L50:
            long r5 = r7.O0(r10, r1)
            boolean r0 = defpackage.en0.a(r5, r3)
            if (r0 != 0) goto L5c
            goto Lc0
        L5c:
            long r5 = r7.N0(r10, r1)
            boolean r7 = defpackage.en0.a(r5, r3)
            if (r7 != 0) goto Lbf
            goto Lc0
        L67:
            long r5 = r7.L0(r10, r2)
            boolean r0 = defpackage.en0.a(r5, r3)
            if (r0 != 0) goto L72
            goto Lc0
        L72:
            long r5 = r7.M0(r10, r2)
            boolean r0 = defpackage.en0.a(r5, r3)
            if (r0 != 0) goto L7d
            goto Lc0
        L7d:
            long r5 = r7.N0(r10, r2)
            boolean r0 = defpackage.en0.a(r5, r3)
            if (r0 != 0) goto L88
            goto Lc0
        L88:
            long r5 = r7.O0(r10, r2)
            boolean r0 = defpackage.en0.a(r5, r3)
            if (r0 != 0) goto L93
            goto Lc0
        L93:
            long r5 = r7.L0(r10, r1)
            boolean r0 = defpackage.en0.a(r5, r3)
            if (r0 != 0) goto L9e
            goto Lc0
        L9e:
            long r5 = r7.M0(r10, r1)
            boolean r0 = defpackage.en0.a(r5, r3)
            if (r0 != 0) goto La9
            goto Lc0
        La9:
            long r5 = r7.N0(r10, r1)
            boolean r0 = defpackage.en0.a(r5, r3)
            if (r0 != 0) goto Lb4
            goto Lc0
        Lb4:
            long r5 = r7.O0(r10, r1)
            boolean r7 = defpackage.en0.a(r5, r3)
            if (r7 != 0) goto Lbf
            goto Lc0
        Lbf:
            r5 = r3
        Lc0:
            boolean r7 = defpackage.en0.a(r5, r3)
            if (r7 != 0) goto Le7
            r7 = 32
            long r10 = r5 >> r7
            int r7 = (int) r10
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r5
            int r10 = (int) r10
            if (r7 < 0) goto Ld6
            r11 = r2
            goto Ld7
        Ld6:
            r11 = r1
        Ld7:
            if (r10 < 0) goto Lda
            goto Ldb
        Lda:
            r2 = r1
        Ldb:
            r11 = r11 & r2
            if (r11 != 0) goto Le3
            java.lang.String r11 = "width and height must be >= 0"
            defpackage.ml0.a(r11)
        Le3:
            long r10 = defpackage.vs.h(r7, r7, r10, r10)
        Le7:
            ig1 r7 = r9.x(r10)
            int r9 = r7.e
            int r10 = r7.f
            df r11 = new df
            r11.<init>(r7, r1)
            m60 r7 = defpackage.m60.e
            k01 r7 = r8.s0(r9, r10, r7, r11)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef.b(l01, e01, long):k01");
    }

    @Override // defpackage.rq0
    public final int e(ty0 ty0Var, e01 e01Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.s);
        }
        return e01Var.s(i);
    }

    @Override // defpackage.rq0
    public final int k0(ty0 ty0Var, e01 e01Var, int i) {
        if (i != Integer.MAX_VALUE) {
            return Math.round(i * this.s);
        }
        return e01Var.n(i);
    }
}
