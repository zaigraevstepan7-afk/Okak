package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jb2 implements ib2 {
    public final Object a;
    public final Object b;

    public jb2(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.ib2
    public final Object b() {
        return this.a;
    }

    @Override // defpackage.ib2
    public final Object c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ib2) {
            ib2 ib2Var = (ib2) obj;
            if (sn0.r(this.a, ib2Var.b()) && sn0.r(this.b, ib2Var.c())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        Object obj = this.a;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i3 + i2;
    }
}
