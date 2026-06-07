package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import com.elixir.loader.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class pp1 {
    public static ij0 a;
    public static ij0 b;

    public static final boolean A(float f, float f2, n8 n8Var) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        n8 a2 = p8.a();
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            p8.b("Invalid rectangle, make sure no value is NaN");
        }
        if (a2.b == null) {
            a2.b = new RectF();
        }
        RectF rectF = a2.b;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        Path path = a2.a;
        RectF rectF2 = a2.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        n8 a3 = p8.a();
        a3.f(n8Var, a2, 1);
        boolean isEmpty = a3.a.isEmpty();
        a3.g();
        a2.g();
        return !isEmpty;
    }

    public static final boolean B(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f) {
            return true;
        }
        return false;
    }

    public static final long C(long j, float f) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        o92[] o92VarArr = n92.b;
        return floatToRawIntBits;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, wl1] */
    /* JADX WARN: Type inference failed for: r1v6, types: [sl1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, vl1] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, vl1] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, vl1] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, wl1] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, wl1] */
    public static final vj2 D(final bl1 bl1Var) {
        long j;
        int c = bl1Var.c();
        if (c == 33639248) {
            bl1Var.skip(4L);
            short i = bl1Var.i();
            int i2 = i & 65535;
            if ((i & 1) == 0) {
                int i3 = bl1Var.i() & 65535;
                int i4 = bl1Var.i() & 65535;
                int i5 = bl1Var.i() & 65535;
                long c2 = bl1Var.c() & 4294967295L;
                final ?? obj = new Object();
                obj.e = bl1Var.c() & 4294967295L;
                final ?? obj2 = new Object();
                obj2.e = bl1Var.c() & 4294967295L;
                int i6 = bl1Var.i() & 65535;
                int i7 = bl1Var.i() & 65535;
                int i8 = bl1Var.i() & 65535;
                bl1Var.skip(8L);
                final ?? obj3 = new Object();
                obj3.e = bl1Var.c() & 4294967295L;
                String k = bl1Var.k(i6);
                if (!i32.H(k, (char) 0)) {
                    if (obj2.e == 4294967295L) {
                        j = 8;
                    } else {
                        j = 0;
                    }
                    if (obj.e == 4294967295L) {
                        j += 8;
                    }
                    if (obj3.e == 4294967295L) {
                        j += 8;
                    }
                    final long j2 = j;
                    final ?? obj4 = new Object();
                    final ?? obj5 = new Object();
                    final ?? obj6 = new Object();
                    final ?? obj7 = new Object();
                    E(bl1Var, i7, new se0() { // from class: yj2
                        @Override // defpackage.se0
                        public final Object invoke(Object obj8, Object obj9) {
                            long j3;
                            int intValue = ((Integer) obj8).intValue();
                            long longValue = ((Long) obj9).longValue();
                            bl1 bl1Var2 = bl1Var;
                            if (intValue != 1) {
                                if (intValue == 10) {
                                    if (longValue >= 4) {
                                        bl1Var2.skip(4L);
                                        pp1.E(bl1Var2, (int) (longValue - 4), new xj2(obj4, bl1Var2, obj5, obj6));
                                    } else {
                                        se.w("bad zip: NTFS extra too short");
                                        return null;
                                    }
                                }
                            } else {
                                sl1 sl1Var = sl1.this;
                                if (!sl1Var.e) {
                                    sl1Var.e = true;
                                    if (longValue >= j2) {
                                        vl1 vl1Var = obj2;
                                        long j4 = vl1Var.e;
                                        if (j4 == 4294967295L) {
                                            j4 = bl1Var2.g();
                                        }
                                        vl1Var.e = j4;
                                        vl1 vl1Var2 = obj;
                                        long j5 = 0;
                                        if (vl1Var2.e == 4294967295L) {
                                            j3 = bl1Var2.g();
                                        } else {
                                            j3 = 0;
                                        }
                                        vl1Var2.e = j3;
                                        vl1 vl1Var3 = obj3;
                                        if (vl1Var3.e == 4294967295L) {
                                            j5 = bl1Var2.g();
                                        }
                                        vl1Var3.e = j5;
                                    } else {
                                        se.w("bad zip: zip64 extra too short");
                                        return null;
                                    }
                                } else {
                                    se.w("bad zip: zip64 extra repeated");
                                    return null;
                                }
                            }
                            return od2.a;
                        }
                    });
                    if (j2 > 0 && !obj7.e) {
                        se.w("bad zip: zip64 extra required but absent");
                        return null;
                    }
                    String k2 = bl1Var.k(i8);
                    String str = oe1.f;
                    return new vj2(wc0.k("/", false).f(k), p32.w(k, "/", false), k2, c2, obj.e, obj2.e, i3, obj3.e, i5, i4, (Long) obj4.e, (Long) obj5.e, (Long) obj6.e, 57344);
                }
                se.w("bad zip: filename contains 0x00");
                return null;
            }
            se.w("unsupported zip: general purpose bit flag=".concat(o(i2)));
            return null;
        }
        throw new IOException("bad zip: expected " + o(33639248) + " but was " + o(c));
    }

    public static final void E(bl1 bl1Var, int i, se0 se0Var) {
        hk hkVar = bl1Var.f;
        long j = i;
        while (j != 0) {
            if (j >= 4) {
                int i2 = bl1Var.i() & 65535;
                long i3 = bl1Var.i() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                long j2 = j - 4;
                if (j2 >= i3) {
                    bl1Var.K(i3);
                    long j3 = hkVar.f;
                    se0Var.invoke(Integer.valueOf(i2), Long.valueOf(i3));
                    long j4 = (hkVar.f + i3) - j3;
                    if (j4 >= 0) {
                        if (j4 > 0) {
                            hkVar.skip(j4);
                        }
                        j = j2 - i3;
                    } else {
                        se.w(l90.g(i2, "unsupported zip: too many bytes processed for "));
                        return;
                    }
                } else {
                    se.w("bad zip: truncated value in extra field");
                    return;
                }
            } else {
                se.w("bad zip: truncated header in extra field");
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, wl1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, wl1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, wl1] */
    public static final vj2 F(bl1 bl1Var, vj2 vj2Var) {
        int c = bl1Var.c();
        if (c == 67324752) {
            bl1Var.skip(2L);
            short i = bl1Var.i();
            int i2 = i & 65535;
            if ((i & 1) == 0) {
                bl1Var.skip(18L);
                long i3 = bl1Var.i() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                int i4 = bl1Var.i() & 65535;
                bl1Var.skip(i3);
                if (vj2Var == null) {
                    bl1Var.skip(i4);
                    return null;
                }
                ?? obj = new Object();
                ?? obj2 = new Object();
                ?? obj3 = new Object();
                E(bl1Var, i4, new xj2(bl1Var, (wl1) obj, (wl1) obj2, (wl1) obj3));
                return new vj2(vj2Var.a, vj2Var.b, vj2Var.c, vj2Var.d, vj2Var.e, vj2Var.f, vj2Var.g, vj2Var.h, vj2Var.i, vj2Var.j, vj2Var.k, vj2Var.l, vj2Var.m, (Integer) obj.e, (Integer) obj2.e, (Integer) obj3.e);
            }
            se.w("unsupported zip: general purpose bit flag=".concat(o(i2)));
            return null;
        }
        throw new IOException("bad zip: expected " + o(67324752) + " but was " + o(c));
    }

    public static final boolean G(int i, cb cbVar, tc0 tc0Var, pl1 pl1Var) {
        tc0 j;
        q41 q41Var = new q41(new tc0[16]);
        if (!tc0Var.e.r) {
            kl0.b("visitChildren called on an unattached node");
        }
        q41 q41Var2 = new q41(new d21[16]);
        d21 d21Var = tc0Var.e;
        d21 d21Var2 = d21Var.j;
        if (d21Var2 == null) {
            hp.i(q41Var2, d21Var);
        } else {
            q41Var2.b(d21Var2);
        }
        while (true) {
            int i2 = q41Var2.g;
            if (i2 == 0) {
                break;
            }
            d21 d21Var3 = (d21) q41Var2.k(i2 - 1);
            if ((d21Var3.h & 1024) == 0) {
                hp.i(q41Var2, d21Var3);
            } else {
                while (true) {
                    if (d21Var3 == null) {
                        break;
                    }
                    if ((d21Var3.g & 1024) != 0) {
                        q41 q41Var3 = null;
                        while (d21Var3 != null) {
                            if (d21Var3 instanceof tc0) {
                                tc0 tc0Var2 = (tc0) d21Var3;
                                if (tc0Var2.r) {
                                    q41Var.b(tc0Var2);
                                }
                            } else if ((d21Var3.g & 1024) != 0 && (d21Var3 instanceof rz)) {
                                int i3 = 0;
                                for (d21 d21Var4 = ((rz) d21Var3).t; d21Var4 != null; d21Var4 = d21Var4.j) {
                                    if ((d21Var4.g & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            d21Var3 = d21Var4;
                                        } else {
                                            if (q41Var3 == null) {
                                                q41Var3 = new q41(new d21[16]);
                                            }
                                            if (d21Var3 != null) {
                                                q41Var3.b(d21Var3);
                                                d21Var3 = null;
                                            }
                                            q41Var3.b(d21Var4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            d21Var3 = hp.l(q41Var3);
                        }
                    } else {
                        d21Var3 = d21Var3.j;
                    }
                }
            }
        }
        while (q41Var.g != 0 && (j = j(q41Var, pl1Var, i)) != null) {
            if (j.N0().a) {
                return ((Boolean) cbVar.invoke(j)).booleanValue();
            }
            if (n(i, cbVar, j, pl1Var)) {
                return true;
            }
            q41Var.j(j);
        }
        return false;
    }

    public static final long H(String str, long j, long j2, long j3) {
        String str2;
        int i = j52.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long F = p32.F(str2);
        if (F != null) {
            long longValue = F.longValue();
            if (j2 <= longValue && longValue <= j3) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
    }

    public static int I(int i, int i2, String str) {
        int i3;
        if ((i2 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = 2097150;
        }
        return (int) H(str, i, 1L, i3);
    }

    public static final long J(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final Boolean K(int i, cb cbVar, tc0 tc0Var, pl1 pl1Var) {
        int ordinal = tc0Var.Q0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (tc0Var.N0().a) {
                            return (Boolean) cbVar.invoke(tc0Var);
                        }
                        if (pl1Var == null) {
                            return Boolean.valueOf(k(tc0Var, i, cbVar));
                        }
                        return Boolean.valueOf(G(i, cbVar, tc0Var, pl1Var));
                    }
                    se.m();
                    return null;
                }
            } else {
                tc0 z = lo.z(tc0Var);
                if (z != null) {
                    int ordinal2 = z.Q0().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    se.m();
                                    return null;
                                }
                                se.p("ActiveParent must have a focusedChild");
                                return null;
                            }
                        } else {
                            Boolean K = K(i, cbVar, z, pl1Var);
                            if (!sn0.r(K, Boolean.FALSE)) {
                                return K;
                            }
                            if (pl1Var == null) {
                                if (z.Q0() == sc0.f) {
                                    tc0 w = lo.w(z);
                                    if (w != null) {
                                        pl1Var = lo.y(w);
                                    } else {
                                        se.p("ActiveParent must have a focusedChild");
                                        return null;
                                    }
                                } else {
                                    se.p("Searching for active node in inactive hierarchy");
                                    return null;
                                }
                            }
                            return Boolean.valueOf(n(i, cbVar, tc0Var, pl1Var));
                        }
                    }
                    if (pl1Var == null) {
                        pl1Var = lo.y(z);
                    }
                    return Boolean.valueOf(n(i, cbVar, tc0Var, pl1Var));
                }
                se.p("ActiveParent must have a focusedChild");
                return null;
            }
        }
        return Boolean.valueOf(k(tc0Var, i, cbVar));
    }

    public static final pl1 L(iq0 iq0Var) {
        pl1 j = qo.j(iq0Var, true);
        long A = iq0Var.A(j.d());
        float f = j.c;
        float f2 = j.d;
        long A2 = iq0Var.A((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        return new pl1(Float.intBitsToFloat((int) (A >> 32)), Float.intBitsToFloat((int) (A & 4294967295L)), Float.intBitsToFloat((int) (A2 >> 32)), Float.intBitsToFloat((int) (A2 & 4294967295L)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b1, code lost:
    
        if (r4 != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0321, code lost:
    
        if (r4 != false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x02f7, code lost:
    
        if (r4 != false) goto L205;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0402 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x034a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.CharSequence r50, final defpackage.se0 r51, final defpackage.o72 r52, final defpackage.te0 r53, final defpackage.se0 r54, final defpackage.se0 r55, final defpackage.se0 r56, final boolean r57, final boolean r58, final defpackage.r31 r59, final defpackage.pc1 r60, final defpackage.c72 r61, final defpackage.fq r62, defpackage.ur r63, final int r64, final int r65) {
        /*
            Method dump skipped, instructions count: 1839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp1.a(java.lang.CharSequence, se0, o72, te0, se0, se0, se0, boolean, boolean, r31, pc1, c72, fq, ur, int, int):void");
    }

    public static final void b(long j, k92 k92Var, se0 se0Var, ur urVar, int i) {
        int i2;
        int i3;
        boolean z;
        long j2;
        k92 k92Var2;
        se0 se0Var2;
        ur urVar2;
        int i4;
        urVar.Y(396611577);
        if (urVar.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (urVar.f(k92Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i & 384) == 0) {
            if (urVar.h(se0Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i6 |= i4;
        }
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i6 & 1, z)) {
            urVar2 = urVar;
            xn.i(j, k92Var, se0Var, urVar2, i6 & 1022);
            j2 = j;
            k92Var2 = k92Var;
            se0Var2 = se0Var;
        } else {
            j2 = j;
            k92Var2 = k92Var;
            se0Var2 = se0Var;
            urVar2 = urVar;
            urVar2.R();
        }
        dl1 r = urVar2.r();
        if (r != null) {
            r.d = new yj1(j2, k92Var2, se0Var2, i, 1);
        }
    }

    public static final void c(long j, se0 se0Var, ur urVar, int i) {
        int i2;
        int i3;
        boolean z;
        urVar.Y(590397809);
        if (urVar.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (urVar.h(se0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i5 & 1, z)) {
            vn.b(et.a.a(new co(j)), se0Var, urVar, (i5 & 112) | 8);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new f72(j, se0Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [y80, java.lang.Object] */
    public static final void d(pz1 pz1Var, e21 e21Var, ur urVar, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        fq fqVar = sn0.i;
        urVar.Y(-977568115);
        if ((i & 6) == 0) {
            if (urVar.f(pz1Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.f(e21Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (urVar.h(fqVar)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        int i7 = 0;
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            String g = nq1.g(R.string.m3c_snackbar_pane_title, urVar);
            Object L = urVar.L();
            Object obj = L;
            if (L == or.a) {
                ?? obj2 = new Object();
                obj2.a = new Object();
                obj2.b = new ArrayList();
                urVar.h0(obj2);
                obj = obj2;
            }
            y80 y80Var = (y80) obj;
            Object obj3 = y80Var.a;
            ArrayList arrayList = y80Var.b;
            if (!sn0.r(pz1Var, obj3)) {
                urVar.X(1441886385);
                y80Var.a = pz1Var;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    arrayList2.add((pz1) ((x80) arrayList.get(i8)).a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(pz1Var)) {
                    arrayList3.add(pz1Var);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    Object obj4 = arrayList3.get(i9);
                    if (obj4 != null) {
                        arrayList4.add(obj4);
                    }
                }
                int size3 = arrayList4.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    pz1 pz1Var2 = (pz1) arrayList4.get(i10);
                    arrayList.add(new x80(pz1Var2, go.N(-1952400805, new js0(pz1Var2, pz1Var, y80Var, g, 6), urVar)));
                }
                i3 = 6;
            } else {
                i3 = 6;
                urVar.X(1428992245);
            }
            urVar.p(false);
            j01 d = hj.d(g3.f, false);
            int x = io.x(urVar);
            sf1 l = urVar.l();
            e21 Q = fp.Q(urVar, e21Var);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, kr.f, d);
            op1.q(urVar, kr.e, l);
            gb gbVar = kr.g;
            if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x))) {
                l90.s(x, urVar, x, gbVar);
            }
            op1.q(urVar, kr.d, Q);
            dl1 x2 = urVar.x();
            if (x2 != null) {
                x2.b |= 1;
                y80Var.c = x2;
                urVar.X(-1888182177);
                int size4 = arrayList.size();
                for (int i11 = 0; i11 < size4; i11++) {
                    x80 x80Var = (x80) arrayList.get(i11);
                    pz1 pz1Var3 = (pz1) x80Var.a;
                    fq fqVar2 = x80Var.b;
                    urVar.V(1325010085, pz1Var3);
                    fqVar2.invoke(go.N(-1893791890, new mz1(pz1Var3, i7), urVar), urVar, Integer.valueOf(i3));
                    urVar.p(false);
                }
                urVar.p(false);
                urVar.p(true);
            } else {
                se.p("no recompose scope found");
                return;
            }
        } else {
            i3 = 6;
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new cq(pz1Var, i, i3, e21Var);
        }
    }

    public static final void e(sz1 sz1Var, e21 e21Var, te0 te0Var, ur urVar, int i) {
        int i2;
        boolean z;
        urVar.Y(-1077081618);
        if (urVar.f(e21Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i3 = i2 | i | 384;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i3 & 1, z)) {
            te0Var = sn0.i;
            pz1 pz1Var = (pz1) sz1Var.b.getValue();
            b1 b1Var = (b1) urVar.j(is.a);
            boolean f = urVar.f(pz1Var) | urVar.h(b1Var);
            Object L = urVar.L();
            if (f || L == or.a) {
                L = new b31(pz1Var, b1Var, null, 8);
                urVar.h0(L);
            }
            bf.i(urVar, (se0) L, pz1Var);
            d((pz1) sz1Var.b.getValue(), e21Var, urVar, i3 & 1008);
        } else {
            urVar.R();
        }
        te0 te0Var2 = te0Var;
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new l1(sz1Var, e21Var, te0Var2, i, 12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        defpackage.se.p("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        defpackage.se.p("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean f(defpackage.pl1 r18, defpackage.pl1 r19, defpackage.pl1 r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = g(r3, r2, r0)
            float r5 = r2.b
            float r6 = r2.d
            float r7 = r2.a
            float r2 = r2.c
            float r8 = r0.d
            float r9 = r0.b
            float r10 = r0.c
            float r11 = r0.a
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = g(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9c
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L98
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L44:
            if (r3 != r13) goto L99
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L98
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            defpackage.se.p(r4)
            return r12
        L94:
            defpackage.se.p(r4)
            return r12
        L98:
            return r18
        L99:
            defpackage.se.p(r4)
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp1.f(pl1, pl1, pl1, int):boolean");
    }

    public static final boolean g(int i, pl1 pl1Var, pl1 pl1Var2) {
        if (i == 3 || i == 4) {
            if (pl1Var.d <= pl1Var2.b || pl1Var.b >= pl1Var2.d) {
                return false;
            }
            return true;
        }
        if (i == 5 || i == 6) {
            if (pl1Var.c <= pl1Var2.a || pl1Var.a >= pl1Var2.c) {
                return false;
            }
            return true;
        }
        se.p("This function should only be used for 2-D focus search");
        return false;
    }

    public static final LinkedHashMap h(ArrayList arrayList) {
        String str = oe1.f;
        oe1 k = wc0.k("/", false);
        xd1[] xd1VarArr = {new xd1(k, new vj2(k, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(tz0.c0(1));
        tz0.d0(linkedHashMap, xd1VarArr);
        for (vj2 vj2Var : wn.x0(arrayList, new uc0(11))) {
            if (((vj2) linkedHashMap.put(vj2Var.a, vj2Var)) == null) {
                while (true) {
                    oe1 oe1Var = vj2Var.a;
                    oe1 c = oe1Var.c();
                    if (c != null) {
                        vj2 vj2Var2 = (vj2) linkedHashMap.get(c);
                        if (vj2Var2 != null) {
                            vj2Var2.q.add(oe1Var);
                            break;
                        }
                        vj2 vj2Var3 = new vj2(c, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMap.put(c, vj2Var3);
                        vj2Var3.q.add(oe1Var);
                        vj2Var = vj2Var3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final void i(tc0 tc0Var, q41 q41Var) {
        if (!tc0Var.e.r) {
            kl0.b("visitChildren called on an unattached node");
        }
        q41 q41Var2 = new q41(new d21[16]);
        d21 d21Var = tc0Var.e;
        d21 d21Var2 = d21Var.j;
        if (d21Var2 == null) {
            hp.i(q41Var2, d21Var);
        } else {
            q41Var2.b(d21Var2);
        }
        while (true) {
            int i = q41Var2.g;
            if (i != 0) {
                d21 d21Var3 = (d21) q41Var2.k(i - 1);
                if ((d21Var3.h & 1024) == 0) {
                    hp.i(q41Var2, d21Var3);
                } else {
                    while (true) {
                        if (d21Var3 == null) {
                            break;
                        }
                        if ((d21Var3.g & 1024) != 0) {
                            q41 q41Var3 = null;
                            while (d21Var3 != null) {
                                if (d21Var3 instanceof tc0) {
                                    tc0 tc0Var2 = (tc0) d21Var3;
                                    if (tc0Var2.r && !hp.M(tc0Var2).S) {
                                        if (tc0Var2.N0().a) {
                                            q41Var.b(tc0Var2);
                                        } else {
                                            i(tc0Var2, q41Var);
                                        }
                                    }
                                } else if ((d21Var3.g & 1024) != 0 && (d21Var3 instanceof rz)) {
                                    int i2 = 0;
                                    for (d21 d21Var4 = ((rz) d21Var3).t; d21Var4 != null; d21Var4 = d21Var4.j) {
                                        if ((d21Var4.g & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                d21Var3 = d21Var4;
                                            } else {
                                                if (q41Var3 == null) {
                                                    q41Var3 = new q41(new d21[16]);
                                                }
                                                if (d21Var3 != null) {
                                                    q41Var3.b(d21Var3);
                                                    d21Var3 = null;
                                                }
                                                q41Var3.b(d21Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                d21Var3 = hp.l(q41Var3);
                            }
                        } else {
                            d21Var3 = d21Var3.j;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public static final tc0 j(q41 q41Var, pl1 pl1Var, int i) {
        pl1 h;
        tc0 tc0Var = null;
        if (i == 3) {
            h = pl1Var.h((pl1Var.c - pl1Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            h = pl1Var.h(-((pl1Var.c - pl1Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            h = pl1Var.h(0.0f, (pl1Var.d - pl1Var.b) + 1.0f);
        } else if (i == 6) {
            h = pl1Var.h(0.0f, -((pl1Var.d - pl1Var.b) + 1.0f));
        } else {
            se.p("This function should only be used for 2-D focus search");
            return null;
        }
        Object[] objArr = q41Var.e;
        int i2 = q41Var.g;
        for (int i3 = 0; i3 < i2; i3++) {
            tc0 tc0Var2 = (tc0) objArr[i3];
            if (lo.L(tc0Var2)) {
                pl1 y = lo.y(tc0Var2);
                if (x(y, h, pl1Var, i)) {
                    tc0Var = tc0Var2;
                    h = y;
                }
            }
        }
        return tc0Var;
    }

    public static final boolean k(tc0 tc0Var, int i, oe0 oe0Var) {
        pl1 pl1Var;
        Object obj;
        q41 q41Var = new q41(new tc0[16]);
        i(tc0Var, q41Var);
        int i2 = q41Var.g;
        if (i2 <= 1) {
            if (i2 == 0) {
                obj = null;
            } else {
                obj = q41Var.e[0];
            }
            tc0 tc0Var2 = (tc0) obj;
            if (tc0Var2 != null) {
                return ((Boolean) oe0Var.invoke(tc0Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                pl1 y = lo.y(tc0Var);
                float f = y.a;
                float f2 = y.b;
                pl1Var = new pl1(f, f2, f, f2);
            } else if (i == 3 || i == 5) {
                pl1 y2 = lo.y(tc0Var);
                float f3 = y2.c;
                float f4 = y2.d;
                pl1Var = new pl1(f3, f4, f3, f4);
            } else {
                se.p("This function should only be used for 2-D focus search");
                return false;
            }
            tc0 j = j(q41Var, pl1Var, i);
            if (j != null) {
                return ((Boolean) oe0Var.invoke(j)).booleanValue();
            }
        }
        return false;
    }

    public static final int l(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int m(CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final boolean n(int i, cb cbVar, tc0 tc0Var, pl1 pl1Var) {
        if (G(i, cbVar, tc0Var, pl1Var)) {
            return true;
        }
        Boolean bool = (Boolean) sn0.T(tc0Var, i, new fa1(((mc0) ((q5) hp.N(tc0Var)).getFocusOwner()).f(), tc0Var, pl1Var, i, cbVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final String o(int i) {
        mp0.m(16);
        String num = Integer.toString(i, 16);
        num.getClass();
        return "0x".concat(num);
    }

    public static final h3 p(o72 o72Var) {
        if (o72Var instanceof o72) {
            return o72Var.a;
        }
        y61.u(o72Var, "Unknown position: ");
        return null;
    }

    public static final sp1 q(e01 e01Var) {
        Object C = e01Var.C();
        if (C instanceof sp1) {
            return (sp1) C;
        }
        return null;
    }

    public static final long r(double d) {
        return C(4294967296L, (float) d);
    }

    public static final long s(int i) {
        return C(4294967296L, i);
    }

    public static final ij0 t() {
        ij0 ij0Var = a;
        if (ij0Var != null) {
            return ij0Var;
        }
        hj0 hj0Var = new hj0("Rounded.ViewInAr", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = me2.a;
        long j = co.b;
        i12 i12Var = new i12(j);
        rg2 rg2Var = new rg2(21);
        rg2Var.s(2.0f, 6.0f);
        rg2Var.i(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        rg2Var.D(4.0f);
        rg2Var.i(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        rg2Var.o(1.0f);
        rg2Var.i(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        rg2Var.v(5.55f, 1.0f, 5.0f, 1.0f);
        rg2Var.n(4.0f);
        rg2Var.h(2.34f, 1.0f, 1.0f, 2.34f, 1.0f, 4.0f);
        rg2Var.E(1.0f);
        rg2Var.h(1.0f, 5.55f, 1.45f, 6.0f, 2.0f, 6.0f);
        rg2Var.f();
        hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
        i12 i12Var2 = new i12(j);
        rg2 rg2Var2 = new rg2(21);
        rg2Var2.s(5.0f, 21.0f);
        rg2Var2.n(4.0f);
        rg2Var2.i(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        rg2Var2.E(-1.0f);
        rg2Var2.i(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        rg2Var2.i(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        rg2Var2.E(1.0f);
        rg2Var2.i(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        rg2Var2.o(1.0f);
        rg2Var2.i(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        rg2Var2.v(5.55f, 21.0f, 5.0f, 21.0f);
        rg2Var2.f();
        hj0.a(hj0Var, (ArrayList) rg2Var2.f, i12Var2);
        i12 i12Var3 = new i12(j);
        rg2 rg2Var3 = new rg2(21);
        rg2Var3.s(20.0f, 1.0f);
        rg2Var3.o(-1.0f);
        rg2Var3.i(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        rg2Var3.w(0.45f, 1.0f, 1.0f, 1.0f);
        rg2Var3.o(1.0f);
        rg2Var3.i(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        rg2Var3.E(1.0f);
        rg2Var3.i(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        rg2Var3.i(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        rg2Var3.D(4.0f);
        rg2Var3.h(23.0f, 2.34f, 21.66f, 1.0f, 20.0f, 1.0f);
        rg2Var3.f();
        hj0.a(hj0Var, (ArrayList) rg2Var3.f, i12Var3);
        i12 i12Var4 = new i12(j);
        rg2 rg2Var4 = new rg2(21);
        rg2Var4.s(22.0f, 18.0f);
        rg2Var4.i(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        rg2Var4.E(1.0f);
        rg2Var4.i(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        rg2Var4.o(-1.0f);
        rg2Var4.i(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        rg2Var4.w(0.45f, 1.0f, 1.0f, 1.0f);
        rg2Var4.o(1.0f);
        rg2Var4.i(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        rg2Var4.E(-1.0f);
        rg2Var4.h(23.0f, 18.45f, 22.55f, 18.0f, 22.0f, 18.0f);
        rg2Var4.f();
        hj0.a(hj0Var, (ArrayList) rg2Var4.f, i12Var4);
        i12 i12Var5 = new i12(j);
        rg2 rg2Var5 = new rg2(21);
        rg2Var5.s(19.0f, 14.87f);
        rg2Var5.D(9.13f);
        rg2Var5.i(0.0f, -0.72f, -0.38f, -1.38f, -1.0f, -1.73f);
        rg2Var5.r(-5.0f, -2.88f);
        rg2Var5.i(-0.31f, -0.18f, -0.65f, -0.27f, -1.0f, -0.27f);
        rg2Var5.w(-0.69f, 0.09f, -1.0f, 0.27f);
        rg2Var5.q(6.0f, 7.39f);
        rg2Var5.h(5.38f, 7.75f, 5.0f, 8.41f, 5.0f, 9.13f);
        rg2Var5.E(5.74f);
        rg2Var5.i(0.0f, 0.72f, 0.38f, 1.38f, 1.0f, 1.73f);
        rg2Var5.r(5.0f, 2.88f);
        rg2Var5.i(0.31f, 0.18f, 0.65f, 0.27f, 1.0f, 0.27f);
        rg2Var5.w(0.69f, -0.09f, 1.0f, -0.27f);
        rg2Var5.r(5.0f, -2.88f);
        rg2Var5.h(18.62f, 16.25f, 19.0f, 15.59f, 19.0f, 14.87f);
        rg2Var5.f();
        rg2Var5.s(11.0f, 17.17f);
        rg2Var5.r(-4.0f, -2.3f);
        rg2Var5.E(-4.63f);
        rg2Var5.r(4.0f, 2.33f);
        rg2Var5.D(17.17f);
        rg2Var5.f();
        rg2Var5.s(12.0f, 10.84f);
        rg2Var5.q(8.04f, 8.53f);
        rg2Var5.q(12.0f, 6.25f);
        rg2Var5.r(3.96f, 2.28f);
        rg2Var5.q(12.0f, 10.84f);
        rg2Var5.f();
        rg2Var5.s(17.0f, 14.87f);
        rg2Var5.r(-4.0f, 2.3f);
        rg2Var5.E(-4.6f);
        rg2Var5.r(4.0f, -2.33f);
        rg2Var5.D(14.87f);
        rg2Var5.f();
        hj0.a(hj0Var, (ArrayList) rg2Var5.f, i12Var5);
        ij0 b2 = hj0Var.b();
        a = b2;
        return b2;
    }

    public static final ij0 u() {
        ij0 ij0Var = b;
        if (ij0Var != null) {
            return ij0Var;
        }
        hj0 hj0Var = new hj0("Filled.VpnKey", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = me2.a;
        i12 i12Var = new i12(co.b);
        rg2 rg2Var = new rg2(21);
        rg2Var.s(12.65f, 10.0f);
        rg2Var.h(11.83f, 7.67f, 9.61f, 6.0f, 7.0f, 6.0f);
        rg2Var.i(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        rg2Var.w(2.69f, 6.0f, 6.0f, 6.0f);
        rg2Var.i(2.61f, 0.0f, 4.83f, -1.67f, 5.65f, -4.0f);
        rg2Var.n(17.0f);
        rg2Var.E(4.0f);
        rg2Var.o(4.0f);
        rg2Var.E(-4.0f);
        rg2Var.o(2.0f);
        rg2Var.E(-4.0f);
        rg2Var.n(12.65f);
        rg2Var.f();
        rg2Var.s(7.0f, 14.0f);
        rg2Var.i(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        rg2Var.w(0.9f, -2.0f, 2.0f, -2.0f);
        rg2Var.w(2.0f, 0.9f, 2.0f, 2.0f);
        rg2Var.w(-0.9f, 2.0f, -2.0f, 2.0f);
        rg2Var.f();
        hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
        ij0 b2 = hj0Var.b();
        b = b2;
        return b2;
    }

    public static final float v(sp1 sp1Var) {
        if (sp1Var != null) {
            return sp1Var.a;
        }
        return 0.0f;
    }

    public static final int w(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean x(pl1 pl1Var, pl1 pl1Var2, pl1 pl1Var3, int i) {
        if (y(i, pl1Var, pl1Var3)) {
            if (y(i, pl1Var2, pl1Var3) && !f(pl1Var3, pl1Var, pl1Var2, i)) {
                if (!f(pl1Var3, pl1Var2, pl1Var, i) && z(i, pl1Var3, pl1Var) < z(i, pl1Var3, pl1Var2)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean y(int i, pl1 pl1Var, pl1 pl1Var2) {
        if (i == 3) {
            float f = pl1Var2.c;
            float f2 = pl1Var2.a;
            float f3 = pl1Var.c;
            if ((f <= f3 && f2 < f3) || f2 <= pl1Var.a) {
                return false;
            }
            return true;
        }
        if (i == 4) {
            float f4 = pl1Var2.a;
            float f5 = pl1Var2.c;
            float f6 = pl1Var.a;
            if ((f4 >= f6 && f5 > f6) || f5 >= pl1Var.c) {
                return false;
            }
            return true;
        }
        if (i == 5) {
            float f7 = pl1Var2.d;
            float f8 = pl1Var2.b;
            float f9 = pl1Var.d;
            if ((f7 <= f9 && f8 < f9) || f8 <= pl1Var.b) {
                return false;
            }
            return true;
        }
        if (i == 6) {
            float f10 = pl1Var2.b;
            float f11 = pl1Var2.d;
            float f12 = pl1Var.b;
            if ((f10 >= f12 && f11 > f12) || f11 >= pl1Var.d) {
                return false;
            }
            return true;
        }
        se.p("This function should only be used for 2-D focus search");
        return false;
    }

    public static final long z(int i, pl1 pl1Var, pl1 pl1Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = pl1Var.a;
            f2 = pl1Var2.c;
        } else if (i == 4) {
            f = pl1Var2.a;
            f2 = pl1Var.c;
        } else if (i == 5) {
            f = pl1Var.b;
            f2 = pl1Var2.d;
        } else if (i == 6) {
            f = pl1Var2.b;
            f2 = pl1Var.d;
        } else {
            se.p("This function should only be used for 2-D focus search");
            return 0L;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = f6;
        if (i == 3 || i == 4) {
            float f7 = pl1Var.b;
            f3 = ((pl1Var.d - f7) / 2.0f) + f7;
            f4 = pl1Var2.b;
            f5 = pl1Var2.d;
        } else if (i == 5 || i == 6) {
            float f8 = pl1Var.a;
            f3 = ((pl1Var.c - f8) / 2.0f) + f8;
            f4 = pl1Var2.a;
            f5 = pl1Var2.c;
        } else {
            se.p("This function should only be used for 2-D focus search");
            return 0L;
        }
        long j2 = f3 - (((f5 - f4) / 2.0f) + f4);
        return (j2 * j2) + (13 * j * j);
    }
}
