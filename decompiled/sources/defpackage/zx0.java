package defpackage;

import com.topjohnwu.superuser.nio.FileSystemManager;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class zx0 implements te0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    public /* synthetic */ zx0(String str, int i) {
        this.e = i;
        this.f = str;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean h;
        int i;
        int i2 = this.e;
        od2 od2Var = od2.a;
        boolean z3 = false;
        switch (i2) {
            case 0:
                ur urVar = (ur) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((vp1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    t82.b(this.f, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar, 0, 0, 262142);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 1:
                ur urVar2 = (ur) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((vp1) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (urVar2.O(intValue2 & 1, z2)) {
                    t82.b(this.f, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar2, 0, 0, 262142);
                } else {
                    urVar2.R();
                }
                return od2Var;
            case 2:
                boolean z4 = false;
                sa2 sa2Var = (sa2) obj;
                ur urVar3 = (ur) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    if ((intValue3 & 8) == 0) {
                        h = urVar3.f(sa2Var);
                    } else {
                        h = urVar3.h(sa2Var);
                    }
                    if (h) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue3 |= i;
                }
                if ((intValue3 & 19) != 18) {
                    z4 = true;
                }
                if (urVar3.O(intValue3 & 1, z4)) {
                    qa2.a(sa2Var, null, 0.0f, null, 0L, 0L, go.N(435848468, new nd(this.f, 8), urVar3), urVar3, (intValue3 & 14) | FileSystemManager.MODE_READ_WRITE);
                } else {
                    urVar3.R();
                }
                return od2Var;
            default:
                ur urVar4 = (ur) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 17) != 16) {
                    z3 = true;
                }
                if (urVar4.O(intValue4 & 1, z3)) {
                    t82.b(this.f, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, urVar4, 0, 0, 262142);
                } else {
                    urVar4.R();
                }
                return od2Var;
        }
    }
}
