package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class pb1 extends xn {
    public int e;
    public int g;
    public int i;
    public nb1[] d = new nb1[16];
    public int[] f = new int[16];
    public Object[] h = new Object[16];

    public final void a0() {
        this.e = 0;
        this.g = 0;
        Arrays.fill(this.h, 0, this.i, (Object) null);
        this.i = 0;
    }

    public final void b0(ge geVar, jz1 jz1Var, fm1 fm1Var, ob1 ob1Var) {
        if (d0()) {
            gf0 gf0Var = new gf0(this);
            pb1 pb1Var = (pb1) gf0Var.e;
            while (true) {
                nb1 nb1Var = pb1Var.d[gf0Var.b];
                p3 b = nb1Var.b(gf0Var);
                ge geVar2 = geVar;
                jz1 jz1Var2 = jz1Var;
                fm1 fm1Var2 = fm1Var;
                ob1 ob1Var2 = ob1Var;
                try {
                    nb1Var.a(gf0Var, geVar2, jz1Var2, fm1Var2, ob1Var2);
                    int i = gf0Var.b;
                    int i2 = pb1Var.e;
                    if (i < i2) {
                        nb1 nb1Var2 = pb1Var.d[i];
                        gf0Var.c += nb1Var2.a;
                        gf0Var.d += nb1Var2.b;
                        int i3 = i + 1;
                        gf0Var.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        geVar = geVar2;
                        jz1Var = jz1Var2;
                        fm1Var = fm1Var2;
                        ob1Var = ob1Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        a0();
    }

    public final boolean c0() {
        if (this.e == 0) {
            return true;
        }
        return false;
    }

    public final boolean d0() {
        if (this.e != 0) {
            return true;
        }
        return false;
    }

    public final void e0(nb1 nb1Var) {
        int i;
        int i2;
        int i3 = this.e;
        nb1[] nb1VarArr = this.d;
        int i4 = 1024;
        if (i3 == nb1VarArr.length) {
            if (i3 > 1024) {
                i2 = 1024;
            } else {
                i2 = i3;
            }
            nb1[] nb1VarArr2 = new nb1[i2 + i3];
            System.arraycopy(nb1VarArr, 0, nb1VarArr2, 0, i3);
            this.d = nb1VarArr2;
        }
        int i5 = this.g;
        int i6 = nb1Var.a;
        int i7 = nb1Var.b;
        int i8 = i5 + i6;
        int[] iArr = this.f;
        int length = iArr.length;
        if (i8 > length) {
            if (length > 1024) {
                i = 1024;
            } else {
                i = length;
            }
            int i9 = i + length;
            if (i9 >= i8) {
                i8 = i9;
            }
            int[] iArr2 = new int[i8];
            bf.B(iArr, iArr2, 0, 0, length);
            this.f = iArr2;
        }
        int i10 = this.i + i7;
        Object[] objArr = this.h;
        int length2 = objArr.length;
        if (i10 > length2) {
            if (length2 <= 1024) {
                i4 = length2;
            }
            int i11 = i4 + length2;
            if (i11 >= i10) {
                i10 = i11;
            }
            Object[] objArr2 = new Object[i10];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.h = objArr2;
        }
        nb1[] nb1VarArr3 = this.d;
        int i12 = this.e;
        this.e = i12 + 1;
        nb1VarArr3[i12] = nb1Var;
        this.g += nb1Var.a;
        this.i += i7;
    }
}
