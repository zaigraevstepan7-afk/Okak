package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class uv1 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ uv1(boolean z, int i) {
        this.e = i;
        this.f = z;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        ij0 y;
        ij0 y2;
        int i = this.e;
        od2 od2Var = od2.a;
        b21 b21Var = b21.a;
        boolean z = false;
        boolean z2 = this.f;
        switch (i) {
            case 0:
                ur urVar = (ur) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (urVar.O(intValue & 1, z)) {
                    if (z2) {
                        y = fc2.A();
                    } else {
                        y = c01.y();
                    }
                    ej0.a(y, null, hy1.f(b21Var, 16.0f), 0L, urVar, 48, 8);
                } else {
                    urVar.R();
                }
                return od2Var;
            default:
                ur urVar2 = (ur) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                if (urVar2.O(intValue2 & 1, z)) {
                    if (z2) {
                        y2 = fc2.A();
                    } else {
                        y2 = c01.y();
                    }
                    ej0.a(y2, null, hy1.f(b21Var, 16.0f), 0L, urVar2, 48, 8);
                } else {
                    urVar2.R();
                }
                return od2Var;
        }
    }
}
