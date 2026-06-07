package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class z31 implements List, zo0 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ z31(Object obj, int i) {
        this.e = i;
        this.f = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.e;
        Object obj2 = this.f;
        switch (i3) {
            case 0:
                b41 b41Var = (b41) obj2;
                if (i >= 0 && i <= (i2 = b41Var.b)) {
                    int i4 = i2 + 1;
                    Object[] objArr = b41Var.a;
                    if (objArr.length < i4) {
                        b41Var.m(objArr, i4);
                    }
                    Object[] objArr2 = b41Var.a;
                    int i5 = b41Var.b;
                    if (i != i5) {
                        bf.D(objArr2, objArr2, i + 1, i, i5);
                    }
                    objArr2[i] = obj;
                    b41Var.b++;
                    return;
                }
                b41Var.o(i);
                throw null;
            default:
                ((q41) obj2).a(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.e;
        Object obj = this.f;
        switch (i2) {
            case 0:
                collection.getClass();
                b41 b41Var = (b41) obj;
                if (i >= 0 && i <= b41Var.b) {
                    int i3 = 0;
                    if (collection.isEmpty()) {
                        return false;
                    }
                    int size = collection.size() + b41Var.b;
                    Object[] objArr = b41Var.a;
                    if (objArr.length < size) {
                        b41Var.m(objArr, size);
                    }
                    Object[] objArr2 = b41Var.a;
                    if (i != b41Var.b) {
                        bf.D(objArr2, objArr2, collection.size() + i, i, b41Var.b);
                    }
                    for (Object obj2 : collection) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            objArr2[i3 + i] = obj2;
                            i3 = i4;
                        } else {
                            xn.U();
                            throw null;
                        }
                    }
                    b41Var.b = collection.size() + b41Var.b;
                    return true;
                }
                b41Var.o(i);
                throw null;
            default:
                return ((q41) obj).e(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                ((b41) obj).d();
                return;
            default:
                ((q41) obj).g();
                return;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                if (((b41) obj2).g(obj) >= 0) {
                    return true;
                }
                return false;
            default:
                return ((q41) obj2).h(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                b41 b41Var = (b41) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (b41Var.g(it.next()) < 0) {
                        return false;
                    }
                }
                return true;
            default:
                q41 q41Var = (q41) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!q41Var.h(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.e;
        Object obj = this.f;
        switch (i2) {
            case 0:
                u81.a(i, this);
                return ((b41) obj).f(i);
            default:
                r41.a(i, this);
                return ((q41) obj).e[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return ((b41) obj2).g(obj);
            default:
                return ((q41) obj2).i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((b41) obj).h();
            default:
                if (((q41) obj).g == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return new y31(0, 0, this);
            default:
                return new y31(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.e;
        Object obj2 = this.f;
        switch (i2) {
            case 0:
                b41 b41Var = (b41) obj2;
                Object[] objArr = b41Var.a;
                int i3 = b41Var.b;
                if (obj == null) {
                    i = i3 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i3 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                q41 q41Var = (q41) obj2;
                Object[] objArr2 = q41Var.e;
                for (int i4 = q41Var.g - 1; i4 >= 0; i4--) {
                    if (sn0.r(obj, objArr2[i4])) {
                        return i4;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.e) {
            case 0:
                return new y31(0, 0, this);
            default:
                return new y31(0, 1, this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.e;
        Object obj = this.f;
        switch (i2) {
            case 0:
                u81.a(i, this);
                return ((b41) obj).k(i);
            default:
                r41.a(i, this);
                return ((q41) obj).k(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                b41 b41Var = (b41) obj;
                int i2 = b41Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    b41Var.j(it.next());
                }
                if (i2 != b41Var.b) {
                    return true;
                }
                return false;
            default:
                q41 q41Var = (q41) obj;
                if (!collection.isEmpty()) {
                    int i3 = q41Var.g;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        q41Var.j(it2.next());
                    }
                    if (i3 != q41Var.g) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                b41 b41Var = (b41) obj;
                int i2 = b41Var.b;
                Object[] objArr = b41Var.a;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        b41Var.k(i3);
                    }
                }
                if (i2 == b41Var.b) {
                    return false;
                }
                return true;
            default:
                q41 q41Var = (q41) obj;
                int i4 = q41Var.g;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(q41Var.e[i5])) {
                        q41Var.k(i5);
                    }
                }
                if (i4 == q41Var.g) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.e;
        Object obj2 = this.f;
        switch (i2) {
            case 0:
                u81.a(i, this);
                b41 b41Var = (b41) obj2;
                if (i >= 0 && i < b41Var.b) {
                    Object[] objArr = b41Var.a;
                    Object obj3 = objArr[i];
                    objArr[i] = obj;
                    return obj3;
                }
                b41Var.n(i);
                throw null;
            default:
                r41.a(i, this);
                Object[] objArr2 = ((q41) obj2).e;
                Object obj4 = objArr2[i];
                objArr2[i] = obj;
                return obj4;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((b41) obj).b;
            default:
                return ((q41) obj).g;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.e) {
            case 0:
                u81.b(i, i2, this);
                return new a41(this, i, i2, 0);
            default:
                r41.b(i, i2, this);
                return new a41(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.e) {
            case 0:
                objArr.getClass();
                return d6.F(this, objArr);
            default:
                return d6.F(this, objArr);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.e) {
            case 0:
                return d6.E(this);
            default:
                return d6.E(this);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.e) {
            case 0:
                return new y31(i, 0, this);
            default:
                return new y31(i, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return ((b41) obj2).j(obj);
            default:
                return ((q41) obj2).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.e;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ((b41) obj2).a(obj);
                return true;
            default:
                ((q41) obj2).b(obj);
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                b41 b41Var = (b41) obj;
                int i2 = b41Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    b41Var.a(it.next());
                }
                return i2 != b41Var.b;
            default:
                q41 q41Var = (q41) obj;
                return q41Var.e(q41Var.g, collection);
        }
    }
}
