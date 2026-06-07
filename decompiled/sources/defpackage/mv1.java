package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class mv1 extends yq1 {
    public static kv1 E(Iterator it) {
        it.getClass();
        return F(new bo(it, 3));
    }

    public static kv1 F(kv1 kv1Var) {
        if (kv1Var instanceof ts) {
            return kv1Var;
        }
        return new ts(kv1Var);
    }

    public static kv1 G(Object obj, oe0 oe0Var) {
        if (obj == null) {
            return o60.a;
        }
        return new a00(2, oe0Var, new vm1(obj, 8));
    }

    public static List H(kv1 kv1Var) {
        Iterator it = kv1Var.iterator();
        if (!it.hasNext()) {
            return l60.e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return xn.E(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
