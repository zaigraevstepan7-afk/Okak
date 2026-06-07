package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class gh0 implements te0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ h32 f;

    public /* synthetic */ gh0(h32 h32Var, int i) {
        this.e = i;
        this.f = h32Var;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        boolean z;
        String str2;
        String str3;
        boolean z2;
        String str4;
        boolean z3;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z4;
        boolean z5;
        String str10;
        boolean z6;
        String str11;
        String str12;
        int i = this.e;
        b21 b21Var = b21.a;
        od2 od2Var = od2.a;
        h32 h32Var = this.f;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        switch (i) {
            case 0:
                ur urVar = (ur) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((vp1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z7 = true;
                }
                if (urVar.O(intValue & 1, z7)) {
                    switch (h32Var.a) {
                        case 0:
                        case 1:
                            str = "OK";
                            break;
                        case 2:
                        case 3:
                            str = "ОК";
                            break;
                        default:
                            str = "确定";
                            break;
                    }
                    t82.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar, 0, 0, 262142);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 1:
                ur urVar2 = (ur) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((zo) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar2.O(intValue2 & 1, z)) {
                    e21 L = sn0.L(hy1.b(b21Var, 1.0f), 16.0f, 10.0f);
                    up1 a = tp1.a(new pe(10.0f, true, new le(z7 ? 1 : 0)), g3.p, urVar2, 54);
                    int hashCode = Long.hashCode(urVar2.T);
                    sf1 l = urVar2.l();
                    e21 Q = fp.Q(urVar2, L);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar2.a0();
                    if (urVar2.S) {
                        urVar2.k(hsVar);
                    } else {
                        urVar2.k0();
                    }
                    op1.q(urVar2, kr.f, a);
                    op1.q(urVar2, kr.e, l);
                    op1.l(urVar2, Integer.valueOf(hashCode), kr.g);
                    op1.o(urVar2, kr.h);
                    op1.q(urVar2, kr.d, Q);
                    ij0 ij0Var = nq1.c;
                    if (ij0Var == null) {
                        hj0 hj0Var = new hj0("Outlined.WifiOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = me2.a;
                        i12 i12Var = new i12(co.b);
                        rg2 rg2Var = new rg2(21);
                        rg2Var.s(21.0f, 11.0f);
                        rg2Var.r(2.0f, -2.0f);
                        rg2Var.i(-3.73f, -3.73f, -8.87f, -5.15f, -13.7f, -4.31f);
                        rg2Var.r(2.58f, 2.58f);
                        rg2Var.i(3.3f, -0.02f, 6.61f, 1.22f, 9.12f, 3.73f);
                        rg2Var.f();
                        rg2Var.s(19.0f, 13.0f);
                        rg2Var.i(-1.08f, -1.08f, -2.36f, -1.85f, -3.72f, -2.33f);
                        rg2Var.r(3.02f, 3.02f);
                        rg2Var.r(0.7f, -0.69f);
                        rg2Var.f();
                        rg2Var.s(9.0f, 17.0f);
                        rg2Var.r(3.0f, 3.0f);
                        rg2Var.r(3.0f, -3.0f);
                        rg2Var.i(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, 0.0f);
                        rg2Var.f();
                        rg2Var.s(3.41f, 1.64f);
                        rg2Var.q(2.0f, 3.05f);
                        rg2Var.q(5.05f, 6.1f);
                        rg2Var.h(3.59f, 6.83f, 2.22f, 7.79f, 1.0f, 9.0f);
                        rg2Var.r(2.0f, 2.0f);
                        rg2Var.i(1.23f, -1.23f, 2.65f, -2.16f, 4.17f, -2.78f);
                        rg2Var.r(2.24f, 2.24f);
                        rg2Var.h(7.79f, 10.89f, 6.27f, 11.74f, 5.0f, 13.0f);
                        rg2Var.r(2.0f, 2.0f);
                        rg2Var.i(1.35f, -1.35f, 3.11f, -2.04f, 4.89f, -2.06f);
                        rg2Var.r(7.08f, 7.08f);
                        rg2Var.r(1.41f, -1.41f);
                        rg2Var.q(3.41f, 1.64f);
                        rg2Var.f();
                        hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
                        ij0Var = hj0Var.b();
                        nq1.c = ij0Var;
                    }
                    ij0 ij0Var2 = ij0Var;
                    switch (h32Var.a) {
                        case 0:
                            str2 = "Offline";
                            break;
                        case 1:
                            str2 = "Sem conexão";
                            break;
                        case 2:
                            str2 = "Нет соединения";
                            break;
                        case 3:
                            str2 = "Немає з'єднання";
                            break;
                        default:
                            str2 = "离线";
                            break;
                    }
                    String str13 = str2;
                    y22 y22Var = oo.a;
                    ej0.a(ij0Var2, str13, hy1.f(b21Var, 20.0f), ((mo) urVar2.j(y22Var)).z, urVar2, 384, 0);
                    switch (h32Var.a) {
                        case 0:
                            str3 = "No versions available — tap to open Telegram";
                            break;
                        case 1:
                            str3 = "Nenhuma versão disponível — toque para abrir o Telegram";
                            break;
                        case 2:
                            str3 = "Нет доступных версий — нажмите чтобы открыть Telegram";
                            break;
                        case 3:
                            str3 = "Немає доступних версій — натисніть щоб відкрити Telegram";
                            break;
                        default:
                            str3 = "暂无可用版本 — 点击打开 Telegram";
                            break;
                    }
                    t82.b(str3, null, ((mo) urVar2.j(y22Var)).z, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar2.j(rc2.a)).m, urVar2, 0, 0, 131066);
                    urVar2.p(true);
                } else {
                    urVar2.R();
                }
                return od2Var;
            case 2:
                ur urVar3 = (ur) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((zo) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar3.O(intValue3 & 1, z2)) {
                    e21 L2 = sn0.L(hy1.b(b21Var, 1.0f), 16.0f, 10.0f);
                    up1 a2 = tp1.a(new pe(10.0f, true, new le(z7 ? 1 : 0)), g3.p, urVar3, 54);
                    int hashCode2 = Long.hashCode(urVar3.T);
                    sf1 l2 = urVar3.l();
                    e21 Q2 = fp.Q(urVar3, L2);
                    lr.b.getClass();
                    hs hsVar2 = kr.b;
                    urVar3.a0();
                    if (urVar3.S) {
                        urVar3.k(hsVar2);
                    } else {
                        urVar3.k0();
                    }
                    op1.q(urVar3, kr.f, a2);
                    op1.q(urVar3, kr.e, l2);
                    op1.l(urVar3, Integer.valueOf(hashCode2), kr.g);
                    op1.o(urVar3, kr.h);
                    op1.q(urVar3, kr.d, Q2);
                    ij0 l3 = xp1.l();
                    String g = h32Var.g();
                    y22 y22Var2 = oo.a;
                    ej0.a(l3, g, hy1.f(b21Var, 20.0f), ((mo) urVar3.j(y22Var2)).z, urVar3, 384, 0);
                    switch (h32Var.a) {
                        case 0:
                            str4 = "Selected version is outdated, tap to update";
                            break;
                        case 1:
                            str4 = "A versão selecionada está desatualizada, toque para atualizar";
                            break;
                        case 2:
                            str4 = "Выбранная версия устарела, нажмите чтобы обновить";
                            break;
                        case 3:
                            str4 = "Обрана версія застаріла, натисніть щоб оновити";
                            break;
                        default:
                            str4 = "所选版本已过期，点击更新";
                            break;
                    }
                    t82.b(str4, null, ((mo) urVar3.j(y22Var2)).z, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar3.j(rc2.a)).m, urVar3, 0, 0, 131066);
                    urVar3.p(true);
                } else {
                    urVar3.R();
                }
                return od2Var;
            case 3:
                ur urVar4 = (ur) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((zo) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (urVar4.O(intValue4 & 1, z3)) {
                    e21 L3 = sn0.L(hy1.b(b21Var, 1.0f), 16.0f, 10.0f);
                    up1 a3 = tp1.a(new pe(10.0f, true, new le(z7 ? 1 : 0)), g3.p, urVar4, 54);
                    int hashCode3 = Long.hashCode(urVar4.T);
                    sf1 l4 = urVar4.l();
                    e21 Q3 = fp.Q(urVar4, L3);
                    lr.b.getClass();
                    hs hsVar3 = kr.b;
                    urVar4.a0();
                    if (urVar4.S) {
                        urVar4.k(hsVar3);
                    } else {
                        urVar4.k0();
                    }
                    op1.q(urVar4, kr.f, a3);
                    op1.q(urVar4, kr.e, l4);
                    op1.l(urVar4, Integer.valueOf(hashCode3), kr.g);
                    op1.o(urVar4, kr.h);
                    op1.q(urVar4, kr.d, Q3);
                    ij0 ij0Var3 = vn.b;
                    if (ij0Var3 == null) {
                        hj0 hj0Var2 = new hj0("Outlined.NewReleases", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = me2.a;
                        i12 i12Var2 = new i12(co.b);
                        rg2 rg2Var2 = new rg2(21);
                        rg2Var2.s(23.0f, 12.0f);
                        rg2Var2.r(-2.44f, -2.78f);
                        rg2Var2.r(0.34f, -3.68f);
                        rg2Var2.r(-3.61f, -0.82f);
                        rg2Var2.r(-1.89f, -3.18f);
                        rg2Var2.q(12.0f, 3.0f);
                        rg2Var2.q(8.6f, 1.54f);
                        rg2Var2.q(6.71f, 4.72f);
                        rg2Var2.r(-3.61f, 0.81f);
                        rg2Var2.r(0.34f, 3.68f);
                        rg2Var2.q(1.0f, 12.0f);
                        rg2Var2.r(2.44f, 2.78f);
                        rg2Var2.r(-0.34f, 3.69f);
                        rg2Var2.r(3.61f, 0.82f);
                        rg2Var2.r(1.89f, 3.18f);
                        rg2Var2.q(12.0f, 21.0f);
                        rg2Var2.r(3.4f, 1.46f);
                        rg2Var2.r(1.89f, -3.18f);
                        rg2Var2.r(3.61f, -0.82f);
                        rg2Var2.r(-0.34f, -3.68f);
                        rg2Var2.q(23.0f, 12.0f);
                        rg2Var2.f();
                        rg2Var2.s(18.49f, 14.11f);
                        rg2Var2.r(0.26f, 2.79f);
                        rg2Var2.r(-2.74f, 0.62f);
                        rg2Var2.r(-1.43f, 2.41f);
                        rg2Var2.q(12.0f, 18.82f);
                        rg2Var2.r(-2.58f, 1.11f);
                        rg2Var2.r(-1.43f, -2.41f);
                        rg2Var2.r(-2.74f, -0.62f);
                        rg2Var2.r(0.26f, -2.8f);
                        rg2Var2.q(3.66f, 12.0f);
                        rg2Var2.r(1.85f, -2.12f);
                        rg2Var2.r(-0.26f, -2.78f);
                        rg2Var2.r(2.74f, -0.61f);
                        rg2Var2.r(1.43f, -2.41f);
                        rg2Var2.q(12.0f, 5.18f);
                        rg2Var2.r(2.58f, -1.11f);
                        rg2Var2.r(1.43f, 2.41f);
                        rg2Var2.r(2.74f, 0.62f);
                        rg2Var2.r(-0.26f, 2.79f);
                        rg2Var2.q(20.34f, 12.0f);
                        rg2Var2.r(-1.85f, 2.11f);
                        rg2Var2.f();
                        rg2Var2.s(11.0f, 15.0f);
                        rg2Var2.o(2.0f);
                        rg2Var2.E(2.0f);
                        rg2Var2.o(-2.0f);
                        rg2Var2.f();
                        rg2Var2.s(11.0f, 7.0f);
                        rg2Var2.o(2.0f);
                        rg2Var2.E(6.0f);
                        rg2Var2.o(-2.0f);
                        rg2Var2.f();
                        hj0.a(hj0Var2, (ArrayList) rg2Var2.f, i12Var2);
                        ij0Var3 = hj0Var2.b();
                        vn.b = ij0Var3;
                    }
                    switch (h32Var.a) {
                        case 0:
                            str5 = "Newer version available";
                            break;
                        case 1:
                            str5 = "Nova versão disponível";
                            break;
                        case 2:
                            str5 = "Доступна новая версия";
                            break;
                        case 3:
                            str5 = "Доступна нова версія";
                            break;
                        default:
                            str5 = "有新版本可用";
                            break;
                    }
                    String str14 = str5;
                    y22 y22Var3 = oo.a;
                    ej0.a(ij0Var3, str14, hy1.f(b21Var, 20.0f), ((mo) urVar4.j(y22Var3)).m, urVar4, 384, 0);
                    switch (h32Var.a) {
                        case 0:
                            str6 = "A newer version is available";
                            break;
                        case 1:
                            str6 = "Uma versão mais recente está disponível";
                            break;
                        case 2:
                            str6 = "Доступна более новая версия";
                            break;
                        case 3:
                            str6 = "Доступна новіша версія";
                            break;
                        default:
                            str6 = "有新版本可用";
                            break;
                    }
                    t82.b(str6, null, ((mo) urVar4.j(y22Var3)).m, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar4.j(rc2.a)).m, urVar4, 0, 0, 131066);
                    urVar4.p(true);
                } else {
                    urVar4.R();
                }
                return od2Var;
            case 4:
                ur urVar5 = (ur) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((vp1) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z17 = true;
                }
                if (urVar5.O(intValue5 & 1, z17)) {
                    t82.b(h32Var.l(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar5, 0, 0, 262142);
                } else {
                    urVar5.R();
                }
                return od2Var;
            case 5:
                ur urVar6 = (ur) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((vp1) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z16 = true;
                }
                if (urVar6.O(intValue6 & 1, z16)) {
                    ij0 ij0Var4 = hp.a;
                    if (ij0Var4 == null) {
                        hj0 hj0Var3 = new hj0("AutoMirrored.Rounded.Logout", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i4 = me2.a;
                        long j = co.b;
                        i12 i12Var3 = new i12(j);
                        rg2 rg2Var3 = new rg2(21);
                        rg2Var3.s(5.0f, 5.0f);
                        rg2Var3.o(6.0f);
                        rg2Var3.i(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                        rg2Var3.E(0.0f);
                        rg2Var3.i(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                        rg2Var3.n(5.0f);
                        rg2Var3.h(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
                        rg2Var3.E(14.0f);
                        rg2Var3.i(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        rg2Var3.o(6.0f);
                        rg2Var3.i(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
                        rg2Var3.E(0.0f);
                        rg2Var3.i(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
                        rg2Var3.n(5.0f);
                        rg2Var3.D(5.0f);
                        rg2Var3.f();
                        hj0.a(hj0Var3, (ArrayList) rg2Var3.f, i12Var3);
                        i12 i12Var4 = new i12(j);
                        rg2 rg2Var4 = new rg2(21);
                        rg2Var4.s(20.65f, 11.65f);
                        rg2Var4.r(-2.79f, -2.79f);
                        rg2Var4.h(17.54f, 8.54f, 17.0f, 8.76f, 17.0f, 9.21f);
                        rg2Var4.D(11.0f);
                        rg2Var4.o(-7.0f);
                        rg2Var4.i(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
                        rg2Var4.E(0.0f);
                        rg2Var4.i(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
                        rg2Var4.o(7.0f);
                        rg2Var4.E(1.79f);
                        rg2Var4.i(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
                        rg2Var4.r(2.79f, -2.79f);
                        rg2Var4.h(20.84f, 12.16f, 20.84f, 11.84f, 20.65f, 11.65f);
                        rg2Var4.f();
                        hj0.a(hj0Var3, (ArrayList) rg2Var4.f, i12Var4);
                        ij0Var4 = hj0Var3.b();
                        hp.a = ij0Var4;
                    }
                    ej0.a(ij0Var4, null, hy1.f(b21Var, 20.0f), 0L, urVar6, 432, 8);
                    xp1.a(urVar6, hy1.j(b21Var, 8.0f));
                    t82.b(h32Var.l(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92.a(((pc2) urVar6.j(rc2.a)).h, 0L, 0L, sd0.i, null, 0L, 0L, null, 16777211), urVar6, 0, 0, 131070);
                } else {
                    urVar6.R();
                }
                return od2Var;
            case 6:
                ur urVar7 = (ur) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((vp1) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z15 = true;
                }
                if (urVar7.O(intValue7 & 1, z15)) {
                    t82.b(h32Var.h(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar7, 0, 0, 262142);
                } else {
                    urVar7.R();
                }
                return od2Var;
            case 7:
                ur urVar8 = (ur) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((vp1) obj).getClass();
                if ((intValue8 & 17) != 16) {
                    z14 = true;
                }
                if (urVar8.O(intValue8 & 1, z14)) {
                    t82.b(h32Var.m(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar8, 0, 0, 262142);
                } else {
                    urVar8.R();
                }
                return od2Var;
            case 8:
                ur urVar9 = (ur) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((vp1) obj).getClass();
                if ((intValue9 & 17) != 16) {
                    z13 = true;
                }
                if (urVar9.O(intValue9 & 1, z13)) {
                    switch (h32Var.a) {
                        case 0:
                            str7 = "Continue";
                            break;
                        case 1:
                            str7 = "Continuar";
                            break;
                        case 2:
                            str7 = "Продолжить";
                            break;
                        case 3:
                            str7 = "Продовжити";
                            break;
                        default:
                            str7 = "继续";
                            break;
                    }
                    t82.b(str7, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar9, 0, 0, 262142);
                } else {
                    urVar9.R();
                }
                return od2Var;
            case 9:
                ur urVar10 = (ur) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((vp1) obj).getClass();
                if ((intValue10 & 17) != 16) {
                    z12 = true;
                }
                if (urVar10.O(intValue10 & 1, z12)) {
                    t82.b(h32Var.m(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar10, 0, 0, 262142);
                } else {
                    urVar10.R();
                }
                return od2Var;
            case 10:
                ur urVar11 = (ur) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((vp1) obj).getClass();
                if ((intValue11 & 17) != 16) {
                    z11 = true;
                }
                if (urVar11.O(intValue11 & 1, z11)) {
                    switch (h32Var.a) {
                        case 0:
                            str8 = "Back to Key";
                            break;
                        case 1:
                            str8 = "Voltar para Chave";
                            break;
                        case 2:
                            str8 = "Назад к ключу";
                            break;
                        case 3:
                            str8 = "Назад до ключа";
                            break;
                        default:
                            str8 = "返回密钥";
                            break;
                    }
                    t82.b(str8, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar11, 0, 0, 262142);
                } else {
                    urVar11.R();
                }
                return od2Var;
            case 11:
                ur urVar12 = (ur) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((vp1) obj).getClass();
                if ((intValue12 & 17) != 16) {
                    z10 = true;
                }
                if (urVar12.O(intValue12 & 1, z10)) {
                    t82.b(h32Var.h(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar12, 0, 0, 262142);
                } else {
                    urVar12.R();
                }
                return od2Var;
            case 12:
                ur urVar13 = (ur) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((vp1) obj).getClass();
                if ((intValue13 & 17) != 16) {
                    z9 = true;
                }
                if (urVar13.O(intValue13 & 1, z9)) {
                    switch (h32Var.a) {
                        case 0:
                            str9 = "Delete";
                            break;
                        case 1:
                            str9 = "Excluir";
                            break;
                        case 2:
                            str9 = "Удалить";
                            break;
                        case 3:
                            str9 = "Видалити";
                            break;
                        default:
                            str9 = "删除";
                            break;
                    }
                    t82.b(str9, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar13, 0, 0, 262142);
                } else {
                    urVar13.R();
                }
                return od2Var;
            case 13:
                ur urVar14 = (ur) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((tr0) obj).getClass();
                if ((intValue14 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (urVar14.O(1 & intValue14, z4)) {
                    String str15 = "Звуки (MP3)";
                    switch (h32Var.a) {
                        case 0:
                            str15 = "Sounds (MP3)";
                            break;
                        case 1:
                            str15 = "Sons (MP3)";
                            break;
                        case 2:
                        case 3:
                            break;
                        default:
                            str15 = "声音 (MP3)";
                            break;
                    }
                    bf.o(str15, xn.D(), urVar14, 0);
                } else {
                    urVar14.R();
                }
                return od2Var;
            case 14:
                ur urVar15 = (ur) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((tr0) obj).getClass();
                if ((intValue15 & 17) != 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (urVar15.O(1 & intValue15, z5)) {
                    xp1.a(urVar15, hy1.c(b21Var, 8.0f));
                    switch (h32Var.a) {
                        case 0:
                            str10 = "ESP Images";
                            break;
                        case 1:
                            str10 = "Imagens ESP";
                            break;
                        case 2:
                            str10 = "ESP Изображения";
                            break;
                        case 3:
                            str10 = "ESP Зображення";
                            break;
                        default:
                            str10 = "ESP 图像";
                            break;
                    }
                    bf.o(str10, qo.L(), urVar15, 0);
                } else {
                    urVar15.R();
                }
                return od2Var;
            case 15:
                ur urVar16 = (ur) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((tr0) obj).getClass();
                if ((intValue16 & 17) != 16) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (urVar16.O(1 & intValue16, z6)) {
                    xp1.a(urVar16, hy1.c(b21Var, 8.0f));
                    switch (h32Var.a) {
                        case 0:
                            str11 = "Avatars (VRM)";
                            break;
                        case 1:
                            str11 = "Avatares (VRM)";
                            break;
                        case 2:
                            str11 = "Аватары (VRM)";
                            break;
                        case 3:
                            str11 = "Аватари (VRM)";
                            break;
                        default:
                            str11 = "虚拟形象 (VRM)";
                            break;
                    }
                    bf.o(str11, pp1.t(), urVar16, 0);
                } else {
                    urVar16.R();
                }
                return od2Var;
            default:
                ur urVar17 = (ur) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((vp1) obj).getClass();
                if ((intValue17 & 17) != 16) {
                    z8 = true;
                }
                if (urVar17.O(intValue17 & 1, z8)) {
                    switch (h32Var.a) {
                        case 0:
                            str12 = "Retry";
                            break;
                        case 1:
                            str12 = "Tentar Novamente";
                            break;
                        case 2:
                            str12 = "Повторить";
                            break;
                        case 3:
                            str12 = "Повторити";
                            break;
                        default:
                            str12 = "重试";
                            break;
                    }
                    t82.b(str12, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar17, 0, 0, 262142);
                } else {
                    urVar17.R();
                }
                return od2Var;
        }
    }
}
