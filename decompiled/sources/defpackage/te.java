package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class te extends d0 {
    public static final Object[] h = new Object[0];
    public int e;
    public Object[] f;
    public int g;

    public te(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = h;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            se.h(l90.g(i, "Illegal Capacity: "));
            throw null;
        }
        this.f = objArr;
    }

    @Override // defpackage.d0
    public final int a() {
        return this.g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.g;
        if (i >= 0 && i <= i3) {
            if (i == i3) {
                addLast(obj);
                return;
            }
            if (i == 0) {
                addFirst(obj);
                return;
            }
            k();
            d(this.g + 1);
            int j = j(this.e + i);
            int i4 = this.g;
            if (i < ((i4 + 1) >> 1)) {
                if (j == 0) {
                    Object[] objArr = this.f;
                    objArr.getClass();
                    i2 = objArr.length - 1;
                } else {
                    i2 = j - 1;
                }
                int i5 = this.e;
                if (i5 == 0) {
                    Object[] objArr2 = this.f;
                    objArr2.getClass();
                    i5 = objArr2.length;
                }
                int i6 = i5 - 1;
                int i7 = this.e;
                Object[] objArr3 = this.f;
                if (i2 >= i7) {
                    objArr3[i6] = objArr3[i7];
                    bf.D(objArr3, objArr3, i7, i7 + 1, i2 + 1);
                } else {
                    bf.D(objArr3, objArr3, i7 - 1, i7, objArr3.length);
                    Object[] objArr4 = this.f;
                    objArr4[objArr4.length - 1] = objArr4[0];
                    bf.D(objArr4, objArr4, 0, 1, i2 + 1);
                }
                this.f[i2] = obj;
                this.e = i6;
            } else {
                int j2 = j(i4 + this.e);
                Object[] objArr5 = this.f;
                if (j < j2) {
                    bf.D(objArr5, objArr5, j + 1, j, j2);
                } else {
                    bf.D(objArr5, objArr5, 1, 0, j2);
                    Object[] objArr6 = this.f;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    bf.D(objArr6, objArr6, j + 1, j, objArr6.length - 1);
                }
                this.f[j] = obj;
            }
            this.g++;
            return;
        }
        se.u(l90.j("index: ", i, ", size: ", i3));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.g;
        if (i >= 0 && i <= i2) {
            if (collection.isEmpty()) {
                return false;
            }
            if (i == this.g) {
                return addAll(collection);
            }
            k();
            d(collection.size() + this.g);
            int j = j(this.g + this.e);
            int j2 = j(this.e + i);
            int size = collection.size();
            if (i < ((this.g + 1) >> 1)) {
                int i3 = this.e;
                int i4 = i3 - size;
                Object[] objArr = this.f;
                if (j2 >= i3) {
                    if (i4 >= 0) {
                        bf.D(objArr, objArr, i4, i3, j2);
                    } else {
                        i4 += objArr.length;
                        int i5 = j2 - i3;
                        int length = objArr.length - i4;
                        if (length >= i5) {
                            bf.D(objArr, objArr, i4, i3, j2);
                        } else {
                            bf.D(objArr, objArr, i4, i3, i3 + length);
                            Object[] objArr2 = this.f;
                            bf.D(objArr2, objArr2, 0, this.e + length, j2);
                        }
                    }
                } else {
                    bf.D(objArr, objArr, i4, i3, objArr.length);
                    Object[] objArr3 = this.f;
                    if (size >= j2) {
                        bf.D(objArr3, objArr3, objArr3.length - size, 0, j2);
                    } else {
                        bf.D(objArr3, objArr3, objArr3.length - size, 0, size);
                        Object[] objArr4 = this.f;
                        bf.D(objArr4, objArr4, 0, size, j2);
                    }
                }
                this.e = i4;
                c(h(j2 - size), collection);
                return true;
            }
            int i6 = j2 + size;
            Object[] objArr5 = this.f;
            if (j2 < j) {
                int i7 = size + j;
                if (i7 <= objArr5.length) {
                    bf.D(objArr5, objArr5, i6, j2, j);
                } else if (i6 >= objArr5.length) {
                    bf.D(objArr5, objArr5, i6 - objArr5.length, j2, j);
                } else {
                    int length2 = j - (i7 - objArr5.length);
                    bf.D(objArr5, objArr5, 0, length2, j);
                    Object[] objArr6 = this.f;
                    bf.D(objArr6, objArr6, i6, j2, length2);
                }
            } else {
                bf.D(objArr5, objArr5, size, 0, j);
                Object[] objArr7 = this.f;
                if (i6 >= objArr7.length) {
                    bf.D(objArr7, objArr7, i6 - objArr7.length, j2, objArr7.length);
                } else {
                    bf.D(objArr7, objArr7, 0, objArr7.length - size, objArr7.length);
                    Object[] objArr8 = this.f;
                    bf.D(objArr8, objArr8, i6, j2, objArr8.length - size);
                }
            }
            c(j2, collection);
            return true;
        }
        se.u(l90.j("index: ", i, ", size: ", i2));
        return false;
    }

    public final void addFirst(Object obj) {
        k();
        d(this.g + 1);
        int i = this.e;
        if (i == 0) {
            Object[] objArr = this.f;
            objArr.getClass();
            i = objArr.length;
        }
        int i2 = i - 1;
        this.e = i2;
        this.f[i2] = obj;
        this.g++;
    }

    public final void addLast(Object obj) {
        k();
        d(a() + 1);
        this.f[j(a() + this.e)] = obj;
        this.g = a() + 1;
    }

    @Override // defpackage.d0
    public final Object b(int i) {
        int i2 = this.g;
        if (i >= 0 && i < i2) {
            if (i == a() - 1) {
                return removeLast();
            }
            if (i == 0) {
                return removeFirst();
            }
            k();
            int j = j(this.e + i);
            Object[] objArr = this.f;
            Object obj = objArr[j];
            int i3 = this.g >> 1;
            int i4 = this.e;
            if (i < i3) {
                if (j >= i4) {
                    bf.D(objArr, objArr, i4 + 1, i4, j);
                } else {
                    bf.D(objArr, objArr, 1, 0, j);
                    Object[] objArr2 = this.f;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int i5 = this.e;
                    bf.D(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
                }
                Object[] objArr3 = this.f;
                int i6 = this.e;
                objArr3[i6] = null;
                this.e = f(i6);
            } else {
                int j2 = j((a() - 1) + i4);
                Object[] objArr4 = this.f;
                if (j <= j2) {
                    bf.D(objArr4, objArr4, j, j + 1, j2 + 1);
                } else {
                    bf.D(objArr4, objArr4, j, j + 1, objArr4.length);
                    Object[] objArr5 = this.f;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    bf.D(objArr5, objArr5, 0, 1, j2 + 1);
                }
                this.f[j2] = null;
            }
            this.g--;
            return obj;
        }
        se.u(l90.j("index: ", i, ", size: ", i2));
        return null;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f.length;
        while (i < length && it.hasNext()) {
            this.f[i] = it.next();
            i++;
        }
        int i2 = this.e;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f[i3] = it.next();
        }
        this.g = collection.size() + this.g;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            k();
            i(this.e, j(a() + this.e));
        }
        this.e = 0;
        this.g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void d(int i) {
        if (i >= 0) {
            Object[] objArr = this.f;
            if (i <= objArr.length) {
                return;
            }
            if (objArr == h) {
                if (i < 10) {
                    i = 10;
                }
                this.f = new Object[i];
                return;
            }
            int length = objArr.length;
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if (i2 - 2147483639 > 0) {
                if (i > 2147483639) {
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i2];
            bf.D(objArr, objArr2, 0, this.e, objArr.length);
            Object[] objArr3 = this.f;
            int length2 = objArr3.length;
            int i3 = this.e;
            bf.D(objArr3, objArr2, length2 - i3, 0, i3);
            this.e = 0;
            this.f = objArr2;
            return;
        }
        se.p("Deque is too big.");
    }

    public final Object e() {
        if (isEmpty()) {
            return null;
        }
        return this.f[this.e];
    }

    public final int f(int i) {
        this.f.getClass();
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f[this.e];
        }
        y61.j("ArrayDeque is empty.");
        return null;
    }

    public final Object g() {
        if (isEmpty()) {
            return null;
        }
        return this.f[j((size() - 1) + this.e)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int a = a();
        if (i >= 0 && i < a) {
            return this.f[j(this.e + i)];
        }
        se.u(l90.j("index: ", i, ", size: ", a));
        return null;
    }

    public final int h(int i) {
        if (i < 0) {
            return i + this.f.length;
        }
        return i;
    }

    public final void i(int i, int i2) {
        Object[] objArr = this.f;
        if (i < i2) {
            bf.M(objArr, i, i2);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            bf.M(this.f, 0, i2);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int j = j(a() + this.e);
        int i2 = this.e;
        if (i2 < j) {
            while (i2 < j) {
                if (sn0.r(obj, this.f[i2])) {
                    i = this.e;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (!isEmpty() && (i2 = this.e) >= j) {
            int length = this.f.length;
            while (true) {
                if (i2 < length) {
                    if (sn0.r(obj, this.f[i2])) {
                        i = this.e;
                        break;
                    }
                    i2++;
                } else {
                    for (int i3 = 0; i3 < j; i3++) {
                        if (sn0.r(obj, this.f[i3])) {
                            i2 = i3 + this.f.length;
                            i = this.e;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (a() == 0) {
            return true;
        }
        return false;
    }

    public final int j(int i) {
        Object[] objArr = this.f;
        if (i >= objArr.length) {
            return i - objArr.length;
        }
        return i;
    }

    public final void k() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (!isEmpty()) {
            return this.f[j((size() - 1) + this.e)];
        }
        y61.j("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int j = j(this.g + this.e);
        int i2 = this.e;
        if (i2 < j) {
            length = j - 1;
            if (i2 <= length) {
                while (!sn0.r(obj, this.f[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.e;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.e >= j) {
            while (true) {
                j--;
                Object[] objArr = this.f;
                if (-1 < j) {
                    if (sn0.r(obj, objArr[j])) {
                        length = j + this.f.length;
                        i = this.e;
                        break;
                    }
                } else {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.e;
                    if (i3 <= length) {
                        while (!sn0.r(obj, this.f[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.e;
                    }
                }
            }
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        b(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int j;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f.length != 0) {
            int j2 = j(this.g + this.e);
            int i = this.e;
            if (i < j2) {
                j = i;
                while (true) {
                    objArr = this.f;
                    if (i >= j2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (!collection.contains(obj)) {
                        this.f[j] = obj;
                        j++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                bf.M(objArr, j, j2);
            } else {
                int length = this.f.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (!collection.contains(obj2)) {
                        this.f[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                j = j(i2);
                for (int i3 = 0; i3 < j2; i3++) {
                    Object[] objArr3 = this.f;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.f[j] = obj3;
                        j = f(j);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                k();
                this.g = h(j - this.e);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            k();
            Object[] objArr = this.f;
            int i = this.e;
            Object obj = objArr[i];
            objArr[i] = null;
            this.e = f(i);
            this.g = a() - 1;
            return obj;
        }
        y61.j("ArrayDeque is empty.");
        return null;
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            k();
            int j = j((size() - 1) + this.e);
            Object[] objArr = this.f;
            Object obj = objArr[j];
            objArr[j] = null;
            this.g = a() - 1;
            return obj;
        }
        y61.j("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        bf.w(i, i2, this.g);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.g) {
            clear();
            return;
        }
        if (i3 == 1) {
            b(i);
            return;
        }
        k();
        int i4 = this.g - i2;
        int i5 = this.e;
        if (i < i4) {
            int j = j((i - 1) + i5);
            int j2 = j(this.e + (i2 - 1));
            while (i > 0) {
                int i6 = j + 1;
                int min = Math.min(i, Math.min(i6, j2 + 1));
                Object[] objArr = this.f;
                int i7 = j2 - min;
                int i8 = j - min;
                bf.D(objArr, objArr, i7 + 1, i8 + 1, i6);
                j = h(i8);
                j2 = h(i7);
                i -= min;
            }
            int j3 = j(this.e + i3);
            i(this.e, j3);
            this.e = j3;
        } else {
            int j4 = j(i5 + i2);
            int j5 = j(this.e + i);
            int i9 = this.g;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f;
                i2 = Math.min(i9, Math.min(objArr2.length - j4, objArr2.length - j5));
                Object[] objArr3 = this.f;
                int i10 = j4 + i2;
                bf.D(objArr3, objArr3, j5, j4, i10);
                j4 = j(i10);
                j5 = j(j5 + i2);
            }
            int j6 = j(this.g + this.e);
            i(h(j6 - i3), j6);
        }
        this.g -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int j;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f.length != 0) {
            int j2 = j(this.g + this.e);
            int i = this.e;
            if (i < j2) {
                j = i;
                while (true) {
                    objArr = this.f;
                    if (i >= j2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.f[j] = obj;
                        j++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                bf.M(objArr, j, j2);
            } else {
                int length = this.f.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                j = j(i2);
                for (int i3 = 0; i3 < j2; i3++) {
                    Object[] objArr3 = this.f;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f[j] = obj3;
                        j = f(j);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                k();
                this.g = h(j - this.e);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int a = a();
        if (i >= 0 && i < a) {
            int j = j(this.e + i);
            Object[] objArr = this.f;
            Object obj2 = objArr[j];
            objArr[j] = obj;
            return obj2;
        }
        se.u(l90.j("index: ", i, ", size: ", a));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.g;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            newInstance.getClass();
            objArr = (Object[]) newInstance;
        }
        int j = j(this.g + this.e);
        int i2 = this.e;
        if (i2 < j) {
            bf.G(this.f, objArr, i2, j, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f;
            bf.D(objArr2, objArr, 0, this.e, objArr2.length);
            Object[] objArr3 = this.f;
            bf.D(objArr3, objArr, objArr3.length - this.e, 0, j);
        }
        int i3 = this.g;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public te() {
        this.f = h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        k();
        d(collection.size() + a());
        c(j(a() + this.e), collection);
        return true;
    }
}
