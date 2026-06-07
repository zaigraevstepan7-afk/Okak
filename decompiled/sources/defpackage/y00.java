package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@f71("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ly00;", "Lg71;", "Lx00;", "<init>", "()V", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class y00 extends g71 {
    @Override // defpackage.g71
    public final r51 a() {
        fq fqVar = nq.a;
        return new x00(this);
    }

    @Override // defpackage.g71
    public final void d(List list, l61 l61Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((d51) it.next());
        }
    }

    @Override // defpackage.g71
    public final void e(d51 d51Var, boolean z) {
        b().e(d51Var, z);
        int j0 = wn.j0((Iterable) b().f.e.getValue(), d51Var);
        int i = 0;
        for (Object obj : (Iterable) b().f.e.getValue()) {
            int i2 = i + 1;
            if (i >= 0) {
                d51 d51Var2 = (d51) obj;
                if (i > j0) {
                    b().c(d51Var2);
                }
                i = i2;
            } else {
                xn.U();
                throw null;
            }
        }
    }
}
