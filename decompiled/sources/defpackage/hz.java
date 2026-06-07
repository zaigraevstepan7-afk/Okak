package defpackage;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hz implements te0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hz(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.te0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.e;
        od2 od2Var = od2.a;
        Object obj4 = this.f;
        boolean z = false;
        switch (i2) {
            case 0:
                long j = ((co) obj).a;
                ur urVar = (ur) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    if (urVar.e(j)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                }
                if (urVar.O(intValue & 1, z)) {
                    iz.b(((o62) obj4).c, j, urVar, (intValue << 3) & 112);
                } else {
                    urVar.R();
                }
                return od2Var;
            case 1:
                long j2 = ((co) obj).a;
                ur urVar2 = (ur) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                if (urVar2.O(intValue2 & 1, z)) {
                    xl1.p.k((Drawable) obj4, urVar2, 48);
                } else {
                    urVar2.R();
                }
                return od2Var;
            default:
                long j3 = ((co) obj).a;
                ur urVar3 = (ur) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 17) != 16) {
                    z = true;
                }
                if (urVar3.O(intValue3 & 1, z)) {
                    xl1.p.l(((RemoteAction) obj4).getIcon(), urVar3, 48);
                } else {
                    urVar3.R();
                }
                return od2Var;
        }
    }
}
