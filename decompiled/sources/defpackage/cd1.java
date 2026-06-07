package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cd1 implements is0 {
    public final uy a;
    public final fp b;
    public final u7 c;

    public cd1(uy uyVar, bd1 bd1Var, u7 u7Var) {
        this.a = uyVar;
        this.b = bd1Var;
        this.c = u7Var;
    }

    @Override // defpackage.is0
    public final int a() {
        return this.b.C().a;
    }

    @Override // defpackage.is0
    public final void b(int i, Object obj, ur urVar, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        urVar.Y(-1201380429);
        if (urVar.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (urVar.h(obj)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (urVar.f(this)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i8 & 1, z)) {
            io.e(obj, i, this.a.B, go.N(1142237095, new u6(this, i, 3), urVar), urVar, ((i8 >> 3) & 14) | 3072 | ((i8 << 3) & 112));
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new cq(this, i, obj, i2, 5);
        }
    }

    @Override // defpackage.is0
    public final Object c(int i) {
        Object obj;
        u7 u7Var = this.c;
        Object[] objArr = (Object[]) u7Var.c;
        int i2 = i - u7Var.a;
        if (i2 >= 0 && i2 < objArr.length) {
            obj = objArr[i2];
        } else {
            obj = null;
        }
        if (obj == null) {
            return this.b.F(i);
        }
        return obj;
    }

    @Override // defpackage.is0
    public final int e(Object obj) {
        return this.c.c(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd1)) {
            return false;
        }
        return sn0.r(this.b, ((cd1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
