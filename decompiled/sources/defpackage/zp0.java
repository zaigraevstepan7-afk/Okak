package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zp0 implements t40 {
    public final yp0 a;

    public zp0(yp0 yp0Var) {
        this.a = yp0Var;
    }

    @Override // defpackage.t40, defpackage.gc
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final xe2 a(ec2 ec2Var) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        yp0 yp0Var = this.a;
        p31 p31Var = yp0Var.b;
        o31 o31Var = new o31(p31Var.e + 2);
        p31 p31Var2 = new p31(p31Var.e);
        int[] iArr3 = p31Var.b;
        Object[] objArr3 = p31Var.c;
        long[] jArr = p31Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            xp0 xp0Var = (xp0) objArr3[i6];
                            o31Var.a(i7);
                            i = i3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            p31Var2.i(i7, new we2((mc) ec2Var.a.invoke(xp0Var.a), xp0Var.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        iArr3 = iArr2;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!p31Var.a(0)) {
            int i8 = o31Var.b;
            if (i8 >= 0) {
                o31Var.b(i8 + 1);
                int[] iArr4 = o31Var.a;
                int i9 = o31Var.b;
                if (i9 != 0) {
                    bf.B(iArr4, iArr4, 1, 0, i9);
                }
                iArr4[0] = 0;
                o31Var.b++;
            } else {
                se.u("Index must be between 0 and size");
                return null;
            }
        }
        if (!p31Var.a(yp0Var.a)) {
            o31Var.a(yp0Var.a);
        }
        int i10 = o31Var.b;
        if (i10 != 0) {
            int[] iArr5 = o31Var.a;
            iArr5.getClass();
            Arrays.sort(iArr5, 0, i10);
        }
        return new xe2(o31Var, p31Var2, yp0Var.a, y40.c);
    }
}
