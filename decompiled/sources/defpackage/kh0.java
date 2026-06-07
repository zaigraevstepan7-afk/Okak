package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kh0 implements ue0 {
    public final /* synthetic */ List e;

    public kh0(List list) {
        this.e = list;
    }

    @Override // defpackage.ue0
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        tr0 tr0Var = (tr0) obj;
        int intValue = ((Number) obj2).intValue();
        ur urVar = (ur) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (urVar.f(tr0Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i = i3 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (urVar.d(intValue)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i |= i2;
        }
        if ((i & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i & 1, z)) {
            String str = (String) this.e.get(intValue);
            urVar.X(-424371247);
            lh0.c(str, urVar, 0);
            urVar.p(false);
        } else {
            urVar.R();
        }
        return od2.a;
    }
}
