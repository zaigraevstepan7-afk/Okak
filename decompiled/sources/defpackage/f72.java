package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class f72 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public final /* synthetic */ se0 g;

    public /* synthetic */ f72(long j, se0 se0Var, int i) {
        this.e = 0;
        this.f = j;
        this.g = se0Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.e;
        od2 od2Var = od2.a;
        se0 se0Var = this.g;
        long j = this.f;
        ur urVar = (ur) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                pp1.c(j, se0Var, urVar, lo.b0(1));
                return od2Var;
            case 1:
                int intValue = num.intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    pp1.c(j, se0Var, urVar, 0);
                } else {
                    urVar.R();
                }
                return od2Var;
            default:
                int intValue2 = num.intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar.O(intValue2 & 1, z2)) {
                    pp1.c(j, se0Var, urVar, 0);
                } else {
                    urVar.R();
                }
                return od2Var;
        }
    }

    public /* synthetic */ f72(long j, se0 se0Var, int i, byte b) {
        this.e = i;
        this.f = j;
        this.g = se0Var;
    }
}
