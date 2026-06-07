package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jp1 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;
    public final float h;
    public long i;

    public jp1(long j, long j2, long j3, tu tuVar) {
        float f;
        this.a = j;
        this.b = j2;
        this.c = j3;
        long C = lo.C(lo.S(j, j2));
        this.d = C;
        long C2 = lo.C(lo.S(j3, j2));
        this.e = C2;
        float f2 = tuVar.a;
        this.f = f2;
        this.g = 0.0f;
        float s = lo.s(C, C2);
        float f3 = be2.b;
        float sqrt = (float) Math.sqrt(1.0f - (s * s));
        if (sqrt > 0.001d) {
            f = ((s + 1.0f) * f2) / sqrt;
        } else {
            f = 0.0f;
        }
        this.h = f;
        this.i = ha0.a(0.0f, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.uv b(float r15, float r16, long r17, long r19, long r21, long r23, long r25, float r27) {
        /*
            r0 = r16
            r1 = r17
            r3 = r19
            r5 = r25
            long r7 = defpackage.lo.S(r3, r1)
            long r7 = defpackage.lo.C(r7)
            long r9 = defpackage.lo.Y(r7, r15)
            r11 = 1065353216(0x3f800000, float:1.0)
            float r11 = r11 + r0
            long r9 = defpackage.lo.Y(r9, r11)
            long r1 = defpackage.lo.U(r1, r9)
            long r9 = defpackage.lo.U(r21, r23)
            r11 = 1073741824(0x40000000, float:2.0)
            long r9 = defpackage.lo.r(r9, r11)
            float r12 = defpackage.lo.G(r21)
            float r13 = defpackage.lo.G(r9)
            float r12 = defpackage.be2.c(r12, r13, r0)
            float r13 = defpackage.lo.H(r21)
            float r9 = defpackage.lo.H(r9)
            float r0 = defpackage.be2.c(r13, r9, r0)
            long r9 = defpackage.ha0.a(r12, r0)
            float r0 = defpackage.lo.G(r9)
            float r12 = defpackage.lo.G(r5)
            float r0 = r0 - r12
            float r9 = defpackage.lo.H(r9)
            float r10 = defpackage.lo.H(r5)
            float r9 = r9 - r10
            long r9 = defpackage.be2.b(r0, r9)
            r0 = r27
            long r9 = defpackage.lo.Y(r9, r0)
            long r9 = defpackage.lo.U(r5, r9)
            long r5 = defpackage.lo.S(r9, r5)
            float r0 = defpackage.lo.H(r5)
            float r0 = -r0
            float r5 = defpackage.lo.G(r5)
            long r5 = defpackage.ha0.a(r0, r5)
            float r0 = defpackage.lo.H(r5)
            float r0 = -r0
            float r5 = defpackage.lo.G(r5)
            long r5 = defpackage.ha0.a(r0, r5)
            float r0 = defpackage.lo.s(r7, r5)
            float r12 = java.lang.Math.abs(r0)
            r13 = 953267991(0x38d1b717, float:1.0E-4)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 >= 0) goto L94
        L92:
            r14 = 0
            goto Lb9
        L94:
            r15 = r13
            long r13 = defpackage.lo.S(r9, r3)
            float r5 = defpackage.lo.s(r13, r5)
            float r6 = java.lang.Math.abs(r0)
            float r12 = java.lang.Math.abs(r5)
            float r12 = r12 * r15
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 >= 0) goto Lab
            goto L92
        Lab:
            float r5 = r5 / r0
            long r5 = defpackage.lo.Y(r7, r5)
            long r3 = defpackage.lo.U(r3, r5)
            ha0 r14 = new ha0
            r14.<init>(r3)
        Lb9:
            if (r14 == 0) goto Lbe
            long r3 = r14.a
            goto Lc0
        Lbe:
            r3 = r21
        Lc0:
            long r5 = defpackage.lo.Y(r3, r11)
            long r5 = defpackage.lo.U(r1, r5)
            r0 = 1077936128(0x40400000, float:3.0)
            long r5 = defpackage.lo.r(r5, r0)
            uv r0 = new uv
            float r7 = defpackage.lo.G(r1)
            float r1 = defpackage.lo.H(r1)
            float r2 = defpackage.lo.G(r5)
            float r5 = defpackage.lo.H(r5)
            float r6 = defpackage.lo.G(r3)
            float r3 = defpackage.lo.H(r3)
            float r4 = defpackage.lo.G(r9)
            float r8 = defpackage.lo.H(r9)
            r9 = 8
            float[] r9 = new float[r9]
            r10 = 0
            r9[r10] = r7
            r7 = 1
            r9[r7] = r1
            r1 = 2
            r9[r1] = r2
            r1 = 3
            r9[r1] = r5
            r1 = 4
            r9[r1] = r6
            r1 = 5
            r9[r1] = r3
            r1 = 6
            r9[r1] = r4
            r1 = 7
            r9[r1] = r8
            r0.<init>(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp1.b(float, float, long, long, long, long, long, float):uv");
    }

    public final float a(float f) {
        float c = c();
        float f2 = this.g;
        if (f > c) {
            return f2;
        }
        float f3 = this.h;
        if (f > f3) {
            return ((f - f3) * f2) / (c() - f3);
        }
        return 0.0f;
    }

    public final float c() {
        return (1.0f + this.g) * this.h;
    }
}
