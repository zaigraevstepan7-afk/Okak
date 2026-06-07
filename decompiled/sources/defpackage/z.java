package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class z extends y implements ListIterator {
    public final /* synthetic */ b0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b0 b0Var, int i) {
        super(b0Var, 0);
        this.h = b0Var;
        int a = b0Var.a();
        if (i >= 0 && i <= a) {
            this.f = i;
        } else {
            se.u(l90.j("index: ", i, ", size: ", a));
            throw null;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f - 1;
            this.f = i;
            return this.h.get(i);
        }
        y61.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
