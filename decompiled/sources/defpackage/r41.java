package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class r41 {
    public static final void a(int i, List list) {
        int size = list.size();
        if (i >= 0 && i < size) {
            return;
        }
        c(i, size);
    }

    public static final void b(int i, int i2, List list) {
        if (i > i2) {
            f(i, i2);
        }
        if (i < 0) {
            d(i);
        }
        if (i2 > list.size()) {
            e(i2, list.size());
        }
    }

    private static final void c(int i, int i2) {
        throw new IndexOutOfBoundsException("Index " + i + " is out of bounds. The list has " + i2 + " elements.");
    }

    private static final void d(int i) {
        throw new IndexOutOfBoundsException(l90.i("fromIndex (", i, ") is less than 0."));
    }

    private static final void e(int i, int i2) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i2 + ')');
    }

    private static final void f(int i, int i2) {
        throw new IllegalArgumentException("Indices are out of order. fromIndex (" + i + ") is greater than toIndex (" + i2 + ").");
    }
}
