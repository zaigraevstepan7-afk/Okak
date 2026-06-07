package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class vz1 implements se0 {
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ fq f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;

    public /* synthetic */ vz1(fq fqVar, se0 se0Var, se0 se0Var2, k92 k92Var, long j, long j2, int i) {
        this.f = fqVar;
        this.g = se0Var;
        this.h = se0Var2;
        this.i = k92Var;
        this.j = j;
        this.k = j2;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.e;
        od2 od2Var = od2.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                se0 se0Var = (se0) obj5;
                se0 se0Var2 = (se0) obj4;
                k92 k92Var = (k92) obj3;
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(1 & intValue, z)) {
                    urVar.X(-168976609);
                    rp1.a(this.f, se0Var, se0Var2, k92Var, this.j, this.k, urVar, 0);
                    urVar.p(false);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 1:
                ((Integer) obj2).getClass();
                rp1.a(this.f, (se0) obj5, (se0) obj4, (k92) obj3, this.j, this.k, (ur) obj, lo.b0(1));
                return od2Var;
            default:
                ((Integer) obj2).getClass();
                u61.b((e21) obj5, (kw1) obj4, this.j, this.k, (th2) obj3, this.f, (ur) obj, lo.b0(1572865));
                return od2Var;
        }
    }

    public /* synthetic */ vz1(se0 se0Var, fq fqVar, se0 se0Var2, k92 k92Var, long j, long j2) {
        this.g = se0Var;
        this.f = fqVar;
        this.h = se0Var2;
        this.i = k92Var;
        this.j = j;
        this.k = j2;
    }

    public /* synthetic */ vz1(e21 e21Var, kw1 kw1Var, long j, long j2, th2 th2Var, fq fqVar, int i) {
        this.g = e21Var;
        this.h = kw1Var;
        this.j = j;
        this.k = j2;
        this.i = th2Var;
        this.f = fqVar;
    }
}
