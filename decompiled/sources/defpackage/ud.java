package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class ud implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ ud(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.e = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.j = obj5;
        this.k = obj6;
        this.l = obj7;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        switch (i) {
            case 0:
                final c61 c61Var = (c61) obj8;
                final ag agVar = (ag) obj7;
                final bi0 bi0Var = (bi0) obj6;
                final vf2 vf2Var = (vf2) obj5;
                final ew1 ew1Var = (ew1) obj4;
                final co1 co1Var = (co1) obj3;
                final el0 el0Var = (el0) obj2;
                x51 x51Var = (x51) obj;
                x51Var.getClass();
                hp.q(x51Var, "login", new fq(-1402568010, true, new ue0() { // from class: wd
                    @Override // defpackage.ue0
                    public final Object c(Object obj9, Object obj10, Object obj11, Object obj12) {
                        ur urVar = (ur) obj11;
                        ((jb) obj9).getClass();
                        ((d51) obj10).getClass();
                        c61 c61Var2 = c61.this;
                        boolean h = urVar.h(c61Var2);
                        Object L = urVar.L();
                        if (h || L == or.a) {
                            L = new td(c61Var2, 0);
                            urVar.h0(L);
                        }
                        fc2.f((de0) L, agVar, urVar, 0);
                        return od2.a;
                    }
                }));
                hp.q(x51Var, "main", new fq(-1930617185, true, new ue0() { // from class: xd
                    @Override // defpackage.ue0
                    public final Object c(Object obj9, Object obj10, Object obj11, Object obj12) {
                        ur urVar = (ur) obj11;
                        ((jb) obj9).getClass();
                        ((d51) obj10).getClass();
                        ag agVar2 = agVar;
                        boolean h = urVar.h(agVar2);
                        c61 c61Var2 = c61Var;
                        boolean h2 = h | urVar.h(c61Var2);
                        Object L = urVar.L();
                        if (h2 || L == or.a) {
                            L = new j1(4, agVar2, c61Var2);
                            urVar.h0(L);
                        }
                        f2.d(bi0.this, vf2Var, ew1Var, co1Var, el0Var, (de0) L, urVar, 0);
                        return od2.a;
                    }
                }));
                return od2.a;
            default:
                w31 w31Var = (w31) obj8;
                wq wqVar = (wq) obj7;
                oe0 oe0Var = (oe0) obj6;
                oe0 oe0Var2 = (oe0) obj5;
                oe0 oe0Var3 = (oe0) obj4;
                o41 o41Var = (o41) obj2;
                pb pbVar = (pb) obj;
                boolean contains = ((List) ((o22) obj3).getValue()).contains(pbVar.b());
                float f = 0.0f;
                if (contains) {
                    String str = ((d51) pbVar.b()).j;
                    int b = w31Var.b(str);
                    if (b >= 0) {
                        f = w31Var.c[b];
                    } else {
                        w31Var.d(str, 0.0f);
                    }
                    if (!sn0.r(((d51) pbVar.c()).j, ((d51) pbVar.b()).j)) {
                        if (!((Boolean) wqVar.c.getValue()).booleanValue() && !((Boolean) o41Var.getValue()).booleanValue()) {
                            f += 1.0f;
                        } else {
                            f -= 1.0f;
                        }
                    }
                    w31Var.d(((d51) pbVar.c()).j, f);
                    return new lt((c70) oe0Var.invoke(pbVar), (u70) oe0Var2.invoke(pbVar), f, (jy1) oe0Var3.invoke(pbVar));
                }
                return new lt(c70.b, u70.b, 0.0f, new jy1(gb.f));
        }
    }
}
