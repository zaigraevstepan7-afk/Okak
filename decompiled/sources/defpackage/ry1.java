package defpackage;

import com.topjohnwu.superuser.internal.HiddenAPIs;
import com.topjohnwu.superuser.nio.FileSystemManager;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ry1 {
    public static final ry1 a = new Object();
    public static final float b;
    public static final float c;
    public static final n8 d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ry1] */
    static {
        float f = bf.f1;
        b = f;
        c = f;
        d = p8.a();
    }

    public static void d(c40 c40Var, sb1 sb1Var, long j, long j2, long j3, float f, float f2) {
        ip1 ip1Var;
        long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
        if (sb1Var == sb1.e) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            pl1 e = hp.e(j, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
            ip1Var = new ip1(e.a, e.b, e.c, e.d, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits2);
        } else {
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            pl1 e2 = hp.e(j, (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
            ip1Var = new ip1(e2.a, e2.b, e2.c, e2.d, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits);
        }
        n8 n8Var = d;
        n8.b(n8Var, ip1Var);
        c40.y0(c40Var, n8Var, j3, 0.0f, null, 60);
        n8Var.h();
    }

    public static my1 e(mo moVar) {
        my1 my1Var = moVar.f0;
        if (my1Var == null) {
            long d2 = oo.d(moVar, bf.Z0);
            no noVar = bf.S0;
            long d3 = oo.d(moVar, noVar);
            no noVar2 = bf.d1;
            long d4 = oo.d(moVar, noVar2);
            long d5 = oo.d(moVar, noVar2);
            long d6 = oo.d(moVar, noVar);
            long t = go.t(co.b(oo.d(moVar, bf.V0), bf.W0), moVar.p);
            no noVar3 = bf.T0;
            long d7 = oo.d(moVar, noVar3);
            float f = bf.U0;
            long b2 = co.b(d7, f);
            no noVar4 = bf.X0;
            long d8 = oo.d(moVar, noVar4);
            float f2 = bf.Y0;
            my1 my1Var2 = new my1(d2, d3, d4, d5, d6, t, b2, co.b(d8, f2), co.b(oo.d(moVar, noVar4), f2), co.b(oo.d(moVar, noVar3), f));
            moVar.f0 = my1Var2;
            return my1Var2;
        }
        return my1Var;
    }

    public final void a(r31 r31Var, e21 e21Var, my1 my1Var, boolean z, long j, ur urVar, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        e21 e21Var2;
        long j2;
        long j3;
        e21 e21Var3;
        urVar.Y(-290277409);
        if (urVar.f(r31Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2 | 48;
        if (urVar.f(my1Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i6 = i5 | i3;
        if (urVar.g(z)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4 | 24576;
        if ((74899 & i7) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i7 & 1, z2)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                e21Var3 = e21Var;
                j3 = j;
            } else {
                j3 = bz1.c;
                e21Var3 = b21.a;
            }
            urVar.q();
            e21 e21Var4 = e21Var3;
            bz1.e(r31Var, e21Var4, my1Var, z, j3, urVar, (i7 & 7168) | (i7 & 14) | 196656 | (i7 & 896) | 24576);
            j2 = j3;
            e21Var2 = e21Var4;
        } else {
            urVar.R();
            e21Var2 = e21Var;
            j2 = j;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new s61(this, r31Var, e21Var2, my1Var, z, j2, i);
        }
    }

    public final void b(final dz1 dz1Var, e21 e21Var, final boolean z, final my1 my1Var, se0 se0Var, te0 te0Var, float f, float f2, ur urVar, final int i) {
        int i2;
        boolean z2;
        final e21 e21Var2;
        final se0 se0Var2;
        final te0 te0Var2;
        final float f3;
        final float f4;
        boolean z3;
        int i3;
        se0 se0Var3;
        float f5;
        te0 te0Var3;
        e21 e21Var3;
        float f6;
        int i4;
        int i5;
        int i6;
        int i7;
        urVar.Y(49984771);
        if ((i & 6) == 0) {
            if (urVar.h(dz1Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        int i8 = i2 | 48;
        if ((i & 384) == 0) {
            if (urVar.g(z)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i8 |= i6;
        }
        if ((i & 3072) == 0) {
            if (urVar.f(my1Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i8 |= i5;
        }
        if ((i & 24576) == 0) {
            i8 |= SharedConstants.DefaultBufferSize;
        }
        int i9 = i8 | 14352384;
        if ((100663296 & i) == 0) {
            if (urVar.f(this)) {
                i4 = FileSystemManager.MODE_TRUNCATE;
            } else {
                i4 = FileSystemManager.MODE_APPEND;
            }
            i9 |= i4;
        }
        boolean z4 = false;
        if ((38347923 & i9) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i9 & 1, z2)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                i3 = i9 & (-57345);
                e21Var3 = e21Var;
                se0Var3 = se0Var;
                te0Var3 = te0Var;
                f6 = f;
                f5 = f2;
            } else {
                if ((((i9 & 7168) ^ 3072) > 2048 && urVar.f(my1Var)) || (i9 & 3072) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i9 & 896) == 256) {
                    z4 = true;
                }
                boolean z5 = z3 | z4;
                Object L = urVar.L();
                xl1 xl1Var = or.a;
                if (z5 || L == xl1Var) {
                    L = new eu(my1Var, z);
                    urVar.h0(L);
                }
                se0 se0Var4 = (se0) L;
                i3 = i9 & (-57345);
                Object L2 = urVar.L();
                if (L2 == xl1Var) {
                    L2 = mq.g;
                    urVar.h0(L2);
                }
                float f7 = bz1.d;
                se0Var3 = se0Var4;
                f5 = bz1.e;
                te0Var3 = (te0) L2;
                e21Var3 = b21.a;
                f6 = f7;
            }
            urVar.q();
            int i10 = i3 << 3;
            c(dz1Var, e21Var3, z, my1Var, se0Var3, te0Var3, f6, f5, urVar, 805306416 | (i3 & 14) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (3670016 & i10) | (29360128 & i10) | (i10 & 234881024), ((i3 >> 21) & 112) | 6);
            e21Var2 = e21Var3;
            f4 = f5;
            f3 = f6;
            te0Var2 = te0Var3;
            se0Var2 = se0Var3;
        } else {
            urVar.R();
            e21Var2 = e21Var;
            se0Var2 = se0Var;
            te0Var2 = te0Var;
            f3 = f;
            f4 = f2;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0() { // from class: oy1
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ry1.this.b(dz1Var, e21Var2, z, my1Var, se0Var2, te0Var2, f3, f4, (ur) obj, lo.b0(i | 1));
                    return od2.a;
                }
            };
        }
    }

    public final void c(final dz1 dz1Var, final e21 e21Var, final boolean z, final my1 my1Var, final se0 se0Var, final te0 te0Var, final float f, final float f2, ur urVar, final int i, final int i2) {
        int i3;
        float f3;
        int i4;
        boolean z2;
        ur urVar2;
        long j;
        long j2;
        long j3;
        e21 c2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        e21 e21Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        urVar.Y(133396521);
        if ((i & 6) == 0) {
            if (urVar.h(dz1Var)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i3 = i15 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.c(Float.NaN)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i3 |= i14;
        }
        if ((i & 384) == 0) {
            if (urVar.f(e21Var)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i3 |= i13;
        }
        if ((i & 3072) == 0) {
            if (urVar.g(z)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i3 |= i12;
        }
        if ((i & 24576) == 0) {
            if (urVar.f(my1Var)) {
                i11 = 16384;
            } else {
                i11 = SharedConstants.DefaultBufferSize;
            }
            i3 |= i11;
        }
        if ((196608 & i) == 0) {
            if (urVar.h(se0Var)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i3 |= i10;
        }
        if ((1572864 & i) == 0) {
            if (urVar.h(te0Var)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((12582912 & i) == 0) {
            f3 = f;
            if (urVar.c(f3)) {
                i8 = 8388608;
            } else {
                i8 = HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
            }
            i3 |= i8;
        } else {
            f3 = f;
        }
        if ((i & 100663296) == 0) {
            if (urVar.c(f2)) {
                i7 = FileSystemManager.MODE_TRUNCATE;
            } else {
                i7 = FileSystemManager.MODE_APPEND;
            }
            i3 |= i7;
        }
        if ((i & FileSystemManager.MODE_READ_WRITE) == 0) {
            if (urVar.g(false)) {
                i6 = FileSystemManager.MODE_WRITE_ONLY;
            } else {
                i6 = FileSystemManager.MODE_READ_ONLY;
            }
            i3 |= i6;
        }
        if ((i2 & 6) == 0) {
            if (urVar.g(false)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i2 | i5;
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (urVar.O(i3 & 1, z2)) {
            final long a2 = my1Var.a(z, false);
            long a3 = my1Var.a(z, true);
            if (z) {
                j = a3;
                j2 = my1Var.e;
            } else {
                j = a3;
                j2 = my1Var.j;
            }
            if (z) {
                j3 = my1Var.c;
            } else {
                j3 = my1Var.h;
            }
            if (dz1Var.k == sb1.e) {
                c2 = hy1.j(e21Var, bz1.a).d(hy1.b);
            } else {
                c2 = hy1.c(hy1.b(e21Var, 1.0f), bz1.a);
            }
            int i16 = i3 & 112;
            int i17 = i3;
            if (i16 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h = z3 | urVar.h(dz1Var);
            Object L = urVar.L();
            xl1 xl1Var = or.a;
            if (h || L == xl1Var) {
                L = new ol(dz1Var, 8);
                urVar.h0(L);
            }
            e21 d2 = c2.d(mp0.D(b21.a, (te0) L));
            if (i16 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean h2 = z4 | urVar.h(dz1Var) | urVar.e(a2) | urVar.e(j) | urVar.e(j2) | urVar.e(j3);
            if ((i17 & 29360128) == 8388608) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z11 = z5 | h2;
            if ((i17 & 234881024) == 67108864) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z12 = z11 | z6;
            if ((i17 & 458752) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z13 = z12 | z7;
            if ((i17 & 3670016) == 1048576) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z14 = z13 | z8;
            if ((i17 & 1879048192) == 536870912) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z15 = z14 | z9;
            if ((i4 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z16 = z15 | z10;
            Object L2 = urVar.L();
            if (!z16 && L2 != xl1Var) {
                urVar2 = urVar;
                e21Var2 = d2;
            } else {
                final long j4 = j3;
                urVar2 = urVar;
                final long j5 = j2;
                e21Var2 = d2;
                final float f4 = f3;
                final long j6 = j;
                oe0 oe0Var = new oe0() { // from class: py1
                    /* JADX WARN: Removed duplicated region for block: B:68:0x0250  */
                    @Override // defpackage.oe0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r30) {
                        /*
                            Method dump skipped, instructions count: 956
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.py1.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                urVar2.h0(oe0Var);
                L2 = oe0Var;
            }
            f2.c(e21Var2, (oe0) L2, urVar2, 0);
        } else {
            urVar2 = urVar;
            urVar2.R();
        }
        dl1 r = urVar2.r();
        if (r != null) {
            r.d = new se0() { // from class: qy1
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ry1.this.c(dz1Var, e21Var, z, my1Var, se0Var, te0Var, f, f2, (ur) obj, lo.b0(i | 1), lo.b0(i2));
                    return od2.a;
                }
            };
        }
    }
}
