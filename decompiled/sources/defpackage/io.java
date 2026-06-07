package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EdgeEffect;
import com.topjohnwu.superuser.internal.HiddenAPIs;
import com.topjohnwu.superuser.nio.FileSystemManager;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class io {
    public static ij0 a;
    public static ij0 b;
    public static ij0 c;
    public static ij0 d;
    public static ij0 e;
    public static ij0 f;

    public static String A(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static pc2 B(ur urVar) {
        return (pc2) urVar.j(rc2.a);
    }

    public static final boolean C(float[] fArr, float[] fArr2) {
        boolean z;
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 != 0.0f) {
            float f31 = 1.0f / f30;
            fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
            fArr2[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
            fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
            fArr2[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
            float f32 = -f6;
            fArr2[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
            fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
            float f33 = -f14;
            fArr2[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
            fArr2[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
            fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
            fArr2[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
            fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
            fArr2[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
            fArr2[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
            fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
            fArr2[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
            fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        }
        if (f30 == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final boolean D(long j) {
        if (!co.c(j, co.f)) {
            po f2 = co.f(j);
            if (!u(f2.b, 12884901888L)) {
                jl0.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) M(f2.b)));
            }
            lo1 lo1Var = ((po1) f2).p;
            double b2 = lo1Var.b(co.h(j));
            float b3 = (float) ((lo1Var.b(co.e(j)) * 0.0722d) + (lo1Var.b(co.g(j)) * 0.7152d) + (b2 * 0.2126d));
            if (b3 < 0.0f) {
                b3 = 0.0f;
            }
            if (b3 > 1.0f) {
                b3 = 1.0f;
            }
            if (b3 <= 0.5d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final xu E(gv gvVar, xu xuVar) {
        xu v = v(gvVar.A(), xuVar, true);
        vy vyVar = k10.a;
        if (v != vyVar && v.H(g3.y) == null) {
            return v.G(vyVar);
        }
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void F(d21 d21Var, de0 de0Var) {
        y81 y81Var = d21Var.k;
        if (y81Var == null) {
            y81Var = new y81((w81) d21Var);
            d21Var.k = y81Var;
        }
        lc1 snapshotObserver = ((q5) hp.N(d21Var)).getSnapshotObserver();
        snapshotObserver.a.c(y81Var, x81.f, de0Var);
    }

    public static final zv G(tc0 tc0Var) {
        int ordinal = tc0Var.Q0().ordinal();
        zv zvVar = zv.e;
        if (ordinal != 0) {
            zv zvVar2 = null;
            zv zvVar3 = zv.f;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        se.m();
                        return null;
                    }
                } else {
                    return zvVar3;
                }
            } else {
                tc0 z = lo.z(tc0Var);
                if (z != null) {
                    zv G = G(z);
                    if (G != zvVar) {
                        zvVar2 = G;
                    }
                    if (zvVar2 == null) {
                        if (!tc0Var.t) {
                            tc0Var.t = true;
                            try {
                                nc0 N0 = tc0Var.N0();
                                mc0 mc0Var = (mc0) ((q5) hp.N(tc0Var)).getFocusOwner();
                                tc0 f2 = mc0Var.f();
                                N0.k.getClass();
                                tc0 f3 = mc0Var.f();
                                if (f2 != f3 && f3 != null) {
                                    if (oc0.d == oc0.c) {
                                        return zvVar3;
                                    }
                                    return zv.g;
                                }
                                return zvVar;
                            } finally {
                                tc0Var.t = false;
                            }
                        }
                        return zvVar;
                    }
                    return zvVar2;
                }
                se.h("ActiveParent with no focused child");
                return null;
            }
        }
        return zvVar;
    }

    public static final zv H(tc0 tc0Var) {
        if (!tc0Var.u) {
            tc0Var.u = true;
            try {
                nc0 N0 = tc0Var.N0();
                mc0 mc0Var = (mc0) ((q5) hp.N(tc0Var)).getFocusOwner();
                tc0 f2 = mc0Var.f();
                N0.j.getClass();
                tc0 f3 = mc0Var.f();
                if (f2 != f3 && f3 != null) {
                    if (oc0.d == oc0.c) {
                        return zv.f;
                    }
                    return zv.g;
                }
            } finally {
                tc0Var.u = false;
            }
        }
        return zv.e;
    }

    public static final zv I(tc0 tc0Var) {
        d21 d21Var;
        a81 a81Var;
        int ordinal = tc0Var.Q0().ordinal();
        zv zvVar = zv.e;
        if (ordinal != 0) {
            zv zvVar2 = null;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (!tc0Var.e.r) {
                            kl0.b("visitAncestors called on an unattached node");
                        }
                        d21 d21Var2 = tc0Var.e.i;
                        ar0 M = hp.M(tc0Var);
                        loop0: while (true) {
                            if (M != null) {
                                if ((M.J.f.h & 1024) != 0) {
                                    while (d21Var2 != null) {
                                        if ((d21Var2.g & 1024) != 0) {
                                            d21Var = d21Var2;
                                            q41 q41Var = null;
                                            while (d21Var != null) {
                                                if (d21Var instanceof tc0) {
                                                    break loop0;
                                                }
                                                if ((d21Var.g & 1024) != 0 && (d21Var instanceof rz)) {
                                                    int i = 0;
                                                    for (d21 d21Var3 = ((rz) d21Var).t; d21Var3 != null; d21Var3 = d21Var3.j) {
                                                        if ((d21Var3.g & 1024) != 0) {
                                                            i++;
                                                            if (i == 1) {
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
                                                    if (i == 1) {
                                                    }
                                                }
                                                d21Var = hp.l(q41Var);
                                            }
                                        }
                                        d21Var2 = d21Var2.i;
                                    }
                                }
                                M = M.v();
                                if (M != null && (a81Var = M.J) != null) {
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
                        if (tc0Var2 == null) {
                            return zvVar;
                        }
                        int ordinal2 = tc0Var2.Q0().ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    if (ordinal2 == 3) {
                                        zv I = I(tc0Var2);
                                        if (I != zvVar) {
                                            zvVar2 = I;
                                        }
                                        if (zvVar2 == null) {
                                            return H(tc0Var2);
                                        }
                                        return zvVar2;
                                    }
                                    se.m();
                                    return null;
                                }
                                return zv.f;
                            }
                            return I(tc0Var2);
                        }
                        return H(tc0Var2);
                    }
                    se.m();
                    return null;
                }
            } else {
                tc0 z = lo.z(tc0Var);
                if (z != null) {
                    return G(z);
                }
                se.h("ActiveParent with no focused child");
                return null;
            }
        }
        return zvVar;
    }

    public static final sr J(ur urVar) {
        hm1 hm1Var;
        ur urVar2;
        urVar.U(206, vr.e);
        if (urVar.S) {
            jz1.z(urVar.I);
        }
        Object D = urVar.D();
        if (D instanceof hm1) {
            hm1Var = (hm1) D;
        } else {
            hm1Var = null;
        }
        if (hm1Var == null) {
            urVar2 = urVar;
            hm1Var = new hm1(new rr(new sr(urVar2, urVar.T, urVar.q, urVar.C, urVar.h.x)), -1);
            urVar2.i0(hm1Var);
        } else {
            urVar2 = urVar;
        }
        gm1 gm1Var = hm1Var.a;
        gm1Var.getClass();
        sr srVar = ((rr) gm1Var).e;
        srVar.f.setValue(urVar2.l());
        urVar2.p(false);
        return srVar;
    }

    public static final void K(Object obj) {
        if (!(obj instanceof fo1)) {
        } else {
            throw ((fo1) obj).e;
        }
    }

    public static final long L(long j) {
        return vs.a(us.j(j), us.h(j), us.i(j), us.g(j));
    }

    public static String M(long j) {
        if (u(j, 12884901888L)) {
            return "Rgb";
        }
        if (u(j, 12884901889L)) {
            return "Xyz";
        }
        if (u(j, 12884901890L)) {
            return "Lab";
        }
        if (u(j, 17179869187L)) {
            return "Cmyk";
        }
        return "Unknown";
    }

    public static final jd2 N(vt vtVar, xu xuVar, Object obj) {
        jd2 jd2Var = null;
        if ((vtVar instanceof iv) && xuVar.H(sl.g) != null) {
            iv ivVar = (iv) vtVar;
            while (true) {
                if ((ivVar instanceof h10) || (ivVar = ivVar.getCallerFrame()) == null) {
                    break;
                }
                if (ivVar instanceof jd2) {
                    jd2Var = (jd2) ivVar;
                    break;
                }
            }
            if (jd2Var != null) {
                jd2Var.i0(xuVar, obj);
            }
        }
        return jd2Var;
    }

    public static d00 a() {
        return new d00(1.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.de0 r18, defpackage.e21 r19, defpackage.kw1 r20, long r21, long r23, final defpackage.ma0 r25, final defpackage.fq r26, defpackage.ur r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io.b(de0, e21, kw1, long, long, ma0, fq, ur, int, int):void");
    }

    public static final void c(final de0 de0Var, final k92 k92Var, final float f2, final e21 e21Var, final kw1 kw1Var, final long j, final long j2, final ma0 ma0Var, final fq fqVar, ur urVar, final int i, final int i2) {
        int i3;
        fq fqVar2;
        int i4;
        boolean z;
        int i5;
        e21 e21Var2;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        urVar.Y(121669932);
        if ((i & 6) == 0) {
            if (urVar.h(de0Var)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i3 = i16 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.f(k92Var)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i3 |= i15;
        }
        if ((i & 384) == 0) {
            if (urVar.c(f2)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i3 |= i14;
        }
        if ((i & 3072) == 0) {
            if (urVar.c(56.0f)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i3 |= i13;
        }
        if ((i & 24576) == 0) {
            if (urVar.f(e21Var)) {
                i12 = 16384;
            } else {
                i12 = SharedConstants.DefaultBufferSize;
            }
            i3 |= i12;
        }
        if ((196608 & i) == 0) {
            if (urVar.f(kw1Var)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i3 |= i11;
        }
        if ((1572864 & i) == 0) {
            if (urVar.e(j)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((12582912 & i) == 0) {
            if (urVar.e(j2)) {
                i9 = 8388608;
            } else {
                i9 = HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
            }
            i3 |= i9;
        }
        if ((100663296 & i) == 0) {
            if (urVar.f(ma0Var)) {
                i8 = FileSystemManager.MODE_TRUNCATE;
            } else {
                i8 = FileSystemManager.MODE_APPEND;
            }
            i3 |= i8;
        }
        if ((805306368 & i) == 0) {
            if (urVar.f(null)) {
                i7 = FileSystemManager.MODE_WRITE_ONLY;
            } else {
                i7 = FileSystemManager.MODE_READ_ONLY;
            }
            i3 |= i7;
        }
        if ((i2 & 6) == 0) {
            fqVar2 = fqVar;
            if (urVar.h(fqVar2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i4 = i2 | i6;
        } else {
            fqVar2 = fqVar;
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) {
            z = false;
        } else {
            z = true;
        }
        if (urVar.O(i3 & 1, z)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
            }
            urVar.q();
            urVar.X(-282853233);
            Object L = urVar.L();
            Object obj = or.a;
            if (L == obj) {
                L = new r31();
                urVar.h0(L);
            }
            r31 r31Var = (r31) L;
            urVar.p(false);
            Object L2 = urVar.L();
            if (L2 == obj) {
                L2 = new p1(26);
                urVar.h0(L2);
            }
            e21 a2 = ou1.a(e21Var, false, (oe0) L2);
            float f3 = ma0Var.a;
            int i17 = i3 >> 21;
            int i18 = i17 & 112;
            boolean f4 = urVar.f(r31Var);
            Object L3 = urVar.L();
            if (!f4 && L3 != obj) {
                i5 = i3;
                e21Var2 = a2;
            } else {
                i5 = i3;
                e21Var2 = a2;
                L3 = new pa0(ma0Var.a, ma0Var.b, ma0Var.d, ma0Var.c);
                urVar.h0(L3);
            }
            pa0 pa0Var = (pa0) L3;
            boolean h = urVar.h(pa0Var);
            if (((i18 ^ 48) > 32 && urVar.f(ma0Var)) || (i17 & 48) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = h | z2;
            Object L4 = urVar.L();
            if (z3 || L4 == obj) {
                L4 = new j(pa0Var, ma0Var, null, 18);
                urVar.h0(L4);
            }
            bf.i(urVar, (se0) L4, ma0Var);
            boolean f5 = urVar.f(r31Var) | urVar.h(pa0Var);
            Object L5 = urVar.L();
            if (f5 || L5 == obj) {
                L5 = new l(r31Var, pa0Var, (vt) null);
                urVar.h0(L5);
            }
            bf.i(urVar, (se0) L5, r31Var);
            final fq fqVar3 = fqVar2;
            int i19 = i5 >> 6;
            l42.b(de0Var, e21Var2, false, kw1Var, j, j2, f3, ((f20) pa0Var.e.c.f.getValue()).e, null, r31Var, go.N(-1779603465, new se0() { // from class: ra0
                @Override // defpackage.se0
                public final Object invoke(Object obj2, Object obj3) {
                    boolean z4;
                    ur urVar2 = (ur) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 3) != 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (urVar2.O(intValue & 1, z4)) {
                        xn.i(j2, k92Var, go.N(-1767363041, new x2(f2, fqVar3), urVar2), urVar2, 384);
                    } else {
                        urVar2.R();
                    }
                    return od2.a;
                }
            }, urVar), urVar, (i5 & 14) | (i19 & 7168) | (57344 & i19) | (i19 & 458752), 260);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0() { // from class: sa0
                @Override // defpackage.se0
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int b0 = lo.b0(i | 1);
                    int b02 = lo.b0(i2);
                    io.c(de0.this, k92Var, f2, e21Var, kw1Var, j, j2, ma0Var, fqVar, (ur) obj2, b0, b02);
                    return od2.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(int r23, int r24, defpackage.h3 r25, defpackage.j7 r26, defpackage.qe r27, defpackage.ur r28, defpackage.z90 r29, defpackage.oe0 r30, defpackage.st0 r31, defpackage.e21 r32, defpackage.pc1 r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io.d(int, int, h3, j7, qe, ur, z90, oe0, st0, e21, pc1, boolean):void");
    }

    public static final void e(final Object obj, final int i, final ss0 ss0Var, final fq fqVar, ur urVar, final int i2) {
        int i3;
        boolean z;
        oe0 oe0Var;
        int i4;
        int i5;
        int i6;
        int i7;
        urVar.Y(872548579);
        if ((i2 & 6) == 0) {
            if (urVar.h(obj)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (urVar.d(i)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (urVar.h(ss0Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (urVar.h(fqVar)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i3 & 1, z)) {
            boolean f2 = urVar.f(obj) | urVar.f(ss0Var);
            Object L = urVar.L();
            Object obj2 = or.a;
            if (f2 || L == obj2) {
                L = new qs0(obj, ss0Var);
                urVar.h0(L);
            }
            qs0 qs0Var = (qs0) L;
            qs0Var.c = i;
            je1 je1Var = qs0Var.g;
            xj1 xj1Var = gg1.a;
            qs0 qs0Var2 = (qs0) urVar.j(xj1Var);
            i02 e2 = nq1.e();
            if (e2 != null) {
                oe0Var = e2.e();
            } else {
                oe0Var = null;
            }
            i02 j = nq1.j(e2);
            try {
                if (qs0Var2 != ((qs0) je1Var.getValue())) {
                    je1Var.setValue(qs0Var2);
                    if (qs0Var.d > 0) {
                        qs0 qs0Var3 = qs0Var.e;
                        if (qs0Var3 != null) {
                            qs0Var3.b();
                        }
                        if (qs0Var2 != null) {
                            qs0Var2.a();
                        } else {
                            qs0Var2 = null;
                        }
                        qs0Var.e = qs0Var2;
                    }
                }
                nq1.o(e2, j, oe0Var);
                boolean f3 = urVar.f(qs0Var);
                Object L2 = urVar.L();
                if (f3 || L2 == obj2) {
                    L2 = new r(qs0Var, 18);
                    urVar.h0(L2);
                }
                bf.d(qs0Var, (oe0) L2, urVar);
                vn.b(xj1Var.a(qs0Var), fqVar, urVar, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                nq1.o(e2, j, oe0Var);
                throw th;
            }
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0() { // from class: rs0
                @Override // defpackage.se0
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    io.e(obj, i, ss0Var, fqVar, (ur) obj3, lo.b0(i2 | 1));
                    return od2.a;
                }
            };
        }
    }

    public static final void f(d51 d51Var, lq1 lq1Var, fq fqVar, ur urVar, int i) {
        int i2;
        int i3;
        urVar.Y(233973821);
        if (urVar.h(d51Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (urVar.h(lq1Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        if (((i4 | i3) & 147) == 146 && urVar.A()) {
            urVar.R();
        } else {
            vn.c(new zj1[]{gx0.a.a(d51Var), bx0.a.a(d51Var), fx0.a.a(d51Var)}, go.N(1808964477, new t00(1, lq1Var, fqVar), urVar), urVar, 56);
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new l1(d51Var, lq1Var, fqVar, i, 8);
        }
    }

    public static final void g(final de0 de0Var, final long j, final y11 y11Var, final ya yaVar, final fq fqVar, ur urVar, final int i) {
        int i2;
        long j2;
        y11 y11Var2;
        boolean z;
        int i3;
        jq0 jq0Var;
        int i4;
        boolean z2;
        Object obj;
        boolean z3;
        boolean z4;
        boolean z5;
        int i5;
        boolean h;
        int i6;
        int i7;
        int i8;
        int i9;
        urVar.Y(766784632);
        if ((i & 6) == 0) {
            if (urVar.h(de0Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            if (urVar.e(j2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            y11Var2 = y11Var;
            if (urVar.f(y11Var2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        } else {
            y11Var2 = y11Var;
        }
        if ((i & 3072) == 0) {
            if ((i & 4096) == 0) {
                h = urVar.f(yaVar);
            } else {
                h = urVar.h(yaVar);
            }
            if (h) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (urVar.h(fqVar)) {
                i5 = 16384;
            } else {
                i5 = SharedConstants.DefaultBufferSize;
            }
            i2 |= i5;
        }
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            View view = (View) urVar.j(l6.f);
            c00 c00Var = (c00) urVar.j(is.h);
            jq0 jq0Var2 = (jq0) urVar.j(is.n);
            sr J = J(urVar);
            o41 p = fr1.p(fqVar, urVar);
            Object[] objArr = new Object[0];
            Object L = urVar.L();
            Object obj2 = or.a;
            if (L == obj2) {
                i3 = i2;
                L = new ax0(9);
                urVar.h0(L);
            } else {
                i3 = i2;
            }
            UUID uuid = (UUID) go.P(objArr, (de0) L, urVar);
            Object L2 = urVar.L();
            if (L2 == obj2) {
                L2 = bf.K(urVar);
                urVar.h0(L2);
            }
            gv gvVar = (gv) L2;
            boolean f2 = urVar.f(view) | urVar.f(c00Var);
            Object L3 = urVar.L();
            if (!f2 && L3 != obj2) {
                jq0Var = jq0Var2;
                i4 = i3;
                z2 = true;
                obj = L3;
            } else {
                jq0Var = jq0Var2;
                i4 = i3;
                z2 = true;
                k11 k11Var = new k11(de0Var, y11Var2, j2, view, jq0Var, c00Var, uuid, yaVar, gvVar);
                fq fqVar2 = new fq(-1051373467, true, new y70(p, 2));
                h11 h11Var = k11Var.m;
                h11Var.setParentCompositionContext(J);
                h11Var.m.setValue(fqVar2);
                h11Var.n = true;
                h11Var.d();
                urVar.h0(k11Var);
                obj = k11Var;
            }
            final k11 k11Var2 = (k11) obj;
            boolean h2 = urVar.h(k11Var2);
            Object L4 = urVar.L();
            if (h2 || L4 == obj2) {
                L4 = new r(k11Var2, 24);
                urVar.h0(L4);
            }
            bf.d(k11Var2, (oe0) L4, urVar);
            boolean h3 = urVar.h(k11Var2);
            int i10 = i4;
            if ((i10 & 14) == 4) {
                z3 = z2;
            } else {
                z3 = false;
            }
            boolean z6 = h3 | z3;
            if ((i10 & 896) == 256) {
                z4 = z2;
            } else {
                z4 = false;
            }
            boolean z7 = z6 | z4;
            if ((i10 & 112) == 32) {
                z5 = z2;
            } else {
                z5 = false;
            }
            boolean d2 = z7 | z5 | urVar.d(jq0Var.ordinal());
            Object L5 = urVar.L();
            if (d2 || L5 == obj2) {
                final jq0 jq0Var3 = jq0Var;
                L5 = new de0() { // from class: z11
                    @Override // defpackage.de0
                    public final Object invoke() {
                        k11.this.h(de0Var, y11Var, j, jq0Var3);
                        return od2.a;
                    }
                };
                urVar.h0(L5);
            }
            bf.p((de0) L5, urVar);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0() { // from class: a21
                @Override // defpackage.se0
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    io.g(de0.this, j, y11Var, yaVar, fqVar, (ur) obj3, lo.b0(i | 1));
                    return od2.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(boolean z, se0 se0Var, ur urVar, int i) {
        int i2;
        boolean z2;
        w61 w61Var;
        boolean z3;
        q4 q4Var;
        int i3;
        int i4;
        urVar.Y(-642000585);
        int i5 = 2;
        if ((i & 6) == 0) {
            if (urVar.g(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.h(se0Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i6 = 0;
        if ((i2 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i2 & 1, z2)) {
            w61 a2 = cx0.a(urVar);
            z91 a3 = dx0.a(urVar);
            if (a2 == null) {
                w61Var = a3;
            } else {
                w61Var = a2;
            }
            if (w61Var != null) {
                Object L = urVar.L();
                Object obj = or.a;
                if (L == obj) {
                    y91 y91Var = null;
                    if (a2 != null) {
                        q4Var = a2.a();
                    } else {
                        q4Var = null;
                    }
                    if (a3 != 0) {
                        y91Var = a3.b();
                    }
                    L = new ug(q4Var, y91Var);
                    urVar.h0(L);
                }
                Object obj2 = (ug) L;
                Object L2 = urVar.L();
                if (L2 == obj) {
                    L2 = bf.K(urVar);
                    urVar.h0(L2);
                }
                gv gvVar = (gv) L2;
                long j = urVar.T;
                boolean f2 = urVar.f(obj2) | urVar.e(j);
                Object L3 = urVar.L();
                if (f2 || L3 == obj) {
                    L3 = new cr(gvVar, new hi1(w61Var, j));
                    urVar.h0(L3);
                }
                cr crVar = (cr) L3;
                urVar.X(-348495408);
                boolean h = urVar.h(crVar) | urVar.h(se0Var);
                Object L4 = urVar.L();
                if (h || L4 == obj) {
                    L4 = new ii1(i6, crVar, se0Var);
                    urVar.h0(L4);
                }
                bf.p((de0) L4, urVar);
                int i7 = i2;
                Boolean valueOf = Boolean.valueOf(z);
                boolean h2 = urVar.h(crVar);
                int i8 = i7 & 14;
                if (i8 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z4 = h2 | z3;
                Object L5 = urVar.L();
                if (z4 || L5 == obj) {
                    L5 = new wg(crVar, z, i5);
                    urVar.h0(L5);
                }
                go.f(valueOf, crVar, null, (oe0) L5, urVar, i8);
                boolean h3 = urVar.h(obj2) | urVar.h(crVar);
                Object L6 = urVar.L();
                if (h3 || L6 == obj) {
                    L6 = new i(28, obj2, crVar);
                    urVar.h0(L6);
                }
                bf.e(obj2, crVar, (oe0) L6, urVar);
                urVar.p(false);
            } else {
                se.h("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new xg(z, se0Var, i, i5);
        }
    }

    public static final void i(lq1 lq1Var, fq fqVar, ur urVar, int i) {
        int i2;
        int i3;
        nv nvVar;
        urVar.Y(832919318);
        if (urVar.h(lq1Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (urVar.h(fqVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) == 18 && urVar.A()) {
            urVar.R();
        } else {
            Object L = urVar.L();
            if (L == or.a) {
                L = new mm0(23);
                urVar.h0(L);
            }
            oe0 oe0Var = (oe0) L;
            tg2 a2 = gx0.a(urVar);
            if (a2 != null) {
                cn a3 = yl1.a(ah.class);
                hl0 hl0Var = new hl0(0);
                hl0Var.a(yl1.a(ah.class), oe0Var);
                gl0 b2 = hl0Var.b();
                if (a2 instanceof tg0) {
                    nvVar = ((tg0) a2).d();
                } else {
                    nvVar = mv.b;
                }
                ah ahVar = (ah) rp1.v(a3, a2, b2, nvVar, urVar);
                ahVar.d = new ov1(lq1Var);
                lq1Var.b(ahVar.c, fqVar, urVar, ((i5 << 6) & 896) | (i5 & 112));
            } else {
                se.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new u2(lq1Var, i, 24, fqVar);
        }
    }

    public static final void j(de0 de0Var, e21 e21Var, kw1 kw1Var, long j, long j2, ma0 ma0Var, fq fqVar, ur urVar, int i) {
        de0 de0Var2;
        int i2;
        boolean z;
        e21 e21Var2;
        kw1 kw1Var2;
        ma0 ma0Var2;
        kw1 b2;
        int i3;
        e21 e21Var3;
        ma0 ma0Var3;
        int i4;
        int i5;
        int i6;
        int i7;
        urVar.Y(26608441);
        if ((i & 6) == 0) {
            de0Var2 = de0Var;
            if (urVar.h(de0Var2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            de0Var2 = de0Var;
            i2 = i;
        }
        int i8 = i2 | 48;
        if ((i & 384) == 0) {
            i8 = i2 | 176;
        }
        if ((i & 3072) == 0) {
            if (urVar.e(j)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i8 |= i6;
        }
        if ((i & 24576) == 0) {
            if (urVar.e(j2)) {
                i5 = 16384;
            } else {
                i5 = SharedConstants.DefaultBufferSize;
            }
            i8 |= i5;
        }
        if ((196608 & i) == 0) {
            i8 |= 65536;
        }
        int i9 = 1572864 | i8;
        if ((12582912 & i) == 0) {
            if (urVar.h(fqVar)) {
                i4 = 8388608;
            } else {
                i4 = HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
            }
            i9 |= i4;
        }
        if ((4793491 & i9) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i9 & 1, z)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                i3 = i9 & (-459649);
                e21Var3 = e21Var;
                b2 = kw1Var;
                ma0Var3 = ma0Var;
            } else {
                b2 = pw1.b(d6.i, urVar);
                ma0 ma0Var4 = new ma0(f2.g, f2.j, f2.h, f2.i);
                i3 = i9 & (-459649);
                e21Var3 = b21.a;
                ma0Var3 = ma0Var4;
            }
            urVar.q();
            b(de0Var2, hy1.i(e21Var3, d6.j, 40.0f, 0.0f, 12), b2, j, j2, ma0Var3, fqVar, urVar, i3 & 33554318, 0);
            kw1Var2 = b2;
            ma0Var2 = ma0Var3;
            e21Var2 = e21Var3;
        } else {
            urVar.R();
            e21Var2 = e21Var;
            kw1Var2 = kw1Var;
            ma0Var2 = ma0Var;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new ta0(de0Var, e21Var2, kw1Var2, j, j2, ma0Var2, fqVar, i, 0);
        }
    }

    public static float k(EdgeEffect edgeEffect, float f2, float f3, c00 c00Var) {
        float f4;
        float f5 = z40.a;
        double a2 = c00Var.a() * 386.0878f * 160.0f * 0.84f;
        double d2 = z40.a * a2;
        float exp = (float) (Math.exp((z40.b / z40.c) * Math.log((Math.abs(f2) * 0.35f) / d2)) * d2);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f4 = xc.c(edgeEffect);
        } else {
            f4 = 0.0f;
        }
        if (exp > f4 * f3) {
            return 0.0f;
        }
        int R = c01.R(f2);
        if (i >= 31) {
            edgeEffect.onAbsorb(R);
            return f2;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(R);
        }
        return f2;
    }

    public static final boolean l(o20 o20Var, long j) {
        if (o20Var.e.r) {
            ql0 ql0Var = hp.M(o20Var).J.c;
            if (ql0Var.V.r) {
                long Q = ql0Var.Q(0L);
                float intBitsToFloat = Float.intBitsToFloat((int) (Q >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (Q & 4294967295L));
                long j2 = o20Var.u;
                float f2 = ((int) (j2 >> 32)) + intBitsToFloat;
                float f3 = ((int) (j2 & 4294967295L)) + intBitsToFloat2;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                if (intBitsToFloat <= intBitsToFloat3 && intBitsToFloat3 <= f2) {
                    float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                    if (intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f3) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0080 -> B:13:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0083 -> B:13:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(java.util.List r6, defpackage.ww r7, defpackage.wt r8) {
        /*
            boolean r0 = r8 instanceof defpackage.bw
            if (r0 == 0) goto L13
            r0 = r8
            bw r0 = (defpackage.bw) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            bw r0 = new bw
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.g
            int r1 = r0.h
            r2 = 0
            r3 = 2
            r4 = 1
            hv r5 = defpackage.hv.e
            if (r1 == 0) goto L41
            if (r1 == r4) goto L39
            if (r1 != r3) goto L33
            java.util.Iterator r6 = r0.f
            java.io.Serializable r7 = r0.e
            wl1 r7 = (defpackage.wl1) r7
            K(r8)     // Catch: java.lang.Throwable -> L31
            goto L63
        L31:
            r8 = move-exception
            goto L7c
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.se.p(r6)
            return r2
        L39:
            java.io.Serializable r6 = r0.e
            java.util.List r6 = (java.util.List) r6
            K(r8)
            goto L5a
        L41:
            K(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            z7 r1 = new z7
            r1.<init>(r6, r8, r2)
            r0.e = r8
            r0.h = r4
            java.lang.Object r6 = r7.a(r1, r0)
            if (r6 != r5) goto L59
            goto L91
        L59:
            r6 = r8
        L5a:
            wl1 r7 = new wl1
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L63:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L89
            java.lang.Object r8 = r6.next()
            oe0 r8 = (defpackage.oe0) r8
            r0.e = r7     // Catch: java.lang.Throwable -> L31
            r0.f = r6     // Catch: java.lang.Throwable -> L31
            r0.h = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L31
            if (r8 != r5) goto L63
            goto L91
        L7c:
            java.lang.Object r1 = r7.e
            if (r1 != 0) goto L83
            r7.e = r8
            goto L63
        L83:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            defpackage.qo.g(r1, r8)
            goto L63
        L89:
            java.lang.Object r6 = r7.e
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L92
            od2 r5 = defpackage.od2.a
        L91:
            return r5
        L92:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io.m(java.util.List, ww, wt):java.lang.Object");
    }

    public static void n(jz1 jz1Var, List list, ds dsVar) {
        Object obj;
        dl1 dl1Var;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int c2 = jz1Var.c((p3) list.get(i));
                int N = jz1Var.N(jz1Var.b, jz1Var.r(c2));
                if (N < jz1Var.g(jz1Var.b, jz1Var.r(c2 + 1))) {
                    obj = jz1Var.c[jz1Var.h(N)];
                } else {
                    obj = or.a;
                }
                if (obj instanceof dl1) {
                    dl1Var = (dl1) obj;
                } else {
                    dl1Var = null;
                }
                if (dl1Var != null) {
                    dl1Var.a = dsVar;
                }
            }
        }
    }

    public static final void o(int i) {
        if (i >= 1) {
            return;
        }
        se.e(l90.g(i, "Expected positive parallelism level, but got "));
    }

    public static final boolean p(tc0 tc0Var, boolean z) {
        boolean z2;
        int ordinal = tc0Var.Q0().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        se.m();
                        return false;
                    }
                } else {
                    return z;
                }
            } else {
                tc0 z3 = lo.z(tc0Var);
                if (z3 != null) {
                    z2 = p(z3, z);
                } else {
                    z2 = true;
                }
                if (!z2) {
                    return false;
                }
                tc0Var.M0(sc0.f, sc0.g);
                return true;
            }
        }
        return true;
    }

    public static long q(long j, or0 or0Var) {
        int i;
        int g;
        int j2;
        int h;
        or0 or0Var2 = or0.e;
        if (or0Var == or0Var2) {
            i = us.j(j);
        } else {
            i = us.i(j);
        }
        if (or0Var == or0Var2) {
            g = us.h(j);
        } else {
            g = us.g(j);
        }
        if (or0Var == or0Var2) {
            j2 = us.i(j);
        } else {
            j2 = us.j(j);
        }
        if (or0Var == or0Var2) {
            h = us.g(j);
        } else {
            h = us.h(j);
        }
        return vs.a(i, g, j2, h);
    }

    public static long r(int i, long j) {
        int i2;
        int h = us.h(j);
        if ((i & 4) != 0) {
            i2 = us.i(j);
        } else {
            i2 = 0;
        }
        return vs.a(0, h, i2, us.g(j));
    }

    public static final fo1 s(Throwable th) {
        th.getClass();
        return new fo1(th);
    }

    public static final long t(od1 od1Var) {
        return c01.S(od1Var.m() * od1Var.q()) + (od1Var.l() * od1Var.q());
    }

    public static final boolean u(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final xu v(xu xuVar, xu xuVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 20;
        boolean booleanValue = ((Boolean) xuVar.p(new le(i), bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) xuVar2.p(new le(i), bool)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return xuVar.G(xuVar2);
        }
        le leVar = new le(18);
        j60 j60Var = j60.e;
        xu xuVar3 = (xu) xuVar.p(leVar, j60Var);
        Object obj = xuVar2;
        if (booleanValue2) {
            obj = xuVar2.p(new le(19), j60Var);
        }
        return xuVar3.G((xu) obj);
    }

    public static mo w(ur urVar) {
        return (mo) urVar.j(oo.a);
    }

    public static final int x(ur urVar) {
        urVar.getClass();
        return Long.hashCode(urVar.T);
    }

    public static final ij0 y() {
        ij0 ij0Var = b;
        if (ij0Var != null) {
            return ij0Var;
        }
        hj0 hj0Var = new hj0("Rounded.Error", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = me2.a;
        i12 i12Var = new i12(co.b);
        rg2 rg2Var = new rg2(21);
        rg2Var.s(12.0f, 2.0f);
        rg2Var.h(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        rg2Var.w(4.48f, 10.0f, 10.0f, 10.0f);
        rg2Var.w(10.0f, -4.48f, 10.0f, -10.0f);
        rg2Var.v(17.52f, 2.0f, 12.0f, 2.0f);
        rg2Var.f();
        rg2Var.s(12.0f, 13.0f);
        rg2Var.i(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        rg2Var.q(11.0f, 8.0f);
        rg2Var.i(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        rg2Var.w(1.0f, 0.45f, 1.0f, 1.0f);
        rg2Var.E(4.0f);
        rg2Var.i(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        rg2Var.f();
        rg2Var.s(13.0f, 17.0f);
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

    public static Intent z(Context context, ComponentName componentName) {
        String A = A(context, componentName);
        if (A == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), A);
        if (A(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }
}
