package defpackage;

import android.R;
import android.content.Context;
import android.graphics.BlendMode;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityManager;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jsoup.internal.SharedConstants;

/* loaded from: classes.dex */
public abstract class c01 {
    public static ij0 C;
    public static ij0 D;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData};
    public static final me e = new me(3);
    public static final me f = new me(2);
    public static final ne g = new ne();
    public static final xl1 h = new xl1(18);
    public static final xl1 i = new xl1(19);
    public static final ad0 j = new ad0("RESUME_TOKEN", 5);
    public static final fq k = new fq(-2100338031, false, new le(7));
    public static final fq l = new fq(486607993, false, new le(8));
    public static final Object m = new Object();
    public static final Class[] n = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final qc2 o = qc2.i;
    public static final ad0 p = new ad0("NULL", 5);
    public static final no q = no.h;
    public static final mw1 r = mw1.g;
    public static final no s = no.f;
    public static final qc2 t = qc2.g;
    public static final byte[] u = {112, 114, 111, 0};
    public static final byte[] v = {112, 114, 109, 0};
    public static final wm1 w = new wm1(2);
    public static final wm1 x = new wm1(3);
    public static final wm1 y = new wm1(4);
    public static final Object z = new Object();
    public static final nv1 A = new nv1(9);
    public static final byte[] B = new byte[0];

    public static final t22 A(a12 a12Var) {
        t22 t22Var = a12Var.e;
        t22Var.getClass();
        return (t22) q02.t(t22Var, a12Var);
    }

    public static final wq1 B(tg2 tg2Var) {
        rg2 i2 = wm1.i(tg2Var, new kz(1), 4);
        return (wq1) ((q4) i2.f).n(yl1.a(wq1.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final int C(a12 a12Var) {
        t22 t22Var = a12Var.e;
        t22Var.getClass();
        return ((t22) q02.h(t22Var)).e;
    }

    public static final e21 D(zr0 zr0Var, nj njVar, sb1 sb1Var) {
        return new vr0(zr0Var, njVar, sb1Var);
    }

    public static final kp1 E(cg0 cg0Var) {
        int ordinal = cg0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return lp1.a(24.0f);
                }
                se.m();
                return null;
            }
            return lp1.b(4.0f, 4.0f, 24.0f, 24.0f);
        }
        return lp1.b(24.0f, 24.0f, 4.0f, 4.0f);
    }

    public static final boolean F(a12 a12Var, oe0 oe0Var) {
        int i2;
        g0 g0Var;
        Object invoke;
        i02 j2;
        boolean p2;
        do {
            synchronized (z) {
                t22 t22Var = a12Var.e;
                t22Var.getClass();
                t22 t22Var2 = (t22) q02.h(t22Var);
                i2 = t22Var2.d;
                g0Var = t22Var2.c;
            }
            g0Var.getClass();
            dg1 e2 = g0Var.e();
            invoke = oe0Var.invoke(e2);
            g0 c2 = e2.c();
            if (sn0.r(c2, g0Var)) {
                break;
            }
            t22 t22Var3 = a12Var.e;
            t22Var3.getClass();
            synchronized (q02.c) {
                j2 = q02.j();
                p2 = p((t22) q02.w(t22Var3, a12Var, j2), i2, c2, true);
            }
            q02.n(j2, a12Var);
        } while (!p2);
        return ((Boolean) invoke).booleanValue();
    }

    public static final e21 G(e21 e21Var, oe0 oe0Var) {
        return e21Var.d(new yb0(oe0Var));
    }

    public static void H(int i2, int[] iArr, int[] iArr2, boolean z2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 : iArr) {
            i4 += i5;
        }
        float f2 = (i2 - i4) / 2.0f;
        if (!z2) {
            int length = iArr.length;
            int i6 = 0;
            while (i3 < length) {
                int i7 = iArr[i3];
                iArr2[i6] = Math.round(f2);
                f2 += i7;
                i3++;
                i6++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i8 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i8;
            } else {
                return;
            }
        }
    }

    public static void I(int i2, int[] iArr, int[] iArr2, boolean z2) {
        float f2;
        if (iArr.length != 0) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 : iArr) {
                i4 += i5;
            }
            float max = (i2 - i4) / Math.max(iArr.length - 1, 1);
            if (z2 && iArr.length == 1) {
                f2 = max;
            } else {
                f2 = 0.0f;
            }
            if (!z2) {
                int length = iArr.length;
                int i6 = 0;
                while (i3 < length) {
                    int i7 = iArr[i3];
                    iArr2[i6] = Math.round(f2);
                    f2 += i7 + max;
                    i3++;
                    i6++;
                }
                return;
            }
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i8 = iArr[length2];
                iArr2[length2] = Math.round(f2);
                f2 += i8 + max;
            }
        }
    }

    public static int[] J(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) xn.R(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static o00[] K(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, o00[] o00VarArr) {
        byte[] bArr3 = fc2.z;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(fc2.u, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int R = (int) xn.R(fileInputStream, 1);
                    byte[] O = xn.O(fileInputStream, (int) xn.R(fileInputStream, 4), (int) xn.R(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(O);
                        try {
                            o00[] L = L(byteArrayInputStream, R, o00VarArr);
                            byteArrayInputStream.close();
                            return L;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    se.p("Content found after the end of file");
                    return null;
                }
                se.p("Unsupported meta version");
                return null;
            }
            se.p("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (Arrays.equals(bArr, fc2.A)) {
            int R2 = (int) xn.R(fileInputStream, 2);
            byte[] O2 = xn.O(fileInputStream, (int) xn.R(fileInputStream, 4), (int) xn.R(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(O2);
                try {
                    o00[] M = M(byteArrayInputStream2, bArr2, R2, o00VarArr);
                    byteArrayInputStream2.close();
                    return M;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            se.p("Content found after the end of file");
            return null;
        }
        se.p("Unsupported meta version");
        return null;
    }

    public static o00[] L(ByteArrayInputStream byteArrayInputStream, int i2, o00[] o00VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new o00[0];
        }
        if (i2 == o00VarArr.length) {
            String[] strArr = new String[i2];
            int[] iArr = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                int R = (int) xn.R(byteArrayInputStream, 2);
                iArr[i3] = (int) xn.R(byteArrayInputStream, 2);
                strArr[i3] = new String(xn.N(byteArrayInputStream, R), StandardCharsets.UTF_8);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                o00 o00Var = o00VarArr[i4];
                if (o00Var.b.equals(strArr[i4])) {
                    int i5 = iArr[i4];
                    o00Var.e = i5;
                    o00Var.h = J(byteArrayInputStream, i5);
                } else {
                    se.p("Order of dexfiles in metadata did not match baseline");
                    return null;
                }
            }
            return o00VarArr;
        }
        se.p("Mismatched number of dex files found in metadata");
        return null;
    }

    public static o00[] M(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, o00[] o00VarArr) {
        String str;
        o00 o00Var;
        if (byteArrayInputStream.available() == 0) {
            return new o00[0];
        }
        if (i2 == o00VarArr.length) {
            for (int i3 = 0; i3 < i2; i3++) {
                xn.R(byteArrayInputStream, 2);
                String str2 = new String(xn.N(byteArrayInputStream, (int) xn.R(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long R = xn.R(byteArrayInputStream, 4);
                int R2 = (int) xn.R(byteArrayInputStream, 2);
                if (o00VarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    for (int i4 = 0; i4 < o00VarArr.length; i4++) {
                        if (o00VarArr[i4].b.equals(str)) {
                            o00Var = o00VarArr[i4];
                            break;
                        }
                    }
                }
                o00Var = null;
                if (o00Var != null) {
                    o00Var.d = R;
                    int[] J = J(byteArrayInputStream, R2);
                    if (Arrays.equals(bArr, fc2.y)) {
                        o00Var.e = R2;
                        o00Var.h = J;
                    }
                } else {
                    se.p("Missing profile key: ".concat(str2));
                    return null;
                }
            }
            return o00VarArr;
        }
        se.p("Mismatched number of dex files found in metadata");
        return null;
    }

    public static o00[] N(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, fc2.v)) {
            int R = (int) xn.R(fileInputStream, 1);
            byte[] O = xn.O(fileInputStream, (int) xn.R(fileInputStream, 4), (int) xn.R(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(O);
                try {
                    o00[] O2 = O(byteArrayInputStream, str, R);
                    byteArrayInputStream.close();
                    return O2;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            se.p("Content found after the end of file");
            return null;
        }
        se.p("Unsupported version");
        return null;
    }

    public static o00[] O(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3;
        int i4 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new o00[0];
        }
        o00[] o00VarArr = new o00[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            int R = (int) xn.R(byteArrayInputStream, 2);
            int R2 = (int) xn.R(byteArrayInputStream, 2);
            o00VarArr[i5] = new o00(str, new String(xn.N(byteArrayInputStream, R), StandardCharsets.UTF_8), xn.R(byteArrayInputStream, 4), R2, (int) xn.R(byteArrayInputStream, 4), (int) xn.R(byteArrayInputStream, 4), new int[R2], new TreeMap());
        }
        int i6 = 0;
        while (i6 < i2) {
            o00 o00Var = o00VarArr[i6];
            int available = byteArrayInputStream.available();
            int i7 = o00Var.f;
            int i8 = o00Var.g;
            TreeMap treeMap = o00Var.i;
            int i9 = available - i7;
            int i10 = i4;
            while (byteArrayInputStream.available() > i9) {
                i10 += (int) xn.R(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i10), 1);
                int R3 = (int) xn.R(byteArrayInputStream, 2);
                while (R3 > 0) {
                    xn.R(byteArrayInputStream, 2);
                    int R4 = (int) xn.R(byteArrayInputStream, 1);
                    if (R4 != 6 && R4 != 7) {
                        while (R4 > 0) {
                            xn.R(byteArrayInputStream, 1);
                            int i11 = i4;
                            int i12 = i6;
                            for (int R5 = (int) xn.R(byteArrayInputStream, 1); R5 > 0; R5--) {
                                xn.R(byteArrayInputStream, 2);
                            }
                            R4--;
                            i4 = i11;
                            i6 = i12;
                        }
                    }
                    R3--;
                    i4 = i4;
                    i6 = i6;
                }
            }
            int i13 = i4;
            int i14 = i6;
            if (byteArrayInputStream.available() == i9) {
                o00Var.h = J(byteArrayInputStream, o00Var.e);
                BitSet valueOf = BitSet.valueOf(xn.N(byteArrayInputStream, (((i8 * 2) + 7) & (-8)) / 8));
                for (int i15 = i13; i15 < i8; i15++) {
                    if (valueOf.get(i15)) {
                        i3 = 2;
                    } else {
                        i3 = i13;
                    }
                    if (valueOf.get(i15 + i8)) {
                        i3 |= 4;
                    }
                    if (i3 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i15));
                        if (num == null) {
                            num = Integer.valueOf(i13);
                        }
                        treeMap.put(Integer.valueOf(i15), Integer.valueOf(i3 | num.intValue()));
                    }
                }
                i6 = i14 + 1;
                i4 = i13;
            } else {
                se.p("Read too much data during profile line parse");
                return null;
            }
        }
        return o00VarArr;
    }

    public static final lw0 P(int i2, int i3, ur urVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4 = 0;
        int i5 = 1;
        if ((i3 & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object systemService = ((Context) urVar.j(l6.b)).getSystemService("accessibility");
        systemService.getClass();
        Object obj = (AccessibilityManager) systemService;
        if ((((i2 & 14) ^ 6) > 4 && urVar.g(true)) || (i2 & 6) == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((((i2 & 112) ^ 48) > 32 && urVar.g(true)) || (i2 & 48) == 32) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z6 = z3 | z4;
        if ((((i2 & 896) ^ 384) > 256 && urVar.g(z2)) || (i2 & 384) == 256) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z7 = z5 | z6;
        Object L = urVar.L();
        Object obj2 = or.a;
        if (z7 || L == obj2) {
            L = new lw0(true, true, z2);
            urVar.h0(L);
        }
        lw0 lw0Var = (lw0) L;
        uu0 uu0Var = (uu0) urVar.j(bx0.a);
        boolean f2 = urVar.f(lw0Var) | urVar.h(obj);
        Object L2 = urVar.L();
        if (f2 || L2 == obj2) {
            L2 = new i(i5, lw0Var, obj);
            urVar.h0(L2);
        }
        oe0 oe0Var = (oe0) L2;
        boolean f3 = urVar.f(lw0Var) | urVar.h(obj);
        Object L3 = urVar.L();
        if (f3 || L3 == obj2) {
            L3 = new j1(i4, lw0Var, obj);
            urVar.h0(L3);
        }
        h(uu0Var, oe0Var, (de0) L3, urVar, 0);
        return lw0Var;
    }

    public static int Q(double d2) {
        if (!Double.isNaN(d2)) {
            if (d2 > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d2 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d2);
        }
        se.h("Cannot round NaN value.");
        return 0;
    }

    public static int R(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        se.h("Cannot round NaN value.");
        return 0;
    }

    public static long S(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        se.h("Cannot round NaN value.");
        return 0L;
    }

    public static final BlendMode T(int i2) {
        if (i2 == 0) {
            return BlendMode.CLEAR;
        }
        if (i2 == 1) {
            return BlendMode.SRC;
        }
        if (i2 == 2) {
            return BlendMode.DST;
        }
        if (i2 == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i2 == 4) {
            return BlendMode.DST_OVER;
        }
        if (i2 == 5) {
            return BlendMode.SRC_IN;
        }
        if (i2 == 6) {
            return BlendMode.DST_IN;
        }
        if (i2 == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i2 == 8) {
            return BlendMode.DST_OUT;
        }
        if (i2 == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i2 == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i2 == 11) {
            return BlendMode.XOR;
        }
        if (i2 == 12) {
            return BlendMode.PLUS;
        }
        if (i2 == 13) {
            return BlendMode.MODULATE;
        }
        if (i2 == 14) {
            return BlendMode.SCREEN;
        }
        if (i2 == 15) {
            return BlendMode.OVERLAY;
        }
        if (i2 == 16) {
            return BlendMode.DARKEN;
        }
        if (i2 == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i2 == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i2 == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i2 == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i2 == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i2 == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i2 == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i2 == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i2 == 25) {
            return BlendMode.HUE;
        }
        if (i2 == 26) {
            return BlendMode.SATURATION;
        }
        if (i2 == 27) {
            return BlendMode.COLOR;
        }
        if (i2 == 28) {
            return BlendMode.LUMINOSITY;
        }
        return BlendMode.SRC_OVER;
    }

    public static String U(int i2) {
        if (i2 == 0) {
            return "Clear";
        }
        if (i2 == 1) {
            return "Src";
        }
        if (i2 == 2) {
            return "Dst";
        }
        if (i2 == 3) {
            return "SrcOver";
        }
        if (i2 == 4) {
            return "DstOver";
        }
        if (i2 == 5) {
            return "SrcIn";
        }
        if (i2 == 6) {
            return "DstIn";
        }
        if (i2 == 7) {
            return "SrcOut";
        }
        if (i2 == 8) {
            return "DstOut";
        }
        if (i2 == 9) {
            return "SrcAtop";
        }
        if (i2 == 10) {
            return "DstAtop";
        }
        if (i2 == 11) {
            return "Xor";
        }
        if (i2 == 12) {
            return "Plus";
        }
        if (i2 == 13) {
            return "Modulate";
        }
        if (i2 == 14) {
            return "Screen";
        }
        if (i2 == 15) {
            return "Overlay";
        }
        if (i2 == 16) {
            return "Darken";
        }
        if (i2 == 17) {
            return "Lighten";
        }
        if (i2 == 18) {
            return "ColorDodge";
        }
        if (i2 == 19) {
            return "ColorBurn";
        }
        if (i2 == 20) {
            return "HardLight";
        }
        if (i2 == 21) {
            return "Softlight";
        }
        if (i2 == 22) {
            return "Difference";
        }
        if (i2 == 23) {
            return "Exclusion";
        }
        if (i2 == 24) {
            return "Multiply";
        }
        if (i2 == 25) {
            return "Hue";
        }
        if (i2 == 26) {
            return "Saturation";
        }
        if (i2 == 27) {
            return "Color";
        }
        if (i2 == 28) {
            return "Luminosity";
        }
        return "Unknown";
    }

    public static final e21 V(e21 e21Var, boolean z2, r31 r31Var, boolean z3, ap1 ap1Var, oe0 oe0Var) {
        return e21Var.d(new ia2(z2, r31Var, z3, ap1Var, oe0Var));
    }

    /* JADX WARN: Finally extract failed */
    public static boolean W(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, o00[] o00VarArr) {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = fc2.y;
        byte[] bArr3 = fc2.x;
        byte[] bArr4 = fc2.u;
        int i3 = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                xn.Z(byteArrayOutputStream2, o00VarArr.length);
                int i4 = 2;
                int i5 = 2;
                for (o00 o00Var : o00VarArr) {
                    xn.Y(byteArrayOutputStream2, o00Var.c, 4);
                    xn.Y(byteArrayOutputStream2, o00Var.d, 4);
                    xn.Y(byteArrayOutputStream2, o00Var.g, 4);
                    String w2 = w(o00Var.a, o00Var.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = w2.getBytes(charset).length;
                    xn.Z(byteArrayOutputStream2, length2);
                    i5 = i5 + 14 + length2;
                    byteArrayOutputStream2.write(w2.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i5 == byteArray.length) {
                    uj2 uj2Var = new uj2(1, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList.add(uj2Var);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < o00VarArr.length) {
                        try {
                            o00 o00Var2 = o00VarArr[i6];
                            xn.Z(byteArrayOutputStream3, i6);
                            xn.Z(byteArrayOutputStream3, o00Var2.e);
                            i7 = i7 + 4 + (o00Var2.e * i4);
                            int[] iArr = o00Var2.h;
                            int length3 = iArr.length;
                            int i8 = i3;
                            while (i3 < length3) {
                                int i9 = iArr[i3];
                                xn.Z(byteArrayOutputStream3, i9 - i8);
                                i3++;
                                i4 = i4;
                                i8 = i9;
                            }
                            i6++;
                            i3 = 0;
                        } catch (Throwable th) {
                        }
                    }
                    int i10 = i4;
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i7 == byteArray2.length) {
                        uj2 uj2Var2 = new uj2(3, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList.add(uj2Var2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i11 = 0;
                        for (int i12 = 0; i12 < o00VarArr.length; i12++) {
                            try {
                                o00 o00Var3 = o00VarArr[i12];
                                Iterator it = o00Var3.i.entrySet().iterator();
                                int i13 = 0;
                                while (it.hasNext()) {
                                    i13 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
                                    Z(byteArrayOutputStream4, i13, o00Var3);
                                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.close();
                                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
                                        a0(byteArrayOutputStream4, o00Var3);
                                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                        byteArrayOutputStream4.close();
                                        xn.Z(byteArrayOutputStream3, i12);
                                        int length4 = byteArray3.length + 2 + byteArray4.length;
                                        int i14 = i11 + 6;
                                        xn.Y(byteArrayOutputStream3, length4, 4);
                                        xn.Z(byteArrayOutputStream3, i13);
                                        byteArrayOutputStream3.write(byteArray3);
                                        byteArrayOutputStream3.write(byteArray4);
                                        i11 = i14 + length4;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i11 == byteArray5.length) {
                            uj2 uj2Var3 = new uj2(4, byteArray5, true);
                            byteArrayOutputStream3.close();
                            arrayList.add(uj2Var3);
                            long size = 12 + (arrayList.size() * 16);
                            xn.Y(byteArrayOutputStream, arrayList.size(), 4);
                            int i15 = 0;
                            while (i15 < arrayList.size()) {
                                uj2 uj2Var4 = (uj2) arrayList.get(i15);
                                int i16 = uj2Var4.a;
                                byte[] bArr5 = uj2Var4.b;
                                if (i16 != 1) {
                                    i2 = i10;
                                    if (i16 != i2) {
                                        if (i16 != 3) {
                                            if (i16 != 4) {
                                                if (i16 == 5) {
                                                    j2 = 4;
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                j2 = 3;
                                            }
                                        } else {
                                            j2 = 2;
                                        }
                                    } else {
                                        j2 = 1;
                                    }
                                } else {
                                    i2 = i10;
                                    j2 = 0;
                                }
                                xn.Y(byteArrayOutputStream, j2, 4);
                                xn.Y(byteArrayOutputStream, size, 4);
                                if (uj2Var4.c) {
                                    long length5 = bArr5.length;
                                    byte[] t2 = xn.t(bArr5);
                                    arrayList2.add(t2);
                                    xn.Y(byteArrayOutputStream, t2.length, 4);
                                    xn.Y(byteArrayOutputStream, length5, 4);
                                    length = t2.length;
                                } else {
                                    arrayList2.add(bArr5);
                                    xn.Y(byteArrayOutputStream, bArr5.length, 4);
                                    xn.Y(byteArrayOutputStream, 0L, 4);
                                    length = bArr5.length;
                                }
                                size += length;
                                i15++;
                                i10 = i2;
                            }
                            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                                byteArrayOutputStream.write((byte[]) arrayList2.get(i17));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        byte[] bArr6 = fc2.v;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] s2 = s(o00VarArr, bArr6);
            xn.Y(byteArrayOutputStream, o00VarArr.length, 1);
            xn.Y(byteArrayOutputStream, s2.length, 4);
            byte[] t3 = xn.t(s2);
            xn.Y(byteArrayOutputStream, t3.length, 4);
            byteArrayOutputStream.write(t3);
            return true;
        }
        if (Arrays.equals(bArr, bArr3)) {
            xn.Y(byteArrayOutputStream, o00VarArr.length, 1);
            for (o00 o00Var4 : o00VarArr) {
                int size2 = o00Var4.i.size() * 4;
                String w3 = w(o00Var4.a, o00Var4.b, bArr3);
                Charset charset2 = StandardCharsets.UTF_8;
                xn.Z(byteArrayOutputStream, w3.getBytes(charset2).length);
                xn.Z(byteArrayOutputStream, o00Var4.h.length);
                xn.Y(byteArrayOutputStream, size2, 4);
                xn.Y(byteArrayOutputStream, o00Var4.c, 4);
                byteArrayOutputStream.write(w3.getBytes(charset2));
                Iterator it2 = o00Var4.i.keySet().iterator();
                while (it2.hasNext()) {
                    xn.Z(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                    xn.Z(byteArrayOutputStream, 0);
                }
                for (int i18 : o00Var4.h) {
                    xn.Z(byteArrayOutputStream, i18);
                }
            }
            return true;
        }
        byte[] bArr7 = fc2.w;
        if (Arrays.equals(bArr, bArr7)) {
            byte[] s3 = s(o00VarArr, bArr7);
            xn.Y(byteArrayOutputStream, o00VarArr.length, 1);
            xn.Y(byteArrayOutputStream, s3.length, 4);
            byte[] t4 = xn.t(s3);
            xn.Y(byteArrayOutputStream, t4.length, 4);
            byteArrayOutputStream.write(t4);
            return true;
        }
        if (Arrays.equals(bArr, bArr2)) {
            xn.Z(byteArrayOutputStream, o00VarArr.length);
            for (o00 o00Var5 : o00VarArr) {
                String str = o00Var5.a;
                TreeMap treeMap = o00Var5.i;
                String w4 = w(str, o00Var5.b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                xn.Z(byteArrayOutputStream, w4.getBytes(charset3).length);
                xn.Z(byteArrayOutputStream, treeMap.size());
                xn.Z(byteArrayOutputStream, o00Var5.h.length);
                xn.Y(byteArrayOutputStream, o00Var5.c, 4);
                byteArrayOutputStream.write(w4.getBytes(charset3));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    xn.Z(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i19 : o00Var5.h) {
                    xn.Z(byteArrayOutputStream, i19);
                }
            }
            return true;
        }
        return false;
    }

    public static void X(ByteArrayOutputStream byteArrayOutputStream, o00 o00Var) {
        a0(byteArrayOutputStream, o00Var);
        int i2 = o00Var.g;
        int[] iArr = o00Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            xn.Z(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : o00Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void Y(ByteArrayOutputStream byteArrayOutputStream, o00 o00Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        xn.Z(byteArrayOutputStream, str.getBytes(charset).length);
        xn.Z(byteArrayOutputStream, o00Var.e);
        xn.Y(byteArrayOutputStream, o00Var.f, 4);
        xn.Y(byteArrayOutputStream, o00Var.c, 4);
        xn.Y(byteArrayOutputStream, o00Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void Z(ByteArrayOutputStream byteArrayOutputStream, int i2, o00 o00Var) {
        int i3 = o00Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : o00Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static hc a(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new hc(f2.A, Float.valueOf(f2), new ic(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static void a0(ByteArrayOutputStream byteArrayOutputStream, o00 o00Var) {
        int i2 = 0;
        for (Map.Entry entry : o00Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                xn.Z(byteArrayOutputStream, intValue - i2);
                xn.Z(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static final void b(final kd kdVar, cg0 cg0Var, oe0 oe0Var, ur urVar, int i2) {
        int i3;
        int i4;
        boolean z2;
        final boolean z3;
        boolean z4;
        kp1 b2;
        String str;
        kdVar.getClass();
        oe0Var.getClass();
        urVar.Y(931125936);
        if (urVar.h(kdVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (urVar.h(oe0Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i6 = i5 | i4;
        if ((i6 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i6 & 1, z2)) {
            final h32 c2 = jx0.c(urVar);
            final Context context = (Context) urVar.j(l6.b);
            String str2 = kdVar.f;
            if (str2 != null && (str = kdVar.d) != null && !str2.equals(str)) {
                z3 = true;
            } else {
                z3 = false;
            }
            e21 b3 = hy1.b(b21.a, 1.0f);
            if ((i6 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean h2 = z4 | urVar.h(kdVar);
            Object L = urVar.L();
            if (h2 || L == or.a) {
                L = new j1(19, oe0Var, kdVar);
                urVar.h0(L);
            }
            e21 s2 = f2.s(b3, false, null, (de0) L, 15);
            int ordinal = cg0Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        b2 = lp1.a(24.0f);
                    } else {
                        se.m();
                        return;
                    }
                } else {
                    b2 = lp1.b(4.0f, 4.0f, 24.0f, 24.0f);
                }
            } else {
                b2 = lp1.b(24.0f, 24.0f, 4.0f, 4.0f);
            }
            rx.c(s2, b2, d6.r(((mo) urVar.j(oo.a)).F, 0L, urVar, 14), d6.s(62, 0.0f), go.N(-2014801118, new te0() { // from class: al0
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0263  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x031e  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x0344  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x03ba  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x03fe  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x05e1  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x05e5  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x05e8  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x05eb  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x05ee  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x046e  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0453  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x03ed  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0380  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0326  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0267  */
                /* JADX WARN: Type inference failed for: r7v12, types: [int] */
                /* JADX WARN: Type inference failed for: r7v34 */
                /* JADX WARN: Type inference failed for: r7v9 */
                @Override // defpackage.te0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r45, java.lang.Object r46, java.lang.Object r47) {
                    /*
                        Method dump skipped, instructions count: 1568
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.al0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, urVar), urVar, 196608, 16);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new l1(kdVar, cg0Var, oe0Var, i2, 4, false);
        }
    }

    public static final void c(boolean z2, de0 de0Var, ur urVar, int i2) {
        int i3;
        boolean z3;
        int i4;
        int i5;
        urVar.Y(-1339183247);
        if ((i2 & 6) == 0) {
            if (urVar.g(z2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (urVar.h(de0Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i6 = 1;
        if ((i3 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (urVar.O(i3 & 1, z3)) {
            mp0.b(z2, de0Var, urVar, i3 & WebSocketProtocol.PAYLOAD_SHORT);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new xg(z2, de0Var, i2, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public static final void d(el0 el0Var, de0 de0Var, ur urVar, int i2) {
        int i3;
        int i4;
        boolean z2;
        ur urVar2;
        h32 h32Var;
        o41 o41Var;
        xl1 xl1Var;
        ?? r0;
        boolean z3;
        Context context;
        ur urVar3;
        ur urVar4 = urVar;
        el0Var.getClass();
        urVar4.Y(-2070165071);
        if (urVar4.h(el0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (urVar4.h(de0Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar4.O(i6 & 1, z2)) {
            h32 c2 = jx0.c(urVar4);
            Context context2 = (Context) urVar4.j(l6.b);
            o41 q2 = lo.q(el0Var.e, urVar4);
            Object L = urVar4.L();
            xl1 xl1Var2 = or.a;
            if (L == xl1Var2) {
                L = fr1.k(Boolean.FALSE);
                urVar4.h0(L);
            }
            o41 o41Var2 = (o41) L;
            if (((Boolean) o41Var2.getValue()).booleanValue()) {
                urVar4.X(-851906820);
                Object L2 = urVar4.L();
                if (L2 == xl1Var2) {
                    L2 = new z9(o41Var2, 5);
                    urVar4.h0(L2);
                }
                h32Var = c2;
                context = context2;
                xl1Var = xl1Var2;
                z3 = true;
                r0 = 0;
                o41Var = o41Var2;
                mp0.a((de0) L2, go.N(1474553662, new be(el0Var, de0Var, o41Var2, c2), urVar4), null, go.N(1962600768, new u2(15, o41Var2, c2), urVar4), null, go.N(-1844319422, new sd(c2, 6), urVar4), go.N(547187779, new sd(c2, 7), urVar4), null, 0L, 0L, 0L, 0L, null, urVar, 1772598, 16276);
                ur urVar5 = urVar;
                urVar5.p(false);
                urVar3 = urVar5;
            } else {
                h32Var = c2;
                o41Var = o41Var2;
                xl1Var = xl1Var2;
                r0 = 0;
                z3 = true;
                context = context2;
                urVar4.X(-851117839);
                urVar4.p(false);
                urVar3 = urVar4;
            }
            dl0 dl0Var = (dl0) q2.getValue();
            if (dl0Var instanceof cl0) {
                urVar3.X(-851048089);
                rx.f(r0, urVar3);
                urVar3.p(r0);
                urVar2 = urVar3;
            } else if (dl0Var instanceof bl0) {
                urVar3.X(-850876690);
                p90 p90Var = hy1.c;
                rc1 rc1Var = new rc1(16.0f, 16.0f, 16.0f, 16.0f);
                pe peVar = new pe(16.0f, z3, new le(r0));
                Context context3 = context;
                h32 h32Var2 = h32Var;
                boolean h2 = urVar3.h(dl0Var) | urVar3.h(context3) | urVar3.h(h32Var2);
                Object L3 = urVar3.L();
                if (h2 || L3 == xl1Var) {
                    va vaVar = new va((bl0) dl0Var, context3, o41Var, h32Var2, 3);
                    urVar3.h0(vaVar);
                    L3 = vaVar;
                }
                io.d(24966, 490, null, null, peVar, urVar3, null, (oe0) L3, null, p90Var, rc1Var, false);
                urVar3.p(r0);
                urVar2 = urVar3;
            } else {
                urVar3.X(-858735962);
                urVar3.p(r0);
                se.m();
                return;
            }
        } else {
            urVar4.R();
            urVar2 = urVar4;
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new u2(el0Var, i2, 16, de0Var);
        }
    }

    public static final void e(ij0 ij0Var, String str, String str2, final int i2, final oe0 oe0Var, ur urVar, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        final o41 o41Var;
        int i9 = i2;
        ur urVar2 = urVar;
        str.getClass();
        str2.getClass();
        oe0Var.getClass();
        urVar2.Y(520280354);
        if (urVar2.f(ij0Var)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i10 = i3 | i4;
        if (urVar2.f(str)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i11 = i10 | i5;
        if (urVar2.f(str2)) {
            i6 = 256;
        } else {
            i6 = 128;
        }
        int i12 = i11 | i6;
        if (urVar2.d(i9)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i13 = i12 | i7;
        if (urVar2.h(oe0Var)) {
            i8 = 16384;
        } else {
            i8 = SharedConstants.DefaultBufferSize;
        }
        int i14 = i13 | i8;
        if ((i14 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar2.O(i14 & 1, z2)) {
            final List<xd1> F = xn.F(new xd1(0, "English"), new xd1(1, "中文"), new xd1(2, "Português"), new xd1(3, "Русский"), new xd1(4, "Українська"));
            for (xd1 xd1Var : F) {
                if (((Number) xd1Var.e).intValue() == i9) {
                    final String str3 = (String) xd1Var.f;
                    Object L = urVar2.L();
                    xl1 xl1Var = or.a;
                    if (L == xl1Var) {
                        L = fr1.k(Boolean.FALSE);
                        urVar2.h0(L);
                    }
                    o41 o41Var2 = (o41) L;
                    up1 a2 = tp1.a(e, g3.p, urVar2, 48);
                    int hashCode = Long.hashCode(urVar2.T);
                    sf1 l2 = urVar2.l();
                    b21 b21Var = b21.a;
                    e21 Q = fp.Q(urVar2, b21Var);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar2.a0();
                    if (urVar2.S) {
                        urVar2.k(hsVar);
                    } else {
                        urVar2.k0();
                    }
                    gb gbVar = kr.f;
                    op1.q(urVar2, gbVar, a2);
                    gb gbVar2 = kr.e;
                    op1.q(urVar2, gbVar2, l2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    gb gbVar3 = kr.g;
                    op1.l(urVar2, valueOf, gbVar3);
                    i5 i5Var = kr.h;
                    op1.o(urVar2, i5Var);
                    gb gbVar4 = kr.d;
                    op1.q(urVar2, gbVar4, Q);
                    y22 y22Var = oo.a;
                    ej0.a(ij0Var, null, null, ((mo) urVar2.j(y22Var)).a, urVar2, (i14 & 14) | 48, 4);
                    xp1.a(urVar2, hy1.j(b21Var, 16.0f));
                    pr0 pr0Var = new pr0(1.0f, true);
                    yo a3 = wo.a(g, g3.r, urVar2, 0);
                    int hashCode2 = Long.hashCode(urVar2.T);
                    sf1 l3 = urVar2.l();
                    e21 Q2 = fp.Q(urVar2, pr0Var);
                    urVar2.a0();
                    if (urVar2.S) {
                        urVar2.k(hsVar);
                    } else {
                        urVar2.k0();
                    }
                    op1.q(urVar2, gbVar, a3);
                    op1.q(urVar2, gbVar2, l3);
                    l90.t(hashCode2, urVar2, gbVar3, urVar2, i5Var);
                    op1.q(urVar2, gbVar4, Q2);
                    y22 y22Var2 = rc2.a;
                    t82.b(str, null, ((mo) urVar2.j(y22Var)).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92.a(((pc2) urVar2.j(y22Var2)).h, 0L, 0L, sd0.i, null, 0L, 0L, null, 16777211), urVar, (i14 >> 3) & 14, 0, 131066);
                    xp1.a(urVar, hy1.c(b21Var, 4.0f));
                    t82.b(str2, null, ((mo) urVar.j(y22Var)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar.j(y22Var2)).k, urVar, (i14 >> 6) & 14, 0, 131066);
                    urVar.p(true);
                    urVar.p(true);
                    xp1.a(urVar, hy1.c(b21Var, 12.0f));
                    boolean booleanValue = ((Boolean) o41Var2.getValue()).booleanValue();
                    Object L2 = urVar.L();
                    if (L2 == xl1Var) {
                        o41Var = o41Var2;
                        L2 = new aa(o41Var, 5);
                        urVar.h0(L2);
                    } else {
                        o41Var = o41Var2;
                    }
                    fp.d(booleanValue, (oe0) L2, hy1.b(b21Var, 1.0f), go.N(-1548992308, new te0() { // from class: wv1
                        @Override // defpackage.te0
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            boolean z3;
                            final o41 o41Var3;
                            boolean h2;
                            int i15;
                            h80 h80Var = (h80) obj;
                            ur urVar3 = (ur) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            h80Var.getClass();
                            if ((intValue & 6) == 0) {
                                if ((intValue & 8) == 0) {
                                    h2 = urVar3.f(h80Var);
                                } else {
                                    h2 = urVar3.h(h80Var);
                                }
                                if (h2) {
                                    i15 = 4;
                                } else {
                                    i15 = 2;
                                }
                                intValue |= i15;
                            }
                            int i16 = intValue;
                            if ((i16 & 19) != 18) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (urVar3.O(i16 & 1, z3)) {
                                kp1 a4 = lp1.a(12.0f);
                                e21 b2 = h80Var.b(hy1.b(b21.a, 1.0f));
                                Object L3 = urVar3.L();
                                xl1 xl1Var2 = or.a;
                                if (L3 == xl1Var2) {
                                    L3 = new nv1(4);
                                    urVar3.h0(L3);
                                }
                                o41 o41Var4 = o41Var;
                                fp.h(str3, (oe0) L3, b2, false, true, null, null, null, null, go.N(-1605693259, new y70(o41Var4, 3), urVar3), null, null, null, false, 0, 0, a4, null, urVar3, 805330992, 0, 6290920);
                                boolean booleanValue2 = ((Boolean) o41Var4.getValue()).booleanValue();
                                Object L4 = urVar3.L();
                                if (L4 == xl1Var2) {
                                    o41Var3 = o41Var4;
                                    L4 = new z9(o41Var3, 14);
                                    urVar3.h0(L4);
                                } else {
                                    o41Var3 = o41Var4;
                                }
                                final List list = F;
                                final oe0 oe0Var2 = oe0Var;
                                final int i17 = i2;
                                h80Var.a(booleanValue2, (de0) L4, null, null, false, null, 0L, 0.0f, go.N(-462621490, new te0() { // from class: xv1
                                    @Override // defpackage.te0
                                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                        boolean z4;
                                        fq fqVar;
                                        ur urVar4 = (ur) obj5;
                                        int intValue2 = ((Integer) obj6).intValue();
                                        ((zo) obj4).getClass();
                                        if ((intValue2 & 17) != 16) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (urVar4.O(intValue2 & 1, z4)) {
                                            for (xd1 xd1Var2 : list) {
                                                final int intValue3 = ((Number) xd1Var2.e).intValue();
                                                final String str4 = (String) xd1Var2.f;
                                                final int i18 = i17;
                                                fq N = go.N(2037856997, new se0() { // from class: yv1
                                                    @Override // defpackage.se0
                                                    public final Object invoke(Object obj7, Object obj8) {
                                                        boolean z5;
                                                        sd0 sd0Var;
                                                        ur urVar5 = (ur) obj7;
                                                        int intValue4 = ((Integer) obj8).intValue();
                                                        if ((intValue4 & 3) != 2) {
                                                            z5 = true;
                                                        } else {
                                                            z5 = false;
                                                        }
                                                        if (urVar5.O(intValue4 & 1, z5)) {
                                                            if (intValue3 == i18) {
                                                                sd0Var = sd0.j;
                                                            } else {
                                                                sd0Var = sd0.g;
                                                            }
                                                            t82.b(str4, null, 0L, 0L, sd0Var, null, 0L, null, 0L, 0, false, 0, 0, null, urVar5, 0, 0, 262078);
                                                        } else {
                                                            urVar5.R();
                                                        }
                                                        return od2.a;
                                                    }
                                                }, urVar4);
                                                oe0 oe0Var3 = oe0Var2;
                                                boolean f2 = urVar4.f(oe0Var3) | urVar4.d(intValue3);
                                                Object L5 = urVar4.L();
                                                if (f2 || L5 == or.a) {
                                                    L5 = new g70(oe0Var3, intValue3, 2, o41Var3);
                                                    urVar4.h0(L5);
                                                }
                                                de0 de0Var = (de0) L5;
                                                if (intValue3 == i18) {
                                                    fqVar = rx.e;
                                                } else {
                                                    fqVar = null;
                                                }
                                                d8.a(N, de0Var, null, fqVar, false, null, null, urVar4, 6, 492);
                                            }
                                        } else {
                                            urVar4.R();
                                        }
                                        return od2.a;
                                    }
                                }, urVar3), urVar3, 48, 6 | ((i16 << 3) & 112));
                            } else {
                                urVar3.R();
                            }
                            return od2.a;
                        }
                    }, urVar), urVar, 3504, 0);
                } else {
                    i9 = i2;
                    urVar2 = urVar;
                }
            }
            y61.j("Collection contains no element matching the predicate.");
            return;
        }
        urVar.R();
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new c3(ij0Var, str, str2, i2, oe0Var, i3);
        }
    }

    public static final void f(final String str, final long j2, final boolean z2, ur urVar, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z3;
        ur urVar2 = urVar;
        urVar2.Y(-520645941);
        if (urVar2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (urVar2.e(j2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (urVar2.g(z2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        int i9 = 0;
        if ((i8 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (urVar2.O(i8 & 1, z3)) {
            h32 c2 = jx0.c(urVar2);
            wl r2 = d6.r(((mo) urVar2.j(oo.a)).c, 0L, urVar, 14);
            urVar2 = urVar;
            yo a2 = wo.a(new pe(2.0f, true, new le(i9)), g3.r, urVar2, 6);
            int hashCode = Long.hashCode(urVar2.T);
            sf1 l2 = urVar2.l();
            b21 b21Var = b21.a;
            e21 Q = fp.Q(urVar2, b21Var);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            op1.q(urVar2, kr.f, a2);
            op1.q(urVar2, kr.e, l2);
            op1.l(urVar2, Integer.valueOf(hashCode), kr.g);
            op1.o(urVar2, kr.h);
            op1.q(urVar2, kr.d, Q);
            rx.c(hy1.b(b21Var, 1.0f), E(cg0.e), r2, d6.s(62, 0.0f), go.N(910345907, new y2(3, c2, str), urVar2), urVar2, 196614, 16);
            rx.c(hy1.b(b21Var, 1.0f), E(cg0.f), r2, d6.s(62, 0.0f), go.N(-525717014, new yk0(c2, z2, j2), urVar2), urVar2, 196614, 16);
            urVar2.p(true);
        } else {
            urVar2.R();
        }
        dl1 r3 = urVar2.r();
        if (r3 != null) {
            r3.d = new se0(str, j2, z2, i2) { // from class: zk0
                public final /* synthetic */ String e;
                public final /* synthetic */ long f;
                public final /* synthetic */ boolean g;

                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int b0 = lo.b0(1);
                    c01.f(this.e, this.f, this.g, (ur) obj, b0);
                    return od2.a;
                }
            };
        }
    }

    public static final void g(int i2, ur urVar) {
        boolean z2;
        ur urVar2;
        urVar.Y(1948870784);
        if (i2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i2 & 1, z2)) {
            p90 p90Var = hy1.c;
            j01 d2 = hj.d(g3.j, false);
            int hashCode = Long.hashCode(urVar.T);
            sf1 l2 = urVar.l();
            e21 Q = fp.Q(urVar, p90Var);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, kr.f, d2);
            op1.q(urVar, kr.e, l2);
            op1.l(urVar, Integer.valueOf(hashCode), kr.g);
            op1.o(urVar, kr.h);
            op1.q(urVar, kr.d, Q);
            urVar2 = urVar;
            sn0.d(null, 0L, 0L, null, null, urVar2, 0);
            urVar2.p(true);
        } else {
            urVar2 = urVar;
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new le(i2, 27);
        }
    }

    public static final void h(uu0 uu0Var, oe0 oe0Var, de0 de0Var, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        urVar.Y(-1868327245);
        if (urVar.h(uu0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (urVar.h(oe0Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (urVar.h(de0Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        int i9 = 0;
        boolean z4 = true;
        if ((i8 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i8 & 1, z2)) {
            if ((i8 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h2 = z3 | urVar.h(uu0Var);
            if ((i8 & 896) != 256) {
                z4 = false;
            }
            boolean z5 = h2 | z4;
            Object L = urVar.L();
            if (z5 || L == or.a) {
                L = new k1(uu0Var, oe0Var, de0Var, i9);
                urVar.h0(L);
            }
            bf.d(uu0Var, (oe0) L, urVar);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new l1(uu0Var, oe0Var, de0Var, i2, 0);
        }
    }

    public static final void i(bg0 bg0Var, fq fqVar, ur urVar, int i2) {
        boolean z2;
        ur urVar2;
        kp1 b2;
        urVar.Y(1823119657);
        if ((i2 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i2 & 1, z2)) {
            e21 b3 = hy1.b(b21.a, 1.0f);
            int ordinal = bg0Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            b2 = lp1.a(16.0f);
                        } else {
                            se.m();
                            return;
                        }
                    } else {
                        b2 = lp1.b(4.0f, 4.0f, 16.0f, 16.0f);
                    }
                } else {
                    b2 = lp1.a(4.0f);
                }
            } else {
                b2 = lp1.b(16.0f, 16.0f, 4.0f, 4.0f);
            }
            urVar2 = urVar;
            rx.c(b3, b2, d6.r(((mo) urVar.j(oo.a)).F, 0L, urVar, 14), d6.s(62, 0.0f), go.N(-1624858085, new ol(fqVar, 7), urVar2), urVar2, 196614, 16);
        } else {
            urVar2 = urVar;
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new u2(bg0Var, i2, 28, fqVar);
        }
    }

    public static final void j(final ij0 ij0Var, final String str, final String str2, final boolean z2, final oe0 oe0Var, ur urVar, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        ur urVar2 = urVar;
        str.getClass();
        str2.getClass();
        oe0Var.getClass();
        urVar2.Y(263108762);
        if (urVar2.f(ij0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (urVar2.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (urVar2.f(str2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i10 = i9 | i5;
        if (urVar2.g(z2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        if (urVar2.h(oe0Var)) {
            i7 = 16384;
        } else {
            i7 = SharedConstants.DefaultBufferSize;
        }
        int i12 = i11 | i7;
        if ((i12 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (urVar2.O(i12 & 1, z3)) {
            b21 b21Var = b21.a;
            e21 b2 = hy1.b(b21Var, 1.0f);
            ji jiVar = g3.p;
            up1 a2 = tp1.a(i, jiVar, urVar2, 54);
            int hashCode = Long.hashCode(urVar2.T);
            sf1 l2 = urVar2.l();
            e21 Q = fp.Q(urVar2, b2);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            gb gbVar = kr.f;
            op1.q(urVar2, gbVar, a2);
            gb gbVar2 = kr.e;
            op1.q(urVar2, gbVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            gb gbVar3 = kr.g;
            op1.l(urVar2, valueOf, gbVar3);
            i5 i5Var = kr.h;
            op1.o(urVar2, i5Var);
            gb gbVar4 = kr.d;
            op1.q(urVar2, gbVar4, Q);
            pr0 pr0Var = new pr0(1.0f, true);
            up1 a3 = tp1.a(e, jiVar, urVar2, 48);
            int hashCode2 = Long.hashCode(urVar2.T);
            sf1 l3 = urVar2.l();
            e21 Q2 = fp.Q(urVar2, pr0Var);
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            op1.q(urVar2, gbVar, a3);
            op1.q(urVar2, gbVar2, l3);
            l90.t(hashCode2, urVar2, gbVar3, urVar2, i5Var);
            op1.q(urVar2, gbVar4, Q2);
            ej0.a(ij0Var, null, null, io.w(urVar2).a, urVar2, (i12 & 14) | 48, 4);
            xp1.a(urVar2, hy1.j(b21Var, 16.0f));
            yo a4 = wo.a(g, g3.r, urVar2, 0);
            int hashCode3 = Long.hashCode(urVar2.T);
            sf1 l4 = urVar2.l();
            e21 Q3 = fp.Q(urVar2, b21Var);
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            op1.q(urVar2, gbVar, a4);
            op1.q(urVar2, gbVar2, l4);
            l90.t(hashCode3, urVar2, gbVar3, urVar2, i5Var);
            op1.q(urVar2, gbVar4, Q3);
            t82.b(str, null, io.w(urVar2).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92.a(io.B(urVar2).h, 0L, 0L, sd0.i, null, 0L, 0L, null, 16777211), urVar, (i12 >> 3) & 14, 0, 131066);
            xp1.a(urVar, hy1.c(b21Var, 4.0f));
            t82.b(str2, null, io.w(urVar).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, io.B(urVar).k, urVar, (i12 >> 6) & 14, 0, 131066);
            urVar.p(true);
            urVar.p(true);
            xp1.a(urVar, hy1.j(b21Var, 16.0f));
            int i13 = i12 >> 9;
            urVar2 = urVar;
            a52.a(z2, oe0Var, null, go.N(-254799806, new uv1(z2, 0), urVar), false, fr1.f(io.w(urVar).b, io.w(urVar).a, io.w(urVar).a, io.w(urVar).s, io.w(urVar).H, io.w(urVar).H, urVar), urVar2, (i13 & 14) | 3072 | (i13 & 112), 84);
            urVar2.p(true);
        } else {
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new se0(str, str2, z2, oe0Var, i2) { // from class: vv1
                public final /* synthetic */ String f;
                public final /* synthetic */ String g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ oe0 i;

                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int b0 = lo.b0(1);
                    c01.j(ij0.this, this.f, this.g, this.h, this.i, (ur) obj, b0);
                    return od2.a;
                }
            };
        }
    }

    public static final void k(ew1 ew1Var, ur urVar, int i2) {
        int i3;
        boolean z2;
        ew1Var.getClass();
        urVar.Y(95132763);
        if (urVar.h(ew1Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        int i5 = 0;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i4 & 1, z2)) {
            o41 q2 = lo.q(ew1Var.c, urVar);
            h32 c2 = jx0.c(urVar);
            p90 p90Var = hy1.c;
            rc1 rc1Var = new rc1(16.0f, 16.0f, 16.0f, 16.0f);
            pe peVar = new pe(16.0f, true, new le(i5));
            boolean h2 = urVar.h(c2) | urVar.f(q2) | urVar.h(ew1Var);
            Object L = urVar.L();
            if (h2 || L == or.a) {
                L = new k1(c2, ew1Var, q2, 16);
                urVar.h0(L);
            }
            io.d(24966, 490, null, null, peVar, urVar, null, (oe0) L, null, p90Var, rc1Var, false);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new h8(ew1Var, i2, 18);
        }
    }

    public static final void l(String str, ur urVar, int i2) {
        int i3;
        boolean z2;
        str.getClass();
        urVar.Y(-1805603266);
        if (urVar.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i2 | i3;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i4 & 1, z2)) {
            t82.b(str, sn0.L(b21.a, 4.0f, 6.0f), ((mo) urVar.j(oo.a)).a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92.a(((pc2) urVar.j(rc2.a)).m, 0L, 0L, sd0.j, null, 0L, 0L, null, 16777211), urVar, (i4 & 14) | 48, 0, 131064);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new nd(str, i2, 7);
        }
    }

    public static final void m(int i2, ur urVar) {
        boolean z2;
        ur urVar2 = urVar;
        urVar2.Y(705083696);
        int i3 = 0;
        if (i2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar2.O(i2 & 1, z2)) {
            p90 p90Var = hy1.c;
            j01 d2 = hj.d(g3.j, false);
            int hashCode = Long.hashCode(urVar2.T);
            sf1 l2 = urVar2.l();
            e21 Q = fp.Q(urVar2, p90Var);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            gb gbVar = kr.f;
            op1.q(urVar2, gbVar, d2);
            gb gbVar2 = kr.e;
            op1.q(urVar2, gbVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            gb gbVar3 = kr.g;
            op1.l(urVar2, valueOf, gbVar3);
            i5 i5Var = kr.h;
            op1.o(urVar2, i5Var);
            gb gbVar4 = kr.d;
            op1.q(urVar2, gbVar4, Q);
            ii iiVar = g3.s;
            pe peVar = new pe(16.0f, true, new le(i3));
            b21 b21Var = b21.a;
            e21 K = sn0.K(b21Var, 24.0f);
            yo a2 = wo.a(peVar, iiVar, urVar2, 54);
            int hashCode2 = Long.hashCode(urVar2.T);
            sf1 l3 = urVar2.l();
            e21 Q2 = fp.Q(urVar2, K);
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            op1.q(urVar2, gbVar, a2);
            op1.q(urVar2, gbVar2, l3);
            l90.t(hashCode2, urVar2, gbVar3, urVar2, i5Var);
            op1.q(urVar2, gbVar4, Q2);
            e21 f2 = hy1.f(b21Var, 72.0f);
            wc0 wc0Var = yz0.a;
            zz0 V = go.V(wc0.n(), urVar2);
            y22 y22Var = oo.a;
            l42.a(f2, V, ((mo) urVar2.j(y22Var)).c, 0L, 0.0f, 0.0f, l, urVar2, 12582918, 120);
            y22 y22Var2 = rc2.a;
            t82.b("Install update", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar2.j(y22Var2)).f, urVar, 6, 0, 131070);
            t82.b("Accept the install prompt to complete the update", null, ((mo) urVar.j(y22Var)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar.j(y22Var2)).k, urVar, 6, 0, 131066);
            urVar2 = urVar;
            urVar2.p(true);
            urVar2.p(true);
        } else {
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new le(i2, 28);
        }
    }

    public static final void n(final float f2, ur urVar, final int i2) {
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        ur urVar2 = urVar;
        urVar2.Y(-1168848582);
        if (urVar2.c(f2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i2 | i3;
        int i5 = 0;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar2.O(i4 & 1, z2)) {
            p90 p90Var = hy1.c;
            j01 d2 = hj.d(g3.j, false);
            int hashCode = Long.hashCode(urVar2.T);
            sf1 l2 = urVar2.l();
            e21 Q = fp.Q(urVar2, p90Var);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            gb gbVar = kr.f;
            op1.q(urVar2, gbVar, d2);
            gb gbVar2 = kr.e;
            op1.q(urVar2, gbVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            gb gbVar3 = kr.g;
            op1.l(urVar2, valueOf, gbVar3);
            i5 i5Var = kr.h;
            op1.o(urVar2, i5Var);
            gb gbVar4 = kr.d;
            op1.q(urVar2, gbVar4, Q);
            b21 b21Var = b21.a;
            e21 K = sn0.K(hy1.j(b21Var, 280.0f), 24.0f);
            ii iiVar = g3.s;
            yo a2 = wo.a(new pe(20.0f, true, new le(i5)), iiVar, urVar2, 54);
            int hashCode2 = Long.hashCode(urVar2.T);
            sf1 l3 = urVar2.l();
            e21 Q2 = fp.Q(urVar2, K);
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            op1.q(urVar2, gbVar, a2);
            op1.q(urVar2, gbVar2, l3);
            l90.t(hashCode2, urVar2, gbVar3, urVar2, i5Var);
            op1.q(urVar2, gbVar4, Q2);
            e21 f3 = hy1.f(b21Var, 72.0f);
            wc0 wc0Var = yz0.a;
            zz0 V = go.V(wc0.n(), urVar2);
            y22 y22Var = oo.a;
            l42.a(f3, V, ((mo) urVar2.j(y22Var)).c, 0L, 0.0f, 0.0f, k, urVar, 12582918, 120);
            yo a3 = wo.a(new pe(6.0f, true, new le(i5)), iiVar, urVar, 54);
            int hashCode3 = Long.hashCode(urVar.T);
            sf1 l4 = urVar.l();
            e21 Q3 = fp.Q(urVar, b21Var);
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, gbVar, a3);
            op1.q(urVar, gbVar2, l4);
            l90.t(hashCode3, urVar, gbVar3, urVar, i5Var);
            op1.q(urVar, gbVar4, Q3);
            y22 y22Var2 = rc2.a;
            t82.b("Updating", null, ((mo) urVar.j(y22Var)).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar.j(y22Var2)).f, urVar, 6, 0, 131066);
            t82.b("Downloading new version...", null, ((mo) urVar.j(y22Var)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar.j(y22Var2)).k, urVar, 6, 0, 131066);
            urVar2 = urVar;
            urVar2.p(true);
            e21 b2 = hy1.b(b21Var, 1.0f);
            yo a4 = wo.a(new pe(8.0f, true, new le(0)), g3.r, urVar2, 6);
            int hashCode4 = Long.hashCode(urVar2.T);
            sf1 l5 = urVar2.l();
            e21 Q4 = fp.Q(urVar2, b2);
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            op1.q(urVar2, gbVar, a4);
            op1.q(urVar2, gbVar2, l5);
            l90.t(hashCode4, urVar2, gbVar3, urVar2, i5Var);
            op1.q(urVar2, gbVar4, Q4);
            if (f2 > 0.0f) {
                urVar2.X(1622122919);
                if ((i4 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object L = urVar2.L();
                if (z4 || L == or.a) {
                    L = new xw0(f2);
                    urVar2.h0(L);
                }
                z3 = true;
                gh2.a((de0) L, hy1.b(b21Var, 1.0f), 0L, 0L, null, null, 0.0f, 0.0f, null, 0.0f, 0.0f, urVar2, 48);
                k92 k92Var = ((pc2) urVar2.j(y22Var2)).m;
                t82.b(((int) (100.0f * f2)) + "%", new ci0(g3.t), ((mo) urVar2.j(y22Var)).a, 0L, sd0.i, null, 0L, null, 0L, 0, false, 0, 0, k92Var, urVar, 1572864, 0, 131000);
                urVar2 = urVar;
                urVar2.p(false);
            } else {
                z3 = true;
                urVar2.X(1622679338);
                gh2.b(hy1.b(b21Var, 1.0f), 0L, 0L, null, null, 0.0f, 0.0f, 0.0f, 0.0f, urVar2, 6);
                urVar2.p(false);
            }
            urVar2.p(z3);
            urVar2.p(z3);
            urVar2.p(z3);
        } else {
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new se0(i2, f2) { // from class: yw0
                public final /* synthetic */ float e;

                {
                    this.e = f2;
                }

                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int b0 = lo.b0(1);
                    c01.n(this.e, (ur) obj, b0);
                    return od2.a;
                }
            };
        }
    }

    public static final void o(int i2, int i3) {
        if (i2 >= 0 && i2 < i3) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i3 + ')');
    }

    public static final boolean p(t22 t22Var, int i2, g0 g0Var, boolean z2) {
        boolean z3;
        synchronized (z) {
            try {
                int i3 = t22Var.d;
                if (i3 == i2) {
                    t22Var.c = g0Var;
                    z3 = true;
                    if (z2) {
                        t22Var.e++;
                    }
                    t22Var.d = i3 + 1;
                } else {
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }

    public static final boolean q(Object obj) {
        if (obj instanceof u02) {
            u02 u02Var = (u02) obj;
            if (u02Var.c() == g3.S || u02Var.c() == xl1.o || u02Var.c() == xl1.f) {
                Object value = u02Var.getValue();
                if (value != null) {
                    return q(value);
                }
                return true;
            }
        } else if (!(obj instanceof af0) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (n[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static hc r(hc hcVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) hcVar.f.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((ic) hcVar.g).a;
        }
        return new hc(hcVar.e, Float.valueOf(f2), new ic(f3), hcVar.h, hcVar.i, hcVar.j);
    }

    public static byte[] s(o00[] o00VarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (o00 o00Var : o00VarArr) {
            i3 += ((((o00Var.g * 2) + 7) & (-8)) / 8) + (o00Var.e * 2) + w(o00Var.a, o00Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + o00Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, fc2.w)) {
            int length = o00VarArr.length;
            while (i2 < length) {
                o00 o00Var2 = o00VarArr[i2];
                Y(byteArrayOutputStream, o00Var2, w(o00Var2.a, o00Var2.b, bArr));
                X(byteArrayOutputStream, o00Var2);
                i2++;
            }
        } else {
            for (o00 o00Var3 : o00VarArr) {
                Y(byteArrayOutputStream, o00Var3, w(o00Var3.a, o00Var3.b, bArr));
            }
            int length2 = o00VarArr.length;
            while (i2 < length2) {
                X(byteArrayOutputStream, o00VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static final sq1 t(nv nvVar) {
        vq1 vq1Var;
        sq1 sq1Var;
        nvVar.getClass();
        cr1 cr1Var = (cr1) nvVar.a(w);
        Bundle bundle = null;
        if (cr1Var != null) {
            tg2 tg2Var = (tg2) nvVar.a(x);
            if (tg2Var != null) {
                Bundle bundle2 = (Bundle) nvVar.a(y);
                String str = (String) nvVar.a(rg2.g);
                if (str != null) {
                    ar1 v2 = cr1Var.f().v();
                    if (v2 instanceof vq1) {
                        vq1Var = (vq1) v2;
                    } else {
                        vq1Var = null;
                    }
                    if (vq1Var != null) {
                        LinkedHashMap linkedHashMap = B(tg2Var).b;
                        sq1 sq1Var2 = (sq1) linkedHashMap.get(str);
                        if (sq1Var2 == null) {
                            vq1Var.b();
                            Bundle bundle3 = vq1Var.c;
                            if (bundle3 != null && bundle3.containsKey(str)) {
                                Bundle bundle4 = bundle3.getBundle(str);
                                if (bundle4 == null) {
                                    bundle4 = bf.v((xd1[]) Arrays.copyOf(new xd1[0], 0));
                                }
                                bundle3.remove(str);
                                if (bundle3.isEmpty()) {
                                    vq1Var.c = null;
                                }
                                bundle = bundle4;
                            }
                            if (bundle != null) {
                                bundle2 = bundle;
                            }
                            if (bundle2 == null) {
                                sq1Var = new sq1();
                            } else {
                                ClassLoader classLoader = sq1.class.getClassLoader();
                                classLoader.getClass();
                                bundle2.setClassLoader(classLoader);
                                nz0 nz0Var = new nz0(bundle2.size());
                                for (String str2 : bundle2.keySet()) {
                                    str2.getClass();
                                    nz0Var.put(str2, bundle2.get(str2));
                                }
                                sq1Var = new sq1(tz0.a0(nz0Var));
                            }
                            linkedHashMap.put(str, sq1Var);
                            return sq1Var;
                        }
                        return sq1Var2;
                    }
                    se.p("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                    return null;
                }
                se.h("CreationExtras must have a value by `VIEW_MODEL_KEY`");
                return null;
            }
            se.h("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        se.h("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        return null;
    }

    public static final void u(g31 g31Var, tl tlVar, ck ckVar, float f2, hw1 hw1Var, x62 x62Var, d40 d40Var) {
        ArrayList arrayList = g31Var.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zd1 zd1Var = (zd1) arrayList.get(i2);
            zd1Var.a.g(tlVar, ckVar, f2, hw1Var, x62Var, d40Var);
            tlVar.o(0.0f, zd1Var.a.b());
        }
    }

    public static final void v(cr1 cr1Var) {
        nu0 nu0Var = cr1Var.g().c;
        if (nu0Var != nu0.f && nu0Var != nu0.g) {
            se.h("Failed requirement.");
        } else if (cr1Var.f().v() == null) {
            vq1 vq1Var = new vq1(cr1Var.f(), (tg2) cr1Var);
            cr1Var.f().z("androidx.lifecycle.internal.SavedStateHandlesProvider", vq1Var);
            cr1Var.g().a(new ol1(vq1Var, 3));
        }
    }

    public static String w(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = fc2.x;
        byte[] bArr3 = fc2.y;
        String str3 = "!";
        if (!Arrays.equals(bArr, bArr3) && !Arrays.equals(bArr, bArr2)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (!str2.contains("!") && !str2.contains(":")) {
                if (!str2.endsWith(".apk")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    if (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) {
                        str3 = ":";
                    }
                    return l90.p(sb, str3, str2);
                }
            } else {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            }
        }
        return str2;
    }

    public static final ij0 x() {
        ij0 ij0Var = C;
        if (ij0Var != null) {
            return ij0Var;
        }
        hj0 hj0Var = new hj0("Rounded.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = me2.a;
        i12 i12Var = new i12(co.b);
        rg2 rg2Var = new rg2(21);
        rg2Var.s(12.0f, 2.0f);
        rg2Var.h(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        rg2Var.w(4.48f, 10.0f, 10.0f, 10.0f);
        rg2Var.w(10.0f, -4.48f, 10.0f, -10.0f);
        rg2Var.v(17.52f, 2.0f, 12.0f, 2.0f);
        rg2Var.f();
        rg2Var.s(9.29f, 16.29f);
        rg2Var.q(5.7f, 12.7f);
        rg2Var.i(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        rg2Var.i(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        rg2Var.q(10.0f, 14.17f);
        rg2Var.r(6.88f, -6.88f);
        rg2Var.i(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        rg2Var.i(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        rg2Var.r(-7.59f, 7.59f);
        rg2Var.i(-0.38f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        rg2Var.f();
        hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
        ij0 b2 = hj0Var.b();
        C = b2;
        return b2;
    }

    public static final ij0 y() {
        ij0 ij0Var = D;
        if (ij0Var != null) {
            return ij0Var;
        }
        hj0 hj0Var = new hj0("Rounded.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = me2.a;
        i12 i12Var = new i12(co.b);
        rg2 rg2Var = new rg2(21);
        rg2Var.s(18.3f, 5.71f);
        rg2Var.i(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        rg2Var.q(12.0f, 10.59f);
        rg2Var.q(7.11f, 5.7f);
        rg2Var.i(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        rg2Var.i(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        rg2Var.q(10.59f, 12.0f);
        rg2Var.q(5.7f, 16.89f);
        rg2Var.i(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        rg2Var.i(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        rg2Var.q(12.0f, 13.41f);
        rg2Var.r(4.89f, 4.89f);
        rg2Var.i(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        rg2Var.i(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        rg2Var.q(13.41f, 12.0f);
        rg2Var.r(4.89f, -4.89f);
        rg2Var.i(0.38f, -0.38f, 0.38f, -1.02f, 0.0f, -1.4f);
        rg2Var.f();
        hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
        ij0 b2 = hj0Var.b();
        D = b2;
        return b2;
    }

    public static final pl z(vt vtVar) {
        pl plVar;
        pl plVar2;
        if (!(vtVar instanceof g10)) {
            return new pl(1, vtVar);
        }
        g10 g10Var = (g10) vtVar;
        ad0 ad0Var = mp0.p;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g10.l;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(g10Var);
            plVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(g10Var, ad0Var);
                plVar2 = null;
                break;
            }
            if (obj instanceof pl) {
                while (!atomicReferenceFieldUpdater.compareAndSet(g10Var, obj, ad0Var)) {
                    if (atomicReferenceFieldUpdater.get(g10Var) != obj) {
                        break;
                    }
                }
                plVar2 = (pl) obj;
                break loop0;
            }
            if (obj != ad0Var && !(obj instanceof Throwable)) {
                se.t(obj, "Inconsistent state ");
                return null;
            }
        }
        if (plVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = pl.k;
            Object obj2 = atomicReferenceFieldUpdater2.get(plVar2);
            if ((obj2 instanceof jp) && ((jp) obj2).d != null) {
                plVar2.n();
            } else {
                pl.j.set(plVar2, 536870911);
                atomicReferenceFieldUpdater2.set(plVar2, z1.a);
                plVar = plVar2;
            }
            if (plVar != null) {
                return plVar;
            }
        }
        return new pl(2, vtVar);
    }
}
