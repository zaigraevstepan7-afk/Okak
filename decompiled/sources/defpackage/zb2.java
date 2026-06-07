package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class zb2 implements Iterator, xo0 {
    public Object[] e = yb2.e.d;
    public int f;
    public int g;

    public final void a(Object[] objArr, int i, int i2) {
        this.e = objArr;
        this.f = i;
        this.g = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.g < this.f) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
