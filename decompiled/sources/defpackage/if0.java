package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class if0 implements Iterator, xo0 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public final Object h;

    public if0(l41 l41Var) {
        this.e = 2;
        this.h = l41Var;
        this.f = -1;
        this.g = yq1.t(new k41(l41Var, this, null));
    }

    public void a() {
        Object invoke;
        int i;
        int i2 = this.f;
        a00 a00Var = (a00) this.h;
        if (i2 == -2) {
            invoke = ((de0) a00Var.b).invoke();
        } else {
            oe0 oe0Var = (oe0) a00Var.c;
            Object obj = this.g;
            obj.getClass();
            invoke = oe0Var.invoke(obj);
        }
        this.g = invoke;
        if (invoke == null) {
            i = 0;
        } else {
            i = 1;
        }
        this.f = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                if (this.f < 0) {
                    a();
                }
                if (this.f != 1) {
                    return false;
                }
                return true;
            case 1:
                return ((lv1) this.g).hasNext();
            case 2:
                return ((lv1) this.g).hasNext();
            default:
                if (this.f >= ((Map) this.h).size()) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = null;
        switch (this.e) {
            case 0:
                if (this.f < 0) {
                    a();
                }
                if (this.f != 0) {
                    Object obj2 = this.g;
                    obj2.getClass();
                    this.f = -1;
                    return obj2;
                }
                y61.c();
                return null;
            case 1:
                return ((lv1) this.g).next();
            case 2:
                return ((lv1) this.g).next();
            default:
                if (hasNext()) {
                    obj = this.g;
                    this.f++;
                    Object obj3 = ((Map) this.h).get(obj);
                    if (obj3 != null) {
                        this.g = ((tv0) obj3).b;
                    } else {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                } else {
                    y61.c();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.e;
        Object obj = this.h;
        switch (i) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i2 = this.f;
                if (i2 != -1) {
                    ((e41) obj).f.h(i2);
                    this.f = -1;
                    return;
                }
                return;
            case 2:
                int i3 = this.f;
                if (i3 != -1) {
                    ((l41) obj).f.m(i3);
                    this.f = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public if0(a00 a00Var) {
        this.e = 0;
        this.h = a00Var;
        this.f = -2;
    }

    public if0(Object obj, Map map) {
        this.e = 3;
        this.g = obj;
        this.h = map;
    }

    public if0(e41 e41Var) {
        this.e = 1;
        this.h = e41Var;
        this.f = -1;
        this.g = yq1.t(new d41(e41Var, this, null));
    }
}
