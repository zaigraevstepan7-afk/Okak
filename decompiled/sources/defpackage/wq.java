package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
@f71("composable")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lwq;", "Lg71;", "Lvq;", "<init>", "()V", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = yq1.f)
/* loaded from: classes.dex */
public final class wq extends g71 {
    public final je1 c = fr1.k(Boolean.FALSE);

    @Override // defpackage.g71
    public final r51 a() {
        return new vq(this, jq.a);
    }

    @Override // defpackage.g71
    public final void d(List list, l61 l61Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d51 d51Var = (d51) it.next();
            h51 b = b();
            yk1 yk1Var = b.e;
            d51Var.getClass();
            r22 r22Var = b.c;
            Iterable iterable = (Iterable) r22Var.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((d51) it2.next()) == d51Var) {
                        Iterable iterable2 = (Iterable) yk1Var.e.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((d51) it3.next()) == d51Var) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            d51 d51Var2 = (d51) wn.o0((List) yk1Var.e.getValue());
            if (d51Var2 != null) {
                r22Var.k(null, fr1.n((Set) r22Var.getValue(), d51Var2));
            }
            r22Var.k(null, fr1.n((Set) r22Var.getValue(), d51Var));
            b.f(d51Var);
        }
        this.c.setValue(Boolean.FALSE);
    }

    @Override // defpackage.g71
    public final void e(d51 d51Var, boolean z) {
        b().e(d51Var, z);
        this.c.setValue(Boolean.TRUE);
    }

    public final void g(d51 d51Var) {
        h51 b = b();
        d51Var.getClass();
        r22 r22Var = b.c;
        r22Var.k(null, fr1.n((Set) r22Var.getValue(), d51Var));
        j51 j51Var = b.h.b;
        j51Var.getClass();
        if (j51Var.f.contains(d51Var)) {
            d51Var.a(nu0.h);
        } else {
            se.p("Cannot transition entry that is not in the back stack");
        }
    }
}
