package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class in1 implements se0 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ String f;
    public final /* synthetic */ ij0 g;

    public /* synthetic */ in1(ij0 ij0Var, String str) {
        this.g = ij0Var;
        this.f = str;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.e;
        od2 od2Var = od2.a;
        switch (i) {
            case 0:
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    ej0.a(this.g, this.f, null, 0L, urVar, 0, 12);
                } else {
                    urVar.R();
                }
                return od2Var;
            default:
                ((Integer) obj2).getClass();
                bf.o(this.f, this.g, (ur) obj, lo.b0(1));
                return od2Var;
        }
    }

    public /* synthetic */ in1(String str, ij0 ij0Var, int i) {
        this.f = str;
        this.g = ij0Var;
    }
}
