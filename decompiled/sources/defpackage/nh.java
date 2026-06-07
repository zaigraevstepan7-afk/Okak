package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class nh implements q62 {
    public final fq a;
    public final y41 b = new y41();
    public final je1 c = fr1.k(null);

    public nh(fq fqVar) {
        this.a = fqVar;
    }

    @Override // defpackage.q62
    public final Object a(i62 i62Var, q42 q42Var) {
        j4 j4Var = new j4(this, new mh(i62Var), null, 2);
        y41 y41Var = this.b;
        y41Var.getClass();
        Object u = fp.u(new uw0(t41.e, y41Var, j4Var, null), q42Var);
        if (u == hv.e) {
            return u;
        }
        return od2.a;
    }

    public final void b(final de0 de0Var, ur urVar, final int i) {
        int i2;
        boolean z;
        final de0 de0Var2;
        ur urVar2;
        urVar.Y(723898654);
        if (urVar.f(this)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i3 = i2 | i;
        final int i4 = 0;
        final int i5 = 1;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i3 & 1, z)) {
            mh mhVar = (mh) this.c.getValue();
            if (mhVar == null) {
                dl1 r = urVar.r();
                if (r != null) {
                    r.d = new se0(this, de0Var, i, i4) { // from class: lh
                        public final /* synthetic */ int e;
                        public final /* synthetic */ nh f;
                        public final /* synthetic */ de0 g;

                        {
                            this.e = i4;
                            this.f = this;
                        }

                        @Override // defpackage.se0
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = this.e;
                            od2 od2Var = od2.a;
                            de0 de0Var3 = this.g;
                            nh nhVar = this.f;
                            ur urVar3 = (ur) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    nhVar.b(de0Var3, urVar3, lo.b0(7));
                                    return od2Var;
                                default:
                                    nhVar.b(de0Var3, urVar3, lo.b0(7));
                                    return od2Var;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            de0Var2 = de0Var;
            urVar2 = urVar;
            this.a.f(mhVar, mhVar.a, de0Var2, urVar2, 384);
        } else {
            de0Var2 = de0Var;
            urVar2 = urVar;
            urVar2.R();
        }
        dl1 r2 = urVar2.r();
        if (r2 != null) {
            r2.d = new se0(this, de0Var2, i, i5) { // from class: lh
                public final /* synthetic */ int e;
                public final /* synthetic */ nh f;
                public final /* synthetic */ de0 g;

                {
                    this.e = i5;
                    this.f = this;
                }

                @Override // defpackage.se0
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = this.e;
                    od2 od2Var = od2.a;
                    de0 de0Var3 = this.g;
                    nh nhVar = this.f;
                    ur urVar3 = (ur) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            nhVar.b(de0Var3, urVar3, lo.b0(7));
                            return od2Var;
                        default:
                            nhVar.b(de0Var3, urVar3, lo.b0(7));
                            return od2Var;
                    }
                }
            };
        }
    }
}
