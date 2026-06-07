package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class fh0 implements te0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ h32 f;
    public final /* synthetic */ o41 g;

    public /* synthetic */ fh0(o41 o41Var, h32 h32Var) {
        this.e = 2;
        this.g = o41Var;
        this.f = h32Var;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i = this.e;
        od2 od2Var = od2.a;
        b21 b21Var = b21.a;
        boolean z = false;
        h32 h32Var = this.f;
        o41 o41Var = this.g;
        int i2 = 1;
        switch (i) {
            case 0:
                ur urVar = (ur) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((vp1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                if (urVar.O(intValue & 1, z)) {
                    ij0 ij0Var = io.f;
                    if (ij0Var == null) {
                        hj0 hj0Var = new hj0("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = me2.a;
                        i12 i12Var = new i12(co.b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new ve1(8.0f, 5.0f));
                        arrayList.add(new hf1(14.0f));
                        arrayList.add(new cf1(11.0f, -7.0f));
                        arrayList.add(re1.c);
                        hj0.a(hj0Var, arrayList, i12Var);
                        ij0Var = hj0Var.b();
                        io.f = ij0Var;
                    }
                    ij0 ij0Var2 = ij0Var;
                    String str6 = "Запустить";
                    switch (h32Var.a) {
                        case 0:
                            str = "Run";
                            str2 = str;
                            break;
                        case 1:
                            str = "Executar";
                            str2 = str;
                            break;
                        case 2:
                            str2 = "Запустить";
                            break;
                        case 3:
                            str2 = "Запустити";
                            break;
                        default:
                            str = "运行";
                            str2 = str;
                            break;
                    }
                    ej0.a(ij0Var2, str2, hy1.f(b21Var, 28.0f), 0L, urVar, 384, 8);
                    xp1.a(urVar, hy1.j(b21Var, 12.0f));
                    if (((String) o41Var.getValue()) == null) {
                        switch (h32Var.a) {
                            case 0:
                                str4 = "Select version first";
                                break;
                            case 1:
                                str4 = "Selecione a versão primeiro";
                                break;
                            case 2:
                                str4 = "Сначала выберите версию";
                                break;
                            case 3:
                                str4 = "Спочатку оберіть версію";
                                break;
                            default:
                                str4 = "请先选择版本";
                                break;
                        }
                        str3 = str4;
                    } else {
                        switch (h32Var.a) {
                            case 0:
                                str6 = "Run hack";
                                break;
                            case 1:
                                str6 = "Executar hack";
                                break;
                            case 2:
                                break;
                            case 3:
                                str6 = "Запустити";
                                break;
                            default:
                                str6 = "运行注入";
                                break;
                        }
                        str3 = str6;
                    }
                    t82.b(str3, null, 0L, 0L, sd0.j, null, 0L, null, 0L, 0, false, 0, 0, ((pc2) urVar.j(rc2.a)).g, urVar, 1572864, 0, 131006);
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
                }
                if (urVar2.O(intValue2 & 1, z)) {
                    e21 L = sn0.L(hy1.b(b21Var, 1.0f), 20.0f, 14.0f);
                    up1 a = tp1.a(c01.i, g3.p, urVar2, 54);
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
                    switch (h32Var.a) {
                        case 0:
                            str5 = "Selected version";
                            break;
                        case 1:
                            str5 = "Versão selecionada";
                            break;
                        case 2:
                            str5 = "Выбранная версия";
                            break;
                        case 3:
                            str5 = "Обрана версія";
                            break;
                        default:
                            str5 = "已选版本";
                            break;
                    }
                    k92 k92Var = ((pc2) urVar2.j(rc2.a)).m;
                    y22 y22Var = oo.a;
                    t82.b(str5, null, ((mo) urVar2.j(y22Var)).d, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92Var, urVar2, 0, 0, 131066);
                    l42.a(null, lp1.a(12.0f), ((mo) urVar2.j(y22Var)).a, ((mo) urVar2.j(y22Var)).b, 0.0f, 0.0f, go.N(-69319926, new y70(o41Var, i2), urVar2), urVar2, 12582912, 113);
                    urVar2.p(true);
                } else {
                    urVar2.R();
                }
                return od2Var;
            default:
                ur urVar3 = (ur) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((tr0) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z = true;
                }
                if (urVar3.O(intValue3 & 1, z)) {
                    Object L2 = urVar3.L();
                    if (L2 == or.a) {
                        L2 = new z9(o41Var, 6);
                        urVar3.h0(L2);
                    }
                    de0 de0Var = (de0) L2;
                    e21 c = hy1.c(hy1.b(b21Var, 1.0f), 56.0f);
                    kp1 a2 = lp1.a(20.0f);
                    rc1 rc1Var = sk.a;
                    y22 y22Var2 = oo.a;
                    long j = ((mo) urVar3.j(y22Var2)).w;
                    long j2 = co.g;
                    mo moVar = (mo) urVar3.j(y22Var2);
                    rk rkVar = moVar.X;
                    if (rkVar == null) {
                        long j3 = co.f;
                        rkVar = new rk(j3, oo.d(moVar, rx.q), j3, co.b(oo.d(moVar, rx.o), rx.p));
                        moVar.X = rkVar;
                    }
                    sn0.j(de0Var, c, false, a2, rkVar.a(j2, j, j2, j2), null, null, go.N(-1623631855, new gh0(h32Var, 5), urVar3), urVar3, 805306422);
                } else {
                    urVar3.R();
                }
                return od2Var;
        }
    }

    public /* synthetic */ fh0(h32 h32Var, o41 o41Var, int i) {
        this.e = i;
        this.f = h32Var;
        this.g = o41Var;
    }
}
