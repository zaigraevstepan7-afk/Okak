package defpackage;

import android.content.ClipData;
import android.content.pm.PackageInfo;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Parcel;
import android.os.Trace;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import android.view.KeyEvent;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class mp0 {
    public static final jh2 A;
    public static final ir1 A0;
    public static final jh2 B;
    public static final ir1 B0;
    public static final float[] C;
    public static ij0 C0;
    public static final no D;
    public static final float E;
    public static final no F;
    public static final no G;
    public static final float H;
    public static final mw1 I;
    public static final float J;
    public static final wc0 K;
    public static final pl1 L;
    public static final no M;
    public static final qc2 N;
    public static final no O;
    public static final float P;
    public static final mw1 Q;
    public static final no R;
    public static final no S;
    public static final qc2 T;
    public static final float U;
    public static final float V;
    public static final no W;
    public static final float X;
    public static final no Y;
    public static final float Z;
    public static final p1 a;
    public static final no a0;
    public static final float b0;
    public static final no c0;
    public static final me d;
    public static final float d0;
    public static final no e0;
    public static final float f0;
    public static final no g0;
    public static final no h0;
    public static final mw1 i0;
    public static final fq j;
    public static final float j0;
    public static final no k0;
    public static final fq l;
    public static final float l0;
    public static final no m0;
    public static final d9 n;
    public static final no n0;
    public static final ad0 o;
    public static final float o0;
    public static final ad0 p;
    public static final float p0;
    public static final ad0 q;
    public static final float q0;
    public static final ad0 r;
    public static final mw1 r0;
    public static final no s;
    public static final float s0;
    public static final no t;
    public static final no t0;
    public static final float u;
    public static final no u0;
    public static final no v;
    public static final float v0;
    public static final float w;
    public static final no w0;
    public static final no x;
    public static final no x0;
    public static final jh2 y;
    public static final ad0 y0;
    public static final jh2 z;
    public static final ir1 z0;
    public static final tx b = new tx(new xl1(15));
    public static final me c = new me(0);
    public static final float[][] e = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] f = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] g = {95.047f, 100.0f, 108.883f};
    public static final double[][] h = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[][] i = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    public static final fq k = new fq(1629163587, false, new le(4));
    public static final fq m = new fq(1572298241, false, new le(6));

    static {
        int i2 = 3;
        a = new p1(i2);
        int i3 = 1;
        d = new me(i3);
        j = new fq(-489887388, false, new le(i2));
        int i4 = 5;
        l = new fq(-546752734, false, new le(i4));
        n = new d9(i3);
        o = new ad0("UNDEFINED", i4);
        p = new ad0("REUSABLE_CLAIMED", i4);
        q = new ad0("REMOVED_TASK", i4);
        r = new ad0("CLOSED_EMPTY", i4);
        no noVar = no.q;
        s = noVar;
        no noVar2 = no.l;
        t = noVar2;
        u = 0.1f;
        v = noVar2;
        w = 0.38f;
        no noVar3 = no.i;
        x = noVar3;
        y = new jh2(0.31006f, 0.31616f);
        z = new jh2(0.34567f, 0.3585f);
        A = new jh2(0.32168f, 0.33767f);
        B = new jh2(0.31271f, 0.32902f);
        C = new float[]{0.964212f, 1.0f, 0.825188f};
        D = noVar;
        E = 38.0f;
        no noVar4 = no.j;
        F = noVar4;
        G = no.r;
        H = 48.0f;
        mw1 mw1Var = mw1.h;
        I = mw1Var;
        J = 48.0f;
        K = new wc0(24);
        L = new pl1(0.0f, 0.0f, 10.0f, 10.0f);
        M = no.g;
        N = qc2.i;
        O = no.h;
        P = 6.0f;
        Q = mw1.g;
        no noVar5 = no.f;
        R = noVar5;
        S = noVar5;
        T = qc2.f;
        U = 48.0f;
        V = 68.0f;
        W = no.v;
        X = 1.0f;
        Y = noVar2;
        Z = 0.38f;
        a0 = noVar2;
        b0 = 0.12f;
        c0 = noVar2;
        d0 = 0.38f;
        no noVar6 = no.y;
        e0 = noVar6;
        f0 = 0.38f;
        g0 = noVar6;
        h0 = noVar2;
        i0 = mw1Var;
        j0 = 28.0f;
        k0 = noVar3;
        l0 = 24.0f;
        m0 = noVar4;
        n0 = noVar;
        o0 = 40.0f;
        p0 = 32.0f;
        q0 = 2.0f;
        r0 = mw1Var;
        s0 = 52.0f;
        no noVar7 = no.o;
        t0 = noVar7;
        u0 = noVar7;
        v0 = 16.0f;
        w0 = noVar6;
        x0 = noVar6;
        y0 = new ad0("NO_THREAD_ELEMENTS", i4);
        z0 = new ir1(27);
        A0 = new ir1(28);
        B0 = new ir1(29);
    }

    public static final boolean A(ru1 ru1Var) {
        boolean z2;
        e81 d2 = ru1Var.d();
        i41 i41Var = ru1Var.d.e;
        if (d2 != null) {
            z2 = d2.d1();
        } else {
            z2 = false;
        }
        if (!z2 && !i41Var.c(vu1.p) && !i41Var.c(vu1.o)) {
            return false;
        }
        return true;
    }

    public static final boolean B(ru1 ru1Var) {
        if (!A(ru1Var)) {
            mu1 mu1Var = ru1Var.d;
            if (!mu1Var.g) {
                i41 i41Var = mu1Var.e;
                Object[] objArr = i41Var.b;
                Object[] objArr2 = i41Var.c;
                long[] jArr = i41Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j2 = jArr[i2];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j2) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj = objArr[i5];
                                    Object obj2 = objArr2[i5];
                                    if (((zu1) obj).c) {
                                        return true;
                                    }
                                }
                                j2 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static boolean C(char c2) {
        if (!Character.isWhitespace(c2) && !Character.isSpaceChar(c2)) {
            return false;
        }
        return true;
    }

    public static final e21 D(e21 e21Var, te0 te0Var) {
        return e21Var.d(new kq0(te0Var));
    }

    public static float E(int i2) {
        float pow;
        float f2 = i2 / 255.0f;
        if (f2 <= 0.04045f) {
            pow = f2 / 12.92f;
        } else {
            pow = (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static e21 F(e21 e21Var, l71 l71Var) {
        return e21Var.d(new o71(l71Var));
    }

    public static void G(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static e21 H(e21 e21Var, ud1 ud1Var, xl1 xl1Var, ni niVar, int i2) {
        return e21Var.d(new vd1(ud1Var, g3.j, xl1Var, 1.0f, niVar));
    }

    public static final void I(jz1 jz1Var, int i2, Object obj) {
        int h2 = jz1Var.h(i2);
        Object[] objArr = jz1Var.c;
        Object obj2 = objArr[h2];
        objArr[h2] = or.a;
        if (obj == obj2) {
            return;
        }
        vr.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void J(xu xuVar, Object obj) {
        if (obj != y0) {
            if (obj instanceof u92) {
                xt[] xtVarArr = ((u92) obj).b;
                int length = xtVarArr.length - 1;
                if (length < 0) {
                    return;
                }
                xt xtVar = xtVarArr[length];
                throw null;
            }
            xuVar.p(A0, null).getClass();
            se.s();
        }
    }

    public static final void K(vt vtVar, Object obj) {
        Object lpVar;
        jd2 jd2Var;
        if (vtVar instanceof g10) {
            g10 g10Var = (g10) vtVar;
            zu zuVar = g10Var.h;
            wt wtVar = g10Var.i;
            Throwable a2 = go1.a(obj);
            if (a2 == null) {
                lpVar = obj;
            } else {
                lpVar = new lp(a2, false);
            }
            if (zuVar.Q(wtVar.getContext())) {
                g10Var.j = lpVar;
                g10Var.g = 1;
                zuVar.P(wtVar.getContext(), g10Var);
                return;
            }
            l70 a3 = r92.a();
            if (a3.g >= 4294967296L) {
                g10Var.j = lpVar;
                g10Var.g = 1;
                a3.T(g10Var);
                return;
            }
            a3.U(true);
            try {
                go0 go0Var = (go0) wtVar.getContext().H(g3.O);
                if (go0Var != null && !go0Var.b()) {
                    g10Var.resumeWith(io.s(go0Var.o()));
                } else {
                    Object obj2 = g10Var.k;
                    xu context = wtVar.getContext();
                    Object Q2 = Q(context, obj2);
                    if (Q2 != y0) {
                        jd2Var = io.N(wtVar, context, Q2);
                    } else {
                        jd2Var = null;
                    }
                    try {
                        wtVar.resumeWith(obj);
                    } finally {
                        if (jd2Var == null || jd2Var.h0()) {
                            J(context, Q2);
                        }
                    }
                }
                do {
                } while (a3.W());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        vtVar.resumeWith(obj);
    }

    public static final void L(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static f22 M(float f2, float f3, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new f22(f2, f3, obj);
    }

    public static final Object N(xu xuVar) {
        Object p2 = xuVar.p(z0, 0);
        p2.getClass();
        return p2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ux, java.lang.Object] */
    public static final mn O(rc rcVar) {
        List list;
        SpannableString spannableString;
        byte b2;
        List list2 = rcVar.g;
        List list3 = l60.e;
        if (list2 == null) {
            list = list3;
        } else {
            list = list2;
        }
        CharSequence charSequence = rcVar.f;
        if (!list.isEmpty()) {
            SpannableString spannableString2 = new SpannableString(charSequence);
            ?? obj = new Object();
            obj.a = Parcel.obtain();
            if (list2 == null) {
                list2 = list3;
            }
            int size = list2.size();
            int i2 = 0;
            SpannableString spannableString3 = spannableString2;
            while (i2 < size) {
                qc qcVar = (qc) list2.get(i2);
                m12 m12Var = (m12) qcVar.a;
                int i3 = qcVar.b;
                int i4 = qcVar.c;
                obj.a.recycle();
                obj.a = Parcel.obtain();
                k82 k82Var = m12Var.a;
                long j2 = m12Var.l;
                long j3 = m12Var.h;
                int i5 = i2;
                long j4 = m12Var.b;
                List list4 = list2;
                int i6 = size;
                long a2 = k82Var.a();
                long j5 = co.g;
                if (!co.c(a2, j5)) {
                    obj.c((byte) 1);
                    spannableString = spannableString3;
                    obj.a.writeLong(m12Var.a.a());
                } else {
                    spannableString = spannableString3;
                }
                long j6 = n92.c;
                byte b3 = 2;
                if (!n92.a(j4, j6)) {
                    obj.c((byte) 2);
                    obj.e(j4);
                }
                sd0 sd0Var = m12Var.c;
                if (sd0Var != null) {
                    obj.c((byte) 3);
                    obj.a.writeInt(sd0Var.e);
                }
                qd0 qd0Var = m12Var.d;
                if (qd0Var != null) {
                    int i7 = qd0Var.a;
                    obj.c((byte) 4);
                    if (i7 == 0 || i7 != 1) {
                        b2 = 0;
                    } else {
                        b2 = 1;
                    }
                    obj.c(b2);
                }
                rd0 rd0Var = m12Var.e;
                if (rd0Var != null) {
                    int i8 = rd0Var.a;
                    obj.c((byte) 5);
                    if (i8 != 0) {
                        if (i8 == 65535) {
                            b3 = 1;
                        } else if (i8 != 1) {
                            if (i8 == 2) {
                                b3 = 3;
                            }
                        }
                        obj.c(b3);
                    }
                    b3 = 0;
                    obj.c(b3);
                }
                String str = m12Var.g;
                if (str != null) {
                    obj.c((byte) 6);
                    obj.a.writeString(str);
                }
                if (!n92.a(j3, j6)) {
                    obj.c((byte) 7);
                    obj.e(j3);
                }
                jh jhVar = m12Var.i;
                if (jhVar != null) {
                    float f2 = jhVar.a;
                    obj.c((byte) 8);
                    obj.d(f2);
                }
                l82 l82Var = m12Var.j;
                if (l82Var != null) {
                    obj.c((byte) 9);
                    obj.d(l82Var.a);
                    obj.d(l82Var.b);
                }
                if (!co.c(j2, j5)) {
                    obj.c((byte) 10);
                    obj.a.writeLong(j2);
                }
                x62 x62Var = m12Var.m;
                if (x62Var != null) {
                    obj.c((byte) 11);
                    obj.a.writeInt(x62Var.a);
                }
                hw1 hw1Var = m12Var.n;
                if (hw1Var != null) {
                    obj.c((byte) 12);
                    obj.a.writeLong(hw1Var.a);
                    long j7 = hw1Var.b;
                    obj.d(Float.intBitsToFloat((int) (j7 >> 32)));
                    obj.d(Float.intBitsToFloat((int) (j7 & 4294967295L)));
                    obj.d(hw1Var.c);
                }
                SpannableString spannableString4 = spannableString;
                spannableString4.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(obj.a.marshall(), 0)), i3, i4, 33);
                i2 = i5 + 1;
                spannableString3 = spannableString4;
                list2 = list4;
                size = i6;
            }
            charSequence = spannableString3;
        }
        return new mn(ClipData.newPlainText("plain text", charSequence));
    }

    public static dc2 P(int i2, int i3, x40 x40Var) {
        int i4;
        if ((i3 & 1) != 0) {
            i2 = 300;
        }
        if ((i3 & 2) != 0) {
            i4 = 0;
        } else {
            i4 = 90;
        }
        if ((i3 & 4) != 0) {
            x40Var = y40.a;
        }
        return new dc2(i2, i4, x40Var);
    }

    public static final Object Q(xu xuVar, Object obj) {
        if (obj == null) {
            obj = N(xuVar);
        }
        if (obj == 0) {
            return y0;
        }
        if (obj instanceof Integer) {
            return xuVar.p(B0, new u92(((Number) obj).intValue(), xuVar));
        }
        se.s();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0207  */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void R(android.content.Context r18, java.util.concurrent.Executor r19, defpackage.fj1 r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp0.R(android.content.Context, java.util.concurrent.Executor, fj1, boolean):void");
    }

    public static final int S(float f2, float[] fArr, int i2) {
        float f3 = 0.0f;
        if (f2 >= 0.0f) {
            f3 = f2;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i2] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.de0 r22, defpackage.fq r23, defpackage.e21 r24, defpackage.se0 r25, defpackage.se0 r26, defpackage.se0 r27, defpackage.se0 r28, defpackage.kw1 r29, long r30, long r32, long r34, long r36, defpackage.z00 r38, defpackage.ur r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp0.a(de0, fq, e21, se0, se0, se0, se0, kw1, long, long, long, long, z00, ur, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [qq, x0, java.lang.Object] */
    public static final void b(boolean z2, de0 de0Var, ur urVar, int i2) {
        int i3;
        boolean z3;
        w61 w61Var;
        boolean z4;
        q4 q4Var;
        int i4;
        int i5;
        urVar.Y(-361453782);
        int i6 = 4;
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
        int i7 = 0;
        boolean z5 = true;
        if ((i3 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (urVar.O(i3 & 1, z3)) {
            w61 a2 = cx0.a(urVar);
            z91 a3 = dx0.a(urVar);
            if (a2 == null) {
                w61Var = a3;
            } else {
                w61Var = a2;
            }
            if (w61Var != null) {
                Object L2 = urVar.L();
                Object obj = or.a;
                if (L2 == obj) {
                    y91 y91Var = null;
                    if (a2 != null) {
                        q4Var = a2.a();
                    } else {
                        q4Var = null;
                    }
                    if (a3 != 0) {
                        y91Var = a3.b();
                    }
                    L2 = new ug(q4Var, y91Var);
                    urVar.h0(L2);
                }
                ug ugVar = (ug) L2;
                long j2 = urVar.T;
                boolean f2 = urVar.f(ugVar) | urVar.e(j2);
                Object L3 = urVar.L();
                Object obj2 = L3;
                if (f2 || L3 == obj) {
                    ?? x0Var = new x0(new vg(w61Var, j2));
                    x0Var.c = new h2(13);
                    urVar.h0(x0Var);
                    obj2 = x0Var;
                }
                qq qqVar = (qq) obj2;
                urVar.X(-585289004);
                boolean h2 = urVar.h(qqVar);
                if ((i3 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z6 = z4 | h2;
                Object L4 = urVar.L();
                if (z6 || L4 == obj) {
                    L4 = new j1(5, qqVar, de0Var);
                    urVar.h0(L4);
                }
                bf.p((de0) L4, urVar);
                int i8 = i3;
                Boolean valueOf = Boolean.valueOf(z2);
                boolean h3 = urVar.h(qqVar);
                int i9 = i8 & 14;
                if (i9 != 4) {
                    z5 = false;
                }
                boolean z7 = h3 | z5;
                Object L5 = urVar.L();
                if (z7 || L5 == obj) {
                    L5 = new wg(qqVar, z2, i7);
                    urVar.h0(L5);
                }
                go.f(valueOf, qqVar, null, (oe0) L5, urVar, i9);
                boolean h4 = urVar.h(ugVar) | urVar.h(qqVar);
                Object L6 = urVar.L();
                if (h4 || L6 == obj) {
                    L6 = new i(i6, ugVar, qqVar);
                    urVar.h0(L6);
                }
                bf.e(ugVar, qqVar, (oe0) L6, urVar);
                urVar.p(false);
            } else {
                se.h("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new xg(z2, de0Var, i2, i7);
        }
    }

    public static final void c(de0 de0Var, ur urVar, int i2) {
        int i3;
        boolean z2;
        int i4;
        String str;
        String str2;
        de0 de0Var2 = de0Var;
        ur urVar2 = urVar;
        de0Var2.getClass();
        urVar2.Y(1965935094);
        if (urVar2.h(de0Var2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar2.O(i5 & 1, z2)) {
            h32 c2 = jx0.c(urVar2);
            e21 K2 = sn0.K(hy1.c, 24.0f);
            yo a2 = wo.a(c01.g, g3.s, urVar2, 48);
            int hashCode = Long.hashCode(urVar2.T);
            sf1 l2 = urVar2.l();
            e21 Q2 = fp.Q(urVar2, K2);
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
            op1.q(urVar2, gbVar4, Q2);
            xp1.a(urVar2, new pr0(1.0f, true));
            b21 b21Var = b21.a;
            e21 f2 = hy1.f(b21Var, 72.0f);
            y22 y22Var = oo.a;
            e21 k2 = f2.k(f2, ((mo) urVar2.j(y22Var)).y, lp1.a);
            j01 d2 = hj.d(g3.j, false);
            int hashCode2 = Long.hashCode(urVar2.T);
            sf1 l3 = urVar2.l();
            e21 Q3 = fp.Q(urVar2, k2);
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            op1.q(urVar2, gbVar, d2);
            op1.q(urVar2, gbVar2, l3);
            l90.t(hashCode2, urVar2, gbVar3, urVar2, i5Var);
            op1.q(urVar2, gbVar4, Q3);
            ij0 ij0Var = lo.a;
            if (ij0Var == null) {
                hj0 hj0Var = new hj0("Filled.ErrorOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i6 = me2.a;
                i12 i12Var = new i12(co.b);
                rg2 rg2Var = new rg2(21);
                rg2Var.s(11.0f, 15.0f);
                rg2Var.o(2.0f);
                rg2Var.E(2.0f);
                rg2Var.o(-2.0f);
                rg2Var.f();
                rg2Var.s(11.0f, 7.0f);
                rg2Var.o(2.0f);
                rg2Var.E(6.0f);
                rg2Var.o(-2.0f);
                rg2Var.f();
                rg2Var.s(11.99f, 2.0f);
                rg2Var.h(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                rg2Var.w(4.47f, 10.0f, 9.99f, 10.0f);
                rg2Var.h(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
                rg2Var.v(17.52f, 2.0f, 11.99f, 2.0f);
                rg2Var.f();
                rg2Var.s(12.0f, 20.0f);
                rg2Var.i(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
                rg2Var.w(3.58f, -8.0f, 8.0f, -8.0f);
                rg2Var.w(8.0f, 3.58f, 8.0f, 8.0f);
                rg2Var.w(-3.58f, 8.0f, -8.0f, 8.0f);
                rg2Var.f();
                hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
                ij0Var = hj0Var.b();
                lo.a = ij0Var;
            }
            ej0.a(ij0Var, null, hy1.f(b21Var, 32.0f), ((mo) urVar2.j(y22Var)).w, urVar, 432, 0);
            urVar.p(true);
            xp1.a(urVar, hy1.c(b21Var, 24.0f));
            switch (c2.a) {
                case 0:
                    str = "Initialization Error";
                    break;
                case 1:
                    str = "Erro de Inicialização";
                    break;
                case 2:
                    str = "Ошибка инициализации";
                    break;
                case 3:
                    str = "Помилка ініціалізації";
                    break;
                default:
                    str = "初始化错误";
                    break;
            }
            y22 y22Var2 = rc2.a;
            t82.b(str, null, 0L, 0L, null, null, 0L, new b62(3), 0L, 0, false, 0, 0, k92.a(((pc2) urVar.j(y22Var2)).f, 0L, 0L, sd0.j, null, 0L, 0L, null, 16777211), urVar, 0, 0, 130046);
            xp1.a(urVar, hy1.c(b21Var, 8.0f));
            switch (c2.a) {
                case 0:
                    str2 = "Root access is required to continue.\nPlease grant permission and try again";
                    break;
                case 1:
                    str2 = "O acesso root é necessário para continuar.\nConceda a permissão e tente novamente";
                    break;
                case 2:
                    str2 = "Для продолжения необходим Root-доступ.\nПредоставьте разрешение и попробуйте снова";
                    break;
                case 3:
                    str2 = "Для продовження потрібен Root-доступ.\nНадайте дозвіл та спробуйте знову";
                    break;
                default:
                    str2 = "需要 Root 访问权限才能继续。\n请授予权限后重试";
                    break;
            }
            t82.b(str2, null, ((mo) urVar.j(y22Var)).s, 0L, null, null, 0L, new b62(3), 0L, 0, false, 0, 0, ((pc2) urVar.j(y22Var2)).j, urVar, 0, 0, 130042);
            i4 = 1;
            xp1.a(urVar, new pr0(1.0f, true));
            e21 c3 = hy1.c(hy1.b(b21Var, 1.0f), 56.0f);
            rc1 rc1Var = sk.a;
            de0Var2 = de0Var;
            sn0.b(de0Var2, c3, false, lp1.a(16.0f), sk.a(((mo) urVar.j(y22Var)).w, 0L, urVar, 14), null, null, null, go.N(-1062161328, new gh0(c2, 16), urVar), urVar, (i5 & 14) | 805306416, 484);
            urVar2 = urVar;
            urVar2.p(true);
        } else {
            i4 = 1;
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new p50(de0Var2, i2, i4);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [tl1, java.lang.Object] */
    public static final Object d(n4 n4Var, float f2, m4 m4Var, cy cyVar, Object obj, gc gcVar, q42 q42Var) {
        float g2;
        Object e2;
        float f3 = cyVar.f(obj);
        ?? obj2 = new Object();
        if (Float.isNaN(n4Var.j.g())) {
            g2 = 0.0f;
        } else {
            g2 = n4Var.j.g();
        }
        obj2.e = g2;
        if (!Float.isNaN(f3)) {
            float f4 = obj2.e;
            if (f4 != f3 && (e2 = yq1.e(f4, f3, f2, gcVar, new w3(m4Var, obj2, 0), q42Var)) == hv.e) {
                return e2;
            }
        }
        return od2.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.cy r6, float r7, float r8, defpackage.oe0 r9, defpackage.de0 r10) {
        /*
            boolean r0 = java.lang.Float.isNaN(r7)
            r1 = 0
            if (r0 != 0) goto L91
            float r0 = java.lang.Math.abs(r8)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r0 <= 0) goto L14
            r0 = r4
            goto L15
        L14:
            r0 = r3
        L15:
            if (r0 == 0) goto L1d
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1d
            r2 = r4
            goto L1e
        L1d:
            r2 = r3
        L1e:
            if (r0 != 0) goto L28
            java.lang.Object r6 = r6.a(r7)
            r6.getClass()
            return r6
        L28:
            float r8 = java.lang.Math.abs(r8)
            java.lang.Object r10 = r10.invoke()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            float r10 = java.lang.Math.abs(r10)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L46
            java.lang.Object r6 = r6.b(r7, r2)
            r6.getClass()
            return r6
        L46:
            java.lang.Object r8 = r6.b(r7, r3)
            r8.getClass()
            float r10 = r6.f(r8)
            java.lang.Object r0 = r6.b(r7, r4)
            r0.getClass()
            float r6 = r6.f(r0)
            float r5 = r10 - r6
            float r5 = java.lang.Math.abs(r5)
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Object r9 = r9.invoke(r5)
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            float r9 = java.lang.Math.abs(r9)
            if (r2 == 0) goto L77
            goto L78
        L77:
            r10 = r6
        L78:
            float r10 = r10 - r7
            float r6 = java.lang.Math.abs(r10)
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 < 0) goto L82
            r3 = r4
        L82:
            if (r3 != r4) goto L87
            if (r2 == 0) goto L8b
            goto L8c
        L87:
            if (r3 != 0) goto L8d
            if (r2 == 0) goto L8c
        L8b:
            return r8
        L8c:
            return r0
        L8d:
            defpackage.se.m()
            return r1
        L91:
            java.lang.String r6 = "The offset provided to computeTarget must not be NaN."
            defpackage.se.h(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp0.e(cy, float, float, oe0, de0):java.lang.Object");
    }

    public static final void f(int i2, int i3, List list) {
        int q2 = q(i2, list);
        if (q2 < 0) {
            q2 = -(q2 + 1);
        }
        while (q2 < list.size() && ((ao0) list.get(q2)).b < i3) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.de0 r4, defpackage.se0 r5, defpackage.wt r6) {
        /*
            boolean r0 = r6 instanceof defpackage.a4
            if (r0 == 0) goto L13
            r0 = r6
            a4 r0 = (defpackage.a4) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            a4 r0 = new a4
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.e
            int r1 = r0.f
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.io.K(r6)     // Catch: defpackage.s3 -> L40
            goto L40
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r4)
            return r2
        L2c:
            defpackage.io.K(r6)
            l r6 = new l     // Catch: defpackage.s3 -> L40
            r1 = 2
            r6.<init>(r4, r5, r2, r1)     // Catch: defpackage.s3 -> L40
            r0.f = r3     // Catch: defpackage.s3 -> L40
            java.lang.Object r4 = defpackage.fp.u(r6, r0)     // Catch: defpackage.s3 -> L40
            hv r5 = defpackage.hv.e
            if (r4 != r5) goto L40
            return r5
        L40:
            od2 r4 = defpackage.od2.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp0.g(de0, se0, wt):java.lang.Object");
    }

    public static e21 h(e21 e21Var, n4 n4Var, boolean z2, v11 v11Var) {
        return e21Var.d(new u3(n4Var, sb1.e, z2, null, v11Var));
    }

    public static e21 i(e21 e21Var, n4 n4Var, boolean z2, boolean z3) {
        return e21Var.d(new u3(n4Var, sb1.f, z3, Boolean.valueOf(z2), null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r7v0, types: [tl1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.n4 r10, java.lang.Object r11, float r12, defpackage.gc r13, defpackage.tx r14, defpackage.wt r15) {
        /*
            boolean r0 = r15 instanceof defpackage.y3
            if (r0 == 0) goto L13
            r0 = r15
            y3 r0 = (defpackage.y3) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            y3 r0 = new y3
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.g
            int r1 = r0.h
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            float r12 = r0.e
            tl1 r10 = r0.f
            defpackage.io.K(r15)
            goto L57
        L29:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r10)
            r10 = 0
            return r10
        L30:
            defpackage.io.K(r15)
            tl1 r7 = new tl1
            r7.<init>()
            r7.e = r12
            z3 r3 = new z3
            r9 = 0
            r4 = r10
            r5 = r12
            r6 = r13
            r8 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.f = r7
            r0.e = r5
            r0.h = r2
            t41 r10 = defpackage.t41.e
            java.lang.Object r10 = r4.a(r11, r10, r3, r0)
            hv r11 = defpackage.hv.e
            if (r10 != r11) goto L55
            return r11
        L55:
            r12 = r5
            r10 = r7
        L57:
            float r10 = r10.e
            float r12 = r12 - r10
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r12)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mp0.j(n4, java.lang.Object, float, gc, tx, wt):java.lang.Object");
    }

    public static Object k(n4 n4Var, Object obj, float f2, e4 e4Var) {
        gc gcVar;
        tx txVar;
        if (n4Var.d()) {
            gcVar = n4Var.d;
            if (gcVar == null) {
                sn0.V("snapAnimationSpec");
                throw null;
            }
        } else {
            gcVar = t3.a;
        }
        gc gcVar2 = gcVar;
        if (n4Var.d()) {
            txVar = n4Var.e;
            if (txVar == null) {
                sn0.V("decayAnimationSpec");
                throw null;
            }
        } else {
            txVar = t3.c;
        }
        return j(n4Var, obj, f2, gcVar2, txVar, e4Var);
    }

    public static int l(double d2) {
        double d3;
        boolean z2;
        double d4;
        double d5 = (d2 + 16.0d) / 116.0d;
        if (d2 > 8.0d) {
            d3 = d5 * d5 * d5;
        } else {
            d3 = d2 / 903.2962962962963d;
        }
        double d6 = d5 * d5 * d5;
        if (d6 > 0.008856451679035631d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            d4 = d6;
        } else {
            d4 = d2 / 903.2962962962963d;
        }
        if (!z2) {
            d6 = d2 / 903.2962962962963d;
        }
        float[] fArr = g;
        double d7 = d4 * fArr[0];
        double d8 = d3 * fArr[1];
        double d9 = d6 * fArr[2];
        double[][] dArr = i;
        double[] dArr2 = dArr[0];
        double d10 = (dArr2[2] * d9) + (dArr2[1] * d8) + (dArr2[0] * d7);
        double[] dArr3 = dArr[1];
        double d11 = (dArr3[2] * d9) + (dArr3[1] * d8) + (dArr3[0] * d7);
        double[] dArr4 = dArr[2];
        return ((o(d10) & 255) << 16) | (-16777216) | ((o(d11) & 255) << 8) | (o((dArr4[2] * d9) + (dArr4[1] * d8) + (dArr4[0] * d7)) & 255);
    }

    public static void m(int i2) {
        if (2 <= i2 && i2 < 37) {
            return;
        }
        StringBuilder q2 = l90.q("radix ", i2, " was not in valid range ");
        q2.append(new ym0(2, 36, 1));
        throw new IllegalArgumentException(q2.toString());
    }

    public static final void n(fz1 fz1Var, ArrayList arrayList, int i2) {
        boolean l2 = fz1Var.l(i2);
        int[] iArr = fz1Var.b;
        if (l2) {
            arrayList.add(fz1Var.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            n(fz1Var, arrayList, i4);
        }
    }

    public static int o(double d2) {
        double pow;
        double d3 = d2 / 100.0d;
        if (d3 <= 0.0031308d) {
            pow = d3 * 12.92d;
        } else {
            pow = (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d;
        }
        int round = (int) Math.round(pow * 255.0d);
        if (round < 0) {
            return 0;
        }
        if (round > 255) {
            return 255;
        }
        return round;
    }

    public static final boolean p(char c2, char c3, boolean z2) {
        if (c2 == c3) {
            return true;
        }
        if (!z2) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static final int q(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int B2 = sn0.B(((ao0) list.get(i4)).b, i2);
            if (B2 < 0) {
                i3 = i4 + 1;
            } else if (B2 > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public static jl r(int i2) {
        float f2;
        be0 be0Var = be0.k;
        float E2 = E((i2 >> 16) & 255);
        float E3 = E((i2 >> 8) & 255);
        float E4 = E(i2 & 255);
        double d2 = E2;
        double[][] dArr = h;
        double[] dArr2 = dArr[0];
        double d3 = E3;
        double d4 = E4;
        double d5 = (dArr2[2] * d4) + (dArr2[1] * d3) + (dArr2[0] * d2);
        double[] dArr3 = dArr[1];
        double d6 = (dArr3[2] * d4) + (dArr3[1] * d3) + (dArr3[0] * d2);
        double[] dArr4 = dArr[2];
        float[] fArr = {(float) d5, (float) d6, (float) ((d4 * dArr4[2]) + (d3 * dArr4[1]) + (d2 * dArr4[0]))};
        float f3 = fArr[0];
        float[][] fArr2 = e;
        float[] fArr3 = fArr2[0];
        float f4 = fArr3[0] * f3;
        float f5 = fArr[1];
        float f6 = (fArr3[1] * f5) + f4;
        float f7 = fArr[2];
        float f8 = (fArr3[2] * f7) + f6;
        float[] fArr4 = fArr2[1];
        float f9 = (fArr4[2] * f7) + (fArr4[1] * f5) + (fArr4[0] * f3);
        float[] fArr5 = fArr2[2];
        float f10 = (f7 * fArr5[2]) + (f5 * fArr5[1]) + (f3 * fArr5[0]);
        float[] fArr6 = be0Var.g;
        float f11 = be0Var.e;
        float f12 = be0Var.b;
        float f13 = fArr6[0] * f8;
        float f14 = fArr6[1] * f9;
        float f15 = fArr6[2] * f10;
        float f16 = be0Var.h;
        float pow = (float) Math.pow((Math.abs(f13) * f16) / 100.0f, 0.41999998688697815d);
        float pow2 = (float) Math.pow((Math.abs(f14) * f16) / 100.0f, 0.41999998688697815d);
        float pow3 = (float) Math.pow((Math.abs(f15) * f16) / 100.0f, 0.41999998688697815d);
        float signum = ((Math.signum(f13) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f14) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f15) * 400.0f) * pow3) / (pow3 + 27.13f);
        float f17 = ((((-12.0f) * signum2) + (signum * 11.0f)) + signum3) / 11.0f;
        float f18 = ((signum + signum2) - (signum3 * 2.0f)) / 9.0f;
        float f19 = signum2 * 20.0f;
        float f20 = ((21.0f * signum3) + ((signum * 20.0f) + f19)) / 20.0f;
        float f21 = (((signum * 40.0f) + f19) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f18, f17)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f22 = atan2;
        float f23 = (f22 * 3.1415927f) / 180.0f;
        float pow4 = ((float) Math.pow((f21 * be0Var.c) / f12, be0Var.j * f11)) * 100.0f;
        if (f22 < 20.14d) {
            f2 = 360.0f + f22;
        } else {
            f2 = f22;
        }
        float pow5 = ((float) Math.pow(((((((((float) Math.cos(((f2 * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * be0Var.f) * be0Var.d) * ((float) Math.sqrt((f18 * f18) + (f17 * f17)))) / (f20 + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, be0Var.a)), 0.7300000190734863d)) * ((float) Math.sqrt(pow4 / 100.0f));
        float f24 = be0Var.i * pow5;
        Math.sqrt((r2 * f11) / (f12 + 4.0f));
        float f25 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f24 * 0.0228f) + 1.0f)) * 43.85965f;
        double d7 = f23;
        return new jl(f22, pow5, pow4, f25, log * ((float) Math.cos(d7)), log * ((float) Math.sin(d7)));
    }

    public static jl s(float f2, float f3, float f4) {
        float f5 = be0.k.i * f3;
        Math.sqrt(((f3 / ((float) Math.sqrt(f2 / 100.0d))) * r0.e) / (r0.b + 4.0f));
        float f6 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float log = ((float) Math.log((f5 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f4) / 180.0f;
        return new jl(f4, f3, f2, f6, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static final p31 t(uu1 uu1Var, oe0 oe0Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            ru1 a2 = uu1Var.a();
            ar0 ar0Var = a2.c;
            if (ar0Var.I() && ar0Var.H()) {
                p31 p31Var = new p31(48);
                rg2 rg2Var = new rg2(29);
                bn0 O2 = hp.O(a2.g());
                ((Region) rg2Var.f).set(O2.a, O2.b, O2.c, O2.d);
                u(rg2Var, a2, p31Var, oe0Var, a2, new rg2(29));
                return p31Var;
            }
            p31 p31Var2 = wm0.a;
            p31Var2.getClass();
            return p31Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void u(rg2 rg2Var, ru1 ru1Var, p31 p31Var, oe0 oe0Var, ru1 ru1Var2, rg2 rg2Var2) {
        boolean z2;
        pl1 q1;
        pl1 pl1Var;
        ar0 ar0Var;
        ru1 ru1Var3 = ru1Var;
        int i2 = ru1Var3.g;
        rg2 rg2Var3 = rg2Var2;
        Region region = (Region) rg2Var3.f;
        ar0 ar0Var2 = ru1Var2.c;
        int i3 = ru1Var2.g;
        boolean z3 = false;
        if (ar0Var2.I() && ar0Var2.H()) {
            z2 = false;
        } else {
            z2 = true;
        }
        rg2 rg2Var4 = rg2Var;
        Region region2 = (Region) rg2Var4.f;
        if (!region2.isEmpty() || i3 == i2) {
            if (!z2 || ru1Var2.e) {
                qz f2 = ru1Var2.f();
                if (f2 == null) {
                    q1 = ar0Var2.J.c.q1();
                } else {
                    d21 d21Var = ((d21) f2).e;
                    Object g2 = ru1Var2.d.e.g(lu1.b);
                    if (g2 == null) {
                        g2 = null;
                    }
                    if (g2 != null) {
                        z3 = true;
                    }
                    if (!d21Var.e.r) {
                        q1 = pl1.e;
                    } else if (!z3) {
                        e81 K2 = hp.K(d21Var, 8);
                        q1 = qo.D(K2).O(K2, true);
                    } else {
                        q1 = hp.K(d21Var, 8).q1();
                    }
                }
                bn0 O2 = hp.O(q1);
                region.set(O2.a, O2.b, O2.c, O2.d);
                if (i3 == i2) {
                    i3 = -1;
                }
                if (region.op(region2, Region.Op.INTERSECT)) {
                    Rect bounds = region.getBounds();
                    p31Var.i(i3, new tu1(ru1Var2, new bn0(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                    List j2 = ru1.j(4, ru1Var2);
                    int size = j2.size() - 1;
                    while (-1 < size) {
                        if (!((Boolean) oe0Var.invoke(j2.get(size))).booleanValue()) {
                            u(rg2Var4, ru1Var3, p31Var, oe0Var, (ru1) j2.get(size), rg2Var3);
                        }
                        size--;
                        rg2Var4 = rg2Var;
                        ru1Var3 = ru1Var;
                        rg2Var3 = rg2Var2;
                    }
                    if (B(ru1Var2)) {
                        region2.op(O2.a, O2.b, O2.c, O2.d, Region.Op.DIFFERENCE);
                        return;
                    }
                    return;
                }
                if (ru1Var2.e) {
                    ru1 l2 = ru1Var2.l();
                    if (l2 != null && (ar0Var = l2.c) != null && ar0Var.I()) {
                        pl1Var = l2.g();
                    } else {
                        pl1Var = L;
                    }
                    p31Var.i(i3, new tu1(ru1Var2, hp.O(pl1Var)));
                    return;
                }
                if (i3 == -1) {
                    Rect bounds2 = region.getBounds();
                    p31Var.i(i3, new tu1(ru1Var2, new bn0(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                }
            }
        }
    }

    public static final long v(KeyEvent keyEvent) {
        return vn.i(keyEvent.getKeyCode());
    }

    public static final int w(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    public static final e21 x(e21 e21Var) {
        return e21Var.d(new h52(new ke2(9)));
    }

    public static rk0 y(t40 t40Var, int i2) {
        return new rk0(t40Var, nm1.e);
    }

    public static int z(float f2) {
        float f3;
        boolean z2;
        float f4;
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f5 = (f2 + 16.0f) / 116.0f;
        if (f2 > 8.0f) {
            f3 = f5 * f5 * f5;
        } else {
            f3 = f2 / 903.2963f;
        }
        float f6 = f5 * f5 * f5;
        if (f6 > 0.008856452f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f4 = f6;
        } else {
            f4 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z2) {
            f6 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = g;
        return vo.a(f4 * fArr[0], f3 * fArr[1], f6 * fArr[2]);
    }
}
