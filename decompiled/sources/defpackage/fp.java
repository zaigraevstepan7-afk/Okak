package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.window.BackEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class fp {
    public static ij0 a;

    public static String A(y50 y50Var, int i) {
        y50Var.getClass();
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            Context context = y50Var.a;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static kv1 B(r51 r51Var) {
        r51Var.getClass();
        return mv1.G(r51Var, new mm0(29));
    }

    public static final Class D(to0 to0Var) {
        Class b = ((bn) to0Var).b();
        b.getClass();
        return b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0019. Please report as an issue. */
    public static final Class E(to0 to0Var) {
        to0Var.getClass();
        Class b = ((bn) to0Var).b();
        if (b.isPrimitive()) {
            String name = b.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return b;
    }

    public static final int G(g31 g31Var, long j, hg2 hg2Var) {
        float f;
        if (hg2Var != null) {
            f = hg2Var.g();
        } else {
            f = 0.0f;
        }
        int i = (int) (4294967295L & j);
        int e = g31Var.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) >= g31Var.f(e) - f && Float.intBitsToFloat(i) <= g31Var.b(e) + f) {
            int i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) >= (-f) && Float.intBitsToFloat(i2) <= g31Var.d + f) {
                return e;
            }
            return -1;
        }
        return -1;
    }

    public static final long H(gu0 gu0Var, pl1 pl1Var, int i) {
        g31 g31Var;
        y61 y61Var = xl1.r;
        x82 d = gu0Var.d();
        if (d != null) {
            g31Var = d.a.b;
        } else {
            g31Var = null;
        }
        iq0 c = gu0Var.c();
        if (g31Var != null && c != null) {
            return g31Var.h(pl1Var.i(c.J(0L)), i, y61Var);
        }
        return d92.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void I(b40 b40Var) {
        if (((d21) b40Var).e.r) {
            hp.K(b40Var, 1).c1();
        }
    }

    public static final boolean J(gv gvVar) {
        go0 go0Var = (go0) gvVar.A().H(g3.O);
        if (go0Var != null) {
            return go0Var.b();
        }
        return true;
    }

    public static final boolean K(ar0 ar0Var) {
        int ordinal = ar0Var.K.d.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            ar0 v = ar0Var.v();
                            if (v != null) {
                                return K(v);
                            }
                            se.h("no parent for idle node");
                            return false;
                        }
                        se.m();
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean L(int i) {
        int type = Character.getType(i);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    public static final boolean M(int i) {
        if (!Character.isWhitespace(i) && i != 160) {
            return false;
        }
        return true;
    }

    public static final boolean N(int i) {
        int type;
        if (M(i) && (type = Character.getType(i)) != 14 && type != 13 && i != 10) {
            return true;
        }
        return false;
    }

    public static final sl0 O(se0 se0Var, oe0 oe0Var) {
        v2 v2Var = new v2(2, se0Var);
        fc2.t(1, oe0Var);
        return new sl0(v2Var, oe0Var);
    }

    public static final e21 P(ur urVar, e21 e21Var) {
        if (e21Var.c(i5.s)) {
            return e21Var;
        }
        urVar.S(null, 1219399079, 0, null);
        e21 e21Var2 = (e21) e21Var.a(new t(urVar, 5), b21.a);
        urVar.p(false);
        return e21Var2;
    }

    public static final e21 Q(ur urVar, e21 e21Var) {
        urVar.X(439770924);
        e21 P = P(urVar, e21Var);
        urVar.p(false);
        return P;
    }

    public static final long R(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static e21 S(e21 e21Var, u8 u8Var) {
        return e21Var.d(new mh1(u8Var));
    }

    public static final void T(pl plVar, vt vtVar, boolean z) {
        Object f;
        jd2 jd2Var;
        Object obj = pl.k.get(plVar);
        Throwable d = plVar.d(obj);
        if (d != null) {
            f = new fo1(d);
        } else {
            f = plVar.f(obj);
        }
        if (z) {
            vtVar.getClass();
            g10 g10Var = (g10) vtVar;
            wt wtVar = g10Var.i;
            Object obj2 = g10Var.k;
            xu context = wtVar.getContext();
            Object Q = mp0.Q(context, obj2);
            if (Q != mp0.y0) {
                jd2Var = io.N(wtVar, context, Q);
            } else {
                jd2Var = null;
            }
            try {
                wtVar.resumeWith(f);
                if (jd2Var != null && !jd2Var.h0()) {
                    return;
                }
                mp0.J(context, Q);
                return;
            } catch (Throwable th) {
                if (jd2Var == null || jd2Var.h0()) {
                    mp0.J(context, Q);
                }
                throw th;
            }
        }
        vtVar.resumeWith(f);
    }

    public static final e21 U(float f) {
        b21 b21Var = b21.a;
        if (f == 0.0f) {
            return b21Var;
        }
        return d6.z(b21Var, 0.0f, f, null, 524031);
    }

    public static final long V(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final Rect W(bn0 bn0Var) {
        return new Rect(bn0Var.a, bn0Var.b, bn0Var.c, bn0Var.d);
    }

    public static final RectF X(pl1 pl1Var) {
        return new RectF(pl1Var.a, pl1Var.b, pl1Var.c, pl1Var.d);
    }

    public static final pl1 Y(Rect rect) {
        return new pl1(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final pl1 Z(RectF rectF) {
        return new pl1(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final void a(b82 b82Var, fq fqVar, ur urVar, int i) {
        int i2;
        boolean z;
        e21 d0;
        int i3;
        int i4;
        urVar.Y(1533506138);
        int i5 = 2;
        if ((i & 6) == 0) {
            if (urVar.h(b82Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.h(fqVar)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i6 = 1;
        int i7 = 0;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            urVar.X(-885604480);
            if (!b82Var.k()) {
                d0 = b21.a;
            } else {
                vt vtVar = null;
                d0 = bf.d0(f2.E(new v72(b82Var, vtVar, i7)), b82Var.x, new dx(b82Var, vtVar, i6), new w72(b82Var, vtVar, i7), new zt(b82Var, i5));
            }
            xn.j(d0, fqVar, urVar, i2 & 112);
            urVar.p(false);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new ep(b82Var, fqVar, i, i7);
        }
    }

    public static final u90 a0(u21 u21Var, ur urVar) {
        t21 t21Var = (t21) urVar.j(b01.a);
        int ordinal = u21Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return t21Var.a();
                            }
                            se.m();
                            return null;
                        }
                        return t21Var.b();
                    }
                    return t21Var.d();
                }
                return t21Var.e();
            }
            return t21Var.c();
        }
        return t21Var.f();
    }

    public static final ut b(xu xuVar) {
        if (xuVar.H(g3.O) == null) {
            xuVar = xuVar.G(new io0(null));
        }
        return new ut(xuVar);
    }

    public static final int b0(mt0 mt0Var) {
        List list = mt0Var.k;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((nt0) list.get(i2)).k;
        }
        return (i / list.size()) + mt0Var.q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x02ba, code lost:
    
        if (r3.e() == false) goto L110;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.de0 r35, defpackage.ur r36, int r37) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp.c(de0, ur, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(boolean r26, final defpackage.oe0 r27, defpackage.e21 r28, defpackage.fq r29, defpackage.ur r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp.d(boolean, oe0, e21, fq, ur, int, int):void");
    }

    public static final void e(ud1 ud1Var, String str, e21 e21Var, xl1 xl1Var, ur urVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        int i6;
        int i7;
        int i8;
        ki kiVar = g3.j;
        urVar.Y(1142754848);
        int i9 = 4;
        if (urVar.h(ud1Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i2 | i;
        if ((i & 48) == 0) {
            if (urVar.f(str)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i10 |= i8;
        }
        if ((i & 384) == 0) {
            if (urVar.f(e21Var)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i10 |= i7;
        }
        if (urVar.f(kiVar)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i11 = i3 | i10;
        if ((i & 24576) == 0) {
            if (urVar.f(xl1Var)) {
                i6 = 16384;
            } else {
                i6 = SharedConstants.DefaultBufferSize;
            }
            i11 |= i6;
        }
        if (urVar.c(1.0f)) {
            i4 = 131072;
        } else {
            i4 = 65536;
        }
        int i12 = i11 | i4;
        if (urVar.f(null)) {
            i5 = 1048576;
        } else {
            i5 = 524288;
        }
        int i13 = i12 | i5;
        if ((599187 & i13) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i13 & 1, z)) {
            e21 e21Var2 = b21.a;
            xl1 xl1Var2 = or.a;
            if (str != null) {
                urVar.X(1899222916);
                if ((i13 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object L = urVar.L();
                if (z2 || L == xl1Var2) {
                    L = new wh(str, i9);
                    urVar.h0(L);
                }
                e21Var2 = ou1.a(e21Var2, false, (oe0) L);
                urVar.p(false);
            } else {
                urVar.X(1899381698);
                urVar.p(false);
            }
            e21 H = mp0.H(sn0.A(e21Var.d(e21Var2)), ud1Var, xl1Var, null, 2);
            Object L2 = urVar.L();
            if (L2 == xl1Var2) {
                L2 = b7.g;
                urVar.h0(L2);
            }
            j01 j01Var = (j01) L2;
            int hashCode = Long.hashCode(urVar.T);
            e21 Q = Q(urVar, H);
            sf1 l = urVar.l();
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, kr.f, j01Var);
            op1.q(urVar, kr.e, l);
            op1.o(urVar, kr.h);
            op1.q(urVar, kr.d, Q);
            op1.l(urVar, Integer.valueOf(hashCode), kr.g);
            urVar.p(true);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new c3(ud1Var, str, e21Var, xl1Var, i, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r14 == defpackage.or.a) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.t7 r8, java.lang.String r9, defpackage.e21 r10, defpackage.xl1 r11, defpackage.ur r12, int r13, int r14) {
        /*
            r14 = r14 & 16
            if (r14 == 0) goto L6
            xl1 r11 = defpackage.kt.b
        L6:
            r3 = r11
            boolean r11 = r12.f(r8)
            java.lang.Object r14 = r12.L()
            if (r11 != 0) goto L15
            xl1 r11 = defpackage.or.a
            if (r14 != r11) goto L38
        L15:
            android.graphics.Bitmap r11 = r8.a
            int r11 = r11.getWidth()
            android.graphics.Bitmap r14 = r8.a
            int r14 = r14.getHeight()
            long r0 = (long) r11
            r11 = 32
            long r0 = r0 << r11
            long r4 = (long) r14
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            long r0 = r0 | r4
            li r14 = new li
            r14.<init>(r8, r0)
            r8 = 1
            r14.g = r8
            r12.h0(r14)
        L38:
            r0 = r14
            li r0 = (defpackage.li) r0
            r8 = r13 & 112(0x70, float:1.57E-43)
            r11 = 8
            r8 = r8 | r11
            r11 = r13 & 896(0x380, float:1.256E-42)
            r8 = r8 | r11
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r13
            r5 = r8 | r11
            r1 = r9
            r2 = r10
            r4 = r12
            e(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp.f(t7, java.lang.String, e21, xl1, ur, int, int):void");
    }

    public static final v61 g(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        long j;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        if (Build.VERSION.SDK_INT >= 36) {
            j = backEvent.getFrameTimeMillis();
        } else {
            j = 0;
        }
        return new v61(swipeEdge, progress, touchX, touchY, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final java.lang.String r33, final defpackage.oe0 r34, final defpackage.e21 r35, boolean r36, boolean r37, defpackage.k92 r38, defpackage.se0 r39, defpackage.se0 r40, defpackage.se0 r41, defpackage.se0 r42, defpackage.y61 r43, defpackage.vp0 r44, defpackage.up0 r45, boolean r46, int r47, int r48, final defpackage.kw1 r49, defpackage.c72 r50, defpackage.ur r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp.h(java.lang.String, oe0, e21, boolean, boolean, k92, se0, se0, se0, se0, y61, vp0, up0, boolean, int, int, kw1, c72, ur, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x025d, code lost:
    
        if (defpackage.sn0.r(r3.L(), java.lang.Integer.valueOf(r9)) == false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x053e, code lost:
    
        if (r3.h(r0) != false) goto L262;
     */
    /* JADX WARN: Removed duplicated region for block: B:227:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0592  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final defpackage.se0 r43, defpackage.te0 r44, defpackage.se0 r45, final defpackage.se0 r46, final defpackage.se0 r47, defpackage.se0 r48, final defpackage.se0 r49, final boolean r50, final defpackage.o72 r51, final defpackage.l72 r52, final defpackage.oe0 r53, final defpackage.fq r54, defpackage.se0 r55, final defpackage.pc1 r56, defpackage.ur r57, final int r58, final int r59) {
        /*
            Method dump skipped, instructions count: 1681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp.i(se0, te0, se0, se0, se0, se0, se0, boolean, o72, l72, oe0, fq, se0, pc1, ur, int, int):void");
    }

    public static i8 j(String str, k92 k92Var, long j, c00 c00Var, cd0 cd0Var, int i, int i2) {
        l60 l60Var = l60.e;
        return new i8(new m8(str, k92Var, l60Var, l60Var, cd0Var, c00Var), i, 1, j);
    }

    public static final int k(ty0 ty0Var, j3 j3Var) {
        long F0;
        ty0 z0 = ty0Var.z0();
        if (z0 == null) {
            kl0.b("Child of " + ty0Var + " cannot be null when calculating alignment line");
        }
        if (ty0Var.D0().b().containsKey(j3Var)) {
            Integer num = (Integer) ty0Var.D0().b().get(j3Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int a0 = z0.a0(j3Var);
            if (a0 != Integer.MIN_VALUE) {
                z0.n = true;
                ty0Var.o = true;
                ty0Var.J0();
                z0.n = false;
                ty0Var.o = false;
                if (j3Var instanceof ei0) {
                    F0 = z0.F0() & 4294967295L;
                } else {
                    F0 = z0.F0() >> 32;
                }
                return a0 + ((int) F0);
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final int l(gu0 gu0Var, long j, hg2 hg2Var) {
        long J;
        int G;
        x82 d = gu0Var.d();
        if (d != null) {
            g31 g31Var = d.a.b;
            iq0 c = gu0Var.c();
            if (c != null && (G = G(g31Var, (J = c.J(j)), hg2Var)) != -1) {
                return g31Var.g(z81.a(J, (g31Var.b(G) + g31Var.f(G)) / 2.0f, 1));
            }
        }
        return -1;
    }

    public static final long m(gu0 gu0Var, pl1 pl1Var, pl1 pl1Var2, int i) {
        long H = H(gu0Var, pl1Var, i);
        if (d92.c(H)) {
            return d92.b;
        }
        long H2 = H(gu0Var, pl1Var2, i);
        if (d92.c(H2)) {
            return d92.b;
        }
        int i2 = (int) (H >> 32);
        int i3 = (int) (H2 & 4294967295L);
        return fr1.a(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final boolean n(w82 w82Var, int i) {
        g31 g31Var = w82Var.b;
        int d = g31Var.d(i);
        if (i == w82Var.f(d) || i == g31Var.c(d, false) ? w82Var.g(i) != w82Var.a(i) : w82Var.a(i) != w82Var.a(i - 1)) {
            return true;
        }
        return false;
    }

    public static final long o(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int p(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp.p(int, int, int, boolean):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(defpackage.wt r4) {
        /*
            boolean r0 = r4 instanceof defpackage.pz
            if (r0 == 0) goto L13
            r0 = r4
            pz r0 = (defpackage.pz) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            pz r0 = new pz
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.e
            int r1 = r0.f
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            return
        L27:
            defpackage.io.K(r4)
            goto L45
        L2b:
            defpackage.io.K(r4)
            r0.f = r2
            pl r4 = new pl
            vt r0 = defpackage.go.F(r0)
            r4.<init>(r2, r0)
            r4.r()
            java.lang.Object r4 = r4.q()
            hv r0 = defpackage.hv.e
            if (r4 != r0) goto L45
            return
        L45:
            defpackage.se.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp.q(wt):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.dj1 r4, defpackage.de0 r5, defpackage.wt r6) {
        /*
            boolean r0 = r6 instanceof defpackage.bj1
            if (r0 == 0) goto L13
            r0 = r6
            bj1 r0 = (defpackage.bj1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            bj1 r0 = new bj1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f
            int r1 = r0.g
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            de0 r5 = r0.e
            defpackage.io.K(r6)     // Catch: java.lang.Throwable -> L28
            goto L60
        L28:
            r4 = move-exception
            goto L66
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            return r2
        L30:
            defpackage.io.K(r6)
            xu r6 = r0.getContext()
            g3 r1 = defpackage.g3.O
            vu r6 = r6.H(r1)
            if (r6 != r4) goto L6a
            r0.e = r5     // Catch: java.lang.Throwable -> L28
            r0.g = r3     // Catch: java.lang.Throwable -> L28
            pl r6 = new pl     // Catch: java.lang.Throwable -> L28
            vt r0 = defpackage.go.F(r0)     // Catch: java.lang.Throwable -> L28
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L28
            r6.r()     // Catch: java.lang.Throwable -> L28
            bk r0 = new bk     // Catch: java.lang.Throwable -> L28
            r0.<init>(r6, r3)     // Catch: java.lang.Throwable -> L28
            r4.h0(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r4 = r6.q()     // Catch: java.lang.Throwable -> L28
            hv r6 = defpackage.hv.e
            if (r4 != r6) goto L60
            return r6
        L60:
            r5.invoke()
            od2 r4 = defpackage.od2.a
            return r4
        L66:
            r5.invoke()
            throw r4
        L6a:
            java.lang.String r4 = "awaitClose() can only be invoked from the producer context"
            defpackage.se.p(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp.r(dj1, de0, wt):java.lang.Object");
    }

    public static final void s(gv gvVar, CancellationException cancellationException) {
        go0 go0Var = (go0) gvVar.A().H(g3.O);
        if (go0Var != null) {
            go0Var.c(cancellationException);
        } else {
            se.t(gvVar, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static e21 t(e21 e21Var, te0 te0Var) {
        return e21Var.d(new nr(te0Var));
    }

    public static final Object u(se0 se0Var, vt vtVar) {
        vr1 vr1Var = new vr1(vtVar, vtVar.getContext());
        return xq1.t(vr1Var, vr1Var, se0Var);
    }

    public static final dd0 v(Context context) {
        int i;
        xl1 xl1Var = new xl1(16);
        context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 31) {
            i = td0.a.a(context);
        } else {
            i = 0;
        }
        return new dd0(xl1Var, new p7(i));
    }

    public static final Object w(long j, vt vtVar) {
        if (j > 0) {
            pl plVar = new pl(1, go.F(vtVar));
            plVar.r();
            if (j < Long.MAX_VALUE) {
                z(plVar.i).D(j, plVar);
            }
            Object q = plVar.q();
            if (q == hv.e) {
                return q;
            }
        }
        return od2.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r10 == r5) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0054, B:20:0x0069, B:22:0x0071, B:32:0x0045, B:35:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(defpackage.wa0 r7, defpackage.dm r8, boolean r9, defpackage.vt r10) {
        /*
            boolean r0 = r10 instanceof defpackage.za0
            if (r0 == 0) goto L13
            r0 = r10
            za0 r0 = (defpackage.za0) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            za0 r0 = new za0
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.i
            int r1 = r0.j
            r2 = 0
            r3 = 2
            r4 = 1
            hv r5 = defpackage.hv.e
            if (r1 == 0) goto L49
            if (r1 == r4) goto L3d
            if (r1 != r3) goto L37
            boolean r9 = r0.h
            kk r7 = r0.g
            dm r8 = r0.f
            wa0 r1 = r0.e
            defpackage.io.K(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L54
        L35:
            r7 = move-exception
            goto L8e
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r7)
            return r2
        L3d:
            boolean r9 = r0.h
            kk r7 = r0.g
            dm r8 = r0.f
            wa0 r1 = r0.e
            defpackage.io.K(r10)     // Catch: java.lang.Throwable -> L35
            goto L69
        L49:
            defpackage.io.K(r10)
            boolean r10 = r7 instanceof defpackage.y92
            if (r10 != 0) goto La9
            kk r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L54:
            r0.e = r7     // Catch: java.lang.Throwable -> L35
            r0.f = r8     // Catch: java.lang.Throwable -> L35
            r0.g = r10     // Catch: java.lang.Throwable -> L35
            r0.h = r9     // Catch: java.lang.Throwable -> L35
            r0.j = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L65
            goto L85
        L65:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L86
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.e = r1     // Catch: java.lang.Throwable -> L35
            r0.f = r8     // Catch: java.lang.Throwable -> L35
            r0.g = r7     // Catch: java.lang.Throwable -> L35
            r0.h = r9     // Catch: java.lang.Throwable -> L35
            r0.j = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.b(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L85:
            return r5
        L86:
            if (r9 == 0) goto L8b
            r8.c(r2)
        L8b:
            od2 r7 = defpackage.od2.a
            return r7
        L8e:
            throw r7     // Catch: java.lang.Throwable -> L8f
        L8f:
            r10 = move-exception
            if (r9 == 0) goto La8
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L99
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L99:
            if (r2 != 0) goto La5
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r2.<init>(r9)
            r2.initCause(r7)
        La5:
            r8.c(r2)
        La8:
            throw r10
        La9:
            y92 r7 = (defpackage.y92) r7
            java.lang.Throwable r7 = r7.e
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp.x(wa0, dm, boolean, vt):java.lang.Object");
    }

    public static final ArrayList y(mn0 mn0Var) {
        List m;
        mn0Var.getClass();
        ar0 C0 = ((ty0) mn0Var).C0();
        boolean K = K(C0);
        z31 z31Var = (z31) C0.o();
        q41 q41Var = (q41) z31Var.f;
        ArrayList arrayList = new ArrayList(q41Var.g);
        int i = q41Var.g;
        for (int i2 = 0; i2 < i; i2++) {
            ar0 ar0Var = (ar0) z31Var.get(i2);
            if (K) {
                m = ar0Var.l();
            } else {
                m = ar0Var.m();
            }
            arrayList.add(m);
        }
        return arrayList;
    }

    public static final oz z(xu xuVar) {
        oz ozVar;
        vu H = xuVar.H(g3.y);
        if (H instanceof oz) {
            ozVar = (oz) H;
        } else {
            ozVar = null;
        }
        if (ozVar == null) {
            return fy.a;
        }
        return ozVar;
    }

    public abstract u7 C();

    public Object F(int i) {
        Object invoke;
        ln0 b = C().b(i);
        int i2 = i - b.a;
        oe0 key = b.c.getKey();
        if (key != null && (invoke = key.invoke(Integer.valueOf(i2))) != null) {
            return invoke;
        }
        return new oy(i);
    }
}
