package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class dg1 extends d0 implements Collection, yo0 {
    public g0 e;
    public Object[] f;
    public Object[] g;
    public int h;
    public wc0 i = new wc0(12);
    public Object[] j;
    public Object[] k;
    public int l;

    public dg1(g0 g0Var, Object[] objArr, Object[] objArr2, int i) {
        this.e = g0Var;
        this.f = objArr;
        this.g = objArr2;
        this.h = i;
        this.j = objArr;
        this.k = objArr2;
        this.l = g0Var.a();
    }

    public static void d(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object A(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.l - i;
        Object[] objArr2 = this.k;
        if (i4 == 1) {
            Object obj = objArr2[0];
            q(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] k = k(objArr2);
        bf.D(objArr2, k, i3, i3 + 1, i4);
        k[i4 - 1] = null;
        this.j = objArr;
        this.k = k;
        this.l = (i + i4) - 1;
        this.h = i2;
        return obj2;
    }

    public final int B() {
        int i = this.l;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] C(Object[] objArr, int i, int i2, Object obj, e2 e2Var) {
        int w = pp1.w(i2, i);
        Object[] k = k(objArr);
        if (i == 0) {
            if (k != objArr) {
                ((AbstractList) this).modCount++;
            }
            e2Var.a = k[w];
            k[w] = obj;
            return k;
        }
        Object obj2 = k[w];
        obj2.getClass();
        k[w] = C((Object[]) obj2, i - 5, i2, obj, e2Var);
        return k;
    }

    public final void D(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] m;
        if (i3 < 1) {
            ei1.a("requires at least one nullBuffer");
        }
        Object[] k = k(objArr);
        objArr2[0] = k;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            bf.D(k, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                m = k;
            } else {
                m = m();
                i3--;
                objArr2[i3] = m;
            }
            int i7 = i2 - i6;
            bf.D(k, objArr3, 0, i7, i2);
            bf.D(k, m, size + 1, i4, i7);
            objArr3 = m;
        }
        Iterator it = collection.iterator();
        d(k, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] m2 = m();
            d(m2, 0, it);
            objArr2[i8] = m2;
        }
        d(objArr3, 0, it);
    }

    public final int E() {
        int i = this.l;
        if (i <= 32) {
            return i;
        }
        return i - ((i - 1) & (-32));
    }

    @Override // defpackage.d0
    public final int a() {
        return this.l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        qo.s(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int B = B();
        if (i >= B) {
            h(this.j, i - B, obj);
            return;
        }
        e2 e2Var = new e2(null);
        Object[] objArr = this.j;
        objArr.getClass();
        h(g(objArr, this.h, i, obj, e2Var), 0, e2Var.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] m;
        qo.s(i, this.l);
        if (i == this.l) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.l - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.k;
            Object[] k = k(objArr);
            bf.D(objArr, k, size2 + 1, i3, E());
            d(k, i3, collection.iterator());
            this.k = k;
            this.l = collection.size() + this.l;
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int E = E();
        int size3 = collection.size() + this.l;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= B()) {
            m = m();
            collection2 = collection;
            D(collection2, i, this.k, E, objArr2, size, m);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.k;
            if (size3 > E) {
                int i4 = size3 - E;
                Object[] l = l(objArr3, i4);
                f(collection2, i, i4, objArr2, size, l);
                objArr2 = objArr2;
                m = l;
            } else {
                m = m();
                int i5 = E - size3;
                bf.D(objArr3, m, 0, i5, E);
                int i6 = 32 - i5;
                Object[] l2 = l(this.k, i6);
                int i7 = size - 1;
                objArr2[i7] = l2;
                f(collection2, i, i6, objArr2, i7, l2);
                collection2 = collection2;
            }
        }
        this.j = s(this.j, i2, objArr2);
        this.k = m;
        this.l = collection2.size() + this.l;
        return true;
    }

    @Override // defpackage.d0
    public final Object b(int i) {
        qo.r(i, a());
        ((AbstractList) this).modCount++;
        int B = B();
        if (i >= B) {
            return A(this.j, B, this.h, i - B);
        }
        e2 e2Var = new e2(this.k[0]);
        Object[] objArr = this.j;
        objArr.getClass();
        A(z(objArr, this.h, i, e2Var), B, this.h, 0);
        return e2Var.a;
    }

    public final g0 c() {
        g0 cg1Var;
        Object[] objArr = this.j;
        if (objArr == this.f && this.k == this.g) {
            cg1Var = this.e;
        } else {
            this.i = new wc0(12);
            this.f = objArr;
            Object[] objArr2 = this.k;
            this.g = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    cg1Var = kz1.f;
                } else {
                    cg1Var = new kz1(Arrays.copyOf(objArr2, this.l));
                }
            } else {
                cg1Var = new cg1(objArr, objArr2, this.l, this.h);
            }
        }
        this.e = cg1Var;
        return cg1Var;
    }

    public final int e() {
        return ((AbstractList) this).modCount;
    }

    public final void f(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.j != null) {
            int i4 = i >> 5;
            c0 j = j(B() >> 5);
            int i5 = i3;
            Object[] objArr3 = objArr2;
            while (j.e - 1 != i4) {
                Object[] objArr4 = (Object[]) j.previous();
                bf.D(objArr4, objArr3, 0, 32 - i2, 32);
                objArr3 = l(objArr4, i2);
                i5--;
                objArr[i5] = objArr3;
            }
            Object[] objArr5 = (Object[]) j.previous();
            int B = i3 - (((B() >> 5) - 1) - i4);
            if (B < i3) {
                objArr2 = objArr[B];
                objArr2.getClass();
            }
            D(collection, i, objArr5, 32, objArr, B, objArr2);
            return;
        }
        se.p("root is null");
    }

    public final Object[] g(Object[] objArr, int i, int i2, Object obj, e2 e2Var) {
        Object obj2;
        int w = pp1.w(i2, i);
        if (i == 0) {
            e2Var.a = objArr[31];
            Object[] k = k(objArr);
            bf.D(objArr, k, w + 1, w, 31);
            k[w] = obj;
            return k;
        }
        Object[] k2 = k(objArr);
        int i3 = i - 5;
        Object obj3 = k2[w];
        obj3.getClass();
        k2[w] = g((Object[]) obj3, i3, i2, obj, e2Var);
        while (true) {
            w++;
            if (w >= 32 || (obj2 = k2[w]) == null) {
                break;
            }
            k2[w] = g((Object[]) obj2, i3, 0, e2Var.a, e2Var);
        }
        return k2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        qo.r(i, a());
        if (B() <= i) {
            objArr = this.k;
        } else {
            Object[] objArr2 = this.j;
            objArr2.getClass();
            for (int i2 = this.h; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[pp1.w(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final void h(Object[] objArr, int i, Object obj) {
        int E = E();
        Object[] k = k(this.k);
        Object[] objArr2 = this.k;
        if (E < 32) {
            bf.D(objArr2, k, i + 1, i, E);
            k[i] = obj;
            this.j = objArr;
            this.k = k;
            this.l++;
            return;
        }
        Object obj2 = objArr2[31];
        bf.D(objArr2, k, i + 1, i, 31);
        k[i] = obj;
        t(objArr, k, n(obj2));
    }

    public final boolean i(Object[] objArr) {
        if (objArr.length == 33 && objArr[32] == this.i) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final c0 j(int i) {
        Object[] objArr = this.j;
        if (objArr != null) {
            int B = B() >> 5;
            qo.s(i, B);
            int i2 = this.h;
            if (i2 == 0) {
                return new ik(objArr, i);
            }
            return new xb2(objArr, i, B, i2 / 5);
        }
        se.p("Invalid root");
        return null;
    }

    public final Object[] k(Object[] objArr) {
        if (objArr == null) {
            return m();
        }
        if (i(objArr)) {
            return objArr;
        }
        Object[] m = m();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        bf.G(objArr, m, 0, length, 6);
        return m;
    }

    public final Object[] l(Object[] objArr, int i) {
        if (i(objArr)) {
            bf.D(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] m = m();
        bf.D(objArr, m, i, 0, 32 - i);
        return m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        qo.s(i, this.l);
        return new fg1(this, i);
    }

    public final Object[] m() {
        Object[] objArr = new Object[33];
        objArr[32] = this.i;
        return objArr;
    }

    public final Object[] n(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.i;
        return objArr;
    }

    public final Object[] o(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            ei1.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int w = pp1.w(i, i2);
        Object obj = objArr[w];
        obj.getClass();
        Object o = o((Object[]) obj, i, i2 - 5);
        if (w < 31) {
            int i3 = w + 1;
            if (objArr[i3] != null) {
                if (i(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] m = m();
                bf.D(objArr, m, 0, 0, i3);
                objArr = m;
            }
        }
        if (o != objArr[w]) {
            Object[] k = k(objArr);
            k[w] = o;
            return k;
        }
        return objArr;
    }

    public final Object[] p(Object[] objArr, int i, int i2, e2 e2Var) {
        Object[] p;
        int w = pp1.w(i2 - 1, i);
        if (i == 5) {
            e2Var.a = objArr[w];
            p = null;
        } else {
            Object obj = objArr[w];
            obj.getClass();
            p = p((Object[]) obj, i - 5, i2, e2Var);
        }
        if (p == null && w == 0) {
            return null;
        }
        Object[] k = k(objArr);
        k[w] = p;
        return k;
    }

    public final void q(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.j = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.k = objArr;
            this.l = i;
            this.h = i2;
            return;
        }
        e2 e2Var = new e2(null);
        objArr.getClass();
        Object[] p = p(objArr, i2, i, e2Var);
        p.getClass();
        Object obj = e2Var.a;
        obj.getClass();
        this.k = (Object[]) obj;
        this.l = i;
        if (p[1] == null) {
            this.j = (Object[]) p[0];
            this.h = i2 - 5;
        } else {
            this.j = p;
            this.h = i2;
        }
    }

    public final Object[] r(Object[] objArr, int i, int i2, Iterator it) {
        boolean z;
        if (!it.hasNext()) {
            ei1.a("invalid buffersIterator");
        }
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ei1.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] k = k(objArr);
        int w = pp1.w(i, i2);
        int i3 = i2 - 5;
        k[w] = r((Object[]) k[w], i, i3, it);
        while (true) {
            w++;
            if (w >= 32 || !it.hasNext()) {
                break;
            }
            k[w] = r((Object[]) k[w], 0, i3, it);
        }
        return k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return y(new f0(1, collection));
    }

    public final Object[] s(Object[] objArr, int i, Object[][] objArr2) {
        Object[] k;
        y yVar = new y(objArr2);
        int i2 = i >> 5;
        int i3 = this.h;
        if (i2 < (1 << i3)) {
            k = r(objArr, i, i3, yVar);
        } else {
            k = k(objArr);
        }
        while (yVar.hasNext()) {
            this.h += 5;
            k = n(k);
            int i4 = this.h;
            r(k, 1 << i4, i4, yVar);
        }
        return k;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        qo.r(i, a());
        if (B() <= i) {
            Object[] k = k(this.k);
            if (k != this.k) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            Object obj2 = k[i2];
            k[i2] = obj;
            this.k = k;
            return obj2;
        }
        e2 e2Var = new e2(null);
        Object[] objArr = this.j;
        objArr.getClass();
        this.j = C(objArr, this.h, i, obj, e2Var);
        return e2Var.a;
    }

    public final void t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.l;
        int i2 = i >> 5;
        int i3 = this.h;
        if (i2 > (1 << i3)) {
            this.j = u(n(objArr), objArr2, this.h + 5);
            this.k = objArr3;
            this.h += 5;
            this.l++;
            return;
        }
        if (objArr == null) {
            this.j = objArr2;
            this.k = objArr3;
            this.l = i + 1;
        } else {
            this.j = u(objArr, objArr2, i3);
            this.k = objArr3;
            this.l++;
        }
    }

    public final Object[] u(Object[] objArr, Object[] objArr2, int i) {
        int w = pp1.w(a() - 1, i);
        Object[] k = k(objArr);
        if (i == 5) {
            k[w] = objArr2;
            return k;
        }
        k[w] = u((Object[]) k[w], objArr2, i - 5);
        return k;
    }

    public final int v(oe0 oe0Var, Object[] objArr, int i, int i2, e2 e2Var, ArrayList arrayList, ArrayList arrayList2) {
        Object[] m;
        if (i(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = e2Var.a;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) oe0Var.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    if (!arrayList.isEmpty()) {
                        m = (Object[]) arrayList.remove(arrayList.size() - 1);
                    } else {
                        m = m();
                    }
                    objArr3 = m;
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        e2Var.a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int w(oe0 oe0Var, Object[] objArr, int i, e2 e2Var) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) oe0Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = k(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        e2Var.a = objArr2;
        return i2;
    }

    public final int x(oe0 oe0Var, int i, e2 e2Var) {
        int w = w(oe0Var, this.k, i, e2Var);
        Object obj = e2Var.a;
        if (w == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, w, i, (Object) null);
        this.k = objArr;
        this.l -= i - w;
        return w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (x(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(defpackage.oe0 r16) {
        /*
            r15 = this;
            r1 = r16
            int r8 = r15.E()
            e2 r5 = new e2
            r9 = 0
            r5.<init>(r9)
            java.lang.Object[] r0 = r15.j
            r10 = 0
            r11 = 1
            if (r0 != 0) goto L1b
            int r0 = r15.x(r1, r8, r5)
            if (r0 == r8) goto Ld1
        L18:
            r10 = r11
            goto Ld1
        L1b:
            c0 r12 = r15.j(r10)
            r13 = 32
            r0 = r13
        L22:
            if (r0 != r13) goto L35
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r0 = r12.next()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r15.w(r1, r0, r13, r5)
            goto L22
        L35:
            if (r0 != r13) goto L49
            int r0 = r15.x(r1, r8, r5)
            if (r0 != 0) goto L46
            java.lang.Object[] r1 = r15.j
            int r2 = r15.l
            int r3 = r15.h
            r15.q(r1, r2, r3)
        L46:
            if (r0 == r8) goto Ld1
            goto L18
        L49:
            int r2 = r12.e
            int r2 = r2 - r11
            int r14 = r2 << 5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r4 = r0
        L59:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r12.next()
            r2 = r0
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 32
            r0 = r15
            int r4 = r0.v(r1, r2, r3, r4, r5, r6, r7)
            r1 = r16
            goto L59
        L70:
            java.lang.Object[] r2 = r15.k
            r0 = r15
            r1 = r16
            r3 = r8
            int r1 = r0.v(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r2 = r5.a
            r2.getClass()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.util.Arrays.fill(r2, r1, r13, r9)
            boolean r3 = r7.isEmpty()
            java.lang.Object[] r4 = r15.j
            if (r3 == 0) goto L90
            r4.getClass()
            goto L9a
        L90:
            int r3 = r15.h
            java.util.Iterator r5 = r7.iterator()
            java.lang.Object[] r4 = r15.r(r4, r14, r3, r5)
        L9a:
            int r3 = r7.size()
            int r3 = r3 << 5
            int r14 = r14 + r3
            r3 = r14 & 31
            if (r3 != 0) goto La6
            goto Lab
        La6:
            java.lang.String r3 = "invalid size"
            defpackage.ei1.a(r3)
        Lab:
            if (r14 != 0) goto Lb0
            r15.h = r10
            goto Lc8
        Lb0:
            int r3 = r14 + (-1)
        Lb2:
            int r5 = r15.h
            int r6 = r3 >> r5
            if (r6 != 0) goto Lc4
            int r5 = r5 + (-5)
            r15.h = r5
            r4 = r4[r10]
            r4.getClass()
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            goto Lb2
        Lc4:
            java.lang.Object[] r9 = r15.o(r4, r3, r5)
        Lc8:
            r15.j = r9
            r15.k = r2
            int r14 = r14 + r1
            r15.l = r14
            goto L18
        Ld1:
            if (r10 == 0) goto Ld8
            int r1 = r15.modCount
            int r1 = r1 + r11
            r15.modCount = r1
        Ld8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dg1.y(oe0):boolean");
    }

    public final Object[] z(Object[] objArr, int i, int i2, e2 e2Var) {
        int w = pp1.w(i2, i);
        int i3 = 31;
        if (i == 0) {
            Object obj = objArr[w];
            Object[] k = k(objArr);
            bf.D(objArr, k, w, w + 1, 32);
            k[31] = e2Var.a;
            e2Var.a = obj;
            return k;
        }
        if (objArr[31] == null) {
            i3 = pp1.w(B() - 1, i);
        }
        Object[] k2 = k(objArr);
        int i4 = i - 5;
        int i5 = w + 1;
        if (i5 <= i3) {
            while (true) {
                Object obj2 = k2[i3];
                obj2.getClass();
                k2[i3] = z((Object[]) obj2, i4, 0, e2Var);
                if (i3 == i5) {
                    break;
                }
                i3--;
            }
        }
        Object obj3 = k2[w];
        obj3.getClass();
        k2[w] = z((Object[]) obj3, i4, i2, e2Var);
        return k2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int E = E();
        if (E < 32) {
            Object[] k = k(this.k);
            k[E] = obj;
            this.k = k;
            this.l = a() + 1;
        } else {
            t(this.j, this.k, n(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int E = E();
        Iterator it = collection.iterator();
        if (32 - E >= collection.size()) {
            Object[] k = k(this.k);
            d(k, E, it);
            this.k = k;
            this.l = collection.size() + this.l;
            return true;
        }
        int size = ((collection.size() + E) - 1) / 32;
        Object[][] objArr = new Object[size];
        Object[] k2 = k(this.k);
        d(k2, E, it);
        objArr[0] = k2;
        for (int i = 1; i < size; i++) {
            Object[] m = m();
            d(m, 0, it);
            objArr[i] = m;
        }
        this.j = s(this.j, B(), objArr);
        Object[] m2 = m();
        d(m2, 0, it);
        this.k = m2;
        this.l = collection.size() + this.l;
        return true;
    }
}
