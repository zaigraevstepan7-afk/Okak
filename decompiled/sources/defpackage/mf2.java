package defpackage;

import android.text.format.DateFormat;
import java.util.ArrayList;
import java.util.Date;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class mf2 implements te0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ h32 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ mf2(h32 h32Var, ef2 ef2Var, o22 o22Var) {
        this.f = h32Var;
        this.g = ef2Var;
        this.h = o22Var;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        long j;
        long j2;
        long j3;
        String str2;
        String str3;
        boolean z4;
        String str4;
        String str5;
        boolean z5;
        int i = this.e;
        od2 od2Var = od2.a;
        h32 h32Var = this.f;
        Object obj4 = this.h;
        Object obj5 = this.g;
        int i2 = 1;
        switch (i) {
            case 0:
                ef2 ef2Var = (ef2) obj5;
                o22 o22Var = (o22) obj4;
                ur urVar = (ur) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zo) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    b21 b21Var = b21.a;
                    e21 K = sn0.K(b21Var, 20.0f);
                    yo a = wo.a(c01.g, g3.r, urVar, 0);
                    int hashCode = Long.hashCode(urVar.T);
                    sf1 l = urVar.l();
                    e21 Q = fp.Q(urVar, K);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar.a0();
                    if (urVar.S) {
                        urVar.k(hsVar);
                    } else {
                        urVar.k0();
                    }
                    gb gbVar = kr.f;
                    op1.q(urVar, gbVar, a);
                    gb gbVar2 = kr.e;
                    op1.q(urVar, gbVar2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    gb gbVar3 = kr.g;
                    op1.l(urVar, valueOf, gbVar3);
                    i5 i5Var = kr.h;
                    op1.o(urVar, i5Var);
                    gb gbVar4 = kr.d;
                    op1.q(urVar, gbVar4, Q);
                    ji jiVar = g3.p;
                    xl1 xl1Var = c01.i;
                    e21 b = hy1.b(b21Var, 1.0f);
                    up1 a2 = tp1.a(xl1Var, jiVar, urVar, 54);
                    int hashCode2 = Long.hashCode(urVar.T);
                    sf1 l2 = urVar.l();
                    e21 Q2 = fp.Q(urVar, b);
                    urVar.a0();
                    if (urVar.S) {
                        urVar.k(hsVar);
                    } else {
                        urVar.k0();
                    }
                    op1.q(urVar, gbVar, a2);
                    op1.q(urVar, gbVar2, l2);
                    l90.t(hashCode2, urVar, gbVar3, urVar, i5Var);
                    op1.q(urVar, gbVar4, Q2);
                    String str6 = ef2Var.a;
                    boolean z6 = ef2Var.j;
                    String l3 = l90.l("v", str6);
                    if (z6) {
                        urVar.X(623803898);
                        str = l3;
                        z2 = z6;
                        j = ((mo) urVar.j(oo.a)).a;
                        z3 = false;
                    } else {
                        str = l3;
                        z2 = z6;
                        z3 = false;
                        urVar.X(623805157);
                        j = ((mo) urVar.j(oo.a)).h;
                    }
                    urVar.p(z3);
                    if (z2) {
                        urVar.X(623808508);
                        j2 = j;
                        j3 = ((mo) urVar.j(oo.a)).b;
                    } else {
                        j2 = j;
                        urVar.X(623809831);
                        j3 = ((mo) urVar.j(oo.a)).i;
                    }
                    urVar.p(z3);
                    d6.e(str, j2, j3, urVar, 0);
                    xp1.a(urVar, hy1.j(b21Var, 8.0f));
                    String obj6 = DateFormat.format("dd MMM yyyy", new Date(ef2Var.d)).toString();
                    y22 y22Var = rc2.a;
                    boolean z7 = z2;
                    t82.b(obj6, null, co.b(((co) o22Var.getValue()).a, 0.7f), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar.j(y22Var)).n, urVar, 0, 0, 131066);
                    urVar.p(true);
                    xp1.a(urVar, hy1.c(b21Var, 12.0f));
                    switch (h32Var.a) {
                        case 0:
                            str2 = "Game Ver";
                            break;
                        case 1:
                            str2 = "Versão do Jogo";
                            break;
                        case 2:
                            str2 = "Версия игры";
                            break;
                        case 3:
                            str2 = "Версія гри";
                            break;
                        default:
                            str2 = "游戏版本";
                            break;
                    }
                    t82.b(str2 + ": " + ef2Var.b, null, ((co) o22Var.getValue()).a, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92.a(((pc2) urVar.j(y22Var)).h, 0L, 0L, sd0.j, null, 0L, 0L, null, 16777211), urVar, 0, 0, 131066);
                    xp1.a(urVar, hy1.c(b21Var, 8.0f));
                    t82.b(p32.B(ef2Var.c, "\\n", "\n"), null, co.b(((co) o22Var.getValue()).a, 0.9f), 0L, null, null, 0L, null, 0L, 2, false, 3, 0, ((pc2) urVar.j(y22Var)).k, urVar, 0, 24960, 110586);
                    xp1.a(urVar, hy1.c(b21Var, 16.0f));
                    e21 b2 = hy1.b(b21Var, 1.0f);
                    up1 a3 = tp1.a(c01.e, jiVar, urVar, 48);
                    int hashCode3 = Long.hashCode(urVar.T);
                    sf1 l4 = urVar.l();
                    e21 Q3 = fp.Q(urVar, b2);
                    urVar.a0();
                    if (urVar.S) {
                        urVar.k(hsVar);
                    } else {
                        urVar.k0();
                    }
                    op1.q(urVar, gbVar, a3);
                    op1.q(urVar, gbVar2, l4);
                    l90.t(hashCode3, urVar, gbVar3, urVar, i5Var);
                    op1.q(urVar, gbVar4, Q3);
                    if (ef2Var.h) {
                        urVar.X(779224759);
                        ij0 n = rp1.n();
                        switch (h32Var.a) {
                            case 0:
                                str5 = "Expired";
                                break;
                            case 1:
                                str5 = "Expirado";
                                break;
                            case 2:
                                str5 = "Истекла";
                                break;
                            case 3:
                                str5 = "Закінчилася";
                                break;
                            default:
                                str5 = "已过期";
                                break;
                        }
                        d6.m(n, str5, ((mo) urVar.j(oo.a)).w, urVar, 0);
                        urVar.p(false);
                    } else if (z7) {
                        urVar.X(779537394);
                        ij0 x = c01.x();
                        String str7 = "Активна";
                        switch (h32Var.a) {
                            case 0:
                                str7 = "Active";
                                break;
                            case 1:
                                str7 = "Ativo";
                                break;
                            case 2:
                            case 3:
                                break;
                            default:
                                str7 = "当前";
                                break;
                        }
                        d6.m(x, str7, ((mo) urVar.j(oo.a)).a, urVar, 0);
                        urVar.p(false);
                    } else {
                        urVar.X(779853842);
                        if (ef2Var.i) {
                            urVar.X(779893429);
                            ij0 x2 = c01.x();
                            switch (h32Var.a) {
                                case 0:
                                    str4 = "Downloaded";
                                    break;
                                case 1:
                                    str4 = "Baixado";
                                    break;
                                case 2:
                                    str4 = "Загружена";
                                    break;
                                case 3:
                                    str4 = "Завантажена";
                                    break;
                                default:
                                    str4 = "已下载";
                                    break;
                            }
                            d6.m(x2, str4, ((mo) urVar.j(oo.a)).j, urVar, 0);
                            z4 = false;
                            urVar.p(false);
                        } else {
                            urVar.X(780202003);
                            ij0 w = f2.w();
                            switch (h32Var.a) {
                                case 0:
                                    str3 = "Tap to Choose";
                                    break;
                                case 1:
                                    str3 = "Toque para Escolher";
                                    break;
                                case 2:
                                    str3 = "Нажмите для выбора";
                                    break;
                                case 3:
                                    str3 = "Натисніть для вибору";
                                    break;
                                default:
                                    str3 = "点击选择";
                                    break;
                            }
                            d6.m(w, str3, co.b(((co) o22Var.getValue()).a, 0.6f), urVar, 0);
                            z4 = false;
                            urVar.p(false);
                        }
                        urVar.p(z4);
                    }
                    urVar.p(true);
                    urVar.p(true);
                    return od2Var;
                }
                urVar.R();
                return od2Var;
            default:
                of2 of2Var = (of2) obj5;
                vf2 vf2Var = (vf2) obj4;
                ur urVar2 = (ur) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((lj) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (urVar2.O(intValue2 & 1, z5)) {
                    ArrayList arrayList = of2Var.a;
                    boolean h = urVar2.h(vf2Var);
                    Object L = urVar2.L();
                    if (h || L == or.a) {
                        L = new lf2(vf2Var, i2);
                        urVar2.h0(L);
                    }
                    d6.o(arrayList, (oe0) L, h32Var, urVar2, 0);
                } else {
                    urVar2.R();
                }
                return od2Var;
        }
    }

    public /* synthetic */ mf2(of2 of2Var, vf2 vf2Var, h32 h32Var) {
        this.g = of2Var;
        this.h = vf2Var;
        this.f = h32Var;
    }
}
