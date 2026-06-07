package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class po1 extends po {
    public static final y61 r = new y61(11);
    public final jh2 d;
    public final float e;
    public final float f;
    public final bb2 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final b20 k;
    public final oo1 l;
    public final lo1 m;
    public final b20 n;
    public final oo1 o;
    public final lo1 p;
    public final boolean q;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01e0, code lost:
    
        if ((((r25 - r12) * r3) - ((r1 - r15) * r10)) >= 0.0f) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public po1(java.lang.String r36, float[] r37, defpackage.jh2 r38, float[] r39, defpackage.b20 r40, defpackage.b20 r41, float r42, float r43, defpackage.bb2 r44, int r45) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po1.<init>(java.lang.String, float[], jh2, float[], b20, b20, float, float, bb2, int):void");
    }

    @Override // defpackage.po
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.po
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.po
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.po
    public final long d(float f, float f2, float f3) {
        double d = f;
        lo1 lo1Var = this.p;
        float b = (float) lo1Var.b(d);
        float b2 = (float) lo1Var.b(f2);
        float b3 = (float) lo1Var.b(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * b3) + (fArr[3] * b2) + (fArr[0] * b);
        float f5 = (fArr[7] * b3) + (fArr[4] * b2) + (fArr[1] * b);
        return (Float.floatToRawIntBits(f4) << 32) | (4294967295L & Float.floatToRawIntBits(f5));
    }

    @Override // defpackage.po
    public final float e(float f, float f2, float f3) {
        double d = f;
        lo1 lo1Var = this.p;
        float b = (float) lo1Var.b(d);
        float b2 = (float) lo1Var.b(f2);
        float b3 = (float) lo1Var.b(f3);
        float[] fArr = this.i;
        return (fArr[8] * b3) + (fArr[5] * b2) + (fArr[2] * b);
    }

    @Override // defpackage.po
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || po1.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        po1 po1Var = (po1) obj;
        if (Float.compare(po1Var.e, this.e) != 0 || Float.compare(po1Var.f, this.f) != 0 || !sn0.r(this.d, po1Var.d) || !Arrays.equals(this.h, po1Var.h)) {
            return false;
        }
        bb2 bb2Var = po1Var.g;
        bb2 bb2Var2 = this.g;
        if (bb2Var2 != null) {
            return sn0.r(bb2Var2, bb2Var);
        }
        if (bb2Var == null) {
            return true;
        }
        if (!sn0.r(this.k, po1Var.k)) {
            return false;
        }
        return sn0.r(this.n, po1Var.n);
    }

    @Override // defpackage.po
    public final long f(float f, float f2, float f3, float f4, po poVar) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        lo1 lo1Var = this.m;
        return go.a((float) lo1Var.b(f5), (float) lo1Var.b(f6), (float) lo1Var.b(f7), f4, poVar);
    }

    @Override // defpackage.po
    public final int hashCode() {
        int floatToIntBits;
        int floatToIntBits2;
        int hashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int i = 0;
        if (f == 0.0f) {
            floatToIntBits = 0;
        } else {
            floatToIntBits = Float.floatToIntBits(f);
        }
        int i2 = (hashCode + floatToIntBits) * 31;
        float f2 = this.f;
        if (f2 == 0.0f) {
            floatToIntBits2 = 0;
        } else {
            floatToIntBits2 = Float.floatToIntBits(f2);
        }
        int i3 = (i2 + floatToIntBits2) * 31;
        bb2 bb2Var = this.g;
        if (bb2Var != null) {
            i = bb2Var.hashCode();
        }
        int i4 = i3 + i;
        if (bb2Var == null) {
            return this.n.hashCode() + ((this.k.hashCode() + (i4 * 31)) * 31);
        }
        return i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public po1(java.lang.String r19, float[] r20, defpackage.jh2 r21, final defpackage.bb2 r22, int r23) {
        /*
            r18 = this;
            r9 = r22
            double r0 = r9.a
            r2 = -4609434218613702656(0xc008000000000000, double:-3.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 != 0) goto Le
            r4 = r6
            goto Lf
        Le:
            r4 = r5
        Lf:
            double r7 = r9.g
            double r10 = r9.f
            r12 = -4611686018427387904(0xc000000000000000, double:-2.0)
            r14 = 0
            if (r4 == 0) goto L22
            no1 r4 = new no1
            r16 = r2
            r2 = 4
            r4.<init>()
            goto L44
        L22:
            r16 = r2
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 != 0) goto L2f
            no1 r4 = new no1
            r2 = 5
            r4.<init>()
            goto L44
        L2f:
            int r2 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r2 != 0) goto L3e
            int r2 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r2 != 0) goto L3e
            no1 r4 = new no1
            r2 = 6
            r4.<init>()
            goto L44
        L3e:
            no1 r4 = new no1
            r2 = 7
            r4.<init>()
        L44:
            int r2 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r2 != 0) goto L4f
            no1 r0 = new no1
            r0.<init>()
        L4d:
            r6 = r0
            goto L6f
        L4f:
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 != 0) goto L59
            no1 r0 = new no1
            r0.<init>()
            goto L4d
        L59:
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 != 0) goto L68
            int r0 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r0 != 0) goto L68
            no1 r0 = new no1
            r1 = 2
            r0.<init>()
            goto L4d
        L68:
            no1 r0 = new no1
            r1 = 3
            r0.<init>()
            goto L4d
        L6f:
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r5 = r4
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r10 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po1.<init>(java.lang.String, float[], jh2, bb2, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public po1(java.lang.String r18, float[] r19, defpackage.jh2 r20, final double r21, float r23, float r24, int r25) {
        /*
            r17 = this;
            r1 = r21
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            y61 r3 = defpackage.po1.r
            if (r0 != 0) goto Lc
            r11 = r3
            goto L13
        Lc:
            mo1 r4 = new mo1
            r5 = 0
            r4.<init>()
            r11 = r4
        L13:
            if (r0 != 0) goto L17
        L15:
            r12 = r3
            goto L1e
        L17:
            mo1 r3 = new mo1
            r0 = 1
            r3.<init>()
            goto L15
        L1e:
            bb2 r15 = new bb2
            r7 = 0
            r9 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r0 = r15
            r0.<init>(r1, r3, r5, r7, r9)
            r10 = 0
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r13 = r23
            r14 = r24
            r16 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po1.<init>(java.lang.String, float[], jh2, double, float, float, int):void");
    }
}
