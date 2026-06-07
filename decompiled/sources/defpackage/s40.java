package defpackage;

import com.google.protobuf.DescriptorProtos;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class s40 implements Comparable {
    public static final r40 f = new Object();
    public static final long g = vn.t(4611686018427387903L);
    public static final long h = vn.t(-4611686018427387903L);
    public static final long i = 9223372036854759646L;
    public final long e;

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long m = vn.m(j, j3);
        if (-4611686018426L <= m && m < 4611686018427L) {
            long j4 = ((m * 1000000) + (j2 - (j3 * 1000000))) << 1;
            int i2 = u40.a;
            return j4;
        }
        return vn.t(m);
    }

    public static final void b(StringBuilder sb, int i2, int i3, int i4, String str, boolean z) {
        sb.append(i2);
        if (i3 != 0) {
            sb.append('.');
            String S = i32.S(i4, String.valueOf(i3));
            int i5 = -1;
            int length = S.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i6 = length - 1;
                    if (S.charAt(length) != '0') {
                        i5 = length;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (!z && i7 < 3) {
                sb.append((CharSequence) S, 0, i7);
            } else {
                sb.append((CharSequence) S, 0, ((i5 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    public static final int c(long j) {
        long j2;
        if (d(j)) {
            return 0;
        }
        if ((((int) j) & 1) == 1) {
            j2 = ((j >> 1) % 1000) * 1000000;
        } else {
            j2 = (j >> 1) % 1000000000;
        }
        return (int) j2;
    }

    public static final boolean d(long j) {
        if (j != g && j != h) {
            return false;
        }
        return true;
    }

    public static final long e(long j, long j2) {
        int i2 = ((int) j) & 1;
        if (i2 == (((int) j2) & 1)) {
            if (i2 == 0) {
                long j3 = (j >> 1) + (j2 >> 1);
                if (-4611686018426999999L <= j3 && j3 < 4611686018427000000L) {
                    long j4 = j3 << 1;
                    int i3 = u40.a;
                    return j4;
                }
                return vn.t(j3 / 1000000);
            }
            long m = vn.m(j >> 1, j2 >> 1);
            if (m != 9223372036854759646L) {
                if (m != 4611686018427387903L && m != -4611686018427387903L) {
                    if (-4611686018426L <= m && m < 4611686018427L) {
                        long j5 = (m * 1000000) << 1;
                        int i4 = u40.a;
                        return j5;
                    }
                    return vn.t(go.q(m, -4611686018427387903L, 4611686018427387903L));
                }
                return vn.t(m);
            }
            se.h("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (i2 == 1) {
            return a(j >> 1, j2 >> 1);
        }
        return a(j2 >> 1, j >> 1);
    }

    public static final long f(long j, v40 v40Var) {
        v40 v40Var2;
        if (j == g) {
            return Long.MAX_VALUE;
        }
        if (j == h) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            v40Var2 = v40.NANOSECONDS;
        } else {
            v40Var2 = v40.MILLISECONDS;
        }
        return v40Var.e.convert(j2, v40Var2.e);
    }

    public static final long g(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i2 = u40.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((s40) obj).e;
        long j2 = this.e;
        long j3 = j2 ^ j;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i2 = (((int) j2) & 1) - (((int) j) & 1);
            if (j2 < 0) {
                return -i2;
            }
            return i2;
        }
        return sn0.C(j2, j);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s40) {
            if (this.e != ((s40) obj).e) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e);
    }

    public final String toString() {
        boolean z;
        int f2;
        int f3;
        int f4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j = this.e;
        if (j == 0) {
            return "0s";
        }
        if (j == g) {
            return "Infinity";
        }
        if (j == h) {
            return "-Infinity";
        }
        int i2 = 0;
        if (j < 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (j < 0) {
            j = g(j);
        }
        long f5 = f(j, v40.DAYS);
        if (d(j)) {
            f2 = 0;
        } else {
            f2 = (int) (f(j, v40.HOURS) % 24);
        }
        if (d(j)) {
            f3 = 0;
        } else {
            f3 = (int) (f(j, v40.MINUTES) % 60);
        }
        if (d(j)) {
            f4 = 0;
        } else {
            f4 = (int) (f(j, v40.SECONDS) % 60);
        }
        int c = c(j);
        if (f5 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (f2 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (f3 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (f4 == 0 && c == 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z2) {
            sb.append(f5);
            sb.append('d');
            i2 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i3 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(f2);
            sb.append('h');
            i2 = i3;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(f3);
            sb.append('m');
            i2 = i4;
        }
        if (z5) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (f4 == 0 && !z2 && !z3 && !z4) {
                if (c >= 1000000) {
                    b(sb, c / 1000000, c % 1000000, 6, "ms", false);
                } else if (c >= 1000) {
                    b(sb, c / DescriptorProtos.Edition.EDITION_2023_VALUE, c % DescriptorProtos.Edition.EDITION_2023_VALUE, 3, "us", false);
                } else {
                    sb.append(c);
                    sb.append("ns");
                }
            } else {
                b(sb, f4, c, 9, "s", false);
            }
            i2 = i5;
        }
        if (z && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
