package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class cg1 extends g0 {
    public final Object[] e;
    public final Object[] f;
    public final int g;
    public final int h;

    public cg1(Object[] objArr, Object[] objArr2, int i, int i2) {
        boolean z;
        this.e = objArr;
        this.f = objArr2;
        this.g = i;
        this.h = i2;
        if (a() > 32) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ei1.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] i(Object[] objArr, int i, int i2, Object obj, e2 e2Var) {
        Object[] copyOf;
        int w = pp1.w(i2, i);
        if (i == 0) {
            if (w == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
            }
            bf.D(objArr, copyOf, w + 1, w, 31);
            e2Var.a = objArr[31];
            copyOf[w] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[w];
        obj2.getClass();
        copyOf2[w] = i((Object[]) obj2, i3, i2, obj, e2Var);
        while (true) {
            w++;
            if (w >= 32 || copyOf2[w] == null) {
                break;
            }
            Object obj3 = objArr[w];
            obj3.getClass();
            copyOf2[w] = i((Object[]) obj3, i3, 0, e2Var.a, e2Var);
        }
        return copyOf2;
    }

    public static Object[] k(Object[] objArr, int i, int i2, e2 e2Var) {
        Object[] k;
        int w = pp1.w(i2, i);
        if (i == 5) {
            e2Var.a = objArr[w];
            k = null;
        } else {
            Object obj = objArr[w];
            obj.getClass();
            k = k((Object[]) obj, i - 5, i2, e2Var);
        }
        if (k == null && w == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[w] = k;
        return copyOf;
    }

    public static Object[] q(Object[] objArr, int i, int i2, Object obj) {
        int w = pp1.w(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[w] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[w];
        obj2.getClass();
        copyOf[w] = q((Object[]) obj2, i - 5, i2, obj);
        return copyOf;
    }

    @Override // defpackage.s
    public final int a() {
        return this.g;
    }

    @Override // defpackage.g0
    public final g0 b(int i, Object obj) {
        int i2 = this.g;
        qo.s(i, i2);
        if (i == i2) {
            return c(obj);
        }
        int p = p();
        Object[] objArr = this.e;
        if (i >= p) {
            return j(objArr, i - p, obj);
        }
        e2 e2Var = new e2(null);
        return j(i(objArr, this.h, i, obj, e2Var), 0, e2Var.a);
    }

    @Override // defpackage.g0
    public final g0 c(Object obj) {
        int p = p();
        int i = this.g;
        int i2 = i - p;
        Object[] objArr = this.e;
        Object[] objArr2 = this.f;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new cg1(objArr, copyOf, i + 1, this.h);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return l(objArr, objArr2, objArr3);
    }

    @Override // defpackage.g0
    public final dg1 e() {
        return new dg1(this, this.e, this.f, this.h);
    }

    @Override // defpackage.g0
    public final g0 f(f0 f0Var) {
        dg1 dg1Var = new dg1(this, this.e, this.f, this.h);
        dg1Var.y(f0Var);
        return dg1Var.c();
    }

    @Override // defpackage.g0
    public final g0 g(int i) {
        qo.r(i, a());
        int p = p();
        int i2 = this.h;
        Object[] objArr = this.e;
        if (i >= p) {
            return o(objArr, p, i2, i - p);
        }
        return o(n(objArr, i2, i, new e2(this.f[0])), p, i2, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        qo.r(i, a());
        if (p() <= i) {
            objArr = this.f;
        } else {
            Object[] objArr2 = this.e;
            for (int i2 = this.h; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[pp1.w(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.g0
    public final g0 h(int i, Object obj) {
        int i2 = this.g;
        qo.r(i, i2);
        int p = p();
        Object[] objArr = this.e;
        Object[] objArr2 = this.f;
        int i3 = this.h;
        if (p <= i) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i & 31] = obj;
            return new cg1(objArr, copyOf, i2, i3);
        }
        return new cg1(q(objArr, i3, i, obj), objArr2, i2, i3);
    }

    public final cg1 j(Object[] objArr, int i, Object obj) {
        int p = p();
        int i2 = this.g;
        int i3 = i2 - p;
        Object[] objArr2 = this.f;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            bf.D(objArr2, copyOf, i + 1, i, i3);
            copyOf[i] = obj;
            return new cg1(objArr, copyOf, i2 + 1, this.h);
        }
        Object obj2 = objArr2[31];
        bf.D(objArr2, copyOf, i + 1, i, i3 - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return l(objArr, copyOf, objArr3);
    }

    public final cg1 l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.g;
        int i2 = i >> 5;
        int i3 = this.h;
        if (i2 > (1 << i3)) {
            Object[] objArr4 = new Object[32];
            objArr4[0] = objArr;
            int i4 = i3 + 5;
            return new cg1(m(objArr4, objArr2, i4), objArr3, i + 1, i4);
        }
        return new cg1(m(objArr, objArr2, i3), objArr3, i + 1, i3);
    }

    @Override // defpackage.b0, java.util.List
    public final ListIterator listIterator(int i) {
        qo.s(i, this.g);
        return new eg1(this.e, this.f, i, this.g, (this.h / 5) + 1);
    }

    public final Object[] m(Object[] objArr, Object[] objArr2, int i) {
        Object[] objArr3;
        int w = pp1.w(a() - 1, i);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[w] = objArr2;
            return objArr3;
        }
        objArr3[w] = m((Object[]) objArr3[w], objArr2, i - 5);
        return objArr3;
    }

    public final Object[] n(Object[] objArr, int i, int i2, e2 e2Var) {
        Object[] copyOf;
        int w = pp1.w(i2, i);
        int i3 = 31;
        if (i == 0) {
            if (w == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
            }
            bf.D(objArr, copyOf, w, w + 1, 32);
            copyOf[31] = e2Var.a;
            e2Var.a = objArr[w];
            return copyOf;
        }
        if (objArr[31] == null) {
            i3 = pp1.w(p() - 1, i);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i4 = i - 5;
        int i5 = w + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj = copyOf2[i3];
                obj.getClass();
                copyOf2[i3] = n((Object[]) obj, i4, 0, e2Var);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj2 = copyOf2[w];
        obj2.getClass();
        copyOf2[w] = n((Object[]) obj2, i4, i2, e2Var);
        return copyOf2;
    }

    public final g0 o(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.g - i;
        if (i4 == 1) {
            if (i2 == 0) {
                if (objArr.length == 33) {
                    objArr = Arrays.copyOf(objArr, 32);
                }
                return new kz1(objArr);
            }
            e2 e2Var = new e2(null);
            Object[] k = k(objArr, i2, i - 1, e2Var);
            k.getClass();
            Object obj = e2Var.a;
            obj.getClass();
            Object[] objArr2 = (Object[]) obj;
            if (k[1] == null) {
                Object obj2 = k[0];
                obj2.getClass();
                return new cg1((Object[]) obj2, objArr2, i, i2 - 5);
            }
            return new cg1(k, objArr2, i, i2);
        }
        Object[] objArr3 = this.f;
        Object[] copyOf = Arrays.copyOf(objArr3, 32);
        int i5 = i4 - 1;
        if (i3 < i5) {
            bf.D(objArr3, copyOf, i3, i3 + 1, i4);
        }
        copyOf[i5] = null;
        return new cg1(objArr, copyOf, (i + i4) - 1, i2);
    }

    public final int p() {
        return (this.g - 1) & (-32);
    }
}
