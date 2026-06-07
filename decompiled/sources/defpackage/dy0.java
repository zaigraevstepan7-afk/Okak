package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class dy0 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ o22 f;

    public /* synthetic */ dy0(o22 o22Var, int i) {
        this.e = i;
        this.f = o22Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        ij0 y;
        int i = this.e;
        od2 od2Var = od2.a;
        boolean z2 = false;
        o22 o22Var = this.f;
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
                    c80.a.a(((Boolean) o22Var.getValue()).booleanValue(), null, urVar, 0);
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
                    if (((Boolean) o22Var.getValue()).booleanValue()) {
                        y = fc2.A();
                    } else {
                        y = c01.y();
                    }
                    ej0.a(y, null, hy1.f(b21.a, 12.0f), 0L, urVar2, 48, 8);
                } else {
                    urVar2.R();
                }
                return od2Var;
        }
    }
}
