package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public class ym0 implements Iterable, xo0 {
    public final int e;
    public final int f;
    public final int g;

    public ym0(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.e = i;
                this.f = vn.D(i, i2, i3);
                this.g = i3;
                return;
            }
            se.h("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        se.h("Step must be non-zero.");
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ym0) {
            if (!isEmpty() || !((ym0) obj).isEmpty()) {
                ym0 ym0Var = (ym0) obj;
                if (this.e == ym0Var.e && this.f == ym0Var.f && this.g == ym0Var.g) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.e * 31) + this.f) * 31) + this.g;
    }

    public boolean isEmpty() {
        int i = this.f;
        int i2 = this.g;
        int i3 = this.e;
        if (i2 > 0) {
            if (i3 <= i) {
                return false;
            }
            return true;
        }
        if (i3 >= i) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zm0(this.e, this.f, this.g);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f;
        int i2 = this.g;
        int i3 = this.e;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
