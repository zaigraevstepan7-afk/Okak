package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class bc2 extends zb2 {
    public final xf1 h;

    public bc2(xf1 xf1Var) {
        this.h = xf1Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.g;
        this.g = i + 2;
        Object[] objArr = this.e;
        return new v31(this.h, objArr[i], objArr[i + 1]);
    }
}
