package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class o02 implements Iterable, xo0 {
    public static final o02 i = new o02(0, 0, 0, null);
    public final long e;
    public final long f;
    public final long g;
    public final long[] h;

    public o02(long j, long j2, long j3, long[] jArr) {
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = jArr;
    }

    public final o02 a(o02 o02Var) {
        long[] jArr;
        o02 o02Var2 = this;
        o02 o02Var3 = i;
        if (o02Var == o02Var3) {
            return o02Var2;
        }
        if (o02Var2 == o02Var3) {
            return o02Var3;
        }
        long j = o02Var.g;
        long j2 = o02Var.g;
        long[] jArr2 = o02Var.h;
        long j3 = o02Var.f;
        long j4 = o02Var.e;
        long j5 = o02Var2.g;
        if (j == j5 && jArr2 == (jArr = o02Var2.h)) {
            return new o02(o02Var2.e & (~j4), o02Var2.f & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                o02Var2 = o02Var2.b(j6);
            }
        }
        if (j3 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j3) != 0) {
                    o02Var2 = o02Var2.b(i2 + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j4) != 0) {
                    o02Var2 = o02Var2.b(i3 + j2 + 64);
                }
            }
        }
        return o02Var2;
    }

    public final o02 b(long j) {
        long[] jArr;
        int k;
        long[] jArr2;
        long j2 = j - this.g;
        if (sn0.C(j2, 0L) >= 0 && sn0.C(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.f;
            if ((j4 & j3) != 0) {
                return new o02(this.e, j4 & (~j3), this.g, this.h);
            }
        } else if (sn0.C(j2, 64L) >= 0 && sn0.C(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.e;
            if ((j6 & j5) != 0) {
                return new o02(j6 & (~j5), this.f, this.g, this.h);
            }
        } else if (sn0.C(j2, 0L) < 0 && (jArr = this.h) != null && (k = yq1.k(jArr, j)) >= 0) {
            int length = jArr.length;
            int i2 = length - 1;
            if (i2 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i2];
                if (k > 0) {
                    bf.C(jArr, jArr3, 0, 0, k);
                }
                if (k < i2) {
                    bf.C(jArr, jArr3, k, k + 1, length);
                }
                jArr2 = jArr3;
            }
            return new o02(this.e, this.f, this.g, jArr2);
        }
        return this;
    }

    public final boolean c(long j) {
        long[] jArr;
        long j2 = j - this.g;
        if (sn0.C(j2, 0L) >= 0 && sn0.C(j2, 64L) < 0) {
            if (((1 << ((int) j2)) & this.f) != 0) {
                return true;
            }
            return false;
        }
        if (sn0.C(j2, 64L) >= 0 && sn0.C(j2, 128L) < 0) {
            if (((1 << (((int) j2) - 64)) & this.e) != 0) {
                return true;
            }
            return false;
        }
        if (sn0.C(j2, 0L) <= 0 && (jArr = this.h) != null && yq1.k(jArr, j) >= 0) {
            return true;
        }
        return false;
    }

    public final o02 d(o02 o02Var) {
        o02 o02Var2;
        long[] jArr;
        o02 o02Var3 = this;
        o02 o02Var4 = i;
        if (o02Var == o02Var4) {
            return o02Var3;
        }
        if (o02Var3 == o02Var4) {
            return o02Var;
        }
        long j = o02Var.g;
        long j2 = o02Var.g;
        long[] jArr2 = o02Var.h;
        long j3 = o02Var.f;
        long j4 = o02Var.e;
        long j5 = o02Var3.g;
        long j6 = o02Var3.f;
        long j7 = o02Var3.e;
        if (j == j5 && jArr2 == (jArr = o02Var3.h)) {
            return new o02(j7 | j4, j6 | j3, j5, jArr);
        }
        int i2 = 0;
        long[] jArr3 = o02Var3.h;
        if (jArr3 == null) {
            if (jArr3 != null) {
                o02Var2 = o02Var;
                for (long j8 : jArr3) {
                    o02Var2 = o02Var2.e(j8);
                }
            } else {
                o02Var2 = o02Var;
            }
            long j9 = o02Var3.g;
            if (j6 != 0) {
                for (int i3 = 0; i3 < 64; i3++) {
                    if (((1 << i3) & j6) != 0) {
                        o02Var2 = o02Var2.e(i3 + j9);
                    }
                }
            }
            if (j7 != 0) {
                while (i2 < 64) {
                    if (((1 << i2) & j7) != 0) {
                        o02Var2 = o02Var2.e(i2 + j9 + 64);
                    }
                    i2++;
                }
            }
            return o02Var2;
        }
        if (jArr2 != null) {
            for (long j10 : jArr2) {
                o02Var3 = o02Var3.e(j10);
            }
        }
        if (j3 != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if (((1 << i4) & j3) != 0) {
                    o02Var3 = o02Var3.e(i4 + j2);
                }
            }
        }
        if (j4 != 0) {
            while (i2 < 64) {
                if (((1 << i2) & j4) != 0) {
                    o02Var3 = o02Var3.e(i2 + j2 + 64);
                }
                i2++;
            }
        }
        return o02Var3;
    }

    public final o02 e(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i2;
        long j4;
        long j5 = this.g;
        long j6 = j - j5;
        long j7 = 0;
        int C = sn0.C(j6, 0L);
        long j8 = this.f;
        if (C >= 0 && sn0.C(j6, 64L) < 0) {
            long j9 = 1 << ((int) j6);
            if ((j8 & j9) == 0) {
                return new o02(this.e, j8 | j9, this.g, this.h);
            }
        } else {
            int C2 = sn0.C(j6, 64L);
            long j10 = this.e;
            int i3 = 64;
            if (C2 >= 0 && sn0.C(j6, 128L) < 0) {
                long j11 = 1 << (((int) j6) - 64);
                if ((j10 & j11) == 0) {
                    return new o02(j10 | j11, this.f, this.g, this.h);
                }
            } else {
                int C3 = sn0.C(j6, 128L);
                long[] jArr3 = this.h;
                if (C3 >= 0) {
                    if (!c(j)) {
                        long j12 = ((j + 1) / 64) * 64;
                        if (sn0.C(j12, 0L) < 0) {
                            j12 = 9223372036854775680L;
                        }
                        long j13 = j10;
                        ov1 ov1Var = null;
                        while (true) {
                            if (sn0.C(j5, j12) < 0) {
                                if (j8 != j7) {
                                    if (ov1Var == null) {
                                        ov1Var = new ov1(jArr3);
                                    }
                                    int i4 = 0;
                                    i2 = i3;
                                    while (i4 < i2) {
                                        if ((j8 & (1 << i4)) != j7) {
                                            j4 = j7;
                                            ((s31) ov1Var.f).a(i4 + j5);
                                        } else {
                                            j4 = j7;
                                        }
                                        i4++;
                                        j7 = j4;
                                    }
                                } else {
                                    i2 = i3;
                                }
                                long j14 = j7;
                                if (j13 == j14) {
                                    j2 = j12;
                                    j3 = j14;
                                    break;
                                }
                                j5 += 64;
                                j7 = j14;
                                j8 = j13;
                                i3 = i2;
                                j13 = j7;
                            } else {
                                j2 = j5;
                                j3 = j8;
                                break;
                            }
                        }
                        if (ov1Var != null) {
                            s31 s31Var = (s31) ov1Var.f;
                            int i5 = s31Var.b;
                            if (i5 == 0) {
                                jArr2 = null;
                            } else {
                                long[] jArr4 = new long[i5];
                                long[] jArr5 = s31Var.a;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    jArr4[i6] = jArr5[i6];
                                }
                                jArr2 = jArr4;
                            }
                            if (jArr2 != null) {
                                jArr = jArr2;
                                return new o02(j13, j3, j2, jArr).e(j);
                            }
                        }
                        jArr = jArr3;
                        return new o02(j13, j3, j2, jArr).e(j);
                    }
                } else {
                    if (jArr3 == null) {
                        return new o02(this.e, this.f, this.g, new long[]{j});
                    }
                    int k = yq1.k(jArr3, j);
                    if (k < 0) {
                        int i7 = -(k + 1);
                        int length = jArr3.length;
                        long[] jArr6 = new long[length + 1];
                        bf.C(jArr3, jArr6, 0, 0, i7);
                        bf.C(jArr3, jArr6, i7 + 1, i7, length);
                        jArr6[i7] = j;
                        return new o02(this.e, this.f, this.g, jArr6);
                    }
                }
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return yq1.t(new n02(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(yn.a0(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = arrayList.get(i3);
            boolean z = true;
            i2++;
            if (i2 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null) {
                z = obj instanceof CharSequence;
            }
            if (z) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
