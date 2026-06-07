package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kz1 extends g0 {
    public static final kz1 f = new kz1(new Object[0]);
    public final Object[] e;

    public kz1(Object[] objArr) {
        this.e = objArr;
    }

    @Override // defpackage.s
    public final int a() {
        return this.e.length;
    }

    @Override // defpackage.g0
    public final g0 b(int i, Object obj) {
        Object[] objArr = this.e;
        qo.s(i, objArr.length);
        if (i == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            bf.G(objArr, objArr2, 0, i, 6);
            bf.D(objArr, objArr2, i + 1, i, objArr.length);
            objArr2[i] = obj;
            return new kz1(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        bf.D(objArr, copyOf, i + 1, i, objArr.length - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new cg1(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.g0
    public final g0 c(Object obj) {
        Object[] objArr = this.e;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            copyOf[objArr.length] = obj;
            return new kz1(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new cg1(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // defpackage.g0
    public final g0 d(Collection collection) {
        Object[] objArr = this.e;
        if (collection.size() + objArr.length <= 32) {
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            int length = objArr.length;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                copyOf[length] = it.next();
                length++;
            }
            return new kz1(copyOf);
        }
        dg1 e = e();
        e.addAll(collection);
        return e.c();
    }

    @Override // defpackage.g0
    public final dg1 e() {
        return new dg1(this, null, this.e, 0);
    }

    @Override // defpackage.g0
    public final g0 f(f0 f0Var) {
        Object[] objArr = this.e;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) f0Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArr2[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        if (length == 0) {
            return f;
        }
        return new kz1(bf.I(objArr2, 0, length));
    }

    @Override // defpackage.g0
    public final g0 g(int i) {
        Object[] objArr = this.e;
        qo.r(i, objArr.length);
        if (objArr.length == 1) {
            return f;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        bf.D(objArr, copyOf, i, i + 1, objArr.length);
        return new kz1(copyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.e;
        qo.r(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.g0
    public final g0 h(int i, Object obj) {
        Object[] objArr = this.e;
        qo.r(i, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new kz1(copyOf);
    }

    @Override // defpackage.b0, java.util.List
    public final int indexOf(Object obj) {
        return bf.X(this.e, obj);
    }

    @Override // defpackage.b0, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.e;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.b0, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.e;
        qo.s(i, objArr.length);
        return new ik(objArr, i, objArr.length);
    }
}
