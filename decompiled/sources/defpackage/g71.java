package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class g71 {
    public h51 a;
    public boolean b;

    public abstract r51 a();

    public final h51 b() {
        h51 h51Var = this.a;
        if (h51Var != null) {
            return h51Var;
        }
        se.p("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, l61 l61Var) {
        r90 r90Var = new r90(new a00(1, new hr1(29), new o52(new bo(list, 0), new r(27, this, l61Var), 1)));
        while (r90Var.hasNext()) {
            b().f((d51) r90Var.next());
        }
    }

    public void e(d51 d51Var, boolean z) {
        List list = (List) b().e.e.getValue();
        if (list.contains(d51Var)) {
            ListIterator listIterator = list.listIterator(list.size());
            d51 d51Var2 = null;
            while (f()) {
                d51Var2 = (d51) listIterator.previous();
                if (sn0.r(d51Var2, d51Var)) {
                    break;
                }
            }
            if (d51Var2 != null) {
                b().d(d51Var2, z);
                return;
            }
            return;
        }
        y61.o("popBackStack was called with ", d51Var, " which does not exist in back stack ", list);
    }

    public boolean f() {
        return true;
    }

    public r51 c(r51 r51Var) {
        return r51Var;
    }
}
