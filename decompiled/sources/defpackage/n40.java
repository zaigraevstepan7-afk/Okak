package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class n40 implements Iterator, xo0 {
    public final /* synthetic */ int e = 1;
    public final Iterator f;
    public int g;

    public n40(o40 o40Var) {
        this.f = o40Var.a.iterator();
        this.g = o40Var.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        Iterator it = this.f;
        switch (i) {
            case 0:
                break;
            default:
                return it.hasNext();
        }
        while (this.g > 0 && it.hasNext()) {
            it.next();
            this.g--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        Iterator it = this.f;
        switch (i) {
            case 0:
                break;
            default:
                int i2 = this.g;
                this.g = i2 + 1;
                if (i2 >= 0) {
                    return new yj0(i2, it.next());
                }
                xn.U();
                throw null;
        }
        while (this.g > 0 && it.hasNext()) {
            it.next();
            this.g--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n40(Iterator it) {
        it.getClass();
        this.f = it;
    }
}
