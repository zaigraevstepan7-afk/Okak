package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class a41 implements List, zo0 {
    public final /* synthetic */ int e;
    public final List f;
    public final int g;
    public int h;

    public /* synthetic */ a41(List list, int i, int i2, int i3) {
        this.e = i3;
        this.f = list;
        this.g = i;
        this.h = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.e;
        int i3 = this.g;
        List list = this.f;
        switch (i2) {
            case 0:
                list.add(i + i3, obj);
                this.h++;
                return;
            default:
                list.add(i + i3, obj);
                this.h++;
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.e;
        int i3 = this.g;
        List list = this.f;
        switch (i2) {
            case 0:
                collection.getClass();
                list.addAll(i + i3, collection);
                this.h = collection.size() + this.h;
                if (collection.size() <= 0) {
                    return false;
                }
                return true;
            default:
                list.addAll(i + i3, collection);
                int size = collection.size();
                this.h += size;
                if (size <= 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.e;
        List list = this.f;
        int i2 = this.g;
        switch (i) {
            case 0:
                int i3 = this.h - 1;
                if (i2 <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                this.h = i2;
                return;
            default:
                int i4 = this.h - 1;
                if (i2 <= i4) {
                    while (true) {
                        list.remove(i4);
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                this.h = i2;
                return;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.e;
        List list = this.f;
        int i2 = this.g;
        switch (i) {
            case 0:
                int i3 = this.h;
                while (i2 < i3) {
                    if (sn0.r(list.get(i2), obj)) {
                        return true;
                    }
                    i2++;
                }
                return false;
            default:
                int i4 = this.h;
                while (i2 < i4) {
                    if (sn0.r(list.get(i2), obj)) {
                        return true;
                    }
                    i2++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.e;
        int i3 = this.g;
        List list = this.f;
        switch (i2) {
            case 0:
                u81.a(i, this);
                return list.get(i + i3);
            default:
                r41.a(i, this);
                return list.get(i + i3);
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.e;
        List list = this.f;
        int i2 = this.g;
        switch (i) {
            case 0:
                int i3 = this.h;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (sn0.r(list.get(i4), obj)) {
                        return i4 - i2;
                    }
                }
                return -1;
            default:
                int i5 = this.h;
                for (int i6 = i2; i6 < i5; i6++) {
                    if (sn0.r(list.get(i6), obj)) {
                        return i6 - i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.e) {
            case 0:
                if (this.h == this.g) {
                    return true;
                }
                return false;
            default:
                if (this.h == this.g) {
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
        int i = this.e;
        List list = this.f;
        int i2 = this.g;
        switch (i) {
            case 0:
                int i3 = this.h - 1;
                if (i2 > i3) {
                    return -1;
                }
                while (!sn0.r(list.get(i3), obj)) {
                    if (i3 == i2) {
                        return -1;
                    }
                    i3--;
                }
                return i3 - i2;
            default:
                int i4 = this.h - 1;
                if (i2 > i4) {
                    return -1;
                }
                while (!sn0.r(list.get(i4), obj)) {
                    if (i4 == i2) {
                        return -1;
                    }
                    i4--;
                }
                return i4 - i2;
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

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.e;
        int i2 = this.g;
        List list = this.f;
        switch (i) {
            case 0:
                int i3 = this.h;
                while (i2 < i3) {
                    if (sn0.r(list.get(i2), obj)) {
                        list.remove(i2);
                        this.h--;
                        return true;
                    }
                    i2++;
                }
                return false;
            default:
                int i4 = this.h;
                while (i2 < i4) {
                    if (sn0.r(list.get(i2), obj)) {
                        list.remove(i2);
                        this.h--;
                        return true;
                    }
                    i2++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.e) {
            case 0:
                collection.getClass();
                int i = this.h;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i == this.h) {
                    return false;
                }
                return true;
            default:
                int i2 = this.h;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i2 == this.h) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.e;
        int i2 = this.g;
        List list = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                int i3 = this.h;
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (true) {
                        if (!collection.contains(list.get(i4))) {
                            list.remove(i4);
                            this.h--;
                        }
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                if (i3 == this.h) {
                    return false;
                }
                return true;
            default:
                int i5 = this.h;
                int i6 = i5 - 1;
                if (i2 <= i6) {
                    while (true) {
                        if (!collection.contains(list.get(i6))) {
                            list.remove(i6);
                            this.h--;
                        }
                        if (i6 != i2) {
                            i6--;
                        }
                    }
                }
                if (i5 == this.h) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.e;
        int i3 = this.g;
        List list = this.f;
        switch (i2) {
            case 0:
                u81.a(i, this);
                return list.set(i + i3, obj);
            default:
                r41.a(i, this);
                return list.set(i + i3, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                i = this.h;
                i2 = this.g;
                break;
            default:
                i = this.h;
                i2 = this.g;
                break;
        }
        return i - i2;
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
    public final boolean add(Object obj) {
        int i = this.e;
        List list = this.f;
        switch (i) {
            case 0:
                int i2 = this.h;
                this.h = i2 + 1;
                list.add(i2, obj);
                return true;
            default:
                int i3 = this.h;
                this.h = i3 + 1;
                list.add(i3, obj);
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.e;
        List list = this.f;
        switch (i) {
            case 0:
                collection.getClass();
                list.addAll(this.h, collection);
                this.h = collection.size() + this.h;
                return collection.size() > 0;
            default:
                list.addAll(this.h, collection);
                int size = collection.size();
                this.h += size;
                return size > 0;
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.e;
        int i3 = this.g;
        List list = this.f;
        switch (i2) {
            case 0:
                u81.a(i, this);
                this.h--;
                return list.remove(i + i3);
            default:
                r41.a(i, this);
                this.h--;
                return list.remove(i + i3);
        }
    }
}
