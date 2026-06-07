package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-09617c094fd1d5b705d683180bfdcc3cc35b0c5e13ee7f309dceccc0900ba8d2 */
/* loaded from: classes.dex */
public final class uc0 implements Comparator {
    public static final uc0 b = new uc0(0);
    public static final uc0 c = new uc0(1);
    public static final uc0 d = new uc0(2);
    public static final uc0 e = new uc0(3);
    public static final uc0 f = new uc0(4);
    public final /* synthetic */ int a;

    public /* synthetic */ uc0(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object[], java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                tc0 tc0Var = (tc0) obj;
                tc0 tc0Var2 = (tc0) obj2;
                if (lo.L(tc0Var) && lo.L(tc0Var2)) {
                    ar0 M = hp.M(tc0Var);
                    ar0 M2 = hp.M(tc0Var2);
                    if (sn0.r(M, M2)) {
                        return 0;
                    }
                    ar0[] ar0VarArr = new ar0[16];
                    int i = 0;
                    while (M != null) {
                        int i2 = i + 1;
                        if (ar0VarArr.length < i2) {
                            int length = ar0VarArr.length;
                            ?? r4 = new Object[Math.max(i2, length * 2)];
                            System.arraycopy(ar0VarArr, 0, r4, 0, length);
                            ar0VarArr = r4;
                        }
                        if (i != 0) {
                            System.arraycopy(ar0VarArr, 0, ar0VarArr, 0 + 1, i + 0);
                        }
                        ar0VarArr[0] = M;
                        i++;
                        M = M.v();
                    }
                    ar0[] ar0VarArr2 = new ar0[16];
                    int i3 = 0;
                    while (M2 != null) {
                        int i4 = i3 + 1;
                        if (ar0VarArr2.length < i4) {
                            int length2 = ar0VarArr2.length;
                            ?? r42 = new Object[Math.max(i4, length2 * 2)];
                            System.arraycopy(ar0VarArr2, 0, r42, 0, length2);
                            ar0VarArr2 = r42;
                        }
                        if (i3 != 0) {
                            System.arraycopy(ar0VarArr2, 0, ar0VarArr2, 0 + 1, i3 + 0);
                        }
                        ar0VarArr2[0] = M2;
                        i3++;
                        M2 = M2.v();
                    }
                    int min = Math.min(i - 1, i3 - 1);
                    if (min >= 0) {
                        int i5 = 0;
                        while (sn0.r(ar0VarArr[i5], ar0VarArr2[i5])) {
                            if (i5 != min) {
                                i5++;
                            }
                        }
                        return sn0.B(ar0VarArr[i5].w(), ar0VarArr2[i5].w());
                    }
                    se.p("Could not find a common ancestor between the two FocusModifiers.");
                    return 0;
                }
                if (lo.L(tc0Var)) {
                    return -1;
                }
                if (!lo.L(tc0Var2)) {
                    return 0;
                }
                return 1;
            case 1:
                pl1 h = ((ru1) obj).h();
                pl1 h2 = ((ru1) obj2).h();
                int compare = Float.compare(h.a, h2.a);
                if (compare == 0) {
                    int compare2 = Float.compare(h.b, h2.b);
                    if (compare2 == 0) {
                        int compare3 = Float.compare(h.d, h2.d);
                        if (compare3 == 0) {
                            return Float.compare(h.c, h2.c);
                        }
                        return compare3;
                    }
                    return compare2;
                }
                return compare;
            case 2:
                ar0 ar0Var = (ar0) obj;
                ar0 ar0Var2 = (ar0) obj2;
                int B = sn0.B(ar0Var2.t, ar0Var.t);
                if (B == 0) {
                    return sn0.B(ar0Var.hashCode(), ar0Var2.hashCode());
                }
                return B;
            case 3:
                pl1 h3 = ((ru1) obj).h();
                pl1 h4 = ((ru1) obj2).h();
                int compare4 = Float.compare(h4.c, h3.c);
                if (compare4 == 0) {
                    int compare5 = Float.compare(h3.b, h4.b);
                    if (compare5 == 0) {
                        int compare6 = Float.compare(h3.d, h4.d);
                        if (compare6 == 0) {
                            return Float.compare(h4.a, h3.a);
                        }
                        return compare6;
                    }
                    return compare5;
                }
                return compare4;
            case 4:
                xd1 xd1Var = (xd1) obj;
                xd1 xd1Var2 = (xd1) obj2;
                int compare7 = Float.compare(((pl1) xd1Var.e).b, ((pl1) xd1Var2.e).b);
                if (compare7 == 0) {
                    return Float.compare(((pl1) xd1Var.e).d, ((pl1) xd1Var2.e).d);
                }
                return compare7;
            case 5:
                return hp.p(Integer.valueOf(((qc) obj).b), Integer.valueOf(((qc) obj2).b));
            case 6:
                return hp.p(Integer.valueOf(((qc) obj).b), Integer.valueOf(((qc) obj2).b));
            case 7:
                ar0 ar0Var3 = (ar0) obj;
                ar0 ar0Var4 = (ar0) obj2;
                int B2 = sn0.B(ar0Var3.t, ar0Var4.t);
                if (B2 == 0) {
                    return sn0.B(ar0Var3.hashCode(), ar0Var4.hashCode());
                }
                return B2;
            case 8:
                return hp.p(((zm1) obj).a, ((zm1) obj2).a);
            case 9:
                return hp.p(((zm1) obj).a, ((zm1) obj2).a);
            case 10:
                return hp.p(((zm1) obj).a, ((zm1) obj2).a);
            default:
                return hp.p(((vj2) obj).a, ((vj2) obj2).a);
        }
    }
}
