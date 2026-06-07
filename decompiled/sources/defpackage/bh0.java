package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bh0 implements List, xo0 {
    public final int e;
    public final int f;
    public final /* synthetic */ ch0 g;

    public bh0(ch0 ch0Var, int i, int i2) {
        this.g = ch0Var;
        this.e = i;
        this.f = i2;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof d21) || indexOf((d21) obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((d21) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object f = this.g.e.f(i + this.e);
        f.getClass();
        return (d21) f;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof d21) {
            d21 d21Var = (d21) obj;
            int i = this.e;
            int i2 = this.f;
            if (i <= i2) {
                int i3 = i;
                while (!sn0.r(this.g.e.f(i3), d21Var)) {
                    if (i3 != i2) {
                        i3++;
                    } else {
                        return -1;
                    }
                }
                return i3 - i;
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.e;
        return new ah0(this.g, i, i, this.f);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof d21) {
            d21 d21Var = (d21) obj;
            int i = this.f;
            int i2 = this.e;
            if (i2 <= i) {
                while (!sn0.r(this.g.e.f(i), d21Var)) {
                    if (i != i2) {
                        i--;
                    } else {
                        return -1;
                    }
                }
                return i - i2;
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.e;
        int i3 = this.f;
        return new ah0(this.g, i + i2, i2, i3);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f - this.e;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.e;
        return new bh0(this.g, i + i3, i3 + i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return d6.E(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return d6.F(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i = this.e;
        return new ah0(this.g, i, i, this.f);
    }
}
