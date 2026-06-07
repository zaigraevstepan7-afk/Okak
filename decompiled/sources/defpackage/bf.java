package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import com.google.protobuf.DescriptorProtos;
import com.topjohnwu.superuser.internal.HiddenAPIs;
import com.topjohnwu.superuser.nio.FileSystemManager;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.UUID;
import okhttp3.internal.ws.RealWebSocket;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class bf {
    public static final float A;
    public static final no A0;
    public static final no B;
    public static final no B0;
    public static final wc0 C;
    public static final no C0;
    public static final float D = 10.0f;
    public static final no D0;
    public static final no E;
    public static final no E0;
    public static final mw1 F;
    public static final no F0;
    public static final no G;
    public static final no G0;
    public static final float H;
    public static final no H0;
    public static final no I;
    public static final no I0;
    public static final float J;
    public static final no J0;
    public static final no K;
    public static final no K0;
    public static final float L;
    public static final no L0;
    public static final no M;
    public static final no M0;
    public static final float N;
    public static final no N0;
    public static final no O;
    public static final no O0;
    public static final float P;
    public static final u8 P0;
    public static final no Q;
    public static final u8 Q0;
    public static final qc2 R;
    public static final u8 R0;
    public static final no S;
    public static final no S0;
    public static final float T;
    public static final no T0;
    public static final float U;
    public static final float U0;
    public static final no V;
    public static final no V0;
    public static final no W;
    public static final float W0;
    public static final no X;
    public static final no X0;
    public static final no Y;
    public static final float Y0;
    public static final no Z;
    public static final no Z0;
    public static final no a0;
    public static final float a1;
    public static final no b0;
    public static final mw1 b1;
    public static final no c0;
    public static final float c1;
    public static final qc2 d0;
    public static final no d1;
    public static final no e;
    public static final float e0;
    public static final float e1;
    public static final no f;
    public static final float f0;
    public static final float f1;
    public static final no g;
    public static final no g0;
    public static final wm1 g1;
    public static final no h;
    public static final float h0;
    public static final Object h1;
    public static final no i;
    public static final float i0;
    public static final v90 i1;
    public static final no j;
    public static final qc2 j0;
    public static ij0 j1;
    public static final mw1 k;
    public static final float k0;
    public static final float l;
    public static final ad0 l0;
    public static final float m;
    public static final no m0;
    public static final mw1 n;
    public static final no n0;
    public static final float o;
    public static final no o0;
    public static final fq p;
    public static final no p0;
    public static final fq q;
    public static final no q0;
    public static final fq r;
    public static final no r0;
    public static final fq s;
    public static final no s0;
    public static final uc0 t;
    public static final no t0;
    public static final o10 u;
    public static final no u0;
    public static final no v;
    public static final no v0;
    public static final no w;
    public static final no w0;
    public static final float x;
    public static final no x0;
    public static final no y;
    public static final no y0;
    public static final float z;
    public static final no z0;
    public static final hi a = new hi(-1.0f);
    public static final hi b = new hi(1.0f);
    public static final gi c = new gi(-1.0f);
    public static final gi d = new gi(1.0f);

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, af0] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, o10] */
    static {
        no noVar = no.v;
        e = noVar;
        no noVar2 = no.l;
        f = noVar2;
        g = no.w;
        no noVar3 = no.m;
        h = noVar3;
        i = noVar2;
        j = noVar3;
        mw1 mw1Var = mw1.h;
        k = mw1Var;
        l = 16.0f;
        m = 1.0f;
        n = mw1.m;
        o = 16.0f;
        p = new fq(-1571120048, false, new Object());
        q = new fq(-1455401925, false, new o1(4));
        r = new fq(-515413792, false, new o1(5));
        s = new fq(-527445323, false, new o1(6));
        t = new uc0(7);
        u = new Object();
        no noVar4 = no.q;
        v = noVar4;
        w = noVar2;
        x = 0.1f;
        y = noVar3;
        z = 0.38f;
        A = 1.0f;
        B = no.i;
        C = new wc0(6);
        E = noVar;
        F = mw1.l;
        G = noVar2;
        H = 0.38f;
        I = noVar2;
        J = 0.38f;
        K = noVar2;
        L = 0.38f;
        M = noVar2;
        N = 0.38f;
        O = noVar2;
        P = 0.38f;
        Q = noVar2;
        R = qc2.e;
        S = noVar3;
        T = 16.0f;
        U = 56.0f;
        V = noVar3;
        no noVar5 = no.u;
        W = noVar5;
        no noVar6 = no.k;
        X = noVar6;
        Y = noVar6;
        Z = noVar6;
        a0 = noVar6;
        b0 = noVar6;
        c0 = noVar3;
        d0 = qc2.f;
        e0 = 88.0f;
        f0 = 10.0f;
        g0 = noVar3;
        h0 = 24.0f;
        i0 = 16.0f;
        j0 = qc2.j;
        k0 = 72.0f;
        l0 = new ad0("NO_OWNER", 5);
        m0 = noVar4;
        n0 = noVar2;
        o0 = noVar2;
        p0 = noVar2;
        q0 = noVar2;
        r0 = noVar2;
        s0 = noVar2;
        no noVar7 = no.e;
        t0 = noVar7;
        u0 = noVar2;
        v0 = noVar7;
        w0 = noVar3;
        x0 = noVar7;
        y0 = noVar7;
        z0 = noVar7;
        A0 = noVar2;
        B0 = noVar4;
        C0 = noVar3;
        D0 = noVar4;
        E0 = noVar3;
        F0 = noVar3;
        G0 = noVar2;
        H0 = noVar3;
        I0 = noVar3;
        J0 = noVar3;
        K0 = noVar3;
        L0 = noVar3;
        M0 = no.o;
        N0 = noVar3;
        O0 = noVar3;
        P0 = new u8(DescriptorProtos.Edition.EDITION_2023_VALUE);
        new u8(1007);
        Q0 = new u8(1008);
        R0 = new u8(1002);
        S0 = noVar4;
        T0 = noVar2;
        U0 = 0.38f;
        V0 = noVar2;
        W0 = 0.38f;
        X0 = noVar2;
        Y0 = 0.12f;
        Z0 = noVar4;
        a1 = 44.0f;
        b1 = mw1Var;
        c1 = 4.0f;
        d1 = noVar5;
        e1 = 16.0f;
        f1 = 4.0f;
        g1 = new wm1(9);
        h1 = new Object();
        i1 = new v90(0);
    }

    public static void A(char[] cArr, char[] cArr2, int i2, int i3, int i4) {
        cArr.getClass();
        cArr2.getClass();
        System.arraycopy(cArr, i3, cArr2, i2, i4 - i3);
    }

    public static void B(int[] iArr, int[] iArr2, int i2, int i3, int i4) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i3, iArr2, i2, i4 - i3);
    }

    public static void C(long[] jArr, long[] jArr2, int i2, int i3, int i4) {
        jArr.getClass();
        jArr2.getClass();
        System.arraycopy(jArr, i3, jArr2, i2, i4 - i3);
    }

    public static void D(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i3, objArr2, i2, i4 - i3);
    }

    public static void E(float[] fArr, float[] fArr2, int i2) {
        int i3;
        if ((i2 & 8) != 0) {
            i3 = fArr.length;
        } else {
            i3 = 6;
        }
        fArr.getClass();
        fArr2.getClass();
        System.arraycopy(fArr, 0, fArr2, 0, i3);
    }

    public static /* synthetic */ void F(int[] iArr, int[] iArr2, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = iArr.length;
        }
        B(iArr, iArr2, i2, 0, i3);
    }

    public static /* synthetic */ void G(Object[] objArr, Object[] objArr2, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        D(objArr, objArr2, 0, i2, i3);
    }

    public static byte[] H(byte[] bArr, int i2, int i3) {
        bArr.getClass();
        J(i3, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i2, i3);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static Object[] I(Object[] objArr, int i2, int i3) {
        objArr.getClass();
        J(i3, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i2, i3);
        copyOfRange.getClass();
        return copyOfRange;
    }

    public static final void J(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        y61.l("toIndex (", i2, i3, ") is greater than size (");
    }

    public static final gv K(ur urVar) {
        return new km1(urVar.R);
    }

    public static boolean L(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z2 = true;
            for (File file2 : listFiles) {
                if (L(file2) && z2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            return z2;
        }
        file.delete();
        return true;
    }

    public static void M(Object[] objArr, int i2, int i3) {
        objArr.getClass();
        Arrays.fill(objArr, i2, i3, (Object) null);
    }

    public static void N(int[] iArr, int i2) {
        int length = iArr.length;
        iArr.getClass();
        Arrays.fill(iArr, 0, length, i2);
    }

    public static void O(long[] jArr, long j2) {
        int length = jArr.length;
        jArr.getClass();
        Arrays.fill(jArr, 0, length, j2);
    }

    public static ArrayList Q(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object R(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        y61.j("Array is empty.");
        return null;
    }

    public static final String S(int i2) {
        int i3 = i2 / DescriptorProtos.Edition.EDITION_2023_VALUE;
        return String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3 / 60), Integer.valueOf(i3 % 60)}, 2));
    }

    public static final String T(long j2) {
        if (j2 < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return j2 + " B";
        }
        if (j2 < 1048576) {
            return c01.Q(j2 / 1024.0d) + " KB";
        }
        return (c01.Q((j2 / 1048576.0d) * 10.0d) / 10.0d) + " MB";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [an0, ym0] */
    public static an0 U(int[] iArr) {
        return new ym0(0, iArr.length - 1, 1);
    }

    public static int V(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static Object W(Object[] objArr, int i2) {
        objArr.getClass();
        if (i2 >= 0 && i2 < objArr.length) {
            return objArr[i2];
        }
        return null;
    }

    public static int X(Object[] objArr, Object obj) {
        objArr.getClass();
        int i2 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i2 < length) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i2 < length2) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static Float Y(float[] fArr) {
        fArr.getClass();
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    public static final e21 Z(e21 e21Var, us1 us1Var, sb1 sb1Var, j7 j7Var, boolean z2, z90 z90Var, r31 r31Var, uc1 uc1Var) {
        e21 z3;
        sb1 sb1Var2 = sb1.e;
        b21 b21Var = b21.a;
        if (sb1Var == sb1Var2) {
            z3 = sn0.z(b21Var, ji0.c);
        } else {
            z3 = sn0.z(b21Var, ji0.b);
        }
        return e21Var.d(z3).d(new gs1(j7Var, uc1Var, z90Var, r31Var, sb1Var, us1Var, z2, false));
    }

    public static final void a(zm1 zm1Var, se0 se0Var, de0 de0Var, e21 e21Var, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        zm1Var.getClass();
        se0Var.getClass();
        de0Var.getClass();
        urVar.Y(-427853119);
        if (urVar.f(zm1Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (urVar.h(se0Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (urVar.h(de0Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if (urVar.f(e21Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        boolean z3 = false;
        if ((i10 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i10 & 1, z2)) {
            h32 c2 = jx0.c(urVar);
            String str = zm1Var.c;
            boolean h2 = urVar.h(se0Var);
            if ((i10 & 14) == 4) {
                z3 = true;
            }
            boolean z4 = h2 | z3;
            Object L2 = urVar.L();
            vt vtVar = null;
            Object obj = or.a;
            if (z4 || L2 == obj) {
                L2 = new l(se0Var, zm1Var, vtVar, 26);
                urVar.h0(L2);
            }
            se0 se0Var2 = (se0) L2;
            Object L3 = urVar.L();
            if (L3 == obj) {
                L3 = fr1.k(jg.a);
                urVar.h0(L3);
            }
            o41 o41Var = (o41) L3;
            boolean h3 = urVar.h(se0Var2);
            Object L4 = urVar.L();
            if (h3 || L4 == obj) {
                L4 = new y02(se0Var2, o41Var, null, 1);
                urVar.h0(L4);
            }
            i(urVar, (se0) L4, str);
            rx.c(e21Var, lp1.a(20.0f), d6.r(((mo) urVar.j(oo.a)).F, 0L, urVar, 14), d6.s(62, 0.0f), go.N(-1287678285, new js0(zm1Var, c2, o41Var, de0Var, 2), urVar), urVar, ((i10 >> 9) & 14) | 196608, 16);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new be(zm1Var, se0Var, de0Var, e21Var, i2, 6);
        }
    }

    public static final void a0(TextPaint textPaint, float f2) {
        if (!Float.isNaN(f2)) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            textPaint.setAlpha(Math.round(f2 * 255.0f));
        }
    }

    public static final void b(zm1 zm1Var, final de0 de0Var, final de0 de0Var2, ur urVar, int i2) {
        int i3;
        int i4;
        boolean z2;
        de0Var.getClass();
        de0Var2.getClass();
        urVar.Y(1102386177);
        if (urVar.f(zm1Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (urVar.h(de0Var2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i6 = i5 | i4;
        final int i7 = 0;
        final int i8 = 1;
        if ((i6 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i6 & 1, z2)) {
            final h32 c2 = jx0.c(urVar);
            mp0.a(de0Var, go.N(-1838774199, new se0() { // from class: gn1
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    int i9 = i7;
                    od2 od2Var = od2.a;
                    boolean z3 = false;
                    h32 h32Var = c2;
                    switch (i9) {
                        case 0:
                            ur urVar2 = (ur) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if ((intValue & 3) != 2) {
                                z3 = true;
                            }
                            if (urVar2.O(intValue & 1, z3)) {
                                rc1 rc1Var = sk.a;
                                sn0.b(de0Var2, null, false, null, sk.a(((mo) urVar2.j(oo.a)).w, 0L, urVar2, 14), null, null, null, go.N(1476339769, new gh0(h32Var, 12), urVar2), urVar2, FileSystemManager.MODE_READ_WRITE, 494);
                            } else {
                                urVar2.R();
                            }
                            return od2Var;
                        default:
                            ur urVar3 = (ur) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if ((intValue2 & 3) != 2) {
                                z3 = true;
                            }
                            if (urVar3.O(intValue2 & 1, z3)) {
                                sn0.o(de0Var2, null, false, null, null, null, go.N(916265224, new gh0(h32Var, 11), urVar3), urVar3, FileSystemManager.MODE_READ_WRITE, 510);
                            } else {
                                urVar3.R();
                            }
                            return od2Var;
                    }
                }
            }, urVar), null, go.N(668323275, new se0() { // from class: gn1
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    int i9 = i8;
                    od2 od2Var = od2.a;
                    boolean z3 = false;
                    h32 h32Var = c2;
                    switch (i9) {
                        case 0:
                            ur urVar2 = (ur) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if ((intValue & 3) != 2) {
                                z3 = true;
                            }
                            if (urVar2.O(intValue & 1, z3)) {
                                rc1 rc1Var = sk.a;
                                sn0.b(de0Var, null, false, null, sk.a(((mo) urVar2.j(oo.a)).w, 0L, urVar2, 14), null, null, null, go.N(1476339769, new gh0(h32Var, 12), urVar2), urVar2, FileSystemManager.MODE_READ_WRITE, 494);
                            } else {
                                urVar2.R();
                            }
                            return od2Var;
                        default:
                            ur urVar3 = (ur) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if ((intValue2 & 3) != 2) {
                                z3 = true;
                            }
                            if (urVar3.O(intValue2 & 1, z3)) {
                                sn0.o(de0Var, null, false, null, null, null, go.N(916265224, new gh0(h32Var, 11), urVar3), urVar3, FileSystemManager.MODE_READ_WRITE, 510);
                            } else {
                                urVar3.R();
                            }
                            return od2Var;
                    }
                }
            }, urVar), null, go.N(-1119546547, new sd(c2, 16), urVar), go.N(-2013481458, new u2(26, c2, zm1Var), urVar), null, 0L, 0L, 0L, 0L, null, urVar, 1772598, 16276);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new hn1(zm1Var, de0Var, de0Var2, i2, 0);
        }
    }

    public static String b0(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (!str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (!str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (!str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -207262728:
                if (!str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (!str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (!str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (!str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (!str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (!str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (!str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return null;
                }
                return "Companion";
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final void c(de0 de0Var, z00 z00Var, fq fqVar, ur urVar, int i2) {
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        urVar.Y(826668973);
        int i5 = 2;
        if (urVar.h(de0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (urVar.f(z00Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        boolean z4 = true;
        if ((i7 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i7 & 1, z2)) {
            View view = (View) urVar.j(l6.f);
            c00 c00Var = (c00) urVar.j(is.h);
            jq0 jq0Var = (jq0) urVar.j(is.n);
            sr J2 = io.J(urVar);
            o41 p2 = fr1.p(fqVar, urVar);
            Object[] objArr = new Object[0];
            Object L2 = urVar.L();
            Object obj = or.a;
            if (L2 == obj) {
                L2 = e6.k;
                urVar.h0(L2);
            }
            UUID uuid = (UUID) go.P(objArr, (de0) L2, urVar);
            boolean f2 = urVar.f(view) | urVar.f(c00Var);
            Object L3 = urVar.L();
            if (f2 || L3 == obj) {
                b10 b10Var = new b10(de0Var, z00Var, view, jq0Var, c00Var, uuid);
                fq fqVar2 = new fq(346960332, true, new t(p2, i5));
                w00 w00Var = b10Var.l;
                w00Var.setParentCompositionContext(J2);
                w00Var.n.setValue(fqVar2);
                w00Var.r = true;
                w00Var.d();
                urVar.h0(b10Var);
                L3 = b10Var;
            }
            b10 b10Var2 = (b10) L3;
            boolean h2 = urVar.h(b10Var2);
            Object L4 = urVar.L();
            if (h2 || L4 == obj) {
                L4 = new y6(b10Var2, 0);
                urVar.h0(L4);
            }
            d(b10Var2, (oe0) L4, urVar);
            boolean h3 = urVar.h(b10Var2);
            if ((i7 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = h3 | z3;
            if ((i7 & 112) != 32) {
                z4 = false;
            }
            boolean d2 = z5 | z4 | urVar.d(jq0Var.ordinal());
            Object L5 = urVar.L();
            if (d2 || L5 == obj) {
                L5 = new z6(b10Var2, de0Var, z00Var, jq0Var);
                urVar.h0(L5);
            }
            p((de0) L5, urVar);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new f6(de0Var, z00Var, fqVar, i2, 1);
        }
    }

    public static char c0(char[] cArr) {
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            se.h("Array has more than one element.");
            return (char) 0;
        }
        y61.j("Array is empty.");
        return (char) 0;
    }

    public static final void d(Object obj, oe0 oe0Var, ur urVar) {
        boolean f2 = urVar.f(obj);
        Object L2 = urVar.L();
        if (f2 || L2 == or.a) {
            L2 = new m10(oe0Var);
            urVar.h0(L2);
        }
    }

    public static final e21 d0(e21 e21Var, h12 h12Var, dx dxVar, w72 w72Var, zt ztVar) {
        return e21Var.d(new v62(h12Var, dxVar, w72Var, ztVar));
    }

    public static final void e(Object obj, Object obj2, oe0 oe0Var, ur urVar) {
        boolean f2 = urVar.f(obj) | urVar.f(obj2);
        Object L2 = urVar.L();
        if (f2 || L2 == or.a) {
            L2 = new m10(oe0Var);
            urVar.h0(L2);
        }
    }

    public static List e0(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new re(objArr, false));
            }
            return xn.E(objArr[0]);
        }
        return l60.e;
    }

    public static final void f(int i2, ur urVar) {
        boolean z2;
        String str;
        String str2;
        String str3;
        ur urVar2 = urVar;
        urVar2.Y(-459956525);
        if (i2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar2.O(i2 & 1, z2)) {
            h32 c2 = jx0.c(urVar2);
            p90 p90Var = hy1.c;
            j01 d2 = hj.d(g3.j, false);
            int hashCode = Long.hashCode(urVar2.T);
            sf1 l2 = urVar2.l();
            e21 Q2 = fp.Q(urVar2, p90Var);
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
            op1.q(urVar2, gbVar4, Q2);
            ii iiVar = g3.s;
            b21 b21Var = b21.a;
            e21 K2 = sn0.K(b21Var, 24.0f);
            yo a2 = wo.a(c01.g, iiVar, urVar2, 48);
            int hashCode2 = Long.hashCode(urVar2.T);
            sf1 l3 = urVar2.l();
            e21 Q3 = fp.Q(urVar2, K2);
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            op1.q(urVar2, gbVar, a2);
            op1.q(urVar2, gbVar2, l3);
            l90.t(hashCode2, urVar2, gbVar3, urVar2, i5Var);
            op1.q(urVar2, gbVar4, Q3);
            ij0 ij0Var = sn0.Q;
            if (ij0Var == null) {
                hj0 hj0Var = new hj0("Rounded.AudioFile", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i3 = me2.a;
                i12 i12Var = new i12(co.b);
                rg2 rg2Var = new rg2(21);
                rg2Var.s(19.41f, 7.41f);
                rg2Var.r(-4.83f, -4.83f);
                rg2Var.h(14.21f, 2.21f, 13.7f, 2.0f, 13.17f, 2.0f);
                rg2Var.n(6.0f);
                rg2Var.h(4.9f, 2.0f, 4.01f, 2.9f, 4.01f, 4.0f);
                rg2Var.q(4.0f, 20.0f);
                rg2Var.i(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
                rg2Var.n(18.0f);
                rg2Var.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                rg2Var.D(8.83f);
                rg2Var.h(20.0f, 8.3f, 19.79f, 7.79f, 19.41f, 7.41f);
                rg2Var.f();
                rg2Var.s(15.0f, 13.0f);
                rg2Var.o(-2.0f);
                rg2Var.E(3.61f);
                rg2Var.i(0.0f, 1.28f, -1.0f, 2.41f, -2.28f, 2.39f);
                rg2Var.i(-1.44f, -0.02f, -2.56f, -1.39f, -2.13f, -2.91f);
                rg2Var.i(0.21f, -0.72f, 0.8f, -1.31f, 1.53f, -1.51f);
                rg2Var.i(0.7f, -0.19f, 1.36f, -0.05f, 1.88f, 0.29f);
                rg2Var.D(12.0f);
                rg2Var.i(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
                rg2Var.o(2.0f);
                rg2Var.i(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
                rg2Var.h(16.0f, 12.55f, 15.55f, 13.0f, 15.0f, 13.0f);
                rg2Var.f();
                rg2Var.s(14.0f, 9.0f);
                rg2Var.i(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
                rg2Var.D(3.5f);
                rg2Var.q(18.5f, 9.0f);
                rg2Var.n(14.0f);
                rg2Var.f();
                hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
                ij0Var = hj0Var.b();
                sn0.Q = ij0Var;
            }
            switch (c2.a) {
                case 0:
                    str = "Audio file";
                    break;
                case 1:
                    str = "Arquivo de áudio";
                    break;
                case 2:
                    str = "Аудиофайл";
                    break;
                case 3:
                    str = "Аудіофайл";
                    break;
                default:
                    str = "音频文件";
                    break;
            }
            y22 y22Var = oo.a;
            ej0.a(ij0Var, str, hy1.f(b21Var, 64.0f), co.b(((mo) urVar2.j(y22Var)).s, 0.5f), urVar2, 384, 0);
            xp1.a(urVar2, hy1.c(b21Var, 16.0f));
            switch (c2.a) {
                case 0:
                    str2 = "No resources yet";
                    break;
                case 1:
                    str2 = "Nenhum recurso ainda";
                    break;
                case 2:
                    str2 = "Ресурсов пока нет";
                    break;
                case 3:
                    str2 = "Ресурсів поки немає";
                    break;
                default:
                    str2 = "暂无资源";
                    break;
            }
            y22 y22Var2 = rc2.a;
            t82.b(str2, null, ((mo) urVar2.j(y22Var)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar2.j(y22Var2)).h, urVar, 0, 0, 131066);
            xp1.a(urVar, hy1.c(b21Var, 8.0f));
            switch (c2.a) {
                case 0:
                    str3 = "Import MP3 audio files or ESP images to get started";
                    break;
                case 1:
                    str3 = "Importe arquivos de áudio MP3 ou imagens ESP para começar";
                    break;
                case 2:
                    str3 = "Импортируйте MP3 аудио или ESP изображения для начала";
                    break;
                case 3:
                    str3 = "Імпортуйте MP3 аудіо або ESP зображення для початку";
                    break;
                default:
                    str3 = "导入 MP3 音频文件或 ESP 图像以开始使用";
                    break;
            }
            t82.b(str3, null, co.b(((mo) urVar.j(y22Var)).s, 0.7f), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar.j(y22Var2)).k, urVar, 0, 0, 131066);
            urVar2 = urVar;
            urVar2.p(true);
            urVar2.p(true);
        } else {
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new p11(i2, 8);
        }
    }

    public static final Object f0(xu xuVar, Object obj, Object obj2, se0 se0Var, vt vtVar) {
        Object invoke;
        Object Q2 = mp0.Q(xuVar, obj2);
        try {
            g22 g22Var = new g22(vtVar, xuVar);
            if (se0Var == null) {
                invoke = go.Z(se0Var, obj, g22Var);
            } else {
                fc2.t(2, se0Var);
                invoke = se0Var.invoke(obj, g22Var);
            }
            mp0.J(xuVar, Q2);
            if (invoke == hv.e) {
                vtVar.getClass();
            }
            return invoke;
        } catch (Throwable th) {
            mp0.J(xuVar, Q2);
            throw th;
        }
    }

    public static final void g(String str, ur urVar, int i2) {
        int i3;
        boolean z2;
        String str2 = str;
        ur urVar2 = urVar;
        str2.getClass();
        urVar2.Y(-386553751);
        if (urVar2.f(str2)) {
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
        if (urVar2.O(i4 & 1, z2)) {
            h32 c2 = jx0.c(urVar2);
            p90 p90Var = hy1.c;
            j01 d2 = hj.d(g3.j, false);
            int hashCode = Long.hashCode(urVar2.T);
            sf1 l2 = urVar2.l();
            e21 Q2 = fp.Q(urVar2, p90Var);
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
            op1.q(urVar2, gbVar4, Q2);
            ii iiVar = g3.s;
            b21 b21Var = b21.a;
            e21 K2 = sn0.K(b21Var, 24.0f);
            yo a2 = wo.a(c01.g, iiVar, urVar2, 48);
            int hashCode2 = Long.hashCode(urVar2.T);
            sf1 l3 = urVar2.l();
            e21 Q3 = fp.Q(urVar2, K2);
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            op1.q(urVar2, gbVar, a2);
            op1.q(urVar2, gbVar2, l3);
            l90.t(hashCode2, urVar2, gbVar3, urVar2, i5Var);
            op1.q(urVar2, gbVar4, Q3);
            String j2 = c2.j();
            y22 y22Var = rc2.a;
            k92 k92Var = ((pc2) urVar2.j(y22Var)).h;
            y22 y22Var2 = oo.a;
            t82.b(j2, null, ((mo) urVar2.j(y22Var2)).w, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92Var, urVar, 0, 0, 131066);
            xp1.a(urVar, hy1.c(b21Var, 8.0f));
            str2 = str;
            t82.b(str2, null, ((mo) urVar.j(y22Var2)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar.j(y22Var)).k, urVar, i4 & 14, 0, 131066);
            urVar2 = urVar;
            urVar2.p(true);
            urVar2.p(true);
        } else {
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new nd(str2, i2, 3);
        }
    }

    public static final void h(zm1 zm1Var, de0 de0Var, de0 de0Var2, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        Object fo1Var;
        zm1Var.getClass();
        String str = zm1Var.c;
        de0Var.getClass();
        de0Var2.getClass();
        urVar.Y(-841447931);
        if (urVar.f(zm1Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (urVar.h(de0Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (urVar.h(de0Var2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i8 & 1, z2)) {
            boolean f2 = urVar.f(str);
            Object L2 = urVar.L();
            if (f2 || L2 == or.a) {
                Object obj = null;
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = 2;
                    Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                    if (decodeFile != null) {
                        fo1Var = new t7(decodeFile);
                    } else {
                        fo1Var = null;
                    }
                } catch (Throwable th) {
                    fo1Var = new fo1(th);
                }
                if (!(fo1Var instanceof fo1)) {
                    obj = fo1Var;
                }
                L2 = (t7) obj;
                urVar.h0(L2);
            }
            rx.c(hy1.b(b21.a, 1.0f), lp1.a(20.0f), d6.r(((mo) urVar.j(oo.a)).F, 0L, urVar, 14), d6.s(62, 0.0f), go.N(-1108508717, new js0((t7) L2, zm1Var, de0Var2, de0Var, 5), urVar), urVar, 196614, 16);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new hn1(zm1Var, de0Var, de0Var2, i2, 1);
        }
    }

    public static final void i(ur urVar, se0 se0Var, Object obj) {
        xu xuVar = urVar.R;
        boolean f2 = urVar.f(obj);
        Object L2 = urVar.L();
        if (f2 || L2 == or.a) {
            L2 = new eq0(xuVar, se0Var);
            urVar.h0(L2);
        }
    }

    public static final void j(Object obj, Object obj2, se0 se0Var, ur urVar) {
        xu xuVar = urVar.R;
        boolean f2 = urVar.f(obj) | urVar.f(obj2);
        Object L2 = urVar.L();
        if (f2 || L2 == or.a) {
            L2 = new eq0(xuVar, se0Var);
            urVar.h0(L2);
        }
    }

    public static final void k(int i2, ur urVar) {
        boolean z2;
        ur urVar2;
        urVar.Y(-1256078140);
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
            e21 Q2 = fp.Q(urVar, p90Var);
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
            op1.q(urVar, kr.d, Q2);
            urVar2 = urVar;
            pj1.a(null, 0L, 0.0f, 0L, 0, 0.0f, urVar2, 0, 63);
            urVar2.p(true);
        } else {
            urVar2 = urVar;
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new p11(i2, 9);
        }
    }

    public static final void l(final List list, final List list2, final List list3, final String str, final boolean z2, final float f2, final int i2, final int i3, final oe0 oe0Var, final oe0 oe0Var2, final oe0 oe0Var3, final oe0 oe0Var4, final se0 se0Var, e21 e21Var, ur urVar, int i4) {
        e21 e21Var2;
        pe peVar;
        rc1 rc1Var;
        list.getClass();
        list2.getClass();
        list3.getClass();
        oe0Var.getClass();
        oe0Var2.getClass();
        oe0Var3.getClass();
        oe0Var4.getClass();
        se0Var.getClass();
        urVar.Y(1046079451);
        int i5 = i4 | (urVar.h(list) ? 4 : 2) | (urVar.h(list2) ? 32 : 16) | (urVar.h(list3) ? 256 : 128) | (urVar.f(str) ? 2048 : 1024) | (urVar.g(z2) ? 16384 : SharedConstants.DefaultBufferSize) | (urVar.c(f2) ? 131072 : 65536) | (urVar.d(i2) ? 1048576 : 524288) | (urVar.d(i3) ? 8388608 : HiddenAPIs.FLAG_RECEIVER_FROM_SHELL) | (urVar.h(oe0Var) ? FileSystemManager.MODE_TRUNCATE : FileSystemManager.MODE_APPEND) | (urVar.h(oe0Var2) ? FileSystemManager.MODE_WRITE_ONLY : FileSystemManager.MODE_READ_ONLY);
        int i6 = 6 | (urVar.h(oe0Var4) ? ' ' : (char) 16) | (urVar.h(se0Var) ? 256 : 128) | 3072;
        if (urVar.O(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            final h32 c2 = jx0.c(urVar);
            p90 p90Var = hy1.c;
            rc1 rc1Var2 = new rc1(16.0f, 16.0f, 16.0f, 96.0f);
            pe peVar2 = new pe(10.0f, true, new le(0));
            boolean h2 = ((i5 & 1879048192) == 536870912) | urVar.h(list) | urVar.h(c2) | ((i5 & 7168) == 2048) | ((57344 & i5) == 16384) | ((458752 & i5) == 131072) | ((3670016 & i5) == 1048576) | ((29360128 & i5) == 8388608) | ((234881024 & i5) == 67108864) | urVar.h(list2) | ((i6 & 112) == 32) | urVar.h(list3) | urVar.h(se0Var);
            Object L2 = urVar.L();
            if (h2 || L2 == or.a) {
                peVar = peVar2;
                rc1Var = rc1Var2;
                Object obj = new oe0() { // from class: dn1
                    @Override // defpackage.oe0
                    public final Object invoke(Object obj2) {
                        ArrayList arrayList;
                        Iterator t2;
                        int i7;
                        it0 it0Var = (it0) obj2;
                        it0Var.getClass();
                        List list4 = list;
                        boolean isEmpty = list4.isEmpty();
                        h32 h32Var = c2;
                        oe0 oe0Var5 = oe0Var3;
                        int i8 = 1;
                        if (!isEmpty) {
                            it0.c0(it0Var, new fq(2059422987, true, new gh0(h32Var, 13)));
                            it0Var.d0(list4.size(), new ou(7, new v51(13), list4), new jh0(1, list4), new fq(802480018, true, new qn1(list4, str, z2, f2, i2, i3, oe0Var, oe0Var2, oe0Var5)));
                        }
                        List list5 = list2;
                        if (!list5.isEmpty()) {
                            it0.c0(it0Var, new fq(1760527042, true, new gh0(h32Var, 14)));
                            it0Var.d0(list5.size(), new ou(8, new v51(14), list5), new jh0(2, list5), new fq(802480018, true, new pn1(list5, oe0Var5, oe0Var4, i8)));
                        }
                        List list6 = list3;
                        if (!list6.isEmpty()) {
                            it0.c0(it0Var, new fq(-44976253, true, new gh0(h32Var, 15)));
                            fr1.b(2, 2);
                            if (list6 instanceof RandomAccess) {
                                int size = list6.size();
                                int i9 = size / 2;
                                if (size % 2 == 0) {
                                    i7 = 0;
                                } else {
                                    i7 = 1;
                                }
                                arrayList = new ArrayList(i9 + i7);
                                for (int i10 = 0; i10 >= 0 && i10 < size; i10 += 2) {
                                    int i11 = size - i10;
                                    if (2 <= i11) {
                                        i11 = 2;
                                    }
                                    ArrayList arrayList2 = new ArrayList(i11);
                                    for (int i12 = 0; i12 < i11; i12++) {
                                        arrayList2.add(list6.get(i12 + i10));
                                    }
                                    arrayList.add(arrayList2);
                                }
                            } else {
                                arrayList = new ArrayList();
                                Iterator it = list6.iterator();
                                it.getClass();
                                if (!it.hasNext()) {
                                    t2 = k60.e;
                                } else {
                                    t2 = yq1.t(new ez1(it, null));
                                }
                                while (t2.hasNext()) {
                                    arrayList.add((List) t2.next());
                                }
                            }
                            it0Var.d0(arrayList.size(), new ou(6, new v51(16), arrayList), new on1(arrayList, 0), new fq(802480018, true, new pn1(arrayList, se0Var, oe0Var5)));
                        }
                        return od2.a;
                    }
                };
                urVar.h0(obj);
                L2 = obj;
            } else {
                peVar = peVar2;
                rc1Var = rc1Var2;
            }
            io.d(24576, 490, null, null, peVar, urVar, null, (oe0) L2, null, p90Var, rc1Var, false);
            e21Var2 = b21.a;
        } else {
            urVar.R();
            e21Var2 = e21Var;
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new se0(list, list2, list3, str, z2, f2, i2, i3, oe0Var, oe0Var2, oe0Var3, oe0Var4, se0Var, e21Var2, i4) { // from class: en1
                public final /* synthetic */ List e;
                public final /* synthetic */ List f;
                public final /* synthetic */ List g;
                public final /* synthetic */ String h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ float j;
                public final /* synthetic */ int k;
                public final /* synthetic */ int l;
                public final /* synthetic */ oe0 m;
                public final /* synthetic */ oe0 n;
                public final /* synthetic */ oe0 o;
                public final /* synthetic */ oe0 p;
                public final /* synthetic */ se0 q;
                public final /* synthetic */ e21 r;

                @Override // defpackage.se0
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int b02 = lo.b0(1);
                    bf.l(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (ur) obj2, b02);
                    return od2.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x07b2  */
    /* JADX WARN: Type inference failed for: r1v49, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r1v92 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final defpackage.co1 r70, defpackage.ur r71, int r72) {
        /*
            Method dump skipped, instructions count: 2114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bf.m(co1, ur, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.String[]] */
    public static final void n(iz0 iz0Var, iz0 iz0Var2, o41 o41Var, o41 o41Var2, an1 an1Var) {
        Serializable serializable;
        o41Var.setValue(Boolean.FALSE);
        if (an1Var == an1.g) {
            iz0Var.H("*/*");
            return;
        }
        o41Var2.setValue(an1Var);
        if (Build.VERSION.SDK_INT >= 33) {
            serializable = new String[]{"android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_IMAGES"};
        } else {
            serializable = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
        }
        iz0Var2.H(serializable);
    }

    public static final void o(String str, ij0 ij0Var, ur urVar, int i2) {
        int i3;
        int i4;
        boolean z2;
        String str2 = str;
        ur urVar2 = urVar;
        str2.getClass();
        urVar2.Y(-91063306);
        if (urVar2.f(str2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (urVar2.f(ij0Var)) {
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
        if (urVar2.O(i6 & 1, z2)) {
            ji jiVar = g3.p;
            b21 b21Var = b21.a;
            e21 M2 = sn0.M(b21Var, 0.0f, 4.0f, 1);
            up1 a2 = tp1.a(c01.e, jiVar, urVar2, 48);
            int hashCode = Long.hashCode(urVar2.T);
            sf1 l2 = urVar2.l();
            e21 Q2 = fp.Q(urVar2, M2);
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
            op1.q(urVar2, kr.d, Q2);
            y22 y22Var = oo.a;
            ej0.a(ij0Var, str2, hy1.f(b21Var, 22.0f), ((mo) urVar2.j(y22Var)).a, urVar2, ((i6 >> 3) & 14) | 384 | ((i6 << 3) & 112), 0);
            xp1.a(urVar2, hy1.j(b21Var, 10.0f));
            str2 = str;
            t82.b(str2, null, ((mo) urVar2.j(y22Var)).a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92.a(((pc2) urVar2.j(rc2.a)).h, 0L, 0L, sd0.j, null, 0L, 0L, null, 16777211), urVar, i6 & 14, 0, 131066);
            urVar2 = urVar;
            urVar2.p(true);
        } else {
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new in1(str2, ij0Var, i2);
        }
    }

    public static final void p(de0 de0Var, ur urVar) {
        pb1 pb1Var = urVar.M.b.d;
        pb1Var.e0(fb1.c);
        vn.K(pb1Var, 0, de0Var);
    }

    public static final void q(final zm1 zm1Var, final boolean z2, final boolean z3, final float f2, final int i2, final int i3, final de0 de0Var, final oe0 oe0Var, final de0 de0Var2, ur urVar, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z4;
        long j2;
        de0Var.getClass();
        oe0Var.getClass();
        de0Var2.getClass();
        urVar.Y(-2090845012);
        if (urVar.f(zm1Var)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i14 = i4 | i5;
        if (urVar.g(z2)) {
            i6 = 32;
        } else {
            i6 = 16;
        }
        int i15 = i14 | i6;
        if (urVar.g(z3)) {
            i7 = 256;
        } else {
            i7 = 128;
        }
        int i16 = i15 | i7;
        if (urVar.c(f2)) {
            i8 = 2048;
        } else {
            i8 = 1024;
        }
        int i17 = i16 | i8;
        if (urVar.d(i2)) {
            i9 = 16384;
        } else {
            i9 = SharedConstants.DefaultBufferSize;
        }
        int i18 = i17 | i9;
        if (urVar.d(i3)) {
            i10 = 131072;
        } else {
            i10 = 65536;
        }
        int i19 = i18 | i10;
        if (urVar.h(de0Var)) {
            i11 = 1048576;
        } else {
            i11 = 524288;
        }
        int i20 = i19 | i11;
        if (urVar.h(oe0Var)) {
            i12 = 8388608;
        } else {
            i12 = HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
        }
        int i21 = i20 | i12;
        if (urVar.h(de0Var2)) {
            i13 = FileSystemManager.MODE_TRUNCATE;
        } else {
            i13 = FileSystemManager.MODE_APPEND;
        }
        int i22 = i21 | i13;
        if ((38347923 & i22) != 38347922) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (urVar.O(i22 & 1, z4)) {
            e21 b2 = hy1.b(b21.a, 1.0f);
            kp1 a2 = lp1.a(20.0f);
            if (z2) {
                urVar.X(742654140);
                j2 = ((mo) urVar.j(oo.a)).c;
                urVar.p(false);
            } else {
                urVar.X(742656572);
                j2 = ((mo) urVar.j(oo.a)).F;
                urVar.p(false);
            }
            rx.c(b2, a2, d6.r(j2, 0L, urVar, 14), d6.s(62, 0.0f), go.N(-1037381510, new te0() { // from class: jn1
                @Override // defpackage.te0
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z5;
                    boolean z6;
                    long j3;
                    long j4;
                    ur urVar2 = (ur) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((zo) obj).getClass();
                    if ((intValue & 17) != 16) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (urVar2.O(intValue & 1, z5)) {
                        b21 b21Var = b21.a;
                        e21 L2 = sn0.L(b21Var, 12.0f, 10.0f);
                        ne neVar = c01.g;
                        ii iiVar = g3.r;
                        yo a3 = wo.a(neVar, iiVar, urVar2, 0);
                        int hashCode = Long.hashCode(urVar2.T);
                        sf1 l2 = urVar2.l();
                        e21 Q2 = fp.Q(urVar2, L2);
                        lr.b.getClass();
                        hs hsVar = kr.b;
                        urVar2.a0();
                        if (urVar2.S) {
                            urVar2.k(hsVar);
                        } else {
                            urVar2.k0();
                        }
                        gb gbVar = kr.f;
                        op1.q(urVar2, gbVar, a3);
                        gb gbVar2 = kr.e;
                        op1.q(urVar2, gbVar2, l2);
                        Integer valueOf = Integer.valueOf(hashCode);
                        gb gbVar3 = kr.g;
                        op1.l(urVar2, valueOf, gbVar3);
                        i5 i5Var = kr.h;
                        op1.o(urVar2, i5Var);
                        gb gbVar4 = kr.d;
                        op1.q(urVar2, gbVar4, Q2);
                        e21 b3 = hy1.b(b21Var, 1.0f);
                        up1 a4 = tp1.a(c01.e, g3.p, urVar2, 48);
                        int hashCode2 = Long.hashCode(urVar2.T);
                        sf1 l3 = urVar2.l();
                        e21 Q3 = fp.Q(urVar2, b3);
                        urVar2.a0();
                        if (urVar2.S) {
                            urVar2.k(hsVar);
                        } else {
                            urVar2.k0();
                        }
                        op1.q(urVar2, gbVar, a4);
                        op1.q(urVar2, gbVar2, l3);
                        l90.t(hashCode2, urVar2, gbVar3, urVar2, i5Var);
                        op1.q(urVar2, gbVar4, Q3);
                        sn0.e(1572912, go.N(1416435776, new eu(z3, jx0.c(urVar2)), urVar2), urVar2, de0Var, null, hy1.f(b21Var, 44.0f), null, false);
                        xp1.a(urVar2, hy1.j(b21Var, 12.0f));
                        pr0 pr0Var = new pr0(1.0f, true);
                        yo a5 = wo.a(neVar, iiVar, urVar2, 0);
                        int hashCode3 = Long.hashCode(urVar2.T);
                        sf1 l4 = urVar2.l();
                        e21 Q4 = fp.Q(urVar2, pr0Var);
                        urVar2.a0();
                        if (urVar2.S) {
                            urVar2.k(hsVar);
                        } else {
                            urVar2.k0();
                        }
                        op1.q(urVar2, gbVar, a5);
                        op1.q(urVar2, gbVar2, l4);
                        l90.t(hashCode3, urVar2, gbVar3, urVar2, i5Var);
                        op1.q(urVar2, gbVar4, Q4);
                        zm1 zm1Var2 = zm1Var;
                        String str = zm1Var2.a;
                        y22 y22Var = rc2.a;
                        k92 a6 = k92.a(((pc2) urVar2.j(y22Var)).j, 0L, 0L, sd0.h, null, 0L, 0L, null, 16777211);
                        boolean z7 = z2;
                        if (z7) {
                            urVar2.X(-57048260);
                            j3 = ((mo) urVar2.j(oo.a)).d;
                            z6 = false;
                            urVar2.p(false);
                        } else {
                            z6 = false;
                            urVar2.X(-57045005);
                            j3 = ((mo) urVar2.j(oo.a)).q;
                            urVar2.p(false);
                        }
                        t82.b(str, null, j3, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, a6, urVar2, 0, 24576, 114682);
                        String T2 = bf.T(zm1Var2.d);
                        k92 k92Var = ((pc2) urVar2.j(y22Var)).l;
                        if (z7) {
                            urVar2.X(-57033924);
                            j4 = co.b(((mo) urVar2.j(oo.a)).d, 0.7f);
                            urVar2.p(false);
                        } else {
                            urVar2.X(-57030662);
                            j4 = ((mo) urVar2.j(oo.a)).s;
                            urVar2.p(false);
                        }
                        t82.b(T2, null, j4, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92Var, urVar2, 0, 0, 131066);
                        urVar2.p(true);
                        sn0.f(de0Var2, null, false, null, null, go.N(-1429387006, new nd(jx0.c(urVar2).b(), 6), urVar2), urVar2, 1572864, 62);
                        urVar2.p(true);
                        final float f3 = f2;
                        final oe0 oe0Var2 = oe0Var;
                        final int i23 = i2;
                        final int i24 = i3;
                        d6.b(z7, null, null, null, null, go.N(-1366944148, new te0() { // from class: mn1
                            @Override // defpackage.te0
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                long j5;
                                long j6;
                                long j7;
                                long j8;
                                long j9;
                                long j10;
                                long j11;
                                ur urVar3 = (ur) obj5;
                                ((Integer) obj6).getClass();
                                ((zb) obj4).getClass();
                                b21 b21Var2 = b21.a;
                                e21 O2 = sn0.O(b21Var2, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                                yo a7 = wo.a(c01.g, g3.r, urVar3, 0);
                                int hashCode4 = Long.hashCode(urVar3.T);
                                sf1 l5 = urVar3.l();
                                e21 Q5 = fp.Q(urVar3, O2);
                                lr.b.getClass();
                                hs hsVar2 = kr.b;
                                urVar3.a0();
                                if (urVar3.S) {
                                    urVar3.k(hsVar2);
                                } else {
                                    urVar3.k0();
                                }
                                gb gbVar5 = kr.f;
                                op1.q(urVar3, gbVar5, a7);
                                gb gbVar6 = kr.e;
                                op1.q(urVar3, gbVar6, l5);
                                Integer valueOf2 = Integer.valueOf(hashCode4);
                                gb gbVar7 = kr.g;
                                op1.l(urVar3, valueOf2, gbVar7);
                                i5 i5Var2 = kr.h;
                                op1.o(urVar3, i5Var2);
                                gb gbVar8 = kr.d;
                                op1.q(urVar3, gbVar8, Q5);
                                e21 b4 = hy1.b(b21Var2, 1.0f);
                                ry1 ry1Var = ry1.a;
                                y22 y22Var2 = oo.a;
                                long j12 = ((mo) urVar3.j(y22Var2)).a;
                                long j13 = ((mo) urVar3.j(y22Var2)).a;
                                long b5 = co.b(((mo) urVar3.j(y22Var2)).d, 0.2f);
                                long j14 = co.g;
                                my1 e2 = ry1.e((mo) urVar3.j(y22Var2));
                                if (j12 == 16) {
                                    j12 = e2.a;
                                }
                                long j15 = j12;
                                if (j13 == 16) {
                                    j13 = e2.b;
                                }
                                long j16 = j13;
                                if (j14 != 16) {
                                    j5 = j14;
                                } else {
                                    j5 = e2.c;
                                }
                                if (b5 == 16) {
                                    b5 = e2.d;
                                }
                                long j17 = b5;
                                if (j14 != 16) {
                                    j6 = j14;
                                } else {
                                    j6 = e2.e;
                                }
                                if (j14 != 16) {
                                    j7 = j14;
                                } else {
                                    j7 = e2.f;
                                }
                                if (j14 != 16) {
                                    j8 = j14;
                                } else {
                                    j8 = e2.g;
                                }
                                if (j14 != 16) {
                                    j9 = j14;
                                } else {
                                    j9 = e2.h;
                                }
                                if (j14 != 16) {
                                    j10 = j14;
                                } else {
                                    j10 = e2.i;
                                }
                                if (j14 != 16) {
                                    j11 = j14;
                                } else {
                                    j11 = e2.j;
                                }
                                bz1.a(f3, oe0Var2, b4, false, null, new my1(j15, j16, j5, j17, j6, j7, j8, j9, j10, j11), null, urVar3, 384);
                                e21 M2 = sn0.M(hy1.b(b21Var2, 1.0f), 4.0f, 0.0f, 2);
                                up1 a8 = tp1.a(c01.i, g3.o, urVar3, 6);
                                int hashCode5 = Long.hashCode(urVar3.T);
                                sf1 l6 = urVar3.l();
                                e21 Q6 = fp.Q(urVar3, M2);
                                urVar3.a0();
                                if (urVar3.S) {
                                    urVar3.k(hsVar2);
                                } else {
                                    urVar3.k0();
                                }
                                op1.q(urVar3, gbVar5, a8);
                                op1.q(urVar3, gbVar6, l6);
                                op1.l(urVar3, Integer.valueOf(hashCode5), gbVar7);
                                op1.o(urVar3, i5Var2);
                                op1.q(urVar3, gbVar8, Q6);
                                String S2 = bf.S(i23);
                                y22 y22Var3 = rc2.a;
                                t82.b(S2, null, co.b(((mo) urVar3.j(y22Var2)).d, 0.7f), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar3.j(y22Var3)).o, urVar3, 0, 0, 131066);
                                t82.b(bf.S(i24), null, co.b(((mo) urVar3.j(y22Var2)).d, 0.7f), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar3.j(y22Var3)).o, urVar3, 0, 0, 131066);
                                urVar3.p(true);
                                urVar3.p(true);
                                return od2.a;
                            }
                        }, urVar2), urVar2, 1572870, 30);
                        urVar2.p(true);
                    } else {
                        urVar2.R();
                    }
                    return od2.a;
                }
            }, urVar), urVar, 196614, 16);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new se0(z2, z3, f2, i2, i3, de0Var, oe0Var, de0Var2, i4) { // from class: kn1
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ float h;
                public final /* synthetic */ int i;
                public final /* synthetic */ int j;
                public final /* synthetic */ de0 k;
                public final /* synthetic */ oe0 l;
                public final /* synthetic */ de0 m;

                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int b02 = lo.b0(1);
                    bf.q(zm1.this, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (ur) obj, b02);
                    return od2.a;
                }
            };
        }
    }

    public static final void r(String str, ij0 ij0Var, de0 de0Var, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        str.getClass();
        de0Var.getClass();
        urVar.Y(604543114);
        int i6 = 4;
        if (urVar.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (urVar.f(ij0Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (urVar.h(de0Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if ((i9 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i9 & 1, z2)) {
            up1 a2 = tp1.a(new pe(12.0f, true, new le(0)), g3.p, urVar, 54);
            int hashCode = Long.hashCode(urVar.T);
            sf1 l2 = urVar.l();
            e21 Q2 = fp.Q(urVar, b21.a);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, kr.f, a2);
            op1.q(urVar, kr.e, l2);
            op1.l(urVar, Integer.valueOf(hashCode), kr.g);
            op1.o(urVar, kr.h);
            op1.q(urVar, kr.d, Q2);
            kp1 a3 = lp1.a(8.0f);
            y22 y22Var = oo.a;
            l42.a(null, a3, ((mo) urVar.j(y22Var)).G, 0L, 0.0f, 2.0f, go.N(1196010411, new nd(str, i6), urVar), urVar, 12779520, 89);
            io.j(de0Var, null, null, ((mo) urVar.j(y22Var)).h, ((mo) urVar.j(y22Var)).i, null, go.N(-1435409725, new in1(ij0Var, str), urVar), urVar, ((i9 >> 6) & 14) | 12582912);
            urVar.p(true);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new l1(str, ij0Var, de0Var, i2, 10);
        }
    }

    public static final void s(e21 e21Var, se0 se0Var, ur urVar, int i2) {
        int i3;
        boolean z2;
        urVar.Y(-1298353104);
        int i4 = i2 | 6;
        if (urVar.h(se0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i5 & 1, z2)) {
            Object L2 = urVar.L();
            if (L2 == or.a) {
                L2 = new b42(g3.T);
                urVar.h0(L2);
            }
            b21 b21Var = b21.a;
            t((b42) L2, b21Var, se0Var, urVar, (i5 << 3) & 1008);
            e21Var = b21Var;
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new g6(e21Var, se0Var, i2, 4);
        }
    }

    public static final void t(b42 b42Var, e21 e21Var, se0 se0Var, ur urVar, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        urVar.Y(-511989831);
        if ((i2 & 6) == 0) {
            if (urVar.h(b42Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (urVar.f(e21Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (urVar.h(se0Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i3 & 1, z2)) {
            int hashCode = Long.hashCode(urVar.T);
            sr J2 = io.J(urVar);
            e21 Q2 = fp.Q(urVar, e21Var);
            sf1 l2 = urVar.l();
            hs hsVar = hs.m;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, b42Var.c, b42Var);
            op1.q(urVar, b42Var.d, J2);
            op1.q(urVar, b42Var.e, se0Var);
            lr.b.getClass();
            op1.q(urVar, kr.e, l2);
            op1.o(urVar, kr.h);
            op1.q(urVar, kr.d, Q2);
            op1.l(urVar, Integer.valueOf(hashCode), kr.g);
            urVar.p(true);
            if (!urVar.A()) {
                urVar.X(-1259244916);
                boolean h2 = urVar.h(b42Var);
                Object L2 = urVar.L();
                if (h2 || L2 == or.a) {
                    L2 = new s8(b42Var, 12);
                    urVar.h0(L2);
                }
                p((de0) L2, urVar);
            } else {
                urVar.X(-1266202711);
            }
            urVar.p(false);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new x32(b42Var, e21Var, se0Var, i2);
        }
    }

    public static final void u(e21 e21Var, se0 se0Var, ur urVar, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        urVar.Y(1090521195);
        if ((i2 & 6) == 0) {
            if (urVar.f(e21Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (urVar.h(se0Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i3 & 1, z2)) {
            Object L2 = urVar.L();
            if (L2 == or.a) {
                L2 = b7.b;
                urVar.h0(L2);
            }
            j01 j01Var = (j01) L2;
            int hashCode = Long.hashCode(urVar.T);
            sf1 l2 = urVar.l();
            e21 Q2 = fp.Q(urVar, e21Var);
            lr.b.getClass();
            hs hsVar = kr.b;
            int i6 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, kr.f, j01Var);
            op1.q(urVar, kr.e, l2);
            op1.l(urVar, Integer.valueOf(hashCode), kr.g);
            op1.o(urVar, kr.h);
            op1.q(urVar, kr.d, Q2);
            se0Var.invoke(urVar, Integer.valueOf((i6 >> 6) & 14));
            urVar.p(true);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new c7(e21Var, se0Var, i2);
        }
    }

    public static final Bundle v(xd1... xd1VarArr) {
        Bundle bundle = new Bundle(xd1VarArr.length);
        for (xd1 xd1Var : xd1VarArr) {
            String str = (String) xd1Var.e;
            Object obj = xd1Var.f;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) obj);
                } else {
                    se.j("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, 34);
                    return null;
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else if (obj instanceof SizeF) {
                bundle.putSizeF(str, (SizeF) obj);
            } else {
                se.j("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, 34);
                return null;
            }
        }
        return bundle;
    }

    public static void w(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            se.h(l90.j("fromIndex: ", i2, " > toIndex: ", i3));
            return;
        }
        y61.k("fromIndex: ", i2, i3, i4, ", toIndex: ");
    }

    public static String x(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (!str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return null;
                }
                return "kotlin.Double.Companion";
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static boolean y(int[] iArr, int i2) {
        iArr.getClass();
        int length = iArr.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                if (i2 == iArr[i3]) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 < 0) {
            return false;
        }
        return true;
    }

    public static void z(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        bArr.getClass();
        bArr2.getClass();
        System.arraycopy(bArr, i3, bArr2, i2, i4 - i3);
    }
}
