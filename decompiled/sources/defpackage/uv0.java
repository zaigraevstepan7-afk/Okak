package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class uv0 extends d0 implements RandomAccess, Serializable {
    public Object[] e;
    public final int f;
    public int g;
    public final uv0 h;
    public final vv0 i;

    public uv0(Object[] objArr, int i, int i2, uv0 uv0Var, vv0 vv0Var) {
        int i3;
        objArr.getClass();
        vv0Var.getClass();
        this.e = objArr;
        this.f = i;
        this.g = i2;
        this.h = uv0Var;
        this.i = vv0Var;
        i3 = ((AbstractList) vv0Var).modCount;
        ((AbstractList) this).modCount = i3;
    }

    public static final /* synthetic */ int c(uv0 uv0Var) {
        return ((AbstractList) uv0Var).modCount;
    }

    @Override // defpackage.d0
    public final int a() {
        f();
        return this.g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        g();
        f();
        int i2 = this.g;
        if (i >= 0 && i <= i2) {
            e(this.f + i, obj);
        } else {
            se.u(l90.j("index: ", i, ", size: ", i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        g();
        f();
        int i2 = this.g;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            d(this.f + i, collection, size);
            if (size <= 0) {
                return false;
            }
            return true;
        }
        se.u(l90.j("index: ", i, ", size: ", i2));
        return false;
    }

    @Override // defpackage.d0
    public final Object b(int i) {
        g();
        f();
        int i2 = this.g;
        if (i >= 0 && i < i2) {
            return h(this.f + i);
        }
        se.u(l90.j("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        i(this.f, this.g);
    }

    public final void d(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        vv0 vv0Var = this.i;
        uv0 uv0Var = this.h;
        if (uv0Var != null) {
            uv0Var.d(i, collection, i2);
        } else {
            vv0 vv0Var2 = vv0.h;
            vv0Var.d(i, collection, i2);
        }
        this.e = vv0Var.e;
        this.g += i2;
    }

    public final void e(int i, Object obj) {
        ((AbstractList) this).modCount++;
        vv0 vv0Var = this.i;
        uv0 uv0Var = this.h;
        if (uv0Var != null) {
            uv0Var.e(i, obj);
        } else {
            vv0 vv0Var2 = vv0.h;
            vv0Var.e(i, obj);
        }
        this.e = vv0Var.e;
        this.g++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.e;
                int i = this.g;
                if (i == list.size()) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (sn0.r(objArr[this.f + i2], list.get(i2))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void f() {
        int i;
        i = ((AbstractList) this.i).modCount;
        if (i == ((AbstractList) this).modCount) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (!this.i.g) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        f();
        int i2 = this.g;
        if (i >= 0 && i < i2) {
            return this.e[this.f + i];
        }
        se.u(l90.j("index: ", i, ", size: ", i2));
        return null;
    }

    public final Object h(int i) {
        Object h;
        ((AbstractList) this).modCount++;
        uv0 uv0Var = this.h;
        if (uv0Var != null) {
            h = uv0Var.h(i);
        } else {
            vv0 vv0Var = vv0.h;
            h = this.i.h(i);
        }
        this.g--;
        return h;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i;
        f();
        Object[] objArr = this.e;
        int i2 = this.g;
        int i3 = 1;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[this.f + i4];
            int i5 = i3 * 31;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i3 = i5 + i;
        }
        return i3;
    }

    public final void i(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        uv0 uv0Var = this.h;
        if (uv0Var != null) {
            uv0Var.i(i, i2);
        } else {
            vv0 vv0Var = vv0.h;
            this.i.i(i, i2);
        }
        this.g -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i = 0; i < this.g; i++) {
            if (sn0.r(this.e[this.f + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        if (this.g == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int j(int i, int i2, Collection collection, boolean z) {
        int j;
        uv0 uv0Var = this.h;
        if (uv0Var != null) {
            j = uv0Var.j(i, i2, collection, z);
        } else {
            vv0 vv0Var = vv0.h;
            j = this.i.j(i, i2, collection, z);
        }
        if (j > 0) {
            ((AbstractList) this).modCount++;
        }
        this.g -= j;
        return j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i = this.g - 1; i >= 0; i--) {
            if (sn0.r(this.e[this.f + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        f();
        int i2 = this.g;
        if (i >= 0 && i <= i2) {
            return new ah0(this, i);
        }
        se.u(l90.j("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        f();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        g();
        f();
        if (j(this.f, this.g, collection, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        g();
        f();
        if (j(this.f, this.g, collection, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        g();
        f();
        int i2 = this.g;
        if (i >= 0 && i < i2) {
            Object[] objArr = this.e;
            int i3 = this.f;
            Object obj2 = objArr[i3 + i];
            objArr[i3 + i] = obj;
            return obj2;
        }
        se.u(l90.j("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        bf.w(i, i2, this.g);
        return new uv0(this.e, this.f + i, i2 - i, this, this.i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        f();
        int length = objArr.length;
        int i = this.g;
        Object[] objArr2 = this.e;
        int i2 = this.f;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            copyOfRange.getClass();
            return copyOfRange;
        }
        bf.D(objArr2, objArr, 0, i2, i + i2);
        int i3 = this.g;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return lo.f(this.e, this.f, this.g, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.f + this.g, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.e;
        int i = this.g;
        int i2 = this.f;
        return bf.I(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        g();
        f();
        int size = collection.size();
        d(this.f + this.g, collection, size);
        return size > 0;
    }
}
