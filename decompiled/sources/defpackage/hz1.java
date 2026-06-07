package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class hz1 implements zr, Iterable, xo0 {
    public final gz1 e;
    public final int f;
    public final int g;

    public hz1(gz1 gz1Var, int i, int i2) {
        this.e = gz1Var;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hz1) {
            hz1 hz1Var = (hz1) obj;
            if (hz1Var.f == this.f && hz1Var.g == this.g && hz1Var.e == this.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.e.hashCode() * 31) + this.f;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        gz1 gz1Var = this.e;
        if (gz1Var.l != this.g) {
            iz1.e();
        }
        int i = this.f;
        gz1Var.f(i);
        return new ag0(gz1Var, i + 1, gz1Var.e[(i * 5) + 3] + i);
    }
}
