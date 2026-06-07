package defpackage;

import java.util.Collections;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ol implements te0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ol(b51 b51Var, a51 a51Var) {
        this.e = 4;
        this.f = b51Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v20, types: [g82, java.lang.Object] */
    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        int j0;
        int i;
        int i2;
        long a;
        long a2;
        int i3 = this.e;
        int i4 = 6;
        b21 b21Var = b21.a;
        xl1 xl1Var = or.a;
        boolean z3 = true;
        od2 od2Var = od2.a;
        boolean z4 = false;
        Object obj4 = this.f;
        switch (i3) {
            case 0:
                ((r) obj4).invoke((Throwable) obj);
                return od2Var;
            case 1:
                su suVar = (su) obj4;
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                if (!booleanValue) {
                    intValue = suVar.z.c(intValue);
                }
                if (!booleanValue) {
                    intValue2 = suVar.z.c(intValue2);
                }
                if (suVar.y) {
                    long j = suVar.v.b;
                    int i5 = d92.c;
                    if (intValue != ((int) (j >> 32)) || intValue2 != ((int) (j & 4294967295L))) {
                        int min = Math.min(intValue, intValue2);
                        jg0 jg0Var = jg0.e;
                        if (min >= 0 && Math.max(intValue, intValue2) <= suVar.v.a.f.length()) {
                            if (!booleanValue && intValue != intValue2) {
                                suVar.A.h(true);
                            } else {
                                b82 b82Var = suVar.A;
                                b82Var.t(false);
                                b82Var.q(jg0Var);
                            }
                            suVar.w.v.invoke(new i82(suVar.v.a, fr1.a(intValue, intValue2), (d92) null));
                            return Boolean.valueOf(z3);
                        }
                        b82 b82Var2 = suVar.A;
                        b82Var2.t(false);
                        b82Var2.q(jg0Var);
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
            case 2:
                ((my0) obj4).f.d(((qh1) obj2).c, xl1.j);
                return od2Var;
            case 3:
                bl0 bl0Var = (bl0) obj4;
                ur urVar = (ur) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((tr0) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z4 = true;
                }
                if (urVar.O(intValue3 & 1, z4)) {
                    zd2 zd2Var = bl0Var.a;
                    c01.f(zd2Var.a, zd2Var.b, zd2Var.c, urVar, 0);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 4:
                b51 b51Var = (b51) obj4;
                b51.g.set(b51Var, null);
                b51Var.f(null);
                return od2Var;
            case 5:
                se0 se0Var = (se0) obj4;
                ur urVar2 = (ur) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar2.O(intValue4 & 1, z)) {
                    se0Var.invoke(urVar2, 0);
                } else {
                    urVar2.R();
                }
                return od2Var;
            case 6:
                ((fv1) obj4).b();
                return od2Var;
            case 7:
                fq fqVar = (fq) obj4;
                ur urVar3 = (ur) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((zo) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar3.O(intValue5 & 1, z2)) {
                    e21 L = sn0.L(b21Var, 20.0f, 14.0f);
                    yo a3 = wo.a(c01.g, g3.r, urVar3, 0);
                    int hashCode = Long.hashCode(urVar3.T);
                    sf1 l = urVar3.l();
                    e21 Q = fp.Q(urVar3, L);
                    lr.b.getClass();
                    hs hsVar = kr.b;
                    urVar3.a0();
                    if (urVar3.S) {
                        urVar3.k(hsVar);
                    } else {
                        urVar3.k0();
                    }
                    op1.q(urVar3, kr.f, a3);
                    op1.q(urVar3, kr.e, l);
                    op1.l(urVar3, Integer.valueOf(hashCode), kr.g);
                    op1.o(urVar3, kr.h);
                    op1.q(urVar3, kr.d, Q);
                    fqVar.invoke(urVar3, 0);
                    urVar3.p(true);
                } else {
                    urVar3.R();
                }
                return od2Var;
            case 8:
                dz1 dz1Var = (dz1) obj4;
                l01 l01Var = (l01) obj;
                ig1 x = ((e01) obj2).x(((us) obj3).a);
                if (f20.b(Float.NaN, Float.NaN)) {
                    if (dz1Var.k == sb1.e) {
                        j0 = x.e / 2;
                    } else {
                        j0 = x.f / 2;
                    }
                } else {
                    j0 = l01Var.j0(Float.NaN);
                }
                int i6 = x.e;
                int i7 = x.f;
                Map singletonMap = Collections.singletonMap(bz1.f, Integer.valueOf(j0));
                singletonMap.getClass();
                return l01Var.s0(i6, i7, singletonMap, new df(x, 6));
            case 9:
                b82 b82Var3 = (b82) obj4;
                e21 e21Var = (e21) obj;
                ur urVar4 = (ur) obj2;
                ((Integer) obj3).getClass();
                urVar4.X(1980580247);
                c00 c00Var = (c00) urVar4.j(is.h);
                Object L2 = urVar4.L();
                Object obj5 = L2;
                if (L2 == xl1Var) {
                    je1 k = fr1.k(new en0(0L));
                    urVar4.h0(k);
                    obj5 = k;
                }
                o41 o41Var = (o41) obj5;
                boolean h = urVar4.h(b82Var3);
                Object L3 = urVar4.L();
                Object obj6 = L3;
                if (h || L3 == xl1Var) {
                    ii1 ii1Var = new ii1(i4, b82Var3, o41Var);
                    urVar4.h0(ii1Var);
                    obj6 = ii1Var;
                }
                de0 de0Var = (de0) obj6;
                boolean f = urVar4.f(c00Var);
                Object L4 = urVar4.L();
                Object obj7 = L4;
                if (f || L4 == xl1Var) {
                    e82 e82Var = new e82(c00Var, o41Var, false ? 1 : 0);
                    urVar4.h0(e82Var);
                    obj7 = e82Var;
                }
                jc jcVar = ju1.a;
                e21 t = fp.t(e21Var, new y2(5, de0Var, (oe0) obj7));
                urVar4.p(false);
                return t;
            case 10:
                k92 k92Var = (k92) obj4;
                ur urVar5 = (ur) obj2;
                ((Integer) obj3).getClass();
                urVar5.X(1582736677);
                c00 c00Var2 = (c00) urVar5.j(is.h);
                cd0 cd0Var = (cd0) urVar5.j(is.k);
                jq0 jq0Var = (jq0) urVar5.j(is.n);
                boolean f2 = urVar5.f(k92Var) | urVar5.d(jq0Var.ordinal());
                Object L5 = urVar5.L();
                Object obj8 = L5;
                if (f2 || L5 == xl1Var) {
                    k92 p = op1.p(k92Var, jq0Var);
                    urVar5.h0(p);
                    obj8 = p;
                }
                k92 k92Var2 = (k92) obj8;
                boolean f3 = urVar5.f(cd0Var) | urVar5.f(k92Var2);
                Object L6 = urVar5.L();
                Object obj9 = L6;
                if (f3 || L6 == xl1Var) {
                    m12 m12Var = k92Var2.a;
                    g52 g52Var = m12Var.f;
                    sd0 sd0Var = m12Var.c;
                    if (sd0Var == null) {
                        sd0Var = sd0.g;
                    }
                    qd0 qd0Var = m12Var.d;
                    if (qd0Var != null) {
                        i = qd0Var.a;
                    } else {
                        i = 0;
                    }
                    rd0 rd0Var = m12Var.e;
                    if (rd0Var != null) {
                        i2 = rd0Var.a;
                    } else {
                        i2 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    }
                    nc2 b = ((dd0) cd0Var).b(g52Var, sd0Var, i, i2);
                    urVar5.h0(b);
                    obj9 = b;
                }
                o22 o22Var = (o22) obj9;
                Object L7 = urVar5.L();
                Object obj10 = L7;
                if (L7 == xl1Var) {
                    Object value = o22Var.getValue();
                    ?? obj11 = new Object();
                    obj11.a = jq0Var;
                    obj11.b = c00Var2;
                    obj11.c = cd0Var;
                    obj11.d = k92Var;
                    obj11.e = value;
                    a2 = e72.a(k92Var, c00Var2, cd0Var, e72.a, 1);
                    obj11.f = a2;
                    urVar5.h0(obj11);
                    obj10 = obj11;
                }
                g82 g82Var = (g82) obj10;
                Object value2 = o22Var.getValue();
                if (jq0Var != g82Var.a || !sn0.r(c00Var2, g82Var.b) || !sn0.r(cd0Var, g82Var.c) || !sn0.r(k92Var2, g82Var.d) || !sn0.r(value2, g82Var.e)) {
                    g82Var.a = jq0Var;
                    g82Var.b = c00Var2;
                    g82Var.c = cd0Var;
                    g82Var.d = k92Var2;
                    g82Var.e = value2;
                    a = e72.a(k92Var2, c00Var2, cd0Var, e72.a, 1);
                    g82Var.f = a;
                }
                boolean h2 = urVar5.h(g82Var);
                Object L8 = urVar5.L();
                Object obj12 = L8;
                if (h2 || L8 == xl1Var) {
                    ol olVar = new ol(g82Var, 11);
                    urVar5.h0(olVar);
                    obj12 = olVar;
                }
                e21 D = mp0.D(b21Var, (te0) obj12);
                urVar5.p(false);
                return D;
            default:
                us usVar = (us) obj3;
                long j2 = ((g82) obj4).f;
                long j3 = usVar.a;
                int j4 = us.j(j3);
                long j5 = usVar.a;
                ig1 x2 = ((e01) obj2).x(us.a(j3, go.p((int) (j2 >> 32), j4, us.h(j5)), 0, go.p((int) (j2 & 4294967295L), us.i(j5), us.g(j5)), 0, 10));
                return ((l01) obj).s0(x2.e, x2.f, m60.e, new df(x2, 8));
        }
    }

    public /* synthetic */ ol(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }
}
