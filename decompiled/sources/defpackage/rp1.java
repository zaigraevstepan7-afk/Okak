package defpackage;

import android.graphics.Path;
import android.text.Spanned;
import com.topjohnwu.superuser.internal.HiddenAPIs;
import com.topjohnwu.superuser.nio.FileSystemManager;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.internal.SharedConstants;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class rp1 {
    public static ij0 a;
    public static ij0 b;

    public static final void a(fq fqVar, se0 se0Var, se0 se0Var2, k92 k92Var, long j, long j2, ur urVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        se0 se0Var3;
        long j3;
        k92 k92Var2;
        se0 se0Var4;
        float f;
        boolean z2;
        int i8;
        boolean z3;
        urVar.Y(-931325388);
        if (urVar.h(fqVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (urVar.h(se0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (urVar.h(se0Var2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i11 = i10 | i4;
        if (urVar.f(k92Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (urVar.e(j)) {
            i6 = 16384;
        } else {
            i6 = SharedConstants.DefaultBufferSize;
        }
        int i13 = i12 | i6;
        if (urVar.e(j2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7;
        if ((74899 & i14) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i14 & 1, z)) {
            if (se0Var2 == null) {
                f = 8.0f;
            } else {
                f = 0.0f;
            }
            b21 b21Var = b21.a;
            e21 O = sn0.O(b21Var, 16.0f, 0.0f, f, 0.0f, 10);
            Object L = urVar.L();
            if (L == or.a) {
                L = new b7(7);
                urVar.h0(L);
            }
            j01 j01Var = (j01) L;
            int x = io.x(urVar);
            sf1 l = urVar.l();
            e21 Q = fp.Q(urVar, O);
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
            e21 M = sn0.M(sn0.G(b21Var, "text"), 0.0f, 6.0f, 1);
            ki kiVar = g3.f;
            j01 d = hj.d(kiVar, false);
            int x2 = io.x(urVar);
            sf1 l2 = urVar.l();
            e21 Q2 = fp.Q(urVar, M);
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, gbVar, d);
            op1.q(urVar, gbVar2, l2);
            if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x2))) {
                l90.s(x2, urVar, x2, gbVar3);
            }
            op1.q(urVar, gbVar4, Q2);
            fqVar.invoke(urVar, Integer.valueOf(i14 & 14));
            urVar.p(true);
            if (se0Var != null) {
                urVar.X(-1014168049);
                e21 G = sn0.G(b21Var, "action");
                j01 d2 = hj.d(kiVar, false);
                int x3 = io.x(urVar);
                i8 = 8;
                sf1 l3 = urVar.l();
                e21 Q3 = fp.Q(urVar, G);
                urVar.a0();
                if (urVar.S) {
                    urVar.k(hsVar);
                } else {
                    urVar.k0();
                }
                op1.q(urVar, gbVar, d2);
                op1.q(urVar, gbVar2, l3);
                if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x3))) {
                    l90.s(x3, urVar, x3, gbVar3);
                }
                op1.q(urVar, gbVar4, Q3);
                k92Var2 = k92Var;
                se0Var3 = se0Var;
                vn.c(new zj1[]{et.a.a(new co(j)), t82.a.a(k92Var2)}, se0Var3, urVar, 8 | (i14 & 112));
                urVar.p(true);
                z2 = false;
            } else {
                se0Var3 = se0Var;
                k92Var2 = k92Var;
                z2 = false;
                i8 = 8;
                urVar.X(-1027731913);
            }
            urVar.p(z2);
            if (se0Var2 != null) {
                urVar.X(-1013804481);
                e21 G2 = sn0.G(b21Var, "dismissAction");
                j01 d3 = hj.d(kiVar, z2);
                int x4 = io.x(urVar);
                sf1 l4 = urVar.l();
                e21 Q4 = fp.Q(urVar, G2);
                urVar.a0();
                if (urVar.S) {
                    urVar.k(hsVar);
                } else {
                    urVar.k0();
                }
                op1.q(urVar, gbVar, d3);
                op1.q(urVar, gbVar2, l4);
                if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x4))) {
                    l90.s(x4, urVar, x4, gbVar3);
                }
                op1.q(urVar, gbVar4, Q4);
                j3 = j2;
                se0Var4 = se0Var2;
                vn.b(et.a.a(new co(j3)), se0Var4, urVar, i8 | ((i14 >> 3) & 112));
                z3 = true;
                urVar.p(true);
                z2 = false;
            } else {
                se0Var4 = se0Var2;
                j3 = j2;
                z3 = true;
                urVar.X(-1027731913);
            }
            urVar.p(z2);
            urVar.p(z3);
        } else {
            se0Var3 = se0Var;
            j3 = j2;
            k92Var2 = k92Var;
            se0Var4 = se0Var2;
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new vz1(fqVar, se0Var3, se0Var4, k92Var2, j, j3, i);
        }
    }

    public static final void b(final e21 e21Var, final se0 se0Var, final se0 se0Var2, final kw1 kw1Var, final long j, final long j2, final long j3, final long j4, final fq fqVar, ur urVar, final int i) {
        int i2;
        se0 se0Var3;
        se0 se0Var4;
        kw1 kw1Var2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        urVar.Y(-1218779924);
        if ((i & 6) == 0) {
            if (urVar.f(e21Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            se0Var3 = se0Var;
            if (urVar.h(se0Var3)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        } else {
            se0Var3 = se0Var;
        }
        if ((i & 384) == 0) {
            se0Var4 = se0Var2;
            if (urVar.h(se0Var4)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i2 |= i10;
        } else {
            se0Var4 = se0Var2;
        }
        if ((i & 3072) == 0) {
            if (urVar.g(false)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((i & 24576) == 0) {
            kw1Var2 = kw1Var;
            if (urVar.f(kw1Var2)) {
                i8 = 16384;
            } else {
                i8 = SharedConstants.DefaultBufferSize;
            }
            i2 |= i8;
        } else {
            kw1Var2 = kw1Var;
        }
        if ((196608 & i) == 0) {
            if (urVar.e(j)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i2 |= i7;
        }
        if ((1572864 & i) == 0) {
            if (urVar.e(j2)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((12582912 & i) == 0) {
            if (urVar.e(j3)) {
                i5 = 8388608;
            } else {
                i5 = HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
            }
            i2 |= i5;
        }
        if ((100663296 & i) == 0) {
            if (urVar.e(j4)) {
                i4 = FileSystemManager.MODE_TRUNCATE;
            } else {
                i4 = FileSystemManager.MODE_APPEND;
            }
            i2 |= i4;
        }
        if ((805306368 & i) == 0) {
            if (urVar.h(fqVar)) {
                i3 = FileSystemManager.MODE_WRITE_ONLY;
            } else {
                i3 = FileSystemManager.MODE_READ_ONLY;
            }
            i2 |= i3;
        }
        if ((306783379 & i2) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
            }
            urVar.q();
            float f = mp0.P;
            fq N = go.N(-1343524879, new tw0(se0Var3, fqVar, se0Var4, j3, j4), urVar);
            int i13 = (i2 & 14) | 12779520;
            int i14 = i2 >> 9;
            kw1 kw1Var3 = kw1Var2;
            l42.a(e21Var, kw1Var3, j, j2, 0.0f, f, N, urVar, (i14 & 7168) | i13 | (i14 & 112) | (i14 & 896), 80);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0() { // from class: uz1
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int b0 = lo.b0(i | 1);
                    rp1.b(e21.this, se0Var, se0Var2, kw1Var, j, j2, j3, j4, fqVar, (ur) obj, b0);
                    return od2.a;
                }
            };
        }
    }

    public static final void c(final pz1 pz1Var, e21 e21Var, kw1 kw1Var, long j, long j2, long j3, long j4, long j5, ur urVar, final int i) {
        int i2;
        boolean z;
        final e21 e21Var2;
        final kw1 kw1Var2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        long e;
        long e2;
        long e3;
        long e4;
        long e5;
        int i3;
        e21 e21Var3;
        long j11;
        fq fqVar;
        int i4;
        urVar.Y(274621471);
        if ((i & 6) == 0) {
            if (urVar.f(pz1Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 432;
        if ((i & 3072) == 0) {
            i5 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i5 |= SharedConstants.DefaultBufferSize;
        }
        if ((196608 & i) == 0) {
            i5 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i5 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i5 |= HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
        }
        if ((100663296 & i) == 0) {
            i5 |= FileSystemManager.MODE_APPEND;
        }
        int i6 = 1;
        if ((38347923 & i5) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i5 & 1, z)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                kw1Var2 = kw1Var;
                e = j;
                e2 = j2;
                e3 = j3;
                e4 = j4;
                e5 = j5;
                i3 = i5 & (-268434433);
                e21Var3 = e21Var;
            } else {
                kw1 b2 = pw1.b(mp0.Q, urVar);
                e = oo.e(mp0.O, urVar);
                e2 = oo.e(mp0.S, urVar);
                no noVar = mp0.M;
                e3 = oo.e(noVar, urVar);
                e4 = oo.e(noVar, urVar);
                e5 = oo.e(mp0.R, urVar);
                i3 = i5 & (-268434433);
                kw1Var2 = b2;
                e21Var3 = b21.a;
            }
            urVar.q();
            String str = pz1Var.a.b;
            int i7 = i3;
            if (str != null) {
                urVar.X(-663827885);
                long j12 = e3;
                j11 = j12;
                fqVar = go.N(-1378313599, new t6(j12, pz1Var, str, 5), urVar);
                urVar.p(false);
            } else {
                j11 = e3;
                urVar.X(-663528921);
                urVar.p(false);
                fqVar = null;
            }
            pz1Var.a.getClass();
            urVar.X(-662598425);
            urVar.p(false);
            long j13 = e4;
            j6 = e;
            j7 = e2;
            long j14 = e5;
            b(sn0.K(e21Var3, 12.0f), fqVar, null, kw1Var2, j6, j7, j13, j14, go.N(-1266389126, new mz1(pz1Var, i6), urVar), urVar, ((i7 << 3) & 7168) | FileSystemManager.MODE_READ_WRITE);
            j10 = j14;
            e21Var2 = e21Var3;
            j9 = j13;
            j8 = j11;
        } else {
            urVar.R();
            e21Var2 = e21Var;
            kw1Var2 = kw1Var;
            j6 = j;
            j7 = j2;
            j8 = j3;
            j9 = j4;
            j10 = j5;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0() { // from class: tz1
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int b0 = lo.b0(i | 1);
                    rp1.c(pz1.this, e21Var2, kw1Var2, j6, j7, j8, j9, j10, (ur) obj, b0);
                    return od2.a;
                }
            };
        }
    }

    public static final pl1 d(hg1 hg1Var, int i, db2 db2Var, w82 w82Var, boolean z, int i2) {
        pl1 pl1Var;
        float f;
        float f2;
        if (w82Var != null) {
            pl1Var = w82Var.c(db2Var.b.d(i));
        } else {
            pl1Var = pl1.e;
        }
        float f3 = pl1Var.a;
        int j0 = hg1Var.j0(2.0f);
        if (z) {
            f = (i2 - f3) - j0;
        } else {
            f = f3;
        }
        if (z) {
            f2 = i2 - f3;
        } else {
            f2 = j0 + f3;
        }
        return new pl1(f, pl1Var.b, f2, pl1Var.d);
    }

    public static final void e(i41 i41Var, Object obj, Object obj2) {
        boolean z;
        Object obj3;
        int f = i41Var.f(obj);
        if (f < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            obj3 = null;
        } else {
            obj3 = i41Var.c[f];
        }
        if (obj3 != null) {
            if (obj3 instanceof j41) {
                ((j41) obj3).a(obj2);
            } else if (obj3 != obj2) {
                j41 j41Var = new j41();
                j41Var.a(obj3);
                j41Var.a(obj2);
                obj2 = j41Var;
            }
            obj2 = obj3;
        }
        if (z) {
            int i = ~f;
            i41Var.b[i] = obj;
            i41Var.c[i] = obj2;
            return;
        }
        i41Var.c[f] = obj2;
    }

    public static i41 f() {
        long[] jArr = sr1.a;
        return new i41();
    }

    public static final long g() {
        return Thread.currentThread().getId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int h(int i, String str) {
        String str2;
        int i2;
        v50 k = k();
        Integer num = null;
        if (k != null) {
            boolean z = true;
            if (k.c() != 1) {
                z = false;
            }
            if (z) {
                go.m(str, "charSequence cannot be null");
                ld ldVar = k.e.b;
                ldVar.getClass();
                if (i < 0 || i >= str.length()) {
                    str2 = str;
                    i2 = -1;
                } else {
                    if (str instanceof Spanned) {
                        Spanned spanned = (Spanned) str;
                        lc2[] lc2VarArr = (lc2[]) spanned.getSpans(i, i + 1, lc2.class);
                        if (lc2VarArr.length > 0) {
                            i2 = spanned.getSpanEnd(lc2VarArr[0]);
                            str2 = str;
                        }
                    }
                    str2 = str;
                    i2 = ((d60) ldVar.p(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new d60(i))).g;
                }
                Integer valueOf = Integer.valueOf(i2);
                if (i2 != -1) {
                    num = valueOf;
                }
            } else {
                se.p("Not initialized yet");
                return 0;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    public static final int i(int i, String str) {
        v50 k = k();
        Integer num = null;
        if (k != null) {
            Integer valueOf = Integer.valueOf(k.b(str, Math.max(0, i - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final void j(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = wg0.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 != i5) {
                i4--;
            } else {
                return;
            }
        }
    }

    public static final v50 k() {
        if (v50.d()) {
            v50 a2 = v50.a();
            if (a2.c() == 1) {
                return a2;
            }
            return null;
        }
        return null;
    }

    public static final Object l(mu1 mu1Var, zu1 zu1Var) {
        Object g = mu1Var.e.g(zu1Var);
        if (g == null) {
            return null;
        }
        return g;
    }

    public static final ij0 m() {
        ij0 ij0Var = a;
        if (ij0Var != null) {
            return ij0Var;
        }
        hj0 hj0Var = new hj0("Rounded.SystemUpdate", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = me2.a;
        i12 i12Var = new i12(co.b);
        rg2 rg2Var = new rg2(21);
        rg2Var.s(17.0f, 1.01f);
        rg2Var.q(7.0f, 1.0f);
        rg2Var.i(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        rg2Var.E(18.0f);
        rg2Var.i(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        rg2Var.o(10.0f);
        rg2Var.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        rg2Var.q(19.0f, 3.0f);
        rg2Var.i(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
        rg2Var.f();
        rg2Var.s(17.0f, 19.0f);
        rg2Var.q(7.0f, 19.0f);
        rg2Var.q(7.0f, 5.0f);
        rg2Var.o(10.0f);
        rg2Var.E(14.0f);
        rg2Var.f();
        rg2Var.s(14.79f, 13.0f);
        rg2Var.q(13.0f, 13.0f);
        rg2Var.q(13.0f, 9.0f);
        rg2Var.i(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        rg2Var.w(-1.0f, 0.45f, -1.0f, 1.0f);
        rg2Var.E(4.0f);
        rg2Var.q(9.21f, 13.0f);
        rg2Var.i(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        rg2Var.r(2.79f, 2.79f);
        rg2Var.i(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        rg2Var.r(2.79f, -2.79f);
        rg2Var.i(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f);
        rg2Var.f();
        hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
        ij0 b2 = hj0Var.b();
        a = b2;
        return b2;
    }

    public static final ij0 n() {
        ij0 ij0Var = b;
        if (ij0Var != null) {
            return ij0Var;
        }
        hj0 hj0Var = new hj0("Rounded.Warning", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = me2.a;
        i12 i12Var = new i12(co.b);
        rg2 rg2Var = new rg2(21);
        rg2Var.s(4.47f, 21.0f);
        rg2Var.o(15.06f);
        rg2Var.i(1.54f, 0.0f, 2.5f, -1.67f, 1.73f, -3.0f);
        rg2Var.q(13.73f, 4.99f);
        rg2Var.i(-0.77f, -1.33f, -2.69f, -1.33f, -3.46f, 0.0f);
        rg2Var.q(2.74f, 18.0f);
        rg2Var.i(-0.77f, 1.33f, 0.19f, 3.0f, 1.73f, 3.0f);
        rg2Var.f();
        rg2Var.s(12.0f, 14.0f);
        rg2Var.i(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        rg2Var.E(-2.0f);
        rg2Var.i(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        rg2Var.w(1.0f, 0.45f, 1.0f, 1.0f);
        rg2Var.E(2.0f);
        rg2Var.i(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        rg2Var.f();
        rg2Var.s(13.0f, 18.0f);
        rg2Var.o(-2.0f);
        rg2Var.E(-2.0f);
        rg2Var.o(2.0f);
        rg2Var.E(2.0f);
        rg2Var.f();
        hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
        ij0 b2 = hj0Var.b();
        b = b2;
        return b2;
    }

    public static boolean o(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static final k01 p(qp1 qp1Var, int i, int i2, int i3, int i4, int i5, l01 l01Var, List list, ig1[] ig1VarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        float f;
        boolean z;
        int i11;
        long j;
        int i12;
        int i13;
        int i14;
        List list2 = list;
        long j2 = i5;
        int i15 = i7 - i6;
        int[] iArr2 = new int[i15];
        int i16 = i6;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        float f2 = 0.0f;
        while (i16 < i7) {
            e01 e01Var = (e01) list2.get(i16);
            float v = pp1.v(pp1.q(e01Var));
            if (v > 0.0f) {
                f2 += v;
                i18++;
                j = j2;
                i12 = i16;
            } else {
                int i21 = i3 - i19;
                ig1 ig1Var = ig1VarArr[i16];
                j = j2;
                if (ig1Var == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i12 = i16;
                        i13 = i18;
                        i14 = Integer.MAX_VALUE;
                    } else {
                        i12 = i16;
                        i13 = i18;
                        if (i21 < 0) {
                            i14 = 0;
                        } else {
                            i14 = i21;
                        }
                    }
                    ig1Var = e01Var.x(qp1Var.g(0, i14, i4, false));
                } else {
                    i12 = i16;
                    i13 = i18;
                }
                ig1 ig1Var2 = ig1Var;
                int j3 = qp1Var.j(ig1Var2);
                int i22 = qp1Var.i(ig1Var2);
                iArr2[i12 - i6] = j3;
                int i23 = i21 - j3;
                if (i23 < 0) {
                    i23 = 0;
                }
                i20 = Math.min(i5, i23);
                i19 += j3 + i20;
                i17 = Math.max(i17, i22);
                ig1VarArr[i12] = ig1Var2;
                i18 = i13;
            }
            i16 = i12 + 1;
            j2 = j;
        }
        long j4 = j2;
        if (i18 == 0) {
            i19 -= i20;
            i10 = 0;
        } else {
            if (i3 != Integer.MAX_VALUE) {
                i9 = i3;
            } else {
                i9 = i;
            }
            long j5 = (r22 - 1) * j4;
            long j6 = (i9 - i19) - j5;
            if (j6 < 0) {
                j6 = 0;
            }
            float f3 = ((float) j6) / f2;
            for (int i24 = i6; i24 < i7; i24++) {
                j6 -= Math.round(pp1.v(pp1.q((e01) list2.get(i24))) * f3);
            }
            int i25 = i6;
            int i26 = i17;
            int i27 = 0;
            while (i25 < i7) {
                if (ig1VarArr[i25] == null) {
                    e01 e01Var2 = (e01) list2.get(i25);
                    f = f3;
                    sp1 q = pp1.q(e01Var2);
                    float v2 = pp1.v(q);
                    if (v2 <= 0.0f) {
                        il0.b("All weights <= 0 should have placeables");
                    }
                    int signum = Long.signum(j6);
                    long j7 = j6 - signum;
                    int max = Math.max(0, Math.round(v2 * f) + signum);
                    if (q != null) {
                        z = q.b;
                    } else {
                        z = true;
                    }
                    if (z && max != Integer.MAX_VALUE) {
                        i11 = max;
                    } else {
                        i11 = 0;
                    }
                    ig1 x = e01Var2.x(qp1Var.g(i11, max, i4, true));
                    int j8 = qp1Var.j(x);
                    int i28 = qp1Var.i(x);
                    iArr2[i25 - i6] = j8;
                    i27 += j8;
                    int max2 = Math.max(i26, i28);
                    ig1VarArr[i25] = x;
                    i26 = max2;
                    j6 = j7;
                } else {
                    f = f3;
                }
                i25++;
                list2 = list;
                f3 = f;
            }
            i10 = (int) (i27 + j5);
            int i29 = i3 - i19;
            if (i10 < 0) {
                i10 = 0;
            }
            if (i10 > i29) {
                i10 = i29;
            }
            i17 = i26;
        }
        int i30 = i10 + i19;
        if (i30 < 0) {
            i30 = 0;
        }
        int max3 = Math.max(i30, i);
        int max4 = Math.max(i17, Math.max(i2, 0));
        int[] iArr3 = new int[i15];
        qp1Var.f(max3, iArr2, iArr3, l01Var);
        return qp1Var.h(ig1VarArr, l01Var, iArr3, max3, max4, iArr, i8, i6, i7);
    }

    public static final void q(n8 n8Var, vv0 vv0Var, float f, float f2) {
        boolean z;
        n8Var.h();
        Path path = n8Var.a;
        int a2 = vv0Var.a();
        boolean z2 = true;
        int i = 0;
        while (i < a2) {
            uv uvVar = (uv) vv0Var.get(i);
            if (z2) {
                float[] fArr = uvVar.a;
                n8Var.e(fArr[0], fArr[1]);
                z = false;
            } else {
                z = z2;
            }
            float[] fArr2 = uvVar.a;
            path.cubicTo(fArr2[2], fArr2[3], fArr2[4], fArr2[5], uvVar.a(), uvVar.b());
            i++;
            z2 = z;
        }
        path.close();
    }

    public static final boolean r(i41 i41Var, Object obj, Object obj2) {
        Object g = i41Var.g(obj);
        if (g == null) {
            return false;
        }
        if (g instanceof j41) {
            j41 j41Var = (j41) g;
            boolean l = j41Var.l(obj2);
            if (l && j41Var.g()) {
                i41Var.k(obj);
            }
            return l;
        }
        if (!g.equals(obj2)) {
            return false;
        }
        i41Var.k(obj);
        return true;
    }

    public static final void s(i41 i41Var, Object obj) {
        boolean z;
        long[] jArr = i41Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = i41Var.b[i4];
                            Object obj3 = i41Var.c[i4];
                            if (obj3 instanceof j41) {
                                j41 j41Var = (j41) obj3;
                                j41Var.l(obj);
                                z = j41Var.g();
                            } else if (obj3 == obj) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                i41Var.l(i4);
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

    public static n8 t(k21 k21Var, float f, n8 n8Var) {
        k21Var.getClass();
        vv0 v = xn.v();
        ArrayList arrayList = k21Var.a;
        int size = arrayList.size();
        uv uvVar = null;
        int i = 0;
        uv uvVar2 = null;
        while (i < size) {
            float[] fArr = new float[8];
            for (int i2 = 0; i2 < 8; i2++) {
                fArr[i2] = be2.c(((uv) ((xd1) arrayList.get(i)).e).a[i2], ((uv) ((xd1) arrayList.get(i)).f).a[i2], f);
            }
            uv uvVar3 = new uv(fArr);
            if (uvVar2 == null) {
                uvVar2 = uvVar3;
            }
            if (uvVar != null) {
                v.add(uvVar);
            }
            i++;
            uvVar = uvVar3;
        }
        if (uvVar != null && uvVar2 != null) {
            float[] fArr2 = uvVar.a;
            float f2 = fArr2[0];
            float f3 = fArr2[1];
            float f4 = fArr2[2];
            float f5 = fArr2[3];
            float f6 = fArr2[4];
            float f7 = fArr2[5];
            float[] fArr3 = uvVar2.a;
            v.add(xn.a(f2, f3, f4, f5, f6, f7, fArr3[0], fArr3[1]));
        }
        q(n8Var, xn.s(v), 0.0f, 0.0f);
        return n8Var;
    }

    public static final void u(String str, int i, String str2) {
        throw new IllegalArgumentException("Expected " + str2 + " at index " + i + ", but was '" + str.charAt(i) + '\'');
    }

    public static final kg2 v(cn cnVar, tg2 tg2Var, pg2 pg2Var, nv nvVar, ur urVar) {
        rg2 i;
        if (pg2Var != null) {
            sg2 e = tg2Var.e();
            nvVar.getClass();
            i = new rg2(e, pg2Var, nvVar);
        } else if (tg2Var instanceof tg0) {
            sg2 e2 = tg2Var.e();
            pg2 c = ((tg0) tg2Var).c();
            c.getClass();
            nvVar.getClass();
            i = new rg2(e2, c, nvVar);
        } else {
            i = wm1.i(tg2Var, null, 6);
        }
        return i.j(cnVar);
    }
}
