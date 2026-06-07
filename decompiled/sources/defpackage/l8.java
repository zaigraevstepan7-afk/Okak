package defpackage;

import android.graphics.Typeface;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class l8 implements ue0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l8(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.ue0
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        int i2 = this.e;
        Object obj5 = this.f;
        switch (i2) {
            case 0:
                m8 m8Var = (m8) obj5;
                nc2 b = ((dd0) m8Var.e).b((g52) obj, (sd0) obj2, ((qd0) obj3).a, ((rd0) obj4).a);
                if (!(b instanceof nc2)) {
                    ld ldVar = new ld(b, m8Var.j);
                    m8Var.j = ldVar;
                    Object obj6 = ldVar.h;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                Object obj7 = b.e;
                obj7.getClass();
                return (Typeface) obj7;
            default:
                fq fqVar = (fq) obj5;
                tr0 tr0Var = (tr0) obj;
                ((Integer) obj2).getClass();
                ur urVar = (ur) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    if (urVar.f(tr0Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 131) != 130) {
                    z = true;
                } else {
                    z = false;
                }
                if (urVar.O(intValue & 1, z)) {
                    fqVar.invoke(tr0Var, urVar, Integer.valueOf(intValue & 14));
                } else {
                    urVar.R();
                }
                return od2.a;
        }
    }
}
