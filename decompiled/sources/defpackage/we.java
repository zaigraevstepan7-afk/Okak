package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class we implements Set {
    public final /* synthetic */ ze e;

    public we(ze zeVar) {
        this.e = zeVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.e.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.e.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.e.b(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        ze zeVar = this.e;
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (zeVar.g == set.size()) {
                        if (zeVar.b(set)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        ze zeVar = this.e;
        int i = 0;
        for (int i2 = zeVar.g - 1; i2 >= 0; i2--) {
            Object g = zeVar.g(i2);
            if (g == null) {
                hashCode = 0;
            } else {
                hashCode = g.hashCode();
            }
            i += hashCode;
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ve(this.e, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        ze zeVar = this.e;
        int e = zeVar.e(obj);
        if (e >= 0) {
            zeVar.i(e);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        ze zeVar = this.e;
        int i = zeVar.g;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zeVar.remove(it.next());
        }
        if (i != zeVar.g) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        ze zeVar = this.e;
        int i = zeVar.g;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(zeVar.g(i2))) {
                zeVar.i(i2);
            }
        }
        if (i != zeVar.g) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.e.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        ze zeVar = this.e;
        int i = zeVar.g;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = zeVar.g(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        ze zeVar = this.e;
        int i = zeVar.g;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = zeVar.g(i2);
        }
        return objArr;
    }
}
