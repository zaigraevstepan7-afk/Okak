package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public abstract class q2 implements cf0, Serializable {
    public final Object e;
    public final Class f;
    public final String g;
    public final String h;
    public final boolean i = false;
    public final int j;
    public final int k;

    public q2(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.e = obj;
        this.f = cls;
        this.g = str;
        this.h = str2;
        this.j = i;
        this.k = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q2) {
                q2 q2Var = (q2) obj;
                if (this.i == q2Var.i && this.j == q2Var.j && this.k == q2Var.k && this.e.equals(q2Var.e) && this.f.equals(q2Var.f) && this.g.equals(q2Var.g) && this.h.equals(q2Var.h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.cf0
    public final int getArity() {
        return this.j;
    }

    public final int hashCode() {
        int i;
        int d = l90.d(l90.d((this.f.hashCode() + (this.e.hashCode() * 31)) * 31, 31, this.g), 31, this.h);
        if (this.i) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((d + i) * 31) + this.j) * 31) + this.k;
    }

    public final String toString() {
        yl1.a.getClass();
        return zl1.a(this);
    }
}
