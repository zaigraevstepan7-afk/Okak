package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class up1 implements j01, qp1 {
    public final oe a;
    public final ji b;

    public up1(oe oeVar, ji jiVar) {
        this.a = oeVar;
        this.b = jiVar;
    }

    @Override // defpackage.j01
    public final int a(mn0 mn0Var, List list, int i) {
        int j0 = mn0Var.j0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            e01 e01Var = (e01) list.get(i4);
            float v = pp1.v(pp1.q(e01Var));
            int s = e01Var.s(i);
            if (v == 0.0f) {
                i3 += s;
            } else if (v > 0.0f) {
                f += v;
                i2 = Math.max(i2, Math.round(s / v));
            }
        }
        return ((list.size() - 1) * j0) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.j01
    public final k01 b(l01 l01Var, List list, long j) {
        return rp1.p(this, us.j(j), us.i(j), us.h(j), us.g(j), l01Var.j0(this.a.a()), l01Var, list, new ig1[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.j01
    public final int c(mn0 mn0Var, List list, int i) {
        int j0 = mn0Var.j0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            e01 e01Var = (e01) list.get(i4);
            float v = pp1.v(pp1.q(e01Var));
            int n = e01Var.n(i);
            if (v == 0.0f) {
                i3 += n;
            } else if (v > 0.0f) {
                f += v;
                i2 = Math.max(i2, Math.round(n / v));
            }
        }
        return ((list.size() - 1) * j0) + Math.round(i2 * f) + i3;
    }

    @Override // defpackage.j01
    public final int d(mn0 mn0Var, List list, int i) {
        int round;
        int i2;
        int i3;
        int j0 = mn0Var.j0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * j0, i);
        int size = list.size();
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            e01 e01Var = (e01) list.get(i5);
            float v = pp1.v(pp1.q(e01Var));
            if (v == 0.0f) {
                if (i == Integer.MAX_VALUE) {
                    i3 = Integer.MAX_VALUE;
                } else {
                    i3 = i - min;
                }
                int min2 = Math.min(e01Var.s(Integer.MAX_VALUE), i3);
                min += min2;
                i4 = Math.max(i4, e01Var.c(min2));
            } else if (v > 0.0f) {
                f += v;
            }
        }
        if (f == 0.0f) {
            round = 0;
        } else if (i == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i - min, 0) / f);
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            e01 e01Var2 = (e01) list.get(i6);
            float v2 = pp1.v(pp1.q(e01Var2));
            if (v2 > 0.0f) {
                if (round != Integer.MAX_VALUE) {
                    i2 = Math.round(round * v2);
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                i4 = Math.max(i4, e01Var2.c(i2));
            }
        }
        return i4;
    }

    @Override // defpackage.j01
    public final int e(mn0 mn0Var, List list, int i) {
        int round;
        int i2;
        int i3;
        int j0 = mn0Var.j0(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * j0, i);
        int size = list.size();
        int i4 = 0;
        float f = 0.0f;
        for (int i5 = 0; i5 < size; i5++) {
            e01 e01Var = (e01) list.get(i5);
            float v = pp1.v(pp1.q(e01Var));
            if (v == 0.0f) {
                if (i == Integer.MAX_VALUE) {
                    i3 = Integer.MAX_VALUE;
                } else {
                    i3 = i - min;
                }
                int min2 = Math.min(e01Var.s(Integer.MAX_VALUE), i3);
                min += min2;
                i4 = Math.max(i4, e01Var.Y(min2));
            } else if (v > 0.0f) {
                f += v;
            }
        }
        if (f == 0.0f) {
            round = 0;
        } else if (i == Integer.MAX_VALUE) {
            round = Integer.MAX_VALUE;
        } else {
            round = Math.round(Math.max(i - min, 0) / f);
        }
        int size2 = list.size();
        for (int i6 = 0; i6 < size2; i6++) {
            e01 e01Var2 = (e01) list.get(i6);
            float v2 = pp1.v(pp1.q(e01Var2));
            if (v2 > 0.0f) {
                if (round != Integer.MAX_VALUE) {
                    i2 = Math.round(round * v2);
                } else {
                    i2 = Integer.MAX_VALUE;
                }
                i4 = Math.max(i4, e01Var2.Y(i2));
            }
        }
        return i4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof up1) {
                up1 up1Var = (up1) obj;
                if (!this.a.equals(up1Var.a) || !sn0.r(this.b, up1Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.qp1
    public final void f(int i, int[] iArr, int[] iArr2, l01 l01Var) {
        this.a.b(l01Var, i, iArr, l01Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.qp1
    public final long g(int i, int i2, int i3, boolean z) {
        if (!z) {
            return vs.a(i, i2, 0, i3);
        }
        return go.B(i, i2, 0, i3);
    }

    @Override // defpackage.qp1
    public final k01 h(ig1[] ig1VarArr, l01 l01Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return l01Var.s0(i, i2, m60.e, new h00(ig1VarArr, this, i2, iArr));
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.qp1
    public final int i(ig1 ig1Var) {
        return ig1Var.f;
    }

    @Override // defpackage.qp1
    public final int j(ig1 ig1Var) {
        return ig1Var.e;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}
