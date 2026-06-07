package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class y31 implements ListIterator, xo0 {
    public final /* synthetic */ int e;
    public final List f;
    public int g;

    public y31(int i, int i2, List list) {
        this.e = i2;
        switch (i2) {
            case 1:
                this.f = list;
                this.g = i;
                return;
            default:
                this.f = list;
                this.g = i - 1;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.e;
        List list = this.f;
        switch (i) {
            case 0:
                int i2 = this.g + 1;
                this.g = i2;
                list.add(i2, obj);
                return;
            default:
                list.add(this.g, obj);
                this.g++;
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        List list = this.f;
        switch (i) {
            case 0:
                if (this.g >= list.size() - 1) {
                    return false;
                }
                return true;
            default:
                if (this.g >= list.size()) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.e) {
            case 0:
                if (this.g >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.g > 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.e;
        List list = this.f;
        switch (i) {
            case 0:
                int i2 = this.g + 1;
                this.g = i2;
                return list.get(i2);
            default:
                int i3 = this.g;
                this.g = i3 + 1;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.e) {
            case 0:
                return this.g + 1;
            default:
                return this.g;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.e;
        List list = this.f;
        switch (i) {
            case 0:
                int i2 = this.g;
                this.g = i2 - 1;
                return list.get(i2);
            default:
                int i3 = this.g - 1;
                this.g = i3;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.e) {
            case 0:
                return this.g;
            default:
                return this.g - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.e;
        List list = this.f;
        switch (i) {
            case 0:
                list.remove(this.g);
                this.g--;
                return;
            default:
                int i2 = this.g - 1;
                this.g = i2;
                list.remove(i2);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.e;
        List list = this.f;
        switch (i) {
            case 0:
                list.set(this.g, obj);
                return;
            default:
                list.set(this.g, obj);
                return;
        }
    }
}
