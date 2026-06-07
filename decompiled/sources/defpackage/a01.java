package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class a01 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ pc2 f;
    public final /* synthetic */ fq g;

    public /* synthetic */ a01(pc2 pc2Var, fq fqVar, int i) {
        this.e = i;
        this.f = pc2Var;
        this.g = fqVar;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.e;
        od2 od2Var = od2.a;
        boolean z2 = false;
        fq fqVar = this.g;
        pc2 pc2Var = this.f;
        int i2 = 1;
        ur urVar = (ur) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (urVar.O(intValue & 1, z2)) {
                    di1.a(go.N(-241536773, new a01(pc2Var, fqVar, i2), urVar), urVar, 6);
                } else {
                    urVar.R();
                }
                return od2Var;
            default:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    t82.a(pc2Var.j, fqVar, urVar, 0);
                } else {
                    urVar.R();
                }
                return od2Var;
        }
    }
}
