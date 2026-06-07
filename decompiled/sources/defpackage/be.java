package defpackage;

import com.topjohnwu.superuser.nio.FileSystemManager;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class be implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ be(el0 el0Var, de0 de0Var, o41 o41Var, h32 h32Var) {
        this.e = 2;
        this.f = el0Var;
        this.h = de0Var;
        this.i = o41Var;
        this.g = h32Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.e;
        xl1 xl1Var = or.a;
        boolean z3 = false;
        int i2 = 2;
        od2 od2Var = od2.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        int i3 = 1;
        switch (i) {
            case 0:
                wr1 wr1Var = (wr1) obj6;
                h32 h32Var = (h32) obj5;
                gv gvVar = (gv) obj4;
                l40 l40Var = (l40) obj3;
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                if (urVar.O(intValue & 1, z3)) {
                    hd.a(go.N(161574682, new u2(i3, wr1Var, h32Var), urVar), null, go.N(-779345960, new l1(gvVar, l40Var, h32Var, i2), urVar), null, 0.0f, null, null, null, urVar, 390);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 1:
                e21 e21Var = (e21) obj6;
                o41 o41Var = (o41) obj5;
                fq fqVar = (fq) obj4;
                nh nhVar = (nh) obj3;
                ur urVar2 = (ur) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar2.O(intValue2 & 1, z)) {
                    Object L = urVar2.L();
                    if (L == xl1Var) {
                        L = new aa(o41Var, 1);
                        urVar2.h0(L);
                    }
                    e21 C = f2.C(e21Var, (oe0) L);
                    j01 d = hj.d(g3.f, true);
                    int hashCode = Long.hashCode(urVar2.T);
                    sf1 l = urVar2.l();
                    e21 Q = fp.Q(urVar2, C);
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
                    op1.l(urVar2, Integer.valueOf(hashCode), kr.g);
                    op1.o(urVar2, kr.h);
                    op1.q(urVar2, kr.d, Q);
                    fqVar.invoke(urVar2, 0);
                    Object L2 = urVar2.L();
                    if (L2 == xl1Var) {
                        L2 = new z9(o41Var, 1);
                        urVar2.h0(L2);
                    }
                    nhVar.b((de0) L2, urVar2, 6);
                    urVar2.p(true);
                } else {
                    urVar2.R();
                }
                return od2Var;
            case 2:
                el0 el0Var = (el0) obj6;
                de0 de0Var = (de0) obj4;
                o41 o41Var2 = (o41) obj3;
                h32 h32Var2 = (h32) obj5;
                ur urVar3 = (ur) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                }
                if (urVar3.O(intValue3 & 1, z3)) {
                    boolean h = urVar3.h(el0Var) | urVar3.f(de0Var);
                    Object L3 = urVar3.L();
                    if (h || L3 == xl1Var) {
                        L3 = new qd(el0Var, de0Var, o41Var2, 9);
                        urVar3.h0(L3);
                    }
                    rc1 rc1Var = sk.a;
                    sn0.b((de0) L3, null, false, null, sk.a(((mo) urVar3.j(oo.a)).w, 0L, urVar3, 14), null, null, null, go.N(2073666350, new gh0(h32Var2, 4), urVar3), urVar3, FileSystemManager.MODE_READ_WRITE, 494);
                } else {
                    urVar3.R();
                }
                return od2Var;
            case 3:
                ((Integer) obj2).getClass();
                xn.e((de0) obj6, (e21) obj5, (vs0) obj4, (ks0) obj3, (ur) obj, lo.b0(1));
                return od2Var;
            case 4:
                ((Integer) obj2).getClass();
                fc2.l((ag) obj6, (de0) obj5, (de0) obj4, (fq) obj3, (ur) obj, lo.b0(3081));
                return od2Var;
            case 5:
                ((Integer) obj2).getClass();
                fc2.h((String) obj6, (String) obj5, (ij0) obj4, (de0) obj3, (ur) obj, lo.b0(1));
                return od2Var;
            case 6:
                ((Integer) obj2).getClass();
                bf.a((zm1) obj6, (se0) obj5, (de0) obj4, (e21) obj3, (ur) obj, lo.b0(1));
                return od2Var;
            default:
                o41 o41Var3 = (o41) obj6;
                o72 o72Var = (o72) obj5;
                pc1 pc1Var = (pc1) obj4;
                fq fqVar2 = (fq) obj3;
                ur urVar4 = (ur) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar4.O(intValue4 & 1, z2)) {
                    e21 v = rx.v(sn0.G(b21.a, "Container"), new k1(new tj1(o41Var3, o41.class, "value", "getValue()Ljava/lang/Object;", 0), pc1Var, pp1.p(o72Var), 13));
                    j01 d2 = hj.d(g3.f, true);
                    int x = io.x(urVar4);
                    sf1 l2 = urVar4.l();
                    e21 Q2 = fp.Q(urVar4, v);
                    lr.b.getClass();
                    hs hsVar2 = kr.b;
                    urVar4.a0();
                    if (urVar4.S) {
                        urVar4.k(hsVar2);
                    } else {
                        urVar4.k0();
                    }
                    op1.q(urVar4, kr.f, d2);
                    op1.q(urVar4, kr.e, l2);
                    gb gbVar = kr.g;
                    if (urVar4.S || !sn0.r(urVar4.L(), Integer.valueOf(x))) {
                        l90.s(x, urVar4, x, gbVar);
                    }
                    op1.q(urVar4, kr.d, Q2);
                    fqVar2.invoke(urVar4, 0);
                    urVar4.p(true);
                } else {
                    urVar4.R();
                }
                return od2Var;
        }
    }

    public /* synthetic */ be(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }

    public /* synthetic */ be(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.e = i2;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }
}
