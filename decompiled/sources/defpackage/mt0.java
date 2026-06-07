package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mt0 implements k01 {
    public final nt0 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final k01 e;
    public final float f;
    public final boolean g;
    public final gv h;
    public final c00 i;
    public final long j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final sb1 o;
    public final int p;
    public final int q;

    public mt0(nt0 nt0Var, int i, boolean z, float f, k01 k01Var, float f2, boolean z2, gv gvVar, c00 c00Var, long j, List list, int i2, int i3, int i4, sb1 sb1Var, int i5, int i6) {
        this.a = nt0Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = k01Var;
        this.f = f2;
        this.g = z2;
        this.h = gvVar;
        this.i = c00Var;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = sb1Var;
        this.p = i5;
        this.q = i6;
    }

    @Override // defpackage.k01
    public final void a() {
        this.e.a();
    }

    @Override // defpackage.k01
    public final Map b() {
        return this.e.b();
    }

    @Override // defpackage.k01
    public final int c() {
        return this.e.c();
    }

    @Override // defpackage.k01
    public final int d() {
        return this.e.d();
    }

    @Override // defpackage.k01
    public final oe0 e() {
        return this.e.e();
    }

    public final mt0 f(int i, boolean z) {
        nt0 nt0Var;
        if (!this.g) {
            List list = this.k;
            if (!list.isEmpty() && (nt0Var = this.a) != null) {
                int i2 = nt0Var.l;
                int i3 = this.b - i;
                if (i3 >= 0 && i3 < i2) {
                    nt0 nt0Var2 = (nt0) wn.g0(list);
                    nt0 nt0Var3 = (nt0) wn.n0(list);
                    if (!nt0Var2.n && !nt0Var3.n) {
                        int i4 = nt0Var2.j;
                        int i5 = this.m;
                        int i6 = this.l;
                        if (i < 0) {
                            if (Math.min((i4 + nt0Var2.l) - i6, (nt0Var3.j + nt0Var3.l) - i5) <= (-i)) {
                                return null;
                            }
                        } else if (Math.min(i6 - i4, i5 - nt0Var3.j) <= i) {
                            return null;
                        }
                        int size = list.size();
                        boolean z2 = false;
                        for (int i7 = 0; i7 < size; i7++) {
                            nt0 nt0Var4 = (nt0) list.get(i7);
                            nt0Var4.getClass();
                            int[] iArr = nt0Var4.p;
                            if (!nt0Var4.n) {
                                nt0Var4.j += i;
                                int length = iArr.length;
                                for (int i8 = 0; i8 < length; i8++) {
                                    if ((i8 & 1) != 0) {
                                        iArr[i8] = iArr[i8] + i;
                                    }
                                }
                                if (z) {
                                    int size2 = nt0Var4.b.size();
                                    for (int i9 = 0; i9 < size2; i9++) {
                                        l90.x(nt0Var4.i.a.g(nt0Var4.g));
                                    }
                                }
                            }
                        }
                        if (this.c || i > 0) {
                            z2 = true;
                        }
                        return new mt0(this.a, i3, z2, i, this.e, this.f, this.g, this.h, this.i, this.j, list, this.l, this.m, this.n, this.o, this.p, this.q);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long g() {
        k01 k01Var = this.e;
        return (k01Var.d() << 32) | (k01Var.c() & 4294967295L);
    }
}
