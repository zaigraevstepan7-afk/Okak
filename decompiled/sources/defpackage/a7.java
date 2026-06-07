package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class a7 extends cq0 implements oe0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7(ArrayList arrayList, int i) {
        super(1);
        this.e = i;
        this.f = arrayList;
    }

    @Override // defpackage.oe0
    public final Object invoke(Object obj) {
        int i = this.e;
        od2 od2Var = od2.a;
        ArrayList arrayList = this.f;
        switch (i) {
            case 0:
                hg1 hg1Var = (hg1) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    hg1.k(hg1Var, (ig1) arrayList.get(i2), 0, 0);
                }
                return od2Var;
            case 1:
                hg1 hg1Var2 = (hg1) obj;
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        hg1.k(hg1Var2, (ig1) arrayList.get(i3), 0, 0);
                        if (i3 != size2) {
                            i3++;
                        }
                    }
                }
                return od2Var;
            case 2:
                hg1 hg1Var3 = (hg1) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    hg1.i(hg1Var3, (ig1) arrayList.get(i4), 0, 0);
                }
                return od2Var;
            default:
                hg1 hg1Var4 = (hg1) obj;
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    hg1.l(hg1Var4, (ig1) arrayList.get(i5), 0, 0);
                }
                return od2Var;
        }
    }
}
