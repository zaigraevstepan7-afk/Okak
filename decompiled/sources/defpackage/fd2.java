package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class fd2 implements Collection, xo0 {
    public final short[] e;

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
        if (!(obj instanceof ed2)) {
            return false;
        }
        short s = ((ed2) obj).e;
        short[] sArr = this.e;
        sArr.getClass();
        int length = sArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (s == sArr[i]) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean z;
        collection.getClass();
        Collection collection2 = collection;
        if (!collection2.isEmpty()) {
            for (Object obj : collection2) {
                if (obj instanceof ed2) {
                    short s = ((ed2) obj).e;
                    short[] sArr = this.e;
                    sArr.getClass();
                    int length = sArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (s == sArr[i]) {
                                break;
                            }
                            i++;
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    if (i >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof fd2) {
            if (!sn0.r(this.e, ((fd2) obj).e)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.e);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.e.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new y(this.e);
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
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.e.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return d6.F(this, objArr);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.e) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return d6.E(this);
    }
}
