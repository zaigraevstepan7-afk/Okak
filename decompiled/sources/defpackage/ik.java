package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ik extends c0 {
    public final /* synthetic */ int g = 1;
    public final Object h;

    public ik(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.h = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                if (hasNext()) {
                    int i2 = this.e;
                    this.e = i2 + 1;
                    return ((Object[]) obj)[i2];
                }
                y61.c();
                return null;
            default:
                if (hasNext()) {
                    this.e++;
                    return obj;
                }
                y61.c();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                if (hasPrevious()) {
                    int i2 = this.e - 1;
                    this.e = i2;
                    return ((Object[]) obj)[i2];
                }
                y61.c();
                return null;
            default:
                if (hasPrevious()) {
                    this.e--;
                    return obj;
                }
                y61.c();
                return null;
        }
    }

    public ik(Object obj, int i) {
        super(i, 1);
        this.h = obj;
    }
}
