package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ar extends RuntimeException {
    public final b41 e;
    public final b41 f;
    public final o31 g;
    public final int h;

    public ar(b41 b41Var, b41 b41Var2, o31 o31Var, int i, Exception exc) {
        super(exc);
        this.e = b41Var;
        this.f = b41Var2;
        this.g = o31Var;
        this.h = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.h);
        sb.append(":\n            |");
        lv1 t = yq1.t(new zq(this, null));
        if (!t.hasNext()) {
            list = l60.e;
        } else {
            Object next = t.next();
            if (!t.hasNext()) {
                list = xn.E(next);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (t.hasNext()) {
                    arrayList.add(t.next());
                }
                list = arrayList;
            }
        }
        sb.append(wn.m0(wn.y0(50, list), "\n", null, null, null, 62));
        sb.append("\n            ");
        return j32.t(sb.toString());
    }
}
