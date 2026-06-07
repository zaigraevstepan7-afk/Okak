package defpackage;

import com.elixir.loader.MainActivity;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class fz0 implements se0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ sl1 f;

    public /* synthetic */ fz0(sl1 sl1Var, int i) {
        this.e = i;
        this.f = sl1Var;
    }

    @Override // defpackage.se0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.e;
        od2 od2Var = od2.a;
        sl1 sl1Var = this.f;
        int i2 = 1;
        ur urVar = (ur) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i3 = MainActivity.x;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    q92.a(false, false, go.N(-1472796615, new fz0(sl1Var, i2), urVar), urVar, 384);
                } else {
                    urVar.R();
                }
                return od2Var;
            default:
                int i4 = MainActivity.x;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar.O(intValue & 1, z2)) {
                    fp.c(new v3(sl1Var, 19), urVar, 0);
                } else {
                    urVar.R();
                }
                return od2Var;
        }
    }
}
