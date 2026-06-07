package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class af2 {
    public final boolean a;
    public final ze2 b;
    public final int c;
    public final dw[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public af2(boolean z, ze2 ze2Var) {
        int i;
        this.a = z;
        this.b = ze2Var;
        if (z && ze2Var.equals(ze2.e)) {
            se.p("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int ordinal = ze2Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 2;
            } else {
                se.m();
                throw null;
            }
        } else {
            i = 3;
        }
        this.c = i;
        this.d = new dw[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [dw, java.lang.Object] */
    public final void a(long j, float f) {
        int i = (this.e + 1) % 20;
        this.e = i;
        dw[] dwVarArr = this.d;
        dw dwVar = dwVarArr[i];
        if (dwVar == 0) {
            ?? obj = new Object();
            obj.a = j;
            obj.b = f;
            dwVarArr[i] = obj;
            return;
        }
        dwVar.a = j;
        dwVar.b = f;
    }

    public final float b(float f) {
        ze2 ze2Var;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float f4;
        float f5;
        int i2;
        float f6 = 0.0f;
        if (f <= 0.0f) {
            kl0.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i3 = this.e;
        dw[] dwVarArr = this.d;
        dw dwVar = dwVarArr[i3];
        if (dwVar == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i4 = 0;
            dw dwVar2 = dwVar;
            while (true) {
                dw dwVar3 = dwVarArr[i3];
                boolean z2 = this.a;
                ze2Var = this.b;
                fArr = this.f;
                fArr2 = this.g;
                if (dwVar3 == null) {
                    f2 = f6;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = dwVar.a;
                f2 = f6;
                int i5 = i3;
                long j2 = dwVar3.a;
                float f7 = (float) (j - j2);
                z = z2;
                i = 1;
                float abs = (float) Math.abs(j2 - dwVar2.a);
                if (ze2Var != ze2.e && !z) {
                    dwVar2 = dwVar;
                } else {
                    dwVar2 = dwVar3;
                }
                if (f7 > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i4] = dwVar3.b;
                fArr2[i4] = -f7;
                if (i5 == 0) {
                    i2 = 20;
                } else {
                    i2 = i5;
                }
                i3 = i2 - 1;
                i4++;
                if (i4 >= 20) {
                    break;
                }
                f6 = f2;
            }
            if (i4 >= this.c) {
                int ordinal = ze2Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal == i) {
                        int i6 = i4 - i;
                        float f8 = fArr2[i6];
                        int i7 = i6;
                        float f9 = f2;
                        while (i7 > 0) {
                            int i8 = i7 - 1;
                            float f10 = fArr2[i8];
                            if (f8 != f10) {
                                if (z) {
                                    f5 = -fArr[i8];
                                } else {
                                    f5 = fArr[i7] - fArr[i8];
                                }
                                float f11 = f5 / (f8 - f10);
                                f9 += Math.abs(f11) * (f11 - (Math.signum(f9) * ((float) Math.sqrt(Math.abs(f9) * 2.0f))));
                                if (i7 == i6) {
                                    f9 *= 0.5f;
                                }
                            }
                            i7--;
                            f8 = f10;
                        }
                        f4 = Math.signum(f9) * ((float) Math.sqrt(Math.abs(f9) * 2.0f));
                    } else {
                        se.m();
                        return f2;
                    }
                } else {
                    try {
                        float[] fArr3 = this.h;
                        yq1.x(fArr2, fArr, i4, fArr3);
                        f4 = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        f4 = f2;
                    }
                }
                f3 = f4 * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 > f2) {
            if (f3 > f) {
                f3 = f;
            }
        } else {
            float f12 = -f;
            if (f3 < f12) {
                return f12;
            }
        }
        return f3;
    }

    public /* synthetic */ af2() {
        this(false, ze2.e);
    }

    public af2(int i) {
        this(true, ze2.f);
    }
}
