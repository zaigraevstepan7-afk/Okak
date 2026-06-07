package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xe2 implements se2 {
    public final o31 e;
    public final p31 f;
    public final int g;
    public final x40 h;
    public int[] i = re2.a;
    public float[] j;
    public mc k;
    public mc l;
    public mc m;
    public mc n;
    public float[] o;
    public float[] p;
    public rg2 q;

    public xe2(o31 o31Var, p31 p31Var, int i, x40 x40Var) {
        this.e = o31Var;
        this.f = p31Var;
        this.g = i;
        this.h = x40Var;
        float[] fArr = re2.b;
        this.j = fArr;
        this.o = fArr;
        this.p = fArr;
        this.q = re2.c;
    }

    public final int c(int i) {
        int i2;
        o31 o31Var = this.e;
        int i3 = o31Var.b;
        int i4 = 0;
        if (i3 > 0) {
            int i5 = i3 - 1;
            while (true) {
                if (i4 <= i5) {
                    i2 = (i4 + i5) >>> 1;
                    int i6 = o31Var.a[i2];
                    if (i6 < i) {
                        i4 = i2 + 1;
                    } else {
                        if (i6 <= i) {
                            break;
                        }
                        i5 = i2 - 1;
                    }
                } else {
                    i2 = -(i4 + 1);
                    break;
                }
            }
            if (i2 < -1) {
                return -(i2 + 2);
            }
            return i2;
        }
        se.u("");
        return 0;
    }

    public final float d(int i, int i2, boolean z) {
        x40 x40Var;
        float f;
        o31 o31Var = this.e;
        if (i >= o31Var.b - 1) {
            f = i2;
        } else {
            int c = o31Var.c(i);
            int c2 = o31Var.c(i + 1);
            if (i2 == c) {
                f = c;
            } else {
                int i3 = c2 - c;
                we2 we2Var = (we2) this.f.b(c);
                if (we2Var == null || (x40Var = we2Var.b) == null) {
                    x40Var = this.h;
                }
                float f2 = i3;
                float a = x40Var.a((i2 - c) / f2);
                if (z) {
                    return a;
                }
                return ((f2 * a) + c) / 1000.0f;
            }
        }
        return f / 1000.0f;
    }

    public final void e(mc mcVar, mc mcVar2, mc mcVar3) {
        boolean z;
        float[] fArr;
        if (this.q != re2.c) {
            z = true;
        } else {
            z = false;
        }
        mc mcVar4 = this.k;
        p31 p31Var = this.f;
        o31 o31Var = this.e;
        if (mcVar4 == null) {
            this.k = mcVar.c();
            this.l = mcVar3.c();
            int i = o31Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = o31Var.c(i2) / 1000.0f;
            }
            this.j = fArr2;
            int i3 = o31Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.i = iArr;
        }
        if (z) {
            if (this.q != re2.c && sn0.r(this.m, mcVar) && sn0.r(this.n, mcVar2)) {
                return;
            }
            this.m = mcVar;
            this.n = mcVar2;
            int b = mcVar.b() + (mcVar.b() % 2);
            this.o = new float[b];
            this.p = new float[b];
            int i5 = o31Var.b;
            float[][] fArr3 = new float[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                int c = o31Var.c(i6);
                we2 we2Var = (we2) p31Var.b(c);
                if (c == 0 && we2Var == null) {
                    fArr = new float[b];
                    for (int i7 = 0; i7 < b; i7++) {
                        fArr[i7] = mcVar.a(i7);
                    }
                } else if (c == this.g && we2Var == null) {
                    fArr = new float[b];
                    for (int i8 = 0; i8 < b; i8++) {
                        fArr[i8] = mcVar2.a(i8);
                    }
                } else {
                    we2Var.getClass();
                    mc mcVar5 = we2Var.a;
                    float[] fArr4 = new float[b];
                    for (int i9 = 0; i9 < b; i9++) {
                        fArr4[i9] = mcVar5.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.q = new rg2(this.i, this.j, fArr3);
        }
    }

    @Override // defpackage.qe2
    public final mc h(long j, mc mcVar, mc mcVar2, mc mcVar3) {
        long j2;
        long j3 = j / 1000000;
        int[] iArr = re2.a;
        long j4 = this.g;
        if (j3 < 0) {
            j3 = 0;
        }
        if (j3 > j4) {
            j2 = j4;
        } else {
            j2 = j3;
        }
        if (j2 < 0) {
            return mcVar3;
        }
        e(mcVar, mcVar2, mcVar3);
        mc mcVar4 = this.l;
        mcVar4.getClass();
        int i = 0;
        if (this.q != re2.c) {
            int i2 = (int) j2;
            float d = d(c(i2), i2, false);
            float[] fArr = this.p;
            ie[][] ieVarArr = (ie[][]) this.q.f;
            float f = ieVarArr[0][0].a;
            float f2 = ieVarArr[ieVarArr.length - 1][0].b;
            if (d < f) {
                d = f;
            }
            if (d <= f2) {
                f2 = d;
            }
            int length = fArr.length;
            boolean z = false;
            for (ie[] ieVarArr2 : ieVarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    ie ieVar = ieVarArr2[i4];
                    if (f2 <= ieVar.b) {
                        if (ieVar.p) {
                            fArr[i3] = ieVar.q;
                            fArr[i3 + 1] = ieVar.r;
                        } else {
                            ieVar.c(f2);
                            fArr[i3] = ieVar.a();
                            fArr[i3 + 1] = ieVar.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                mcVar4.e(i, fArr[i]);
                i++;
            }
        } else {
            mc p = p((j2 - 1) * 1000000, mcVar, mcVar2, mcVar3);
            mc p2 = p(j2 * 1000000, mcVar, mcVar2, mcVar3);
            int b = p.b();
            while (i < b) {
                mcVar4.e(i, (p.a(i) - p2.a(i)) * 1000.0f);
                i++;
            }
        }
        return mcVar4;
    }

    @Override // defpackage.se2
    public final int m() {
        return 0;
    }

    @Override // defpackage.se2
    public final int o() {
        return this.g;
    }

    @Override // defpackage.qe2
    public final mc p(long j, mc mcVar, mc mcVar2, mc mcVar3) {
        mc mcVar4;
        mc mcVar5;
        ie[][] ieVarArr;
        mc mcVar6 = mcVar;
        long j2 = j / 1000000;
        int[] iArr = re2.a;
        int i = this.g;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        p31 p31Var = this.f;
        we2 we2Var = (we2) p31Var.b(i2);
        if (we2Var != null) {
            return we2Var.a;
        }
        if (i2 >= i) {
            return mcVar2;
        }
        if (i2 <= 0) {
            return mcVar6;
        }
        e(mcVar6, mcVar2, mcVar3);
        mc mcVar7 = this.k;
        mcVar7.getClass();
        int i3 = 0;
        if (this.q != re2.c) {
            float d = d(c(i2), i2, false);
            float[] fArr = this.o;
            ie[][] ieVarArr2 = (ie[][]) this.q.f;
            int length = ieVarArr2.length - 1;
            float f = ieVarArr2[0][0].a;
            float f2 = ieVarArr2[length][0].b;
            int length2 = fArr.length;
            if (d >= f && d <= f2) {
                int length3 = ieVarArr2.length;
                int i4 = 0;
                boolean z = false;
                while (i4 < length3) {
                    int i5 = i3;
                    int i6 = i5;
                    while (i5 < length2 - 1) {
                        ie ieVar = ieVarArr2[i4][i6];
                        if (d <= ieVar.b) {
                            if (ieVar.p) {
                                float f3 = ieVar.a;
                                float f4 = ieVar.k;
                                float f5 = ieVar.c;
                                fArr[i5] = ((ieVar.e - f5) * (d - f3) * f4) + f5;
                                float f6 = ieVar.d;
                                fArr[i5 + 1] = ((ieVar.f - f6) * (d - f3) * f4) + f6;
                            } else {
                                ieVar.c(d);
                                fArr[i5] = (ieVar.n * ieVar.h) + ieVar.q;
                                fArr[i5 + 1] = (ieVar.o * ieVar.i) + ieVar.r;
                            }
                            z = true;
                        }
                        i5 += 2;
                        i6++;
                    }
                    if (z) {
                        break;
                    }
                    i4++;
                    i3 = 0;
                }
            } else {
                if (d > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f7 = d - f;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length2 - 1) {
                    ie ieVar2 = ieVarArr2[length][i8];
                    boolean z2 = ieVar2.p;
                    float f8 = ieVar2.r;
                    float f9 = ieVar2.q;
                    if (z2) {
                        float f10 = ieVar2.a;
                        float f11 = ieVar2.k;
                        float f12 = ieVar2.c;
                        ieVarArr = ieVarArr2;
                        fArr[i7] = (f9 * f7) + ((ieVar2.e - f12) * (f - f10) * f11) + f12;
                        float f13 = (f - f10) * f11;
                        float f14 = ieVar2.d;
                        fArr[i7 + 1] = (f8 * f7) + ((ieVar2.f - f14) * f13) + f14;
                    } else {
                        ieVarArr = ieVarArr2;
                        ieVar2.c(f);
                        fArr[i7] = (ieVar2.a() * f7) + (ieVar2.n * ieVar2.h) + f9;
                        fArr[i7 + 1] = (ieVar2.b() * f7) + (ieVar2.o * ieVar2.i) + f8;
                    }
                    i7 += 2;
                    i8++;
                    ieVarArr2 = ieVarArr;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                mcVar7.e(i9, fArr[i9]);
            }
        } else {
            int c = c(i2);
            float d2 = d(c, i2, true);
            o31 o31Var = this.e;
            we2 we2Var2 = (we2) p31Var.b(o31Var.c(c));
            if (we2Var2 != null && (mcVar5 = we2Var2.a) != null) {
                mcVar6 = mcVar5;
            }
            we2 we2Var3 = (we2) p31Var.b(o31Var.c(c + 1));
            if (we2Var3 == null || (mcVar4 = we2Var3.a) == null) {
                mcVar4 = mcVar2;
            }
            int b = mcVar7.b();
            for (int i10 = 0; i10 < b; i10++) {
                mcVar7.e(i10, (mcVar4.a(i10) * d2) + ((1.0f - d2) * mcVar6.a(i10)));
            }
        }
        return mcVar7;
    }
}
