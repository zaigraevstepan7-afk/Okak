package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.KeyEvent;
import com.elixir.loader.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class f2 {
    public static ij0 J;
    public final /* synthetic */ int a;
    public static final fq b = new fq(-91331245, false, new le(11));
    public static final int[] c = new int[0];
    public static final long[] d = new long[0];
    public static final Object[] e = new Object[0];
    public static final no f = no.r;
    public static final float g = 6.0f;
    public static final float h = 6.0f;
    public static final float i = 8.0f;
    public static final float j = 6.0f;
    public static final Object k = new Object();
    public static final StackTraceElement[] l = new StackTraceElement[0];
    public static final no m = no.q;
    public static final no n = no.u;
    public static final sl0 o = new sl0(new ir1(14), new hr1(20));
    public static final sl0 p = new sl0(new ir1(15), new hr1(21));
    public static final sl0 q = new sl0(new ir1(16), new hr1(22));
    public static final sl0 r = new sl0(new ir1(17), new hr1(23));
    public static final sl0 s = new sl0(new ir1(18), new hr1(24));
    public static final no t = no.z;
    public static final mw1 u = mw1.f;
    public static final no v = no.m;
    public static final float w = 4.0f;
    public static final float x = 32.0f;
    public static final float y = 1.0f;
    public static final Object z = new Object();
    public static final ec2 A = new ec2(new nv1(19), new ke2(6));
    public static final ec2 B = new ec2(new nv1(20), new nv1(21));
    public static final ec2 C = new ec2(new nv1(22), new nv1(23));
    public static final ec2 D = new ec2(new nv1(24), new nv1(25));
    public static final ec2 E = new ec2(new nv1(26), new nv1(27));
    public static final ec2 F = new ec2(new nv1(28), new nv1(29));
    public static final ec2 G = new ec2(new ke2(0), new ke2(1));
    public static final ec2 H = new ec2(new ke2(2), new ke2(3));
    public static final ec2 I = new ec2(new ke2(4), new ke2(5));

    public /* synthetic */ f2(int i2) {
        this.a = i2;
    }

    public static final boolean A(KeyEvent keyEvent) {
        long v2 = mp0.v(keyEvent);
        int i2 = jp0.F;
        if (!jp0.a(v2, jp0.h) && !jp0.a(v2, jp0.r) && !jp0.a(v2, jp0.E) && !jp0.a(v2, jp0.q)) {
            return false;
        }
        return true;
    }

    public static final e21 B(e21 e21Var, cp0 cp0Var, zs0 zs0Var, sb1 sb1Var, boolean z2) {
        return e21Var.d(new ct0(cp0Var, zs0Var, sb1Var, z2));
    }

    public static final e21 C(e21 e21Var, oe0 oe0Var) {
        return e21Var.d(new aa1(oe0Var));
    }

    public static final e21 E(v72 v72Var) {
        return new k62(v72Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [e21, java.lang.Object] */
    public static final e21 F(e21 e21Var) {
        return e21Var.d(new Object());
    }

    public static final void a(lb2 lb2Var, e21 e21Var, oe0 oe0Var, i3 i3Var, oe0 oe0Var2, fq fqVar, ur urVar, int i2) {
        int i3;
        boolean z2;
        oe0 oe0Var3;
        ur urVar2;
        boolean z3;
        boolean z4;
        boolean z5;
        ir irVar;
        pb pbVar;
        a12 a12Var;
        pb pbVar2;
        hb2 hb2Var;
        boolean z6;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        oe0 oe0Var4 = oe0Var;
        urVar.Y(511725103);
        if ((i2 & 6) == 0) {
            if (urVar.f(lb2Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (urVar.f(e21Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & 384) == 0) {
            if (urVar.h(oe0Var4)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (urVar.f(i3Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 24576) == 0) {
            if (urVar.h(oe0Var2)) {
                i5 = 16384;
            } else {
                i5 = SharedConstants.DefaultBufferSize;
            }
            i3 |= i5;
        }
        fq fqVar2 = fqVar;
        if ((196608 & i2) == 0) {
            if (urVar.h(fqVar2)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((74899 & i3) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i3 & 1, z2)) {
            int i10 = i3 & 14;
            if (i10 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object L = urVar.L();
            Object obj = or.a;
            if (z3 || L == obj) {
                L = new pb(lb2Var, i3Var);
                urVar.h0(L);
            }
            pb pbVar3 = (pb) L;
            if (i10 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object L2 = urVar.L();
            Object obj2 = L2;
            if (z4 || L2 == obj) {
                Object[] objArr = {lb2Var.a.c()};
                a12 a12Var2 = new a12();
                a12Var2.addAll(bf.e0(objArr));
                urVar.h0(a12Var2);
                obj2 = a12Var2;
            }
            a12 a12Var3 = (a12) obj2;
            if (i10 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object L3 = urVar.L();
            if (z5 || L3 == obj) {
                long[] jArr = sr1.a;
                L3 = new i41();
                urVar.h0(L3);
            }
            i41 i41Var = (i41) L3;
            ir irVar2 = lb2Var.a;
            je1 je1Var = lb2Var.d;
            if (!a12Var3.contains(irVar2.c())) {
                a12Var3.clear();
                a12Var3.add(irVar2.c());
            }
            if (sn0.r(irVar2.c(), je1Var.getValue())) {
                if (a12Var3.size() != 1 || !sn0.r(a12Var3.get(0), irVar2.c())) {
                    a12Var3.clear();
                    a12Var3.add(irVar2.c());
                }
                if (i41Var.e != 1 || i41Var.c(irVar2.c())) {
                    i41Var.a();
                }
                pbVar3.b = i3Var;
            }
            if (!sn0.r(irVar2.c(), je1Var.getValue()) && !a12Var3.contains(je1Var.getValue())) {
                ListIterator listIterator = a12Var3.listIterator();
                int i11 = 0;
                while (true) {
                    ah0 ah0Var = (ah0) listIterator;
                    irVar = irVar2;
                    if (ah0Var.hasNext()) {
                        if (sn0.r(oe0Var2.invoke(ah0Var.next()), oe0Var2.invoke(je1Var.getValue()))) {
                            break;
                        }
                        i11++;
                        irVar2 = irVar;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 == -1) {
                    a12Var3.add(je1Var.getValue());
                } else {
                    a12Var3.set(i11, je1Var.getValue());
                }
            } else {
                irVar = irVar2;
            }
            if (i41Var.c(je1Var.getValue()) && i41Var.c(irVar.c())) {
                urVar.X(1925931827);
                urVar.p(false);
                oe0Var3 = oe0Var4;
                pbVar = pbVar3;
            } else {
                urVar.X(1966410449);
                i41Var.a();
                int size = a12Var3.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj3 = a12Var3.get(i12);
                    i41Var.m(obj3, go.N(-23915175, new eb(lb2Var, obj3, oe0Var4, pbVar3, a12Var3, fqVar2), urVar));
                    i12++;
                    oe0Var4 = oe0Var4;
                    fqVar2 = fqVar;
                }
                oe0Var3 = oe0Var4;
                pbVar = pbVar3;
                urVar.p(false);
            }
            boolean f2 = urVar.f(lb2Var.f()) | urVar.f(pbVar);
            Object L4 = urVar.L();
            if (f2 || L4 == obj) {
                L4 = (lt) oe0Var3.invoke(pbVar);
                urVar.h0(L4);
            }
            lt ltVar = (lt) L4;
            lb2 lb2Var2 = pbVar.a;
            boolean f3 = urVar.f(pbVar);
            Object L5 = urVar.L();
            if (f3 || L5 == obj) {
                L5 = fr1.k(Boolean.FALSE);
                urVar.h0(L5);
            }
            o41 o41Var = (o41) L5;
            o41 p2 = fr1.p(ltVar.d, urVar);
            if (sn0.r(lb2Var2.a.c(), lb2Var2.d.getValue())) {
                o41Var.setValue(Boolean.FALSE);
            } else if (p2.getValue() != null) {
                o41Var.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) o41Var.getValue()).booleanValue();
            e21 e21Var2 = b21.a;
            if (booleanValue) {
                urVar.X(1353077497);
                pb pbVar4 = pbVar;
                a12Var = a12Var3;
                pbVar2 = pbVar4;
                urVar2 = urVar;
                hb2Var = qb2.b(pbVar4.a, H, null, urVar2, 0, 2);
                boolean f4 = urVar2.f(hb2Var);
                Object L6 = urVar2.L();
                if (f4 || L6 == obj) {
                    L6 = sn0.A(e21Var2);
                    urVar2.h0(L6);
                }
                e21Var2 = (e21) L6;
                urVar2.p(false);
            } else {
                a12Var = a12Var3;
                urVar2 = urVar;
                pbVar2 = pbVar;
                urVar2.X(1353343539);
                urVar2.p(false);
                hb2Var = null;
            }
            e21 d2 = e21Var.d(e21Var2.d(new lb(hb2Var, p2, pbVar2)));
            Object L7 = urVar2.L();
            if (L7 == obj) {
                L7 = new ib(pbVar2);
                urVar2.h0(L7);
            }
            ib ibVar = (ib) L7;
            int hashCode = Long.hashCode(urVar2.T);
            sf1 l2 = urVar2.l();
            e21 Q = fp.Q(urVar2, d2);
            lr.b.getClass();
            hs hsVar = kr.b;
            urVar2.a0();
            if (urVar2.S) {
                urVar2.k(hsVar);
            } else {
                urVar2.k0();
            }
            op1.q(urVar2, kr.f, ibVar);
            op1.q(urVar2, kr.e, l2);
            op1.l(urVar2, Integer.valueOf(hashCode), kr.g);
            op1.o(urVar2, kr.h);
            op1.q(urVar2, kr.d, Q);
            urVar2.X(-860173498);
            int size2 = a12Var.size();
            int i13 = 0;
            while (i13 < size2) {
                a12 a12Var4 = a12Var;
                Object obj4 = a12Var4.get(i13);
                urVar2.V(-2026002954, oe0Var2.invoke(obj4));
                se0 se0Var = (se0) i41Var.g(obj4);
                if (se0Var == null) {
                    urVar2.X(1618454323);
                    z6 = false;
                } else {
                    z6 = false;
                    urVar2.X(-2026001778);
                    se0Var.invoke(urVar2, 0);
                }
                urVar2.p(z6);
                urVar2.p(z6);
                i13++;
                a12Var = a12Var4;
            }
            urVar2.p(false);
            urVar2.p(true);
        } else {
            oe0Var3 = oe0Var4;
            urVar2 = urVar;
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new fb(lb2Var, e21Var, oe0Var3, i3Var, oe0Var2, fqVar, i2);
        }
    }

    public static final void b(String str, ag agVar, bi0 bi0Var, vf2 vf2Var, ew1 ew1Var, co1 co1Var, el0 el0Var, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        agVar.getClass();
        bi0Var.getClass();
        vf2Var.getClass();
        ew1Var.getClass();
        co1Var.getClass();
        el0Var.getClass();
        urVar.Y(-1259409159);
        int i10 = 2;
        if (urVar.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i11 = i2 | i3;
        if (urVar.h(agVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i12 = i11 | i4;
        if (urVar.h(bi0Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i13 = i12 | i5;
        if (urVar.h(vf2Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i14 = i13 | i6;
        if (urVar.h(ew1Var)) {
            i7 = 16384;
        } else {
            i7 = SharedConstants.DefaultBufferSize;
        }
        int i15 = i14 | i7;
        if (urVar.h(co1Var)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i16 = i15 | i8;
        if (urVar.h(el0Var)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i17 = i16 | i9;
        int i18 = 1;
        if ((599187 & i17) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i17 & 1, z2)) {
            Context context = (Context) urVar.j(l6.b);
            Object[] copyOf = Arrays.copyOf(new g71[0], 0);
            sl0 sl0Var = new sl0(new p11(i18), new xk0(context, i10));
            boolean h2 = urVar.h(context);
            Object L = urVar.L();
            Object obj = or.a;
            if (h2 || L == obj) {
                L = new hh0(context, i18);
                urVar.h0(L);
            }
            c61 c61Var = (c61) go.R(copyOf, sl0Var, (de0) L, urVar, 0, 4);
            Object L2 = urVar.L();
            if (L2 == obj) {
                L2 = new p1(8);
                urVar.h0(L2);
            }
            oe0 oe0Var = (oe0) L2;
            Object L3 = urVar.L();
            if (L3 == obj) {
                L3 = new p1(9);
                urVar.h0(L3);
            }
            oe0 oe0Var2 = (oe0) L3;
            Object L4 = urVar.L();
            if (L4 == obj) {
                L4 = new p1(10);
                urVar.h0(L4);
            }
            oe0 oe0Var3 = (oe0) L4;
            Object L5 = urVar.L();
            if (L5 == obj) {
                L5 = new p1(11);
                urVar.h0(L5);
            }
            oe0 oe0Var4 = (oe0) L5;
            boolean h3 = urVar.h(c61Var) | urVar.h(agVar) | urVar.h(bi0Var) | urVar.h(vf2Var) | urVar.h(ew1Var) | urVar.h(co1Var) | urVar.h(el0Var);
            Object L6 = urVar.L();
            if (h3 || L6 == obj) {
                Object udVar = new ud(c61Var, agVar, bi0Var, vf2Var, ew1Var, co1Var, el0Var, 0);
                urVar.h0(udVar);
                L6 = udVar;
            }
            xn.g(c61Var, str, null, null, oe0Var, oe0Var2, oe0Var3, oe0Var4, (oe0) L6, urVar, ((i17 << 3) & 112) | 115015680);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new se0(str, agVar, bi0Var, vf2Var, ew1Var, co1Var, el0Var, i2) { // from class: vd
                public final /* synthetic */ String e;
                public final /* synthetic */ ag f;
                public final /* synthetic */ bi0 g;
                public final /* synthetic */ vf2 h;
                public final /* synthetic */ ew1 i;
                public final /* synthetic */ co1 j;
                public final /* synthetic */ el0 k;

                @Override // defpackage.se0
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int b0 = lo.b0(1);
                    f2.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (ur) obj2, b0);
                    return od2.a;
                }
            };
        }
    }

    public static final void c(e21 e21Var, oe0 oe0Var, ur urVar, int i2) {
        int i3;
        int i4;
        boolean z2;
        urVar.Y(-932836462);
        if (urVar.f(e21Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (urVar.h(oe0Var)) {
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
        if (urVar.O(i6 & 1, z2)) {
            xp1.a(urVar, rx.t(e21Var, oe0Var));
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new u2(e21Var, i2, 5, oe0Var);
        }
    }

    public static final void d(final bi0 bi0Var, final vf2 vf2Var, final ew1 ew1Var, final co1 co1Var, final el0 el0Var, final de0 de0Var, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        String str;
        gv gvVar;
        l40 l40Var;
        uy uyVar;
        wr1 wr1Var;
        String str2;
        String str3;
        String str4;
        bi0Var.getClass();
        vf2Var.getClass();
        ew1Var.getClass();
        co1Var.getClass();
        el0Var.getClass();
        urVar.Y(-720033087);
        if (urVar.h(bi0Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (urVar.h(vf2Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (urVar.h(ew1Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        if (urVar.h(co1Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i13 = i12 | i6;
        if (urVar.h(el0Var)) {
            i7 = 16384;
        } else {
            i7 = SharedConstants.DefaultBufferSize;
        }
        int i14 = i13 | i7;
        if (urVar.h(de0Var)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i15 = i14 | i8;
        if ((74899 & i15) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i15 & 1, z2)) {
            final h32 c2 = jx0.c(urVar);
            l40 f2 = u61.f(urVar);
            Object L = urVar.L();
            xl1 xl1Var = or.a;
            if (L == xl1Var) {
                L = bf.K(urVar);
                urVar.h0(L);
            }
            gv gvVar2 = (gv) L;
            wr1 wr1Var2 = wr1.a;
            wr1 wr1Var3 = wr1.e;
            wr1 wr1Var4 = wr1.d;
            wr1 wr1Var5 = wr1.c;
            wr1 wr1Var6 = wr1.b;
            final List F2 = xn.F(wr1Var2, wr1Var3, wr1Var4, wr1Var5, wr1Var6);
            Object L2 = urVar.L();
            if (L2 == xl1Var) {
                i9 = 0;
                L2 = new yd(0, F2);
                urVar.h0(L2);
            } else {
                i9 = 0;
            }
            de0 de0Var2 = (de0) L2;
            pd1 pd1Var = qd1.a;
            Object[] objArr = new Object[i9];
            sl0 sl0Var = uy.J;
            boolean c3 = urVar.c(0.0f);
            Object L3 = urVar.L();
            if (c3 || L3 == xl1Var) {
                L3 = new og0(de0Var2, 4);
                urVar.h0(L3);
            }
            uy uyVar2 = (uy) go.Q(objArr, sl0Var, (de0) L3, urVar, 0);
            uyVar2.I.setValue(de0Var2);
            wr1 wr1Var7 = (wr1) F2.get(uyVar2.l());
            switch (c2.a) {
                case 0:
                    str = "Home";
                    break;
                case 1:
                    str = "Início";
                    break;
                case 2:
                    str = "Главная";
                    break;
                case 3:
                    str = "Головна";
                    break;
                default:
                    str = "主页";
                    break;
            }
            ij0 ij0Var = go.b;
            if (ij0Var != null) {
                uyVar = uyVar2;
                wr1Var = wr1Var7;
                gvVar = gvVar2;
                l40Var = f2;
            } else {
                hj0 hj0Var = new hj0("Filled.Home", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i16 = me2.a;
                gvVar = gvVar2;
                l40Var = f2;
                i12 i12Var = new i12(co.b);
                rg2 rg2Var = new rg2(21);
                uyVar = uyVar2;
                rg2Var.s(10.0f, 20.0f);
                rg2Var.E(-6.0f);
                rg2Var.o(4.0f);
                rg2Var.E(6.0f);
                rg2Var.o(5.0f);
                rg2Var.E(-8.0f);
                rg2Var.o(3.0f);
                rg2Var.q(12.0f, 3.0f);
                wr1Var = wr1Var7;
                rg2Var.q(2.0f, 12.0f);
                rg2Var.o(3.0f);
                rg2Var.E(8.0f);
                rg2Var.f();
                hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
                ij0Var = hj0Var.b();
                go.b = ij0Var;
            }
            cc2 cc2Var = new cc2(wr1Var2, str, ij0Var);
            switch (c2.a) {
                case 0:
                    str2 = "Versions Manager";
                    break;
                case 1:
                    str2 = "Gerenciador de Versões";
                    break;
                case 2:
                    str2 = "Менеджер версий";
                    break;
                case 3:
                    str2 = "Менеджер версій";
                    break;
                default:
                    str2 = "版本管理";
                    break;
            }
            ij0 ij0Var2 = d6.G;
            if (ij0Var2 == null) {
                hj0 hj0Var2 = new hj0("Filled.Build", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i17 = me2.a;
                i12 i12Var2 = new i12(co.b);
                rg2 rg2Var2 = new rg2(21);
                rg2Var2.s(22.7f, 19.0f);
                rg2Var2.r(-9.1f, -9.1f);
                rg2Var2.i(0.9f, -2.3f, 0.4f, -5.0f, -1.5f, -6.9f);
                rg2Var2.i(-2.0f, -2.0f, -5.0f, -2.4f, -7.4f, -1.3f);
                rg2Var2.q(9.0f, 6.0f);
                rg2Var2.q(6.0f, 9.0f);
                rg2Var2.q(1.6f, 4.7f);
                rg2Var2.h(0.4f, 7.1f, 0.9f, 10.1f, 2.9f, 12.1f);
                rg2Var2.i(1.9f, 1.9f, 4.6f, 2.4f, 6.9f, 1.5f);
                rg2Var2.r(9.1f, 9.1f);
                rg2Var2.i(0.4f, 0.4f, 1.0f, 0.4f, 1.4f, 0.0f);
                rg2Var2.r(2.3f, -2.3f);
                rg2Var2.i(0.5f, -0.4f, 0.5f, -1.1f, 0.1f, -1.4f);
                rg2Var2.f();
                hj0.a(hj0Var2, (ArrayList) rg2Var2.f, i12Var2);
                ij0Var2 = hj0Var2.b();
                d6.G = ij0Var2;
            }
            cc2 cc2Var2 = new cc2(wr1Var3, str2, ij0Var2);
            switch (c2.a) {
                case 0:
                    str3 = "Settings";
                    break;
                case 1:
                    str3 = "Configurações";
                    break;
                case 2:
                    str3 = "Настройки";
                    break;
                case 3:
                    str3 = "Налаштування";
                    break;
                default:
                    str3 = "设置";
                    break;
            }
            ij0 ij0Var3 = op1.a;
            if (ij0Var3 == null) {
                hj0 hj0Var3 = new hj0("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i18 = me2.a;
                i12 i12Var3 = new i12(co.b);
                rg2 rg2Var3 = new rg2(21);
                rg2Var3.s(19.14f, 12.94f);
                rg2Var3.i(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
                rg2Var3.i(0.0f, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
                rg2Var3.r(2.03f, -1.58f);
                rg2Var3.i(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
                rg2Var3.r(-1.92f, -3.32f);
                rg2Var3.i(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
                rg2Var3.r(-2.39f, 0.96f);
                rg2Var3.i(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
                rg2Var3.q(14.4f, 2.81f);
                rg2Var3.i(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
                rg2Var3.o(-3.84f);
                rg2Var3.i(-0.24f, 0.0f, -0.43f, 0.17f, -0.47f, 0.41f);
                rg2Var3.q(9.25f, 5.35f);
                rg2Var3.h(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
                rg2Var3.q(5.24f, 5.33f);
                rg2Var3.i(-0.22f, -0.08f, -0.47f, 0.0f, -0.59f, 0.22f);
                rg2Var3.q(2.74f, 8.87f);
                rg2Var3.h(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
                rg2Var3.r(2.03f, 1.58f);
                rg2Var3.h(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
                rg2Var3.w(0.02f, 0.64f, 0.07f, 0.94f);
                rg2Var3.r(-2.03f, 1.58f);
                rg2Var3.i(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
                rg2Var3.r(1.92f, 3.32f);
                rg2Var3.i(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
                rg2Var3.r(2.39f, -0.96f);
                rg2Var3.i(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
                rg2Var3.r(0.36f, 2.54f);
                rg2Var3.i(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
                rg2Var3.o(3.84f);
                rg2Var3.i(0.24f, 0.0f, 0.44f, -0.17f, 0.47f, -0.41f);
                rg2Var3.r(0.36f, -2.54f);
                rg2Var3.i(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
                rg2Var3.r(2.39f, 0.96f);
                rg2Var3.i(0.22f, 0.08f, 0.47f, 0.0f, 0.59f, -0.22f);
                rg2Var3.r(1.92f, -3.32f);
                rg2Var3.i(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
                rg2Var3.q(19.14f, 12.94f);
                rg2Var3.f();
                rg2Var3.s(12.0f, 15.6f);
                rg2Var3.i(-1.98f, 0.0f, -3.6f, -1.62f, -3.6f, -3.6f);
                rg2Var3.w(1.62f, -3.6f, 3.6f, -3.6f);
                rg2Var3.w(3.6f, 1.62f, 3.6f, 3.6f);
                rg2Var3.v(13.98f, 15.6f, 12.0f, 15.6f);
                rg2Var3.f();
                hj0.a(hj0Var3, (ArrayList) rg2Var3.f, i12Var3);
                ij0Var3 = hj0Var3.b();
                op1.a = ij0Var3;
            }
            cc2 cc2Var3 = new cc2(wr1Var4, str3, ij0Var3);
            switch (c2.a) {
                case 0:
                    str4 = "Resources";
                    break;
                case 1:
                    str4 = "Recursos";
                    break;
                case 2:
                    str4 = "Ресурсы";
                    break;
                case 3:
                    str4 = "Ресурси";
                    break;
                default:
                    str4 = "资源";
                    break;
            }
            ij0 ij0Var4 = qo.a;
            if (ij0Var4 == null) {
                hj0 hj0Var4 = new hj0("Filled.Folder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i19 = me2.a;
                i12 i12Var4 = new i12(co.b);
                rg2 rg2Var4 = new rg2(21);
                rg2Var4.s(10.0f, 4.0f);
                rg2Var4.n(4.0f);
                rg2Var4.i(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                rg2Var4.q(2.0f, 18.0f);
                rg2Var4.i(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                rg2Var4.o(16.0f);
                rg2Var4.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                rg2Var4.D(8.0f);
                rg2Var4.i(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                rg2Var4.o(-8.0f);
                rg2Var4.r(-2.0f, -2.0f);
                rg2Var4.f();
                hj0.a(hj0Var4, (ArrayList) rg2Var4.f, i12Var4);
                ij0Var4 = hj0Var4.b();
                qo.a = ij0Var4;
            }
            cc2 cc2Var4 = new cc2(wr1Var5, str4, ij0Var4);
            String str5 = "Info";
            switch (c2.a) {
                case 0:
                case 1:
                    break;
                case 2:
                    str5 = "Инфо";
                    break;
                case 3:
                    str5 = "Інфо";
                    break;
                default:
                    str5 = "信息";
                    break;
            }
            ij0 ij0Var5 = io.d;
            if (ij0Var5 == null) {
                hj0 hj0Var5 = new hj0("Filled.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i20 = me2.a;
                i12 i12Var5 = new i12(co.b);
                rg2 rg2Var5 = new rg2(21);
                rg2Var5.s(12.0f, 2.0f);
                rg2Var5.h(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                rg2Var5.w(4.48f, 10.0f, 10.0f, 10.0f);
                rg2Var5.w(10.0f, -4.48f, 10.0f, -10.0f);
                rg2Var5.v(17.52f, 2.0f, 12.0f, 2.0f);
                rg2Var5.f();
                rg2Var5.s(13.0f, 17.0f);
                rg2Var5.o(-2.0f);
                rg2Var5.E(-6.0f);
                rg2Var5.o(2.0f);
                rg2Var5.E(6.0f);
                rg2Var5.f();
                rg2Var5.s(13.0f, 9.0f);
                rg2Var5.o(-2.0f);
                rg2Var5.q(11.0f, 7.0f);
                rg2Var5.o(2.0f);
                rg2Var5.E(2.0f);
                rg2Var5.f();
                hj0.a(hj0Var5, (ArrayList) rg2Var5.f, i12Var5);
                ij0Var5 = hj0Var5.b();
                io.d = ij0Var5;
            }
            final gv gvVar3 = gvVar;
            final wr1 wr1Var8 = wr1Var;
            final l40 l40Var2 = l40Var;
            final uy uyVar3 = uyVar;
            u61.c(go.N(-104316856, new zd(c2, xn.F(cc2Var, cc2Var2, cc2Var3, cc2Var4, new cc2(wr1Var6, str5, ij0Var5)), wr1Var8, gvVar3, l40Var, uyVar, 0), urVar), null, l40Var, false, 0L, go.N(1859205347, new se0() { // from class: ae
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
                        final boolean booleanValue = ((Boolean) urVar2.j(ij2.a)).booleanValue();
                        WeakHashMap weakHashMap = pi2.w;
                        sa saVar = wm1.j(urVar2).g;
                        wr1 wr1Var9 = wr1.this;
                        h32 h32Var = c2;
                        final gv gvVar4 = gvVar3;
                        fq N = go.N(-1778898529, new be(wr1Var9, h32Var, gvVar4, l40Var2, 0), urVar2);
                        final uy uyVar4 = uyVar3;
                        final List list = F2;
                        final bi0 bi0Var2 = bi0Var;
                        final vf2 vf2Var2 = vf2Var;
                        final ew1 ew1Var2 = ew1Var;
                        final co1 co1Var2 = co1Var;
                        final el0 el0Var2 = el0Var;
                        final de0 de0Var3 = de0Var;
                        op1.b(null, N, null, null, null, 0, 0L, 0L, saVar, go.N(521550836, new te0() { // from class: ce
                            /* JADX WARN: Type inference failed for: r4v9, types: [sl0, g02, java.lang.Object] */
                            @Override // defpackage.te0
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                boolean z4;
                                e21 e21Var;
                                float f3;
                                boolean z5;
                                int i21;
                                pc1 pc1Var = (pc1) obj3;
                                ur urVar3 = (ur) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                pc1Var.getClass();
                                if ((intValue2 & 6) == 0) {
                                    if (urVar3.f(pc1Var)) {
                                        i21 = 4;
                                    } else {
                                        i21 = 2;
                                    }
                                    intValue2 |= i21;
                                }
                                boolean z6 = false;
                                if ((intValue2 & 19) != 18) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (urVar3.O(intValue2 & 1, z4)) {
                                    b21 b21Var = b21.a;
                                    if (booleanValue) {
                                        e21Var = hy1.k(b21Var, 720.0f);
                                    } else {
                                        e21Var = b21Var;
                                    }
                                    e21 J2 = sn0.J(b21Var, pc1Var);
                                    p90 p90Var = hy1.c;
                                    e21 d2 = J2.d(p90Var);
                                    j01 d3 = hj.d(g3.g, false);
                                    int hashCode = Long.hashCode(urVar3.T);
                                    sf1 l2 = urVar3.l();
                                    e21 Q = fp.Q(urVar3, d2);
                                    lr.b.getClass();
                                    hs hsVar = kr.b;
                                    urVar3.a0();
                                    if (urVar3.S) {
                                        urVar3.k(hsVar);
                                    } else {
                                        urVar3.k0();
                                    }
                                    op1.q(urVar3, kr.f, d3);
                                    op1.q(urVar3, kr.e, l2);
                                    op1.l(urVar3, Integer.valueOf(hashCode), kr.g);
                                    op1.o(urVar3, kr.h);
                                    op1.q(urVar3, kr.d, Q);
                                    e21 d4 = e21Var.d(p90Var);
                                    Object obj6 = new Object();
                                    tx a = d22.a(urVar3);
                                    Map map = vg2.a;
                                    f22 M = mp0.M(0.0f, 400.0f, Float.valueOf(1.0f), 1);
                                    if ((14 & 16) != 0) {
                                        f3 = 0.5f;
                                    } else {
                                        f3 = 0.1f;
                                    }
                                    if (0.0f > f3 || f3 > 1.0f) {
                                        nl0.a("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f3);
                                    }
                                    c00 c00Var = (c00) urVar3.j(is.h);
                                    jq0 jq0Var = (jq0) urVar3.j(is.n);
                                    int i22 = (14 & 24576) ^ 6;
                                    final uy uyVar5 = uyVar4;
                                    if ((i22 > 4 && urVar3.f(uyVar5)) || (24576 & 6) == 4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    boolean f4 = z5 | urVar3.f(a) | urVar3.f(M);
                                    if ((((24576 & 112) ^ 48) > 32 && urVar3.f(obj6)) || (24576 & 48) == 32) {
                                        z6 = true;
                                    }
                                    boolean f5 = f4 | z6 | urVar3.f(c00Var) | urVar3.d(jq0Var.ordinal());
                                    Object L4 = urVar3.L();
                                    if (f5 || L4 == or.a) {
                                        wc1 wc1Var = new wc1(uyVar5, jq0Var, f3);
                                        ?? obj7 = new Object();
                                        obj7.e = uyVar5;
                                        obj7.f = wc1Var;
                                        c02 c02Var = new c02(obj7, a, M);
                                        urVar3.h0(c02Var);
                                        L4 = c02Var;
                                    }
                                    c02 c02Var2 = (c02) L4;
                                    final List list2 = list;
                                    final bi0 bi0Var3 = bi0Var2;
                                    final gv gvVar5 = gvVar4;
                                    final vf2 vf2Var3 = vf2Var2;
                                    final ew1 ew1Var3 = ew1Var2;
                                    final co1 co1Var3 = co1Var2;
                                    final el0 el0Var3 = el0Var2;
                                    final de0 de0Var4 = de0Var3;
                                    vn.l(uyVar5, d4, null, null, null, c02Var2, false, null, null, null, go.N(55408553, new ue0() { // from class: pd
                                        @Override // defpackage.ue0
                                        public final Object c(Object obj8, Object obj9, Object obj10, Object obj11) {
                                            int intValue3 = ((Integer) obj9).intValue();
                                            ur urVar4 = (ur) obj10;
                                            ((gd1) obj8).getClass();
                                            List list3 = list2;
                                            wr1 wr1Var10 = (wr1) list3.get(intValue3);
                                            int i23 = 0;
                                            if (sn0.r(wr1Var10, wr1.a)) {
                                                urVar4.X(1708015518);
                                                gv gvVar6 = gvVar5;
                                                boolean h2 = urVar4.h(gvVar6);
                                                uy uyVar6 = uyVar5;
                                                boolean f6 = h2 | urVar4.f(uyVar6);
                                                Object L5 = urVar4.L();
                                                if (f6 || L5 == or.a) {
                                                    L5 = new qd(gvVar6, list3, uyVar6, i23);
                                                    urVar4.h0(L5);
                                                }
                                                lh0.b(bi0Var3, (de0) L5, urVar4, 0);
                                                urVar4.p(false);
                                            } else if (sn0.r(wr1Var10, wr1.e)) {
                                                urVar4.X(1708030506);
                                                d6.p(vf2Var3, false, urVar4, 0);
                                                urVar4.p(false);
                                            } else if (sn0.r(wr1Var10, wr1.d)) {
                                                urVar4.X(1708032970);
                                                c01.k(ew1Var3, urVar4, 0);
                                                urVar4.p(false);
                                            } else if (sn0.r(wr1Var10, wr1.c)) {
                                                urVar4.X(1708035468);
                                                bf.m(co1Var3, urVar4, 0);
                                                urVar4.p(false);
                                            } else if (sn0.r(wr1Var10, wr1.b)) {
                                                urVar4.X(1708037885);
                                                c01.d(el0Var3, de0Var4, urVar4, 0);
                                                urVar4.p(false);
                                            } else {
                                                urVar4.X(1409649655);
                                                urVar4.p(false);
                                            }
                                            return od2.a;
                                        }
                                    }, urVar3), urVar3, 100663296);
                                    urVar3.p(true);
                                } else {
                                    urVar3.R();
                                }
                                return od2.a;
                            }
                        }, urVar2), urVar2, 805306416, 253);
                    } else {
                        urVar2.R();
                    }
                    return od2.a;
                }
            }, urVar), urVar, 196614);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new zd(bi0Var, vf2Var, ew1Var, co1Var, el0Var, de0Var, i2);
        }
    }

    public static final void e(e21 e21Var, xj1 xj1Var, fq fqVar, ur urVar, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        fq fqVar2 = sn0.g;
        urVar.Y(-714464401);
        if ((i2 & 6) == 0) {
            if (urVar.f(e21Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (urVar.f(xj1Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (urVar.h(fqVar2)) {
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
            z2 = true;
        } else {
            z2 = false;
        }
        if (urVar.O(i3 & 1, z2)) {
            Object L = urVar.L();
            if (L == or.a) {
                Object je1Var = new je1(null, g3.S);
                urVar.h0(je1Var);
                L = je1Var;
            }
            nh l2 = l(fqVar2, urVar, (i3 >> 6) & 14);
            vn.b(xj1Var.a(l2), go.N(274270255, new be(e21Var, (o41) L, fqVar, l2, 1), urVar), urVar, 56);
        } else {
            urVar.R();
        }
        dl1 r2 = urVar.r();
        if (r2 != null) {
            r2.d = new h9(e21Var, xj1Var, fqVar, i2, 1);
        }
    }

    public static final boolean f(ru1 ru1Var) {
        mu1 k2 = ru1Var.k();
        return !k2.e.c(vu1.i);
    }

    public static final void g(o12 o12Var) {
        int i2 = o12Var.h;
        int[] iArr = o12Var.f;
        Object[] objArr = o12Var.g;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != z) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        o12Var.e = false;
        o12Var.h = i3;
    }

    public static final boolean h(k92 k92Var) {
        f60 f60Var;
        rg1 rg1Var;
        eh1 eh1Var = k92Var.c;
        if (eh1Var != null && (rg1Var = eh1Var.b) != null) {
            f60Var = new f60(rg1Var.b);
        } else {
            f60Var = null;
        }
        boolean z2 = false;
        if (f60Var != null && f60Var.a == 1) {
            z2 = true;
        }
        return !z2;
    }

    public static final boolean i(ru1 ru1Var, Resources resources) {
        boolean z2;
        Object g2 = ru1Var.d.e.g(vu1.a);
        String str = null;
        if (g2 == null) {
            g2 = null;
        }
        List list = (List) g2;
        if (list != null) {
            str = (String) wn.h0(list);
        }
        if (str == null && z(ru1Var) == null && y(ru1Var, resources) == null && !x(ru1Var)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!mp0.A(ru1Var) && (ru1Var.d.g || (ru1Var.n() && z2))) {
            return true;
        }
        return false;
    }

    public static e21 j(e21 e21Var, mv0 mv0Var) {
        return e21Var.d(new bh(0L, mv0Var, d6.w, 1));
    }

    public static final e21 k(e21 e21Var, long j2, kw1 kw1Var) {
        return e21Var.d(new bh(j2, null, kw1Var, 2));
    }

    public static final nh l(fq fqVar, ur urVar, int i2) {
        boolean z2;
        if ((((i2 & 14) ^ 6) > 4 && urVar.f(fqVar)) || (i2 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object L = urVar.L();
        Object obj = or.a;
        if (z2 || L == obj) {
            L = new nh(fqVar);
            urVar.h0(L);
        }
        nh nhVar = (nh) L;
        boolean f2 = urVar.f(nhVar);
        Object L2 = urVar.L();
        if (f2 || L2 == obj) {
            L2 = new r(nhVar, 5);
            urVar.h0(L2);
        }
        bf.d(nhVar, (oe0) L2, urVar);
        return nhVar;
    }

    public static final int m(int[] iArr, int i2, int i3) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else if (i7 > i3) {
                i4 = i6 - 1;
            } else {
                return i6;
            }
        }
        return ~i5;
    }

    public static final int n(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else if (j3 > j2) {
                i3 = i5 - 1;
            } else {
                return i5;
            }
        }
        return ~i4;
    }

    public static final Object o(qz qzVar, de0 de0Var, wt wtVar) {
        Object obj;
        e81 L;
        Object C2;
        a81 a81Var;
        if (((d21) qzVar).e.r) {
            d21 d21Var = (d21) qzVar;
            if (!d21Var.e.r) {
                kl0.b("visitAncestors called on an unattached node");
            }
            d21 d21Var2 = d21Var.e.i;
            ar0 M = hp.M(qzVar);
            loop0: while (true) {
                obj = null;
                if (M == null) {
                    break;
                }
                if ((M.J.f.h & 524288) != 0) {
                    while (d21Var2 != null) {
                        if ((d21Var2.g & 524288) != 0) {
                            d21 d21Var3 = d21Var2;
                            q41 q41Var = null;
                            while (d21Var3 != null) {
                                if (d21Var3 instanceof mj) {
                                    obj = d21Var3;
                                    break loop0;
                                }
                                if ((d21Var3.g & 524288) != 0 && (d21Var3 instanceof rz)) {
                                    int i2 = 0;
                                    for (d21 d21Var4 = ((rz) d21Var3).t; d21Var4 != null; d21Var4 = d21Var4.j) {
                                        if ((d21Var4.g & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                d21Var3 = d21Var4;
                                            } else {
                                                if (q41Var == null) {
                                                    q41Var = new q41(new d21[16]);
                                                }
                                                if (d21Var3 != null) {
                                                    q41Var.b(d21Var3);
                                                    d21Var3 = null;
                                                }
                                                q41Var.b(d21Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                d21Var3 = hp.l(q41Var);
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
            }
            mj mjVar = (mj) obj;
            if (mjVar != null && (C2 = mjVar.C((L = hp.L(qzVar)), new f5(3, de0Var, L), wtVar)) == hv.e) {
                return C2;
            }
        }
        return od2.a;
    }

    public static final void p(long j2, sb1 sb1Var) {
        if (sb1Var == sb1.e) {
            if (us.g(j2) == Integer.MAX_VALUE) {
                nl0.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else {
            if (us.h(j2) != Integer.MAX_VALUE) {
                return;
            }
            nl0.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final e21 q(e21 e21Var, r31 r31Var, dk0 dk0Var, boolean z2, ap1 ap1Var, de0 de0Var) {
        e21 t2;
        if (dk0Var != null) {
            t2 = new hn(r31Var, dk0Var, false, z2, null, ap1Var, de0Var);
        } else if (dk0Var == null) {
            t2 = new hn(r31Var, null, false, z2, null, ap1Var, de0Var);
        } else {
            b21 b21Var = b21.a;
            if (r31Var != null) {
                t2 = ak0.a(b21Var, r31Var, dk0Var).d(new hn(r31Var, null, false, z2, null, ap1Var, de0Var));
            } else {
                t2 = fp.t(b21Var, new jn(dk0Var, z2, ap1Var, de0Var));
            }
        }
        return e21Var.d(t2);
    }

    public static /* synthetic */ e21 r(e21 e21Var, r31 r31Var, zo1 zo1Var, boolean z2, ap1 ap1Var, de0 de0Var, int i2) {
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i2 & 16) != 0) {
            ap1Var = null;
        }
        return q(e21Var, r31Var, zo1Var, z3, ap1Var, de0Var);
    }

    public static e21 s(e21 e21Var, boolean z2, String str, de0 de0Var, int i2) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i2 & 2) != 0) {
            str = null;
        }
        return e21Var.d(new hn(null, null, true, z3, str, null, de0Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d8, code lost:
    
        if (r0 != false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00da, code lost:
    
        if (r15 != 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00dc, code lost:
    
        r5.addLast(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00df, code lost:
    
        r3 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e3, code lost:
    
        r3 = r1;
        r1 = r5;
        r5 = r3;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0140, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0141, code lost:
    
        r12 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0165 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5, types: [lv1] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [lv1] */
    /* JADX WARN: Type inference failed for: r25v0, types: [lv1] */
    /* JADX WARN: Type inference failed for: r4v2, types: [c, vt] */
    /* JADX WARN: Type inference failed for: r4v3, types: [c, vt] */
    /* JADX WARN: Type inference failed for: r4v4, types: [c] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.lv1 r25, defpackage.n90 r26, defpackage.te r27, defpackage.oe1 r28, boolean r29, boolean r30, defpackage.eh r31) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f2.t(lv1, n90, te, oe1, boolean, boolean, eh):java.lang.Object");
    }

    public static final e21 u(e21 e21Var, n4 n4Var, se0 se0Var) {
        return e21Var.d(new q30(n4Var, se0Var));
    }

    public static final e21 v(e21 e21Var, boolean z2, r31 r31Var) {
        e21 e21Var2;
        if (z2) {
            e21Var2 = new vc0(r31Var);
        } else {
            e21Var2 = b21.a;
        }
        return e21Var.d(e21Var2);
    }

    public static final ij0 w() {
        ij0 ij0Var = J;
        if (ij0Var != null) {
            return ij0Var;
        }
        hj0 hj0Var = new hj0("Rounded.CloudDownload", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = me2.a;
        i12 i12Var = new i12(co.b);
        rg2 rg2Var = new rg2(21);
        rg2Var.s(19.35f, 10.04f);
        rg2Var.h(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        rg2Var.h(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
        rg2Var.h(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
        rg2Var.i(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        rg2Var.o(13.0f);
        rg2Var.i(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        rg2Var.i(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        rg2Var.f();
        rg2Var.s(17.0f, 13.0f);
        rg2Var.r(-4.65f, 4.65f);
        rg2Var.i(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f);
        rg2Var.q(7.0f, 13.0f);
        rg2Var.o(3.0f);
        rg2Var.D(9.0f);
        rg2Var.o(4.0f);
        rg2Var.E(4.0f);
        rg2Var.o(3.0f);
        rg2Var.f();
        hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
        ij0 b2 = hj0Var.b();
        J = b2;
        return b2;
    }

    public static final boolean x(ru1 ru1Var) {
        boolean z2;
        Object g2 = ru1Var.d.e.g(vu1.J);
        Object obj = null;
        if (g2 == null) {
            g2 = null;
        }
        ka2 ka2Var = (ka2) g2;
        i41 i41Var = ru1Var.d.e;
        Object g3 = i41Var.g(vu1.y);
        if (g3 == null) {
            g3 = null;
        }
        ap1 ap1Var = (ap1) g3;
        if (ka2Var != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object g4 = i41Var.g(vu1.I);
        if (g4 != null) {
            obj = g4;
        }
        if (((Boolean) obj) != null && (ap1Var == null || ap1Var.a != 4)) {
            return true;
        }
        return z2;
    }

    public static final String y(ru1 ru1Var, Resources resources) {
        float f2;
        int p2;
        mu1 mu1Var = ru1Var.d;
        mu1 mu1Var2 = ru1Var.d;
        Object g2 = mu1Var.e.g(vu1.b);
        String str = null;
        if (g2 == null) {
            g2 = null;
        }
        i41 i41Var = mu1Var2.e;
        Object g3 = i41Var.g(vu1.J);
        if (g3 == null) {
            g3 = null;
        }
        ka2 ka2Var = (ka2) g3;
        Object g4 = i41Var.g(vu1.y);
        if (g4 == null) {
            g4 = null;
        }
        ap1 ap1Var = (ap1) g4;
        if (ka2Var != null) {
            int ordinal = ka2Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (g2 == null) {
                            g2 = resources.getString(R.string.indeterminate);
                        }
                    } else {
                        se.m();
                        return null;
                    }
                } else if (ap1Var != null && ap1Var.a == 2 && g2 == null) {
                    g2 = resources.getString(R.string.state_off);
                }
            } else if (ap1Var != null && ap1Var.a == 2 && g2 == null) {
                g2 = resources.getString(R.string.state_on);
            }
        }
        Object g5 = i41Var.g(vu1.I);
        if (g5 == null) {
            g5 = null;
        }
        Boolean bool = (Boolean) g5;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((ap1Var == null || ap1Var.a != 4) && g2 == null) {
                if (booleanValue) {
                    g2 = resources.getString(R.string.selected);
                } else {
                    g2 = resources.getString(R.string.not_selected);
                }
            }
        }
        Object g6 = i41Var.g(vu1.c);
        if (g6 == null) {
            g6 = null;
        }
        kj1 kj1Var = (kj1) g6;
        if (kj1Var != null) {
            if (kj1Var != kj1.c) {
                if (g2 == null) {
                    rn rnVar = kj1Var.b;
                    float f3 = rnVar.b;
                    float f4 = rnVar.a;
                    if (f3 - f4 == 0.0f) {
                        f2 = 0.0f;
                    } else {
                        f2 = (kj1Var.a - f4) / (rnVar.b - f4);
                    }
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    if (f2 == 0.0f) {
                        p2 = 0;
                    } else if (f2 == 1.0f) {
                        p2 = 100;
                    } else {
                        p2 = go.p(Math.round(f2 * 100.0f), 1, 99);
                    }
                    g2 = resources.getString(R.string.template_percent, Integer.valueOf(p2));
                }
            } else if (g2 == null) {
                g2 = resources.getString(R.string.in_progress);
            }
        }
        zu1 zu1Var = vu1.F;
        if (i41Var.c(zu1Var)) {
            i41 i41Var2 = new ru1(ru1Var.a, true, ru1Var.c, mu1Var2).k().e;
            Object g7 = i41Var2.g(vu1.a);
            if (g7 == null) {
                g7 = null;
            }
            Collection collection = (Collection) g7;
            if (collection == null || collection.isEmpty()) {
                Object g8 = i41Var2.g(vu1.B);
                if (g8 == null) {
                    g8 = null;
                }
                Collection collection2 = (Collection) g8;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g9 = i41Var2.g(zu1Var);
                    if (g9 == null) {
                        g9 = null;
                    }
                    CharSequence charSequence = (CharSequence) g9;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            g2 = str;
        }
        return (String) g2;
    }

    public static final rc z(ru1 ru1Var) {
        Object g2 = ru1Var.d.e.g(vu1.F);
        rc rcVar = null;
        if (g2 == null) {
            g2 = null;
        }
        rc rcVar2 = (rc) g2;
        Object g3 = ru1Var.d.e.g(vu1.B);
        if (g3 == null) {
            g3 = null;
        }
        List list = (List) g3;
        if (list != null) {
            rcVar = (rc) wn.h0(list);
        }
        if (rcVar2 == null) {
            return rcVar;
        }
        return rcVar2;
    }

    public final Object D(int i2, Intent intent) {
        boolean z2;
        switch (this.a) {
            case 0:
                if (i2 != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            default:
                if (i2 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i3 : intArrayExtra) {
                            if (i3 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            arrayList.add(Boolean.valueOf(z2));
                        }
                        ArrayList Q = bf.Q(stringArrayExtra);
                        Iterator it = Q.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(yn.a0(Q, 10), yn.a0(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new xd1(it.next(), it2.next()));
                        }
                        return tz0.e0(arrayList2);
                    }
                }
                return m60.e;
        }
    }
}
