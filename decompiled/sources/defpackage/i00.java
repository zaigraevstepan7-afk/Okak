package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i00 extends w22 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public x31 e;
    public Object f;
    public int g;

    public i00(long j) {
        super(j);
        x31 x31Var = t81.a;
        x31Var.getClass();
        this.e = x31Var;
        this.f = h;
    }

    @Override // defpackage.w22
    public final void a(w22 w22Var) {
        w22Var.getClass();
        i00 i00Var = (i00) w22Var;
        this.e = i00Var.e;
        this.f = i00Var.f;
        this.g = i00Var.g;
    }

    @Override // defpackage.w22
    public final w22 b(long j) {
        return new i00(j);
    }

    public final boolean c(j00 j00Var, i02 i02Var) {
        boolean z;
        boolean z2;
        Object obj = q02.c;
        synchronized (obj) {
            z = true;
            if (this.c == i02Var.g()) {
                if (this.d == i02Var.h()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.f == h || (z2 && this.g != d(j00Var, i02Var))) {
            z = false;
        }
        if (z && z2) {
            synchronized (obj) {
                this.c = i02Var.g();
                this.d = i02Var.h();
            }
            return z;
        }
        return z;
    }

    public final int d(j00 j00Var, i02 i02Var) {
        x31 x31Var;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        w22 i7;
        synchronized (q02.c) {
            x31Var = this.e;
        }
        int i8 = 7;
        if (x31Var.e == 0) {
            return 7;
        }
        q41 g = fr1.g();
        Object[] objArr = g.e;
        int i9 = g.g;
        boolean z = false;
        for (int i10 = 0; i10 < i9; i10++) {
            ((tr) objArr[i10]).b();
        }
        try {
            Object[] objArr2 = x31Var.b;
            int[] iArr = x31Var.c;
            long[] jArr = x31Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                i = 7;
                int i11 = 0;
                while (true) {
                    long j = jArr[i11];
                    if ((((~j) << i8) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = z ? 1 : 0;
                        while (i14 < i13) {
                            if ((255 & j) < 128) {
                                int i15 = (i11 << 3) + i14;
                                i4 = i8;
                                u22 u22Var = (u22) objArr2[i15];
                                i6 = i12;
                                if (iArr[i15] != 1) {
                                    i5 = length;
                                } else {
                                    if (u22Var instanceof j00) {
                                        j00 j00Var2 = (j00) u22Var;
                                        i7 = j00Var2.g((i00) q02.i(j00Var2.h, i02Var), i02Var, z, j00Var2.f);
                                    } else {
                                        i7 = q02.i(u22Var.a(), i02Var);
                                    }
                                    i5 = length;
                                    i = (((i * 31) + System.identityHashCode(i7)) * 31) + Long.hashCode(i7.a);
                                }
                            } else {
                                i4 = i8;
                                i5 = length;
                                i6 = i12;
                            }
                            j >>= i6;
                            i14++;
                            i8 = i4;
                            i12 = i6;
                            length = i5;
                            z = false;
                        }
                        i2 = i8;
                        i3 = length;
                        if (i13 != i12) {
                            break;
                        }
                    } else {
                        i2 = i8;
                        i3 = length;
                    }
                    if (i11 != i3) {
                        i11++;
                        i8 = i2;
                        length = i3;
                        z = false;
                    } else {
                        i8 = i;
                        break;
                    }
                }
            }
            i = i8;
            Object[] objArr3 = g.e;
            int i16 = g.g;
            for (int i17 = 0; i17 < i16; i17++) {
                ((tr) objArr3[i17]).a();
            }
            return i;
        } catch (Throwable th) {
            Object[] objArr4 = g.e;
            int i18 = g.g;
            for (int i19 = 0; i19 < i18; i19++) {
                ((tr) objArr4[i19]).a();
            }
            throw th;
        }
    }
}
