package defpackage;

import java.util.List;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class kj implements j01 {
    public final i3 a;
    public final boolean b;

    public kj(i3 i3Var, boolean z) {
        this.a = i3Var;
        this.b = z;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, ul1] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, ul1] */
    @Override // defpackage.j01
    public final k01 b(final l01 l01Var, final List list, long j) {
        long j2;
        boolean isEmpty = list.isEmpty();
        m60 m60Var = m60.e;
        if (isEmpty) {
            return l01Var.s0(us.j(j), us.i(j), m60Var, new p1(29));
        }
        if (this.b) {
            j2 = j;
        } else {
            j2 = j & (-8589934589L);
        }
        if (list.size() == 1) {
            final e01 e01Var = (e01) list.get(0);
            e01Var.C();
            final ig1 x = e01Var.x(j2);
            final int max = Math.max(us.j(j), x.e);
            final int max2 = Math.max(us.i(j), x.f);
            return l01Var.s0(max, max2, m60Var, new oe0() { // from class: ij
                @Override // defpackage.oe0
                public final Object invoke(Object obj) {
                    hj.b((hg1) obj, ig1.this, e01Var, l01Var.getLayoutDirection(), max, max2, this.a);
                    return od2.a;
                }
            });
        }
        final ig1[] ig1VarArr = new ig1[list.size()];
        final ?? obj = new Object();
        obj.e = us.j(j);
        final ?? obj2 = new Object();
        obj2.e = us.i(j);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            e01 e01Var2 = (e01) list.get(i);
            e01Var2.C();
            ig1 x2 = e01Var2.x(j2);
            ig1VarArr[i] = x2;
            obj.e = Math.max(obj.e, x2.e);
            obj2.e = Math.max(obj2.e, x2.f);
        }
        return l01Var.s0(obj.e, obj2.e, m60Var, new oe0() { // from class: jj
            @Override // defpackage.oe0
            public final Object invoke(Object obj3) {
                hg1 hg1Var = (hg1) obj3;
                ig1[] ig1VarArr2 = ig1VarArr;
                int length = ig1VarArr2.length;
                int i2 = 0;
                int i3 = 0;
                while (i3 < length) {
                    int i4 = i2;
                    ig1 ig1Var = ig1VarArr2[i3];
                    ig1Var.getClass();
                    hj.b(hg1Var, ig1Var, (e01) list.get(i4), l01Var.getLayoutDirection(), obj.e, obj2.e, this.a);
                    i3++;
                    i2 = i4 + 1;
                }
                return od2.a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kj) {
                kj kjVar = (kj) obj;
                if (!sn0.r(this.a, kjVar.a) || this.b != kjVar.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}
