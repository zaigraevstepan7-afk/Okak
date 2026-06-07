package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class cq implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ cq(int i, is0 is0Var, Object obj) {
        this.e = 3;
        this.g = is0Var;
        this.f = i;
        this.h = obj;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.e;
        od2 od2Var = od2.a;
        int i2 = this.f;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((fq) obj4).g(obj3, (ur) obj, lo.b0(i2) | 1);
                return od2Var;
            case 1:
                ((Integer) obj2).intValue();
                vn.b((zj1) obj4, (se0) obj3, (ur) obj, lo.b0(i2 | 1));
                return od2Var;
            case 2:
                ((Integer) obj2).getClass();
                vn.c((zj1[]) obj4, (se0) obj3, (ur) obj, lo.b0(i2 | 1));
                return od2Var;
            case 3:
                is0 is0Var = (is0) obj4;
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    is0Var.b(i2, obj3, urVar, 0);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 4:
                ((Integer) obj2).getClass();
                ((jt0) obj4).b(i2, obj3, (ur) obj, lo.b0(1));
                return od2Var;
            case 5:
                ((Integer) obj2).getClass();
                ((cd1) obj4).b(i2, obj3, (ur) obj, lo.b0(1));
                return od2Var;
            case 6:
                ((Integer) obj2).getClass();
                pp1.d((pz1) obj4, (e21) obj3, (ur) obj, lo.b0(i2 | 1));
                return od2Var;
            case 7:
                ((Integer) obj2).getClass();
                t82.a((k92) obj3, (fq) obj4, (ur) obj, lo.b0(i2 | 1));
                return od2Var;
            default:
                ((Integer) obj2).intValue();
                ((lb2) obj4).a(obj3, (ur) obj, lo.b0(i2 | 1));
                return od2Var;
        }
    }

    public /* synthetic */ cq(is0 is0Var, int i, Object obj, int i2, int i3) {
        this.e = i3;
        this.g = is0Var;
        this.f = i;
        this.h = obj;
    }

    public /* synthetic */ cq(k92 k92Var, fq fqVar, int i) {
        this.e = 7;
        this.h = k92Var;
        this.g = fqVar;
        this.f = i;
    }

    public /* synthetic */ cq(Object obj, int i, int i2, Object obj2) {
        this.e = i2;
        this.g = obj;
        this.h = obj2;
        this.f = i;
    }
}
