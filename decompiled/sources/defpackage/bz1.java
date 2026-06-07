package defpackage;

import com.topjohnwu.superuser.internal.HiddenAPIs;
import com.topjohnwu.superuser.nio.FileSystemManager;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class bz1 {
    public static final float a = bf.e1;
    public static final float b;
    public static final long c;
    public static final float d;
    public static final float e;
    public static final wf2 f;

    /* JADX WARN: Type inference failed for: r0v4, types: [wf2, j3] */
    static {
        float f2 = bf.c1;
        b = f2;
        float f3 = bf.a1;
        c = go.e(f2, f3);
        go.e(f3, f2);
        d = 6.0f;
        e = 2.0f;
        f = new j3(wy1.e);
    }

    public static final void a(final float f2, final oe0 oe0Var, final e21 e21Var, boolean z, rn rnVar, final my1 my1Var, r31 r31Var, ur urVar, final int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        final boolean z3;
        final rn rnVar2;
        final r31 r31Var2;
        int i5;
        rn rnVar3;
        r31 r31Var3;
        urVar.Y(-202044027);
        if (urVar.c(f2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (urVar.h(oe0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3 | 1780736;
        if (urVar.f(my1Var)) {
            i4 = 8388608;
        } else {
            i4 = HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
        }
        int i8 = i7 | i4 | 100663296;
        boolean z4 = true;
        if ((38347923 & i8) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i8 & 1, z2)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                i5 = i8 & (-57345);
                z4 = z;
                rnVar3 = rnVar;
                r31Var3 = r31Var;
            } else {
                rn rnVar4 = new rn(0.0f, 1.0f);
                i5 = i8 & (-57345);
                Object L = urVar.L();
                if (L == or.a) {
                    L = new r31();
                    urVar.h0(L);
                }
                rnVar3 = rnVar4;
                r31Var3 = (r31) L;
            }
            urVar.q();
            b(f2, oe0Var, e21Var, z4, my1Var, r31Var3, go.N(308249025, new g80(r31Var3, my1Var, z4), urVar), go.N(-1843234110, new p9(my1Var, z4), urVar), rnVar3, urVar, 905969664 | (i5 & 14) | (i5 & 112) | 28032 | ((i5 >> 6) & 458752) | 14155776, 0);
            z3 = z4;
            r31Var2 = r31Var3;
            rnVar2 = rnVar3;
        } else {
            urVar.R();
            z3 = z;
            rnVar2 = rnVar;
            r31Var2 = r31Var;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0(f2, oe0Var, e21Var, z3, rnVar2, my1Var, r31Var2, i) { // from class: ty1
                public final /* synthetic */ float e;
                public final /* synthetic */ oe0 f;
                public final /* synthetic */ e21 g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ rn i;
                public final /* synthetic */ my1 j;
                public final /* synthetic */ r31 k;

                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int b0 = lo.b0(385);
                    bz1.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (ur) obj, b0);
                    return od2.a;
                }
            };
        }
    }

    public static final void b(final float f2, final oe0 oe0Var, final e21 e21Var, final boolean z, my1 my1Var, final r31 r31Var, final fq fqVar, final fq fqVar2, final rn rnVar, ur urVar, final int i, final int i2) {
        int i3;
        my1 my1Var2;
        fq fqVar3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
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
        urVar.Y(985901935);
        if ((i & 6) == 0) {
            if (urVar.c(f2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i3 = i15 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.h(oe0Var)) {
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
            if (urVar.h(null)) {
                i11 = 16384;
            } else {
                i11 = SharedConstants.DefaultBufferSize;
            }
            i3 |= i11;
        }
        if ((196608 & i) == 0) {
            my1Var2 = my1Var;
            if (urVar.f(my1Var2)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i3 |= i10;
        } else {
            my1Var2 = my1Var;
        }
        if ((1572864 & i) == 0) {
            if (urVar.f(r31Var)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((12582912 & i) == 0) {
            if (urVar.d(0)) {
                i8 = 8388608;
            } else {
                i8 = HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
            }
            i3 |= i8;
        }
        if ((100663296 & i) == 0) {
            if (urVar.h(fqVar)) {
                i7 = FileSystemManager.MODE_TRUNCATE;
            } else {
                i7 = FileSystemManager.MODE_APPEND;
            }
            i3 |= i7;
        }
        if ((805306368 & i) == 0) {
            fqVar3 = fqVar2;
            if (urVar.h(fqVar3)) {
                i6 = FileSystemManager.MODE_WRITE_ONLY;
            } else {
                i6 = FileSystemManager.MODE_READ_ONLY;
            }
            i3 |= i6;
        } else {
            fqVar3 = fqVar2;
        }
        if ((i2 & 6) == 0) {
            if (urVar.f(rnVar)) {
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
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
            }
            urVar.q();
            if ((29360128 & i3) == 8388608) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((((i4 & 14) ^ 6) > 4 && urVar.f(rnVar)) || (i4 & 6) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z3 | z4;
            Object L = urVar.L();
            if (z5 || L == or.a) {
                L = new dz1(f2, rnVar);
                urVar.h0(L);
            }
            dz1 dz1Var = (dz1) L;
            dz1Var.getClass();
            dz1Var.c = oe0Var;
            dz1Var.c(f2);
            int i16 = ((i3 >> 3) & 1008) | ((i3 >> 6) & 57344);
            int i17 = i3 >> 9;
            c(dz1Var, e21Var, z, null, r31Var, fqVar, fqVar3, urVar, i16 | (458752 & i17) | (i17 & 3670016));
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            final my1 my1Var3 = my1Var2;
            r.d = new se0() { // from class: uy1
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bz1.b(f2, oe0Var, e21Var, z, my1Var3, r31Var, fqVar, fqVar2, rnVar, (ur) obj, lo.b0(i | 1), lo.b0(i2));
                    return od2.a;
                }
            };
        }
    }

    public static final void c(dz1 dz1Var, e21 e21Var, boolean z, my1 my1Var, r31 r31Var, fq fqVar, fq fqVar2, ur urVar, int i) {
        int i2;
        boolean z2;
        my1 my1Var2;
        int i3;
        my1 e2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        urVar.Y(409861960);
        if ((i & 6) == 0) {
            if (urVar.h(dz1Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.f(e21Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (urVar.g(z)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            if (urVar.f(r31Var)) {
                i6 = 16384;
            } else {
                i6 = SharedConstants.DefaultBufferSize;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (urVar.h(fqVar)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            if (urVar.h(fqVar2)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((599187 & i2) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i2 & 1, z2)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                i3 = i2 & (-7169);
                e2 = my1Var;
            } else {
                ry1 ry1Var = ry1.a;
                i3 = i2 & (-7169);
                e2 = ry1.e((mo) urVar.j(oo.a));
            }
            urVar.q();
            int i10 = i3 >> 3;
            d(e21Var, dz1Var, z, r31Var, fqVar, fqVar2, urVar, (i3 & 896) | (i10 & 14) | ((i3 << 3) & 112) | (i10 & 7168) | (57344 & i10) | (i10 & 458752));
            my1Var2 = e2;
        } else {
            urVar.R();
            my1Var2 = my1Var;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new c8(dz1Var, e21Var, z, my1Var2, r31Var, fqVar, fqVar2, i);
        }
    }

    public static final void d(e21 e21Var, dz1 dz1Var, boolean z, r31 r31Var, fq fqVar, fq fqVar2, ur urVar, int i) {
        int i2;
        boolean z2;
        dz1 dz1Var2;
        boolean z3;
        boolean z4;
        e21 e21Var2;
        sb1 sb1Var;
        e21 n;
        float f2;
        float f3;
        e21 e21Var3;
        oe0 oe0Var;
        boolean z5;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        fq fqVar3 = fqVar2;
        urVar.Y(898172835);
        if ((i & 6) == 0) {
            if (urVar.f(e21Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.h(dz1Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (urVar.g(z)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (urVar.f(r31Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (urVar.h(fqVar)) {
                i4 = 16384;
            } else {
                i4 = SharedConstants.DefaultBufferSize;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (urVar.h(fqVar3)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        int i9 = i2;
        int i10 = 1;
        if ((74899 & i9) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i9 & 1, z2)) {
            if (urVar.j(is.n) == jq0.f) {
                z3 = true;
            } else {
                z3 = false;
            }
            dz1Var.h = z3;
            fe1 fe1Var = dz1Var.b;
            sb1 sb1Var2 = dz1Var.k;
            if (sb1Var2 == sb1.f && z3) {
                z4 = true;
            } else {
                z4 = false;
            }
            e21 e21Var4 = b21.a;
            if (z) {
                nu nuVar = new nu(i10, r31Var, dz1Var);
                jh1 jh1Var = s42.a;
                e21Var2 = new r42(dz1Var, r31Var, nuVar, 4);
            } else {
                e21Var2 = e21Var4;
            }
            sb1 sb1Var3 = dz1Var.k;
            boolean booleanValue = ((Boolean) dz1Var.l.getValue()).booleanValue();
            boolean h = urVar.h(dz1Var);
            Object L = urVar.L();
            xl1 xl1Var = or.a;
            if (!h && L != xl1Var) {
                sb1Var = sb1Var3;
            } else {
                sb1Var = sb1Var3;
                L = new br(dz1Var, null, 1);
                urVar.h0(L);
            }
            boolean z6 = z4;
            s30 s30Var = new s30(dz1Var, sb1Var, z, r31Var, booleanValue, u30.a, (te0) L, z6);
            dz1Var2 = dz1Var;
            ny1 ny1Var = ny1.e;
            sb1 sb1Var4 = sb1.e;
            if (sb1Var2 == sb1Var4) {
                n = hy1.l(sn0.G(e21Var4, ny1Var));
            } else {
                n = hy1.n(sn0.G(e21Var4, ny1Var));
            }
            ei0 ei0Var = kn0.a;
            e21 d2 = e21Var.d(f11.a);
            float f4 = b;
            float f5 = a;
            if (sb1Var2 == sb1Var4) {
                f2 = f5;
            } else {
                f2 = f4;
            }
            if (sb1Var2 == sb1Var4) {
                f3 = f4;
            } else {
                f3 = f5;
            }
            e21 a2 = ou1.a(hy1.e(d2, f2, f3, 0.0f, 0.0f, 12), false, new wg(3, dz1Var2, z));
            rn rnVar = dz1Var2.a;
            if (sb1Var2 == sb1Var4) {
                e21Var3 = r1.b;
            } else {
                e21Var3 = r1.a;
            }
            e21 e21Var5 = n;
            e21 v = f2.v(ou1.a(a2.d(e21Var3), true, new qj1(fe1Var.g(), new rn(rnVar.a, rnVar.b))), z, r31Var);
            rn rnVar2 = dz1Var2.a;
            float g = fe1Var.g();
            boolean h2 = urVar.h(dz1Var2);
            Object L2 = urVar.L();
            if (h2 || L2 == xl1Var) {
                L2 = new sy1(dz1Var2, 1);
                urVar.h0(L2);
            }
            oe0 oe0Var2 = (oe0) L2;
            if (sb1Var2 == sb1Var4) {
                oe0Var = oe0Var2;
                z5 = true;
            } else {
                oe0Var = oe0Var2;
                z5 = false;
            }
            e21 d3 = rx.G(v, new zy1(z, rnVar2, z6, oe0Var, z5, g)).d(e21Var2).d(s30Var);
            boolean h3 = urVar.h(dz1Var2);
            Object L3 = urVar.L();
            if (h3 || L3 == xl1Var) {
                L3 = new yy1(dz1Var2);
                urVar.h0(L3);
            }
            j01 j01Var = (j01) L3;
            int x = io.x(urVar);
            sf1 l = urVar.l();
            e21 Q = fp.Q(urVar, d3);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            gb gbVar = kr.f;
            op1.q(urVar, gbVar, j01Var);
            gb gbVar2 = kr.e;
            op1.q(urVar, gbVar2, l);
            gb gbVar3 = kr.g;
            if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x))) {
                l90.s(x, urVar, x, gbVar3);
            }
            gb gbVar4 = kr.d;
            op1.q(urVar, gbVar4, Q);
            boolean h4 = urVar.h(dz1Var2);
            Object L4 = urVar.L();
            if (h4 || L4 == xl1Var) {
                L4 = new sy1(dz1Var2, 2);
                urVar.h0(L4);
            }
            e21 C = d6.C(e21Var5, (oe0) L4);
            ki kiVar = g3.f;
            j01 d4 = hj.d(kiVar, false);
            int x2 = io.x(urVar);
            sf1 l2 = urVar.l();
            e21 Q2 = fp.Q(urVar, C);
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, gbVar, d4);
            op1.q(urVar, gbVar2, l2);
            if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x2))) {
                l90.s(x2, urVar, x2, gbVar3);
            }
            op1.q(urVar, gbVar4, Q2);
            int i11 = (i9 >> 3) & 14;
            fqVar.invoke(dz1Var2, urVar, Integer.valueOf(((i9 >> 9) & 112) | i11));
            urVar.p(true);
            e21 G = sn0.G(e21Var4, ny1.f);
            j01 d5 = hj.d(kiVar, false);
            int x3 = io.x(urVar);
            sf1 l3 = urVar.l();
            e21 Q3 = fp.Q(urVar, G);
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, gbVar, d5);
            op1.q(urVar, gbVar2, l3);
            if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x3))) {
                l90.s(x3, urVar, x3, gbVar3);
            }
            op1.q(urVar, gbVar4, Q3);
            fqVar3 = fqVar2;
            fqVar3.invoke(dz1Var2, urVar, Integer.valueOf(i11 | ((i9 >> 12) & 112)));
            urVar.p(true);
            urVar.p(true);
        } else {
            dz1Var2 = dz1Var;
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new vh(e21Var, dz1Var2, z, r31Var, fqVar, fqVar3, i);
        }
    }

    public static final void e(final r31 r31Var, final e21 e21Var, final my1 my1Var, final boolean z, final long j, ur urVar, final int i) {
        int i2;
        boolean z2;
        long j2;
        long j3;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        urVar.Y(2115331054);
        int i9 = 2;
        if ((i & 6) == 0) {
            if (urVar.f(r31Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.f(e21Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (urVar.f(my1Var)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (urVar.g(z)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (urVar.e(j)) {
                i4 = 16384;
            } else {
                i4 = SharedConstants.DefaultBufferSize;
            }
            i2 |= i4;
        }
        boolean z3 = false;
        if ((196608 & i) == 0) {
            if (urVar.g(false)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        if ((74899 & i2) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i2 & 1, z2)) {
            Object L = urVar.L();
            xl1 xl1Var = or.a;
            if (L == xl1Var) {
                L = new a12();
                urVar.h0(L);
            }
            a12 a12Var = (a12) L;
            if ((i2 & 14) == 4) {
                z3 = true;
            }
            Object L2 = urVar.L();
            if (z3 || L2 == xl1Var) {
                L2 = new uk(r31Var, a12Var, null, i9);
                urVar.h0(L2);
            }
            bf.i(urVar, (se0) L2, r31Var);
            if (!a12Var.isEmpty()) {
                float b2 = j20.b(j) / 2.0f;
                if ((2 & 1) != 0) {
                    b2 = j20.b(j);
                }
                if ((2 & 2) != 0) {
                    f2 = j20.a(j);
                } else {
                    f2 = 0.0f;
                }
                j2 = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(b2) << 32);
            } else {
                j2 = j;
            }
            p90 p90Var = hy1.a;
            e21 d2 = hy1.g(e21Var, j20.b(j2), j20.a(j2)).d(new ni0(r31Var));
            oh1.a.getClass();
            e21 S = fp.S(d2, bf.R0);
            if (z) {
                j3 = my1Var.a;
            } else {
                j3 = my1Var.f;
            }
            xp1.a(urVar, f2.k(S, j3, pw1.b(bf.b1, urVar)));
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0() { // from class: vy1
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bz1.e(r31.this, e21Var, my1Var, z, j, (ur) obj, lo.b0(i | 1));
                    return od2.a;
                }
            };
        }
    }

    public static final float f(float f2, float[] fArr, float f3, float f4) {
        Float valueOf;
        if (fArr.length == 0) {
            valueOf = null;
        } else {
            float f5 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                valueOf = Float.valueOf(f5);
            } else {
                float abs = Math.abs(lo.Q(f3, f4, f5) - f2);
                if (1 <= length) {
                    while (true) {
                        float f6 = fArr[i];
                        float abs2 = Math.abs(lo.Q(f3, f4, f6) - f2);
                        if (Float.compare(abs, abs2) > 0) {
                            f5 = f6;
                            abs = abs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                valueOf = Float.valueOf(f5);
            }
        }
        if (valueOf != null) {
            return lo.Q(f3, f4, valueOf.floatValue());
        }
        return f2;
    }
}
