package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class ty0 extends ig1 implements q21, l01 {
    public qy0 j;
    public oe0 k;
    public kg1 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final uy0 p = new uy0(this, 0);
    public u51 q;
    public i41 r;

    public static void H0(e81 e81Var) {
        ar0 ar0Var;
        br0 br0Var;
        e81 e81Var2 = e81Var.t;
        ar0 ar0Var2 = e81Var.s;
        if (e81Var2 != null) {
            ar0Var = e81Var2.s;
        } else {
            ar0Var = null;
        }
        if (!sn0.r(ar0Var, ar0Var2)) {
            ar0Var2.K.p.B.f();
            return;
        }
        o3 i = ar0Var2.K.p.i();
        if (i != null && (br0Var = ((i01) i).B) != null) {
            br0Var.f();
        }
    }

    public abstract iq0 A0();

    public abstract boolean B0();

    public abstract ar0 C0();

    public abstract k01 D0();

    public abstract ty0 E0();

    @Override // defpackage.q21
    public final void F(boolean z) {
        ar0 ar0Var;
        wq0 wq0Var;
        ty0 E0 = E0();
        wq0 wq0Var2 = null;
        if (E0 != null) {
            ar0Var = E0.C0();
        } else {
            ar0Var = null;
        }
        if (sn0.r(ar0Var, C0())) {
            this.m = z;
            return;
        }
        if (ar0Var != null) {
            wq0Var = ar0Var.K.d;
        } else {
            wq0Var = null;
        }
        if (wq0Var != wq0.g) {
            if (ar0Var != null) {
                wq0Var2 = ar0Var.K.d;
            }
            if (wq0Var2 != wq0.h) {
                return;
            }
        }
        this.m = z;
    }

    public abstract long F0();

    public final qy0 G0() {
        qy0 qy0Var = this.j;
        if (qy0Var == null) {
            qy0 qy0Var2 = new qy0(this);
            this.j = qy0Var2;
            return qy0Var2;
        }
        return qy0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I0(j41 j41Var) {
        ar0 ar0Var;
        Object[] objArr = j41Var.b;
        long[] jArr = j41Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && (ar0Var = (ar0) ((hh2) objArr[(i << 3) + i3]).get()) != null) {
                            if (S()) {
                                ar0Var.U(false);
                            } else {
                                ar0Var.W(false);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void J0();

    @Override // defpackage.mn0
    public boolean S() {
        return false;
    }

    @Override // defpackage.ig1
    public final int a0(j3 j3Var) {
        int u0;
        long j;
        if (!B0() || (u0 = u0(j3Var)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = j3Var instanceof wf2;
        long j2 = this.i;
        if (z) {
            j = j2 >> 32;
        } else {
            j = 4294967295L & j2;
        }
        return u0 + ((int) j);
    }

    @Override // defpackage.l01
    public final k01 i0(int i, int i2, Map map, oe0 oe0Var, oe0 oe0Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            kl0.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new sy0(i, i2, map, oe0Var, oe0Var2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t0(defpackage.ar0 r32, defpackage.hi0 r33) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ty0.t0(ar0, hi0):void");
    }

    public abstract int u0(j3 j3Var);

    /* JADX WARN: Multi-variable type inference failed */
    public final void w0(kg1 kg1Var, long j, long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        ar0 ar0Var;
        int i;
        char c2;
        long j6;
        ty0 ty0Var;
        ty0 E0;
        j41 j41Var;
        lc1 snapshotObserver;
        i41 i41Var = this.r;
        u51 u51Var = this.q;
        if (u51Var == null) {
            u51Var = new u51();
            this.q = u51Var;
        }
        u51 u51Var2 = u51Var;
        jc1 jc1Var = C0().s;
        if (jc1Var != null && (snapshotObserver = ((q5) jc1Var).getSnapshotObserver()) != null) {
            snapshotObserver.a.c(kg1Var, i5.G, new ry0(this, j, j2, kg1Var));
        }
        boolean S = S();
        j41 j41Var2 = (j41) u51Var2.e;
        j41 j41Var3 = (j41) u51Var2.f;
        int i2 = u51Var2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) u51Var2.d)[i3];
            if (b == 3) {
                hi0 hi0Var = ((hi0[]) u51Var2.b)[i3];
                hi0Var.getClass();
                j41Var3.k(hi0Var);
            } else if (b != 0 && i41Var != null) {
                hi0 hi0Var2 = ((hi0[]) u51Var2.b)[i3];
                hi0Var2.getClass();
                j41 j41Var4 = (j41) i41Var.k(hi0Var2);
                if (j41Var4 != null) {
                    j41Var2.j(j41Var4);
                }
            }
        }
        int i4 = u51Var2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) u51Var2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                hi0[] hi0VarArr = (hi0[]) u51Var2.b;
                hi0VarArr[i6 - i5] = hi0VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = u51Var2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((hi0[]) u51Var2.b)[i8] = null;
        }
        u51Var2.a -= i5;
        ty0 E02 = E0();
        Object[] objArr = j41Var3.b;
        long[] jArr = j41Var3.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            hi0 hi0Var3 = (hi0) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            if (E02 == null) {
                                ty0Var = this;
                            } else {
                                ty0Var = E02;
                            }
                            i = i9;
                            ty0 ty0Var2 = ty0Var;
                            while (true) {
                                u51 u51Var3 = ty0Var2.q;
                                if ((u51Var3 == null || bf.X((hi0[]) u51Var3.b, hi0Var3) < 0) && (E0 = ty0Var2.E0()) != null) {
                                    ty0Var2 = E0;
                                }
                            }
                            i41 i41Var2 = ty0Var2.r;
                            if (i41Var2 != null) {
                                j41Var = (j41) i41Var2.k(hi0Var3);
                            } else {
                                j41Var = null;
                            }
                            if (j41Var != null) {
                                ty0Var.I0(j41Var);
                            }
                        } else {
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                    }
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                i9 = 8;
            }
        } else {
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        j41Var3.b();
        Object[] objArr2 = j41Var2.b;
        long[] jArr2 = j41Var2.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (ar0Var = (ar0) ((hh2) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (S) {
                                ar0Var.U(false);
                            } else {
                                ar0Var.W(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        j41Var2.b();
    }

    public final void x0(k01 k01Var) {
        boolean z;
        long j;
        long j2;
        i41 i41Var = this.r;
        if (!this.o) {
            oe0 e = k01Var.e();
            boolean z2 = false;
            if (e == null) {
                if (i41Var != null) {
                    Object[] objArr = i41Var.c;
                    long[] jArr = i41Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j3 = jArr[i];
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j3) < 128) {
                                        I0((j41) objArr[(i << 3) + i3]);
                                    }
                                    j3 >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                    i41Var.a();
                    return;
                }
                return;
            }
            if (this.k != e) {
                z = true;
            } else {
                z = false;
            }
            if (!z && G0().e) {
                iq0 A0 = A0();
                long V = fp.V(A0.u(0L));
                long m = A0.m();
                if (!xm0.a(V, G0().f) || !en0.a(m, G0().g)) {
                    z2 = true;
                }
                j2 = V;
                j = m;
                z = z2;
            } else {
                j = 0;
                j2 = 9223372034707292159L;
            }
            if (z) {
                kg1 kg1Var = this.l;
                if (kg1Var != null) {
                    kg1Var.e = k01Var;
                } else {
                    kg1Var = new kg1(k01Var, this);
                    this.l = kg1Var;
                }
                w0(kg1Var, j2, j);
                this.k = k01Var.e();
            }
        }
    }

    public abstract ty0 z0();
}
