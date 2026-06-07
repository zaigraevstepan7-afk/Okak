package defpackage;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class op1 implements gg2 {
    public static ij0 a;
    public static ij0 b;

    /* JADX WARN: Multi-variable type inference failed */
    public static final np1 a(float[] fArr, tu tuVar, AbstractList abstractList, float f, float f2) {
        float f3;
        long a2;
        boolean z;
        int i;
        ArrayList arrayList;
        List E;
        int i2;
        float f4;
        uv a3;
        xd1 xd1Var;
        tu tuVar2;
        tu tuVar3;
        float f5 = 1.0f;
        Float valueOf = Float.valueOf(1.0f);
        tuVar.getClass();
        np1 np1Var = null;
        if (fArr.length >= 6) {
            int i3 = 2;
            int i4 = 1;
            if (fArr.length % 2 != 1) {
                if (abstractList != null && abstractList.size() * 2 != fArr.length) {
                    se.h("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                int length = fArr.length / 2;
                ArrayList arrayList3 = new ArrayList();
                int i5 = 0;
                int i6 = 0;
                while (i6 < length) {
                    if (abstractList != null && (tuVar3 = (tu) abstractList.get(i6)) != null) {
                        tuVar2 = tuVar3;
                    } else {
                        tuVar2 = tuVar;
                    }
                    int i7 = (((i6 + length) - 1) % length) * 2;
                    int i8 = i6 + 1;
                    int i9 = (i8 % length) * 2;
                    int i10 = i6 * 2;
                    arrayList3.add(new jp1(ha0.a(fArr[i7], fArr[i7 + 1]), ha0.a(fArr[i10], fArr[i10 + 1]), ha0.a(fArr[i9], fArr[i9 + 1]), tuVar2));
                    i6 = i8;
                    f5 = f5;
                }
                float f6 = f5;
                an0 X = go.X(0, length);
                ArrayList arrayList4 = new ArrayList(yn.a0(X, 10));
                Iterator it = X.iterator();
                while (true) {
                    f3 = 0.0f;
                    if (!((zm0) it).g) {
                        break;
                    }
                    int nextInt = ((tm0) it).nextInt();
                    int i11 = (nextInt + 1) % length;
                    float f7 = ((jp1) arrayList3.get(nextInt)).h + ((jp1) arrayList3.get(i11)).h;
                    float c = ((jp1) arrayList3.get(i11)).c() + ((jp1) arrayList3.get(nextInt)).c();
                    int i12 = nextInt * 2;
                    float f8 = fArr[i12];
                    float f9 = fArr[i12 + 1];
                    int i13 = i11 * 2;
                    float f10 = f8 - fArr[i13];
                    float f11 = f9 - fArr[i13 + 1];
                    float f12 = be2.b;
                    float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
                    if (f7 > sqrt) {
                        xd1Var = new xd1(Float.valueOf(sqrt / f7), Float.valueOf(0.0f));
                    } else if (c > sqrt) {
                        xd1Var = new xd1(valueOf, Float.valueOf((sqrt - f7) / (c - f7)));
                    } else {
                        xd1Var = new xd1(valueOf, valueOf);
                    }
                    arrayList4.add(xd1Var);
                }
                int i14 = 0;
                while (i14 < length) {
                    float[] fArr2 = new float[i3];
                    np1 np1Var2 = np1Var;
                    int i15 = i5;
                    int i16 = i15;
                    while (i16 < i3) {
                        int i17 = i3;
                        xd1 xd1Var2 = (xd1) arrayList4.get((((i14 + length) - 1) + i16) % length);
                        int i18 = i5;
                        float f13 = f3;
                        float c2 = ((((jp1) arrayList3.get(i14)).c() - ((jp1) arrayList3.get(i14)).h) * ((Number) xd1Var2.f).floatValue()) + (((jp1) arrayList3.get(i14)).h * ((Number) xd1Var2.e).floatValue());
                        int i19 = i15 + 1;
                        if (fArr2.length < i19) {
                            fArr2 = Arrays.copyOf(fArr2, Math.max(i19, (fArr2.length * 3) / 2));
                        }
                        fArr2[i15] = c2;
                        i16++;
                        f3 = f13;
                        i15 = i19;
                        i5 = i18;
                        i3 = i17;
                    }
                    int i20 = i3;
                    int i21 = i5;
                    float f14 = f3;
                    jp1 jp1Var = (jp1) arrayList3.get(i14);
                    if (i15 > 0) {
                        float f15 = fArr2[i21];
                        if (i4 < i15) {
                            float f16 = fArr2[i4];
                            long j = jp1Var.e;
                            int i22 = i4;
                            int i23 = length;
                            long j2 = jp1Var.d;
                            float f17 = jp1Var.f;
                            ArrayList arrayList5 = arrayList2;
                            long j3 = jp1Var.b;
                            float min = Math.min(f15, f16);
                            float f18 = jp1Var.h;
                            if (f18 < 1.0E-4f || min < 1.0E-4f || f17 < 1.0E-4f) {
                                i = i14;
                                arrayList = arrayList4;
                                jp1Var.i = j3;
                                float G = lo.G(j3);
                                float H = lo.H(j3);
                                float G2 = lo.G(j3);
                                float H2 = lo.H(j3);
                                E = xn.E(xn.a(G, H, be2.c(G, G2, 0.33333334f), be2.c(H, H2, 0.33333334f), be2.c(G, G2, 0.6666667f), be2.c(H, H2, 0.6666667f), G2, H2));
                            } else {
                                float min2 = Math.min(min, f18);
                                float a4 = jp1Var.a(f15);
                                float a5 = jp1Var.a(f16);
                                float f19 = (f17 * min2) / f18;
                                float f20 = be2.b;
                                i = i14;
                                jp1Var.i = lo.U(j3, lo.Y(lo.C(lo.r(lo.U(j2, j), 2.0f)), (float) Math.sqrt((min2 * min2) + (f19 * f19))));
                                long U = lo.U(j3, lo.Y(j2, min2));
                                long U2 = lo.U(j3, lo.Y(j, min2));
                                uv b2 = jp1.b(min2, a4, jp1Var.b, jp1Var.a, U, U2, jp1Var.i, f19);
                                uv b3 = jp1.b(min2, a5, jp1Var.b, jp1Var.c, U2, U, jp1Var.i, f19);
                                float a6 = b3.a();
                                float b4 = b3.b();
                                float[] fArr3 = b3.a;
                                uv a7 = xn.a(a6, b4, fArr3[4], fArr3[5], fArr3[i20], fArr3[3], fArr3[i21], fArr3[i22]);
                                float G3 = lo.G(jp1Var.i);
                                float H3 = lo.H(jp1Var.i);
                                float a8 = b2.a();
                                float b5 = b2.b();
                                float[] fArr4 = a7.a;
                                float f21 = fArr4[i21];
                                float f22 = fArr4[i22];
                                long b6 = be2.b(a8 - G3, b5 - H3);
                                float f23 = f21 - G3;
                                float f24 = f22 - H3;
                                long b7 = be2.b(f23, f24);
                                arrayList = arrayList4;
                                long a9 = ha0.a(-lo.H(b6), lo.G(b6));
                                long a10 = ha0.a(-lo.H(b7), lo.G(b7));
                                if ((lo.H(a9) * f24) + (lo.G(a9) * f23) >= f14) {
                                    i2 = i22;
                                } else {
                                    i2 = i21;
                                }
                                float s = lo.s(b6, b7);
                                if (s > 0.999f) {
                                    a3 = xn.a(a8, b5, be2.c(a8, f21, 0.33333334f), be2.c(b5, f22, 0.33333334f), be2.c(a8, f21, 0.6666667f), be2.c(b5, f22, 0.6666667f), f21, f22);
                                } else {
                                    float sqrt2 = ((((float) Math.sqrt(2.0f * r8)) - ((float) Math.sqrt(f6 - (s * s)))) * ((((float) Math.sqrt((r12 * r12) + (r11 * r11))) * 4.0f) / 3.0f)) / (f6 - s);
                                    if (i2 != 0) {
                                        f4 = f6;
                                    } else {
                                        f4 = -1.0f;
                                    }
                                    float f25 = sqrt2 * f4;
                                    a3 = xn.a(a8, b5, (lo.G(a9) * f25) + a8, (lo.H(a9) * f25) + b5, f21 - (lo.G(a10) * f25), f22 - (lo.H(a10) * f25), f21, f22);
                                }
                                E = xn.F(b2, a3, a7);
                            }
                            arrayList5.add(E);
                            i14 = i + 1;
                            f3 = f14;
                            arrayList2 = arrayList5;
                            np1Var = np1Var2;
                            i5 = i21;
                            i3 = i20;
                            length = i23;
                            i4 = i22;
                            arrayList4 = arrayList;
                        } else {
                            se.u("Index must be between 0 and size");
                            return np1Var2;
                        }
                    } else {
                        se.u("Index must be between 0 and size");
                        return np1Var2;
                    }
                }
                ArrayList arrayList6 = arrayList2;
                int i24 = i4;
                int i25 = i5;
                float f26 = f3;
                ArrayList arrayList7 = new ArrayList();
                int i26 = i25;
                while (i26 < length) {
                    int i27 = i26 + 1;
                    int i28 = i27 % length;
                    int i29 = i26 * 2;
                    long a11 = ha0.a(fArr[i29], fArr[i29 + 1]);
                    int i30 = (((i26 + length) - 1) % length) * 2;
                    long a12 = ha0.a(fArr[i30], fArr[i30 + 1]);
                    int i31 = i28 * 2;
                    long a13 = ha0.a(fArr[i31], fArr[i31 + 1]);
                    long S = lo.S(a11, a12);
                    long S2 = lo.S(a13, a11);
                    if ((lo.H(S2) * lo.G(S)) - (lo.G(S2) * lo.H(S)) > f26) {
                        z = i24;
                    } else {
                        z = i25;
                    }
                    arrayList7.add(new c90((List) arrayList6.get(i26), a11, ((jp1) arrayList3.get(i26)).i, z));
                    float a14 = ((uv) wn.n0((List) arrayList6.get(i26))).a();
                    float b8 = ((uv) wn.n0((List) arrayList6.get(i26))).b();
                    float f27 = ((uv) wn.g0((List) arrayList6.get(i28))).a[i25];
                    float f28 = ((uv) wn.g0((List) arrayList6.get(i28))).a[i24];
                    arrayList7.add(new e90(xn.E(xn.a(a14, b8, be2.c(a14, f27, 0.33333334f), be2.c(b8, f28, 0.33333334f), be2.c(a14, f27, 0.6666667f), be2.c(b8, f28, 0.6666667f), f27, f28))));
                    i26 = i27;
                }
                if (f == Float.MIN_VALUE || f2 == Float.MIN_VALUE) {
                    float f29 = f26;
                    float f30 = f29;
                    int i32 = i25;
                    while (i32 < fArr.length) {
                        int i33 = i32 + 1;
                        f30 += fArr[i32];
                        i32 += 2;
                        f29 += fArr[i33];
                    }
                    a2 = ha0.a((f30 / fArr.length) / 2.0f, (f29 / fArr.length) / 2.0f);
                } else {
                    a2 = ha0.a(f, f2);
                }
                return new np1(arrayList7, Float.intBitsToFloat((int) (a2 >> 32)), Float.intBitsToFloat((int) (a2 & 4294967295L)));
            }
            se.h("The vertices array should have even size");
            return null;
        }
        se.h("Polygons must have at least 3 vertices");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.e21 r24, defpackage.se0 r25, defpackage.se0 r26, defpackage.se0 r27, defpackage.se0 r28, int r29, long r30, long r32, final defpackage.th2 r34, final defpackage.fq r35, defpackage.ur r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.op1.b(e21, se0, se0, se0, se0, int, long, long, th2, fq, ur, int, int):void");
    }

    public static final void c(int i, se0 se0Var, fq fqVar, se0 se0Var2, se0 se0Var3, th2 th2Var, se0 se0Var4, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i10;
        boolean z6;
        boolean z7;
        boolean z8;
        int i11;
        urVar.Y(-280287501);
        int i12 = 4;
        if (urVar.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i13 = i2 | i3;
        if (urVar.h(se0Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i14 = i13 | i4;
        if (urVar.h(fqVar)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i15 = i14 | i5;
        if (urVar.h(se0Var2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i16 = i15 | i6;
        if (urVar.h(se0Var3)) {
            i7 = 16384;
        } else {
            i7 = SharedConstants.DefaultBufferSize;
        }
        int i17 = i16 | i7;
        if (urVar.f(th2Var)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i18 = i17 | i8;
        if (urVar.h(se0Var4)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i19 = i18 | i9;
        if ((599187 & i19) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i19 & 1, z)) {
            Object L = urVar.L();
            Object obj = or.a;
            if (L == obj) {
                L = new or1();
                urVar.h0(L);
            }
            or1 or1Var = (or1) L;
            if ((i19 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object L2 = urVar.L();
            if (z2 || L2 == obj) {
                L2 = new fq(605195056, true, new v2(i12, se0Var));
                urVar.h0(L2);
            }
            se0 se0Var5 = (se0) L2;
            if ((i19 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object L3 = urVar.L();
            if (z3 || L3 == obj) {
                L3 = new fq(418899191, true, new v2(5, se0Var2));
                urVar.h0(L3);
            }
            se0 se0Var6 = (se0) L3;
            if ((57344 & i19) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object L4 = urVar.L();
            if (z4 || L4 == obj) {
                L4 = new fq(338600263, true, new v2(6, se0Var3));
                urVar.h0(L4);
            }
            se0 se0Var7 = (se0) L4;
            if ((i19 & 896) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object L5 = urVar.L();
            if (!z5 && L5 != obj) {
                i10 = i19;
            } else {
                i10 = i19;
                L5 = new fq(-1776388365, true, new u2(27, fqVar, or1Var));
                urVar.h0(L5);
            }
            se0 se0Var8 = (se0) L5;
            if ((i10 & 3670016) == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            Object L6 = urVar.L();
            if (z6 || L6 == obj) {
                L6 = new fq(-1731662488, true, new v2(7, se0Var4));
                urVar.h0(L6);
            }
            se0 se0Var9 = (se0) L6;
            if ((i10 & 458752) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean f = z7 | urVar.f(se0Var5) | urVar.f(se0Var6) | urVar.f(se0Var7);
            if ((i10 & 14) == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean f2 = f | z8 | urVar.f(se0Var9) | urVar.f(se0Var8);
            Object L7 = urVar.L();
            if (!f2 && L7 != obj) {
                i11 = 0;
            } else {
                i11 = 0;
                Object ay0Var = new ay0(th2Var, se0Var5, se0Var6, se0Var7, i, se0Var9, or1Var, se0Var8);
                urVar.h0(ay0Var);
                L7 = ay0Var;
            }
            bf.s(null, (se0) L7, urVar, i11);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new dq(i, se0Var, fqVar, se0Var2, se0Var3, th2Var, se0Var4, i2);
        }
    }

    public static final Object[] d(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        bf.G(objArr, objArr2, 0, i, 6);
        bf.D(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final boolean e(int i, KeyEvent keyEvent) {
        if (((int) (mp0.v(keyEvent) >> 32)) == i) {
            return true;
        }
        return false;
    }

    public static final Object[] f(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        bf.G(objArr, objArr2, 0, i, 6);
        bf.D(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] g(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        bf.G(objArr, objArr2, 0, i, 6);
        bf.D(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static StaticLayout h(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            ll0.a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            ll0.a("invalid end value");
        }
        if (i3 < 0) {
            ll0.a("invalid maxLines value");
        }
        if (i < 0) {
            ll0.a("invalid width value");
        }
        if (i4 < 0) {
            ll0.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        obtain.setJustificationMode(i5);
        obtain.setUseLineSpacingFromFallbacks(true);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            d1.o(obtain, d1.d(d1.u(d1.c(d1.b(), i7), i8)));
        }
        if (i10 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static final ld2 i(ur urVar) {
        WeakHashMap weakHashMap = pi2.w;
        sa saVar = wm1.j(urVar).g;
        WeakHashMap weakHashMap2 = pi2.w;
        return new ld2(saVar, wm1.j(urVar).b);
    }

    public static final um1 j(w82 w82Var, int i) {
        v82 v82Var = w82Var.a;
        g31 g31Var = w82Var.b;
        if (v82Var.a.f.length() != 0) {
            int d = g31Var.d(i);
            if ((i != 0 && d == g31Var.d(i - 1)) || (i != v82Var.a.f.length() && d == g31Var.d(i + 1))) {
                return w82Var.a(i);
            }
        }
        return w82Var.g(i);
    }

    public static final int k(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final void l(ur urVar, Integer num, se0 se0Var) {
        if (urVar.S) {
            urVar.b(se0Var, num);
        }
    }

    public static boolean m(int i) {
        int type = Character.getType(i);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List n(jz1 jz1Var, int i, jz1 jz1Var2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        l60 l60Var;
        boolean z5;
        boolean z6;
        int i2;
        int i3;
        int i4;
        int u = jz1Var.u(i);
        int i5 = i + u;
        int f = jz1Var.f(i);
        int f2 = jz1Var.f(i5);
        int i6 = f2 - f;
        if (i >= 0 && (jz1Var.b[(jz1Var.r(i) * 5) + 1] & 201326592) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        jz1Var2.w(u);
        jz1Var2.x(i6, jz1Var2.t);
        if (jz1Var.g < i5) {
            jz1Var.B(i5);
        }
        if (jz1Var.k < f2) {
            jz1Var.C(f2, i5);
        }
        int[] iArr = jz1Var2.b;
        int i7 = jz1Var2.t;
        int i8 = i7 * 5;
        bf.B(jz1Var.b, iArr, i8, i * 5, i5 * 5);
        Object[] objArr = jz1Var2.c;
        int i9 = jz1Var2.i;
        System.arraycopy(jz1Var.c, f, objArr, i9, i6);
        int i10 = jz1Var2.v;
        iArr[i8 + 2] = i10;
        int i11 = i7 - i;
        int i12 = i7 + u;
        int g = i9 - jz1Var2.g(iArr, i7);
        int i13 = jz1Var2.m;
        int i14 = jz1Var2.l;
        int length = objArr.length;
        boolean z7 = z4;
        int i15 = i13;
        int i16 = i7;
        while (i16 < i12) {
            if (i16 != i7) {
                int i17 = (i16 * 5) + 2;
                iArr[i17] = iArr[i17] + i11;
            }
            int[] iArr2 = iArr;
            int g2 = jz1Var2.g(iArr, i16) + g;
            if (i15 < i16) {
                i3 = i7;
                i4 = 0;
            } else {
                i3 = i7;
                i4 = jz1Var2.k;
            }
            iArr2[(i16 * 5) + 4] = jz1.i(g2, i4, i14, length);
            if (i16 == i15) {
                i15++;
            }
            i16++;
            i7 = i3;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        jz1Var2.m = i15;
        int a2 = iz1.a(jz1Var.d, i, jz1Var.p());
        int a3 = iz1.a(jz1Var.d, i5, jz1Var.p());
        if (a2 < a3) {
            ArrayList arrayList = jz1Var.d;
            ArrayList arrayList2 = new ArrayList(a3 - a2);
            for (int i18 = a2; i18 < a3; i18++) {
                p3 p3Var = (p3) arrayList.get(i18);
                p3Var.a += i11;
                arrayList2.add(p3Var);
            }
            jz1Var2.d.addAll(iz1.a(jz1Var2.d, jz1Var2.t, jz1Var2.p()), arrayList2);
            arrayList.subList(a2, a3).clear();
            l60Var = arrayList2;
        } else {
            l60Var = l60.e;
        }
        if (!l60Var.isEmpty()) {
            HashMap hashMap = jz1Var.e;
            HashMap hashMap2 = jz1Var2.e;
            if (hashMap != null && hashMap2 != null) {
                int size = l60Var.size();
                for (int i19 = 0; i19 < size; i19++) {
                }
            }
        }
        int i20 = jz1Var2.v;
        jz1Var2.O(i10);
        int E = jz1Var.E(jz1Var.b, i);
        if (!z3) {
            z5 = false;
        } else if (z) {
            if (E >= 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                jz1Var.P();
                jz1Var.a(E - jz1Var.t);
                jz1Var.P();
            }
            jz1Var.a(i - jz1Var.t);
            boolean H = jz1Var.H();
            if (z6) {
                jz1Var.M();
                jz1Var.j();
                jz1Var.M();
                jz1Var.j();
            }
            z5 = H;
        } else {
            boolean I = jz1Var.I(i, u);
            jz1Var.J(f, i6, i - 1);
            z5 = I;
        }
        if (z5) {
            vr.a("Unexpectedly removed anchors");
        }
        int i21 = jz1Var2.o;
        int i22 = iArr3[i8 + 1];
        if ((1073741824 & i22) != 0) {
            i2 = 1;
        } else {
            i2 = i22 & 67108863;
        }
        jz1Var2.o = i21 + i2;
        if (z2) {
            jz1Var2.t = i12;
            jz1Var2.i = i9 + i6;
        }
        if (z7) {
            jz1Var2.T(i10);
        }
        return l60Var;
    }

    public static final void o(ur urVar, oe0 oe0Var) {
        urVar.b(new h8(oe0Var, 24), od2.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.k92 p(defpackage.k92 r28, defpackage.jq0 r29) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.op1.p(k92, jq0):k92");
    }

    public static final void q(ur urVar, se0 se0Var, Object obj) {
        if (!urVar.S && sn0.r(urVar.L(), obj)) {
            return;
        }
        urVar.h0(obj);
        urVar.b(se0Var, obj);
    }

    public static final void r() {
        throw new UnsupportedOperationException();
    }
}
