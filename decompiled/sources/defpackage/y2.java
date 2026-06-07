package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class y2 implements te0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ y2(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        int i;
        Typeface typeface;
        int i2 = this.e;
        int i3 = 6;
        vt vtVar = null;
        b21 b21Var = b21.a;
        xl1 xl1Var = or.a;
        od2 od2Var = od2.a;
        int i4 = 1;
        Object obj4 = this.g;
        Object obj5 = this.f;
        boolean z4 = false;
        int i5 = 0;
        boolean z5 = false;
        switch (i2) {
            case 0:
                jq0 jq0Var = (jq0) obj5;
                fq fqVar = (fq) obj4;
                ur urVar = (ur) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 17) != 16) {
                    z4 = true;
                }
                if (urVar.O(intValue & 1, z4)) {
                    vn.b(is.n.a(jq0Var), fqVar, urVar, 8);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 1:
                oe0 oe0Var = (oe0) obj5;
                pt ptVar = (pt) obj4;
                ur urVar2 = (ur) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar2.O(intValue2 & 1, z)) {
                    Object L = urVar2.L();
                    if (L == xl1Var) {
                        L = new qt();
                        urVar2.h0(L);
                    }
                    qt qtVar = (qt) L;
                    qtVar.a.clear();
                    oe0Var.invoke(qtVar);
                    qtVar.a(ptVar, urVar2, 0);
                } else {
                    urVar2.R();
                }
                return od2Var;
            case 2:
                bl0 bl0Var = (bl0) obj5;
                Context context = (Context) obj4;
                ur urVar3 = (ur) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((tr0) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar3.O(intValue3 & 1, z2)) {
                    yo a = wo.a(new pe(2.0f, true, new le(z4 ? 1 : 0)), g3.r, urVar3, 6);
                    int hashCode = Long.hashCode(urVar3.T);
                    sf1 l = urVar3.l();
                    e21 Q = fp.Q(urVar3, b21Var);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar3.a0();
                    if (urVar3.S) {
                        urVar3.k(hsVar);
                    } else {
                        urVar3.k0();
                    }
                    op1.q(urVar3, kr.f, a);
                    op1.q(urVar3, kr.e, l);
                    op1.l(urVar3, Integer.valueOf(hashCode), kr.g);
                    op1.o(urVar3, kr.h);
                    op1.q(urVar3, kr.d, Q);
                    kd kdVar = bl0Var.b;
                    boolean h = urVar3.h(context);
                    Object L2 = urVar3.L();
                    if (h || L2 == xl1Var) {
                        L2 = new xk0(context, z4 ? 1 : 0);
                        urVar3.h0(L2);
                    }
                    c01.b(kdVar, cg0.e, (oe0) L2, urVar3, 48);
                    kd kdVar2 = bl0Var.c;
                    boolean h2 = urVar3.h(context);
                    Object L3 = urVar3.L();
                    if (h2 || L3 == xl1Var) {
                        L3 = new xk0(context, i4);
                        urVar3.h0(L3);
                    }
                    c01.b(kdVar2, cg0.f, (oe0) L3, urVar3, 48);
                    urVar3.p(true);
                } else {
                    urVar3.R();
                }
                return od2Var;
            case 3:
                h32 h32Var = (h32) obj5;
                String str2 = (String) obj4;
                ur urVar4 = (ur) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((zo) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (urVar4.O(intValue4 & 1, z3)) {
                    e21 K = sn0.K(b21Var, 20.0f);
                    yo a2 = wo.a(c01.g, g3.r, urVar4, 0);
                    int hashCode2 = Long.hashCode(urVar4.T);
                    sf1 l2 = urVar4.l();
                    e21 Q2 = fp.Q(urVar4, K);
                    lr.b.getClass();
                    hs hsVar2 = kr.b;
                    urVar4.a0();
                    if (urVar4.S) {
                        urVar4.k(hsVar2);
                    } else {
                        urVar4.k0();
                    }
                    op1.q(urVar4, kr.f, a2);
                    op1.q(urVar4, kr.e, l2);
                    op1.l(urVar4, Integer.valueOf(hashCode2), kr.g);
                    op1.o(urVar4, kr.h);
                    op1.q(urVar4, kr.d, Q2);
                    switch (h32Var.a) {
                        case 0:
                            str = "License Key";
                            break;
                        case 1:
                            str = "Chave de Licença";
                            break;
                        case 2:
                            str = "Лицензионный ключ";
                            break;
                        case 3:
                            str = "Ліцензійний ключ";
                            break;
                        default:
                            str = "许可证密钥";
                            break;
                    }
                    String str3 = str;
                    y22 y22Var = rc2.a;
                    k92 k92Var = ((pc2) urVar4.j(y22Var)).m;
                    y22 y22Var2 = oo.a;
                    t82.b(str3, null, co.b(((mo) urVar4.j(y22Var2)).d, 0.7f), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92Var, urVar4, 0, 0, 131066);
                    xp1.a(urVar4, hy1.c(b21Var, 8.0f));
                    t82.b(str2, null, ((mo) urVar4.j(y22Var2)).d, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92.a(((pc2) urVar4.j(y22Var)).g, 0L, 0L, sd0.j, null, 0L, 0L, null, 16777211), urVar4, 0, 0, 131066);
                    urVar4.p(true);
                } else {
                    urVar4.R();
                }
                return od2Var;
            case 4:
                h32 h32Var2 = (h32) obj5;
                ag agVar = (ag) obj4;
                ur urVar5 = (ur) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((zo) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z5 = true;
                }
                if (urVar5.O(intValue5 & 1, z5)) {
                    for (xd1 xd1Var : xn.F(new xd1("external", h32Var2.p()), new xd1("internal", h32Var2.q()))) {
                        String str4 = (String) xd1Var.e;
                        fq N = go.N(541021272, new nd((String) xd1Var.f, 2), urVar5);
                        boolean h3 = urVar5.h(agVar) | urVar5.f(str4);
                        Object L4 = urVar5.L();
                        if (h3 || L4 == xl1Var) {
                            L4 = new j1(24, agVar, str4);
                            urVar5.h0(L4);
                        }
                        d8.a(N, (de0) L4, null, null, false, null, null, urVar5, 6, 508);
                    }
                } else {
                    urVar5.R();
                }
                return od2Var;
            case 5:
                de0 de0Var = (de0) obj5;
                oe0 oe0Var2 = (oe0) obj4;
                ur urVar6 = (ur) obj2;
                ((Integer) obj3).getClass();
                urVar6.X(759876635);
                Object L5 = urVar6.L();
                Object obj6 = L5;
                if (L5 == xl1Var) {
                    j00 h4 = fr1.h(de0Var);
                    urVar6.h0(h4);
                    obj6 = h4;
                }
                o22 o22Var = (o22) obj6;
                Object L6 = urVar6.L();
                Object obj7 = L6;
                if (L6 == xl1Var) {
                    ya yaVar = new ya(new z81(((z81) o22Var.getValue()).a), ju1.b, new z81(ju1.c), 8);
                    urVar6.h0(yaVar);
                    obj7 = yaVar;
                }
                ya yaVar2 = (ya) obj7;
                boolean h5 = urVar6.h(yaVar2);
                Object L7 = urVar6.L();
                Object obj8 = L7;
                if (h5 || L7 == xl1Var) {
                    iu1 iu1Var = new iu1(o22Var, yaVar2, vtVar, z4 ? 1 : 0);
                    urVar6.h0(iu1Var);
                    obj8 = iu1Var;
                }
                bf.i(urVar6, (se0) obj8, od2Var);
                hc hcVar = yaVar2.c;
                boolean f = urVar6.f(hcVar);
                Object L8 = urVar6.L();
                if (f || L8 == xl1Var) {
                    L8 = new f61(hcVar, i4);
                    urVar6.h0(L8);
                }
                e21 e21Var = (e21) oe0Var2.invoke((de0) L8);
                urVar6.p(false);
                return e21Var;
            case 6:
                Spannable spannable = (Spannable) obj5;
                l8 l8Var = (l8) obj4;
                m12 m12Var = (m12) obj;
                int intValue6 = ((Integer) obj2).intValue();
                int intValue7 = ((Integer) obj3).intValue();
                g52 g52Var = m12Var.f;
                sd0 sd0Var = m12Var.c;
                if (sd0Var == null) {
                    sd0Var = sd0.g;
                }
                qd0 qd0Var = m12Var.d;
                if (qd0Var != null) {
                    i5 = qd0Var.a;
                }
                rd0 rd0Var = m12Var.e;
                if (rd0Var != null) {
                    i = rd0Var.a;
                } else {
                    i = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                }
                m8 m8Var = (m8) l8Var.f;
                nc2 b = ((dd0) m8Var.e).b(g52Var, sd0Var, i5, i);
                if (!(b instanceof nc2)) {
                    ld ldVar = new ld(b, m8Var.j);
                    m8Var.j = ldVar;
                    Object obj9 = ldVar.h;
                    obj9.getClass();
                    typeface = (Typeface) obj9;
                } else {
                    Object obj10 = b.e;
                    obj10.getClass();
                    typeface = (Typeface) obj10;
                }
                spannable.setSpan(new fd0(typeface, 1), intValue6, intValue7, 33);
                return od2Var;
            default:
                oe0 oe0Var3 = (oe0) obj5;
                r31 r31Var = (r31) obj4;
                ur urVar7 = (ur) obj2;
                ((Integer) obj3).getClass();
                urVar7.X(-102778667);
                Object L9 = urVar7.L();
                Object obj11 = L9;
                if (L9 == xl1Var) {
                    gv K2 = bf.K(urVar7);
                    urVar7.h0(K2);
                    obj11 = K2;
                }
                gv gvVar = (gv) obj11;
                Object L10 = urVar7.L();
                Object obj12 = L10;
                if (L10 == xl1Var) {
                    je1 k = fr1.k(null);
                    urVar7.h0(k);
                    obj12 = k;
                }
                o41 o41Var = (o41) obj12;
                o41 p = fr1.p(oe0Var3, urVar7);
                boolean f2 = urVar7.f(r31Var);
                Object L11 = urVar7.L();
                Object obj13 = L11;
                if (f2 || L11 == xl1Var) {
                    fl1 fl1Var = new fl1(i3, o41Var, r31Var);
                    urVar7.h0(fl1Var);
                    obj13 = fl1Var;
                }
                bf.d(r31Var, (oe0) obj13, urVar7);
                boolean h6 = urVar7.h(gvVar) | urVar7.f(r31Var) | urVar7.f(p);
                Object L12 = urVar7.L();
                Object obj14 = L12;
                if (h6 || L12 == xl1Var) {
                    r72 r72Var = new r72(gvVar, o41Var, r31Var, p);
                    urVar7.h0(r72Var);
                    obj14 = r72Var;
                }
                e21 a3 = s42.a(b21Var, r31Var, (PointerInputEventHandler) obj14);
                urVar7.p(false);
                return a3;
        }
    }
}
