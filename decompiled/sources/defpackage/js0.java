package defpackage;

import android.view.View;
import com.elixir.loader.R;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class js0 implements te0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ js0(se0 se0Var, qt qtVar, te0 te0Var, de0 de0Var) {
        this.e = 3;
        this.f = se0Var;
        this.g = qtVar;
        this.h = te0Var;
        this.i = de0Var;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        boolean z;
        Object obj4;
        Object oVar;
        float f;
        float f2;
        int i;
        Object obj5 = (pz1) this.f;
        pz1 pz1Var = (pz1) this.g;
        Object obj6 = (y80) this.h;
        Object obj7 = (String) this.i;
        se0 se0Var = (se0) obj;
        ur urVar = (ur) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (urVar.h(se0Var)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if ((intValue & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(intValue & 1, z)) {
            boolean r = sn0.r(obj5, pz1Var);
            u90 a0 = fp.a0(u21.h, urVar);
            boolean f3 = urVar.f(obj5) | urVar.h(obj6);
            Object L = urVar.L();
            int i2 = 3;
            Object obj8 = or.a;
            if (f3 || L == obj8) {
                L = new ii1(i2, obj5, obj6);
                urVar.h0(L);
            }
            de0 de0Var = (de0) L;
            Object L2 = urVar.L();
            if (L2 == obj8) {
                if (!r) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                L2 = fc2.a(f2);
                urVar.h0(L2);
            }
            ya yaVar = (ya) L2;
            Boolean valueOf = Boolean.valueOf(r);
            boolean h = urVar.h(yaVar) | urVar.g(r) | urVar.h(a0) | urVar.f(de0Var);
            Object L3 = urVar.L();
            if (h || L3 == obj8) {
                obj4 = obj8;
                oVar = new o(yaVar, r, a0, de0Var, (vt) null);
                urVar.h0(oVar);
            } else {
                oVar = L3;
                obj4 = obj8;
            }
            bf.i(urVar, (se0) oVar, valueOf);
            hc hcVar = yaVar.c;
            u90 a02 = fp.a0(u21.f, urVar);
            Object L4 = urVar.L();
            if (L4 == obj4) {
                if (!r) {
                    f = 1.0f;
                } else {
                    f = 0.8f;
                }
                L4 = fc2.a(f);
                urVar.h0(L4);
            }
            ya yaVar2 = (ya) L4;
            Boolean valueOf2 = Boolean.valueOf(r);
            boolean h2 = urVar.h(yaVar2) | urVar.g(r) | urVar.h(a02);
            Object L5 = urVar.L();
            if (h2 || L5 == obj4) {
                L5 = new oz1(yaVar2, r, a02, null);
                urVar.h0(L5);
            }
            bf.i(urVar, (se0) L5, valueOf2);
            hc hcVar2 = yaVar2.c;
            e21 y = d6.y(((Number) hcVar2.f.getValue()).floatValue(), ((Number) hcVar2.f.getValue()).floatValue(), ((Number) hcVar.f.getValue()).floatValue(), 0.0f, null, 131064);
            boolean g = urVar.g(r) | urVar.f(obj5) | urVar.f(obj7);
            Object L6 = urVar.L();
            if (g || L6 == obj4) {
                L6 = new r00(i2, obj7, obj5, r);
                urVar.h0(L6);
            }
            e21 a = ou1.a(y, false, (oe0) L6);
            j01 d = hj.d(g3.f, false);
            int x = io.x(urVar);
            sf1 l = urVar.l();
            e21 Q = fp.Q(urVar, a);
            lr.b.getClass();
            de0 de0Var2 = kr.b;
            urVar.a0();
            if (urVar.S) {
                urVar.k(de0Var2);
            } else {
                urVar.k0();
            }
            op1.q(urVar, kr.f, d);
            op1.q(urVar, kr.e, l);
            gb gbVar = kr.g;
            if (urVar.S || !sn0.r(urVar.L(), Integer.valueOf(x))) {
                l90.s(x, urVar, x, gbVar);
            }
            op1.q(urVar, kr.d, Q);
            se0Var.invoke(urVar, Integer.valueOf(intValue & 14));
            urVar.p(true);
        } else {
            urVar.R();
        }
        return od2.a;
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [e42, sl0, java.lang.Object] */
    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        e21 d;
        Object obj4;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        int i;
        boolean z4;
        hs hsVar;
        gb gbVar;
        gb gbVar2;
        String str3;
        boolean z5;
        int i2;
        boolean z6;
        boolean h;
        int i3;
        boolean z7;
        ur urVar;
        od2 od2Var;
        String str4;
        int i4 = this.e;
        e21 e21Var = b21.a;
        vt vtVar = null;
        Object obj5 = or.a;
        od2 od2Var2 = od2.a;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        Object obj9 = this.f;
        boolean z8 = true;
        switch (i4) {
            case 0:
                vs0 vs0Var = (vs0) obj9;
                e21 e21Var2 = (e21) obj8;
                Object obj10 = (ks0) obj7;
                o41 o41Var = (o41) obj6;
                lq1 lq1Var = (lq1) obj;
                ur urVar2 = (ur) obj2;
                ((Integer) obj3).getClass();
                Object L = urVar2.L();
                if (L == obj5) {
                    L = new hs0(lq1Var, new z9(o41Var, 8));
                    urVar2.h0(L);
                }
                Object obj11 = (hs0) L;
                Object L2 = urVar2.L();
                if (L2 == obj5) {
                    ?? obj12 = new Object();
                    obj12.e = obj11;
                    x31 x31Var = t81.a;
                    obj12.f = new x31();
                    L2 = new b42(obj12);
                    urVar2.h0(L2);
                }
                b42 b42Var = (b42) L2;
                if (vs0Var != null) {
                    urVar2.X(1743490539);
                    urVar2.X(887527095);
                    Object obj13 = ni1.a;
                    if (obj13 != null) {
                        urVar2.X(1345554384);
                        z2 = false;
                        urVar2.p(false);
                    } else {
                        urVar2.X(1345603457);
                        View view = (View) urVar2.j(l6.f);
                        boolean f = urVar2.f(view);
                        Object L3 = urVar2.L();
                        if (f || L3 == obj5) {
                            Object tag = view.getTag(R.id.compose_prefetch_scheduler);
                            if (tag instanceof li1) {
                                obj4 = (li1) tag;
                            } else {
                                obj4 = null;
                            }
                            if (obj4 == null) {
                                L3 = new f9(view);
                                view.setTag(R.id.compose_prefetch_scheduler, L3);
                            } else {
                                L3 = obj4;
                            }
                            urVar2.h0(L3);
                        }
                        obj13 = (li1) L3;
                        z2 = false;
                        urVar2.p(false);
                    }
                    Object obj14 = obj13;
                    urVar2.p(z2);
                    Object[] objArr = {vs0Var, obj11, b42Var, obj14};
                    boolean f2 = urVar2.f(vs0Var) | urVar2.h(obj11) | urVar2.h(b42Var) | urVar2.h(obj14);
                    Object L4 = urVar2.L();
                    if (f2 || L4 == obj5) {
                        Object vaVar = new va(vs0Var, obj11, b42Var, obj14, 4);
                        urVar2.h0(vaVar);
                        L4 = vaVar;
                    }
                    oe0 oe0Var = (oe0) L4;
                    boolean z9 = false;
                    for (Object obj15 : Arrays.copyOf(objArr, 4)) {
                        z9 |= urVar2.f(obj15);
                    }
                    Object L5 = urVar2.L();
                    if (z9 || L5 == obj5) {
                        urVar2.h0(new m10(oe0Var));
                    }
                    z = false;
                } else {
                    z = false;
                    urVar2.X(1737291469);
                }
                urVar2.p(z);
                int i5 = ws0.a;
                if (vs0Var != null && (d = e21Var2.d(new vb2(vs0Var))) != null) {
                    e21Var2 = d;
                }
                boolean f3 = urVar2.f(obj11) | urVar2.f(obj10);
                Object L6 = urVar2.L();
                if (f3 || L6 == obj5) {
                    L6 = new u2(18, obj11, obj10);
                    urVar2.h0(L6);
                }
                bf.t(b42Var, e21Var2, (se0) L6, urVar2, 8);
                return od2Var2;
            case 1:
                h32 h32Var = (h32) obj9;
                gv gvVar = (gv) obj8;
                nn nnVar = (nn) obj7;
                ag agVar = (ag) obj6;
                pc1 pc1Var = (pc1) obj;
                ur urVar3 = (ur) obj2;
                int intValue = ((Integer) obj3).intValue();
                pc1Var.getClass();
                if ((intValue & 6) == 0) {
                    if (urVar3.f(pc1Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (urVar3.O(intValue & 1, z3)) {
                    e21 M = sn0.M(sn0.J(hy1.c, pc1Var), 24.0f, 0.0f, 2);
                    yo a = wo.a(c01.h, g3.s, urVar3, 54);
                    int hashCode = Long.hashCode(urVar3.T);
                    sf1 l = urVar3.l();
                    e21 Q = fp.Q(urVar3, M);
                    lr.b.getClass();
                    hs hsVar2 = kr.b;
                    urVar3.a0();
                    if (urVar3.S) {
                        urVar3.k(hsVar2);
                    } else {
                        urVar3.k0();
                    }
                    op1.q(urVar3, kr.f, a);
                    op1.q(urVar3, kr.e, l);
                    op1.l(urVar3, Integer.valueOf(hashCode), kr.g);
                    op1.o(urVar3, kr.h);
                    op1.q(urVar3, kr.d, Q);
                    ij0 ij0Var = op1.b;
                    if (ij0Var == null) {
                        hj0 hj0Var = new hj0("Outlined.VpnKey", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i6 = me2.a;
                        i12 i12Var = new i12(co.b);
                        rg2 rg2Var = new rg2(21);
                        rg2Var.s(22.0f, 19.0f);
                        rg2Var.o(-6.0f);
                        rg2Var.E(-4.0f);
                        rg2Var.o(-2.68f);
                        rg2Var.i(-1.14f, 2.42f, -3.6f, 4.0f, -6.32f, 4.0f);
                        rg2Var.i(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f);
                        rg2Var.w(3.14f, -7.0f, 7.0f, -7.0f);
                        rg2Var.i(2.72f, 0.0f, 5.17f, 1.58f, 6.32f, 4.0f);
                        rg2Var.q(24.0f, 9.0f);
                        rg2Var.E(6.0f);
                        rg2Var.o(-2.0f);
                        rg2Var.E(4.0f);
                        rg2Var.f();
                        rg2Var.s(18.0f, 17.0f);
                        rg2Var.o(2.0f);
                        rg2Var.E(-4.0f);
                        rg2Var.o(2.0f);
                        rg2Var.E(-2.0f);
                        rg2Var.q(11.94f, 11.0f);
                        rg2Var.r(-0.23f, -0.67f);
                        rg2Var.h(11.01f, 8.34f, 9.11f, 7.0f, 7.0f, 7.0f);
                        rg2Var.i(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
                        rg2Var.w(2.24f, 5.0f, 5.0f, 5.0f);
                        rg2Var.i(2.11f, 0.0f, 4.01f, -1.34f, 4.71f, -3.33f);
                        rg2Var.r(0.23f, -0.67f);
                        rg2Var.q(18.0f, 13.0f);
                        rg2Var.E(4.0f);
                        rg2Var.f();
                        rg2Var.s(7.0f, 15.0f);
                        rg2Var.i(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
                        rg2Var.w(1.35f, -3.0f, 3.0f, -3.0f);
                        rg2Var.w(3.0f, 1.35f, 3.0f, 3.0f);
                        rg2Var.w(-1.35f, 3.0f, -3.0f, 3.0f);
                        rg2Var.f();
                        rg2Var.s(7.0f, 11.0f);
                        rg2Var.i(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                        rg2Var.w(0.45f, 1.0f, 1.0f, 1.0f);
                        rg2Var.w(1.0f, -0.45f, 1.0f, -1.0f);
                        rg2Var.w(-0.45f, -1.0f, -1.0f, -1.0f);
                        rg2Var.f();
                        hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
                        ij0Var = hj0Var.b();
                        op1.b = ij0Var;
                    }
                    ij0 ij0Var2 = ij0Var;
                    String e = h32Var.e();
                    b21 b21Var = b21.a;
                    e21 f4 = hy1.f(b21Var, 72.0f);
                    y22 y22Var = oo.a;
                    ej0.a(ij0Var2, e, f4, ((mo) urVar3.j(y22Var)).a, urVar3, 384, 0);
                    xp1.a(urVar3, hy1.c(b21Var, 24.0f));
                    switch (h32Var.a) {
                        case 0:
                            str = "Welcome";
                            break;
                        case 1:
                            str = "Bem-vindo";
                            break;
                        case 2:
                            str = "Добро пожаловать";
                            break;
                        case 3:
                            str = "Ласкаво просимо";
                            break;
                        default:
                            str = "欢迎";
                            break;
                    }
                    String str5 = str;
                    y22 y22Var2 = rc2.a;
                    t82.b(str5, null, ((mo) urVar3.j(y22Var)).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92.a(((pc2) urVar3.j(y22Var2)).c, 0L, 0L, sd0.i, null, 0L, 0L, null, 16777211), urVar3, 0, 0, 131066);
                    switch (h32Var.a) {
                        case 0:
                            str2 = "Sign in to continue";
                            break;
                        case 1:
                            str2 = "Faça login para continuar";
                            break;
                        case 2:
                            str2 = "Войдите, чтобы продолжить";
                            break;
                        case 3:
                            str2 = "Увійдіть, щоб продовжити";
                            break;
                        default:
                            str2 = "登录以继续";
                            break;
                    }
                    t82.b(str2, sn0.O(b21Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), ((mo) urVar3.j(y22Var)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar3.j(y22Var2)).j, urVar3, 48, 0, 131064);
                    xp1.a(urVar3, hy1.c(b21Var, 48.0f));
                    boolean h2 = urVar3.h(gvVar) | urVar3.h(nnVar) | urVar3.h(agVar);
                    Object L7 = urVar3.L();
                    if (h2 || L7 == obj5) {
                        L7 = new qd(gvVar, nnVar, agVar, 12);
                        urVar3.h0(L7);
                    }
                    de0 de0Var = (de0) L7;
                    boolean h3 = urVar3.h(agVar);
                    Object L8 = urVar3.L();
                    if (h3 || L8 == obj5) {
                        L8 = new xx0(agVar, 7);
                        urVar3.h0(L8);
                    }
                    fc2.d(de0Var, (de0) L8, urVar3, 0);
                    urVar3.p(true);
                } else {
                    urVar3.R();
                }
                return od2Var2;
            case 2:
                zm1 zm1Var = (zm1) obj9;
                h32 h32Var2 = (h32) obj8;
                o22 o22Var = (o22) obj7;
                de0 de0Var2 = (de0) obj6;
                ur urVar4 = (ur) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zo) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (urVar4.O(intValue2 & 1, z4)) {
                    ne neVar = c01.g;
                    ii iiVar = g3.r;
                    yo a2 = wo.a(neVar, iiVar, urVar4, 0);
                    int hashCode2 = Long.hashCode(urVar4.T);
                    sf1 l2 = urVar4.l();
                    e21 Q2 = fp.Q(urVar4, e21Var);
                    lr.b.getClass();
                    hs hsVar3 = kr.b;
                    urVar4.a0();
                    if (urVar4.S) {
                        urVar4.k(hsVar3);
                    } else {
                        urVar4.k0();
                    }
                    gb gbVar3 = kr.f;
                    op1.q(urVar4, gbVar3, a2);
                    gb gbVar4 = kr.e;
                    op1.q(urVar4, gbVar4, l2);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    gb gbVar5 = kr.g;
                    op1.l(urVar4, valueOf, gbVar5);
                    i5 i5Var = kr.h;
                    op1.o(urVar4, i5Var);
                    gb gbVar6 = kr.d;
                    op1.q(urVar4, gbVar6, Q2);
                    e21 s = fc2.s(hy1.b(e21Var, 1.0f), 0.75f, false);
                    j01 d2 = hj.d(g3.j, false);
                    int hashCode3 = Long.hashCode(urVar4.T);
                    sf1 l3 = urVar4.l();
                    e21 Q3 = fp.Q(urVar4, s);
                    urVar4.a0();
                    if (urVar4.S) {
                        urVar4.k(hsVar3);
                    } else {
                        urVar4.k0();
                    }
                    op1.q(urVar4, gbVar3, d2);
                    op1.q(urVar4, gbVar4, l3);
                    l90.t(hashCode3, urVar4, gbVar5, urVar4, i5Var);
                    op1.q(urVar4, gbVar6, Q3);
                    lg lgVar = (lg) o22Var.getValue();
                    if (lgVar instanceof kg) {
                        urVar4.X(-1063538047);
                        gbVar2 = gbVar6;
                        gbVar = gbVar3;
                        hsVar = hsVar3;
                        fp.f(((kg) lgVar).a, zm1Var.a, hy1.c, kt.b, urVar4, 24960, 232);
                        urVar4.p(false);
                    } else {
                        hsVar = hsVar3;
                        gbVar = gbVar3;
                        gbVar2 = gbVar6;
                        if (sn0.r(lgVar, jg.a)) {
                            urVar4.X(-1063529046);
                            pj1.a(null, 0L, 0.0f, 0L, 0, 0.0f, urVar4, 0, 63);
                            urVar4.p(false);
                        } else if (sn0.r(lgVar, ig.a)) {
                            urVar4.X(1390417893);
                            ij0 t = pp1.t();
                            switch (h32Var2.a) {
                                case 0:
                                case 1:
                                    str3 = "Avatar";
                                    break;
                                case 2:
                                case 3:
                                    str3 = "Аватар";
                                    break;
                                default:
                                    str3 = "虚拟形象";
                                    break;
                            }
                            ej0.a(t, str3, hy1.f(e21Var, 48.0f), co.b(((mo) urVar4.j(oo.a)).s, 0.4f), urVar4, 384, 0);
                            urVar4 = urVar4;
                            urVar4.p(false);
                        } else {
                            urVar4.X(-1063539810);
                            urVar4.p(false);
                            se.m();
                            return null;
                        }
                    }
                    urVar4.p(true);
                    e21 N = sn0.N(hy1.b(e21Var, 1.0f), 16.0f, 10.0f, 4.0f, 10.0f);
                    up1 a3 = tp1.a(c01.e, g3.p, urVar4, 48);
                    int hashCode4 = Long.hashCode(urVar4.T);
                    sf1 l4 = urVar4.l();
                    e21 Q4 = fp.Q(urVar4, N);
                    urVar4.a0();
                    if (urVar4.S) {
                        urVar4.k(hsVar);
                    } else {
                        urVar4.k0();
                    }
                    op1.q(urVar4, gbVar, a3);
                    op1.q(urVar4, gbVar4, l4);
                    l90.t(hashCode4, urVar4, gbVar5, urVar4, i5Var);
                    op1.q(urVar4, gbVar2, Q4);
                    pr0 pr0Var = new pr0(1.0f, true);
                    yo a4 = wo.a(neVar, iiVar, urVar4, 0);
                    int hashCode5 = Long.hashCode(urVar4.T);
                    sf1 l5 = urVar4.l();
                    e21 Q5 = fp.Q(urVar4, pr0Var);
                    urVar4.a0();
                    if (urVar4.S) {
                        urVar4.k(hsVar);
                    } else {
                        urVar4.k0();
                    }
                    op1.q(urVar4, gbVar, a4);
                    op1.q(urVar4, gbVar4, l5);
                    l90.t(hashCode5, urVar4, gbVar5, urVar4, i5Var);
                    op1.q(urVar4, gbVar2, Q5);
                    String str6 = zm1Var.a;
                    y22 y22Var3 = rc2.a;
                    k92 a5 = k92.a(((pc2) urVar4.j(y22Var3)).k, 0L, 0L, sd0.h, null, 0L, 0L, null, 16777211);
                    y22 y22Var4 = oo.a;
                    ur urVar5 = urVar4;
                    t82.b(str6, null, ((mo) urVar4.j(y22Var4)).q, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, a5, urVar5, 0, 24576, 114682);
                    t82.b(bf.T(zm1Var.d), null, ((mo) urVar4.j(y22Var4)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar4.j(y22Var3)).l, urVar5, 0, 0, 131066);
                    urVar4.p(true);
                    sn0.f(de0Var2, null, false, null, null, go.N(-641198293, new sd(h32Var2, 17), urVar4), urVar4, 1572864, 62);
                    urVar4.p(true);
                    urVar4.p(true);
                } else {
                    urVar4.R();
                }
                return od2Var2;
            case 3:
                se0 se0Var = (se0) obj9;
                qt qtVar = (qt) obj8;
                te0 te0Var = (te0) obj7;
                de0 de0Var3 = (de0) obj6;
                pt ptVar = (pt) obj;
                ur urVar6 = (ur) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    if (urVar6.f(ptVar)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue3 |= i2;
                }
                if ((intValue3 & 19) != 18) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (urVar6.O(intValue3 & 1, z5)) {
                    String str7 = (String) se0Var.invoke(urVar6, 0);
                    if (i32.N(str7)) {
                        nl0.c("Label must not be blank");
                    }
                    qtVar.getClass();
                    bf.p.d(str7, Boolean.TRUE, ptVar, te0Var, de0Var3, urVar6, Integer.valueOf((intValue3 << 9) & 7168));
                } else {
                    urVar6.R();
                }
                return od2Var2;
            case 4:
                ag agVar2 = (ag) obj9;
                o22 o22Var2 = (o22) obj8;
                h32 h32Var3 = (h32) obj7;
                o22 o22Var3 = (o22) obj6;
                h80 h80Var = (h80) obj;
                ur urVar7 = (ur) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                h80Var.getClass();
                if ((intValue4 & 6) == 0) {
                    if ((intValue4 & 8) == 0) {
                        h = urVar7.f(h80Var);
                    } else {
                        h = urVar7.h(h80Var);
                    }
                    if (h) {
                        i3 = 4;
                    } else {
                        i3 = 2;
                    }
                    intValue4 |= i3;
                }
                if ((intValue4 & 19) != 18) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (urVar7.O(intValue4 & 1, z6)) {
                    e21 b = h80Var.b(e21Var);
                    boolean h4 = urVar7.h(agVar2) | urVar7.f(o22Var2);
                    Object L9 = urVar7.L();
                    if (h4 || L9 == obj5) {
                        L9 = new by0(agVar2, o22Var2, 1);
                        urVar7.h0(L9);
                    }
                    int i7 = 0;
                    e21 s2 = f2.s(b, false, null, (de0) L9, 15);
                    int i8 = yv0.a;
                    cw0.a(go.N(1250468783, new sd(h32Var3, 15), urVar7), s2, go.N(-1507550094, new cy0(h32Var3, o22Var3, i7), urVar7), go.N(-1914573580, new dy0(o22Var2, i7), urVar7), yv0.a(co.f, urVar7), urVar7, 199686, 404);
                    boolean booleanValue = ((Boolean) o22Var2.getValue()).booleanValue();
                    boolean h5 = urVar7.h(agVar2);
                    Object L10 = urVar7.L();
                    if (h5 || L10 == obj5) {
                        L10 = new xx0(agVar2, 6);
                        urVar7.h0(L10);
                    }
                    h80Var.a(booleanValue, (de0) L10, null, null, false, null, 0L, 0.0f, go.N(982228879, new y2(4, h32Var3, agVar2), urVar7), urVar7, 0, 6 | ((intValue4 << 3) & 112));
                } else {
                    urVar7.R();
                }
                return od2Var2;
            case 5:
                t7 t7Var = (t7) obj9;
                zm1 zm1Var2 = (zm1) obj8;
                de0 de0Var4 = (de0) obj7;
                de0 de0Var5 = (de0) obj6;
                ur urVar8 = (ur) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((zo) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (urVar8.O(intValue5 & 1, z7)) {
                    ne neVar2 = c01.g;
                    ii iiVar2 = g3.r;
                    yo a6 = wo.a(neVar2, iiVar2, urVar8, 0);
                    int hashCode6 = Long.hashCode(urVar8.T);
                    sf1 l6 = urVar8.l();
                    e21 Q6 = fp.Q(urVar8, e21Var);
                    lr.b.getClass();
                    hs hsVar4 = kr.b;
                    urVar8.a0();
                    if (urVar8.S) {
                        urVar8.k(hsVar4);
                    } else {
                        urVar8.k0();
                    }
                    gb gbVar7 = kr.f;
                    op1.q(urVar8, gbVar7, a6);
                    gb gbVar8 = kr.e;
                    op1.q(urVar8, gbVar8, l6);
                    Integer valueOf2 = Integer.valueOf(hashCode6);
                    gb gbVar9 = kr.g;
                    op1.l(urVar8, valueOf2, gbVar9);
                    i5 i5Var2 = kr.h;
                    op1.o(urVar8, i5Var2);
                    gb gbVar10 = kr.d;
                    op1.q(urVar8, gbVar10, Q6);
                    if (t7Var != null) {
                        urVar8.X(-245734352);
                        String str8 = zm1Var2.a;
                        e21 c = hy1.c(hy1.b(e21Var, 1.0f), 160.0f);
                        boolean f5 = urVar8.f(de0Var4);
                        Object L11 = urVar8.L();
                        if (f5 || L11 == obj5) {
                            L11 = new og0(de0Var4, 6);
                            urVar8.h0(L11);
                        }
                        fp.f(t7Var, str8, f2.s(c, false, null, (de0) L11, 15), kt.a, urVar8, 24576, 232);
                        urVar = urVar8;
                        urVar.p(false);
                        od2Var = od2Var2;
                    } else {
                        urVar = urVar8;
                        urVar.X(-245350541);
                        e21 c2 = hy1.c(hy1.b(e21Var, 1.0f), 100.0f);
                        boolean f6 = urVar.f(de0Var4);
                        Object L12 = urVar.L();
                        if (f6 || L12 == obj5) {
                            L12 = new og0(de0Var4, 7);
                            urVar.h0(L12);
                        }
                        od2Var = od2Var2;
                        e21 s3 = f2.s(c2, false, null, (de0) L12, 15);
                        j01 d3 = hj.d(g3.j, false);
                        int hashCode7 = Long.hashCode(urVar.T);
                        sf1 l7 = urVar.l();
                        e21 Q7 = fp.Q(urVar, s3);
                        urVar.a0();
                        if (urVar.S) {
                            urVar.k(hsVar4);
                        } else {
                            urVar.k0();
                        }
                        op1.q(urVar, gbVar7, d3);
                        op1.q(urVar, gbVar8, l7);
                        l90.t(hashCode7, urVar, gbVar9, urVar, i5Var2);
                        op1.q(urVar, gbVar10, Q7);
                        ij0 L13 = qo.L();
                        switch (jx0.c(urVar).a) {
                            case 0:
                                str4 = "Image";
                                break;
                            case 1:
                                str4 = "Imagem";
                                break;
                            case 2:
                                str4 = "Изображение";
                                break;
                            case 3:
                                str4 = "Зображення";
                                break;
                            default:
                                str4 = "图片";
                                break;
                        }
                        ej0.a(L13, str4, hy1.f(e21Var, 40.0f), co.b(((mo) urVar.j(oo.a)).s, 0.4f), urVar, 384, 0);
                        urVar.p(true);
                        urVar.p(false);
                    }
                    e21 N2 = sn0.N(hy1.b(e21Var, 1.0f), 16.0f, 10.0f, 4.0f, 10.0f);
                    up1 a7 = tp1.a(c01.e, g3.p, urVar, 48);
                    int hashCode8 = Long.hashCode(urVar.T);
                    sf1 l8 = urVar.l();
                    e21 Q8 = fp.Q(urVar, N2);
                    urVar.a0();
                    if (urVar.S) {
                        urVar.k(hsVar4);
                    } else {
                        urVar.k0();
                    }
                    op1.q(urVar, gbVar7, a7);
                    op1.q(urVar, gbVar8, l8);
                    l90.t(hashCode8, urVar, gbVar9, urVar, i5Var2);
                    op1.q(urVar, gbVar10, Q8);
                    pr0 pr0Var2 = new pr0(1.0f, true);
                    yo a8 = wo.a(neVar2, iiVar2, urVar, 0);
                    int hashCode9 = Long.hashCode(urVar.T);
                    sf1 l9 = urVar.l();
                    e21 Q9 = fp.Q(urVar, pr0Var2);
                    urVar.a0();
                    if (urVar.S) {
                        urVar.k(hsVar4);
                    } else {
                        urVar.k0();
                    }
                    op1.q(urVar, gbVar7, a8);
                    op1.q(urVar, gbVar8, l9);
                    l90.t(hashCode9, urVar, gbVar9, urVar, i5Var2);
                    op1.q(urVar, gbVar10, Q9);
                    String str9 = zm1Var2.a;
                    y22 y22Var5 = rc2.a;
                    k92 a9 = k92.a(((pc2) urVar.j(y22Var5)).k, 0L, 0L, sd0.h, null, 0L, 0L, null, 16777211);
                    y22 y22Var6 = oo.a;
                    ur urVar9 = urVar;
                    t82.b(str9, null, ((mo) urVar.j(y22Var6)).q, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, a9, urVar9, 0, 24576, 114682);
                    t82.b(bf.T(zm1Var2.d), null, ((mo) urVar.j(y22Var6)).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar.j(y22Var5)).l, urVar9, 0, 0, 131066);
                    urVar.p(true);
                    sn0.f(de0Var5, null, false, null, null, go.N(496574555, new nd(jx0.c(urVar).b(), 5), urVar), urVar, 1572864, 62);
                    urVar.p(true);
                    urVar.p(true);
                    return od2Var;
                }
                urVar8.R();
                return od2Var2;
            case 6:
                return b(obj, obj2, obj3);
            default:
                i12 i12Var2 = (i12) obj9;
                gu0 gu0Var = (gu0) obj8;
                i82 i82Var = (i82) obj7;
                long j = i82Var.b;
                c91 c91Var = (c91) obj6;
                e21 e21Var3 = (e21) obj;
                ur urVar10 = (ur) obj2;
                ((Integer) obj3).getClass();
                urVar10.X(-84507373);
                boolean booleanValue2 = ((Boolean) urVar10.j(is.w)).booleanValue();
                boolean g = urVar10.g(booleanValue2);
                Object L14 = urVar10.L();
                if (g || L14 == obj5) {
                    L14 = new yv(booleanValue2);
                    urVar10.h0(L14);
                }
                yv yvVar = (yv) L14;
                if (i12Var2.a == 16) {
                    z8 = false;
                }
                if (((Boolean) ((zt0) ((oh2) urVar10.j(is.t))).c.getValue()).booleanValue() && gu0Var.b() && d92.c(j) && z8) {
                    urVar10.X(-707487962);
                    rc rcVar = i82Var.a;
                    d92 d92Var = new d92(j);
                    boolean h6 = urVar10.h(yvVar);
                    Object L15 = urVar10.L();
                    if (h6 || L15 == obj5) {
                        L15 = new vf(yvVar, vtVar, 14);
                        urVar10.h0(L15);
                    }
                    bf.j(rcVar, d92Var, (se0) L15, urVar10);
                    boolean h7 = urVar10.h(yvVar) | urVar10.h(c91Var) | urVar10.f(i82Var) | urVar10.h(gu0Var) | urVar10.f(i12Var2);
                    Object L16 = urVar10.L();
                    if (h7 || L16 == obj5) {
                        L16 = new k2(yvVar, c91Var, i82Var, gu0Var, i12Var2, 4);
                        urVar10.h0(L16);
                    }
                    e21Var = rx.v(e21Var3, (oe0) L16);
                    urVar10.p(false);
                } else {
                    urVar10.X(-705473241);
                    urVar10.p(false);
                }
                urVar10.p(false);
                return e21Var;
        }
    }

    public /* synthetic */ js0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
    }
}
