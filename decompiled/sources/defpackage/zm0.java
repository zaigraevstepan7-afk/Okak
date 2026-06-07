package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class zm0 extends tm0 {
    public final int e;
    public final int f;
    public boolean g;
    public int h;

    public zm0(int i, int i2, int i3) {
        this.e = i3;
        this.f = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.g = z;
        this.h = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g;
    }

    @Override // defpackage.tm0
    public final int nextInt() {
        int i = this.h;
        if (i == this.f) {
            if (this.g) {
                this.g = false;
                return i;
            }
            y61.c();
            return 0;
        }
        this.h = this.e + i;
        return i;
    }
}
