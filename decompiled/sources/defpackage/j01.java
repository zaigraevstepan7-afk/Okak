package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public interface j01 {
    default int a(mn0 mn0Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new my((e01) list.get(i3), nn0.f, qn0.e, i2));
        }
        return b(new yn0(mn0Var, mn0Var.getLayoutDirection()), arrayList, vs.b(0, i, 7)).d();
    }

    k01 b(l01 l01Var, List list, long j);

    default int c(mn0 mn0Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new my((e01) list.get(i3), nn0.e, qn0.e, i2));
        }
        return b(new yn0(mn0Var, mn0Var.getLayoutDirection()), arrayList, vs.b(0, i, 7)).d();
    }

    default int d(mn0 mn0Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new my((e01) list.get(i3), nn0.f, qn0.f, i2));
        }
        return b(new yn0(mn0Var, mn0Var.getLayoutDirection()), arrayList, vs.b(i, 0, 13)).c();
    }

    default int e(mn0 mn0Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new my((e01) list.get(i3), nn0.e, qn0.f, i2));
        }
        return b(new yn0(mn0Var, mn0Var.getLayoutDirection()), arrayList, vs.b(i, 0, 13)).c();
    }
}
