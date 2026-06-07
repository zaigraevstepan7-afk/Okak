package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class g0 extends b0 {
    public abstract g0 b(int i, Object obj);

    public abstract g0 c(Object obj);

    @Override // defpackage.s, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.s, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public g0 d(Collection collection) {
        dg1 e = e();
        e.addAll(collection);
        return e.c();
    }

    public abstract dg1 e();

    public abstract g0 f(f0 f0Var);

    public abstract g0 g(int i);

    public abstract g0 h(int i, Object obj);

    @Override // defpackage.b0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.b0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.b0, java.util.List
    public final List subList(int i, int i2) {
        return new pj0(this, i, i2);
    }
}
