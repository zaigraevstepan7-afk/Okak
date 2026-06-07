package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class l12 implements zr, Iterable, xo0 {
    public final gz1 e;
    public final int f;
    public final cm1 g;

    public l12(gz1 gz1Var, int i, dg0 dg0Var, cm1 cm1Var) {
        this.e = gz1Var;
        this.f = i;
        this.g = cm1Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l12) {
            l12 l12Var = (l12) obj;
            if (l12Var.f == this.f && l12Var.e == this.e && l12Var.g.equals(this.g)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.e.hashCode() + (this.f * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zz(this.e, this.f, null, this.g);
    }
}
