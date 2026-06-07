package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class a12 implements Parcelable, u22, List, RandomAccess, zo0 {
    public static final Parcelable.Creator<a12> CREATOR = new Object();
    public t22 e;

    public a12(g0 g0Var) {
        i02 j = q02.j();
        t22 t22Var = new t22(j.g(), g0Var);
        if (!(j instanceof of0)) {
            t22Var.b = new t22(1L, g0Var);
        }
        this.e = t22Var;
    }

    @Override // defpackage.u22
    public final w22 a() {
        return this.e;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        g0 g0Var;
        i02 j;
        boolean p;
        do {
            synchronized (c01.z) {
                t22 t22Var = this.e;
                t22Var.getClass();
                t22 t22Var2 = (t22) q02.h(t22Var);
                i = t22Var2.d;
                g0Var = t22Var2.c;
            }
            g0Var.getClass();
            g0 c = g0Var.c(obj);
            if (c.equals(g0Var)) {
                return false;
            }
            t22 t22Var3 = this.e;
            t22Var3.getClass();
            synchronized (q02.c) {
                j = q02.j();
                p = c01.p((t22) q02.w(t22Var3, this, j), i, c, true);
            }
            q02.n(j, this);
        } while (!p);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        g0 g0Var;
        i02 j;
        boolean p;
        do {
            synchronized (c01.z) {
                t22 t22Var = this.e;
                t22Var.getClass();
                t22 t22Var2 = (t22) q02.h(t22Var);
                i = t22Var2.d;
                g0Var = t22Var2.c;
            }
            g0Var.getClass();
            g0 d = g0Var.d(collection);
            if (sn0.r(d, g0Var)) {
                return false;
            }
            t22 t22Var3 = this.e;
            t22Var3.getClass();
            synchronized (q02.c) {
                j = q02.j();
                p = c01.p((t22) q02.w(t22Var3, this, j), i, d, true);
            }
            q02.n(j, this);
        } while (!p);
        return true;
    }

    public final void c(int i, int i2) {
        int i3;
        g0 g0Var;
        i02 j;
        boolean p;
        do {
            synchronized (c01.z) {
                t22 t22Var = this.e;
                t22Var.getClass();
                t22 t22Var2 = (t22) q02.h(t22Var);
                i3 = t22Var2.d;
                g0Var = t22Var2.c;
            }
            g0Var.getClass();
            dg1 e = g0Var.e();
            e.subList(i, i2).clear();
            g0 c = e.c();
            if (!sn0.r(c, g0Var)) {
                t22 t22Var3 = this.e;
                t22Var3.getClass();
                synchronized (q02.c) {
                    j = q02.j();
                    p = c01.p((t22) q02.w(t22Var3, this, j), i3, c, true);
                }
                q02.n(j, this);
            } else {
                return;
            }
        } while (!p);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        i02 j;
        t22 t22Var = this.e;
        t22Var.getClass();
        synchronized (q02.c) {
            j = q02.j();
            t22 t22Var2 = (t22) q02.w(t22Var, this, j);
            synchronized (c01.z) {
                t22Var2.c = kz1.f;
                t22Var2.d++;
                t22Var2.e++;
            }
        }
        q02.n(j, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return c01.A(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return c01.A(this).c.containsAll(collection);
    }

    @Override // defpackage.u22
    public final void d(w22 w22Var) {
        w22Var.b = this.e;
        this.e = (t22) w22Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return c01.A(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return c01.A(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return c01.A(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return c01.A(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ah0(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        g0 g0Var;
        g0 g0Var2;
        i02 j;
        boolean p;
        do {
            synchronized (c01.z) {
                t22 t22Var = this.e;
                t22Var.getClass();
                t22 t22Var2 = (t22) q02.h(t22Var);
                i = t22Var2.d;
                g0Var = t22Var2.c;
            }
            g0Var.getClass();
            int indexOf = g0Var.indexOf(obj);
            if (indexOf != -1) {
                g0Var2 = g0Var.g(indexOf);
            } else {
                g0Var2 = g0Var;
            }
            if (g0Var2.equals(g0Var)) {
                return false;
            }
            t22 t22Var3 = this.e;
            t22Var3.getClass();
            synchronized (q02.c) {
                j = q02.j();
                p = c01.p((t22) q02.w(t22Var3, this, j), i, g0Var2, true);
            }
            q02.n(j, this);
        } while (!p);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        g0 g0Var;
        i02 j;
        boolean p;
        do {
            synchronized (c01.z) {
                t22 t22Var = this.e;
                t22Var.getClass();
                t22 t22Var2 = (t22) q02.h(t22Var);
                i = t22Var2.d;
                g0Var = t22Var2.c;
            }
            g0Var.getClass();
            g0 f = g0Var.f(new f0(0, collection));
            if (sn0.r(f, g0Var)) {
                return false;
            }
            t22 t22Var3 = this.e;
            t22Var3.getClass();
            synchronized (q02.c) {
                j = q02.j();
                p = c01.p((t22) q02.w(t22Var3, this, j), i, f, true);
            }
            q02.n(j, this);
        } while (!p);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return c01.F(this, new f0(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        g0 g0Var;
        i02 j;
        boolean p;
        Object obj2 = get(i);
        do {
            synchronized (c01.z) {
                t22 t22Var = this.e;
                t22Var.getClass();
                t22 t22Var2 = (t22) q02.h(t22Var);
                i2 = t22Var2.d;
                g0Var = t22Var2.c;
            }
            g0Var.getClass();
            g0 h = g0Var.h(i, obj);
            if (h.equals(g0Var)) {
                break;
            }
            t22 t22Var3 = this.e;
            t22Var3.getClass();
            synchronized (q02.c) {
                j = q02.j();
                p = c01.p((t22) q02.w(t22Var3, this, j), i2, h, false);
            }
            q02.n(j, this);
        } while (!p);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return c01.A(this).c.a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        boolean z;
        if (i >= 0 && i <= i2 && i2 <= size()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ei1.a("fromIndex or toIndex are out of bounds");
        }
        return new w32(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return d6.E(this);
    }

    public final String toString() {
        t22 t22Var = this.e;
        t22Var.getClass();
        return "SnapshotStateList(value=" + ((t22) q02.h(t22Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        g0 g0Var = c01.A(this).c;
        int a = g0Var.a();
        parcel.writeInt(a);
        for (int i2 = 0; i2 < a; i2++) {
            parcel.writeValue(g0Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return d6.F(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new ah0(this, i);
    }

    public a12() {
        this(kz1.f);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        g0 g0Var;
        i02 j;
        boolean p;
        do {
            synchronized (c01.z) {
                t22 t22Var = this.e;
                t22Var.getClass();
                t22 t22Var2 = (t22) q02.h(t22Var);
                i2 = t22Var2.d;
                g0Var = t22Var2.c;
            }
            g0Var.getClass();
            g0 b = g0Var.b(i, obj);
            if (b.equals(g0Var)) {
                return;
            }
            t22 t22Var3 = this.e;
            t22Var3.getClass();
            synchronized (q02.c) {
                j = q02.j();
                p = c01.p((t22) q02.w(t22Var3, this, j), i2, b, true);
            }
            q02.n(j, this);
        } while (!p);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return c01.F(this, new q1(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        g0 g0Var;
        i02 j;
        boolean p;
        Object obj = get(i);
        do {
            synchronized (c01.z) {
                t22 t22Var = this.e;
                t22Var.getClass();
                t22 t22Var2 = (t22) q02.h(t22Var);
                i2 = t22Var2.d;
                g0Var = t22Var2.c;
            }
            g0Var.getClass();
            g0 g = g0Var.g(i);
            if (g.equals(g0Var)) {
                break;
            }
            t22 t22Var3 = this.e;
            t22Var3.getClass();
            synchronized (q02.c) {
                j = q02.j();
                p = c01.p((t22) q02.w(t22Var3, this, j), i2, g, true);
            }
            q02.n(j, this);
        } while (!p);
        return obj;
    }
}
