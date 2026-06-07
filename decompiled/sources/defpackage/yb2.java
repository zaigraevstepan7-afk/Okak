package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class yb2 {
    public static final yb2 e = new yb2(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final wc0 c;
    public Object[] d;

    public yb2(int i, int i2, Object[] objArr, wc0 wc0Var) {
        this.a = i;
        this.b = i2;
        this.c = wc0Var;
        this.d = objArr;
    }

    public static yb2 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, wc0 wc0Var) {
        Object[] objArr;
        if (i3 > 30) {
            return new yb2(0, 0, new Object[]{obj, obj2, obj3, obj4}, wc0Var);
        }
        int k = op1.k(i, i3);
        int k2 = op1.k(i2, i3);
        if (k != k2) {
            if (k < k2) {
                objArr = new Object[]{obj, obj2, obj3, obj4};
            } else {
                objArr = new Object[]{obj3, obj4, obj, obj2};
            }
            return new yb2((1 << k) | (1 << k2), 0, objArr, wc0Var);
        }
        return new yb2(0, 1 << k, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, wc0Var)}, wc0Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, wc0 wc0Var) {
        int i5;
        Object obj3 = this.d[i];
        if (obj3 != null) {
            i5 = obj3.hashCode();
        } else {
            i5 = 0;
        }
        yb2 j = j(i5, obj3, x(i), i3, obj, obj2, i4 + 5, wc0Var);
        int t = t(i2);
        int i6 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        bf.G(objArr, objArr2, 0, i, 6);
        bf.D(objArr, objArr2, i, i + 2, i6);
        objArr2[t - 1] = j;
        bf.D(objArr, objArr2, t, i6, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += s(i).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        ym0 T = go.T(go.X(0, this.d.length), 2);
        int i = T.e;
        int i2 = T.f;
        int i3 = T.g;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!sn0.r(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(Object obj, int i, int i2) {
        int k = 1 << op1.k(i, i2);
        if (h(k)) {
            return sn0.r(obj, this.d[f(k)]);
        }
        if (i(k)) {
            yb2 s = s(t(k));
            if (i2 == 30) {
                return s.c(obj);
            }
            return s.d(obj, i, i2 + 5);
        }
        return false;
    }

    public final boolean e(yb2 yb2Var) {
        if (this != yb2Var) {
            if (this.b == yb2Var.b && this.a == yb2Var.a) {
                int length = this.d.length;
                for (int i = 0; i < length; i++) {
                    if (this.d[i] == yb2Var.d[i]) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(Object obj, int i, int i2) {
        int k = 1 << op1.k(i, i2);
        if (h(k)) {
            int f = f(k);
            if (sn0.r(obj, this.d[f])) {
                return x(f);
            }
            return null;
        }
        if (i(k)) {
            yb2 s = s(t(k));
            if (i2 == 30) {
                ym0 T = go.T(go.X(0, s.d.length), 2);
                int i3 = T.e;
                int i4 = T.f;
                int i5 = T.g;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!sn0.r(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        } else {
                            return null;
                        }
                    }
                    return s.x(i3);
                }
                return null;
            }
            return s.g(obj, i, i2 + 5);
        }
        return null;
    }

    public final boolean h(int i) {
        if ((this.a & i) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i(int i) {
        if ((this.b & i) != 0) {
            return true;
        }
        return false;
    }

    public final yb2 k(int i, rf1 rf1Var) {
        rf1Var.e(rf1Var.i - 1);
        rf1Var.g = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c == rf1Var.e) {
            this.d = op1.f(objArr, i);
            return this;
        }
        return new yb2(0, 0, op1.f(objArr, i), rf1Var.e);
    }

    public final yb2 l(int i, Object obj, Object obj2, int i2, rf1 rf1Var) {
        rf1 rf1Var2;
        yb2 l;
        int k = 1 << op1.k(i, i2);
        boolean h = h(k);
        wc0 wc0Var = this.c;
        if (h) {
            int f = f(k);
            if (sn0.r(obj, this.d[f])) {
                rf1Var.g = x(f);
                if (x(f) == obj2) {
                    return this;
                }
                if (wc0Var == rf1Var.e) {
                    this.d[f + 1] = obj2;
                    return this;
                }
                rf1Var.h++;
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f + 1] = obj2;
                return new yb2(this.a, this.b, copyOf, rf1Var.e);
            }
            rf1Var.e(rf1Var.i + 1);
            wc0 wc0Var2 = rf1Var.e;
            if (wc0Var == wc0Var2) {
                this.d = a(f, k, i, obj, obj2, i2, wc0Var2);
                this.a ^= k;
                this.b |= k;
                return this;
            }
            return new yb2(this.a ^ k, this.b | k, a(f, k, i, obj, obj2, i2, wc0Var2), wc0Var2);
        }
        if (i(k)) {
            int t = t(k);
            yb2 s = s(t);
            if (i2 == 30) {
                ym0 T = go.T(go.X(0, s.d.length), 2);
                int i3 = T.e;
                int i4 = T.f;
                int i5 = T.g;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!sn0.r(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    rf1Var.g = s.x(i3);
                    if (s.c == rf1Var.e) {
                        s.d[i3 + 1] = obj2;
                        l = s;
                    } else {
                        rf1Var.h++;
                        Object[] objArr2 = s.d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i3 + 1] = obj2;
                        l = new yb2(0, 0, copyOf2, rf1Var.e);
                    }
                    rf1Var2 = rf1Var;
                }
                rf1Var.e(rf1Var.i + 1);
                l = new yb2(0, 0, op1.d(s.d, 0, obj, obj2), rf1Var.e);
                rf1Var2 = rf1Var;
            } else {
                rf1Var2 = rf1Var;
                l = s.l(i, obj, obj2, i2 + 5, rf1Var2);
            }
            if (s == l) {
                return this;
            }
            return r(t, l, rf1Var2.e);
        }
        rf1Var.e(rf1Var.i + 1);
        wc0 wc0Var3 = rf1Var.e;
        int f2 = f(k);
        Object[] objArr3 = this.d;
        if (wc0Var == wc0Var3) {
            this.d = op1.d(objArr3, f2, obj, obj2);
            this.a |= k;
            return this;
        }
        return new yb2(this.a | k, this.b, op1.d(objArr3, f2, obj, obj2), wc0Var3);
    }

    public final yb2 m(yb2 yb2Var, int i, b00 b00Var, rf1 rf1Var) {
        yb2 yb2Var2;
        Object[] objArr;
        int i2;
        int i3;
        yb2 j;
        int i4;
        int i5;
        int i6;
        if (this == yb2Var) {
            b00Var.a += b();
            return this;
        }
        int i7 = 0;
        if (i > 30) {
            wc0 wc0Var = rf1Var.e;
            int i8 = yb2Var.b;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + yb2Var.d.length);
            int length = this.d.length;
            ym0 T = go.T(go.X(0, yb2Var.d.length), 2);
            int i9 = T.e;
            int i10 = T.f;
            int i11 = T.g;
            if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                while (true) {
                    if (!c(yb2Var.d[i9])) {
                        Object[] objArr3 = yb2Var.d;
                        copyOf[length] = objArr3[i9];
                        copyOf[length + 1] = objArr3[i9 + 1];
                        length += 2;
                    } else {
                        b00Var.a++;
                    }
                    if (i9 == i10) {
                        break;
                    }
                    i9 += i11;
                }
            }
            if (length != this.d.length) {
                if (length == yb2Var.d.length) {
                    return yb2Var;
                }
                if (length == copyOf.length) {
                    return new yb2(0, 0, copyOf, wc0Var);
                }
                return new yb2(0, 0, Arrays.copyOf(copyOf, length), wc0Var);
            }
        } else {
            int i12 = this.b | yb2Var.b;
            int i13 = this.a;
            int i14 = yb2Var.a;
            int i15 = (i13 ^ i14) & (~i12);
            int i16 = i13 & i14;
            int i17 = i15;
            while (i16 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i16);
                if (sn0.r(this.d[f(lowestOneBit)], yb2Var.d[yb2Var.f(lowestOneBit)])) {
                    i17 |= lowestOneBit;
                } else {
                    i12 |= lowestOneBit;
                }
                i16 ^= lowestOneBit;
            }
            if ((i12 & i17) != 0) {
                ei1.b("Check failed.");
            }
            if (sn0.r(this.c, rf1Var.e) && this.a == i17 && this.b == i12) {
                yb2Var2 = this;
            } else {
                yb2Var2 = new yb2(i17, i12, new Object[Integer.bitCount(i12) + (Integer.bitCount(i17) * 2)], null);
            }
            int i18 = i12;
            int i19 = 0;
            while (i18 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i18);
                Object[] objArr4 = yb2Var2.d;
                int length2 = (objArr4.length - 1) - i19;
                if (i(lowestOneBit2)) {
                    j = s(t(lowestOneBit2));
                    if (yb2Var.i(lowestOneBit2)) {
                        j = j.m(yb2Var.s(yb2Var.t(lowestOneBit2)), i + 5, b00Var, rf1Var);
                        objArr = objArr4;
                    } else if (yb2Var.h(lowestOneBit2)) {
                        int f = yb2Var.f(lowestOneBit2);
                        Object obj = yb2Var.d[f];
                        Object x = yb2Var.x(f);
                        int i20 = rf1Var.i;
                        if (obj != null) {
                            i6 = obj.hashCode();
                        } else {
                            i6 = i7;
                        }
                        int i21 = i6;
                        objArr = objArr4;
                        j = j.l(i21, obj, x, i + 5, rf1Var);
                        if (rf1Var.i == i20) {
                            b00Var.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (yb2Var.i(lowestOneBit2)) {
                        yb2 s = yb2Var.s(yb2Var.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f2 = f(lowestOneBit2);
                            Object obj2 = this.d[f2];
                            if (obj2 != null) {
                                i4 = obj2.hashCode();
                            } else {
                                i4 = 0;
                            }
                            int i22 = i + 5;
                            if (s.d(obj2, i4, i22)) {
                                b00Var.a++;
                            } else {
                                Object x2 = x(f2);
                                if (obj2 != null) {
                                    i5 = obj2.hashCode();
                                } else {
                                    i5 = 0;
                                }
                                j = s.l(i5, obj2, x2, i22, rf1Var);
                            }
                        }
                        j = s;
                    } else {
                        int f3 = f(lowestOneBit2);
                        Object obj3 = this.d[f3];
                        Object x3 = x(f3);
                        int f4 = yb2Var.f(lowestOneBit2);
                        Object obj4 = yb2Var.d[f4];
                        Object x4 = yb2Var.x(f4);
                        if (obj3 != null) {
                            i2 = obj3.hashCode();
                        } else {
                            i2 = 0;
                        }
                        if (obj4 != null) {
                            i3 = obj4.hashCode();
                        } else {
                            i3 = 0;
                        }
                        j = j(i2, obj3, x3, i3, obj4, x4, i + 5, rf1Var.e);
                    }
                }
                objArr[length2] = j;
                i19++;
                i18 ^= lowestOneBit2;
                i7 = 0;
            }
            int i23 = 0;
            while (i17 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i17);
                int i24 = i23 * 2;
                if (!yb2Var.h(lowestOneBit3)) {
                    int f5 = f(lowestOneBit3);
                    Object[] objArr5 = yb2Var2.d;
                    objArr5[i24] = this.d[f5];
                    objArr5[i24 + 1] = x(f5);
                } else {
                    int f6 = yb2Var.f(lowestOneBit3);
                    Object[] objArr6 = yb2Var2.d;
                    objArr6[i24] = yb2Var.d[f6];
                    objArr6[i24 + 1] = yb2Var.x(f6);
                    if (h(lowestOneBit3)) {
                        b00Var.a++;
                    }
                }
                i23++;
                i17 ^= lowestOneBit3;
            }
            if (!e(yb2Var2)) {
                if (yb2Var.e(yb2Var2)) {
                    return yb2Var;
                }
                return yb2Var2;
            }
        }
        return this;
    }

    public final yb2 n(int i, Object obj, int i2, rf1 rf1Var) {
        yb2 n;
        int k = 1 << op1.k(i, i2);
        if (h(k)) {
            int f = f(k);
            if (sn0.r(obj, this.d[f])) {
                return p(f, k, rf1Var);
            }
        } else if (i(k)) {
            int t = t(k);
            yb2 s = s(t);
            if (i2 == 30) {
                ym0 T = go.T(go.X(0, s.d.length), 2);
                int i3 = T.e;
                int i4 = T.f;
                int i5 = T.g;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!sn0.r(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    n = s.k(i3, rf1Var);
                }
                n = s;
                break;
            }
            n = s.n(i, obj, i2 + 5, rf1Var);
            return q(s, n, t, k, rf1Var.e);
        }
        return this;
    }

    public final yb2 o(int i, Object obj, Object obj2, int i2, rf1 rf1Var) {
        rf1 rf1Var2;
        yb2 o;
        int k = 1 << op1.k(i, i2);
        if (h(k)) {
            int f = f(k);
            if (sn0.r(obj, this.d[f]) && sn0.r(obj2, x(f))) {
                return p(f, k, rf1Var);
            }
            return this;
        }
        if (i(k)) {
            int t = t(k);
            yb2 s = s(t);
            if (i2 == 30) {
                ym0 T = go.T(go.X(0, s.d.length), 2);
                int i3 = T.e;
                int i4 = T.f;
                int i5 = T.g;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (sn0.r(obj, s.d[i3]) && sn0.r(obj2, s.x(i3))) {
                            o = s.k(i3, rf1Var);
                            break;
                        }
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    }
                    rf1Var2 = rf1Var;
                }
                o = s;
                rf1Var2 = rf1Var;
            } else {
                rf1Var2 = rf1Var;
                o = s.o(i, obj, obj2, i2 + 5, rf1Var2);
            }
            return q(s, o, t, k, rf1Var2.e);
        }
        return this;
    }

    public final yb2 p(int i, int i2, rf1 rf1Var) {
        rf1Var.e(rf1Var.i - 1);
        rf1Var.g = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c == rf1Var.e) {
            this.d = op1.f(objArr, i);
            this.a ^= i2;
            return this;
        }
        return new yb2(i2 ^ this.a, this.b, op1.f(objArr, i), rf1Var.e);
    }

    public final yb2 q(yb2 yb2Var, yb2 yb2Var2, int i, int i2, wc0 wc0Var) {
        wc0 wc0Var2 = this.c;
        if (yb2Var2 == null) {
            Object[] objArr = this.d;
            if (objArr.length == 1) {
                return null;
            }
            if (wc0Var2 == wc0Var) {
                this.d = op1.g(objArr, i);
                this.b ^= i2;
                return this;
            }
            return new yb2(this.a, this.b ^ i2, op1.g(objArr, i), wc0Var);
        }
        if (wc0Var2 != wc0Var && yb2Var == yb2Var2) {
            return this;
        }
        return r(i, yb2Var2, wc0Var);
    }

    public final yb2 r(int i, yb2 yb2Var, wc0 wc0Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && yb2Var.d.length == 2 && yb2Var.b == 0) {
            yb2Var.a = this.b;
            return yb2Var;
        }
        if (this.c == wc0Var) {
            objArr[i] = yb2Var;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = yb2Var;
        return new yb2(this.a, this.b, copyOf, wc0Var);
    }

    public final yb2 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (yb2) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d2, code lost:
    
        r13.b = w(r11, r4, (defpackage.yb2) r13.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dc, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cf, code lost:
    
        if (r13 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.np u(java.lang.Object r12, int r13, int r14, java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yb2.u(java.lang.Object, int, int, java.lang.Object):np");
    }

    public final yb2 v(Object obj, int i, int i2) {
        yb2 v;
        int k = 1 << op1.k(i, i2);
        if (h(k)) {
            int f = f(k);
            if (sn0.r(obj, this.d[f])) {
                Object[] objArr = this.d;
                if (objArr.length != 2) {
                    return new yb2(this.a ^ k, this.b, op1.f(objArr, f), null);
                }
            } else {
                return this;
            }
        } else if (i(k)) {
            int t = t(k);
            yb2 s = s(t);
            if (i2 == 30) {
                ym0 T = go.T(go.X(0, s.d.length), 2);
                int i3 = T.e;
                int i4 = T.f;
                int i5 = T.g;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!sn0.r(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = s.d;
                    if (objArr2.length == 2) {
                        v = null;
                    } else {
                        v = new yb2(0, 0, op1.f(objArr2, i3), null);
                    }
                }
                v = s;
                break;
            }
            v = s.v(obj, i, i2 + 5);
            if (v == null) {
                Object[] objArr3 = this.d;
                if (objArr3.length != 1) {
                    return new yb2(this.a, this.b ^ k, op1.g(objArr3, t), null);
                }
            } else {
                if (s != v) {
                    return w(t, k, v);
                }
                return this;
            }
        } else {
            return this;
        }
        return null;
    }

    public final yb2 w(int i, int i2, yb2 yb2Var) {
        Object[] objArr = yb2Var.d;
        if (objArr.length == 2 && yb2Var.b == 0) {
            if (this.d.length == 1) {
                yb2Var.a = this.b;
                return yb2Var;
            }
            int f = f(i2);
            Object[] objArr2 = this.d;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + 1);
            bf.D(copyOf, copyOf, i + 2, i + 1, objArr2.length);
            bf.D(copyOf, copyOf, f + 2, f, i);
            copyOf[f] = obj;
            copyOf[f + 1] = obj2;
            return new yb2(this.a ^ i2, this.b ^ i2, copyOf, null);
        }
        Object[] objArr3 = this.d;
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        copyOf2[i] = yb2Var;
        return new yb2(this.a, this.b, copyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
