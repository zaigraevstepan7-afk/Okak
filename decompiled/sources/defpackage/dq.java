package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class dq implements se0 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ int f;
    public final /* synthetic */ fq g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ dq(int i, se0 se0Var, fq fqVar, se0 se0Var2, se0 se0Var3, s41 s41Var, se0 se0Var4) {
        this.f = i;
        this.h = se0Var;
        this.g = fqVar;
        this.i = se0Var2;
        this.j = se0Var3;
        this.k = s41Var;
        this.l = se0Var4;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.e;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        od2 od2Var = od2.a;
        Object obj7 = this.l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                this.g.h(this.h, (Boolean) obj7, this.i, this.j, this.k, (ur) obj, lo.b0(this.f) | 1);
                return od2Var;
            case 1:
                se0 se0Var = (se0) obj6;
                se0 se0Var2 = (se0) obj5;
                se0 se0Var3 = (se0) obj4;
                s41 s41Var = (s41) obj3;
                se0 se0Var4 = (se0) obj7;
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    op1.c(this.f, se0Var, this.g, se0Var2, se0Var3, s41Var, se0Var4, urVar, 0);
                } else {
                    urVar.R();
                }
                return od2Var;
            default:
                ((Integer) obj2).getClass();
                op1.c(this.f, (se0) obj6, this.g, (se0) obj5, (se0) obj4, (th2) obj3, (se0) obj7, (ur) obj, lo.b0(1));
                return od2Var;
        }
    }

    public /* synthetic */ dq(int i, se0 se0Var, fq fqVar, se0 se0Var2, se0 se0Var3, th2 th2Var, se0 se0Var4, int i2) {
        this.f = i;
        this.h = se0Var;
        this.g = fqVar;
        this.i = se0Var2;
        this.j = se0Var3;
        this.k = th2Var;
        this.l = se0Var4;
    }

    public /* synthetic */ dq(fq fqVar, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i) {
        this.g = fqVar;
        this.h = obj;
        this.l = bool;
        this.i = obj2;
        this.j = obj3;
        this.k = obj4;
        this.f = i;
    }
}
