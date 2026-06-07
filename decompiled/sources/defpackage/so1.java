package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class so1 extends b0 implements RandomAccess {
    public final Object[] e;
    public final int f;
    public int g;
    public int h;

    public so1(Object[] objArr, int i) {
        this.e = objArr;
        if (i >= 0) {
            if (i <= objArr.length) {
                this.f = objArr.length;
                this.h = i;
                return;
            } else {
                se.l(l90.q("ring buffer filled size: ", i, " cannot be larger than the buffer size: "), objArr.length);
                throw null;
            }
        }
        se.e(l90.g(i, "ring buffer filled size should not be negative but it is "));
        throw null;
    }

    @Override // defpackage.s
    public final int a() {
        return this.h;
    }

    public final void b() {
        if (2 <= this.h) {
            int i = this.g;
            int i2 = this.f;
            int i3 = (i + 2) % i2;
            Object[] objArr = this.e;
            if (i > i3) {
                Arrays.fill(objArr, i, i2, (Object) null);
                Arrays.fill(objArr, 0, i3, (Object) null);
            } else {
                Arrays.fill(objArr, i, i3, (Object) null);
            }
            this.g = i3;
            this.h -= 2;
            return;
        }
        throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 2, size = " + this.h).toString());
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.h;
        if (i >= 0 && i < i2) {
            return this.e[(this.g + i) % this.f];
        }
        se.u(l90.j("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // defpackage.b0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zz(this);
    }

    @Override // defpackage.s, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.h;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.h;
        int i3 = this.g;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.e;
            if (i5 >= i2 || i3 >= this.f) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // defpackage.s, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }
}
