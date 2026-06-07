package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dp1 extends xq0 {
    public static final dp1 c = new dp1("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dp1(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // defpackage.j01
    public final k01 b(l01 l01Var, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                m60 m60Var = m60.e;
                if (size != 0) {
                    if (size != 1) {
                        ArrayList arrayList = new ArrayList(list.size());
                        int size2 = list.size();
                        int i = 0;
                        int i2 = 0;
                        for (int i3 = 0; i3 < size2; i3++) {
                            ig1 x = ((e01) list.get(i3)).x(j);
                            i = Math.max(x.e, i);
                            i2 = Math.max(x.f, i2);
                            arrayList.add(x);
                        }
                        return l01Var.s0(vs.g(i, j), vs.f(i2, j), m60Var, new a7(arrayList, 3));
                    }
                    ig1 x2 = ((e01) list.get(0)).x(j);
                    return l01Var.s0(vs.g(x2.e, j), vs.f(x2.f, j), m60Var, new b5(x2, 6));
                }
                return l01Var.s0(us.j(j), us.i(j), m60Var, x81.p);
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
