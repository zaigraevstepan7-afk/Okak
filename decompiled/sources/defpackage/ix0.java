package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ix0 implements Collection, xo0 {
    public static final ix0 g = new ix0(l60.e);
    public final List e;
    public final int f;

    public ix0(List list) {
        this.e = list;
        this.f = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof hx0)) {
            return false;
        }
        return this.e.contains((hx0) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.e.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ix0) {
                if (!this.e.equals(((ix0) obj).e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.e.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.e.iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return d6.E(this);
    }

    public final String toString() {
        return "LocaleList(localeList=" + this.e + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return d6.F(this, objArr);
    }
}
