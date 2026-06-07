package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class jt0 implements is0 {
    public final st0 a;
    public final it0 b;
    public final tr0 c;
    public final u7 d;

    public jt0(st0 st0Var, it0 it0Var, tr0 tr0Var, u7 u7Var) {
        this.a = st0Var;
        this.b = it0Var;
        this.c = tr0Var;
        this.d = u7Var;
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
        urVar.Y(-462424778);
        int i6 = 2;
        if (urVar.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i3 | i2;
        if (urVar.h(obj)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (urVar.f(this)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if ((i9 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (urVar.O(i9 & 1, z)) {
            io.e(obj, i, this.a.r, go.N(-824725566, new u6(this, i, i6), urVar), urVar, ((i9 >> 3) & 14) | 3072 | ((i9 << 3) & 112));
        } else {
            urVar.R();
        }
        dl1 r = urVar.r();
        if (r != null) {
            r.d = new cq(this, i, obj, i2, 4);
        }
    }

    @Override // defpackage.is0
    public final Object c(int i) {
        Object obj;
        u7 u7Var = this.d;
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
    public final Object d(int i) {
        ln0 b = this.b.b.b(i);
        return b.c.getType().invoke(Integer.valueOf(i - b.a));
    }

    @Override // defpackage.is0
    public final int e(Object obj) {
        return this.d.c(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt0)) {
            return false;
        }
        return sn0.r(this.b, ((jt0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
