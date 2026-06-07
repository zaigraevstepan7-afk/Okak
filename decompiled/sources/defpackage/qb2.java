package defpackage;

import org.jsoup.internal.SharedConstants;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class qb2 {
    public static final nv1 a = new nv1(17);
    public static final rr0 b = lo.O(xt0.f, new ax0(26));

    public static final void a(lb2 lb2Var, kb2 kb2Var, Object obj, Object obj2, u90 u90Var, ur urVar, int i) {
        int i2;
        boolean z;
        boolean h;
        int i3;
        boolean h2;
        int i4;
        boolean h3;
        int i5;
        int i6;
        int i7;
        urVar.Y(867041821);
        if ((i & 6) == 0) {
            if (urVar.f(lb2Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (urVar.f(kb2Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if ((i & 512) == 0) {
                h3 = urVar.f(obj);
            } else {
                h3 = urVar.h(obj);
            }
            if (h3) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if ((i & 4096) == 0) {
                h2 = urVar.f(obj2);
            } else {
                h2 = urVar.h(obj2);
            }
            if (h2) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if ((32768 & i) == 0) {
                h = urVar.f(u90Var);
            } else {
                h = urVar.h(u90Var);
            }
            if (h) {
                i3 = 16384;
            } else {
                i3 = SharedConstants.DefaultBufferSize;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i2 & 1, z)) {
            if (lb2Var.g()) {
                kb2Var.g(obj, obj2, u90Var);
            } else {
                kb2Var.h(obj2, u90Var);
            }
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new uh(lb2Var, kb2Var, obj, obj2, u90Var, i);
        }
    }

    public static final hb2 b(lb2 lb2Var, ec2 ec2Var, String str, ur urVar, int i, int i2) {
        gb2 gb2Var;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean f = urVar.f(lb2Var);
        Object L = urVar.L();
        Object obj = or.a;
        if (f || L == obj) {
            L = new hb2(lb2Var, ec2Var, str);
            urVar.h0(L);
        }
        hb2 hb2Var = (hb2) L;
        boolean f2 = urVar.f(lb2Var) | urVar.h(hb2Var);
        Object L2 = urVar.L();
        if (f2 || L2 == obj) {
            L2 = new fl1(11, lb2Var, hb2Var);
            urVar.h0(L2);
        }
        bf.d(hb2Var, (oe0) L2, urVar);
        if (lb2Var.g() && (gb2Var = (gb2) hb2Var.b.getValue()) != null) {
            lb2 lb2Var2 = hb2Var.c;
            gb2Var.e.g(gb2Var.g.invoke(lb2Var2.f().b()), gb2Var.g.invoke(lb2Var2.f().c()), (u90) gb2Var.f.invoke(lb2Var2.f()));
        }
        return hb2Var;
    }

    public static final kb2 c(lb2 lb2Var, Object obj, Object obj2, u90 u90Var, ec2 ec2Var, ur urVar, int i) {
        oe0 oe0Var;
        boolean f = urVar.f(lb2Var);
        Object L = urVar.L();
        Object obj3 = or.a;
        if (f || L == obj3) {
            i02 e = nq1.e();
            if (e != null) {
                oe0Var = e.e();
            } else {
                oe0Var = null;
            }
            oe0 oe0Var2 = oe0Var;
            i02 j = nq1.j(e);
            try {
                mc mcVar = (mc) ec2Var.a.invoke(obj2);
                mcVar.d();
                L = new kb2(lb2Var, obj, mcVar, ec2Var);
                nq1.o(e, j, oe0Var2);
                urVar.h0(L);
            } catch (Throwable th) {
                nq1.o(e, j, oe0Var2);
                throw th;
            }
        }
        kb2 kb2Var = (kb2) L;
        a(lb2Var, kb2Var, obj, obj2, u90Var, urVar, 0);
        boolean f2 = urVar.f(lb2Var) | urVar.f(kb2Var);
        Object L2 = urVar.L();
        if (f2 || L2 == obj3) {
            L2 = new fl1(12, lb2Var, kb2Var);
            urVar.h0(L2);
        }
        bf.d(kb2Var, (oe0) L2, urVar);
        return kb2Var;
    }

    public static final lb2 d(ir irVar, String str, ur urVar, int i) {
        boolean z;
        oe0 oe0Var;
        int i2 = (i & 14) ^ 6;
        boolean z2 = true;
        if ((i2 > 4 && urVar.f(irVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object L = urVar.L();
        Object obj = or.a;
        if (z || L == obj) {
            i02 e = nq1.e();
            if (e != null) {
                oe0Var = e.e();
            } else {
                oe0Var = null;
            }
            i02 j = nq1.j(e);
            try {
                Object lb2Var = new lb2(irVar, null, str);
                nq1.o(e, j, oe0Var);
                urVar.h0(lb2Var);
                L = lb2Var;
            } catch (Throwable th) {
                nq1.o(e, j, oe0Var);
                throw th;
            }
        }
        lb2 lb2Var2 = (lb2) L;
        if (irVar instanceof lt1) {
            urVar.X(-1357607479);
            lt1 lt1Var = (lt1) irVar;
            Object value = lt1Var.c.getValue();
            Object value2 = lt1Var.b.getValue();
            if ((i2 <= 4 || !urVar.f(irVar)) && (i & 6) != 4) {
                z2 = false;
            }
            Object L2 = urVar.L();
            if (z2 || L2 == obj) {
                L2 = new iu1(irVar, null);
                urVar.h0(L2);
            }
            bf.j(value, value2, (se0) L2, urVar);
            urVar.p(false);
        } else {
            urVar.X(-1357145920);
            lb2Var2.a(irVar.d(), urVar, 0);
            urVar.p(false);
        }
        boolean f = urVar.f(lb2Var2);
        Object L3 = urVar.L();
        if (f || L3 == obj) {
            L3 = new ob2(lb2Var2, 0);
            urVar.h0(L3);
        }
        bf.d(lb2Var2, (oe0) L3, urVar);
        return lb2Var2;
    }

    public static final lb2 e(Object obj, String str, ur urVar, int i) {
        Object L = urVar.L();
        xl1 xl1Var = or.a;
        if (L == xl1Var) {
            L = new lb2(new p41(obj), null, str);
            urVar.h0(L);
        }
        lb2 lb2Var = (lb2) L;
        lb2Var.a(obj, urVar, (i & 8) | 48 | (i & 14));
        Object L2 = urVar.L();
        if (L2 == xl1Var) {
            L2 = new ob2(lb2Var, 1);
            urVar.h0(L2);
        }
        bf.d(lb2Var, (oe0) L2, urVar);
        return lb2Var;
    }
}
