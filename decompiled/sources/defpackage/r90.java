package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class r90 implements Iterator, xo0 {
    public final Iterator f;
    public Object h;
    public final /* synthetic */ kv1 i;
    public final /* synthetic */ int e = 0;
    public int g = -1;

    public r90(a00 a00Var) {
        this.i = a00Var;
        this.f = new eb2((o52) a00Var.b);
    }

    public void a() {
        Object next;
        a00 a00Var = (a00) this.i;
        do {
            Iterator it = this.f;
            if (it.hasNext()) {
                next = it.next();
            } else {
                this.g = 0;
                return;
            }
        } while (((Boolean) ((hr1) a00Var.c).invoke(next)).booleanValue());
        this.h = next;
        this.g = 1;
    }

    public void b() {
        Iterator it = this.f;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((o52) this.i).c.invoke(next)).booleanValue()) {
                this.g = 1;
                this.h = next;
                return;
            }
        }
        this.g = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                if (this.g == -1) {
                    a();
                }
                if (this.g == 1) {
                    return true;
                }
                return false;
            default:
                if (this.g == -1) {
                    b();
                }
                if (this.g == 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                if (this.g == -1) {
                    a();
                }
                if (this.g != 0) {
                    Object obj = this.h;
                    this.h = null;
                    this.g = -1;
                    return obj;
                }
                y61.c();
                return null;
            default:
                if (this.g == -1) {
                    b();
                }
                if (this.g != 0) {
                    Object obj2 = this.h;
                    this.h = null;
                    this.g = -1;
                    return obj2;
                }
                y61.c();
                return null;
        }
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

    public r90(o52 o52Var) {
        this.i = o52Var;
        this.f = o52Var.b.iterator();
    }
}
