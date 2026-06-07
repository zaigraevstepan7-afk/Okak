package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class u6 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ u6(e21 e21Var, int i, int i2) {
        this.e = 0;
        this.g = e21Var;
        this.f = i2;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.e;
        od2 od2Var = od2.a;
        int i2 = this.f;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                x6.b((e21) obj3, (ur) obj, lo.b0(1), i2);
                return od2Var;
            case 1:
                ((Integer) obj2).getClass();
                hp.d((de0) obj3, (ur) obj, lo.b0(i2 | 1));
                return od2Var;
            case 2:
                jt0 jt0Var = (jt0) obj3;
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    ln0 b = jt0Var.b.b.b(i2);
                    ((ht0) b.c).c.c(jt0Var.c, Integer.valueOf(i2 - b.a), urVar, 0);
                } else {
                    urVar.R();
                }
                return od2Var;
            default:
                cd1 cd1Var = (cd1) obj3;
                ur urVar2 = (ur) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar2.O(intValue2 & 1, z2)) {
                    ln0 b2 = cd1Var.b.C().b(i2);
                    ((xc1) b2.c).b.c(gd1.a, Integer.valueOf(i2 - b2.a), urVar2, 0);
                } else {
                    urVar2.R();
                }
                return od2Var;
        }
    }

    public /* synthetic */ u6(Object obj, int i, int i2) {
        this.e = i2;
        this.g = obj;
        this.f = i;
    }
}
