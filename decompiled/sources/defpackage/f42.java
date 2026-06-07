package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class f42 extends sw1 implements p22 {
    @Override // defpackage.p22
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.l;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.m + ((int) ((o() + this.o) - this.m))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void w(int i) {
        synchronized (this) {
            Object[] objArr = this.l;
            objArr.getClass();
            q(Integer.valueOf(((Number) objArr[((int) ((this.m + ((int) ((o() + this.o) - this.m))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
