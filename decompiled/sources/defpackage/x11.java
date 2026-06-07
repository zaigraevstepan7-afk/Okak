package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.elixir.loader.R;
import com.topjohnwu.superuser.internal.HiddenAPIs;
import com.topjohnwu.superuser.nio.FileSystemManager;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class x11 {
    public static final long a = yq1.a(0.5f, 0.0f);
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Removed duplicated region for block: B:111:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.de0 r30, defpackage.e21 r31, final defpackage.ex1 r32, float r33, boolean r34, defpackage.kw1 r35, long r36, long r38, long r40, defpackage.se0 r42, defpackage.se0 r43, defpackage.y11 r44, final defpackage.fq r45, defpackage.ur r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x11.a(de0, e21, ex1, float, boolean, kw1, long, long, long, se0, se0, y11, fq, ur, int, int):void");
    }

    public static final void b(final ya yaVar, final gv gvVar, final de0 de0Var, final de0 de0Var2, final e21 e21Var, final ex1 ex1Var, final float f, final boolean z, final kw1 kw1Var, final long j, final long j2, final float f2, final se0 se0Var, final se0 se0Var2, final fq fqVar, ur urVar, final int i) {
        boolean z2;
        ya yaVar2;
        urVar.Y(377926385);
        int i2 = i | (urVar.h(yaVar) ? 32 : 16) | (urVar.h(gvVar) ? 256 : 128) | (urVar.h(de0Var) ? 2048 : 1024) | (urVar.h(de0Var2) ? 16384 : 8192) | (urVar.f(e21Var) ? 131072 : 65536) | (urVar.f(ex1Var) ? 1048576 : 524288) | (urVar.c(f) ? 8388608 : HiddenAPIs.FLAG_RECEIVER_FROM_SHELL) | (urVar.g(z) ? FileSystemManager.MODE_TRUNCATE : FileSystemManager.MODE_APPEND) | (urVar.f(kw1Var) ? FileSystemManager.MODE_WRITE_ONLY : FileSystemManager.MODE_READ_ONLY);
        int i3 = (urVar.e(j) ? 4 : 2) | (urVar.e(j2) ? 32 : 16) | (urVar.c(f2) ? 256 : 128) | (urVar.h(se0Var) ? 2048 : 1024) | (urVar.h(se0Var2) ? 16384 : 8192) | (urVar.h(fqVar) ? 131072 : 65536);
        if (urVar.O(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 74899) == 74898) ? false : true)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
            }
            urVar.q();
            String g = nq1.g(R.string.m3c_bottom_sheet_pane_title, urVar);
            dc2 dc2Var = t3.a;
            Object obj = ex1Var.d;
            n4 n4Var = ex1Var.d;
            int i4 = (i2 & 3670016) ^ 1572864;
            boolean z3 = (i4 > 1048576 && urVar.f(ex1Var)) || (i2 & 1572864) == 1048576;
            Object L = urVar.L();
            boolean z4 = z3;
            Object obj2 = or.a;
            if (z4 || L == obj2) {
                L = new dj(ex1Var, 2);
                urVar.h0(L);
            }
            Object obj3 = (oe0) L;
            dc2 dc2Var2 = bx1.a;
            dc2 dc2Var3 = t3.a;
            Object obj4 = (c00) urVar.j(is.h);
            boolean f3 = urVar.f(obj4) | urVar.f(obj) | urVar.f(obj3) | urVar.f(dc2Var2);
            Object L2 = urVar.L();
            if (f3 || L2 == obj2) {
                tx txVar = mp0.b;
                v3 v3Var = new v3(obj4, 0);
                z2 = true;
                Object c02Var = new c02(new ld(obj, obj3, v3Var, 1), txVar, dc2Var2);
                urVar.h0(c02Var);
                L2 = c02Var;
            } else {
                z2 = true;
            }
            c02 c02Var2 = (c02) L2;
            boolean f4 = urVar.f(c02Var2);
            Object L3 = urVar.L();
            if (f4 || L3 == obj2) {
                L3 = new v11(c02Var2, ex1Var, de0Var);
                urVar.h0(L3);
            }
            v11 v11Var = (v11) L3;
            e21 b2 = hy1.b(hy1.k(lj.a(e21Var, g3.g), f), 1.0f);
            e21 e21Var2 = b21.a;
            if (z) {
                urVar.X(-1884894530);
                boolean z5 = ((i4 <= 1048576 || !urVar.f(ex1Var)) && (i2 & 1572864) != 1048576) ? false : z2;
                Object L4 = urVar.L();
                if (z5 || L4 == obj2) {
                    L4 = new ax1(ex1Var, v11Var);
                    urVar.h0(L4);
                }
                e21Var2 = mp0.F(e21Var2, (l71) L4);
                urVar.p(false);
            } else {
                urVar.X(-1884879399);
                urVar.p(false);
            }
            e21 d = b2.d(e21Var2);
            boolean z6 = ((i4 <= 1048576 || !urVar.f(ex1Var)) && (i2 & 1572864) != 1048576) ? false : z2;
            Object L5 = urVar.L();
            if (z6 || L5 == obj2) {
                L5 = new h8(ex1Var, 12);
                urVar.h0(L5);
            }
            e21 h = mp0.h(f2.u(d, n4Var, (se0) L5), n4Var, (!z || ex1Var.c() == fx1.e) ? false : z2, v11Var);
            boolean f5 = urVar.f(g);
            Object L6 = urVar.L();
            if (f5 || L6 == obj2) {
                L6 = new wh(g, 5);
                urVar.h0(L6);
            }
            e21 a2 = ou1.a(h, false, (oe0) L6);
            int g2 = (int) n4Var.j.g();
            if (g2 < 0) {
                g2 = 0;
            }
            e21 D = sn0.D(a2, new v90(g2));
            boolean z7 = ((i4 <= 1048576 || !urVar.f(ex1Var)) && (i2 & 1572864) != 1048576) ? false : z2;
            if ((i2 & 112) != 32) {
                yaVar2 = yaVar;
                if (!urVar.h(yaVar2)) {
                    z2 = false;
                }
            } else {
                yaVar2 = yaVar;
            }
            boolean z8 = z7 | z2;
            Object L7 = urVar.L();
            if (z8 || L7 == obj2) {
                L7 = new i(20, ex1Var, yaVar2);
                urVar.h0(L7);
            }
            int i5 = i3 << 6;
            l42.a(d6.x(d6.x(D, (oe0) L7), new dj(ex1Var, 0)), kw1Var, j, j2, f2, 0.0f, go.N(1144070092, new yk(se0Var2, yaVar2, ex1Var, se0Var, de0Var2, gvVar, z, fqVar), urVar), urVar, ((i2 >> 24) & 112) | 12582912 | (i5 & 896) | (i5 & 7168) | (i5 & 57344), 96);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0(gvVar, de0Var, de0Var2, e21Var, ex1Var, f, z, kw1Var, j, j2, f2, se0Var, se0Var2, fqVar, i) { // from class: l11
                public final /* synthetic */ gv f;
                public final /* synthetic */ de0 g;
                public final /* synthetic */ de0 h;
                public final /* synthetic */ e21 i;
                public final /* synthetic */ ex1 j;
                public final /* synthetic */ float k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ kw1 m;
                public final /* synthetic */ long n;
                public final /* synthetic */ long o;
                public final /* synthetic */ float p;
                public final /* synthetic */ se0 q;
                public final /* synthetic */ se0 r;
                public final /* synthetic */ fq s;

                @Override // defpackage.se0
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int b0 = lo.b0(71);
                    x11.b(ya.this, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (ur) obj5, b0);
                    return od2.a;
                }
            };
        }
    }

    public static final void c(final long j, final de0 de0Var, final boolean z, final boolean z2, ur urVar, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        float f;
        boolean z4;
        boolean z5;
        urVar.Y(-391613911);
        if (urVar.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (urVar.h(de0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (urVar.g(z)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (urVar.g(z2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        boolean z6 = true;
        int i10 = 0;
        if ((i9 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (urVar.O(i9 & 1, z3)) {
            if (j != 16) {
                urVar.X(-1438602166);
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                Object a2 = ab.a(f, fp.a0(u21.g, urVar), urVar, 0, 28);
                String g = nq1.g(R.string.close_sheet, urVar);
                e21 e21Var = b21.a;
                Object obj = or.a;
                if (z2) {
                    urVar.X(-1438303419);
                    int i11 = i9 & 112;
                    if (i11 == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Object L = urVar.L();
                    if (z4 || L == obj) {
                        L = new w11(de0Var, 0);
                        urVar.h0(L);
                    }
                    e21 a3 = s42.a(e21Var, de0Var, (PointerInputEventHandler) L);
                    boolean f2 = urVar.f(g);
                    if (i11 == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z7 = z5 | f2;
                    Object L2 = urVar.L();
                    if (z7 || L2 == obj) {
                        L2 = new m11(g, de0Var, 0);
                        urVar.h0(L2);
                    }
                    e21Var = ou1.a(a3, true, (oe0) L2);
                    urVar.p(false);
                } else {
                    urVar.X(-1437877231);
                    urVar.p(false);
                }
                e21 d = hy1.c.d(e21Var);
                if ((i9 & 14) != 4) {
                    z6 = false;
                }
                boolean f3 = urVar.f(a2) | z6;
                Object L3 = urVar.L();
                if (f3 || L3 == obj) {
                    L3 = new n11(a2, i10, j);
                    urVar.h0(L3);
                }
                f2.c(d, (oe0) L3, urVar, 0);
            } else {
                urVar.X(-1461035719);
            }
            urVar.p(false);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0(j, de0Var, z, z2, i) { // from class: o11
                public final /* synthetic */ long e;
                public final /* synthetic */ de0 f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;

                @Override // defpackage.se0
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int b0 = lo.b0(1);
                    x11.c(this.e, this.f, this.g, this.h, (ur) obj2, b0);
                    return od2.a;
                }
            };
        }
    }

    public static final float d(io1 io1Var, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (io1Var.r >> 32));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (lo.Q(0.0f, Math.min(io1Var.s.a() * 48.0f, intBitsToFloat), f) / intBitsToFloat);
    }

    public static final float e(io1 io1Var, float f) {
        float intBitsToFloat = Float.intBitsToFloat((int) (io1Var.r & 4294967295L));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (lo.Q(0.0f, Math.min(io1Var.s.a() * 24.0f, intBitsToFloat), f) / intBitsToFloat);
    }

    public static final ex1 f(int i, int i2, ur urVar) {
        final boolean z;
        final int i3 = 1;
        final int i4 = 0;
        if ((i2 & 1) != 0) {
            z = false;
        } else {
            z = true;
        }
        Object L = urVar.L();
        Object obj = or.a;
        Object obj2 = L;
        if (L == obj) {
            Object mm0Var = new mm0(18);
            urVar.h0(mm0Var);
            obj2 = mm0Var;
        }
        final oe0 oe0Var = (oe0) obj2;
        int i5 = (i & 14) | 384;
        dc2 dc2Var = bx1.a;
        final float f = cj.c;
        final float f2 = cj.d;
        final c00 c00Var = (c00) urVar.j(is.h);
        boolean f3 = urVar.f(c00Var) | urVar.c(f);
        Object L2 = urVar.L();
        Object obj3 = L2;
        if (f3 || L2 == obj) {
            Object obj4 = new de0() { // from class: ww1
                @Override // defpackage.de0
                public final Object invoke() {
                    float W;
                    int i6 = i4;
                    float f4 = f;
                    c00 c00Var2 = c00Var;
                    switch (i6) {
                        case 0:
                            W = c00Var2.W(f4);
                            break;
                        default:
                            W = c00Var2.W(f4);
                            break;
                    }
                    return Float.valueOf(W);
                }
            };
            urVar.h0(obj4);
            obj3 = obj4;
        }
        final de0 de0Var = (de0) obj3;
        boolean f4 = urVar.f(c00Var) | urVar.c(f2);
        Object L3 = urVar.L();
        Object obj5 = L3;
        if (f4 || L3 == obj) {
            Object obj6 = new de0() { // from class: ww1
                @Override // defpackage.de0
                public final Object invoke() {
                    float W;
                    int i6 = i3;
                    float f42 = f2;
                    c00 c00Var2 = c00Var;
                    switch (i6) {
                        case 0:
                            W = c00Var2.W(f42);
                            break;
                        default:
                            W = c00Var2.W(f42);
                            break;
                    }
                    return Float.valueOf(W);
                }
            };
            urVar.h0(obj6);
            obj5 = obj6;
        }
        final de0 de0Var2 = (de0) obj5;
        Object[] objArr = {Boolean.valueOf(z), oe0Var, Boolean.FALSE};
        sl0 sl0Var = new sl0(new ir1(22), new r00(z, de0Var, de0Var2, oe0Var));
        if ((((i5 & 14) ^ 6) <= 4 || !urVar.g(z)) && (i5 & 6) != 4) {
            i3 = 0;
        }
        int i6 = (urVar.f(de0Var) ? 1 : 0) | i3 | (urVar.f(de0Var2) ? 1 : 0) | (urVar.f(oe0Var) ? 1 : 0) | (urVar.g(false) ? 1 : 0);
        Object L4 = urVar.L();
        if (i6 != 0 || L4 == obj) {
            final fx1 fx1Var = fx1.e;
            Object obj7 = new de0(z, de0Var, de0Var2, fx1Var, oe0Var) { // from class: xw1
                public final /* synthetic */ boolean e;
                public final /* synthetic */ de0 f;
                public final /* synthetic */ fx1 g;
                public final /* synthetic */ oe0 h;

                {
                    this.g = fx1Var;
                    this.h = oe0Var;
                }

                @Override // defpackage.de0
                public final Object invoke() {
                    return new ex1(this.e, this.f, this.g, this.h);
                }
            };
            urVar.h0(obj7);
            L4 = obj7;
        }
        return (ex1) go.Q(objArr, sl0Var, (de0) L4, urVar, 0);
    }
}
