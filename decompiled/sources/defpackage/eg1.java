package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class eg1 extends c0 {
    public final Object[] g;
    public final xb2 h;

    public eg1(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.g = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.h = new xb2(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            xb2 xb2Var = this.h;
            if (xb2Var.hasNext()) {
                this.e++;
                return xb2Var.next();
            }
            int i = this.e;
            this.e = i + 1;
            return this.g[i - xb2Var.f];
        }
        y61.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.e;
            xb2 xb2Var = this.h;
            int i2 = xb2Var.f;
            if (i > i2) {
                int i3 = i - 1;
                this.e = i3;
                return this.g[i3 - i2];
            }
            this.e = i - 1;
            return xb2Var.previous();
        }
        y61.c();
        return null;
    }
}
