package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class l1 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ l1(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.e;
        xl1 xl1Var = or.a;
        int i2 = 0;
        od2 od2Var = od2.a;
        Object obj3 = this.g;
        Object obj4 = this.h;
        Object obj5 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                c01.h((uu0) obj5, (oe0) obj3, (de0) obj4, (ur) obj, lo.b0(1));
                return od2Var;
            case 1:
                e21 e21Var = (e21) obj5;
                o41 o41Var = (o41) obj3;
                fq fqVar = (fq) obj4;
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    Object L = urVar.L();
                    if (L == xl1Var) {
                        L = new aa(o41Var, 0);
                        urVar.h0(L);
                    }
                    e21 C = f2.C(e21Var, (oe0) L);
                    j01 d = hj.d(g3.f, true);
                    int hashCode = Long.hashCode(urVar.T);
                    sf1 l = urVar.l();
                    e21 Q = fp.Q(urVar, C);
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
                    op1.l(urVar, Integer.valueOf(hashCode), kr.g);
                    op1.o(urVar, kr.h);
                    op1.q(urVar, kr.d, Q);
                    fqVar.invoke(urVar, 0);
                    urVar.p(true);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 2:
                gv gvVar = (gv) obj5;
                l40 l40Var = (l40) obj3;
                h32 h32Var = (h32) obj4;
                ur urVar2 = (ur) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar2.O(intValue2 & 1, z2)) {
                    boolean h = urVar2.h(gvVar) | urVar2.f(l40Var);
                    Object L2 = urVar2.L();
                    if (h || L2 == xl1Var) {
                        L2 = new rd(gvVar, l40Var);
                        urVar2.h0(L2);
                    }
                    sn0.f((de0) L2, null, false, null, null, go.N(-726295942, new sd(h32Var, i2), urVar2), urVar2, 1572864, 62);
                } else {
                    urVar2.R();
                }
                return od2Var;
            case 3:
                ((Integer) obj2).getClass();
                vn.e((e21) obj5, (b82) obj3, (fq) obj4, (ur) obj, lo.b0(385));
                return od2Var;
            case 4:
                ((Integer) obj2).getClass();
                c01.b((kd) obj5, (cg0) obj4, (oe0) obj3, (ur) obj, lo.b0(49));
                return od2Var;
            case 5:
                ((Integer) obj2).getClass();
                jx0.a((rw) obj5, (Context) obj3, (fq) obj4, (ur) obj, lo.b0(385));
                return od2Var;
            case 6:
                h32 h32Var2 = (h32) obj5;
                o22 o22Var = (o22) obj3;
                o41 o41Var2 = (o41) obj4;
                ur urVar3 = (ur) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (urVar3.O(intValue3 & 1, z3)) {
                    if (((Boolean) o22Var.getValue()).booleanValue()) {
                        urVar3.X(-1069523413);
                        ej0.a(c01.x(), h32Var2.f(), null, ((mo) urVar3.j(oo.a)).a, urVar3, 0, 4);
                        urVar3.p(false);
                    } else if (((String) o41Var2.getValue()).length() > 0) {
                        urVar3.X(-1069243979);
                        ej0.a(io.y(), h32Var2.d(), null, ((mo) urVar3.j(oo.a)).w, urVar3, 0, 4);
                        urVar3.p(false);
                    } else {
                        urVar3.X(-1069016222);
                        urVar3.p(false);
                    }
                } else {
                    urVar3.R();
                }
                return od2Var;
            case 7:
                e21 e21Var2 = (e21) obj5;
                fs1 fs1Var = (fs1) obj3;
                fq fqVar2 = (fq) obj4;
                ur urVar4 = (ur) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (urVar4.O(intValue4 & 1, z4)) {
                    e21 R = rx.R(f2.F(sn0.M(e21Var2, 0.0f, w01.a, 1)), fs1Var);
                    yo a = wo.a(c01.g, g3.r, urVar4, 0);
                    int x = io.x(urVar4);
                    sf1 l2 = urVar4.l();
                    e21 Q2 = fp.Q(urVar4, R);
                    lr.b.getClass();
                    hs hsVar2 = kr.b;
                    urVar4.a0();
                    if (urVar4.S) {
                        urVar4.k(hsVar2);
                    } else {
                        urVar4.k0();
                    }
                    op1.q(urVar4, kr.f, a);
                    op1.q(urVar4, kr.e, l2);
                    gb gbVar = kr.g;
                    if (urVar4.S || !sn0.r(urVar4.L(), Integer.valueOf(x))) {
                        l90.s(x, urVar4, x, gbVar);
                    }
                    op1.q(urVar4, kr.d, Q2);
                    fqVar2.invoke(zo.a, urVar4, 6);
                    urVar4.p(true);
                } else {
                    urVar4.R();
                }
                return od2Var;
            case 8:
                ((Integer) obj2).getClass();
                io.f((d51) obj5, (lq1) obj3, (fq) obj4, (ur) obj, lo.b0(385));
                return od2Var;
            case 9:
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                rx.C((gv) obj5, null, new h61(floatValue, (lt1) obj3, (d51) obj4, (vt) null), 3);
                return od2Var;
            case 10:
                ((Integer) obj2).getClass();
                bf.r((String) obj5, (ij0) obj3, (de0) obj4, (ur) obj, lo.b0(1));
                return od2Var;
            case 11:
                tl1 tl1Var = (tl1) obj5;
                at1 at1Var = (at1) obj3;
                float floatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long h2 = at1Var.h(at1Var.d(floatValue2 - tl1Var.e));
                at1 at1Var2 = ((ys1) obj4).a;
                tl1Var.e += at1Var.d(at1Var.g(at1Var2.c(at1Var2.k, h2, 1)));
                return od2Var;
            case 12:
                ((Integer) obj2).getClass();
                pp1.e((sz1) obj5, (e21) obj3, (te0) obj4, (ur) obj, lo.b0(7));
                return od2Var;
            case 13:
                ((Integer) obj2).getClass();
                d6.o((ArrayList) obj5, (oe0) obj3, (h32) obj4, (ur) obj, lo.b0(1));
                return od2Var;
            default:
                ((Integer) obj2).getClass();
                d6.n((ef2) obj5, (de0) obj4, (h32) obj3, (ur) obj, lo.b0(1));
                return od2Var;
        }
    }

    public /* synthetic */ l1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.e = i2;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
    }

    public /* synthetic */ l1(Object obj, Object obj2, Object obj3, int i, int i2, boolean z) {
        this.e = i2;
        this.f = obj;
        this.h = obj2;
        this.g = obj3;
    }
}
