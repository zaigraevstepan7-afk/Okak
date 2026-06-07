package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class t61 implements j01 {
    public final /* synthetic */ l40 a;
    public final /* synthetic */ o41 b;
    public final /* synthetic */ fe1 c;

    public t61(l40 l40Var, o41 o41Var, fe1 fe1Var) {
        this.a = l40Var;
        this.b = o41Var;
        this.c = fe1Var;
    }

    @Override // defpackage.j01
    public final k01 b(l01 l01Var, List list, long j) {
        Integer valueOf;
        int i;
        long a = us.a(j, 0, 0, 0, 0, 10);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((e01) list.get(i3)).x(a));
        }
        Integer num = null;
        int i4 = 1;
        if (arrayList.isEmpty()) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(((ig1) arrayList.get(0)).e);
            int size2 = arrayList.size() - 1;
            if (1 <= size2) {
                int i5 = 1;
                while (true) {
                    Integer valueOf2 = Integer.valueOf(((ig1) arrayList.get(i5)).e);
                    if (valueOf2.compareTo(valueOf) > 0) {
                        valueOf = valueOf2;
                    }
                    if (i5 == size2) {
                        break;
                    }
                    i5++;
                }
            }
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = 0;
        }
        if (!arrayList.isEmpty()) {
            Integer valueOf3 = Integer.valueOf(((ig1) arrayList.get(0)).f);
            int size3 = arrayList.size() - 1;
            if (1 <= size3) {
                while (true) {
                    Integer valueOf4 = Integer.valueOf(((ig1) arrayList.get(i4)).f);
                    if (valueOf4.compareTo(valueOf3) > 0) {
                        valueOf3 = valueOf4;
                    }
                    if (i4 == size3) {
                        break;
                    }
                    i4++;
                }
            }
            num = valueOf3;
        }
        if (num != null) {
            i2 = num.intValue();
        }
        return l01Var.s0(i, i2, m60.e, new xo(this.a, i, arrayList, this.b, this.c, 2));
    }
}
