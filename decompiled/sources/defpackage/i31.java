package defpackage;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class i31 {
    public final i41 a;

    public static final Object a(i41 i41Var) {
        Object g = i41Var.g(null);
        if (g == null) {
            return null;
        }
        if (g instanceof b41) {
            b41 b41Var = (b41) g;
            if (!b41Var.h()) {
                int i = b41Var.b - 1;
                Object f = b41Var.f(i);
                b41Var.k(i);
                f.getClass();
                if (b41Var.h()) {
                    i41Var.k(null);
                }
                if (b41Var.b == 1) {
                    i41Var.m(null, b41Var.e());
                }
                return f;
            }
            y61.j("List is empty.");
            return null;
        }
        i41Var.k(null);
        return g;
    }

    public static final b41 b(i41 i41Var) {
        if (i41Var.i()) {
            b41 b41Var = u81.b;
            b41Var.getClass();
            return b41Var;
        }
        b41 b41Var2 = new b41();
        Object[] objArr = i41Var.c;
        long[] jArr = i41Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof b41) {
                                b41Var2.b((b41) obj);
                            } else {
                                obj.getClass();
                                b41Var2.a(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return b41Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i31) {
            if (!this.a.equals(((i31) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.a + ')';
    }
}
