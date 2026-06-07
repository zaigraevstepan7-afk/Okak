package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class u2 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ u2(e21 e21Var, se0 se0Var, int i) {
        this.e = 29;
        this.g = e21Var;
        this.f = se0Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        ii iiVar;
        String a;
        boolean z2;
        boolean z3;
        boolean z4;
        ur urVar;
        boolean z5;
        boolean z6;
        boolean z7;
        String str;
        boolean z8;
        int i = this.e;
        Object obj3 = wp1.a;
        int i2 = 6;
        xl1 xl1Var = or.a;
        b21 b21Var = b21.a;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        int i3 = 1;
        od2 od2Var = od2.a;
        Object obj4 = this.f;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                se0 se0Var = (se0) obj4;
                se0 se0Var2 = (se0) obj5;
                ur urVar2 = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar2.O(intValue & 1, z)) {
                    e21 J = sn0.J(b21Var, f3.c);
                    if (se0Var == null) {
                        iiVar = g3.r;
                    } else {
                        iiVar = g3.s;
                    }
                    e21 d = J.d(new ci0(iiVar));
                    j01 d2 = hj.d(g3.f, false);
                    int x = io.x(urVar2);
                    sf1 l = urVar2.l();
                    e21 Q = fp.Q(urVar2, d);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar2.a0();
                    if (urVar2.S) {
                        urVar2.k(hsVar);
                    } else {
                        urVar2.k0();
                    }
                    op1.q(urVar2, kr.f, d2);
                    op1.q(urVar2, kr.e, l);
                    gb gbVar = kr.g;
                    if (urVar2.S || !sn0.r(urVar2.L(), Integer.valueOf(x))) {
                        l90.s(x, urVar2, x, gbVar);
                    }
                    op1.q(urVar2, kr.d, Q);
                    se0Var2.invoke(urVar2, 0);
                    urVar2.p(true);
                } else {
                    urVar2.R();
                }
                return od2Var;
            case 1:
                wr1 wr1Var = (wr1) obj4;
                h32 h32Var = (h32) obj5;
                ur urVar3 = (ur) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z9 = true;
                }
                if (urVar3.O(intValue2 & 1, z9)) {
                    if (sn0.r(wr1Var, wr1.e)) {
                        switch (h32Var.a) {
                            case 0:
                                a = "Versions";
                                break;
                            case 1:
                                a = "Versões";
                                break;
                            case 2:
                                a = "Версии";
                                break;
                            case 3:
                                a = "Версії";
                                break;
                            default:
                                a = "版本";
                                break;
                        }
                    } else if (sn0.r(wr1Var, wr1.d)) {
                        switch (h32Var.a) {
                            case 0:
                                a = "Settings";
                                break;
                            case 1:
                                a = "Configurações";
                                break;
                            case 2:
                                a = "Настройки";
                                break;
                            case 3:
                                a = "Налаштування";
                                break;
                            default:
                                a = "设置";
                                break;
                        }
                    } else if (sn0.r(wr1Var, wr1.c)) {
                        switch (h32Var.a) {
                            case 0:
                                a = "Resources";
                                break;
                            case 1:
                                a = "Recursos";
                                break;
                            case 2:
                                a = "Ресурсы";
                                break;
                            case 3:
                                a = "Ресурси";
                                break;
                            default:
                                a = "资源";
                                break;
                        }
                    } else if (sn0.r(wr1Var, wr1.b)) {
                        switch (h32Var.a) {
                            case 0:
                                a = "Information";
                                break;
                            case 1:
                                a = "Informações";
                                break;
                            case 2:
                                a = "Информация";
                                break;
                            case 3:
                                a = "Інформація";
                                break;
                            default:
                                a = "信息";
                                break;
                        }
                    } else {
                        a = h32Var.a();
                    }
                    t82.b(a, null, 0L, 0L, sd0.i, null, 0L, null, 0L, 0, false, 0, 0, null, urVar3, 1572864, 0, 262078);
                } else {
                    urVar3.R();
                }
                return od2Var;
            case 2:
                String str2 = (String) obj4;
                fq fqVar = (fq) obj5;
                ur urVar4 = (ur) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar4.O(intValue3 & 1, z2)) {
                    boolean f = urVar4.f(str2);
                    Object L = urVar4.L();
                    if (f || L == xl1Var) {
                        L = new wh(str2, false ? 1 : 0);
                        urVar4.h0(L);
                    }
                    e21 a2 = ou1.a(b21Var, false, (oe0) L);
                    j01 d3 = hj.d(g3.f, false);
                    int x2 = io.x(urVar4);
                    sf1 l2 = urVar4.l();
                    e21 Q2 = fp.Q(urVar4, a2);
                    lr.b.getClass();
                    hs hsVar2 = kr.b;
                    urVar4.a0();
                    if (urVar4.S) {
                        urVar4.k(hsVar2);
                    } else {
                        urVar4.k0();
                    }
                    op1.q(urVar4, kr.f, d3);
                    op1.q(urVar4, kr.e, l2);
                    gb gbVar2 = kr.g;
                    if (urVar4.S || !sn0.r(urVar4.L(), Integer.valueOf(x2))) {
                        l90.s(x2, urVar4, x2, gbVar2);
                    }
                    op1.q(urVar4, kr.d, Q2);
                    fqVar.invoke(urVar4, 0);
                    urVar4.p(true);
                } else {
                    urVar4.R();
                }
                return od2Var;
            case 3:
                pc1 pc1Var = (pc1) obj4;
                fq fqVar2 = (fq) obj5;
                ur urVar5 = (ur) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z14 = true;
                }
                if (urVar5.O(intValue4 & 1, z14)) {
                    e21 J2 = sn0.J(hy1.a(b21Var, sk.c, sk.d), pc1Var);
                    up1 a3 = tp1.a(c01.h, g3.p, urVar5, 54);
                    int x3 = io.x(urVar5);
                    sf1 l3 = urVar5.l();
                    e21 Q3 = fp.Q(urVar5, J2);
                    lr.b.getClass();
                    hs hsVar3 = kr.b;
                    urVar5.a0();
                    if (urVar5.S) {
                        urVar5.k(hsVar3);
                    } else {
                        urVar5.k0();
                    }
                    op1.q(urVar5, kr.f, a3);
                    op1.q(urVar5, kr.e, l3);
                    gb gbVar3 = kr.g;
                    if (urVar5.S || !sn0.r(urVar5.L(), Integer.valueOf(x3))) {
                        l90.s(x3, urVar5, x3, gbVar3);
                    }
                    op1.q(urVar5, kr.d, Q3);
                    fqVar2.invoke(obj3, urVar5, 6);
                    urVar5.p(true);
                } else {
                    urVar5.R();
                }
                return od2Var;
            case 4:
                rc1 rc1Var = (rc1) obj4;
                fq fqVar3 = (fq) obj5;
                ur urVar6 = (ur) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z13 = true;
                }
                if (urVar6.O(intValue5 & 1, z13)) {
                    e21 J3 = sn0.J(hy1.a(b21Var, sk.c, sk.d), rc1Var);
                    up1 a4 = tp1.a(c01.h, g3.p, urVar6, 54);
                    int x4 = io.x(urVar6);
                    sf1 l4 = urVar6.l();
                    e21 Q4 = fp.Q(urVar6, J3);
                    lr.b.getClass();
                    hs hsVar4 = kr.b;
                    urVar6.a0();
                    if (urVar6.S) {
                        urVar6.k(hsVar4);
                    } else {
                        urVar6.k0();
                    }
                    op1.q(urVar6, kr.f, a4);
                    op1.q(urVar6, kr.e, l4);
                    gb gbVar4 = kr.g;
                    if (urVar6.S || !sn0.r(urVar6.L(), Integer.valueOf(x4))) {
                        l90.s(x4, urVar6, x4, gbVar4);
                    }
                    op1.q(urVar6, kr.d, Q4);
                    fqVar3.invoke(obj3, urVar6, 6);
                    urVar6.p(true);
                } else {
                    urVar6.R();
                }
                return od2Var;
            case 5:
                ((Integer) obj2).getClass();
                f2.c((e21) obj4, (oe0) obj5, (ur) obj, lo.b0(1));
                return od2Var;
            case 6:
                fm1 fm1Var = (fm1) obj4;
                jz1 jz1Var = (jz1) obj5;
                int intValue6 = ((Integer) obj).intValue();
                if (obj2 instanceof yq) {
                    fm1Var.f.b((yq) obj2);
                } else if (!(obj2 instanceof jo1)) {
                    if (obj2 instanceof hm1) {
                        mp0.I(jz1Var, intValue6, obj2);
                        fm1Var.e((hm1) obj2);
                    } else if (obj2 instanceof dl1) {
                        mp0.I(jz1Var, intValue6, obj2);
                        ((dl1) obj2).c();
                    }
                }
                return od2Var;
            case 7:
                ((Integer) obj2).getClass();
                ((qt) obj4).a((pt) obj5, (ur) obj, lo.b0(1));
                return od2Var;
            case 8:
                ((Integer) obj2).getClass();
                ((xx) obj4).a((q4) obj5, (ur) obj, lo.b0(1));
                return od2Var;
            case 9:
                ((Integer) obj2).getClass();
                ((cz) obj4).a((by1) obj5, (ur) obj, lo.b0(1));
                return od2Var;
            case 10:
                i62 i62Var = (i62) obj4;
                t62 t62Var = (t62) obj5;
                ur urVar7 = (ur) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (urVar7.O(intValue7 & 1, z3)) {
                    boolean f2 = urVar7.f(i62Var);
                    Object L2 = urVar7.L();
                    if (f2 || L2 == xl1Var) {
                        L2 = fr1.h(new e5(0, i62Var, i62.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 1));
                        urVar7.h0(L2);
                    }
                    iz.a(t62Var, (h62) ((o22) L2).getValue(), urVar7, 0);
                } else {
                    urVar7.R();
                }
                return od2Var;
            case 11:
                ((Integer) obj2).getClass();
                iz.a((t62) obj4, (h62) obj5, (ur) obj, lo.b0(1));
                return od2Var;
            case 12:
                ((Integer) obj2).getClass();
                lo.c((List) obj4, (Collection) obj5, (ur) obj, lo.b0(1));
                return od2Var;
            case 13:
                ((Integer) obj2).getClass();
                lh0.b((bi0) obj4, (de0) obj5, (ur) obj, lo.b0(1));
                return od2Var;
            case 14:
                ((Integer) obj2).getClass();
                lh0.a((sh0) obj4, (de0) obj5, (ur) obj, lo.b0(1));
                return od2Var;
            case 15:
                o41 o41Var = (o41) obj4;
                h32 h32Var2 = (h32) obj5;
                ur urVar8 = (ur) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z12 = true;
                }
                if (urVar8.O(intValue8 & 1, z12)) {
                    Object L3 = urVar8.L();
                    if (L3 == xl1Var) {
                        L3 = new z9(o41Var, 7);
                        urVar8.h0(L3);
                    }
                    sn0.o((de0) L3, null, false, null, null, null, go.N(617904573, new gh0(h32Var2, i2), urVar8), urVar8, 805306374, 510);
                } else {
                    urVar8.R();
                }
                return od2Var;
            case 16:
                ((Integer) obj2).getClass();
                c01.d((el0) obj4, (de0) obj5, (ur) obj, lo.b0(1));
                return od2Var;
            case 17:
                hs0 hs0Var = (hs0) obj4;
                gs0 gs0Var = (gs0) obj5;
                ur urVar9 = (ur) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (urVar9.O(intValue9 & 1, z4)) {
                    is0 is0Var = (is0) hs0Var.b.invoke();
                    int i4 = gs0Var.c;
                    Object obj6 = gs0Var.a;
                    if ((i4 >= is0Var.a() || !is0Var.c(i4).equals(obj6)) && (i4 = is0Var.e(obj6)) != -1) {
                        gs0Var.c = i4;
                    }
                    int i5 = i4;
                    if (i5 != -1) {
                        urVar9.X(-1664741271);
                        hp.g(is0Var, hs0Var.a, i5, gs0Var.a, urVar9, 0);
                        urVar = urVar9;
                    } else {
                        urVar = urVar9;
                        urVar.X(-1668376610);
                    }
                    urVar.p(false);
                    boolean h = urVar.h(gs0Var);
                    Object L4 = urVar.L();
                    if (h || L4 == xl1Var) {
                        L4 = new r(gs0Var, 17);
                        urVar.h0(L4);
                    }
                    bf.d(obj6, (oe0) L4, urVar);
                } else {
                    urVar9.R();
                }
                return od2Var;
            case 18:
                return ((ks0) obj5).a(new ls0((hs0) obj4, (c42) obj), ((us) obj2).a);
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                fq fqVar4 = (fq) obj4;
                Object obj7 = (vt0) obj5;
                ur urVar10 = (ur) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (urVar10.O(intValue10 & 1, z5)) {
                    fqVar4.invoke(obj7, urVar10, 0);
                } else {
                    urVar10.R();
                }
                return od2Var;
            case 20:
                xv0 xv0Var = (xv0) obj4;
                fq fqVar5 = (fq) obj5;
                ur urVar11 = (ur) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z11 = true;
                }
                if (urVar11.O(intValue11 & 1, z11)) {
                    cw0.c(xv0Var.b, bf.R, fqVar5, urVar11, 48);
                } else {
                    urVar11.R();
                }
                return od2Var;
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                ag agVar = (ag) obj4;
                o41 o41Var2 = (o41) obj5;
                ur urVar12 = (ur) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (urVar12.O(intValue12 & 1, z6)) {
                    int ordinal = ((pf) o41Var2.getValue()).ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            urVar12.X(-1747545054);
                            urVar12.p(false);
                        } else {
                            urVar12.X(1190551987);
                            fc2.g(agVar, urVar12, 8);
                            urVar12.p(false);
                        }
                    } else {
                        urVar12.X(1190550034);
                        fc2.k(agVar, urVar12, 8);
                        urVar12.p(false);
                    }
                } else {
                    urVar12.R();
                }
                return od2Var;
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                ((Integer) obj2).getClass();
                fc2.d((de0) obj4, (de0) obj5, (ur) obj, lo.b0(1));
                return od2Var;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ag agVar2 = (ag) obj4;
                o22 o22Var = (o22) obj5;
                ur urVar13 = (ur) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if ((intValue13 & 3) != 2) {
                    z10 = true;
                }
                if (urVar13.O(intValue13 & 1, z10)) {
                    boolean booleanValue = ((Boolean) o22Var.getValue()).booleanValue();
                    boolean h2 = urVar13.h(agVar2);
                    Object L5 = urVar13.L();
                    if (h2 || L5 == xl1Var) {
                        k kVar = new k(1, agVar2, ag.class, "onAutoLoginChanged", "onAutoLoginChanged(Z)V", 0, 3);
                        urVar13.h0(kVar);
                        L5 = kVar;
                    }
                    a52.a(booleanValue, (oe0) ((wo0) L5), null, go.N(-820076254, new dy0(o22Var, i3), urVar13), false, null, urVar13, 3072, 116);
                } else {
                    urVar13.R();
                }
                return od2Var;
            case 24:
                ((Integer) obj2).getClass();
                io.i((lq1) obj4, (fq) obj5, (ur) obj, lo.b0(1));
                return od2Var;
            case 25:
                tl1 tl1Var = (tl1) obj4;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                tl1Var.e += ((ot0) obj5).b.a(floatValue - tl1Var.e);
                return od2Var;
            case 26:
                h32 h32Var3 = (h32) obj4;
                zm1 zm1Var = (zm1) obj5;
                ur urVar14 = (ur) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if ((intValue14 & 3) != 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (urVar14.O(intValue14 & 1, z7)) {
                    yo a5 = wo.a(c01.g, g3.r, urVar14, 0);
                    int hashCode = Long.hashCode(urVar14.T);
                    sf1 l5 = urVar14.l();
                    e21 Q5 = fp.Q(urVar14, b21Var);
                    lr.b.getClass();
                    hs hsVar5 = kr.b;
                    urVar14.a0();
                    if (urVar14.S) {
                        urVar14.k(hsVar5);
                    } else {
                        urVar14.k0();
                    }
                    op1.q(urVar14, kr.f, a5);
                    op1.q(urVar14, kr.e, l5);
                    op1.l(urVar14, Integer.valueOf(hashCode), kr.g);
                    op1.o(urVar14, kr.h);
                    op1.q(urVar14, kr.d, Q5);
                    switch (h32Var3.a) {
                        case 0:
                            str = "This action cannot be undone";
                            break;
                        case 1:
                            str = "Esta ação não pode ser desfeita";
                            break;
                        case 2:
                            str = "Это действие нельзя отменить";
                            break;
                        case 3:
                            str = "Цю дію не можна скасувати";
                            break;
                        default:
                            str = "此操作无法撤消";
                            break;
                    }
                    t82.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar14, 0, 0, 262142);
                    xp1.a(urVar14, hy1.c(b21Var, 8.0f));
                    t82.b(zm1Var.a, null, 0L, 0L, sd0.j, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar14.j(rc2.a)).k, urVar14, 1572864, 0, 131006);
                    urVar14.p(true);
                } else {
                    urVar14.R();
                }
                return od2Var;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                fq fqVar6 = (fq) obj4;
                Object obj8 = (or1) obj5;
                ur urVar15 = (ur) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if ((intValue15 & 3) != 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (urVar15.O(intValue15 & 1, z8)) {
                    j01 d4 = hj.d(g3.f, false);
                    int x5 = io.x(urVar15);
                    sf1 l6 = urVar15.l();
                    e21 Q6 = fp.Q(urVar15, b21Var);
                    lr.b.getClass();
                    hs hsVar6 = kr.b;
                    urVar15.a0();
                    if (urVar15.S) {
                        urVar15.k(hsVar6);
                    } else {
                        urVar15.k0();
                    }
                    op1.q(urVar15, kr.f, d4);
                    op1.q(urVar15, kr.e, l6);
                    gb gbVar5 = kr.g;
                    if (urVar15.S || !sn0.r(urVar15.L(), Integer.valueOf(x5))) {
                        l90.s(x5, urVar15, x5, gbVar5);
                    }
                    op1.q(urVar15, kr.d, Q6);
                    fqVar6.invoke(obj8, urVar15, 6);
                    urVar15.p(true);
                } else {
                    urVar15.R();
                }
                return od2Var;
            case 28:
                ((Integer) obj2).getClass();
                c01.i((bg0) obj4, (fq) obj5, (ur) obj, lo.b0(55));
                return od2Var;
            default:
                ((Integer) obj2).getClass();
                bx1.a((e21) obj5, (se0) obj4, (ur) obj, lo.b0(1));
                return od2Var;
        }
    }

    public /* synthetic */ u2(int i, Object obj, Object obj2) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    public /* synthetic */ u2(Object obj, int i, int i2, Object obj2) {
        this.e = i2;
        this.f = obj;
        this.g = obj2;
    }
}
