package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class p9 implements te0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;

    public /* synthetic */ p9(my1 my1Var, boolean z) {
        this.e = 2;
        this.f = z;
        this.g = my1Var;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.e;
        boolean z = false;
        od2 od2Var = od2.a;
        Object obj4 = this.g;
        switch (i2) {
            case 0:
                final de0 de0Var = (de0) obj4;
                e21 e21Var = (e21) obj;
                ur urVar = (ur) obj2;
                ((Integer) obj3).getClass();
                urVar.X(-196777734);
                final long j = ((e92) urVar.j(f92.a)).a;
                boolean e = urVar.e(j) | urVar.f(de0Var);
                final boolean z2 = this.f;
                boolean g = e | urVar.g(z2);
                Object L = urVar.L();
                if (g || L == or.a) {
                    L = new oe0() { // from class: q9
                        @Override // defpackage.oe0
                        public final Object invoke(Object obj5) {
                            dl dlVar = (dl) obj5;
                            final t7 u = d6.u(dlVar, Float.intBitsToFloat((int) (dlVar.e.d() >> 32)) / 2.0f);
                            final ni niVar = new ni(5, j);
                            final de0 de0Var2 = de0Var;
                            final boolean z3 = z2;
                            return dlVar.b(new oe0() { // from class: i9
                                @Override // defpackage.oe0
                                public final Object invoke(Object obj6) {
                                    cr0 cr0Var = (cr0) obj6;
                                    cr0Var.b();
                                    vl vlVar = cr0Var.e;
                                    boolean booleanValue = ((Boolean) de0.this.invoke()).booleanValue();
                                    od2 od2Var2 = od2.a;
                                    if (!booleanValue) {
                                        return od2Var2;
                                    }
                                    boolean z4 = z3;
                                    t7 t7Var = u;
                                    ni niVar2 = niVar;
                                    if (z4) {
                                        long l0 = vlVar.l0();
                                        ld ldVar = vlVar.f;
                                        long k = ldVar.k();
                                        ldVar.h().h();
                                        try {
                                            ((rg2) ldVar.f).z(-1.0f, 1.0f, l0);
                                            vlVar.e(t7Var, niVar2);
                                            return od2Var2;
                                        } finally {
                                            l90.v(ldVar, k);
                                        }
                                    }
                                    vlVar.e(t7Var, niVar2);
                                    return od2Var2;
                                }
                            });
                        }
                    };
                    urVar.h0(L);
                }
                e21 u = rx.u(e21Var, (oe0) L);
                urVar.p(false);
                return u;
            case 1:
                qk1 qk1Var = (qk1) obj4;
                lj ljVar = (lj) obj;
                ur urVar2 = (ur) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (urVar2.f(ljVar)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                }
                if (urVar2.O(intValue & 1, z)) {
                    hk1 hk1Var = hk1.a;
                    ki kiVar = g3.g;
                    ljVar.getClass();
                    hk1Var.a(qk1Var, this.f, lj.a(b21.a, kiVar), 0L, 0L, 0.0f, urVar2, 1572864);
                } else {
                    urVar2.R();
                }
                return od2Var;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                ry1.a.b((dz1) obj, null, this.f, (my1) obj4, null, null, 0.0f, 0.0f, (ur) obj2, (intValue2 & 14) | 100663296);
                return od2Var;
        }
    }

    public /* synthetic */ p9(int i, Object obj, boolean z) {
        this.e = i;
        this.g = obj;
        this.f = z;
    }
}
