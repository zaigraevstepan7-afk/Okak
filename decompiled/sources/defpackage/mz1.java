package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class mz1 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ pz1 f;

    public /* synthetic */ mz1(pz1 pz1Var, int i) {
        this.e = i;
        this.f = pz1Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.e;
        od2 od2Var = od2.a;
        boolean z2 = false;
        pz1 pz1Var = this.f;
        switch (i) {
            case 0:
                fq fqVar = sn0.i;
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(1 & intValue, z)) {
                    pz1Var.getClass();
                    fqVar.invoke(pz1Var, urVar, 0);
                } else {
                    urVar.R();
                }
                return od2Var;
            default:
                ur urVar2 = (ur) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                if (urVar2.O(intValue2 & 1, z2)) {
                    t82.b(pz1Var.a.a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar2, 0, 0, 262142);
                } else {
                    urVar2.R();
                }
                return od2Var;
        }
    }
}
