package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class lv1 implements Iterator, vt, xo0 {
    public int e;
    public Object f;
    public vt g;

    public final RuntimeException a() {
        int i = this.e;
        if (i != 4) {
            if (i != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.e);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void b(vt vtVar, Object obj) {
        this.f = obj;
        this.e = 3;
        this.g = vtVar;
        vtVar.getClass();
    }

    @Override // defpackage.vt
    public final xu getContext() {
        return j60.e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.e;
            if (i != 0) {
                break;
            }
            this.e = 5;
            vt vtVar = this.g;
            vtVar.getClass();
            this.g = null;
            vtVar.resumeWith(od2.a);
        }
        if (i != 1) {
            if (i == 2 || i == 3) {
                return true;
            }
            if (i == 4) {
                return false;
            }
            throw a();
        }
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.e = 0;
                    Object obj = this.f;
                    this.f = null;
                    return obj;
                }
                throw a();
            }
            this.e = 1;
            throw null;
        }
        if (hasNext()) {
            return next();
        }
        y61.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.vt
    public final void resumeWith(Object obj) {
        io.K(obj);
        this.e = 4;
    }
}
