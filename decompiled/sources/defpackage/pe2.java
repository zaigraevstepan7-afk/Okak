package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pe2 extends ne2 {
    public final String e;
    public final List f;
    public final int g;
    public final ck h;
    public final float i;
    public final ck j;
    public final float k;
    public final float l;
    public final int m;
    public final int n;
    public final float o;
    public final float p;
    public final float q;
    public final float r;

    public pe2(String str, List list, int i, ck ckVar, float f, ck ckVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.e = str;
        this.f = list;
        this.g = i;
        this.h = ckVar;
        this.i = f;
        this.j = ckVar2;
        this.k = f2;
        this.l = f3;
        this.m = i2;
        this.n = i3;
        this.o = f4;
        this.p = f5;
        this.q = f6;
        this.r = f7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && pe2.class == obj.getClass()) {
                pe2 pe2Var = (pe2) obj;
                if (this.e.equals(pe2Var.e) && sn0.r(this.h, pe2Var.h) && this.i == pe2Var.i && sn0.r(this.j, pe2Var.j) && this.k == pe2Var.k && this.l == pe2Var.l && this.m == pe2Var.m && this.n == pe2Var.n && this.o == pe2Var.o && this.p == pe2Var.p && this.q == pe2Var.q && this.r == pe2Var.r && this.g == pe2Var.g && sn0.r(this.f, pe2Var.f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f.hashCode() + (this.e.hashCode() * 31)) * 31;
        int i2 = 0;
        ck ckVar = this.h;
        if (ckVar != null) {
            i = ckVar.hashCode();
        } else {
            i = 0;
        }
        int a = l90.a(this.i, (hashCode + i) * 31, 31);
        ck ckVar2 = this.j;
        if (ckVar2 != null) {
            i2 = ckVar2.hashCode();
        }
        return Integer.hashCode(this.g) + l90.a(this.r, l90.a(this.q, l90.a(this.p, l90.a(this.o, l90.b(this.n, l90.b(this.m, l90.a(this.l, l90.a(this.k, (a + i2) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
