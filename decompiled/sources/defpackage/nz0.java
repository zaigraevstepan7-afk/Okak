package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class nz0 implements Map, Serializable, ap0 {
    public static final nz0 r;
    public Object[] e;
    public Object[] f;
    public int[] g;
    public int[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public oz0 n;
    public pz0 o;
    public oz0 p;
    public boolean q;

    static {
        nz0 nz0Var = new nz0(0);
        nz0Var.q = true;
        r = nz0Var;
    }

    public nz0(int i) {
        if (i >= 0) {
            Object[] objArr = new Object[i];
            int[] iArr = new int[i];
            int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
            this.e = objArr;
            this.f = null;
            this.g = iArr;
            this.h = new int[highestOneBit];
            this.i = 2;
            this.j = 0;
            this.k = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        se.h("capacity must be non-negative.");
        throw null;
    }

    public final int a(Object obj) {
        b();
        while (true) {
            int h = h(obj);
            int i = this.i * 2;
            int length = this.h.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.h;
                int i3 = iArr[h];
                if (i3 <= 0) {
                    int i4 = this.j;
                    Object[] objArr = this.e;
                    if (i4 >= objArr.length) {
                        e(1);
                    } else {
                        int i5 = i4 + 1;
                        this.j = i5;
                        objArr[i4] = obj;
                        this.g[i4] = h;
                        iArr[h] = i5;
                        this.m++;
                        this.l++;
                        if (i2 > this.i) {
                            this.i = i2;
                        }
                        return i4;
                    }
                } else {
                    if (sn0.r(this.e[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        i(this.h.length * 2);
                        break;
                    }
                    int i6 = h - 1;
                    if (h == 0) {
                        h = this.h.length - 1;
                    } else {
                        h = i6;
                    }
                }
            }
        }
    }

    public final void b() {
        if (!this.q) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void c(boolean z) {
        int i;
        Object[] objArr = this.f;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.j;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.g;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.e;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.h[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        lo.V(this.e, i3, i);
        if (objArr != null) {
            lo.V(objArr, i3, this.j);
        }
        this.j = i3;
    }

    @Override // java.util.Map
    public final void clear() {
        b();
        int i = this.j - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.g;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.h[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        lo.V(this.e, 0, this.j);
        Object[] objArr = this.f;
        if (objArr != null) {
            lo.V(objArr, 0, this.j);
        }
        this.m = 0;
        this.j = 0;
        this.l++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (f(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean d(Collection collection) {
        boolean r2;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int f = f(entry.getKey());
                    if (f < 0) {
                        r2 = false;
                    } else {
                        Object[] objArr = this.f;
                        objArr.getClass();
                        r2 = sn0.r(objArr[f], entry.getValue());
                    }
                    if (!r2) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final void e(int i) {
        Object[] objArr;
        Object[] objArr2 = this.e;
        int length = objArr2.length;
        int i2 = this.j;
        int i3 = length - i2;
        int i4 = i2 - this.m;
        int i5 = 1;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr2.length / 4) {
            c(true);
            return;
        }
        int i6 = i2 + i;
        if (i6 >= 0) {
            if (i6 > objArr2.length) {
                int length2 = objArr2.length;
                int i7 = length2 + (length2 >> 1);
                if (i7 - i6 < 0) {
                    i7 = i6;
                }
                if (i7 - 2147483639 > 0) {
                    if (i6 > 2147483639) {
                        i7 = Integer.MAX_VALUE;
                    } else {
                        i7 = 2147483639;
                    }
                }
                this.e = Arrays.copyOf(objArr2, i7);
                Object[] objArr3 = this.f;
                if (objArr3 != null) {
                    objArr = Arrays.copyOf(objArr3, i7);
                } else {
                    objArr = null;
                }
                this.f = objArr;
                this.g = Arrays.copyOf(this.g, i7);
                if (i7 >= 1) {
                    i5 = i7;
                }
                int highestOneBit = Integer.highestOneBit(i5 * 3);
                if (highestOneBit > this.h.length) {
                    i(highestOneBit);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        oz0 oz0Var = this.p;
        if (oz0Var == null) {
            oz0 oz0Var2 = new oz0(this, 0);
            this.p = oz0Var2;
            return oz0Var2;
        }
        return oz0Var;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.m != map.size() || !d(map.entrySet())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int f(Object obj) {
        int h = h(obj);
        int i = this.i;
        while (true) {
            int i2 = this.h[h];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (sn0.r(this.e[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = h - 1;
            if (h == 0) {
                h = this.h.length - 1;
            } else {
                h = i4;
            }
        }
    }

    public final int g(Object obj) {
        int i = this.j;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.g[i] >= 0) {
                Object[] objArr = this.f;
                objArr.getClass();
                if (sn0.r(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int f = f(obj);
        if (f < 0) {
            return null;
        }
        Object[] objArr = this.f;
        objArr.getClass();
        return objArr[f];
    }

    public final int h(Object obj) {
        int i;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return (i * (-1640531527)) >>> this.k;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int i2;
        kz0 kz0Var = new kz0(this, 0);
        int i3 = 0;
        while (kz0Var.hasNext()) {
            int i4 = kz0Var.e;
            nz0 nz0Var = (nz0) kz0Var.h;
            if (i4 < nz0Var.j) {
                kz0Var.e = i4 + 1;
                kz0Var.f = i4;
                Object obj = nz0Var.e[i4];
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] objArr = nz0Var.f;
                objArr.getClass();
                Object obj2 = objArr[kz0Var.f];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                } else {
                    i2 = 0;
                }
                kz0Var.c();
                i3 += i ^ i2;
            } else {
                y61.c();
                return 0;
            }
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.g[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r6) {
        /*
            r5 = this;
            int r0 = r5.l
            int r0 = r0 + 1
            r5.l = r0
            int r0 = r5.j
            int r1 = r5.m
            r2 = 0
            if (r0 <= r1) goto L10
            r5.c(r2)
        L10:
            int[] r0 = new int[r6]
            r5.h = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.k = r6
        L1c:
            int r6 = r5.j
            if (r2 >= r6) goto L4d
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.e
            r0 = r0[r2]
            int r0 = r5.h(r0)
            int r1 = r5.i
        L2c:
            int[] r3 = r5.h
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.g
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.String r5 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            defpackage.se.p(r5)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz0.i(int):void");
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (this.m == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0022->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.e
            r0.getClass()
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f
            if (r0 == 0) goto Le
            r0[r12] = r1
        Le:
            int[] r0 = r11.g
            r0 = r0[r12]
            int r1 = r11.i
            int r1 = r1 * 2
            int[] r2 = r11.h
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1e
            r1 = r2
        L1e:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L22:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2c
            int[] r0 = r11.h
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2d
        L2c:
            r0 = r5
        L2d:
            int r4 = r4 + 1
            int r5 = r11.i
            int[] r6 = r11.h
            r7 = -1
            if (r4 <= r5) goto L39
            r6[r1] = r2
            goto L68
        L39:
            r5 = r6[r0]
            if (r5 != 0) goto L40
            r6[r1] = r2
            goto L68
        L40:
            if (r5 >= 0) goto L47
            r6[r1] = r7
        L44:
            r1 = r0
            r4 = r2
            goto L61
        L47:
            java.lang.Object[] r6 = r11.e
            int r8 = r5 + (-1)
            r6 = r6[r8]
            int r6 = r11.h(r6)
            int r6 = r6 - r0
            int[] r9 = r11.h
            int r10 = r9.length
            int r10 = r10 + (-1)
            r6 = r6 & r10
            if (r6 < r4) goto L61
            r9[r1] = r5
            int[] r4 = r11.g
            r4[r8] = r1
            goto L44
        L61:
            int r3 = r3 + r7
            if (r3 >= 0) goto L22
            int[] r0 = r11.h
            r0[r1] = r7
        L68:
            int[] r0 = r11.g
            r0[r12] = r7
            int r12 = r11.m
            int r12 = r12 + r7
            r11.m = r12
            int r12 = r11.l
            int r12 = r12 + 1
            r11.l = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nz0.j(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        oz0 oz0Var = this.n;
        if (oz0Var == null) {
            oz0 oz0Var2 = new oz0(this, 1);
            this.n = oz0Var2;
            return oz0Var2;
        }
        return oz0Var;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        int a = a(obj);
        Object[] objArr = this.f;
        if (objArr == null) {
            int length = this.e.length;
            if (length >= 0) {
                objArr = new Object[length];
                this.f = objArr;
            } else {
                se.h("capacity must be non-negative.");
                return null;
            }
        }
        if (a < 0) {
            int i = (-a) - 1;
            Object obj3 = objArr[i];
            objArr[i] = obj2;
            return obj3;
        }
        objArr[a] = obj2;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        b();
        Set<Map.Entry> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            e(entrySet.size());
            for (Map.Entry entry : entrySet) {
                int a = a(entry.getKey());
                Object[] objArr = this.f;
                if (objArr == null) {
                    int length = this.e.length;
                    if (length >= 0) {
                        objArr = new Object[length];
                        this.f = objArr;
                    } else {
                        se.h("capacity must be non-negative.");
                        return;
                    }
                }
                if (a >= 0) {
                    objArr[a] = entry.getValue();
                } else {
                    int i = (-a) - 1;
                    if (!sn0.r(entry.getValue(), objArr[i])) {
                        objArr[i] = entry.getValue();
                    }
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        b();
        int f = f(obj);
        if (f < 0) {
            return null;
        }
        Object[] objArr = this.f;
        objArr.getClass();
        Object obj2 = objArr[f];
        j(f);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.m * 3) + 2);
        sb.append("{");
        int i = 0;
        kz0 kz0Var = new kz0(this, 0);
        while (kz0Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = kz0Var.e;
            nz0 nz0Var = (nz0) kz0Var.h;
            if (i2 < nz0Var.j) {
                kz0Var.e = i2 + 1;
                kz0Var.f = i2;
                Object obj = nz0Var.e[i2];
                if (obj == nz0Var) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = nz0Var.f;
                objArr.getClass();
                Object obj2 = objArr[kz0Var.f];
                if (obj2 == nz0Var) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                kz0Var.c();
                i++;
            } else {
                y61.c();
                return null;
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        pz0 pz0Var = this.o;
        if (pz0Var == null) {
            pz0 pz0Var2 = new pz0(this, 0);
            this.o = pz0Var2;
            return pz0Var2;
        }
        return pz0Var;
    }
}
