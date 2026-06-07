package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class b41 {
    public Object[] a;
    public int b;
    public z31 c;

    public b41(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = u81.a;
        } else {
            objArr = new Object[i];
        }
        this.a = objArr;
    }

    public final void a(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            m(objArr, i);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void b(b41 b41Var) {
        b41Var.getClass();
        if (!b41Var.h()) {
            int i = this.b + b41Var.b;
            Object[] objArr = this.a;
            if (objArr.length < i) {
                m(objArr, i);
            }
            bf.D(b41Var.a, this.a, this.b, 0, b41Var.b);
            this.b += b41Var.b;
        }
    }

    public final void c(List list) {
        if (!list.isEmpty()) {
            int i = this.b;
            int size = list.size() + i;
            Object[] objArr = this.a;
            if (objArr.length < size) {
                m(objArr, size);
            }
            Object[] objArr2 = this.a;
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                objArr2[i2 + i] = list.get(i2);
            }
            this.b = list.size() + this.b;
        }
    }

    public final void d() {
        bf.M(this.a, 0, this.b);
        this.b = 0;
    }

    public final Object e() {
        if (!h()) {
            return this.a[0];
        }
        y61.j("ObjectList is empty.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b41) {
            b41 b41Var = (b41) obj;
            int i = b41Var.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = b41Var.a;
                an0 X = go.X(0, i2);
                int i3 = X.e;
                int i4 = X.f;
                if (i3 <= i4) {
                    while (sn0.r(objArr[i3], objArr2[i3])) {
                        if (i3 != i4) {
                            i3++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final Object f(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        n(i);
        throw null;
    }

    public final int g(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean h() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.a;
        int i2 = this.b;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i3 += i * 31;
        }
        return i3;
    }

    public final boolean i() {
        if (this.b != 0) {
            return true;
        }
        return false;
    }

    public final boolean j(Object obj) {
        int g = g(obj);
        if (g >= 0) {
            k(g);
            return true;
        }
        return false;
    }

    public final Object k(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.b)) {
            Object[] objArr = this.a;
            Object obj = objArr[i];
            if (i != i2 - 1) {
                bf.D(objArr, objArr, i, i + 1, i2);
            }
            int i3 = this.b - 1;
            this.b = i3;
            objArr[i3] = null;
            return obj;
        }
        n(i);
        throw null;
    }

    public final void l(int i, int i2) {
        int i3;
        if (i >= 0 && i <= (i3 = this.b) && i2 >= 0 && i2 <= i3) {
            if (i2 >= i) {
                if (i2 != i) {
                    if (i2 < i3) {
                        Object[] objArr = this.a;
                        bf.D(objArr, objArr, i, i2, i3);
                    }
                    int i4 = this.b;
                    int i5 = i4 - (i2 - i);
                    bf.M(this.a, i5, i4);
                    this.b = i5;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        throw new IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.b);
    }

    public final void m(Object[] objArr, int i) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        bf.D(objArr, objArr2, 0, 0, length);
        this.a = objArr2;
    }

    public final void n(int i) {
        StringBuilder q = l90.q("Index ", i, " must be in 0..");
        q.append(this.b - 1);
        throw new IndexOutOfBoundsException(q.toString());
    }

    public final void o(int i) {
        StringBuilder q = l90.q("Index ", i, " must be in 0..");
        q.append(this.b);
        throw new IndexOutOfBoundsException(q.toString());
    }

    public final String toString() {
        n3 n3Var = new n3(this, 19);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                Object obj = objArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) n3Var.invoke(obj));
                i2++;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        return sb.toString();
    }

    public /* synthetic */ b41() {
        this(16);
    }
}
