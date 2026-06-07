package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zg0 {
    public final iq0 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final b41 f = new b41();
    public final j81 g = new j81();
    public final t31 h = new t31(10);

    public zg0(iq0 iq0Var) {
        this.a = iq0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    public final void a(long j, List list, boolean z) {
        t31 t31Var;
        long[] jArr;
        long[] jArr2;
        int i;
        x71 x71Var;
        x71 x71Var2;
        int size = list.size();
        j81 j81Var = this.g;
        j81 j81Var2 = j81Var;
        boolean z2 = true;
        int i2 = 0;
        while (true) {
            t31Var = this.h;
            if (i2 >= size) {
                break;
            }
            d21 d21Var = (d21) list.get(i2);
            if (d21Var.r) {
                d21Var.q = new f5(6, this, d21Var);
                if (z2) {
                    q41 q41Var = j81Var2.a;
                    ?? r14 = q41Var.e;
                    int i3 = q41Var.g;
                    int i4 = 0;
                    while (true) {
                        if (i4 < i3) {
                            x71Var2 = r14[i4];
                            if (sn0.r(((x71) x71Var2).c, d21Var)) {
                                break;
                            } else {
                                i4++;
                            }
                        } else {
                            x71Var2 = 0;
                            break;
                        }
                    }
                    x71Var = x71Var2;
                    if (x71Var != null) {
                        x71Var.i = true;
                        x71Var.d.a(j);
                        if (z) {
                            Object d = t31Var.d(j);
                            if (d == null) {
                                d = new b41();
                                t31Var.f(d, j);
                            }
                            ((b41) d).a(x71Var);
                        }
                        j81Var2 = x71Var;
                    } else {
                        z2 = false;
                    }
                }
                x71Var = new x71(d21Var);
                x71Var.d.a(j);
                if (z) {
                    Object d2 = t31Var.d(j);
                    if (d2 == null) {
                        d2 = new b41();
                        t31Var.f(d2, j);
                    }
                    ((b41) d2).a(x71Var);
                }
                j81Var2.a.b(x71Var);
                j81Var2 = x71Var;
            }
            i2++;
        }
        if (z) {
            long[] jArr3 = t31Var.b;
            Object[] objArr = t31Var.c;
            long[] jArr4 = t31Var.a;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i5 = 0;
                while (true) {
                    long j2 = jArr4[i5];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8;
                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((255 & j2) < 128) {
                                int i9 = (i5 << 3) + i8;
                                long j3 = jArr3[i9];
                                b41 b41Var = (b41) objArr[i9];
                                q41 q41Var2 = j81Var.a;
                                i = i6;
                                Object[] objArr2 = q41Var2.e;
                                int i10 = q41Var2.g;
                                jArr2 = jArr3;
                                for (int i11 = 0; i11 < i10; i11++) {
                                    ((x71) objArr2[i11]).f(j3, b41Var);
                                }
                            } else {
                                jArr2 = jArr3;
                                i = i6;
                            }
                            j2 >>= i;
                            i8++;
                            i6 = i;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i7 != i6) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr3 = jArr;
                }
            }
        }
        t31Var.a();
    }

    public final boolean b(sl0 sl0Var, boolean z) {
        py0 py0Var = (py0) sl0Var.e;
        iq0 iq0Var = this.a;
        j81 j81Var = this.g;
        boolean a = j81Var.a(py0Var, iq0Var, sl0Var, z);
        q41 q41Var = j81Var.a;
        if (!a) {
            return false;
        }
        boolean z2 = true;
        this.b = true;
        Object[] objArr = q41Var.e;
        int i = q41Var.g;
        boolean z3 = false;
        for (int i2 = 0; i2 < i; i2++) {
            if (!((x71) objArr[i2]).e(sl0Var, z) && !z3) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        Object[] objArr2 = q41Var.e;
        int i3 = q41Var.g;
        boolean z4 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (!((x71) objArr2[i4]).d(sl0Var) && !z4) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        j81Var.b(sl0Var);
        if (!z4 && !z3) {
            z2 = false;
        }
        this.b = false;
        if (this.e) {
            this.e = false;
            b41 b41Var = this.f;
            int i5 = b41Var.b;
            for (int i6 = 0; i6 < i5; i6++) {
                d((d21) b41Var.f(i6));
            }
            b41Var.d();
        }
        if (this.c) {
            this.c = false;
            c();
        }
        if (this.d) {
            this.d = false;
            j81Var.a.g();
        }
        return z2;
    }

    public final void c() {
        if (this.b) {
            this.c = true;
            return;
        }
        j81 j81Var = this.g;
        q41 q41Var = j81Var.a;
        Object[] objArr = q41Var.e;
        int i = q41Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ((x71) objArr[i2]).c();
        }
        if (this.d) {
            this.d = true;
        } else {
            j81Var.a.g();
        }
    }

    public final void d(d21 d21Var) {
        if (this.b) {
            this.e = true;
            this.f.a(d21Var);
            return;
        }
        j81 j81Var = this.g;
        b41 b41Var = j81Var.b;
        b41Var.d();
        b41Var.a(j81Var);
        while (b41Var.i()) {
            j81 j81Var2 = (j81) b41Var.k(b41Var.b - 1);
            int i = 0;
            while (true) {
                q41 q41Var = j81Var2.a;
                if (i < q41Var.g) {
                    x71 x71Var = (x71) q41Var.e[i];
                    if (sn0.r(x71Var.c, d21Var)) {
                        j81Var2.a.j(x71Var);
                        x71Var.c();
                    } else {
                        b41Var.a(x71Var);
                        i++;
                    }
                }
            }
        }
    }
}
