package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class w32 implements List, zo0 {
    public final a12 e;
    public final int f;
    public int g;
    public int h;

    public w32(a12 a12Var, int i, int i2) {
        this.e = a12Var;
        this.f = i;
        this.g = c01.C(a12Var);
        this.h = i2 - i;
    }

    public final void a() {
        if (c01.C(this.e) == this.g) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        a();
        int i = this.f + this.h;
        a12 a12Var = this.e;
        a12Var.add(i, obj);
        this.h++;
        this.g = c01.C(a12Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        int i2 = i + this.f;
        a12 a12Var = this.e;
        boolean addAll = a12Var.addAll(i2, collection);
        if (addAll) {
            this.h = collection.size() + this.h;
            this.g = c01.C(a12Var);
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.h > 0) {
            a();
            int i = this.h;
            int i2 = this.f;
            a12 a12Var = this.e;
            a12Var.c(i2, i + i2);
            this.h = 0;
            this.g = c01.C(a12Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
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

    @Override // java.util.List
    public final Object get(int i) {
        a();
        c01.o(i, this.h);
        return this.e.get(this.f + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        int i = this.h;
        int i2 = this.f;
        Iterator it = go.X(i2, i + i2).iterator();
        while (((zm0) it).g) {
            int nextInt = ((tm0) it).nextInt();
            if (sn0.r(obj, this.e.get(nextInt))) {
                return nextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.h == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        int i = this.h;
        int i2 = this.f;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (sn0.r(obj, this.e.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ul1] */
    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        a();
        ?? obj = new Object();
        obj.e = i - 1;
        return new ko1((ul1) obj, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        a();
        int i2 = this.f + i;
        a12 a12Var = this.e;
        Object remove = a12Var.remove(i2);
        this.h--;
        this.g = c01.C(a12Var);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        g0 g0Var;
        i02 j;
        boolean p;
        a();
        a12 a12Var = this.e;
        int i2 = this.f;
        int i3 = this.h + i2;
        int size = a12Var.size();
        do {
            synchronized (c01.z) {
                t22 t22Var = a12Var.e;
                t22Var.getClass();
                t22 t22Var2 = (t22) q02.h(t22Var);
                i = t22Var2.d;
                g0Var = t22Var2.c;
            }
            g0Var.getClass();
            dg1 e = g0Var.e();
            e.subList(i2, i3).retainAll(collection);
            g0 c = e.c();
            if (sn0.r(c, g0Var)) {
                break;
            }
            t22 t22Var3 = a12Var.e;
            t22Var3.getClass();
            synchronized (q02.c) {
                j = q02.j();
                p = c01.p((t22) q02.w(t22Var3, a12Var, j), i, c, true);
            }
            q02.n(j, a12Var);
        } while (!p);
        int size2 = size - a12Var.size();
        if (size2 > 0) {
            this.g = c01.C(this.e);
            this.h -= size2;
        }
        if (size2 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        c01.o(i, this.h);
        a();
        int i2 = i + this.f;
        a12 a12Var = this.e;
        Object obj2 = a12Var.set(i2, obj);
        this.g = c01.C(a12Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.h;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.h) {
            ei1.a("fromIndex or toIndex are out of bounds");
        }
        a();
        int i3 = this.f;
        return new w32(this.e, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return d6.E(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return d6.F(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        a();
        int i2 = this.f + i;
        a12 a12Var = this.e;
        a12Var.add(i2, obj);
        this.h++;
        this.g = c01.C(a12Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.h, collection);
    }
}
