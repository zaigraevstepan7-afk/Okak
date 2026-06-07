package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ye implements Collection {
    public final /* synthetic */ ze e;

    public ye(ze zeVar) {
        this.e = zeVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.e.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.e.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ve(this.e, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        ze zeVar = this.e;
        int a = zeVar.a(obj);
        if (a >= 0) {
            zeVar.i(a);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        ze zeVar = this.e;
        int i = zeVar.g;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(zeVar.k(i2))) {
                zeVar.i(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        ze zeVar = this.e;
        int i = zeVar.g;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(zeVar.k(i2))) {
                zeVar.i(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.e.g;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        ze zeVar = this.e;
        int i = zeVar.g;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = zeVar.k(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        ze zeVar = this.e;
        int i = zeVar.g;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = zeVar.k(i2);
        }
        return objArr;
    }
}
