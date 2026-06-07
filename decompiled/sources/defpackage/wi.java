package defpackage;

import android.text.Layout;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class wi implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ wi(long j, float[] fArr, ul1 ul1Var, tl1 tl1Var) {
        this.e = 1;
        this.f = j;
        this.g = fArr;
        this.h = ul1Var;
        this.i = tl1Var;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int f;
        long j;
        boolean z;
        boolean z2;
        float a;
        float a2;
        ld ldVar;
        int i = this.e;
        od2 od2Var = od2.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                pl1 pl1Var = (pl1) obj4;
                wl1 wl1Var = (wl1) obj3;
                long j2 = this.f;
                ni niVar = (ni) obj2;
                cr0 cr0Var = (cr0) obj;
                cr0Var.b();
                float f2 = pl1Var.a;
                float f3 = pl1Var.b;
                vl vlVar = cr0Var.e;
                ((rg2) vlVar.f.f).B(f2, f3);
                try {
                    c40.w(cr0Var, (t7) wl1Var.e, j2, 0L, 0.0f, niVar, 0, 890);
                    return od2Var;
                } finally {
                    ((rg2) vlVar.f.f).B(-f2, -f3);
                }
            case 1:
                float[] fArr = (float[]) obj4;
                ul1 ul1Var = (ul1) obj3;
                tl1 tl1Var = (tl1) obj2;
                zd1 zd1Var = (zd1) obj;
                int i2 = zd1Var.b;
                i8 i8Var = zd1Var.a;
                int i3 = zd1Var.c;
                long j3 = this.f;
                if (i2 > d92.f(j3)) {
                    f = zd1Var.b;
                } else {
                    f = d92.f(j3);
                }
                if (i3 >= d92.e(j3)) {
                    i3 = d92.e(j3);
                }
                long a3 = fr1.a(zd1Var.d(f), zd1Var.d(i3));
                int i4 = ul1Var.e;
                u82 u82Var = i8Var.d;
                int f4 = d92.f(a3);
                int e = d92.e(a3);
                Layout layout = u82Var.f;
                int length = layout.getText().length();
                if (f4 < 0) {
                    ll0.a("startOffset must be > 0");
                }
                if (f4 >= length) {
                    ll0.a("startOffset must be less than text length");
                }
                if (e <= f4) {
                    ll0.a("endOffset must be greater than startOffset");
                }
                if (e > length) {
                    ll0.a("endOffset must be smaller or equal to text length");
                }
                if (fArr.length - i4 < (e - f4) * 4) {
                    ll0.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(f4);
                int lineForOffset2 = layout.getLineForOffset(e - 1);
                fi0 fi0Var = new fi0(u82Var);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int f5 = u82Var.f(lineForOffset);
                        int max = Math.max(f4, lineStart);
                        int min = Math.min(e, f5);
                        float g = u82Var.g(lineForOffset);
                        float e2 = u82Var.e(lineForOffset);
                        j = a3;
                        int i5 = i4;
                        boolean z3 = false;
                        if (layout.getParagraphDirection(lineForOffset) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        while (max < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(max);
                            if (z && !isRtlCharAt) {
                                a = fi0Var.a(max, z3, z3, true);
                                z2 = z;
                                a2 = fi0Var.a(max + 1, true, true, true);
                            } else {
                                if (z && isRtlCharAt) {
                                    z3 = false;
                                    float a4 = fi0Var.a(max, false, false, false);
                                    z2 = z;
                                    a = fi0Var.a(max + 1, true, true, false);
                                    a2 = a4;
                                } else {
                                    z2 = z;
                                    z3 = false;
                                    if (!z2 && isRtlCharAt) {
                                        a2 = fi0Var.a(max, false, false, true);
                                        a = fi0Var.a(max + 1, true, true, true);
                                    } else {
                                        a = fi0Var.a(max, false, false, false);
                                        a2 = fi0Var.a(max + 1, true, true, false);
                                    }
                                }
                                fArr[i5] = a;
                                fArr[i5 + 1] = g;
                                fArr[i5 + 2] = a2;
                                fArr[i5 + 3] = e2;
                                i5 += 4;
                                max++;
                                z = z2;
                            }
                            z3 = false;
                            fArr[i5] = a;
                            fArr[i5 + 1] = g;
                            fArr[i5 + 2] = a2;
                            fArr[i5 + 3] = e2;
                            i5 += 4;
                            max++;
                            z = z2;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            a3 = j;
                            i4 = i5;
                        }
                    }
                } else {
                    j = a3;
                }
                int d = (d92.d(j) * 4) + ul1Var.e;
                for (int i6 = ul1Var.e; i6 < d; i6 += 4) {
                    int i7 = i6 + 1;
                    float f6 = fArr[i7];
                    float f7 = tl1Var.e;
                    fArr[i7] = f6 + f7;
                    int i8 = i6 + 3;
                    fArr[i8] = fArr[i8] + f7;
                }
                ul1Var.e = d;
                tl1Var.e = i8Var.b() + tl1Var.e;
                return od2Var;
            default:
                long j4 = this.f;
                n8 n8Var = (n8) obj2;
                c40 c40Var = (c40) obj;
                float invoke = ((ia0) obj4).invoke();
                float max2 = (Math.max(Math.min(1.0f, invoke) - 0.4f, 0.0f) * 5.0f) / 3.0f;
                float o = go.o(Math.abs(invoke) - 1.0f, 0.0f, 2.0f);
                float pow = (((0.4f * max2) - 0.25f) + (o - (((float) Math.pow(o, 2.0d)) / 4.0f))) * 0.5f;
                float f8 = pow * 360.0f;
                float f9 = ((0.8f * max2) + pow) * 360.0f;
                ua uaVar = new ua(pow, f8, f9, Math.min(1.0f, max2));
                float floatValue = ((Number) ((o22) obj3).getValue()).floatValue();
                long l0 = c40Var.l0();
                ld b0 = c40Var.b0();
                long k = b0.k();
                b0.h().h();
                try {
                    ((rg2) b0.f).y(l0, pow);
                    float W = (c40Var.W(2.5f) / 2.0f) + c40Var.W(5.5f);
                    long p = yq1.p(c40Var.d());
                    int i9 = (int) (p >> 32);
                    int i10 = (int) (p & 4294967295L);
                    pl1 pl1Var2 = new pl1(Float.intBitsToFloat(i9) - W, Float.intBitsToFloat(i10) - W, Float.intBitsToFloat(i9) + W, Float.intBitsToFloat(i10) + W);
                    ldVar = b0;
                    try {
                        c40.B(c40Var, j4, f8, f9 - f8, pl1Var2.d(), pl1Var2.c(), floatValue, new q32(c40Var.W(2.5f), 0.0f, 0, 0, 26), 768);
                        jk1.c(c40Var, n8Var, pl1Var2, j4, floatValue, uaVar);
                        l90.v(ldVar, k);
                        return od2Var;
                    } catch (Throwable th) {
                        th = th;
                        l90.v(ldVar, k);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    ldVar = b0;
                }
        }
    }

    public /* synthetic */ wi(Object obj, Object obj2, long j, Object obj3, int i) {
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.f = j;
        this.i = obj3;
    }
}
