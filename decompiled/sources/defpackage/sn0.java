package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.View;
import com.topjohnwu.superuser.internal.HiddenAPIs;
import java.util.Arrays;
import java.util.List;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class sn0 {
    public static final float A;
    public static final mw1 B;
    public static final no C;
    public static final mw1 D;
    public static final float E;
    public static final no F;
    public static final no G;
    public static final no H;
    public static final v51 I;
    public static final lq J;
    public static final to1 K;
    public static final mw1 L;
    public static final float M;
    public static final float N;
    public static final StackTraceElement[] O;
    public static final u8 P;
    public static ij0 Q;
    public static final vt[] a = new vt[0];
    public static final float[] b = new float[91];
    public static final float[][] c = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] d = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] e = {95.047f, 100.0f, 108.883f};
    public static final float[][] f = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final fq g = new fq(636288403, false, new lq(0));
    public static final fq h = new fq(-1357803046, false, new lq(1));
    public static final fq i = new fq(-1548712596, false, new o1(7));
    public static final no j = no.q;
    public static final qc2 k = qc2.i;
    public static final no l = no.x;
    public static final mw1 m = mw1.e;
    public static final no n = no.l;
    public static final qc2 o = qc2.h;
    public static final no p;
    public static final qc2 q;
    public static final no r;
    public static final oj0 s;
    public static final no t;
    public static final no u;
    public static final float v;
    public static final float w;
    public static final float x;
    public static final no y;
    public static final no z;

    /* JADX WARN: Type inference failed for: r1v19, types: [to1, java.lang.Object] */
    static {
        no noVar = no.m;
        p = noVar;
        q = qc2.f;
        r = no.t;
        s = new oj0(false);
        t = no.y;
        u = no.A;
        v = 0.38f;
        w = 6.0f;
        x = 1.0f;
        no noVar2 = no.k;
        y = noVar2;
        z = no.u;
        A = 56.0f;
        mw1 mw1Var = mw1.h;
        B = mw1Var;
        C = noVar2;
        D = mw1.j;
        E = 360.0f;
        F = noVar;
        G = noVar;
        H = no.z;
        I = new v51(8);
        J = new lq(2);
        K = new Object();
        L = mw1Var;
        M = 8.0f;
        N = 24.0f;
        O = new StackTraceElement[0];
        P = new u8(1022);
    }

    public static final e21 A(e21 e21Var) {
        return d6.z(e21Var, 0.0f, 0.0f, null, 520191);
    }

    public static int B(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        if (i2 == i3) {
            return 0;
        }
        return 1;
    }

    public static int C(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        if (j2 == j3) {
            return 0;
        }
        return 1;
    }

    public static final e21 D(e21 e21Var, v90 v90Var) {
        return e21Var.d(new md2(v90Var));
    }

    public static final Object E(e01 e01Var) {
        nq0 nq0Var;
        Object C2 = e01Var.C();
        if (C2 instanceof nq0) {
            nq0Var = (nq0) C2;
        } else {
            nq0Var = null;
        }
        if (nq0Var == null) {
            return null;
        }
        return nq0Var.s;
    }

    public static int F(float f2) {
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
        float[] fArr = e;
        return vo.a(f4 * fArr[0], f3 * fArr[1], f6 * fArr[2]);
    }

    public static final e21 G(e21 e21Var, Object obj) {
        return e21Var.d(new mq0(obj));
    }

    public static float H(int i2) {
        float pow;
        float f2 = i2 / 255.0f;
        if (f2 <= 0.04045f) {
            pow = f2 / 12.92f;
        } else {
            pow = (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static final e21 I(e21 e21Var, oe0 oe0Var) {
        return e21Var.d(new ws(oe0Var));
    }

    public static final e21 J(e21 e21Var, pc1 pc1Var) {
        return e21Var.d(new qc1(pc1Var));
    }

    public static final e21 K(e21 e21Var, float f2) {
        return e21Var.d(new nc1(f2, f2, f2, f2));
    }

    public static final e21 L(e21 e21Var, float f2, float f3) {
        return e21Var.d(new nc1(f2, f3, f2, f3));
    }

    public static e21 M(e21 e21Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return L(e21Var, f2, f3);
    }

    public static final e21 N(e21 e21Var, float f2, float f3, float f4, float f5) {
        return e21Var.d(new nc1(f2, f3, f4, f5));
    }

    public static e21 O(e21 e21Var, float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return N(e21Var, f2, f3, f4, f5);
    }

    public static void R() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void S(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.equals(stackTrace[i3].getClassName())) {
                i2 = i3;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, wl1] */
    public static final Object T(tc0 tc0Var, int i2, oe0 oe0Var) {
        int i3;
        int i4;
        Object obj;
        d21 d21Var;
        yr0 P0;
        int e2;
        a81 a81Var;
        if (!tc0Var.e.r) {
            kl0.b("visitAncestors called on an unattached node");
        }
        d21 d21Var2 = tc0Var.e.i;
        ar0 M2 = hp.M(tc0Var);
        loop0: while (true) {
            i3 = 0;
            i4 = 1;
            obj = null;
            if (M2 != null) {
                if ((M2.J.f.h & 1024) != 0) {
                    while (d21Var2 != null) {
                        if ((d21Var2.g & 1024) != 0) {
                            d21Var = d21Var2;
                            q41 q41Var = null;
                            while (d21Var != null) {
                                if (d21Var instanceof tc0) {
                                    break loop0;
                                }
                                if ((d21Var.g & 1024) != 0 && (d21Var instanceof rz)) {
                                    int i5 = 0;
                                    for (d21 d21Var3 = ((rz) d21Var).t; d21Var3 != null; d21Var3 = d21Var3.j) {
                                        if ((d21Var3.g & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                d21Var = d21Var3;
                                            } else {
                                                if (q41Var == null) {
                                                    q41Var = new q41(new d21[16]);
                                                }
                                                if (d21Var != null) {
                                                    q41Var.b(d21Var);
                                                    d21Var = null;
                                                }
                                                q41Var.b(d21Var3);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                d21Var = hp.l(q41Var);
                            }
                        }
                        d21Var2 = d21Var2.i;
                    }
                }
                M2 = M2.v();
                if (M2 != null && (a81Var = M2.J) != null) {
                    d21Var2 = a81Var.e;
                } else {
                    d21Var2 = null;
                }
            } else {
                d21Var = null;
                break;
            }
        }
        tc0 tc0Var2 = (tc0) d21Var;
        if ((tc0Var2 == null || !r(tc0Var2.P0(), tc0Var.P0())) && (P0 = tc0Var.P0()) != null) {
            int i6 = 5;
            if (i2 != 5) {
                i6 = 6;
                if (i2 != 6) {
                    i6 = 3;
                    if (i2 != 3) {
                        i6 = 4;
                        if (i2 != 4) {
                            if (i2 == 1) {
                                i4 = 2;
                            } else if (i2 != 2) {
                                se.p("Unsupported direction for beyond bounds layout");
                            }
                            if (P0.s.a() <= 0 && P0.s.d() && P0.r) {
                                boolean M0 = P0.M0(i4);
                                zr0 zr0Var = P0.s;
                                if (M0) {
                                    e2 = zr0Var.b();
                                } else {
                                    e2 = zr0Var.e();
                                }
                                ?? obj2 = new Object();
                                nj njVar = P0.t;
                                njVar.getClass();
                                ur0 ur0Var = new ur0(e2, e2);
                                njVar.a.b(ur0Var);
                                obj2.e = ur0Var;
                                int c2 = P0.s.c() * 2;
                                int a2 = P0.s.a();
                                if (c2 > a2) {
                                    c2 = a2;
                                }
                                while (obj == null && P0.L0((ur0) obj2.e, i4) && i3 < c2) {
                                    ur0 ur0Var2 = (ur0) obj2.e;
                                    int i7 = ur0Var2.a;
                                    int i8 = ur0Var2.b;
                                    if (P0.M0(i4)) {
                                        i8++;
                                    } else {
                                        i7--;
                                    }
                                    nj njVar2 = P0.t;
                                    njVar2.getClass();
                                    ur0 ur0Var3 = new ur0(i7, i8);
                                    njVar2.a.b(ur0Var3);
                                    P0.t.a.j((ur0) obj2.e);
                                    obj2.e = ur0Var3;
                                    i3++;
                                    hp.M(P0).k();
                                    obj = oe0Var.invoke(new xr0(P0, obj2, i4));
                                }
                                P0.t.a.j((ur0) obj2.e);
                                hp.M(P0).k();
                                return obj;
                            }
                            return oe0Var.invoke(yr0.v);
                        }
                    }
                }
            }
            i4 = i6;
            if (P0.s.a() <= 0) {
            }
            return oe0Var.invoke(yr0.v);
        }
        return null;
    }

    public static e21 U(e21 e21Var, boolean z2, r31 r31Var, zo1 zo1Var, de0 de0Var) {
        e21 t2;
        if (zo1Var != null) {
            t2 = new rt1(z2, r31Var, zo1Var, de0Var);
        } else if (zo1Var == null) {
            t2 = new rt1(z2, r31Var, null, de0Var);
        } else {
            b21 b21Var = b21.a;
            if (r31Var != null) {
                t2 = ak0.a(b21Var, r31Var, zo1Var).d(new rt1(z2, r31Var, null, de0Var));
            } else {
                t2 = fp.t(b21Var, new st1(zo1Var, z2, de0Var));
            }
        }
        return e21Var.d(t2);
    }

    public static void V(String str) {
        RuntimeException runtimeException = new RuntimeException(l90.m("lateinit property ", str, " has not been initialized"));
        S(runtimeException, sn0.class.getName());
        throw runtimeException;
    }

    public static final Bitmap.Config W(int i2) {
        if (i2 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i2 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i2 == 2) {
            return Bitmap.Config.RGB_565;
        }
        if (i2 == 3) {
            return Bitmap.Config.RGBA_F16;
        }
        if (i2 == 4) {
            return Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static final e21 X(e21 e21Var, th2 th2Var) {
        return e21Var.d(new dm0(th2Var));
    }

    public static float Y() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final void a(de0 de0Var, zk zkVar, e21 e21Var, boolean z2, rk rkVar, wk wkVar, rc1 rc1Var, fq fqVar, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z3;
        e21 e21Var2;
        rk rkVar2;
        wk wkVar2;
        int i6;
        rk c2;
        wk b2;
        long j2;
        long j3;
        hc a2;
        float f2;
        kw1 kw1Var;
        boolean z4;
        kw1 kw1Var2 = zkVar.a;
        kw1 kw1Var3 = zkVar.b;
        urVar.Y(-311513973);
        if (urVar.h(de0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (urVar.f(zkVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (urVar.g(z2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5 | 102309888;
        int i10 = 1;
        if ((306783379 & i9) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (urVar.O(i9 & 1, z3)) {
            urVar.T();
            if ((i2 & 1) != 0 && !urVar.y()) {
                urVar.R();
                b2 = wkVar;
                i6 = i9 & (-516097);
                c2 = rkVar;
            } else {
                rc1 rc1Var2 = sk.a;
                i6 = i9 & (-516097);
                c2 = sk.c((mo) urVar.j(oo.a));
                b2 = sk.b(31);
            }
            urVar.q();
            urVar.X(1112124656);
            Object L2 = urVar.L();
            Object obj = or.a;
            if (L2 == obj) {
                L2 = new r31();
                urVar.h0(L2);
            }
            r31 r31Var = (r31) L2;
            urVar.p(false);
            u90 a0 = fp.a0(u21.g, urVar);
            Object L3 = urVar.L();
            if (L3 == obj) {
                L3 = fr1.k(Boolean.FALSE);
                urVar.h0(L3);
            }
            o41 o41Var = (o41) L3;
            boolean f3 = urVar.f(r31Var);
            Object L4 = urVar.L();
            vt vtVar = null;
            if (f3 || L4 == obj) {
                L4 = new fc0(r31Var, o41Var, vtVar, i10);
                urVar.h0(L4);
            }
            bf.i(urVar, (se0) L4, r31Var);
            if (z2) {
                j2 = c2.a;
            } else {
                j2 = c2.c;
            }
            int i11 = i6;
            if (z2) {
                j3 = c2.b;
            } else {
                j3 = c2.d;
            }
            if (b2 == null) {
                urVar.X(1112635659);
                urVar.p(false);
                a2 = null;
            } else {
                urVar.X(1282817462);
                a2 = b2.a(z2, r31Var, urVar, (i11 >> 9) & 910);
                urVar.p(false);
            }
            if (a2 != null) {
                f2 = ((f20) a2.f.getValue()).e;
            } else {
                f2 = 0.0f;
            }
            boolean booleanValue = ((Boolean) o41Var.getValue()).booleanValue();
            int i12 = i11 >> 3;
            float f4 = f2;
            urVar.X(802092292);
            if (booleanValue) {
                kw1Var = kw1Var3;
            } else {
                kw1Var = kw1Var2;
            }
            if ((kw1Var2 instanceof kp1) && (kw1Var3 instanceof kp1)) {
                urVar.X(-2066262650);
                urVar.V(2011556565, zkVar);
                kw1Var.getClass();
                kp1 kp1Var = (kp1) kw1Var;
                boolean f5 = urVar.f(a0);
                Object L5 = urVar.L();
                if (f5 || L5 == obj) {
                    L5 = new ub(kp1Var, a0);
                    urVar.h0(L5);
                }
                ub ubVar = (ub) L5;
                Object L6 = urVar.L();
                if (L6 == obj) {
                    L6 = c(-1, 6, null);
                    urVar.h0(L6);
                }
                Object obj2 = (dm) L6;
                boolean h2 = urVar.h(obj2) | urVar.f(kp1Var);
                Object L7 = urVar.L();
                if (h2 || L7 == obj) {
                    L7 = new j1(3, obj2, kp1Var);
                    urVar.h0(L7);
                }
                bf.p((de0) L7, urVar);
                boolean h3 = urVar.h(obj2) | urVar.f(ubVar);
                Object L8 = urVar.L();
                if (h3 || L8 == obj) {
                    L8 = new a8(obj2, ubVar, (vt) null, 2);
                    urVar.h0(L8);
                }
                bf.j(ubVar, obj2, (se0) L8, urVar);
                c00 c00Var = (c00) urVar.j(is.h);
                ubVar.d = c00Var;
                boolean f6 = urVar.f(c00Var) | urVar.f(ubVar);
                Object L9 = urVar.L();
                if (f6 || L9 == obj) {
                    L9 = new rb(ubVar);
                    urVar.h0(L9);
                }
                kw1Var = (rb) L9;
                z4 = false;
                urVar.p(false);
            } else {
                z4 = false;
                urVar.X(2142680638);
            }
            urVar.p(z4);
            urVar.p(z4);
            Object L10 = urVar.L();
            if (L10 == obj) {
                L10 = new p1(17);
                urVar.h0(L10);
            }
            e21Var2 = e21Var;
            rk rkVar3 = c2;
            kw1 kw1Var4 = kw1Var;
            l42.b(de0Var, ou1.a(e21Var2, z4, (oe0) L10), z2, kw1Var4, j2, j3, 0.0f, f4, null, r31Var, go.N(1669820704, new t6(j3, rc1Var, fqVar, 1), urVar), urVar, (i11 & 14) | (i12 & 896) | 100663296, 64);
            rkVar2 = rkVar3;
            wkVar2 = b2;
        } else {
            e21Var2 = e21Var;
            urVar.R();
            rkVar2 = rkVar;
            wkVar2 = wkVar;
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new yk(de0Var, zkVar, e21Var2, z2, rkVar2, wkVar2, rc1Var, fqVar, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.de0 r22, defpackage.e21 r23, boolean r24, defpackage.kw1 r25, defpackage.rk r26, defpackage.wk r27, defpackage.zi r28, defpackage.pc1 r29, defpackage.fq r30, defpackage.ur r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn0.b(de0, e21, boolean, kw1, rk, wk, zi, pc1, fq, ur, int, int):void");
    }

    public static lk c(int i2, int i3, jk jkVar) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        int i4 = i3 & 2;
        jk jkVar2 = jk.e;
        if (i4 != 0) {
            jkVar = jkVar2;
        }
        if (i2 != -2) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != Integer.MAX_VALUE) {
                        if (jkVar == jkVar2) {
                            return new lk(i2);
                        }
                        return new os(i2, jkVar);
                    }
                    return new lk(Integer.MAX_VALUE);
                }
                if (jkVar == jkVar2) {
                    return new lk(0);
                }
                return new os(1, jkVar);
            }
            if (jkVar == jkVar2) {
                return new os(1, jk.f);
            }
            se.h("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (jkVar == jkVar2) {
            dm.a.getClass();
            return new lk(cm.b);
        }
        return new os(1, jkVar);
    }

    public static final void d(e21 e21Var, long j2, long j3, kw1 kw1Var, List list, ur urVar, int i2) {
        boolean z2;
        e21 e21Var2;
        long j4;
        long j5;
        kw1 kw1Var2;
        List list2;
        e21 e21Var3;
        long j6;
        kw1 kw1Var3;
        List list3;
        urVar.Y(663218740);
        int i3 = i2 | 9366;
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i3 & 1, z2)) {
            urVar.T();
            if ((i2 & 1) != 0 && !urVar.y()) {
                urVar.R();
                e21Var3 = e21Var;
                j6 = j3;
                kw1Var3 = kw1Var;
                list3 = list;
            } else {
                float f2 = qw0.a;
                j2 = oo.e(mp0.G, urVar);
                long e2 = oo.e(mp0.F, urVar);
                kw1 b2 = pw1.b(mp0.I, urVar);
                List list4 = qw0.c;
                e21Var3 = b21.a;
                j6 = e2;
                kw1Var3 = b2;
                list3 = list4;
            }
            long j7 = j2;
            urVar.q();
            i(e21Var3, j7, j6, kw1Var3, list3, urVar, 6);
            list2 = list3;
            kw1Var2 = kw1Var3;
            j5 = j6;
            j4 = j7;
            e21Var2 = e21Var3;
        } else {
            urVar.R();
            e21Var2 = e21Var;
            j4 = j2;
            j5 = j3;
            kw1Var2 = kw1Var;
            list2 = list;
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new tw0(e21Var2, j4, j5, kw1Var2, list2, i2);
        }
    }

    public static final void e(final int i2, final fq fqVar, ur urVar, final de0 de0Var, yi0 yi0Var, final e21 e21Var, kw1 kw1Var, boolean z2) {
        int i3;
        boolean z3;
        final yi0 yi0Var2;
        final kw1 kw1Var2;
        final boolean z4;
        int i4;
        boolean z5;
        yi0 yi0Var3;
        kw1 kw1Var3;
        urVar.Y(947208840);
        if (urVar.h(de0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3 | 206208;
        if ((599187 & i5) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (urVar.O(i5 & 1, z3)) {
            urVar.T();
            if ((i2 & 1) != 0 && !urVar.y()) {
                urVar.R();
                i4 = i5 & (-64513);
                yi0Var3 = yi0Var;
                kw1Var3 = kw1Var;
                z5 = z2;
            } else {
                kw1 b2 = pw1.b(L, urVar);
                mo moVar = (mo) urVar.j(oo.a);
                yi0 yi0Var4 = moVar.c0;
                if (yi0Var4 == null) {
                    yi0 yi0Var5 = new yi0(oo.d(moVar, mp0.s), oo.d(moVar, mp0.x), co.b(oo.d(moVar, mp0.t), mp0.u), co.b(oo.d(moVar, mp0.v), mp0.w));
                    moVar.c0 = yi0Var5;
                    yi0Var4 = yi0Var5;
                }
                i4 = i5 & (-64513);
                z5 = true;
                yi0Var3 = yi0Var4;
                kw1Var3 = b2;
            }
            urVar.q();
            n((i4 & 14) | 14352816, fqVar, urVar, de0Var, yi0Var3, e21Var, kw1Var3, z5);
            yi0Var2 = yi0Var3;
            kw1Var2 = kw1Var3;
            z4 = z5;
        } else {
            urVar.R();
            yi0Var2 = yi0Var;
            kw1Var2 = kw1Var;
            z4 = z2;
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new se0(e21Var, z4, kw1Var2, yi0Var2, fqVar, i2) { // from class: aj0
                public final /* synthetic */ e21 f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ kw1 h;
                public final /* synthetic */ yi0 i;
                public final /* synthetic */ fq j;

                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sn0.e(lo.b0(1572913), this.j, (ur) obj, de0.this, this.i, this.f, this.h, this.g);
                    return od2.a;
                }
            };
        }
    }

    public static final void f(de0 de0Var, e21 e21Var, boolean z2, yi0 yi0Var, kw1 kw1Var, fq fqVar, ur urVar, int i2, int i3) {
        int i4;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        e21 e21Var2;
        yi0 yi0Var2;
        kw1 kw1Var2;
        boolean z5;
        boolean z6;
        int i7;
        yi0 yi0Var3;
        int i8;
        boolean z7;
        e21 e21Var3;
        yi0 yi0Var4;
        urVar.Y(1413012038);
        if (urVar.h(de0Var)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i9 = i2 | i4;
        int i10 = i9 | 48;
        int i11 = i3 & 4;
        if (i11 != 0) {
            i6 = i9 | 432;
            z3 = z2;
        } else {
            z3 = z2;
            if (urVar.g(z3)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i6 = i10 | i5;
        }
        int i12 = i6 | 91136;
        boolean z8 = true;
        if ((599187 & i12) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (urVar.O(i12 & 1, z4)) {
            urVar.T();
            if ((i2 & 1) != 0 && !urVar.y()) {
                urVar.R();
                i8 = i12 & (-465921);
                e21Var3 = e21Var;
                yi0Var4 = yi0Var;
                kw1Var2 = kw1Var;
                z7 = z3;
            } else {
                if (i11 == 0) {
                    z8 = z3;
                }
                long j2 = ((co) urVar.j(et.a)).a;
                mo moVar = (mo) urVar.j(oo.a);
                yi0 yi0Var5 = moVar.b0;
                if (yi0Var5 == null) {
                    long j3 = co.f;
                    yi0 yi0Var6 = new yi0(j3, j2, j3, co.b(j2, 0.38f));
                    moVar.b0 = yi0Var6;
                    yi0Var5 = yi0Var6;
                }
                long j4 = yi0Var5.b;
                if (co.c(j4, j2)) {
                    yi0Var3 = yi0Var5;
                    i7 = -465921;
                    z6 = z8;
                } else {
                    long b2 = co.b(j2, 0.38f);
                    z6 = z8;
                    long j5 = yi0Var5.a;
                    i7 = -465921;
                    long j6 = yi0Var5.c;
                    if (j2 == 16) {
                        j2 = j4;
                    }
                    if (b2 == 16) {
                        b2 = yi0Var5.d;
                    }
                    yi0Var3 = new yi0(j5, j2, j6, b2);
                }
                i8 = i12 & i7;
                z7 = z6;
                kw1Var2 = pw1.b(L, urVar);
                e21Var3 = b21.a;
                yi0Var4 = yi0Var3;
            }
            urVar.q();
            g(((i8 << 3) & 112) | 6 | (i8 & 896) | 1769472, fqVar, urVar, de0Var, yi0Var4, e21Var3, kw1Var2, z7);
            e21Var2 = e21Var3;
            yi0Var2 = yi0Var4;
            z5 = z7;
        } else {
            urVar.R();
            e21Var2 = e21Var;
            yi0Var2 = yi0Var;
            kw1Var2 = kw1Var;
            z5 = z3;
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new zi0(de0Var, e21Var2, z5, yi0Var2, kw1Var2, fqVar, i2, i3);
        }
    }

    public static final void g(int i2, fq fqVar, ur urVar, de0 de0Var, yi0 yi0Var, e21 e21Var, kw1 kw1Var, boolean z2) {
        int i3;
        boolean z3;
        long j2;
        long j3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        urVar.Y(-1134296466);
        if ((i2 & 6) == 0) {
            if (urVar.f(e21Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (urVar.h(de0Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i2 & 384) == 0) {
            if (urVar.g(z2)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        }
        if ((i2 & 3072) == 0) {
            if (urVar.f(kw1Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 24576) == 0) {
            if (urVar.f(yi0Var)) {
                i6 = 16384;
            } else {
                i6 = SharedConstants.DefaultBufferSize;
            }
            i3 |= i6;
        }
        if ((196608 & i2) == 0) {
            if (urVar.f(null)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        if ((1572864 & i2) == 0) {
            if (urVar.h(fqVar)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (urVar.O(i3 & 1, z3)) {
            urVar.X(976976045);
            Object L2 = urVar.L();
            if (L2 == or.a) {
                L2 = new r31();
                urVar.h0(L2);
            }
            r31 r31Var = (r31) L2;
            urVar.p(false);
            ei0 ei0Var = kn0.a;
            e21 d2 = e21Var.d(f11.a);
            long j4 = g3.j();
            p90 p90Var = hy1.a;
            e21 z4 = z(hy1.g(d2, j20.b(j4), j20.a(j4)), kw1Var);
            if (z2) {
                j2 = yi0Var.a;
            } else {
                j2 = yi0Var.c;
            }
            e21 r2 = rx.r(f2.r(f2.k(z4, j2, kw1Var), r31Var, xo1.a(0.0f, 7, false), z2, new ap1(0), de0Var, 8));
            j01 d3 = hj.d(g3.j, false);
            int x2 = io.x(urVar);
            sf1 l2 = urVar.l();
            e21 Q2 = fp.Q(urVar, r2);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(hsVar);
            } else {
                urVar.k0();
            }
            op1.q(urVar, kr.f, d3);
            op1.q(urVar, kr.e, l2);
            gb gbVar = kr.g;
            if (urVar.S || !r(urVar.L(), Integer.valueOf(x2))) {
                l90.s(x2, urVar, x2, gbVar);
            }
            op1.q(urVar, kr.d, Q2);
            if (z2) {
                j3 = yi0Var.b;
            } else {
                j3 = yi0Var.d;
            }
            vn.b(et.a.a(new co(j3)), fqVar, urVar, ((i3 >> 15) & 112) | 8);
            urVar.p(true);
        } else {
            urVar.R();
        }
        dl1 r3 = urVar.r();
        if (r3 != null) {
            r3.d = new zi0(e21Var, de0Var, z2, kw1Var, yi0Var, fqVar, i2);
        }
    }

    public static final void h(e21 e21Var, long j2, List list, ur urVar, int i2) {
        boolean z2;
        e21 e21Var2;
        ur urVar2;
        List list2;
        long j3;
        urVar.Y(387862047);
        int i3 = i2 | 144;
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i3 & 1, z2)) {
            urVar.T();
            if ((i2 & 1) != 0 && !urVar.y()) {
                urVar.R();
            } else {
                float f2 = qw0.a;
                j2 = oo.e(mp0.D, urVar);
                list = qw0.c;
            }
            long j4 = j2;
            List list3 = list;
            urVar.q();
            long j5 = co.g;
            float f3 = qw0.a;
            e21Var2 = e21Var;
            urVar2 = urVar;
            i(e21Var2, j5, j4, pw1.b(mp0.I, urVar), list3, urVar2, 54);
            j3 = j4;
            list2 = list3;
        } else {
            e21Var2 = e21Var;
            urVar2 = urVar;
            urVar2.R();
            list2 = list;
            j3 = j2;
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new t6(e21Var2, j3, list2, i2);
        }
    }

    public static final void i(final e21 e21Var, final long j2, final long j3, final kw1 kw1Var, final List list, ur urVar, final int i2) {
        int i3;
        boolean z2;
        int i4;
        float f2;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        urVar.Y(-1776169461);
        if ((i2 & 6) == 0) {
            if (urVar.f(e21Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (urVar.e(j2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & 384) == 0) {
            if (urVar.e(j3)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (urVar.f(kw1Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 24576) == 0) {
            if (urVar.h(list)) {
                i5 = 16384;
            } else {
                i5 = SharedConstants.DefaultBufferSize;
            }
            i3 |= i5;
        }
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i3 & 1, z2)) {
            if (list.size() > 1) {
                boolean f3 = urVar.f(list);
                Object L2 = urVar.L();
                Object obj = or.a;
                if (f3 || L2 == obj) {
                    vv0 v2 = xn.v();
                    int size = list.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = i10 + 1;
                        if (i11 < list.size()) {
                            i4 = i11;
                            v2.add(new k21(((np1) list.get(i10)).b(), ((np1) list.get(i11)).b()));
                        } else {
                            i4 = i11;
                            v2.add(new k21(((np1) list.get(i10)).b(), ((np1) list.get(0)).b()));
                        }
                        i10 = i4;
                    }
                    L2 = xn.s(v2);
                    urVar.h0(L2);
                }
                final List list2 = (List) L2;
                boolean f4 = urVar.f(list);
                Object L3 = urVar.L();
                if (!f4 && L3 != obj) {
                    f2 = 0.0f;
                } else {
                    float[] fArr = new float[4];
                    int size2 = list.size();
                    float f5 = 1.0f;
                    int i12 = 0;
                    f2 = 0.0f;
                    while (i12 < size2) {
                        int i13 = size2;
                        np1 np1Var = (np1) list.get(i12);
                        np1.a(np1Var, fArr, 2);
                        vv0 vv0Var = np1Var.d;
                        float[] fArr2 = fArr;
                        float f6 = np1Var.c;
                        float f7 = np1Var.b;
                        int a2 = vv0Var.a();
                        float f8 = 0.0f;
                        int i14 = 0;
                        while (i14 < a2) {
                            uv uvVar = (uv) vv0Var.get(i14);
                            int i15 = a2;
                            float[] fArr3 = uvVar.a;
                            float f9 = fArr3[0] - f7;
                            float f10 = fArr3[1] - f6;
                            float f11 = be2.b;
                            float f12 = (f10 * f10) + (f9 * f9);
                            vv0 vv0Var2 = vv0Var;
                            long c2 = uvVar.c(0.5f);
                            float G2 = lo.G(c2) - f7;
                            float H2 = lo.H(c2) - f6;
                            f8 = Math.max(f8, Math.max(f12, (H2 * H2) + (G2 * G2)));
                            i14++;
                            a2 = i15;
                            vv0Var = vv0Var2;
                        }
                        float sqrt = (float) Math.sqrt(f8);
                        float[] fArr4 = {f7 - sqrt, f6 - sqrt, f7 + sqrt, f6 + sqrt};
                        f5 = Math.min(f5, Math.max((fArr2[2] - fArr2[0]) / (fArr4[2] - fArr4[0]), (fArr2[3] - fArr2[1]) / (fArr4[3] - fArr4[1])));
                        i12++;
                        fArr = fArr2;
                        size2 = i13;
                    }
                    L3 = Float.valueOf(f5 * qw0.e);
                    urVar.h0(L3);
                }
                final float floatValue = ((Number) L3).floatValue();
                Object L4 = urVar.L();
                if (L4 == obj) {
                    L4 = fc2.a(f2);
                    urVar.h0(L4);
                }
                final ya yaVar = (ya) L4;
                Object L5 = urVar.L();
                if (L5 == obj) {
                    L5 = new fe1(90.0f);
                    urVar.h0(L5);
                }
                final fe1 fe1Var = (fe1) L5;
                Object L6 = urVar.L();
                if (L6 == obj) {
                    L6 = fc2.a(f2);
                    urVar.h0(L6);
                }
                final ya yaVar2 = (ya) L6;
                boolean f13 = urVar.f(list);
                Object L7 = urVar.L();
                if (f13 || L7 == obj) {
                    L7 = new ge1(0);
                    urVar.h0(L7);
                }
                final ge1 ge1Var = (ge1) L7;
                boolean h2 = urVar.h(yaVar) | urVar.f(ge1Var) | urVar.h(list2) | urVar.h(yaVar2);
                Object L8 = urVar.L();
                if (h2 || L8 == obj) {
                    L8 = new ww0(yaVar, list2, ge1Var, fe1Var, yaVar2, null);
                    urVar.h0(L8);
                }
                bf.i(urVar, (se0) L8, list);
                Object L9 = urVar.L();
                if (L9 == obj) {
                    L9 = p8.a();
                    urVar.h0(L9);
                }
                final n8 n8Var = (n8) L9;
                Object L10 = urVar.L();
                if (L10 == obj) {
                    Object d01Var = new d01(d01.a());
                    urVar.h0(d01Var);
                    L10 = d01Var;
                }
                final float[] fArr5 = ((d01) L10).a;
                e21 k2 = f2.k(z(hy1.g(ou1.a(e21Var, true, new v51(10)), qw0.a, qw0.b).d(hy1.c), kw1Var), j2, d6.w);
                j01 d2 = hj.d(g3.j, false);
                int x2 = io.x(urVar);
                sf1 l2 = urVar.l();
                e21 Q2 = fp.Q(urVar, k2);
                lr.b.getClass();
                de0 de0Var = kr.b;
                urVar.a0();
                if (urVar.S) {
                    urVar.k(de0Var);
                } else {
                    urVar.k0();
                }
                op1.q(urVar, kr.f, d2);
                op1.q(urVar, kr.e, l2);
                gb gbVar = kr.g;
                if (urVar.S || !r(urVar.L(), Integer.valueOf(x2))) {
                    l90.s(x2, urVar, x2, gbVar);
                }
                op1.q(urVar, kr.d, Q2);
                e21 s2 = fc2.s(b21.a, 1.0f, true);
                boolean h3 = urVar.h(yaVar) | urVar.h(yaVar2) | urVar.h(list2) | urVar.f(ge1Var) | urVar.h(n8Var) | urVar.c(floatValue) | urVar.h(fArr5);
                if ((i3 & 896) == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z4 = h3 | z3;
                Object L11 = urVar.L();
                if (z4 || L11 == obj) {
                    Object obj2 = new oe0() { // from class: rw0
                        @Override // defpackage.oe0
                        public final Object invoke(Object obj3) {
                            List list3 = list2;
                            n8 n8Var2 = n8Var;
                            float f14 = floatValue;
                            float[] fArr6 = fArr5;
                            long j4 = j3;
                            ge1 ge1Var2 = ge1Var;
                            cr0 cr0Var = (cr0) obj3;
                            float floatValue2 = ((Number) ya.this.d()).floatValue();
                            float g2 = fe1Var.g();
                            float floatValue3 = ((Number) yaVar2.d()).floatValue() + g2 + (90.0f * floatValue2);
                            long l0 = cr0Var.e.l0();
                            vl vlVar = cr0Var.e;
                            ld ldVar = vlVar.f;
                            long k3 = ldVar.k();
                            ldVar.h().h();
                            try {
                                ((rg2) ldVar.f).y(l0, floatValue3);
                                rp1.t((k21) list3.get(ge1Var2.g()), floatValue2, n8Var2);
                                long d3 = vlVar.d();
                                d01.d(fArr6);
                                d01.g(fArr6, Float.intBitsToFloat((int) (d3 >> 32)) * f14, Float.intBitsToFloat((int) (4294967295L & d3)) * f14, 4);
                                n8Var2.j(fArr6);
                                n8Var2.k(z81.d(yq1.p(d3), n8Var2.c().b()));
                                c40.y0(cr0Var, n8Var2, j4, 0.0f, o90.a, 52);
                                l90.v(ldVar, k3);
                                return od2.a;
                            } catch (Throwable th) {
                                l90.v(ldVar, k3);
                                throw th;
                            }
                        }
                    };
                    urVar.h0(obj2);
                    L11 = obj2;
                }
                xp1.a(urVar, rx.v(s2, (oe0) L11));
                urVar.p(true);
            } else {
                se.h("indicatorPolygons should have, at least, two RoundedPolygons");
                return;
            }
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new se0() { // from class: sw0
                @Override // defpackage.se0
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    sn0.i(e21.this, j2, j3, kw1Var, list, (ur) obj3, lo.b0(i2 | 1));
                    return od2.a;
                }
            };
        }
    }

    public static final void j(de0 de0Var, e21 e21Var, boolean z2, kw1 kw1Var, rk rkVar, zi ziVar, pc1 pc1Var, fq fqVar, ur urVar, int i2) {
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        zi ziVar2;
        pc1 pc1Var2;
        int i5;
        boolean z5;
        urVar.Y(399974542);
        int i6 = i2 | 384;
        if (urVar.f(kw1Var)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i7 = i6 | i3;
        if (urVar.f(rkVar)) {
            i4 = 16384;
        } else {
            i4 = SharedConstants.DefaultBufferSize;
        }
        int i8 = i7 | i4 | 113967104;
        if ((306783379 & i8) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (urVar.O(i8 & 1, z3)) {
            urVar.T();
            if ((i2 & 1) != 0 && !urVar.y()) {
                urVar.R();
                i5 = i8 & (-3670017);
                z5 = z2;
                ziVar2 = ziVar;
                pc1Var2 = pc1Var;
            } else {
                rc1 rc1Var = sk.a;
                float f2 = bf.m;
                urVar.X(-112362814);
                long e2 = oo.e(rx.r, urVar);
                urVar.p(false);
                zi ziVar3 = new zi(f2, new i12(e2));
                i5 = i8 & (-3670017);
                pc1Var2 = sk.a;
                z5 = true;
                ziVar2 = ziVar3;
            }
            urVar.q();
            b(de0Var, e21Var, z5, kw1Var, rkVar, null, ziVar2, pc1Var2, fqVar, urVar, i5 & 2147483646, 0);
            z4 = z5;
        } else {
            urVar.R();
            z4 = z2;
            ziVar2 = ziVar;
            pc1Var2 = pc1Var;
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new yk(de0Var, e21Var, z4, kw1Var, rkVar, ziVar2, pc1Var2, fqVar, i2);
        }
    }

    public static rc1 k(int i2, float f2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        return new rc1(f2, 0.0f, f2, 0.0f);
    }

    public static final rc1 l(float f2, float f3, float f4, float f5) {
        return new rc1(f2, f3, f4, f5);
    }

    public static rc1 m(int i2, float f2) {
        float f3;
        float f4;
        if ((i2 & 1) != 0) {
            f3 = 0.0f;
        } else {
            f3 = 12.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        } else {
            f4 = 4.0f;
        }
        if ((i2 & 8) != 0) {
            f2 = 0.0f;
        }
        return new rc1(f3, 0.0f, f4, f2);
    }

    public static final void n(int i2, fq fqVar, ur urVar, de0 de0Var, yi0 yi0Var, e21 e21Var, kw1 kw1Var, boolean z2) {
        int i3;
        boolean z3;
        long j2;
        long j3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        urVar.Y(-171935091);
        if ((i2 & 6) == 0) {
            if (urVar.h(de0Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (urVar.f(e21Var)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
        }
        if ((i2 & 384) == 0) {
            if (urVar.g(z2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        }
        if ((i2 & 3072) == 0) {
            if (urVar.f(kw1Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((i2 & 24576) == 0) {
            if (urVar.f(yi0Var)) {
                i7 = 16384;
            } else {
                i7 = SharedConstants.DefaultBufferSize;
            }
            i3 |= i7;
        }
        if ((196608 & i2) == 0) {
            if (urVar.f(null)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((1572864 & i2) == 0) {
            if (urVar.f(null)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        if ((12582912 & i2) == 0) {
            if (urVar.h(fqVar)) {
                i4 = 8388608;
            } else {
                i4 = HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
            }
            i3 |= i4;
        }
        int i12 = 0;
        if ((4793491 & i3) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (urVar.O(i3 & 1, z3)) {
            Object L2 = urVar.L();
            if (L2 == or.a) {
                L2 = new p1(28);
                urVar.h0(L2);
            }
            e21 a2 = ou1.a(e21Var, false, (oe0) L2);
            if (z2) {
                j2 = yi0Var.a;
            } else {
                j2 = yi0Var.c;
            }
            if (z2) {
                j3 = yi0Var.b;
            } else {
                j3 = yi0Var.d;
            }
            fq N2 = go.N(669231714, new bj0(fqVar, i12), urVar);
            int i13 = i3 & 8078;
            int i14 = i3 << 9;
            l42.b(de0Var, a2, z2, kw1Var, j2, j3, 0.0f, 0.0f, null, null, N2, urVar, i13 | (234881024 & i14) | (i14 & 1879048192), 192);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new zi0(de0Var, e21Var, z2, kw1Var, yi0Var, fqVar, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final defpackage.de0 r13, defpackage.e21 r14, boolean r15, defpackage.kw1 r16, defpackage.rk r17, defpackage.pc1 r18, final defpackage.fq r19, defpackage.ur r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn0.o(de0, e21, boolean, kw1, rk, pc1, fq, ur, int, int):void");
    }

    public static final e21 p(e21 e21Var, float f2) {
        if (f2 == 1.0f) {
            return e21Var;
        }
        return d6.z(e21Var, f2, 0.0f, null, 520187);
    }

    public static boolean q(float f2, Float f3) {
        if (f3 != null && f2 == f3.floatValue()) {
            return true;
        }
        return false;
    }

    public static boolean r(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static final Bitmap s(t7 t7Var) {
        if (t7Var instanceof t7) {
            return t7Var.a;
        }
        se.v("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final float t(pc1 pc1Var, jq0 jq0Var) {
        if (jq0Var == jq0.e) {
            return pc1Var.c(jq0Var);
        }
        return pc1Var.b(jq0Var);
    }

    public static final float u(pc1 pc1Var, jq0 jq0Var) {
        if (jq0Var == jq0.e) {
            return pc1Var.b(jq0Var);
        }
        return pc1Var.c(jq0Var);
    }

    public static final g00 v(View view) {
        zi2 zi2Var;
        Context context = view.getContext();
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            if ((context2 instanceof Activity) || (context2 instanceof InputMethodService) || (context2 instanceof Application)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context2 = contextWrapper.getBaseContext();
        }
        context2 = null;
        if (context2 != null) {
            xi2.a.getClass();
            wi2 wi2Var = wi2.a;
            yi2 yi2Var = wi2.b;
            yi2Var.getClass();
            ContextWrapper contextWrapper2 = (ContextWrapper) context2;
            if (Build.VERSION.SDK_INT >= 34) {
                zi2Var = aj2.e;
            } else {
                zi2Var = xl1.v;
            }
            long height = (4294967295L & r10.c().height()) | (zi2Var.e(contextWrapper2, yi2Var.b).a.c().width() << 32);
            return new g00(height, rx.d(context2).q(vn.O(height)));
        }
        Configuration configuration = context.getResources().getConfiguration();
        e00 d2 = rx.d(context);
        long e2 = go.e(configuration.screenWidthDp, configuration.screenHeightDp);
        return new g00((((int) Float.intBitsToFloat((int) (r6 & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (d2.n0(e2) >> 32))) << 32), e2);
    }

    public static final e21 z(e21 e21Var, kw1 kw1Var) {
        return d6.z(e21Var, 0.0f, 0.0f, kw1Var, 518143);
    }

    public abstract void P(n0 n0Var, n0 n0Var2);

    public abstract void Q(n0 n0Var, Thread thread);

    public abstract boolean w(o0 o0Var, k0 k0Var);

    public abstract boolean x(o0 o0Var, Object obj, Object obj2);

    public abstract boolean y(o0 o0Var, n0 n0Var, n0 n0Var2);
}
