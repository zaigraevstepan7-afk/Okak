package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class r00 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ r00(d51 d51Var, List list, boolean z) {
        this.e = 0;
        this.g = d51Var;
        this.f = z;
        this.h = list;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        od2 od2Var = od2.a;
        final int i2 = 3;
        final int i3 = 0;
        Object obj2 = this.h;
        Object obj3 = this.g;
        final boolean z = this.f;
        switch (i) {
            case 0:
                final d51 d51Var = (d51) obj3;
                final List list = (List) obj2;
                su0 su0Var = new su0() { // from class: s00
                    @Override // defpackage.su0
                    public final void g(uu0 uu0Var, mu0 mu0Var) {
                        boolean z2 = z;
                        List list2 = list;
                        d51 d51Var2 = d51Var;
                        if (z2 && !list2.contains(d51Var2)) {
                            list2.add(d51Var2);
                        }
                        if (mu0Var == mu0.ON_START && !list2.contains(d51Var2)) {
                            list2.add(d51Var2);
                        }
                        if (mu0Var == mu0.ON_STOP) {
                            list2.remove(d51Var2);
                        }
                    }
                };
                d51Var.l.j.a(su0Var);
                return new h6(i2, d51Var, su0Var);
            case 1:
                final uy uyVar = (uy) obj3;
                final gv gvVar = (gv) obj2;
                av1 av1Var = (av1) obj;
                if (z) {
                    de0 de0Var = new de0() { // from class: zc1
                        @Override // defpackage.de0
                        public final Object invoke() {
                            int i4 = i3;
                            vt vtVar = null;
                            gv gvVar2 = gvVar;
                            uy uyVar2 = uyVar;
                            boolean z2 = false;
                            boolean z3 = false;
                            boolean z4 = false;
                            boolean z5 = false;
                            int i5 = 1;
                            switch (i4) {
                                case 0:
                                    if (uyVar2.b()) {
                                        rx.C(gvVar2, null, new ad1(uyVar2, vtVar, z2 ? 1 : 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (uyVar2.c()) {
                                        rx.C(gvVar2, null, new ad1(uyVar2, vtVar, i5), 3);
                                        z5 = true;
                                    }
                                    return Boolean.valueOf(z5);
                                case 2:
                                    if (uyVar2.b()) {
                                        rx.C(gvVar2, null, new ad1(uyVar2, vtVar, z2 ? 1 : 0), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                default:
                                    if (uyVar2.c()) {
                                        rx.C(gvVar2, null, new ad1(uyVar2, vtVar, i5), 3);
                                        z3 = true;
                                    }
                                    return Boolean.valueOf(z3);
                            }
                        }
                    };
                    ep0[] ep0VarArr = xu1.a;
                    av1Var.a(lu1.y, new s0(null, de0Var));
                    final int i4 = 1;
                    av1Var.a(lu1.A, new s0(null, new de0() { // from class: zc1
                        @Override // defpackage.de0
                        public final Object invoke() {
                            int i42 = i4;
                            vt vtVar = null;
                            gv gvVar2 = gvVar;
                            uy uyVar2 = uyVar;
                            boolean z2 = false;
                            boolean z3 = false;
                            boolean z4 = false;
                            boolean z5 = false;
                            int i5 = 1;
                            switch (i42) {
                                case 0:
                                    if (uyVar2.b()) {
                                        rx.C(gvVar2, null, new ad1(uyVar2, vtVar, z2 ? 1 : 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (uyVar2.c()) {
                                        rx.C(gvVar2, null, new ad1(uyVar2, vtVar, i5), 3);
                                        z5 = true;
                                    }
                                    return Boolean.valueOf(z5);
                                case 2:
                                    if (uyVar2.b()) {
                                        rx.C(gvVar2, null, new ad1(uyVar2, vtVar, z2 ? 1 : 0), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                default:
                                    if (uyVar2.c()) {
                                        rx.C(gvVar2, null, new ad1(uyVar2, vtVar, i5), 3);
                                        z3 = true;
                                    }
                                    return Boolean.valueOf(z3);
                            }
                        }
                    }));
                } else {
                    final int i5 = 2;
                    de0 de0Var2 = new de0() { // from class: zc1
                        @Override // defpackage.de0
                        public final Object invoke() {
                            int i42 = i5;
                            vt vtVar = null;
                            gv gvVar2 = gvVar;
                            uy uyVar2 = uyVar;
                            boolean z2 = false;
                            boolean z3 = false;
                            boolean z4 = false;
                            boolean z5 = false;
                            int i52 = 1;
                            switch (i42) {
                                case 0:
                                    if (uyVar2.b()) {
                                        rx.C(gvVar2, null, new ad1(uyVar2, vtVar, z2 ? 1 : 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (uyVar2.c()) {
                                        rx.C(gvVar2, null, new ad1(uyVar2, vtVar, i52), 3);
                                        z5 = true;
                                    }
                                    return Boolean.valueOf(z5);
                                case 2:
                                    if (uyVar2.b()) {
                                        rx.C(gvVar2, null, new ad1(uyVar2, vtVar, z2 ? 1 : 0), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                default:
                                    if (uyVar2.c()) {
                                        rx.C(gvVar2, null, new ad1(uyVar2, vtVar, i52), 3);
                                        z3 = true;
                                    }
                                    return Boolean.valueOf(z3);
                            }
                        }
                    };
                    ep0[] ep0VarArr2 = xu1.a;
                    av1Var.a(lu1.z, new s0(null, de0Var2));
                    av1Var.a(lu1.B, new s0(null, new de0() { // from class: zc1
                        @Override // defpackage.de0
                        public final Object invoke() {
                            int i42 = i2;
                            vt vtVar = null;
                            gv gvVar2 = gvVar;
                            uy uyVar2 = uyVar;
                            boolean z2 = false;
                            boolean z3 = false;
                            boolean z4 = false;
                            boolean z5 = false;
                            int i52 = 1;
                            switch (i42) {
                                case 0:
                                    if (uyVar2.b()) {
                                        rx.C(gvVar2, null, new ad1(uyVar2, vtVar, z2 ? 1 : 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (uyVar2.c()) {
                                        rx.C(gvVar2, null, new ad1(uyVar2, vtVar, i52), 3);
                                        z5 = true;
                                    }
                                    return Boolean.valueOf(z5);
                                case 2:
                                    if (uyVar2.b()) {
                                        rx.C(gvVar2, null, new ad1(uyVar2, vtVar, z2 ? 1 : 0), 3);
                                        z4 = true;
                                    }
                                    return Boolean.valueOf(z4);
                                default:
                                    if (uyVar2.c()) {
                                        rx.C(gvVar2, null, new ad1(uyVar2, vtVar, i52), 3);
                                        z3 = true;
                                    }
                                    return Boolean.valueOf(z3);
                            }
                        }
                    }));
                }
                return od2Var;
            case 2:
                de0 de0Var3 = (de0) obj3;
                oe0 oe0Var = (oe0) obj2;
                fx1 fx1Var = (fx1) obj;
                if (z && fx1Var == fx1.g) {
                    fx1Var = fx1.f;
                }
                return new ex1(z, de0Var3, fx1Var, oe0Var);
            default:
                String str = (String) obj3;
                pz1 pz1Var = (pz1) obj2;
                av1 av1Var2 = (av1) obj;
                if (z) {
                    ep0[] ep0VarArr3 = xu1.a;
                    zu1 zu1Var = vu1.j;
                    ep0 ep0Var = xu1.a[3];
                    av1Var2.a(zu1Var, new mw0(0));
                }
                nz1 nz1Var = new nz1(pz1Var, 0);
                ep0[] ep0VarArr4 = xu1.a;
                av1Var2.a(lu1.v, new s0(null, nz1Var));
                xu1.c(av1Var2, str);
                return od2Var;
        }
    }

    public /* synthetic */ r00(int i, Object obj, Object obj2, boolean z) {
        this.e = i;
        this.f = z;
        this.g = obj;
        this.h = obj2;
    }

    public /* synthetic */ r00(boolean z, de0 de0Var, de0 de0Var2, oe0 oe0Var) {
        this.e = 2;
        this.f = z;
        this.g = de0Var;
        this.h = oe0Var;
    }
}
