package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class y51 implements Iterator, xo0 {
    public int e = -1;
    public boolean f;
    public final /* synthetic */ z51 g;

    public y51(z51 z51Var) {
        this.g = z51Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e + 1 < this.g.b.e()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f = true;
            o12 o12Var = this.g.b;
            int i = this.e + 1;
            this.e = i;
            return (r51) o12Var.f(i);
        }
        y61.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f) {
            o12 o12Var = this.g.b;
            ((r51) o12Var.f(this.e)).g = null;
            int i = this.e;
            Object[] objArr = o12Var.g;
            Object obj = objArr[i];
            Object obj2 = f2.z;
            if (obj != obj2) {
                objArr[i] = obj2;
                o12Var.e = true;
            }
            this.e = i - 1;
            this.f = false;
            return;
        }
        se.p("You must call next() before you can remove an element");
    }
}
