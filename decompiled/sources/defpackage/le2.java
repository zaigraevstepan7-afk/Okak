package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class le2 extends ne2 implements Iterable, xo0 {
    public final String e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final List m;
    public final List n;

    public le2(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.e = str;
        this.f = f;
        this.g = f2;
        this.h = f3;
        this.i = f4;
        this.j = f5;
        this.k = f6;
        this.l = f7;
        this.m = list;
        this.n = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof le2)) {
            le2 le2Var = (le2) obj;
            if (sn0.r(this.e, le2Var.e) && this.f == le2Var.f && this.g == le2Var.g && this.h == le2Var.h && this.i == le2Var.i && this.j == le2Var.j && this.k == le2Var.k && this.l == le2Var.l && sn0.r(this.m, le2Var.m) && sn0.r(this.n, le2Var.n)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.n.hashCode() + ((this.m.hashCode() + l90.a(this.l, l90.a(this.k, l90.a(this.j, l90.a(this.i, l90.a(this.h, l90.a(this.g, l90.a(this.f, this.e.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new xf1(this);
    }
}
