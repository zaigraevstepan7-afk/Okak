package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class ac2 extends zb2 {
    public final /* synthetic */ int h;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.h) {
            case 0:
                int i = this.g;
                this.g = i + 2;
                Object[] objArr = this.e;
                return new qz0(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.g;
                this.g = i2 + 2;
                return this.e[i2];
            default:
                int i3 = this.g;
                this.g = i3 + 2;
                return this.e[i3 + 1];
        }
    }
}
