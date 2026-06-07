package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class sd implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ h32 f;

    public /* synthetic */ sd(h32 h32Var, int i) {
        this.e = i;
        this.f = h32Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i = this.e;
        b21 b21Var = b21.a;
        od2 od2Var = od2.a;
        h32 h32Var = this.f;
        switch (i) {
            case 0:
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if (urVar.O(intValue & 1, (intValue & 3) != 2)) {
                    ij0 ij0Var = vn.a;
                    if (ij0Var == null) {
                        hj0 hj0Var = new hj0("Filled.Menu", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = me2.a;
                        i12 i12Var = new i12(co.b);
                        rg2 rg2Var = new rg2(21);
                        rg2Var.s(3.0f, 18.0f);
                        rg2Var.o(18.0f);
                        rg2Var.E(-2.0f);
                        rg2Var.q(3.0f, 16.0f);
                        rg2Var.E(2.0f);
                        rg2Var.f();
                        rg2Var.s(3.0f, 13.0f);
                        rg2Var.o(18.0f);
                        rg2Var.E(-2.0f);
                        rg2Var.q(3.0f, 11.0f);
                        rg2Var.E(2.0f);
                        rg2Var.f();
                        rg2Var.s(3.0f, 6.0f);
                        rg2Var.E(2.0f);
                        rg2Var.o(18.0f);
                        rg2Var.q(21.0f, 6.0f);
                        rg2Var.q(3.0f, 6.0f);
                        rg2Var.f();
                        hj0.a(hj0Var, (ArrayList) rg2Var.f, i12Var);
                        ij0Var = hj0Var.b();
                        vn.a = ij0Var;
                    }
                    ij0 ij0Var2 = ij0Var;
                    String str13 = "Menu";
                    switch (h32Var.a) {
                        case 0:
                        case 1:
                            str = str13;
                            break;
                        case 2:
                        case 3:
                            str = "Меню";
                            break;
                        default:
                            str13 = "菜单";
                            str = str13;
                            break;
                    }
                    ej0.a(ij0Var2, str, null, 0L, urVar, 0, 12);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 1:
                ur urVar2 = (ur) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (urVar2.O(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ij0 ij0Var3 = go.a;
                    if (ij0Var3 == null) {
                        hj0 hj0Var2 = new hj0("Filled.Delete", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = me2.a;
                        i12 i12Var2 = new i12(co.b);
                        rg2 rg2Var2 = new rg2(21);
                        rg2Var2.s(6.0f, 19.0f);
                        rg2Var2.i(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        rg2Var2.o(8.0f);
                        rg2Var2.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        rg2Var2.D(7.0f);
                        rg2Var2.n(6.0f);
                        rg2Var2.E(12.0f);
                        rg2Var2.f();
                        rg2Var2.s(19.0f, 4.0f);
                        rg2Var2.o(-3.5f);
                        rg2Var2.r(-1.0f, -1.0f);
                        rg2Var2.o(-5.0f);
                        rg2Var2.r(-1.0f, 1.0f);
                        rg2Var2.n(5.0f);
                        rg2Var2.E(2.0f);
                        rg2Var2.o(14.0f);
                        rg2Var2.D(4.0f);
                        rg2Var2.f();
                        hj0.a(hj0Var2, (ArrayList) rg2Var2.f, i12Var2);
                        ij0Var3 = hj0Var2.b();
                        go.a = ij0Var3;
                    }
                    switch (h32Var.a) {
                        case 0:
                            str2 = "Clear";
                            break;
                        case 1:
                            str2 = "Limpar";
                            break;
                        case 2:
                            str2 = "Очистить";
                            break;
                        case 3:
                            str2 = "Очистити";
                            break;
                        default:
                            str2 = "清空";
                            break;
                    }
                    ej0.a(ij0Var3, str2, null, ((mo) urVar2.j(oo.a)).s, urVar2, 0, 4);
                } else {
                    urVar2.R();
                }
                return od2Var;
            case 2:
                ur urVar3 = (ur) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (urVar3.O(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ij0 ij0Var4 = nq1.a;
                    if (ij0Var4 == null) {
                        hj0 hj0Var3 = new hj0("Filled.Share", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i4 = me2.a;
                        i12 i12Var3 = new i12(co.b);
                        rg2 rg2Var3 = new rg2(21);
                        rg2Var3.s(18.0f, 16.08f);
                        rg2Var3.i(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
                        rg2Var3.q(8.91f, 12.7f);
                        rg2Var3.i(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
                        rg2Var3.w(-0.04f, -0.47f, -0.09f, -0.7f);
                        rg2Var3.r(7.05f, -4.11f);
                        rg2Var3.i(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
                        rg2Var3.i(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
                        rg2Var3.w(-1.34f, -3.0f, -3.0f, -3.0f);
                        rg2Var3.w(-3.0f, 1.34f, -3.0f, 3.0f);
                        rg2Var3.i(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
                        rg2Var3.q(8.04f, 9.81f);
                        rg2Var3.h(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
                        rg2Var3.i(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                        rg2Var3.w(1.34f, 3.0f, 3.0f, 3.0f);
                        rg2Var3.i(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
                        rg2Var3.r(7.12f, 4.16f);
                        rg2Var3.i(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
                        rg2Var3.i(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
                        rg2Var3.i(1.61f, 0.0f, 2.92f, -1.31f, 2.92f, -2.92f);
                        rg2Var3.w(-1.31f, -2.92f, -2.92f, -2.92f);
                        rg2Var3.f();
                        hj0.a(hj0Var3, (ArrayList) rg2Var3.f, i12Var3);
                        ij0Var4 = hj0Var3.b();
                        nq1.a = ij0Var4;
                    }
                    ij0 ij0Var5 = ij0Var4;
                    switch (h32Var.a) {
                        case 0:
                            str3 = "Share";
                            break;
                        case 1:
                            str3 = "Compartilhar";
                            break;
                        case 2:
                            str3 = "Поделиться";
                            break;
                        case 3:
                            str3 = "Поділитися";
                            break;
                        default:
                            str3 = "分享";
                            break;
                    }
                    ej0.a(ij0Var5, str3, null, ((mo) urVar3.j(oo.a)).s, urVar3, 0, 4);
                } else {
                    urVar3.R();
                }
                return od2Var;
            case 3:
                ur urVar4 = (ur) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (urVar4.O(intValue4 & 1, (intValue4 & 3) != 2)) {
                    e21 L = sn0.L(b21Var, 8.0f, 4.0f);
                    up1 a = tp1.a(new pe(4.0f, true, new le(0)), g3.p, urVar4, 54);
                    int hashCode = Long.hashCode(urVar4.T);
                    sf1 l = urVar4.l();
                    e21 Q = fp.Q(urVar4, L);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar4.a0();
                    if (urVar4.S) {
                        urVar4.k(hsVar);
                    } else {
                        urVar4.k0();
                    }
                    op1.q(urVar4, kr.f, a);
                    op1.q(urVar4, kr.e, l);
                    op1.l(urVar4, Integer.valueOf(hashCode), kr.g);
                    op1.o(urVar4, kr.h);
                    op1.q(urVar4, kr.d, Q);
                    ij0 x = c01.x();
                    String f = h32Var.f();
                    y22 y22Var = oo.a;
                    ej0.a(x, f, hy1.f(b21Var, 14.0f), ((mo) urVar4.j(y22Var)).d, urVar4, 384, 0);
                    switch (h32Var.a) {
                        case 0:
                            str4 = "Installed";
                            break;
                        case 1:
                            str4 = "Instalado";
                            break;
                        case 2:
                            str4 = "Установлено";
                            break;
                        case 3:
                            str4 = "Встановлено";
                            break;
                        default:
                            str4 = "已安装";
                            break;
                    }
                    t82.b(str4, null, ((mo) urVar4.j(y22Var)).d, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar4.j(rc2.a)).o, urVar4, 0, 0, 131066);
                    urVar4.p(true);
                } else {
                    urVar4.R();
                }
                return od2Var;
            case 4:
                ur urVar5 = (ur) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (urVar5.O(intValue5 & 1, (intValue5 & 3) != 2)) {
                    e21 L2 = sn0.L(b21Var, 8.0f, 4.0f);
                    up1 a2 = tp1.a(new pe(4.0f, true, new le(0)), g3.p, urVar5, 54);
                    int hashCode2 = Long.hashCode(urVar5.T);
                    sf1 l2 = urVar5.l();
                    e21 Q2 = fp.Q(urVar5, L2);
                    lr.b.getClass();
                    hs hsVar2 = kr.b;
                    urVar5.a0();
                    if (urVar5.S) {
                        urVar5.k(hsVar2);
                    } else {
                        urVar5.k0();
                    }
                    op1.q(urVar5, kr.f, a2);
                    op1.q(urVar5, kr.e, l2);
                    op1.l(urVar5, Integer.valueOf(hashCode2), kr.g);
                    op1.o(urVar5, kr.h);
                    op1.q(urVar5, kr.d, Q2);
                    ij0 n = rp1.n();
                    String g = h32Var.g();
                    y22 y22Var2 = oo.a;
                    ej0.a(n, g, hy1.f(b21Var, 14.0f), ((mo) urVar5.j(y22Var2)).z, urVar5, 384, 0);
                    switch (h32Var.a) {
                        case 0:
                            str5 = "Not Installed";
                            break;
                        case 1:
                            str5 = "Não Instalado";
                            break;
                        case 2:
                            str5 = "Не установлено";
                            break;
                        case 3:
                            str5 = "Не встановлено";
                            break;
                        default:
                            str5 = "未安装";
                            break;
                    }
                    t82.b(str5, null, ((mo) urVar5.j(y22Var2)).z, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar5.j(rc2.a)).o, urVar5, 0, 0, 131066);
                    urVar5.p(true);
                } else {
                    urVar5.R();
                }
                return od2Var;
            case 5:
                ur urVar6 = (ur) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (urVar6.O(intValue6 & 1, (intValue6 & 3) != 2)) {
                    e21 L3 = sn0.L(b21Var, 8.0f, 4.0f);
                    up1 a3 = tp1.a(new pe(4.0f, true, new le(0)), g3.p, urVar6, 54);
                    int hashCode3 = Long.hashCode(urVar6.T);
                    sf1 l3 = urVar6.l();
                    e21 Q3 = fp.Q(urVar6, L3);
                    lr.b.getClass();
                    hs hsVar3 = kr.b;
                    urVar6.a0();
                    if (urVar6.S) {
                        urVar6.k(hsVar3);
                    } else {
                        urVar6.k0();
                    }
                    op1.q(urVar6, kr.f, a3);
                    op1.q(urVar6, kr.e, l3);
                    op1.l(urVar6, Integer.valueOf(hashCode3), kr.g);
                    op1.o(urVar6, kr.h);
                    op1.q(urVar6, kr.d, Q3);
                    ij0 ij0Var6 = fr1.b;
                    if (ij0Var6 == null) {
                        hj0 hj0Var4 = new hj0("Rounded.Update", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i5 = me2.a;
                        i12 i12Var4 = new i12(co.b);
                        rg2 rg2Var4 = new rg2(21);
                        rg2Var4.s(11.0f, 8.75f);
                        rg2Var4.E(3.68f);
                        rg2Var4.i(0.0f, 0.35f, 0.19f, 0.68f, 0.49f, 0.86f);
                        rg2Var4.r(3.12f, 1.85f);
                        rg2Var4.i(0.36f, 0.21f, 0.82f, 0.09f, 1.03f, -0.26f);
                        rg2Var4.i(0.21f, -0.36f, 0.1f, -0.82f, -0.26f, -1.03f);
                        rg2Var4.r(-2.87f, -1.71f);
                        rg2Var4.E(-3.4f);
                        rg2Var4.h(12.5f, 8.34f, 12.16f, 8.0f, 11.75f, 8.0f);
                        rg2Var4.v(11.0f, 8.34f, 11.0f, 8.75f);
                        rg2Var4.f();
                        rg2Var4.s(21.0f, 9.5f);
                        rg2Var4.D(4.21f);
                        rg2Var4.i(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
                        rg2Var4.r(-1.78f, 1.78f);
                        rg2Var4.i(-1.81f, -1.81f, -4.39f, -2.85f, -7.21f, -2.6f);
                        rg2Var4.i(-4.19f, 0.38f, -7.64f, 3.75f, -8.1f, 7.94f);
                        rg2Var4.h(2.46f, 16.4f, 6.69f, 21.0f, 12.0f, 21.0f);
                        rg2Var4.i(4.59f, 0.0f, 8.38f, -3.44f, 8.93f, -7.88f);
                        rg2Var4.i(0.07f, -0.6f, -0.4f, -1.12f, -1.0f, -1.12f);
                        rg2Var4.i(-0.5f, 0.0f, -0.92f, 0.37f, -0.98f, 0.86f);
                        rg2Var4.i(-0.43f, 3.49f, -3.44f, 6.19f, -7.05f, 6.14f);
                        rg2Var4.i(-3.71f, -0.05f, -6.84f, -3.18f, -6.9f, -6.9f);
                        rg2Var4.h(4.94f, 8.2f, 8.11f, 5.0f, 12.0f, 5.0f);
                        rg2Var4.i(1.93f, 0.0f, 3.68f, 0.79f, 4.95f, 2.05f);
                        rg2Var4.r(-2.09f, 2.09f);
                        rg2Var4.h(14.54f, 9.46f, 14.76f, 10.0f, 15.21f, 10.0f);
                        rg2Var4.o(5.29f);
                        rg2Var4.h(20.78f, 10.0f, 21.0f, 9.78f, 21.0f, 9.5f);
                        rg2Var4.f();
                        hj0.a(hj0Var4, (ArrayList) rg2Var4.f, i12Var4);
                        ij0Var6 = hj0Var4.b();
                        fr1.b = ij0Var6;
                    }
                    switch (h32Var.a) {
                        case 0:
                            str6 = "Update";
                            break;
                        case 1:
                            str6 = "Atualizar";
                            break;
                        case 2:
                            str6 = "Обновить";
                            break;
                        case 3:
                            str6 = "Оновити";
                            break;
                        default:
                            str6 = "更新";
                            break;
                    }
                    y22 y22Var3 = oo.a;
                    ej0.a(ij0Var6, str6, hy1.f(b21Var, 14.0f), ((mo) urVar6.j(y22Var3)).m, urVar6, 384, 0);
                    switch (h32Var.a) {
                        case 0:
                            str7 = "Update Available";
                            break;
                        case 1:
                            str7 = "Atualização Disponível";
                            break;
                        case 2:
                            str7 = "Доступно обновление";
                            break;
                        case 3:
                            str7 = "Доступне оновлення";
                            break;
                        default:
                            str7 = "有可用更新";
                            break;
                    }
                    t82.b(str7, null, ((mo) urVar6.j(y22Var3)).m, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar6.j(rc2.a)).o, urVar6, 0, 0, 131066);
                    urVar6.p(true);
                } else {
                    urVar6.R();
                }
                return od2Var;
            case 6:
                ur urVar7 = (ur) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (urVar7.O(intValue7 & 1, (intValue7 & 3) != 2)) {
                    switch (h32Var.a) {
                        case 0:
                            str8 = "Log out?";
                            break;
                        case 1:
                            str8 = "Sair da conta?";
                            break;
                        case 2:
                            str8 = "Выйти из аккаунта?";
                            break;
                        case 3:
                            str8 = "Вийти з акаунта?";
                            break;
                        default:
                            str8 = "退出登录？";
                            break;
                    }
                    t82.b(str8, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar7, 0, 0, 262142);
                } else {
                    urVar7.R();
                }
                return od2Var;
            case 7:
                ur urVar8 = (ur) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (urVar8.O(intValue8 & 1, (intValue8 & 3) != 2)) {
                    switch (h32Var.a) {
                        case 0:
                            str9 = "You'll need to enter your license key again to sign back in.";
                            break;
                        case 1:
                            str9 = "Você precisará inserir sua chave de licença novamente para entrar.";
                            break;
                        case 2:
                            str9 = "Чтобы войти снова, потребуется ввести лицензионный ключ.";
                            break;
                        case 3:
                            str9 = "Щоб увійти знову, потрібно буде ввести ліцензійний ключ.";
                            break;
                        default:
                            str9 = "您需要重新输入许可证密钥才能再次登录。";
                            break;
                    }
                    t82.b(str9, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar8, 0, 0, 262142);
                } else {
                    urVar8.R();
                }
                return od2Var;
            case 8:
                ur urVar9 = (ur) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if (urVar9.O(intValue9 & 1, (intValue9 & 3) != 2)) {
                    t82.b(h32Var.n(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar9, 0, 0, 262142);
                } else {
                    urVar9.R();
                }
                return od2Var;
            case 9:
                ur urVar10 = (ur) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if (urVar10.O(intValue10 & 1, (intValue10 & 3) != 2)) {
                    ej0.a(pp1.u(), h32Var.e(), null, 0L, urVar10, 0, 12);
                } else {
                    urVar10.R();
                }
                return od2Var;
            case 10:
                ur urVar11 = (ur) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if (urVar11.O(intValue11 & 1, (intValue11 & 3) != 2)) {
                    t82.b(h32Var.n(), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar11, 0, 0, 262142);
                } else {
                    urVar11.R();
                }
                return od2Var;
            case 11:
                ur urVar12 = (ur) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if (urVar12.O(intValue12 & 1, (intValue12 & 3) != 2)) {
                    h32Var.getClass();
                    t82.b("ELIXIR_", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar12, 0, 0, 262142);
                } else {
                    urVar12.R();
                }
                return od2Var;
            case 12:
                ur urVar13 = (ur) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if (urVar13.O(intValue13 & 1, (intValue13 & 3) != 2)) {
                    ej0.a(pp1.u(), h32Var.e(), null, 0L, urVar13, 0, 12);
                } else {
                    urVar13.R();
                }
                return od2Var;
            case 13:
                ((Integer) obj2).getClass();
                fc2.c(h32Var, (ur) obj, lo.b0(1));
                return od2Var;
            case 14:
                ur urVar14 = (ur) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if (urVar14.O(intValue14 & 1, (intValue14 & 3) != 2)) {
                    switch (h32Var.a) {
                        case 0:
                            str10 = "Auto Login";
                            break;
                        case 1:
                            str10 = "Login Automático";
                            break;
                        case 2:
                            str10 = "Автовход";
                            break;
                        case 3:
                            str10 = "Автовхід";
                            break;
                        default:
                            str10 = "自动登录";
                            break;
                    }
                    t82.b(str10, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar14, 0, 0, 262142);
                } else {
                    urVar14.R();
                }
                return od2Var;
            case 15:
                ur urVar15 = (ur) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if (urVar15.O(intValue15 & 1, (intValue15 & 3) != 2)) {
                    switch (h32Var.a) {
                        case 0:
                            str11 = "Subscription";
                            break;
                        case 1:
                            str11 = "Assinatura";
                            break;
                        case 2:
                            str11 = "Подписка";
                            break;
                        case 3:
                            str11 = "Підписка";
                            break;
                        default:
                            str11 = "订阅类型";
                            break;
                    }
                    t82.b(str11, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar15, 0, 0, 262142);
                } else {
                    urVar15.R();
                }
                return od2Var;
            case 16:
                ur urVar16 = (ur) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if (urVar16.O(intValue16 & 1, (intValue16 & 3) != 2)) {
                    switch (h32Var.a) {
                        case 0:
                            str12 = "Delete Resource?";
                            break;
                        case 1:
                            str12 = "Excluir Recurso?";
                            break;
                        case 2:
                            str12 = "Удалить ресурс?";
                            break;
                        case 3:
                            str12 = "Видалити ресурс?";
                            break;
                        default:
                            str12 = "删除资源？";
                            break;
                    }
                    t82.b(str12, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar16, 0, 0, 262142);
                } else {
                    urVar16.R();
                }
                return od2Var;
            case 17:
                ur urVar17 = (ur) obj;
                int intValue17 = ((Integer) obj2).intValue();
                if (urVar17.O(intValue17 & 1, (intValue17 & 3) != 2)) {
                    ej0.a(xn.y(), h32Var.b(), hy1.f(b21Var, 20.0f), ((mo) urVar17.j(oo.a)).w, urVar17, 384, 0);
                } else {
                    urVar17.R();
                }
                return od2Var;
            default:
                ((Integer) obj2).getClass();
                d6.i(h32Var, (ur) obj, lo.b0(7));
                return od2Var;
        }
    }

    public /* synthetic */ sd(h32 h32Var, int i, int i2) {
        this.e = i2;
        this.f = h32Var;
    }
}
