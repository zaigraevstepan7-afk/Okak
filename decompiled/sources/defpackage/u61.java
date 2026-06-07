package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.elixir.loader.R;
import com.topjohnwu.superuser.internal.HiddenAPIs;
import com.topjohnwu.superuser.nio.FileSystemManager;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class u61 {
    public static final dc2 a = new dc2(256, (x40) null, 6);

    public static final void a(final th2 th2Var, e21 e21Var, kw1 kw1Var, long j, long j2, ia0 ia0Var, final fq fqVar, ur urVar, int i) {
        int i2;
        kw1 kw1Var2;
        boolean z;
        ia0 ia0Var2;
        ia0 ia0Var3;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        urVar.Y(1560288494);
        if ((i & 6) == 0) {
            if (urVar.f(null)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.f(th2Var)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & 384) == 0) {
            if (urVar.f(e21Var)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            kw1Var2 = kw1Var;
            if (urVar.f(kw1Var2)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        } else {
            kw1Var2 = kw1Var;
        }
        if ((i & 24576) == 0) {
            if (urVar.e(j)) {
                i7 = 16384;
            } else {
                i7 = SharedConstants.DefaultBufferSize;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (urVar.e(j2)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (urVar.c(0.0f)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((i & 12582912) == 0) {
            i2 |= HiddenAPIs.FLAG_RECEIVER_FROM_SHELL;
        }
        if ((100663296 & i) == 0) {
            if (urVar.h(fqVar)) {
                i4 = FileSystemManager.MODE_TRUNCATE;
            } else {
                i4 = FileSystemManager.MODE_APPEND;
            }
            i2 |= i4;
        }
        if ((38347923 & i2) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                i3 = i2 & (-29360129);
                ia0Var3 = ia0Var;
            } else {
                Object L = urVar.L();
                if (L == or.a) {
                    L = new zy();
                    urVar.h0(L);
                }
                ia0Var3 = (ia0) L;
                i3 = i2 & (-29360129);
            }
            urVar.q();
            c00 c00Var = (c00) urVar.j(is.h);
            final float f = sn0.E;
            final float W = c00Var.W(f);
            if (urVar.j(is.n) == jq0.f) {
                z2 = true;
            } else {
                z2 = false;
            }
            e21 d = d6.x(hy1.i(e21Var, 240.0f, 0.0f, f, 10), new r61(ia0Var3, W, z2, 1)).d(b21.a).d(hy1.b);
            final boolean z3 = z2;
            final ia0 ia0Var4 = ia0Var3;
            int i12 = i3 >> 6;
            l42.a(d, kw1Var2, j, j2, 0.0f, 0.0f, go.N(-315420087, new se0() { // from class: p61
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    boolean z4;
                    ur urVar2 = (ur) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (urVar2.O(intValue & 1, z4)) {
                        b21 b21Var = b21.a;
                        e21 X = sn0.X(d6.x(hy1.i(b21Var, 240.0f, 0.0f, f, 10), new r61(ia0Var4, W, z3, 0)).d(b21Var), th2Var);
                        yo a2 = wo.a(c01.g, g3.r, urVar2, 0);
                        int x = io.x(urVar2);
                        sf1 l = urVar2.l();
                        e21 Q = fp.Q(urVar2, X);
                        lr.b.getClass();
                        hs hsVar = kr.b;
                        urVar2.a0();
                        if (urVar2.S) {
                            urVar2.k(hsVar);
                        } else {
                            urVar2.k0();
                        }
                        op1.q(urVar2, kr.f, a2);
                        op1.q(urVar2, kr.e, l);
                        gb gbVar = kr.g;
                        if (urVar2.S || !sn0.r(urVar2.L(), Integer.valueOf(x))) {
                            l90.s(x, urVar2, x, gbVar);
                        }
                        op1.q(urVar2, kr.d, Q);
                        fqVar.invoke(zo.a, urVar2, 6);
                        urVar2.p(true);
                    } else {
                        urVar2.R();
                    }
                    return od2.a;
                }
            }, urVar), urVar, (i12 & 57344) | (i12 & 112) | 12582912 | (i12 & 896) | (i12 & 7168), 96);
            ia0Var2 = ia0Var4;
        } else {
            urVar.R();
            ia0Var2 = ia0Var;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new ta0(th2Var, e21Var, kw1Var, j, j2, ia0Var2, fqVar, i, 1);
        }
    }

    public static final void b(e21 e21Var, kw1 kw1Var, long j, long j2, th2 th2Var, fq fqVar, ur urVar, int i) {
        boolean z;
        e21 e21Var2;
        kw1 kw1Var2;
        long j3;
        long j4;
        th2 th2Var2;
        e21 e21Var3;
        long j5;
        long j6;
        kw1 kw1Var3;
        th2 th2Var3;
        urVar.Y(1922633461);
        int i2 = i | 91286;
        if ((599187 & i2) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                e21Var3 = e21Var;
                kw1Var3 = kw1Var;
                j6 = j;
                j5 = j2;
                th2Var3 = th2Var;
            } else {
                float f = i40.a;
                kw1 b = pw1.b(sn0.D, urVar);
                long e = oo.e(sn0.H, urVar);
                long b2 = oo.b(e, urVar);
                cv0 cv0Var = new cv0(op1.i(urVar), 48 | 9);
                e21Var3 = b21.a;
                j5 = b2;
                j6 = e;
                kw1Var3 = b;
                th2Var3 = cv0Var;
            }
            urVar.q();
            a(th2Var3, e21Var3, kw1Var3, j6, j5, null, fqVar, urVar, 102236550);
            th2Var2 = th2Var3;
            e21Var2 = e21Var3;
            kw1Var2 = kw1Var3;
            j3 = j6;
            j4 = j5;
        } else {
            urVar.R();
            e21Var2 = e21Var;
            kw1Var2 = kw1Var;
            j3 = j;
            j4 = j2;
            th2Var2 = th2Var;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new vz1(e21Var2, kw1Var2, j3, j4, th2Var2, fqVar, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c8, code lost:
    
        if (defpackage.sn0.r(r30.L(), java.lang.Integer.valueOf(r3)) == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0319 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x034a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0301  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.fq r23, defpackage.e21 r24, defpackage.l40 r25, boolean r26, long r27, defpackage.fq r29, defpackage.ur r30, int r31) {
        /*
            Method dump skipped, instructions count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u61.c(fq, e21, l40, boolean, long, fq, ur, int):void");
    }

    public static final void d(fq fqVar, final boolean z, final de0 de0Var, e21 e21Var, se0 se0Var, kw1 kw1Var, dy dyVar, ur urVar, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        fq fqVar2;
        se0 se0Var2;
        kw1 kw1Var2;
        dy dyVar2;
        kw1 b;
        dy dyVar3;
        long j;
        urVar.Y(-583709666);
        if (urVar.g(z)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i5 = i | i2;
        if (urVar.h(de0Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i6 = i5 | i3;
        if (urVar.f(e21Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4 | 105578496;
        if ((38347923 & i7) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i7 & 1, z2)) {
            urVar.T();
            if ((i & 1) != 0 && !urVar.y()) {
                urVar.R();
                b = kw1Var;
                dyVar3 = dyVar;
            } else {
                b = pw1.b(sn0.B, urVar);
                rc1 rc1Var = n61.a;
                long e = oo.e(sn0.z, urVar);
                long j2 = co.f;
                long e2 = oo.e(sn0.y, urVar);
                long e3 = oo.e(sn0.F, urVar);
                long e4 = oo.e(sn0.C, urVar);
                long e5 = oo.e(sn0.G, urVar);
                dyVar3 = new dy(e2, e3, e4, e5, e, j2, e4, e5);
            }
            urVar.q();
            Object L = urVar.L();
            xl1 xl1Var = or.a;
            if (L == xl1Var) {
                L = new v51(4);
                urVar.h0(L);
            }
            final e21 b2 = hy1.b(hy1.d(ou1.a(e21Var, false, (oe0) L), sn0.A, Float.NaN), 1.0f);
            dyVar3.getClass();
            urVar.X(-433512770);
            if (z) {
                j = dyVar3.e;
            } else {
                j = dyVar3.f;
            }
            o41 p = fr1.p(new co(j), urVar);
            urVar.p(false);
            final long j3 = ((co) p.getValue()).a;
            fqVar2 = fqVar;
            se0Var2 = se0Var;
            final fq N = go.N(-1173018444, new v01(se0Var2, dyVar3, z, fqVar2), urVar);
            js jsVar = l42.a;
            final kw1 kw1Var3 = b;
            long b3 = oo.b(j3, urVar);
            urVar.X(1528105640);
            Object L2 = urVar.L();
            if (L2 == xl1Var) {
                L2 = new r31();
                urVar.h0(L2);
            }
            final r31 r31Var = (r31) L2;
            urVar.p(false);
            js jsVar2 = l42.a;
            final float f = ((f20) urVar.j(jsVar2)).e + 0.0f;
            vn.c(new zj1[]{et.a.a(new co(b3)), jsVar2.a(new f20(f))}, go.N(1508735219, new se0() { // from class: j42
                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    ur urVar2 = (ur) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (urVar2.O(intValue & 1, z3)) {
                        ei0 ei0Var = kn0.a;
                        e21 r = rx.r(sn0.U(l42.c(e21.this.d(f11.a), kw1Var3, l42.d(j3, f, urVar2), null, ((c00) urVar2.j(is.h)).W(0.0f)), z, r31Var, xo1.a(0.0f, 7, false), de0Var));
                        j01 d = hj.d(g3.f, true);
                        int x = io.x(urVar2);
                        sf1 l = urVar2.l();
                        e21 Q = fp.Q(urVar2, r);
                        lr.b.getClass();
                        hs hsVar = kr.b;
                        urVar2.a0();
                        if (urVar2.S) {
                            urVar2.k(hsVar);
                        } else {
                            urVar2.k0();
                        }
                        op1.q(urVar2, kr.f, d);
                        op1.q(urVar2, kr.e, l);
                        gb gbVar = kr.g;
                        if (urVar2.S || !sn0.r(urVar2.L(), Integer.valueOf(x))) {
                            l90.s(x, urVar2, x, gbVar);
                        }
                        op1.q(urVar2, kr.d, Q);
                        N.invoke(urVar2, 0);
                        urVar2.p(true);
                    } else {
                        urVar2.R();
                    }
                    return od2.a;
                }
            }, urVar), urVar, 56);
            kw1Var2 = kw1Var3;
            dyVar2 = dyVar3;
        } else {
            fqVar2 = fqVar;
            se0Var2 = se0Var;
            urVar.R();
            kw1Var2 = kw1Var;
            dyVar2 = dyVar;
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new q61(fqVar2, z, de0Var, e21Var, se0Var2, kw1Var2, dyVar2, i);
        }
    }

    public static final void e(final boolean z, final de0 de0Var, final de0 de0Var2, final long j, ur urVar, final int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        int i4;
        int i5;
        int i6;
        urVar.Y(2106487387);
        if ((i & 6) == 0) {
            if (urVar.g(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.h(de0Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (urVar.h(de0Var2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (urVar.e(j)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i7 = 1;
        if ((i2 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i2 & 1, z2)) {
            String g = nq1.g(R.string.close_drawer, urVar);
            e21 e21Var = b21.a;
            Object obj = or.a;
            if (z) {
                urVar.X(598773053);
                int i8 = i2 & 112;
                if (i8 == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Object L = urVar.L();
                if (z5 || L == obj) {
                    L = new w11(de0Var, i7);
                    urVar.h0(L);
                }
                e21 a2 = s42.a(e21Var, de0Var, (PointerInputEventHandler) L);
                boolean f = urVar.f(g);
                if (i8 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z7 = z6 | f;
                Object L2 = urVar.L();
                if (z7 || L2 == obj) {
                    L2 = new m11(g, de0Var, i7);
                    urVar.h0(L2);
                }
                e21Var = ou1.a(a2, true, (oe0) L2);
                urVar.p(false);
            } else {
                urVar.X(599097127);
                urVar.p(false);
            }
            e21 d = hy1.c.d(e21Var);
            if ((i2 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i2 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = z4 | z3;
            Object L3 = urVar.L();
            if (z8 || L3 == obj) {
                L3 = new n11(de0Var2, i7, j);
                urVar.h0(L3);
            }
            f2.c(d, (oe0) L3, urVar, 0);
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new se0() { // from class: o61
                @Override // defpackage.se0
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    u61.e(z, de0Var, de0Var2, j, (ur) obj2, lo.b0(i | 1));
                    return od2.a;
                }
            };
        }
    }

    public static final l40 f(ur urVar) {
        Object L = urVar.L();
        Object obj = or.a;
        if (L == obj) {
            L = new v51(3);
            urVar.h0(L);
        }
        oe0 oe0Var = (oe0) L;
        Object[] objArr = new Object[0];
        sl0 sl0Var = new sl0(new le(23), new j40(oe0Var, 0));
        boolean f = urVar.f(oe0Var);
        Object L2 = urVar.L();
        if (f || L2 == obj) {
            L2 = new d80(oe0Var, 1);
            urVar.h0(L2);
        }
        return (l40) go.Q(objArr, sl0Var, (de0) L2, urVar, 0);
    }
}
