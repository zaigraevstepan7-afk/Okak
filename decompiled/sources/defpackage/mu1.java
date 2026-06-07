package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class mu1 implements av1, Iterable, xo0 {
    public final i41 e;
    public sz0 f;
    public boolean g;
    public boolean h;

    public mu1() {
        long[] jArr = sr1.a;
        this.e = new i41();
    }

    @Override // defpackage.av1
    public final void a(zu1 zu1Var, Object obj) {
        boolean z = obj instanceof s0;
        i41 i41Var = this.e;
        if (z && i41Var.c(zu1Var)) {
            Object g = i41Var.g(zu1Var);
            g.getClass();
            s0 s0Var = (s0) g;
            s0 s0Var2 = (s0) obj;
            String str = s0Var2.a;
            if (str == null) {
                str = s0Var.a;
            }
            af0 af0Var = s0Var2.b;
            if (af0Var == null) {
                af0Var = s0Var.b;
            }
            i41Var.m(zu1Var, new s0(str, af0Var));
        } else {
            i41Var.m(zu1Var, obj);
        }
        zu1Var.getClass();
    }

    public final mu1 b() {
        mu1 mu1Var = new mu1();
        mu1Var.g = this.g;
        mu1Var.h = this.h;
        i41 i41Var = mu1Var.e;
        i41Var.getClass();
        i41 i41Var2 = this.e;
        i41Var2.getClass();
        Object[] objArr = i41Var2.b;
        Object[] objArr2 = i41Var2.c;
        long[] jArr = i41Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            i41Var.m(objArr[i4], objArr2[i4]);
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
        return mu1Var;
    }

    public final Object c(zu1 zu1Var) {
        Object g = this.e.g(zu1Var);
        if (g != null) {
            return g;
        }
        throw new IllegalStateException("Key not present: " + zu1Var + " - consider getOrElse or getOrNull");
    }

    public final void d(mu1 mu1Var) {
        i41 i41Var = mu1Var.e;
        Object[] objArr = i41Var.b;
        Object[] objArr2 = i41Var.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            zu1 zu1Var = (zu1) obj;
                            i41 i41Var2 = this.e;
                            Object g = i41Var2.g(zu1Var);
                            zu1Var.getClass();
                            Object invoke = zu1Var.b.invoke(g, obj2);
                            if (invoke != null) {
                                i41Var2.m(zu1Var, invoke);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mu1) {
                mu1 mu1Var = (mu1) obj;
                if (!sn0.r(this.e, mu1Var.e) || this.g != mu1Var.g || this.h != mu1Var.h) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + mb2.a(this.e.hashCode() * 31, 31, this.g);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        sz0 sz0Var = this.f;
        if (sz0Var == null) {
            i41 i41Var = this.e;
            i41Var.getClass();
            sz0 sz0Var2 = new sz0(i41Var);
            this.f = sz0Var2;
            sz0Var = sz0Var2;
        }
        return ((f70) sz0Var.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.g) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.h) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        i41 i41Var = this.e;
        Object[] objArr = i41Var.b;
        Object[] objArr2 = i41Var.c;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((zu1) obj).a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
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
        return qo.a0(this) + "{ " + ((Object) sb) + " }";
    }
}
