package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xf1 implements Iterator, xo0 {
    public final /* synthetic */ int e = 1;
    public final Iterator f;

    public xf1(rf1 rf1Var) {
        zb2[] zb2VarArr = new zb2[8];
        for (int i = 0; i < 8; i++) {
            zb2VarArr[i] = new bc2(this);
        }
        this.f = new vf1(rf1Var, zb2VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                return ((vf1) this.f).g;
            default:
                return this.f.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                return (Map.Entry) ((vf1) this.f).next();
            default:
                return (ne2) this.f.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                ((vf1) this.f).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public xf1(le2 le2Var) {
        this.f = le2Var.n.iterator();
    }
}
