package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class xb2 extends c0 {
    public int g;
    public Object[] h;
    public boolean i;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public xb2(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        ?? r5;
        this.g = i3;
        Object[] objArr2 = new Object[i3];
        this.h = objArr2;
        if (i == i2) {
            r5 = 1;
        } else {
            r5 = 0;
        }
        this.i = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = this.e & 31;
        Object obj = this.h[this.g - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i2) {
        int i3 = (this.g - i2) * 5;
        while (i2 < this.g) {
            Object[] objArr = this.h;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[pp1.w(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (pp1.w(this.e, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.e, ((this.g - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object a = a();
            int i = this.e + 1;
            this.e = i;
            if (i == this.f) {
                this.i = true;
                return a;
            }
            c(0);
            return a;
        }
        y61.c();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.e--;
            if (this.i) {
                this.i = false;
                return a();
            }
            c(31);
            return a();
        }
        y61.c();
        return null;
    }
}
