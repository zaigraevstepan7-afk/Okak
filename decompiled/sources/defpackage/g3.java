package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.topjohnwu.superuser.internal.HiddenAPIs;
import com.topjohnwu.superuser.nio.FileSystemManager;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class g3 implements wu, qk, ho1, w02, e42 {
    public final /* synthetic */ int e;
    public static final ki f = new ki(-1.0f, -1.0f);
    public static final ki g = new ki(0.0f, -1.0f);
    public static final ki h = new ki(1.0f, -1.0f);
    public static final ki i = new ki(-1.0f, 0.0f);
    public static final ki j = new ki(0.0f, 0.0f);
    public static final ki k = new ki(1.0f, 0.0f);
    public static final ki l = new ki(-1.0f, 1.0f);
    public static final ki m = new ki(0.0f, 1.0f);
    public static final ki n = new ki(1.0f, 1.0f);
    public static final ji o = new ji(-1.0f);
    public static final ji p = new ji(0.0f);
    public static final ji q = new ji(1.0f);
    public static final ii r = new ii(-1.0f);
    public static final ii s = new ii(0.0f);
    public static final ii t = new ii(1.0f);
    public static final g3 u = new g3(1);
    public static final se v = new se(6);
    public static final q6 w = new q6(1);
    public static final q6 x = new q6(2);
    public static final /* synthetic */ g3 y = new g3(4);
    public static final /* synthetic */ g3 z = new g3(5);
    public static final g3 A = new g3(6);
    public static final g3 B = new g3(7);
    public static final g3 C = new g3(8);
    public static final g3 D = new g3(9);
    public static final g3 E = new g3(10);
    public static final jq0 F = jq0.e;
    public static final d00 G = new d00(1.0f, 1.0f);
    public static final g3 H = new g3(11);
    public static final g3 I = new g3(12);
    public static final g3 J = new g3(13);
    public static final g3 K = new g3(14);
    public static final pl1 L = new pl1(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final g3 M = new g3(16);
    public static final /* synthetic */ g3 N = new g3(18);
    public static final /* synthetic */ g3 O = new g3(19);
    public static final /* synthetic */ g3 P = new g3(20);
    public static final /* synthetic */ g3 Q = new g3(21);
    public static final g3 R = new g3(22);
    public static final g3 S = new g3(23);
    public static final g3 T = new g3(24);
    public static final g3 U = new g3(25);
    public static final g3 V = new g3(26);
    public static final g3 W = new g3(27);
    public static final g3 X = new g3(28);
    public static final /* synthetic */ g3 Y = new g3(29);

    public /* synthetic */ g3(int i2) {
        this.e = i2;
    }

    public static c72 h(int i2, ur urVar) {
        return i((mo) urVar.j(oo.a), urVar);
    }

    public static c72 i(mo moVar, ur urVar) {
        boolean z2;
        c72 c72Var = moVar.h0;
        if (c72Var == null) {
            urVar.X(390452338);
            urVar.p(false);
            c72Var = null;
            z2 = false;
        } else {
            urVar.X(390452339);
            e92 e92Var = (e92) urVar.j(f92.a);
            if (sn0.r(c72Var.k, e92Var)) {
                z2 = false;
            } else {
                c72Var = c72Var.a(c72Var.a, c72Var.b, c72Var.c, c72Var.d, c72Var.e, c72Var.f, c72Var.g, c72Var.h, c72Var.i, c72Var.j, e92Var, c72Var.l, c72Var.m, c72Var.n, c72Var.o, c72Var.p, c72Var.q, c72Var.r, c72Var.s, c72Var.t, c72Var.u, c72Var.v, c72Var.w, c72Var.x, c72Var.y, c72Var.z, c72Var.A, c72Var.B, c72Var.C, c72Var.D, c72Var.E, c72Var.F, c72Var.G, c72Var.H, c72Var.I, c72Var.J, c72Var.K, c72Var.L, c72Var.M, c72Var.N, c72Var.O, c72Var.P, c72Var.Q);
                moVar.h0 = c72Var;
                z2 = false;
            }
            urVar.p(z2);
        }
        if (c72Var == null) {
            urVar.X(-1788321191);
            long d = oo.d(moVar, bf.A0);
            long d2 = oo.d(moVar, bf.G0);
            no noVar = bf.n0;
            long b = co.b(oo.d(moVar, noVar), 0.38f);
            long d3 = oo.d(moVar, bf.u0);
            long j2 = co.f;
            long d4 = oo.d(moVar, bf.m0);
            long d5 = oo.d(moVar, bf.t0);
            e92 e92Var2 = (e92) urVar.j(f92.a);
            long d6 = oo.d(moVar, bf.D0);
            long d7 = oo.d(moVar, bf.M0);
            long b2 = co.b(oo.d(moVar, bf.q0), 0.12f);
            long d8 = oo.d(moVar, bf.x0);
            long d9 = oo.d(moVar, bf.C0);
            long d10 = oo.d(moVar, bf.L0);
            long b3 = co.b(oo.d(moVar, bf.p0), 0.38f);
            long d11 = oo.d(moVar, bf.w0);
            long d12 = oo.d(moVar, bf.F0);
            long d13 = oo.d(moVar, bf.O0);
            long b4 = co.b(oo.d(moVar, bf.s0), 0.38f);
            long d14 = oo.d(moVar, bf.z0);
            long d15 = oo.d(moVar, bf.B0);
            long d16 = oo.d(moVar, bf.K0);
            long b5 = co.b(oo.d(moVar, bf.o0), 0.38f);
            long d17 = oo.d(moVar, bf.v0);
            no noVar2 = bf.H0;
            long d18 = oo.d(moVar, noVar2);
            long d19 = oo.d(moVar, noVar2);
            long b6 = co.b(oo.d(moVar, noVar), 0.38f);
            long d20 = oo.d(moVar, noVar2);
            long d21 = oo.d(moVar, bf.E0);
            long d22 = oo.d(moVar, bf.N0);
            long b7 = co.b(oo.d(moVar, bf.r0), 0.38f);
            long d23 = oo.d(moVar, bf.y0);
            no noVar3 = bf.I0;
            long d24 = oo.d(moVar, noVar3);
            long d25 = oo.d(moVar, noVar3);
            long b8 = co.b(oo.d(moVar, noVar3), 0.38f);
            long d26 = oo.d(moVar, noVar3);
            no noVar4 = bf.J0;
            c72 c72Var2 = new c72(d, d2, b, d3, j2, j2, j2, j2, d4, d5, e92Var2, d6, d7, b2, d8, d9, d10, b3, d11, d12, d13, b4, d14, d15, d16, b5, d17, d18, d19, b6, d20, d21, d22, b7, d23, d24, d25, b8, d26, oo.d(moVar, noVar4), oo.d(moVar, noVar4), co.b(oo.d(moVar, noVar4), 0.38f), oo.d(moVar, noVar4));
            moVar.h0 = c72Var2;
            urVar.p(z2);
            return c72Var2;
        }
        urVar.X(-1788515437);
        urVar.p(z2);
        return c72Var;
    }

    public static long j() {
        float f2 = sn0.M;
        return go.e(sn0.N + f2 + f2, 40.0f);
    }

    @Override // defpackage.qk
    public c00 a() {
        return G;
    }

    @Override // defpackage.e42
    public void b(d42 d42Var) {
        d42Var.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(final boolean r25, final defpackage.r31 r26, defpackage.e21 r27, final defpackage.c72 r28, final defpackage.kw1 r29, float r30, float r31, defpackage.ur r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g3.c(boolean, r31, e21, c72, kw1, float, float, ur, int, int):void");
    }

    @Override // defpackage.qk
    public long d() {
        return 9205357640488583168L;
    }

    @Override // defpackage.e42
    public boolean e(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.w02
    public boolean f(Object obj, Object obj2) {
        return false;
    }

    public void g(final String str, final se0 se0Var, final boolean z2, final boolean z3, final y61 y61Var, final r31 r31Var, final se0 se0Var2, final se0 se0Var3, final se0 se0Var4, final se0 se0Var5, final c72 c72Var, pc1 pc1Var, final fq fqVar, ur urVar, final int i2) {
        int i3;
        boolean z4;
        boolean z5;
        final pc1 pc1Var2;
        pc1 rc1Var;
        int i4;
        fq fqVar2;
        urVar.Y(-1732281618);
        if ((i2 & 6) == 0) {
            i3 = (urVar.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= urVar.h(se0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z4 = z2;
            i3 |= urVar.g(z4) ? 256 : 128;
        } else {
            z4 = z2;
        }
        if ((i2 & 3072) == 0) {
            z5 = z3;
            i3 |= urVar.g(z5) ? 2048 : 1024;
        } else {
            z5 = z3;
        }
        int i5 = i2 & 24576;
        int i6 = SharedConstants.DefaultBufferSize;
        if (i5 == 0) {
            i3 |= urVar.f(y61Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= urVar.f(r31Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= urVar.g(false) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= urVar.h(se0Var2) ? 8388608 : HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= urVar.h(se0Var3) ? FileSystemManager.MODE_TRUNCATE : FileSystemManager.MODE_APPEND;
        }
        if ((i2 & FileSystemManager.MODE_READ_WRITE) == 0) {
            i3 |= urVar.h(se0Var4) ? FileSystemManager.MODE_WRITE_ONLY : FileSystemManager.MODE_READ_ONLY;
        }
        int i7 = 14155776 | (urVar.h(se0Var5) ? 4 : 2) | (urVar.h(null) ? 32 : 16) | (urVar.h(null) ? 256 : 128) | (urVar.h(null) ? 2048 : 1024);
        if (urVar.f(c72Var)) {
            i6 = 16384;
        }
        int i8 = i7 | i6 | 65536;
        if (urVar.O(i3 & 1, ((i3 & 306783379) == 306783378 && (i8 & 4793491) == 4793490) ? false : true)) {
            urVar.T();
            if ((i2 & 1) != 0 && !urVar.y()) {
                urVar.R();
                i4 = i8 & (-458753);
                rc1Var = pc1Var;
            } else {
                rc1Var = new rc1(16.0f, 16.0f, 16.0f, 16.0f);
                i4 = i8 & (-458753);
            }
            urVar.q();
            boolean z6 = ((i3 & 14) == 4) | ((i3 & 57344) == 16384);
            Object L2 = urVar.L();
            if (z6 || L2 == or.a) {
                rc rcVar = new rc(str);
                y61Var.getClass();
                L2 = new db2(rcVar, b91.a);
                urVar.h0(L2);
            }
            String str2 = ((db2) L2).a.f;
            o72 o72Var = new o72();
            if (se0Var2 == null) {
                urVar.X(1927042940);
                urVar.p(false);
                fqVar2 = null;
            } else {
                urVar.X(1927042941);
                fq N2 = go.N(-1459717586, new ol(se0Var2, 5), urVar);
                urVar.p(false);
                fqVar2 = N2;
            }
            int i9 = i3 >> 9;
            int i10 = i4 << 21;
            pc1 pc1Var3 = rc1Var;
            fq fqVar3 = fqVar2;
            pp1.a(str2, se0Var, o72Var, fqVar3, se0Var3, se0Var4, se0Var5, z5, z4, r31Var, pc1Var3, c72Var, fqVar, urVar, ((i3 << 3) & 896) | 6 | (i9 & 458752) | (i9 & 3670016) | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192), (i3 & 896) | ((i4 >> 9) & 14) | ((i3 >> 6) & 112) | (i9 & 7168) | ((i3 >> 3) & 57344) | ((i4 << 6) & 3670016) | 12582912);
            pc1Var2 = pc1Var3;
        } else {
            urVar.R();
            pc1Var2 = pc1Var;
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new se0() { // from class: yb1
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int b0 = lo.b0(i2 | 1);
                    g3.this.g(str, se0Var, z2, z3, y61Var, r31Var, se0Var2, se0Var3, se0Var4, se0Var5, c72Var, pc1Var2, fqVar, (ur) obj, b0);
                    return od2.a;
                }
            };
        }
    }

    @Override // defpackage.qk
    public jq0 getLayoutDirection() {
        return F;
    }

    public String toString() {
        switch (this.e) {
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return "NeverEqualPolicy";
            default:
                return super.toString();
        }
    }
}
