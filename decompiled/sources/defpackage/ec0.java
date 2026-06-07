package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ec0 implements wa0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ o41 g;

    public /* synthetic */ ec0(ArrayList arrayList, o41 o41Var, int i) {
        this.e = i;
        this.f = arrayList;
        this.g = o41Var;
    }

    @Override // defpackage.wa0
    public final Object b(Object obj, vt vtVar) {
        int i = this.e;
        od2 od2Var = od2.a;
        o41 o41Var = this.g;
        ArrayList arrayList = this.f;
        switch (i) {
            case 0:
                hn0 hn0Var = (hn0) obj;
                if (hn0Var instanceof cc0) {
                    arrayList.add(hn0Var);
                } else if (hn0Var instanceof dc0) {
                    arrayList.remove(((dc0) hn0Var).a);
                }
                o41Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return od2Var;
            default:
                hn0 hn0Var2 = (hn0) obj;
                if (hn0Var2 instanceof si1) {
                    arrayList.add(hn0Var2);
                } else if (hn0Var2 instanceof ti1) {
                    arrayList.remove(((ti1) hn0Var2).a);
                } else if (hn0Var2 instanceof ri1) {
                    arrayList.remove(((ri1) hn0Var2).a);
                }
                o41Var.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return od2Var;
        }
    }
}
