package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class g80 implements te0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ g80(r31 r31Var, my1 my1Var, boolean z) {
        this.e = 1;
        this.g = r31Var;
        this.h = my1Var;
        this.f = z;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int j;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        String str2;
        int i = this.e;
        boolean z5 = this.f;
        od2 od2Var = od2.a;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                l01 l01Var = (l01) obj;
                e01 e01Var = (e01) obj2;
                us usVar = (us) obj3;
                int g = vs.g(((ge1) obj5).g(), usVar.a);
                long j2 = usVar.a;
                int f = vs.f(((ge1) obj4).g(), j2);
                if (z5) {
                    j = g;
                } else {
                    j = us.j(j2);
                }
                if (!z5) {
                    g = us.h(j2);
                }
                ig1 x = e01Var.x(us.a(usVar.a, j, g, 0, f, 4));
                return l01Var.s0(x.e, x.f, m60.e, new df(x, 1));
            case 1:
                ((Integer) obj3).getClass();
                ry1.a.a((r31) obj5, null, (my1) obj4, this.f, 0L, (ur) obj2, 196608);
                return od2Var;
            case 2:
                u72 u72Var = (u72) obj5;
                je1 je1Var = u72Var.f;
                r31 r31Var = (r31) obj4;
                ur urVar = (ur) obj2;
                ((Integer) obj3).getClass();
                urVar.X(-2137546592);
                if (urVar.j(is.n) == jq0.f) {
                    z = true;
                } else {
                    z = false;
                }
                if (((sb1) je1Var.getValue()) != sb1.e && z) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                boolean f2 = urVar.f(u72Var);
                Object L = urVar.L();
                xl1 xl1Var = or.a;
                if (f2 || L == xl1Var) {
                    L = new hh1(u72Var, 20);
                    urVar.h0(L);
                }
                o41 p = fr1.p((oe0) L, urVar);
                Object L2 = urVar.L();
                if (L2 == xl1Var) {
                    xy xyVar = new xy(new aa(p, 4));
                    urVar.h0(xyVar);
                    L2 = xyVar;
                }
                us1 us1Var = (us1) L2;
                boolean f3 = urVar.f(us1Var) | urVar.f(u72Var);
                Object L3 = urVar.L();
                if (f3 || L3 == xl1Var) {
                    L3 = new t72(us1Var, u72Var);
                    urVar.h0(L3);
                }
                t72 t72Var = (t72) L3;
                sb1 sb1Var = (sb1) je1Var.getValue();
                if (z5 && u72Var.b.g() != 0.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                e21 b = ms1.b(t72Var, sb1Var, z3, z2, r31Var);
                urVar.p(false);
                return b;
            default:
                oe0 oe0Var = (oe0) obj5;
                h32 h32Var = (h32) obj4;
                ur urVar2 = (ur) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((zo) obj).getClass();
                if ((intValue & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (urVar2.O(intValue & 1, z4)) {
                    b21 b21Var = b21.a;
                    e21 L4 = sn0.L(hy1.b(b21Var, 1.0f), 20.0f, 16.0f);
                    xl1 xl1Var2 = c01.i;
                    ji jiVar = g3.p;
                    up1 a = tp1.a(xl1Var2, jiVar, urVar2, 54);
                    int hashCode = Long.hashCode(urVar2.T);
                    sf1 l = urVar2.l();
                    e21 Q = fp.Q(urVar2, L4);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar2.a0();
                    if (urVar2.S) {
                        urVar2.k(hsVar);
                    } else {
                        urVar2.k0();
                    }
                    gb gbVar = kr.f;
                    op1.q(urVar2, gbVar, a);
                    gb gbVar2 = kr.e;
                    op1.q(urVar2, gbVar2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    gb gbVar3 = kr.g;
                    op1.l(urVar2, valueOf, gbVar3);
                    i5 i5Var = kr.h;
                    op1.o(urVar2, i5Var);
                    gb gbVar4 = kr.d;
                    op1.q(urVar2, gbVar4, Q);
                    pr0 pr0Var = new pr0(1.0f, true);
                    up1 a2 = tp1.a(c01.e, jiVar, urVar2, 48);
                    int hashCode2 = Long.hashCode(urVar2.T);
                    sf1 l2 = urVar2.l();
                    e21 Q2 = fp.Q(urVar2, pr0Var);
                    urVar2.a0();
                    if (urVar2.S) {
                        urVar2.k(hsVar);
                    } else {
                        urVar2.k0();
                    }
                    op1.q(urVar2, gbVar, a2);
                    op1.q(urVar2, gbVar2, l2);
                    l90.t(hashCode2, urVar2, gbVar3, urVar2, i5Var);
                    op1.q(urVar2, gbVar4, Q2);
                    ej0.a(f2.w(), h32Var.c(), null, io.w(urVar2).a, urVar2, 0, 4);
                    xp1.a(urVar2, hy1.j(b21Var, 16.0f));
                    yo a3 = wo.a(c01.g, g3.r, urVar2, 0);
                    int hashCode3 = Long.hashCode(urVar2.T);
                    sf1 l3 = urVar2.l();
                    e21 Q3 = fp.Q(urVar2, b21Var);
                    urVar2.a0();
                    if (urVar2.S) {
                        urVar2.k(hsVar);
                    } else {
                        urVar2.k0();
                    }
                    op1.q(urVar2, gbVar, a3);
                    op1.q(urVar2, gbVar2, l3);
                    l90.t(hashCode3, urVar2, gbVar3, urVar2, i5Var);
                    op1.q(urVar2, gbVar4, Q3);
                    switch (h32Var.a) {
                        case 0:
                            str = "Auto Update";
                            break;
                        case 1:
                            str = "Atualização Automática";
                            break;
                        case 2:
                            str = "Авто-обновление";
                            break;
                        case 3:
                            str = "Авто-оновлення";
                            break;
                        default:
                            str = "自动更新";
                            break;
                    }
                    t82.b(str, null, io.w(urVar2).q, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, k92.a(io.B(urVar2).h, 0L, 0L, sd0.i, null, 0L, 0L, null, 16777211), urVar2, 0, 0, 131066);
                    xp1.a(urVar2, hy1.c(b21Var, 4.0f));
                    switch (h32Var.a) {
                        case 0:
                            str2 = "Automatically select latest version on launch";
                            break;
                        case 1:
                            str2 = "Selecionar automaticamente a versão mais recente ao iniciar";
                            break;
                        case 2:
                            str2 = "Автоматически выбирать последнюю версию при запуске";
                            break;
                        case 3:
                            str2 = "Автоматично обирати останню версію при запуску";
                            break;
                        default:
                            str2 = "启动时自动选择最新版本";
                            break;
                    }
                    t82.b(str2, null, io.w(urVar2).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, io.B(urVar2).k, urVar2, 0, 0, 131066);
                    urVar2.p(true);
                    urVar2.p(true);
                    xp1.a(urVar2, hy1.j(b21Var, 16.0f));
                    boolean z6 = this.f;
                    a52.a(z6, oe0Var, null, go.N(2139762488, new uv1(z6, 1), urVar2), false, fr1.f(io.w(urVar2).b, io.w(urVar2).a, io.w(urVar2).a, io.w(urVar2).s, io.w(urVar2).H, io.w(urVar2).H, urVar2), urVar2, 3072, 84);
                    urVar2.p(true);
                    return od2Var;
                }
                urVar2.R();
                return od2Var;
        }
    }

    public /* synthetic */ g80(int i, Object obj, Object obj2, boolean z) {
        this.e = i;
        this.f = z;
        this.g = obj;
        this.h = obj2;
    }

    public /* synthetic */ g80(u72 u72Var, boolean z, r31 r31Var) {
        this.e = 2;
        this.g = u72Var;
        this.f = z;
        this.h = r31Var;
    }
}
