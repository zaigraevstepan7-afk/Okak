package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kz0 extends mz0 implements Iterator, xo0 {
    public final /* synthetic */ int i;

    public kz0(nz0 nz0Var, int i) {
        this.i = i;
        nz0Var.getClass();
        this.h = nz0Var;
        this.f = -1;
        this.g = nz0Var.l;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.i) {
            case 0:
                b();
                int i = this.e;
                nz0 nz0Var = (nz0) this.h;
                if (i < nz0Var.j) {
                    this.e = i + 1;
                    this.f = i;
                    lz0 lz0Var = new lz0(nz0Var, i);
                    c();
                    return lz0Var;
                }
                y61.c();
                return null;
            case 1:
                b();
                int i2 = this.e;
                nz0 nz0Var2 = (nz0) this.h;
                if (i2 < nz0Var2.j) {
                    this.e = i2 + 1;
                    this.f = i2;
                    Object obj = nz0Var2.e[i2];
                    c();
                    return obj;
                }
                y61.c();
                return null;
            default:
                b();
                int i3 = this.e;
                nz0 nz0Var3 = (nz0) this.h;
                if (i3 < nz0Var3.j) {
                    this.e = i3 + 1;
                    this.f = i3;
                    Object[] objArr = nz0Var3.f;
                    objArr.getClass();
                    Object obj2 = objArr[this.f];
                    c();
                    return obj2;
                }
                y61.c();
                return null;
        }
    }
}
