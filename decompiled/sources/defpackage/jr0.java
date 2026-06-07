package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jr0 implements k01 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k01 b;
    public final /* synthetic */ nr0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ k01 e;

    public /* synthetic */ jr0(k01 k01Var, nr0 nr0Var, int i, k01 k01Var2, int i2) {
        this.a = i2;
        this.c = nr0Var;
        this.d = i;
        this.e = k01Var2;
        this.b = k01Var;
    }

    @Override // defpackage.k01
    public final void a() {
        int i;
        int i2 = this.a;
        k01 k01Var = this.e;
        int i3 = this.d;
        nr0 nr0Var = this.c;
        switch (i2) {
            case 0:
                nr0Var.i = i3;
                k01Var.a();
                q41 q41Var = nr0Var.q;
                i41 i41Var = nr0Var.p;
                long[] jArr = i41Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((255 & j) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    Object obj = i41Var.b[i8];
                                    z32 z32Var = (z32) i41Var.c[i8];
                                    int i9 = q41Var.i(obj);
                                    if (i9 < 0 || i9 >= nr0Var.i) {
                                        if (i9 >= 0) {
                                            Object obj2 = bf.h1;
                                            i = i5;
                                            Object[] objArr = q41Var.e;
                                            Object obj3 = objArr[i9];
                                            objArr[i9] = obj2;
                                        } else {
                                            i = i5;
                                        }
                                        if (nr0Var.n.b(obj)) {
                                            z32Var.a();
                                        }
                                        i41Var.l(i8);
                                        j >>= i;
                                        i7++;
                                        i5 = i;
                                    }
                                }
                                i = i5;
                                j >>= i;
                                i7++;
                                i5 = i;
                            }
                            if (i6 != i5) {
                            }
                        }
                        if (i4 != length) {
                            i4++;
                        }
                    }
                }
                nr0Var.f(nr0Var.h);
                return;
            default:
                nr0Var.h = i3;
                k01Var.a();
                if (nr0Var.e.m == null) {
                    nr0Var.f(nr0Var.h);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.k01
    public final Map b() {
        switch (this.a) {
            case 0:
                return this.b.b();
            default:
                return this.b.b();
        }
    }

    @Override // defpackage.k01
    public final int c() {
        switch (this.a) {
            case 0:
                return this.b.c();
            default:
                return this.b.c();
        }
    }

    @Override // defpackage.k01
    public final int d() {
        switch (this.a) {
            case 0:
                return this.b.d();
            default:
                return this.b.d();
        }
    }

    @Override // defpackage.k01
    public final oe0 e() {
        switch (this.a) {
            case 0:
                return this.b.e();
            default:
                return this.b.e();
        }
    }
}
