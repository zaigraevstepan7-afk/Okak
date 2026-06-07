package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class p12 extends tm0 {
    public int e;
    public final /* synthetic */ o12 f;

    public p12(o12 o12Var) {
        this.f = o12Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.e < this.f.e()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.tm0
    public final int nextInt() {
        int i = this.e;
        this.e = i + 1;
        return this.f.c(i);
    }
}
